package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؚۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12044e {
    public static final C8208e ad;
    public static final C8208e metrica;
    public static final InterfaceC4911e vip;

    static {
        InterfaceC13984e interfaceC13984e;
        InterfaceC7227e vip2 = AbstractC3820e.ad.vip(C2394e.class);
        InterfaceC13984e interfaceC13984e2 = null;
        try {
            interfaceC13984e = AbstractC3820e.ad(C2394e.class);
        } catch (Throwable unused) {
            interfaceC13984e = null;
        }
        ad = new C8208e("RoutingFailureStatusCode", new C12025e(vip2, interfaceC13984e));
        vip = AbstractC1213e.vip("io.ktor.server.routing.Routing");
        InterfaceC7227e vip3 = AbstractC3820e.ad.vip(C0318e.class);
        try {
            interfaceC13984e2 = AbstractC3820e.ad(C0318e.class);
        } catch (Throwable unused2) {
        }
        metrica = new C8208e("RoutingHandler", new C12025e(vip3, interfaceC13984e2));
    }

    public static final C5033e ad(InterfaceC9215e interfaceC9215e) {
        C5033e ad2;
        if (interfaceC9215e instanceof C7000e) {
            return ((C7000e) interfaceC9215e).f14338e;
        }
        C11997e c11997e = ((C11997e) interfaceC9215e).f23979e;
        if (c11997e == null || (ad2 = ad(c11997e)) == null) {
            throw new UnsupportedOperationException("Cannot retrieve application from unattached routing entry");
        }
        return ad2;
    }
}
