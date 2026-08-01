package defpackage;

import java.util.Arrays;

/* renamed from: eًِٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8011e extends AbstractC16431e implements InterfaceC2965e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC2227e f16252e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public byte[] f16253e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public byte[] f16254e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f16255e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f16256e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f16257e;

    public C8011e(InterfaceC2227e interfaceC2227e) {
        this.f16252e = interfaceC2227e;
        int isPro = interfaceC2227e.isPro();
        this.f16255e = isPro;
        this.f16256e = new byte[isPro];
        this.f16254e = new byte[isPro];
        this.f16253e = new byte[isPro];
    }

    @Override // defpackage.InterfaceC2227e
    public final String getAlgorithmName() {
        return this.f16252e.getAlgorithmName() + "/CBC";
    }

    @Override // defpackage.InterfaceC2227e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        boolean z2 = this.f16257e;
        this.f16257e = z;
        boolean z3 = interfaceC3894e instanceof C11494e;
        byte[] bArr = this.f16256e;
        if (z3) {
            C11494e c11494e = (C11494e) interfaceC3894e;
            byte[] bArr2 = c11494e.f23095e;
            if (bArr2.length != this.f16255e) {
                throw new IllegalArgumentException("initialisation vector must be the same length as block size");
            }
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            interfaceC3894e = c11494e.f23094e;
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        reset();
        if (interfaceC3894e != null) {
            this.f16252e.init(z, interfaceC3894e);
        } else if (z2 != z) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
    }

    @Override // defpackage.InterfaceC2227e
    public final int isPro() {
        return this.f16252e.isPro();
    }

    @Override // defpackage.InterfaceC2227e
    public final void reset() {
        byte[] bArr = this.f16254e;
        byte[] bArr2 = this.f16256e;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        Arrays.fill(this.f16253e, (byte) 0);
        this.f16252e.reset();
    }

    @Override // defpackage.InterfaceC2227e
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        boolean z = this.f16257e;
        InterfaceC2227e interfaceC2227e = this.f16252e;
        int i3 = this.f16255e;
        if (z) {
            if (i + i3 > bArr.length) {
                throw new RuntimeException("input buffer too short");
            }
            for (int i4 = 0; i4 < i3; i4++) {
                byte[] bArr3 = this.f16254e;
                bArr3[i4] = (byte) (bArr3[i4] ^ bArr[i + i4]);
            }
            int tapsense = interfaceC2227e.tapsense(0, i2, this.f16254e, bArr2);
            byte[] bArr4 = this.f16254e;
            System.arraycopy(bArr2, i2, bArr4, 0, bArr4.length);
            return tapsense;
        }
        if (i + i3 > bArr.length) {
            throw new RuntimeException("input buffer too short");
        }
        System.arraycopy(bArr, i, this.f16253e, 0, i3);
        int tapsense2 = interfaceC2227e.tapsense(i, i2, bArr, bArr2);
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i2 + i5;
            bArr2[i6] = (byte) (bArr2[i6] ^ this.f16254e[i5]);
        }
        byte[] bArr5 = this.f16254e;
        this.f16254e = this.f16253e;
        this.f16253e = bArr5;
        return tapsense2;
    }
}
