package defpackage;

/* renamed from: eٍٚ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9562e extends C13806e {
    @Override // defpackage.C13806e
    public final void ad() {
        int[] iArr = this.f27367e;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i == 0) {
            throw new IllegalStateException("attempt to increase counter past 2^32.");
        }
    }

    @Override // defpackage.C13806e
    public final void appmetrica() {
        this.f27367e[12] = 0;
    }

    @Override // defpackage.C13806e
    public final void billing(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.f27367e;
        if (bArr != null) {
            if (bArr.length != 32) {
                throw new IllegalArgumentException("ChaCha7539 requires 256 bit key");
            }
            C13806e.license(iArr, bArr.length);
            AbstractC3628e.amazon(bArr, 0, iArr, 4, 8);
        }
        AbstractC3628e.amazon(bArr2, 0, iArr, 13, 3);
    }

    @Override // defpackage.C13806e, defpackage.InterfaceC14556e
    public final String getAlgorithmName() {
        return "ChaCha7539";
    }

    @Override // defpackage.C13806e
    public final int metrica() {
        return 12;
    }

    @Override // defpackage.C13806e
    public final void vip(byte[] bArr) {
        int[] iArr = this.f27367e;
        int[] iArr2 = this.f27366e;
        C11509e.yandex(iArr, iArr2);
        AbstractC3628e.startapp(bArr, iArr2);
    }
}
