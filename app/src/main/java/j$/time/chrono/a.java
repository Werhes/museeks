package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class a implements j {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        new Locale("ja", "JP", "JP");
    }

    public static void i(Map map, ChronoField chronoField, long j) {
        Long l = (Long) map.get(chronoField);
        if (l == null || l.longValue() == j) {
            map.put(chronoField, Long.valueOf(j));
            return;
        }
        throw new DateTimeException("Conflict found: " + chronoField + " " + l + " differs from " + chronoField + " " + j);
    }

    public static j k(j jVar, String str) {
        String l;
        j jVar2 = (j) a.putIfAbsent(str, jVar);
        if (jVar2 == null && (l = jVar.l()) != null) {
            b.putIfAbsent(l, jVar);
        }
        return jVar2;
    }

    public static ChronoLocalDate n(ChronoLocalDate chronoLocalDate, long j, long j2, long j3) {
        long j4;
        ChronoLocalDate d = chronoLocalDate.d(j, (j$.time.temporal.q) j$.time.temporal.a.MONTHS);
        j$.time.temporal.a aVar = j$.time.temporal.a.WEEKS;
        ChronoLocalDate d2 = d.d(j2, (j$.time.temporal.q) aVar);
        if (j3 <= 7) {
            if (j3 < 1) {
                d2 = d2.d(j$.com.android.tools.r8.a.Y(j3, 7L) / 7, (j$.time.temporal.q) aVar);
                j4 = (j3 + 6) % 7;
            }
            return d2.w(new j$.time.temporal.n(DayOfWeek.M((int) j3).getValue(), 0));
        }
        long j5 = j3 - 1;
        d2 = d2.d(j5 / 7, (j$.time.temporal.q) aVar);
        j4 = j5 % 7;
        j3 = j4 + 1;
        return d2.w(new j$.time.temporal.n(DayOfWeek.M((int) j3).getValue(), 0));
    }

    @Override // j$.time.chrono.j
    public ChronoLocalDateTime A(LocalDateTime localDateTime) {
        try {
            return z(localDateTime).C(LocalTime.N(localDateTime));
        } catch (DateTimeException e) {
            throw new RuntimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e);
        }
    }

    public ChronoLocalDate B(Map map, j$.time.format.d0 d0Var) {
        ChronoField chronoField = ChronoField.YEAR;
        int a2 = q(chronoField).a(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (d0Var == j$.time.format.d0.LENIENT) {
            long Y = j$.com.android.tools.r8.a.Y(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L);
            return F(a2, 1, 1).d(Y, (j$.time.temporal.q) j$.time.temporal.a.MONTHS).d(j$.com.android.tools.r8.a.Y(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int a3 = q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int a4 = q(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (d0Var != j$.time.format.d0.SMART) {
            return F(a2, a3, a4);
        }
        try {
            return F(a2, a3, a4);
        } catch (DateTimeException unused) {
            return F(a2, a3, 1).w(new j$.time.d(6));
        }
    }

    public ChronoLocalDate D(Map map, j$.time.format.d0 d0Var) {
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l = (Long) map.remove(chronoField);
        if (l == null) {
            ChronoField chronoField2 = ChronoField.ERA;
            if (!map.containsKey(chronoField2)) {
                return null;
            }
            q(chronoField2).b(((Long) map.get(chronoField2)).longValue(), chronoField2);
            return null;
        }
        Long l2 = (Long) map.remove(ChronoField.ERA);
        int a2 = d0Var != j$.time.format.d0.LENIENT ? q(chronoField).a(l.longValue(), chronoField) : j$.com.android.tools.r8.a.Q(l.longValue());
        if (l2 != null) {
            i(map, ChronoField.YEAR, u(t(q(r2).a(l2.longValue(), r2)), a2));
            return null;
        }
        ChronoField chronoField3 = ChronoField.YEAR;
        if (map.containsKey(chronoField3)) {
            i(map, chronoField3, u(m(q(chronoField3).a(((Long) map.get(chronoField3)).longValue(), chronoField3), 1).E(), a2));
            return null;
        }
        if (d0Var == j$.time.format.d0.STRICT) {
            map.put(chronoField, l);
            return null;
        }
        if (s().isEmpty()) {
            i(map, chronoField3, a2);
            return null;
        }
        i(map, chronoField3, u((k) r9.get(r9.size() - 1), a2));
        return null;
    }

    @Override // j$.time.chrono.j
    public ChronoLocalDate H(Map map, j$.time.format.d0 d0Var) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            return h(((Long) map.remove(chronoField)).longValue());
        }
        x(map, d0Var);
        ChronoLocalDate D = D(map, d0Var);
        if (D != null) {
            return D;
        }
        ChronoField chronoField2 = ChronoField.YEAR;
        if (!map.containsKey(chronoField2)) {
            return null;
        }
        ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
        if (map.containsKey(chronoField3)) {
            if (map.containsKey(ChronoField.DAY_OF_MONTH)) {
                return B(map, d0Var);
            }
            ChronoField chronoField4 = ChronoField.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(chronoField4)) {
                ChronoField chronoField5 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(chronoField5)) {
                    int a2 = q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (d0Var == j$.time.format.d0.LENIENT) {
                        long Y = j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField3)).longValue(), 1L);
                        return F(a2, 1, 1).d(Y, (j$.time.temporal.q) j$.time.temporal.a.MONTHS).d(j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField4)).longValue(), 1L), (j$.time.temporal.q) j$.time.temporal.a.WEEKS).d(j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField5)).longValue(), 1L), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
                    }
                    int a3 = q(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    int a4 = q(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4);
                    ChronoLocalDate d = F(a2, a3, 1).d((q(chronoField5).a(((Long) map.remove(chronoField5)).longValue(), chronoField5) - 1) + ((a4 - 1) * 7), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
                    if (d0Var != j$.time.format.d0.STRICT || d.i(chronoField3) == a3) {
                        return d;
                    }
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
                ChronoField chronoField6 = ChronoField.DAY_OF_WEEK;
                if (map.containsKey(chronoField6)) {
                    int a5 = q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (d0Var == j$.time.format.d0.LENIENT) {
                        return n(F(a5, 1, 1), j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField3)).longValue(), 1L), j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField4)).longValue(), 1L), j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField6)).longValue(), 1L));
                    }
                    int a6 = q(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    ChronoLocalDate w = F(a5, a6, 1).d((q(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4) - 1) * 7, (j$.time.temporal.q) j$.time.temporal.a.DAYS).w(new j$.time.temporal.n(DayOfWeek.M(q(chronoField6).a(((Long) map.remove(chronoField6)).longValue(), chronoField6)).getValue(), 0));
                    if (d0Var != j$.time.format.d0.STRICT || w.i(chronoField3) == a6) {
                        return w;
                    }
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        ChronoField chronoField7 = ChronoField.DAY_OF_YEAR;
        if (map.containsKey(chronoField7)) {
            int a7 = q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
            if (d0Var != j$.time.format.d0.LENIENT) {
                return m(a7, q(chronoField7).a(((Long) map.remove(chronoField7)).longValue(), chronoField7));
            }
            return m(a7, 1).d(j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField7)).longValue(), 1L), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
        }
        ChronoField chronoField8 = ChronoField.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(chronoField8)) {
            return null;
        }
        ChronoField chronoField9 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(chronoField9)) {
            int a8 = q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
            if (d0Var == j$.time.format.d0.LENIENT) {
                return m(a8, 1).d(j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField8)).longValue(), 1L), (j$.time.temporal.q) j$.time.temporal.a.WEEKS).d(j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField9)).longValue(), 1L), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
            }
            int a9 = q(chronoField8).a(((Long) map.remove(chronoField8)).longValue(), chronoField8);
            ChronoLocalDate d2 = m(a8, 1).d((q(chronoField9).a(((Long) map.remove(chronoField9)).longValue(), chronoField9) - 1) + ((a9 - 1) * 7), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
            if (d0Var != j$.time.format.d0.STRICT || d2.i(chronoField2) == a8) {
                return d2;
            }
            throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
        }
        ChronoField chronoField10 = ChronoField.DAY_OF_WEEK;
        if (!map.containsKey(chronoField10)) {
            return null;
        }
        int a10 = q(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        if (d0Var == j$.time.format.d0.LENIENT) {
            return n(m(a10, 1), 0L, j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField8)).longValue(), 1L), j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField10)).longValue(), 1L));
        }
        ChronoLocalDate w2 = m(a10, 1).d((q(chronoField8).a(((Long) map.remove(chronoField8)).longValue(), chronoField8) - 1) * 7, (j$.time.temporal.q) j$.time.temporal.a.DAYS).w(new j$.time.temporal.n(DayOfWeek.M(q(chronoField10).a(((Long) map.remove(chronoField10)).longValue(), chronoField10)).getValue(), 0));
        if (d0Var != j$.time.format.d0.STRICT || w2.i(chronoField2) == a10) {
            return w2;
        }
        throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getId().compareTo(((j) obj).getId());
    }

    @Override // j$.time.chrono.j
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && getId().compareTo(((a) obj).getId()) == 0;
    }

    @Override // j$.time.chrono.j
    public final int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    public abstract /* synthetic */ ChronoLocalDate j();

    @Override // j$.time.chrono.j
    public final String toString() {
        return getId();
    }

    public void x(Map map, j$.time.format.d0 d0Var) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (d0Var != j$.time.format.d0.LENIENT) {
                chronoField.D(l.longValue());
            }
            ChronoLocalDate c = j().c(1L, (TemporalField) ChronoField.DAY_OF_MONTH).c(l.longValue(), (TemporalField) chronoField);
            i(map, ChronoField.MONTH_OF_YEAR, c.i(r0));
            i(map, ChronoField.YEAR, c.i(r0));
        }
    }
}
