package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ۠ٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14284e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f28250e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C1925e f28251e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28252e;

    public /* synthetic */ C14284e(C1925e c1925e, InterfaceC16132e interfaceC16132e, int i) {
        this.f28252e = i;
        this.f28251e = c1925e;
        this.f28250e = interfaceC16132e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28252e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    if (((String) this.f28250e.getValue()).length() > 0) {
                        c13770e.m3676strictfp(-266772337);
                        AbstractC10727e metrica = AbstractC12475e.metrica(R.drawable.ic_cancel_outline_28, 0, c13770e);
                        InterfaceC12864e startapp = AbstractC18007e.startapp(C0115e.f1276e, 20);
                        final C1925e c1925e = this.f28251e;
                        boolean yandex = c13770e.yandex(c1925e);
                        Object m3681throw = c13770e.m3681throw();
                        if (yandex || m3681throw == C2987e.ad) {
                            final int i = 0;
                            m3681throw = new Function0() { // from class: eٌۗۖ
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i) {
                                        case 0:
                                            c1925e.yandex.subscription(BuildConfig.FLAVOR);
                                            return Unit.INSTANCE;
                                        default:
                                            c1925e.yandex.subscription(BuildConfig.FLAVOR);
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            c13770e.m3682throws(m3681throw);
                        }
                        AbstractC5647e.vip(metrica, null, AbstractC9546e.license(startapp, false, null, (Function0) m3681throw, 15), 0L, c13770e, 56, 8);
                    } else {
                        c13770e.m3676strictfp(-273939258);
                    }
                    c13770e.Signature(false);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C15492e c15492e = AbstractC11785e.ad;
                    long j = ((C7019e) c13770e2.adcel(c15492e)).ad.Signature;
                    C0115e c0115e = C0115e.f1276e;
                    C5100e c5100e = AbstractC10432e.ad;
                    InterfaceC12864e metrica2 = AbstractC16136e.metrica(c0115e, j, c5100e);
                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e2, 0);
                    long j2 = c13770e2.f27286case;
                    int i2 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert = c13770e2.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, metrica2);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e2, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e2, Integer.valueOf(i2), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
                    C13364e c13364e = AbstractC3338e.ad;
                    C2892e c2892e = AbstractC5400e.ad;
                    C1925e c1925e2 = this.f28251e;
                    AbstractC10560e.license(c2892e, null, AbstractC16653e.license(-1491645318, new C8619e(c1925e2, 0, (byte) 0), c13770e2), null, 0.0f, c13364e, null, null, null, c13770e2, 390, 474);
                    InterfaceC16132e interfaceC16132e = this.f28250e;
                    String str = (String) interfaceC16132e.getValue();
                    boolean yandex2 = c13770e2.yandex(c1925e2);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw2 == C2987e.ad) {
                        m3681throw2 = new C0638e(1, c1925e2, C1925e.class, "onQueryChanged", "onQueryChanged(Ljava/lang/String;)V", 0, 0, 14);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    float f = 16;
                    AbstractC1660e.appmetrica(str, (Function1) ((InterfaceC5261e) m3681throw2), null, AbstractC16136e.metrica(AbstractC12447e.vip(AbstractC18007e.metrica(AbstractC12220e.loadAd(AbstractC12220e.smaato(c0115e, f, 0.0f, 2), 0.0f, 0.0f, 0.0f, f, 7), 1.0f), ((C7019e) c13770e2.adcel(c15492e)).metrica.metrica), ((C7019e) c13770e2.adcel(c15492e)).ad.subscription, c5100e), null, AbstractC5400e.metrica, AbstractC5400e.license, AbstractC16653e.license(1414875036, new C14284e(c1925e2, interfaceC16132e, 0), c13770e2), null, null, c13770e2, 14352384, 788);
                    AbstractC8141e.vip(AbstractC12220e.smaato(c0115e, f, 0.0f, 2), 0.0f, 0L, c13770e2, 6, 6);
                    c13770e2.Signature(true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    C15492e c15492e2 = AbstractC11785e.ad;
                    long j3 = ((C7019e) c13770e3.adcel(c15492e2)).ad.Signature;
                    C0115e c0115e2 = C0115e.f1276e;
                    C5100e c5100e2 = AbstractC10432e.ad;
                    InterfaceC12864e metrica3 = AbstractC16136e.metrica(c0115e2, j3, c5100e2);
                    C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e3, 0);
                    long j4 = c13770e3.f27286case;
                    int i3 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC3483e advert2 = c13770e3.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e3, metrica3);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e2 = C2721e.vip;
                    c13770e3.m3666import();
                    if (c13770e3.f27292implements) {
                        c13770e3.mopub(c7309e2);
                    } else {
                        c13770e3.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e3, ad2, C2721e.billing);
                    AbstractC2270e.yandex(c13770e3, advert2, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e3, Integer.valueOf(i3), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e3, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e3, purchase2, C2721e.license);
                    C13364e c13364e2 = AbstractC3338e.ad;
                    C1925e c1925e3 = this.f28251e;
                    AbstractC10560e.license(AbstractC4628e.ad, null, AbstractC16653e.license(-1020544217, new C8619e(c1925e3, 2, (byte) 0), c13770e3), null, 0.0f, c13364e2, null, null, null, c13770e3, 390, 474);
                    InterfaceC16132e interfaceC16132e2 = this.f28250e;
                    String str2 = (String) interfaceC16132e2.getValue();
                    boolean yandex3 = c13770e3.yandex(c1925e3);
                    Object m3681throw3 = c13770e3.m3681throw();
                    if (yandex3 || m3681throw3 == C2987e.ad) {
                        m3681throw3 = new C11476e(1, c1925e3, C1925e.class, "onQueryChanged", "onQueryChanged(Ljava/lang/String;)V", 0, 0, 13);
                        c13770e3.m3682throws(m3681throw3);
                    }
                    float f2 = 16;
                    AbstractC1660e.appmetrica(str2, (Function1) ((InterfaceC5261e) m3681throw3), null, AbstractC16136e.metrica(AbstractC12447e.vip(AbstractC18007e.metrica(AbstractC12220e.loadAd(AbstractC12220e.smaato(c0115e2, f2, 0.0f, 2), 0.0f, 0.0f, 0.0f, f2, 7), 1.0f), ((C7019e) c13770e3.adcel(c15492e2)).metrica.metrica), ((C7019e) c13770e3.adcel(c15492e2)).ad.subscription, c5100e2), null, AbstractC4628e.metrica, AbstractC4628e.license, AbstractC16653e.license(-693003575, new C14284e(c1925e3, interfaceC16132e2, 3), c13770e3), null, null, c13770e3, 14352384, 788);
                    AbstractC8141e.vip(AbstractC12220e.smaato(c0115e2, f2, 0.0f, 2), 0.0f, 0L, c13770e3, 6, 6);
                    c13770e3.Signature(true);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e4 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (((String) this.f28250e.getValue()).length() > 0) {
                        c13770e4.m3676strictfp(638353064);
                        AbstractC10727e metrica4 = AbstractC12475e.metrica(R.drawable.ic_cancel_outline_28, 0, c13770e4);
                        InterfaceC12864e startapp2 = AbstractC18007e.startapp(C0115e.f1276e, 20);
                        final C1925e c1925e4 = this.f28251e;
                        boolean yandex4 = c13770e4.yandex(c1925e4);
                        Object m3681throw4 = c13770e4.m3681throw();
                        if (yandex4 || m3681throw4 == C2987e.ad) {
                            final int i4 = 1;
                            m3681throw4 = new Function0() { // from class: eٌۗۖ
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i4) {
                                        case 0:
                                            c1925e4.yandex.subscription(BuildConfig.FLAVOR);
                                            return Unit.INSTANCE;
                                        default:
                                            c1925e4.yandex.subscription(BuildConfig.FLAVOR);
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            c13770e4.m3682throws(m3681throw4);
                        }
                        AbstractC5647e.vip(metrica4, null, AbstractC9546e.license(startapp2, false, null, (Function0) m3681throw4, 15), 0L, c13770e4, 56, 8);
                    } else {
                        c13770e4.m3676strictfp(634352793);
                    }
                    c13770e4.Signature(false);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
