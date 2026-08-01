package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۚؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15699e extends AbstractC3405e implements InterfaceC10218e {
    private static final C15699e DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile InterfaceC5309e PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private C9530e params_;
    private int version_;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٕۚؑ, eٖؕۢ] */
    static {
        ?? abstractC3405e = new AbstractC3405e();
        DEFAULT_INSTANCE = abstractC3405e;
        AbstractC3405e.tapsense(C15699e.class, abstractC3405e);
    }

    public static void applovin(C15699e c15699e, C9530e c9530e) {
        c15699e.getClass();
        c15699e.params_ = c9530e;
        c15699e.bitField0_ |= 1;
    }

    public static C15699e crashlytics(AbstractC10498e abstractC10498e, C5712e c5712e) {
        return (C15699e) AbstractC3405e.remoteconfig(DEFAULT_INSTANCE, abstractC10498e, c5712e);
    }

    public static C6991e subs() {
        return (C6991e) DEFAULT_INSTANCE.yandex();
    }

    public final C9530e ads() {
        C9530e c9530e = this.params_;
        return c9530e == null ? C9530e.ads() : c9530e;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
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
        synchronized (C15699e.class) {
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
