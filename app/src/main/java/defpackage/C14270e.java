package defpackage;

/* renamed from: eٓ۟۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14270e extends C13806e {
    @Override // defpackage.C13806e
    public final void billing(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new IllegalArgumentException("XSalsa20 doesn't support re-init with null key");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("XSalsa20 requires a 256 bit key");
        }
        super.billing(bArr, bArr2);
        int[] iArr = this.f27367e;
        AbstractC3628e.amazon(bArr2, 8, iArr, 8, 2);
        int[] iArr2 = new int[iArr.length];
        C13806e.purchase(20, iArr, iArr2);
        iArr[1] = iArr2[0] - iArr[0];
        iArr[2] = iArr2[5] - iArr[5];
        iArr[3] = iArr2[10] - iArr[10];
        iArr[4] = iArr2[15] - iArr[15];
        iArr[11] = iArr2[6] - iArr[6];
        iArr[12] = iArr2[7] - iArr[7];
        iArr[13] = iArr2[8] - iArr[8];
        iArr[14] = iArr2[9] - iArr[9];
        AbstractC3628e.amazon(bArr2, 16, iArr, 6, 2);
    }

    @Override // defpackage.C13806e, defpackage.InterfaceC14556e
    public final String getAlgorithmName() {
        return "XSalsa20";
    }

    @Override // defpackage.C13806e
    public final int metrica() {
        return 24;
    }
}
