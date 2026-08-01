package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٝؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7308e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f14932e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ long f14933e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14934e;

    public /* synthetic */ C7308e(long j, Object obj, int i) {
        this.f14934e = i;
        this.f14933e = j;
        this.f14932e = obj;
    }

    public /* synthetic */ C7308e(Function2 function2, long j) {
        this.f14934e = 1;
        this.f14932e = function2;
        this.f14933e = j;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C13770e c13770e;
        switch (this.f14934e) {
            case 0:
                C8933e c8933e = (C8933e) this.f14932e;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C13770e c13770e2 = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e2.billing(booleanValue) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    C7913e c7913e = AbstractC18007e.metrica;
                    InterfaceC2747e license = AbstractC17074e.license(C5438e.f11700e, false);
                    int appmetrica = AbstractC5546e.appmetrica(c13770e2);
                    InterfaceC3483e advert = c13770e2.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, c7913e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e2, license, C2721e.billing);
                    AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
                    C14865e c14865e = C2721e.adcel;
                    if (c13770e2.f27292implements || !AbstractC7890e.billing(c13770e2.m3681throw(), Integer.valueOf(appmetrica))) {
                        c13770e2.m3682throws(Integer.valueOf(appmetrica));
                        c13770e2.vip(Integer.valueOf(appmetrica), c14865e);
                    }
                    AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
                    float f = AbstractC3420e.metrica;
                    float f2 = AbstractC3420e.license;
                    float f3 = (f + f2) * 2;
                    long j = this.f14933e;
                    C0115e c0115e = C0115e.f1276e;
                    if (booleanValue) {
                        c13770e2.m3676strictfp(-1916589279);
                        c13770e = c13770e2;
                        AbstractC3135e.ad(f2, 0, 390, j, 0L, c13770e, AbstractC18007e.startapp(c0115e, f3));
                        c13770e.Signature(false);
                    } else {
                        c13770e = c13770e2;
                        c13770e.m3676strictfp(-1916362142);
                        AbstractC3420e.ad(c8933e, j, AbstractC18007e.startapp(c0115e, f3), c13770e2, 384);
                        c13770e.Signature(false);
                    }
                    c13770e.Signature(true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                Function2 function2 = (Function2) this.f14932e;
                C13770e c13770e3 = (C13770e) obj2;
                ((Integer) obj3).getClass();
                Function2 billing = AbstractC2937e.billing(function2, this.f14933e, c13770e3);
                Object m3681throw = c13770e3.m3681throw();
                if (m3681throw == C2987e.ad) {
                    m3681throw = AbstractC14533e.startapp(billing);
                    c13770e3.m3682throws(m3681throw);
                }
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
                if (billing != null) {
                    interfaceC3314e.setValue(billing);
                }
                InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11700e, false);
                long j2 = c13770e3.f27286case;
                int i = (int) (j2 ^ (j2 >>> 32));
                InterfaceC3483e advert2 = c13770e3.advert();
                InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e3, C0115e.f1276e);
                InterfaceC5685e.mopub.getClass();
                C7309e c7309e2 = C2721e.vip;
                c13770e3.m3666import();
                if (c13770e3.f27292implements) {
                    c13770e3.mopub(c7309e2);
                } else {
                    c13770e3.m3684volatile();
                }
                AbstractC2270e.yandex(c13770e3, license2, C2721e.billing);
                AbstractC2270e.yandex(c13770e3, advert2, C2721e.purchase);
                AbstractC2270e.yandex(c13770e3, Integer.valueOf(i), C2721e.adcel);
                AbstractC2270e.purchase(c13770e3, C2721e.mopub);
                AbstractC2270e.yandex(c13770e3, purchase2, C2721e.license);
                Function2 function22 = (Function2) interfaceC3314e.getValue();
                if (function22 == null) {
                    c13770e3.m3676strictfp(-1708322641);
                } else {
                    c13770e3.m3676strictfp(-55107182);
                    function22.invoke(c13770e3, 0);
                }
                c13770e3.Signature(false);
                c13770e3.Signature(true);
                return Unit.INSTANCE;
            default:
                C11200e c11200e = (C11200e) this.f14932e;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                C13770e c13770e4 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c13770e4.billing(booleanValue2) ? 4 : 2;
                }
                if (c13770e4.m3673protected(intValue2 & 1, (intValue2 & 19) != 18)) {
                    long j3 = this.f14933e;
                    if (booleanValue2) {
                        c13770e4.m3676strictfp(-499763759);
                        AbstractC6574e.ad(AbstractC18007e.startapp(C0115e.f1276e, AbstractC11148e.metrica), j3, AbstractC11148e.ad, 0L, 0, 0.0f, c13770e4, 390, 56);
                        c13770e4.Signature(false);
                    } else {
                        c13770e4.m3676strictfp(-499540745);
                        boolean purchase3 = c13770e4.purchase(c11200e);
                        Object m3681throw2 = c13770e4.m3681throw();
                        if (purchase3 || m3681throw2 == C2987e.ad) {
                            m3681throw2 = new C6291e(2, c11200e);
                            c13770e4.m3682throws(m3681throw2);
                        }
                        AbstractC11148e.ad((InterfaceC14468e) m3681throw2, j3, c13770e4, 0);
                        c13770e4.Signature(false);
                    }
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
