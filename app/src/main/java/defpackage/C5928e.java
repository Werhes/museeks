package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۣۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5928e extends AbstractC3405e implements InterfaceC10218e {
    public static final int AEAD_FIELD_NUMBER = 3;
    private static final C5928e DEFAULT_INSTANCE;
    public static final int KDF_FIELD_NUMBER = 2;
    public static final int KEM_FIELD_NUMBER = 1;
    private static volatile InterfaceC5309e PARSER;
    private int aead_;
    private int kdf_;
    private int kem_;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖؕۢ, eؘۣۜ] */
    static {
        ?? abstractC3405e = new AbstractC3405e();
        DEFAULT_INSTANCE = abstractC3405e;
        AbstractC3405e.tapsense(C5928e.class, abstractC3405e);
    }

    public static void ads(C5928e c5928e, EnumC5703e enumC5703e) {
        c5928e.getClass();
        if (enumC5703e != EnumC5703e.UNRECOGNIZED) {
            c5928e.kdf_ = enumC5703e.f12115e;
        } else {
            enumC5703e.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static void applovin(C5928e c5928e, EnumC10749e enumC10749e) {
        c5928e.getClass();
        if (enumC10749e != EnumC10749e.UNRECOGNIZED) {
            c5928e.kem_ = enumC10749e.f21171e;
        } else {
            enumC10749e.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static C5928e crashlytics() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: interface, reason: not valid java name */
    public static C16766e m2005interface() {
        return (C16766e) DEFAULT_INSTANCE.yandex();
    }

    public static void premium(C5928e c5928e, EnumC6108e enumC6108e) {
        c5928e.getClass();
        if (enumC6108e != EnumC6108e.UNRECOGNIZED) {
            c5928e.aead_ = enumC6108e.f12830e;
        } else {
            enumC6108e.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: class, reason: not valid java name */
    public final EnumC10749e m2006class() {
        EnumC10749e enumC10749e;
        switch (this.kem_) {
            case 0:
                enumC10749e = EnumC10749e.KEM_UNKNOWN;
                break;
            case 1:
                enumC10749e = EnumC10749e.DHKEM_X25519_HKDF_SHA256;
                break;
            case 2:
                enumC10749e = EnumC10749e.DHKEM_P256_HKDF_SHA256;
                break;
            case 3:
                enumC10749e = EnumC10749e.DHKEM_P384_HKDF_SHA384;
                break;
            case 4:
                enumC10749e = EnumC10749e.DHKEM_P521_HKDF_SHA512;
                break;
            case 5:
                enumC10749e = EnumC10749e.X_WING;
                break;
            case 6:
                enumC10749e = EnumC10749e.ML_KEM768;
                break;
            case 7:
                enumC10749e = EnumC10749e.ML_KEM1024;
                break;
            default:
                enumC10749e = null;
                break;
        }
        return enumC10749e == null ? EnumC10749e.UNRECOGNIZED : enumC10749e;
    }

    public final EnumC5703e firebase() {
        int i = this.kdf_;
        EnumC5703e enumC5703e = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : EnumC5703e.HKDF_SHA512 : EnumC5703e.HKDF_SHA384 : EnumC5703e.HKDF_SHA256 : EnumC5703e.KDF_UNKNOWN;
        return enumC5703e == null ? EnumC5703e.UNRECOGNIZED : enumC5703e;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"kem_", "kdf_", "aead_"});
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
        synchronized (C5928e.class) {
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

    public final EnumC6108e subs() {
        int i = this.aead_;
        EnumC6108e enumC6108e = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : EnumC6108e.CHACHA20_POLY1305 : EnumC6108e.AES_256_GCM : EnumC6108e.AES_128_GCM : EnumC6108e.AEAD_UNKNOWN;
        return enumC6108e == null ? EnumC6108e.UNRECOGNIZED : enumC6108e;
    }
}
