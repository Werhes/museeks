package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۡٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0633e {
    public static final Object ad = new Object();

    public static boolean ad(String str) {
        synchronized (ad) {
            try {
                String vip = AbstractC5058e.vip(str);
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    if (keyStore.containsAlias(vip)) {
                        return false;
                    }
                    AbstractC13062e.appmetrica(vip);
                    return true;
                } catch (IOException e) {
                    throw new GeneralSecurityException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C4536e vip(String str) {
        C4536e c4536e;
        try {
            synchronized (ad) {
                try {
                    c4536e = new C4536e(AbstractC5058e.vip(str));
                    byte[] ad2 = AbstractC10461e.ad(10);
                    byte[] bArr = new byte[0];
                    if (!Arrays.equals(ad2, c4536e.vip(c4536e.ad(ad2, bArr), bArr))) {
                        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c4536e;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
