package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۚۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5150e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2462e f11035e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11036e;

    public /* synthetic */ C5150e(C2462e c2462e, int i) {
        this.f11036e = 1;
        this.f11035e = c2462e;
    }

    public /* synthetic */ C5150e(C2462e c2462e, int i, byte b) {
        this.f11036e = i;
        this.f11035e = c2462e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11036e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    float f = 16;
                    InterfaceC12864e loadAd = AbstractC12220e.loadAd(C0115e.f1276e, f, 0.0f, f, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).ad(c13770e) + f, 2);
                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11678e, c13770e, 48);
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
                    AbstractC2270e.yandex(c13770e, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    C8464e.ad.ad(null, 0.0f, 0.0f, null, 0L, c13770e, 196608, 31);
                    AbstractC0865e.ad(null, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).metrica.license, null, null, null, AbstractC16653e.license(-663257643, new C17871e(12, this.f11035e), c13770e), c13770e, 196608, 29);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                this.f11035e.tapsense((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (this.f11035e.f6298e instanceof C2576e) {
                        c13770e2.m3676strictfp(754178385);
                        AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_check_circle_16, 0, c13770e2), null, null, 0L, c13770e2, 56, 12);
                    } else {
                        c13770e2.m3676strictfp(751156970);
                    }
                    c13770e2.Signature(false);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (this.f11035e.f6298e instanceof C14411e) {
                        c13770e3.m3676strictfp(813629082);
                        AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_check_circle_16, 0, c13770e3), null, null, 0L, c13770e3, 56, 12);
                    } else {
                        c13770e3.m3676strictfp(809308147);
                    }
                    c13770e3.Signature(false);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
