package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؗؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4684e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C11683e f10066e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10067e = 0;

    public /* synthetic */ C4684e(C11683e c11683e) {
        this.f10066e = c11683e;
    }

    public /* synthetic */ C4684e(C11683e c11683e, int i) {
        this.f10066e = c11683e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10067e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    float ad = ((C0916e) c13770e.adcel(AbstractC12450e.ad)).ad(c13770e);
                    C0115e c0115e = C0115e.f1276e;
                    InterfaceC12864e billing = AbstractC5400e.billing(AbstractC12220e.loadAd(c0115e, 0.0f, 0.0f, 0.0f, ad, 7), AbstractC5400e.adcel);
                    C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11678e, c13770e, 48);
                    long j = c13770e.f27286case;
                    int i = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, billing);
                    InterfaceC5685e.mopub.getClass();
                    Function0 function0 = C2721e.vip;
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(function0);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, ad2, C2721e.billing);
                    AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    C8464e.ad.ad(null, 0.0f, 0.0f, null, 0L, c13770e, 196608, 31);
                    C11683e c11683e = this.f10066e;
                    String appmetrica = AbstractC5297e.appmetrica(c13770e, c11683e.f23494e);
                    AbstractC4455e abstractC4455e = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica, AbstractC18007e.metrica(c0115e, 1.0f), ((C7019e) c13770e.adcel(abstractC4455e)).ad.admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(abstractC4455e)).vip.appmetrica, c13770e, 48, 0, 130040);
                    AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, 16));
                    boolean yandex = c13770e.yandex(c11683e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C6846e(2, c11683e);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC7023e.ad(null, null, null, null, null, null, false, null, (Function1) m3681throw, c13770e, 0, 511);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                this.f10066e.tapsense((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
