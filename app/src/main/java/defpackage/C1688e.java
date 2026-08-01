package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؓۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1688e implements Function4 {
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
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
            EnumC7437e enumC7437e = (EnumC7437e) EnumC7437e.f15210e.get(intValue);
            c13770e.m3676strictfp(1176299170);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = AbstractC14533e.startapp(Boolean.valueOf(AbstractC6181e.ad(enumC7437e)));
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean license = c13770e.license(enumC7437e.ordinal());
            Object m3681throw2 = c13770e.m3681throw();
            if (license || m3681throw2 == c5170e) {
                m3681throw2 = new C11804e(enumC7437e, interfaceC3314e);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC16429e.ad(AbstractC16653e.license(-1575039790, new C12151e(enumC7437e, 0), c13770e), AbstractC9546e.license(metrica, false, null, (Function0) m3681throw2, 15), null, AbstractC16653e.license(-1607636177, new C12151e(enumC7437e, 1), c13770e), null, AbstractC16653e.license(1233944429, new C2077e(enumC7437e, interfaceC3314e, 17), c13770e), null, 0.0f, 0.0f, c13770e, 199686, 468);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }
}
