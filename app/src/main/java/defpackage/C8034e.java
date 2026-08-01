package defpackage;

import android.util.Range;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٚۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8034e {
    public long ad;
    public Range license;
    public double metrica;
    public long vip;

    public C8034e() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / 1.0f));
        this.license = range;
        this.metrica = ((Double) range.getUpper()).doubleValue();
        this.ad = -9223372036854775807L;
        this.vip = -9223372036854775807L;
    }

    public final void ad(long j, long j2) {
        double doubleValue;
        AbstractC2301e.billing(j != -9223372036854775807L);
        AbstractC2301e.billing(j2 != -9223372036854775807L);
        long j3 = this.ad;
        if (j3 != -9223372036854775807L) {
            if (this.vip != -9223372036854775807L && j != j3) {
                doubleValue = (j2 - r4) / (j - j3);
                this.metrica = (((Double) this.license.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.metrica * 0.800000011920929d);
                this.ad = j;
                this.vip = j2;
            }
        }
        doubleValue = ((Double) this.license.getUpper()).doubleValue();
        this.metrica = (((Double) this.license.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.metrica * 0.800000011920929d);
        this.ad = j;
        this.vip = j2;
    }

    public final void metrica(float f) {
        AbstractC2301e.billing(f > 0.0f);
        this.license = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f));
        vip();
    }

    public final void vip() {
        this.metrica = ((Double) this.license.getUpper()).doubleValue();
        this.ad = -9223372036854775807L;
        this.vip = -9223372036854775807L;
    }
}
