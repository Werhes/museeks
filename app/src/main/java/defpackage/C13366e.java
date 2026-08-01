package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٜٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13366e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C10376e f26620e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f26621e;

    public /* synthetic */ C13366e(C10376e c10376e, int i) {
        this.f26621e = i;
        this.f26620e = c10376e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long billing;
        long billing2;
        int i = this.f26621e;
        int i2 = 2;
        C5170e c5170e = C2987e.ad;
        C10376e c10376e = this.f26620e;
        char c = 1;
        char c2 = 1;
        byte b = 0;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    float f = AbstractC11992e.ad;
                    AbstractC16429e.ad(AbstractC1574e.billing, null, null, null, null, AbstractC16653e.license(1704885083, new C9123e(c10376e, i2, b), c13770e), AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e, 510), 0.0f, 0.0f, c13770e, 196614, 414);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    float f2 = AbstractC11992e.ad;
                    AbstractC16429e.ad(AbstractC1574e.purchase, null, null, null, null, AbstractC16653e.license(1840912380, new C9123e(c10376e, c == true ? 1 : 0, b), c13770e2), AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e2, 510), 0.0f, 0.0f, c13770e2, 196614, 414);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= c13770e3.purchase(interfaceC12123e) ? 4 : 2;
                }
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 19) != 18)) {
                    C13964e billing3 = AbstractC16497e.billing(8);
                    InterfaceC12864e smaato = AbstractC12220e.smaato(C0115e.f1276e, 16, 0.0f, 2);
                    boolean yandex = c13770e3.yandex(c10376e);
                    Object m3681throw = c13770e3.m3681throw();
                    if (yandex || m3681throw == c5170e) {
                        m3681throw = new C0609e(22, c10376e);
                        c13770e3.m3682throws(m3681throw);
                    }
                    AbstractC7023e.ad(smaato, null, interfaceC12123e, billing3, null, null, false, null, (Function1) m3681throw, c13770e3, ((intValue3 << 6) & 896) | 24582, 490);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C13770e c13770e4 = (C13770e) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 17) != 16)) {
                    boolean yandex2 = c13770e4.yandex(c10376e);
                    Object m3681throw2 = c13770e4.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        m3681throw2 = new C11837e(c10376e, b);
                        c13770e4.m3682throws(m3681throw2);
                    }
                    Function0 function0 = (Function0) m3681throw2;
                    if (c10376e.m2800strictfp()) {
                        c13770e4.m3676strictfp(-186461921);
                        c13770e4.Signature(false);
                        billing = C3618e.adcel;
                    } else {
                        c13770e4.m3676strictfp(-186459605);
                        C15492e c15492e = AbstractC11785e.ad;
                        billing = AbstractC6532e.billing(C3618e.vip(0.15f, ((C7019e) c13770e4.adcel(c15492e)).ad.ad), ((C7019e) c13770e4.adcel(c15492e)).ad.subscription);
                        c13770e4.Signature(false);
                    }
                    AbstractC0865e.vip(function0, null, false, null, AbstractC12322e.vip(billing, 0L, 0L, 0L, c13770e4, 0, 14), null, null, AbstractC16653e.license(1351535231, new C13366e(c10376e, c2 == true ? 1 : 0), c13770e4), c13770e4, 100663296, 238);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e5 = (C13770e) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if (c13770e5.m3673protected(1 & intValue5, (intValue5 & 17) != 16)) {
                    boolean yandex3 = c13770e5.yandex(c10376e);
                    Object m3681throw3 = c13770e5.m3681throw();
                    if (yandex3 || m3681throw3 == c5170e) {
                        m3681throw3 = new C11837e(c10376e, i2);
                        c13770e5.m3682throws(m3681throw3);
                    }
                    Function0 function02 = (Function0) m3681throw3;
                    if (c10376e.m2800strictfp()) {
                        c13770e5.m3676strictfp(-2059672982);
                        C15492e c15492e2 = AbstractC11785e.ad;
                        billing2 = AbstractC6532e.billing(C3618e.vip(0.15f, ((C7019e) c13770e5.adcel(c15492e2)).ad.ad), ((C7019e) c13770e5.adcel(c15492e2)).ad.subscription);
                        c13770e5.Signature(false);
                    } else {
                        c13770e5.m3676strictfp(-2059675298);
                        c13770e5.Signature(false);
                        billing2 = C3618e.adcel;
                    }
                    AbstractC0865e.vip(function02, null, false, null, AbstractC12322e.vip(billing2, 0L, 0L, 0L, c13770e5, 0, 14), null, null, AbstractC16653e.license(1215507934, new C13366e(c10376e, b), c13770e5), c13770e5, 100663296, 238);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
