package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3939e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C3409e f8784e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8785e;

    public /* synthetic */ C3939e(C3409e c3409e, int i) {
        this.f8785e = 2;
        this.f8784e = c3409e;
    }

    public /* synthetic */ C3939e(C3409e c3409e, int i, byte b) {
        this.f8785e = i;
        this.f8784e = c3409e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f8785e;
        C3409e c3409e = this.f8784e;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C3409e c3409e2 = this.f8784e;
                    boolean yandex = c13770e.yandex(c3409e2);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        C12829e c12829e = new C12829e(0, c3409e2, C3409e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 18);
                        c13770e.m3682throws(c12829e);
                        m3681throw = c12829e;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC11160e.vip, c13770e, 1572864, 62);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C16005e c16005e = AbstractC9083e.ad;
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC10560e.license(AbstractC11160e.ad, AbstractC16136e.metrica(C0115e.f1276e, ((C7019e) c13770e2.adcel(c15492e)).ad.Signature, AbstractC10432e.ad), AbstractC16653e.license(2126600792, new C3939e(c3409e, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0), c13770e2), null, 0.0f, ((C0916e) c13770e2.adcel(AbstractC12450e.ad)).appmetrica(c13770e2), AbstractC9083e.purchase(((C7019e) c13770e2.adcel(c15492e)).ad.Signature, ((C7019e) c13770e2.adcel(c15492e)).ad.subscription, 0L, 0L, 0L, c13770e2, 60), null, null, c13770e2, 390, 408);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                c3409e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
