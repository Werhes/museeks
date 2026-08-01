package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class w implements TemporalAccessor {
    public final /* synthetic */ ChronoLocalDate a;
    public final /* synthetic */ TemporalAccessor b;
    public final /* synthetic */ j$.time.chrono.j c;
    public final /* synthetic */ ZoneId d;

    public w(ChronoLocalDate chronoLocalDate, TemporalAccessor temporalAccessor, j$.time.chrono.j jVar, ZoneId zoneId) {
        this.a = chronoLocalDate;
        this.b = temporalAccessor;
        this.c = jVar;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long B(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == null || !temporalField.isDateBased()) ? this.b.B(temporalField) : chronoLocalDate.B(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.p.b ? this.c : temporalQuery == j$.time.temporal.p.a ? this.d : temporalQuery == j$.time.temporal.p.c ? this.b.D(temporalQuery) : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == null || !temporalField.isDateBased()) ? this.b.e(temporalField) : chronoLocalDate.e(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int i(TemporalField temporalField) {
        return j$.time.temporal.p.a(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == null || !temporalField.isDateBased()) ? this.b.k(temporalField) : chronoLocalDate.k(temporalField);
    }

    public final String toString() {
        String str;
        String str2 = BuildConfig.FLAVOR;
        j$.time.chrono.j jVar = this.c;
        if (jVar != null) {
            str = " with chronology " + jVar;
        } else {
            str = BuildConfig.FLAVOR;
        }
        ZoneId zoneId = this.d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.b + str + str2;
    }
}
