package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۜ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8233e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C8004e f16714e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16715e;

    public /* synthetic */ C8233e(C8004e c8004e, int i) {
        this.f16715e = i;
        this.f16714e = c8004e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f16715e) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                int i = 0;
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    float f = AbstractC11992e.ad;
                    long j = C3618e.startapp;
                    C15492e c15492e = AbstractC11785e.ad;
                    C8872e ad = AbstractC11992e.ad(j, ((C7019e) c13770e.adcel(c15492e)).ad.ad, ((C7019e) c13770e.adcel(c15492e)).ad.ad, ((C7019e) c13770e.adcel(c15492e)).ad.ad, c13770e, 472);
                    InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                    C8004e c8004e = this.f16714e;
                    boolean yandex = c13770e.yandex(c8004e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C4793e(c8004e, i);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC16429e.ad(AbstractC12797e.loadAd, AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), null, null, AbstractC12797e.Signature, AbstractC16653e.license(1566362085, new C16973e(c8004e), c13770e), ad, 0.0f, 0.0f, c13770e, 221190, 396);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                long longValue = ((Long) obj3).longValue();
                C8004e c8004e2 = this.f16714e;
                AbstractC16519e.vip((AppActivity) c8004e2.pro(), new C1571e(c8004e2, longValue, (String) obj, intValue2, (InterfaceC5083e) null));
                return Unit.INSTANCE;
        }
    }
}
