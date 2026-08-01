package defpackage;

/* renamed from: eَُٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16916e extends AbstractC9276e {
    public final /* synthetic */ int ad = 0;
    public final Object vip;

    public C16916e() {
        int i = AbstractC9148e.ad;
        this.vip = new C17968e();
    }

    public C16916e(InterfaceC0293e interfaceC0293e) {
        this.vip = interfaceC0293e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eَؑٓ, java.lang.Object] */
    public byte[] ad() {
        ?? r0 = this.vip;
        int digestSize = r0.getDigestSize();
        byte[] bArr = new byte[digestSize];
        byte[] bArr2 = this.password;
        r0.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = this.salt;
        r0.update(bArr3, 0, bArr3.length);
        r0.doFinal(bArr, 0);
        for (int i = 1; i < this.iterationCount; i++) {
            r0.update(bArr, 0, digestSize);
            r0.doFinal(bArr, 0);
        }
        return bArr;
    }

    @Override // defpackage.AbstractC9276e
    public final InterfaceC3894e generateDerivedMacParameters(int i) {
        switch (this.ad) {
            case 0:
                return generateDerivedParameters(i);
            default:
                return generateDerivedParameters(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eَؑٓ, java.lang.Object] */
    @Override // defpackage.AbstractC9276e
    public final InterfaceC3894e generateDerivedParameters(int i) {
        switch (this.ad) {
            case 0:
                int i2 = i / 8;
                return new C14915e(vip(i2), 0, i2);
            default:
                int i3 = i / 8;
                if (i3 <= this.vip.getDigestSize()) {
                    return new C14915e(ad(), 0, i3);
                }
                throw new IllegalArgumentException(AbstractC1634e.smaato("Can't generate a derived key ", i3, " bytes long."));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eَؑٓ, java.lang.Object] */
    @Override // defpackage.AbstractC9276e
    public final InterfaceC3894e generateDerivedParameters(int i, int i2) {
        switch (this.ad) {
            case 0:
                int i3 = i / 8;
                int i4 = i2 / 8;
                byte[] vip = vip(i3 + i4);
                return new C11494e(new C14915e(vip, 0, i3), vip, i3, i4);
            default:
                int i5 = i / 8;
                int i6 = i2 / 8;
                int i7 = i5 + i6;
                if (i7 > this.vip.getDigestSize()) {
                    throw new IllegalArgumentException(AbstractC1634e.smaato("Can't generate a derived key ", i7, " bytes long."));
                }
                byte[] ad = ad();
                return new C11494e(new C14915e(ad, 0, i5), ad, i5, i6);
        }
    }

    public void metrica(byte[] bArr, byte[] bArr2) {
        super.init(bArr, bArr2, 1);
    }

    public byte[] vip(int i) {
        C17968e c17968e = (C17968e) this.vip;
        c17968e.getClass();
        byte[] bArr = new byte[16];
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        while (true) {
            byte[] bArr3 = this.password;
            c17968e.update(bArr3, 0, bArr3.length);
            byte[] bArr4 = this.salt;
            c17968e.update(bArr4, 0, bArr4.length);
            c17968e.doFinal(bArr, 0);
            int i3 = i > 16 ? 16 : i;
            System.arraycopy(bArr, 0, bArr2, i2, i3);
            i2 += i3;
            i -= i3;
            if (i == 0) {
                return bArr2;
            }
            c17968e.reset();
            c17968e.update(bArr, 0, 16);
        }
    }
}
