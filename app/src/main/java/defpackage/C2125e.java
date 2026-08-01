package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؓ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2125e {
    public final /* synthetic */ int ad;
    public int appmetrica;
    public int license;
    public int metrica;
    public byte[] vip;

    public C2125e() {
        this.ad = 1;
        this.vip = AbstractC9413e.vip;
    }

    public C2125e(int i, int i2) {
        this.ad = 0;
        this.metrica = i;
        this.license = i2;
        this.vip = new byte[(i2 * 2) - 1];
        this.appmetrica = 0;
    }

    public C2125e(int i, byte[] bArr) {
        this.ad = 1;
        this.vip = bArr;
        this.appmetrica = i;
    }

    public C2125e(byte[] bArr) {
        this.ad = 2;
        this.vip = bArr;
        this.metrica = bArr.length;
    }

    public void Signature(int i) {
        AbstractC2301e.subscription(this.license == 0);
        this.metrica += i;
        ad();
    }

    public void ad() {
        int i;
        int i2 = this.metrica;
        AbstractC2301e.subscription(i2 >= 0 && (i2 < (i = this.appmetrica) || (i2 == i && this.license == 0)));
    }

    public void adcel(int i, byte[] bArr) {
        AbstractC2301e.subscription(this.license == 0);
        System.arraycopy(this.vip, this.metrica, bArr, 0, i);
        this.metrica += i;
        ad();
    }

    public void advert(C1292e c1292e) {
        mopub(c1292e.metrica, c1292e.ad);
        smaato(c1292e.vip * 8);
    }

    public void amazon() {
        int i = this.license + 1;
        this.license = i;
        if (i == 8) {
            this.license = 0;
            this.metrica++;
        }
        ad();
    }

    public int appmetrica() {
        return (this.metrica * 8) + this.license;
    }

    public int billing(int i) {
        switch (this.ad) {
            case 1:
                if (i == 0) {
                    return 0;
                }
                this.license += i;
                int i2 = 0;
                while (true) {
                    int i3 = this.license;
                    if (i3 <= 8) {
                        byte[] bArr = this.vip;
                        int i4 = this.metrica;
                        int i5 = ((-1) >>> (32 - i)) & (i2 | ((bArr[i4] & 255) >> (8 - i3)));
                        if (i3 == 8) {
                            this.license = 0;
                            this.metrica = i4 + 1;
                        }
                        ad();
                        return i5;
                    }
                    int i6 = i3 - 8;
                    this.license = i6;
                    byte[] bArr2 = this.vip;
                    int i7 = this.metrica;
                    this.metrica = i7 + 1;
                    i2 |= (bArr2[i7] & 255) << i6;
                }
            default:
                int i8 = this.license;
                int min = Math.min(i, 8 - this.appmetrica);
                byte[] bArr3 = this.vip;
                int i9 = i8 + 1;
                int i10 = ((bArr3[i8] & 255) >> this.appmetrica) & (255 >> (8 - min));
                while (min < i) {
                    i10 |= (bArr3[i9] & 255) << min;
                    min += 8;
                    i9++;
                }
                int i11 = i10 & ((-1) >>> (32 - i));
                loadAd(i);
                return i11;
        }
    }

    public int license() {
        AbstractC2301e.subscription(this.license == 0);
        return this.metrica;
    }

    public void loadAd(int i) {
        int i2;
        switch (this.ad) {
            case 1:
                int i3 = i / 8;
                int i4 = this.metrica + i3;
                this.metrica = i4;
                int i5 = (i - (i3 * 8)) + this.license;
                this.license = i5;
                if (i5 > 7) {
                    this.metrica = i4 + 1;
                    this.license = i5 - 8;
                }
                ad();
                return;
            default:
                int i6 = i / 8;
                int i7 = this.license + i6;
                this.license = i7;
                int i8 = (i - (i6 * 8)) + this.appmetrica;
                this.appmetrica = i8;
                boolean z = true;
                if (i8 > 7) {
                    this.license = i7 + 1;
                    this.appmetrica = i8 - 8;
                }
                int i9 = this.license;
                if (i9 < 0 || (i9 >= (i2 = this.metrica) && (i9 != i2 || this.appmetrica != 0))) {
                    z = false;
                }
                AbstractC2301e.subscription(z);
                return;
        }
    }

    public void metrica() {
        if (this.license == 0) {
            return;
        }
        this.license = 0;
        this.metrica++;
        ad();
    }

    public void mopub(int i, byte[] bArr) {
        this.vip = bArr;
        this.metrica = 0;
        this.license = 0;
        this.appmetrica = i;
    }

    public boolean purchase() {
        switch (this.ad) {
            case 1:
                boolean z = (this.vip[this.metrica] & (128 >> this.license)) != 0;
                amazon();
                return z;
            default:
                boolean z2 = (((this.vip[this.license] & 255) >> this.appmetrica) & 1) == 1;
                loadAd(1);
                return z2;
        }
    }

    public void smaato(int i) {
        int i2 = i / 8;
        this.metrica = i2;
        this.license = i - (i2 * 8);
        ad();
    }

    public long startapp(int i) {
        if (i <= 32) {
            int billing = billing(i);
            String str = AbstractC9413e.ad;
            return 4294967295L & billing;
        }
        int billing2 = billing(i - 32);
        int billing3 = billing(32);
        String str2 = AbstractC9413e.ad;
        return (4294967295L & billing3) | ((billing2 & 4294967295L) << 32);
    }

    public int vip() {
        return ((this.appmetrica - this.metrica) * 8) - this.license;
    }

    public void yandex(int i, byte[] bArr) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.vip;
            int i4 = this.metrica;
            int i5 = i4 + 1;
            this.metrica = i5;
            byte b = bArr2[i4];
            int i6 = this.license;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.license;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.vip;
            int i9 = this.metrica;
            this.metrica = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.license = i8 - 8;
        }
        int i10 = this.license + i7;
        this.license = i10;
        byte[] bArr4 = this.vip;
        int i11 = this.metrica;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.license = 0;
            this.metrica = i11 + 1;
        }
        ad();
    }
}
