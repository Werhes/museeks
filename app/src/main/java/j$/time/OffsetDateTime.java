package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.l, j$.time.temporal.m, Comparable<OffsetDateTime>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 2287754244819255394L;
    public final LocalDateTime a;
    public final ZoneOffset b;

    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.a = (LocalDateTime) Objects.requireNonNull(localDateTime, "dateTime");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public static OffsetDateTime M(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset d = zoneId.getRules().d(instant);
        return new OffsetDateTime(LocalDateTime.P(instant.getEpochSecond(), instant.getNano(), d), d);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 10, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long B(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        int i = k.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.B(temporalField) : this.b.getTotalSeconds();
        }
        LocalDateTime localDateTime = this.a;
        ZoneOffset zoneOffset = this.b;
        localDateTime.getClass();
        return j$.com.android.tools.r8.a.z(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.d || temporalQuery == j$.time.temporal.p.e) {
            return this.b;
        }
        if (temporalQuery == j$.time.temporal.p.a) {
            return null;
        }
        return temporalQuery == j$.time.temporal.p.f ? this.a.a : temporalQuery == j$.time.temporal.p.g ? this.a.b : temporalQuery == j$.time.temporal.p.b ? j$.time.chrono.q.c : temporalQuery == j$.time.temporal.p.c ? j$.time.temporal.a.NANOS : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime d(long j, j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? O(this.a.d(j, qVar), this.b) : (OffsetDateTime) qVar.i(this, j);
    }

    public final OffsetDateTime O(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (OffsetDateTime) temporalField.B(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = k.a[chronoField.ordinal()];
        return i != 1 ? i != 2 ? O(this.a.c(j, temporalField), this.b) : O(this.a, ZoneOffset.ofTotalSeconds(chronoField.b.a(j, chronoField))) : M(Instant.ofEpochSecond(j, this.a.b.d), this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int compare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.b.equals(offsetDateTime2.b)) {
            compare = toLocalDateTime().compareTo((ChronoLocalDateTime<?>) offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.a;
            ZoneOffset zoneOffset = this.b;
            localDateTime.getClass();
            long z = j$.com.android.tools.r8.a.z(localDateTime, zoneOffset);
            LocalDateTime localDateTime2 = offsetDateTime2.a;
            ZoneOffset zoneOffset2 = offsetDateTime2.b;
            localDateTime2.getClass();
            compare = Long.compare(z, j$.com.android.tools.r8.a.z(localDateTime2, zoneOffset2));
            if (compare == 0) {
                compare = this.a.b.d - offsetDateTime2.a.b.d;
            }
        }
        return compare == 0 ? toLocalDateTime().compareTo((ChronoLocalDateTime<?>) offsetDateTime2.toLocalDateTime()) : compare;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.i(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return j$.time.temporal.p.a(this, temporalField);
        }
        int i = k.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.i(temporalField) : this.b.getTotalSeconds();
        }
        throw new DateTimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(LocalDate localDate) {
        if (b.b(localDate)) {
            return O(this.a.w(localDate), this.b);
        }
        localDate.getClass();
        return (OffsetDateTime) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) ? ((ChronoField) temporalField).b : this.a.k(temporalField) : temporalField.j(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        return lVar.c(this.a.a.toEpochDay(), ChronoField.EPOCH_DAY).c(this.a.b.W(), ChronoField.NANO_OF_DAY).c(this.b.getTotalSeconds(), ChronoField.OFFSET_SECONDS);
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l x(long j, j$.time.temporal.a aVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, aVar).d(1L, aVar) : d(-j, aVar);
    }
}
