package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٗۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12535e {
    public final String ad;
    public final String appmetrica;
    public final String license;
    public final String metrica;
    public final C0520e vip;

    public C12535e(String str, C0520e c0520e, String str2, String str3) {
        this.ad = str;
        this.vip = c0520e;
        this.metrica = str2;
        this.license = str3;
        this.appmetrica = AbstractC0869e.tapsense('.', str, c0520e + '(' + str2 + ')' + str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12535e)) {
            return false;
        }
        C12535e c12535e = (C12535e) obj;
        return AbstractC7890e.billing(this.ad, c12535e.ad) && AbstractC7890e.billing(this.vip, c12535e.vip) && AbstractC7890e.billing(this.metrica, c12535e.metrica) && AbstractC7890e.billing(this.license, c12535e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + AbstractC1786e.advert((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31, 31, this.metrica);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
        sb.append(this.ad);
        sb.append(", name=");
        sb.append(this.vip);
        sb.append(", parameters=");
        sb.append(this.metrica);
        sb.append(", returnType=");
        return AbstractC4653e.applovin(sb, this.license, ')');
    }
}
