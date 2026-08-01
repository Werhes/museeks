package defpackage;

import java.security.SecureRandom;

/* renamed from: eٟٔٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14877e extends SecureRandom {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f29472e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f29473e;

    public C14877e(byte[] bArr, AbstractC9567e abstractC9567e) {
        if (bArr.length >= 48) {
            byte[] bArr2 = new byte[48];
            System.arraycopy(bArr, 0, bArr2, 0, 48);
            byte[] bArr3 = new byte[32];
            this.f29473e = bArr3;
            byte[] bArr4 = new byte[16];
            this.f29472e = bArr4;
            ad(bArr2, bArr3, bArr4);
            return;
        }
        int length = 48 - bArr.length;
        int digestSize = abstractC9567e.getDigestSize();
        abstractC9567e.update(bArr, 0, bArr.length);
        byte[] bArr5 = new byte[digestSize];
        abstractC9567e.doFinal(bArr5, 0);
        if (length != digestSize) {
            if (length < digestSize) {
                bArr5 = AbstractC12442e.Signature(length, bArr5);
            } else {
                byte[] Signature = AbstractC12442e.Signature(digestSize, bArr5);
                while (true) {
                    length -= digestSize;
                    if (length < digestSize) {
                        break;
                    }
                    abstractC9567e.update(bArr5, 0, digestSize);
                    bArr5 = new byte[digestSize];
                    abstractC9567e.doFinal(bArr5, 0);
                    Signature = AbstractC12442e.adcel(Signature, bArr5);
                }
                if (length > 0) {
                    abstractC9567e.update(bArr5, 0, digestSize);
                    byte[] bArr6 = new byte[digestSize];
                    abstractC9567e.doFinal(bArr6, 0);
                    int length2 = Signature.length;
                    bArr5 = AbstractC12442e.Signature(length2 + length, Signature);
                    System.arraycopy(bArr6, 0, bArr5, length2, length);
                } else {
                    bArr5 = Signature;
                }
            }
        }
        byte[] bArr7 = new byte[48];
        System.arraycopy(AbstractC12442e.adcel(bArr, bArr5), 0, bArr7, 0, 48);
        byte[] bArr8 = new byte[32];
        this.f29473e = bArr8;
        byte[] bArr9 = new byte[16];
        this.f29472e = bArr9;
        ad(bArr7, bArr8, bArr9);
    }

    public static void ad(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[48];
        for (int i = 0; i < 3; i++) {
            int i2 = 15;
            while (true) {
                if (i2 >= 0) {
                    byte b = bArr3[i2];
                    if ((b & 255) != 255) {
                        bArr3[i2] = (byte) (b + 1);
                        break;
                    } else {
                        bArr3[i2] = 0;
                        i2--;
                    }
                }
            }
            vip(i * 16, bArr2, bArr3, bArr4);
        }
        if (bArr != null) {
            for (int i3 = 0; i3 < 48; i3++) {
                bArr4[i3] = (byte) (bArr4[i3] ^ bArr[i3]);
            }
        }
        System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
        System.arraycopy(bArr4, 32, bArr3, 0, bArr3.length);
    }

    public static void vip(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            loadAd loadad = new loadAd();
            loadad.init(true, new C14915e(bArr));
            for (int i2 = 0; i2 != bArr2.length; i2 += 16) {
                loadad.tapsense(i2, i + i2, bArr2, bArr3);
            }
        } catch (Throwable th) {
            throw new IllegalStateException("drbg failure: " + th.getMessage(), th);
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int length = bArr.length;
        int i = 0;
        while (length > 0) {
            int i2 = 15;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                byte[] bArr3 = this.f29472e;
                byte b = bArr3[i2];
                if ((b & 255) != 255) {
                    bArr3[i2] = (byte) (b + 1);
                    break;
                } else {
                    bArr3[i2] = 0;
                    i2--;
                }
            }
            vip(0, this.f29473e, this.f29472e, bArr2);
            if (length > 15) {
                System.arraycopy(bArr2, 0, bArr, i, 16);
                i += 16;
                length -= 16;
            } else {
                System.arraycopy(bArr2, 0, bArr, i, length);
                length = 0;
            }
        }
        ad(null, this.f29473e, this.f29472e);
    }
}
