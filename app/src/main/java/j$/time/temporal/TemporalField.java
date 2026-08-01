package j$.time.temporal;

import j$.time.format.c0;
import j$.time.format.d0;
import java.util.Map;

/* loaded from: classes2.dex */
public interface TemporalField {
    l B(l lVar, long j);

    boolean i(TemporalAccessor temporalAccessor);

    boolean isDateBased();

    s j(TemporalAccessor temporalAccessor);

    TemporalAccessor k(Map map, c0 c0Var, d0 d0Var);

    s n();

    long x(TemporalAccessor temporalAccessor);
}
