package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1697e {
    public static final C13507e ad;
    public static final C17594e license;
    public static final C13780e metrica;
    public static final C10221e vip;

    static {
        C15768e metrica2 = AbstractC6336e.metrica("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        ad = new C13507e(C2428e.class, new C0663e(12));
        vip = new C10221e(metrica2, new C0663e(13));
        metrica = new C13780e(C4076e.class, new C0663e(14));
        license = new C17594e(metrica2, new C0663e(15));
    }

    public static EnumC3021e ad(C15780e c15780e) {
        if (C15780e.f31086e.equals(c15780e)) {
            return EnumC3021e.TINK;
        }
        if (C15780e.f31087e.equals(c15780e)) {
            return EnumC3021e.CRUNCHY;
        }
        if (C15780e.f31085e.equals(c15780e)) {
            return EnumC3021e.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + c15780e);
    }

    public static C15780e vip(EnumC3021e enumC3021e) {
        int ordinal = enumC3021e.ordinal();
        if (ordinal == 1) {
            return C15780e.f31086e;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return C15780e.f31085e;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC3021e.vip());
            }
        }
        return C15780e.f31087e;
    }
}
