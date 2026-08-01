package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٟۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11194e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f22454e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f22455e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f22456e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f22457e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f22458e;

    public /* synthetic */ C11194e(C2277e c2277e, boolean z, C2892e c2892e, EnumC14399e enumC14399e) {
        this.f22458e = 2;
        this.f22455e = c2277e;
        this.f22456e = z;
        this.f22457e = c2892e;
        this.f22454e = enumC14399e;
    }

    public /* synthetic */ C11194e(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.f22458e = i;
        this.f22455e = obj;
        this.f22457e = obj2;
        this.f22454e = obj3;
        this.f22456e = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC3809e interfaceC3809e;
        boolean z;
        C0115e c0115e;
        C14486e c14486e;
        long j;
        switch (this.f22458e) {
            case 0:
                C4031e c4031e = (C4031e) this.f22455e;
                C0576e c0576e = c4031e.f8965e;
                InterfaceC2566e interfaceC2566e = (InterfaceC2566e) this.f22457e;
                C8933e c8933e = (C8933e) this.f22454e;
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                C10156e c10156e = C5438e.f11669e;
                C10156e c10156e2 = C5438e.f11676e;
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
                }
                boolean z2 = (intValue & 19) != 18;
                AbstractC7919e abstractC7919e = c13770e.ad;
                if (c13770e.m3673protected(intValue & 1, z2)) {
                    InterfaceC3809e interfaceC3809e2 = (InterfaceC3809e) c0576e.getValue();
                    C3554e c3554e = interfaceC3809e2 instanceof C3554e ? (C3554e) interfaceC3809e2 : null;
                    if (c3554e == null || (interfaceC3809e = c3554e.ad) == null) {
                        interfaceC3809e = (InterfaceC3809e) c0576e.getValue();
                    }
                    boolean billing = AbstractC7890e.billing(interfaceC3809e, C2517e.ad);
                    C0115e c0115e2 = C0115e.f1276e;
                    if (billing || AbstractC7890e.billing(interfaceC3809e, C18342e.ad)) {
                        c13770e.m3676strictfp(1467384474);
                        AbstractC0436e.ad(AbstractC12220e.adcel(c0115e2, interfaceC12123e), false, 0L, c13770e, 0, 6);
                        c13770e.Signature(false);
                    } else {
                        boolean z3 = interfaceC3809e instanceof C14570e;
                        boolean z4 = this.f22456e;
                        C5170e c5170e = C2987e.ad;
                        C14486e c14486e2 = C14486e.ad;
                        if (z3) {
                            c13770e.m3676strictfp(1467562910);
                            InterfaceC12864e license = AbstractC15428e.license(AbstractC12220e.adcel(AbstractC14783e.license(c0115e2, interfaceC2566e.ad(), null), interfaceC12123e), c8933e);
                            C7913e c7913e = AbstractC18007e.metrica;
                            InterfaceC12864e premium = license.premium(c7913e);
                            InterfaceC2747e license2 = AbstractC17074e.license(c10156e2, false);
                            long j2 = c13770e.f27286case;
                            int i = (int) (j2 ^ (j2 >>> 32));
                            InterfaceC3483e advert = c13770e.advert();
                            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, premium);
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
                            AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
                            AbstractC2270e.purchase(c13770e, C2721e.mopub);
                            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                            InterfaceC12864e purchase2 = AbstractC5967e.purchase(c7913e, AbstractC5967e.appmetrica(c13770e), true);
                            InterfaceC4977e smaato = C15802e.smaato(((C14570e) interfaceC3809e).ad);
                            boolean yandex = c13770e.yandex(c4031e);
                            Object m3681throw = c13770e.m3681throw();
                            if (yandex || m3681throw == c5170e) {
                                z = z4;
                                c0115e = c0115e2;
                                c14486e = c14486e2;
                                C11212e c11212e = new C11212e(0, c4031e, C4031e.class, "dispatchLoad", "dispatchLoad()V", 0, 0, 7);
                                c13770e.m3682throws(c11212e);
                                m3681throw = c11212e;
                            } else {
                                c0115e = c0115e2;
                                c14486e = c14486e2;
                                z = z4;
                            }
                            AbstractC11906e.ad(smaato, (Function0) ((InterfaceC5261e) m3681throw), purchase2, false, c13770e, 0, 8);
                            AbstractC3420e.vip(z, c8933e, c14486e.ad(c0115e, c10156e), 0L, 0L, c13770e, 64);
                            c13770e.Signature(true);
                            c13770e.Signature(false);
                        } else {
                            c13770e.m3676strictfp(1468769988);
                            InterfaceC12864e license3 = AbstractC15428e.license(AbstractC12220e.adcel(AbstractC14783e.license(c0115e2, interfaceC2566e.ad(), null), interfaceC12123e), c8933e);
                            C7913e c7913e2 = AbstractC18007e.metrica;
                            InterfaceC12864e premium2 = license3.premium(c7913e2);
                            InterfaceC2747e license4 = AbstractC17074e.license(c10156e2, false);
                            long j3 = c13770e.f27286case;
                            int i2 = (int) (j3 ^ (j3 >>> 32));
                            InterfaceC3483e advert2 = c13770e.advert();
                            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, premium2);
                            InterfaceC5685e.mopub.getClass();
                            C7309e c7309e2 = C2721e.vip;
                            c13770e.m3666import();
                            if (c13770e.f27292implements) {
                                c13770e.mopub(c7309e2);
                            } else {
                                c13770e.m3684volatile();
                            }
                            AbstractC2270e.yandex(c13770e, license4, C2721e.billing);
                            AbstractC2270e.yandex(c13770e, advert2, C2721e.purchase);
                            AbstractC2270e.yandex(c13770e, Integer.valueOf(i2), C2721e.adcel);
                            AbstractC2270e.purchase(c13770e, C2721e.mopub);
                            AbstractC2270e.yandex(c13770e, purchase3, C2721e.license);
                            float f = 16;
                            C13964e billing2 = AbstractC16497e.billing(f);
                            C16005e appmetrica = AbstractC12220e.appmetrica(0.0f, 0.0f, 0.0f, f, 7);
                            boolean yandex2 = c13770e.yandex(c4031e);
                            Object m3681throw2 = c13770e.m3681throw();
                            if (yandex2 || m3681throw2 == c5170e) {
                                m3681throw2 = new C5516e(c4031e, 0);
                                c13770e.m3682throws(m3681throw2);
                            }
                            AbstractC7023e.ad(c7913e2, null, appmetrica, billing2, null, null, false, null, (Function1) m3681throw2, c13770e, 24966, 490);
                            AbstractC3420e.vip(z4, c8933e, c14486e2.ad(c0115e2, c10156e), 0L, 0L, c13770e, 64);
                            c13770e.Signature(true);
                            c13770e.Signature(false);
                        }
                    }
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC16049e abstractC16049e = (AbstractC16049e) this.f22455e;
                InterfaceC12864e interfaceC12864e = (InterfaceC12864e) this.f22457e;
                InterfaceC16154e interfaceC16154e = (InterfaceC16154e) this.f22454e;
                C14715e c14715e = (C14715e) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c13770e2.purchase(c14715e) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 19) != 18)) {
                    float vip = c14715e.vip();
                    InterfaceC14388e interfaceC14388e = c14715e.ad;
                    long j4 = c14715e.vip;
                    InterfaceC12864e vip2 = AbstractC12447e.vip(AbstractC10075e.metrica(AbstractC18007e.metrica(interfaceC12864e, 1.0f), C15765e.ad(vip, C5602e.metrica(j4) ? interfaceC14388e.mo496final(C5602e.billing(j4)) : Float.POSITIVE_INFINITY) > 0), interfaceC16154e);
                    float f2 = 1;
                    if (this.f22456e) {
                        c13770e2.m3676strictfp(903160918);
                        j = ((C0896e) c13770e2.adcel(AbstractC3577e.ad)).license;
                        c13770e2.Signature(false);
                    } else {
                        c13770e2.m3676strictfp(903161902);
                        c13770e2.Signature(false);
                        j = C3618e.startapp;
                    }
                    AbstractC5960e.vip(abstractC16049e, AbstractC16398e.license(AbstractC13201e.ad(vip2, f2, j, interfaceC16154e), 8, null, false, 30), c13770e2, 0);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C2277e c2277e = (C2277e) this.f22455e;
                C2892e c2892e = (C2892e) this.f22457e;
                EnumC14399e enumC14399e = (EnumC14399e) this.f22454e;
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                    InterfaceC12864e mopub = AbstractC12220e.mopub(C0115e.f1276e, 8);
                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(2), C5438e.f11678e, c13770e3, 54);
                    long j5 = c13770e3.f27286case;
                    int i3 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC3483e advert3 = c13770e3.advert();
                    InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e3, mopub);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e3 = C2721e.vip;
                    c13770e3.m3666import();
                    if (c13770e3.f27292implements) {
                        c13770e3.mopub(c7309e3);
                    } else {
                        c13770e3.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e3, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e3, advert3, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e3, Integer.valueOf(i3), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e3, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e3, purchase4, C2721e.license);
                    String str = c2277e.vip;
                    String str2 = c2277e.ad;
                    boolean z5 = this.f22456e;
                    C2892e c2892e2 = AbstractC6401e.appmetrica;
                    if (z5) {
                        c13770e3.m3676strictfp(1748444241);
                        if (str2.length() > 0) {
                            c13770e3.m3676strictfp(2134613224);
                            c2892e.invoke(str2, c13770e3, 48);
                        } else {
                            c13770e3.m3676strictfp(1718319278);
                        }
                        c13770e3.Signature(false);
                        if (str.length() > 0) {
                            c13770e3.m3676strictfp(2134615816);
                            c2892e2.invoke(str, c13770e3, 48);
                        } else {
                            c13770e3.m3676strictfp(1718319278);
                        }
                        c13770e3.Signature(false);
                        c13770e3.Signature(false);
                    } else if (str.length() == 0 && (enumC14399e == EnumC14399e.f28478e || enumC14399e == EnumC14399e.f28481e)) {
                        c13770e3.m3676strictfp(1748733378);
                        c2892e2.invoke(str2, c13770e3, 48);
                        c13770e3.Signature(false);
                    } else {
                        c13770e3.m3676strictfp(1748817171);
                        c2892e.invoke(str.length() == 0 ? str2 : str, c13770e3, 48);
                        if (str.length() > 0) {
                            c13770e3.m3676strictfp(2134627009);
                            c2892e2.invoke(str2, c13770e3, 48);
                        } else {
                            c13770e3.m3676strictfp(1718319278);
                        }
                        c13770e3.Signature(false);
                        c13770e3.Signature(false);
                    }
                    c13770e3.Signature(true);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
