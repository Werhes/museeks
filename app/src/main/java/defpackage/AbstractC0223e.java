package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0223e {
    public static final int[] ad = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};

    public static void ad(int[] iArr, int[] iArr2, int[] iArr3) {
        int ad2 = AbstractC12797e.ad(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (ad2 > 511 || (ad2 == 511 && AbstractC12797e.startapp(16, iArr3, ad))) {
            ad2 = (AbstractC12797e.signatures(iArr3) + ad2) & 511;
        }
        iArr3[16] = ad2;
    }

    public static void adcel(int[] iArr, int[] iArr2) {
        int i = iArr[32];
        int i2 = i;
        int i3 = 16;
        while (true) {
            int i4 = i3 - 1;
            if (i4 < 0) {
                break;
            }
            int i5 = iArr[i3 + 15];
            iArr2[i4] = (i2 << (-9)) | (i5 >>> 9);
            i2 = i5;
            i3 = i4;
        }
        int appmetrica = AbstractC12797e.appmetrica(16, iArr, iArr2) + ((i2 << (-9)) >>> 23) + (i >>> 9);
        if (appmetrica > 511 || (appmetrica == 511 && AbstractC12797e.startapp(16, iArr2, ad))) {
            appmetrica = (AbstractC12797e.signatures(iArr2) + appmetrica) & 511;
        }
        iArr2[16] = appmetrica;
    }

    public static void advert(int[] iArr, int[] iArr2, int[] iArr3) {
        int m3397class = (AbstractC12797e.m3397class(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (m3397class < 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= 16) {
                    i = -1;
                    break;
                }
                int i3 = iArr3[i2] - 1;
                iArr3[i2] = i3;
                if (i3 != -1) {
                    break;
                } else {
                    i2++;
                }
            }
            m3397class = (m3397class + i) & 511;
        }
        iArr3[16] = m3397class;
    }

    public static void amazon(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? loadAd(i, i3, "start index") : (i2 < 0 || i2 > i3) ? loadAd(i2, i3, "end index") : AbstractC5797e.appmetrica("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void appmetrica(int[] iArr, int[] iArr2) {
        AbstractC10077e.premium(iArr, iArr2);
        long j = 4294967295L;
        long j2 = iArr[8] & 4294967295L;
        int i = 7;
        int i2 = 16;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            long j3 = iArr[i + 8] & j;
            long j4 = j3 * j3;
            long j5 = j;
            iArr2[i2 + 15] = ((int) (j4 >>> 33)) | (i3 << 31);
            int i5 = i2 - 2;
            iArr2[i2 + 14] = (int) (j4 >>> 1);
            i3 = (int) j4;
            if (i4 <= 0) {
                long j6 = j2 * j2;
                iArr2[16] = (int) j6;
                long j7 = iArr[9] & j5;
                long j8 = (j7 * j2) + (((i3 << 31) & j5) | (j6 >>> 33));
                int i6 = (int) j8;
                iArr2[17] = (i6 << 1) | (((int) (j6 >>> 32)) & 1);
                long j9 = (iArr2[18] & j5) + (j8 >>> 32);
                long j10 = iArr[10] & j5;
                long j11 = (j10 * j2) + j9;
                int i7 = (int) j11;
                iArr2[18] = (i6 >>> 31) | (i7 << 1);
                int i8 = i7 >>> 31;
                long amazon = AbstractC1786e.amazon(j10, j7, j11 >>> 32, iArr2[19] & j5);
                long j12 = (iArr2[20] & j5) + (amazon >>> 32);
                long j13 = iArr[11] & j5;
                long j14 = (iArr2[21] & j5) + (j12 >>> 32);
                long j15 = (iArr2[22] & j5) + (j14 >>> 32);
                long j16 = (j13 * j2) + (amazon & j5);
                int i9 = (int) j16;
                iArr2[19] = (i9 << 1) | i8;
                long amazon2 = AbstractC1786e.amazon(j13, j7, j16 >>> 32, j12 & j5);
                long amazon3 = AbstractC1786e.amazon(j13, j10, amazon2 >>> 32, j14 & j5);
                long j17 = j15 + (amazon3 >>> 32);
                long j18 = amazon3 & j5;
                long j19 = iArr[12] & j5;
                long j20 = (iArr2[23] & j5) + (j17 >>> 32);
                long j21 = (iArr2[24] & j5) + (j20 >>> 32);
                long j22 = j20 & j5;
                long j23 = (j19 * j2) + (amazon2 & j5);
                int i10 = (int) j23;
                iArr2[20] = (i9 >>> 31) | (i10 << 1);
                int i11 = i10 >>> 31;
                long amazon4 = AbstractC1786e.amazon(j19, j7, j23 >>> 32, j18);
                long amazon5 = AbstractC1786e.amazon(j19, j10, amazon4 >>> 32, j17 & j5);
                long amazon6 = AbstractC1786e.amazon(j19, j13, amazon5 >>> 32, j22);
                long j24 = amazon5 & j5;
                long j25 = j21 + (amazon6 >>> 32);
                long j26 = amazon6 & j5;
                long j27 = iArr[13] & j5;
                long j28 = (iArr2[25] & j5) + (j25 >>> 32);
                long j29 = j25 & j5;
                long j30 = (iArr2[26] & j5) + (j28 >>> 32);
                long j31 = j28 & j5;
                long j32 = (j27 * j2) + (amazon4 & j5);
                int i12 = (int) j32;
                iArr2[21] = (i12 << 1) | i11;
                long amazon7 = AbstractC1786e.amazon(j27, j7, j32 >>> 32, j24);
                long amazon8 = AbstractC1786e.amazon(j27, j10, amazon7 >>> 32, j26);
                long amazon9 = AbstractC1786e.amazon(j27, j13, amazon8 >>> 32, j29);
                long j33 = amazon8 & j5;
                long amazon10 = AbstractC1786e.amazon(j27, j19, amazon9 >>> 32, j31);
                long j34 = j30 + (amazon10 >>> 32);
                long j35 = amazon10 & j5;
                long j36 = iArr[14] & j5;
                long j37 = (iArr2[27] & j5) + (j34 >>> 32);
                long j38 = j34 & j5;
                long j39 = (iArr2[28] & j5) + (j37 >>> 32);
                long j40 = j37 & j5;
                long j41 = (j36 * j2) + (amazon7 & j5);
                int i13 = (int) j41;
                iArr2[22] = (i12 >>> 31) | (i13 << 1);
                int i14 = i13 >>> 31;
                long amazon11 = AbstractC1786e.amazon(j36, j7, j41 >>> 32, j33);
                long amazon12 = AbstractC1786e.amazon(j36, j10, amazon11 >>> 32, amazon9 & j5);
                long amazon13 = AbstractC1786e.amazon(j36, j13, amazon12 >>> 32, j35);
                long j42 = amazon12 & j5;
                long amazon14 = AbstractC1786e.amazon(j36, j19, amazon13 >>> 32, j38);
                long j43 = amazon13 & j5;
                long amazon15 = AbstractC1786e.amazon(j36, j27, amazon14 >>> 32, j40);
                long j44 = amazon14 & j5;
                long j45 = j39 + (amazon15 >>> 32);
                long j46 = iArr[15] & j5;
                long j47 = (iArr2[29] & j5) + (j45 >>> 32);
                long j48 = (iArr2[30] & j5) + (j47 >>> 32);
                long j49 = j47 & j5;
                long j50 = (j2 * j46) + (amazon11 & j5);
                int i15 = (int) j50;
                iArr2[23] = i14 | (i15 << 1);
                int i16 = i15 >>> 31;
                long amazon16 = AbstractC1786e.amazon(j46, j7, j50 >>> 32, j42);
                long amazon17 = AbstractC1786e.amazon(j46, j10, amazon16 >>> 32, j43);
                long amazon18 = AbstractC1786e.amazon(j46, j13, amazon17 >>> 32, j44);
                long amazon19 = AbstractC1786e.amazon(j46, j19, amazon18 >>> 32, amazon15 & j5);
                long amazon20 = AbstractC1786e.amazon(j46, j27, amazon19 >>> 32, j45 & j5);
                long amazon21 = AbstractC1786e.amazon(j46, j36, amazon20 >>> 32, j49);
                long j51 = j48 + (amazon21 >>> 32);
                int i17 = (int) amazon16;
                iArr2[24] = i16 | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) amazon17;
                iArr2[25] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) amazon18;
                iArr2[26] = i20 | (i21 << 1);
                int i22 = (int) amazon19;
                iArr2[27] = (i21 >>> 31) | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) amazon20;
                iArr2[28] = i23 | (i24 << 1);
                int i25 = (int) amazon21;
                iArr2[29] = (i25 << 1) | (i24 >>> 31);
                int i26 = (int) j51;
                iArr2[30] = (i25 >>> 31) | (i26 << 1);
                iArr2[31] = (i26 >>> 31) | ((iArr2[31] + ((int) (j51 >>> 32))) << 1);
                int license = AbstractC10077e.license(iArr2, iArr2);
                int metrica = AbstractC10077e.metrica(24, 16, iArr2, iArr2, AbstractC10077e.metrica(0, 8, iArr2, iArr2, 0) + license) + license;
                int[] iArr3 = new int[8];
                AbstractC10077e.startapp(iArr, iArr, iArr3);
                int[] iArr4 = new int[16];
                AbstractC10077e.premium(iArr3, iArr4);
                AbstractC12797e.purchase(32, AbstractC12797e.m3399goto(16, 8, iArr4, iArr2) + metrica, 24, iArr2);
                int i27 = iArr[16];
                iArr2[32] = (i27 * i27) + AbstractC12797e.premium(16, i27 << 1, iArr, iArr2, 16);
                return;
            }
            i2 = i5;
            i = i4;
            j = j5;
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [eٌّؒ, eٔؐۜ] */
    public static final C1962e billing(C9885e c9885e, String str) {
        String str2;
        String str3;
        String str4 = c9885e.license;
        int i = c9885e.ad;
        long j = c9885e.vip;
        C9466e c9466e = new C9466e();
        C2171e c2171e = AbstractC17475e.f34223e;
        C1410e c1410e = C1410e.f4222e;
        List list = Collections.EMPTY_LIST;
        C1410e c1410e2 = C1410e.f4222e;
        C9457e c9457e = new C9457e();
        C13325e c13325e = C13325e.license;
        StringBuilder sb = new StringBuilder("ext:playlist:");
        String str5 = c9885e.isPro;
        if (str5 == null || str5.length() == 0) {
            str2 = String.valueOf(j) + "_" + i;
        } else {
            str2 = String.valueOf(j) + "_" + i + "_" + str5;
        }
        sb.append(str2);
        String sb2 = sb.toString();
        sb2.getClass();
        C4761e c4761e = new C4761e();
        c4761e.ad = str4;
        List list2 = c9885e.firebase;
        Uri uri = null;
        c4761e.purchase = list2 != null ? AbstractC13480e.m3608try(list2, ",", null, null, new C2894e(24), 30) : null;
        C18236e c18236e = c9885e.pro;
        if (c18236e != null && (str3 = c18236e.billing) != null) {
            uri = Uri.parse(str3);
        }
        c4761e.amazon = uri;
        c4761e.f10191goto = 13;
        c4761e.remoteconfig = Boolean.TRUE;
        c4761e.subscription = Boolean.FALSE;
        c4761e.f10194this = AbstractC2301e.vip(new C6571e("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str), new C6571e("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 2), new C6571e("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 2), new C6571e("bruhcollective.itaysonlab.vkx.auto.SOURCE_NAME", str4));
        return new C1962e(sb2, new C14435e(c9466e), null, new C15197e(c9457e), new C12053e(c4761e), c13325e);
    }

    public static void license(int[] iArr, int[] iArr2, int[] iArr3) {
        AbstractC10077e.isPro(iArr, iArr2, iArr3);
        long j = iArr2[8] & 4294967295L;
        long j2 = iArr2[9] & 4294967295L;
        long j3 = iArr2[10] & 4294967295L;
        long j4 = iArr2[11] & 4294967295L;
        long j5 = iArr2[12] & 4294967295L;
        long j6 = iArr2[13] & 4294967295L;
        long j7 = iArr2[14] & 4294967295L;
        long j8 = iArr2[15] & 4294967295L;
        long j9 = iArr[8] & 4294967295L;
        long j10 = j9 * j;
        iArr3[16] = (int) j10;
        int i = 32;
        long j11 = (j9 * j2) + (j10 >>> 32);
        iArr3[17] = (int) j11;
        long j12 = (j9 * j3) + (j11 >>> 32);
        iArr3[18] = (int) j12;
        long j13 = (j9 * j4) + (j12 >>> 32);
        iArr3[19] = (int) j13;
        long j14 = (j9 * j5) + (j13 >>> 32);
        iArr3[20] = (int) j14;
        long j15 = (j9 * j6) + (j14 >>> 32);
        iArr3[21] = (int) j15;
        long j16 = (j9 * j7) + (j15 >>> 32);
        iArr3[22] = (int) j16;
        long j17 = (j9 * j8) + (j16 >>> 32);
        iArr3[23] = (int) j17;
        iArr3[24] = (int) (j17 >>> 32);
        int i2 = 16;
        int i3 = 1;
        while (i3 < 8) {
            int i4 = i2 + 1;
            int i5 = i3;
            long j18 = j5;
            int i6 = i;
            long j19 = iArr[8 + i3] & 4294967295L;
            long j20 = j6;
            long j21 = (j19 * j) + (iArr3[i4] & 4294967295L);
            iArr3[i4] = (int) j21;
            long j22 = (j19 * j2) + (iArr3[r15] & 4294967295L) + (j21 >>> i6);
            iArr3[i2 + 2] = (int) j22;
            long j23 = (j19 * j3) + (iArr3[r8] & 4294967295L) + (j22 >>> i6);
            iArr3[i2 + 3] = (int) j23;
            long j24 = (j19 * j4) + (iArr3[r8] & 4294967295L) + (j23 >>> i6);
            iArr3[i2 + 4] = (int) j24;
            long j25 = (j19 * j18) + (iArr3[r8] & 4294967295L) + (j24 >>> i6);
            iArr3[i2 + 5] = (int) j25;
            long j26 = (j19 * j20) + (iArr3[r8] & 4294967295L) + (j25 >>> i6);
            iArr3[i2 + 6] = (int) j26;
            long j27 = (j19 * j7) + (iArr3[r8] & 4294967295L) + (j26 >>> i6);
            iArr3[i2 + 7] = (int) j27;
            long j28 = (j19 * j8) + (iArr3[r8] & 4294967295L) + (j27 >>> i6);
            iArr3[i2 + 8] = (int) j28;
            iArr3[i2 + 9] = (int) (j28 >>> i6);
            i3 = i5 + 1;
            i2 = i4;
            i = i6;
            j5 = j18;
            j3 = j3;
            j6 = j20;
        }
        int i7 = i;
        int license = AbstractC10077e.license(iArr3, iArr3);
        int i8 = 0;
        int metrica = AbstractC10077e.metrica(24, 16, iArr3, iArr3, AbstractC10077e.metrica(0, 8, iArr3, iArr3, 0) + license) + license;
        int[] iArr4 = new int[8];
        int[] iArr5 = new int[8];
        boolean z = AbstractC10077e.startapp(iArr, iArr, iArr4) != AbstractC10077e.startapp(iArr2, iArr2, iArr5);
        int[] iArr6 = new int[16];
        AbstractC10077e.isPro(iArr4, iArr5, iArr6);
        AbstractC12797e.purchase(i7, metrica + (z ? AbstractC12797e.license(16, 8, iArr6, iArr3) : AbstractC12797e.m3399goto(16, 8, iArr6, iArr3)), 24, iArr3);
        int i9 = iArr[16];
        int i10 = iArr2[16];
        long j29 = i9 & 4294967295L;
        long j30 = i10 & 4294967295L;
        long j31 = 0;
        while (true) {
            long j32 = j29;
            long j33 = ((iArr[i8] & 4294967295L) * j30) + (j32 * (iArr2[i8] & 4294967295L)) + (iArr3[r8] & 4294967295L) + j31;
            iArr3[16 + i8] = (int) j33;
            long j34 = j33 >>> 32;
            i8++;
            if (i8 >= 16) {
                iArr3[32] = (i9 * i10) + ((int) j34);
                return;
            } else {
                j31 = j34;
                j29 = j32;
            }
        }
    }

    public static String loadAd(int i, int i2, String str) {
        if (i < 0) {
            return AbstractC5797e.appmetrica("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return AbstractC5797e.appmetrica("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(AbstractC8647e.isPro(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
    }

    public static void metrica(InterfaceC4342e interfaceC4342e) {
        if (interfaceC4342e != null) {
            try {
                interfaceC4342e.ad();
            } catch (RemoteException unused) {
            }
        }
    }

    public static void mopub(int[] iArr) {
        int i = iArr[16];
        int billing = AbstractC12797e.billing(16, i >>> 9, iArr) + (i & 511);
        if (billing > 511 || (billing == 511 && AbstractC12797e.startapp(16, iArr, ad))) {
            billing = (AbstractC12797e.signatures(iArr) + billing) & 511;
        }
        iArr[16] = billing;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [eٌّؒ, eٔؐۜ] */
    public static final C1962e purchase(C0004e c0004e) {
        String str = c0004e.ad;
        C9466e c9466e = new C9466e();
        C2171e c2171e = AbstractC17475e.f34223e;
        C1410e c1410e = C1410e.f4222e;
        List list = Collections.EMPTY_LIST;
        C1410e c1410e2 = C1410e.f4222e;
        C9457e c9457e = new C9457e();
        C13325e c13325e = C13325e.license;
        String str2 = c0004e.metrica;
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        String concat = "ext:artist:".concat(str2);
        concat.getClass();
        C4761e c4761e = new C4761e();
        c4761e.ad = str;
        c4761e.f10191goto = 13;
        c4761e.remoteconfig = Boolean.TRUE;
        c4761e.subscription = Boolean.FALSE;
        c4761e.f10194this = AbstractC2301e.vip(new C6571e("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", "Исполнители"), new C6571e("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 2), new C6571e("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 2), new C6571e("bruhcollective.itaysonlab.vkx.auto.SOURCE_NAME", str));
        return new C1962e(concat, new C14435e(c9466e), null, new C15197e(c9457e), new C12053e(c4761e), c13325e);
    }

    public static void smaato(int i, int i2) {
        String appmetrica;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                appmetrica = AbstractC5797e.appmetrica("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(AbstractC8647e.isPro(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                }
                appmetrica = AbstractC5797e.appmetrica("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(appmetrica);
        }
    }

    public static final void startapp(Context context, InterfaceC8370e interfaceC8370e, Catalog2Button catalog2Button) {
        String mopub = interfaceC8370e.mopub();
        String str = catalog2Button.license;
        if (str == null) {
            return;
        }
        AbstractC13201e.vip(context, new C17922e(str, mopub), new C0086e(null, 0L, null, false, catalog2Button.ad instanceof C4582e, false, 111));
    }

    public static int vip(int i, Context context, String str) {
        if (str == null) {
            return 1;
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || packagesForUid.length == 0) {
            return 2;
        }
        for (String str2 : packagesForUid) {
            if (str2.equals(str)) {
                return 0;
            }
        }
        return 1;
    }

    public static void yandex(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        license(iArr, iArr2, iArr4);
        adcel(iArr4, iArr3);
    }
}
