package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؔؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11489e {
    public static final C13507e ad;
    public static final C17594e license;
    public static final C13780e metrica;
    public static final C10221e vip;

    static {
        C15768e metrica2 = AbstractC6336e.metrica("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        ad = new C13507e(C11488e.class, new C8391e(7));
        vip = new C10221e(metrica2, new C8391e(8));
        metrica = new C13780e(C8187e.class, new C8391e(9));
        license = new C17594e(metrica2, new C8391e(10));
    }

    public static EnumC3021e ad(C11278e c11278e) {
        if (C11278e.f22658e.equals(c11278e)) {
            return EnumC3021e.TINK;
        }
        if (C11278e.f22659e.equals(c11278e)) {
            return EnumC3021e.CRUNCHY;
        }
        if (C11278e.f22657e.equals(c11278e)) {
            return EnumC3021e.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + c11278e);
    }

    public static C11278e vip(EnumC3021e enumC3021e) {
        int ordinal = enumC3021e.ordinal();
        if (ordinal == 1) {
            return C11278e.f22658e;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return C11278e.f22657e;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC3021e.vip());
            }
        }
        return C11278e.f22659e;
    }
}
