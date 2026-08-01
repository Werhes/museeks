package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٛٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8047e extends AbstractC3405e implements InterfaceC10218e {
    private static final C8047e DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC5309e PARSER;
    private int bitField0_;
    private C5928e params_;

    /* JADX WARN: Type inference failed for: r0v0, types: [eًٛٓ, eٖؕۢ] */
    static {
        ?? abstractC3405e = new AbstractC3405e();
        DEFAULT_INSTANCE = abstractC3405e;
        AbstractC3405e.tapsense(C8047e.class, abstractC3405e);
    }

    public static void applovin(C8047e c8047e, C5928e c5928e) {
        c8047e.getClass();
        c8047e.params_ = c5928e;
        c8047e.bitField0_ |= 1;
    }

    public static C15922e premium() {
        return (C15922e) DEFAULT_INSTANCE.yandex();
    }

    public static C8047e subs(AbstractC10498e abstractC10498e, C5712e c5712e) {
        return (C8047e) AbstractC3405e.remoteconfig(DEFAULT_INSTANCE, abstractC10498e, c5712e);
    }

    public final C5928e ads() {
        C5928e c5928e = this.params_;
        return c5928e == null ? C5928e.crashlytics() : c5928e;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "params_"});
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
        synchronized (C8047e.class) {
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
