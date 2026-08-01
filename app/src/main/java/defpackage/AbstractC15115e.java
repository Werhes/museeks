package defpackage;

import java.security.InvalidAlgorithmParameterException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٔۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15115e {
    public static final C9938e ad = new C9938e(C12892e.class, InterfaceC13627e.class, new C0663e(16));
    public static final C5431e license;
    public static final C13639e metrica;
    public static final C11159e vip;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, eْۦْ] */
    static {
        C14867e.firebase();
        vip = new C11159e("type.googleapis.com/google.crypto.tink.AesSivKey", InterfaceC13627e.class, EnumC13541e.SYMMETRIC);
        metrica = new Object();
        license = new C5431e(5);
    }

    public static void ad(C14664e c14664e) {
        if (c14664e.ad == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException(AbstractC17861e.smaato(c14664e.ad, ". Valid keys must have 64 bytes.", new StringBuilder("invalid key size: ")));
    }
}
