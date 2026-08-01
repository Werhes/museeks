package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4197e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f9238e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f9239e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f9240e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9241e;

    public /* synthetic */ C4197e(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.f9241e = i2;
        this.f9239e = obj;
        this.f9238e = obj2;
        this.f9240e = obj3;
    }

    public /* synthetic */ C4197e(int i, Object obj, Object obj2, Object obj3) {
        this.f9241e = i;
        this.f9239e = obj;
        this.f9238e = obj2;
        this.f9240e = obj3;
    }

    public /* synthetic */ C4197e(C2892e c2892e, C0939e c0939e, InterfaceC12864e interfaceC12864e, int i) {
        this.f9241e = 20;
        this.f9240e = c2892e;
        this.f9238e = c0939e;
        this.f9239e = interfaceC12864e;
    }

    public /* synthetic */ C4197e(C2892e c2892e, C2892e c2892e2, C2892e c2892e3, int i) {
        this.f9241e = 18;
        this.f9240e = c2892e;
        this.f9239e = c2892e2;
        this.f9238e = c2892e3;
    }

    public /* synthetic */ C4197e(C2892e c2892e, C5958e c5958e, Function0 function0) {
        this.f9241e = 2;
        this.f9240e = c2892e;
        this.f9239e = c5958e;
        this.f9238e = function0;
    }

    public /* synthetic */ C4197e(C7988e c7988e, InterfaceC12864e interfaceC12864e, C2892e c2892e, int i) {
        this.f9241e = 13;
        this.f9238e = c7988e;
        this.f9239e = interfaceC12864e;
        this.f9240e = c2892e;
    }

    public /* synthetic */ C4197e(InterfaceC16400e interfaceC16400e, Object obj, InterfaceC12864e interfaceC12864e, int i, int i2) {
        this.f9241e = i2;
        this.f9238e = interfaceC16400e;
        this.f9240e = obj;
        this.f9239e = interfaceC12864e;
    }

    public /* synthetic */ C4197e(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.f9241e = i;
        this.f9239e = obj;
        this.f9240e = obj2;
        this.f9238e = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f9241e;
        int i2 = 6;
        int i3 = 18;
        C0115e c0115e = C0115e.f1276e;
        C5170e c5170e = C2987e.ad;
        int i4 = 2;
        int i5 = 1;
        Object obj3 = this.f9239e;
        Object obj4 = this.f9240e;
        Object obj5 = this.f9238e;
        switch (i) {
            case 0:
                InterfaceC12864e interfaceC12864e = (InterfaceC12864e) obj3;
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj5;
                C2892e c2892e = (C2892e) obj4;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    Object m3681throw = c13770e.m3681throw();
                    if (m3681throw == c5170e) {
                        m3681throw = new C9214e(interfaceC3314e, i5);
                        c13770e.m3682throws(m3681throw);
                    }
                    InterfaceC12864e license = AbstractC11261e.license(interfaceC12864e, (Function1) m3681throw);
                    InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, true);
                    long j = c13770e.f27286case;
                    int i6 = (int) (j ^ (j >>> 32));
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
                    AbstractC2270e.yandex(c13770e, license2, C2721e.billing);
                    AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i6), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    c2892e.invoke(c13770e, 0);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ((C14398e) obj5).m3792package((EnumC9702e) obj4, (InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 2:
                C2892e c2892e2 = (C2892e) obj4;
                InterfaceC2566e interfaceC2566e = (InterfaceC2566e) obj3;
                Function0 function0 = (Function0) obj5;
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C16005e c16005e = AbstractC9083e.ad;
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC10560e.vip(c2892e2, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e2.adcel(c15492e)).ad.Signature, AbstractC10432e.ad), null, AbstractC16653e.license(-116159722, new C14903e(false ? 1 : 0, function0), c13770e2), null, null, 0.0f, 0.0f, ((C0916e) c13770e2.adcel(AbstractC12450e.ad)).appmetrica(c13770e2), AbstractC9083e.purchase(((C7019e) c13770e2.adcel(c15492e)).ad.Signature, ((C7019e) c13770e2.adcel(c15492e)).ad.subscription, 0L, 0L, 0L, c13770e2, 60), interfaceC2566e, c13770e2, 3072, 244);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ((C5016e) obj5).m1717strictfp((CustomCatalogBlockItem) obj4, (InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(9));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ((C3409e) obj3).m1356strictfp((C12604e) obj5, (Function0) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC10558e.ad((C6524e) obj3, (Function0) obj5, (Function0) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC10558e.purchase((String) obj3, (Function0) obj5, (Function0) obj4, (C13770e) obj, AbstractC5190e.advert(7));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC17947e.vip((InterfaceC12864e) obj3, (C15860e) obj5, (C2892e) obj4, (C13770e) obj, AbstractC5190e.advert(385));
                return Unit.INSTANCE;
            case 8:
                Function1 function1 = (Function1) obj3;
                InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) obj5;
                InterfaceC3314e interfaceC3314e3 = (InterfaceC3314e) obj4;
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    boolean purchase2 = c13770e3.purchase(function1);
                    Object m3681throw2 = c13770e3.m3681throw();
                    if (purchase2 || m3681throw2 == c5170e) {
                        m3681throw2 = new Csynchronized(i2, function1, interfaceC3314e2, interfaceC3314e3);
                        c13770e3.m3682throws(m3681throw2);
                    }
                    AbstractC1513e.license((Function0) m3681throw2, null, ((C0398e) interfaceC3314e3.getValue()).ad.f20850e.length() > 0, null, null, null, AbstractC16377e.ad, c13770e3, 805306368, 506);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 9:
                Function1 function12 = (Function1) obj3;
                C10620e c10620e = (C10620e) obj4;
                InterfaceC3314e interfaceC3314e4 = (InterfaceC3314e) obj5;
                C13770e c13770e4 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    boolean purchase3 = c13770e4.purchase(function12) | c13770e4.yandex(c10620e) | c13770e4.purchase(interfaceC3314e4);
                    Object m3681throw3 = c13770e4.m3681throw();
                    if (purchase3 || m3681throw3 == c5170e) {
                        m3681throw3 = new Csynchronized(10, function12, c10620e, interfaceC3314e4);
                        c13770e4.m3682throws(m3681throw3);
                    }
                    AbstractC1513e.license((Function0) m3681throw3, null, ((C0398e) interfaceC3314e4.getValue()).ad.f20850e.length() > 0, null, null, null, AbstractC17487e.billing, c13770e4, 805306368, 506);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 10:
                Function0 function02 = (Function0) obj3;
                Function1 function13 = (Function1) obj4;
                InterfaceC3314e interfaceC3314e5 = (InterfaceC3314e) obj5;
                C13770e c13770e5 = (C13770e) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 3) != 2)) {
                    C0398e c0398e = (C0398e) interfaceC3314e5.getValue();
                    C4988e c4988e = new C4988e(0, 7, 119);
                    boolean purchase4 = c13770e5.purchase(function02) | c13770e5.purchase(function13);
                    Object m3681throw4 = c13770e5.m3681throw();
                    if (purchase4 || m3681throw4 == c5170e) {
                        m3681throw4 = new Cthrows(i3, function02, function13, interfaceC3314e5);
                        c13770e5.m3682throws(m3681throw4);
                    }
                    C16636e c16636e = new C16636e((Function1) m3681throw4, null, 62);
                    InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
                    Object m3681throw5 = c13770e5.m3681throw();
                    if (m3681throw5 == c5170e) {
                        m3681throw5 = new C9214e(interfaceC3314e5, 14);
                        c13770e5.m3682throws(m3681throw5);
                    }
                    AbstractC11257e.vip(c0398e, (Function1) m3681throw5, metrica, false, null, AbstractC17487e.amazon, null, null, c4988e, c16636e, false, 0, 0, null, null, c13770e5, 12583344, 196608, 8290168);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ((C1922e) obj5).m726package((Function0) obj4, (InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(49));
                return Unit.INSTANCE;
            case 12:
                C11048e c11048e = (C11048e) obj3;
                Function0 function03 = (Function0) obj4;
                InterfaceC3314e interfaceC3314e6 = (InterfaceC3314e) obj5;
                C13770e c13770e6 = (C13770e) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 3) != 2)) {
                    boolean yandex = c13770e6.yandex(c11048e) | c13770e6.purchase(function03);
                    Object m3681throw6 = c13770e6.m3681throw();
                    if (yandex || m3681throw6 == c5170e) {
                        m3681throw6 = new Csynchronized(12, c11048e, function03, interfaceC3314e6);
                        c13770e6.m3682throws(m3681throw6);
                    }
                    AbstractC1513e.license((Function0) m3681throw6, null, false, null, null, null, AbstractC12797e.startapp, c13770e6, 805306368, 510);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                AbstractC0487e.vip((C7988e) obj5, (InterfaceC12864e) obj3, (C2892e) obj4, (C13770e) obj, AbstractC5190e.advert(385));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                ((C7537e) obj3).isPro((C0160e) obj5, (C5228e) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ((C7537e) obj5).isVip((C10874e) obj4, (InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(49));
                return Unit.INSTANCE;
            case 16:
                InterfaceC12864e interfaceC12864e2 = (InterfaceC12864e) obj3;
                C9137e c9137e = (C9137e) obj5;
                C2892e c2892e3 = (C2892e) obj4;
                C13770e c13770e7 = (C13770e) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 3) != 2)) {
                    InterfaceC12864e purchase5 = AbstractC5967e.purchase(AbstractC17113e.billing(AbstractC12220e.smaato(interfaceC12864e2, 0.0f, AbstractC5711e.appmetrica, 1), 2), c9137e, true);
                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e7, 0);
                    long j2 = c13770e7.f27286case;
                    int i7 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert2 = c13770e7.advert();
                    InterfaceC12864e purchase6 = AbstractC5679e.purchase(c13770e7, purchase5);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e2 = C2721e.vip;
                    c13770e7.m3666import();
                    if (c13770e7.f27292implements) {
                        c13770e7.mopub(c7309e2);
                    } else {
                        c13770e7.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e7, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e7, advert2, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e7, Integer.valueOf(i7), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e7, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e7, purchase6, C2721e.license);
                    c2892e3.invoke(C0283e.ad, c13770e7, 6);
                    c13770e7.Signature(true);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                Function2 function2 = (Function2) obj3;
                Function2 function22 = (Function2) obj5;
                Function2 function23 = (Function2) obj4;
                C13770e c13770e8 = (C13770e) obj;
                int intValue8 = ((Integer) obj2).intValue();
                float f = AbstractC5711e.metrica;
                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    C5228e c5228e = new C5228e(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    float f2 = function2 != null ? f : 0;
                    if (function22 == null) {
                        f = 0;
                    }
                    InterfaceC12864e loadAd = AbstractC12220e.loadAd(c5228e, f2, 0.0f, f, 0.0f, 10);
                    InterfaceC2747e license3 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j3 = c13770e8.f27286case;
                    int i8 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert3 = c13770e8.advert();
                    InterfaceC12864e purchase7 = AbstractC5679e.purchase(c13770e8, loadAd);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e3 = C2721e.vip;
                    c13770e8.m3666import();
                    if (c13770e8.f27292implements) {
                        c13770e8.mopub(c7309e3);
                    } else {
                        c13770e8.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e8, license3, C2721e.billing);
                    AbstractC2270e.yandex(c13770e8, advert3, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e8, Integer.valueOf(i8), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e8, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e8, purchase7, C2721e.license);
                    function23.invoke(c13770e8, 0);
                    c13770e8.Signature(true);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((Integer) obj2).getClass();
                AbstractC18275e.metrica((C2892e) obj4, (C2892e) obj3, (C2892e) obj5, (C13770e) obj, AbstractC5190e.advert(439));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((Integer) obj2).getClass();
                AbstractC12185e.appmetrica((InterfaceC12864e) obj3, (AbstractC10727e) obj5, (String) obj4, (C13770e) obj, AbstractC5190e.advert(65));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                AbstractC12185e.ad((C2892e) obj4, (C0939e) obj5, (InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(7));
                return Unit.INSTANCE;
            case 21:
                Function1 function14 = (Function1) obj3;
                C17196e c17196e = (C17196e) obj5;
                Function0 function04 = (Function0) obj4;
                C13770e c13770e9 = (C13770e) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if (c13770e9.m3673protected(intValue9 & 1, (intValue9 & 3) != 2)) {
                    boolean purchase8 = c13770e9.purchase(function14) | c13770e9.yandex(c17196e) | c13770e9.purchase(function04);
                    Object m3681throw7 = c13770e9.m3681throw();
                    if (purchase8 || m3681throw7 == c5170e) {
                        m3681throw7 = new Csynchronized(i3, function14, c17196e, function04);
                        c13770e9.m3682throws(m3681throw7);
                    }
                    AbstractC1513e.license((Function0) m3681throw7, null, false, null, null, null, C17150e.smaato, c13770e9, 805306368, 510);
                } else {
                    c13770e9.m3659default();
                }
                return Unit.INSTANCE;
            case 22:
                InterfaceC2566e interfaceC2566e2 = (InterfaceC2566e) obj3;
                C6123e c6123e = (C6123e) obj5;
                C14873e c14873e = (C14873e) obj4;
                C13770e c13770e10 = (C13770e) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if (c13770e10.m3673protected(intValue10 & 1, (intValue10 & 3) != 2)) {
                    C16005e c16005e2 = AbstractC9083e.ad;
                    AbstractC10560e.license(AbstractC16653e.license(-683397854, new C9130e(c6123e, interfaceC2566e2, 15), c13770e10), C0115e.f1276e, AbstractC16653e.license(-469780768, new C4642e(c14873e, i4), c13770e10), AbstractC16653e.license(-1004137705, new C15623e(c14873e, i5), c13770e10), 0.0f, ((C0916e) c13770e10.adcel(AbstractC12450e.ad)).appmetrica(c13770e10), AbstractC9083e.purchase(C3618e.startapp, 0L, 0L, 0L, ((C7019e) c13770e10.adcel(AbstractC11785e.ad)).ad.admob, c13770e10, 46), interfaceC2566e2, null, c13770e10, 3510, 272);
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                AbstractC14059e.ad(AbstractC5190e.advert(1), (C13770e) obj, (InterfaceC12864e) obj3, (Function0) obj5, (Function0) obj4);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((Integer) obj2).getClass();
                ((C14197e) obj5).m3765strictfp((C0004e) obj4, (InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C15096e c15096e = (C15096e) obj3;
                C11950e c11950e = (C11950e) obj5;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long yandex2 = c11950e.yandex(c11950e.license(floatValue - c15096e.f29883e));
                C11950e c11950e2 = ((C3593e) obj4).ad;
                c15096e.f29883e += c11950e.license(c11950e.billing(c11950e2.metrica(c11950e2.mopub, yandex2, 1)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                Function2 function24 = (Function2) obj3;
                C2892e c2892e4 = (C2892e) obj4;
                InterfaceC6512e interfaceC6512e = (InterfaceC6512e) obj5;
                C13770e c13770e11 = (C13770e) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if (c13770e11.m3673protected(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Object m3681throw8 = c13770e11.m3681throw();
                    if (m3681throw8 == c5170e) {
                        m3681throw8 = AbstractC17680e.startapp(c13770e11);
                        c13770e11.m3682throws(m3681throw8);
                    }
                    InterfaceC18435e interfaceC18435e = (InterfaceC18435e) m3681throw8;
                    Object m3681throw9 = c13770e11.m3681throw();
                    if (m3681throw9 == c5170e) {
                        m3681throw9 = new C2907e(interfaceC18435e, interfaceC6512e);
                        c13770e11.m3682throws(m3681throw9);
                    }
                    C2907e c2907e = (C2907e) m3681throw9;
                    InterfaceC12864e vip = AbstractC17113e.vip(c0115e);
                    C2892e metrica2 = AbstractC16653e.metrica(AbstractC6874e.startapp(function24, c2892e4));
                    Object m3681throw10 = c13770e11.m3681throw();
                    if (m3681throw10 == c5170e) {
                        m3681throw10 = new C3045e(c2907e);
                        c13770e11.m3682throws(m3681throw10);
                    }
                    InterfaceC2747e interfaceC2747e = (InterfaceC2747e) m3681throw10;
                    long j4 = c13770e11.f27286case;
                    int i9 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC3483e advert4 = c13770e11.advert();
                    InterfaceC12864e purchase9 = AbstractC5679e.purchase(c13770e11, vip);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e4 = C2721e.vip;
                    c13770e11.m3666import();
                    if (c13770e11.f27292implements) {
                        c13770e11.mopub(c7309e4);
                    } else {
                        c13770e11.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e11, interfaceC2747e, C2721e.billing);
                    AbstractC2270e.yandex(c13770e11, advert4, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e11, Integer.valueOf(i9), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e11, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e11, purchase9, C2721e.license);
                    metrica2.invoke(c13770e11, 0);
                    c13770e11.Signature(true);
                } else {
                    c13770e11.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((Integer) obj2).getClass();
                AbstractC17181e.appmetrica((String) obj3, (String) obj5, (Function1) obj4, (C13770e) obj, AbstractC5190e.advert(3127));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((Integer) obj2).getClass();
                ((C11188e) obj5).m3043const((Function0) obj4, (InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(49));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ((C11188e) obj5).m3056throws((CachedPlaylist) obj4, (InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
