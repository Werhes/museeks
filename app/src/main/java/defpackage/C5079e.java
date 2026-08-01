package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5079e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C3625e f10914e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10915e;

    public /* synthetic */ C5079e(C3625e c3625e, int i) {
        this.f10915e = 1;
        this.f10914e = c3625e;
    }

    public /* synthetic */ C5079e(C3625e c3625e, int i, byte b) {
        this.f10915e = i;
        this.f10914e = c3625e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10915e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C3625e c3625e = this.f10914e;
                    AbstractC10560e.license(AbstractC16653e.license(-24958923, new C5079e(c3625e, 2, (byte) 0), c13770e), null, AbstractC16653e.license(462114803, new C5079e(c3625e, 3, (byte) 0), c13770e), null, 0.0f, null, null, null, null, c13770e, 390, 506);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                this.f10914e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AbstractC14489e.vip(this.f10914e.f8168e.vip, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    C3625e c3625e2 = this.f10914e;
                    boolean yandex = c13770e3.yandex(c3625e2);
                    Object m3681throw = c13770e3.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        C7736e c7736e = new C7736e(0, c3625e2, C3625e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 2);
                        c13770e3.m3682throws(c7736e);
                        m3681throw = c7736e;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC8306e.ad, c13770e3, 1572864, 62);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
