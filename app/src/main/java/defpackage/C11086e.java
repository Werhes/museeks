package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٚؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11086e implements InterfaceC4402e {
    public final InterfaceC8346e ad;

    public C11086e(InterfaceC8346e interfaceC8346e) {
        this.ad = interfaceC8346e;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [eٍُؐ, java.lang.Object] */
    @Override // defpackage.InterfaceC4402e
    public final void ad(InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        c13770e.m3671package(-1499364941);
        int i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i | (c13770e.purchase(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (m3681throw == obj) {
                C6260e c6260e = C6260e.vip;
                m3681throw = C11080e.ad;
                c13770e.m3682throws(m3681throw);
            }
            ((C11080e) m3681throw).getClass();
            C6260e c6260e2 = new C6260e();
            C6260e c6260e3 = new C6260e();
            ?? obj2 = new Object();
            InterfaceC12864e metrica = AbstractC8116e.metrica(AbstractC18366e.license(AbstractC18007e.purchase(interfaceC12864e, 0.0f, 192, 1), c6260e2), c6260e3);
            C16005e metrica2 = AbstractC12220e.metrica(8, 0.0f, 2);
            C13964e billing = AbstractC16497e.billing(16);
            boolean purchase = c13770e.purchase(c6260e3) | ((i2 & 112) == 32);
            Object m3681throw2 = c13770e.m3681throw();
            if (purchase || m3681throw2 == obj) {
                m3681throw2 = new C13942e(this, c6260e3, 6);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC5679e.ad(199680, null, billing, null, null, c13770e, obj2, null, metrica, metrica2, (Function1) m3681throw2, false);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2173e(this, interfaceC12864e, i, 24);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11086e) && AbstractC7890e.billing(this.ad, ((C11086e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "TripleSlider(items=" + this.ad + ')';
    }
}
