package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٝؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8073e {
    public final float ad;
    public final int adcel;
    public final long appmetrica;
    public final float billing;
    public final long license;
    public final float metrica;
    public final List purchase;
    public final C7127e startapp;
    public final float vip;
    public final AbstractC4457e yandex;

    public C8073e(float f, float f2, float f3, long j, long j2, List list, float f4, AbstractC4457e abstractC4457e, C7127e c7127e, int i) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = j;
        this.appmetrica = j2;
        this.purchase = list;
        this.billing = f4;
        this.yandex = abstractC4457e;
        this.startapp = c7127e;
        this.adcel = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8073e)) {
            return false;
        }
        C8073e c8073e = (C8073e) obj;
        return C15765e.vip(this.ad, c8073e.ad) && Float.compare(this.vip, c8073e.vip) == 0 && Float.compare(this.metrica, c8073e.metrica) == 0 && C2108e.vip(this.license, c8073e.license) && C2152e.vip(this.appmetrica, c8073e.appmetrica) && AbstractC7890e.billing(this.purchase, c8073e.purchase) && Float.compare(this.billing, c8073e.billing) == 0 && AbstractC7890e.billing(this.yandex, c8073e.yandex) && AbstractC7890e.billing(this.startapp, c8073e.startapp) && this.adcel == c8073e.adcel;
    }

    public final int hashCode() {
        int license = AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31), this.metrica, 31);
        long j = this.license;
        int license2 = AbstractC1414e.license(AbstractC17861e.billing((C2152e.billing(this.appmetrica) + ((((int) (j ^ (j >>> 32))) + license) * 31)) * 31, 31, this.purchase), this.billing, 31);
        AbstractC4457e abstractC4457e = this.yandex;
        int hashCode = (license2 + (abstractC4457e == null ? 0 : abstractC4457e.hashCode())) * 31;
        C7127e c7127e = this.startapp;
        return ((hashCode + (c7127e != null ? c7127e.hashCode() : 0)) * 31) + this.adcel;
    }

    public final String toString() {
        return "RenderEffectParams(blurRadius=" + C15765e.metrica(this.ad) + ", noiseFactor=" + this.vip + ", scale=" + this.metrica + ", contentSize=" + C2108e.startapp(this.license) + ", contentOffset=" + C2152e.mopub(this.appmetrica) + ", tints=" + this.purchase + ", tintAlphaModulate=" + this.billing + ", mask=" + this.yandex + ", progressive=" + this.startapp + ", blurTileMode=" + AbstractC8228e.appmetrica(this.adcel) + ")";
    }
}
