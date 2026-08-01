package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؑٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13697e extends AbstractC3405e implements InterfaceC10218e {
    private static final C13697e DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC5309e PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC10498e keyValue_ = AbstractC10498e.f20717e;
    private C9530e params_;
    private int version_;

    static {
        C13697e c13697e = new C13697e();
        DEFAULT_INSTANCE = c13697e;
        AbstractC3405e.tapsense(C13697e.class, c13697e);
    }

    public static void ads(C13697e c13697e, C2096e c2096e) {
        c13697e.getClass();
        c13697e.keyValue_ = c2096e;
    }

    public static void applovin(C13697e c13697e, C9530e c9530e) {
        c13697e.getClass();
        c13697e.params_ = c9530e;
        c13697e.bitField0_ |= 1;
    }

    /* renamed from: class, reason: not valid java name */
    public static C13697e m3638class(AbstractC10498e abstractC10498e, C5712e c5712e) {
        return (C13697e) AbstractC3405e.remoteconfig(DEFAULT_INSTANCE, abstractC10498e, c5712e);
    }

    public static C15344e firebase() {
        return (C15344e) DEFAULT_INSTANCE.yandex();
    }

    public final int crashlytics() {
        return this.version_;
    }

    public final AbstractC10498e premium() {
        return this.keyValue_;
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
            return new C13697e();
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
        synchronized (C13697e.class) {
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

    public final C9530e subs() {
        C9530e c9530e = this.params_;
        return c9530e == null ? C9530e.ads() : c9530e;
    }
}
