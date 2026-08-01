package defpackage;

import java.util.Arrays;

/* renamed from: eۣٗؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17359e implements adcel {
    public final InterfaceC2227e ad;
    public byte[] adcel;
    public int advert;
    public final C17665e appmetrica;
    public C15236e billing;
    public final byte[] license;
    public final byte[] metrica;
    public byte[] mopub;
    public final C17665e purchase;
    public final byte[] smaato;
    public boolean startapp;
    public final C10312e vip;
    public C15236e yandex;

    public C17359e(InterfaceC2227e interfaceC2227e) {
        C10312e c10312e = new C10312e(23, false);
        this.metrica = new byte[16];
        this.license = new byte[16];
        this.smaato = new byte[16];
        if (interfaceC2227e.isPro() != 16) {
            throw new IllegalArgumentException("Cipher required with a block size of 16.");
        }
        this.ad = interfaceC2227e;
        this.vip = c10312e;
        this.appmetrica = new C17665e(this);
        this.purchase = new C17665e(this);
    }

    public static void license(byte[] bArr, int i, int i2, boolean z) {
        int length = bArr == null ? 0 : bArr.length;
        int i3 = i + i2;
        if (i2 < 0 || i < 0 || i3 < 0 || i3 > length) {
            if (!z) {
                throw new RuntimeException("Input buffer too short.");
            }
        }
    }

    public static void purchase(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3 = 0;
        int i4 = 15;
        while (i3 < i2) {
            bArr2[i4] = bArr[i + i3];
            i3++;
            i4--;
        }
    }

    @Override // defpackage.mopub
    public final void ad(int i, int i2, byte[] bArr) {
        int i3 = this.advert;
        if ((i3 & 1) == 0) {
            throw new IllegalStateException("Cipher is not initialised");
        }
        if ((i3 & 2) != 0) {
            throw new IllegalStateException("AEAD data cannot be processed after ordinary data");
        }
        C17665e c17665e = this.appmetrica;
        if (c17665e.f34625e - Long.MIN_VALUE > (2147483623 - i2) - Long.MIN_VALUE) {
            throw new IllegalStateException("AEAD byte count exceeded");
        }
        license(bArr, i, i2, false);
        c17665e.ad(i, i2, bArr);
    }

    public final void appmetrica(int i) {
        long j;
        int i2 = this.advert;
        if ((i2 & 1) == 0) {
            throw new IllegalStateException("Cipher is not initialised");
        }
        if ((i2 & 2) == 0) {
            C17665e c17665e = this.appmetrica;
            C17359e c17359e = (C17359e) c17665e.f34622e;
            byte[] bArr = c17359e.license;
            if (c17665e.f34623e > 0) {
                Arrays.fill(bArr, (byte) 0);
                purchase(0, c17665e.f34623e, (byte[]) c17665e.f34624e, bArr);
                c17359e.billing(bArr);
            }
            this.advert |= 2;
        }
        long size = this.billing.size();
        if (this.startapp) {
            j = 2147483623;
        } else {
            size = this.yandex.size();
            j = 2147483639;
        }
        if (size - Long.MIN_VALUE > (j - i) - Long.MIN_VALUE) {
            throw new IllegalStateException("byte count exceeded");
        }
    }

    public final void billing(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = this.metrica;
            if (i >= 16) {
                this.vip.ads(bArr2);
                return;
            } else {
                bArr2[i] = (byte) (bArr2[i] ^ bArr[i]);
                i++;
            }
        }
    }

    @Override // defpackage.mopub
    public final int doFinal(byte[] bArr, int i) {
        appmetrica(0);
        boolean z = true;
        license(bArr, i, getOutputSize(0), true);
        boolean z2 = this.startapp;
        byte[] bArr2 = this.smaato;
        InterfaceC2227e interfaceC2227e = this.ad;
        int i2 = 16;
        if (z2) {
            byte[] metrica = metrica();
            byte[] advert = this.billing.advert();
            byte[] license = AbstractC12442e.license(metrica);
            license[15] = (byte) (license[15] | Byte.MIN_VALUE);
            byte[] bArr3 = new byte[16];
            int size = this.billing.size();
            int i3 = 0;
            while (size > 0) {
                interfaceC2227e.tapsense(0, 0, license, bArr3);
                int min = Math.min(i2, size);
                boolean z3 = z;
                int i4 = 0;
                while (i4 < min) {
                    bArr3[i4] = (byte) (bArr3[i4] ^ advert[i4 + i3]);
                    i4++;
                    i2 = i2;
                }
                int i5 = i2;
                System.arraycopy(bArr3, 0, bArr, i + i3, min);
                size -= min;
                i3 += min;
                for (int i6 = 0; i6 < 4; i6++) {
                    byte b = (byte) (license[i6] + 1);
                    license[i6] = b;
                    if (b != 0) {
                        break;
                    }
                }
                z = z3;
                i2 = i5;
            }
            int size2 = this.billing.size() + 16;
            System.arraycopy(metrica, 0, bArr, this.billing.size() + i, i2);
            System.arraycopy(metrica, 0, bArr2, 0, bArr2.length);
            yandex();
            return size2;
        }
        byte[] advert2 = this.yandex.advert();
        int size3 = this.yandex.size();
        int i7 = size3 - 16;
        if (i7 < 0) {
            throw new Exception("Data too short");
        }
        byte[] admob = AbstractC12442e.admob(i7, size3, advert2);
        byte[] license2 = AbstractC12442e.license(admob);
        license2[15] = (byte) (license2[15] | Byte.MIN_VALUE);
        int i8 = 16;
        byte[] bArr4 = new byte[16];
        int i9 = 0;
        while (i7 > 0) {
            interfaceC2227e.tapsense(0, 0, license2, bArr4);
            int min2 = Math.min(i8, i7);
            for (int i10 = 0; i10 < min2; i10++) {
                bArr4[i10] = (byte) (bArr4[i10] ^ advert2[i10 + i9]);
            }
            this.billing.write(bArr4, 0, min2);
            this.purchase.ad(0, min2, bArr4);
            i7 -= min2;
            i9 += min2;
            for (int i11 = 0; i11 < 4; i11++) {
                byte b2 = (byte) (license2[i11] + 1);
                license2[i11] = b2;
                if (b2 != 0) {
                    break;
                }
            }
            i8 = 16;
        }
        byte[] metrica2 = metrica();
        if (!AbstractC12442e.loadAd(metrica2, admob)) {
            yandex();
            throw new Exception("mac check failed");
        }
        System.arraycopy(metrica2, 0, bArr2, 0, bArr2.length);
        int size4 = this.billing.size();
        System.arraycopy(this.billing.advert(), 0, bArr, i, size4);
        yandex();
        return size4;
    }

    @Override // defpackage.mopub
    public final String getAlgorithmName() {
        return this.ad.getAlgorithmName() + "-GCM-SIV";
    }

    @Override // defpackage.mopub
    public final int getOutputSize(int i) {
        if (this.startapp) {
            return this.billing.size() + i + 16;
        }
        int size = this.yandex.size() + i;
        if (size > 16) {
            return size - 16;
        }
        return 0;
    }

    @Override // defpackage.adcel
    public final InterfaceC2227e getUnderlyingCipher() {
        return this.ad;
    }

    @Override // defpackage.mopub
    public final int getUpdateOutputSize(int i) {
        return 0;
    }

    @Override // defpackage.mopub
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        byte[] bArr;
        C14915e c14915e;
        byte[] bArr2;
        if (interfaceC3894e instanceof smaato) {
            smaato smaatoVar = (smaato) interfaceC3894e;
            bArr2 = AbstractC12442e.license(smaatoVar.f36458e);
            bArr = AbstractC12442e.license(smaatoVar.f36456e);
            c14915e = smaatoVar.f36455e;
        } else {
            if (!(interfaceC3894e instanceof C11494e)) {
                throw new IllegalArgumentException("invalid parameters passed to GCM-SIV");
            }
            C11494e c11494e = (C11494e) interfaceC3894e;
            bArr = c11494e.f23095e;
            c14915e = (C14915e) c11494e.f23094e;
            bArr2 = null;
        }
        if (bArr == null || bArr.length != 12) {
            throw new IllegalArgumentException("Invalid nonce");
        }
        if (c14915e != null) {
            byte[] bArr3 = c14915e.f29591e;
            if (bArr3.length == 16 || bArr3.length == 32) {
                this.startapp = z;
                this.adcel = bArr2;
                this.mopub = bArr;
                byte[] bArr4 = new byte[16];
                byte[] bArr5 = new byte[16];
                byte[] bArr6 = new byte[16];
                int length = bArr3.length;
                byte[] bArr7 = new byte[length];
                System.arraycopy(bArr, 0, bArr4, 4, 12);
                InterfaceC2227e interfaceC2227e = this.ad;
                interfaceC2227e.init(true, c14915e);
                interfaceC2227e.tapsense(0, 0, bArr4, bArr5);
                System.arraycopy(bArr5, 0, bArr6, 0, 8);
                bArr4[0] = (byte) (bArr4[0] + 1);
                interfaceC2227e.tapsense(0, 0, bArr4, bArr5);
                System.arraycopy(bArr5, 0, bArr6, 8, 8);
                bArr4[0] = (byte) (bArr4[0] + 1);
                interfaceC2227e.tapsense(0, 0, bArr4, bArr5);
                System.arraycopy(bArr5, 0, bArr7, 0, 8);
                bArr4[0] = (byte) (bArr4[0] + 1);
                interfaceC2227e.tapsense(0, 0, bArr4, bArr5);
                System.arraycopy(bArr5, 0, bArr7, 8, 8);
                if (length == 32) {
                    bArr4[0] = (byte) (bArr4[0] + 1);
                    interfaceC2227e.tapsense(0, 0, bArr4, bArr5);
                    System.arraycopy(bArr5, 0, bArr7, 16, 8);
                    bArr4[0] = (byte) (bArr4[0] + 1);
                    interfaceC2227e.tapsense(0, 0, bArr4, bArr5);
                    System.arraycopy(bArr5, 0, bArr7, 24, 8);
                }
                interfaceC2227e.init(true, new C14915e(bArr7, 0, length));
                purchase(0, 16, bArr6, bArr5);
                int i = 0;
                for (int i2 = 0; i2 < 16; i2++) {
                    byte b = bArr5[i2];
                    bArr5[i2] = (byte) (i | ((b >> 1) & 127));
                    i = (b & 1) == 0 ? 0 : -128;
                }
                if (i != 0) {
                    bArr5[0] = (byte) (bArr5[0] ^ (-31));
                }
                this.vip.signatures(bArr5);
                this.advert |= 1;
                yandex();
                return;
            }
        }
        throw new IllegalArgumentException("Invalid key");
    }

    public final byte[] metrica() {
        C17665e c17665e = this.purchase;
        C17359e c17359e = (C17359e) c17665e.f34622e;
        byte[] bArr = c17359e.license;
        if (c17665e.f34623e > 0) {
            Arrays.fill(bArr, (byte) 0);
            purchase(0, c17665e.f34623e, (byte[]) c17665e.f34624e, bArr);
            c17359e.billing(bArr);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        AbstractC3628e.admob(0, c17665e.f34625e * 8, bArr3);
        AbstractC3628e.admob(8, this.appmetrica.f34625e * 8, bArr3);
        billing(bArr3);
        purchase(0, 16, this.metrica, bArr2);
        byte[] bArr4 = new byte[16];
        for (int i = 0; i < 12; i++) {
            bArr2[i] = (byte) (bArr2[i] ^ this.mopub[i]);
        }
        bArr2[15] = (byte) (bArr2[15] & (-129));
        this.ad.tapsense(0, 0, bArr2, bArr4);
        return bArr4;
    }

    @Override // defpackage.mopub
    public final int processByte(byte b, byte[] bArr, int i) {
        appmetrica(1);
        if (this.startapp) {
            this.billing.write(b);
            C17665e c17665e = this.purchase;
            byte[] bArr2 = (byte[]) c17665e.f34621e;
            bArr2[0] = b;
            c17665e.ad(0, 1, bArr2);
        } else {
            this.yandex.write(b);
        }
        return 0;
    }

    @Override // defpackage.mopub
    public final int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        appmetrica(i2);
        license(bArr, i, i2, false);
        if (this.startapp) {
            this.billing.write(bArr, i, i2);
            this.purchase.ad(i, i2, bArr);
        } else {
            this.yandex.write(bArr, i, i2);
        }
        return 0;
    }

    @Override // defpackage.mopub
    public final byte[] vip() {
        return AbstractC12442e.license(this.smaato);
    }

    public final void yandex() {
        C15236e c15236e = this.billing;
        if (c15236e != null) {
            c15236e.ad();
        }
        C17665e c17665e = this.appmetrica;
        c17665e.f34623e = 0;
        c17665e.f34625e = 0L;
        C17665e c17665e2 = this.purchase;
        c17665e2.f34623e = 0;
        c17665e2.f34625e = 0L;
        this.billing = new C15236e(3);
        this.yandex = this.startapp ? null : new C15236e(3);
        this.advert &= -3;
        Arrays.fill(this.metrica, (byte) 0);
        byte[] bArr = this.adcel;
        if (bArr != null) {
            c17665e.ad(0, bArr.length, bArr);
        }
    }
}
