package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.chrono.ChronoLocalDate;
import j$.time.format.c0;
import j$.time.format.d0;
import java.util.Map;

/* loaded from: classes2.dex */
public final class t implements TemporalField {
    public static final s f = s.f(1, 7);
    public static final s g = s.g(0, 4, 6);
    public static final s h = s.g(0, 52, 54);
    public static final s i = s.g(1, 52, 53);
    public final String a;
    public final u b;
    public final q c;
    public final q d;
    public final s e;

    public t(String str, u uVar, q qVar, q qVar2, s sVar) {
        this.a = str;
        this.b = uVar;
        this.c = qVar;
        this.d = qVar2;
        this.e = sVar;
    }

    public static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    @Override // j$.time.temporal.TemporalField
    public final l B(l lVar, long j) {
        if (this.e.a(j, this) == lVar.i(this)) {
            return lVar;
        }
        if (this.d != a.FOREVER) {
            return lVar.d(r0 - r1, this.c);
        }
        u uVar = this.b;
        return e(j$.com.android.tools.r8.a.P(lVar), (int) j, lVar.i(uVar.e), lVar.i(uVar.c));
    }

    public final int b(TemporalAccessor temporalAccessor) {
        return p.e(temporalAccessor.i(ChronoField.DAY_OF_WEEK) - this.b.a.getValue()) + 1;
    }

    public final int c(TemporalAccessor temporalAccessor) {
        int b = b(temporalAccessor);
        int i2 = temporalAccessor.i(ChronoField.YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int i3 = temporalAccessor.i(chronoField);
        int h2 = h(i3, b);
        int a = a(h2, i3);
        return a == 0 ? i2 - 1 : a >= a(h2, ((int) temporalAccessor.k(chronoField).d) + this.b.b) ? i2 + 1 : i2;
    }

    public final int d(TemporalAccessor temporalAccessor) {
        int a;
        int b = b(temporalAccessor);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int i2 = temporalAccessor.i(chronoField);
        int h2 = h(i2, b);
        int a2 = a(h2, i2);
        return a2 == 0 ? d(j$.com.android.tools.r8.a.P(temporalAccessor).z(temporalAccessor).x(i2, a.DAYS)) : (a2 <= 50 || a2 < (a = a(h2, ((int) temporalAccessor.k(chronoField).d) + this.b.b))) ? a2 : (a2 - a) + 1;
    }

    public final ChronoLocalDate e(j$.time.chrono.j jVar, int i2, int i3, int i4) {
        ChronoLocalDate F = jVar.F(i2, 1, 1);
        int h2 = h(1, b(F));
        int i5 = i4 - 1;
        return F.d(((Math.min(i3, a(h2, F.J() + this.b.b) - 1) - 1) * 7) + i5 + (-h2), (q) a.DAYS);
    }

    public final s f(TemporalAccessor temporalAccessor, ChronoField chronoField) {
        int h2 = h(temporalAccessor.i(chronoField), b(temporalAccessor));
        s k = temporalAccessor.k(chronoField);
        return s.f(a(h2, (int) k.a), a(h2, (int) k.d));
    }

    public final s g(TemporalAccessor temporalAccessor) {
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        if (!temporalAccessor.e(chronoField)) {
            return h;
        }
        int b = b(temporalAccessor);
        int i2 = temporalAccessor.i(chronoField);
        int h2 = h(i2, b);
        int a = a(h2, i2);
        if (a == 0) {
            return g(j$.com.android.tools.r8.a.P(temporalAccessor).z(temporalAccessor).x(i2 + 7, a.DAYS));
        }
        return a >= a(h2, this.b.b + ((int) temporalAccessor.k(chronoField).d)) ? g(j$.com.android.tools.r8.a.P(temporalAccessor).z(temporalAccessor).d((r0 - i2) + 8, (q) a.DAYS)) : s.f(1L, r1 - 1);
    }

    public final int h(int i2, int i3) {
        int e = p.e(i2 - i3);
        return e + 1 > this.b.b ? 7 - e : -e;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean i(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.e(ChronoField.DAY_OF_WEEK)) {
            return false;
        }
        a aVar = a.WEEKS;
        q qVar = this.d;
        if (qVar == aVar) {
            return true;
        }
        if (qVar == a.MONTHS) {
            return temporalAccessor.e(ChronoField.DAY_OF_MONTH);
        }
        if (qVar != a.YEARS && qVar != u.h) {
            if (qVar == a.FOREVER) {
                return temporalAccessor.e(ChronoField.YEAR);
            }
            return false;
        }
        return temporalAccessor.e(ChronoField.DAY_OF_YEAR);
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.TemporalField
    public final s j(TemporalAccessor temporalAccessor) {
        a aVar = a.WEEKS;
        q qVar = this.d;
        if (qVar == aVar) {
            return this.e;
        }
        if (qVar == a.MONTHS) {
            return f(temporalAccessor, ChronoField.DAY_OF_MONTH);
        }
        if (qVar == a.YEARS) {
            return f(temporalAccessor, ChronoField.DAY_OF_YEAR);
        }
        if (qVar == u.h) {
            return g(temporalAccessor);
        }
        if (qVar == a.FOREVER) {
            return ChronoField.YEAR.b;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + qVar + ", this: " + this);
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor k(Map map, c0 c0Var, d0 d0Var) {
        ChronoLocalDate chronoLocalDate;
        ChronoLocalDate chronoLocalDate2;
        ChronoField chronoField;
        ChronoLocalDate chronoLocalDate3;
        long longValue = ((Long) map.get(this)).longValue();
        int Q = j$.com.android.tools.r8.a.Q(longValue);
        a aVar = a.WEEKS;
        s sVar = this.e;
        u uVar = this.b;
        q qVar = this.d;
        if (qVar == aVar) {
            long e = p.e((sVar.a(longValue, this) - 1) + (uVar.a.getValue() - 1)) + 1;
            map.remove(this);
            map.put(ChronoField.DAY_OF_WEEK, Long.valueOf(e));
            return null;
        }
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        if (!map.containsKey(chronoField2)) {
            return null;
        }
        int e2 = p.e(chronoField2.b.a(((Long) map.get(chronoField2)).longValue(), chronoField2) - uVar.a.getValue()) + 1;
        j$.time.chrono.j P = j$.com.android.tools.r8.a.P(c0Var);
        ChronoField chronoField3 = ChronoField.YEAR;
        if (!map.containsKey(chronoField3)) {
            if ((qVar != u.h && qVar != a.FOREVER) || !map.containsKey(uVar.f) || !map.containsKey(uVar.e)) {
                return null;
            }
            t tVar = uVar.f;
            int a = tVar.e.a(((Long) map.get(tVar)).longValue(), uVar.f);
            if (d0Var == d0.LENIENT) {
                chronoLocalDate = e(P, a, 1, e2).d(j$.com.android.tools.r8.a.Y(((Long) map.get(uVar.e)).longValue(), 1L), (q) aVar);
            } else {
                t tVar2 = uVar.e;
                ChronoLocalDate e3 = e(P, a, tVar2.e.a(((Long) map.get(tVar2)).longValue(), uVar.e), e2);
                if (d0Var == d0.STRICT && c(e3) != a) {
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different week-based-year");
                }
                chronoLocalDate = e3;
            }
            map.remove(this);
            map.remove(uVar.f);
            map.remove(uVar.e);
            map.remove(chronoField2);
            return chronoLocalDate;
        }
        int a2 = chronoField3.b.a(((Long) map.get(chronoField3)).longValue(), chronoField3);
        a aVar2 = a.MONTHS;
        if (qVar == aVar2) {
            ChronoField chronoField4 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField4)) {
                long longValue2 = ((Long) map.get(chronoField4)).longValue();
                long j = Q;
                if (d0Var == d0.LENIENT) {
                    ChronoLocalDate d = P.F(a2, 1, 1).d(j$.com.android.tools.r8.a.Y(longValue2, 1L), (q) aVar2);
                    int b = b(d);
                    int i2 = d.i(ChronoField.DAY_OF_MONTH);
                    chronoLocalDate3 = d.d(j$.com.android.tools.r8.a.R(j$.com.android.tools.r8.a.X(j$.com.android.tools.r8.a.Y(j, a(h(i2, b), i2)), 7), e2 - b(d)), (q) a.DAYS);
                    chronoField = chronoField4;
                } else {
                    chronoField = chronoField4;
                    ChronoLocalDate F = P.F(a2, chronoField.b.a(longValue2, chronoField), 1);
                    long a3 = sVar.a(j, this);
                    int b2 = b(F);
                    int i3 = F.i(ChronoField.DAY_OF_MONTH);
                    ChronoLocalDate d2 = F.d((((int) (a3 - a(h(i3, b2), i3))) * 7) + (e2 - b(F)), (q) a.DAYS);
                    if (d0Var == d0.STRICT && d2.B(chronoField) != longValue2) {
                        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                    }
                    chronoLocalDate3 = d2;
                }
                map.remove(this);
                map.remove(chronoField3);
                map.remove(chronoField);
                map.remove(chronoField2);
                return chronoLocalDate3;
            }
        }
        if (qVar != a.YEARS) {
            return null;
        }
        long j2 = Q;
        ChronoLocalDate F2 = P.F(a2, 1, 1);
        if (d0Var == d0.LENIENT) {
            int b3 = b(F2);
            int i4 = F2.i(ChronoField.DAY_OF_YEAR);
            chronoLocalDate2 = F2.d(j$.com.android.tools.r8.a.R(j$.com.android.tools.r8.a.X(j$.com.android.tools.r8.a.Y(j2, a(h(i4, b3), i4)), 7), e2 - b(F2)), (q) a.DAYS);
        } else {
            long a4 = sVar.a(j2, this);
            int b4 = b(F2);
            int i5 = F2.i(ChronoField.DAY_OF_YEAR);
            ChronoLocalDate d3 = F2.d((((int) (a4 - a(h(i5, b4), i5))) * 7) + (e2 - b(F2)), (q) a.DAYS);
            if (d0Var == d0.STRICT && d3.B(chronoField3) != a2) {
                throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
            }
            chronoLocalDate2 = d3;
        }
        map.remove(this);
        map.remove(chronoField3);
        map.remove(chronoField2);
        return chronoLocalDate2;
    }

    @Override // j$.time.temporal.TemporalField
    public final s n() {
        return this.e;
    }

    public final String toString() {
        return this.a + "[" + this.b.toString() + "]";
    }

    @Override // j$.time.temporal.TemporalField
    public final long x(TemporalAccessor temporalAccessor) {
        int c;
        a aVar = a.WEEKS;
        q qVar = this.d;
        if (qVar == aVar) {
            c = b(temporalAccessor);
        } else if (qVar == a.MONTHS) {
            int b = b(temporalAccessor);
            int i2 = temporalAccessor.i(ChronoField.DAY_OF_MONTH);
            c = a(h(i2, b), i2);
        } else if (qVar == a.YEARS) {
            int b2 = b(temporalAccessor);
            int i3 = temporalAccessor.i(ChronoField.DAY_OF_YEAR);
            c = a(h(i3, b2), i3);
        } else if (qVar == u.h) {
            c = d(temporalAccessor);
        } else {
            if (qVar != a.FOREVER) {
                throw new IllegalStateException("unreachable, rangeUnit: " + qVar + ", this: " + this);
            }
            c = c(temporalAccessor);
        }
        return c;
    }
}
