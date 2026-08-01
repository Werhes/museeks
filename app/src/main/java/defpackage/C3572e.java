package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۗۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3572e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f8056e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f8057e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8058e;

    public /* synthetic */ C3572e(int i, int i2, int i3) {
        this.f8058e = 1;
        this.f8057e = i;
        this.f8056e = i2;
    }

    public /* synthetic */ C3572e(int i, int i2, int i3, byte b) {
        this.f8058e = i3;
        this.f8057e = i;
        this.f8056e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f8058e;
        int i2 = this.f8056e;
        int i3 = this.f8057e;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC14489e.vip(AbstractC5297e.license(R.string.cdcm_progress_step2, new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}, c13770e), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262142);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC18275e.vip(i3, i2, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(4), C5438e.f11668e, c13770e2, 54);
                    long j = c13770e2.f27286case;
                    int i4 = (int) (j ^ (j >>> 32));
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
                    AbstractC2270e.yandex(c13770e2, Integer.valueOf(i4), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
                    AbstractC5647e.vip(AbstractC12475e.metrica(i3, 0, c13770e2), null, AbstractC18007e.startapp(c0115e, 18), 0L, c13770e2, 440, 8);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e2, i2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                    c13770e2.Signature(true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
