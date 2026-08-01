package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;

/* loaded from: classes2.dex */
public interface ChronoLocalDateTime<D extends ChronoLocalDate> extends j$.time.temporal.l, j$.time.temporal.m, Comparable<ChronoLocalDateTime<?>> {
    j a();

    LocalTime b();

    int compareTo(ChronoLocalDateTime chronoLocalDateTime);

    ChronoLocalDate f();

    long toEpochSecond(ZoneOffset zoneOffset);

    ChronoZonedDateTime y(ZoneId zoneId);
}
