package defpackage;

import org.conscrypt.PSKKeyManager;

/* renamed from: eؙؔ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2422e implements InterfaceC11306e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public byte[] f6210e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public byte[] f6211e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public byte f6212e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public byte f6213e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public byte f6214e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public byte f6215e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public byte f6216e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public byte f6217e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public byte f6218e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public byte[] f6219e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public byte[] f6220e;

    @Override // defpackage.InterfaceC11306e
    public final int doFinal(byte[] bArr, int i) {
        for (int i2 = 1; i2 < 25; i2++) {
            byte[] bArr2 = this.f6211e;
            byte b = this.f6216e;
            byte b2 = this.f6213e;
            int i3 = b2 & 255;
            byte b3 = bArr2[(b + bArr2[i3]) & 255];
            this.f6216e = b3;
            byte b4 = this.f6215e;
            byte b5 = this.f6212e;
            byte b6 = bArr2[(b4 + b5 + i2) & 255];
            this.f6215e = b6;
            byte b7 = this.f6217e;
            byte b8 = bArr2[(b5 + b7 + i2) & 255];
            this.f6212e = b8;
            byte b9 = this.f6214e;
            byte b10 = bArr2[(b7 + b9 + i2) & 255];
            this.f6217e = b10;
            byte b11 = bArr2[(b9 + b3 + i2) & 255];
            this.f6214e = b11;
            byte[] bArr3 = this.f6210e;
            byte b12 = this.f6218e;
            int i4 = b12 & 31;
            bArr3[i4] = (byte) (b11 ^ bArr3[i4]);
            int i5 = (b12 + 1) & 31;
            bArr3[i5] = (byte) (b10 ^ bArr3[i5]);
            int i6 = (b12 + 2) & 31;
            bArr3[i6] = (byte) (b8 ^ bArr3[i6]);
            int i7 = (b12 + 3) & 31;
            bArr3[i7] = (byte) (b6 ^ bArr3[i7]);
            this.f6218e = (byte) ((b12 + 4) & 31);
            byte b13 = bArr2[i3];
            int i8 = b3 & 255;
            bArr2[i3] = bArr2[i8];
            bArr2[i8] = b13;
            this.f6213e = (byte) ((b2 + 1) & 255);
        }
        for (int i9 = 0; i9 < 768; i9++) {
            byte[] bArr4 = this.f6211e;
            byte b14 = this.f6216e;
            int i10 = i9 & 255;
            byte b15 = bArr4[i10];
            byte b16 = bArr4[(b14 + b15 + this.f6210e[i9 & 31]) & 255];
            this.f6216e = b16;
            int i11 = b16 & 255;
            bArr4[i10] = bArr4[i11];
            bArr4[i11] = b15;
        }
        byte[] bArr5 = new byte[20];
        for (int i12 = 0; i12 < 20; i12++) {
            byte[] bArr6 = this.f6211e;
            int i13 = i12 & 255;
            byte b17 = bArr6[(this.f6216e + bArr6[i13]) & 255];
            this.f6216e = b17;
            int i14 = b17 & 255;
            bArr5[i12] = bArr6[(bArr6[bArr6[i14] & 255] + 1) & 255];
            byte b18 = bArr6[i13];
            bArr6[i13] = bArr6[i14];
            bArr6[i14] = b18;
        }
        System.arraycopy(bArr5, 0, bArr, 0, 20);
        reset();
        return 20;
    }

    @Override // defpackage.InterfaceC11306e
    public final String getAlgorithmName() {
        return "VMPC-MAC";
    }

    @Override // defpackage.InterfaceC11306e
    public final int getMacSize() {
        return 20;
    }

    @Override // defpackage.InterfaceC11306e
    public final void init(InterfaceC3894e interfaceC3894e) {
        if (!(interfaceC3894e instanceof C11494e)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
        }
        C11494e c11494e = (C11494e) interfaceC3894e;
        InterfaceC3894e interfaceC3894e2 = c11494e.f23094e;
        C14915e c14915e = (C14915e) interfaceC3894e2;
        if (!(interfaceC3894e2 instanceof C14915e)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include a key");
        }
        byte[] bArr = c11494e.f23095e;
        this.f6220e = bArr;
        if (bArr == null || bArr.length < 1 || bArr.length > 768) {
            throw new IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
        }
        this.f6219e = c14915e.f29591e;
        reset();
    }

    @Override // defpackage.InterfaceC11306e
    public final void reset() {
        byte[] bArr = this.f6219e;
        byte[] bArr2 = this.f6220e;
        this.f6216e = (byte) 0;
        this.f6211e = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i = 0; i < 256; i++) {
            this.f6211e[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            byte[] bArr3 = this.f6211e;
            byte b = this.f6216e;
            int i3 = i2 & 255;
            byte b2 = bArr3[i3];
            byte b3 = bArr3[(b + b2 + bArr[i2 % bArr.length]) & 255];
            this.f6216e = b3;
            int i4 = b3 & 255;
            bArr3[i3] = bArr3[i4];
            bArr3[i4] = b2;
        }
        for (int i5 = 0; i5 < 768; i5++) {
            byte[] bArr4 = this.f6211e;
            byte b4 = this.f6216e;
            int i6 = i5 & 255;
            byte b5 = bArr4[i6];
            byte b6 = bArr4[(b4 + b5 + bArr2[i5 % bArr2.length]) & 255];
            this.f6216e = b6;
            int i7 = b6 & 255;
            bArr4[i6] = bArr4[i7];
            bArr4[i7] = b5;
        }
        this.f6213e = (byte) 0;
        this.f6215e = (byte) 0;
        this.f6212e = (byte) 0;
        this.f6217e = (byte) 0;
        this.f6214e = (byte) 0;
        this.f6218e = (byte) 0;
        this.f6210e = new byte[32];
        for (int i8 = 0; i8 < 32; i8++) {
            this.f6210e[i8] = 0;
        }
    }

    @Override // defpackage.InterfaceC11306e
    public final void update(byte b) {
        byte[] bArr = this.f6211e;
        byte b2 = this.f6216e;
        byte b3 = this.f6213e;
        byte b4 = bArr[(b2 + bArr[b3 & 255]) & 255];
        this.f6216e = b4;
        byte b5 = (byte) (b ^ bArr[(bArr[bArr[b4 & 255] & 255] + 1) & 255]);
        byte b6 = this.f6215e;
        byte b7 = this.f6212e;
        byte b8 = bArr[(b6 + b7) & 255];
        this.f6215e = b8;
        byte b9 = this.f6217e;
        byte b10 = bArr[(b7 + b9) & 255];
        this.f6212e = b10;
        byte b11 = this.f6214e;
        byte b12 = bArr[(b9 + b11) & 255];
        this.f6217e = b12;
        byte b13 = bArr[(b11 + b4 + b5) & 255];
        this.f6214e = b13;
        byte[] bArr2 = this.f6210e;
        byte b14 = this.f6218e;
        bArr2[b14 & 31] = (byte) (b13 ^ bArr2[b14 & 31]);
        bArr2[(b14 + 1) & 31] = (byte) (b12 ^ bArr2[(b14 + 1) & 31]);
        bArr2[(b14 + 2) & 31] = (byte) (b10 ^ bArr2[(b14 + 2) & 31]);
        bArr2[(b14 + 3) & 31] = (byte) (b8 ^ bArr2[(b14 + 3) & 31]);
        this.f6218e = (byte) ((b14 + 4) & 31);
        byte b15 = bArr[b3 & 255];
        bArr[b3 & 255] = bArr[b4 & 255];
        bArr[b4 & 255] = b15;
        this.f6213e = (byte) ((b3 + 1) & 255);
    }

    @Override // defpackage.InterfaceC11306e
    public final void update(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            throw new RuntimeException("input buffer too short");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            update(bArr[i + i3]);
        }
    }
}
