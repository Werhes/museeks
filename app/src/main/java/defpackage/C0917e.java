package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؒۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0917e {
    public transient Object[] ad;
    public transient long[] appmetrica;
    public transient int billing;
    public transient int[] license;
    public transient int metrica;
    public transient float purchase;
    public transient int[] vip;

    public final void ad(int i) {
        if (i > this.appmetrica.length) {
            purchase(i);
        }
        if (i >= this.billing) {
            billing(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    public final void appmetrica(int i, Object obj) {
        long j;
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "count must be positive but was: "));
        }
        long[] jArr = this.appmetrica;
        Object[] objArr = this.ad;
        int[] iArr = this.vip;
        int appmetrica = AbstractC3192e.appmetrica(obj);
        int[] iArr2 = this.license;
        int length = (iArr2.length - 1) & appmetrica;
        int i2 = this.metrica;
        int i3 = iArr2[length];
        if (i3 == -1) {
            iArr2[length] = i2;
            j = 4294967295L;
        } else {
            while (true) {
                long j2 = jArr[i3];
                j = 4294967295L;
                if (((int) (j2 >>> 32)) == appmetrica && AbstractC13328e.metrica(obj, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return;
                } else {
                    int i5 = (int) j2;
                    if (i5 == -1) {
                        jArr[i3] = ((-4294967296L) & j2) | (i2 & 4294967295L);
                        break;
                    }
                    i3 = i5;
                }
            }
        }
        int i6 = Alert.DURATION_SHOW_INDEFINITELY;
        if (i2 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i7 = i2 + 1;
        int length2 = this.appmetrica.length;
        if (i7 > length2) {
            int max = Math.max(1, length2 >>> 1) + length2;
            if (max >= 0) {
                i6 = max;
            }
            if (i6 != length2) {
                purchase(i6);
            }
        }
        this.appmetrica[i2] = (appmetrica << 32) | j;
        this.ad[i2] = obj;
        this.vip[i2] = i;
        this.metrica = i7;
        if (i2 >= this.billing) {
            billing(this.license.length * 2);
        }
    }

    public final void billing(int i) {
        if (this.license.length >= 1073741824) {
            this.billing = Alert.DURATION_SHOW_INDEFINITELY;
            return;
        }
        int i2 = ((int) (i * this.purchase)) + 1;
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        long[] jArr = this.appmetrica;
        int i3 = i - 1;
        for (int i4 = 0; i4 < this.metrica; i4++) {
            int i5 = (int) (jArr[i4] >>> 32);
            int i6 = i5 & i3;
            int i7 = iArr[i6];
            iArr[i6] = i4;
            jArr[i4] = (i5 << 32) | (i7 & 4294967295L);
        }
        this.billing = i2;
        this.license = iArr;
    }

    public final void license(int i) {
        AbstractC2301e.yandex(i >= 0, "Initial capacity must be non-negative");
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (1.0f * highestOneBit)) && (highestOneBit = highestOneBit << 1) <= 0) {
            highestOneBit = 1073741824;
        }
        int[] iArr = new int[highestOneBit];
        Arrays.fill(iArr, -1);
        this.license = iArr;
        this.purchase = 1.0f;
        this.ad = new Object[i];
        this.vip = new int[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.appmetrica = jArr;
        this.billing = Math.max(1, (int) (highestOneBit * 1.0f));
    }

    public final int metrica(Object obj) {
        int appmetrica = AbstractC3192e.appmetrica(obj);
        int i = this.license[(r1.length - 1) & appmetrica];
        while (i != -1) {
            long j = this.appmetrica[i];
            if (((int) (j >>> 32)) == appmetrica && AbstractC13328e.metrica(obj, this.ad[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public final void purchase(int i) {
        this.ad = Arrays.copyOf(this.ad, i);
        this.vip = Arrays.copyOf(this.vip, i);
        long[] jArr = this.appmetrica;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1L);
        }
        this.appmetrica = copyOf;
    }

    public final int vip(Object obj) {
        int metrica = metrica(obj);
        if (metrica == -1) {
            return 0;
        }
        return this.vip[metrica];
    }
}
