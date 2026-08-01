package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًًٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7804e {
    public final String ad;
    public final int appmetrica;
    public final String license;
    public final String metrica;
    public final C13391e purchase;
    public final String vip;

    public C7804e(String str, String str2, String str3, String str4, int i, C13391e c13391e) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.ad = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.vip = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.metrica = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.license = str4;
        this.appmetrica = i;
        this.purchase = c13391e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7804e)) {
            return false;
        }
        C7804e c7804e = (C7804e) obj;
        return this.ad.equals(c7804e.ad) && this.vip.equals(c7804e.vip) && this.metrica.equals(c7804e.metrica) && this.license.equals(c7804e.license) && this.appmetrica == c7804e.appmetrica && this.purchase.equals(c7804e.purchase);
    }

    public final int hashCode() {
        return ((((((((((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003) ^ this.metrica.hashCode()) * 1000003) ^ this.license.hashCode()) * 1000003) ^ this.appmetrica) * 1000003) ^ this.purchase.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.ad + ", versionCode=" + this.vip + ", versionName=" + this.metrica + ", installUuid=" + this.license + ", deliveryMechanism=" + this.appmetrica + ", developmentPlatformProvider=" + this.purchase + "}";
    }
}
