package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3251e extends AbstractC3405e implements InterfaceC10218e {
    private static final C3251e DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC5309e PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private C5928e params_;
    private AbstractC10498e publicKey_ = AbstractC10498e.f20717e;
    private int version_;

    static {
        C3251e c3251e = new C3251e();
        DEFAULT_INSTANCE = c3251e;
        AbstractC3405e.tapsense(C3251e.class, c3251e);
    }

    public static void ads(C3251e c3251e, C5928e c5928e) {
        c3251e.getClass();
        c3251e.params_ = c5928e;
        c3251e.bitField0_ |= 1;
    }

    public static void applovin(C3251e c3251e) {
        c3251e.version_ = 0;
    }

    /* renamed from: goto, reason: not valid java name */
    public static C3251e m1328goto(AbstractC10498e abstractC10498e, C5712e c5712e) {
        return (C3251e) AbstractC3405e.remoteconfig(DEFAULT_INSTANCE, abstractC10498e, c5712e);
    }

    /* renamed from: interface, reason: not valid java name */
    public static C0465e m1329interface() {
        return (C0465e) DEFAULT_INSTANCE.yandex();
    }

    public static void premium(C3251e c3251e, C2096e c2096e) {
        c3251e.getClass();
        c3251e.publicKey_ = c2096e;
    }

    public static C3251e subs() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: this, reason: not valid java name */
    public static InterfaceC5309e m1330this() {
        return DEFAULT_INSTANCE.advert();
    }

    /* renamed from: class, reason: not valid java name */
    public final int m1331class() {
        return this.version_;
    }

    public final C5928e crashlytics() {
        C5928e c5928e = this.params_;
        return c5928e == null ? C5928e.crashlytics() : c5928e;
    }

    public final AbstractC10498e firebase() {
        return this.publicKey_;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "publicKey_"});
        }
        if (m2467class == 3) {
            return new C3251e();
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
        synchronized (C3251e.class) {
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
