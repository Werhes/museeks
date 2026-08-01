package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۤ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18114e extends AbstractC4994e {
    private static final C18114e DEFAULT_INSTANCE;
    private static volatile InterfaceC17362e PARSER;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؗٚۘ, e٘ۤ۟] */
    static {
        ?? abstractC4994e = new AbstractC4994e();
        DEFAULT_INSTANCE = abstractC4994e;
        AbstractC4994e.mopub(C18114e.class, abstractC4994e);
    }

    public static C13439e amazon() {
        return (C13439e) DEFAULT_INSTANCE.metrica();
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, eؚۣٗ] */
    @Override // defpackage.AbstractC4994e
    public final Object license(int i) {
        InterfaceC17362e interfaceC17362e;
        switch (AbstractC8703e.m2467class(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C14702e(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new AbstractC4994e();
            case 4:
                return new AbstractC12161e(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC17362e interfaceC17362e2 = PARSER;
                if (interfaceC17362e2 != null) {
                    return interfaceC17362e2;
                }
                synchronized (C18114e.class) {
                    try {
                        InterfaceC17362e interfaceC17362e3 = PARSER;
                        interfaceC17362e = interfaceC17362e3;
                        if (interfaceC17362e3 == null) {
                            ?? obj = new Object();
                            PARSER = obj;
                            interfaceC17362e = obj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return interfaceC17362e;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
