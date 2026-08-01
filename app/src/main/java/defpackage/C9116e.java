package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۦٌ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9116e {
    public static final C6121e license = new C6121e(0);
    public final SecretKeySpec ad;
    public final int metrica;
    public final int vip;

    public C9116e(int i, byte[] bArr) {
        if (!AbstractC1786e.adcel(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC5058e.ad(bArr.length);
        this.ad = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) license.get()).getBlockSize();
        this.metrica = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.vip = i;
    }

    public final void ad(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) {
        Cipher cipher = (Cipher) license.get();
        byte[] bArr4 = new byte[this.metrica];
        System.arraycopy(bArr3, 0, bArr4, 0, this.vip);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.ad;
        if (z) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
