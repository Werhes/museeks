package defpackage;

/* renamed from: eَٓ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13899e extends AbstractC9276e {
    public final C10398e ad;
    public final byte[] vip;

    public C13899e(InterfaceC0293e interfaceC0293e) {
        C10398e c10398e = new C10398e(interfaceC0293e);
        this.ad = c10398e;
        this.vip = new byte[c10398e.f20548e];
    }

    public final byte[] ad(int i) {
        C10398e c10398e = this.ad;
        int i2 = c10398e.f20548e;
        byte b = 1;
        int i3 = ((i + i2) - 1) / i2;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[i3 * i2];
        c10398e.init(new C14915e(this.password));
        int i4 = 1;
        int i5 = 0;
        while (i4 <= i3) {
            int i6 = 3;
            while (true) {
                byte b2 = (byte) (bArr[i6] + b);
                bArr[i6] = b2;
                if (b2 != 0) {
                    break;
                }
                i6--;
            }
            byte[] bArr3 = this.salt;
            int i7 = this.iterationCount;
            if (i7 == 0) {
                throw new IllegalArgumentException("iteration count must be at least 1.");
            }
            if (bArr3 != null) {
                c10398e.update(bArr3, 0, bArr3.length);
            }
            c10398e.update(bArr, 0, 4);
            byte[] bArr4 = this.vip;
            c10398e.doFinal(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr2, i5, bArr4.length);
            for (int i8 = b; i8 < i7; i8++) {
                c10398e.update(bArr4, 0, bArr4.length);
                c10398e.doFinal(bArr4, 0);
                for (int i9 = 0; i9 != bArr4.length; i9++) {
                    int i10 = i5 + i9;
                    bArr2[i10] = (byte) (bArr2[i10] ^ bArr4[i9]);
                }
            }
            i5 += i2;
            i4++;
            b = 1;
        }
        return bArr2;
    }

    @Override // defpackage.AbstractC9276e
    public final InterfaceC3894e generateDerivedMacParameters(int i) {
        return generateDerivedParameters(i);
    }

    @Override // defpackage.AbstractC9276e
    public final InterfaceC3894e generateDerivedParameters(int i) {
        int i2 = i / 8;
        return new C14915e(ad(i2), 0, i2);
    }

    @Override // defpackage.AbstractC9276e
    public final InterfaceC3894e generateDerivedParameters(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] ad = ad(i3 + i4);
        return new C11494e(new C14915e(ad, 0, i3), ad, i3, i4);
    }
}
