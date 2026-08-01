package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۖۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2025e {
    public final /* synthetic */ int ad;
    public int metrica;
    public int[] vip;

    public C2025e(byte b, int i) {
        this.ad = i;
        switch (i) {
            case 2:
                this.vip = new int[10];
                return;
            case 3:
                this.vip = new int[30];
                return;
            default:
                return;
        }
    }

    public C2025e(int i) {
        this.ad = 1;
        this.vip = new int[i];
    }

    public static long vip(boolean z, int i, int i2, int i3, int i4) {
        int i5 = z ? i3 : i4;
        if (z) {
            i3 = i4;
        }
        if (i < i2) {
            return AbstractC9262e.metrica(i, i);
        }
        if (i == i2) {
            return i5 == 0 ? AbstractC9262e.metrica(i2, i3 + i2) : AbstractC9262e.metrica(i2, i2);
        }
        if (i < i2 + i5) {
            return i3 == 0 ? AbstractC9262e.metrica(i2, i2) : AbstractC9262e.metrica(i2, i3 + i2);
        }
        int i6 = (i - i5) + i3;
        return AbstractC9262e.metrica(i6, i6);
    }

    public long ad(int i, boolean z) {
        int i2;
        int i3;
        int[] iArr = this.vip;
        int i4 = this.metrica;
        if (i4 < 0) {
            i2 = i;
            i3 = i2;
        } else if (z) {
            int i5 = i;
            int i6 = 0;
            int i7 = i5;
            while (i6 < i4) {
                int i8 = i6 * 3;
                int i9 = iArr[i8];
                int i10 = iArr[i8 + 1];
                int i11 = iArr[i8 + 2];
                long vip = vip(z, i7, i9, i10, i11);
                long vip2 = vip(z, i5, i9, i10, i11);
                int i12 = C12347e.metrica;
                int min = Math.min((int) (vip >> 32), (int) (vip2 >> 32));
                i5 = Math.max((int) (vip & 4294967295L), (int) (vip2 & 4294967295L));
                i6++;
                i7 = min;
            }
            i2 = i7;
            i3 = i5;
        } else {
            i3 = i;
            i2 = i3;
            for (int i13 = i4 - 1; -1 < i13; i13--) {
                int i14 = i13 * 3;
                int i15 = iArr[i14];
                int i16 = iArr[i14 + 1];
                int i17 = iArr[i14 + 2];
                long vip3 = vip(z, i2, i15, i16, i17);
                long vip4 = vip(z, i3, i15, i16, i17);
                int i18 = C12347e.metrica;
                i2 = Math.min((int) (vip3 >> 32), (int) (vip4 >> 32));
                i3 = Math.max((int) (vip3 & 4294967295L), (int) (vip4 & 4294967295L));
            }
        }
        return AbstractC9262e.metrica(i2, i3);
    }

    public void adcel(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.vip;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    advert(i3, i4);
                }
            }
            advert(i3 + 3, i2);
            adcel(i, i3);
            adcel(i3 + 6, i2);
        }
    }

    public void advert(int i, int i2) {
        int[] iArr = this.vip;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    public void appmetrica(int i) {
        int[] iArr = this.vip;
        if (this.metrica >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.vip = iArr;
        }
        int i2 = this.metrica;
        this.metrica = i2 + 1;
        iArr[i2] = i;
    }

    public void billing(int i, int i2, int i3, int i4) {
        int i5 = this.metrica;
        int[] iArr = this.vip;
        int i6 = i5 + 4;
        if (i6 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.vip = iArr;
        }
        iArr[i5] = i;
        iArr[i5 + 1] = i2;
        iArr[i5 + 2] = i3;
        iArr[i5 + 3] = i4;
        this.metrica = i6;
    }

    public int license() {
        int[] iArr = this.vip;
        int i = this.metrica - 1;
        this.metrica = i;
        return iArr[i];
    }

    public int metrica(int i) {
        int i2 = this.metrica - 1;
        return i2 >= 0 ? this.vip[i2] : i;
    }

    public void mopub(int i, int i2, int i3) {
        if (!(i3 >= 0)) {
            AbstractC8889e.ad("Expected newLen to be ≥ 0, was " + i3);
        }
        int min = Math.min(i, i2);
        int max = Math.max(min, i2) - min;
        if (max >= 2 || max != i3) {
            int i4 = this.metrica + 1;
            int[] iArr = this.vip;
            if (i4 > iArr.length / 3) {
                this.vip = Arrays.copyOf(this.vip, Math.max(i4 * 2, (iArr.length / 3) * 2) * 3);
            }
            int[] iArr2 = this.vip;
            int i5 = this.metrica * 3;
            iArr2[i5] = min;
            iArr2[i5 + 1] = max;
            iArr2[i5 + 2] = i3;
            this.metrica = i4;
        }
    }

    public void purchase(int i, int i2, int i3) {
        int i4 = this.metrica;
        int[] iArr = this.vip;
        int i5 = i4 + 3;
        if (i5 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.vip = iArr;
        }
        iArr[i4] = i + i3;
        iArr[i4 + 1] = i2 + i3;
        iArr[i4 + 2] = i3;
        this.metrica = i5;
    }

    public void startapp(boolean z) {
        int i = this.metrica;
        int[] iArr = this.vip;
        if (i == iArr.length * 8) {
            this.vip = Arrays.copyOf(iArr, iArr.length + 32);
        }
        if (z) {
            int[] iArr2 = this.vip;
            int i2 = this.metrica;
            iArr2[i2 / 8] = (128 >>> (i2 % 8)) | iArr2[i2 / 8];
        }
        this.metrica++;
    }

    public String toString() {
        switch (this.ad) {
            case 0:
                StringBuilder sb = new StringBuilder();
                int i = this.metrica;
                for (int i2 = 0; i2 < i; i2++) {
                    sb.append(((this.vip[i2 / 8] >>> (7 - (i2 % 8))) & 1) == 1 ? '1' : '0');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void yandex(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            boolean z = true;
            if (((i >>> ((i2 - i3) - 1)) & 1) != 1) {
                z = false;
            }
            startapp(z);
        }
    }
}
