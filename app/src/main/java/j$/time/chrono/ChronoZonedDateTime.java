package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;

/* loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends ChronoLocalDate> extends j$.time.temporal.l, Comparable<ChronoZonedDateTime<?>> {
    long L();

    j a();

    LocalTime b();

    ChronoLocalDate f();

    ZoneOffset g();

    ZoneId getZone();

    ChronoLocalDateTime o();

    Instant toInstant();

    ChronoZonedDateTime v(ZoneId zoneId);
}
