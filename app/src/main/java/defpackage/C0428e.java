package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؑٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0428e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C0764e f2480e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f2481e;

    public /* synthetic */ C0428e(C0764e c0764e, int i) {
        this.f2481e = i;
        this.f2480e = c0764e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f2481e) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    final C0764e c0764e = this.f2480e;
                    boolean z = ((C5267e) c0764e.f3119e.getValue()).f11347e;
                    boolean purchase = c13770e.purchase(c0764e);
                    Object m3681throw = c13770e.m3681throw();
                    if (purchase || m3681throw == C2987e.ad) {
                        final int i = 0;
                        m3681throw = new Function1() { // from class: eًٕۛ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                Boolean bool = (Boolean) obj4;
                                switch (i) {
                                    case 0:
                                        boolean booleanValue = bool.booleanValue();
                                        C0764e c0764e2 = c0764e;
                                        c0764e2.setValue(C5267e.vip((C5267e) c0764e2.f3119e.getValue(), booleanValue, false, 0, 0, null, 62));
                                        return Unit.INSTANCE;
                                    case 1:
                                        boolean booleanValue2 = bool.booleanValue();
                                        C0764e c0764e3 = c0764e;
                                        c0764e3.setValue(C5267e.vip((C5267e) c0764e3.f3119e.getValue(), false, booleanValue2, 0, 0, null, 61));
                                        return Unit.INSTANCE;
                                    case 2:
                                        boolean booleanValue3 = bool.booleanValue();
                                        C0764e c0764e4 = c0764e;
                                        c0764e4.setValue(C6019e.vip((C6019e) c0764e4.f3119e.getValue(), booleanValue3, 0.0f, 6));
                                        return Unit.INSTANCE;
                                    default:
                                        boolean booleanValue4 = bool.booleanValue();
                                        C0764e c0764e5 = c0764e;
                                        c0764e5.setValue(C6019e.vip((C6019e) c0764e5.f3119e.getValue(), booleanValue4, 0.0f, 6));
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC16565e.vip(z, (Function1) m3681throw, AbstractC12220e.loadAd(AbstractC12220e.smaato(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 16, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8, 7), c13770e, 384);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    final C0764e c0764e2 = this.f2480e;
                    boolean z2 = ((C5267e) c0764e2.f3119e.getValue()).f11345e;
                    boolean purchase2 = c13770e2.purchase(c0764e2);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (purchase2 || m3681throw2 == C2987e.ad) {
                        final int i2 = 1;
                        m3681throw2 = new Function1() { // from class: eًٕۛ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                Boolean bool = (Boolean) obj4;
                                switch (i2) {
                                    case 0:
                                        boolean booleanValue = bool.booleanValue();
                                        C0764e c0764e22 = c0764e2;
                                        c0764e22.setValue(C5267e.vip((C5267e) c0764e22.f3119e.getValue(), booleanValue, false, 0, 0, null, 62));
                                        return Unit.INSTANCE;
                                    case 1:
                                        boolean booleanValue2 = bool.booleanValue();
                                        C0764e c0764e3 = c0764e2;
                                        c0764e3.setValue(C5267e.vip((C5267e) c0764e3.f3119e.getValue(), false, booleanValue2, 0, 0, null, 61));
                                        return Unit.INSTANCE;
                                    case 2:
                                        boolean booleanValue3 = bool.booleanValue();
                                        C0764e c0764e4 = c0764e2;
                                        c0764e4.setValue(C6019e.vip((C6019e) c0764e4.f3119e.getValue(), booleanValue3, 0.0f, 6));
                                        return Unit.INSTANCE;
                                    default:
                                        boolean booleanValue4 = bool.booleanValue();
                                        C0764e c0764e5 = c0764e2;
                                        c0764e5.setValue(C6019e.vip((C6019e) c0764e5.f3119e.getValue(), booleanValue4, 0.0f, 6));
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC15077e.billing(AbstractC15920e.metrica, AbstractC15920e.license, z2, (Function1) m3681throw2, c13770e2, 54);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                    final C0764e c0764e3 = this.f2480e;
                    boolean z3 = ((C6019e) c0764e3.f3119e.getValue()).f12677e;
                    boolean purchase3 = c13770e3.purchase(c0764e3);
                    Object m3681throw3 = c13770e3.m3681throw();
                    if (purchase3 || m3681throw3 == C2987e.ad) {
                        final int i3 = 2;
                        m3681throw3 = new Function1() { // from class: eًٕۛ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                Boolean bool = (Boolean) obj4;
                                switch (i3) {
                                    case 0:
                                        boolean booleanValue = bool.booleanValue();
                                        C0764e c0764e22 = c0764e3;
                                        c0764e22.setValue(C5267e.vip((C5267e) c0764e22.f3119e.getValue(), booleanValue, false, 0, 0, null, 62));
                                        return Unit.INSTANCE;
                                    case 1:
                                        boolean booleanValue2 = bool.booleanValue();
                                        C0764e c0764e32 = c0764e3;
                                        c0764e32.setValue(C5267e.vip((C5267e) c0764e32.f3119e.getValue(), false, booleanValue2, 0, 0, null, 61));
                                        return Unit.INSTANCE;
                                    case 2:
                                        boolean booleanValue3 = bool.booleanValue();
                                        C0764e c0764e4 = c0764e3;
                                        c0764e4.setValue(C6019e.vip((C6019e) c0764e4.f3119e.getValue(), booleanValue3, 0.0f, 6));
                                        return Unit.INSTANCE;
                                    default:
                                        boolean booleanValue4 = bool.booleanValue();
                                        C0764e c0764e5 = c0764e3;
                                        c0764e5.setValue(C6019e.vip((C6019e) c0764e5.f3119e.getValue(), booleanValue4, 0.0f, 6));
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e3.m3682throws(m3681throw3);
                    }
                    AbstractC16565e.vip(z3, (Function1) m3681throw3, AbstractC12220e.loadAd(AbstractC12220e.smaato(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 16, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8, 7), c13770e3, 384);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e4 = (C13770e) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 17) != 16)) {
                    final C0764e c0764e4 = this.f2480e;
                    boolean z4 = ((C6019e) c0764e4.f3119e.getValue()).f12677e;
                    boolean purchase4 = c13770e4.purchase(c0764e4);
                    Object m3681throw4 = c13770e4.m3681throw();
                    if (purchase4 || m3681throw4 == C2987e.ad) {
                        final int i4 = 3;
                        m3681throw4 = new Function1() { // from class: eًٕۛ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                Boolean bool = (Boolean) obj4;
                                switch (i4) {
                                    case 0:
                                        boolean booleanValue = bool.booleanValue();
                                        C0764e c0764e22 = c0764e4;
                                        c0764e22.setValue(C5267e.vip((C5267e) c0764e22.f3119e.getValue(), booleanValue, false, 0, 0, null, 62));
                                        return Unit.INSTANCE;
                                    case 1:
                                        boolean booleanValue2 = bool.booleanValue();
                                        C0764e c0764e32 = c0764e4;
                                        c0764e32.setValue(C5267e.vip((C5267e) c0764e32.f3119e.getValue(), false, booleanValue2, 0, 0, null, 61));
                                        return Unit.INSTANCE;
                                    case 2:
                                        boolean booleanValue3 = bool.booleanValue();
                                        C0764e c0764e42 = c0764e4;
                                        c0764e42.setValue(C6019e.vip((C6019e) c0764e42.f3119e.getValue(), booleanValue3, 0.0f, 6));
                                        return Unit.INSTANCE;
                                    default:
                                        boolean booleanValue4 = bool.booleanValue();
                                        C0764e c0764e5 = c0764e4;
                                        c0764e5.setValue(C6019e.vip((C6019e) c0764e5.f3119e.getValue(), booleanValue4, 0.0f, 6));
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e4.m3682throws(m3681throw4);
                    }
                    AbstractC16565e.vip(z4, (Function1) m3681throw4, AbstractC12220e.loadAd(AbstractC12220e.smaato(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 16, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8, 7), c13770e4, 384);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
