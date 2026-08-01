package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؔؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2494e implements Function4 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C6260e f6340e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ List f6341e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6342e;

    public /* synthetic */ C2494e(List list, C6260e c6260e, int i) {
        this.f6342e = i;
        this.f6341e = list;
        this.f6340e = c6260e;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        switch (this.f6342e) {
            case 0:
                C18055e c18055e = (C18055e) obj;
                int intValue = ((Number) obj2).intValue();
                C13770e c13770e = (C13770e) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (c13770e.purchase(c18055e) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= c13770e.license(intValue) ? 32 : 16;
                }
                if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
                    C9552e c9552e = (C9552e) this.f6341e.get(intValue);
                    c13770e.m3676strictfp(-1595551678);
                    InterfaceC4402e interfaceC4402e = c9552e.vip;
                    C0115e c0115e = C0115e.f1276e;
                    interfaceC4402e.ad(AbstractC15920e.crashlytics(AbstractC8703e.mopub(c18055e, c0115e), intValue == 0, AbstractC18366e.license(c0115e, this.f6340e)), c13770e, 0);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C18055e c18055e2 = (C18055e) obj;
                int intValue3 = ((Number) obj2).intValue();
                C13770e c13770e2 = (C13770e) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = (c13770e2.purchase(c18055e2) ? 4 : 2) | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= c13770e2.license(intValue3) ? 32 : 16;
                }
                if (c13770e2.m3673protected(i2 & 1, (i2 & 147) != 146)) {
                    C0262e c0262e = (C0262e) this.f6341e.get(intValue3);
                    c13770e2.m3676strictfp(-436381100);
                    InterfaceC0284e interfaceC0284e = c0262e.vip;
                    boolean z = intValue3 == 0;
                    C6260e c6260e = this.f6340e;
                    InterfaceC12864e interfaceC12864e = C0115e.f1276e;
                    InterfaceC12864e license = AbstractC18366e.license(interfaceC12864e, c6260e);
                    if (z) {
                        interfaceC12864e = license;
                    }
                    interfaceC0284e.ad(interfaceC12864e, c13770e2, 0);
                    c13770e2.Signature(false);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C3366e c3366e = (C3366e) obj;
                int intValue5 = ((Number) obj2).intValue();
                C13770e c13770e3 = (C13770e) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i3 = (c13770e3.purchase(c3366e) ? 4 : 2) | intValue6;
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= c13770e3.license(intValue5) ? 32 : 16;
                }
                if (c13770e3.m3673protected(i3 & 1, (i3 & 147) != 146)) {
                    C0262e c0262e2 = (C0262e) this.f6341e.get(intValue5);
                    c13770e3.m3676strictfp(-1157372667);
                    InterfaceC0284e interfaceC0284e2 = c0262e2.vip;
                    C0115e c0115e2 = C0115e.f1276e;
                    interfaceC0284e2.ad(AbstractC15920e.crashlytics(AbstractC18007e.smaato(c0115e2, 300), intValue5 == 0, AbstractC18366e.license(c0115e2, this.f6340e)), c13770e3, 0);
                    c13770e3.Signature(false);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
