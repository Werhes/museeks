package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۙ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2826e extends AbstractC14008e {
    public final String ad;
    public final String metrica;
    public final String vip;

    public C2826e(String str, String str2, String str3) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC14008e) {
            C2826e c2826e = (C2826e) ((AbstractC14008e) obj);
            if (this.ad.equals(c2826e.ad) && this.vip.equals(c2826e.vip) && this.metrica.equals(c2826e.metrica)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003) ^ this.metrica.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.ad);
        sb.append(", libraryName=");
        sb.append(this.vip);
        sb.append(", buildId=");
        return AbstractC1786e.signatures(sb, this.metrica, "}");
    }
}
