package defpackage;

import org.conscrypt.PSKKeyManager;

/* renamed from: eؚٜؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0169e implements InterfaceC14556e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public byte[] f1404e = null;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f1402e = 0;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f1401e = 0;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public byte[] f1403e = null;

    public C0169e() {
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }

    public final void ad(byte[] bArr) {
        this.f1403e = bArr;
        this.f1402e = 0;
        this.f1401e = 0;
        if (this.f1404e == null) {
            this.f1404e = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        }
        for (int i = 0; i < 256; i++) {
            this.f1404e[i] = (byte) i;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            int i5 = bArr[i2] & 255;
            byte[] bArr2 = this.f1404e;
            byte b = bArr2[i4];
            i3 = (i5 + b + i3) & 255;
            bArr2[i4] = bArr2[i3];
            bArr2[i3] = b;
            i2 = (i2 + 1) % bArr.length;
        }
    }

    @Override // defpackage.InterfaceC14556e
    public final String getAlgorithmName() {
        return "RC4";
    }

    @Override // defpackage.InterfaceC14556e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        if (!(interfaceC3894e instanceof C14915e)) {
            throw new IllegalArgumentException(AbstractC8703e.remoteconfig("invalid parameter passed to RC4 init - ", interfaceC3894e));
        }
        byte[] bArr = ((C14915e) interfaceC3894e).f29591e;
        this.f1403e = bArr;
        ad(bArr);
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
            int i5 = (this.f1402e + 1) & 255;
            this.f1402e = i5;
            byte[] bArr3 = this.f1404e;
            byte b = bArr3[i5];
            int i6 = (this.f1401e + b) & 255;
            this.f1401e = i6;
            bArr3[i5] = bArr3[i6];
            bArr3[i6] = b;
            bArr2[i4 + i3] = (byte) (bArr3[(bArr3[i5] + b) & 255] ^ bArr[i4 + i]);
        }
        return i2;
    }

    @Override // defpackage.InterfaceC14556e
    public final void reset() {
        ad(this.f1403e);
    }
}
