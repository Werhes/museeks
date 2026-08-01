package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؔۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2853e extends AbstractC3405e implements InterfaceC10218e {
    public static final int AEAD_DEM_FIELD_NUMBER = 2;
    private static final C2853e DEFAULT_INSTANCE;
    private static volatile InterfaceC5309e PARSER;
    private C7818e aeadDem_;
    private int bitField0_;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙؔۛ, eٖؕۢ] */
    static {
        ?? abstractC3405e = new AbstractC3405e();
        DEFAULT_INSTANCE = abstractC3405e;
        AbstractC3405e.tapsense(C2853e.class, abstractC3405e);
    }

    public static void applovin(C2853e c2853e, C7818e c7818e) {
        c2853e.getClass();
        c2853e.aeadDem_ = c7818e;
        c2853e.bitField0_ |= 1;
    }

    public static C2853e premium() {
        return DEFAULT_INSTANCE;
    }

    public static C9568e subs() {
        return (C9568e) DEFAULT_INSTANCE.yandex();
    }

    public final C7818e ads() {
        C7818e c7818e = this.aeadDem_;
        return c7818e == null ? C7818e.subs() : c7818e;
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [eؗۨؓ, java.lang.Object] */
    @Override // defpackage.AbstractC3405e
    public final Object startapp(int i) {
        InterfaceC5309e interfaceC5309e;
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            return (byte) 1;
        }
        if (m2467class == 2) {
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"bitField0_", "aeadDem_"});
        }
        if (m2467class == 3) {
            return new AbstractC3405e();
        }
        if (m2467class == 4) {
            return new AbstractC4490e(DEFAULT_INSTANCE);
        }
        if (m2467class == 5) {
            return DEFAULT_INSTANCE;
        }
        if (m2467class != 6) {
            throw null;
        }
        InterfaceC5309e interfaceC5309e2 = PARSER;
        if (interfaceC5309e2 != null) {
            return interfaceC5309e2;
        }
        synchronized (C2853e.class) {
            try {
                InterfaceC5309e interfaceC5309e3 = PARSER;
                interfaceC5309e = interfaceC5309e3;
                if (interfaceC5309e3 == null) {
                    ?? obj = new Object();
                    PARSER = obj;
                    interfaceC5309e = obj;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC5309e;
    }
}
