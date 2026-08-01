package defpackage;

import java.security.SecureRandom;

/* renamed from: eْٓٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14061e extends AbstractC9027e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f27809e;

    public C14061e(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[56];
        this.f27809e = bArr;
        if (bArr.length != 56) {
            throw new IllegalArgumentException("k");
        }
        secureRandom.nextBytes(bArr);
        if (bArr.length != 56) {
            throw new IllegalArgumentException("k");
        }
        bArr[0] = (byte) (bArr[0] & 252);
        bArr[55] = (byte) (bArr[55] | 128);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14061e(byte[] bArr) {
        super(true);
        if (bArr.length != 56) {
            throw new IllegalArgumentException("'buf' must have length 56");
        }
        byte[] bArr2 = new byte[56];
        this.f27809e = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 56);
    }

    public final C0719e ad() {
        byte[] bArr = new byte[56];
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        byte[] bArr2 = new byte[57];
        AbstractC3995e.remoteconfig(this.f27809e, bArr2);
        C12894e c12894e = new C12894e(15);
        AbstractC3995e.pro(bArr2, c12894e);
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        AbstractC14410e.remoteconfig((int[]) c12894e.f25751e, iArr4);
        AbstractC14410e.remoteconfig((int[]) c12894e.f25750e, iArr5);
        AbstractC14410e.remoteconfig((int[]) c12894e.f25752e, iArr6);
        AbstractC14410e.Signature(iArr4, iArr5, iArr3);
        AbstractC14410e.vip(iArr4, iArr5, iArr4);
        AbstractC14410e.Signature(iArr4, iArr6, iArr4);
        AbstractC14410e.remoteconfig(iArr6, iArr6);
        AbstractC14410e.loadAd(39081, iArr3, iArr3);
        AbstractC14410e.signatures(iArr3, iArr6, iArr3);
        AbstractC14410e.vip(iArr3, iArr4, iArr3);
        AbstractC14410e.admob(iArr3, 1);
        AbstractC14410e.admob(iArr3, -1);
        AbstractC14410e.admob(iArr5, 1);
        AbstractC14410e.admob(iArr5, -1);
        AbstractC14410e.admob(iArr6, 1);
        AbstractC14410e.admob(iArr6, -1);
        if (((~AbstractC14410e.amazon(iArr6)) & AbstractC14410e.amazon(iArr3) & (~AbstractC14410e.amazon(iArr5))) == 0) {
            throw new IllegalStateException();
        }
        AbstractC14410e.appmetrica(0, 0, (int[]) c12894e.f25751e, iArr);
        AbstractC14410e.appmetrica(0, 0, (int[]) c12894e.f25750e, iArr2);
        AbstractC14410e.smaato(iArr, iArr);
        AbstractC14410e.Signature(iArr, iArr2, iArr);
        AbstractC14410e.remoteconfig(iArr, iArr);
        AbstractC14410e.admob(iArr, 1);
        AbstractC14410e.admob(iArr, -1);
        AbstractC14410e.adcel(0, bArr, iArr);
        return new C0719e(0, bArr);
    }
}
