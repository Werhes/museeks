package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3506e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C0267e f7930e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7931e;

    public /* synthetic */ C3506e(C0267e c0267e, int i) {
        this.f7931e = 3;
        this.f7930e = c0267e;
    }

    public /* synthetic */ C3506e(C0267e c0267e, int i, byte b) {
        this.f7931e = i;
        this.f7930e = c0267e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7931e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC14489e.vip((String) this.f7930e.f2257e.getValue(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262142);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C0267e c0267e = this.f7930e;
                    boolean yandex = c13770e2.yandex(c0267e);
                    Object m3681throw = c13770e2.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        C17011e c17011e = new C17011e(0, c0267e, C0267e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 28);
                        c13770e2.m3682throws(c17011e);
                        m3681throw = c17011e;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC2835e.vip, c13770e2, 1572864, 62);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    AbstractC10560e.ad(AbstractC2835e.ad, null, AbstractC16653e.license(-108798469, new C3506e(this.f7930e, 1, (byte) 0), c13770e3), null, 0.0f, ((C0916e) c13770e3.adcel(AbstractC12450e.ad)).appmetrica(c13770e3), null, null, c13770e3, 390, 474);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                this.f7930e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
