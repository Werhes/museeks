package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4057e implements Function4 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16400e f9010e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9011e;

    public /* synthetic */ C4057e(InterfaceC16400e interfaceC16400e, int i) {
        this.f9011e = i;
        this.f9010e = interfaceC16400e;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.f9011e;
        C5170e c5170e = C2987e.ad;
        C0115e c0115e = C0115e.f1276e;
        InterfaceC16400e interfaceC16400e = this.f9010e;
        int i4 = 1;
        int i5 = 0;
        switch (i3) {
            case 0:
                C18055e c18055e = (C18055e) obj;
                int intValue = ((Number) obj2).intValue();
                C13770e c13770e = (C13770e) obj3;
                int intValue2 = ((Number) obj4).intValue();
                C17046e c17046e = (C17046e) interfaceC16400e;
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (c13770e.purchase(c18055e) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= c13770e.license(intValue) ? 32 : 16;
                }
                if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
                    C15937e c15937e = EnumC15845e.f31267e;
                    EnumC15845e enumC15845e = (EnumC15845e) c15937e.get(intValue);
                    c13770e.m3676strictfp(-577923842);
                    C2892e license = AbstractC16653e.license(-1814216078, new C15221e(i5, enumC15845e), c13770e);
                    InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex = c13770e.yandex(c17046e) | c13770e.license(enumC15845e.ordinal());
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == c5170e) {
                        m3681throw = new C12056e(c17046e, enumC15845e, 3);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC16429e.ad(license, AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), null, null, null, null, null, 0.0f, 0.0f, c13770e, 6, 508);
                    if (enumC15845e.ordinal() != AbstractC6874e.billing(c15937e)) {
                        c13770e.m3676strictfp(-576934013);
                        AbstractC8141e.vip(null, 0.0f, 0L, c13770e, 0, 7);
                    } else {
                        c13770e.m3676strictfp(-581120594);
                    }
                    c13770e.Signature(false);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C18055e c18055e2 = (C18055e) obj;
                int intValue3 = ((Number) obj2).intValue();
                C13770e c13770e2 = (C13770e) obj3;
                int intValue4 = ((Number) obj4).intValue();
                C4031e c4031e = (C4031e) interfaceC16400e;
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (c13770e2.purchase(c18055e2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= c13770e2.license(intValue3) ? 32 : 16;
                }
                if (c13770e2.m3673protected(i2 & 1, (i2 & 147) != 146)) {
                    EnumC7808e enumC7808e = (EnumC7808e) EnumC7808e.f15819e.get(intValue3);
                    c13770e2.m3676strictfp(260766200);
                    InterfaceC12864e metrica2 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex2 = c13770e2.yandex(c4031e) | c13770e2.license(enumC7808e.ordinal());
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        m3681throw2 = new C1021e(c4031e, enumC7808e, 26);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    InterfaceC12864e license2 = AbstractC9546e.license(metrica2, false, null, (Function0) m3681throw2, 15);
                    float f = AbstractC11992e.ad;
                    AbstractC16429e.ad(AbstractC16653e.license(783699200, new C4179e(enumC7808e, i5), c13770e2), license2, null, AbstractC16653e.license(-1478373667, new C4179e(enumC7808e, i4), c13770e2), null, AbstractC16653e.license(1308545051, new C2077e(c4031e, enumC7808e, 18), c13770e2), AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e2, 510), 0.0f, 0.0f, c13770e2, 199686, 404);
                    c13770e2.Signature(false);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
