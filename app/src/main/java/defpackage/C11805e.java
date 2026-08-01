package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ٘ۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11805e implements InterfaceC13627e {
    public final InterfaceC7218e ad;
    public final byte[] metrica;
    public final byte[] vip;
    public static final byte[] license = new byte[16];
    public static final byte[] appmetrica = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    public static final C6121e purchase = new C6121e(4);

    public C11805e(byte[] bArr, C15768e c15768e) {
        if (!AbstractC1786e.startapp(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (bArr.length != 32 && bArr.length != 64) {
            throw new InvalidKeyException(AbstractC17861e.smaato(bArr.length, " bytes; key must have 32 or 64 bytes", new StringBuilder("invalid key size: ")));
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.vip = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.ad = AbstractC2223e.vip(C15617e.advert(C2544e.vip(copyOfRange.length), new C17974e(23, C15768e.ad(copyOfRange))));
        this.metrica = c15768e.vip();
    }

    public static void license(int i) {
        if (i > 126) {
            throw new GeneralSecurityException(AbstractC1634e.smaato("Too many associated datas: ", i, " > 126"));
        }
    }

    @Override // defpackage.InterfaceC13627e
    public final byte[] ad(byte[] bArr, byte[] bArr2) {
        byte[][] bArr3 = {bArr2};
        license(1);
        int length = bArr.length;
        byte[] bArr4 = this.metrica;
        if (length > 2147483631 - bArr4.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) purchase.get();
        byte[][] bArr5 = (byte[][]) Arrays.copyOf(bArr3, 2);
        bArr5[1] = bArr;
        byte[] metrica = metrica(bArr5);
        byte[] bArr6 = (byte[]) metrica.clone();
        bArr6[8] = (byte) (bArr6[8] & Byte.MAX_VALUE);
        bArr6[12] = (byte) (bArr6[12] & Byte.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(this.vip, "AES"), new IvParameterSpec(bArr6));
        byte[] copyOf = Arrays.copyOf(bArr4, bArr4.length + metrica.length + bArr.length);
        System.arraycopy(metrica, 0, copyOf, bArr4.length, metrica.length);
        if (cipher.doFinal(bArr, 0, bArr.length, copyOf, bArr4.length + metrica.length) == bArr.length) {
            return copyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    public final byte[] metrica(byte[]... bArr) {
        byte[] billing;
        int length = bArr.length;
        InterfaceC7218e interfaceC7218e = this.ad;
        if (length == 0) {
            return interfaceC7218e.tapsense(16, appmetrica);
        }
        byte[] tapsense = interfaceC7218e.tapsense(16, license);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            tapsense = AbstractC7640e.billing(AbstractC16540e.ad(tapsense), interfaceC7218e.tapsense(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < tapsense.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int length2 = bArr3.length - tapsense.length;
            billing = Arrays.copyOf(bArr3, bArr3.length);
            for (int i2 = 0; i2 < tapsense.length; i2++) {
                int i3 = length2 + i2;
                billing[i3] = (byte) (billing[i3] ^ tapsense[i2]);
            }
        } else {
            if (bArr3.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(bArr3, 16);
            copyOf[bArr3.length] = Byte.MIN_VALUE;
            billing = AbstractC7640e.billing(copyOf, AbstractC16540e.ad(tapsense));
        }
        return interfaceC7218e.tapsense(16, billing);
    }

    @Override // defpackage.InterfaceC13627e
    public final byte[] vip(byte[] bArr, byte[] bArr2) {
        byte[][] bArr3 = {bArr2};
        license(1);
        int length = bArr.length;
        byte[] bArr4 = this.metrica;
        if (length < bArr4.length + 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        if (!AbstractC6336e.vip(bArr4, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) purchase.get();
        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr4.length, bArr4.length + 16);
        byte[] bArr5 = (byte[]) copyOfRange.clone();
        bArr5[8] = (byte) (bArr5[8] & Byte.MAX_VALUE);
        bArr5[12] = (byte) (bArr5[12] & Byte.MAX_VALUE);
        cipher.init(2, new SecretKeySpec(this.vip, "AES"), new IvParameterSpec(bArr5));
        int length2 = bArr4.length + 16;
        int length3 = bArr.length - length2;
        byte[] doFinal = cipher.doFinal(bArr, length2, length3);
        if (length3 == 0 && doFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            doFinal = new byte[0];
        }
        byte[][] bArr6 = (byte[][]) Arrays.copyOf(bArr3, 2);
        bArr6[1] = doFinal;
        if (MessageDigest.isEqual(copyOfRange, metrica(bArr6))) {
            return doFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }
}
