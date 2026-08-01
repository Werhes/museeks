package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؒؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1531e implements InterfaceC10306e {
    public final Object ad;
    public final C8633e metrica;
    public final String vip;

    public C1531e(Object obj, String str, C8633e c8633e) {
        this.ad = obj;
        this.vip = str;
        this.metrica = c8633e;
    }

    @Override // defpackage.InterfaceC10306e
    public final /* bridge */ /* synthetic */ Object ad() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1531e)) {
            return false;
        }
        C1531e c1531e = (C1531e) obj;
        return AbstractC7890e.billing(this.ad, c1531e.ad) && AbstractC7890e.billing(this.vip, c1531e.vip) && AbstractC7890e.billing(this.metrica, c1531e.metrica);
    }

    @Override // defpackage.InterfaceC10306e
    public final String getKey() {
        return this.vip;
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip);
        C8633e c8633e = this.metrica;
        return advert + (c8633e == null ? 0 : c8633e.hashCode());
    }

    @Override // defpackage.InterfaceC10306e
    public final Object metrica() {
        return this.ad;
    }

    public final String toString() {
        return "Destroyed(configuration=" + this.ad + ", key=" + this.vip + ", savedState=" + this.metrica + ')';
    }

    @Override // defpackage.InterfaceC10306e
    public final C16722e vip() {
        return null;
    }
}
