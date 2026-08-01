package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
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
public final class i implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient e a;
    public final transient ZoneOffset b;
    public final transient ZoneId c;

    public i(ZoneId zoneId, ZoneOffset zoneOffset, e eVar) {
        this.a = (e) Objects.requireNonNull(eVar, "dateTime");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
        this.c = (ZoneId) Objects.requireNonNull(zoneId, "zone");
    }

    public static i M(ZoneId zoneId, ZoneOffset zoneOffset, e eVar) {
        Objects.requireNonNull(eVar, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new i(zoneId, (ZoneOffset) zoneId, eVar);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime N = LocalDateTime.N(eVar);
        List f = rules.f(N);
        if (f.size() == 1) {
            zoneOffset = (ZoneOffset) f.get(0);
        } else if (f.size() == 0) {
            Object e = rules.e(N);
            j$.time.zone.b bVar = e instanceof j$.time.zone.b ? (j$.time.zone.b) e : null;
            eVar = eVar.O(eVar.a, 0L, 0L, Duration.j(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds(), 0).getSeconds(), 0L);
            zoneOffset = bVar.d;
        } else {
            if (zoneOffset == null || !f.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) f.get(0);
            }
            eVar = eVar;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new i(zoneId, zoneOffset, eVar);
    }

    public static i N(j jVar, Instant instant, ZoneId zoneId) {
        ZoneOffset d = zoneId.getRules().d(instant);
        Objects.requireNonNull(d, "offset");
        return new i(zoneId, d, (e) jVar.A(LocalDateTime.P(instant.getEpochSecond(), instant.getNano(), d)));
    }

    public static i n(j jVar, j$.time.temporal.l lVar) {
        i iVar = (i) lVar;
        if (jVar.equals(iVar.a())) {
            return iVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + jVar.getId() + ", actual: " + iVar.a().getId());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new c0((byte) 3, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long B(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        int i = g.a[((ChronoField) temporalField).ordinal()];
        return i != 1 ? i != 2 ? ((e) o()).B(temporalField) : g().getTotalSeconds() : L();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object D(TemporalQuery temporalQuery) {
        return j$.com.android.tools.r8.a.x(this, temporalQuery);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long L() {
        return j$.com.android.tools.r8.a.A(this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final i d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return n(a(), qVar.i(this, j));
        }
        return n(a(), this.a.d(j, qVar).n(this));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j a() {
        return f().a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final LocalTime b() {
        return ((e) o()).b();
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return n(a(), temporalField.B(this, j));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = h.a[chronoField.ordinal()];
        if (i == 1) {
            return d(j - j$.com.android.tools.r8.a.A(this), j$.time.temporal.a.SECONDS);
        }
        if (i != 2) {
            return M(this.c, this.b, this.a.c(j, temporalField));
        }
        ZoneOffset ofTotalSeconds = ZoneOffset.ofTotalSeconds(chronoField.b.a(j, chronoField));
        e eVar = this.a;
        eVar.getClass();
        return N(a(), Instant.ofEpochSecond(j$.com.android.tools.r8.a.z(eVar, ofTotalSeconds), eVar.b.d), this.c);
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
        return (obj instanceof ChronoZonedDateTime) && j$.com.android.tools.r8.a.h(this, (ChronoZonedDateTime) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDate f() {
        return ((e) o()).f();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset g() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId getZone() {
        return this.c;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int i(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.n(this, temporalField);
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(LocalDate localDate) {
        return n(a(), localDate.n(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) ? ((ChronoField) temporalField).b : ((e) o()).k(temporalField) : temporalField.j(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime o() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.ofEpochSecond(L(), b().d);
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
        return M(zoneId, this.b, this.a);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l x(long j, j$.time.temporal.a aVar) {
        return n(a(), j$.time.temporal.p.b(this, j, aVar));
    }
}
