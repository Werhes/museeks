package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.model.Alert;
import java.lang.ref.WeakReference;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؚؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7023e {
    public static final int[][] ad = {new int[0], new int[]{6, 18}, new int[]{6, 22}, new int[]{6, 26}, new int[]{6, 30}, new int[]{6, 34}, new int[]{6, 22, 38}, new int[]{6, 24, 42}, new int[]{6, 26, 46}, new int[]{6, 28, 50}, new int[]{6, 30, 54}, new int[]{6, 32, 58}, new int[]{6, 34, 62}, new int[]{6, 26, 46, 66}, new int[]{6, 26, 48, 70}, new int[]{6, 26, 50, 74}, new int[]{6, 30, 54, 78}, new int[]{6, 30, 56, 82}, new int[]{6, 30, 58, 86}, new int[]{6, 34, 62, 90}, new int[]{6, 28, 50, 72, 94}, new int[]{6, 26, 50, 74, 98}, new int[]{6, 30, 54, 78, 102}, new int[]{6, 28, 54, 80, 106}, new int[]{6, 32, 58, 84, 110}, new int[]{6, 30, 58, 86, 114}, new int[]{6, 34, 62, 90, 118}, new int[]{6, 26, 50, 74, 98, 122}, new int[]{6, 30, 54, 78, 102, 126}, new int[]{6, 26, 52, 78, 104, 130}, new int[]{6, 30, 56, 82, 108, 134}, new int[]{6, 34, 60, 86, 112, 138}, new int[]{6, 30, 58, 86, 114, 142}, new int[]{6, 34, 62, 90, 118, 146}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][][] vip = {new int[][]{new int[]{41, 25, 17, 10}, new int[]{34, 20, 14, 8}, new int[]{27, 16, 11, 7}, new int[]{17, 10, 7, 4}}, new int[][]{new int[]{77, 47, 32, 20}, new int[]{63, 38, 26, 16}, new int[]{48, 29, 20, 12}, new int[]{34, 20, 14, 8}}, new int[][]{new int[]{127, 77, 53, 32}, new int[]{EnergyProfile.EVCONNECTOR_TYPE_OTHER, 61, 42, 26}, new int[]{77, 47, 32, 20}, new int[]{58, 35, 24, 15}}, new int[][]{new int[]{187, 114, 78, 48}, new int[]{149, 90, 62, 38}, new int[]{111, 67, 46, 28}, new int[]{82, 50, 34, 21}}, new int[][]{new int[]{255, 154, 106, 65}, new int[]{202, 122, 84, 52}, new int[]{144, 87, 60, 37}, new int[]{106, 64, 44, 27}}, new int[][]{new int[]{322, 195, 134, 82}, new int[]{255, 154, 106, 65}, new int[]{178, 108, 74, 45}, new int[]{139, 84, 58, 36}}, new int[][]{new int[]{370, 224, 154, 95}, new int[]{293, 178, 122, 75}, new int[]{207, 125, 86, 53}, new int[]{154, 93, 64, 39}}, new int[][]{new int[]{461, 279, 192, 118}, new int[]{365, 221, 152, 93}, new int[]{259, 157, 108, 66}, new int[]{202, 122, 84, 52}}, new int[][]{new int[]{552, 335, 230, 141}, new int[]{432, 262, 180, 111}, new int[]{312, 189, 130, 80}, new int[]{235, 143, 98, 60}}, new int[][]{new int[]{652, 395, 271, 167}, new int[]{513, 311, 213, 131}, new int[]{364, 221, 151, 93}, new int[]{288, 174, 119, 74}}, new int[][]{new int[]{772, 468, 321, 198}, new int[]{604, 366, 251, 155}, new int[]{427, 259, 177, 109}, new int[]{331, 200, 137, 85}}, new int[][]{new int[]{883, 535, 367, 226}, new int[]{691, 419, 287, 177}, new int[]{489, 296, 203, 125}, new int[]{374, 227, 155, 96}}, new int[][]{new int[]{1022, 619, 425, 262}, new int[]{796, 483, 331, 204}, new int[]{580, 352, 241, 149}, new int[]{427, 259, 177, 109}}, new int[][]{new int[]{1101, 667, 458, 282}, new int[]{871, 528, 362, 223}, new int[]{621, 376, 258, 159}, new int[]{468, 283, 194, 120}}, new int[][]{new int[]{1250, 758, 520, 320}, new int[]{991, 600, 412, 254}, new int[]{703, 426, 292, 180}, new int[]{530, 321, 220, 136}}, new int[][]{new int[]{1408, 854, 586, 361}, new int[]{1082, 656, 450, 277}, new int[]{775, 470, 322, 198}, new int[]{602, 365, 250, 154}}, new int[][]{new int[]{1548, 938, 644, 397}, new int[]{1212, 734, 504, 310}, new int[]{876, 531, 364, 224}, new int[]{674, 408, 280, 173}}, new int[][]{new int[]{1725, 1046, 718, 442}, new int[]{1346, 816, 560, 345}, new int[]{948, 574, 394, 243}, new int[]{746, 452, 310, 191}}, new int[][]{new int[]{1903, 1153, 792, 488}, new int[]{1500, 909, 624, 384}, new int[]{1063, 644, 442, 272}, new int[]{813, 493, 338, 208}}, new int[][]{new int[]{2061, 1249, 858, 528}, new int[]{1600, 970, 666, 410}, new int[]{1159, 702, 482, 297}, new int[]{919, 557, 382, 235}}, new int[][]{new int[]{2232, 1352, 929, 572}, new int[]{1708, 1035, 711, 438}, new int[]{1224, 742, 509, 314}, new int[]{969, 587, 403, 248}}, new int[][]{new int[]{2409, 1460, 1003, 618}, new int[]{1872, 1134, 779, 480}, new int[]{1358, 823, 565, 348}, new int[]{1056, 640, 439, 270}}, new int[][]{new int[]{2620, 1588, 1091, 672}, new int[]{2059, 1248, 857, 528}, new int[]{1468, 890, 611, 376}, new int[]{1108, 672, 461, 284}}, new int[][]{new int[]{2812, 1704, 1171, 721}, new int[]{2188, 1326, 911, 561}, new int[]{1588, 963, 661, 407}, new int[]{1228, 744, 511, 315}}, new int[][]{new int[]{3057, 1853, 1273, 784}, new int[]{2395, 1451, 997, 614}, new int[]{1718, 1041, 715, 440}, new int[]{1286, 779, 535, 330}}, new int[][]{new int[]{3283, 1990, 1367, 842}, new int[]{2544, 1542, 1059, 652}, new int[]{1804, 1094, 751, 462}, new int[]{1425, 864, 593, 365}}, new int[][]{new int[]{3517, 2132, 1465, 902}, new int[]{2701, 1637, 1125, 692}, new int[]{1933, 1172, 805, 496}, new int[]{1501, 910, 625, 385}}, new int[][]{new int[]{3669, 2223, 1528, 940}, new int[]{2857, 1732, 1190, 732}, new int[]{2085, 1263, 868, 534}, new int[]{1581, 958, 658, 405}}, new int[][]{new int[]{3909, 2369, 1628, 1002}, new int[]{3035, 1839, 1264, 778}, new int[]{2181, 1322, 908, 559}, new int[]{1677, 1016, 698, 430}}, new int[][]{new int[]{4158, 2520, 1732, 1066}, new int[]{3289, 1994, 1370, 843}, new int[]{2358, 1429, 982, 604}, new int[]{1782, 1080, 742, 457}}, new int[][]{new int[]{4417, 2677, 1840, 1132}, new int[]{3486, 2113, 1452, 894}, new int[]{2473, 1499, 1030, 634}, new int[]{1897, 1150, 790, 486}}, new int[][]{new int[]{4686, 2840, 1952, 1201}, new int[]{3693, 2238, 1538, 947}, new int[]{2670, 1618, 1112, 684}, new int[]{2022, 1226, 842, 518}}, new int[][]{new int[]{4965, 3009, 2068, 1273}, new int[]{3909, 2369, 1628, 1002}, new int[]{2805, 1700, 1168, 719}, new int[]{2157, 1307, 898, 553}}, new int[][]{new int[]{5253, 3183, 2188, 1347}, new int[]{4134, 2506, 1722, 1060}, new int[]{2949, 1787, 1228, 756}, new int[]{2301, 1394, 958, 590}}};

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(defpackage.InterfaceC12864e r18, defpackage.C4993e r19, defpackage.InterfaceC12123e r20, defpackage.InterfaceC6428e r21, defpackage.InterfaceC3886e r22, defpackage.InterfaceC8642e r23, boolean r24, defpackage.C11644e r25, kotlin.jvm.functions.Function1 r26, defpackage.C13770e r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7023e.ad(eّۤۧ, eؗٚٝ, eِۦۦ, eؙٖ٘, eؖؖؖ, eٌّؐ, boolean, eَِؚ, kotlin.jvm.functions.Function1, eٓؕۥ, int, int):void");
    }

    public static void adcel(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[14];
        billing(jArr, jArr2, jArr4);
        mopub(jArr4, jArr3);
    }

    public static void advert(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[13];
        startapp(jArr, jArr3);
        while (true) {
            mopub(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                startapp(jArr2, jArr3);
            }
        }
    }

    public static void amazon(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? loadAd(i, i3, "start index") : (i2 < 0 || i2 > i3) ? loadAd(i2, i3, "end index") : AbstractC3167e.license("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static final C14843e appmetrica(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (C14843e) weakReference.get();
        }
        return null;
    }

    public static void billing(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        purchase(jArr, jArr4);
        purchase(jArr2, jArr5);
        long[] jArr6 = new long[8];
        for (int i = 0; i < 7; i++) {
            yandex(jArr6, jArr4[i], jArr5[i], jArr3, i << 1);
        }
        long j = jArr3[0];
        long j2 = jArr3[1];
        long j3 = jArr3[2] ^ j;
        long j4 = j3 ^ j2;
        jArr3[1] = j4;
        long j5 = j2 ^ jArr3[3];
        long j6 = j3 ^ jArr3[4];
        long j7 = j6 ^ j5;
        jArr3[2] = j7;
        long j8 = j5 ^ jArr3[5];
        long j9 = j6 ^ jArr3[6];
        long j10 = j9 ^ j8;
        jArr3[3] = j10;
        long j11 = j8 ^ jArr3[7];
        long j12 = j9 ^ jArr3[8];
        long j13 = j12 ^ j11;
        jArr3[4] = j13;
        long j14 = j11 ^ jArr3[9];
        long j15 = j12 ^ jArr3[10];
        long j16 = j15 ^ j14;
        jArr3[5] = j16;
        long j17 = j14 ^ jArr3[11];
        long j18 = j15 ^ jArr3[12];
        long j19 = j18 ^ j17;
        jArr3[6] = j19;
        long j20 = (j17 ^ jArr3[13]) ^ j18;
        jArr3[7] = j ^ j20;
        jArr3[8] = j4 ^ j20;
        jArr3[9] = j7 ^ j20;
        jArr3[10] = j10 ^ j20;
        jArr3[11] = j13 ^ j20;
        jArr3[12] = j16 ^ j20;
        jArr3[13] = j19 ^ j20;
        yandex(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        yandex(jArr6, jArr4[0] ^ jArr4[2], jArr5[0] ^ jArr5[2], jArr3, 2);
        yandex(jArr6, jArr4[0] ^ jArr4[3], jArr5[0] ^ jArr5[3], jArr3, 3);
        yandex(jArr6, jArr4[1] ^ jArr4[2], jArr5[1] ^ jArr5[2], jArr3, 3);
        yandex(jArr6, jArr4[0] ^ jArr4[4], jArr5[0] ^ jArr5[4], jArr3, 4);
        yandex(jArr6, jArr4[1] ^ jArr4[3], jArr5[1] ^ jArr5[3], jArr3, 4);
        yandex(jArr6, jArr4[0] ^ jArr4[5], jArr5[0] ^ jArr5[5], jArr3, 5);
        yandex(jArr6, jArr4[1] ^ jArr4[4], jArr5[1] ^ jArr5[4], jArr3, 5);
        yandex(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 5);
        yandex(jArr6, jArr4[0] ^ jArr4[6], jArr5[0] ^ jArr5[6], jArr3, 6);
        yandex(jArr6, jArr4[1] ^ jArr4[5], jArr5[1] ^ jArr5[5], jArr3, 6);
        yandex(jArr6, jArr4[2] ^ jArr4[4], jArr5[2] ^ jArr5[4], jArr3, 6);
        yandex(jArr6, jArr4[1] ^ jArr4[6], jArr5[1] ^ jArr5[6], jArr3, 7);
        yandex(jArr6, jArr4[2] ^ jArr4[5], jArr5[2] ^ jArr5[5], jArr3, 7);
        yandex(jArr6, jArr4[3] ^ jArr4[4], jArr5[3] ^ jArr5[4], jArr3, 7);
        yandex(jArr6, jArr4[2] ^ jArr4[6], jArr5[2] ^ jArr5[6], jArr3, 8);
        yandex(jArr6, jArr4[3] ^ jArr4[5], jArr5[3] ^ jArr5[5], jArr3, 8);
        yandex(jArr6, jArr4[3] ^ jArr4[6], jArr5[3] ^ jArr5[6], jArr3, 9);
        yandex(jArr6, jArr4[4] ^ jArr4[5], jArr5[4] ^ jArr5[5], jArr3, 9);
        yandex(jArr6, jArr4[4] ^ jArr4[6], jArr5[4] ^ jArr5[6], jArr3, 10);
        yandex(jArr6, jArr4[5] ^ jArr4[6], jArr5[5] ^ jArr5[6], jArr3, 11);
        long j21 = jArr3[0];
        long j22 = jArr3[1];
        long j23 = jArr3[2];
        long j24 = jArr3[3];
        long j25 = jArr3[4];
        long j26 = jArr3[5];
        long j27 = jArr3[6];
        long j28 = jArr3[7];
        long j29 = jArr3[8];
        long j30 = jArr3[9];
        long j31 = jArr3[10];
        long j32 = jArr3[11];
        long j33 = jArr3[12];
        long j34 = jArr3[13];
        jArr3[0] = j21 ^ (j22 << 59);
        jArr3[1] = (j22 >>> 5) ^ (j23 << 54);
        jArr3[2] = (j23 >>> 10) ^ (j24 << 49);
        jArr3[3] = (j24 >>> 15) ^ (j25 << 44);
        jArr3[4] = (j25 >>> 20) ^ (j26 << 39);
        jArr3[5] = (j26 >>> 25) ^ (j27 << 34);
        jArr3[6] = (j27 >>> 30) ^ (j28 << 29);
        jArr3[7] = (j28 >>> 35) ^ (j29 << 24);
        jArr3[8] = (j29 >>> 40) ^ (j30 << 19);
        jArr3[9] = (j30 >>> 45) ^ (j31 << 14);
        jArr3[10] = (j31 >>> 50) ^ (j32 << 9);
        jArr3[11] = ((j32 >>> 55) ^ (j33 << 4)) ^ (j34 << 63);
        jArr3[12] = j34 >>> 1;
    }

    public static final View license(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int min = Math.min(metrica(view, R.id.view_tree_lifecycle_owner), metrica(view, R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i = 0;
        View view3 = view2;
        while (view != null) {
            if (i == min) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (appmetrica(view) == null) {
                i++;
                Object appmetrica = AbstractC9110e.appmetrica(view);
                View view4 = view2;
                view2 = view;
                view = appmetrica instanceof View ? (View) appmetrica : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static String loadAd(int i, int i2, String str) {
        if (i < 0) {
            return AbstractC3167e.license("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return AbstractC3167e.license("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(AbstractC1786e.admob(i2, "negative size: "));
    }

    public static final int metrica(View view, int i) {
        int i2 = 0;
        int i3 = Alert.DURATION_SHOW_INDEFINITELY;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i3 = i2;
            }
            i2++;
            Object appmetrica = AbstractC9110e.appmetrica(view);
            view = appmetrica instanceof View ? (View) appmetrica : null;
        }
        return i3;
    }

    public static void mopub(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[12];
        long j10 = j6 ^ (j9 << 39);
        long j11 = j7 ^ ((j9 >>> 25) ^ (j9 << 62));
        long j12 = j8 ^ (j9 >>> 2);
        long j13 = jArr[11];
        long j14 = j5 ^ (j13 << 39);
        long j15 = j10 ^ ((j13 >>> 25) ^ (j13 << 62));
        long j16 = j11 ^ (j13 >>> 2);
        long j17 = jArr[10];
        long j18 = j4 ^ (j17 << 39);
        long j19 = j14 ^ ((j17 >>> 25) ^ (j17 << 62));
        long j20 = j15 ^ (j17 >>> 2);
        long j21 = jArr[9];
        long j22 = j3 ^ (j21 << 39);
        long j23 = j18 ^ ((j21 >>> 25) ^ (j21 << 62));
        long j24 = j19 ^ (j21 >>> 2);
        long j25 = jArr[8];
        long j26 = j ^ (j12 << 39);
        long j27 = (j2 ^ (j25 << 39)) ^ ((j12 >>> 25) ^ (j12 << 62));
        long j28 = (j22 ^ ((j25 >>> 25) ^ (j25 << 62))) ^ (j12 >>> 2);
        long j29 = j16 >>> 25;
        jArr2[0] = j26 ^ j29;
        jArr2[1] = (j29 << 23) ^ j27;
        jArr2[2] = j28;
        jArr2[3] = j23 ^ (j25 >>> 2);
        jArr2[4] = j24;
        jArr2[5] = j20;
        jArr2[6] = j16 & 33554431;
    }

    public static void purchase(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = ((j3 >>> 49) ^ (j4 << 15)) & 576460752303423487L;
        jArr2[4] = ((j4 >>> 44) ^ (j5 << 20)) & 576460752303423487L;
        jArr2[5] = ((j5 >>> 39) ^ (j6 << 25)) & 576460752303423487L;
        jArr2[6] = (j6 >>> 34) ^ (j7 << 30);
    }

    public static void smaato(int i, int i2) {
        String license;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                license = AbstractC3167e.license("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(AbstractC1786e.admob(i2, "negative size: "));
                }
                license = AbstractC3167e.license("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(license);
        }
    }

    public static void startapp(long[] jArr, long[] jArr2) {
        AbstractC15792e.license(6, jArr, jArr2);
        jArr2[12] = AbstractC15792e.metrica((int) jArr[6]);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void vip(defpackage.InterfaceC12864e r16, defpackage.C4993e r17, defpackage.InterfaceC12123e r18, defpackage.InterfaceC10260e r19, defpackage.C14544e r20, defpackage.InterfaceC8642e r21, boolean r22, defpackage.C11644e r23, kotlin.jvm.functions.Function1 r24, defpackage.C13770e r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7023e.vip(eّۤۧ, eؗٚٝ, eِۦۦ, eَٔؔ, eؘِٔ, eٌّؐ, boolean, eَِؚ, kotlin.jvm.functions.Function1, eٓؕۥ, int, int):void");
    }

    public static void yandex(long[] jArr, long j, long j2, long[] jArr2, int i) {
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
}
