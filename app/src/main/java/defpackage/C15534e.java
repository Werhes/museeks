package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ٘ٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15534e {
    public final int ad;
    public final boolean appmetrica;
    public final boolean license;
    public final boolean metrica;
    public final int purchase;
    public final boolean vip;

    public C15534e(int i, boolean z, boolean z2) {
        C5015e c5015e = AbstractC12710e.ad;
        int i2 = !z ? 262152 : 262144;
        i2 = i == 2 ? i2 | 8192 : i2;
        i2 = z2 ? i2 : i2 | AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
        boolean z3 = i == 1;
        this.ad = i2;
        this.vip = z3;
        this.metrica = true;
        this.license = true;
        this.appmetrica = true;
        this.purchase = 1002;
    }

    public C15534e(boolean z, int i) {
        this(1, (i & 1) != 0 ? false : z, (i & 8) != 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15534e)) {
            return false;
        }
        C15534e c15534e = (C15534e) obj;
        return this.ad == c15534e.ad && this.vip == c15534e.vip && this.metrica == c15534e.metrica && this.license == c15534e.license && this.appmetrica == c15534e.appmetrica && this.purchase == c15534e.purchase;
    }

    public final int hashCode() {
        return ((((((((((((this.ad * 31) + (this.vip ? 1231 : 1237)) * 31) + (this.metrica ? 1231 : 1237)) * 31) + (this.license ? 1231 : 1237)) * 31) + (this.appmetrica ? 1231 : 1237)) * 31) + 1237) * 31) + this.purchase) * 31;
    }
}
