package defpackage;

/* renamed from: eؘؐؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5330e extends AbstractC17551e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public byte[] f11421e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f11422e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f11423e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public byte[] f11424e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f11425e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public boolean f11426e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final byte[] f11427e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f11428e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public boolean f11429e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C0462e f11430e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public byte[] f11431e;

    public C5330e(C0462e c0462e, int i) {
        super(c0462e);
        this.f11429e = false;
        if (i < 0 || i > 128) {
            throw new IllegalArgumentException(AbstractC1786e.admob(128, "Parameter bitBlockSize must be in range 0 < bitBlockSize <= "));
        }
        this.f11428e = 16;
        this.f11430e = c0462e;
        int i2 = i / 8;
        this.f11425e = i2;
        this.f11427e = new byte[i2];
    }

    @Override // defpackage.InterfaceC2227e
    public final String getAlgorithmName() {
        StringBuilder sb = new StringBuilder("GOST3412_2015/CFB");
        this.f11430e.getClass();
        sb.append(this.f11428e * 8);
        return sb.toString();
    }

    @Override // defpackage.InterfaceC2227e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        this.f11426e = z;
        boolean z2 = interfaceC3894e instanceof C11494e;
        C0462e c0462e = this.f11430e;
        int i = this.f11428e;
        if (z2) {
            C11494e c11494e = (C11494e) interfaceC3894e;
            byte[] bArr = c11494e.f23095e;
            if (bArr.length < i) {
                throw new IllegalArgumentException("Parameter m must blockSize <= m");
            }
            int length = bArr.length;
            this.f11423e = length;
            this.f11421e = new byte[length];
            this.f11431e = new byte[length];
            byte[] license = AbstractC12442e.license(bArr);
            this.f11431e = license;
            System.arraycopy(license, 0, this.f11421e, 0, license.length);
            InterfaceC3894e interfaceC3894e2 = c11494e.f23094e;
            if (interfaceC3894e2 != null) {
                c0462e.init(true, interfaceC3894e2);
            }
        } else {
            int i2 = i * 2;
            this.f11423e = i2;
            byte[] bArr2 = new byte[i2];
            this.f11421e = bArr2;
            byte[] bArr3 = new byte[i2];
            this.f11431e = bArr3;
            System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
            if (interfaceC3894e != null) {
                c0462e.init(true, interfaceC3894e);
            }
        }
        this.f11429e = true;
    }

    @Override // defpackage.InterfaceC2227e
    public final int isPro() {
        return this.f11425e;
    }

    @Override // defpackage.InterfaceC2227e
    public final void reset() {
        this.f11422e = 0;
        AbstractC12442e.metrica(this.f11427e);
        AbstractC12442e.metrica(this.f11424e);
        if (this.f11429e) {
            byte[] bArr = this.f11431e;
            System.arraycopy(bArr, 0, this.f11421e, 0, bArr.length);
            this.f11430e.getClass();
        }
    }

    @Override // defpackage.InterfaceC2227e
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        processBytes(bArr, i, this.f11425e, bArr2, i2);
        return this.f11425e;
    }

    @Override // defpackage.AbstractC17551e
    public final byte vip(byte b) {
        int i = this.f11422e;
        int i2 = this.f11425e;
        if (i == 0) {
            byte[] Signature = AbstractC12442e.Signature(this.f11428e, this.f11421e);
            byte[] bArr = new byte[Signature.length];
            this.f11430e.tapsense(0, 0, Signature, bArr);
            this.f11424e = AbstractC12442e.Signature(i2, bArr);
        }
        byte[] bArr2 = this.f11424e;
        int i3 = this.f11422e;
        byte b2 = (byte) (bArr2[i3] ^ b);
        int i4 = i3 + 1;
        this.f11422e = i4;
        if (this.f11426e) {
            b = b2;
        }
        byte[] bArr3 = this.f11427e;
        bArr3[i3] = b;
        if (i4 == i2) {
            this.f11422e = 0;
            byte[] bArr4 = this.f11421e;
            int i5 = this.f11423e - i2;
            byte[] bArr5 = new byte[i5];
            System.arraycopy(bArr4, bArr4.length - i5, bArr5, 0, i5);
            System.arraycopy(bArr5, 0, this.f11421e, 0, i5);
            System.arraycopy(bArr3, 0, this.f11421e, i5, this.f11423e - i5);
        }
        return b2;
    }
}
