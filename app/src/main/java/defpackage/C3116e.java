package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؔٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3116e extends AbstractC0235e {
    public final String ad;
    public final boolean license;
    public final int metrica;
    public final int vip;

    public C3116e(int i, int i2, String str, boolean z) {
        this.ad = str;
        this.vip = i;
        this.metrica = i2;
        this.license = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0235e) {
            C3116e c3116e = (C3116e) ((AbstractC0235e) obj);
            if (this.ad.equals(c3116e.ad) && this.vip == c3116e.vip && this.metrica == c3116e.metrica && this.license == c3116e.license) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip) * 1000003) ^ this.metrica) * 1000003) ^ (this.license ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails{processName=");
        sb.append(this.ad);
        sb.append(", pid=");
        sb.append(this.vip);
        sb.append(", importance=");
        sb.append(this.metrica);
        sb.append(", defaultProcess=");
        return AbstractC8703e.signatures(sb, this.license, "}");
    }
}
