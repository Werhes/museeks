package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٜۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6522e {
    public final AbstractC16845e ad;
    public final Object appmetrica;
    public final int license;
    public final int metrica;
    public final C1812e vip;

    public C6522e(AbstractC16845e abstractC16845e, C1812e c1812e, int i, int i2, Object obj) {
        this.ad = abstractC16845e;
        this.vip = c1812e;
        this.metrica = i;
        this.license = i2;
        this.appmetrica = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6522e)) {
            return false;
        }
        C6522e c6522e = (C6522e) obj;
        return AbstractC7890e.billing(this.ad, c6522e.ad) && AbstractC7890e.billing(this.vip, c6522e.vip) && this.metrica == c6522e.metrica && this.license == c6522e.license && AbstractC7890e.billing(this.appmetrica, c6522e.appmetrica);
    }

    public final int hashCode() {
        AbstractC16845e abstractC16845e = this.ad;
        int hashCode = (((((((abstractC16845e == null ? 0 : abstractC16845e.hashCode()) * 31) + this.vip.f4894e) * 31) + this.metrica) * 31) + this.license) * 31;
        Object obj = this.appmetrica;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.ad);
        sb.append(", fontWeight=");
        sb.append(this.vip);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.metrica;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.license;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.appmetrica);
        sb.append(')');
        return sb.toString();
    }
}
