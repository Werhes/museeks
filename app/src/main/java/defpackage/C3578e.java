package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؕۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3578e extends AbstractC3405e implements InterfaceC10218e {
    private static final C3578e DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC5309e PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC10498e keyValue_ = AbstractC10498e.f20717e;
    private C8224e params_;
    private int version_;

    static {
        C3578e c3578e = new C3578e();
        DEFAULT_INSTANCE = c3578e;
        AbstractC3405e.tapsense(C3578e.class, c3578e);
    }

    public static void ads(C3578e c3578e, C2096e c2096e) {
        c3578e.getClass();
        c3578e.keyValue_ = c2096e;
    }

    public static void applovin(C3578e c3578e, C8224e c8224e) {
        c3578e.getClass();
        c3578e.params_ = c8224e;
        c3578e.bitField0_ |= 1;
    }

    /* renamed from: class, reason: not valid java name */
    public static C3578e m1378class(AbstractC10498e abstractC10498e, C5712e c5712e) {
        return (C3578e) AbstractC3405e.remoteconfig(DEFAULT_INSTANCE, abstractC10498e, c5712e);
    }

    public static C9124e firebase() {
        return (C9124e) DEFAULT_INSTANCE.yandex();
    }

    /* renamed from: interface, reason: not valid java name */
    public static InterfaceC5309e m1379interface() {
        return DEFAULT_INSTANCE.advert();
    }

    public final int crashlytics() {
        return this.version_;
    }

    public final AbstractC10498e premium() {
        return this.keyValue_;
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [eؗۨؓ, java.lang.Object] */
    @Override // defpackage.AbstractC3405e
    public final Object startapp(int i) {
        InterfaceC5309e interfaceC5309e;
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            return (byte) 1;
        }
        if (m2467class == 2) {
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
        }
        if (m2467class == 3) {
            return new C3578e();
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
        synchronized (C3578e.class) {
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

    public final C8224e subs() {
        C8224e c8224e = this.params_;
        return c8224e == null ? C8224e.ads() : c8224e;
    }
}
