package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۖۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17201e {
    public final InterfaceC4082e ad;
    public final String license;
    public final int metrica;
    public final boolean vip;

    public C17201e(InterfaceC4082e interfaceC4082e, boolean z, int i, String str) {
        this.ad = interfaceC4082e;
        this.vip = z;
        this.metrica = i;
        this.license = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17201e)) {
            return false;
        }
        C17201e c17201e = (C17201e) obj;
        return AbstractC7890e.billing(this.ad, c17201e.ad) && this.vip == c17201e.vip && this.metrica == c17201e.metrica && AbstractC7890e.billing(this.license, c17201e.license);
    }

    public final int hashCode() {
        int mopub = AbstractC1786e.mopub(this.metrica, ((this.ad.hashCode() * 31) + (this.vip ? 1231 : 1237)) * 31, 31);
        String str = this.license;
        return mopub + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ExecuteResult(image=" + this.ad + ", isSampled=" + this.vip + ", dataSource=" + AbstractC13501e.premium(this.metrica) + ", diskCacheKey=" + this.license + ")";
    }
}
