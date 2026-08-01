package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0094e implements InterfaceC6830e {
    public final byte[] ad;
    public final InterfaceC7218e metrica;
    public final int vip;

    public C0094e(byte[] bArr, C15768e c15768e, int i) {
        this.metrica = AbstractC2223e.vip(C15617e.advert(C2544e.vip(bArr.length), new C17974e(23, C15768e.ad(bArr))));
        this.ad = c15768e.vip();
        this.vip = i;
    }

    @Override // defpackage.InterfaceC6830e
    public final byte[] ad(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        int i = this.vip;
        int i2 = i + 12;
        byte[] ad = AbstractC10461e.ad(i2);
        byte[] copyOf = Arrays.copyOf(ad, i);
        byte[] copyOfRange = Arrays.copyOfRange(ad, i, i2);
        C6325e c6325e = new C6325e(metrica(copyOf));
        byte[] bArr3 = this.ad;
        byte[] crashlytics = c6325e.crashlytics(bArr3.length + i + copyOfRange.length, copyOfRange, bArr, bArr2);
        System.arraycopy(bArr3, 0, crashlytics, 0, bArr3.length);
        System.arraycopy(ad, 0, crashlytics, bArr3.length, ad.length);
        return crashlytics;
    }

    public final byte[] metrica(byte[] bArr) {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (bArr.length > 12 || bArr.length < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        System.arraycopy(bArr, 0, bArr3, 4, bArr.length);
        byte[] bArr4 = new byte[32];
        InterfaceC7218e interfaceC7218e = this.metrica;
        System.arraycopy(interfaceC7218e.tapsense(16, bArr2), 0, bArr4, 0, 16);
        System.arraycopy(interfaceC7218e.tapsense(16, bArr3), 0, bArr4, 16, 16);
        return bArr4;
    }

    @Override // defpackage.InterfaceC6830e
    public final byte[] vip(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.ad;
        int length2 = bArr3.length;
        int i = this.vip;
        if (length < length2 + i + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!AbstractC6336e.vip(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int length3 = bArr3.length + i;
        byte[] metrica = metrica(Arrays.copyOfRange(bArr, bArr3.length, length3));
        if (!AbstractC1786e.adcel(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKeySpec vip = AbstractC0613e.vip(metrica);
        int i2 = length3 + 12;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, length3, i2);
        if (copyOfRange.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr.length < length3 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec ad = AbstractC0613e.ad(0, copyOfRange.length, copyOfRange);
        Cipher metrica2 = AbstractC0613e.metrica();
        metrica2.init(2, vip, ad);
        if (bArr2 != null && bArr2.length != 0) {
            metrica2.updateAAD(bArr2);
        }
        return metrica2.doFinal(bArr, i2, bArr.length - i2);
    }
}
