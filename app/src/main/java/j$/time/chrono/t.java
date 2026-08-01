package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class t extends a implements Serializable {
    public static final t c = new t();
    private static final long serialVersionUID = 459996390165777884L;

    private t() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate D(Map map, j$.time.format.d0 d0Var) {
        v S;
        ChronoField chronoField = ChronoField.ERA;
        Long l = (Long) map.get(chronoField);
        w m = l != null ? w.m(q(chronoField).a(l.longValue(), chronoField)) : null;
        ChronoField chronoField2 = ChronoField.YEAR_OF_ERA;
        Long l2 = (Long) map.get(chronoField2);
        int a = l2 != null ? q(chronoField2).a(l2.longValue(), chronoField2) : 0;
        if (m == null && l2 != null && !map.containsKey(ChronoField.YEAR) && d0Var != j$.time.format.d0.STRICT) {
            w[] wVarArr = w.e;
            m = ((w[]) Arrays.copyOf(wVarArr, wVarArr.length))[((w[]) Arrays.copyOf(wVarArr, wVarArr.length)).length - 1];
        }
        if (l2 != null && m != null) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField3)) {
                ChronoField chronoField4 = ChronoField.DAY_OF_MONTH;
                if (map.containsKey(chronoField4)) {
                    map.remove(chronoField);
                    map.remove(chronoField2);
                    if (d0Var == j$.time.format.d0.LENIENT) {
                        return new v(LocalDate.of((m.b.getYear() + a) - 1, 1, 1)).Q(j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField3)).longValue(), 1L), j$.time.temporal.a.MONTHS).Q(j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField4)).longValue(), 1L), j$.time.temporal.a.DAYS);
                    }
                    int a2 = q(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    int a3 = q(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4);
                    if (d0Var != j$.time.format.d0.SMART) {
                        LocalDate localDate = v.d;
                        Objects.requireNonNull(m, "era");
                        LocalDate of = LocalDate.of((m.b.getYear() + a) - 1, a2, a3);
                        if (of.R(m.b) || m != w.h(of)) {
                            throw new DateTimeException("year, month, and day not valid for Era");
                        }
                        return new v(m, a, of);
                    }
                    if (a < 1) {
                        throw new DateTimeException("Invalid YearOfEra: " + a);
                    }
                    int year = (m.b.getYear() + a) - 1;
                    try {
                        S = new v(LocalDate.of(year, a2, a3));
                    } catch (DateTimeException unused) {
                        S = new v(LocalDate.of(year, a2, 1)).S(new j$.time.d(6));
                    }
                    if (S.b == m || j$.time.temporal.p.a(S, ChronoField.YEAR_OF_ERA) <= 1 || a <= 1) {
                        return S;
                    }
                    throw new DateTimeException("Invalid YearOfEra for Era: " + m + " " + a);
                }
            }
            ChronoField chronoField5 = ChronoField.DAY_OF_YEAR;
            if (map.containsKey(chronoField5)) {
                map.remove(chronoField);
                map.remove(chronoField2);
                if (d0Var == j$.time.format.d0.LENIENT) {
                    return new v(LocalDate.V((m.b.getYear() + a) - 1, 1)).Q(j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField5)).longValue(), 1L), j$.time.temporal.a.DAYS);
                }
                int a4 = q(chronoField5).a(((Long) map.remove(chronoField5)).longValue(), chronoField5);
                LocalDate localDate2 = v.d;
                Objects.requireNonNull(m, "era");
                LocalDate V = a == 1 ? LocalDate.V(m.b.getYear(), (m.b.Q() + a4) - 1) : LocalDate.V((m.b.getYear() + a) - 1, a4);
                if (V.R(m.b) || m != w.h(V)) {
                    throw new DateTimeException("Invalid parameters");
                }
                return new v(m, a, V);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate F(int i, int i2, int i3) {
        return new v(LocalDate.of(i, i2, i3));
    }

    @Override // j$.time.chrono.a, j$.time.chrono.j
    public final ChronoLocalDate H(Map map, j$.time.format.d0 d0Var) {
        return (v) super.H(map, d0Var);
    }

    @Override // j$.time.chrono.j
    public final ChronoZonedDateTime I(Instant instant, ZoneId zoneId) {
        return i.N(this, instant, zoneId);
    }

    @Override // j$.time.chrono.j
    public final boolean K(long j) {
        return q.c.K(j);
    }

    @Override // j$.time.chrono.j
    public final String getId() {
        return "Japanese";
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate h(long j) {
        return new v(LocalDate.ofEpochDay(j));
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate j() {
        return new v(LocalDate.O(LocalDate.U(new j$.time.a(ZoneId.systemDefault()))));
    }

    @Override // j$.time.chrono.j
    public final String l() {
        return "japanese";
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate m(int i, int i2) {
        return new v(LocalDate.V(i, i2));
    }

    @Override // j$.time.chrono.j
    public final j$.time.temporal.s q(ChronoField chronoField) {
        switch (s.a[chronoField.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new DateTimeException("Unsupported field: " + chronoField);
            case 5:
                w[] wVarArr = w.e;
                int year = wVarArr[wVarArr.length - 1].b.getYear();
                int year2 = 1000000000 - wVarArr[wVarArr.length - 1].b.getYear();
                int year3 = wVarArr[0].b.getYear();
                int i = 1;
                while (true) {
                    w[] wVarArr2 = w.e;
                    if (i >= wVarArr2.length) {
                        return j$.time.temporal.s.g(1L, year2, 999999999 - year);
                    }
                    w wVar = wVarArr2[i];
                    year2 = Math.min(year2, (wVar.b.getYear() - year3) + 1);
                    year3 = wVar.b.getYear();
                    i++;
                }
            case 6:
                w wVar2 = w.d;
                long j = ChronoField.DAY_OF_YEAR.b.c;
                long j2 = j;
                for (w wVar3 : w.e) {
                    long min = Math.min(j2, (wVar3.b.J() - wVar3.b.Q()) + 1);
                    j2 = wVar3.l() != null ? Math.min(min, wVar3.l().b.Q() - 1) : min;
                }
                return j$.time.temporal.s.g(1L, j2, ChronoField.DAY_OF_YEAR.b.d);
            case 7:
                return j$.time.temporal.s.f(v.d.getYear(), 999999999L);
            case 8:
                long j3 = w.d.a;
                w[] wVarArr3 = w.e;
                return j$.time.temporal.s.f(j3, wVarArr3[wVarArr3.length - 1].a);
            default:
                return chronoField.b;
        }
    }

    @Override // j$.time.chrono.j
    public final List s() {
        w[] wVarArr = w.e;
        return j$.com.android.tools.r8.a.S((w[]) Arrays.copyOf(wVarArr, wVarArr.length));
    }

    @Override // j$.time.chrono.j
    public final k t(int i) {
        return w.m(i);
    }

    @Override // j$.time.chrono.j
    public final int u(k kVar, int i) {
        if (!(kVar instanceof w)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        w wVar = (w) kVar;
        int year = (wVar.b.getYear() + i) - 1;
        if (i != 1 && (year < -999999999 || year > 999999999 || year < wVar.b.getYear() || kVar != w.h(LocalDate.of(year, 1, 1)))) {
            throw new DateTimeException("Invalid yearOfEra value");
        }
        return year;
    }

    public Object writeReplace() {
        return new c0((byte) 1, this);
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate z(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof v ? (v) temporalAccessor : new v(LocalDate.O(temporalAccessor));
    }
}
