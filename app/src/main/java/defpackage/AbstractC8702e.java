package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8702e {
    public static final C13507e ad;
    public static final C17594e license;
    public static final C13780e metrica;
    public static final C10221e vip;

    static {
        C15768e metrica2 = AbstractC6336e.metrica("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        ad = new C13507e(C11897e.class, new C2282e(26));
        vip = new C10221e(metrica2, new C2282e(27));
        metrica = new C13780e(C0860e.class, new C2282e(28));
        license = new C17594e(metrica2, new C2282e(29));
    }

    public static C14739e ad(C11897e c11897e) {
        EnumC10611e enumC10611e;
        C0988e firebase = C14739e.firebase();
        int i = c11897e.license;
        firebase.appmetrica();
        C14739e.ads((C14739e) firebase.f9709e, i);
        C6325e c6325e = c11897e.purchase;
        if (C6325e.f13166e.equals(c6325e)) {
            enumC10611e = EnumC10611e.SHA1;
        } else if (C6325e.f13163e.equals(c6325e)) {
            enumC10611e = EnumC10611e.SHA224;
        } else if (C6325e.f13169e.equals(c6325e)) {
            enumC10611e = EnumC10611e.SHA256;
        } else if (C6325e.f13168e.equals(c6325e)) {
            enumC10611e = EnumC10611e.SHA384;
        } else {
            if (!C6325e.f13165e.equals(c6325e)) {
                throw new GeneralSecurityException("Unable to serialize HashType " + c6325e);
            }
            enumC10611e = EnumC10611e.SHA512;
        }
        firebase.appmetrica();
        C14739e.applovin((C14739e) firebase.f9709e, enumC10611e);
        return (C14739e) firebase.ad();
    }

    public static C15400e license(EnumC3021e enumC3021e) {
        int ordinal = enumC3021e.ordinal();
        if (ordinal == 1) {
            return C15400e.f30387e;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return C15400e.f30386e;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC3021e.vip());
            }
        }
        return C15400e.f30388e;
    }

    public static EnumC3021e metrica(C15400e c15400e) {
        if (C15400e.f30387e.equals(c15400e)) {
            return EnumC3021e.TINK;
        }
        if (C15400e.f30388e.equals(c15400e)) {
            return EnumC3021e.CRUNCHY;
        }
        if (C15400e.f30386e.equals(c15400e)) {
            return EnumC3021e.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + c15400e);
    }

    public static C6325e vip(EnumC10611e enumC10611e) {
        int ordinal = enumC10611e.ordinal();
        if (ordinal == 1) {
            return C6325e.f13166e;
        }
        if (ordinal == 2) {
            return C6325e.f13168e;
        }
        if (ordinal == 3) {
            return C6325e.f13169e;
        }
        if (ordinal == 4) {
            return C6325e.f13165e;
        }
        if (ordinal == 5) {
            return C6325e.f13163e;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + enumC10611e.vip());
    }
}
