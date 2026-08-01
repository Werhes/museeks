package defpackage;

import java.io.ByteArrayInputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؕۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3599e extends AbstractC3405e implements InterfaceC10218e {
    private static final C3599e DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile InterfaceC5309e PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC16489e key_ = C11134e.f22052e;
    private int primaryKeyId_;

    static {
        C3599e c3599e = new C3599e();
        DEFAULT_INSTANCE = c3599e;
        AbstractC3405e.tapsense(C3599e.class, c3599e);
    }

    public static void ads(C3599e c3599e, C17915e c17915e) {
        c3599e.getClass();
        InterfaceC16489e interfaceC16489e = c3599e.key_;
        if (!((AbstractC11556e) interfaceC16489e).f23215e) {
            c3599e.key_ = interfaceC16489e.metrica(interfaceC16489e.size() * 2);
        }
        c3599e.key_.add(c17915e);
    }

    public static void applovin(C3599e c3599e, int i) {
        c3599e.primaryKeyId_ = i;
    }

    /* renamed from: class, reason: not valid java name */
    public static C18074e m1380class() {
        return (C18074e) DEFAULT_INSTANCE.yandex();
    }

    /* renamed from: goto, reason: not valid java name */
    public static C3599e m1381goto(byte[] bArr, C5712e c5712e) {
        return (C3599e) AbstractC3405e.pro(DEFAULT_INSTANCE, bArr, c5712e);
    }

    /* renamed from: interface, reason: not valid java name */
    public static C3599e m1382interface(ByteArrayInputStream byteArrayInputStream, C5712e c5712e) {
        AbstractC3405e signatures = AbstractC3405e.signatures(DEFAULT_INSTANCE, new C1397e(byteArrayInputStream), c5712e);
        AbstractC3405e.billing(signatures);
        return (C3599e) signatures;
    }

    public final InterfaceC16489e crashlytics() {
        return this.key_;
    }

    public final int firebase() {
        return this.primaryKeyId_;
    }

    public final C17915e premium(int i) {
        return (C17915e) this.key_.get(i);
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", C17915e.class});
        }
        if (m2467class == 3) {
            return new C3599e();
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
        synchronized (C3599e.class) {
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

    public final int subs() {
        return this.key_.size();
    }
}
