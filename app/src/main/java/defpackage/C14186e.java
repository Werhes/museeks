package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۘؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14186e implements InterfaceC7218e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C6121e f28034e = new C6121e(9);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f28035e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f28036e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final SecretKeySpec f28037e;

    public C14186e(byte[] bArr) {
        AbstractC5058e.ad(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f28037e = secretKeySpec;
        if (!AbstractC1786e.startapp(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f28034e.get();
        cipher.init(1, secretKeySpec);
        byte[] ad = AbstractC16540e.ad(cipher.doFinal(new byte[16]));
        this.f28036e = ad;
        this.f28035e = AbstractC16540e.ad(ad);
    }

    @Override // defpackage.InterfaceC7218e
    public final byte[] tapsense(int i, byte[] bArr) {
        byte[] billing;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!AbstractC1786e.startapp(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f28034e.get();
        cipher.init(1, this.f28037e);
        int length = bArr.length;
        int smaato = length == 0 ? 1 : AbstractC8703e.smaato(length, 1, 16, 1);
        if (smaato * 16 == bArr.length) {
            billing = AbstractC7640e.purchase((smaato - 1) * 16, 16, bArr, this.f28036e);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (smaato - 1) * 16, bArr.length);
            if (copyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[copyOfRange.length] = Byte.MIN_VALUE;
            billing = AbstractC7640e.billing(copyOf, this.f28035e);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i2 = 0; i2 < smaato - 1; i2++) {
            int i3 = i2 * 16;
            for (int i4 = 0; i4 < 16; i4++) {
                bArr3[i4] = (byte) (bArr2[i4] ^ bArr[i4 + i3]);
            }
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        for (int i5 = 0; i5 < 16; i5++) {
            bArr3[i5] = (byte) (bArr2[i5] ^ billing[i5]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return 16 == i ? bArr2 : Arrays.copyOf(bArr2, i);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
