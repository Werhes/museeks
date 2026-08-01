package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: eؑؔؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0061e {
    public final InterfaceC5168e ad;
    public C16911e adcel;
    public byte[] advert;
    public boolean appmetrica;
    public InterfaceC3894e billing;
    public final C14790e license;
    public final C10398e metrica;
    public InterfaceC5617e mopub;
    public InterfaceC3894e purchase;
    public byte[] startapp;
    public final C1725e vip;
    public C17265e yandex;

    public C0061e(InterfaceC5168e interfaceC5168e, C1725e c1725e, C10398e c10398e) {
        this.ad = interfaceC5168e;
        this.vip = c1725e;
        this.metrica = c10398e;
        byte[] bArr = new byte[c10398e.f20548e];
        this.license = null;
    }

    public C0061e(InterfaceC5168e interfaceC5168e, C1725e c1725e, C10398e c10398e, C14790e c14790e) {
        this.ad = interfaceC5168e;
        this.vip = c1725e;
        this.metrica = c10398e;
        byte[] bArr = new byte[c10398e.f20548e];
        this.license = c14790e;
    }

    public final byte[] ad(int i, byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        int startapp;
        byte[] bArr5;
        byte[] bArr6 = this.startapp;
        int length = bArr6.length;
        C10398e c10398e = this.metrica;
        int i2 = c10398e.f20548e;
        if (i < length + i2) {
            throw new Exception("Length of input must be greater than the MAC and V combined");
        }
        C1725e c1725e = this.vip;
        C14790e c14790e = this.license;
        if (c14790e == null) {
            int length2 = (i - bArr6.length) - i2;
            byte[] bArr7 = new byte[length2];
            int i3 = this.yandex.f33878e / 8;
            byte[] bArr8 = new byte[i3];
            int i4 = length2 + i3;
            byte[] bArr9 = new byte[i4];
            c1725e.generateBytes(bArr9, 0, i4);
            if (this.startapp.length != 0) {
                System.arraycopy(bArr9, 0, bArr8, 0, i3);
                System.arraycopy(bArr9, i3, bArr7, 0, length2);
            } else {
                System.arraycopy(bArr9, 0, bArr7, 0, length2);
                System.arraycopy(bArr9, length2, bArr8, 0, i3);
            }
            byte[] bArr10 = new byte[length2];
            for (int i5 = 0; i5 != length2; i5++) {
                bArr10[i5] = (byte) (bArr[this.startapp.length + i5] ^ bArr7[i5]);
            }
            bArr2 = bArr8;
            startapp = 0;
            bArr3 = bArr10;
            bArr4 = bArr;
        } else {
            C17265e c17265e = this.yandex;
            int i6 = c17265e.f33880e / 8;
            byte[] bArr11 = new byte[i6];
            int i7 = c17265e.f33878e / 8;
            bArr2 = new byte[i7];
            int i8 = i6 + i7;
            byte[] bArr12 = new byte[i8];
            c1725e.generateBytes(bArr12, 0, i8);
            System.arraycopy(bArr12, 0, bArr11, 0, i6);
            System.arraycopy(bArr12, i6, bArr2, 0, i7);
            InterfaceC3894e c14915e = new C14915e(bArr11, 0, i6);
            byte[] bArr13 = this.advert;
            if (bArr13 != null) {
                c14915e = new C11494e(c14915e, bArr13, 0, bArr13.length);
            }
            c14790e.purchase(false, c14915e);
            bArr3 = new byte[c14790e.metrica((i - this.startapp.length) - i2)];
            byte[] bArr14 = this.startapp;
            bArr4 = bArr;
            startapp = this.license.startapp(bArr4, bArr14.length, (i - bArr14.length) - i2, bArr3, 0);
        }
        byte[] license = AbstractC12442e.license(this.yandex.f33879e);
        if (this.startapp.length != 0) {
            bArr5 = new byte[8];
            if (license != null) {
                AbstractC3628e.admob(0, license.length * 8, bArr5);
            }
        } else {
            bArr5 = null;
        }
        byte[] admob = AbstractC12442e.admob(i - i2, i, bArr4);
        int length3 = admob.length;
        byte[] bArr15 = new byte[length3];
        c10398e.init(new C14915e(bArr2, 0, bArr2.length));
        byte[] bArr16 = this.startapp;
        c10398e.update(bArr4, bArr16.length, (i - bArr16.length) - length3);
        if (license != null) {
            c10398e.update(license, 0, license.length);
        }
        if (this.startapp.length != 0) {
            c10398e.update(bArr5, 0, bArr5.length);
        }
        c10398e.doFinal(bArr15, 0);
        if (AbstractC12442e.loadAd(admob, bArr15)) {
            return c14790e == null ? bArr3 : AbstractC12442e.admob(0, c14790e.ad(bArr3, startapp) + startapp, bArr3);
        }
        throw new Exception("invalid MAC");
    }

    public final byte[] appmetrica(int i, byte[] bArr) {
        if (this.appmetrica) {
            C16911e c16911e = this.adcel;
            if (c16911e != null) {
                C17424e mo3419appmetrica = ((InterfaceC6610e) c16911e.f33137e).mo3419appmetrica();
                InterfaceC7949e interfaceC7949e = (InterfaceC7949e) c16911e.f33136e;
                this.purchase = (AbstractC9027e) mo3419appmetrica.f34141e;
                this.startapp = interfaceC7949e.getEncoded((AbstractC9027e) mo3419appmetrica.f34142e);
            }
        } else if (this.mopub != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 0, i);
            try {
                this.billing = this.mopub.subs(byteArrayInputStream);
                this.startapp = AbstractC12442e.admob(0, i - byteArrayInputStream.available(), bArr);
            } catch (IOException e) {
                throw new C15651e(AbstractC8703e.admob(e, new StringBuilder("unable to recover ephemeral public key: ")), e);
            } catch (IllegalArgumentException e2) {
                throw new C15651e("unable to recover ephemeral public key: " + e2.getMessage(), e2);
            }
        }
        InterfaceC3894e interfaceC3894e = this.purchase;
        InterfaceC5168e interfaceC5168e = this.ad;
        interfaceC5168e.init(interfaceC3894e);
        byte[] ad = AbstractC5907e.ad(interfaceC5168e.getFieldSize(), interfaceC5168e.ad(this.billing));
        byte[] bArr2 = this.startapp;
        if (bArr2.length != 0) {
            byte[] adcel = AbstractC12442e.adcel(bArr2, ad);
            Arrays.fill(ad, (byte) 0);
            ad = adcel;
        }
        try {
            this.vip.init(new C0369e(ad, AbstractC12442e.license(this.yandex.f33881e)));
            byte[] vip = this.appmetrica ? vip(i, bArr) : ad(i, bArr);
            Arrays.fill(ad, (byte) 0);
            return vip;
        } catch (Throwable th) {
            Arrays.fill(ad, (byte) 0);
            throw th;
        }
    }

    public final void license(boolean z, InterfaceC3894e interfaceC3894e, InterfaceC3894e interfaceC3894e2, InterfaceC3894e interfaceC3894e3) {
        this.appmetrica = z;
        this.purchase = interfaceC3894e;
        this.billing = interfaceC3894e2;
        this.startapp = new byte[0];
        metrica(interfaceC3894e3);
    }

    public final void metrica(InterfaceC3894e interfaceC3894e) {
        if (interfaceC3894e instanceof C11494e) {
            C11494e c11494e = (C11494e) interfaceC3894e;
            this.advert = c11494e.f23095e;
            interfaceC3894e = c11494e.f23094e;
        } else {
            this.advert = null;
        }
        this.yandex = (C17265e) interfaceC3894e;
    }

    public final byte[] vip(int i, byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        int ad;
        byte[] bArr4;
        C1725e c1725e = this.vip;
        C14790e c14790e = this.license;
        if (c14790e == null) {
            byte[] bArr5 = new byte[i];
            int i2 = this.yandex.f33878e / 8;
            byte[] bArr6 = new byte[i2];
            int i3 = i + i2;
            byte[] bArr7 = new byte[i3];
            c1725e.generateBytes(bArr7, 0, i3);
            if (this.startapp.length != 0) {
                System.arraycopy(bArr7, 0, bArr6, 0, i2);
                System.arraycopy(bArr7, i2, bArr5, 0, i);
            } else {
                System.arraycopy(bArr7, 0, bArr5, 0, i);
                System.arraycopy(bArr7, i, bArr6, 0, i2);
            }
            byte[] bArr8 = new byte[i];
            for (int i4 = 0; i4 != i; i4++) {
                bArr8[i4] = (byte) (bArr[i4] ^ bArr5[i4]);
            }
            bArr2 = bArr6;
            bArr3 = bArr8;
            ad = i;
        } else {
            C17265e c17265e = this.yandex;
            int i5 = c17265e.f33880e / 8;
            byte[] bArr9 = new byte[i5];
            int i6 = c17265e.f33878e / 8;
            bArr2 = new byte[i6];
            int i7 = i5 + i6;
            byte[] bArr10 = new byte[i7];
            c1725e.generateBytes(bArr10, 0, i7);
            System.arraycopy(bArr10, 0, bArr9, 0, i5);
            System.arraycopy(bArr10, i5, bArr2, 0, i6);
            c14790e.purchase(true, this.advert != null ? new C11494e(new C14915e(bArr9, 0, i5), this.advert) : new C14915e(bArr9, 0, i5));
            bArr3 = new byte[c14790e.metrica(i)];
            int startapp = this.license.startapp(bArr, 0, i, bArr3, 0);
            ad = startapp + c14790e.ad(bArr3, startapp);
        }
        byte[] license = AbstractC12442e.license(this.yandex.f33879e);
        if (this.startapp.length != 0) {
            bArr4 = new byte[8];
            if (license != null) {
                AbstractC3628e.admob(0, license.length * 8, bArr4);
            }
        } else {
            bArr4 = null;
        }
        C10398e c10398e = this.metrica;
        int i8 = c10398e.f20548e;
        byte[] bArr11 = new byte[i8];
        c10398e.init(new C14915e(bArr2, 0, bArr2.length));
        c10398e.update(bArr3, 0, bArr3.length);
        if (license != null) {
            c10398e.update(license, 0, license.length);
        }
        if (this.startapp.length != 0) {
            c10398e.update(bArr4, 0, bArr4.length);
        }
        c10398e.doFinal(bArr11, 0);
        byte[] bArr12 = this.startapp;
        byte[] bArr13 = new byte[bArr12.length + ad + i8];
        System.arraycopy(bArr12, 0, bArr13, 0, bArr12.length);
        System.arraycopy(bArr3, 0, bArr13, this.startapp.length, ad);
        System.arraycopy(bArr11, 0, bArr13, this.startapp.length + ad, i8);
        return bArr13;
    }
}
