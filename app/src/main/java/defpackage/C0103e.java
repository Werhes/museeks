package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؖۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0103e extends AbstractC3405e implements InterfaceC10218e {
    public static final int CURVE_TYPE_FIELD_NUMBER = 1;
    private static final C0103e DEFAULT_INSTANCE;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 2;
    public static final int HKDF_SALT_FIELD_NUMBER = 11;
    private static volatile InterfaceC5309e PARSER;
    private int curveType_;
    private int hkdfHashType_;
    private AbstractC10498e hkdfSalt_ = AbstractC10498e.f20717e;

    static {
        C0103e c0103e = new C0103e();
        DEFAULT_INSTANCE = c0103e;
        AbstractC3405e.tapsense(C0103e.class, c0103e);
    }

    public static void ads(C0103e c0103e, EnumC10611e enumC10611e) {
        c0103e.getClass();
        c0103e.hkdfHashType_ = enumC10611e.vip();
    }

    public static void applovin(C0103e c0103e, EnumC10386e enumC10386e) {
        c0103e.getClass();
        if (enumC10386e != EnumC10386e.UNRECOGNIZED) {
            c0103e.curveType_ = enumC10386e.f20525e;
        } else {
            enumC10386e.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static C0103e crashlytics() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: interface, reason: not valid java name */
    public static C11205e m254interface() {
        return (C11205e) DEFAULT_INSTANCE.yandex();
    }

    public static void premium(C0103e c0103e, C2096e c2096e) {
        c0103e.getClass();
        c0103e.hkdfSalt_ = c2096e;
    }

    /* renamed from: class, reason: not valid java name */
    public final AbstractC10498e m255class() {
        return this.hkdfSalt_;
    }

    public final EnumC10611e firebase() {
        EnumC10611e ad = EnumC10611e.ad(this.hkdfHashType_);
        return ad == null ? EnumC10611e.UNRECOGNIZED : ad;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"curveType_", "hkdfHashType_", "hkdfSalt_"});
        }
        if (m2467class == 3) {
            return new C0103e();
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
        synchronized (C0103e.class) {
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

    public final EnumC10386e subs() {
        int i = this.curveType_;
        EnumC10386e enumC10386e = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : EnumC10386e.CURVE25519 : EnumC10386e.NIST_P521 : EnumC10386e.NIST_P384 : EnumC10386e.NIST_P256 : EnumC10386e.UNKNOWN_CURVE;
        return enumC10386e == null ? EnumC10386e.UNRECOGNIZED : enumC10386e;
    }
}
