package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؖٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3145e {
    public static final C13540e ad = AbstractC12696e.purchase(0.0f, 0.0f, null, 7);

    public static final InterfaceC16132e ad(long j, InterfaceC6512e interfaceC6512e, String str, Function1 function1, C13770e c13770e, int i, int i2) {
        if ((i2 & 2) != 0) {
            interfaceC6512e = ad;
        }
        InterfaceC6512e interfaceC6512e2 = interfaceC6512e;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        boolean purchase = c13770e.purchase(C3618e.purchase(j));
        Object m3681throw = c13770e.m3681throw();
        if (purchase || m3681throw == C2987e.ad) {
            C11139e c11139e = new C11139e(C5430e.f11635e, new C17097e(10, C3618e.purchase(j)));
            c13770e.m3682throws(c11139e);
            m3681throw = c11139e;
        }
        int i3 = i << 6;
        return AbstractC16102e.metrica(new C3618e(j), (C11139e) m3681throw, interfaceC6512e2, null, str2, function12, c13770e, ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
    }
}
