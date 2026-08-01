package defpackage;

/* renamed from: eًٖۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16431e implements InterfaceC2965e {
    public final int ad(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int isPro = isPro();
        int i4 = i2 * isPro;
        if (bArr == bArr2) {
            bArr = new byte[i4];
            System.arraycopy(bArr2, i, bArr, 0, i4);
            i = 0;
        }
        int i5 = 0;
        for (int i6 = 0; i6 != i2; i6++) {
            i5 += tapsense(i, i3 + i5, bArr, bArr2);
            i += isPro;
        }
        return i5;
    }
}
