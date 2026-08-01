package defpackage;

import java.security.InvalidKeyException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12174e extends AbstractC15825e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f24473e;

    public C12174e(byte[] bArr, int i, int i2) {
        this.f24473e = i2;
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f31256e = AbstractC12608e.appmetrica(bArr);
        this.f31257e = i;
    }

    @Override // defpackage.AbstractC15825e
    public final int[] metrica(int[] iArr, int i) {
        switch (this.f24473e) {
            case 0:
                if (iArr.length != 3) {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr2 = new int[16];
                int[] iArr3 = (int[]) this.f31256e;
                int[] iArr4 = AbstractC12608e.ad;
                System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
                System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
                iArr2[12] = i;
                System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                return iArr2;
            default:
                if (iArr.length != 6) {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr5 = new int[16];
                int[] vip = AbstractC12608e.vip((int[]) this.f31256e, iArr);
                int[] iArr6 = AbstractC12608e.ad;
                System.arraycopy(iArr6, 0, iArr5, 0, iArr6.length);
                System.arraycopy(vip, 0, iArr5, iArr6.length, 8);
                iArr5[12] = i;
                iArr5[13] = 0;
                iArr5[14] = iArr[4];
                iArr5[15] = iArr[5];
                return iArr5;
        }
    }

    @Override // defpackage.AbstractC15825e
    public final int mopub() {
        switch (this.f24473e) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
