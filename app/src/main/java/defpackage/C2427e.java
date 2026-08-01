package defpackage;

import java.lang.reflect.Array;

/* renamed from: eؙؚؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2427e extends AbstractC16313e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f6232e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f6233e;

    public C2427e() {
        this.f6232e = new byte[64];
    }

    public C2427e(C2427e c2427e) {
        c2427e.getClass();
        this.f6232e = AbstractC12442e.license(c2427e.f6232e);
        this.f6233e = c2427e.f6233e;
    }

    public static void appmetrica(byte[][] bArr, byte[][] bArr2) {
        System.arraycopy(bArr[0], 12, bArr2[0], 0, 4);
        System.arraycopy(bArr[2], 12, bArr2[0], 4, 4);
        System.arraycopy(bArr[1], 12, bArr2[0], 8, 4);
        System.arraycopy(bArr[3], 12, bArr2[0], 12, 4);
        System.arraycopy(bArr[2], 0, bArr2[1], 0, 4);
        System.arraycopy(bArr[0], 0, bArr2[1], 4, 4);
        System.arraycopy(bArr[3], 0, bArr2[1], 8, 4);
        System.arraycopy(bArr[1], 0, bArr2[1], 12, 4);
        System.arraycopy(bArr[2], 4, bArr2[2], 0, 4);
        System.arraycopy(bArr[0], 4, bArr2[2], 4, 4);
        System.arraycopy(bArr[3], 4, bArr2[2], 8, 4);
        System.arraycopy(bArr[1], 4, bArr2[2], 12, 4);
        System.arraycopy(bArr[0], 8, bArr2[3], 0, 4);
        System.arraycopy(bArr[2], 8, bArr2[3], 4, 4);
        System.arraycopy(bArr[1], 8, bArr2[3], 8, 4);
        System.arraycopy(bArr[3], 8, bArr2[3], 12, 4);
    }

    @Override // defpackage.InterfaceC0293e
    public final int doFinal(byte[] bArr, int i) {
        if (this.f6233e != 64) {
            throw new IllegalStateException("input must be exactly 64 bytes");
        }
        if (bArr.length - i < 32) {
            throw new IllegalArgumentException("output too short to receive digest");
        }
        Class cls = Byte.TYPE;
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) cls, 4, 16);
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, 4, 16);
        byte[] bArr4 = bArr2[0];
        byte[] bArr5 = this.f6232e;
        System.arraycopy(bArr5, 0, bArr4, 0, 16);
        System.arraycopy(bArr5, 16, bArr2[1], 0, 16);
        System.arraycopy(bArr5, 32, bArr2[2], 0, 16);
        System.arraycopy(bArr5, 48, bArr2[3], 0, 16);
        byte[] bArr6 = bArr2[0];
        byte[][] bArr7 = AbstractC16313e.f32061e;
        bArr2[0] = AbstractC16313e.ad(bArr6, bArr7[0]);
        bArr2[1] = AbstractC16313e.ad(bArr2[1], bArr7[1]);
        bArr2[2] = AbstractC16313e.ad(bArr2[2], bArr7[2]);
        bArr2[3] = AbstractC16313e.ad(bArr2[3], bArr7[3]);
        bArr2[0] = AbstractC16313e.ad(bArr2[0], bArr7[4]);
        bArr2[1] = AbstractC16313e.ad(bArr2[1], bArr7[5]);
        bArr2[2] = AbstractC16313e.ad(bArr2[2], bArr7[6]);
        bArr2[3] = AbstractC16313e.ad(bArr2[3], bArr7[7]);
        appmetrica(bArr2, bArr3);
        bArr2[0] = AbstractC16313e.ad(bArr3[0], bArr7[8]);
        bArr2[1] = AbstractC16313e.ad(bArr3[1], bArr7[9]);
        bArr2[2] = AbstractC16313e.ad(bArr3[2], bArr7[10]);
        bArr2[3] = AbstractC16313e.ad(bArr3[3], bArr7[11]);
        bArr2[0] = AbstractC16313e.ad(bArr2[0], bArr7[12]);
        bArr2[1] = AbstractC16313e.ad(bArr2[1], bArr7[13]);
        bArr2[2] = AbstractC16313e.ad(bArr2[2], bArr7[14]);
        bArr2[3] = AbstractC16313e.ad(bArr2[3], bArr7[15]);
        appmetrica(bArr2, bArr3);
        bArr2[0] = AbstractC16313e.ad(bArr3[0], bArr7[16]);
        bArr2[1] = AbstractC16313e.ad(bArr3[1], bArr7[17]);
        bArr2[2] = AbstractC16313e.ad(bArr3[2], bArr7[18]);
        bArr2[3] = AbstractC16313e.ad(bArr3[3], bArr7[19]);
        bArr2[0] = AbstractC16313e.ad(bArr2[0], bArr7[20]);
        bArr2[1] = AbstractC16313e.ad(bArr2[1], bArr7[21]);
        bArr2[2] = AbstractC16313e.ad(bArr2[2], bArr7[22]);
        bArr2[3] = AbstractC16313e.ad(bArr2[3], bArr7[23]);
        appmetrica(bArr2, bArr3);
        bArr2[0] = AbstractC16313e.ad(bArr3[0], bArr7[24]);
        bArr2[1] = AbstractC16313e.ad(bArr3[1], bArr7[25]);
        bArr2[2] = AbstractC16313e.ad(bArr3[2], bArr7[26]);
        bArr2[3] = AbstractC16313e.ad(bArr3[3], bArr7[27]);
        bArr2[0] = AbstractC16313e.ad(bArr2[0], bArr7[28]);
        bArr2[1] = AbstractC16313e.ad(bArr2[1], bArr7[29]);
        bArr2[2] = AbstractC16313e.ad(bArr2[2], bArr7[30]);
        bArr2[3] = AbstractC16313e.ad(bArr2[3], bArr7[31]);
        appmetrica(bArr2, bArr3);
        bArr2[0] = AbstractC16313e.ad(bArr3[0], bArr7[32]);
        bArr2[1] = AbstractC16313e.ad(bArr3[1], bArr7[33]);
        bArr2[2] = AbstractC16313e.ad(bArr3[2], bArr7[34]);
        bArr2[3] = AbstractC16313e.ad(bArr3[3], bArr7[35]);
        bArr2[0] = AbstractC16313e.ad(bArr2[0], bArr7[36]);
        bArr2[1] = AbstractC16313e.ad(bArr2[1], bArr7[37]);
        bArr2[2] = AbstractC16313e.ad(bArr2[2], bArr7[38]);
        bArr2[3] = AbstractC16313e.ad(bArr2[3], bArr7[39]);
        appmetrica(bArr2, bArr3);
        AbstractC4340e.billing(bArr3[0], bArr5, 0, bArr2[0], 0);
        AbstractC4340e.billing(bArr3[1], bArr5, 16, bArr2[1], 0);
        AbstractC4340e.billing(bArr3[2], bArr5, 32, bArr2[2], 0);
        AbstractC4340e.billing(bArr3[3], bArr5, 48, bArr2[3], 0);
        System.arraycopy(bArr2[0], 8, bArr, i, 8);
        System.arraycopy(bArr2[1], 8, bArr, i + 8, 8);
        System.arraycopy(bArr2[2], 0, bArr, i + 16, 8);
        System.arraycopy(bArr2[3], 0, bArr, i + 24, 8);
        reset();
        return 32;
    }

    @Override // defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return "Haraka-512";
    }

    @Override // defpackage.InterfaceC0293e
    public final void reset() {
        this.f6233e = 0;
        AbstractC12442e.metrica(this.f6232e);
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte b) {
        int i = this.f6233e;
        if (i > 63) {
            throw new IllegalArgumentException("total input cannot be more than 64 bytes");
        }
        this.f6233e = i + 1;
        this.f6232e[i] = b;
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte[] bArr, int i, int i2) {
        int i3 = this.f6233e;
        if (i3 > 64 - i2) {
            throw new IllegalArgumentException("total input cannot be more than 64 bytes");
        }
        System.arraycopy(bArr, i, this.f6232e, i3, i2);
        this.f6233e += i2;
    }
}
