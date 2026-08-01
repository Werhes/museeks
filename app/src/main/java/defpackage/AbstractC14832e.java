package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٜٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14832e {
    public static final C13507e ad;
    public static final C17594e license;
    public static final C13780e metrica;
    public static final C10221e vip;

    static {
        C15768e metrica2 = AbstractC6336e.metrica("type.googleapis.com/google.crypto.tink.AesGcmKey");
        ad = new C13507e(C15694e.class, new C0663e(6));
        vip = new C10221e(metrica2, new C0663e(7));
        metrica = new C13780e(C17092e.class, new C0663e(8));
        license = new C17594e(metrica2, new C0663e(9));
    }

    public static EnumC3021e ad(C16372e c16372e) {
        if (C16372e.f32166e.equals(c16372e)) {
            return EnumC3021e.TINK;
        }
        if (C16372e.f32167e.equals(c16372e)) {
            return EnumC3021e.CRUNCHY;
        }
        if (C16372e.f32165e.equals(c16372e)) {
            return EnumC3021e.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + c16372e);
    }

    public static void metrica(C15694e c15694e) {
        int i = c15694e.metrica;
        int i2 = c15694e.vip;
        if (i != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(c15694e.metrica)));
        }
        if (i2 != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(i2)));
        }
    }

    public static C16372e vip(EnumC3021e enumC3021e) {
        int ordinal = enumC3021e.ordinal();
        if (ordinal == 1) {
            return C16372e.f32166e;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return C16372e.f32165e;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC3021e.vip());
            }
        }
        return C16372e.f32167e;
    }
}
