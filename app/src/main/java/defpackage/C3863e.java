package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؔۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3863e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C8054e f8701e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8702e;

    public /* synthetic */ C3863e(C8054e c8054e, int i) {
        this.f8702e = i;
        this.f8701e = c8054e;
    }

    public /* synthetic */ C3863e(C8054e c8054e, int i, int i2) {
        this.f8702e = i2;
        this.f8701e = c8054e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8702e) {
            case 0:
                ((Integer) obj2).getClass();
                this.f8701e.isVip((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                this.f8701e.tapsense((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, this.f8701e.ads() ? R.string.library_mass_action_invert_desc_on : R.string.library_mass_action_invert_desc_off), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262142);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C8054e c8054e = this.f8701e;
                    boolean ads = c8054e.ads();
                    boolean yandex = c13770e2.yandex(c8054e);
                    Object m3681throw = c13770e2.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C8385e(c8054e, 0);
                        c13770e2.m3682throws(m3681throw);
                    }
                    AbstractC8844e.ad(ads, (Function1) m3681throw, null, false, null, c13770e2, 0, 124);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    C8054e c8054e2 = this.f8701e;
                    boolean applovin = c8054e2.applovin();
                    boolean yandex2 = c13770e3.yandex(c8054e2);
                    Object m3681throw2 = c13770e3.m3681throw();
                    if (yandex2 || m3681throw2 == C2987e.ad) {
                        m3681throw2 = new C8385e(c8054e2, 2);
                        c13770e3.m3682throws(m3681throw2);
                    }
                    AbstractC8844e.ad(applovin, (Function1) m3681throw2, null, false, null, c13770e3, 0, 124);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                this.f8701e.inmobi((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
