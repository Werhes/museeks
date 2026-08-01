package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13045e implements InterfaceC4977e {
    public final int ad;
    public final int license;
    public final String metrica;
    public final String vip;

    public C13045e(int i, int i2, String str, String str2) {
        this.ad = i;
        this.vip = str;
        this.metrica = str2;
        this.license = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13045e)) {
            return false;
        }
        C13045e c13045e = (C13045e) obj;
        return this.ad == c13045e.ad && AbstractC7890e.billing(this.vip, c13045e.vip) && AbstractC7890e.billing(this.metrica, c13045e.metrica) && this.license == c13045e.license;
    }

    public final int hashCode() {
        return AbstractC1786e.advert(AbstractC1786e.advert(this.ad * 31, 31, this.vip), 31, this.metrica) + this.license;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Placeholder(iconRes=");
        sb.append(this.ad);
        sb.append(", title=");
        sb.append(this.vip);
        sb.append(", text=");
        sb.append(this.metrica);
        sb.append(", reloadButtonRes=");
        return AbstractC1786e.pro(sb, this.license, ')');
    }
}
