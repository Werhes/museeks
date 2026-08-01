package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class e implements ChronoLocalDateTime, j$.time.temporal.l, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient ChronoLocalDate a;
    public final transient LocalTime b;

    public e(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(chronoLocalDate, "date");
        Objects.requireNonNull(localTime, "time");
        this.a = chronoLocalDate;
        this.b = localTime;
    }

    public static e M(j jVar, j$.time.temporal.l lVar) {
        e eVar = (e) lVar;
        if (jVar.equals(eVar.a.a())) {
            return eVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + jVar.getId() + ", actual: " + eVar.a.a().getId());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new c0((byte) 2, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long B(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).M() ? this.b.B(temporalField) : this.a.B(temporalField) : temporalField.x(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object D(TemporalQuery temporalQuery) {
        return j$.com.android.tools.r8.a.w(this, temporalQuery);
    }

    @Override // j$.time.temporal.l
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final e d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return M(this.a.a(), qVar.i(this, j));
        }
        switch (d.a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return O(this.a, 0L, 0L, 0L, j);
            case 2:
                e Q = Q(this.a.d(j / 86400000000L, (j$.time.temporal.q) j$.time.temporal.a.DAYS), this.b);
                return Q.O(Q.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                e Q2 = Q(this.a.d(j / 86400000, (j$.time.temporal.q) j$.time.temporal.a.DAYS), this.b);
                return Q2.O(Q2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return O(this.a, 0L, 0L, j, 0L);
            case 5:
                return O(this.a, 0L, j, 0L, 0L);
            case 6:
                return O(this.a, j, 0L, 0L, 0L);
            case 7:
                e Q3 = Q(this.a.d(j / 256, (j$.time.temporal.q) j$.time.temporal.a.DAYS), this.b);
                return Q3.O(Q3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return Q(this.a.d(j, qVar), this.b);
        }
    }

    public final e O(ChronoLocalDate chronoLocalDate, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return Q(chronoLocalDate, this.b);
        }
        long j5 = j / 24;
        long j6 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long W = this.b.W();
        long j7 = j6 + W;
        long W2 = j$.com.android.tools.r8.a.W(j7, 86400000000000L) + j5 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long V = j$.com.android.tools.r8.a.V(j7, 86400000000000L);
        return Q(chronoLocalDate.d(W2, (j$.time.temporal.q) j$.time.temporal.a.DAYS), V == W ? this.b : LocalTime.P(V));
    }

    @Override // j$.time.temporal.l
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final e c(long j, TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).M() ? Q(this.a, this.b.c(j, temporalField)) : Q(this.a.c(j, temporalField), this.b) : M(this.a.a(), temporalField.B(this, j));
    }

    public final e Q(j$.time.temporal.l lVar, LocalTime localTime) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == lVar && this.b == localTime) ? this : new e(c.M(chronoLocalDate.a(), lVar), localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j a() {
        return this.a.a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime b() {
        return this.b;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return j$.com.android.tools.r8.a.g(this, chronoLocalDateTime);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ChronoLocalDateTime<?> chronoLocalDateTime) {
        return compareTo((ChronoLocalDateTime) chronoLocalDateTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.i(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.isDateBased() || chronoField.M();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && j$.com.android.tools.r8.a.g(this, (ChronoLocalDateTime) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoLocalDate f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).M() ? this.b.i(temporalField) : this.a.i(temporalField) : k(temporalField).a(B(temporalField), temporalField);
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(LocalDate localDate) {
        if (j$.time.b.b(localDate)) {
            return Q(localDate, this.b);
        }
        j a = this.a.a();
        localDate.getClass();
        return M(a, (e) j$.com.android.tools.r8.a.a(localDate, this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.j(this);
        }
        if (!((ChronoField) temporalField).M()) {
            return this.a.k(temporalField);
        }
        LocalTime localTime = this.b;
        localTime.getClass();
        return j$.time.temporal.p.d(localTime, temporalField);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        return lVar.c(f().toEpochDay(), ChronoField.EPOCH_DAY).c(b().W(), ChronoField.NANO_OF_DAY);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return j$.com.android.tools.r8.a.z(this, zoneOffset);
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l x(long j, j$.time.temporal.a aVar) {
        return M(this.a.a(), j$.time.temporal.p.b(this, j, aVar));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime y(ZoneId zoneId) {
        return i.M(zoneId, null, this);
    }
}
