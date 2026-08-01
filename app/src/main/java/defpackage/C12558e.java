package defpackage;

/* renamed from: eّّٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12558e implements InterfaceC16335e {
    public InterfaceC2227e ad;
    public C15236e adcel;
    public byte[] appmetrica;
    public InterfaceC3894e billing;
    public byte[] license;
    public boolean metrica;
    public int purchase;
    public C15236e startapp;
    public int vip;
    public byte[] yandex;

    /* JADX WARN: Type inference failed for: r0v0, types: [eّّٙ, java.lang.Object] */
    public static C12558e appmetrica(InterfaceC2227e interfaceC2227e) {
        ?? obj = new Object();
        obj.startapp = new C15236e(0);
        obj.adcel = new C15236e(0);
        obj.ad = interfaceC2227e;
        int isPro = interfaceC2227e.isPro();
        obj.vip = isPro;
        obj.yandex = new byte[isPro];
        if (isPro == 16) {
            return obj;
        }
        throw new IllegalArgumentException("cipher required with a block size of 16.");
    }

    public static int license(int i, boolean z) {
        if (!z || (i >= 32 && i <= 128 && (i & 15) == 0)) {
            return i >>> 3;
        }
        throw new IllegalArgumentException("tag length in octets must be one of {4,6,8,10,12,14,16}");
    }

    @Override // defpackage.mopub
    public final void ad(int i, int i2, byte[] bArr) {
        this.startapp.write(bArr, i, i2);
    }

    @Override // defpackage.mopub
    public final int doFinal(byte[] bArr, int i) {
        int i2;
        InterfaceC2227e interfaceC2227e = this.ad;
        C15236e c15236e = this.adcel;
        byte[] advert = c15236e.advert();
        int size = c15236e.size();
        byte[] bArr2 = this.yandex;
        int i3 = this.vip;
        if (this.billing == null) {
            throw new IllegalStateException("CCM cipher unitialized.");
        }
        byte[] bArr3 = this.license;
        int length = bArr3.length;
        int i4 = 15 - length;
        if (i4 < 4) {
            if (size - (!this.metrica ? 16 : 0) >= (1 << (i4 * 8))) {
                throw new IllegalStateException("CCM packet too large for choice of q");
            }
        }
        byte[] bArr4 = new byte[i3];
        bArr4[0] = (byte) ((14 - length) & 7);
        System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
        C3331e c3331e = new C3331e(interfaceC2227e);
        c3331e.init(this.metrica, new C11494e(this.billing, bArr4, 0, i3));
        if (this.metrica) {
            i2 = this.purchase + size;
            if (bArr.length < i2 + i) {
                throw new RuntimeException("Output buffer too short.");
            }
            metrica(0, size, advert, bArr2);
            byte[] bArr5 = new byte[i3];
            c3331e.tapsense(0, 0, bArr2, bArr5);
            int i5 = i;
            int i6 = 0;
            while (i6 < size - i3) {
                c3331e.tapsense(i6, i5, advert, bArr);
                i5 += i3;
                i6 += i3;
            }
            byte[] bArr6 = new byte[i3];
            int i7 = size - i6;
            System.arraycopy(advert, i6, bArr6, 0, i7);
            c3331e.tapsense(0, 0, bArr6, bArr6);
            System.arraycopy(bArr6, 0, bArr, i5, i7);
            System.arraycopy(bArr5, 0, bArr, i + size, this.purchase);
        } else {
            int i8 = this.purchase;
            if (size < i8) {
                throw new Exception("data too short");
            }
            int i9 = size - i8;
            if (bArr.length < i9 + i) {
                throw new RuntimeException("Output buffer too short.");
            }
            System.arraycopy(advert, i9, bArr2, 0, i8);
            c3331e.tapsense(0, 0, bArr2, bArr2);
            for (int i10 = this.purchase; i10 != bArr2.length; i10++) {
                bArr2[i10] = 0;
            }
            int i11 = i;
            int i12 = 0;
            while (i12 < i9 - i3) {
                c3331e.tapsense(i12, i11, advert, bArr);
                i11 += i3;
                i12 += i3;
            }
            byte[] bArr7 = new byte[i3];
            int i13 = i9 - i12;
            System.arraycopy(advert, i12, bArr7, 0, i13);
            c3331e.tapsense(0, 0, bArr7, bArr7);
            System.arraycopy(bArr7, 0, bArr, i11, i13);
            byte[] bArr8 = new byte[i3];
            metrica(i, i9, bArr, bArr8);
            if (!AbstractC12442e.loadAd(bArr2, bArr8)) {
                throw new Exception("mac check in CCM failed");
            }
            i2 = i9;
        }
        interfaceC2227e.reset();
        this.startapp.reset();
        c15236e.reset();
        return i2;
    }

    @Override // defpackage.mopub
    public final String getAlgorithmName() {
        return this.ad.getAlgorithmName() + "/CCM";
    }

    @Override // defpackage.mopub
    public final int getOutputSize(int i) {
        int size = this.adcel.size() + i;
        if (this.metrica) {
            return size + this.purchase;
        }
        int i2 = this.purchase;
        if (size < i2) {
            return 0;
        }
        return size - i2;
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
        InterfaceC3894e interfaceC3894e2;
        this.metrica = z;
        if (interfaceC3894e instanceof smaato) {
            smaato smaatoVar = (smaato) interfaceC3894e;
            this.license = AbstractC12442e.license(smaatoVar.f36456e);
            this.appmetrica = AbstractC12442e.license(smaatoVar.f36458e);
            this.purchase = license(smaatoVar.f36457e, z);
            interfaceC3894e2 = smaatoVar.f36455e;
        } else {
            if (!(interfaceC3894e instanceof C11494e)) {
                throw new IllegalArgumentException(AbstractC8703e.remoteconfig("invalid parameters passed to CCM: ", interfaceC3894e));
            }
            C11494e c11494e = (C11494e) interfaceC3894e;
            this.license = c11494e.f23095e;
            this.appmetrica = null;
            this.purchase = license(64, z);
            interfaceC3894e2 = c11494e.f23094e;
        }
        if (interfaceC3894e2 != null) {
            this.billing = interfaceC3894e2;
        }
        byte[] bArr = this.license;
        if (bArr == null || bArr.length < 7 || bArr.length > 13) {
            throw new IllegalArgumentException("nonce must have length from 7 to 13 octets");
        }
        this.ad.reset();
        this.startapp.reset();
        this.adcel.reset();
    }

    public final void metrica(int i, int i2, byte[] bArr, byte[] bArr2) {
        C15236e c15236e = this.startapp;
        C6433e c6433e = new C6433e(this.ad, this.purchase * 8, null);
        c6433e.init(this.billing);
        byte[] bArr3 = new byte[16];
        int size = c15236e.size();
        byte[] bArr4 = this.appmetrica;
        if (size + (bArr4 == null ? 0 : bArr4.length) > 0) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        int i3 = 2;
        byte b = (byte) (bArr3[0] | ((((c6433e.f13320e - 2) / 2) & 7) << 3));
        bArr3[0] = b;
        byte[] bArr5 = this.license;
        bArr3[0] = (byte) (b | ((14 - bArr5.length) & 7));
        System.arraycopy(bArr5, 0, bArr3, 1, bArr5.length);
        int i4 = i2;
        int i5 = 1;
        while (i4 > 0) {
            bArr3[16 - i5] = (byte) (i4 & 255);
            i4 >>>= 8;
            i5++;
        }
        c6433e.update(bArr3, 0, 16);
        int size2 = c15236e.size();
        byte[] bArr6 = this.appmetrica;
        if (size2 + (bArr6 == null ? 0 : bArr6.length) > 0) {
            int size3 = c15236e.size();
            byte[] bArr7 = this.appmetrica;
            int length = size3 + (bArr7 == null ? 0 : bArr7.length);
            if (length < 65280) {
                c6433e.update((byte) (length >> 8));
                c6433e.update((byte) length);
            } else {
                c6433e.update((byte) -1);
                c6433e.update((byte) -2);
                c6433e.update((byte) (length >> 24));
                c6433e.update((byte) (length >> 16));
                c6433e.update((byte) (length >> 8));
                c6433e.update((byte) length);
                i3 = 6;
            }
            byte[] bArr8 = this.appmetrica;
            if (bArr8 != null) {
                c6433e.update(bArr8, 0, bArr8.length);
            }
            if (c15236e.size() > 0) {
                c6433e.update(c15236e.advert(), 0, c15236e.size());
            }
            int i6 = (i3 + length) % 16;
            if (i6 != 0) {
                while (i6 != 16) {
                    c6433e.update((byte) 0);
                    i6++;
                }
            }
        }
        c6433e.update(bArr, i, i2);
        c6433e.doFinal(bArr2, 0);
    }

    @Override // defpackage.mopub
    public final int processByte(byte b, byte[] bArr, int i) {
        this.adcel.write(b);
        return 0;
    }

    @Override // defpackage.mopub
    public final int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr.length < i + i2) {
            throw new RuntimeException("Input buffer too short");
        }
        this.adcel.write(bArr, i, i2);
        return 0;
    }

    @Override // defpackage.mopub
    public final byte[] vip() {
        int i = this.purchase;
        byte[] bArr = new byte[i];
        System.arraycopy(this.yandex, 0, bArr, 0, i);
        return bArr;
    }
}
