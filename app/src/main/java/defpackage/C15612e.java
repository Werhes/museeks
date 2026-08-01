package defpackage;

/* renamed from: eٕٝۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C15612e {
    public final byte[] ad;
    public final InterfaceC2965e appmetrica;
    public final boolean billing;
    public final InterfaceC2227e license;
    public boolean metrica;
    public final boolean purchase;
    public int vip;

    public C15612e(InterfaceC2227e interfaceC2227e) {
        this.license = interfaceC2227e;
        if (interfaceC2227e instanceof InterfaceC2965e) {
            InterfaceC2965e interfaceC2965e = (InterfaceC2965e) interfaceC2227e;
            this.appmetrica = interfaceC2965e;
            this.ad = new byte[((AbstractC16431e) interfaceC2965e).isPro()];
        } else {
            this.appmetrica = null;
            this.ad = new byte[interfaceC2227e.isPro()];
        }
        boolean z = false;
        this.vip = 0;
        String algorithmName = interfaceC2227e.getAlgorithmName();
        int indexOf = algorithmName.indexOf(47) + 1;
        boolean z2 = indexOf > 0 && algorithmName.startsWith("PGP", indexOf);
        this.billing = z2;
        if (z2 || (interfaceC2227e instanceof InterfaceC14556e)) {
            this.purchase = true;
            return;
        }
        if (indexOf > 0 && algorithmName.startsWith("OpenPGP", indexOf)) {
            z = true;
        }
        this.purchase = z;
    }

    public int ad(byte[] bArr, int i) {
        byte[] bArr2;
        int i2;
        int i3;
        int i4;
        byte[] bArr3 = this.ad;
        try {
            int i5 = this.vip;
            if (i + i5 > bArr.length) {
                throw new RuntimeException("output buffer too short for doFinal()");
            }
            int i6 = 0;
            if (i5 != 0) {
                InterfaceC2965e interfaceC2965e = this.appmetrica;
                if (interfaceC2965e != null) {
                    int isPro = i5 / interfaceC2965e.isPro();
                    bArr2 = bArr;
                    i2 = i;
                    i3 = ((AbstractC16431e) interfaceC2965e).ad(this.ad, 0, isPro, bArr2, i2);
                    i4 = isPro * interfaceC2965e.isPro();
                } else {
                    bArr2 = bArr;
                    i2 = i;
                    i3 = 0;
                    i4 = 0;
                }
                if (this.vip == i4) {
                    i6 = i3;
                } else {
                    if (!this.purchase) {
                        throw new RuntimeException("data not block size aligned");
                    }
                    this.license.tapsense(i4, i4, bArr3, bArr3);
                    System.arraycopy(bArr3, i4, bArr2, i2 + i3, this.vip - i4);
                    int i7 = (this.vip - i4) + i3;
                    this.vip = 0;
                    i6 = i7;
                }
            }
            adcel();
            return i6;
        } catch (Throwable th) {
            adcel();
            throw th;
        }
    }

    public void adcel() {
        int i = 0;
        while (true) {
            byte[] bArr = this.ad;
            if (i >= bArr.length) {
                this.vip = 0;
                this.license.reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    public int appmetrica(int i) {
        int i2 = i + this.vip;
        boolean z = this.billing;
        byte[] bArr = this.ad;
        return i2 - ((z && this.metrica) ? (i2 % bArr.length) - (this.license.isPro() + 2) : i2 % bArr.length);
    }

    public final int billing(int i, byte[] bArr) {
        this.vip = 0;
        byte[] bArr2 = this.ad;
        InterfaceC2965e interfaceC2965e = this.appmetrica;
        if (interfaceC2965e == null) {
            return this.license.tapsense(0, i, bArr2, bArr);
        }
        return ((AbstractC16431e) interfaceC2965e).ad(bArr2, 0, bArr2.length / interfaceC2965e.isPro(), bArr, i);
    }

    public InterfaceC2227e license() {
        return this.license;
    }

    public int metrica(int i) {
        if (!this.billing || !this.metrica) {
            return i + this.vip;
        }
        return this.license.isPro() + 2 + i + this.vip;
    }

    public void purchase(boolean z, InterfaceC3894e interfaceC3894e) {
        this.metrica = z;
        adcel();
        this.license.init(z, interfaceC3894e);
    }

    public int startapp(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArr3;
        int i4;
        int i5;
        int i6;
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int vip = vip();
        int appmetrica = appmetrica(i2);
        if (appmetrica > 0 && appmetrica + i3 > bArr2.length) {
            throw new RuntimeException("output buffer too short");
        }
        byte[] bArr4 = this.ad;
        int length = bArr4.length;
        int i7 = this.vip;
        int i8 = length - i7;
        if (i2 > i8) {
            if (i7 != 0) {
                System.arraycopy(bArr, i, bArr4, i7, i8);
                i6 = i + i8;
                i5 = i2 - i8;
            } else {
                i6 = i;
                i5 = i2;
            }
            if (bArr == bArr2) {
                byte[] bArr5 = new byte[i5];
                System.arraycopy(bArr2, i6, bArr5, 0, i5);
                bArr3 = bArr5;
                i4 = 0;
            } else {
                i4 = i6;
                bArr3 = bArr;
            }
            r9 = this.vip != 0 ? billing(i3, bArr2) : 0;
            InterfaceC2965e interfaceC2965e = this.appmetrica;
            if (interfaceC2965e != null) {
                AbstractC16431e abstractC16431e = (AbstractC16431e) interfaceC2965e;
                int isPro = (i5 / abstractC16431e.isPro()) * (abstractC16431e.isPro() / vip);
                if (isPro > 0) {
                    r9 += abstractC16431e.ad(bArr3, i4, isPro, bArr2, i3 + r9);
                    int i9 = isPro * vip;
                    i5 -= i9;
                    i4 += i9;
                }
            } else {
                while (i5 > bArr4.length) {
                    r9 += this.license.tapsense(i4, i3 + r9, bArr3, bArr2);
                    i5 -= vip;
                    i4 += vip;
                }
            }
        } else {
            bArr3 = bArr;
            i4 = i;
            i5 = i2;
        }
        System.arraycopy(bArr3, i4, bArr4, this.vip, i5);
        int i10 = this.vip + i5;
        this.vip = i10;
        return i10 == bArr4.length ? billing(i3 + r9, bArr2) + r9 : r9;
    }

    public int vip() {
        return this.license.isPro();
    }

    public int yandex(byte b, byte[] bArr, int i) {
        int i2 = this.vip;
        int i3 = i2 + 1;
        this.vip = i3;
        byte[] bArr2 = this.ad;
        bArr2[i2] = b;
        if (i3 == bArr2.length) {
            return billing(i, bArr);
        }
        return 0;
    }
}
