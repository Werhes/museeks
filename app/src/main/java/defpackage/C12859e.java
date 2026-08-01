package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٜۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12859e extends AbstractC3405e implements InterfaceC10218e {
    private static final C12859e DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile InterfaceC5309e PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC16489e keyInfo_ = C11134e.f22052e;
    private int primaryKeyId_;

    static {
        C12859e c12859e = new C12859e();
        DEFAULT_INSTANCE = c12859e;
        AbstractC3405e.tapsense(C12859e.class, c12859e);
    }

    public static void ads(C12859e c12859e, C3372e c3372e) {
        c12859e.getClass();
        InterfaceC16489e interfaceC16489e = c12859e.keyInfo_;
        if (!((AbstractC11556e) interfaceC16489e).f23215e) {
            c12859e.keyInfo_ = interfaceC16489e.metrica(interfaceC16489e.size() * 2);
        }
        c12859e.keyInfo_.add(c3372e);
    }

    public static void applovin(C12859e c12859e, int i) {
        c12859e.primaryKeyId_ = i;
    }

    public static C0799e premium() {
        return (C0799e) DEFAULT_INSTANCE.yandex();
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", C3372e.class});
        }
        if (m2467class == 3) {
            return new C12859e();
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
        synchronized (C12859e.class) {
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
