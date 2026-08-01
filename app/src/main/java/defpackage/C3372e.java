package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٔۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3372e extends AbstractC3405e implements InterfaceC10218e {
    private static final C3372e DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile InterfaceC5309e PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = BuildConfig.FLAVOR;

    static {
        C3372e c3372e = new C3372e();
        DEFAULT_INSTANCE = c3372e;
        AbstractC3405e.tapsense(C3372e.class, c3372e);
    }

    public static void ads(C3372e c3372e, EnumC3021e enumC3021e) {
        c3372e.getClass();
        c3372e.outputPrefixType_ = enumC3021e.vip();
    }

    public static void applovin(C3372e c3372e, String str) {
        c3372e.getClass();
        str.getClass();
        c3372e.typeUrl_ = str;
    }

    public static C14504e crashlytics() {
        return (C14504e) DEFAULT_INSTANCE.yandex();
    }

    public static void premium(C3372e c3372e, EnumC4513e enumC4513e) {
        c3372e.getClass();
        c3372e.status_ = enumC4513e.ad();
    }

    public static void subs(C3372e c3372e, int i) {
        c3372e.keyId_ = i;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
        }
        if (m2467class == 3) {
            return new C3372e();
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
        synchronized (C3372e.class) {
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
