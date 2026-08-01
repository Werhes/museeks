package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9413e {
    public static final String ad;
    public static final int[] adcel;
    public static final int[] advert;
    public static final Pattern appmetrica;
    public static HashMap billing;
    public static final Pattern license;
    public static final long[] metrica;
    public static final int[] mopub;
    public static final Pattern purchase;
    public static final String[] startapp;
    public static final byte[] vip;
    public static final String[] yandex;

    static {
        int i = Build.VERSION.SDK_INT;
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str2);
        ad = AbstractC8647e.isPro(i, ", ", sb);
        vip = new byte[0];
        metrica = new long[0];
        license = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        appmetrica = Pattern.compile("%([A-Fa-f0-9]{2})");
        purchase = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        yandex = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        startapp = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        adcel = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        mopub = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        advert = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, EnergyProfile.EVCONNECTOR_TYPE_OTHER, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, ModuleDescriptor.MODULE_VERSION, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static Bundle Signature(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ClassLoader classLoader = AbstractC9413e.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (RuntimeException e) {
            AbstractC2803e.billing("Util", "Ignoring invalid bundle", e);
            return null;
        }
    }

    /* renamed from: abstract, reason: not valid java name */
    public static boolean m2544abstract(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static long ad(long j, long j2) {
        long j3 = j + j2;
        long j4 = (((j2 ^ j) > 0L ? 1 : ((j2 ^ j) == 0L ? 0 : -1)) < 0) | ((j ^ j3) >= 0) ? j3 : ((j3 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j4 != Long.MIN_VALUE || j3 == Long.MIN_VALUE) && (j4 != Long.MAX_VALUE || j3 == Long.MAX_VALUE)) {
            return j4;
        }
        return Long.MAX_VALUE;
    }

    public static int adcel(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static int admob(int i, int i2, int i3, byte[] bArr) {
        while (i < i2) {
            i3 = adcel[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    public static int ads(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return 6005;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static boolean advert(SparseArray sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static boolean amazon(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static Looper applovin() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static int appmetrica(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            i3 = -(binarySearch + 2);
        } else {
            while (true) {
                i2 = binarySearch - 1;
                if (i2 < 0 || iArr[i2] != i) {
                    break;
                }
                binarySearch = i2;
            }
            i3 = z ? binarySearch : i2;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    public static int billing(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: break, reason: not valid java name */
    public static boolean m2545break(int i) {
        return i == 10 || i == 13;
    }

    /* renamed from: case, reason: not valid java name */
    public static long m2546case(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* renamed from: catch, reason: not valid java name */
    public static String m2547catch(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String tapsense = AbstractC3628e.tapsense(str);
        int i = 0;
        String str2 = tapsense.split("-", 2)[0];
        if (billing == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = yandex;
            HashMap hashMap = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                hashMap.put(strArr[i2], strArr[i2 + 1]);
            }
            billing = hashMap;
        }
        String str4 = (String) billing.get(str2);
        if (str4 != null) {
            StringBuilder inmobi = AbstractC8703e.inmobi(str4);
            inmobi.append(tapsense.substring(str2.length()));
            tapsense = inmobi.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return tapsense;
        }
        while (true) {
            String[] strArr2 = startapp;
            if (i >= strArr2.length) {
                return tapsense;
            }
            if (tapsense.startsWith(strArr2[i])) {
                return strArr2[i + 1] + tapsense.substring(strArr2[i].length());
            }
            i += 2;
        }
    }

    /* renamed from: class, reason: not valid java name */
    public static int m2548class(int i, ByteOrder byteOrder) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static long crashlytics(float f, long j) {
        return f == 1.0f ? j : Math.round(j * f);
    }

    /* renamed from: default, reason: not valid java name */
    public static boolean m2549default(C1292e c1292e, C1292e c1292e2, Inflater inflater) {
        if (c1292e.ad() > 0 && c1292e.adcel() == 120 && c1292e.ad() != 0) {
            if (c1292e2.ad.length < c1292e.ad()) {
                c1292e2.metrica(c1292e.ad() * 2);
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            inflater.setInput(c1292e.ad, c1292e.vip, c1292e.ad());
            int i = 0;
            while (true) {
                try {
                    byte[] bArr = c1292e2.ad;
                    i += inflater.inflate(bArr, i, bArr.length - i);
                    if (!inflater.finished()) {
                        if (inflater.needsDictionary() || inflater.needsInput()) {
                            break;
                        }
                        byte[] bArr2 = c1292e2.ad;
                        if (i == bArr2.length) {
                            c1292e2.metrica(bArr2.length * 2);
                        }
                    } else {
                        c1292e2.m572while(i);
                        inflater.reset();
                        return true;
                    }
                } catch (DataFormatException unused) {
                } catch (Throwable th) {
                    inflater.reset();
                    throw th;
                }
            }
            inflater.reset();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؚؑ۟, java.lang.Object, eؑۖؒ] */
    /* renamed from: else, reason: not valid java name */
    public static C0485e m2550else(ListenableFuture listenableFuture, InterfaceC18244e interfaceC18244e) {
        ?? obj = new Object();
        RunnableC3709e runnableC3709e = new RunnableC3709e(obj, listenableFuture, 1);
        EnumC3320e enumC3320e = EnumC3320e.f7489e;
        obj.ad(runnableC3709e, enumC3320e);
        listenableFuture.ad(new RunnableC9527e(8, listenableFuture, obj, interfaceC18244e), enumC3320e);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[RETURN] */
    /* renamed from: extends, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m2551extends(defpackage.InterfaceC16843e r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.billing()
            r2 = 1
            if (r1 != r2) goto L17
            r3 = 2
            boolean r3 = r4.mo2107e(r3)
            if (r3 == 0) goto L17
            r4.license()
        L15:
            r0 = r2
            goto L24
        L17:
            r3 = 4
            if (r1 != r3) goto L24
            boolean r1 = r4.mo2107e(r3)
            if (r1 == 0) goto L24
            r4.mo2125final()
            goto L15
        L24:
            boolean r1 = r4.mo2107e(r2)
            if (r1 == 0) goto L2e
            r4.pro()
            return r2
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9413e.m2551extends(eؙٗۙ):boolean");
    }

    /* renamed from: final, reason: not valid java name */
    public static Object[] m2552final(int i, Object[] objArr) {
        AbstractC2301e.billing(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    public static long firebase(long j) {
        return j == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j;
    }

    /* renamed from: goto, reason: not valid java name */
    public static String[] m2553goto() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] split = Build.VERSION.SDK_INT >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i = 0; i < split.length; i++) {
            split[i] = m2547catch(split[i]);
        }
        return split;
    }

    /* renamed from: implements, reason: not valid java name */
    public static void m2554implements(ArrayList arrayList, int i, int i2, int i3) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i4 = (i2 - i) - 1; i4 >= 0; i4--) {
            arrayDeque.addFirst(arrayList.remove(i + i4));
        }
        arrayList.addAll(Math.min(i3, arrayList.size()), arrayDeque);
    }

    /* renamed from: import, reason: not valid java name */
    public static long m2555import(long j, long j2, long j3, RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        return (j3 < j2 || j3 % j2 != 0) ? (j3 >= j2 || j2 % j3 != 0) ? (j3 < j || j3 % j != 0) ? (j3 >= j || j % j3 != 0) ? m2556instanceof(j, j2, j3, roundingMode) : AbstractC15389e.purchase(j2, AbstractC15389e.metrica(j, j3, RoundingMode.UNNECESSARY)) : AbstractC15389e.metrica(j2, AbstractC15389e.metrica(j3, j, RoundingMode.UNNECESSARY), roundingMode) : AbstractC15389e.purchase(j, AbstractC15389e.metrica(j2, j3, RoundingMode.UNNECESSARY)) : AbstractC15389e.metrica(j, AbstractC15389e.metrica(j3, j2, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static String inmobi(int i, String str) {
        String[] m2568synchronized = m2568synchronized(str);
        if (m2568synchronized.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : m2568synchronized) {
            if (i == AbstractC8542e.yandex(AbstractC8542e.license(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (java.lang.Math.abs(r9 - r2) == 0.5d) goto L54;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x007d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* renamed from: instanceof, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m2556instanceof(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9413e.m2556instanceof(long, long, long, java.math.RoundingMode):long");
    }

    /* renamed from: interface, reason: not valid java name */
    public static long m2557interface(float f, long j) {
        return f == 1.0f ? j : Math.round(j / f);
    }

    public static Point isPro(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && m2544abstract(context)) {
            String m2569this = Build.VERSION.SDK_INT < 28 ? m2569this("sys.display-size") : m2569this("vendor.display-size");
            if (!TextUtils.isEmpty(m2569this)) {
                try {
                    String[] split = m2569this.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                AbstractC2803e.purchase("Util", "Invalid display size: " + m2569this);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static int isVip(int i, String str) {
        int i2 = 0;
        for (String str2 : m2568synchronized(str)) {
            if (i == AbstractC8542e.yandex(AbstractC8542e.license(str2))) {
                i2++;
            }
        }
        return i2;
    }

    public static int license(List list, Long l, boolean z) {
        int i;
        int binarySearch = Collections.binarySearch(list, l);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            while (true) {
                int i2 = binarySearch - 1;
                if (i2 < 0 || ((Comparable) list.get(i2)).compareTo(l) != 0) {
                    break;
                }
                binarySearch = i2;
            }
            i = binarySearch;
        }
        return z ? Math.max(0, i) : i;
    }

    public static int loadAd(SparseArray sparseArray) {
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int i = 17;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            i = Objects.hashCode(sparseArray.valueAt(i2)) + ((sparseArray.keyAt(i2) + (i * 31)) * 31);
        }
        return i;
    }

    public static int metrica(C12214e c12214e, long j) {
        int i = c12214e.vip - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            if (c12214e.license(i3) < j) {
                i2 = i3 + 1;
            } else {
                i = i3 - 1;
            }
        }
        int i4 = i + 1;
        if (i4 < c12214e.vip && c12214e.license(i4) == j) {
            return i4;
        }
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public static long mopub(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* renamed from: native, reason: not valid java name */
    public static String m2558native(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i >= 10000 ? AbstractC1634e.smaato("custom (", i, ")") : "?";
        }
    }

    /* renamed from: new, reason: not valid java name */
    public static int m2559new(long j, long j2) {
        long purchase2 = AbstractC15389e.purchase(j, 100L);
        return AbstractC10509e.loadAd((purchase2 == Long.MAX_VALUE || purchase2 == Long.MIN_VALUE) ? j / (j2 / 100) : purchase2 / j2);
    }

    /* renamed from: package, reason: not valid java name */
    public static long m2560package(int i, long j) {
        return m2555import(j, 1000000L, i, RoundingMode.DOWN);
    }

    public static int premium(String str) {
        String[] split;
        int length;
        int i = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z = length >= 3 && "neg".equals(split[length - 2]);
        try {
            str2.getClass();
            i = Integer.parseInt(str2);
            if (z) {
                return -i;
            }
        } catch (NumberFormatException unused) {
        }
        return i;
    }

    /* renamed from: private, reason: not valid java name */
    public static void m2561private(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                m2561private(file2);
            }
        }
        file.delete();
    }

    public static int pro(int i) {
        switch (i) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return 28;
            case 13:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 23:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            default:
                return Alert.DURATION_SHOW_INDEFINITELY;
            case 14:
                return 25;
            case 20:
                return 30;
            case 21:
            case 22:
                return 31;
            case 30:
            case 31:
                return 34;
        }
    }

    /* renamed from: protected, reason: not valid java name */
    public static boolean m2562protected(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i == 30) {
            String str = Build.MODEL;
            if (AbstractC3628e.purchase(str, "moto g(20)") || AbstractC3628e.purchase(str, "rmx3231")) {
                return true;
            }
        }
        return i == 34 && AbstractC3628e.purchase(Build.MODEL, "sm-x200");
    }

    public static int purchase(long[] jArr, long j, boolean z) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            while (true) {
                int i2 = binarySearch - 1;
                if (i2 < 0 || jArr[i2] != j) {
                    break;
                }
                binarySearch = i2;
            }
            i = binarySearch;
        }
        return z ? Math.max(0, i) : i;
    }

    public static void remoteconfig(NotificationManager notificationManager, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || notificationManager.getNotificationChannel("default_channel_id") != null) {
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel("default_channel_id", str, 2);
        if (i <= 27) {
            notificationChannel.setShowBadge(false);
        }
        notificationManager.createNotificationChannel(notificationChannel);
    }

    /* renamed from: return, reason: not valid java name */
    public static String m2563return(int i) {
        return new String(new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i}, StandardCharsets.US_ASCII);
    }

    public static int signatures(int i) {
        if (i == 10) {
            return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i == 16) {
            return Build.VERSION.SDK_INT >= 32 ? 205215996 : 0;
        }
        if (i == 24) {
            return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
        }
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                switch (i) {
                    case 12:
                        return 743676;
                    case 13:
                        return Build.VERSION.SDK_INT >= 32 ? 30136348 : 0;
                    case 14:
                        return Build.VERSION.SDK_INT >= 32 ? 202070268 : 0;
                    default:
                        return 0;
                }
        }
    }

    public static boolean smaato(Object obj, Object[] objArr) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static float startapp(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* renamed from: static, reason: not valid java name */
    public static boolean m2564static(InterfaceC16843e interfaceC16843e, boolean z) {
        return interfaceC16843e == null || !interfaceC16843e.mo2129interface() || interfaceC16843e.billing() == 1 || interfaceC16843e.billing() == 4 || !(!z || interfaceC16843e.mo2106e() == 0 || interfaceC16843e.mo2106e() == 4);
    }

    /* renamed from: strictfp, reason: not valid java name */
    public static void m2565strictfp(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static String subs(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_SUBTYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static Handler subscription(C6321e c6321e) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        return new Handler(myLooper, c6321e);
    }

    /* renamed from: super, reason: not valid java name */
    public static long m2566super(String str) {
        Matcher matcher = license.matcher(str);
        if (!matcher.matches()) {
            throw C15125e.ad(null, "Invalid date/time format: " + str);
        }
        int i = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            int parseInt = Integer.parseInt(matcher.group(12)) * 60;
            String group = matcher.group(13);
            i = group != null ? Integer.parseInt(group) + parseInt : parseInt;
            if ("-".equals(matcher.group(11))) {
                i *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i != 0 ? timeInMillis - (i * 60000) : timeInMillis;
    }

    /* renamed from: switch, reason: not valid java name */
    public static long m2567switch(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static String[] m2568synchronized(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static int tapsense(int i) {
        if (i != 2) {
            if (i == 3) {
                return 1;
            }
            if (i != 4) {
                if (i != 21) {
                    if (i != 22) {
                        if (i != 268435456) {
                            if (i != 1342177280) {
                                if (i != 1610612736) {
                                    if (i == 1879048192) {
                                        return 8;
                                    }
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    /* renamed from: this, reason: not valid java name */
    public static String m2569this(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            AbstractC2803e.billing("Util", "Failed to read system property ".concat(str), e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1 A[RETURN] */
    /* renamed from: throw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m2570throw(android.net.Uri r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9413e.m2570throw(android.net.Uri, java.lang.String):int");
    }

    /* renamed from: transient, reason: not valid java name */
    public static void m2571transient(long j, long[] jArr) {
        long j2;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i = 0;
        if (j >= 1000000 && j % 1000000 == 0) {
            long metrica2 = AbstractC15389e.metrica(j, 1000000L, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = AbstractC15389e.metrica(jArr[i], metrica2, roundingMode);
                i++;
            }
            return;
        }
        if (j < 1000000 && 1000000 % j == 0) {
            long metrica3 = AbstractC15389e.metrica(1000000L, j, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = AbstractC15389e.purchase(jArr[i], metrica3);
                i++;
            }
            return;
        }
        int i2 = 0;
        while (i2 < jArr.length) {
            long j3 = jArr[i2];
            if (j3 != 0) {
                if (j >= j3 && j % j3 == 0) {
                    jArr[i2] = AbstractC15389e.metrica(1000000L, AbstractC15389e.metrica(j, j3, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j >= j3 || j3 % j != 0) {
                    j2 = j;
                    jArr[i2] = m2556instanceof(j3, 1000000L, j2, roundingMode);
                    i2++;
                    j = j2;
                } else {
                    jArr[i2] = AbstractC15389e.purchase(1000000L, AbstractC15389e.metrica(j3, j, RoundingMode.UNNECESSARY));
                }
            }
            j2 = j;
            i2++;
            j = j2;
        }
    }

    /* renamed from: try, reason: not valid java name */
    public static boolean m2572try(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4 || i == 1879048192;
    }

    public static int vip(long[] jArr, long j, boolean z) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i = binarySearch + 1;
            if (i >= jArr.length || jArr[i] != j) {
                break;
            }
            binarySearch = i;
        }
        return z ? binarySearch : i;
    }

    /* renamed from: while, reason: not valid java name */
    public static boolean m2573while(int i) {
        return i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4 || i == 1879048192;
    }

    public static void yandex(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
