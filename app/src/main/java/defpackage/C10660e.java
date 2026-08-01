package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۦؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10660e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13642e f20997e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20998e;

    public /* synthetic */ C10660e(C13642e c13642e, int i) {
        this.f20998e = 2;
        this.f20997e = c13642e;
    }

    public /* synthetic */ C10660e(C13642e c13642e, int i, byte b) {
        this.f20998e = i;
        this.f20997e = c13642e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20998e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C13642e c13642e = this.f20997e;
                    boolean yandex = c13770e.yandex(c13642e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        C7755e c7755e = new C7755e(0, c13642e, C13642e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 11);
                        c13770e.m3682throws(c7755e);
                        m3681throw = c7755e;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC2127e.vip, c13770e, 1572864, 62);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AbstractC10560e.license(AbstractC2127e.ad, null, AbstractC16653e.license(-1643696457, new C10660e(this.f20997e, 0, (byte) 0), c13770e2), null, 0.0f, null, null, null, null, c13770e2, 390, 506);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                this.f20997e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
