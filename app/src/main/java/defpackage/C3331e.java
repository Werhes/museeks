package defpackage;

import java.util.Arrays;

/* renamed from: eّؕۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3331e extends AbstractC17551e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public byte[] f7508e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC2227e f7509e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f7510e = 1;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f7511e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f7512e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final byte[] f7513e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final byte[] f7514e;

    public C3331e(InterfaceC2227e interfaceC2227e) {
        super(interfaceC2227e);
        this.f7509e = interfaceC2227e;
        int isPro = interfaceC2227e.isPro();
        this.f7512e = isPro;
        this.f7508e = new byte[isPro];
        this.f7514e = new byte[isPro];
        this.f7513e = new byte[isPro];
        this.f7511e = 0;
    }

    public C3331e(InterfaceC2227e interfaceC2227e, int i) {
        super(interfaceC2227e);
        if (i > interfaceC2227e.isPro() * 8 || i < 8 || i % 8 != 0) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("0FB", i, " not supported"));
        }
        this.f7509e = interfaceC2227e;
        this.f7511e = i / 8;
        this.f7508e = new byte[interfaceC2227e.isPro()];
        this.f7514e = new byte[interfaceC2227e.isPro()];
        this.f7513e = new byte[interfaceC2227e.isPro()];
    }

    @Override // defpackage.InterfaceC2227e
    public final String getAlgorithmName() {
        switch (this.f7510e) {
            case 0:
                return this.f7509e.getAlgorithmName() + "/OFB" + (this.f7511e * 8);
            default:
                return this.f7509e.getAlgorithmName() + "/SIC";
        }
    }

    @Override // defpackage.InterfaceC2227e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        switch (this.f7510e) {
            case 0:
                byte[] bArr = this.f7508e;
                boolean z2 = interfaceC3894e instanceof C11494e;
                InterfaceC2227e interfaceC2227e = this.f7509e;
                if (!z2) {
                    reset();
                    if (interfaceC3894e != null) {
                        interfaceC2227e.init(true, interfaceC3894e);
                        return;
                    }
                    return;
                }
                C11494e c11494e = (C11494e) interfaceC3894e;
                byte[] bArr2 = c11494e.f23095e;
                if (bArr2.length < bArr.length) {
                    System.arraycopy(bArr2, 0, bArr, bArr.length - bArr2.length, bArr2.length);
                    for (int i = 0; i < bArr.length - bArr2.length; i++) {
                        bArr[i] = 0;
                    }
                } else {
                    System.arraycopy(bArr2, 0, bArr, 0, bArr.length);
                }
                reset();
                InterfaceC3894e interfaceC3894e2 = c11494e.f23094e;
                if (interfaceC3894e2 != null) {
                    interfaceC2227e.init(true, interfaceC3894e2);
                    return;
                }
                return;
            default:
                int i2 = this.f7512e;
                if (!(interfaceC3894e instanceof C11494e)) {
                    throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
                }
                C11494e c11494e2 = (C11494e) interfaceC3894e;
                byte[] license = AbstractC12442e.license(c11494e2.f23095e);
                this.f7508e = license;
                if (i2 < license.length) {
                    throw new IllegalArgumentException(AbstractC1634e.smaato("CTR/SIC mode requires IV no greater than: ", i2, " bytes."));
                }
                int i3 = 8 > i2 / 2 ? i2 / 2 : 8;
                if (i2 - license.length > i3) {
                    throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (i2 - i3) + " bytes.");
                }
                InterfaceC3894e interfaceC3894e3 = c11494e2.f23094e;
                if (interfaceC3894e3 != null) {
                    this.f7509e.init(true, interfaceC3894e3);
                }
                reset();
                return;
        }
    }

    @Override // defpackage.InterfaceC2227e
    public final int isPro() {
        switch (this.f7510e) {
            case 0:
                return this.f7511e;
            default:
                return this.f7509e.isPro();
        }
    }

    public void license() {
        byte b;
        byte[] bArr = this.f7514e;
        int length = bArr.length;
        do {
            length--;
            if (length < 0) {
                return;
            }
            b = (byte) (bArr[length] + 1);
            bArr[length] = b;
        } while (b == 0);
    }

    public void metrica() {
        byte[] bArr = this.f7508e;
        if (bArr.length < this.f7512e) {
            if (this.f7514e[bArr.length - 1] != bArr[bArr.length - 1]) {
                throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
            }
        }
    }

    @Override // defpackage.AbstractC17551e, defpackage.InterfaceC14556e
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte b;
        switch (this.f7510e) {
            case 1:
                if (i + i2 > bArr.length) {
                    throw new RuntimeException("input buffer too small");
                }
                if (i3 + i2 > bArr2.length) {
                    throw new RuntimeException("output buffer too short");
                }
                for (int i4 = 0; i4 < i2; i4++) {
                    int i5 = this.f7511e;
                    byte[] bArr3 = this.f7514e;
                    byte[] bArr4 = this.f7513e;
                    if (i5 == 0) {
                        metrica();
                        this.f7509e.tapsense(0, 0, bArr3, bArr4);
                        byte b2 = bArr[i + i4];
                        int i6 = this.f7511e;
                        this.f7511e = i6 + 1;
                        b = (byte) (b2 ^ bArr4[i6]);
                    } else {
                        byte b3 = bArr[i + i4];
                        int i7 = i5 + 1;
                        this.f7511e = i7;
                        b = (byte) (bArr4[i5] ^ b3);
                        if (i7 == bArr3.length) {
                            this.f7511e = 0;
                            license();
                        }
                    }
                    bArr2[i3 + i4] = b;
                }
                return i2;
            default:
                super.processBytes(bArr, i, i2, bArr2, i3);
                return i2;
        }
    }

    @Override // defpackage.InterfaceC2227e
    public final void reset() {
        switch (this.f7510e) {
            case 0:
                byte[] bArr = this.f7508e;
                System.arraycopy(bArr, 0, this.f7514e, 0, bArr.length);
                this.f7512e = 0;
                this.f7509e.reset();
                return;
            default:
                byte[] bArr2 = this.f7514e;
                Arrays.fill(bArr2, (byte) 0);
                byte[] bArr3 = this.f7508e;
                System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
                this.f7509e.reset();
                this.f7511e = 0;
                return;
        }
    }

    @Override // defpackage.InterfaceC2227e
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        switch (this.f7510e) {
            case 0:
                processBytes(bArr, i, this.f7511e, bArr2, i2);
                return this.f7511e;
            default:
                int i3 = this.f7512e;
                if (this.f7511e != 0) {
                    processBytes(bArr, i, this.f7512e, bArr2, i2);
                } else {
                    if (i + i3 > bArr.length) {
                        throw new RuntimeException("input buffer too small");
                    }
                    if (i2 + i3 > bArr2.length) {
                        throw new RuntimeException("output buffer too short");
                    }
                    InterfaceC2227e interfaceC2227e = this.f7509e;
                    byte[] bArr3 = this.f7514e;
                    byte[] bArr4 = this.f7513e;
                    interfaceC2227e.tapsense(0, 0, bArr3, bArr4);
                    for (int i4 = 0; i4 < i3; i4++) {
                        bArr2[i2 + i4] = (byte) (bArr[i + i4] ^ bArr4[i4]);
                    }
                    license();
                }
                return i3;
        }
    }

    @Override // defpackage.AbstractC17551e
    public final byte vip(byte b) {
        switch (this.f7510e) {
            case 0:
                int i = this.f7511e;
                int i2 = this.f7512e;
                byte[] bArr = this.f7513e;
                byte[] bArr2 = this.f7514e;
                if (i2 == 0) {
                    this.f7509e.tapsense(0, 0, bArr2, bArr);
                }
                int i3 = this.f7512e;
                int i4 = i3 + 1;
                this.f7512e = i4;
                byte b2 = (byte) (b ^ bArr[i3]);
                if (i4 == i) {
                    this.f7512e = 0;
                    System.arraycopy(bArr2, i, bArr2, 0, bArr2.length - i);
                    System.arraycopy(bArr, 0, bArr2, bArr2.length - i, i);
                }
                return b2;
            default:
                int i5 = this.f7511e;
                byte[] bArr3 = this.f7514e;
                byte[] bArr4 = this.f7513e;
                if (i5 == 0) {
                    metrica();
                    this.f7509e.tapsense(0, 0, bArr3, bArr4);
                    int i6 = this.f7511e;
                    this.f7511e = i6 + 1;
                    return (byte) (b ^ bArr4[i6]);
                }
                int i7 = i5 + 1;
                this.f7511e = i7;
                byte b3 = (byte) (b ^ bArr4[i5]);
                if (i7 != bArr3.length) {
                    return b3;
                }
                this.f7511e = 0;
                license();
                return b3;
        }
    }
}
