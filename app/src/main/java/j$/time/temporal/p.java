package j$.time.temporal;

import j$.time.DateTimeException;
import j$.util.Objects;

/* loaded from: classes2.dex */
public abstract class p {
    public static final j$.time.d a = new j$.time.d(7);
    public static final j$.time.d b = new j$.time.d(8);
    public static final j$.time.d c = new j$.time.d(9);
    public static final j$.time.d d = new j$.time.d(10);
    public static final j$.time.d e = new j$.time.d(11);
    public static final j$.time.d f = new j$.time.d(12);
    public static final j$.time.d g = new j$.time.d(13);

    public static int a(TemporalAccessor temporalAccessor, TemporalField temporalField) {
        s k = temporalAccessor.k(temporalField);
        if (!k.d()) {
            throw new DateTimeException("Invalid field " + temporalField + " for get() method, use getLong() instead");
        }
        long B = temporalAccessor.B(temporalField);
        if (k.e(B)) {
            return (int) B;
        }
        throw new DateTimeException("Invalid value for " + temporalField + " (valid values " + k + "): " + B);
    }

    public static l b(l lVar, long j, q qVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            lVar = lVar.d(Long.MAX_VALUE, qVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return lVar.d(j2, qVar);
    }

    public static Object c(TemporalAccessor temporalAccessor, TemporalQuery temporalQuery) {
        if (temporalQuery == a || temporalQuery == b || temporalQuery == c) {
            return null;
        }
        return temporalQuery.queryFrom(temporalAccessor);
    }

    public static s d(TemporalAccessor temporalAccessor, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            Objects.requireNonNull(temporalField, "field");
            return temporalField.j(temporalAccessor);
        }
        if (temporalAccessor.e(temporalField)) {
            return ((ChronoField) temporalField).b;
        }
        throw new DateTimeException(j$.time.b.a("Unsupported field: ", temporalField));
    }

    public static /* synthetic */ int e(int i) {
        int i2 = i % 7;
        if (i2 == 0) {
            return 0;
        }
        return (((i ^ 7) >> 31) | 1) > 0 ? i2 : i2 + 7;
    }
}
