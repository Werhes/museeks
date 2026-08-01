package defpackage;

import java.util.Arrays;

/* renamed from: eٕٗۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15520e implements adcel {
    public final InterfaceC2227e ad;
    public final byte[] adcel;
    public final int amazon;
    public byte[] appmetrica;
    public byte[] billing;
    public byte[] license;
    public boolean metrica;
    public final byte[] mopub;
    public final byte[] purchase;
    public final byte[] startapp;
    public int vip;
    public final byte[] yandex;
    public final C15236e advert = new C15236e(4);
    public final C15236e smaato = new C15236e(4);

    public C15520e(InterfaceC2227e interfaceC2227e) {
        this.amazon = 4;
        this.ad = interfaceC2227e;
        this.vip = interfaceC2227e.isPro();
        this.billing = new byte[interfaceC2227e.isPro()];
        this.license = new byte[interfaceC2227e.isPro()];
        this.appmetrica = new byte[interfaceC2227e.isPro()];
        this.purchase = new byte[interfaceC2227e.isPro()];
        this.yandex = new byte[interfaceC2227e.isPro()];
        this.startapp = new byte[interfaceC2227e.isPro()];
        this.adcel = new byte[interfaceC2227e.isPro()];
        this.mopub = new byte[interfaceC2227e.isPro()];
        this.amazon = 4;
    }

    public static void appmetrica(int i, byte[] bArr) {
        bArr[3] = (byte) (i >> 24);
        bArr[2] = (byte) (i >> 16);
        bArr[1] = (byte) (i >> 8);
        bArr[0] = (byte) i;
    }

    @Override // defpackage.mopub
    public final void ad(int i, int i2, byte[] bArr) {
        this.advert.write(bArr, i, i2);
    }

    public final void billing() {
        Arrays.fill(this.yandex, (byte) 0);
        Arrays.fill(this.startapp, (byte) 0);
        byte[] bArr = this.mopub;
        Arrays.fill(bArr, (byte) 0);
        Arrays.fill(this.purchase, (byte) 0);
        bArr[0] = 1;
        this.smaato.reset();
        this.advert.reset();
        byte[] bArr2 = this.license;
        if (bArr2 != null) {
            ad(0, bArr2.length, bArr2);
        }
    }

    @Override // defpackage.mopub
    public final int doFinal(byte[] bArr, int i) {
        int i2;
        int i3;
        int i4;
        C15236e c15236e = this.smaato;
        byte[] advert = c15236e.advert();
        int size = c15236e.size();
        if (advert.length < size) {
            throw new RuntimeException("input buffer too short");
        }
        if (bArr.length - i < size) {
            throw new RuntimeException("output buffer too short");
        }
        C15236e c15236e2 = this.advert;
        if (c15236e2.size() > 0) {
            if (this.metrica) {
                purchase(c15236e2.size(), c15236e.size(), c15236e2.advert());
            } else {
                purchase(c15236e2.size(), c15236e.size() - this.vip, c15236e2.advert());
            }
        }
        boolean z = this.metrica;
        byte[] bArr2 = this.purchase;
        byte[] bArr3 = this.mopub;
        byte[] bArr4 = this.startapp;
        byte[] bArr5 = this.adcel;
        InterfaceC2227e interfaceC2227e = this.ad;
        if (z) {
            if (size % interfaceC2227e.isPro() != 0) {
                throw new RuntimeException("partial blocks not supported");
            }
            metrica(size, advert);
            interfaceC2227e.tapsense(0, 0, this.billing, bArr5);
            int i5 = size;
            int i6 = 0;
            while (i5 > 0) {
                license(i6, i, advert, bArr);
                i5 -= interfaceC2227e.isPro();
                i6 += interfaceC2227e.isPro();
                i += interfaceC2227e.isPro();
            }
            for (int i7 = 0; i7 < bArr3.length; i7++) {
                bArr5[i7] = (byte) (bArr5[i7] + bArr3[i7]);
            }
            interfaceC2227e.tapsense(0, 0, bArr5, bArr4);
            int i8 = 0;
            while (true) {
                i4 = this.vip;
                if (i8 >= i4) {
                    break;
                }
                bArr[i + i8] = (byte) (bArr4[i8] ^ bArr2[i8]);
                i8++;
            }
            System.arraycopy(bArr2, 0, this.appmetrica, 0, i4);
            billing();
            i2 = size + this.vip;
        } else {
            if ((size - this.vip) % interfaceC2227e.isPro() != 0) {
                throw new RuntimeException("partial blocks not supported");
            }
            interfaceC2227e.tapsense(0, 0, this.billing, bArr5);
            int isPro = size / interfaceC2227e.isPro();
            int i9 = 0;
            for (int i10 = 0; i10 < isPro; i10++) {
                license(i9, i, advert, bArr);
                i9 += interfaceC2227e.isPro();
                i += interfaceC2227e.isPro();
            }
            if (size > i9) {
                for (int i11 = 0; i11 < bArr3.length; i11++) {
                    bArr5[i11] = (byte) (bArr5[i11] + bArr3[i11]);
                }
                interfaceC2227e.tapsense(0, 0, bArr5, bArr4);
                int i12 = 0;
                while (true) {
                    i3 = this.vip;
                    if (i12 >= i3) {
                        break;
                    }
                    bArr[i + i12] = (byte) (bArr4[i12] ^ advert[i9 + i12]);
                    i12++;
                }
                i += i3;
            }
            for (int i13 = 0; i13 < bArr3.length; i13++) {
                bArr5[i13] = (byte) (bArr5[i13] + bArr3[i13]);
            }
            interfaceC2227e.tapsense(0, 0, bArr5, bArr4);
            int i14 = this.vip;
            System.arraycopy(bArr, i - i14, bArr4, 0, i14);
            metrica(i - this.vip, bArr);
            System.arraycopy(bArr2, 0, this.appmetrica, 0, this.vip);
            int i15 = this.vip;
            byte[] bArr6 = new byte[i15];
            System.arraycopy(bArr4, 0, bArr6, 0, i15);
            if (!AbstractC12442e.loadAd(this.appmetrica, bArr6)) {
                throw new Exception("mac check failed");
            }
            billing();
            i2 = size - this.vip;
        }
        billing();
        return i2;
    }

    @Override // defpackage.mopub
    public final String getAlgorithmName() {
        return this.ad.getAlgorithmName() + "/KCCM";
    }

    @Override // defpackage.mopub
    public final int getOutputSize(int i) {
        return i + this.vip;
    }

    @Override // defpackage.adcel
    public final InterfaceC2227e getUnderlyingCipher() {
        return this.ad;
    }

    @Override // defpackage.mopub
    public final int getUpdateOutputSize(int i) {
        return i;
    }

    @Override // defpackage.mopub
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        InterfaceC3894e interfaceC3894e2;
        boolean z2 = interfaceC3894e instanceof smaato;
        InterfaceC2227e interfaceC2227e = this.ad;
        if (z2) {
            smaato smaatoVar = (smaato) interfaceC3894e;
            int i = smaatoVar.f36457e;
            if (i > 512 || i < 64 || i % 8 != 0) {
                throw new IllegalArgumentException("Invalid mac size specified");
            }
            this.billing = AbstractC12442e.license(smaatoVar.f36456e);
            this.vip = i / 8;
            this.license = AbstractC12442e.license(smaatoVar.f36458e);
            interfaceC3894e2 = smaatoVar.f36455e;
        } else {
            if (!(interfaceC3894e instanceof C11494e)) {
                throw new IllegalArgumentException("Invalid parameters specified");
            }
            C11494e c11494e = (C11494e) interfaceC3894e;
            this.billing = c11494e.f23095e;
            this.vip = interfaceC2227e.isPro();
            this.license = null;
            interfaceC3894e2 = c11494e.f23094e;
        }
        this.appmetrica = new byte[this.vip];
        this.metrica = z;
        interfaceC2227e.init(true, interfaceC3894e2);
        this.mopub[0] = 1;
        byte[] bArr = this.license;
        if (bArr != null) {
            ad(0, bArr.length, bArr);
        }
    }

    public final void license(int i, int i2, byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int i3 = 0;
        while (true) {
            byte[] bArr4 = this.mopub;
            int length = bArr4.length;
            bArr3 = this.adcel;
            if (i3 >= length) {
                break;
            }
            bArr3[i3] = (byte) (bArr3[i3] + bArr4[i3]);
            i3++;
        }
        InterfaceC2227e interfaceC2227e = this.ad;
        byte[] bArr5 = this.startapp;
        interfaceC2227e.tapsense(0, 0, bArr3, bArr5);
        for (int i4 = 0; i4 < interfaceC2227e.isPro(); i4++) {
            bArr2[i2 + i4] = (byte) (bArr5[i4] ^ bArr[i + i4]);
        }
    }

    public final void metrica(int i, byte[] bArr) {
        InterfaceC2227e interfaceC2227e;
        byte[] bArr2;
        int i2 = 0;
        while (i > 0) {
            int i3 = 0;
            while (true) {
                interfaceC2227e = this.ad;
                int isPro = interfaceC2227e.isPro();
                bArr2 = this.purchase;
                if (i3 < isPro) {
                    bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i2 + i3]);
                    i3++;
                }
            }
            interfaceC2227e.tapsense(0, 0, bArr2, bArr2);
            i -= interfaceC2227e.isPro();
            i2 += interfaceC2227e.isPro();
        }
    }

    @Override // defpackage.mopub
    public final int processByte(byte b, byte[] bArr, int i) {
        this.smaato.write(b);
        return 0;
    }

    @Override // defpackage.mopub
    public final int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr.length < i + i2) {
            throw new RuntimeException("input buffer too short");
        }
        this.smaato.write(bArr, i, i2);
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[LOOP:0: B:18:0x006a->B:20:0x0070, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void purchase(int r9, int r10, byte[] r11) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15520e.purchase(int, int, byte[]):void");
    }

    @Override // defpackage.mopub
    public final byte[] vip() {
        return AbstractC12442e.license(this.appmetrica);
    }
}
