package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕ٘ۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3441e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ EnumC6916e f7696e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C15318e f7697e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7698e;

    public /* synthetic */ C3441e(C15318e c15318e, EnumC6916e enumC6916e, int i) {
        this.f7698e = i;
        this.f7697e = c15318e;
        this.f7696e = enumC6916e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7698e;
        C0115e c0115e = C0115e.f1276e;
        EnumC6916e enumC6916e = this.f7696e;
        C15318e c15318e = this.f7697e;
        int i2 = 1;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C16005e c16005e = AbstractC9083e.ad;
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC10560e.license(AbstractC16653e.license(1493671012, new C3441e(c15318e, enumC6916e, i2), c13770e), AbstractC16136e.metrica(c0115e, ((C7019e) c13770e.adcel(c15492e)).ad.Signature, AbstractC10432e.ad), null, null, 0.0f, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).appmetrica(c13770e), AbstractC9083e.license(((C7019e) c13770e.adcel(c15492e)).ad.Signature, 0L, 0L, c13770e, 30), null, null, c13770e, 6, 412);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(16), C5438e.f11668e, c13770e2, 54);
                    long j = c13770e2.f27286case;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e2.advert();
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
                    AbstractC2270e.yandex(c13770e2, Integer.valueOf(i3), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
                    Object m3681throw = c13770e2.m3681throw();
                    if (m3681throw == C2987e.ad) {
                        m3681throw = AbstractC4628e.purchase(c15318e.pro(), enumC6916e.f14176e);
                        c13770e2.m3682throws(m3681throw);
                    }
                    AbstractC16268e.ad(AbstractC6845e.ad((Drawable) m3681throw, c13770e2), AbstractC18007e.startapp(c0115e, 28), null, null, 0.0f, c13770e2, 440, 120);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e2, R.string.app_name), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                    c13770e2.Signature(true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
