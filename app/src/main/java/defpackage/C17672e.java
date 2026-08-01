package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَ٘ۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17672e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f34636e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C15435e f34637e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34638e;

    public /* synthetic */ C17672e(C15435e c15435e, InterfaceC16132e interfaceC16132e, int i) {
        this.f34638e = i;
        this.f34637e = c15435e;
        this.f34636e = interfaceC16132e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f34638e) {
            case 0:
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    float f = 16;
                    AbstractC12121e.ad(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e), AbstractC6549e.vip(f, f, 0.0f, 0.0f, 12), ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.subscription, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(1857381333, new C13312e(this.f34637e, this.f34636e, 1), c13770e), c13770e, 12582912, 120);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    this.f34637e.m3996synchronized(((C2765e) this.f34636e.getValue()).metrica, c13770e2, 0);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
