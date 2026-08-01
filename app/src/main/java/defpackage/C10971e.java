package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10971e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C11188e f21729e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f21730e;

    public /* synthetic */ C10971e(C11188e c11188e, int i) {
        this.f21730e = i;
        this.f21729e = c11188e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f21730e;
        C5170e c5170e = C2987e.ad;
        C0115e c0115e = C0115e.f1276e;
        C11188e c11188e = this.f21729e;
        int i2 = 1;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    boolean yandex = c13770e.yandex(c11188e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == c5170e) {
                        m3681throw = new C0889e(c11188e, i2);
                        c13770e.m3682throws(m3681throw);
                    }
                    c11188e.m3043const((Function0) m3681throw, AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), 16, 0.0f, 2), c13770e, 48);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    c11188e.m3054switch(c13770e2, 0);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                    C11188e c11188e2 = this.f21729e;
                    c11188e2.m3052public(c11188e2.m3046e().license, c11188e2.m3046e().appmetrica, c11188e2.m3046e().purchase, c13770e3, 0);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C13770e c13770e4 = (C13770e) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 17) != 16)) {
                    c11188e.m3053return(c13770e4, 0);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                C13770e c13770e5 = (C13770e) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 17) != 16)) {
                    c11188e.m3055synchronized(c13770e5, 0);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                C13770e c13770e6 = (C13770e) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 17) != 16)) {
                    c11188e.m3045else(c13770e6, 0);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 6:
                C13770e c13770e7 = (C13770e) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 17) != 16)) {
                    c11188e.m3049for(c13770e7, 0);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e8 = (C13770e) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 17) != 16)) {
                    C13964e billing = AbstractC16497e.billing(8);
                    InterfaceC12864e mopub = AbstractC12220e.mopub(c0115e, 16);
                    C4789e ad = AbstractC14801e.ad(billing, C5438e.f11672e, c13770e8, 6);
                    long j = c13770e8.f27286case;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e8.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e8, mopub);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e8.m3666import();
                    if (c13770e8.f27292implements) {
                        c13770e8.mopub(c7309e);
                    } else {
                        c13770e8.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e8, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e8, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e8, Integer.valueOf(i3), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e8, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e8, purchase, C2721e.license);
                    String appmetrica = AbstractC5297e.appmetrica(c13770e8, R.string.cache_empty_page_title);
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e8.adcel(c15492e)).vip.purchase, c13770e8, 0, 0, 131070);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e8, R.string.cache_hint_library), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e8.adcel(c15492e)).vip.mopub, c13770e8, 0, 0, 131070);
                    boolean yandex2 = c13770e8.yandex(c11188e);
                    Object m3681throw2 = c13770e8.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        m3681throw2 = new C0889e(c11188e, 4);
                        c13770e8.m3682throws(m3681throw2);
                    }
                    InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
                    C3924e c3924e = ((C7019e) c13770e8.adcel(c15492e)).metrica.metrica;
                    C16005e c16005e = AbstractC10244e.ad;
                    AbstractC1513e.metrica((Function0) m3681throw2, metrica, false, c3924e, AbstractC10244e.appmetrica(((C7019e) c13770e8.adcel(c15492e)).ad.ad, c13770e8), null, null, AbstractC12475e.smaato, c13770e8, 805306416, 484);
                    c13770e8.Signature(true);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
