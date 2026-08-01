package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3994e extends AbstractC4994e {
    private static final C3994e DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    private static volatile InterfaceC17362e PARSER;
    private int bitField0_;
    private int layoutIndex_;
    private C14888e layout_;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؗٚۘ, eٌؖٗ] */
    static {
        ?? abstractC4994e = new AbstractC4994e();
        DEFAULT_INSTANCE = abstractC4994e;
        AbstractC4994e.mopub(C3994e.class, abstractC4994e);
    }

    public static void amazon(C3994e c3994e, C14888e c14888e) {
        c3994e.getClass();
        c14888e.getClass();
        c3994e.layout_ = c14888e;
        c3994e.bitField0_ |= 1;
    }

    public static void loadAd(C3994e c3994e, int i) {
        c3994e.layoutIndex_ = i;
    }

    public static C3689e subscription() {
        return (C3689e) DEFAULT_INSTANCE.metrica();
    }

    public final C14888e Signature() {
        C14888e c14888e = this.layout_;
        return c14888e == null ? C14888e.applovin() : c14888e;
    }

    public final int admob() {
        return this.layoutIndex_;
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
                return new C14702e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "layout_", "layoutIndex_"});
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
                synchronized (C3994e.class) {
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
