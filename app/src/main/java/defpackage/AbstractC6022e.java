package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۤٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6022e {
    public static final void ad(int i, int i2, C13770e c13770e) {
        c13770e.m3671package(1268410940);
        int i3 = (c13770e.license(i) ? 4 : 2) | i2 | (c13770e.license(R.drawable.ic_playlist_32) ? 32 : 16);
        if (c13770e.m3673protected(i3 & 1, (i3 & 19) != 18)) {
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e license = AbstractC18007e.license(AbstractC18007e.metrica(c0115e, 1.0f), 100);
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11700e, false);
            long j = c13770e.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, license);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e, license2, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i4);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase, c14865e4);
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(8), C5438e.f11668e, c13770e, 54);
            long j2 = c13770e.f27286case;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, c0115e);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad, c14865e);
            AbstractC2270e.yandex(c13770e, advert2, c14865e2);
            AbstractC13501e.mopub(i5, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
            AbstractC10727e metrica = AbstractC12475e.metrica(i, i3 & 14, c13770e);
            C15492e c15492e = AbstractC11785e.ad;
            float f = 48;
            AbstractC5647e.vip(metrica, null, AbstractC18007e.startapp(c0115e, f), ((C7019e) c13770e.adcel(c15492e)).ad.admob, c13770e, 440, 0);
            AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_arrow_right_outline_28, 0, c13770e), null, AbstractC12220e.mopub(AbstractC18007e.startapp(c0115e, 56), 10), ((C7019e) c13770e.adcel(c15492e)).ad.remoteconfig, c13770e, 440, 0);
            AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_playlist_32, (i3 >> 3) & 14, c13770e), null, AbstractC18007e.startapp(c0115e, f), ((C7019e) c13770e.adcel(c15492e)).ad.admob, c13770e, 440, 0);
            c13770e.Signature(true);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2172e(i, i2);
        }
    }

    public static final InterfaceC12864e appmetrica(InterfaceC12864e interfaceC12864e, boolean z, C15274e c15274e) {
        return interfaceC12864e.premium(z ? new C2776e(c15274e) : C0115e.f1276e);
    }

    public static final boolean billing(int i, String str) {
        char charAt = str.charAt(i);
        return 'A' <= charAt && charAt < '[';
    }

    public static final InterfaceC12864e license(InterfaceC12864e interfaceC12864e) {
        return interfaceC12864e.premium(C3952e.f8821e);
    }

    public static final String metrica(String str) {
        char charAt;
        if (str.length() == 0 || 'a' > (charAt = str.charAt(0)) || charAt >= '{') {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(Character.toUpperCase(charAt));
        sb.append((CharSequence) str, 1, str.length());
        return sb.toString();
    }

    public static /* synthetic */ InterfaceC12864e purchase(InterfaceC12864e interfaceC12864e, C15274e c15274e, int i) {
        if ((i & 2) != 0) {
            c15274e = null;
        }
        return appmetrica(interfaceC12864e, true, c15274e);
    }

    public static final String startapp(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static final void vip(C9553e c9553e, C2892e c2892e, C13770e c13770e, int i, int i2) {
        C9553e c9553e2;
        int i3;
        C9553e c9553e3;
        C9553e c9553e4;
        c13770e.m3671package(-480898462);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            c9553e2 = c9553e;
        } else {
            c9553e2 = c9553e;
            i3 = i | (c13770e.purchase(c9553e2) ? 4 : 2);
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                Object m3681throw = c13770e.m3681throw();
                if (m3681throw == C2987e.ad) {
                    m3681throw = AbstractC17202e.license(AbstractC15933e.appmetrica.metrica);
                    c13770e.m3682throws(m3681throw);
                }
                c9553e4 = (C9553e) m3681throw;
            } else {
                c9553e4 = c9553e2;
            }
            C1839e c1839e = AbstractC0903e.billing(c13770e).startapp;
            C1839e c1839e2 = AbstractC16795e.license;
            C1839e appmetrica = c1839e.appmetrica(c1839e2);
            C1839e appmetrica2 = AbstractC0903e.billing(c13770e).yandex.appmetrica(c1839e2);
            C1839e appmetrica3 = AbstractC0903e.billing(c13770e).billing.appmetrica(c1839e2);
            C1839e appmetrica4 = AbstractC0903e.billing(c13770e).purchase.appmetrica(c1839e2);
            C1839e appmetrica5 = AbstractC0903e.billing(c13770e).appmetrica.appmetrica(c1839e2);
            AbstractC11785e.ad(c9553e4, C10311e.ad, new C17500e(AbstractC6549e.ad(8), 30), new C0984e(AbstractC0903e.billing(c13770e).ad.appmetrica(c1839e2), AbstractC0903e.billing(c13770e).vip.appmetrica(c1839e2), AbstractC0903e.billing(c13770e).metrica.appmetrica(c1839e2), AbstractC0903e.billing(c13770e).license.appmetrica(c1839e2), appmetrica5, appmetrica4, appmetrica3, appmetrica2, appmetrica, 32256), c2892e, c13770e, (i3 & 14) | 24576);
            c9553e3 = c9553e4;
        } else {
            c13770e.m3659default();
            c9553e3 = c9553e2;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C0205e(c9553e3, c2892e, i, i2, 26);
        }
    }

    public static final C18013e yandex(C17974e c17974e, InterfaceC15348e interfaceC15348e, LongPointerWrapper longPointerWrapper, boolean z, boolean z2) {
        return new C18013e(c17974e, interfaceC15348e, AbstractC6503e.ad(AbstractC3820e.ad.vip(String.class)), longPointerWrapper, z, z2);
    }
}
