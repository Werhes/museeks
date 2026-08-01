package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؑٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0026e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f1164e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f1165e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f1166e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f1167e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f1168e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f1169e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f1170e;

    public /* synthetic */ C0026e(C5958e c5958e, C0764e c0764e, C16929e c16929e, C0764e c0764e2, C2616e c2616e, C2616e c2616e2) {
        this.f1168e = 0;
        this.f1166e = c5958e;
        this.f1165e = c0764e;
        this.f1164e = c16929e;
        this.f1167e = c0764e2;
        this.f1170e = c2616e;
        this.f1169e = c2616e2;
    }

    public /* synthetic */ C0026e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f1168e = i;
        this.f1166e = obj;
        this.f1165e = obj2;
        this.f1167e = obj3;
        this.f1164e = obj4;
        this.f1170e = obj5;
        this.f1169e = obj6;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object c3025e;
        boolean z;
        switch (this.f1168e) {
            case 0:
                InterfaceC2566e interfaceC2566e = (InterfaceC2566e) this.f1166e;
                C0764e c0764e = (C0764e) this.f1165e;
                C16929e c16929e = (C16929e) this.f1164e;
                C0764e c0764e2 = (C0764e) this.f1167e;
                C2616e c2616e = (C2616e) this.f1170e;
                C2616e c2616e2 = (C2616e) this.f1169e;
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    InterfaceC12864e license = AbstractC14783e.license(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e), interfaceC2566e.ad(), null);
                    boolean purchase = c13770e.purchase(c0764e) | c13770e.yandex(c16929e) | c13770e.purchase(c0764e2) | c13770e.purchase(c2616e) | c13770e.purchase(c2616e2);
                    Object m3681throw = c13770e.m3681throw();
                    if (purchase || m3681throw == C2987e.ad) {
                        m3681throw = new C17151e(c0764e, c16929e, c0764e2, c2616e, c2616e2, 2);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC7023e.ad(license, null, null, null, null, null, false, null, (Function1) m3681throw, c13770e, 0, 510);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC2558e interfaceC2558e = (InterfaceC2558e) this.f1166e;
                String str = (String) this.f1165e;
                C12781e c12781e = (C12781e) this.f1167e;
                C12781e c12781e2 = (C12781e) this.f1164e;
                Function1 function1 = (Function1) this.f1170e;
                Function1 function12 = (Function1) this.f1169e;
                InterfaceC12123e interfaceC12123e2 = (InterfaceC12123e) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c13770e2.purchase(interfaceC12123e2) ? 4 : 2;
                }
                if (!c13770e2.m3673protected(intValue2 & 1, (intValue2 & 19) != 18)) {
                    c13770e2.m3659default();
                } else if (AbstractC7890e.billing(interfaceC2558e, C5842e.INSTANCE)) {
                    c13770e2.m3676strictfp(255194656);
                    AbstractC12185e.appmetrica(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e2), AbstractC12475e.metrica(R.drawable.ic_globe_outline_28, 0, c13770e2), AbstractC5297e.appmetrica(c13770e2, R.string.error_occurred), c13770e2, 64);
                    c13770e2.Signature(false);
                } else if (AbstractC7890e.billing(interfaceC2558e, C2471e.INSTANCE)) {
                    c13770e2.m3676strictfp(255570655);
                    AbstractC12185e.appmetrica(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e2), AbstractC12475e.metrica(R.drawable.ic_text_tt_outline_24, 0, c13770e2), AbstractC5297e.appmetrica(c13770e2, R.string.lrc_not_found), c13770e2, 64);
                    c13770e2.Signature(false);
                } else {
                    boolean z2 = interfaceC2558e instanceof C10874e;
                    C0115e c0115e = C0115e.f1276e;
                    if (z2) {
                        c13770e2.m3676strictfp(255985063);
                        C13964e billing = AbstractC16497e.billing(16);
                        InterfaceC12864e license2 = AbstractC13328e.license(AbstractC12220e.smaato(AbstractC18007e.metrica(AbstractC12220e.adcel(c0115e, interfaceC12123e2), 1.0f), 24, 0.0f, 2), AbstractC13328e.yandex());
                        boolean purchase2 = c13770e2.purchase(interfaceC2558e);
                        Object m3681throw2 = c13770e2.m3681throw();
                        if (purchase2 || m3681throw2 == C2987e.ad) {
                            m3681throw2 = new C6846e(14, interfaceC2558e);
                            c13770e2.m3682throws(m3681throw2);
                        }
                        AbstractC7023e.ad(license2, null, null, billing, null, null, false, null, (Function1) m3681throw2, c13770e2, 24576, 494);
                        c13770e2.Signature(false);
                    } else if (interfaceC2558e instanceof C0160e) {
                        c13770e2.m3676strictfp(257535404);
                        AbstractC12185e.purchase(str, (C0160e) interfaceC2558e, ((Number) c12781e.get()).intValue(), ((Number) c12781e2.get()).intValue(), function1, function12, AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e2), c13770e2, 0);
                        c13770e2.Signature(false);
                    } else {
                        if (interfaceC2558e != null) {
                            throw AbstractC1786e.loadAd(423875009, c13770e2, false);
                        }
                        c13770e2.m3676strictfp(258068604);
                        InterfaceC12864e premium = AbstractC12220e.adcel(c0115e, interfaceC12123e2).premium(AbstractC18007e.metrica);
                        InterfaceC2747e license3 = AbstractC17074e.license(C5438e.f11676e, false);
                        long j = c13770e2.f27286case;
                        int i = (int) (j ^ (j >>> 32));
                        InterfaceC3483e advert = c13770e2.advert();
                        InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e2, premium);
                        InterfaceC5685e.mopub.getClass();
                        C7309e c7309e = C2721e.vip;
                        c13770e2.m3666import();
                        if (c13770e2.f27292implements) {
                            c13770e2.mopub(c7309e);
                        } else {
                            c13770e2.m3684volatile();
                        }
                        AbstractC2270e.yandex(c13770e2, license3, C2721e.billing);
                        AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
                        AbstractC2270e.yandex(c13770e2, Integer.valueOf(i), C2721e.adcel);
                        AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                        AbstractC2270e.yandex(c13770e2, purchase3, C2721e.license);
                        AbstractC6232e.ad(C14486e.ad.ad(c0115e, C5438e.f11700e), ((C0896e) c13770e2.adcel(AbstractC3577e.ad)).license, ((C3618e) c13770e2.adcel(AbstractC0608e.ad)).ad, null, null, c13770e2, 0);
                        c13770e2.Signature(true);
                        c13770e2.Signature(false);
                    }
                }
                return Unit.INSTANCE;
            case 2:
                C8510e c8510e = (C8510e) this.f1166e;
                InterfaceC16132e interfaceC16132e = (InterfaceC16132e) this.f1165e;
                InterfaceC16132e interfaceC16132e2 = (InterfaceC16132e) this.f1167e;
                InterfaceC16132e interfaceC16132e3 = (InterfaceC16132e) this.f1164e;
                InterfaceC16132e interfaceC16132e4 = (InterfaceC16132e) this.f1170e;
                InterfaceC16132e interfaceC16132e5 = (InterfaceC16132e) this.f1169e;
                InterfaceC12123e interfaceC12123e3 = (InterfaceC12123e) obj;
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= c13770e3.purchase(interfaceC12123e3) ? 4 : 2;
                }
                if (!c13770e3.m3673protected(intValue3 & 1, (intValue3 & 19) != 18)) {
                    c13770e3.m3659default();
                } else if (((C9830e) interfaceC16132e5.getValue()).ad) {
                    c13770e3.m3676strictfp(391796761);
                    AbstractC0436e.ad(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e3), true, 0L, c13770e3, 48, 4);
                    c13770e3.Signature(false);
                } else if (!((C9830e) interfaceC16132e5.getValue()).vip || ((EnumC2646e) interfaceC16132e.getValue()) == EnumC2646e.f6519e) {
                    c13770e3.m3676strictfp(392323203);
                    InterfaceC12864e premium2 = AbstractC12220e.adcel(C0115e.f1276e, interfaceC12123e3).premium(AbstractC18007e.metrica);
                    C16005e appmetrica = AbstractC12220e.appmetrica(0.0f, 8, 0.0f, 0.0f, 13);
                    boolean purchase4 = c13770e3.purchase(interfaceC16132e) | c13770e3.purchase(interfaceC16132e2) | c13770e3.yandex(c8510e) | c13770e3.purchase(interfaceC16132e3) | c13770e3.purchase(interfaceC16132e4) | c13770e3.purchase(interfaceC16132e5);
                    Object m3681throw3 = c13770e3.m3681throw();
                    if (purchase4 || m3681throw3 == C2987e.ad) {
                        z = false;
                        c3025e = new C3025e(interfaceC16132e, (Object) c8510e, (Object) interfaceC16132e2, (Object) interfaceC16132e3, interfaceC16132e4, (Object) interfaceC16132e5, 4);
                        c13770e3.m3682throws(c3025e);
                    } else {
                        z = false;
                        c3025e = m3681throw3;
                    }
                    AbstractC7023e.ad(premium2, null, appmetrica, null, null, null, false, null, (Function1) c3025e, c13770e3, 384, 506);
                    c13770e3.Signature(z);
                } else {
                    c13770e3.m3676strictfp(392113085);
                    c8510e.m2436strictfp(c13770e3, 0);
                    c13770e3.Signature(false);
                }
                return Unit.INSTANCE;
            default:
                InterfaceC12123e interfaceC12123e4 = (InterfaceC12123e) this.f1166e;
                C2892e c2892e = (C2892e) this.f1165e;
                C2892e c2892e2 = (C2892e) this.f1167e;
                String str2 = (String) this.f1164e;
                C1839e c1839e = (C1839e) this.f1170e;
                C2892e c2892e3 = (C2892e) this.f1169e;
                Function2 function2 = (Function2) obj;
                C13770e c13770e4 = (C13770e) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= c13770e4.yandex(function2) ? 4 : 2;
                }
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 19) != 18)) {
                    InterfaceC12864e adcel = AbstractC12220e.adcel(C0115e.f1276e, interfaceC12123e4);
                    C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(8), C5438e.f11668e, c13770e4, 54);
                    long j2 = c13770e4.f27286case;
                    int i2 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert2 = c13770e4.advert();
                    InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e4, adcel);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e2 = C2721e.vip;
                    c13770e4.m3666import();
                    if (c13770e4.f27292implements) {
                        c13770e4.mopub(c7309e2);
                    } else {
                        c13770e4.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e4, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e4, advert2, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e4, Integer.valueOf(i2), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e4, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e4, purchase5, C2721e.license);
                    AbstractC1101e.ad(AbstractC8703e.loadAd(((C7019e) c13770e4.adcel(AbstractC11785e.ad)).ad.admob, AbstractC0608e.ad), AbstractC16653e.license(-1411180241, new C2779e(c2892e, c2892e2, str2, c1839e, function2, c2892e3), c13770e4), c13770e4, 56);
                    c13770e4.Signature(true);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
