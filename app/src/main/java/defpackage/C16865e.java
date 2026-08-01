package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٗۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16865e extends AbstractC3405e implements InterfaceC10218e {
    private static final C16865e DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC5309e PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;
    private int bitField0_;
    private C13327e params_;
    private int version_;
    private AbstractC10498e x_;
    private AbstractC10498e y_;

    static {
        C16865e c16865e = new C16865e();
        DEFAULT_INSTANCE = c16865e;
        AbstractC3405e.tapsense(C16865e.class, c16865e);
    }

    public C16865e() {
        C2096e c2096e = AbstractC10498e.f20717e;
        this.x_ = c2096e;
        this.y_ = c2096e;
    }

    public static void ads(C16865e c16865e, C13327e c13327e) {
        c16865e.getClass();
        c16865e.params_ = c13327e;
        c16865e.bitField0_ |= 1;
    }

    public static void applovin(C16865e c16865e) {
        c16865e.version_ = 0;
    }

    public static C16865e crashlytics() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: extends, reason: not valid java name */
    public static InterfaceC5309e m4196extends() {
        return DEFAULT_INSTANCE.advert();
    }

    /* renamed from: native, reason: not valid java name */
    public static C16865e m4197native(AbstractC10498e abstractC10498e, C5712e c5712e) {
        return (C16865e) AbstractC3405e.remoteconfig(DEFAULT_INSTANCE, abstractC10498e, c5712e);
    }

    public static void premium(C16865e c16865e, C2096e c2096e) {
        c16865e.getClass();
        c16865e.x_ = c2096e;
    }

    public static void subs(C16865e c16865e, AbstractC10498e abstractC10498e) {
        c16865e.getClass();
        abstractC10498e.getClass();
        c16865e.y_ = abstractC10498e;
    }

    /* renamed from: this, reason: not valid java name */
    public static C10419e m4198this() {
        return (C10419e) DEFAULT_INSTANCE.yandex();
    }

    /* renamed from: class, reason: not valid java name */
    public final int m4199class() {
        return this.version_;
    }

    public final C13327e firebase() {
        C13327e c13327e = this.params_;
        return c13327e == null ? C13327e.subs() : c13327e;
    }

    /* renamed from: goto, reason: not valid java name */
    public final AbstractC10498e m4200goto() {
        return this.y_;
    }

    /* renamed from: interface, reason: not valid java name */
    public final AbstractC10498e m4201interface() {
        return this.x_;
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [eؗۨؓ, java.lang.Object] */
    @Override // defpackage.AbstractC3405e
    public final Object startapp(int i) {
        InterfaceC5309e interfaceC5309e;
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            return (byte) 1;
        }
        if (m2467class == 2) {
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"bitField0_", "version_", "params_", "x_", "y_"});
        }
        if (m2467class == 3) {
            return new C16865e();
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
        synchronized (C16865e.class) {
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
