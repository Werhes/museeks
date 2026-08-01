package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class ZonedDateTime implements j$.time.temporal.l, ChronoZonedDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final LocalDateTime a;
    public final ZoneOffset b;
    public final ZoneId c;

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    public static ZonedDateTime M(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        List f = rules.f(localDateTime);
        if (f.size() == 1) {
            zoneOffset = (ZoneOffset) f.get(0);
        } else if (f.size() == 0) {
            Object e = rules.e(localDateTime);
            j$.time.zone.b bVar = e instanceof j$.time.zone.b ? (j$.time.zone.b) e : null;
            localDateTime = localDateTime.R(Duration.j(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds(), 0).getSeconds());
            zoneOffset = bVar.d;
        } else if (zoneOffset == null || !f.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) Objects.requireNonNull((ZoneOffset) f.get(0), "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime n(long j, int i, ZoneId zoneId) {
        ZoneOffset d = zoneId.getRules().d(Instant.ofEpochSecond(j, i));
        return new ZonedDateTime(LocalDateTime.P(j, i, d), zoneId, d);
    }

    public static ZonedDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (ZonedDateTime) dateTimeFormatter.parse(charSequence, new d(4));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 6, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long B(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        int i = t.a[((ChronoField) temporalField).ordinal()];
        return i != 1 ? i != 2 ? this.a.B(temporalField) : this.b.getTotalSeconds() : j$.com.android.tools.r8.a.A(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.p.f ? this.a.a : j$.com.android.tools.r8.a.x(this, temporalQuery);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long L() {
        return j$.com.android.tools.r8.a.A(this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (ZonedDateTime) qVar.i(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        if (aVar.compareTo(j$.time.temporal.a.DAYS) >= 0 && aVar != j$.time.temporal.a.FOREVER) {
            return M(this.a.d(j, qVar), this.c, this.b);
        }
        LocalDateTime d = this.a.d(j, qVar);
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        Objects.requireNonNull(d, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId.getRules().f(d).contains(zoneOffset)) {
            return new ZonedDateTime(d, zoneId, zoneOffset);
        }
        d.getClass();
        return n(j$.com.android.tools.r8.a.z(d, zoneOffset), d.b.d, zoneId);
    }

    public final ZonedDateTime O(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.b) || !this.c.getRules().f(this.a).contains(zoneOffset)) ? this : new ZonedDateTime(this.a, this.c, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.j a() {
        return ((LocalDate) f()).a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final LocalTime b() {
        return this.a.b;
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (ZonedDateTime) temporalField.B(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = t.a[chronoField.ordinal()];
        return i != 1 ? i != 2 ? M(this.a.c(j, temporalField), this.c, this.b) : O(ZoneOffset.ofTotalSeconds(chronoField.b.a(j, chronoField))) : n(j, this.a.b.d, this.c);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return j$.com.android.tools.r8.a.h(this, chronoZonedDateTime);
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
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDate f() {
        return this.a.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset g() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public ZoneId getZone() {
        return this.c;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return j$.com.android.tools.r8.a.n(this, temporalField);
        }
        int i = t.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.i(temporalField) : this.b.getTotalSeconds();
        }
        throw new DateTimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(LocalDate localDate) {
        return b.b(localDate) ? M(LocalDateTime.of(localDate, this.a.b), this.c, this.b) : (ZonedDateTime) localDate.n(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) ? ((ChronoField) temporalField).b : this.a.k(temporalField) : temporalField.j(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.ofEpochSecond(L(), b().d);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: toLocalDateTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime o() {
        return this.a;
    }

    public final String toString() {
        String str = this.a.toString() + this.b.toString();
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime v(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.c.equals(zoneId) ? this : M(this.a, zoneId, this.b);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l x(long j, j$.time.temporal.a aVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, aVar).d(1L, aVar) : d(-j, aVar);
    }
}
