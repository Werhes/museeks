package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٞۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9638e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC15377e f19112e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C7836e f19113e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19114e;

    public /* synthetic */ C9638e(C7836e c7836e, InterfaceC15377e interfaceC15377e, int i) {
        this.f19114e = i;
        this.f19113e = c7836e;
        this.f19112e = interfaceC15377e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19114e;
        C13770e c13770e = (C13770e) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC6022e.vip(null, AbstractC16653e.license(-239161190, new C9638e(this.f19113e, this.f19112e, 1), c13770e), c13770e, 48, 1);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    this.f19113e.f15857e.invoke(this.f19112e, c13770e, 0);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
