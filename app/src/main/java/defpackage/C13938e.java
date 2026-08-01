package defpackage;

import java.lang.reflect.Array;

/* renamed from: eّٓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13938e extends AbstractC16313e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final EnumC0300e f27649e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f27650e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f27651e;

    public C13938e() {
        this.f27649e = EnumC0300e.f2305e;
        this.f27650e = new byte[32];
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
    }

    public C13938e(C13938e c13938e) {
        this.f27649e = c13938e.f27649e;
        this.f27650e = AbstractC12442e.license(c13938e.f27650e);
        this.f27651e = c13938e.f27651e;
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
    }

    public static void appmetrica(byte[][] bArr, byte[][] bArr2) {
        System.arraycopy(bArr[0], 0, bArr2[0], 0, 4);
        System.arraycopy(bArr[1], 0, bArr2[0], 4, 4);
        System.arraycopy(bArr[0], 4, bArr2[0], 8, 4);
        System.arraycopy(bArr[1], 4, bArr2[0], 12, 4);
        System.arraycopy(bArr[0], 8, bArr2[1], 0, 4);
        System.arraycopy(bArr[1], 8, bArr2[1], 4, 4);
        System.arraycopy(bArr[0], 12, bArr2[1], 8, 4);
        System.arraycopy(bArr[1], 12, bArr2[1], 12, 4);
    }

    @Override // defpackage.InterfaceC0293e
    public final int doFinal(byte[] bArr, int i) {
        if (this.f27651e != 32) {
            throw new IllegalStateException("input must be exactly 32 bytes");
        }
        if (bArr.length - i < 32) {
            throw new IllegalArgumentException("output too short to receive digest");
        }
        Class cls = Byte.TYPE;
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) cls, 2, 16);
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, 2, 16);
        byte[] bArr4 = bArr2[0];
        byte[] bArr5 = this.f27650e;
        System.arraycopy(bArr5, 0, bArr4, 0, 16);
        System.arraycopy(bArr5, 16, bArr2[1], 0, 16);
        byte[] bArr6 = bArr2[0];
        byte[][] bArr7 = AbstractC16313e.f32061e;
        bArr2[0] = AbstractC16313e.ad(bArr6, bArr7[0]);
        bArr2[1] = AbstractC16313e.ad(bArr2[1], bArr7[1]);
        bArr2[0] = AbstractC16313e.ad(bArr2[0], bArr7[2]);
        bArr2[1] = AbstractC16313e.ad(bArr2[1], bArr7[3]);
        appmetrica(bArr2, bArr3);
        bArr2[0] = AbstractC16313e.ad(bArr3[0], bArr7[4]);
        bArr2[1] = AbstractC16313e.ad(bArr3[1], bArr7[5]);
        bArr2[0] = AbstractC16313e.ad(bArr2[0], bArr7[6]);
        bArr2[1] = AbstractC16313e.ad(bArr2[1], bArr7[7]);
        appmetrica(bArr2, bArr3);
        bArr2[0] = AbstractC16313e.ad(bArr3[0], bArr7[8]);
        bArr2[1] = AbstractC16313e.ad(bArr3[1], bArr7[9]);
        bArr2[0] = AbstractC16313e.ad(bArr2[0], bArr7[10]);
        bArr2[1] = AbstractC16313e.ad(bArr2[1], bArr7[11]);
        appmetrica(bArr2, bArr3);
        bArr2[0] = AbstractC16313e.ad(bArr3[0], bArr7[12]);
        bArr2[1] = AbstractC16313e.ad(bArr3[1], bArr7[13]);
        bArr2[0] = AbstractC16313e.ad(bArr2[0], bArr7[14]);
        bArr2[1] = AbstractC16313e.ad(bArr2[1], bArr7[15]);
        appmetrica(bArr2, bArr3);
        bArr2[0] = AbstractC16313e.ad(bArr3[0], bArr7[16]);
        bArr2[1] = AbstractC16313e.ad(bArr3[1], bArr7[17]);
        bArr2[0] = AbstractC16313e.ad(bArr2[0], bArr7[18]);
        bArr2[1] = AbstractC16313e.ad(bArr2[1], bArr7[19]);
        appmetrica(bArr2, bArr3);
        AbstractC4340e.billing(bArr3[0], bArr5, 0, bArr, i);
        AbstractC4340e.billing(bArr3[1], bArr5, 16, bArr, i + 16);
        reset();
        return 32;
    }

    @Override // defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return "Haraka-256";
    }

    @Override // defpackage.InterfaceC0293e
    public final void reset() {
        this.f27651e = 0;
        AbstractC12442e.metrica(this.f27650e);
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte b) {
        int i = this.f27651e;
        if (i > 31) {
            throw new IllegalArgumentException("total input cannot be more than 32 bytes");
        }
        this.f27651e = i + 1;
        this.f27650e[i] = b;
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte[] bArr, int i, int i2) {
        int i3 = this.f27651e;
        if (i3 > 32 - i2) {
            throw new IllegalArgumentException("total input cannot be more than 32 bytes");
        }
        System.arraycopy(bArr, i, this.f27650e, i3, i2);
        this.f27651e += i2;
    }
}
