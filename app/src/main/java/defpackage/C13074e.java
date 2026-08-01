package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؗۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13074e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C0046e f26007e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f26008e;

    public /* synthetic */ C13074e(C0046e c0046e, int i) {
        this.f26008e = 1;
        this.f26007e = c0046e;
    }

    public /* synthetic */ C13074e(C0046e c0046e, int i, byte b) {
        this.f26008e = i;
        this.f26007e = c0046e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f26008e;
        C0046e c0046e = this.f26007e;
        Object[] objArr = 0;
        int i2 = 2;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C16005e c16005e = AbstractC9083e.ad;
                    C15492e c15492e = AbstractC11785e.ad;
                    C13793e purchase = AbstractC9083e.purchase(((C7019e) c13770e.adcel(c15492e)).ad.Signature, ((C7019e) c13770e.adcel(c15492e)).ad.subscription, 0L, 0L, 0L, c13770e, 60);
                    AbstractC10560e.license(AbstractC16155e.ad, AbstractC16136e.metrica(C0115e.f1276e, ((C7019e) c13770e.adcel(c15492e)).ad.Signature, AbstractC10432e.ad), AbstractC16653e.license(1201459937, new C13074e(c0046e, i2, objArr == true ? 1 : 0), c13770e), null, 0.0f, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).appmetrica(c13770e), purchase, null, null, c13770e, 390, 408);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                c0046e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C0046e c0046e2 = this.f26007e;
                    boolean yandex = c13770e2.yandex(c0046e2);
                    Object m3681throw = c13770e2.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C6317e(0, c0046e2, C0046e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 13);
                        c13770e2.m3682throws(m3681throw);
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC16155e.vip, c13770e2, 1572864, 62);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
