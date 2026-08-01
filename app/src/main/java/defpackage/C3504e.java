package defpackage;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؕٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3504e implements InterfaceC9660e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f7926e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f7927e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public CipherInputStream f7928e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC9660e f7929e;

    public C3504e(InterfaceC9660e interfaceC9660e, byte[] bArr, byte[] bArr2) {
        this.f7929e = interfaceC9660e;
        this.f7927e = bArr;
        this.f7926e = bArr2;
    }

    @Override // defpackage.InterfaceC9660e
    public final Map advert() {
        return this.f7929e.advert();
    }

    @Override // defpackage.InterfaceC9660e
    public final void close() {
        if (this.f7928e != null) {
            this.f7928e = null;
            this.f7929e.close();
        }
    }

    @Override // defpackage.InterfaceC9660e
    public final void license(InterfaceC4407e interfaceC4407e) {
        interfaceC4407e.getClass();
        this.f7929e.license(interfaceC4407e);
    }

    @Override // defpackage.InterfaceC9660e
    public final Uri loadAd() {
        return this.f7929e.loadAd();
    }

    @Override // defpackage.InterfaceC9660e
    public final long metrica(C2435e c2435e) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f7927e, "AES"), new IvParameterSpec(this.f7926e));
                C0534e c0534e = new C0534e(this.f7929e, c2435e);
                this.f7928e = new CipherInputStream(c0534e, cipher);
                c0534e.ad();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.InterfaceC15672e
    public final int read(byte[] bArr, int i, int i2) {
        this.f7928e.getClass();
        int read = this.f7928e.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
