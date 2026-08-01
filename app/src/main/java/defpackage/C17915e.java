package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٟ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17915e extends AbstractC3405e implements InterfaceC10218e {
    private static final C17915e DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile InterfaceC5309e PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private C9076e keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖؕۢ, eًٟ٘] */
    static {
        ?? abstractC3405e = new AbstractC3405e();
        DEFAULT_INSTANCE = abstractC3405e;
        AbstractC3405e.tapsense(C17915e.class, abstractC3405e);
    }

    public static void ads(C17915e c17915e, EnumC3021e enumC3021e) {
        c17915e.getClass();
        c17915e.outputPrefixType_ = enumC3021e.vip();
    }

    public static void applovin(C17915e c17915e, C9076e c9076e) {
        c17915e.getClass();
        c17915e.keyData_ = c9076e;
        c17915e.bitField0_ |= 1;
    }

    public static void premium(C17915e c17915e, EnumC4513e enumC4513e) {
        c17915e.getClass();
        c17915e.status_ = enumC4513e.ad();
    }

    public static void subs(C17915e c17915e, int i) {
        c17915e.keyId_ = i;
    }

    /* renamed from: this, reason: not valid java name */
    public static C16111e m4467this() {
        return (C16111e) DEFAULT_INSTANCE.yandex();
    }

    /* renamed from: class, reason: not valid java name */
    public final EnumC3021e m4468class() {
        EnumC3021e ad = EnumC3021e.ad(this.outputPrefixType_);
        return ad == null ? EnumC3021e.UNRECOGNIZED : ad;
    }

    public final C9076e crashlytics() {
        C9076e c9076e = this.keyData_;
        return c9076e == null ? C9076e.subs() : c9076e;
    }

    public final int firebase() {
        return this.keyId_;
    }

    /* renamed from: goto, reason: not valid java name */
    public final boolean m4469goto() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: interface, reason: not valid java name */
    public final EnumC4513e m4470interface() {
        int i = this.status_;
        EnumC4513e enumC4513e = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : EnumC4513e.DESTROYED : EnumC4513e.DISABLED : EnumC4513e.ENABLED : EnumC4513e.UNKNOWN_STATUS;
        return enumC4513e == null ? EnumC4513e.UNRECOGNIZED : enumC4513e;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"bitField0_", "keyData_", "status_", "keyId_", "outputPrefixType_"});
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
        synchronized (C17915e.class) {
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
