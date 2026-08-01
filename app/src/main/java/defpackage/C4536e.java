package defpackage;

import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؖۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4536e implements InterfaceC6830e {
    public final /* synthetic */ int ad = 1;
    public final Object vip;

    public C4536e(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.vip = new C4536e(str, keyStore);
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public C4536e(String str, KeyStore keyStore) {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.vip = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException(AbstractC17861e.Signature("Keystore cannot load the key with ID: ", str));
        }
    }

    @Override // defpackage.InterfaceC6830e
    public final byte[] ad(byte[] bArr, byte[] bArr2) {
        int i = this.ad;
        Object obj = this.vip;
        switch (i) {
            case 0:
                if (bArr.length > 2147483619) {
                    throw new GeneralSecurityException("plaintext too long");
                }
                byte[] bArr3 = new byte[bArr.length + 28];
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, (SecretKey) obj);
                cipher.updateAAD(bArr2);
                if (cipher.doFinal(bArr, 0, bArr.length, bArr3, 12) != bArr.length + 16) {
                    throw new GeneralSecurityException("encryption failed: bytesWritten is wrong");
                }
                byte[] iv = cipher.getIV();
                if (iv.length != 12) {
                    throw new GeneralSecurityException("IV has unexpected length");
                }
                System.arraycopy(iv, 0, bArr3, 0, 12);
                return bArr3;
            default:
                C4536e c4536e = (C4536e) obj;
                try {
                    return c4536e.ad(bArr, bArr2);
                } catch (GeneralSecurityException | ProviderException e) {
                    Log.w("eؘؖۨ", "encountered a potentially transient KeyStore error, will wait and retry", e);
                    try {
                        Thread.sleep((int) (Math.random() * 100.0d));
                    } catch (InterruptedException unused) {
                    }
                    return c4536e.ad(bArr, bArr2);
                }
        }
    }

    @Override // defpackage.InterfaceC6830e
    public final byte[] vip(byte[] bArr, byte[] bArr2) {
        int i = this.ad;
        Object obj = this.vip;
        switch (i) {
            case 0:
                if (bArr.length < 28) {
                    throw new BadPaddingException("ciphertext too short");
                }
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, (SecretKey) obj, gCMParameterSpec);
                cipher.updateAAD(bArr2);
                return cipher.doFinal(bArr, 12, bArr.length - 12);
            default:
                C4536e c4536e = (C4536e) obj;
                try {
                    return c4536e.vip(bArr, bArr2);
                } catch (BadPaddingException e) {
                    throw e;
                } catch (GeneralSecurityException e2) {
                    e = e2;
                    Log.w("eؘؖۨ", "encountered a potentially transient KeyStore error, will wait and retry", e);
                    try {
                        Thread.sleep((int) (Math.random() * 100.0d));
                    } catch (InterruptedException unused) {
                    }
                    return c4536e.vip(bArr, bArr2);
                } catch (ProviderException e3) {
                    e = e3;
                    Log.w("eؘؖۨ", "encountered a potentially transient KeyStore error, will wait and retry", e);
                    Thread.sleep((int) (Math.random() * 100.0d));
                    return c4536e.vip(bArr, bArr2);
                }
        }
    }
}
