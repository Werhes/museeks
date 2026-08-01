package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface j extends Comparable {
    ChronoLocalDateTime A(LocalDateTime localDateTime);

    ChronoLocalDate F(int i, int i2, int i3);

    ChronoLocalDate H(Map map, j$.time.format.d0 d0Var);

    ChronoZonedDateTime I(Instant instant, ZoneId zoneId);

    boolean K(long j);

    boolean equals(Object obj);

    String getId();

    ChronoLocalDate h(long j);

    int hashCode();

    String l();

    ChronoLocalDate m(int i, int i2);

    j$.time.temporal.s q(ChronoField chronoField);

    List s();

    k t(int i);

    String toString();

    int u(k kVar, int i);

    ChronoLocalDate z(TemporalAccessor temporalAccessor);
}
