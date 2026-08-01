package defpackage;

import java.util.Arrays;

/* renamed from: e٘ٗٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17807e implements adcel {
    public C3331e ad;
    public int adcel;
    public byte[] advert;
    public byte[] appmetrica;
    public byte[] billing;
    public C5828e license;
    public int metrica;
    public boolean mopub;
    public byte[] purchase;
    public byte[] startapp;
    public boolean vip;
    public int yandex;

    @Override // defpackage.mopub
    public final void ad(int i, int i2, byte[] bArr) {
        if (this.mopub) {
            throw new IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
        }
        this.license.update(bArr, i, i2);
    }

    public final int appmetrica(byte b, byte[] bArr, int i) {
        int tapsense;
        C5828e c5828e = this.license;
        C3331e c3331e = this.ad;
        int i2 = this.metrica;
        byte[] bArr2 = this.startapp;
        int i3 = this.adcel;
        int i4 = i3 + 1;
        this.adcel = i4;
        bArr2[i3] = b;
        if (i4 != bArr2.length) {
            return 0;
        }
        if (bArr.length < i + i2) {
            throw new RuntimeException("Output buffer is too short");
        }
        if (this.vip) {
            tapsense = c3331e.tapsense(0, i, bArr2, bArr);
            c5828e.update(bArr, i, i2);
        } else {
            c5828e.update(bArr2, 0, i2);
            tapsense = c3331e.tapsense(0, i, this.startapp, bArr);
        }
        this.adcel = 0;
        if (!this.vip) {
            byte[] bArr3 = this.startapp;
            System.arraycopy(bArr3, i2, bArr3, 0, this.yandex);
            this.adcel = this.yandex;
        }
        return tapsense;
    }

    @Override // defpackage.mopub
    public final int doFinal(byte[] bArr, int i) {
        byte[] bArr2 = this.billing;
        C5828e c5828e = this.license;
        C3331e c3331e = this.ad;
        license();
        int i2 = this.adcel;
        byte[] bArr3 = this.startapp;
        byte[] bArr4 = new byte[bArr3.length];
        this.adcel = 0;
        if (this.vip) {
            int i3 = i + i2;
            if (bArr.length < this.yandex + i3) {
                throw new RuntimeException("Output buffer too short");
            }
            c3331e.tapsense(0, 0, bArr3, bArr4);
            System.arraycopy(bArr4, 0, bArr, i, i2);
            c5828e.update(bArr4, 0, i2);
            metrica();
            System.arraycopy(bArr2, 0, bArr, i3, this.yandex);
            purchase(false);
            return i2 + this.yandex;
        }
        int i4 = this.yandex;
        if (i2 < i4) {
            throw new Exception("data too short");
        }
        if (bArr.length < (i + i2) - i4) {
            throw new RuntimeException("Output buffer too short");
        }
        if (i2 > i4) {
            c5828e.update(bArr3, 0, i2 - i4);
            c3331e.tapsense(0, 0, this.startapp, bArr4);
            System.arraycopy(bArr4, 0, bArr, i, i2 - this.yandex);
        }
        metrica();
        byte[] bArr5 = this.startapp;
        int i5 = i2 - this.yandex;
        int i6 = 0;
        for (int i7 = 0; i7 < this.yandex; i7++) {
            i6 |= bArr2[i7] ^ bArr5[i5 + i7];
        }
        if (i6 != 0) {
            throw new Exception("mac check in EAX failed");
        }
        purchase(false);
        return i2 - this.yandex;
    }

    @Override // defpackage.mopub
    public final String getAlgorithmName() {
        return this.ad.f34404e.getAlgorithmName() + "/EAX";
    }

    @Override // defpackage.mopub
    public final int getOutputSize(int i) {
        int i2 = i + this.adcel;
        if (this.vip) {
            return i2 + this.yandex;
        }
        int i3 = this.yandex;
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    @Override // defpackage.adcel
    public final InterfaceC2227e getUnderlyingCipher() {
        return this.ad.f34404e;
    }

    @Override // defpackage.mopub
    public final int getUpdateOutputSize(int i) {
        int i2 = i + this.adcel;
        if (!this.vip) {
            int i3 = this.yandex;
            if (i2 < i3) {
                return 0;
            }
            i2 -= i3;
        }
        return i2 - (i2 % this.metrica);
    }

    @Override // defpackage.mopub
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        byte[] bArr;
        InterfaceC3894e interfaceC3894e2;
        byte[] bArr2 = this.appmetrica;
        int i = this.metrica;
        C5828e c5828e = this.license;
        this.vip = z;
        if (interfaceC3894e instanceof smaato) {
            smaato smaatoVar = (smaato) interfaceC3894e;
            bArr = AbstractC12442e.license(smaatoVar.f36456e);
            this.advert = AbstractC12442e.license(smaatoVar.f36458e);
            this.yandex = smaatoVar.f36457e / 8;
            interfaceC3894e2 = smaatoVar.f36455e;
        } else {
            if (!(interfaceC3894e instanceof C11494e)) {
                throw new IllegalArgumentException("invalid parameters passed to EAX");
            }
            C11494e c11494e = (C11494e) interfaceC3894e;
            bArr = c11494e.f23095e;
            this.advert = null;
            this.yandex = c5828e.f12282e / 2;
            interfaceC3894e2 = c11494e.f23094e;
        }
        this.startapp = new byte[z ? i : this.yandex + i];
        byte[] bArr3 = new byte[i];
        c5828e.init(interfaceC3894e2);
        bArr3[i - 1] = 0;
        c5828e.update(bArr3, 0, i);
        c5828e.update(bArr, 0, bArr.length);
        c5828e.doFinal(bArr2, 0);
        this.ad.init(true, new C11494e(interfaceC3894e2, bArr2));
        purchase(true);
    }

    public final void license() {
        C5828e c5828e = this.license;
        if (this.mopub) {
            return;
        }
        this.mopub = true;
        c5828e.doFinal(this.purchase, 0);
        int i = this.metrica;
        byte[] bArr = new byte[i];
        bArr[i - 1] = 2;
        c5828e.update(bArr, 0, i);
    }

    public final void metrica() {
        byte[] bArr = new byte[this.metrica];
        int i = 0;
        this.license.doFinal(bArr, 0);
        while (true) {
            byte[] bArr2 = this.billing;
            if (i >= bArr2.length) {
                return;
            }
            bArr2[i] = (byte) ((this.appmetrica[i] ^ this.purchase[i]) ^ bArr[i]);
            i++;
        }
    }

    @Override // defpackage.mopub
    public final int processByte(byte b, byte[] bArr, int i) {
        license();
        return appmetrica(b, bArr, i);
    }

    @Override // defpackage.mopub
    public final int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        license();
        if (bArr.length < i + i2) {
            throw new RuntimeException("Input buffer too short");
        }
        if (bArr == bArr2 && AbstractC12442e.m3347class(i, i2, i3, getUpdateOutputSize(i2))) {
            bArr = new byte[i2];
            System.arraycopy(bArr2, i, bArr, 0, i2);
            i = 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 != i2; i5++) {
            i4 += appmetrica(bArr[i + i5], bArr2, i3 + i4);
        }
        return i4;
    }

    public final void purchase(boolean z) {
        this.ad.reset();
        C5828e c5828e = this.license;
        c5828e.reset();
        this.adcel = 0;
        Arrays.fill(this.startapp, (byte) 0);
        if (z) {
            Arrays.fill(this.billing, (byte) 0);
        }
        int i = this.metrica;
        byte[] bArr = new byte[i];
        bArr[i - 1] = 1;
        c5828e.update(bArr, 0, i);
        this.mopub = false;
        byte[] bArr2 = this.advert;
        if (bArr2 != null) {
            ad(0, bArr2.length, bArr2);
        }
    }

    @Override // defpackage.mopub
    public final byte[] vip() {
        int i = this.yandex;
        byte[] bArr = new byte[i];
        System.arraycopy(this.billing, 0, bArr, 0, i);
        return bArr;
    }
}
