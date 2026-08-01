package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٓٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3347e implements InterfaceC6830e {
    public final byte[] ad;
    public final Provider metrica;
    public final byte[] vip;

    public C3347e(byte[] bArr, byte[] bArr2, Provider provider) {
        if (!AbstractC1786e.startapp(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.ad = bArr;
        this.vip = bArr2;
        this.metrica = provider;
    }

    @Override // defpackage.InterfaceC6830e
    public final byte[] ad(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] ad = AbstractC10461e.ad(24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(AbstractC12608e.ad(this.ad, ad), "ChaCha20");
        byte[] bArr3 = new byte[12];
        System.arraycopy(ad, 16, bArr3, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        byte[] bArr4 = C14868e.license;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.metrica);
        cipher.init(1, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr5 = this.vip;
        if (outputSize > 2147483623 - bArr5.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr5, bArr5.length + 24 + outputSize);
        System.arraycopy(ad, 0, copyOf, bArr5.length, 24);
        if (cipher.doFinal(bArr, 0, bArr.length, copyOf, bArr5.length + 24) == outputSize) {
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
        if (length < bArr3.length + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!AbstractC6336e.vip(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, bArr3.length, bArr4, 0, 24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(AbstractC12608e.ad(this.ad, bArr4), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        byte[] bArr6 = C14868e.license;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.metrica);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 24, (bArr.length - bArr3.length) - 24);
    }
}
