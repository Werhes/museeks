package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٔۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14739e extends AbstractC3405e implements InterfaceC10218e {
    private static final C14739e DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile InterfaceC5309e PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖؕۢ, eٕٔۡ] */
    static {
        ?? abstractC3405e = new AbstractC3405e();
        DEFAULT_INSTANCE = abstractC3405e;
        AbstractC3405e.tapsense(C14739e.class, abstractC3405e);
    }

    public static void ads(C14739e c14739e, int i) {
        c14739e.tagSize_ = i;
    }

    public static void applovin(C14739e c14739e, EnumC10611e enumC10611e) {
        c14739e.getClass();
        c14739e.hash_ = enumC10611e.vip();
    }

    public static C0988e firebase() {
        return (C0988e) DEFAULT_INSTANCE.yandex();
    }

    public static C14739e premium() {
        return DEFAULT_INSTANCE;
    }

    public final int crashlytics() {
        return this.tagSize_;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
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
        synchronized (C14739e.class) {
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

    public final EnumC10611e subs() {
        EnumC10611e ad = EnumC10611e.ad(this.hash_);
        return ad == null ? EnumC10611e.UNRECOGNIZED : ad;
    }
}
