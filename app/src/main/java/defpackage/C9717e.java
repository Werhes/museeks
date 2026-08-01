package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۙ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9717e extends AbstractC3405e implements InterfaceC10218e {
    private static final C9717e DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile InterfaceC5309e PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int keySize_;
    private int version_;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍۙ٘, eٖؕۢ] */
    static {
        ?? abstractC3405e = new AbstractC3405e();
        DEFAULT_INSTANCE = abstractC3405e;
        AbstractC3405e.tapsense(C9717e.class, abstractC3405e);
    }

    public static void applovin(C9717e c9717e, int i) {
        c9717e.keySize_ = i;
    }

    public static C9717e crashlytics(AbstractC10498e abstractC10498e, C5712e c5712e) {
        return (C9717e) AbstractC3405e.remoteconfig(DEFAULT_INSTANCE, abstractC10498e, c5712e);
    }

    public static C14084e subs() {
        return (C14084e) DEFAULT_INSTANCE.yandex();
    }

    public final int ads() {
        return this.keySize_;
    }

    public final int premium() {
        return this.version_;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"version_", "keySize_"});
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
        synchronized (C9717e.class) {
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
