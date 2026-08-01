package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o extends c {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient m a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    public o(m mVar, int i, int i2, int i3) {
        mVar.P(i, i2, i3);
        this.a = mVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public o(m mVar, long j) {
        int i = (int) j;
        mVar.M();
        if (i < mVar.e || i >= mVar.f) {
            throw new DateTimeException("Hijrah date out of range");
        }
        int binarySearch = Arrays.binarySearch(mVar.d, i);
        binarySearch = binarySearch < 0 ? (-binarySearch) - 2 : binarySearch;
        int[] iArr = {mVar.O(binarySearch), ((mVar.g + binarySearch) % 12) + 1, (i - mVar.d[binarySearch]) + 1};
        this.a = mVar;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new c0((byte) 6, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long B(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        switch (n.a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                return Q();
            case 3:
                return ((this.d - 1) / 7) + 1;
            case 4:
                return ((int) j$.com.android.tools.r8.a.V(toEpochDay() + 3, 7)) + 1;
            case 5:
                return ((this.d - 1) % 7) + 1;
            case 6:
                return ((Q() - 1) % 7) + 1;
            case 7:
                return toEpochDay();
            case 8:
                return ((Q() - 1) / 7) + 1;
            case 9:
                return this.c;
            case 10:
                return ((this.b * 12) + this.c) - 1;
            case 11:
                return this.b;
            case 12:
                return this.b;
            case 13:
                return this.b <= 1 ? 0 : 1;
            default:
                throw new DateTimeException(j$.time.b.a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime C(LocalTime localTime) {
        return new e(this, localTime);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final k E() {
        return p.AH;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate G(j$.time.temporal.o oVar) {
        return (o) super.G(oVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int J() {
        return this.a.S(this.b, 12);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate P(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.b + ((int) j);
        int i = (int) j2;
        if (j2 == i) {
            return T(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    public final int Q() {
        return this.a.S(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.c
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final o N(long j) {
        return new o(this.a, toEpochDay() + j);
    }

    @Override // j$.time.chrono.c
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final o O(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        m mVar = this.a;
        long W = j$.com.android.tools.r8.a.W(j2, 12L);
        if (W >= mVar.O(0) && W <= mVar.O(mVar.d.length - 1) - 1) {
            return T((int) W, ((int) j$.com.android.tools.r8.a.V(j2, 12L)) + 1, this.d);
        }
        throw new DateTimeException("Invalid Hijrah year: " + W);
    }

    public final o T(int i, int i2, int i3) {
        int Q = this.a.Q(i, i2);
        if (i3 > Q) {
            i3 = Q;
        }
        return new o(this.a, i, i2, i3);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.l
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final o c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (o) super.c(j, temporalField);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        this.a.q(chronoField).b(j, chronoField);
        int i = (int) j;
        switch (n.a[chronoField.ordinal()]) {
            case 1:
                return T(this.b, this.c, i);
            case 2:
                return N(Math.min(i, J()) - Q());
            case 3:
                return N((j - B(ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return N(j - (((int) j$.com.android.tools.r8.a.V(toEpochDay() + 3, 7)) + 1));
            case 5:
                return N(j - B(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return N(j - B(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new o(this.a, j);
            case 8:
                return N((j - B(ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return T(this.b, i, this.d);
            case 10:
                return O(j - (((this.b * 12) + this.c) - 1));
            case 11:
                if (this.b < 1) {
                    i = 1 - i;
                }
                return T(i, this.c, this.d);
            case 12:
                return T(i, this.c, this.d);
            case 13:
                return T(1 - this.b, this.c, this.d);
            default:
                throw new DateTimeException(j$.time.b.a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j a() {
        return this.a;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate d(long j, j$.time.temporal.q qVar) {
        return (o) super.d(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.l
    public final j$.time.temporal.l d(long j, j$.time.temporal.q qVar) {
        return (o) super.d(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.b == oVar.b && this.c == oVar.c && this.d == oVar.d && this.a.equals(oVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        this.a.getClass();
        return (((i << 11) + (i2 << 6)) + i3) ^ ((i & (-2048)) ^ 2100100019);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(LocalDate localDate) {
        return (o) super.w(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.j(this);
        }
        if (!j$.com.android.tools.r8.a.s(this, temporalField)) {
            throw new DateTimeException(j$.time.b.a("Unsupported field: ", temporalField));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = n.a[chronoField.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? this.a.q(chronoField) : j$.time.temporal.s.f(1L, 5L) : j$.time.temporal.s.f(1L, J()) : j$.time.temporal.s.f(1L, this.a.Q(this.b, this.c));
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean p() {
        return this.a.K(this.b);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    /* renamed from: r */
    public final ChronoLocalDate x(long j, j$.time.temporal.q qVar) {
        return (o) super.x(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.a.P(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate w(j$.time.temporal.m mVar) {
        return (o) super.w(mVar);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.l
    public final j$.time.temporal.l x(long j, j$.time.temporal.a aVar) {
        return (o) super.x(j, aVar);
    }
}
