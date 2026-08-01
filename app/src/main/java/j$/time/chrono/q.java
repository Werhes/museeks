package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class q extends a implements Serializable {
    public static final q c = new q();
    private static final long serialVersionUID = -1440403870442975015L;

    private q() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.a, j$.time.chrono.j
    public final ChronoLocalDateTime A(LocalDateTime localDateTime) {
        return LocalDateTime.N(localDateTime);
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate B(Map map, j$.time.format.d0 d0Var) {
        ChronoField chronoField = ChronoField.YEAR;
        int a = chronoField.b.a(((Long) map.remove(chronoField)).longValue(), chronoField);
        boolean z = true;
        if (d0Var == j$.time.format.d0.LENIENT) {
            return LocalDate.of(a, 1, 1).Y(j$.com.android.tools.r8.a.Y(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L)).X(j$.com.android.tools.r8.a.Y(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int a2 = chronoField2.b.a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int a3 = chronoField3.b.a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (d0Var == j$.time.format.d0.SMART) {
            if (a2 == 4 || a2 == 6 || a2 == 9 || a2 == 11) {
                a3 = Math.min(a3, 30);
            } else if (a2 == 2) {
                Month month = Month.FEBRUARY;
                long j = a;
                int i = j$.time.p.b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                a3 = Math.min(a3, month.N(z));
            }
        }
        return LocalDate.of(a, a2, a3);
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate D(Map map, j$.time.format.d0 d0Var) {
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l = (Long) map.remove(chronoField);
        if (l == null) {
            ChronoField chronoField2 = ChronoField.ERA;
            if (!map.containsKey(chronoField2)) {
                return null;
            }
            chronoField2.D(((Long) map.get(chronoField2)).longValue());
            return null;
        }
        if (d0Var != j$.time.format.d0.LENIENT) {
            chronoField.D(l.longValue());
        }
        Long l2 = (Long) map.remove(ChronoField.ERA);
        if (l2 != null) {
            if (l2.longValue() == 1) {
                a.i(map, ChronoField.YEAR, l.longValue());
                return null;
            }
            if (l2.longValue() == 0) {
                a.i(map, ChronoField.YEAR, j$.com.android.tools.r8.a.Y(1L, l.longValue()));
                return null;
            }
            throw new DateTimeException("Invalid value for era: " + l2);
        }
        ChronoField chronoField3 = ChronoField.YEAR;
        Long l3 = (Long) map.get(chronoField3);
        if (d0Var != j$.time.format.d0.STRICT) {
            a.i(map, chronoField3, (l3 == null || l3.longValue() > 0) ? l.longValue() : j$.com.android.tools.r8.a.Y(1L, l.longValue()));
            return null;
        }
        if (l3 == null) {
            map.put(chronoField, l);
            return null;
        }
        long longValue = l3.longValue();
        long longValue2 = l.longValue();
        if (longValue <= 0) {
            longValue2 = j$.com.android.tools.r8.a.Y(1L, longValue2);
        }
        a.i(map, chronoField3, longValue2);
        return null;
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate F(int i, int i2, int i3) {
        return LocalDate.of(i, i2, i3);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.j
    public final ChronoLocalDate H(Map map, j$.time.format.d0 d0Var) {
        return (LocalDate) super.H(map, d0Var);
    }

    @Override // j$.time.chrono.j
    public final ChronoZonedDateTime I(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ZonedDateTime.n(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    @Override // j$.time.chrono.j
    public final boolean K(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.j
    public final String getId() {
        return "ISO";
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate h(long j) {
        return LocalDate.ofEpochDay(j);
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate j() {
        j$.time.a aVar = new j$.time.a(ZoneId.systemDefault());
        Objects.requireNonNull(aVar, "clock");
        return LocalDate.O(LocalDate.U(aVar));
    }

    @Override // j$.time.chrono.j
    public final String l() {
        return "iso8601";
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate m(int i, int i2) {
        return LocalDate.V(i, i2);
    }

    @Override // j$.time.chrono.j
    public final j$.time.temporal.s q(ChronoField chronoField) {
        return chronoField.b;
    }

    @Override // j$.time.chrono.j
    public final List s() {
        return j$.com.android.tools.r8.a.S(r.values());
    }

    @Override // j$.time.chrono.j
    public final k t(int i) {
        if (i == 0) {
            return r.BCE;
        }
        if (i == 1) {
            return r.CE;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // j$.time.chrono.j
    public final int u(k kVar, int i) {
        if (kVar instanceof r) {
            return kVar == r.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    public Object writeReplace() {
        return new c0((byte) 1, this);
    }

    @Override // j$.time.chrono.a
    public final void x(Map map, j$.time.format.d0 d0Var) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (d0Var != j$.time.format.d0.LENIENT) {
                chronoField.D(l.longValue());
            }
            a.i(map, ChronoField.MONTH_OF_YEAR, ((int) j$.com.android.tools.r8.a.V(l.longValue(), r4)) + 1);
            a.i(map, ChronoField.YEAR, j$.com.android.tools.r8.a.W(l.longValue(), 12));
        }
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate z(TemporalAccessor temporalAccessor) {
        return LocalDate.O(temporalAccessor);
    }
}
