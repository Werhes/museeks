package defpackage;

import android.content.Context;
import android.os.SystemClock;
import androidx.recyclerview.widget.startapp;
import java.io.File;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7902e {
    public static final long[] ad = {2791191049453778211L, 2791191049453778402L, 6};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0079  */
    /* JADX WARN: Type inference failed for: r10v0, types: [eًؗۖ, eَُٖ, eُؑ۠] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [eّؕۖ] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [eٖؖۙ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4, types: [eٌٌَ] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v5, types: [eَٟۙ] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v17, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r4v19, types: [int] */
    /* JADX WARN: Type inference failed for: r4v20, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2, types: [eٖؖۙ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.C1633e r23, android.content.Context r24, defpackage.C16007e r25, defpackage.C11885e r26, defpackage.C10673e r27, defpackage.AbstractC10731e r28) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7902e.ad(eؘّؓ, android.content.Context, eٖؖۙ, eِٞٔ, eَۦۤ, eُؑ۠):java.lang.Object");
    }

    public static void adcel(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[5];
        purchase(jArr, jArr3);
        while (true) {
            startapp(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                purchase(jArr2, jArr3);
            }
        }
    }

    public static File advert(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        throw new IllegalStateException("getFilesDir returned null twice.");
    }

    public static void appmetrica(long[] jArr, long j, long j2, long[] jArr2, int i) {
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
        long j7 = (((jArr[i2 & 7] ^ (jArr[(i2 >>> 3) & 7] << 3)) ^ (jArr[(i2 >>> 6) & 7] << 6)) ^ (jArr[(i2 >>> 9) & 7] << 9)) ^ (jArr[(i2 >>> 12) & 7] << 12);
        long j8 = 0;
        int i3 = 30;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = (((jArr[i4 & 7] ^ (jArr[(i4 >>> 3) & 7] << 3)) ^ (jArr[(i4 >>> 6) & 7] << 6)) ^ (jArr[(i4 >>> 9) & 7] << 9)) ^ (jArr[(i4 >>> 12) & 7] << 12);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 15;
        } while (i3 > 0);
        jArr2[i] = 17592186044415L & j7;
        jArr2[i + 1] = (j7 >>> 44) ^ (j8 << 20);
    }

    public static void billing(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        license(jArr, jArr2, jArr4);
        startapp(jArr4, jArr3);
    }

    public static void license(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = ((jArr[2] << 40) ^ (j2 >>> 24)) & 17592186044415L;
        long j4 = ((j >>> 44) ^ (j2 << 20)) & 17592186044415L;
        long j5 = j & 17592186044415L;
        long j6 = jArr2[0];
        long j7 = jArr2[1];
        long j8 = ((j7 >>> 24) ^ (jArr2[2] << 40)) & 17592186044415L;
        long j9 = ((j6 >>> 44) ^ (j7 << 20)) & 17592186044415L;
        long j10 = j6 & 17592186044415L;
        long[] jArr4 = new long[10];
        appmetrica(jArr3, j5, j10, jArr4, 0);
        appmetrica(jArr3, j3, j8, jArr4, 2);
        long j11 = (j5 ^ j4) ^ j3;
        long j12 = (j10 ^ j9) ^ j8;
        appmetrica(jArr3, j11, j12, jArr4, 4);
        long j13 = (j4 << 1) ^ (j3 << 2);
        long j14 = (j9 << 1) ^ (j8 << 2);
        appmetrica(jArr3, j5 ^ j13, j10 ^ j14, jArr4, 6);
        appmetrica(jArr3, j11 ^ j13, j12 ^ j14, jArr4, 8);
        long j15 = jArr4[6];
        long j16 = jArr4[8] ^ j15;
        long j17 = jArr4[7];
        long j18 = j17 ^ jArr4[9];
        long j19 = (j16 << 1) ^ j15;
        long j20 = (j16 ^ (j18 << 1)) ^ j17;
        long j21 = jArr4[0];
        long j22 = jArr4[1];
        long j23 = (j22 ^ j21) ^ jArr4[4];
        long j24 = j22 ^ jArr4[5];
        long j25 = jArr4[2];
        long j26 = ((j19 ^ j21) ^ (j25 << 4)) ^ (j25 << 1);
        long j27 = jArr4[3];
        long j28 = (((j23 ^ j20) ^ (j27 << 4)) ^ (j27 << 1)) ^ (j26 >>> 44);
        long j29 = (j24 ^ j18) ^ (j28 >>> 44);
        long j30 = ((j26 & 17592186044415L) >>> 1) ^ ((j28 & 1) << 43);
        long j31 = j30 ^ (j30 << 1);
        long j32 = j31 ^ (j31 << 2);
        long j33 = j32 ^ (j32 << 4);
        long j34 = j33 ^ (j33 << 8);
        long j35 = j34 ^ (j34 << 16);
        long j36 = (j35 ^ (j35 << 32)) & 17592186044415L;
        long j37 = (((j28 & 17592186044415L) >>> 1) ^ ((j29 & 1) << 43)) ^ (j36 >>> 43);
        long j38 = j37 ^ (j37 << 1);
        long j39 = j38 ^ (j38 << 2);
        long j40 = j39 ^ (j39 << 4);
        long j41 = j40 ^ (j40 << 8);
        long j42 = j41 ^ (j41 << 16);
        long j43 = 17592186044415L & (j42 ^ (j42 << 32));
        long j44 = (j29 >>> 1) ^ (j43 >>> 43);
        long j45 = j44 ^ (j44 << 1);
        long j46 = j45 ^ (j45 << 2);
        long j47 = j46 ^ (j46 << 4);
        long j48 = j47 ^ (j47 << 8);
        long j49 = j48 ^ (j48 << 16);
        long j50 = j49 ^ (j49 << 32);
        jArr3[0] = j21;
        long j51 = (j23 ^ j36) ^ j25;
        jArr3[1] = j51;
        long j52 = ((j24 ^ j43) ^ j36) ^ j27;
        jArr3[2] = j52;
        long j53 = j43 ^ j50;
        jArr3[3] = j53;
        long j54 = j50 ^ jArr4[2];
        jArr3[4] = j54;
        long j55 = jArr4[3];
        jArr3[5] = j55;
        jArr3[0] = j21 ^ (j51 << 44);
        jArr3[1] = (j51 >>> 20) ^ (j52 << 24);
        jArr3[2] = ((j52 >>> 40) ^ (j53 << 4)) ^ (j54 << 48);
        jArr3[3] = ((j53 >>> 60) ^ (j55 << 28)) ^ (j54 >>> 16);
        jArr3[4] = j55 >>> 36;
        jArr3[5] = 0;
    }

    public static int metrica(int i, int i2, String str, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final void mopub(startapp startappVar, List list) {
        boolean z = startappVar instanceof C1684e;
        if (z) {
            C1684e c1684e = z ? (C1684e) startappVar : null;
            if (c1684e == null) {
                throw new IllegalStateException("Target adapter has other list type! [vertical_grid]");
            }
            c1684e.f4616e.firebase(list);
            return;
        }
        boolean z2 = startappVar instanceof C12952e;
        if (z2) {
            C12952e c12952e = z2 ? (C12952e) startappVar : null;
            if (c12952e == null) {
                throw new IllegalStateException("Target adapter has other list type! [slider]");
            }
            c12952e.f25811e.firebase(list);
            return;
        }
        boolean z3 = startappVar instanceof AbstractC5604e;
        if (z3) {
            AbstractC5604e abstractC5604e = z3 ? (AbstractC5604e) startappVar : null;
            if (abstractC5604e == null) {
                throw new IllegalStateException("Target adapter has other list type! [list]");
            }
            abstractC5604e.firebase(list);
        }
    }

    public static void purchase(long[] jArr, long[] jArr2) {
        AbstractC15792e.license(2, jArr, jArr2);
        int i = ((int) jArr[2]) & 255;
        int i2 = (i | (i << 4)) & 3855;
        int i3 = (i2 | (i2 << 2)) & 13107;
        jArr2[4] = (i3 | (i3 << 1)) & 21845 & 4294967295L;
    }

    public static void startapp(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = j4 ^ (j5 >>> 59);
        long j7 = j ^ ((j6 << 61) ^ (j6 << 63));
        long j8 = (j2 ^ ((j5 << 61) ^ (j5 << 63))) ^ ((((j6 >>> 3) ^ (j6 >>> 1)) ^ j6) ^ (j6 << 5));
        long j9 = (j3 ^ ((((j5 >>> 3) ^ (j5 >>> 1)) ^ j5) ^ (j5 << 5))) ^ (j6 >>> 59);
        long j10 = j9 >>> 3;
        jArr2[0] = (((j7 ^ j10) ^ (j10 << 2)) ^ (j10 << 3)) ^ (j10 << 8);
        jArr2[1] = (j9 >>> 59) ^ j8;
        jArr2[2] = 7 & j9;
    }

    public static void vip(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static long yandex(int i, String str) {
        int metrica = metrica(0, i, str, false);
        Matcher matcher = C18483e.amazon.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (metrica < i) {
            int metrica2 = metrica(metrica + 1, i, str, true);
            matcher.region(metrica, metrica2);
            if (i3 == -1 && matcher.usePattern(C18483e.amazon).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
                i6 = Integer.parseInt(matcher.group(2));
                i7 = Integer.parseInt(matcher.group(3));
            } else if (i4 == -1 && matcher.usePattern(C18483e.smaato).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            } else {
                if (i5 == -1) {
                    Pattern pattern = C18483e.advert;
                    if (matcher.usePattern(pattern).matches()) {
                        i5 = AbstractC5304e.m1861goto(pattern.pattern(), matcher.group(1).toLowerCase(Locale.US), 0, false, 6) / 4;
                    }
                }
                if (i2 == -1 && matcher.usePattern(C18483e.mopub).matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                }
            }
            metrica = metrica(metrica2 + 1, i, str, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i5 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i4 || i4 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i3 < 0 || i3 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i6 < 0 || i6 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i7 < 0 || i7 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(AbstractC16286e.ad);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i5 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i6);
        gregorianCalendar.set(13, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }
}
