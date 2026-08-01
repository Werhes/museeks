package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11371e {
    public static final C11371e purchase = new C11371e(C3618e.adcel, C13664e.f27089e, Float.NaN, -1.0f, C10810e.license);
    public final long ad;
    public final C10810e appmetrica;
    public final float license;
    public final float metrica;
    public final List vip;

    public C11371e(long j, List list, float f, float f2, C10810e c10810e) {
        this.ad = j;
        this.vip = list;
        this.metrica = f;
        this.license = f2;
        this.appmetrica = c10810e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11371e)) {
            return false;
        }
        C11371e c11371e = (C11371e) obj;
        return C3618e.metrica(this.ad, c11371e.ad) && AbstractC7890e.billing(this.vip, c11371e.vip) && C15765e.vip(this.metrica, c11371e.metrica) && Float.compare(this.license, c11371e.license) == 0 && AbstractC7890e.billing(this.appmetrica, c11371e.appmetrica);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return this.appmetrica.hashCode() + AbstractC1414e.license(AbstractC1414e.license(AbstractC17861e.billing(C10994e.ad(this.ad) * 31, 31, this.vip), this.metrica, 31), this.license, 31);
    }

    public final String toString() {
        return "HazeStyle(backgroundColor=" + C3618e.startapp(this.ad) + ", tints=" + this.vip + ", blurRadius=" + C15765e.metrica(this.metrica) + ", noiseFactor=" + this.license + ", fallbackTint=" + this.appmetrica + ")";
    }
}
