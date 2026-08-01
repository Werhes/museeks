package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۙٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9718e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9512e f19216e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19217e;

    public /* synthetic */ C9718e(AbstractC9512e abstractC9512e, int i) {
        this.f19217e = i;
        this.f19216e = abstractC9512e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19217e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    InterfaceC12864e billing = AbstractC5400e.billing(C0115e.f1276e, AbstractC5400e.startapp);
                    InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
                    long j = c13770e.f27286case;
                    int i = (int) (j ^ (j >>> 32));
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
                    AbstractC2270e.yandex(c13770e, license, C2721e.billing);
                    AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    AbstractC9512e abstractC9512e = this.f19216e;
                    abstractC9512e.f18865e.Signature(AbstractC16653e.license(1816183988, new C9718e(abstractC9512e, 1), c13770e), c13770e, 6, 0);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AbstractC9512e abstractC9512e2 = this.f19216e;
                    boolean yandex = c13770e2.yandex(abstractC9512e2);
                    Object m3681throw = c13770e2.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C6765e(abstractC9512e2, 4);
                        c13770e2.m3682throws(m3681throw);
                    }
                    AbstractC0014e.metrica((Function0) m3681throw, null, false, null, null, null, C4094e.vip, c13770e2, 1572864, 62);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
