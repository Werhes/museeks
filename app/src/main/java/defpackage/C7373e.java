package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7373e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f15108e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C10797e f15109e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f15110e;

    public /* synthetic */ C7373e(C10797e c10797e, InterfaceC16132e interfaceC16132e, int i) {
        this.f15110e = i;
        this.f15109e = c10797e;
        this.f15108e = interfaceC16132e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f15110e) {
            case 0:
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    float f = 16;
                    AbstractC12121e.ad(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e), AbstractC6549e.vip(f, f, 0.0f, 0.0f, 12), ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.subscription, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(385615889, new C8328e(this.f15109e, this.f15108e, 2), c13770e), c13770e, 12582912, 120);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    this.f15109e.m2935synchronized(((C2765e) this.f15108e.getValue()).metrica, c13770e2, 0);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
