package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؕؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3046e {
    public final String ad;
    public final String vip;

    public C3046e(String str, String str2) {
        this.ad = str;
        this.vip = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3046e)) {
            return false;
        }
        C3046e c3046e = (C3046e) obj;
        return AbstractC7890e.billing(this.ad, c3046e.ad) && AbstractC7890e.billing(this.vip, c3046e.vip);
    }

    public final int hashCode() {
        String str = this.ad;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.vip;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.ad);
        sb.append(", authToken=");
        return AbstractC4653e.applovin(sb, this.vip, ')');
    }
}
