package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؖۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1612e extends AbstractC3405e implements InterfaceC10218e {
    private static final C1612e DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile InterfaceC5309e PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC10498e keyValue_ = AbstractC10498e.f20717e;
    private int version_;

    static {
        C1612e c1612e = new C1612e();
        DEFAULT_INSTANCE = c1612e;
        AbstractC3405e.tapsense(C1612e.class, c1612e);
    }

    public static void applovin(C1612e c1612e, C2096e c2096e) {
        c1612e.getClass();
        c1612e.keyValue_ = c2096e;
    }

    public static C1612e crashlytics(AbstractC10498e abstractC10498e, C5712e c5712e) {
        return (C1612e) AbstractC3405e.remoteconfig(DEFAULT_INSTANCE, abstractC10498e, c5712e);
    }

    public static InterfaceC5309e firebase() {
        return DEFAULT_INSTANCE.advert();
    }

    public static C6932e subs() {
        return (C6932e) DEFAULT_INSTANCE.yandex();
    }

    public final AbstractC10498e ads() {
        return this.keyValue_;
    }

    public final int premium() {
        return this.version_;
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [eؗۨؓ, java.lang.Object] */
    @Override // defpackage.AbstractC3405e
    public final Object startapp(int i) {
        InterfaceC5309e interfaceC5309e;
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            return (byte) 1;
        }
        if (m2467class == 2) {
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
        }
        if (m2467class == 3) {
            return new C1612e();
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
        synchronized (C1612e.class) {
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
