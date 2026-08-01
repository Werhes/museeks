package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٙؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14057e implements InterfaceC4402e {
    public final String ad;

    public C14057e(String str) {
        this.ad = str;
    }

    @Override // defpackage.InterfaceC4402e
    public final void ad(InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        c13770e.m3671package(1226162337);
        int i2 = i | (c13770e.purchase(interfaceC12864e) ? 4 : 2) | (c13770e.purchase(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            AbstractC10600e.vip(this.ad, AbstractC12220e.loadAd(AbstractC12220e.smaato(interfaceC12864e, AbstractC3711e.ad, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16, 7), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C10375e) c13770e.adcel(AbstractC17878e.ad)).billing, c13770e, 0, 0, 65532);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2173e(this, interfaceC12864e, i, 21);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14057e) && AbstractC7890e.billing(this.ad, ((C14057e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("Header(title="), this.ad, ')');
    }
}
