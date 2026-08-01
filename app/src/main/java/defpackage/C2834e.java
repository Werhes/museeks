package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؔۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2834e extends AbstractC3405e implements InterfaceC10218e {
    private static final C2834e DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile InterfaceC5309e PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC10498e keyValue_ = AbstractC10498e.f20717e;
    private C16865e publicKey_;
    private int version_;

    static {
        C2834e c2834e = new C2834e();
        DEFAULT_INSTANCE = c2834e;
        AbstractC3405e.tapsense(C2834e.class, c2834e);
    }

    public static void ads(C2834e c2834e, C16865e c16865e) {
        c2834e.getClass();
        c2834e.publicKey_ = c16865e;
        c2834e.bitField0_ |= 1;
    }

    public static void applovin(C2834e c2834e) {
        c2834e.version_ = 0;
    }

    /* renamed from: class, reason: not valid java name */
    public static C14525e m1212class() {
        return (C14525e) DEFAULT_INSTANCE.yandex();
    }

    /* renamed from: goto, reason: not valid java name */
    public static InterfaceC5309e m1213goto() {
        return DEFAULT_INSTANCE.advert();
    }

    /* renamed from: interface, reason: not valid java name */
    public static C2834e m1214interface(AbstractC10498e abstractC10498e, C5712e c5712e) {
        return (C2834e) AbstractC3405e.remoteconfig(DEFAULT_INSTANCE, abstractC10498e, c5712e);
    }

    public static void premium(C2834e c2834e, C2096e c2096e) {
        c2834e.getClass();
        c2834e.keyValue_ = c2096e;
    }

    public final C16865e crashlytics() {
        C16865e c16865e = this.publicKey_;
        return c16865e == null ? C16865e.crashlytics() : c16865e;
    }

    public final int firebase() {
        return this.version_;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "publicKey_", "keyValue_"});
        }
        if (m2467class == 3) {
            return new C2834e();
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
        synchronized (C2834e.class) {
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

    public final AbstractC10498e subs() {
        return this.keyValue_;
    }
}
