package defpackage;

import java.io.ByteArrayInputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2456e extends AbstractC3405e implements InterfaceC10218e {
    private static final C2456e DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile InterfaceC5309e PARSER;
    private int bitField0_;
    private AbstractC10498e encryptedKeyset_ = AbstractC10498e.f20717e;
    private C12859e keysetInfo_;

    static {
        C2456e c2456e = new C2456e();
        DEFAULT_INSTANCE = c2456e;
        AbstractC3405e.tapsense(C2456e.class, c2456e);
    }

    public static void ads(C2456e c2456e, C12859e c12859e) {
        c2456e.getClass();
        c2456e.keysetInfo_ = c12859e;
        c2456e.bitField0_ |= 1;
    }

    public static void applovin(C2456e c2456e, C2096e c2096e) {
        c2456e.getClass();
        c2456e.encryptedKeyset_ = c2096e;
    }

    public static C2456e crashlytics(ByteArrayInputStream byteArrayInputStream, C5712e c5712e) {
        AbstractC3405e signatures = AbstractC3405e.signatures(DEFAULT_INSTANCE, new C1397e(byteArrayInputStream), c5712e);
        AbstractC3405e.billing(signatures);
        return (C2456e) signatures;
    }

    public static C7813e subs() {
        return (C7813e) DEFAULT_INSTANCE.yandex();
    }

    public final AbstractC10498e premium() {
        return this.encryptedKeyset_;
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
            return new C15610e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "encryptedKeyset_", "keysetInfo_"});
        }
        if (m2467class == 3) {
            return new C2456e();
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
        synchronized (C2456e.class) {
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
