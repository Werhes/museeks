package defpackage;

/* renamed from: eْؖۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13059e implements InterfaceC3894e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f25987e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f25988e;

    public C13059e(int i, byte[] bArr) {
        if (bArr.length > 255) {
            throw new IllegalArgumentException("RC5 key length can be no greater than 255");
        }
        byte[] bArr2 = new byte[bArr.length];
        this.f25988e = bArr2;
        this.f25987e = i;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }
}
