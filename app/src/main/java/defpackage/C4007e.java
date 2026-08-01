package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4007e extends AbstractC3405e implements InterfaceC10218e {
    private static final C4007e DEFAULT_INSTANCE;
    private static volatile InterfaceC5309e PARSER = null;
    public static final int PRIVATE_KEY_FIELD_NUMBER = 3;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC10498e privateKey_ = AbstractC10498e.f20717e;
    private C3251e publicKey_;
    private int version_;

    static {
        C4007e c4007e = new C4007e();
        DEFAULT_INSTANCE = c4007e;
        AbstractC3405e.tapsense(C4007e.class, c4007e);
    }

    public static void ads(C4007e c4007e, C3251e c3251e) {
        c4007e.getClass();
        c4007e.publicKey_ = c3251e;
        c4007e.bitField0_ |= 1;
    }

    public static void applovin(C4007e c4007e) {
        c4007e.version_ = 0;
    }

    /* renamed from: class, reason: not valid java name */
    public static C12081e m1413class() {
        return (C12081e) DEFAULT_INSTANCE.yandex();
    }

    /* renamed from: goto, reason: not valid java name */
    public static InterfaceC5309e m1414goto() {
        return DEFAULT_INSTANCE.advert();
    }

    /* renamed from: interface, reason: not valid java name */
    public static C4007e m1415interface(AbstractC10498e abstractC10498e, C5712e c5712e) {
        return (C4007e) AbstractC3405e.remoteconfig(DEFAULT_INSTANCE, abstractC10498e, c5712e);
    }

    public static void premium(C4007e c4007e, C2096e c2096e) {
        c4007e.getClass();
        c4007e.privateKey_ = c2096e;
    }

    public final C3251e crashlytics() {
        C3251e c3251e = this.publicKey_;
        return c3251e == null ? C3251e.subs() : c3251e;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "publicKey_", "privateKey_"});
        }
        if (m2467class == 3) {
            return new C4007e();
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
        synchronized (C4007e.class) {
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
        return this.privateKey_;
    }
}
