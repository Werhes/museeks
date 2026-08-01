package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۡۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14311e extends AbstractC3405e implements InterfaceC10218e {
    private static final C14311e DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile InterfaceC5309e PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC10498e keyValue_ = AbstractC10498e.f20717e;
    private C4343e params_;
    private int version_;

    static {
        C14311e c14311e = new C14311e();
        DEFAULT_INSTANCE = c14311e;
        AbstractC3405e.tapsense(C14311e.class, c14311e);
    }

    public static void ads(C14311e c14311e, C4343e c4343e) {
        c14311e.getClass();
        c14311e.params_ = c4343e;
        c14311e.bitField0_ |= 1;
    }

    public static void applovin(C14311e c14311e, C2096e c2096e) {
        c14311e.getClass();
        c14311e.keyValue_ = c2096e;
    }

    /* renamed from: class, reason: not valid java name */
    public static C14311e m3790class(AbstractC10498e abstractC10498e, C5712e c5712e) {
        return (C14311e) AbstractC3405e.remoteconfig(DEFAULT_INSTANCE, abstractC10498e, c5712e);
    }

    public static C15579e firebase() {
        return (C15579e) DEFAULT_INSTANCE.yandex();
    }

    /* renamed from: interface, reason: not valid java name */
    public static InterfaceC5309e m3791interface() {
        return DEFAULT_INSTANCE.advert();
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "keyValue_", "params_"});
        }
        if (m2467class == 3) {
            return new C14311e();
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
        synchronized (C14311e.class) {
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

    public final C4343e subs() {
        C4343e c4343e = this.params_;
        return c4343e == null ? C4343e.ads() : c4343e;
    }
}
