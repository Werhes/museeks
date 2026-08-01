package defpackage;

import org.conscrypt.PSKKeyManager;

/* renamed from: eٌ۟٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9009e implements InterfaceC14556e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public byte[] f18071e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public byte[] f18074e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public byte f18075e = 0;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public byte[] f18073e = null;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public byte f18072e = 0;

    public void ad(byte[] bArr, byte[] bArr2) {
        this.f18072e = (byte) 0;
        this.f18073e = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i = 0; i < 256; i++) {
            this.f18073e[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            byte[] bArr3 = this.f18073e;
            byte b = this.f18072e;
            int i3 = i2 & 255;
            byte b2 = bArr3[i3];
            byte b3 = bArr3[(b + b2 + bArr[i2 % bArr.length]) & 255];
            this.f18072e = b3;
            bArr3[i3] = bArr3[b3 & 255];
            bArr3[b3 & 255] = b2;
        }
        for (int i4 = 0; i4 < 768; i4++) {
            byte[] bArr4 = this.f18073e;
            byte b4 = this.f18072e;
            int i5 = i4 & 255;
            byte b5 = bArr4[i5];
            byte b6 = bArr4[(b4 + b5 + bArr2[i4 % bArr2.length]) & 255];
            this.f18072e = b6;
            bArr4[i5] = bArr4[b6 & 255];
            bArr4[b6 & 255] = b5;
        }
        this.f18075e = (byte) 0;
    }

    @Override // defpackage.InterfaceC14556e
    public String getAlgorithmName() {
        return "VMPC";
    }

    @Override // defpackage.InterfaceC14556e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        if (!(interfaceC3894e instanceof C11494e)) {
            throw new IllegalArgumentException("VMPC init parameters must include an IV");
        }
        C11494e c11494e = (C11494e) interfaceC3894e;
        InterfaceC3894e interfaceC3894e2 = c11494e.f23094e;
        if (!(interfaceC3894e2 instanceof C14915e)) {
            throw new IllegalArgumentException("VMPC init parameters must include a key");
        }
        C14915e c14915e = (C14915e) interfaceC3894e2;
        byte[] bArr = c11494e.f23095e;
        this.f18074e = bArr;
        if (bArr == null || bArr.length < 1 || bArr.length > 768) {
            throw new IllegalArgumentException("VMPC requires 1 to 768 bytes of IV");
        }
        byte[] bArr2 = c14915e.f29591e;
        this.f18071e = bArr2;
        ad(bArr2, bArr);
        int length = this.f18071e.length;
        if (interfaceC3894e instanceof EnumC0300e) {
            throw new IllegalArgumentException("params should not be CryptoServicePurpose");
        }
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }

    @Override // defpackage.InterfaceC14556e
    public final int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 > bArr.length) {
            throw new RuntimeException("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new RuntimeException("output buffer too short");
        }
        for (int i4 = 0; i4 < i2; i4++) {
            byte[] bArr3 = this.f18073e;
            byte b = this.f18072e;
            byte b2 = this.f18075e;
            int i5 = b2 & 255;
            byte b3 = bArr3[i5];
            byte b4 = bArr3[(b + b3) & 255];
            this.f18072e = b4;
            int i6 = b4 & 255;
            byte b5 = bArr3[i6];
            byte b6 = bArr3[(bArr3[b5 & 255] + 1) & 255];
            bArr3[i5] = b5;
            bArr3[i6] = b3;
            this.f18075e = (byte) ((b2 + 1) & 255);
            bArr2[i4 + i3] = (byte) (bArr[i4 + i] ^ b6);
        }
        return i2;
    }

    @Override // defpackage.InterfaceC14556e
    public final void reset() {
        ad(this.f18071e, this.f18074e);
    }
}
