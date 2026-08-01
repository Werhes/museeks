package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class a0 extends c {
    private static final long serialVersionUID = 1300372329181994526L;
    public final transient LocalDate a;

    public a0(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new c0((byte) 7, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long B(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        int i = z.a[((ChronoField) temporalField).ordinal()];
        if (i == 4) {
            int Q = Q();
            if (Q < 1) {
                Q = 1 - Q;
            }
            return Q;
        }
        if (i == 5) {
            return ((Q() * 12) + this.a.b) - 1;
        }
        if (i == 6) {
            return Q();
        }
        if (i != 7) {
            return this.a.B(temporalField);
        }
        return Q() < 1 ? 0 : 1;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime C(LocalTime localTime) {
        return new e(this, localTime);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final k E() {
        return Q() >= 1 ? b0.ROC : b0.BEFORE_ROC;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate G(j$.time.temporal.o oVar) {
        return (a0) super.G(oVar);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate N(long j) {
        return S(this.a.X(j));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate O(long j) {
        return S(this.a.Y(j));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate P(long j) {
        return S(this.a.a0(j));
    }

    public final int Q() {
        return this.a.getYear() - 1911;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // j$.time.chrono.c, j$.time.temporal.l
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.chrono.a0 c(long r8, j$.time.temporal.TemporalField r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof j$.time.temporal.ChronoField
            if (r0 == 0) goto L9f
            r0 = r10
            j$.time.temporal.ChronoField r0 = (j$.time.temporal.ChronoField) r0
            long r1 = r7.B(r0)
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto L10
            return r7
        L10:
            int[] r1 = j$.time.chrono.z.a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            if (r2 == r5) goto L49
            r6 = 5
            if (r2 == r6) goto L25
            if (r2 == r4) goto L49
            if (r2 == r3) goto L49
            goto L5f
        L25:
            j$.time.chrono.y r10 = j$.time.chrono.y.c
            j$.time.temporal.s r10 = r10.q(r0)
            r10.b(r8, r0)
            int r10 = r7.Q()
            long r0 = (long) r10
            r2 = 12
            long r0 = r0 * r2
            j$.time.LocalDate r10 = r7.a
            short r2 = r10.b
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 1
            long r0 = r0 - r2
            long r8 = r8 - r0
            j$.time.LocalDate r8 = r10.Y(r8)
            j$.time.chrono.a0 r8 = r7.S(r8)
            return r8
        L49:
            j$.time.chrono.y r2 = j$.time.chrono.y.c
            j$.time.temporal.s r2 = r2.q(r0)
            int r2 = r2.a(r8, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L88
            if (r0 == r4) goto L7b
            if (r0 == r3) goto L6a
        L5f:
            j$.time.LocalDate r0 = r7.a
            j$.time.LocalDate r8 = r0.c(r8, r10)
            j$.time.chrono.a0 r8 = r7.S(r8)
            return r8
        L6a:
            j$.time.LocalDate r8 = r7.a
            int r9 = r7.Q()
            int r9 = 1912 - r9
            j$.time.LocalDate r8 = r8.e0(r9)
            j$.time.chrono.a0 r8 = r7.S(r8)
            return r8
        L7b:
            j$.time.LocalDate r8 = r7.a
            int r2 = r2 + 1911
            j$.time.LocalDate r8 = r8.e0(r2)
            j$.time.chrono.a0 r8 = r7.S(r8)
            return r8
        L88:
            j$.time.LocalDate r8 = r7.a
            int r9 = r7.Q()
            r10 = 1
            if (r9 < r10) goto L94
            int r2 = r2 + 1911
            goto L96
        L94:
            int r2 = 1912 - r2
        L96:
            j$.time.LocalDate r8 = r8.e0(r2)
            j$.time.chrono.a0 r8 = r7.S(r8)
            return r8
        L9f:
            j$.time.chrono.ChronoLocalDate r8 = super.c(r8, r10)
            j$.time.chrono.a0 r8 = (j$.time.chrono.a0) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.a0.c(long, j$.time.temporal.TemporalField):j$.time.chrono.a0");
    }

    public final a0 S(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new a0(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j a() {
        return y.c;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate d(long j, j$.time.temporal.q qVar) {
        return (a0) super.d(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.l
    public final j$.time.temporal.l d(long j, j$.time.temporal.q qVar) {
        return (a0) super.d(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            return this.a.equals(((a0) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        y.c.getClass();
        return this.a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(LocalDate localDate) {
        return (a0) super.w(localDate);
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
        int i = z.a[chronoField.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.k(temporalField);
        }
        if (i != 4) {
            return y.c.q(chronoField);
        }
        j$.time.temporal.s sVar = ChronoField.YEAR.b;
        return j$.time.temporal.s.f(1L, Q() <= 0 ? (-sVar.a) + 1912 : sVar.d - 1911);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    /* renamed from: r */
    public final ChronoLocalDate x(long j, j$.time.temporal.q qVar) {
        return (a0) super.x(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate w(j$.time.temporal.m mVar) {
        return (a0) super.w(mVar);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.l
    public final j$.time.temporal.l x(long j, j$.time.temporal.a aVar) {
        return (a0) super.x(j, aVar);
    }
}
