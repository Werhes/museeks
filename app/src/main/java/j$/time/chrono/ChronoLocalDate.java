package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.TemporalField;

/* loaded from: classes2.dex */
public interface ChronoLocalDate extends j$.time.temporal.l, j$.time.temporal.m, Comparable<ChronoLocalDate> {
    ChronoLocalDateTime C(LocalTime localTime);

    k E();

    ChronoLocalDate G(j$.time.temporal.o oVar);

    int J();

    j a();

    @Override // j$.time.temporal.l
    ChronoLocalDate c(long j, TemporalField temporalField);

    int compareTo(ChronoLocalDate chronoLocalDate);

    @Override // j$.time.temporal.l
    ChronoLocalDate d(long j, j$.time.temporal.q qVar);

    @Override // j$.time.temporal.TemporalAccessor
    boolean e(TemporalField temporalField);

    boolean equals(Object obj);

    int hashCode();

    boolean p();

    /* renamed from: r */
    ChronoLocalDate x(long j, j$.time.temporal.q qVar);

    long toEpochDay();

    String toString();

    ChronoLocalDate w(j$.time.temporal.m mVar);
}
