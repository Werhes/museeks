package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10543e {
    public static final C13507e ad;
    public static final C17594e license;
    public static final C13780e metrica;
    public static final C10221e vip;

    static {
        C15768e metrica2 = AbstractC6336e.metrica("type.googleapis.com/google.crypto.tink.AesCmacKey");
        ad = new C13507e(C0834e.class, new C2282e(21));
        vip = new C10221e(metrica2, new C2282e(22));
        metrica = new C13780e(C6345e.class, new C2282e(23));
        license = new C17594e(metrica2, new C2282e(24));
    }

    public static EnumC3021e ad(C6594e c6594e) {
        if (C6594e.f13609e.equals(c6594e)) {
            return EnumC3021e.TINK;
        }
        if (C6594e.f13606e.equals(c6594e)) {
            return EnumC3021e.CRUNCHY;
        }
        if (C6594e.f13611e.equals(c6594e)) {
            return EnumC3021e.RAW;
        }
        if (C6594e.f13612e.equals(c6594e)) {
            return EnumC3021e.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + c6594e);
    }

    public static C6594e vip(EnumC3021e enumC3021e) {
        int ordinal = enumC3021e.ordinal();
        if (ordinal == 1) {
            return C6594e.f13609e;
        }
        if (ordinal == 2) {
            return C6594e.f13612e;
        }
        if (ordinal == 3) {
            return C6594e.f13611e;
        }
        if (ordinal == 4) {
            return C6594e.f13606e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC3021e.vip());
    }
}
