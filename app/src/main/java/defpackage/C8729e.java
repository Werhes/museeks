package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8729e implements InterfaceC15632e {
    public final String ad;
    public final String metrica;
    public final int vip;

    public C8729e(String str, int i, String str2) {
        this.ad = str;
        this.vip = i;
        this.metrica = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8729e)) {
            return false;
        }
        C8729e c8729e = (C8729e) obj;
        return AbstractC7890e.billing(this.ad, c8729e.ad) && this.vip == c8729e.vip && AbstractC7890e.billing(this.metrica, c8729e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + (((this.ad.hashCode() * 31) + this.vip) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorizationQrCodeScanned(code=");
        sb.append(this.ad);
        sb.append(", pollingDuration=");
        sb.append(this.vip);
        sb.append(", domain=");
        return AbstractC4653e.applovin(sb, this.metrica, ')');
    }
}
