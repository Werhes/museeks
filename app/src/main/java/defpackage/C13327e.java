package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٙؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13327e extends AbstractC3405e implements InterfaceC10218e {
    private static final C13327e DEFAULT_INSTANCE;
    public static final int DEM_PARAMS_FIELD_NUMBER = 2;
    public static final int EC_POINT_FORMAT_FIELD_NUMBER = 3;
    public static final int KEM_PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC5309e PARSER;
    private int bitField0_;
    private C2853e demParams_;
    private int ecPointFormat_;
    private C0103e kemParams_;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖؕۢ, eْٙؗ] */
    static {
        ?? abstractC3405e = new AbstractC3405e();
        DEFAULT_INSTANCE = abstractC3405e;
        AbstractC3405e.tapsense(C13327e.class, abstractC3405e);
    }

    public static void ads(C13327e c13327e, C2853e c2853e) {
        c13327e.getClass();
        c13327e.demParams_ = c2853e;
        c13327e.bitField0_ |= 2;
    }

    public static void applovin(C13327e c13327e, C0103e c0103e) {
        c13327e.getClass();
        c13327e.kemParams_ = c0103e;
        c13327e.bitField0_ |= 1;
    }

    /* renamed from: interface, reason: not valid java name */
    public static C7477e m3555interface() {
        return (C7477e) DEFAULT_INSTANCE.yandex();
    }

    public static void premium(C13327e c13327e, EnumC3951e enumC3951e) {
        c13327e.getClass();
        if (enumC3951e != EnumC3951e.UNRECOGNIZED) {
            c13327e.ecPointFormat_ = enumC3951e.f8820e;
        } else {
            enumC3951e.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static C13327e subs() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: class, reason: not valid java name */
    public final C0103e m3556class() {
        C0103e c0103e = this.kemParams_;
        return c0103e == null ? C0103e.crashlytics() : c0103e;
    }

    public final C2853e crashlytics() {
        C2853e c2853e = this.demParams_;
        return c2853e == null ? C2853e.premium() : c2853e;
    }

    public final EnumC3951e firebase() {
        int i = this.ecPointFormat_;
        EnumC3951e enumC3951e = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : EnumC3951e.DO_NOT_USE_CRUNCHY_UNCOMPRESSED : EnumC3951e.COMPRESSED : EnumC3951e.UNCOMPRESSED : EnumC3951e.UNKNOWN_FORMAT;
        return enumC3951e == null ? EnumC3951e.UNRECOGNIZED : enumC3951e;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"bitField0_", "kemParams_", "demParams_", "ecPointFormat_"});
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
        synchronized (C13327e.class) {
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
