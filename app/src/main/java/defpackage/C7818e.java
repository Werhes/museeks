package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7818e extends AbstractC3405e implements InterfaceC10218e {
    private static final C7818e DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile InterfaceC5309e PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = BuildConfig.FLAVOR;
    private AbstractC10498e value_ = AbstractC10498e.f20717e;

    static {
        C7818e c7818e = new C7818e();
        DEFAULT_INSTANCE = c7818e;
        AbstractC3405e.tapsense(C7818e.class, c7818e);
    }

    public static void ads(C7818e c7818e, AbstractC10498e abstractC10498e) {
        c7818e.getClass();
        abstractC10498e.getClass();
        c7818e.value_ = abstractC10498e;
    }

    public static void applovin(C7818e c7818e, String str) {
        c7818e.getClass();
        str.getClass();
        c7818e.typeUrl_ = str;
    }

    /* renamed from: goto, reason: not valid java name */
    public static C2455e m2322goto(C7818e c7818e) {
        AbstractC4490e yandex = DEFAULT_INSTANCE.yandex();
        yandex.purchase(c7818e);
        return (C2455e) yandex;
    }

    /* renamed from: interface, reason: not valid java name */
    public static C2455e m2323interface() {
        return (C2455e) DEFAULT_INSTANCE.yandex();
    }

    public static void premium(C7818e c7818e, EnumC3021e enumC3021e) {
        c7818e.getClass();
        c7818e.outputPrefixType_ = enumC3021e.vip();
    }

    public static C7818e subs() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: this, reason: not valid java name */
    public static C7818e m2324this(byte[] bArr, C5712e c5712e) {
        return (C7818e) AbstractC3405e.pro(DEFAULT_INSTANCE, bArr, c5712e);
    }

    /* renamed from: class, reason: not valid java name */
    public final AbstractC10498e m2325class() {
        return this.value_;
    }

    public final EnumC3021e crashlytics() {
        EnumC3021e ad = EnumC3021e.ad(this.outputPrefixType_);
        return ad == null ? EnumC3021e.UNRECOGNIZED : ad;
    }

    public final String firebase() {
        return this.typeUrl_;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
        }
        if (m2467class == 3) {
            return new C7818e();
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
        synchronized (C7818e.class) {
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
