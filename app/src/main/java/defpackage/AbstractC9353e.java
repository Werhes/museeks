package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٍٍ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9353e {
    public static final C13507e ad;
    public static final C17594e license;
    public static final C13780e metrica;
    public static final C10221e vip;

    static {
        C15768e metrica2 = AbstractC6336e.metrica("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        ad = new C13507e(C11127e.class, new C0189e(20));
        vip = new C10221e(metrica2, new C0189e(21));
        metrica = new C13780e(C6872e.class, new C0189e(22));
        license = new C17594e(metrica2, new C0189e(23));
    }

    public static EnumC3021e ad(C2443e c2443e) {
        if (C2443e.f6249e.equals(c2443e)) {
            return EnumC3021e.TINK;
        }
        if (C2443e.f6250e.equals(c2443e)) {
            return EnumC3021e.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + c2443e);
    }

    public static C2443e vip(EnumC3021e enumC3021e) {
        int ordinal = enumC3021e.ordinal();
        if (ordinal == 1) {
            return C2443e.f6249e;
        }
        if (ordinal == 3) {
            return C2443e.f6250e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC3021e.vip());
    }
}
