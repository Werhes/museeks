package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8609e extends AbstractC4994e {
    public static final int ACTIONKEY_FIELD_NUMBER = 3;
    public static final int APP_WIDGET_ID_FIELD_NUMBER = 2;
    private static final C8609e DEFAULT_INSTANCE;
    private static volatile InterfaceC17362e PARSER = null;
    public static final int RECEIVER_FIELD_NUMBER = 1;
    private int appWidgetId_;
    private String receiver_ = BuildConfig.FLAVOR;
    private String actionKey_ = BuildConfig.FLAVOR;

    static {
        C8609e c8609e = new C8609e();
        DEFAULT_INSTANCE = c8609e;
        AbstractC4994e.mopub(C8609e.class, c8609e);
    }

    public static void Signature(C8609e c8609e, String str) {
        c8609e.getClass();
        c8609e.actionKey_ = str;
    }

    public static void amazon(C8609e c8609e, String str) {
        c8609e.getClass();
        str.getClass();
        c8609e.receiver_ = str;
    }

    public static void loadAd(C8609e c8609e, int i) {
        c8609e.appWidgetId_ = i;
    }

    public static C8609e remoteconfig() {
        return DEFAULT_INSTANCE;
    }

    public static C17951e signatures() {
        return (C17951e) DEFAULT_INSTANCE.metrica();
    }

    public final String admob() {
        return this.actionKey_;
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
                return new C14702e(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ", new Object[]{"receiver_", "appWidgetId_", "actionKey_"});
            case 3:
                return new C8609e();
            case 4:
                return new AbstractC12161e(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC17362e interfaceC17362e2 = PARSER;
                if (interfaceC17362e2 != null) {
                    return interfaceC17362e2;
                }
                synchronized (C8609e.class) {
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

    public final String pro() {
        return this.receiver_;
    }

    public final int subscription() {
        return this.appWidgetId_;
    }
}
