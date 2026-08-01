package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۢؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18437e {
    public int ad;
    public byte[] appmetrica;
    public int license = 0;
    public int metrica;
    public int vip;

    public C18437e(byte[] bArr, int i, int i2) {
        this.appmetrica = bArr;
        this.vip = i;
        this.metrica = i;
        this.ad = i2;
        ad();
    }

    public void ad() {
        int i;
        int i2 = this.metrica;
        AbstractC2301e.subscription(i2 >= 0 && (i2 < (i = this.ad) || (i2 == i && this.license == 0)));
    }

    public void adcel(int i) {
        int i2 = this.metrica;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.metrica = i4;
        int i5 = (i - (i3 * 8)) + this.license;
        this.license = i5;
        if (i5 > 7) {
            this.metrica = i4 + 1;
            this.license = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.metrica) {
                ad();
                return;
            } else if (yandex(i2)) {
                this.metrica++;
                i2 += 2;
            }
        }
    }

    public int appmetrica(int i) {
        int i2;
        this.license += i;
        int i3 = 0;
        while (true) {
            i2 = this.license;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.license = i4;
            byte[] bArr = this.appmetrica;
            int i5 = this.metrica;
            i3 |= (bArr[i5] & 255) << i4;
            if (!yandex(i5 + 1)) {
                r3 = 1;
            }
            this.metrica = i5 + r3;
        }
        byte[] bArr2 = this.appmetrica;
        int i6 = this.metrica;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.license = 0;
            this.metrica = i6 + (yandex(i6 + 1) ? 2 : 1);
        }
        ad();
        return i7;
    }

    public int billing() {
        int purchase = purchase();
        return ((purchase + 1) / 2) * (purchase % 2 == 0 ? -1 : 1);
    }

    public boolean license() {
        boolean z = (this.appmetrica[this.metrica] & (128 >> this.license)) != 0;
        startapp();
        return z;
    }

    public boolean metrica() {
        int i = this.metrica;
        int i2 = this.license;
        int i3 = 0;
        while (this.metrica < this.ad && !license()) {
            i3++;
        }
        boolean z = this.metrica == this.ad;
        this.metrica = i;
        this.license = i2;
        return !z && vip((i3 * 2) + 1);
    }

    public int purchase() {
        int i = 0;
        while (!license()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? appmetrica(i) : 0);
    }

    public void startapp() {
        int i = this.license + 1;
        this.license = i;
        if (i == 8) {
            this.license = 0;
            int i2 = this.metrica;
            this.metrica = i2 + (yandex(i2 + 1) ? 2 : 1);
        }
        ad();
    }

    public boolean vip(int i) {
        int i2 = this.metrica;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.license + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 > this.ad) {
                break;
            }
            if (yandex(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.ad;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    public boolean yandex(int i) {
        int i2 = i - 2;
        if (this.vip > i2 || i >= this.ad) {
            return false;
        }
        byte[] bArr = this.appmetrica;
        return bArr[i] == 3 && bArr[i2] == 0 && bArr[i - 1] == 0;
    }
}
