package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9957e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C6943e f19675e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19676e;

    public /* synthetic */ C9957e(int i, C6943e c6943e) {
        this.f19676e = i;
        this.f19675e = c6943e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f19676e;
        String str = BuildConfig.FLAVOR;
        C0115e c0115e = C0115e.f1276e;
        C6943e c6943e = this.f19675e;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    String appmetrica = AbstractC5297e.appmetrica(c13770e, R.string.book_about);
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica, AbstractC18007e.metrica(c0115e, 1.0f), ((C7019e) c13770e.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.appmetrica, c13770e, 48, 0, 130040);
                    float f = 16;
                    AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, f));
                    String str2 = c6943e.vip;
                    if (str2 != null) {
                        str = str2;
                    }
                    AbstractC14489e.vip(str, AbstractC5967e.purchase(AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), f, 0.0f, 2), AbstractC5967e.appmetrica(c13770e), true), ((C7019e) c13770e.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.adcel, c13770e, 0, 0, 131064);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    float f2 = 16;
                    InterfaceC12864e loadAd = AbstractC12220e.loadAd(AbstractC12220e.smaato(c0115e, f2, 0.0f, 2), 0.0f, 0.0f, 0.0f, f2, 7);
                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e2, 0);
                    long j = c13770e2.f27286case;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e2.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, loadAd);
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
                    Integer num = c6943e.loadAd;
                    String license = AbstractC5297e.license(R.string.book_age_restriction, new Object[]{Integer.valueOf(num != null ? num.intValue() : 0)}, c13770e2);
                    C15492e c15492e2 = AbstractC11785e.ad;
                    AbstractC14489e.vip(license, null, ((C7019e) c13770e2.adcel(c15492e2)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262138);
                    String str3 = c6943e.purchase;
                    AbstractC14489e.vip(str3 == null ? BuildConfig.FLAVOR : str3, null, ((C7019e) c13770e2.adcel(c15492e2)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262138);
                    c13770e2.Signature(true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
