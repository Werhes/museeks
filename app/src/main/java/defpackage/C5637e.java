package defpackage;

/* renamed from: eؘِٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5637e implements InterfaceC10630e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f12013e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public byte[] f12014e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f12015e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public byte[] f12016e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C10398e f12017e;

    public C5637e(InterfaceC0293e interfaceC0293e) {
        this.f12017e = new C10398e(interfaceC0293e);
        this.f12015e = interfaceC0293e.getDigestSize();
    }

    public final void ad() {
        int i = this.f12013e;
        int i2 = this.f12015e;
        int i3 = (i / i2) + 1;
        if (i3 >= 256) {
            throw new RuntimeException("HKDF cannot generate more than 255 blocks of HashLen size");
        }
        C10398e c10398e = this.f12017e;
        if (i != 0) {
            c10398e.update(this.f12016e, 0, i2);
        }
        byte[] bArr = this.f12014e;
        c10398e.update(bArr, 0, bArr.length);
        c10398e.update((byte) i3);
        c10398e.doFinal(this.f12016e, 0);
    }

    @Override // defpackage.InterfaceC10630e
    public final int generateBytes(byte[] bArr, int i, int i2) {
        int i3 = this.f12013e;
        int i4 = i3 + i2;
        int i5 = this.f12015e;
        if (i4 > i5 * 255) {
            throw new RuntimeException("HKDF may only be used for 255 * HashLen bytes of output");
        }
        if (i3 % i5 == 0) {
            ad();
        }
        int i6 = this.f12013e % i5;
        int min = Math.min(i5 - i6, i2);
        System.arraycopy(this.f12016e, i6, bArr, 0, min);
        this.f12013e += min;
        int i7 = i2 - min;
        while (i7 > 0) {
            ad();
            int min2 = Math.min(i5, i7);
            System.arraycopy(this.f12016e, 0, bArr, min, min2);
            this.f12013e += min2;
            i7 -= min2;
            min += min2;
        }
        return i2;
    }

    @Override // defpackage.InterfaceC10630e
    public final void init(InterfaceC13829e interfaceC13829e) {
        if (!(interfaceC13829e instanceof C3678e)) {
            throw new IllegalArgumentException("HKDF parameters required for HKDFBytesGenerator");
        }
        C3678e c3678e = (C3678e) interfaceC13829e;
        byte[] bArr = c3678e.ad;
        byte[] license = AbstractC12442e.license(c3678e.vip);
        byte[] license2 = AbstractC12442e.license(bArr);
        int i = this.f12015e;
        C10398e c10398e = this.f12017e;
        if (license == null) {
            c10398e.init(new C14915e(new byte[i], 0, i));
        } else {
            c10398e.init(new C14915e(license, 0, license.length));
        }
        c10398e.update(license2, 0, license2.length);
        byte[] bArr2 = new byte[i];
        c10398e.doFinal(bArr2, 0);
        c10398e.init(new C14915e(bArr2, 0, i));
        this.f12014e = AbstractC12442e.license(c3678e.metrica);
        this.f12013e = 0;
        this.f12016e = new byte[i];
    }
}
