package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؑۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8425e extends AbstractC3405e implements InterfaceC10218e {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final C8425e DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile InterfaceC5309e PARSER;
    private C10021e aesCtrKeyFormat_;
    private int bitField0_;
    private C12706e hmacKeyFormat_;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖؕۢ, eٌؑۖ] */
    static {
        ?? abstractC3405e = new AbstractC3405e();
        DEFAULT_INSTANCE = abstractC3405e;
        AbstractC3405e.tapsense(C8425e.class, abstractC3405e);
    }

    public static void ads(C8425e c8425e, C12706e c12706e) {
        c8425e.getClass();
        c8425e.hmacKeyFormat_ = c12706e;
        c8425e.bitField0_ |= 2;
    }

    public static void applovin(C8425e c8425e, C10021e c10021e) {
        c8425e.getClass();
        c8425e.aesCtrKeyFormat_ = c10021e;
        c8425e.bitField0_ |= 1;
    }

    public static C7053e crashlytics() {
        return (C7053e) DEFAULT_INSTANCE.yandex();
    }

    public static C8425e firebase(AbstractC10498e abstractC10498e, C5712e c5712e) {
        return (C8425e) AbstractC3405e.remoteconfig(DEFAULT_INSTANCE, abstractC10498e, c5712e);
    }

    public final C10021e premium() {
        C10021e c10021e = this.aesCtrKeyFormat_;
        return c10021e == null ? C10021e.premium() : c10021e;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "aesCtrKeyFormat_", "hmacKeyFormat_"});
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
        synchronized (C8425e.class) {
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

    public final C12706e subs() {
        C12706e c12706e = this.hmacKeyFormat_;
        return c12706e == null ? C12706e.premium() : c12706e;
    }
}
