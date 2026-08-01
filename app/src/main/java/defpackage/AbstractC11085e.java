package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٙۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11085e {
    public static final C13507e ad;
    public static final C17594e license;
    public static final C13780e metrica;
    public static final C10221e vip;

    static {
        C15768e metrica2 = AbstractC6336e.metrica("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        ad = new C13507e(C0631e.class, new C2864e(12));
        vip = new C10221e(metrica2, new C2864e(13));
        metrica = new C13780e(C3679e.class, new C2864e(14));
        license = new C17594e(metrica2, new C2864e(15));
    }

    public static EnumC3021e ad(C14911e c14911e) {
        if (C14911e.f29548e.equals(c14911e)) {
            return EnumC3021e.TINK;
        }
        if (C14911e.f29546e.equals(c14911e)) {
            return EnumC3021e.CRUNCHY;
        }
        if (C14911e.f29549e.equals(c14911e)) {
            return EnumC3021e.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + c14911e);
    }

    public static C14911e vip(EnumC3021e enumC3021e) {
        int ordinal = enumC3021e.ordinal();
        if (ordinal == 1) {
            return C14911e.f29548e;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return C14911e.f29549e;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC3021e.vip());
            }
        }
        return C14911e.f29546e;
    }
}
