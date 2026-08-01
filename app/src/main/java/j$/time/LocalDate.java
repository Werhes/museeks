package j$.time;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class LocalDate implements j$.time.temporal.l, j$.time.temporal.m, ChronoLocalDate, Serializable {
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;
    public static final LocalDate MIN = of(-999999999, 1, 1);
    public static final LocalDate MAX = of(999999999, 12, 31);

    static {
        of(1970, 1, 1);
    }

    public LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static LocalDate N(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (j$.time.chrono.q.c.K(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new DateTimeException("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new DateTimeException("Invalid date '" + Month.P(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate O(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.D(j$.time.temporal.p.f);
        if (localDate != null) {
            return localDate;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static LocalDate U(a aVar) {
        Objects.requireNonNull(aVar, "clock");
        long currentTimeMillis = System.currentTimeMillis();
        Instant instant = Instant.c;
        long j = 1000;
        Instant M = Instant.M(j$.com.android.tools.r8.a.W(currentTimeMillis, j), ((int) j$.com.android.tools.r8.a.V(currentTimeMillis, j)) * 1000000);
        ZoneId zoneId = aVar.a;
        Objects.requireNonNull(M, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ofEpochDay(j$.com.android.tools.r8.a.W(M.getEpochSecond() + zoneId.getRules().d(M).getTotalSeconds(), 86400));
    }

    public static LocalDate V(int i, int i2) {
        long j = i;
        ChronoField.YEAR.D(j);
        ChronoField.DAY_OF_YEAR.D(i2);
        boolean K = j$.time.chrono.q.c.K(j);
        if (i2 == 366 && !K) {
            throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        Month P = Month.P(((i2 - 1) / 31) + 1);
        if (i2 > (P.N(K) + P.M(K)) - 1) {
            P = Month.a[((((int) 1) + 12) + P.ordinal()) % 12];
        }
        return new LocalDate(i, P.getValue(), (i2 - P.M(K)) + 1);
    }

    public static LocalDate b0(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, j$.time.chrono.q.c.K((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate of(int i, int i2, int i3) {
        ChronoField.YEAR.D(i);
        ChronoField.MONTH_OF_YEAR.D(i2);
        ChronoField.DAY_OF_MONTH.D(i3);
        return N(i, i2, i3);
    }

    public static LocalDate ofEpochDay(long j) {
        long j2;
        ChronoField.EPOCH_DAY.D(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + (i2 / 10);
        ChronoField chronoField = ChronoField.YEAR;
        return new LocalDate(chronoField.b.a(j7, chronoField), i3, i4);
    }

    public static LocalDate parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.parse(charSequence, new d(0));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 3, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long B(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.EPOCH_DAY ? toEpochDay() : temporalField == ChronoField.PROLEPTIC_MONTH ? ((this.a * 12) + this.b) - 1 : P(temporalField) : temporalField.x(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime C(LocalTime localTime) {
        return LocalDateTime.of(this, localTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.p.f ? this : j$.com.android.tools.r8.a.v(this, temporalQuery);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.k E() {
        return getYear() >= 1 ? j$.time.chrono.r.CE : j$.time.chrono.r.BCE;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate G(j$.time.temporal.o oVar) {
        if (b.b(oVar)) {
            m mVar = (m) oVar;
            return Y((mVar.a * 12) + mVar.b).X(mVar.c);
        }
        Objects.requireNonNull(oVar, "amountToAdd");
        return (LocalDate) ((m) oVar).i(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int J() {
        return p() ? 366 : 365;
    }

    public final int M(LocalDate localDate) {
        int i = this.a - localDate.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - localDate.b;
        return i2 == 0 ? this.c - localDate.c : i2;
    }

    public final int P(TemporalField temporalField) {
        switch (e.a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.c;
            case 2:
                return Q();
            case 3:
                return ((this.c - 1) / 7) + 1;
            case 4:
                int i = this.a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                return ((this.c - 1) % 7) + 1;
            case 7:
                return ((Q() - 1) % 7) + 1;
            case 8:
                throw new DateTimeException("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((Q() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new DateTimeException("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.a;
            case 13:
                return this.a >= 1 ? 1 : 0;
            default:
                throw new DateTimeException(b.a("Unsupported field: ", temporalField));
        }
    }

    public final int Q() {
        return (getMonth().M(p()) + this.c) - 1;
    }

    public final boolean R(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? M((LocalDate) chronoLocalDate) < 0 : toEpochDay() < chronoLocalDate.toEpochDay();
    }

    public final int S() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : p() ? 29 : 28;
    }

    @Override // j$.time.temporal.l
    /* renamed from: T, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate x(long j, j$.time.temporal.q qVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, qVar).d(1L, qVar) : d(-j, qVar);
    }

    @Override // j$.time.temporal.l
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final LocalDate d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (LocalDate) qVar.i(this, j);
        }
        switch (e.b[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return X(j);
            case 2:
                return Z(j);
            case 3:
                return Y(j);
            case 4:
                return a0(j);
            case 5:
                return a0(j$.com.android.tools.r8.a.X(j, 10));
            case 6:
                return a0(j$.com.android.tools.r8.a.X(j, 100));
            case 7:
                return a0(j$.com.android.tools.r8.a.X(j, 1000));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return c(j$.com.android.tools.r8.a.R(B(chronoField), j), chronoField);
            default:
                throw new DateTimeException("Unsupported unit: " + qVar);
        }
    }

    public final LocalDate X(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            if (j2 <= 28) {
                return new LocalDate(this.a, this.b, (int) j2);
            }
            if (j2 <= 59) {
                long S = S();
                if (j2 <= S) {
                    return new LocalDate(this.a, this.b, (int) j2);
                }
                short s = this.b;
                if (s < 12) {
                    return new LocalDate(this.a, s + 1, (int) (j2 - S));
                }
                ChronoField.YEAR.D(this.a + 1);
                return new LocalDate(this.a + 1, 1, (int) (j2 - S));
            }
        }
        return ofEpochDay(j$.com.android.tools.r8.a.R(toEpochDay(), j));
    }

    public final LocalDate Y(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        ChronoField chronoField = ChronoField.YEAR;
        long j3 = 12;
        return b0(chronoField.b.a(j$.com.android.tools.r8.a.W(j2, j3), chronoField), ((int) j$.com.android.tools.r8.a.V(j2, j3)) + 1, this.c);
    }

    public final LocalDate Z(long j) {
        return X(j$.com.android.tools.r8.a.X(j, 7));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.j a() {
        return j$.time.chrono.q.c;
    }

    public final LocalDate a0(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return b0(chronoField.b.a(this.a + j, chronoField), this.b, this.c);
    }

    @Override // j$.time.temporal.l
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final LocalDate c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalDate) temporalField.B(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.D(j);
        switch (e.a[chronoField.ordinal()]) {
            case 1:
                int i = (int) j;
                if (this.c != i) {
                    return of(this.a, this.b, i);
                }
                return this;
            case 2:
                int i2 = (int) j;
                if (Q() != i2) {
                    return V(this.a, i2);
                }
                return this;
            case 3:
                return Z(j - B(ChronoField.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.a < 1) {
                    j = 1 - j;
                }
                return e0((int) j);
            case 5:
                return X(j - getDayOfWeek().getValue());
            case 6:
                return X(j - B(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return X(j - B(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return ofEpochDay(j);
            case 9:
                return Z(j - B(ChronoField.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i3 = (int) j;
                if (this.b != i3) {
                    ChronoField.MONTH_OF_YEAR.D(i3);
                    return b0(this.a, i3, this.c);
                }
                return this;
            case 11:
                return Y(j - (((this.a * 12) + this.b) - 1));
            case 12:
                return e0((int) j);
            case 13:
                if (B(ChronoField.ERA) != j) {
                    return e0(1 - this.a);
                }
                return this;
            default:
                throw new DateTimeException(b.a("Unsupported field: ", temporalField));
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public int compareTo(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? M((LocalDate) chronoLocalDate) : j$.com.android.tools.r8.a.f(this, chronoLocalDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: d0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate w(j$.time.temporal.m mVar) {
        return mVar instanceof LocalDate ? (LocalDate) mVar : (LocalDate) mVar.n(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.s(this, temporalField);
    }

    public final LocalDate e0(int i) {
        if (this.a == i) {
            return this;
        }
        ChronoField.YEAR.D(i);
        return b0(i, this.b, this.c);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && M((LocalDate) obj) == 0;
    }

    public int getDayOfMonth() {
        return this.c;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.M(((int) j$.com.android.tools.r8.a.V(toEpochDay() + 3, 7)) + 1);
    }

    public Month getMonth() {
        return Month.P(this.b);
    }

    public int getYear() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? P(temporalField) : j$.time.temporal.p.a(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.j(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (!chronoField.isDateBased()) {
            throw new DateTimeException(b.a("Unsupported field: ", temporalField));
        }
        int i = e.a[chronoField.ordinal()];
        if (i == 1) {
            return j$.time.temporal.s.f(1L, S());
        }
        if (i == 2) {
            return j$.time.temporal.s.f(1L, J());
        }
        if (i != 3) {
            return i != 4 ? chronoField.b : getYear() <= 0 ? j$.time.temporal.s.f(1L, 1000000000L) : j$.time.temporal.s.f(1L, 999999999L);
        }
        return j$.time.temporal.s.f(1L, (getMonth() != Month.FEBRUARY || p()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        return j$.com.android.tools.r8.a.a(this, lVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean p() {
        return j$.time.chrono.q.c.K(this.a);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.c - 1);
        if (j2 > 2) {
            j4 = !p() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        int i = this.a;
        short s = this.b;
        short s2 = this.c;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + ModuleDescriptor.MODULE_VERSION);
            sb.deleteCharAt(0);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }
}
