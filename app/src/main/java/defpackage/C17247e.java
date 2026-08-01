package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٗۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17247e implements InterfaceC15632e {
    public final C10813e ad;
    public final String vip;

    public C17247e(C10813e c10813e, String str) {
        this.ad = c10813e;
        this.vip = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17247e)) {
            return false;
        }
        C17247e c17247e = (C17247e) obj;
        return AbstractC7890e.billing(this.ad, c17247e.ad) && AbstractC7890e.billing(this.vip, c17247e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemoteAuthQrCodeScanned(authInfo=");
        sb.append(this.ad);
        sb.append(", authCode=");
        return AbstractC4653e.applovin(sb, this.vip, ')');
    }
}
