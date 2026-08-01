package j$.time;

import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class p implements j$.time.temporal.l, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    public final int a;

    static {
        new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).toFormatter();
    }

    public p(int i) {
        this.a = i;
    }

    public static p M(int i) {
        ChronoField.YEAR.D(i);
        return new p(i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 11, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long B(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        int i = o.a[((ChronoField) temporalField).ordinal()];
        if (i == 1) {
            int i2 = this.a;
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return this.a;
        }
        if (i == 3) {
            return this.a < 1 ? 0 : 1;
        }
        throw new DateTimeException(b.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.p.b ? j$.time.chrono.q.c : temporalQuery == j$.time.temporal.p.c ? j$.time.temporal.a.YEARS : j$.time.temporal.p.c(this, temporalQuery);
    }

    @Override // j$.time.temporal.l
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final p d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (p) qVar.i(this, j);
        }
        int i = o.b[((j$.time.temporal.a) qVar).ordinal()];
        if (i == 1) {
            return O(j);
        }
        if (i == 2) {
            return O(j$.com.android.tools.r8.a.X(j, 10));
        }
        if (i == 3) {
            return O(j$.com.android.tools.r8.a.X(j, 100));
        }
        if (i == 4) {
            return O(j$.com.android.tools.r8.a.X(j, 1000));
        }
        if (i == 5) {
            ChronoField chronoField = ChronoField.ERA;
            return c(j$.com.android.tools.r8.a.R(B(chronoField), j), chronoField);
        }
        throw new DateTimeException("Unsupported unit: " + qVar);
    }

    public final p O(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return M(chronoField.b.a(this.a + j, chronoField));
    }

    @Override // j$.time.temporal.l
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final p c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (p) temporalField.B(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.D(j);
        int i = o.a[chronoField.ordinal()];
        if (i == 1) {
            if (this.a < 1) {
                j = 1 - j;
            }
            return M((int) j);
        }
        if (i == 2) {
            return M((int) j);
        }
        if (i == 3) {
            return B(ChronoField.ERA) == j ? this : M(1 - this.a);
        }
        throw new DateTimeException(b.a("Unsupported field: ", temporalField));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((p) obj).a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.i(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.a == ((p) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(TemporalField temporalField) {
        return k(temporalField).a(B(temporalField), temporalField);
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(LocalDate localDate) {
        localDate.getClass();
        return (p) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return j$.time.temporal.s.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.p.d(this, temporalField);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        if (!j$.com.android.tools.r8.a.P(lVar).equals(j$.time.chrono.q.c)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return lVar.c(this.a, ChronoField.YEAR);
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l x(long j, j$.time.temporal.a aVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, aVar).d(1L, aVar) : d(-j, aVar);
    }
}
