package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِْٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11830e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f23730e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ String f23731e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23732e = 0;

    public /* synthetic */ C11830e(int i, String str) {
        this.f23730e = i;
        this.f23731e = str;
    }

    public /* synthetic */ C11830e(String str, int i) {
        this.f23731e = str;
        this.f23730e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v6 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? r14;
        C13770e c13770e;
        switch (this.f23732e) {
            case 0:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(8), C5438e.f11668e, c13770e2, 54);
                    long j = c13770e2.f27286case;
                    int i = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e2.advert();
                    C0115e c0115e = C0115e.f1276e;
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, c0115e);
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
                    AbstractC2270e.yandex(c13770e2, Integer.valueOf(i), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
                    AbstractC5647e.vip(AbstractC12475e.metrica(this.f23730e, 0, c13770e2), null, AbstractC18007e.startapp(c0115e, 28), 0L, c13770e2, 440, 8);
                    AbstractC14489e.vip(this.f23731e, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e2, 0, 24960, 241662);
                    c13770e2.Signature(true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e3.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    C15492e c15492e = AbstractC11785e.ad;
                    C1839e c1839e = ((C7019e) c13770e3.adcel(c15492e)).vip.adcel;
                    C0269e c0269e = AbstractC16795e.vip;
                    C1812e c1812e = C1812e.f4889e;
                    AbstractC14489e.vip(this.f23731e, null, 0L, 0L, null, c1812e, c0269e, 0L, null, 0L, 0, false, 0, 0, c1839e, c13770e3, 14155776, 0, 130878);
                    C13770e c13770e4 = c13770e3;
                    int i2 = this.f23730e;
                    if (i2 > 0) {
                        c13770e4.m3676strictfp(1678202189);
                        AbstractC12534e.ad(c13770e4, AbstractC18007e.smaato(C0115e.f1276e, 4));
                        AbstractC14489e.vip(String.valueOf(i2), null, ((C7019e) c13770e4.adcel(c15492e)).ad.remoteconfig, 0L, null, c1812e, c0269e, 0L, null, 0L, 2, false, 1, 0, ((C7019e) c13770e4.adcel(c15492e)).vip.adcel, c13770e4, 14155776, 24960, 110394);
                        c13770e = c13770e4;
                        r14 = 0;
                    } else {
                        r14 = 0;
                        c13770e4.m3676strictfp(1655902928);
                        c13770e = c13770e4;
                    }
                    c13770e.Signature(r14);
                    AbstractC12475e.license.invoke(c13770e, Integer.valueOf((int) r14));
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
