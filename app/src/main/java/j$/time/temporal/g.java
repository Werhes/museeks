package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.format.c0;
import j$.time.format.d0;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class g implements TemporalField {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ g[] b;

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.TemporalField
            public final l B(l lVar, long j) {
                long x = x(lVar);
                n().b(j, this);
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return lVar.c((j - x) + lVar.B(chronoField), chronoField);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean i(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(ChronoField.DAY_OF_YEAR) || !temporalAccessor.e(ChronoField.MONTH_OF_YEAR) || !temporalAccessor.e(ChronoField.YEAR)) {
                    return false;
                }
                g gVar2 = i.a;
                return j$.com.android.tools.r8.a.P(temporalAccessor).equals(j$.time.chrono.q.c);
            }

            @Override // j$.time.temporal.TemporalField
            public final s j(TemporalAccessor temporalAccessor) {
                if (!i(temporalAccessor)) {
                    throw new DateTimeException("Unsupported field: DayOfQuarter");
                }
                long B = temporalAccessor.B(g.QUARTER_OF_YEAR);
                if (B == 1) {
                    return j$.time.chrono.q.c.K(temporalAccessor.B(ChronoField.YEAR)) ? s.f(1L, 91L) : s.f(1L, 90L);
                }
                return B == 2 ? s.f(1L, 91L) : (B == 3 || B == 4) ? s.f(1L, 92L) : n();
            }

            @Override // j$.time.temporal.g, j$.time.temporal.TemporalField
            public final TemporalAccessor k(Map map, c0 c0Var, d0 d0Var) {
                LocalDate localDate;
                long j;
                ChronoField chronoField = ChronoField.YEAR;
                Long l = (Long) map.get(chronoField);
                TemporalField temporalField = g.QUARTER_OF_YEAR;
                Long l2 = (Long) map.get(temporalField);
                if (l == null || l2 == null) {
                    return null;
                }
                int a2 = chronoField.b.a(l.longValue(), chronoField);
                long longValue = ((Long) map.get(g.DAY_OF_QUARTER)).longValue();
                g gVar2 = i.a;
                if (!j$.com.android.tools.r8.a.P(c0Var).equals(j$.time.chrono.q.c)) {
                    throw new DateTimeException("Resolve requires IsoChronology");
                }
                if (d0Var == d0.LENIENT) {
                    localDate = LocalDate.of(a2, 1, 1).Y(j$.com.android.tools.r8.a.X(j$.com.android.tools.r8.a.Y(l2.longValue(), 1L), 3));
                    j = j$.com.android.tools.r8.a.Y(longValue, 1L);
                } else {
                    LocalDate of = LocalDate.of(a2, ((temporalField.n().a(l2.longValue(), temporalField) - 1) * 3) + 1, 1);
                    if (longValue < 1 || longValue > 90) {
                        if (d0Var == d0.STRICT) {
                            j(of).b(longValue, this);
                        } else {
                            n().b(longValue, this);
                        }
                    }
                    localDate = of;
                    j = longValue - 1;
                }
                map.remove(this);
                map.remove(chronoField);
                map.remove(temporalField);
                return localDate.X(j);
            }

            @Override // j$.time.temporal.TemporalField
            public final s n() {
                return s.g(1L, 90L, 92L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override // j$.time.temporal.TemporalField
            public final long x(TemporalAccessor temporalAccessor) {
                if (!i(temporalAccessor)) {
                    throw new DateTimeException("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.i(ChronoField.DAY_OF_YEAR) - g.a[((temporalAccessor.i(ChronoField.MONTH_OF_YEAR) - 1) / 3) + (j$.time.chrono.q.c.K(temporalAccessor.B(ChronoField.YEAR)) ? 4 : 0)];
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.TemporalField
            public final l B(l lVar, long j) {
                long x = x(lVar);
                n().b(j, this);
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                return lVar.c(((j - x) * 3) + lVar.B(chronoField), chronoField);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean i(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(ChronoField.MONTH_OF_YEAR)) {
                    return false;
                }
                g gVar3 = i.a;
                return j$.com.android.tools.r8.a.P(temporalAccessor).equals(j$.time.chrono.q.c);
            }

            @Override // j$.time.temporal.TemporalField
            public final s j(TemporalAccessor temporalAccessor) {
                if (i(temporalAccessor)) {
                    return n();
                }
                throw new DateTimeException("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final s n() {
                return s.f(1L, 4L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final long x(TemporalAccessor temporalAccessor) {
                if (i(temporalAccessor)) {
                    return (temporalAccessor.B(ChronoField.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new DateTimeException("Unsupported field: QuarterOfYear");
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.TemporalField
            public final l B(l lVar, long j) {
                n().b(j, this);
                return lVar.d(j$.com.android.tools.r8.a.Y(j, x(lVar)), a.WEEKS);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean i(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                g gVar4 = i.a;
                return j$.com.android.tools.r8.a.P(temporalAccessor).equals(j$.time.chrono.q.c);
            }

            @Override // j$.time.temporal.TemporalField
            public final s j(TemporalAccessor temporalAccessor) {
                if (i(temporalAccessor)) {
                    return g.O(LocalDate.O(temporalAccessor));
                }
                throw new DateTimeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.g, j$.time.temporal.TemporalField
            public final TemporalAccessor k(Map map, c0 c0Var, d0 d0Var) {
                LocalDate c;
                long j;
                long j2;
                TemporalField temporalField = g.WEEK_BASED_YEAR;
                Long l = (Long) map.get(temporalField);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                Long l2 = (Long) map.get(chronoField);
                if (l == null || l2 == null) {
                    return null;
                }
                int a2 = temporalField.n().a(l.longValue(), temporalField);
                long longValue = ((Long) map.get(g.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                g gVar4 = i.a;
                if (!j$.com.android.tools.r8.a.P(c0Var).equals(j$.time.chrono.q.c)) {
                    throw new DateTimeException("Resolve requires IsoChronology");
                }
                LocalDate of = LocalDate.of(a2, 1, 4);
                if (d0Var == d0.LENIENT) {
                    long longValue2 = l2.longValue();
                    if (longValue2 > 7) {
                        long j3 = longValue2 - 1;
                        j = 1;
                        of = of.Z(j3 / 7);
                        j2 = j3 % 7;
                    } else {
                        j = 1;
                        if (longValue2 < 1) {
                            of = of.Z(j$.com.android.tools.r8.a.Y(longValue2, 7L) / 7);
                            j2 = (longValue2 + 6) % 7;
                        }
                        c = of.Z(j$.com.android.tools.r8.a.Y(longValue, j)).c(longValue2, chronoField);
                    }
                    longValue2 = j2 + j;
                    c = of.Z(j$.com.android.tools.r8.a.Y(longValue, j)).c(longValue2, chronoField);
                } else {
                    int a3 = chronoField.b.a(l2.longValue(), chronoField);
                    if (longValue < 1 || longValue > 52) {
                        if (d0Var == d0.STRICT) {
                            g.O(of).b(longValue, this);
                        } else {
                            n().b(longValue, this);
                        }
                    }
                    c = of.Z(longValue - 1).c(a3, chronoField);
                }
                map.remove(this);
                map.remove(temporalField);
                map.remove(chronoField);
                return c;
            }

            @Override // j$.time.temporal.TemporalField
            public final s n() {
                return s.g(1L, 52L, 53L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final long x(TemporalAccessor temporalAccessor) {
                if (i(temporalAccessor)) {
                    return g.D(LocalDate.O(temporalAccessor));
                }
                throw new DateTimeException("Unsupported field: WeekOfWeekBasedYear");
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.TemporalField
            public final l B(l lVar, long j) {
                if (!i(lVar)) {
                    throw new DateTimeException("Unsupported field: WeekBasedYear");
                }
                int a2 = ChronoField.YEAR.b.a(j, g.WEEK_BASED_YEAR);
                LocalDate O = LocalDate.O(lVar);
                int i = O.i(ChronoField.DAY_OF_WEEK);
                int D = g.D(O);
                if (D == 53 && g.N(a2) == 52) {
                    D = 52;
                }
                return lVar.w(LocalDate.of(a2, 1, 4).X(((D - 1) * 7) + (i - r6.i(r0))));
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean i(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                g gVar5 = i.a;
                return j$.com.android.tools.r8.a.P(temporalAccessor).equals(j$.time.chrono.q.c);
            }

            @Override // j$.time.temporal.TemporalField
            public final s j(TemporalAccessor temporalAccessor) {
                if (i(temporalAccessor)) {
                    return n();
                }
                throw new DateTimeException("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final s n() {
                return ChronoField.YEAR.b;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final long x(TemporalAccessor temporalAccessor) {
                if (i(temporalAccessor)) {
                    return g.M(LocalDate.O(temporalAccessor));
                }
                throw new DateTimeException("Unsupported field: WeekBasedYear");
            }
        };
        WEEK_BASED_YEAR = gVar4;
        b = new g[]{gVar, gVar2, gVar3, gVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int D(LocalDate localDate) {
        int ordinal = localDate.getDayOfWeek().ordinal();
        int Q = localDate.Q() - 1;
        int i = (3 - ordinal) + Q;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (Q < i3) {
            if (localDate.Q() != 180) {
                localDate = LocalDate.V(localDate.a, 180);
            }
            return (int) O(localDate.a0(-1L)).d;
        }
        int i4 = ((Q - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.p())) {
            return i4;
        }
        return 1;
    }

    public static int M(LocalDate localDate) {
        int year = localDate.getYear();
        int Q = localDate.Q();
        if (Q <= 3) {
            return Q - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (Q >= 363) {
            return ((Q - 363) - (localDate.p() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }

    public static int N(int i) {
        LocalDate of = LocalDate.of(i, 1, 1);
        if (of.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (of.getDayOfWeek() == DayOfWeek.WEDNESDAY && of.p()) ? 53 : 52;
        }
        return 53;
    }

    public static s O(LocalDate localDate) {
        return s.f(1L, N(M(localDate)));
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) b.clone();
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    public /* synthetic */ TemporalAccessor k(Map map, c0 c0Var, d0 d0Var) {
        return null;
    }
}
