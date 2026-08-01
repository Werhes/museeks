package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘ٘ٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17583e extends AbstractC4994e {
    public static final int ACTION_PARAMETERS_FIELD_NUMBER = 3;
    public static final int APP_WIDGET_ID_FIELD_NUMBER = 2;
    public static final int CLASS_NAME_FIELD_NUMBER = 1;
    private static final C17583e DEFAULT_INSTANCE;
    private static volatile InterfaceC17362e PARSER;
    private int appWidgetId_;
    private String className_ = BuildConfig.FLAVOR;
    private AbstractC4002e actionParameters_ = AbstractC4002e.f8908e;

    static {
        C17583e c17583e = new C17583e();
        DEFAULT_INSTANCE = c17583e;
        AbstractC4994e.mopub(C17583e.class, c17583e);
    }

    public static void Signature(C17583e c17583e, C11507e c11507e) {
        c17583e.getClass();
        c17583e.actionParameters_ = c11507e;
    }

    public static void amazon(C17583e c17583e, String str) {
        c17583e.getClass();
        c17583e.className_ = str;
    }

    public static void loadAd(C17583e c17583e, int i) {
        c17583e.appWidgetId_ = i;
    }

    public static C10486e pro() {
        return (C10486e) DEFAULT_INSTANCE.metrica();
    }

    public static C17583e remoteconfig() {
        return DEFAULT_INSTANCE;
    }

    public final AbstractC4002e admob() {
        return this.actionParameters_;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, eؚۣٗ] */
    @Override // defpackage.AbstractC4994e
    public final Object license(int i) {
        InterfaceC17362e interfaceC17362e;
        switch (AbstractC8703e.m2467class(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C14702e(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\n", new Object[]{"className_", "appWidgetId_", "actionParameters_"});
            case 3:
                return new C17583e();
            case 4:
                return new AbstractC12161e(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC17362e interfaceC17362e2 = PARSER;
                if (interfaceC17362e2 != null) {
                    return interfaceC17362e2;
                }
                synchronized (C17583e.class) {
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

    public final String subscription() {
        return this.className_;
    }
}
