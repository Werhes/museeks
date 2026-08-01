package defpackage;

import java.util.Arrays;

/* renamed from: eُۧۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11412e implements adcel {
    public final InterfaceC2227e ad;
    public final int adcel;
    public byte[] appmetrica;
    public final byte[] billing;
    public boolean license;
    public byte[] purchase;
    public final long[] startapp;
    public final C15612e vip;
    public final InterfaceC17342e yandex;
    public final C15236e mopub = new C15236e(5);
    public final C15236e advert = new C15236e(5);
    public int metrica = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public C11412e(InterfaceC2227e interfaceC2227e) {
        InterfaceC17342e interfaceC17342e;
        this.ad = interfaceC2227e;
        this.vip = new C15612e(new C10847e(interfaceC2227e));
        int isPro = interfaceC2227e.isPro();
        this.adcel = isPro;
        this.appmetrica = new byte[isPro];
        this.billing = new byte[isPro];
        if (isPro == 16) {
            interfaceC17342e = new C6325e((char) 0, 26);
        } else if (isPro == 32) {
            interfaceC17342e = new Object();
        } else {
            if (isPro != 64) {
                throw new IllegalArgumentException("Only 128, 256, and 512 -bit block sizes supported");
            }
            interfaceC17342e = new C6594e(29, false);
        }
        this.yandex = interfaceC17342e;
        this.startapp = new long[isPro >>> 3];
        this.purchase = null;
    }

    @Override // defpackage.mopub
    public final void ad(int i, int i2, byte[] bArr) {
        this.mopub.write(bArr, i, i2);
    }

    @Override // defpackage.mopub
    public final int doFinal(byte[] bArr, int i) {
        int i2;
        int ad;
        long[] jArr;
        C15236e c15236e = this.advert;
        int size = c15236e.size();
        if (!this.license && size < this.metrica) {
            throw new Exception("data too short");
        }
        int i3 = this.adcel;
        byte[] bArr2 = new byte[i3];
        this.ad.tapsense(0, 0, bArr2, bArr2);
        long[] jArr2 = new long[i3 >>> 3];
        AbstractC3628e.Signature(0, bArr2, jArr2);
        InterfaceC17342e interfaceC17342e = this.yandex;
        interfaceC17342e.mo350goto(jArr2);
        Arrays.fill(bArr2, (byte) 0);
        Arrays.fill(jArr2, 0L);
        C15236e c15236e2 = this.mopub;
        int size2 = c15236e2.size();
        if (size2 > 0) {
            byte[] advert = c15236e2.advert();
            for (int i4 = 0; i4 < size2; i4 += i3) {
                int i5 = i4;
                int i6 = 0;
                while (true) {
                    jArr = this.startapp;
                    if (i6 < jArr.length) {
                        jArr[i6] = jArr[i6] ^ AbstractC3628e.loadAd(i5, advert);
                        i5 += 8;
                        i6++;
                    }
                }
                interfaceC17342e.pro(jArr);
            }
        }
        boolean z = this.license;
        C15612e c15612e = this.vip;
        if (!z) {
            i2 = size;
            int i7 = i2 - this.metrica;
            if (bArr.length - i < i7) {
                throw new RuntimeException("Output buffer too short");
            }
            metrica(0, i7, size2, c15236e.advert());
            int startapp = c15612e.startapp(c15236e.advert(), 0, i7, bArr, i);
            ad = c15612e.ad(bArr, i + startapp) + startapp;
        } else {
            if ((bArr.length - i) - this.metrica < size) {
                throw new RuntimeException("Output buffer too short");
            }
            int startapp2 = c15612e.startapp(c15236e.advert(), 0, size, bArr, i);
            i2 = size;
            ad = c15612e.ad(bArr, i + startapp2) + startapp2;
            metrica(i, i2, size2, bArr);
        }
        byte[] bArr3 = this.purchase;
        if (bArr3 == null) {
            throw new IllegalStateException("mac is not calculated");
        }
        if (this.license) {
            System.arraycopy(bArr3, 0, bArr, i + ad, this.metrica);
            license();
            return ad + this.metrica;
        }
        byte[] bArr4 = new byte[this.metrica];
        byte[] advert2 = c15236e.advert();
        int i8 = this.metrica;
        System.arraycopy(advert2, i2 - i8, bArr4, 0, i8);
        int i9 = this.metrica;
        byte[] bArr5 = new byte[i9];
        System.arraycopy(this.purchase, 0, bArr5, 0, i9);
        if (!AbstractC12442e.loadAd(bArr4, bArr5)) {
            throw new Exception("mac verification failed");
        }
        license();
        return ad;
    }

    @Override // defpackage.mopub
    public final String getAlgorithmName() {
        return this.ad.getAlgorithmName() + "/KGCM";
    }

    @Override // defpackage.mopub
    public final int getOutputSize(int i) {
        int size = this.advert.size() + i;
        if (this.license) {
            return size + this.metrica;
        }
        int i2 = this.metrica;
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
        C14915e c14915e;
        this.license = z;
        boolean z2 = interfaceC3894e instanceof smaato;
        int i = this.adcel;
        byte[] bArr = this.billing;
        if (z2) {
            smaato smaatoVar = (smaato) interfaceC3894e;
            byte[] license = AbstractC12442e.license(smaatoVar.f36456e);
            int length = bArr.length - license.length;
            Arrays.fill(bArr, (byte) 0);
            System.arraycopy(license, 0, bArr, length, license.length);
            byte[] license2 = AbstractC12442e.license(smaatoVar.f36458e);
            this.appmetrica = license2;
            int i2 = smaatoVar.f36457e;
            if (i2 < 64 || i2 > (i << 3) || (i2 & 7) != 0) {
                throw new IllegalArgumentException(AbstractC1786e.admob(i2, "Invalid value for MAC size: "));
            }
            this.metrica = i2 >>> 3;
            c14915e = smaatoVar.f36455e;
            if (license2 != null) {
                ad(0, license2.length, license2);
            }
        } else {
            if (!(interfaceC3894e instanceof C11494e)) {
                throw new IllegalArgumentException("Invalid parameter passed");
            }
            C11494e c11494e = (C11494e) interfaceC3894e;
            byte[] bArr2 = c11494e.f23095e;
            int length2 = bArr.length - bArr2.length;
            Arrays.fill(bArr, (byte) 0);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            this.appmetrica = null;
            this.metrica = i;
            c14915e = (C14915e) c11494e.f23094e;
        }
        this.purchase = new byte[i];
        this.vip.purchase(true, new C11494e(c14915e, bArr));
        this.ad.init(true, c14915e);
    }

    public final void license() {
        Arrays.fill(this.startapp, 0L);
        this.ad.reset();
        this.advert.reset();
        this.mopub.reset();
        byte[] bArr = this.appmetrica;
        if (bArr != null) {
            ad(0, bArr.length, bArr);
        }
    }

    public final void metrica(int i, int i2, int i3, byte[] bArr) {
        int i4 = i + i2;
        while (true) {
            int i5 = this.adcel;
            long[] jArr = this.startapp;
            if (i >= i4) {
                jArr[0] = ((i3 & 4294967295L) << 3) ^ jArr[0];
                int i6 = i5 >>> 4;
                jArr[i6] = ((4294967295L & i2) << 3) ^ jArr[i6];
                byte[] bArr2 = new byte[jArr.length * 8];
                AbstractC3628e.remoteconfig(0, bArr2, jArr);
                this.purchase = bArr2;
                this.ad.tapsense(0, 0, bArr2, bArr2);
                return;
            }
            int i7 = i;
            for (int i8 = 0; i8 < jArr.length; i8++) {
                jArr[i8] = jArr[i8] ^ AbstractC3628e.loadAd(i7, bArr);
                i7 += 8;
            }
            this.yandex.pro(jArr);
            i += i5;
        }
    }

    @Override // defpackage.mopub
    public final int processByte(byte b, byte[] bArr, int i) {
        this.advert.write(b);
        return 0;
    }

    @Override // defpackage.mopub
    public final int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr.length < i + i2) {
            throw new RuntimeException("input buffer too short");
        }
        this.advert.write(bArr, i, i2);
        return 0;
    }

    @Override // defpackage.mopub
    public final byte[] vip() {
        int i = this.metrica;
        byte[] bArr = new byte[i];
        System.arraycopy(this.purchase, 0, bArr, 0, i);
        return bArr;
    }
}
