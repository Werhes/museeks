package j$.time;

import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class j implements TemporalAccessor, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = -939150713474957432L;
    public final int a;
    public final int b;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.d("--");
        dateTimeFormatterBuilder.appendValue(ChronoField.MONTH_OF_YEAR, 2).appendLiteral('-').appendValue(ChronoField.DAY_OF_MONTH, 2).toFormatter();
    }

    public j(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 13, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long B(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        int i2 = i.a[((ChronoField) temporalField).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new DateTimeException(b.a("Unsupported field: ", temporalField));
            }
            i = this.a;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.p.b ? j$.time.chrono.q.c : j$.time.temporal.p.c(this, temporalQuery);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j jVar = (j) obj;
        int i = this.a - jVar.a;
        return i == 0 ? this.b - jVar.b : i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.DAY_OF_MONTH : temporalField != null && temporalField.i(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.a == jVar.a && this.b == jVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(TemporalField temporalField) {
        return k(temporalField).a(B(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return temporalField.n();
        }
        if (temporalField != ChronoField.DAY_OF_MONTH) {
            return j$.time.temporal.p.d(this, temporalField);
        }
        Month P = Month.P(this.a);
        P.getClass();
        int i = h.a[P.ordinal()];
        return j$.time.temporal.s.g(1L, i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : 28, Month.P(this.a).O());
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        if (!j$.com.android.tools.r8.a.P(lVar).equals(j$.time.chrono.q.c)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        j$.time.temporal.l c2 = lVar.c(this.a, ChronoField.MONTH_OF_YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return c2.c(Math.min(c2.k(chronoField).d, this.b), chronoField);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.a < 10 ? "0" : BuildConfig.FLAVOR);
        sb.append(this.a);
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }
}
