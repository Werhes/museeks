package j$.time;

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
public final class Instant implements j$.time.temporal.l, j$.time.temporal.m, Comparable<Instant>, Serializable {
    public static final Instant c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;

    static {
        ofEpochSecond(-31557014167219200L, 0L);
        ofEpochSecond(31556889864403199L, 999999999L);
    }

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Instant M(long j, int i) {
        if ((i | j) == 0) {
            return c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public static Instant N(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.B(ChronoField.INSTANT_SECONDS), temporalAccessor.i(ChronoField.NANO_OF_SECOND));
        } catch (DateTimeException e) {
            throw new RuntimeException("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static Instant now() {
        a.b.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long j = 1000;
        return M(j$.com.android.tools.r8.a.W(currentTimeMillis, j), ((int) j$.com.android.tools.r8.a.V(currentTimeMillis, j)) * 1000000);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return M(j$.com.android.tools.r8.a.R(j, j$.com.android.tools.r8.a.W(j2, 1000000000L)), (int) j$.com.android.tools.r8.a.V(j2, 1000000000L));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 2, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long B(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        int i2 = c.a[((ChronoField) temporalField).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else if (i2 == 2) {
            i = this.b / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new DateTimeException(b.a("Unsupported field: ", temporalField));
            }
            i = this.b / 1000000;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.c) {
            return j$.time.temporal.a.NANOS;
        }
        if (temporalQuery == j$.time.temporal.p.b || temporalQuery == j$.time.temporal.p.a || temporalQuery == j$.time.temporal.p.e || temporalQuery == j$.time.temporal.p.d || temporalQuery == j$.time.temporal.p.f || temporalQuery == j$.time.temporal.p.g) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    public final Instant O(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(j$.com.android.tools.r8.a.R(j$.com.android.tools.r8.a.R(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.l
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final Instant d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (Instant) qVar.i(this, j);
        }
        switch (c.b[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return O(0L, j);
            case 2:
                return O(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return O(j / 1000, (j % 1000) * 1000000);
            case 4:
                return O(j, 0L);
            case 5:
                return O(j$.com.android.tools.r8.a.X(j, 60), 0L);
            case 6:
                return O(j$.com.android.tools.r8.a.X(j, 3600), 0L);
            case 7:
                return O(j$.com.android.tools.r8.a.X(j, 43200), 0L);
            case 8:
                return O(j$.com.android.tools.r8.a.X(j, 86400), 0L);
            default:
                throw new DateTimeException("Unsupported unit: " + qVar);
        }
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.M(this, zoneOffset);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (Instant) temporalField.B(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.D(j);
        int i = c.a[chronoField.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i2 = ((int) j) * 1000;
                if (i2 != this.b) {
                    return M(this.a, i2);
                }
            } else if (i == 3) {
                int i3 = ((int) j) * 1000000;
                if (i3 != this.b) {
                    return M(this.a, i3);
                }
            } else {
                if (i != 4) {
                    throw new DateTimeException(b.a("Unsupported field: ", temporalField));
                }
                if (j != this.a) {
                    return M(j, this.b);
                }
            }
        } else if (j != this.b) {
            return M(this.a, (int) j);
        }
        return this;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int compare = Long.compare(this.a, instant2.a);
        return compare != 0 ? compare : this.b - instant2.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.NANO_OF_SECOND || temporalField == ChronoField.MICRO_OF_SECOND || temporalField == ChronoField.MILLI_OF_SECOND : temporalField != null && temporalField.i(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return j$.time.temporal.p.d(this, temporalField).a(temporalField.x(this), temporalField);
        }
        int i = c.a[((ChronoField) temporalField).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.b / 1000;
        }
        if (i == 3) {
            return this.b / 1000000;
        }
        if (i == 4) {
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            chronoField.b.a(this.a, chronoField);
        }
        throw new DateTimeException(b.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(LocalDate localDate) {
        localDate.getClass();
        return (Instant) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(TemporalField temporalField) {
        return j$.time.temporal.p.d(this, temporalField);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        return lVar.c(this.a, ChronoField.INSTANT_SECONDS).c(this.b, ChronoField.NANO_OF_SECOND);
    }

    public long toEpochMilli() {
        long j = this.a;
        return (j >= 0 || this.b <= 0) ? j$.com.android.tools.r8.a.R(j$.com.android.tools.r8.a.X(j, 1000), this.b / 1000000) : j$.com.android.tools.r8.a.R(j$.com.android.tools.r8.a.X(j + 1, 1000), (this.b / 1000000) - 1000);
    }

    public final String toString() {
        return DateTimeFormatter.h.format(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l x(long j, j$.time.temporal.a aVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, aVar).d(1L, aVar) : d(-j, aVar);
    }
}
