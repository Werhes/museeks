package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class c implements ChronoLocalDate, j$.time.temporal.l, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public static ChronoLocalDate M(j jVar, j$.time.temporal.l lVar) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) lVar;
        if (jVar.equals(chronoLocalDate.a())) {
            return chronoLocalDate;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + jVar.getId() + ", actual: " + chronoLocalDate.a().getId());
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public ChronoLocalDateTime C(LocalTime localTime) {
        return new e(this, localTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object D(TemporalQuery temporalQuery) {
        return j$.com.android.tools.r8.a.v(this, temporalQuery);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public k E() {
        return a().t(j$.time.temporal.p.a(this, ChronoField.ERA));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public ChronoLocalDate G(j$.time.temporal.o oVar) {
        return M(a(), oVar.i(this));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int J() {
        return p() ? 366 : 365;
    }

    public abstract ChronoLocalDate N(long j);

    public abstract ChronoLocalDate O(long j);

    public abstract ChronoLocalDate P(long j);

    @Override // j$.time.temporal.l
    public ChronoLocalDate c(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            throw new DateTimeException(j$.time.b.a("Unsupported field: ", temporalField));
        }
        return M(a(), temporalField.B(this, j));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoLocalDate chronoLocalDate) {
        return j$.com.android.tools.r8.a.f(this, chronoLocalDate);
    }

    @Override // j$.time.temporal.l
    public ChronoLocalDate d(long j, j$.time.temporal.q qVar) {
        boolean z = qVar instanceof j$.time.temporal.a;
        if (!z) {
            if (!z) {
                return M(a(), qVar.i(this, j));
            }
            throw new DateTimeException("Unsupported unit: " + qVar);
        }
        switch (b.a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return N(j);
            case 2:
                return N(j$.com.android.tools.r8.a.X(j, 7));
            case 3:
                return O(j);
            case 4:
                return P(j);
            case 5:
                return P(j$.com.android.tools.r8.a.X(j, 10));
            case 6:
                return P(j$.com.android.tools.r8.a.X(j, 100));
            case 7:
                return P(j$.com.android.tools.r8.a.X(j, 1000));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return c(j$.com.android.tools.r8.a.R(B(chronoField), j), (TemporalField) chronoField);
            default:
                throw new DateTimeException("Unsupported unit: " + qVar);
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public /* synthetic */ boolean e(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.s(this, temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDate) && j$.com.android.tools.r8.a.f(this, (ChronoLocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long epochDay = toEpochDay();
        return ((int) (epochDay ^ (epochDay >>> 32))) ^ a().hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int i(TemporalField temporalField) {
        return j$.time.temporal.p.a(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.s k(TemporalField temporalField) {
        return j$.time.temporal.p.d(this, temporalField);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ j$.time.temporal.l n(j$.time.temporal.l lVar) {
        return j$.com.android.tools.r8.a.a(this, lVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean p() {
        return a().K(B(ChronoField.YEAR));
    }

    @Override // j$.time.temporal.l
    /* renamed from: r */
    public ChronoLocalDate x(long j, j$.time.temporal.q qVar) {
        return M(a(), j$.time.temporal.p.b(this, j, qVar));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        return B(ChronoField.EPOCH_DAY);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final String toString() {
        long B = B(ChronoField.YEAR_OF_ERA);
        long B2 = B(ChronoField.MONTH_OF_YEAR);
        long B3 = B(ChronoField.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(a().toString());
        sb.append(" ");
        sb.append(E());
        sb.append(" ");
        sb.append(B);
        sb.append(B2 < 10 ? "-0" : "-");
        sb.append(B2);
        sb.append(B3 < 10 ? "-0" : "-");
        sb.append(B3);
        return sb.toString();
    }

    @Override // j$.time.temporal.l
    public ChronoLocalDate w(j$.time.temporal.m mVar) {
        return M(a(), mVar.n(this));
    }
}
