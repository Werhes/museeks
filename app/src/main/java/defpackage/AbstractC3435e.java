package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕ٘ٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3435e {
    public static final C12776e ad;

    static {
        C5015e c5015e = AbstractC12710e.ad;
        long j = C3618e.appmetrica;
        long j2 = C3618e.vip;
        ad = new C12776e(j, j2, j2, C3618e.vip(0.38f, j2), C3618e.vip(0.38f, j2));
    }

    public static final void ad(C12776e c12776e, InterfaceC12864e interfaceC12864e, C2892e c2892e, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(-527864079);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(c12776e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(c2892e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            InterfaceC12864e purchase = AbstractC5967e.purchase(AbstractC12220e.smaato(AbstractC17113e.billing(AbstractC16136e.metrica(AbstractC16398e.license(interfaceC12864e, AbstractC16226e.license, AbstractC6549e.ad(AbstractC16226e.appmetrica), false, 28), c12776e.ad, AbstractC10432e.ad), 2), 0.0f, AbstractC16226e.startapp, 1), AbstractC5967e.appmetrica(c13770e), true);
            int i3 = (i2 << 3) & 7168;
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e, 0);
            long j = c13770e.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, purchase);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad2, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i4), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase2, C2721e.license);
            c2892e.invoke(C0283e.ad, c13770e, Integer.valueOf(((i3 >> 6) & 112) | 6));
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9381e(i, 9, c12776e, interfaceC12864e, c2892e);
        }
    }

    public static final void metrica(String str, boolean z, C12776e c12776e, InterfaceC12864e interfaceC12864e, Function3 function3, Function0 function0, C13770e c13770e, int i) {
        int i2;
        int i3;
        c13770e.m3671package(-2001167027);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.billing(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.purchase(c12776e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e.yandex(function3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c13770e.yandex(function0) ? 131072 : 65536;
        }
        if (c13770e.m3673protected(i2 & 1, (74899 & i2) != 74898)) {
            C14544e c14544e = AbstractC16226e.purchase;
            C17354e c17354e = AbstractC16497e.ad;
            float f = AbstractC16226e.yandex;
            C13964e billing = AbstractC16497e.billing(f);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 458752) == 131072);
            Object m3681throw = c13770e.m3681throw();
            if (z2 || m3681throw == C2987e.ad) {
                m3681throw = new C1411e(z, function0, 0);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC12864e metrica = AbstractC18007e.metrica(AbstractC9546e.license(interfaceC12864e, z, str, (Function0) m3681throw, 12), 1.0f);
            float f2 = AbstractC16226e.ad;
            float f3 = AbstractC16226e.vip;
            float f4 = AbstractC16226e.metrica;
            InterfaceC12864e smaato = AbstractC12220e.smaato(AbstractC18007e.mopub(metrica, f2, f4, f3, f4), f, 0.0f, 2);
            C8587e ad2 = AbstractC6451e.ad(billing, c14544e, c13770e, 54);
            long j = c13770e.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, smaato);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e, ad2, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i4);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase, c14865e4);
            if (function3 == null) {
                c13770e.m3676strictfp(-1597947094);
                c13770e.Signature(false);
                i3 = i2;
            } else {
                c13770e.m3676strictfp(-1597947093);
                float f5 = AbstractC16226e.adcel;
                InterfaceC12864e yandex = AbstractC18007e.yandex(C0115e.f1276e, f5, 0.0f, f5, f5, 2);
                InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
                i3 = i2;
                long j2 = c13770e.f27286case;
                int i5 = (int) (j2 ^ (j2 >>> 32));
                InterfaceC3483e advert2 = c13770e.advert();
                InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, yandex);
                c13770e.m3666import();
                if (c13770e.f27292implements) {
                    c13770e.mopub(c7309e);
                } else {
                    c13770e.m3684volatile();
                }
                AbstractC2270e.yandex(c13770e, license, c14865e);
                AbstractC2270e.yandex(c13770e, advert2, c14865e2);
                AbstractC13501e.mopub(i5, c13770e, c14865e3, c13770e, c5430e);
                AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
                function3.invoke(new C3618e(z ? c12776e.metrica : c12776e.appmetrica), c13770e, 0);
                c13770e.Signature(true);
                c13770e.Signature(false);
            }
            C1839e c1839e = new C1839e(z ? c12776e.vip : c12776e.license, AbstractC16226e.smaato, AbstractC16226e.amazon, null, AbstractC16226e.Signature, 0L, AbstractC16226e.billing, 0, AbstractC16226e.loadAd, 16613240);
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            AbstractC2270e.vip(str, new C5228e(1.0f, true), c1839e, null, 0, false, 1, 0, c13770e, (i3 & 14) | 1572864, 952);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4982e(str, z, c12776e, interfaceC12864e, function3, function0, i);
        }
    }

    public static final void vip(InterfaceC12864e interfaceC12864e, C12776e c12776e, Function1 function1, C13770e c13770e, int i, int i2) {
        int i3;
        int i4;
        c13770e.m3671package(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (c13770e.purchase(c12776e) ? 32 : 16);
        }
        int i7 = i4 | (c13770e.yandex(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e.m3673protected(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                interfaceC12864e = C0115e.f1276e;
            }
            if (i6 != 0) {
                c12776e = ad;
            }
            ad(c12776e, interfaceC12864e, AbstractC16653e.license(-250345048, new C17630e(function1, c12776e, 10), c13770e), c13770e, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            c13770e.m3659default();
        }
        InterfaceC12864e interfaceC12864e2 = interfaceC12864e;
        C12776e c12776e2 = c12776e;
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9381e(i, i2, 8, interfaceC12864e2, c12776e2, function1);
        }
    }
}
