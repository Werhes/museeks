package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
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
public final class LocalDateTime implements j$.time.temporal.l, j$.time.temporal.m, ChronoLocalDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = 6207766400415563566L;
    public final LocalDate a;
    public final LocalTime b;
    public static final LocalDateTime MIN = of(LocalDate.MIN, LocalTime.MIN);
    public static final LocalDateTime MAX = of(LocalDate.MAX, LocalTime.MAX);

    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.a = localDate;
        this.b = localTime;
    }

    public static LocalDateTime N(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).o();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.O(temporalAccessor), LocalTime.N(temporalAccessor));
        } catch (DateTimeException e) {
            throw new RuntimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static LocalDateTime P(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        ChronoField.NANO_OF_SECOND.D(j2);
        return new LocalDateTime(LocalDate.ofEpochDay(j$.com.android.tools.r8.a.W(j + zoneOffset.getTotalSeconds(), 86400)), LocalTime.P((((int) j$.com.android.tools.r8.a.V(r5, r7)) * 1000000000) + j2));
    }

    public static LocalDateTime of(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return P(instant.getEpochSecond(), instant.getNano(), zoneId.getRules().d(instant));
    }

    public static LocalDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.g;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDateTime) dateTimeFormatter.parse(charSequence, new d(1));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 5, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long B(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).M() ? this.b.B(temporalField) : this.a.B(temporalField) : temporalField.x(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.p.f ? this.a : j$.com.android.tools.r8.a.w(this, temporalQuery);
    }

    public final int M(LocalDateTime localDateTime) {
        int M = this.a.M(localDateTime.a);
        return M == 0 ? this.b.compareTo(localDateTime.b) : M;
    }

    public final boolean O(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return M((LocalDateTime) chronoLocalDateTime) < 0;
        }
        long epochDay = this.a.toEpochDay();
        long epochDay2 = chronoLocalDateTime.f().toEpochDay();
        if (epochDay >= epochDay2) {
            return epochDay == epochDay2 && this.b.W() < chronoLocalDateTime.b().W();
        }
        return true;
    }

    @Override // j$.time.temporal.l
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (LocalDateTime) qVar.i(this, j);
        }
        switch (f.a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return S(this.a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime U = U(this.a.X(j / 86400000000L), this.b);
                return U.S(U.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime U2 = U(this.a.X(j / 86400000), this.b);
                return U2.S(U2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return R(j);
            case 5:
                return S(this.a, 0L, j, 0L, 0L);
            case 6:
                return S(this.a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime U3 = U(this.a.X(j / 256), this.b);
                return U3.S(U3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return U(this.a.d(j, qVar), this.b);
        }
    }

    public final LocalDateTime R(long j) {
        return S(this.a, 0L, 0L, j, 0L);
    }

    public final LocalDateTime S(LocalDate localDate, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return U(localDate, this.b);
        }
        long j5 = 1;
        long W = this.b.W();
        long j6 = ((((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L)) * j5) + W;
        long W2 = j$.com.android.tools.r8.a.W(j6, 86400000000000L) + (((j / 24) + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L)) * j5);
        long V = j$.com.android.tools.r8.a.V(j6, 86400000000000L);
        return U(localDate.X(W2), V == W ? this.b : LocalTime.P(V));
    }

    @Override // j$.time.temporal.l
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime c(long j, TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).M() ? U(this.a, this.b.c(j, temporalField)) : U(this.a.c(j, temporalField), this.b) : (LocalDateTime) temporalField.B(this, j);
    }

    public final LocalDateTime U(LocalDate localDate, LocalTime localTime) {
        return (this.a == localDate && this.b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    @Override // j$.time.temporal.l
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime w(j$.time.temporal.m mVar) {
        return mVar instanceof LocalDate ? U((LocalDate) mVar, this.b) : mVar instanceof LocalTime ? U(this.a, (LocalTime) mVar) : mVar instanceof LocalDateTime ? (LocalDateTime) mVar : (LocalDateTime) mVar.n(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.j a() {
        return ((LocalDate) f()).a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime b() {
        return this.b;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public int compareTo(ChronoLocalDateTime<?> chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? M((LocalDateTime) chronoLocalDateTime) : j$.com.android.tools.r8.a.g(this, chronoLocalDateTime);
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
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoLocalDate f() {
        return this.a;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).M() ? this.b.i(temporalField) : this.a.i(temporalField) : j$.time.temporal.p.a(this, temporalField);
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

    public String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l x(long j, j$.time.temporal.a aVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, aVar).d(1L, aVar) : d(-j, aVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime y(ZoneId zoneId) {
        return ZonedDateTime.M(this, zoneId, null);
    }
}
