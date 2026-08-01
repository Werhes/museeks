package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16095e {
    public static final C8208e ad;
    public static final InterfaceC4911e vip;

    static {
        InterfaceC13984e interfaceC13984e;
        InterfaceC7227e vip2 = AbstractC3820e.ad.vip(Unit.class);
        try {
            interfaceC13984e = AbstractC3820e.ad(Unit.class);
        } catch (Throwable unused) {
            interfaceC13984e = null;
        }
        ad = new C8208e("ValidateMark", new C12025e(vip2, interfaceC13984e));
        vip = AbstractC1213e.vip("io.ktor.client.plugins.DefaultResponseValidation");
    }
}
