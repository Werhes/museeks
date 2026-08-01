package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؒؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0806e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C14564e f3195e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f3196e;

    public /* synthetic */ C0806e(C14564e c14564e, int i) {
        this.f3196e = 2;
        this.f3195e = c14564e;
    }

    public /* synthetic */ C0806e(C14564e c14564e, int i, byte b) {
        this.f3196e = i;
        this.f3195e = c14564e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3196e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC10560e.license(AbstractC10672e.ad, null, AbstractC16653e.license(1321040347, new C0806e(this.f3195e, 3, (byte) 0), c13770e), null, 0.0f, AbstractC3338e.ad, null, null, null, c13770e, 196998, 474);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C14564e c14564e = this.f3195e;
                    boolean booleanValue = ((Boolean) c14564e.f28777e.getValue()).booleanValue();
                    boolean yandex = c13770e2.yandex(c14564e);
                    Object m3681throw = c13770e2.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        C11476e c11476e = new C11476e(1, c14564e, C14564e.class, "setStreamValue", "setStreamValue(Z)V", 0, 0, 20);
                        c13770e2.m3682throws(c11476e);
                        m3681throw = c11476e;
                    }
                    AbstractC8844e.ad(booleanValue, (Function1) ((InterfaceC5261e) m3681throw), null, false, null, c13770e2, 0, 124);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                this.f3195e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    C14564e c14564e2 = this.f3195e;
                    boolean yandex2 = c13770e3.yandex(c14564e2);
                    Object m3681throw2 = c13770e3.m3681throw();
                    if (yandex2 || m3681throw2 == C2987e.ad) {
                        C7755e c7755e = new C7755e(0, c14564e2, C14564e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 5);
                        c13770e3.m3682throws(c7755e);
                        m3681throw2 = c7755e;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw2), null, false, null, null, null, AbstractC10672e.vip, c13770e3, 1572864, 62);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
