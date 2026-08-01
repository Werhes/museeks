package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؒۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1545e implements InterfaceC0284e {
    public final String ad;
    public final String vip;

    public C1545e(String str, String str2) {
        this.ad = str;
        this.vip = str2;
    }

    @Override // defpackage.InterfaceC0284e
    public final void ad(InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        c13770e.m3671package(-668439874);
        int i2 = (c13770e.purchase(this) ? 32 : 16) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 17) != 16)) {
            Function1 function1 = (Function1) c13770e.adcel(AbstractC10577e.ad);
            boolean purchase = c13770e.purchase(function1) | ((i2 & 112) == 32);
            Object m3681throw = c13770e.m3681throw();
            if (purchase || m3681throw == C2987e.ad) {
                m3681throw = new C4338e(function1, this);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC5190e.ad((Function0) m3681throw, AbstractC18007e.smaato(AbstractC18007e.license(C0115e.f1276e, 64), 200), null, null, null, null, null, null, AbstractC16653e.license(1913625608, new C6599e(0, this), c13770e), c13770e, 805306416, 508);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C1743e((InterfaceC0284e) this, interfaceC12864e, i, 3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1545e)) {
            return false;
        }
        C1545e c1545e = (C1545e) obj;
        if (!this.ad.equals(c1545e.ad) || !AbstractC7890e.billing(this.vip, c1545e.vip)) {
            return false;
        }
        C11747e c11747e = C11747e.ad;
        return c11747e.equals(c11747e);
    }

    public final int hashCode() {
        return ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31) + 361106348;
    }

    public final String toString() {
        return "CroppedImageCard(imageUrl=" + this.ad + ", title=" + this.vip + ", onClick=" + C11747e.ad + ')';
    }
}
