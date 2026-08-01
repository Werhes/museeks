package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۤٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9875e {
    public final EnumC16168e ad;
    public final String license;
    public final String metrica;
    public final boolean vip;

    public C9875e(EnumC16168e enumC16168e, boolean z, String str, String str2) {
        this.ad = enumC16168e;
        this.vip = z;
        this.metrica = str;
        this.license = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9875e)) {
            return false;
        }
        C9875e c9875e = (C9875e) obj;
        return this.ad == c9875e.ad && this.vip == c9875e.vip && AbstractC7890e.billing(this.metrica, c9875e.metrica) && AbstractC7890e.billing(this.license, c9875e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + AbstractC1786e.advert(((this.ad.hashCode() * 31) + (this.vip ? 1231 : 1237)) * 31, 31, this.metrica);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OauthState(method=");
        sb.append(this.ad);
        sb.append(", hasNextMethods=");
        sb.append(this.vip);
        sb.append(", supportingData=");
        sb.append(this.metrica);
        sb.append(", phoneMask=");
        return AbstractC4653e.applovin(sb, this.license, ')');
    }
}
