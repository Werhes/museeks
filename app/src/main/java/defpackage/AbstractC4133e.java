package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؖؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4133e {
    public static final C8208e ad;
    public static final C8208e vip;

    static {
        InterfaceC13984e interfaceC13984e;
        InterfaceC7227e vip2 = AbstractC3820e.ad.vip(Long.class);
        InterfaceC13984e interfaceC13984e2 = null;
        try {
            interfaceC13984e = AbstractC3820e.ad(Long.TYPE);
        } catch (Throwable unused) {
            interfaceC13984e = null;
        }
        ad = new C8208e("FormFieldLimit", new C12025e(vip2, interfaceC13984e));
        InterfaceC7227e vip3 = AbstractC3820e.ad.vip(C6638e.class);
        try {
            interfaceC13984e2 = AbstractC3820e.ad(C6638e.class);
        } catch (Throwable unused2) {
        }
        vip = new C8208e("DoubleReceivePreventionToken", new C12025e(vip3, interfaceC13984e2));
    }
}
