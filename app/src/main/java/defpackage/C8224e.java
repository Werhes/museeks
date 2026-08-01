package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۜؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8224e extends AbstractC3405e implements InterfaceC10218e {
    private static final C8224e DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile InterfaceC5309e PARSER;
    private int ivSize_;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖؕۢ, eًۜؑ] */
    static {
        ?? abstractC3405e = new AbstractC3405e();
        DEFAULT_INSTANCE = abstractC3405e;
        AbstractC3405e.tapsense(C8224e.class, abstractC3405e);
    }

    public static C8224e ads() {
        return DEFAULT_INSTANCE;
    }

    public static void applovin(C8224e c8224e, int i) {
        c8224e.ivSize_ = i;
    }

    public static C2849e subs() {
        return (C2849e) DEFAULT_INSTANCE.yandex();
    }

    public final int premium() {
        return this.ivSize_;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
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
        synchronized (C8224e.class) {
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
