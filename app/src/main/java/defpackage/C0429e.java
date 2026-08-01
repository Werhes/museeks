package defpackage;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؑٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0429e implements InterfaceC6830e {
    public final C0663e ad;
    public final byte[] metrica;
    public final SecretKeySpec vip;
    public static final byte[] license = AbstractC5706e.metrica("7a806c");
    public static final byte[] appmetrica = AbstractC5706e.metrica("46bb91c3c5");
    public static final byte[] purchase = AbstractC5706e.metrica("36864200e0eaf5284d884a0e77d31646");
    public static final byte[] billing = AbstractC5706e.metrica("bae8e37fc83441b16034566b");
    public static final byte[] yandex = AbstractC5706e.metrica("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    public C0429e(byte[] bArr, byte[] bArr2, C0663e c0663e) {
        this.metrica = bArr2;
        AbstractC5058e.ad(bArr.length);
        this.vip = new SecretKeySpec(bArr, "AES");
        this.ad = c0663e;
    }

    public static boolean metrica(Cipher cipher) {
        try {
            byte[] bArr = billing;
            cipher.init(2, new SecretKeySpec(purchase, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(appmetrica);
            byte[] bArr2 = yandex;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), license);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // defpackage.InterfaceC6830e
    public final byte[] ad(byte[] bArr, byte[] bArr2) {
        Cipher ad = this.ad.ad();
        int length = bArr.length;
        byte[] bArr3 = this.metrica;
        if (length > 2147483619 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + bArr.length + 16);
        byte[] ad2 = AbstractC10461e.ad(12);
        System.arraycopy(ad2, 0, copyOf, bArr3.length, 12);
        ad.init(1, this.vip, new GCMParameterSpec(128, ad2, 0, ad2.length));
        if (bArr2 != null && bArr2.length != 0) {
            ad.updateAAD(bArr2);
        }
        int doFinal = ad.doFinal(bArr, 0, bArr.length, copyOf, bArr3.length + 12);
        if (doFinal == bArr.length + 16) {
            return copyOf;
        }
        throw new GeneralSecurityException(AbstractC1634e.smaato("encryption failed; AES-GCM-SIV tag must be 16 bytes, but got only ", doFinal - bArr.length, " bytes"));
    }

    @Override // defpackage.InterfaceC6830e
    public final byte[] vip(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.metrica;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!AbstractC6336e.vip(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher ad = this.ad.ad();
        ad.init(2, this.vip, new GCMParameterSpec(128, bArr, bArr3.length, 12));
        if (bArr2 != null && bArr2.length != 0) {
            ad.updateAAD(bArr2);
        }
        return ad.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
    }
}
