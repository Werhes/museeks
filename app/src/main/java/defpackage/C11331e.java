package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۡٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11331e extends AbstractC3405e implements InterfaceC10218e {
    private static final C11331e DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC5309e PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC10498e keyValue_ = AbstractC10498e.f20717e;
    private C18340e params_;
    private int version_;

    static {
        C11331e c11331e = new C11331e();
        DEFAULT_INSTANCE = c11331e;
        AbstractC3405e.tapsense(C11331e.class, c11331e);
    }

    public static void ads(C11331e c11331e, C2096e c2096e) {
        c11331e.getClass();
        c11331e.keyValue_ = c2096e;
    }

    public static void applovin(C11331e c11331e, C18340e c18340e) {
        c11331e.getClass();
        c11331e.params_ = c18340e;
        c11331e.bitField0_ |= 1;
    }

    /* renamed from: class, reason: not valid java name */
    public static C10795e m3200class() {
        return (C10795e) DEFAULT_INSTANCE.yandex();
    }

    public static C11331e premium() {
        return DEFAULT_INSTANCE;
    }

    public final C18340e crashlytics() {
        C18340e c18340e = this.params_;
        return c18340e == null ? C18340e.ads() : c18340e;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
        }
        if (m2467class == 3) {
            return new C11331e();
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
        synchronized (C11331e.class) {
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
