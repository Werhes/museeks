package defpackage;

/* renamed from: eِٟؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11494e implements InterfaceC3894e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC3894e f23094e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f23095e;

    public C11494e(InterfaceC3894e interfaceC3894e, byte[] bArr) {
        this(interfaceC3894e, bArr, 0, bArr.length);
    }

    public C11494e(InterfaceC3894e interfaceC3894e, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f23095e = bArr2;
        this.f23094e = interfaceC3894e;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
