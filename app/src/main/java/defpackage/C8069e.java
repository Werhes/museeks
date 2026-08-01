package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٜٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8069e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C5352e f16373e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16374e;

    public /* synthetic */ C8069e(C5352e c5352e, int i) {
        this.f16374e = i;
        this.f16373e = c5352e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f16374e) {
            case 0:
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    C13964e billing = AbstractC16497e.billing(16);
                    C5352e c5352e = this.f16373e;
                    boolean yandex = c13770e.yandex(c5352e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C17955e(3, c5352e);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC7023e.ad(null, null, interfaceC12123e, billing, null, null, false, null, (Function1) m3681throw, c13770e, ((intValue << 6) & 896) | 24576, 491);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Unit unit = Unit.INSTANCE;
                    C5352e c5352e2 = this.f16373e;
                    boolean yandex2 = c13770e2.yandex(c5352e2);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw2 == C2987e.ad) {
                        m3681throw2 = new C1496e(c5352e2, null, 1);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC17680e.license(c13770e2, unit, (Function2) m3681throw2);
                    AbstractC0436e.ad(null, false, 0L, c13770e2, 0, 7);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
