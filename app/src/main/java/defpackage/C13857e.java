package defpackage;

import androidx.car.app.model.Alert;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٓ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13857e implements InterfaceC6830e {
    public static final C6121e appmetrica = new C6121e(1);
    public final byte[] ad;
    public final int license;
    public final SecretKeySpec metrica;
    public final InterfaceC7218e vip;

    public C13857e(byte[] bArr, int i, byte[] bArr2) {
        if (!AbstractC1786e.startapp(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.license = i;
        AbstractC5058e.ad(bArr.length);
        this.metrica = new SecretKeySpec(bArr, "AES");
        this.vip = AbstractC2223e.vip(C15617e.advert(C2544e.vip(bArr.length), new C17974e(23, C15768e.ad(bArr))));
        this.ad = bArr2;
    }

    @Override // defpackage.InterfaceC6830e
    public final byte[] ad(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.ad;
        int length2 = Alert.DURATION_SHOW_INDEFINITELY - bArr3.length;
        int i = this.license;
        if (length > (length2 - i) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i + bArr.length + 16);
        byte[] ad = AbstractC10461e.ad(i);
        System.arraycopy(ad, 0, copyOf, bArr3.length, i);
        byte[] metrica = metrica(0, 0, ad.length, ad);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] metrica2 = metrica(1, 0, bArr2.length, bArr2);
        Cipher cipher = (Cipher) appmetrica.get();
        cipher.init(1, this.metrica, new IvParameterSpec(metrica));
        cipher.doFinal(bArr, 0, bArr.length, copyOf, bArr3.length + i);
        byte[] metrica3 = metrica(2, bArr3.length + i, bArr.length, copyOf);
        int length3 = bArr3.length + bArr.length + i;
        for (int i2 = 0; i2 < 16; i2++) {
            copyOf[length3 + i2] = (byte) ((metrica2[i2] ^ metrica[i2]) ^ metrica3[i2]);
        }
        return copyOf;
    }

    public final byte[] metrica(int i, int i2, int i3, byte[] bArr) {
        byte[] bArr2 = new byte[i3 + 16];
        bArr2[15] = (byte) i;
        System.arraycopy(bArr, i2, bArr2, 16, i3);
        return this.vip.tapsense(16, bArr2);
    }

    @Override // defpackage.InterfaceC6830e
    public final byte[] vip(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.ad;
        int length2 = length - bArr3.length;
        int i = this.license;
        int i2 = (length2 - i) - 16;
        if (i2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!AbstractC6336e.vip(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] metrica = metrica(0, bArr3.length, i, bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] metrica2 = metrica(1, 0, bArr2.length, bArr2);
        byte[] metrica3 = metrica(2, bArr3.length + i, i2, bArr);
        int length3 = bArr.length - 16;
        byte b = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            b = (byte) (b | (((bArr[length3 + i3] ^ metrica2[i3]) ^ metrica[i3]) ^ metrica3[i3]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) appmetrica.get();
        cipher.init(1, this.metrica, new IvParameterSpec(metrica));
        return cipher.doFinal(bArr, bArr3.length + i, i2);
    }
}
