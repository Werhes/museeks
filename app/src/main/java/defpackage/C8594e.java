package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8594e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C10137e f17416e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17417e = 0;

    public /* synthetic */ C8594e(C10137e c10137e) {
        this.f17416e = c10137e;
    }

    public /* synthetic */ C8594e(C10137e c10137e, int i) {
        this.f17416e = c10137e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17417e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    float f = 16;
                    float ad = ((C0916e) c13770e.adcel(AbstractC12450e.ad)).ad(c13770e) + f;
                    C0115e c0115e = C0115e.f1276e;
                    InterfaceC12864e loadAd = AbstractC12220e.loadAd(c0115e, f, 0.0f, f, ad, 2);
                    C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11678e, c13770e, 48);
                    long j = c13770e.f27286case;
                    int i = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, loadAd);
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
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    C8464e.ad.ad(null, 0.0f, 0.0f, null, 0L, c13770e, 196608, 31);
                    String appmetrica = AbstractC5297e.appmetrica(c13770e, R.string.true_shuffle_warn);
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica, AbstractC18007e.metrica(c0115e, 1.0f), ((C7019e) c13770e.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.appmetrica, c13770e, 48, 0, 130040);
                    AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, f));
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, R.string.true_shuffle_warn_text), AbstractC18007e.metrica(c0115e, 1.0f), ((C7019e) c13770e.adcel(c15492e)).ad.remoteconfig, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.mopub, c13770e, 48, 0, 130040);
                    AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, f));
                    AbstractC0865e.ad(null, ((C7019e) c13770e.adcel(c15492e)).metrica.license, null, null, null, AbstractC16653e.license(1879951669, new C17871e(25, this.f17416e), c13770e), c13770e, 196608, 29);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                this.f17416e.tapsense((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
