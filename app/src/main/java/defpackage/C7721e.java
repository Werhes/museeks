package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؕۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7721e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C5422e f15671e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f15672e;

    public /* synthetic */ C7721e(C5422e c5422e, int i) {
        this.f15672e = i;
        this.f15671e = c5422e;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [eٍِۚ, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f15672e;
        int i2 = 4;
        C5170e c5170e = C2987e.ad;
        C5422e c5422e = this.f15671e;
        int i3 = 1;
        switch (i) {
            case 0:
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    ?? obj4 = new Object();
                    InterfaceC12864e adcel = AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e);
                    float f = 16;
                    C16005e c16005e = new C16005e(f, f, f, f);
                    float f2 = 8;
                    C13964e billing = AbstractC16497e.billing(f2);
                    boolean yandex = c13770e.yandex(c5422e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == c5170e) {
                        m3681throw = new C17955e(i2, c5422e);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC8457e.ad(obj4, adcel, null, c16005e, f2, billing, null, false, null, (Function1) m3681throw, c13770e, 1772544);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    C0115e c0115e = C0115e.f1276e;
                    float f3 = 36;
                    InterfaceC12864e mopub = AbstractC12220e.mopub(AbstractC18007e.metrica(c0115e, 1.0f), f3);
                    float f4 = 8;
                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(f4), C5438e.f11678e, c13770e2, 54);
                    long j = c13770e2.f27286case;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e2.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, mopub);
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
                    AbstractC2270e.yandex(c13770e2, Integer.valueOf(i4), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
                    C15492e c15492e = AbstractC11785e.ad;
                    this.f15671e.m1912strictfp(R.drawable.ic_add_square_outline_28, AbstractC12220e.loadAd(c0115e, 0.0f, 0.0f, 0.0f, f4, 7), ((C7019e) c13770e2.adcel(c15492e)).ad.ad, true, f3, 0.0f, c13770e2, 27696, 32);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e2, R.string.bc_v2_title), null, ((C7019e) c13770e2.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(c15492e)).vip.license, c13770e2, 0, 0, 130042);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e2, R.string.bc_v2_subtitle), null, ((C7019e) c13770e2.adcel(c15492e)).ad.remoteconfig, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(c15492e)).vip.adcel, c13770e2, 0, 0, 130042);
                    c13770e2.Signature(true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                    boolean yandex2 = c13770e3.yandex(c5422e);
                    Object m3681throw2 = c13770e3.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        m3681throw2 = new C10569e(c5422e, i3);
                        c13770e3.m3682throws(m3681throw2);
                    }
                    AbstractC0014e.metrica((Function0) m3681throw2, null, false, null, null, null, AbstractC12184e.metrica, c13770e3, 1572864, 62);
                    boolean yandex3 = c13770e3.yandex(c5422e);
                    Object m3681throw3 = c13770e3.m3681throw();
                    if (yandex3 || m3681throw3 == c5170e) {
                        m3681throw3 = new C10569e(c5422e, r3);
                        c13770e3.m3682throws(m3681throw3);
                    }
                    AbstractC0014e.metrica((Function0) m3681throw3, null, false, null, null, null, AbstractC12184e.license, c13770e3, 1572864, 62);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e4 = (C13770e) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 17) != 16)) {
                    boolean yandex4 = c13770e4.yandex(c5422e);
                    Object m3681throw4 = c13770e4.m3681throw();
                    if (yandex4 || m3681throw4 == c5170e) {
                        m3681throw4 = new C10569e(c5422e, i2);
                        c13770e4.m3682throws(m3681throw4);
                    }
                    C16005e c16005e2 = AbstractC10244e.ad;
                    AbstractC1513e.license((Function0) m3681throw4, null, false, AbstractC10432e.ad, AbstractC10244e.purchase(((C7019e) c13770e4.adcel(AbstractC11785e.ad)).ad.ad, 0L, c13770e4, 13), AbstractC12220e.metrica(0, 0.0f, 2), AbstractC12184e.billing, c13770e4, 817892352, 358);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
