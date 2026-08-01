package defpackage;

/* renamed from: eُْۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C13203e extends C15612e {
    public boolean adcel;
    public final InterfaceC2965e advert;
    public final boolean amazon;
    public InterfaceC2227e mopub;
    public final boolean smaato;
    public int startapp;
    public byte[] yandex;

    public C13203e(InterfaceC2227e interfaceC2227e) {
        this.mopub = interfaceC2227e;
        if (interfaceC2227e instanceof InterfaceC2965e) {
            InterfaceC2965e interfaceC2965e = (InterfaceC2965e) interfaceC2227e;
            this.advert = interfaceC2965e;
            this.yandex = new byte[((AbstractC16431e) interfaceC2965e).isPro()];
        } else {
            this.advert = null;
            this.yandex = new byte[interfaceC2227e.isPro()];
        }
        boolean z = false;
        this.startapp = 0;
        String algorithmName = interfaceC2227e.getAlgorithmName();
        int indexOf = algorithmName.indexOf(47) + 1;
        boolean z2 = indexOf > 0 && algorithmName.startsWith("PGP", indexOf);
        this.amazon = z2;
        if (z2 || (interfaceC2227e instanceof InterfaceC14556e)) {
            this.smaato = true;
            return;
        }
        if (indexOf > 0 && algorithmName.startsWith("OpenPGP", indexOf)) {
            z = true;
        }
        this.smaato = z;
    }

    @Override // defpackage.C15612e
    public int ad(byte[] bArr, int i) {
        byte[] bArr2;
        int i2;
        int i3;
        int i4;
        try {
            int i5 = this.startapp;
            if (i + i5 > bArr.length) {
                throw new RuntimeException("output buffer too short for doFinal()");
            }
            int i6 = 0;
            if (i5 != 0) {
                InterfaceC2965e interfaceC2965e = this.advert;
                if (interfaceC2965e != null) {
                    int isPro = i5 / interfaceC2965e.isPro();
                    bArr2 = bArr;
                    i2 = i;
                    i3 = ((AbstractC16431e) interfaceC2965e).ad(this.yandex, 0, isPro, bArr2, i2);
                    i4 = isPro * interfaceC2965e.isPro();
                } else {
                    bArr2 = bArr;
                    i2 = i;
                    i3 = 0;
                    i4 = 0;
                }
                if (this.startapp == i4) {
                    i6 = i3;
                } else {
                    if (!this.smaato) {
                        throw new RuntimeException("data not block size aligned");
                    }
                    InterfaceC2227e interfaceC2227e = this.mopub;
                    byte[] bArr3 = this.yandex;
                    interfaceC2227e.tapsense(i4, i4, bArr3, bArr3);
                    System.arraycopy(this.yandex, i4, bArr2, i2 + i3, this.startapp - i4);
                    int i7 = (this.startapp - i4) + i3;
                    this.startapp = 0;
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

    @Override // defpackage.C15612e
    public final void adcel() {
        int i = 0;
        while (true) {
            byte[] bArr = this.yandex;
            if (i >= bArr.length) {
                this.startapp = 0;
                this.mopub.reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    @Override // defpackage.C15612e
    public int appmetrica(int i) {
        int length;
        int i2;
        int i3 = i + this.startapp;
        if (!this.amazon) {
            length = this.yandex.length;
        } else {
            if (this.adcel) {
                i2 = (i3 % this.yandex.length) - (this.mopub.isPro() + 2);
                return i3 - i2;
            }
            length = this.yandex.length;
        }
        i2 = i3 % length;
        return i3 - i2;
    }

    @Override // defpackage.C15612e
    public final InterfaceC2227e license() {
        return this.mopub;
    }

    @Override // defpackage.C15612e
    public int metrica(int i) {
        if (!this.amazon || !this.adcel) {
            return i + this.startapp;
        }
        return this.mopub.isPro() + 2 + i + this.startapp;
    }

    public final int mopub(int i, byte[] bArr) {
        this.startapp = 0;
        InterfaceC2965e interfaceC2965e = this.advert;
        if (interfaceC2965e == null) {
            return this.mopub.tapsense(0, i, this.yandex, bArr);
        }
        byte[] bArr2 = this.yandex;
        return ((AbstractC16431e) interfaceC2965e).ad(bArr2, 0, bArr2.length / interfaceC2965e.isPro(), bArr, i);
    }

    @Override // defpackage.C15612e
    public void purchase(boolean z, InterfaceC3894e interfaceC3894e) {
        this.adcel = z;
        adcel();
        this.mopub.init(z, interfaceC3894e);
    }

    @Override // defpackage.C15612e
    public int startapp(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArr3;
        int i4;
        int i5;
        int i6;
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int isPro = this.mopub.isPro();
        int appmetrica = appmetrica(i2);
        if (appmetrica > 0 && appmetrica + i3 > bArr2.length) {
            throw new RuntimeException("output buffer too short");
        }
        byte[] bArr4 = this.yandex;
        int length = bArr4.length;
        int i7 = this.startapp;
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
            r9 = this.startapp != 0 ? mopub(i3, bArr2) : 0;
            InterfaceC2965e interfaceC2965e = this.advert;
            if (interfaceC2965e != null) {
                AbstractC16431e abstractC16431e = (AbstractC16431e) interfaceC2965e;
                int isPro2 = (i5 / abstractC16431e.isPro()) * (abstractC16431e.isPro() / isPro);
                if (isPro2 > 0) {
                    r9 += abstractC16431e.ad(bArr3, i4, isPro2, bArr2, i3 + r9);
                    int i9 = isPro2 * isPro;
                    i5 -= i9;
                    i4 += i9;
                }
            } else {
                while (i5 > this.yandex.length) {
                    r9 += this.mopub.tapsense(i4, i3 + r9, bArr3, bArr2);
                    i5 -= isPro;
                    i4 += isPro;
                }
            }
        } else {
            bArr3 = bArr;
            i4 = i;
            i5 = i2;
        }
        System.arraycopy(bArr3, i4, this.yandex, this.startapp, i5);
        int i10 = this.startapp + i5;
        this.startapp = i10;
        return i10 == this.yandex.length ? mopub(i3 + r9, bArr2) + r9 : r9;
    }

    @Override // defpackage.C15612e
    public final int vip() {
        return this.mopub.isPro();
    }

    @Override // defpackage.C15612e
    public int yandex(byte b, byte[] bArr, int i) {
        byte[] bArr2 = this.yandex;
        int i2 = this.startapp;
        int i3 = i2 + 1;
        this.startapp = i3;
        bArr2[i2] = b;
        if (i3 == bArr2.length) {
            return mopub(i, bArr);
        }
        return 0;
    }
}
