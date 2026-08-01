package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۣٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9076e extends AbstractC3405e implements InterfaceC10218e {
    private static final C9076e DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile InterfaceC5309e PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = BuildConfig.FLAVOR;
    private AbstractC10498e value_ = AbstractC10498e.f20717e;

    static {
        C9076e c9076e = new C9076e();
        DEFAULT_INSTANCE = c9076e;
        AbstractC3405e.tapsense(C9076e.class, c9076e);
    }

    public static void ads(C9076e c9076e, AbstractC10498e abstractC10498e) {
        c9076e.getClass();
        abstractC10498e.getClass();
        c9076e.value_ = abstractC10498e;
    }

    public static void applovin(C9076e c9076e, String str) {
        c9076e.getClass();
        str.getClass();
        c9076e.typeUrl_ = str;
    }

    /* renamed from: interface, reason: not valid java name */
    public static C15336e m2518interface() {
        return (C15336e) DEFAULT_INSTANCE.yandex();
    }

    public static void premium(C9076e c9076e, EnumC13541e enumC13541e) {
        c9076e.getClass();
        if (enumC13541e != EnumC13541e.UNRECOGNIZED) {
            c9076e.keyMaterialType_ = enumC13541e.f26839e;
        } else {
            enumC13541e.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static C9076e subs() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: class, reason: not valid java name */
    public final AbstractC10498e m2519class() {
        return this.value_;
    }

    public final EnumC13541e crashlytics() {
        int i = this.keyMaterialType_;
        EnumC13541e enumC13541e = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : EnumC13541e.REMOTE : EnumC13541e.ASYMMETRIC_PUBLIC : EnumC13541e.ASYMMETRIC_PRIVATE : EnumC13541e.SYMMETRIC : EnumC13541e.UNKNOWN_KEYMATERIAL;
        return enumC13541e == null ? EnumC13541e.UNRECOGNIZED : enumC13541e;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
        }
        if (m2467class == 3) {
            return new C9076e();
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
        synchronized (C9076e.class) {
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
