package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٞٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14868e implements InterfaceC6830e {
    public final SecretKeySpec ad;
    public final Provider metrica;
    public final byte[] vip;
    public static final byte[] license = AbstractC5706e.metrica("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    public static final byte[] appmetrica = AbstractC5706e.metrica("070000004041424344454647");
    public static final byte[] purchase = AbstractC5706e.metrica("a0784d7a4716f3feb4f64e7f4b39bf04");

    public C14868e(byte[] bArr, byte[] bArr2, Provider provider) {
        if (!AbstractC1786e.startapp(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.ad = new SecretKeySpec(bArr, "ChaCha20");
        this.vip = bArr2;
        this.metrica = provider;
    }

    public static Cipher metrica() {
        Cipher cipher = (Cipher) C7174e.vip.ad.isPro("ChaCha20-Poly1305");
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(appmetrica);
            byte[] bArr = license;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = purchase;
            if (cipher.doFinal(bArr2).length == 0) {
                cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
                if (cipher.doFinal(bArr2).length == 0) {
                    return cipher;
                }
            }
        } catch (GeneralSecurityException unused) {
        }
        throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
    }

    @Override // defpackage.InterfaceC6830e
    public final byte[] ad(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] ad = AbstractC10461e.ad(12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(ad);
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.metrica);
        cipher.init(1, this.ad, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr3 = this.vip;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(ad, 0, copyOf, bArr3.length, 12);
        if (cipher.doFinal(bArr, 0, bArr.length, copyOf, bArr3.length + 12) == outputSize) {
            return copyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // defpackage.InterfaceC6830e
    public final byte[] vip(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.vip;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!AbstractC6336e.vip(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, bArr3.length, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.metrica);
        cipher.init(2, this.ad, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
    }
}
