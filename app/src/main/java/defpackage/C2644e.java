package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔ٘ؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2644e implements InterfaceC15632e {
    public final Csuper ad;
    public final C9441e vip;

    public C2644e(Csuper csuper, C9441e c9441e) {
        this.ad = csuper;
        this.vip = c9441e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2644e)) {
            return false;
        }
        C2644e c2644e = (C2644e) obj;
        return AbstractC7890e.billing(this.ad, c2644e.ad) && AbstractC7890e.billing(this.vip, c2644e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "IacReadyToTransfer(client=" + this.ad + ", device=" + this.vip + ')';
    }
}
