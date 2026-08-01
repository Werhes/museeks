package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Collections;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٜؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1743e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f4741e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f4742e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4743e;

    public /* synthetic */ C1743e(InterfaceC0284e interfaceC0284e, InterfaceC12864e interfaceC12864e, int i, int i2) {
        this.f4743e = i2;
        this.f4741e = interfaceC0284e;
        this.f4742e = interfaceC12864e;
    }

    public /* synthetic */ C1743e(Object obj, Object obj2, int i) {
        this.f4743e = i;
        this.f4742e = obj;
        this.f4741e = obj2;
    }

    public /* synthetic */ C1743e(Object obj, Object obj2, int i, int i2) {
        this.f4743e = i2;
        this.f4742e = obj;
        this.f4741e = obj2;
    }

    public /* synthetic */ C1743e(Function1 function1, InterfaceC3314e interfaceC3314e) {
        this.f4743e = 28;
        this.f4741e = function1;
        this.f4742e = interfaceC3314e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C2038e c2038e;
        Object c17011e;
        int i = this.f4743e;
        C5170e c5170e = C2987e.ad;
        C5100e c5100e = AbstractC10432e.ad;
        C0115e c0115e = C0115e.f1276e;
        int i2 = 2;
        Object obj3 = this.f4741e;
        Object obj4 = this.f4742e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC2641e.ad((InterfaceC12864e) obj4, (Function1) obj3, (C13770e) obj, AbstractC5190e.advert(7));
                return Unit.INSTANCE;
            case 1:
                final C5929e c5929e = (C5929e) obj4;
                C0576e c0576e = c5929e.f12506e;
                C6260e c6260e = (C6260e) obj3;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    float f = 16;
                    float ad = ((C0916e) c13770e.adcel(AbstractC12450e.ad)).ad(c13770e) + f;
                    C0115e c0115e2 = C0115e.f1276e;
                    InterfaceC12864e billing = AbstractC5400e.billing(AbstractC12220e.loadAd(c0115e2, f, 0.0f, f, ad, 2), AbstractC5400e.adcel);
                    C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11678e, c13770e, 48);
                    long j = c13770e.f27286case;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, billing);
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
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    C8464e.ad.ad(null, 0.0f, 0.0f, null, 0L, c13770e, 196608, 31);
                    AbstractC8461e.vip((String) c5929e.f12504e.getValue(), "CAPTCHA Code", AbstractC12447e.vip(AbstractC18007e.license(AbstractC18007e.metrica(c0115e2, 1.0f), 120), AbstractC0903e.purchase(c13770e).metrica), new C6159e(AbstractC0903e.license(c13770e).subscription), new C6159e(AbstractC0903e.license(c13770e).subscription), C16477e.purchase, c13770e, 36912, 6, 31712);
                    AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e2, f));
                    String str = (String) c0576e.getValue();
                    C4988e c4988e = new C4988e(6, 7, 115);
                    boolean yandex = c13770e.yandex(c5929e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == c5170e) {
                        final int i4 = 0;
                        m3681throw = new Function1() { // from class: eؔ٘ۥ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                switch (i4) {
                                    case 0:
                                        C5929e c5929e2 = c5929e;
                                        c5929e2.f12502e = true;
                                        c5929e2.f12507e.invoke(AbstractC10064e.yandex(c5929e2.f12503e, Collections.singletonMap("captcha_key", (String) c5929e2.f12506e.getValue())));
                                        c5929e2.purchase();
                                        return Unit.INSTANCE;
                                    default:
                                        c5929e.f12506e.setValue((String) obj5);
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e.m3682throws(m3681throw);
                    }
                    C16636e c16636e = new C16636e((Function1) m3681throw, null, 62);
                    C3924e c3924e = AbstractC0903e.purchase(c13770e).metrica;
                    C18121e c18121e = C18121e.ad;
                    C17085e license = C18121e.license(AbstractC0903e.license(c13770e).subscription, AbstractC0903e.license(c13770e).subscription, AbstractC0903e.license(c13770e).subscription, 0L, c13770e, 2147483535);
                    InterfaceC12864e license2 = AbstractC18366e.license(AbstractC18007e.metrica(c0115e2, 1.0f).premium(C10759e.f21180e), c6260e);
                    boolean yandex2 = c13770e.yandex(c5929e);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        final int i5 = 1;
                        m3681throw2 = new Function1() { // from class: eؔ٘ۥ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                switch (i5) {
                                    case 0:
                                        C5929e c5929e2 = c5929e;
                                        c5929e2.f12502e = true;
                                        c5929e2.f12507e.invoke(AbstractC10064e.yandex(c5929e2.f12503e, Collections.singletonMap("captcha_key", (String) c5929e2.f12506e.getValue())));
                                        c5929e2.purchase();
                                        return Unit.INSTANCE;
                                    default:
                                        c5929e.f12506e.setValue((String) obj5);
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e.m3682throws(m3681throw2);
                    }
                    AbstractC11257e.metrica(str, (Function1) m3681throw2, license2, false, null, AbstractC0179e.ad, null, null, null, false, null, c4988e, c16636e, true, 0, 0, c3924e, license, c13770e, 1572864, 12779520, 1867704);
                    AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e2, f));
                    boolean yandex3 = c13770e.yandex(c5929e);
                    Object m3681throw3 = c13770e.m3681throw();
                    if (yandex3 || m3681throw3 == c5170e) {
                        C12829e c12829e = new C12829e(0, c5929e, C5929e.class, "submitCaptcha", "submitCaptcha()V", 0, 0, 10);
                        c13770e.m3682throws(c12829e);
                        m3681throw3 = c12829e;
                    }
                    AbstractC1513e.ad((Function0) ((InterfaceC5261e) m3681throw3), AbstractC18007e.metrica(c0115e2, 1.0f), ((String) c0576e.getValue()).length() > 0, AbstractC0903e.purchase(c13770e).metrica, null, null, null, new C16005e(f, f, f, f), AbstractC0179e.vip, c13770e, 817889328, 368);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ((C13314e) obj3).ad((InterfaceC12864e) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ((C1545e) obj3).ad((InterfaceC12864e) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ((C4341e) obj3).ad((InterfaceC12864e) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ((C16641e) obj3).ad((InterfaceC12864e) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 6:
                InterfaceC2566e interfaceC2566e = (InterfaceC2566e) obj4;
                C5016e c5016e = (C5016e) obj3;
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C16005e c16005e = AbstractC9083e.ad;
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC3265e.ad, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e2.adcel(c15492e)).ad.Signature, c5100e), null, AbstractC16653e.license(1588641446, new C16133e(c5016e), c13770e2), null, null, 0.0f, 0.0f, null, AbstractC9083e.license(((C7019e) c13770e2.adcel(c15492e)).ad.Signature, ((C7019e) c13770e2.adcel(c15492e)).ad.subscription, 0L, c13770e2, 28), interfaceC2566e, c13770e2, 3078, 500);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                ((C3409e) obj4).m1355private((Function0) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 8:
                Function0 function0 = (Function0) obj4;
                Function0 function02 = (Function0) obj3;
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    C14544e c14544e = C5438e.f11668e;
                    InterfaceC12864e smaato = AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), 16, 0.0f, 2);
                    C8587e ad3 = AbstractC6451e.ad(AbstractC16497e.ad, c14544e, c13770e3, 48);
                    long j2 = c13770e3.f27286case;
                    int i6 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert2 = c13770e3.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e3, smaato);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e2 = C2721e.vip;
                    c13770e3.m3666import();
                    if (c13770e3.f27292implements) {
                        c13770e3.mopub(c7309e2);
                    } else {
                        c13770e3.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e3, ad3, C2721e.billing);
                    AbstractC2270e.yandex(c13770e3, advert2, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e3, Integer.valueOf(i6), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e3, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e3, purchase2, C2721e.license);
                    AbstractC1513e.license(function0, null, false, null, null, null, AbstractC0882e.purchase, c13770e3, 805306368, 510);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    AbstractC17074e.ad(new C5228e(1.0f, true), c13770e3, 0);
                    AbstractC1513e.ad(function02, null, false, null, null, null, null, null, AbstractC0882e.billing, c13770e3, 805306368, 510);
                    c13770e3.Signature(true);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 9:
                C2892e c2892e = (C2892e) obj4;
                C16646e c16646e = (C16646e) obj3;
                C13770e c13770e4 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    c2892e.invoke(c16646e, c13770e4, 6);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 10:
                InterfaceC2566e interfaceC2566e2 = (InterfaceC2566e) obj4;
                C13877e c13877e = (C13877e) obj3;
                C13770e c13770e5 = (C13770e) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 3) != 2)) {
                    C16005e c16005e2 = AbstractC9083e.ad;
                    C15492e c15492e2 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC9947e.ad, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e5.adcel(c15492e2)).ad.Signature, c5100e), null, AbstractC16653e.license(1559129380, new C12989e(c13877e, i2, (byte) 0), c13770e5), null, null, 0.0f, 0.0f, ((C0916e) c13770e5.adcel(AbstractC12450e.ad)).appmetrica(c13770e5), AbstractC9083e.license(((C7019e) c13770e5.adcel(c15492e2)).ad.Signature, ((C7019e) c13770e5.adcel(c15492e2)).ad.subscription, 0L, c13770e5, 28), interfaceC2566e2, c13770e5, 3078, 244);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 11:
                InterfaceC2566e interfaceC2566e3 = (InterfaceC2566e) obj4;
                C3248e c3248e = (C3248e) obj3;
                C13770e c13770e6 = (C13770e) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 3) != 2)) {
                    C16005e c16005e3 = AbstractC9083e.ad;
                    C15492e c15492e3 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC12547e.ad, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e6.adcel(c15492e3)).ad.Signature, c5100e), null, AbstractC16653e.license(-148603516, new C18153e(c3248e, i2, (byte) 0), c13770e6), null, null, 0.0f, 0.0f, ((C0916e) c13770e6.adcel(AbstractC12450e.ad)).appmetrica(c13770e6), AbstractC9083e.license(((C7019e) c13770e6.adcel(c15492e3)).ad.Signature, ((C7019e) c13770e6.adcel(c15492e3)).ad.subscription, 0L, c13770e6, 28), interfaceC2566e3, c13770e6, 3078, 244);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC2003e.appmetrica((InterfaceC10545e) obj4, (HashSet) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                AbstractC11261e.ad((InterfaceC7189e) obj4, (C2892e) obj3, (C13770e) obj, AbstractC5190e.advert(3073));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                ((C3566e) obj4).isPro((InterfaceC8346e) obj3, (C13770e) obj, AbstractC5190e.advert(49));
                return Unit.INSTANCE;
            case 15:
                C2038e c2038e2 = (C2038e) obj4;
                final C15754e c15754e = (C15754e) obj3;
                C13770e c13770e7 = (C13770e) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 3) != 2)) {
                    boolean yandex4 = c13770e7.yandex(c2038e2);
                    Object m3681throw4 = c13770e7.m3681throw();
                    if (yandex4 || m3681throw4 == c5170e) {
                        c2038e = c2038e2;
                        c17011e = new C17011e(0, c2038e, C2038e.class, "restoreQueue", "restoreQueue()V", 0, 0, 8);
                        c13770e7.m3682throws(c17011e);
                    } else {
                        c2038e = c2038e2;
                        c17011e = m3681throw4;
                    }
                    final byte b = 0;
                    final int i7 = 1;
                    c2038e.ad(AbstractC16653e.license(1271052234, new C18264e(c2038e, i2, b), c13770e7), AbstractC16653e.license(459768328, new Function2() { // from class: eٗؗۤ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            switch (b) {
                                case 0:
                                    C13770e c13770e8 = (C13770e) obj5;
                                    int intValue8 = ((Integer) obj6).intValue();
                                    if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 3) != 2)) {
                                        AbstractC14489e.vip(c15754e.ad, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e8, 0, 24960, 241662);
                                    } else {
                                        c13770e8.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    C13770e c13770e9 = (C13770e) obj5;
                                    int intValue9 = ((Integer) obj6).intValue();
                                    if (c13770e9.m3673protected(intValue9 & 1, (intValue9 & 3) != 2)) {
                                        AbstractC14489e.vip(c15754e.vip, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e9, 0, 24960, 241662);
                                    } else {
                                        c13770e9.m3659default();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, c13770e7), AbstractC16653e.license(-2093357273, new Function2() { // from class: eٗؗۤ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            switch (i7) {
                                case 0:
                                    C13770e c13770e8 = (C13770e) obj5;
                                    int intValue8 = ((Integer) obj6).intValue();
                                    if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 3) != 2)) {
                                        AbstractC14489e.vip(c15754e.ad, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e8, 0, 24960, 241662);
                                    } else {
                                        c13770e8.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    C13770e c13770e9 = (C13770e) obj5;
                                    int intValue9 = ((Integer) obj6).intValue();
                                    if (c13770e9.m3673protected(intValue9 & 1, (intValue9 & 3) != 2)) {
                                        AbstractC14489e.vip(c15754e.vip, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e9, 0, 24960, 241662);
                                    } else {
                                        c13770e9.m3659default();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, c13770e7), AbstractC16653e.license(-351515578, new C18264e(c2038e, 3, b), c13770e7), (Function0) ((InterfaceC5261e) c17011e), c13770e7, 224694);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                ((C18478e) obj4).admob((C3274e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                InterfaceC2566e interfaceC2566e4 = (InterfaceC2566e) obj4;
                C16929e c16929e = (C16929e) obj3;
                C13770e c13770e8 = (C13770e) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 3) != 2)) {
                    C16005e c16005e4 = AbstractC9083e.ad;
                    C15492e c15492e4 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC15920e.ad, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e8.adcel(c15492e4)).ad.Signature, c5100e), null, AbstractC16653e.license(-1990479226, new C3627e(c16929e), c13770e8), null, null, 0.0f, 0.0f, ((C0916e) c13770e8.adcel(AbstractC12450e.ad)).appmetrica(c13770e8), AbstractC9083e.license(((C7019e) c13770e8.adcel(c15492e4)).ad.Signature, ((C7019e) c13770e8.adcel(c15492e4)).ad.Signature, 0L, c13770e8, 28), interfaceC2566e4, c13770e8, 3078, 244);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((Integer) obj2).getClass();
                ((C8024e) obj4).ad((C12776e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                InterfaceC2566e interfaceC2566e5 = (InterfaceC2566e) obj4;
                C11522e c11522e = (C11522e) obj3;
                C13770e c13770e9 = (C13770e) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if (c13770e9.m3673protected(intValue9 & 1, (intValue9 & 3) != 2)) {
                    C16005e c16005e5 = AbstractC9083e.ad;
                    C15492e c15492e5 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC17140e.ad, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e9.adcel(c15492e5)).ad.Signature, c5100e), null, AbstractC16653e.license(2083167693, new C9455e(c11522e), c13770e9), null, null, 0.0f, 0.0f, ((C0916e) c13770e9.adcel(AbstractC12450e.ad)).appmetrica(c13770e9), AbstractC9083e.license(((C7019e) c13770e9.adcel(c15492e5)).ad.Signature, ((C7019e) c13770e9.adcel(c15492e5)).ad.subscription, 0L, c13770e9, 28), interfaceC2566e5, c13770e9, 3078, 244);
                } else {
                    c13770e9.m3659default();
                }
                return Unit.INSTANCE;
            case 20:
                C0458e c0458e = (C0458e) obj4;
                C16330e c16330e = (C16330e) obj3;
                C13770e c13770e10 = (C13770e) obj;
                int intValue10 = ((Integer) obj2).intValue();
                boolean z = (intValue10 & 3) != 2;
                AbstractC7919e abstractC7919e = c13770e10.ad;
                if (c13770e10.m3673protected(intValue10 & 1, z)) {
                    float f2 = 16;
                    float ad4 = ((C0916e) c13770e10.adcel(AbstractC12450e.ad)).ad(c13770e10) + f2;
                    C0115e c0115e3 = C0115e.f1276e;
                    InterfaceC12864e loadAd = AbstractC12220e.loadAd(c0115e3, f2, 0.0f, f2, ad4, 2);
                    C4789e ad5 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11678e, c13770e10, 48);
                    long j3 = c13770e10.f27286case;
                    int i8 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert3 = c13770e10.advert();
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e10, loadAd);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e3 = C2721e.vip;
                    c13770e10.m3666import();
                    if (c13770e10.f27292implements) {
                        c13770e10.mopub(c7309e3);
                    } else {
                        c13770e10.m3684volatile();
                    }
                    C14865e c14865e = C2721e.billing;
                    AbstractC2270e.yandex(c13770e10, ad5, c14865e);
                    C14865e c14865e2 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e10, advert3, c14865e2);
                    Integer valueOf = Integer.valueOf(i8);
                    C14865e c14865e3 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e10, valueOf, c14865e3);
                    C5430e c5430e = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e10, c5430e);
                    C14865e c14865e4 = C2721e.license;
                    AbstractC2270e.yandex(c13770e10, purchase3, c14865e4);
                    C8464e.ad.ad(null, 0.0f, 0.0f, null, 0L, c13770e10, 196608, 31);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e10, R.string.vkx_hold_on), AbstractC18007e.metrica(c0115e3, 1.0f), AbstractC0903e.license(c13770e10).admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e10).appmetrica, c13770e10, 48, 0, 130040);
                    AbstractC12534e.ad(c13770e10, AbstractC18007e.license(c0115e3, f2));
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e10, R.string.exp_no_crypt_dialog_text), AbstractC18007e.metrica(c0115e3, 1.0f), AbstractC0903e.license(c13770e10).remoteconfig, 0L, null, null, null, 0L, new C7975e(5), 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e10).mopub, c13770e10, 48, 0, 130040);
                    AbstractC12534e.ad(c13770e10, AbstractC18007e.license(c0115e3, 8));
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e10, R.string.exp_no_crypt_label), null, AbstractC0903e.license(c13770e10).remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e10).advert, c13770e10, 0, 0, 131066);
                    AbstractC12534e.ad(c13770e10, AbstractC18007e.license(c0115e3, f2));
                    InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e3, 1.0f);
                    C8587e ad6 = AbstractC6451e.ad(AbstractC16497e.billing(f2), C5438e.f11685e, c13770e10, 6);
                    long j4 = c13770e10.f27286case;
                    int i9 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC3483e advert4 = c13770e10.advert();
                    InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e10, metrica);
                    c13770e10.m3666import();
                    if (c13770e10.f27292implements) {
                        c13770e10.mopub(c7309e3);
                    } else {
                        c13770e10.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e10, ad6, c14865e);
                    AbstractC2270e.yandex(c13770e10, advert4, c14865e2);
                    AbstractC8703e.premium(i9, c13770e10, c14865e3, c13770e10, c5430e);
                    AbstractC2270e.yandex(c13770e10, purchase4, c14865e4);
                    boolean yandex5 = c13770e10.yandex(c0458e);
                    Object m3681throw5 = c13770e10.m3681throw();
                    if (yandex5 || m3681throw5 == c5170e) {
                        m3681throw5 = new C17011e(0, c0458e, C0458e.class, "dismiss", "dismiss()V", 0, 0, 15);
                        c13770e10.m3682throws(m3681throw5);
                    }
                    InterfaceC5261e interfaceC5261e = (InterfaceC5261e) m3681throw5;
                    C16005e c16005e6 = new C16005e(f2, f2, f2, f2);
                    C16005e c16005e7 = AbstractC10244e.ad;
                    C3134e ad7 = AbstractC10244e.ad(AbstractC0903e.license(c13770e10).subscription, AbstractC0903e.license(c13770e10).admob, 0L, 0L, c13770e10, 12);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    AbstractC1513e.ad((Function0) interfaceC5261e, new C5228e(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC0903e.purchase(c13770e10).metrica, ad7, null, null, c16005e6, AbstractC11008e.ad, c13770e10, 817889280, 356);
                    C16005e c16005e8 = new C16005e(f2, f2, f2, f2);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    int i10 = 1;
                    C5228e c5228e = new C5228e(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    C3924e c3924e2 = AbstractC0903e.purchase(c13770e10).metrica;
                    boolean z2 = c16330e.purchase() == 0;
                    Object m3681throw6 = c13770e10.m3681throw();
                    if (m3681throw6 == c5170e) {
                        m3681throw6 = new C0996e(i10);
                        c13770e10.m3682throws(m3681throw6);
                    }
                    AbstractC1513e.ad((Function0) m3681throw6, c5228e, z2, c3924e2, null, null, null, c16005e8, AbstractC16653e.license(-1759475298, new C11839e(c16330e, 0), c13770e10), c13770e10, 817889286, 368);
                    c13770e10.Signature(true);
                    c13770e10.Signature(true);
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                ((C5223e) obj4).m1774strictfp((String) obj3, (C13770e) obj, AbstractC5190e.advert(71));
                return Unit.INSTANCE;
            case 22:
                InterfaceC2566e interfaceC2566e6 = (InterfaceC2566e) obj4;
                C5223e c5223e = (C5223e) obj3;
                C13770e c13770e11 = (C13770e) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if (c13770e11.m3673protected(1 & intValue11, (intValue11 & 3) != 2)) {
                    C16005e c16005e9 = AbstractC9083e.ad;
                    C15492e c15492e6 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC18292e.vip, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e11.adcel(c15492e6)).ad.Signature, c5100e), null, AbstractC16653e.license(-409177459, new C10243e(c5223e), c13770e11), null, null, 0.0f, 0.0f, ((C0916e) c13770e11.adcel(AbstractC12450e.ad)).appmetrica(c13770e11), AbstractC9083e.license(((C7019e) c13770e11.adcel(c15492e6)).ad.Signature, ((C7019e) c13770e11.adcel(c15492e6)).ad.subscription, 0L, c13770e11, 28), interfaceC2566e6, c13770e11, 3078, 244);
                } else {
                    c13770e11.m3659default();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                ((C11527e) obj4).ad((C11467e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((Integer) obj2).getClass();
                ((C1819e) obj4).ad((C5640e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                InterfaceC1403e interfaceC1403e = (InterfaceC1403e) obj4;
                InterfaceC10601e interfaceC10601e = (InterfaceC10601e) obj3;
                C13770e c13770e12 = (C13770e) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if (c13770e12.m3673protected(1 & intValue12, (intValue12 & 3) != 2)) {
                    boolean purchase5 = c13770e12.purchase(interfaceC1403e);
                    Object m3681throw7 = c13770e12.m3681throw();
                    if (purchase5 || m3681throw7 == c5170e) {
                        m3681throw7 = AbstractC14533e.purchase(new C17011e(0, interfaceC1403e, InterfaceC1403e.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 0, 18));
                        c13770e12.m3682throws(m3681throw7);
                    }
                    AbstractC5132e.ad(interfaceC10601e, (C17828e) ((InterfaceC16132e) m3681throw7).getValue(), c13770e12, 0);
                } else {
                    c13770e12.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((Integer) obj2).getClass();
                AbstractC5132e.ad((InterfaceC10601e) obj4, (C17828e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((Integer) obj2).getClass();
                ((C18123e) obj4).ad((C2702e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                Function1 function1 = (Function1) obj3;
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj4;
                C13770e c13770e13 = (C13770e) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if (c13770e13.m3673protected(intValue13 & 1, (intValue13 & 3) != 2)) {
                    boolean purchase6 = c13770e13.purchase(function1);
                    Object m3681throw8 = c13770e13.m3681throw();
                    if (purchase6 || m3681throw8 == c5170e) {
                        m3681throw8 = new C13149e(function1, interfaceC3314e, 0);
                        c13770e13.m3682throws(m3681throw8);
                    }
                    AbstractC1513e.license((Function0) m3681throw8, null, ((C0398e) interfaceC3314e.getValue()).ad.f20850e.length() > 0, null, null, null, AbstractC17487e.mopub, c13770e13, 805306368, 506);
                } else {
                    c13770e13.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ((C1922e) obj4).m724import((String) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
