package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٔؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4107e {
    public static final byte[] ad = {48, 49, 53, 0};
    public static final byte[] vip = {48, 49, 48, 0};
    public static final byte[] metrica = {48, 48, 57, 0};
    public static final byte[] license = {48, 48, 53, 0};
    public static final byte[] appmetrica = {48, 48, 49, 0};
    public static final byte[] purchase = {48, 48, 49, 0};
    public static final byte[] billing = {48, 48, 50, 0};

    public static void ad(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void adcel(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        AbstractC15792e.license(4, jArr, jArr3);
        startapp(jArr3, jArr2);
    }

    public static final int advert(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public static boolean amazon(AbstractC16117e abstractC16117e, Collection collection) {
        collection.getClass();
        if (collection instanceof InterfaceC4845e) {
            collection = ((InterfaceC4845e) collection).ad();
        }
        boolean z = false;
        if (!(collection instanceof Set) || collection.size() <= abstractC16117e.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z |= abstractC16117e.remove(it.next());
            }
            return z;
        }
        Iterator<E> it2 = abstractC16117e.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    public static void appmetrica(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = (j3 >>> 49) ^ (j4 << 15);
    }

    public static void billing(long[] jArr, long j, long j2, long[] jArr2, int i) {
        jArr[1] = j2;
        long j3 = j2 << 1;
        jArr[2] = j3;
        long j4 = j3 ^ j2;
        jArr[3] = j4;
        long j5 = j2 << 2;
        jArr[4] = j5;
        jArr[5] = j5 ^ j2;
        long j6 = j4 << 1;
        jArr[6] = j6;
        jArr[7] = j6 ^ j2;
        int i2 = (int) j;
        long j7 = (jArr[(i2 >>> 3) & 7] << 3) ^ jArr[i2 & 7];
        long j8 = 0;
        int i3 = 54;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = jArr[i4 & 7] ^ (jArr[(i4 >>> 3) & 7] << 3);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr2[i] = jArr2[i] ^ (576460752303423487L & j7);
        int i5 = i + 1;
        jArr2[i5] = jArr2[i5] ^ ((j7 >>> 59) ^ (j8 << 5));
    }

    public static final Object license(InterfaceC16719e interfaceC16719e) {
        Object signatures = interfaceC16719e.signatures();
        C2365e c2365e = signatures instanceof C2365e ? (C2365e) signatures : null;
        if (c2365e != null) {
            return c2365e.f5926e;
        }
        return null;
    }

    public static final Integer metrica(C0690e c0690e, AbstractC5830e abstractC5830e, int i, int i2) {
        Integer metrica2;
        int[] iArr = c0690e.vip;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (c0690e.adcel(i) && c0690e.startapp(i) == 206 && AbstractC7890e.billing(c0690e.Signature(iArr, i), AbstractC1889e.appmetrica)) {
                Object yandex = c0690e.yandex(i, 0);
                InterfaceC9374e interfaceC9374e = yandex instanceof InterfaceC9374e ? (InterfaceC9374e) yandex : null;
                Object applovin = interfaceC9374e != null ? interfaceC9374e.applovin() : null;
                C5598e c5598e = applovin instanceof C5598e ? (C5598e) applovin : null;
                if (c5598e != null && c5598e.f11954e.equals(abstractC5830e)) {
                    return Integer.valueOf(i);
                }
            }
            if (c0690e.license(i) && (metrica2 = metrica(c0690e, abstractC5830e, i + 1, i3)) != null) {
                return Integer.valueOf(metrica2.intValue());
            }
            i = i3;
        }
    }

    public static void mopub(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        AbstractC15792e.license(4, jArr, jArr3);
        while (true) {
            startapp(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC15792e.license(4, jArr2, jArr3);
            }
        }
    }

    public static void purchase(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        appmetrica(jArr, jArr4);
        appmetrica(jArr2, jArr5);
        long[] jArr6 = new long[8];
        billing(jArr6, jArr4[0], jArr5[0], jArr3, 0);
        billing(jArr6, jArr4[1], jArr5[1], jArr3, 1);
        billing(jArr6, jArr4[2], jArr5[2], jArr3, 2);
        billing(jArr6, jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        billing(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        billing(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[3] ^ jArr5[1];
        billing(jArr6, j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr7 = new long[3];
        billing(jArr6, j, j3, jArr7, 0);
        billing(jArr6, j2, j4, jArr7, 1);
        long j5 = jArr7[0];
        long j6 = jArr7[1];
        long j7 = jArr7[2];
        long j8 = jArr3[2] ^ j5;
        jArr3[2] = j8;
        long j9 = jArr3[3] ^ (j5 ^ j6);
        jArr3[3] = j9;
        long j10 = jArr3[4] ^ (j6 ^ j7);
        jArr3[4] = j10;
        long j11 = jArr3[5] ^ j7;
        jArr3[5] = j11;
        long j12 = jArr3[0];
        long j13 = jArr3[1];
        long j14 = jArr3[6];
        long j15 = jArr3[7];
        jArr3[0] = j12 ^ (j13 << 59);
        jArr3[1] = (j13 >>> 5) ^ (j8 << 54);
        jArr3[2] = (j8 >>> 10) ^ (j9 << 49);
        jArr3[3] = (j9 >>> 15) ^ (j10 << 44);
        jArr3[4] = (j10 >>> 20) ^ (j11 << 39);
        jArr3[5] = (j11 >>> 25) ^ (j14 << 34);
        jArr3[6] = (j14 >>> 30) ^ (j15 << 29);
        jArr3[7] = j15 >>> 35;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eؘؘۚ, eٌٚۤ] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList smaato(C0690e c0690e, int i, Integer num) {
        ?? c8793e = new C8793e(0, c0690e);
        int admob = c0690e.admob(i);
        C3155e ad2 = c0690e.ad(i);
        while (i >= 0) {
            c8793e.appmetrica(c0690e.startapp(i), c0690e.mopub(i) ? c0690e.Signature(c0690e.vip, i) : C2987e.ad, c0690e.ad.smaato(i), num);
            if (admob >= 0) {
                C3155e c3155e = ad2;
                ad2 = c0690e.ad(admob);
                i = admob;
                admob = c0690e.admob(admob);
                num = c3155e;
            } else {
                i = admob;
                num = ad2;
            }
        }
        return c8793e.f12432e;
    }

    public static void startapp(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j6 ^ (j8 >>> 31);
        long j10 = (j5 ^ ((j8 >>> 41) ^ (j8 << 33))) ^ (j7 >>> 31);
        long j11 = ((j4 ^ (j8 << 23)) ^ ((j7 >>> 41) ^ (j7 << 33))) ^ (j9 >>> 31);
        long j12 = j ^ (j10 << 23);
        long j13 = (j2 ^ (j9 << 23)) ^ ((j10 >>> 41) ^ (j10 << 33));
        long j14 = ((j3 ^ (j7 << 23)) ^ ((j9 >>> 41) ^ (j9 << 33))) ^ (j10 >>> 31);
        long j15 = j11 >>> 41;
        jArr2[0] = j12 ^ j15;
        jArr2[1] = (j15 << 10) ^ j13;
        jArr2[2] = j14;
        jArr2[3] = 2199023255551L & j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [eؘؘۚ, eٌٚۤ] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [eؕؗٞ] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List vip(C14479e c14479e, Integer num, int i, Integer num2) {
        int i2;
        int remoteconfig;
        C12328e c12328e;
        if (c14479e.isVip || c14479e.Signature() == 0) {
            return C13664e.f27089e;
        }
        ?? c8793e = new C8793e(1, c14479e);
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = c14479e.tapsense;
            if (i2 < 0) {
                i2 = c14479e.firebase(c14479e.vip, i);
            }
        }
        if (num == 0) {
            int m3822try = c14479e.startapp - c14479e.m3822try(c14479e.vip, c14479e.subscription(i));
            C3123e c3123e = c14479e.remoteconfig;
            num = Integer.valueOf(m3822try + ((c3123e == null || (c12328e = (C12328e) c3123e.vip(i)) == null) ? 0 : c12328e.vip));
        }
        int subscription = c14479e.subscription(i) * 5;
        int[] iArr = c14479e.vip;
        if (subscription < iArr.length) {
            remoteconfig = c14479e.remoteconfig(i);
        } else {
            int firebase = i2 >= 0 ? c14479e.firebase(iArr, i2) : i2;
            remoteconfig = c14479e.remoteconfig(i2);
            int i3 = i2;
            i2 = firebase;
            i = i3;
        }
        while (i >= 0) {
            c8793e.appmetrica(remoteconfig, (c14479e.vip[(c14479e.subscription(i) * 5) + 1] & 536870912) != 0 ? c14479e.pro(i) : C2987e.ad, c14479e.m3819protected(i), num);
            num = c14479e.vip(i);
            if (i2 >= 0) {
                int firebase2 = c14479e.firebase(c14479e.vip, i2);
                remoteconfig = c14479e.remoteconfig(i2);
                int i4 = i2;
                i2 = firebase2;
                i = i4;
            } else {
                i = i2;
            }
        }
        return c8793e.f12432e;
    }

    public static void yandex(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        purchase(jArr, jArr2, jArr4);
        startapp(jArr4, jArr3);
    }
}
