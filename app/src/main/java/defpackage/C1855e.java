package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؓۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1855e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C11048e f4949e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4950e;

    public /* synthetic */ C1855e(C11048e c11048e, int i) {
        this.f4950e = i;
        this.f4949e = c11048e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4950e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Number) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC14489e.vip(this.f4949e.vip, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262142);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C11048e c11048e = this.f4949e;
                    String str = c11048e.metrica;
                    String str2 = c11048e.vip;
                    InterfaceC12864e vip = AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 36), AbstractC6549e.ad);
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC8461e.vip(str, str2, vip, new C6159e(((C7019e) c13770e2.adcel(c15492e)).ad.subscription), new C6159e(((C7019e) c13770e2.adcel(c15492e)).ad.subscription), null, c13770e2, 36864, 0, 32736);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
