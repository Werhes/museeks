package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8180e extends AbstractC3405e implements InterfaceC10218e {
    private static final C8180e DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile InterfaceC5309e PARSER;
    private String keyUri_ = BuildConfig.FLAVOR;

    static {
        C8180e c8180e = new C8180e();
        DEFAULT_INSTANCE = c8180e;
        AbstractC3405e.tapsense(C8180e.class, c8180e);
    }

    public static C8180e ads() {
        return DEFAULT_INSTANCE;
    }

    public static void applovin(C8180e c8180e, String str) {
        c8180e.getClass();
        str.getClass();
        c8180e.keyUri_ = str;
    }

    public static C8180e crashlytics(AbstractC10498e abstractC10498e, C5712e c5712e) {
        return (C8180e) AbstractC3405e.remoteconfig(DEFAULT_INSTANCE, abstractC10498e, c5712e);
    }

    public static C3944e subs() {
        return (C3944e) DEFAULT_INSTANCE.yandex();
    }

    public final String premium() {
        return this.keyUri_;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
        }
        if (m2467class == 3) {
            return new C8180e();
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
        synchronized (C8180e.class) {
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
