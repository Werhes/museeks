package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18317e extends AbstractC3405e implements InterfaceC10218e {
    private static final C18317e DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC5309e PARSER;
    private int bitField0_;
    private int keySize_;
    private C8224e params_;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٜۗ, eٖؕۢ] */
    static {
        ?? abstractC3405e = new AbstractC3405e();
        DEFAULT_INSTANCE = abstractC3405e;
        AbstractC3405e.tapsense(C18317e.class, abstractC3405e);
    }

    public static void ads(C18317e c18317e, int i) {
        c18317e.keySize_ = i;
    }

    public static void applovin(C18317e c18317e, C8224e c8224e) {
        c18317e.getClass();
        c18317e.params_ = c8224e;
        c18317e.bitField0_ |= 1;
    }

    public static C15016e crashlytics() {
        return (C15016e) DEFAULT_INSTANCE.yandex();
    }

    public static C18317e firebase(AbstractC10498e abstractC10498e, C5712e c5712e) {
        return (C18317e) AbstractC3405e.remoteconfig(DEFAULT_INSTANCE, abstractC10498e, c5712e);
    }

    public final int premium() {
        return this.keySize_;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"bitField0_", "params_", "keySize_"});
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
        synchronized (C18317e.class) {
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

    public final C8224e subs() {
        C8224e c8224e = this.params_;
        return c8224e == null ? C8224e.ads() : c8224e;
    }
}
