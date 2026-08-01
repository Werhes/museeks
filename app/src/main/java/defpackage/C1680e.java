package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1680e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C11188e f4611e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f4612e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4613e = 0;

    public /* synthetic */ C1680e(C11188e c11188e, InterfaceC16132e interfaceC16132e) {
        this.f4611e = c11188e;
        this.f4612e = interfaceC16132e;
    }

    public /* synthetic */ C1680e(InterfaceC16132e interfaceC16132e, C11188e c11188e) {
        this.f4612e = interfaceC16132e;
        this.f4611e = c11188e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f4613e) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    C11188e c11188e = this.f4611e;
                    c11188e.m3057transient(null, AbstractC16653e.license(-766911673, new C15709e(c11188e, this.f4612e, 22), c13770e), AbstractC16653e.license(-633324762, new C1422e(c11188e), c13770e), c13770e, 432);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    float f = 16;
                    float f2 = 8;
                    C16005e appmetrica = AbstractC12220e.appmetrica(f, 0.0f, f, f2, 2);
                    C13964e billing = AbstractC16497e.billing(f2);
                    InterfaceC16132e interfaceC16132e = this.f4612e;
                    boolean purchase = c13770e2.purchase(interfaceC16132e);
                    C11188e c11188e2 = this.f4611e;
                    boolean yandex = purchase | c13770e2.yandex(c11188e2);
                    Object m3681throw = c13770e2.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C6538e(interfaceC16132e, c11188e2, 12);
                        c13770e2.m3682throws(m3681throw);
                    }
                    AbstractC7023e.vip(null, null, appmetrica, billing, null, null, false, null, (Function1) m3681throw, c13770e2, 24960, 491);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
