package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٝۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5049e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C11439e f10776e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10777e;

    public /* synthetic */ C5049e(C11439e c11439e, int i) {
        this.f10777e = i;
        this.f10776e = c11439e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f10777e) {
            case 0:
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    final C11439e c11439e = this.f10776e;
                    boolean yandex = c13770e.yandex(c11439e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        final int i = 0;
                        m3681throw = new Function1() { // from class: eؚّۤ
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i) {
                                    case 0:
                                        C11439e c11439e2 = c11439e;
                                        C0576e c0576e = c11439e2.f23004e;
                                        C17213e c17213e = (C17213e) obj4;
                                        if (((Boolean) c11439e2.f23006e.getValue()).booleanValue()) {
                                            AbstractC5087e.premium(c17213e, null, null, AbstractC9357e.vip, 3);
                                        }
                                        if (!((InterfaceC8346e) c11439e2.f23007e.getValue()).isEmpty()) {
                                            AbstractC5087e.premium(c17213e, null, null, AbstractC9357e.metrica, 3);
                                            AbstractC5087e.premium(c17213e, null, null, new C2892e(862655110, true, new C5049e(c11439e2, 1)), 3);
                                        }
                                        if (!((InterfaceC8346e) c0576e.getValue()).isEmpty()) {
                                            AbstractC5087e.premium(c17213e, null, null, AbstractC9357e.license, 3);
                                            AbstractC5087e.premium(c17213e, null, null, new C2892e(691815653, true, new C5049e(c11439e2, 2)), 3);
                                            InterfaceC8346e interfaceC8346e = (InterfaceC8346e) c0576e.getValue();
                                            c17213e.mopub(((AbstractC7674e) interfaceC8346e).subs(), null, new C6262e(10, interfaceC8346e), new C2892e(802480018, true, new C17447e(interfaceC8346e, c11439e2, 0)));
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        C11439e c11439e3 = c11439e;
                                        InterfaceC8346e interfaceC8346e2 = (InterfaceC8346e) c11439e3.f23007e.getValue();
                                        ((C17213e) obj4).mopub(((AbstractC7674e) interfaceC8346e2).subs(), null, new C6262e(11, interfaceC8346e2), new C2892e(802480018, true, new C17447e(interfaceC8346e2, c11439e3, 1)));
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC7023e.ad(null, null, interfaceC12123e, null, null, null, false, null, (Function1) m3681throw, c13770e, (intValue << 6) & 896, 507);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    C16005e metrica = AbstractC12220e.metrica(16, 0.0f, 2);
                    C13964e billing = AbstractC16497e.billing(8);
                    final C11439e c11439e2 = this.f10776e;
                    boolean yandex2 = c13770e2.yandex(c11439e2);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw2 == C2987e.ad) {
                        final int i2 = 1;
                        m3681throw2 = new Function1() { // from class: eؚّۤ
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i2) {
                                    case 0:
                                        C11439e c11439e22 = c11439e2;
                                        C0576e c0576e = c11439e22.f23004e;
                                        C17213e c17213e = (C17213e) obj4;
                                        if (((Boolean) c11439e22.f23006e.getValue()).booleanValue()) {
                                            AbstractC5087e.premium(c17213e, null, null, AbstractC9357e.vip, 3);
                                        }
                                        if (!((InterfaceC8346e) c11439e22.f23007e.getValue()).isEmpty()) {
                                            AbstractC5087e.premium(c17213e, null, null, AbstractC9357e.metrica, 3);
                                            AbstractC5087e.premium(c17213e, null, null, new C2892e(862655110, true, new C5049e(c11439e22, 1)), 3);
                                        }
                                        if (!((InterfaceC8346e) c0576e.getValue()).isEmpty()) {
                                            AbstractC5087e.premium(c17213e, null, null, AbstractC9357e.license, 3);
                                            AbstractC5087e.premium(c17213e, null, null, new C2892e(691815653, true, new C5049e(c11439e22, 2)), 3);
                                            InterfaceC8346e interfaceC8346e = (InterfaceC8346e) c0576e.getValue();
                                            c17213e.mopub(((AbstractC7674e) interfaceC8346e).subs(), null, new C6262e(10, interfaceC8346e), new C2892e(802480018, true, new C17447e(interfaceC8346e, c11439e22, 0)));
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        C11439e c11439e3 = c11439e2;
                                        InterfaceC8346e interfaceC8346e2 = (InterfaceC8346e) c11439e3.f23007e.getValue();
                                        ((C17213e) obj4).mopub(((AbstractC7674e) interfaceC8346e2).subs(), null, new C6262e(11, interfaceC8346e2), new C2892e(802480018, true, new C17447e(interfaceC8346e2, c11439e3, 1)));
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC7023e.vip(null, null, metrica, billing, null, null, false, null, (Function1) m3681throw2, c13770e2, 24960, 491);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                    InterfaceC12864e metrica2 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                    C11439e c11439e3 = this.f10776e;
                    boolean yandex3 = c13770e3.yandex(c11439e3);
                    Object m3681throw3 = c13770e3.m3681throw();
                    if (yandex3 || m3681throw3 == C2987e.ad) {
                        m3681throw3 = new C12851e(27, c11439e3);
                        c13770e3.m3682throws(m3681throw3);
                    }
                    AbstractC16429e.ad(AbstractC9357e.appmetrica, AbstractC9546e.license(metrica2, false, null, (Function0) m3681throw3, 15), null, null, AbstractC9357e.purchase, null, null, 0.0f, 0.0f, c13770e3, 24582, 492);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
