package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class v extends c {
    public static final LocalDate d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient LocalDate a;
    public final transient w b;
    public final transient int c;

    public v(LocalDate localDate) {
        if (localDate.R(d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        w h = w.h(localDate);
        this.b = h;
        this.c = (localDate.getYear() - h.b.getYear()) + 1;
        this.a = localDate;
    }

    public v(w wVar, int i, LocalDate localDate) {
        if (localDate.R(d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        this.b = wVar;
        this.c = i;
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new c0((byte) 4, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long B(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        switch (u.a[((ChronoField) temporalField).ordinal()]) {
            case 2:
                return this.c == 1 ? (this.a.Q() - this.b.b.Q()) + 1 : this.a.Q();
            case 3:
                return this.c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new DateTimeException(j$.time.b.a("Unsupported field: ", temporalField));
            case 8:
                return this.b.a;
            default:
                return this.a.B(temporalField);
        }
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime C(LocalTime localTime) {
        return new e(this, localTime);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final k E() {
        return this.b;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate G(j$.time.temporal.o oVar) {
        return (v) super.G(oVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int J() {
        w l = this.b.l();
        int J = (l == null || l.b.getYear() != this.a.getYear()) ? this.a.J() : l.b.Q() - 1;
        return this.c == 1 ? J - (this.b.b.Q() - 1) : J;
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate N(long j) {
        return T(this.a.X(j));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate O(long j) {
        return T(this.a.Y(j));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate P(long j) {
        return T(this.a.a0(j));
    }

    public final v Q(long j, j$.time.temporal.a aVar) {
        return (v) super.d(j, (j$.time.temporal.q) aVar);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.l
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final v c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (v) super.c(j, temporalField);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (B(chronoField) == j) {
            return this;
        }
        int[] iArr = u.a;
        int i = iArr[chronoField.ordinal()];
        if (i == 3 || i == 8 || i == 9) {
            t tVar = t.c;
            int a = tVar.q(chronoField).a(j, chronoField);
            int i2 = iArr[chronoField.ordinal()];
            if (i2 == 3) {
                return T(this.a.e0(tVar.u(this.b, a)));
            }
            if (i2 == 8) {
                return T(this.a.e0(tVar.u(w.m(a), this.c)));
            }
            if (i2 == 9) {
                return T(this.a.e0(a));
            }
        }
        return T(this.a.c(j, temporalField));
    }

    public final v S(j$.time.d dVar) {
        return (v) super.w(dVar);
    }

    public final v T(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new v(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j a() {
        return t.c;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate d(long j, j$.time.temporal.q qVar) {
        return (v) super.d(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.l
    public final j$.time.temporal.l d(long j, j$.time.temporal.q qVar) {
        return (v) super.d(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH || temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR || temporalField == ChronoField.ALIGNED_WEEK_OF_MONTH || temporalField == ChronoField.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).isDateBased() : temporalField != null && temporalField.i(this);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.a.equals(((v) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        t.c.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(LocalDate localDate) {
        return (v) super.w(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.j(this);
        }
        if (!e(temporalField)) {
            throw new DateTimeException(j$.time.b.a("Unsupported field: ", temporalField));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = u.a[chronoField.ordinal()];
        if (i == 1) {
            return j$.time.temporal.s.f(1L, this.a.S());
        }
        if (i == 2) {
            return j$.time.temporal.s.f(1L, J());
        }
        if (i != 3) {
            return t.c.q(chronoField);
        }
        int year = this.b.b.getYear();
        return this.b.l() != null ? j$.time.temporal.s.f(1L, (r0.b.getYear() - year) + 1) : j$.time.temporal.s.f(1L, 999999999 - year);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    /* renamed from: r */
    public final ChronoLocalDate x(long j, j$.time.temporal.q qVar) {
        return (v) super.x(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate w(j$.time.temporal.m mVar) {
        return (v) super.w(mVar);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.l
    public final j$.time.temporal.l x(long j, j$.time.temporal.a aVar) {
        return (v) super.x(j, aVar);
    }
}
