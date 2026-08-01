package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٜۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16438e {
    public final int ad;
    public final Function0 license;
    public final boolean metrica;
    public final String vip;

    public C16438e(int i, String str, boolean z, Function0 function0) {
        this.ad = i;
        this.vip = str;
        this.metrica = z;
        this.license = function0;
    }

    public final void ad(C13770e c13770e, int i) {
        C2892e c2892e;
        c13770e.m3671package(1465887722);
        int i2 = 2;
        int i3 = (c13770e.purchase(this) ? 4 : 2) | i;
        byte b = 0;
        int i4 = 1;
        if (c13770e.m3673protected(i3 & 1, (i3 & 3) != 2)) {
            if (this.ad != 0) {
                c13770e.m3676strictfp(-966130374);
                C2892e license = AbstractC16653e.license(1380744742, new C7508e(this, b, b), c13770e);
                c13770e.Signature(false);
                c2892e = license;
            } else {
                c13770e.m3676strictfp(-965972461);
                c13770e.Signature(false);
                c2892e = null;
            }
            float f = AbstractC11992e.ad;
            AbstractC16429e.ad(AbstractC16653e.license(1209429960, new C7508e(this, i4, b), c13770e), AbstractC9546e.license(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), false, null, this.license, 15), null, null, c2892e, AbstractC16653e.license(-1767052211, new C7508e(this, i2, b), c13770e), AbstractC11992e.vip(0L, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.ad, c13770e, 16777207), 0.0f, 0.0f, c13770e, 196614, 396);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C7508e(this, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16438e)) {
            return false;
        }
        C16438e c16438e = (C16438e) obj;
        return this.ad == c16438e.ad && AbstractC7890e.billing(this.vip, c16438e.vip) && this.metrica == c16438e.metrica && this.license.equals(c16438e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + ((AbstractC1786e.advert(this.ad * 31, 31, this.vip) + (this.metrica ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "Action(icon=" + this.ad + ", title=" + this.vip + ", checked=" + this.metrica + ", onClick=" + this.license + ')';
    }
}
