package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ۠ٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15774e extends AbstractC4994e {
    public static final int APP_WIDGET_IDS_FIELD_NUMBER = 2;
    private static final C15774e DEFAULT_INSTANCE;
    private static volatile InterfaceC17362e PARSER = null;
    public static final int RECEIVER_FIELD_NUMBER = 1;
    private int appWidgetIdsMemoizedSerializedSize = -1;
    private String receiver_ = BuildConfig.FLAVOR;
    private InterfaceC5189e appWidgetIds_ = C4178e.f9213e;

    static {
        C15774e c15774e = new C15774e();
        DEFAULT_INSTANCE = c15774e;
        AbstractC4994e.mopub(C15774e.class, c15774e);
    }

    public static C15774e admob() {
        return DEFAULT_INSTANCE;
    }

    public static void amazon(C15774e c15774e, String str) {
        c15774e.getClass();
        str.getClass();
        c15774e.receiver_ = str;
    }

    public static void loadAd(C15774e c15774e, List list) {
        RandomAccess randomAccess = c15774e.appWidgetIds_;
        if (!((AbstractC5360e) randomAccess).f11481e) {
            C4178e c4178e = (C4178e) randomAccess;
            int i = c4178e.f9214e;
            int i2 = i == 0 ? 10 : i * 2;
            if (i2 < i) {
                throw new IllegalArgumentException();
            }
            c15774e.appWidgetIds_ = new C4178e(Arrays.copyOf(c4178e.f9215e, i2), c4178e.f9214e, true);
        }
        AbstractC6866e.ad(list, c15774e.appWidgetIds_);
    }

    public static C6733e remoteconfig() {
        return (C6733e) DEFAULT_INSTANCE.metrica();
    }

    public final InterfaceC5189e Signature() {
        return this.appWidgetIds_;
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
                return new C14702e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002'", new Object[]{"receiver_", "appWidgetIds_"});
            case 3:
                return new C15774e();
            case 4:
                return new AbstractC12161e(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC17362e interfaceC17362e2 = PARSER;
                if (interfaceC17362e2 != null) {
                    return interfaceC17362e2;
                }
                synchronized (C15774e.class) {
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
        return this.receiver_;
    }
}
