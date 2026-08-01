package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۙؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4341e implements InterfaceC0284e {
    public final String ad;
    public final C2764e license;
    public final String metrica;
    public final String vip;

    public C4341e(String str, String str2, String str3, C2764e c2764e) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = c2764e;
    }

    @Override // defpackage.InterfaceC0284e
    public final void ad(InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        c13770e.m3671package(-1527564004);
        int i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i | (c13770e.purchase(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            Function1 function1 = (Function1) c13770e.adcel(AbstractC10577e.ad);
            boolean purchase = c13770e.purchase(function1) | ((i2 & 112) == 32);
            Object m3681throw = c13770e.m3681throw();
            if (purchase || m3681throw == C2987e.ad) {
                m3681throw = new Celse(function1, this, 27);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC5190e.ad((Function0) m3681throw, interfaceC12864e, null, null, C3007e.ad(5), null, null, null, AbstractC16653e.license(1353331942, new C6599e(11, this), c13770e), c13770e, ((i2 << 3) & 112) | 805306368, 476);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C1743e((InterfaceC0284e) this, interfaceC12864e, i, 4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4341e)) {
            return false;
        }
        C4341e c4341e = (C4341e) obj;
        return this.ad.equals(c4341e.ad) && AbstractC7890e.billing(this.vip, c4341e.vip) && AbstractC7890e.billing(this.metrica, c4341e.metrica) && this.license.equals(c4341e.license);
    }

    public final int hashCode() {
        return this.license.ad.hashCode() + AbstractC1786e.advert(AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip), 31, this.metrica);
    }

    public final String toString() {
        return "DoubleGridItem(imageUrl=" + this.ad + ", title=" + this.vip + ", subtitle=" + this.metrica + ", onClick=" + this.license + ')';
    }
}
