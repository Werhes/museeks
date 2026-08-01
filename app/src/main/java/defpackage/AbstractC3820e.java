package defpackage;

import java.util.Collections;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؑۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3820e {
    public static final C12232e ad;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [eؙّؔ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    static {
        ?? r0 = 0;
        try {
            r0 = (C12232e) C6757e.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (r0 == 0) {
            r0 = new Object();
        }
        ad = r0;
    }

    public static InterfaceC13984e ad(Class cls) {
        C12232e c12232e = ad;
        return c12232e.smaato(c12232e.vip(cls), Collections.EMPTY_LIST, false);
    }

    public static InterfaceC13984e metrica(Class cls, C5538e... c5538eArr) {
        C12232e c12232e = ad;
        return c12232e.smaato(c12232e.vip(cls), AbstractC1660e.m670implements(c5538eArr), false);
    }

    public static InterfaceC13984e vip(Class cls, C5538e c5538e) {
        C12232e c12232e = ad;
        return c12232e.smaato(c12232e.vip(cls), Collections.singletonList(c5538e), false);
    }
}
