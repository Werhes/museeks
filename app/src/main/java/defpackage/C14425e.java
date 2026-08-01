package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٔؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14425e extends AbstractC3405e implements InterfaceC10218e {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final C14425e DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile InterfaceC5309e PARSER;
    private String configName_ = BuildConfig.FLAVOR;
    private InterfaceC16489e entry_ = C11134e.f22052e;

    static {
        C14425e c14425e = new C14425e();
        DEFAULT_INSTANCE = c14425e;
        AbstractC3405e.tapsense(C14425e.class, c14425e);
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", C3206e.class});
        }
        if (m2467class == 3) {
            return new C14425e();
        }
        if (m2467class == 4) {
            return new C15000e(DEFAULT_INSTANCE, 2);
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
        synchronized (C14425e.class) {
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
