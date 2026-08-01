package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۘۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12706e extends AbstractC3405e implements InterfaceC10218e {
    private static final C12706e DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC5309e PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private int keySize_;
    private C14739e params_;
    private int version_;

    /* JADX WARN: Type inference failed for: r0v0, types: [eّۘۡ, eٖؕۢ] */
    static {
        ?? abstractC3405e = new AbstractC3405e();
        DEFAULT_INSTANCE = abstractC3405e;
        AbstractC3405e.tapsense(C12706e.class, abstractC3405e);
    }

    public static void ads(C12706e c12706e, int i) {
        c12706e.keySize_ = i;
    }

    public static void applovin(C12706e c12706e, C14739e c14739e) {
        c12706e.getClass();
        c12706e.params_ = c14739e;
        c12706e.bitField0_ |= 1;
    }

    /* renamed from: class, reason: not valid java name */
    public static C9333e m3379class() {
        return (C9333e) DEFAULT_INSTANCE.yandex();
    }

    /* renamed from: interface, reason: not valid java name */
    public static C12706e m3380interface(AbstractC10498e abstractC10498e, C5712e c5712e) {
        return (C12706e) AbstractC3405e.remoteconfig(DEFAULT_INSTANCE, abstractC10498e, c5712e);
    }

    public static C12706e premium() {
        return DEFAULT_INSTANCE;
    }

    public final C14739e crashlytics() {
        C14739e c14739e = this.params_;
        return c14739e == null ? C14739e.premium() : c14739e;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"bitField0_", "params_", "keySize_", "version_"});
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
        synchronized (C12706e.class) {
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

    public final int subs() {
        return this.keySize_;
    }
}
