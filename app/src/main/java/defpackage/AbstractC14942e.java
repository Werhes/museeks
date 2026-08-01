package defpackage;

import android.content.res.Configuration;
import android.graphics.Color;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14942e {
    public static final void ad(C5181e c5181e, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i, int i2) {
        int i3;
        c13770e.m3671package(-1490397100);
        int i4 = (c13770e.purchase(c5181e) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (c13770e.purchase(interfaceC12864e) ? 32 : 16);
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 19) != 18)) {
            if (i5 != 0) {
                interfaceC12864e = C0115e.f1276e;
            }
            boolean license = c13770e.license(c5181e.ad);
            Object m3681throw = c13770e.m3681throw();
            if (license || m3681throw == C2987e.ad) {
                C3618e c3618e = new C3618e(AbstractC6532e.vip(Color.parseColor(c5181e.metrica)));
                c13770e.m3682throws(c3618e);
                m3681throw = c3618e;
            }
            vip(i3 & 112, ((C3618e) m3681throw).ad, c13770e, interfaceC12864e);
        } else {
            c13770e.m3659default();
        }
        InterfaceC12864e interfaceC12864e2 = interfaceC12864e;
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C0205e(c5181e, interfaceC12864e2, i, i2, 16);
        }
    }

    public static final void appmetrica(C12560e c12560e, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i, int i2) {
        InterfaceC12864e interfaceC12864e2;
        int i3;
        InterfaceC12864e interfaceC12864e3;
        boolean z = c12560e.license;
        Map map = c12560e.purchase;
        int i4 = c12560e.ad;
        c13770e.m3671package(-914505892);
        int i5 = i | (c13770e.yandex(c12560e) ? 4 : 2);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
            interfaceC12864e2 = interfaceC12864e;
        } else {
            interfaceC12864e2 = interfaceC12864e;
            i3 = i5 | (c13770e.purchase(interfaceC12864e2) ? 32 : 16);
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 19) != 18)) {
            InterfaceC12864e interfaceC12864e4 = i6 != 0 ? C0115e.f1276e : interfaceC12864e2;
            boolean license = c13770e.license(i4);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (license || m3681throw == c5170e) {
                C3618e c3618e = new C3618e(AbstractC6532e.vip(Color.parseColor((String) map.get("@windowBackground"))));
                c13770e.m3682throws(c3618e);
                m3681throw = c3618e;
            }
            long j = ((C3618e) m3681throw).ad;
            boolean license2 = c13770e.license(i4);
            Object m3681throw2 = c13770e.m3681throw();
            if (license2 || m3681throw2 == c5170e) {
                C3618e c3618e2 = new C3618e(AbstractC6532e.vip(Color.parseColor((String) map.get("bg_primary"))));
                c13770e.m3682throws(c3618e2);
                m3681throw2 = c3618e2;
            }
            long j2 = ((C3618e) m3681throw2).ad;
            boolean license3 = c13770e.license(i4);
            Object m3681throw3 = c13770e.m3681throw();
            if (license3 || m3681throw3 == c5170e) {
                C3618e c3618e3 = new C3618e(AbstractC6532e.vip(z ? 620756992 : 369098751));
                c13770e.m3682throws(c3618e3);
                m3681throw3 = c3618e3;
            }
            long j3 = ((C3618e) m3681throw3).ad;
            boolean license4 = c13770e.license(i4);
            Object m3681throw4 = c13770e.m3681throw();
            if (license4 || m3681throw4 == c5170e) {
                C3618e c3618e4 = new C3618e(AbstractC6532e.vip(z ? 1342177280 : 822083583));
                c13770e.m3682throws(c3618e4);
                m3681throw4 = c3618e4;
            }
            purchase(j, j2, j3, ((C3618e) m3681throw4).ad, interfaceC12864e4, c13770e, (i3 << 9) & 57344);
            interfaceC12864e3 = interfaceC12864e4;
        } else {
            c13770e.m3659default();
            interfaceC12864e3 = interfaceC12864e2;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C0205e(c12560e, interfaceC12864e3, i, i2, 17);
        }
    }

    public static final void license(int i, int i2, C13770e c13770e, InterfaceC12864e interfaceC12864e) {
        int i3;
        InterfaceC12864e interfaceC12864e2;
        c13770e.m3671package(-674566720);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 3) != 2)) {
            interfaceC12864e2 = i4 != 0 ? C0115e.f1276e : interfaceC12864e;
            C5015e c5015e = AbstractC2676e.ad;
            boolean purchase = c13770e.purchase((Configuration) c13770e.adcel(c5015e));
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (purchase || m3681throw == c5170e) {
                VKXApplication vKXApplication = VKXApplication.f36528e;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                m3681throw = new C10089e(vKXApplication);
                c13770e.m3682throws(m3681throw);
            }
            C10089e c10089e = (C10089e) m3681throw;
            boolean purchase2 = c13770e.purchase((Configuration) c13770e.adcel(c5015e));
            Object m3681throw2 = c13770e.m3681throw();
            if (purchase2 || m3681throw2 == c5170e) {
                m3681throw2 = Boolean.valueOf(AbstractC1129e.license);
                c13770e.m3682throws(m3681throw2);
            }
            boolean booleanValue = ((Boolean) m3681throw2).booleanValue();
            long vip = AbstractC6532e.vip(c10089e.ad(7));
            long vip2 = AbstractC6532e.vip(c10089e.vip(0.11f));
            boolean billing = c13770e.billing(booleanValue);
            Object m3681throw3 = c13770e.m3681throw();
            if (billing || m3681throw3 == c5170e) {
                m3681throw3 = new C3618e(AbstractC6532e.vip(booleanValue ? 620756992 : 369098751));
                c13770e.m3682throws(m3681throw3);
            }
            long j = ((C3618e) m3681throw3).ad;
            boolean billing2 = c13770e.billing(booleanValue);
            Object m3681throw4 = c13770e.m3681throw();
            if (billing2 || m3681throw4 == c5170e) {
                m3681throw4 = new C3618e(AbstractC6532e.vip(booleanValue ? 1342177280 : 822083583));
                c13770e.m3682throws(m3681throw4);
            }
            purchase(vip, vip2, j, ((C3618e) m3681throw4).ad, interfaceC12864e2, c13770e, (i3 << 12) & 57344);
        } else {
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2133e(interfaceC12864e2, i, i2, 2);
        }
    }

    public static final void metrica(int i, int i2, C13770e c13770e, InterfaceC12864e interfaceC12864e) {
        int i3;
        c13770e.m3671package(688216165);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                interfaceC12864e = C0115e.f1276e;
            }
            boolean purchase = c13770e.purchase((Configuration) c13770e.adcel(AbstractC2676e.ad));
            Object m3681throw = c13770e.m3681throw();
            if (purchase || m3681throw == C2987e.ad) {
                VKXApplication vKXApplication = VKXApplication.f36528e;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                m3681throw = new C10089e(vKXApplication);
                c13770e.m3682throws(m3681throw);
            }
            vip((i3 << 3) & 112, AbstractC6532e.vip(((C10089e) m3681throw).ad(1)), c13770e, interfaceC12864e);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2133e(interfaceC12864e, i, i2, 3);
        }
    }

    public static final void purchase(final long j, final long j2, long j3, long j4, final InterfaceC12864e interfaceC12864e, C13770e c13770e, final int i) {
        int i2;
        long j5;
        final long j6 = j3;
        c13770e.m3671package(-475752995);
        if ((i & 6) == 0) {
            i2 = (c13770e.appmetrica(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.appmetrica(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.appmetrica(j6) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.appmetrica(j4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? 16384 : 8192;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 9363) != 9362)) {
            float f = 8;
            C3924e ad = AbstractC6549e.ad(f);
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e startapp = AbstractC18007e.startapp(AbstractC12447e.vip(c0115e, ad).premium(interfaceC12864e), 56);
            C5100e c5100e = AbstractC10432e.ad;
            InterfaceC12864e metrica = AbstractC16136e.metrica(startapp, j2, c5100e);
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e, 0);
            long j7 = c13770e.f27286case;
            int i3 = (int) (j7 ^ (j7 >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, metrica);
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
            Integer valueOf = Integer.valueOf(i3);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase, c14865e4);
            float f2 = 4;
            AbstractC17074e.ad(AbstractC16136e.metrica(AbstractC18007e.license(AbstractC18007e.metrica(AbstractC12447e.vip(AbstractC12220e.loadAd(AbstractC12220e.smaato(c0115e, f, 0.0f, 2), 0.0f, f, 0.0f, f2, 5), AbstractC6549e.ad(f2)), 1.0f), 24), j, c5100e), c13770e, 0);
            InterfaceC12864e loadAd = AbstractC12220e.loadAd(AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), f, 0.0f, 2), 0.0f, f2, 0.0f, f, 5);
            C8587e ad3 = AbstractC6451e.ad(AbstractC16497e.billing(f2), C5438e.f11685e, c13770e, 6);
            long j8 = c13770e.f27286case;
            int i4 = (int) (j8 ^ (j8 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, loadAd);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad3, c14865e);
            AbstractC2270e.yandex(c13770e, advert2, c14865e2);
            AbstractC13501e.mopub(i4, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
            InterfaceC12864e vip = AbstractC12447e.vip(c0115e, AbstractC6549e.ad(f2));
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            float f3 = 12;
            j6 = j3;
            AbstractC17074e.ad(AbstractC16136e.metrica(AbstractC18007e.license(vip.premium(new C5228e(1.0f, true)), f3), j6, c5100e), c13770e, 0);
            InterfaceC12864e startapp2 = AbstractC18007e.startapp(AbstractC12447e.vip(c0115e, AbstractC6549e.ad(f2)), f3);
            j5 = j4;
            AbstractC17074e.ad(AbstractC16136e.metrica(startapp2, j5, c5100e), c13770e, 0);
            c13770e.Signature(true);
            c13770e.Signature(true);
        } else {
            j5 = j4;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            final long j9 = j5;
            subscription.license = new Function2() { // from class: eؙٗۤ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC14942e.purchase(j, j2, j6, j9, interfaceC12864e, (C13770e) obj, AbstractC5190e.advert(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void vip(int i, long j, C13770e c13770e, InterfaceC12864e interfaceC12864e) {
        int i2;
        c13770e.m3671package(-825969189);
        if ((i & 6) == 0) {
            i2 = i | (c13770e.appmetrica(j) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? 32 : 16;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            float f = 8;
            C3924e ad = AbstractC6549e.ad(f);
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e startapp = AbstractC18007e.startapp(AbstractC12447e.vip(c0115e, ad).premium(interfaceC12864e), 56);
            C15492e c15492e = AbstractC11785e.ad;
            long j2 = ((C7019e) c13770e.adcel(c15492e)).ad.subscription;
            C5100e c5100e = AbstractC10432e.ad;
            InterfaceC12864e metrica = AbstractC16136e.metrica(startapp, j2, c5100e);
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e, 0);
            long j3 = c13770e.f27286case;
            int i3 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, metrica);
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
            Integer valueOf = Integer.valueOf(i3);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase, c14865e4);
            float f2 = 4;
            InterfaceC12864e premium = AbstractC12220e.loadAd(AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), f, 0.0f, 2), 0.0f, f, 0.0f, f2, 5).premium(new C15061e(C5438e.f11678e));
            C8587e ad3 = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11685e, c13770e, 0);
            long j4 = c13770e.f27286case;
            int i4 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, premium);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad3, c14865e);
            AbstractC2270e.yandex(c13770e, advert2, c14865e2);
            AbstractC13501e.mopub(i4, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
            float f3 = 16;
            AbstractC17074e.ad(AbstractC16136e.metrica(AbstractC18007e.startapp(AbstractC12447e.vip(c0115e, AbstractC6549e.ad(f2)), f3), j, c5100e), c13770e, 0);
            double d = 1.0f;
            if (d <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            AbstractC12534e.ad(c13770e, new C5228e(1.0f, true));
            C3924e c3924e = AbstractC6549e.ad;
            InterfaceC12864e metrica2 = AbstractC16136e.metrica(AbstractC18007e.startapp(AbstractC12447e.vip(c0115e, c3924e), f3), j, c5100e);
            float f4 = 2;
            AbstractC17074e.ad(AbstractC16136e.metrica(AbstractC12447e.vip(AbstractC12220e.mopub(AbstractC16136e.metrica(AbstractC12447e.vip(AbstractC12220e.mopub(metrica2, f4), c3924e), ((C7019e) c13770e.adcel(c15492e)).ad.subscription, c5100e), f4), c3924e), j, c5100e), c13770e, 0);
            c13770e.Signature(true);
            InterfaceC12864e vip = AbstractC12447e.vip(AbstractC12220e.loadAd(AbstractC12220e.smaato(c0115e, f, 0.0f, 2), 0.0f, f2, 0.0f, f, 5), AbstractC6549e.ad(f2));
            if (d <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            InterfaceC12864e metrica3 = AbstractC16136e.metrica(AbstractC18007e.metrica(vip.premium(new C5228e(1.0f, true)), 1.0f), ((C7019e) c13770e.adcel(c15492e)).ad.ads, c5100e);
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
            long j5 = c13770e.f27286case;
            int i5 = (int) (j5 ^ (j5 >>> 32));
            InterfaceC3483e advert3 = c13770e.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, metrica3);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license, c14865e);
            AbstractC2270e.yandex(c13770e, advert3, c14865e2);
            AbstractC13501e.mopub(i5, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase3, c14865e4);
            float f5 = 24;
            AbstractC17074e.ad(AbstractC16136e.metrica(AbstractC18007e.license(AbstractC18007e.metrica(AbstractC12447e.vip(AbstractC1376e.ad(c0115e, 0.5f), AbstractC6549e.ad(f2)), 0.75f), f5), j, c5100e), c13770e, 0);
            AbstractC17074e.ad(AbstractC16136e.metrica(AbstractC18007e.license(AbstractC18007e.metrica(AbstractC12447e.vip(c0115e, AbstractC6549e.ad(f2)), 0.5f), f5), j, c5100e), c13770e, 0);
            c13770e.Signature(true);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C13581e(j, interfaceC12864e, i);
        }
    }
}
