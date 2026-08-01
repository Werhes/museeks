package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۦۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4511e {
    public static final long[] ad = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

    public static LinkedHashSet Signature(Set set, Object obj) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC10064e.appmetrica(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static void ad(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    public static final boolean adcel(char c) {
        if (c >= 0 && c < '\t') {
            return true;
        }
        if ('\n' <= c && c < ' ') {
            return true;
        }
        if (('0' <= c && c < ':') || c == ':') {
            return true;
        }
        if ('a' <= c && c < '{') {
            return true;
        }
        if ('A' > c || c >= '[') {
            return 127 <= c && c < 256;
        }
        return true;
    }

    public static void admob(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = j5 ^ ((((j9 >>> 27) ^ (j9 >>> 22)) ^ (j9 >>> 20)) ^ (j9 >>> 15));
        long j11 = j ^ ((((j6 << 37) ^ (j6 << 42)) ^ (j6 << 44)) ^ (j6 << 49));
        long j12 = (j2 ^ ((((j7 << 37) ^ (j7 << 42)) ^ (j7 << 44)) ^ (j7 << 49))) ^ ((((j6 >>> 27) ^ (j6 >>> 22)) ^ (j6 >>> 20)) ^ (j6 >>> 15));
        long j13 = j10 >>> 27;
        jArr2[0] = (((j11 ^ j13) ^ (j13 << 5)) ^ (j13 << 7)) ^ (j13 << 12);
        jArr2[1] = j12;
        jArr2[2] = (j3 ^ ((((j8 << 37) ^ (j8 << 42)) ^ (j8 << 44)) ^ (j8 << 49))) ^ ((((j7 >>> 27) ^ (j7 >>> 22)) ^ (j7 >>> 20)) ^ (j7 >>> 15));
        jArr2[3] = (j4 ^ ((((j9 << 37) ^ (j9 << 42)) ^ (j9 << 44)) ^ (j9 << 49))) ^ ((((j8 >>> 27) ^ (j8 >>> 22)) ^ (j8 >>> 20)) ^ (j8 >>> 15));
        jArr2[4] = 134217727 & j10;
    }

    public static LinkedHashSet advert(Set set, Object obj) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC10064e.appmetrica(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && AbstractC7890e.billing(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static void amazon(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[10];
        appmetrica(jArr, jArr2, jArr4);
        admob(jArr4, jArr3);
    }

    public static void appmetrica(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        license(jArr, jArr4);
        license(jArr2, jArr5);
        long[] jArr6 = new long[26];
        purchase(jArr3, jArr4[0], jArr5[0], jArr6, 0);
        purchase(jArr3, jArr4[1], jArr5[1], jArr6, 2);
        purchase(jArr3, jArr4[2], jArr5[2], jArr6, 4);
        purchase(jArr3, jArr4[3], jArr5[3], jArr6, 6);
        purchase(jArr3, jArr4[4], jArr5[4], jArr6, 8);
        long j = jArr4[0];
        long j2 = j ^ jArr4[1];
        long j3 = jArr5[0];
        long j4 = j3 ^ jArr5[1];
        long j5 = jArr4[2];
        long j6 = j ^ j5;
        long j7 = jArr5[2];
        long j8 = j3 ^ j7;
        long j9 = jArr4[4];
        long j10 = j5 ^ j9;
        long j11 = jArr5[4];
        long j12 = j7 ^ j11;
        long j13 = jArr4[3];
        long j14 = j13 ^ j9;
        long j15 = jArr5[3];
        long j16 = j15 ^ j11;
        purchase(jArr3, j6 ^ j13, j8 ^ j15, jArr6, 18);
        purchase(jArr3, j10 ^ jArr4[1], j12 ^ jArr5[1], jArr6, 20);
        long j17 = j2 ^ j14;
        long j18 = j4 ^ j16;
        long j19 = j17 ^ jArr4[2];
        long j20 = jArr5[2] ^ j18;
        purchase(jArr3, j17, j18, jArr6, 22);
        purchase(jArr3, j19, j20, jArr6, 24);
        purchase(jArr3, j2, j4, jArr6, 10);
        purchase(jArr3, j6, j8, jArr6, 12);
        purchase(jArr3, j10, j12, jArr6, 14);
        purchase(jArr3, j14, j16, jArr6, 16);
        long j21 = jArr6[0];
        jArr3[0] = j21;
        long j22 = jArr6[9];
        jArr3[9] = j22;
        long j23 = jArr6[0];
        long j24 = jArr6[1] ^ j23;
        long j25 = j24 ^ jArr6[2];
        long j26 = j25 ^ jArr6[10];
        jArr3[1] = j26;
        long j27 = jArr6[3] ^ jArr6[4];
        long j28 = j25 ^ (j27 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j28;
        long j29 = j24 ^ j27;
        long j30 = jArr6[5] ^ jArr6[6];
        long j31 = jArr6[8];
        long j32 = (j29 ^ j30) ^ j31;
        long j33 = jArr6[13] ^ jArr6[14];
        long j34 = jArr6[18];
        long j35 = jArr6[22];
        long j36 = jArr6[24];
        long j37 = (j32 ^ j33) ^ ((j34 ^ j35) ^ j36);
        jArr3[3] = j37;
        long j38 = jArr6[7] ^ j31;
        long j39 = jArr6[9];
        long j40 = j38 ^ j39;
        long j41 = j40 ^ jArr6[17];
        jArr3[8] = j41;
        long j42 = (j40 ^ j30) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j42;
        long j43 = jArr6[19] ^ jArr6[20];
        long j44 = jArr6[25];
        long j45 = jArr6[23];
        long j46 = j43 ^ (j44 ^ j36);
        long j47 = (j46 ^ (j34 ^ j45)) ^ (j42 ^ j26);
        jArr3[4] = j47;
        long j48 = jArr6[21];
        long j49 = (j46 ^ (j28 ^ j41)) ^ (j48 ^ j35);
        jArr3[5] = j49;
        long j50 = (((((j23 ^ j32) ^ j39) ^ j33) ^ j48) ^ j45) ^ j44;
        jArr3[6] = j50;
        jArr3[0] = j21 ^ (j26 << 57);
        jArr3[1] = (j26 >>> 7) ^ (j28 << 50);
        jArr3[2] = (j28 >>> 14) ^ (j37 << 43);
        jArr3[3] = (j37 >>> 21) ^ (j47 << 36);
        jArr3[4] = (j47 >>> 28) ^ (j49 << 29);
        jArr3[5] = (j49 >>> 35) ^ (j50 << 22);
        jArr3[6] = (j50 >>> 42) ^ (j42 << 15);
        jArr3[7] = (j42 >>> 49) ^ (j41 << 8);
        jArr3[8] = (j41 >>> 56) ^ (j22 << 1);
        jArr3[9] = j22 >>> 63;
    }

    public static void billing(long[] jArr, long[] jArr2) {
        AbstractC15792e.license(4, jArr, jArr2);
        jArr2[8] = AbstractC15792e.metrica((int) jArr[4]);
    }

    public static void license(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        jArr2[0] = j & 144115188075855871L;
        jArr2[1] = ((j >>> 57) ^ (j2 << 7)) & 144115188075855871L;
        jArr2[2] = ((j2 >>> 50) ^ (j3 << 14)) & 144115188075855871L;
        jArr2[3] = ((j3 >>> 43) ^ (j4 << 21)) & 144115188075855871L;
        jArr2[4] = (j4 >>> 36) ^ (j5 << 28);
    }

    public static LinkedHashSet loadAd(Set set, Iterable iterable) {
        Integer valueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC10064e.appmetrica(valueOf != null ? set.size() + valueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        AbstractC13480e.inmobi(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static C7259e metrica(String str, C12582e c12582e) {
        C9237e vip = C7259e.vip(C7934e.class);
        vip.metrica = 1;
        vip.ad(C8625e.vip(Context.class));
        vip.billing = new C11565e(str, c12582e, 23);
        return vip.vip();
    }

    public static final boolean mopub(char c) {
        if (c < 0 || c >= '0') {
            return 'J' <= c && c < 256;
        }
        return true;
    }

    public static void pro(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void purchase(long[] jArr, long j, long j2, long[] jArr2, int i) {
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
        long j7 = jArr[((int) j) & 7];
        long j8 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j >>> i2);
            long j9 = (jArr[i3 & 7] ^ (jArr[(i3 >>> 3) & 7] << 3)) ^ (jArr[(i3 >>> 6) & 7] << 6);
            j7 ^= j9 << i2;
            j8 ^= j9 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr2[i] = 144115188075855871L & j7;
        jArr2[i + 1] = (((((j & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8) ^ j8) << 7) ^ (j7 >>> 57);
    }

    public static void remoteconfig(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[9];
        billing(jArr, jArr3);
        while (true) {
            admob(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                billing(jArr2, jArr3);
            }
        }
    }

    public static Set smaato(Set set, Iterable iterable) {
        Collection<?> m3575continue = iterable instanceof Collection ? (Collection) iterable : AbstractC13480e.m3575continue(iterable);
        if (m3575continue.isEmpty()) {
            return AbstractC13480e.m3582e(set);
        }
        if (!(m3575continue instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(m3575continue);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) m3575continue).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static final boolean startapp(char c) {
        return '0' <= c && c < ':';
    }

    public static void subscription(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[9];
        billing(jArr, jArr3);
        admob(jArr3, jArr2);
    }

    public static C7259e vip(String str, String str2) {
        C7934e c7934e = new C7934e(str, str2);
        C9237e vip = C7259e.vip(C7934e.class);
        vip.metrica = 1;
        vip.billing = new C0211e(16, c7934e);
        return vip.vip();
    }

    public static final boolean yandex(char c) {
        if (c == '\t') {
            return true;
        }
        if (' ' <= c && c < '0') {
            return true;
        }
        if (';' <= c && c < 'A') {
            return true;
        }
        if ('[' > c || c >= 'a') {
            return '{' <= c && c < 127;
        }
        return true;
    }
}
