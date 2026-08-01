package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.format.c0;
import j$.time.format.d0;
import java.util.Map;

/* loaded from: classes2.dex */
public enum j implements TemporalField {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient s b;
    public final transient long c;

    static {
        a aVar = a.NANOS;
    }

    j(String str, long j) {
        this.a = str;
        this.b = s.f((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    @Override // j$.time.temporal.TemporalField
    public final l B(l lVar, long j) {
        if (this.b.e(j)) {
            return lVar.c(j$.com.android.tools.r8.a.Y(j, this.c), ChronoField.EPOCH_DAY);
        }
        throw new DateTimeException("Invalid value: " + this.a + " " + j);
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean i(TemporalAccessor temporalAccessor) {
        return temporalAccessor.e(ChronoField.EPOCH_DAY);
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.TemporalField
    public final s j(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.e(ChronoField.EPOCH_DAY)) {
            return this.b;
        }
        throw new DateTimeException("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor k(Map map, c0 c0Var, d0 d0Var) {
        long longValue = ((Long) map.remove(this)).longValue();
        j$.time.chrono.j P = j$.com.android.tools.r8.a.P(c0Var);
        d0 d0Var2 = d0.LENIENT;
        long j = this.c;
        if (d0Var == d0Var2) {
            return P.h(j$.com.android.tools.r8.a.Y(longValue, j));
        }
        this.b.b(longValue, this);
        return P.h(longValue - j);
    }

    @Override // j$.time.temporal.TemporalField
    public final s n() {
        return this.b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalField
    public final long x(TemporalAccessor temporalAccessor) {
        return temporalAccessor.B(ChronoField.EPOCH_DAY) + this.c;
    }
}
