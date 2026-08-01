package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13482e {
    public static final C2892e Signature;
    public static final C2892e ad;
    public static final C2892e adcel;
    public static final C2892e admob;
    public static final C2892e advert;
    public static final C2892e amazon;
    public static final C2892e billing;
    public static final C2892e loadAd;
    public static final C2892e mopub;
    public static final C2892e pro;
    public static final C2892e purchase;
    public static final C2892e smaato;
    public static final C2892e startapp;
    public static final C2892e subscription;
    public static final C2892e vip;
    public static final C2892e yandex;
    public static final C2892e metrica = new C2892e(-277965290, false, new C10418e(18));
    public static final C2892e license = new C2892e(-1950876506, false, new C10418e(19));
    public static final C2892e appmetrica = new C2892e(-1652936519, false, new C10418e(20));
    public static final C2892e remoteconfig = new C2892e(-1799732444, false, new C10418e(29));
    public static final C2892e signatures = new C2892e(877252066, false, new C10418e(16));
    public static final C2892e tapsense = new C2892e(-2079222975, false, new C10418e(17));
    public static final int[] isVip = {-19, -1, -1, -1, -1, -1, -1, Alert.DURATION_SHOW_INDEFINITELY};
    public static final int[] inmobi = {-32595792, -7943725, 4688975, 3500415, 6194736, 33281959, -12573105, -1002827, 163343, 5703241};

    static {
        int i = 21;
        ad = new C2892e(1613843517, false, new C9868e(i));
        int i2 = 23;
        vip = new C2892e(265709947, false, new C9868e(i2));
        purchase = new C2892e(485483866, false, new C10418e(i));
        int i3 = 22;
        billing = new C2892e(1669529987, false, new C10418e(i3));
        yandex = new C2892e(-617972372, false, new C10418e(i2));
        int i4 = 25;
        startapp = new C2892e(720519883, false, new C10418e(i4));
        int i5 = 26;
        adcel = new C2892e(836686952, false, new C10418e(i5));
        int i6 = 24;
        mopub = new C2892e(2059012138, false, new C10418e(i6));
        int i7 = 27;
        advert = new C2892e(-2119788089, false, new C10418e(i7));
        int i8 = 28;
        smaato = new C2892e(-897462903, false, new C10418e(i8));
        amazon = new C2892e(-1546357882, false, new C9868e(i6));
        loadAd = new C2892e(1130626628, false, new C9868e(i4));
        Signature = new C2892e(-1825848413, false, new C9868e(i5));
        admob = new C2892e(-487356158, false, new C9868e(i7));
        subscription = new C2892e(-1661211768, false, new C9868e(i8));
        pro = new C2892e(-1940702299, false, new C9868e(i3));
    }

    public static void Signature(int i, int i2, byte[] bArr, int[] iArr) {
        int subscription2 = subscription(i, bArr);
        int subscription3 = subscription(i + 4, bArr);
        int subscription4 = subscription(i + 8, bArr);
        int subscription5 = subscription(i + 12, bArr);
        iArr[i2] = subscription2 & 67108863;
        iArr[i2 + 1] = ((subscription2 >>> 26) | (subscription3 << 6)) & 67108863;
        iArr[i2 + 2] = ((subscription3 >>> 20) | (subscription4 << 12)) & 33554431;
        iArr[i2 + 3] = 67108863 & ((subscription5 << 19) | (subscription4 >>> 13));
        iArr[i2 + 4] = subscription5 >>> 7;
    }

    public static final C11709e ad(String str) {
        C12816e c12816e = C12269e.ad;
        return new C11709e(C12269e.appmetrica, C0520e.appmetrica(str));
    }

    public static float adcel(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static void admob(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        iArr2[i2] = i3 & 67108863;
        iArr2[i2 + 1] = ((i3 >>> 26) | (i4 << 6)) & 67108863;
        iArr2[i2 + 2] = ((i4 >>> 20) | (i5 << 12)) & 33554431;
        iArr2[i2 + 3] = 67108863 & ((i6 << 19) | (i5 >>> 13));
        iArr2[i2 + 4] = i6 >>> 7;
    }

    public static void ads(int[] iArr) {
        int i = (iArr[9] >>> 23) & 1;
        subs(iArr, i);
        subs(iArr, -i);
    }

    public static void advert(int i, int i2, int[] iArr, int[] iArr2) {
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = iArr2[i3];
            iArr2[i3] = i4 ^ ((iArr[i2 + i3] ^ i4) & i);
        }
    }

    public static void amazon(int i, int i2, int[] iArr, int[] iArr2) {
        for (int i3 = 0; i3 < 10; i3++) {
            iArr2[i2 + i3] = iArr[i + i3];
        }
    }

    public static void applovin(int[] iArr, int[] iArr2) {
        for (int i = 0; i < 10; i++) {
            iArr2[i] = -iArr[i];
        }
    }

    public static final C11709e appmetrica(C0520e c0520e) {
        C12816e c12816e = C12269e.ad;
        C11709e c11709e = C12269e.startapp;
        return new C11709e(c11709e.ad, C0520e.appmetrica(c0520e.metrica().concat(c11709e.purchase().metrica())));
    }

    public static final C11709e billing(C11709e c11709e) {
        C12816e c12816e = C12269e.ad;
        return new C11709e(C12269e.ad, C0520e.appmetrica("U".concat(c11709e.purchase().metrica())));
    }

    /* renamed from: class, reason: not valid java name */
    public static void m3611class(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        long j = i;
        long j2 = j * j;
        long j3 = i2 * 2;
        long j4 = j * j3;
        long j5 = i3 * 2;
        long j6 = j * j5;
        long j7 = i2;
        long j8 = (j7 * j7) + j6;
        long j9 = i4 * 2;
        long j10 = (j * j9) + (j3 * j5);
        long j11 = i5 * 2;
        long j12 = (j7 * j9) + (j * j11) + (i3 * j5);
        long j13 = (j5 * j9) + (j3 * j11);
        long j14 = j5 * j11;
        long j15 = i4;
        long j16 = (j15 * j15) + j14;
        long j17 = j15 * j11;
        long j18 = i6;
        long j19 = j18 * j18;
        long j20 = i7 * 2;
        long j21 = j18 * j20;
        long j22 = i8 * 2;
        long j23 = j18 * j22;
        long j24 = i7;
        long j25 = (j24 * j24) + j23;
        long j26 = j20 * j22;
        long j27 = i9 * 2;
        long j28 = i10 * 2;
        long j29 = (j24 * j27) + (j18 * j28) + (i8 * j22);
        long j30 = (j22 * j27) + (j20 * j28);
        long j31 = j22 * j28;
        long j32 = i9;
        long j33 = j2 - (j30 * 38);
        long j34 = j4 - (((j32 * j32) + j31) * 38);
        long j35 = j8 - ((j32 * j28) * 38);
        long j36 = j10 - ((i10 * j28) * 38);
        long j37 = j13 - j19;
        long j38 = j16 - j21;
        long j39 = j17 - j25;
        long j40 = (i5 * j11) - ((j18 * j27) + j26);
        int i11 = i2 + i7;
        int i12 = i3 + i8;
        int i13 = i4 + i9;
        int i14 = i5 + i10;
        long j41 = i + i6;
        long j42 = i11 * 2;
        long j43 = j41 * j42;
        long j44 = i12 * 2;
        long j45 = i11;
        long j46 = (j45 * j45) + (j41 * j44);
        long j47 = i13 * 2;
        long j48 = i14 * 2;
        long j49 = i13;
        long j50 = i14 * j48;
        long j51 = (((j41 * j47) + (j42 * j44)) - j36) + j40;
        int i15 = ((int) j51) & 67108863;
        long j52 = ((((j45 * j47) + ((j41 * j48) + (i12 * j44))) - j12) - j29) + (j51 >> 26);
        int i16 = ((int) j52) & 33554431;
        long j53 = ((((j52 >> 25) + ((j47 * j44) + (j42 * j48))) - j37) * 38) + j33;
        iArr2[0] = ((int) j53) & 67108863;
        long j54 = ((((j49 * j49) + (j44 * j48)) - j38) * 38) + j34 + (j53 >> 26);
        iArr2[1] = ((int) j54) & 67108863;
        long j55 = (((j49 * j48) - j39) * 38) + j35 + (j54 >> 26);
        iArr2[2] = ((int) j55) & 33554431;
        long j56 = ((j50 - j40) * 38) + j36 + (j55 >> 25);
        iArr2[3] = ((int) j56) & 67108863;
        long amazon2 = AbstractC1786e.amazon(j29, 38L, j12, j56 >> 26);
        iArr2[4] = ((int) amazon2) & 33554431;
        long j57 = ((j41 * j41) - j33) + j37 + (amazon2 >> 25);
        iArr2[5] = ((int) j57) & 67108863;
        long j58 = (j43 - j34) + j38 + (j57 >> 26);
        iArr2[6] = ((int) j58) & 67108863;
        long j59 = (j46 - j35) + j39 + (j58 >> 26);
        iArr2[7] = ((int) j59) & 33554431;
        long j60 = (j59 >> 25) + i15;
        iArr2[8] = ((int) j60) & 67108863;
        iArr2[9] = i16 + ((int) (j60 >> 26));
    }

    public static final View crashlytics(InterfaceC5077e interfaceC5077e) {
        if (!((AbstractC13616e) interfaceC5077e).f27022e.f27016e) {
            AbstractC14070e.metrica("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) AbstractC10501e.ad(AbstractC5851e.mopub(interfaceC5077e));
    }

    public static void firebase(int i, int[] iArr, int[] iArr2) {
        m3611class(iArr, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            } else {
                m3611class(iArr2, iArr2);
            }
        }
    }

    public static void inmobi(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        long j = 121666;
        long j2 = i3 * j;
        int i10 = ((int) j2) & 33554431;
        long j3 = j2 >> 25;
        long j4 = i5 * j;
        int i11 = ((int) j4) & 33554431;
        long j5 = i8 * j;
        long j6 = iArr[9] * j;
        int i12 = ((int) j6) & 33554431;
        long j7 = (i * j) + ((j6 >> 25) * 38);
        iArr2[0] = ((int) j7) & 67108863;
        long j8 = (i6 * j) + (j4 >> 25);
        iArr2[5] = ((int) j8) & 67108863;
        long j9 = (i2 * j) + (j7 >> 26);
        iArr2[1] = ((int) j9) & 67108863;
        long j10 = (i4 * j) + j3;
        iArr2[3] = ((int) j10) & 67108863;
        long j11 = (i7 * j) + (j8 >> 26);
        iArr2[6] = ((int) j11) & 67108863;
        long j12 = (i9 * j) + (j5 >> 25);
        iArr2[8] = ((int) j12) & 67108863;
        iArr2[2] = ((int) (j9 >> 26)) + i10;
        iArr2[4] = i11 + ((int) (j10 >> 26));
        iArr2[7] = (((int) j5) & 33554431) + ((int) (j11 >> 26));
        iArr2[9] = i12 + ((int) (j12 >> 26));
    }

    /* renamed from: interface, reason: not valid java name */
    public static void m3612interface(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] - iArr2[i];
        }
    }

    public static void isPro(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = iArr[1];
        int i4 = iArr2[1];
        int i5 = iArr[2];
        int i6 = iArr2[2];
        int i7 = iArr[3];
        int i8 = iArr2[3];
        int i9 = iArr[4];
        int i10 = iArr2[4];
        int i11 = iArr[5];
        int i12 = iArr2[5];
        int i13 = iArr[6];
        int i14 = iArr2[6];
        int i15 = iArr[7];
        int i16 = iArr2[7];
        int i17 = iArr[8];
        int i18 = iArr2[8];
        int i19 = iArr[9];
        int i20 = iArr2[9];
        long j = i;
        long j2 = i2;
        long j3 = j * j2;
        long j4 = i4;
        long j5 = j * j4;
        long j6 = i3;
        long j7 = (j6 * j2) + j5;
        long j8 = i6;
        long j9 = (j6 * j4) + (j * j8);
        long j10 = i5;
        long j11 = (j10 * j2) + j9;
        long j12 = ((j10 * j4) + (j6 * j8)) << 1;
        long j13 = i8;
        long j14 = j * j13;
        long j15 = i7;
        long amazon2 = AbstractC1786e.amazon(j15, j2, j14, j12);
        long j16 = (j10 * j8) << 1;
        long j17 = i10;
        long j18 = i9;
        long amazon3 = AbstractC1786e.amazon(j18, j2, (j15 * j4) + (j6 * j13) + (j * j17), j16);
        long j19 = ((j18 * j4) + ((j15 * j8) + ((j10 * j13) + (j6 * j17)))) << 1;
        long j20 = (j15 * j13) + (((j18 * j8) + (j10 * j17)) << 1);
        long j21 = (j18 * j13) + (j15 * j17);
        long j22 = (j18 * j17) << 1;
        long j23 = i11;
        long j24 = i12;
        long j25 = j23 * j24;
        long j26 = i14;
        long j27 = j23 * j26;
        long j28 = i13;
        long j29 = (j28 * j24) + j27;
        long j30 = i16;
        long j31 = (j28 * j26) + (j23 * j30);
        long j32 = i15;
        long j33 = i18;
        long j34 = j23 * j33;
        long j35 = i17;
        long amazon4 = AbstractC1786e.amazon(j35, j24, j34, ((j32 * j26) + (j28 * j30)) << 1);
        long j36 = i20;
        long j37 = (j35 * j26) + (j28 * j33) + (j23 * j36);
        long j38 = i19;
        long amazon5 = AbstractC1786e.amazon(j38, j24, j37, (j32 * j30) << 1);
        long j39 = j3 - (((j26 * j38) + ((j35 * j30) + ((j32 * j33) + (j28 * j36)))) * 76);
        long j40 = j7 - (((j35 * j33) + (((j30 * j38) + (j32 * j36)) << 1)) * 38);
        long j41 = j11 - (((j38 * j33) + (j35 * j36)) * 38);
        long j42 = amazon2 - ((j36 * j38) * 76);
        long j43 = j19 - j25;
        long j44 = j20 - j29;
        long j45 = j21 - ((j32 * j24) + j31);
        long j46 = j22 - amazon4;
        long j47 = i + i11;
        long j48 = i2 + i12;
        long j49 = j47 * j48;
        long j50 = i4 + i14;
        long j51 = j47 * j50;
        long j52 = i3 + i13;
        long j53 = (j52 * j48) + j51;
        long j54 = i6 + i16;
        long j55 = i5 + i15;
        long j56 = (j55 * j48) + (j52 * j50) + (j47 * j54);
        long j57 = ((j55 * j50) + (j52 * j54)) << 1;
        long j58 = i8 + i18;
        long j59 = i7 + i17;
        long amazon6 = AbstractC1786e.amazon(j59, j48, j47 * j58, j57);
        long j60 = i10 + i20;
        long j61 = i9 + i19;
        long amazon7 = AbstractC1786e.amazon(j61, j48, (j59 * j50) + (j52 * j58) + (j47 * j60), (j55 * j54) << 1);
        long j62 = ((j50 * j61) + ((j59 * j54) + ((j55 * j58) + (j52 * j60)))) << 1;
        long j63 = (j59 * j58) + (((j54 * j61) + (j55 * j60)) << 1);
        long j64 = (j61 * j58) + (j59 * j60);
        long j65 = (j60 * j61) << 1;
        long j66 = (amazon6 - j42) + j46;
        int i21 = ((int) j66) & 67108863;
        long j67 = ((amazon7 - amazon3) - amazon5) + (j66 >> 26);
        int i22 = ((int) j67) & 33554431;
        long j68 = ((((j67 >> 25) + j62) - j43) * 38) + j39;
        iArr3[0] = ((int) j68) & 67108863;
        long j69 = ((j63 - j44) * 38) + j40 + (j68 >> 26);
        iArr3[1] = ((int) j69) & 67108863;
        long j70 = ((j64 - j45) * 38) + j41 + (j69 >> 26);
        iArr3[2] = ((int) j70) & 33554431;
        long j71 = ((j65 - j46) * 38) + j42 + (j70 >> 25);
        iArr3[3] = ((int) j71) & 67108863;
        long amazon8 = AbstractC1786e.amazon(amazon5, 38L, amazon3, j71 >> 26);
        iArr3[4] = ((int) amazon8) & 33554431;
        long j72 = (j49 - j39) + j43 + (amazon8 >> 25);
        iArr3[5] = ((int) j72) & 67108863;
        long j73 = (j53 - j40) + j44 + (j72 >> 26);
        iArr3[6] = ((int) j73) & 67108863;
        long j74 = (j56 - j41) + j45 + (j73 >> 26);
        iArr3[7] = ((int) j74) & 33554431;
        long j75 = (j74 >> 25) + i21;
        iArr3[8] = ((int) j75) & 67108863;
        iArr3[9] = i22 + ((int) (j75 >> 26));
    }

    public static int isVip(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static final void license(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> entrySet = linkedHashMap.entrySet();
        int appmetrica2 = AbstractC10064e.appmetrica(AbstractC0746e.subscription(entrySet, 10));
        if (appmetrica2 < 16) {
            appmetrica2 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(appmetrica2);
        for (Map.Entry entry : entrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
    }

    public static void loadAd(int i, int[] iArr, int[] iArr2) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = iArr[i3];
            int i5 = iArr2[i3];
            int i6 = (i4 ^ i5) & i2;
            iArr[i3] = i4 ^ i6;
            iArr2[i3] = i5 ^ i6;
        }
    }

    public static final C11709e metrica(String str) {
        C12816e c12816e = C12269e.ad;
        return new C11709e(C12269e.metrica, C0520e.appmetrica(str));
    }

    public static int mopub(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static void premium(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    public static void pro(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        iArr2[i2] = (i4 << 26) | i3;
        iArr2[i2 + 1] = (i4 >>> 6) | (i5 << 20);
        iArr2[i2 + 2] = (i5 >>> 12) | (i6 << 13);
        iArr2[i2 + 3] = (i7 << 7) | (i6 >>> 19);
    }

    public static final C11709e purchase(String str) {
        C12816e c12816e = C12269e.ad;
        return new C11709e(C12269e.vip, C0520e.appmetrica(str));
    }

    public static void remoteconfig(int i, int i2, byte[] bArr, int[] iArr) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        signatures((i4 << 26) | i3, i2, bArr);
        signatures((i4 >>> 6) | (i5 << 20), i2 + 4, bArr);
        signatures((i5 >>> 12) | (i6 << 13), i2 + 8, bArr);
        signatures((i7 << 7) | (i6 >>> 19), i2 + 12, bArr);
    }

    public static void signatures(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static void smaato(int[] iArr, int i) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            iArr[i3] = (iArr[i3] ^ i2) - i2;
        }
    }

    public static void startapp(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            int i3 = iArr2[i];
            iArr3[i] = i2 + i3;
            iArr4[i] = i2 - i3;
        }
    }

    public static void subs(int[] iArr, int i) {
        int i2 = iArr[9];
        long j = (((i2 >> 24) + i) * 19) + iArr[0];
        iArr[0] = ((int) j) & 67108863;
        long j2 = (j >> 26) + iArr[1];
        iArr[1] = ((int) j2) & 67108863;
        long j3 = (j2 >> 26) + iArr[2];
        iArr[2] = ((int) j3) & 33554431;
        long j4 = (j3 >> 25) + iArr[3];
        iArr[3] = ((int) j4) & 67108863;
        long j5 = (j4 >> 26) + iArr[4];
        iArr[4] = ((int) j5) & 33554431;
        long j6 = (j5 >> 25) + iArr[5];
        iArr[5] = ((int) j6) & 67108863;
        long j7 = (j6 >> 26) + iArr[6];
        iArr[6] = ((int) j7) & 67108863;
        long j8 = (j7 >> 26) + iArr[7];
        iArr[7] = 33554431 & ((int) j8);
        long j9 = (j8 >> 25) + iArr[8];
        iArr[8] = 67108863 & ((int) j9);
        iArr[9] = (16777215 & i2) + ((int) (j9 >> 26));
    }

    public static int subscription(int i, byte[] bArr) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static void tapsense(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[8];
        amazon(0, 0, iArr, iArr3);
        ads(iArr3);
        pro(0, 0, iArr3, iArr4);
        pro(5, 4, iArr3, iArr4);
        AbstractC6143e.advert(isVip, iArr4, iArr4);
        admob(0, 0, iArr4, iArr2);
        admob(4, 5, iArr4, iArr2);
        iArr2[9] = iArr2[9] & 16777215;
    }

    public static final C11709e vip(String str) {
        C12816e c12816e = C12269e.ad;
        return new C11709e(C12269e.ad, C0520e.appmetrica(str));
    }

    public static void yandex(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }
}
