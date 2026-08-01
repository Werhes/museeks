package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؔ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15210e {
    public static final C8208e metrica;
    public static final C4590e vip = new C4590e(27);
    public final Function1 ad;

    static {
        InterfaceC13984e interfaceC13984e;
        InterfaceC7227e vip2 = AbstractC3820e.ad.vip(C15210e.class);
        try {
            interfaceC13984e = AbstractC3820e.ad(C15210e.class);
        } catch (Throwable unused) {
            interfaceC13984e = null;
        }
        metrica = new C8208e("DefaultRequest", new C12025e(vip2, interfaceC13984e));
    }

    public C15210e(Function1 function1) {
        this.ad = function1;
    }
}
