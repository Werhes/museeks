package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؔٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2535e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f6390e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f6391e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f6392e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f6393e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6394e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f6395e;

    public /* synthetic */ C2535e(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.f6394e = i;
        this.f6392e = obj;
        this.f6393e = obj2;
        this.f6391e = z;
        this.f6390e = obj3;
        this.f6395e = obj4;
    }

    public /* synthetic */ C2535e(C2038e c2038e, C2892e c2892e, C2892e c2892e2, boolean z, Function0 function0, int i) {
        this.f6394e = 2;
        this.f6392e = c2038e;
        this.f6393e = c2892e;
        this.f6390e = c2892e2;
        this.f6391e = z;
        this.f6395e = function0;
    }

    public /* synthetic */ C2535e(C7142e c7142e, C7765e c7765e, EnumC12813e enumC12813e, C7142e c7142e2, boolean z) {
        this.f6394e = 6;
        this.f6392e = c7142e;
        this.f6393e = c7765e;
        this.f6390e = enumC12813e;
        this.f6395e = c7142e2;
        this.f6391e = z;
    }

    public /* synthetic */ C2535e(Object obj, boolean z, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f6394e = i2;
        this.f6392e = obj;
        this.f6391e = z;
        this.f6393e = obj2;
        this.f6390e = obj3;
        this.f6395e = obj4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C2038e c2038e;
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        boolean z4;
        double d;
        int i;
        int billing;
        int i2 = this.f6394e;
        boolean z5 = this.f6391e;
        int i3 = 9;
        byte b = 0;
        Object obj3 = this.f6395e;
        Object obj4 = this.f6390e;
        Object obj5 = this.f6393e;
        Object obj6 = this.f6392e;
        switch (i2) {
            case 0:
                C13621e c13621e = (C13621e) obj6;
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj5;
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj4;
                C16875e c16875e = (C16875e) obj3;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                boolean z6 = (intValue & 3) != 2;
                AbstractC7919e abstractC7919e = c13770e.ad;
                if (c13770e.m3673protected(intValue & 1, z6)) {
                    C9616e c9616e = AbstractC16497e.metrica;
                    C9577e c9577e = C5438e.f11672e;
                    C4789e ad = AbstractC14801e.ad(c9616e, c9577e, c13770e, 0);
                    long j = c13770e.f27286case;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    C0115e c0115e = C0115e.f1276e;
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e);
                    } else {
                        c13770e.m3684volatile();
                    }
                    C14865e c14865e = C2721e.billing;
                    AbstractC2270e.yandex(c13770e, ad, c14865e);
                    C14865e c14865e2 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e, advert, c14865e2);
                    Integer valueOf = Integer.valueOf(i4);
                    C14865e c14865e3 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
                    C5430e c5430e = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e, c5430e);
                    C14865e c14865e4 = C2721e.license;
                    AbstractC2270e.yandex(c13770e, purchase, c14865e4);
                    C2038e c2038e2 = c13621e.ad;
                    EnumC13413e enumC13413e = (EnumC13413e) c2038e2.subscription.license.getValue();
                    boolean yandex = c13770e.yandex(c13621e) | c13770e.yandex(interfaceC18435e);
                    Object m3681throw = c13770e.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    if (yandex || m3681throw == c5170e) {
                        c2038e = c2038e2;
                        m3681throw = new C12439e(c13621e, interfaceC18435e, 2);
                        c13770e.m3682throws(m3681throw);
                    } else {
                        c2038e = c2038e2;
                    }
                    Function1 function1 = (Function1) m3681throw;
                    boolean yandex2 = c13770e.yandex(c13621e);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        m3681throw2 = new C17762e(c13621e, 4);
                        c13770e.m3682throws(m3681throw2);
                    }
                    float f2 = 16;
                    AbstractC12185e.license(enumC13413e, function1, (Function0) m3681throw2, AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), f2, 0.0f, 2), c13770e, 3072);
                    C13770e c13770e2 = c13770e;
                    if (((C10876e) interfaceC3314e.getValue()).f21543e) {
                        z = true;
                        z2 = false;
                        c13770e2.m3676strictfp(-1285074023);
                    } else {
                        c13770e2.m3676strictfp(-1252749765);
                        EnumC11342e enumC11342e = EnumC11342e.f22808e;
                        if (z5) {
                            c13770e2.m3676strictfp(-1252748246);
                            InterfaceC12864e smaato = AbstractC12220e.smaato(AbstractC12220e.smaato(c0115e, f2, 0.0f, 2), 0.0f, f2, 1);
                            C8587e ad2 = AbstractC6451e.ad(AbstractC16497e.billing(f2), C5438e.f11685e, c13770e2, 6);
                            long j2 = c13770e2.f27286case;
                            int i5 = (int) (j2 ^ (j2 >>> 32));
                            InterfaceC3483e advert2 = c13770e2.advert();
                            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, smaato);
                            c13770e2.m3666import();
                            if (c13770e2.f27292implements) {
                                c13770e2.mopub(c7309e);
                            } else {
                                c13770e2.m3684volatile();
                            }
                            AbstractC2270e.yandex(c13770e2, ad2, c14865e);
                            AbstractC2270e.yandex(c13770e2, advert2, c14865e2);
                            AbstractC8703e.premium(i5, c13770e2, c14865e3, c13770e2, c5430e);
                            AbstractC2270e.yandex(c13770e2, purchase2, c14865e4);
                            if (c16875e.startapp) {
                                f = Float.MAX_VALUE;
                                z4 = false;
                                d = 0.0d;
                                c13770e2.m3676strictfp(-893570125);
                            } else {
                                c13770e2.m3676strictfp(-860788245);
                                d = 0.0d;
                                if (1.0f <= 0.0d) {
                                    AbstractC9534e.ad("invalid weight; must be greater than zero");
                                }
                                C5228e c5228e = new C5228e(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                                InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
                                long j3 = c13770e2.f27286case;
                                int i6 = (int) (j3 ^ (j3 >>> 32));
                                InterfaceC3483e advert3 = c13770e2.advert();
                                InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e2, c5228e);
                                c13770e2.m3666import();
                                f = Float.MAX_VALUE;
                                if (c13770e2.f27292implements) {
                                    c13770e2.mopub(c7309e);
                                } else {
                                    c13770e2.m3684volatile();
                                }
                                AbstractC2270e.yandex(c13770e2, license, c14865e);
                                AbstractC2270e.yandex(c13770e2, advert3, c14865e2);
                                AbstractC8703e.premium(i6, c13770e2, c14865e3, c13770e2, c5430e);
                                AbstractC2270e.yandex(c13770e2, purchase3, c14865e4);
                                z4 = false;
                                c13621e.purchase(c2038e.startapp(), c13770e2, 0);
                                c13770e2.Signature(true);
                            }
                            c13770e2.Signature(z4);
                            EnumC10286e enumC10286e = c16875e.appmetrica;
                            boolean z7 = c16875e.purchase;
                            boolean z8 = c16875e.billing;
                            boolean z9 = c16875e.metrica == enumC11342e;
                            boolean z10 = c16875e.yandex;
                            boolean z11 = c16875e.startapp;
                            boolean z12 = !c16875e.adcel;
                            if (1.0f <= d) {
                                AbstractC9534e.ad("invalid weight; must be greater than zero");
                            }
                            c13621e.metrica(new C5228e(1.0f > f ? f : 1.0f, true), enumC10286e, z7, z8, z9, z10, z11, z12, c16875e.smaato, c13770e2, 0);
                            c13770e2 = c13770e2;
                            c13770e2.Signature(true);
                            z2 = false;
                            c13770e2.Signature(false);
                            z = true;
                        } else {
                            c13770e2.m3676strictfp(-1250767439);
                            InterfaceC12864e loadAd = AbstractC12220e.loadAd(AbstractC12220e.smaato(c0115e, f2, 0.0f, 2), 0.0f, 0.0f, 0.0f, f2, 7);
                            C4789e ad3 = AbstractC14801e.ad(AbstractC16497e.billing(f2), c9577e, c13770e2, 6);
                            long j4 = c13770e2.f27286case;
                            int i7 = (int) (j4 ^ (j4 >>> 32));
                            InterfaceC3483e advert4 = c13770e2.advert();
                            InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e2, loadAd);
                            c13770e2.m3666import();
                            if (c13770e2.f27292implements) {
                                c13770e2.mopub(c7309e);
                            } else {
                                c13770e2.m3684volatile();
                            }
                            AbstractC2270e.yandex(c13770e2, ad3, c14865e);
                            AbstractC2270e.yandex(c13770e2, advert4, c14865e2);
                            AbstractC8703e.premium(i7, c13770e2, c14865e3, c13770e2, c5430e);
                            AbstractC2270e.yandex(c13770e2, purchase4, c14865e4);
                            if (c16875e.startapp) {
                                z3 = false;
                                c13770e2.m3676strictfp(-1647811698);
                            } else {
                                c13770e2.m3676strictfp(-1613050096);
                                z3 = false;
                                c13621e.purchase(c2038e.startapp(), c13770e2, 0);
                            }
                            c13770e2.Signature(z3);
                            z = true;
                            c13621e.metrica(AbstractC18007e.metrica(c0115e, 1.0f), c16875e.appmetrica, c16875e.purchase, c16875e.billing, c16875e.metrica == enumC11342e, c16875e.yandex, c16875e.startapp, !c16875e.adcel, c16875e.smaato, c13770e2, 6);
                            c13770e2 = c13770e2;
                            c13770e2.Signature(true);
                            z2 = false;
                            c13770e2.Signature(false);
                        }
                    }
                    c13770e2.Signature(z2);
                    c13770e2.Signature(z);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ((C13621e) obj6).adcel(this.f6391e, (C2892e) obj5, (C2892e) obj4, (InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(433));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ((C2038e) obj6).appmetrica((C2892e) obj5, (C2892e) obj4, this.f6391e, (Function0) obj3, (C13770e) obj, AbstractC5190e.advert(439));
                return Unit.INSTANCE;
            case 3:
                Function2 function2 = (Function2) obj6;
                C0237e c0237e = (C0237e) obj5;
                Function2 function22 = (Function2) obj4;
                Function2 function23 = (Function2) obj3;
                C13770e c13770e3 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(1 & intValue2, (intValue2 & 3) != 2)) {
                    if (function2 != null) {
                        c13770e3.m3676strictfp(-864613344);
                        AbstractC1101e.ad(AbstractC8703e.loadAd(z5 ? c0237e.vip : c0237e.appmetrica, AbstractC0608e.ad), AbstractC16653e.license(1241781204, new C2920e(function2, 8, b), c13770e3), c13770e3, 56);
                        c13770e3.Signature(false);
                    } else {
                        c13770e3.m3676strictfp(-864297175);
                        c13770e3.Signature(false);
                    }
                    C5015e c5015e = AbstractC0608e.ad;
                    AbstractC1101e.ad(AbstractC8703e.loadAd(z5 ? c0237e.ad : c0237e.license, c5015e), AbstractC16653e.license(-893579015, new C4197e(17, function2, function22, function23), c13770e3), c13770e3, 56);
                    if (function22 != null) {
                        c13770e3.m3676strictfp(-863399043);
                        AbstractC1101e.ad(AbstractC8703e.loadAd(z5 ? c0237e.metrica : c0237e.purchase, c5015e), AbstractC16653e.license(-782441013, new C2920e(function22, i3, b), c13770e3), c13770e3, 56);
                        c13770e3.Signature(false);
                    } else {
                        c13770e3.m3676strictfp(-863079991);
                        c13770e3.Signature(false);
                    }
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC12185e.startapp((String) obj6, this.f6391e, (Function0) obj5, (Function0) obj4, (InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(196657));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ((C7855e) obj6).isVip(this.f6391e, (String) obj5, (InterfaceC16154e) obj4, (Function0) obj3, (C13770e) obj, AbstractC5190e.advert(24577));
                return Unit.INSTANCE;
            default:
                C7142e c7142e = (C7142e) obj6;
                C7765e c7765e = (C7765e) obj5;
                EnumC12813e enumC12813e = (EnumC12813e) obj4;
                C7142e c7142e2 = (C7142e) obj3;
                c7142e.f14622e = C2152e.startapp(c7142e.f14622e, ((C2152e) obj2).ad);
                C7102e c7102e = c7765e.vip;
                C11388e c11388e = c7765e.ad;
                C12476e metrica = c7102e.metrica();
                if (metrica == null) {
                    return Unit.INSTANCE;
                }
                C12890e c12890e = metrica.vip;
                c7765e.ads(enumC12813e, C2152e.startapp(c7142e2.f14622e, c7142e.f14622e));
                boolean z13 = this.f6391e;
                if (z13) {
                    i = c12890e.billing(c7765e.amazon());
                } else {
                    long j5 = c11388e.license().f33324e;
                    int i8 = C12347e.metrica;
                    i = (int) (j5 >> 32);
                }
                int i9 = i;
                if (z13) {
                    long j6 = c11388e.license().f33324e;
                    int i10 = C12347e.metrica;
                    billing = (int) (j6 & 4294967295L);
                } else {
                    billing = c12890e.billing(c7765e.amazon());
                }
                int i11 = billing;
                long j7 = c11388e.license().f33324e;
                long premium = c7765e.premium(c11388e.license(), i9, i11, z13, C5107e.f10955e, false, false, new C10138e(9));
                if (C12347e.license(j7) || !C12347e.license(premium)) {
                    c11388e.adcel(premium);
                }
                return Unit.INSTANCE;
        }
    }
}
