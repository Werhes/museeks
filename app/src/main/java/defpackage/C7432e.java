package defpackage;

/* renamed from: eؚۚؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7432e extends AbstractC0821e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f15202e;

    public C7432e(C16331e c16331e, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super((Object) c16331e, true);
        byte[] bArr6 = new byte[bArr.length + bArr2.length + bArr3.length + bArr4.length + bArr5.length];
        this.f15202e = bArr6;
        System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
        int length = bArr.length;
        System.arraycopy(bArr2, 0, bArr6, length, bArr2.length);
        int length2 = length + bArr2.length;
        System.arraycopy(bArr3, 0, bArr6, length2, bArr3.length);
        int length3 = length2 + bArr3.length;
        System.arraycopy(bArr4, 0, bArr6, length3, bArr4.length);
        System.arraycopy(bArr5, 0, bArr6, length3 + bArr4.length, bArr5.length);
    }
}
