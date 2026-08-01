package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؗۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5140e {
    public final String ad;
    public final String license;
    public final String metrica;
    public final String vip;

    public C5140e(String str, String str2, String str3, String str4) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5140e) {
            C5140e c5140e = (C5140e) obj;
            if (this.ad.equals(c5140e.ad) && this.vip.equals(c5140e.vip) && this.metrica.equals(c5140e.metrica) && this.license.equals(c5140e.license)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003) ^ this.metrica.hashCode()) * 1000003) ^ this.license.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.ad);
        sb.append(", eglVersion=");
        sb.append(this.vip);
        sb.append(", glExtensions=");
        sb.append(this.metrica);
        sb.append(", eglExtensions=");
        return AbstractC1786e.signatures(sb, this.license, "}");
    }
}
