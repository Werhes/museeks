package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؑٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12176e {
    public static final C2892e ad = new C2892e(-885150361, false, new C0972e(11));
    public static final C2892e vip = new C2892e(-969311258, false, new C0972e(12));

    public static final C5874e ad(boolean z) {
        return z ? new C5874e(0) : new C5874e(1);
    }

    public static C14734e appmetrica(AbstractC16904e abstractC16904e, EnumC17426e enumC17426e, C13770e c13770e, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && c13770e.purchase(abstractC16904e)) || (i & 6) == 4;
        Object m3681throw = c13770e.m3681throw();
        if (z || m3681throw == C2987e.ad) {
            m3681throw = new C14734e(abstractC16904e, enumC17426e);
            c13770e.m3682throws(m3681throw);
        }
        return (C14734e) m3681throw;
    }

    public static C9708e license(AbstractC16904e abstractC16904e, C16196e c16196e, C13770e c13770e, int i, int i2) {
        int i3 = 1;
        if ((i2 & 2) != 0) {
            c16196e = new C16196e(1);
        }
        C15217e ad2 = AbstractC9571e.ad(c13770e);
        C0763e c0763e = AbstractC5392e.ad;
        C13540e purchase = AbstractC12696e.purchase(0.0f, 400.0f, Float.valueOf(1), 1);
        Object obj = (InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex);
        EnumC7792e enumC7792e = (EnumC7792e) c13770e.adcel(AbstractC11473e.amazon);
        boolean purchase2 = ((((i & 14) ^ 6) > 4 && c13770e.purchase(abstractC16904e)) || (i & 6) == 4) | c13770e.purchase(ad2) | c13770e.purchase(purchase) | ((((i & 112) ^ 48) > 32 && c13770e.purchase(c16196e)) || (i & 48) == 32) | c13770e.purchase(obj) | c13770e.license(enumC7792e.ordinal());
        Object m3681throw = c13770e.m3681throw();
        if (purchase2 || m3681throw == C2987e.ad) {
            C18478e c18478e = new C18478e(27, abstractC16904e, new C11828e(abstractC16904e, enumC7792e, i3), c16196e);
            float f = AbstractC2650e.ad;
            m3681throw = new C9708e(c18478e, ad2, purchase);
            c13770e.m3682throws(m3681throw);
        }
        return (C9708e) m3681throw;
    }

    public static final int metrica(int i) {
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            return 3;
        }
        if (m2467class == 1) {
            return 1;
        }
        if (m2467class == 2) {
            return 2;
        }
        throw new C14803e(10);
    }

    public static C10761e vip(int i, C1812e c1812e) {
        return new C10761e(i, c1812e, new C7282e(new InterfaceC1039e[0]));
    }
}
