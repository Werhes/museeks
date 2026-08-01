package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C18227e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4837e f35697e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35698e;

    public /* synthetic */ C18227e(C4837e c4837e, int i) {
        this.f35698e = i;
        this.f35697e = c4837e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f35698e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    long j = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.Signature;
                    C5100e c5100e = AbstractC10432e.ad;
                    C0115e c0115e = C0115e.f1276e;
                    InterfaceC12864e metrica = AbstractC16136e.metrica(c0115e, j, c5100e);
                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e, 0);
                    long j2 = c13770e.f27286case;
                    int i = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, metrica);
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
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    C13364e c13364e = AbstractC3338e.ad;
                    C4837e c4837e = this.f35697e;
                    AbstractC10560e.license(AbstractC16653e.license(-1675783099, new C18227e(c4837e, 1), c13770e), null, AbstractC16653e.license(1933416579, new C18227e(c4837e, 2), c13770e), null, 0.0f, c13364e, null, null, null, c13770e, 196998, 474);
                    AbstractC8141e.vip(AbstractC12220e.smaato(c0115e, 16, 0.0f, 2), 0.0f, 0L, c13770e, 6, 6);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AbstractC14489e.vip(this.f35697e.vip, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    C4837e c4837e2 = this.f35697e;
                    boolean yandex = c13770e3.yandex(c4837e2);
                    Object m3681throw = c13770e3.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        C7755e c7755e = new C7755e(0, c4837e2, C4837e.class, "onDismissClicked", "onDismissClicked()V", 0, 0, 2);
                        c13770e3.m3682throws(c7755e);
                        m3681throw = c7755e;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC14114e.ad, c13770e3, 1572864, 62);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
