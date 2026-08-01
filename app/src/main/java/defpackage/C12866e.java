package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۥؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12866e implements InterfaceC4402e {
    public final InterfaceC8346e ad;

    public C12866e(InterfaceC8346e interfaceC8346e) {
        this.ad = interfaceC8346e;
    }

    @Override // defpackage.InterfaceC4402e
    public final void ad(InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        InterfaceC12864e interfaceC12864e2;
        c13770e.m3671package(2095582283);
        int i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i | (c13770e.purchase(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                C6260e c6260e = C6260e.vip;
                m3681throw = C11080e.ad;
                c13770e.m3682throws(m3681throw);
            }
            ((C11080e) m3681throw).getClass();
            C6260e c6260e2 = new C6260e();
            interfaceC12864e2 = interfaceC12864e;
            C4524e.f9802e.pro(c6260e2, AbstractC16653e.license(-1476637282, new C6409e(interfaceC12864e2, c6260e2, new C6260e(), this, 29), c13770e), c13770e, 432);
        } else {
            interfaceC12864e2 = interfaceC12864e;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2173e(this, interfaceC12864e2, i, 20);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12866e) && AbstractC7890e.billing(this.ad, ((C12866e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "DoubleGrid(items=" + this.ad + ')';
    }
}
