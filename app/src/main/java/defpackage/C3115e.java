package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3115e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f7188e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C5421e f7189e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7190e;

    public /* synthetic */ C3115e(C5421e c5421e, int i, int i2) {
        this.f7190e = i2;
        this.f7189e = c5421e;
        this.f7188e = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = this.f7190e;
        C5170e c5170e = C2987e.ad;
        int i2 = this.f7188e;
        C5421e c5421e = this.f7189e;
        int i3 = 1;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    float f = 16;
                    InterfaceC12864e smaato = AbstractC12220e.smaato(C0115e.f1276e, f, 0.0f, 2);
                    float f2 = 8;
                    C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(f2), C5438e.f11668e, c13770e, 54);
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
                    AbstractC2270e.yandex(c13770e, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i4), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    C16005e c16005e = new C16005e(f, f2, f, f2);
                    C16005e c16005e2 = AbstractC10244e.ad;
                    C15492e c15492e = AbstractC11785e.ad;
                    C3134e ad2 = AbstractC10244e.ad(((C7019e) c13770e.adcel(c15492e)).ad.admob, ((C7019e) c13770e.adcel(c15492e)).ad.tapsense, 0L, 0L, c13770e, 12);
                    C3924e ad3 = AbstractC6549e.ad(f2);
                    boolean yandex = c13770e.yandex(c5421e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == c5170e) {
                        m3681throw = new C13991e(c5421e, 1);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC1513e.ad((Function0) m3681throw, null, false, ad3, ad2, null, null, c16005e, AbstractC16653e.license(991698381, new C3115e(c5421e, i2, i3), c13770e), c13770e, 817889280, 358);
                    if (c5421e.m1909transient().ad.advert.length() > 0) {
                        c13770e.m3676strictfp(-349088756);
                        boolean yandex2 = c13770e.yandex(c5421e);
                        Object m3681throw2 = c13770e.m3681throw();
                        if (yandex2 || m3681throw2 == c5170e) {
                            m3681throw2 = new C13991e(c5421e, 2);
                            c13770e.m3682throws(m3681throw2);
                        }
                        AbstractC0014e.metrica((Function0) m3681throw2, null, false, null, null, null, AbstractC14073e.metrica, c13770e, 1572864, 62);
                        z = false;
                    } else {
                        z = false;
                        c13770e.m3676strictfp(-368550587);
                    }
                    c13770e.Signature(z);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Boolean bool = (Boolean) c5421e.f11610e.getValue();
                    bool.booleanValue();
                    boolean license = c13770e2.license(i2);
                    Object m3681throw3 = c13770e2.m3681throw();
                    if (license || m3681throw3 == c5170e) {
                        m3681throw3 = new C17028e(i2, 18);
                        c13770e2.m3682throws(m3681throw3);
                    }
                    AbstractC7572e.vip(bool, null, (Function1) m3681throw3, null, null, null, AbstractC14073e.vip, c13770e2, 1572864, 58);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
