package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class l implements j$.time.temporal.l, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final LocalTime a;
    public final ZoneOffset b;

    static {
        LocalTime localTime = LocalTime.MIN;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localTime.getClass();
        new l(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.MAX;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localTime2.getClass();
        new l(localTime2, zoneOffset2);
    }

    public l(LocalTime localTime, ZoneOffset zoneOffset) {
        this.a = (LocalTime) Objects.requireNonNull(localTime, "time");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 9, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long B(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.OFFSET_SECONDS ? this.b.getTotalSeconds() : this.a.B(temporalField) : temporalField.x(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.d || temporalQuery == j$.time.temporal.p.e) {
            return this.b;
        }
        if (((temporalQuery == j$.time.temporal.p.a) || (temporalQuery == j$.time.temporal.p.b)) || temporalQuery == j$.time.temporal.p.f) {
            return null;
        }
        return temporalQuery == j$.time.temporal.p.g ? this.a : temporalQuery == j$.time.temporal.p.c ? j$.time.temporal.a.NANOS : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final l d(long j, j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? N(this.a.d(j, qVar), this.b) : (l) qVar.i(this, j);
    }

    public final l N(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.a == localTime && this.b.equals(zoneOffset)) ? this : new l(localTime, zoneOffset);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (l) temporalField.B(this, j);
        }
        if (temporalField != ChronoField.OFFSET_SECONDS) {
            return N(this.a.c(j, temporalField), this.b);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return N(this.a, ZoneOffset.ofTotalSeconds(chronoField.b.a(j, chronoField)));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int compare;
        l lVar = (l) obj;
        return (this.b.equals(lVar.b) || (compare = Long.compare(this.a.W() - (((long) this.b.getTotalSeconds()) * 1000000000), lVar.a.W() - (((long) lVar.b.getTotalSeconds()) * 1000000000))) == 0) ? this.a.compareTo(lVar.a) : compare;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).M() || temporalField == ChronoField.OFFSET_SECONDS : temporalField != null && temporalField.i(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.a.equals(lVar.a) && this.b.equals(lVar.b)) {
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
        return j$.time.temporal.p.a(this, temporalField);
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(LocalDate localDate) {
        localDate.getClass();
        return (l) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.j(this);
        }
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return ((ChronoField) temporalField).b;
        }
        LocalTime localTime = this.a;
        localTime.getClass();
        return j$.time.temporal.p.d(localTime, temporalField);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        return lVar.c(this.a.W(), ChronoField.NANO_OF_DAY).c(this.b.getTotalSeconds(), ChronoField.OFFSET_SECONDS);
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l x(long j, j$.time.temporal.a aVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, aVar).d(1L, aVar) : d(-j, aVar);
    }
}
