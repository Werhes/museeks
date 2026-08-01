package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۙؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5867e {
    public final String ad;
    public final C14193e license;
    public final C9171e metrica;
    public final String vip;

    public C5867e(String str, String str2, C9171e c9171e, C14193e c14193e) {
        this.ad = str;
        this.vip = str2;
        this.metrica = c9171e;
        this.license = c14193e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5867e)) {
            return false;
        }
        C5867e c5867e = (C5867e) obj;
        return AbstractC7890e.billing(this.ad, c5867e.ad) && AbstractC7890e.billing(this.vip, c5867e.vip) && AbstractC7890e.billing(this.metrica, c5867e.metrica) && AbstractC7890e.billing(this.license, c5867e.license);
    }

    public final int hashCode() {
        return this.license.ad.hashCode() + ((this.metrica.ad.hashCode() + AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip)) * 961);
    }

    public final String toString() {
        StringBuilder tapsense = AbstractC17861e.tapsense("NetworkRequest(url=", this.ad, ", method=", this.vip, ", headers=");
        tapsense.append(this.metrica);
        tapsense.append(", body=null, extras=");
        tapsense.append(this.license);
        tapsense.append(")");
        return tapsense.toString();
    }
}
