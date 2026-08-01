package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؓؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1704e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2566e f4640e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C5421e f4641e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4642e = 1;

    public /* synthetic */ C1704e(C5421e c5421e, InterfaceC2566e interfaceC2566e) {
        this.f4641e = c5421e;
        this.f4640e = interfaceC2566e;
    }

    public /* synthetic */ C1704e(C10339e c10339e, C5421e c5421e) {
        this.f4640e = c10339e;
        this.f4641e = c5421e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f4642e;
        C5421e c5421e = this.f4641e;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C16005e c16005e = AbstractC9083e.ad;
                    C13793e purchase = AbstractC9083e.purchase(C3618e.startapp, 0L, 0L, 0L, 0L, c13770e, 62);
                    InterfaceC2566e interfaceC2566e = this.f4640e;
                    AbstractC10560e.license(AbstractC16653e.license(958024512, new C1704e(c5421e, interfaceC2566e), c13770e), null, AbstractC16653e.license(2115556802, new C16649e(c5421e), c13770e), null, 0.0f, null, purchase, interfaceC2566e, null, c13770e, 390, 314);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AbstractC14489e.vip(c5421e.m1909transient().ad.license, AbstractC1376e.ad(C0115e.f1276e, this.f4640e.getState().vip()), 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e2, 0, 24960, 241660);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
