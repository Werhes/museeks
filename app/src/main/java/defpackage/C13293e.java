package defpackage;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13293e {
    /* JADX WARN: Type inference failed for: r0v0, types: [eْٗ, java.lang.Object] */
    public static C13293e ad(C6345e c6345e, Provider provider) {
        ?? obj = new Object();
        if (!AbstractC1786e.startapp(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            c6345e.metrica.vip();
            new SecretKeySpec(((C15768e) c6345e.vip.f35233e).vip(), "AES");
            return obj;
        } catch (NoSuchAlgorithmException e) {
            throw new GeneralSecurityException("AES-CMAC not available.", e);
        }
    }
}
