package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12248e extends AbstractC3405e implements InterfaceC10218e {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C12248e DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile InterfaceC5309e PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C11331e aesCtrKey_;
    private int bitField0_;
    private C18396e hmacKey_;
    private int version_;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖؕۢ, eّْؕ] */
    static {
        ?? abstractC3405e = new AbstractC3405e();
        DEFAULT_INSTANCE = abstractC3405e;
        AbstractC3405e.tapsense(C12248e.class, abstractC3405e);
    }

    public static void ads(C12248e c12248e, C18396e c18396e) {
        c12248e.getClass();
        c12248e.hmacKey_ = c18396e;
        c12248e.bitField0_ |= 2;
    }

    public static void applovin(C12248e c12248e, C11331e c11331e) {
        c12248e.getClass();
        c12248e.aesCtrKey_ = c11331e;
        c12248e.bitField0_ |= 1;
    }

    /* renamed from: class, reason: not valid java name */
    public static C12248e m3329class(AbstractC10498e abstractC10498e, C5712e c5712e) {
        return (C12248e) AbstractC3405e.remoteconfig(DEFAULT_INSTANCE, abstractC10498e, c5712e);
    }

    public static C3791e firebase() {
        return (C3791e) DEFAULT_INSTANCE.yandex();
    }

    /* renamed from: interface, reason: not valid java name */
    public static InterfaceC5309e m3330interface() {
        return DEFAULT_INSTANCE.advert();
    }

    public final int crashlytics() {
        return this.version_;
    }

    public final C11331e premium() {
        C11331e c11331e = this.aesCtrKey_;
        return c11331e == null ? C11331e.premium() : c11331e;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "version_", "aesCtrKey_", "hmacKey_"});
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
        synchronized (C12248e.class) {
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

    public final C18396e subs() {
        C18396e c18396e = this.hmacKey_;
        return c18396e == null ? C18396e.premium() : c18396e;
    }
}
