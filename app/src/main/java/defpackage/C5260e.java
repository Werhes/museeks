package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۥؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5260e extends AbstractC3405e implements InterfaceC10218e {
    private static final C5260e DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC5309e PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private C8180e params_;
    private int version_;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؗۥؕ, eٖؕۢ] */
    static {
        ?? abstractC3405e = new AbstractC3405e();
        DEFAULT_INSTANCE = abstractC3405e;
        AbstractC3405e.tapsense(C5260e.class, abstractC3405e);
    }

    public static void applovin(C5260e c5260e, C8180e c8180e) {
        c5260e.getClass();
        c5260e.params_ = c8180e;
        c5260e.bitField0_ |= 1;
    }

    public static C5260e crashlytics(AbstractC10498e abstractC10498e, C5712e c5712e) {
        return (C5260e) AbstractC3405e.remoteconfig(DEFAULT_INSTANCE, abstractC10498e, c5712e);
    }

    public static InterfaceC5309e firebase() {
        return DEFAULT_INSTANCE.advert();
    }

    public static C6171e subs() {
        return (C6171e) DEFAULT_INSTANCE.yandex();
    }

    public final C8180e ads() {
        C8180e c8180e = this.params_;
        return c8180e == null ? C8180e.ads() : c8180e;
    }

    public final int premium() {
        return this.version_;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
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
        synchronized (C5260e.class) {
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
