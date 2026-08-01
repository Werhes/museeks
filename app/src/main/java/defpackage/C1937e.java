package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٛٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1937e extends AbstractC3405e implements InterfaceC10218e {
    private static final C1937e DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC5309e PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private C6247e params_;
    private int version_;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖؕۢ, eؓٛٛ] */
    static {
        ?? abstractC3405e = new AbstractC3405e();
        DEFAULT_INSTANCE = abstractC3405e;
        AbstractC3405e.tapsense(C1937e.class, abstractC3405e);
    }

    public static void applovin(C1937e c1937e, C6247e c6247e) {
        c1937e.getClass();
        c1937e.params_ = c6247e;
        c1937e.bitField0_ |= 1;
    }

    public static C1937e crashlytics(AbstractC10498e abstractC10498e, C5712e c5712e) {
        return (C1937e) AbstractC3405e.remoteconfig(DEFAULT_INSTANCE, abstractC10498e, c5712e);
    }

    public static InterfaceC5309e firebase() {
        return DEFAULT_INSTANCE.advert();
    }

    public static C3396e subs() {
        return (C3396e) DEFAULT_INSTANCE.yandex();
    }

    public final C6247e ads() {
        C6247e c6247e = this.params_;
        return c6247e == null ? C6247e.premium() : c6247e;
    }

    public final int premium() {
        return this.version_;
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [eؗۨؓ, java.lang.Object] */
    @Override // defpackage.AbstractC3405e
    public final Object startapp(int i) {
        InterfaceC5309e interfaceC5309e;
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            return (byte) 1;
        }
        if (m2467class == 2) {
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
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
        synchronized (C1937e.class) {
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
