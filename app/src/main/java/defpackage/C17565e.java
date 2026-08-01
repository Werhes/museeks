package defpackage;

import java.security.SecureRandom;
import org.conscrypt.PSKKeyManager;

/* renamed from: e٘ؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17565e extends AbstractC9027e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C6740e f34409e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f34410e;

    public C17565e(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[57];
        this.f34410e = bArr;
        if (bArr.length != 57) {
            throw new IllegalArgumentException("k");
        }
        secureRandom.nextBytes(bArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17565e(byte[] bArr) {
        super(true);
        if (bArr.length != 57) {
            throw new IllegalArgumentException("'buf' must have length 57");
        }
        byte[] bArr2 = new byte[57];
        this.f34410e = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 57);
    }

    public final C6740e ad() {
        C6740e c6740e;
        synchronized (this.f34410e) {
            try {
                if (this.f34409e == null) {
                    this.f34409e = new C6740e(AbstractC3995e.license(this.f34410e));
                }
                c6740e = this.f34409e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6740e;
    }

    public final void vip(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[57];
        AbstractC3995e.metrica(ad().f13936e, bArr4, 0);
        if (bArr == null) {
            throw new NullPointerException("'ctx' cannot be null");
        }
        if (bArr.length > 255) {
            throw new IllegalArgumentException("ctx");
        }
        if (bArr == null || bArr.length >= 256) {
            throw new IllegalArgumentException("ctx");
        }
        C16253e c16253e = new C16253e(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        byte[] bArr5 = new byte[114];
        c16253e.purchase(0, 57, this.f34410e);
        c16253e.metrica(0, 114, bArr5);
        byte[] bArr6 = new byte[57];
        AbstractC3995e.remoteconfig(bArr5, bArr6);
        AbstractC3995e.vip(c16253e, (byte) 0, bArr);
        c16253e.purchase(57, 57, bArr5);
        c16253e.purchase(0, i, bArr2);
        c16253e.metrica(0, 114, bArr5);
        byte[] purchase = AbstractC15118e.purchase(bArr5);
        byte[] bArr7 = new byte[57];
        C12894e c12894e = new C12894e(15);
        AbstractC3995e.pro(purchase, c12894e);
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        AbstractC14410e.smaato((int[]) c12894e.f25752e, iArr2);
        AbstractC14410e.Signature(iArr2, (int[]) c12894e.f25751e, iArr);
        AbstractC14410e.Signature(iArr2, (int[]) c12894e.f25750e, iArr2);
        AbstractC14410e.admob(iArr, 1);
        AbstractC14410e.admob(iArr, -1);
        AbstractC14410e.admob(iArr2, 1);
        AbstractC14410e.admob(iArr2, -1);
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        AbstractC14410e.remoteconfig(iArr, iArr4);
        AbstractC14410e.remoteconfig(iArr2, iArr5);
        AbstractC14410e.Signature(iArr4, iArr5, iArr3);
        AbstractC14410e.vip(iArr4, iArr5, iArr4);
        AbstractC14410e.loadAd(39081, iArr3, iArr3);
        int[] iArr6 = new int[16];
        iArr6[0] = 1;
        AbstractC14410e.signatures(iArr3, iArr6, iArr3);
        AbstractC14410e.vip(iArr3, iArr4, iArr3);
        AbstractC14410e.admob(iArr3, 1);
        AbstractC14410e.admob(iArr3, -1);
        AbstractC14410e.admob(iArr5, 1);
        AbstractC14410e.admob(iArr5, -1);
        int amazon = AbstractC14410e.amazon(iArr3) & (~AbstractC14410e.amazon(iArr5));
        AbstractC14410e.adcel(0, bArr7, iArr2);
        bArr7[56] = (byte) ((1 & iArr[0]) << 7);
        if (amazon == 0) {
            throw new IllegalStateException();
        }
        AbstractC3995e.vip(c16253e, (byte) 0, bArr);
        c16253e.purchase(0, 57, bArr7);
        c16253e.purchase(0, 57, bArr4);
        c16253e.purchase(0, i, bArr2);
        c16253e.metrica(0, 114, bArr5);
        byte[] purchase2 = AbstractC15118e.purchase(bArr5);
        int[] iArr7 = new int[28];
        AbstractC15118e.vip(purchase, iArr7);
        AbstractC15118e.vip(purchase2, new int[14]);
        AbstractC15118e.vip(bArr6, new int[14]);
        long j = 0;
        for (int i2 = 0; i2 < 14; i2++) {
            long premium = j + (AbstractC12797e.premium(14, r5[i2], r0, iArr7, i2) & 4294967295L) + (iArr7[r8] & 4294967295L);
            iArr7[i2 + 14] = (int) premium;
            j = premium >>> 32;
        }
        byte[] bArr8 = new byte[114];
        AbstractC12751e.yandex(28, bArr8, iArr7);
        byte[] purchase3 = AbstractC15118e.purchase(bArr8);
        System.arraycopy(bArr7, 0, bArr3, 0, 57);
        System.arraycopy(purchase3, 0, bArr3, 57, 57);
    }
}
