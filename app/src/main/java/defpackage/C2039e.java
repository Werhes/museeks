package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۗۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2039e {
    public final String ad;
    public final boolean license;
    public final int metrica;
    public final int vip;

    public C2039e(int i, int i2, String str, boolean z) {
        this.ad = str;
        this.vip = i;
        this.metrica = i2;
        this.license = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2039e)) {
            return false;
        }
        C2039e c2039e = (C2039e) obj;
        return AbstractC7890e.billing(this.ad, c2039e.ad) && this.vip == c2039e.vip && this.metrica == c2039e.metrica && this.license == c2039e.license;
    }

    public final int hashCode() {
        return (((((this.ad.hashCode() * 31) + this.vip) * 31) + this.metrica) * 31) + (this.license ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.ad);
        sb.append(", pid=");
        sb.append(this.vip);
        sb.append(", importance=");
        sb.append(this.metrica);
        sb.append(", isDefaultProcess=");
        return AbstractC1786e.isVip(sb, this.license, ')');
    }
}
