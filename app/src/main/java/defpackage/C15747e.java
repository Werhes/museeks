package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۜۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15747e implements InterfaceC4402e {
    public final InterfaceC8346e ad;

    public C15747e(InterfaceC8346e interfaceC8346e) {
        this.ad = interfaceC8346e;
    }

    @Override // defpackage.InterfaceC4402e
    public final void ad(InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        c13770e.m3671package(1154603144);
        int i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i | (c13770e.purchase(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object m3681throw = c13770e.m3681throw();
            if (z || m3681throw == C2987e.ad) {
                m3681throw = new C5671e(24, this);
                c13770e.m3682throws(m3681throw);
            }
            C16349e vip = AbstractC1742e.vip(0, (Function0) m3681throw, c13770e, 0, 3);
            Function1 function1 = (Function1) c13770e.adcel(AbstractC10577e.ad);
            InterfaceC12864e smaato = AbstractC12220e.smaato(interfaceC12864e, AbstractC3711e.ad, 0.0f, 2);
            C3924e c3924e = ((C16305e) c13770e.adcel(AbstractC10984e.ad)).license;
            C9630e c9630e = AbstractC6271e.ad;
            C15492e c15492e = AbstractC12491e.ad;
            AbstractC11160e.metrica(smaato, c3924e, AbstractC6271e.ad(((C6032e) c13770e.adcel(c15492e)).adcel(), ((C6032e) c13770e.adcel(c15492e)).appmetrica(), c13770e, 0, 0), AbstractC16653e.license(-857557149, new C6710e(5, vip, this, function1), c13770e), c13770e, 50);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2173e(this, interfaceC12864e, i, 18);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15747e) && AbstractC7890e.billing(this.ad, ((C15747e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "AudioStreamMixes(mixes=" + this.ad + ')';
    }
}
