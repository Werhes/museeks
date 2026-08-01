package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘْٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13091e {
    public static final C6054e ad;

    static {
        float f = 40;
        float f2 = 10;
        ad = new C6054e(f2, f, f2, f);
    }

    public static final InterfaceC12864e ad(InterfaceC12864e interfaceC12864e, boolean z, boolean z2, Function0 function0) {
        if (!z || !AbstractC1494e.ad) {
            return interfaceC12864e;
        }
        if (z2) {
            interfaceC12864e = interfaceC12864e.premium(new C10969e(ad));
        }
        return interfaceC12864e.premium(new C9423e(function0));
    }
}
