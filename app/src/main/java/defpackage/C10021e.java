package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10021e extends AbstractC3405e implements InterfaceC10218e {
    private static final C10021e DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC5309e PARSER;
    private int bitField0_;
    private int keySize_;
    private C18340e params_;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖؕۢ, eَٕؔ] */
    static {
        ?? abstractC3405e = new AbstractC3405e();
        DEFAULT_INSTANCE = abstractC3405e;
        AbstractC3405e.tapsense(C10021e.class, abstractC3405e);
    }

    public static void ads(C10021e c10021e, int i) {
        c10021e.keySize_ = i;
    }

    public static void applovin(C10021e c10021e, C18340e c18340e) {
        c10021e.getClass();
        c10021e.params_ = c18340e;
        c10021e.bitField0_ |= 1;
    }

    public static C17506e firebase() {
        return (C17506e) DEFAULT_INSTANCE.yandex();
    }

    public static C10021e premium() {
        return DEFAULT_INSTANCE;
    }

    public final C18340e crashlytics() {
        C18340e c18340e = this.params_;
        return c18340e == null ? C18340e.ads() : c18340e;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"bitField0_", "params_", "keySize_"});
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
        synchronized (C10021e.class) {
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
