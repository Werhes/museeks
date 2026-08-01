package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۨ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14419e {
    public static final C13507e ad;
    public static final C17594e license;
    public static final C13780e metrica;
    public static final C10221e vip;

    static {
        C15768e metrica2 = AbstractC6336e.metrica("type.googleapis.com/google.crypto.tink.AesEaxKey");
        ad = new C13507e(C9325e.class, new C0663e(1));
        vip = new C10221e(metrica2, new C0663e(2));
        metrica = new C13780e(C8059e.class, new C0663e(3));
        license = new C17594e(metrica2, new C0663e(4));
    }

    public static C8224e ad(C9325e c9325e) {
        if (c9325e.metrica != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(c9325e.metrica)));
        }
        C2849e subs = C8224e.subs();
        int i = c9325e.vip;
        subs.appmetrica();
        C8224e.applovin((C8224e) subs.f9709e, i);
        return (C8224e) subs.ad();
    }

    public static C11594e metrica(EnumC3021e enumC3021e) {
        int ordinal = enumC3021e.ordinal();
        if (ordinal == 1) {
            return C11594e.f23292e;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return C11594e.f23291e;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC3021e.vip());
            }
        }
        return C11594e.f23293e;
    }

    public static EnumC3021e vip(C11594e c11594e) {
        if (C11594e.f23292e.equals(c11594e)) {
            return EnumC3021e.TINK;
        }
        if (C11594e.f23293e.equals(c11594e)) {
            return EnumC3021e.CRUNCHY;
        }
        if (C11594e.f23291e.equals(c11594e)) {
            return EnumC3021e.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + c11594e);
    }
}
