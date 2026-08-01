package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.StrictMode;
import androidx.recyclerview.widget.RecyclerView;
import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؐٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12947e {
    public static final C2892e ad = new C2892e(1781109561, false, new C8898e(25));
    public static final C2892e vip = new C2892e(411176794, false, new C8898e(26));
    public static final C2892e metrica = new C2892e(-1128390623, false, new C14866e(8));
    public static final C2892e license = new C2892e(-1703170038, false, new C14866e(9));
    public static final C2892e appmetrica = new C2892e(-1944867351, false, new C14866e(10));
    public static final C2892e purchase = new C2892e(-435153464, false, new C8898e(27));
    public static final C2892e billing = new C2892e(1745232869, false, new C8898e(28));
    public static final C2892e yandex = new C2892e(-402175521, false, new C8898e(29));
    public static final C2892e startapp = new C2892e(292830012, false, new C12341e(0));

    public static boolean Signature(int[] iArr) {
        for (int i = 0; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static final List ad(C12347e c12347e, C12431e c12431e) {
        if (c12431e != null && c12431e.f24868e != 0) {
            return AbstractC13480e.m3575continue(c12431e.yandex());
        }
        if (c12347e != null) {
            long j = c12347e.ad;
            if (!C12347e.license(j)) {
                return Collections.singletonList(new C9363e(new C4282e(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, C11964e.metrica, null, 61439), C12347e.billing(j), C12347e.purchase(j)));
            }
        }
        return C13664e.f27089e;
    }

    public static boolean adcel(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int i = 6;
        while (true) {
            z = true;
            if (i < 0) {
                break;
            }
            int i2 = iArr[7 + i] ^ RecyclerView.UNDEFINED_DURATION;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                z = false;
                break;
            }
            if (i2 > i3) {
                break;
            }
            i--;
        }
        if (z) {
            isPro(iArr, 7, iArr2, 0, iArr3);
            return z;
        }
        isPro(iArr2, 0, iArr, 7, iArr3);
        return z;
    }

    public static final void admob(Activity activity, Intent intent) {
        int i;
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("List adapter activity trampoline invoked without specifying target intent.");
        }
        Intent intent2 = (Intent) parcelableExtra;
        if (intent.hasExtra("android.widget.extra.CHECKED")) {
            intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
        }
        String stringExtra = intent.getStringExtra("ACTION_TYPE");
        if (stringExtra == null) {
            throw new IllegalArgumentException("List adapter activity trampoline invoked without trampoline type");
        }
        Bundle bundleExtra = intent.getBundleExtra("ACTIVITY_OPTIONS");
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(Build.VERSION.SDK_INT >= 31 ? AbstractC16048e.ads(new StrictMode.VmPolicy.Builder(vmPolicy)).build() : new StrictMode.VmPolicy.Builder().build());
        if (stringExtra == null) {
            throw new NullPointerException("Name is null");
        }
        if (stringExtra.equals("ACTIVITY")) {
            i = 1;
        } else if (stringExtra.equals("BROADCAST")) {
            i = 2;
        } else if (stringExtra.equals("SERVICE")) {
            i = 3;
        } else if (stringExtra.equals("FOREGROUND_SERVICE")) {
            i = 4;
        } else {
            if (!stringExtra.equals("CALLBACK")) {
                throw new IllegalArgumentException("No enum constant androidx.glance.appwidget.action.ActionTrampolineType.".concat(stringExtra));
            }
            i = 5;
        }
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class != 0) {
            if (m2467class != 1) {
                if (m2467class == 2) {
                    activity.startService(intent2);
                } else if (m2467class != 3) {
                    if (m2467class != 4) {
                        throw new C14803e(10);
                    }
                } else if (Build.VERSION.SDK_INT >= 26) {
                    AbstractC11815e.m3250else(activity, intent2);
                } else {
                    activity.startService(intent2);
                }
            }
            activity.sendBroadcast(intent2);
        } else {
            activity.startActivity(intent2, bundleExtra);
        }
        Unit unit = Unit.INSTANCE;
        StrictMode.setVmPolicy(vmPolicy);
        activity.finish();
    }

    public static int[] advert(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[7];
        for (int i = 0; i < 7; i++) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArr;
    }

    public static boolean amazon(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            int i2 = iArr[i] ^ RecyclerView.UNDEFINED_DURATION;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static BigInteger applovin(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                AbstractC3628e.billing(i2, (6 - i) << 2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static int appmetrica(int[] iArr, int[] iArr2) {
        long j = (iArr[7] & 4294967295L) + (iArr2[14] & 4294967295L);
        int i = (int) j;
        iArr[7] = i;
        iArr2[14] = i;
        long j2 = (iArr[8] & 4294967295L) + (iArr2[15] & 4294967295L) + (j >>> 32);
        int i2 = (int) j2;
        iArr[8] = i2;
        iArr2[15] = i2;
        long j3 = (iArr[9] & 4294967295L) + (iArr2[16] & 4294967295L) + (j2 >>> 32);
        int i3 = (int) j3;
        iArr[9] = i3;
        iArr2[16] = i3;
        long j4 = (iArr[10] & 4294967295L) + (iArr2[17] & 4294967295L) + (j3 >>> 32);
        int i4 = (int) j4;
        iArr[10] = i4;
        iArr2[17] = i4;
        long j5 = (iArr[11] & 4294967295L) + (iArr2[18] & 4294967295L) + (j4 >>> 32);
        int i5 = (int) j5;
        iArr[11] = i5;
        iArr2[18] = i5;
        long j6 = (iArr[12] & 4294967295L) + (iArr2[19] & 4294967295L) + (j5 >>> 32);
        int i6 = (int) j6;
        iArr[12] = i6;
        iArr2[19] = i6;
        long j7 = (iArr[13] & 4294967295L) + (4294967295L & iArr2[20]) + (j6 >>> 32);
        int i7 = (int) j7;
        iArr[13] = i7;
        iArr2[20] = i7;
        return (int) (j7 >>> 32);
    }

    public static void billing(int i, int[] iArr, int[] iArr2) {
        iArr2[i] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
        iArr2[i + 5] = iArr[5];
        iArr2[i + 6] = iArr[6];
    }

    public static int inmobi(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        long j7 = ((iArr[6] & 4294967295L) - (iArr2[6] & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static void isPro(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3) {
        long j = (iArr[i] & 4294967295L) - (iArr2[i2] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((iArr[i + 1] & 4294967295L) - (iArr2[i2 + 1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((iArr[i + 2] & 4294967295L) - (iArr2[i2 + 2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((iArr[i + 3] & 4294967295L) - (iArr2[i2 + 3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((iArr[i + 4] & 4294967295L) - (iArr2[i2 + 4] & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((iArr[i + 5] & 4294967295L) - (iArr2[i2 + 5] & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        iArr3[6] = (int) (((iArr[i + 6] & 4294967295L) - (iArr2[i2 + 6] & 4294967295L)) + (j6 >> 32));
    }

    public static void isVip(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 14;
        int i2 = 0;
        int i3 = 6;
        while (true) {
            int i4 = i3 - 1;
            long j2 = iArr[i3] & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i2 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | ((i2 << 31) & 4294967295L);
                iArr2[0] = (int) j4;
                int i5 = ((int) (j4 >>> 32)) & 1;
                long j6 = iArr[1] & 4294967295L;
                long j7 = (j6 * j) + j5;
                int i6 = (int) j7;
                iArr2[1] = i5 | (i6 << 1);
                long j8 = iArr[2] & 4294967295L;
                long j9 = (j8 * j) + (iArr2[2] & 4294967295L) + (j7 >>> 32);
                int i7 = (int) j9;
                iArr2[2] = (i7 << 1) | (i6 >>> 31);
                long amazon = AbstractC1786e.amazon(j8, j6, j9 >>> 32, iArr2[3] & 4294967295L);
                long j10 = (iArr2[4] & 4294967295L) + (amazon >>> 32);
                long j11 = iArr[3] & 4294967295L;
                long j12 = (iArr2[5] & 4294967295L) + (j10 >>> 32);
                long j13 = j10 & 4294967295L;
                long j14 = (iArr2[6] & 4294967295L) + (j12 >>> 32);
                long j15 = j12 & 4294967295L;
                long j16 = (j11 * j) + (amazon & 4294967295L);
                int i8 = (int) j16;
                iArr2[3] = (i7 >>> 31) | (i8 << 1);
                int i9 = i8 >>> 31;
                long amazon2 = AbstractC1786e.amazon(j11, j6, j16 >>> 32, j13);
                long amazon3 = AbstractC1786e.amazon(j11, j8, amazon2 >>> 32, j15);
                long j17 = j14 + (amazon3 >>> 32);
                long j18 = iArr[4] & 4294967295L;
                long j19 = (iArr2[7] & 4294967295L) + (j17 >>> 32);
                long j20 = j17 & 4294967295L;
                long j21 = (iArr2[8] & 4294967295L) + (j19 >>> 32);
                long j22 = j19 & 4294967295L;
                long j23 = (j18 * j) + (amazon2 & 4294967295L);
                int i10 = (int) j23;
                iArr2[4] = i9 | (i10 << 1);
                int i11 = i10 >>> 31;
                long amazon4 = AbstractC1786e.amazon(j18, j6, j23 >>> 32, amazon3 & 4294967295L);
                long amazon5 = AbstractC1786e.amazon(j18, j8, amazon4 >>> 32, j20);
                long amazon6 = AbstractC1786e.amazon(j18, j11, amazon5 >>> 32, j22);
                long j24 = j21 + (amazon6 >>> 32);
                long j25 = iArr[5] & 4294967295L;
                long j26 = (iArr2[9] & 4294967295L) + (j24 >>> 32);
                long j27 = j24 & 4294967295L;
                long j28 = (iArr2[10] & 4294967295L) + (j26 >>> 32);
                long j29 = j26 & 4294967295L;
                long j30 = (j25 * j) + (amazon4 & 4294967295L);
                int i12 = (int) j30;
                iArr2[5] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                long amazon7 = AbstractC1786e.amazon(j25, j6, j30 >>> 32, amazon5 & 4294967295L);
                long amazon8 = AbstractC1786e.amazon(j25, j8, amazon7 >>> 32, amazon6 & 4294967295L);
                long amazon9 = AbstractC1786e.amazon(j25, j11, amazon8 >>> 32, j27);
                long j31 = amazon8 & 4294967295L;
                long amazon10 = AbstractC1786e.amazon(j25, j18, amazon9 >>> 32, j29);
                long j32 = j28 + (amazon10 >>> 32);
                long j33 = amazon10 & 4294967295L;
                long j34 = iArr[6] & 4294967295L;
                long j35 = (iArr2[11] & 4294967295L) + (j32 >>> 32);
                long j36 = j32 & 4294967295L;
                long j37 = (iArr2[12] & 4294967295L) + (j35 >>> 32);
                long j38 = j35 & 4294967295L;
                long j39 = (j34 * j) + (amazon7 & 4294967295L);
                int i14 = (int) j39;
                iArr2[6] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                long amazon11 = AbstractC1786e.amazon(j34, j6, j39 >>> 32, j31);
                long amazon12 = AbstractC1786e.amazon(j34, j8, amazon11 >>> 32, amazon9 & 4294967295L);
                long amazon13 = AbstractC1786e.amazon(j34, j11, amazon12 >>> 32, j33);
                long amazon14 = AbstractC1786e.amazon(j34, j18, amazon13 >>> 32, j36);
                long amazon15 = AbstractC1786e.amazon(j34, j25, amazon14 >>> 32, j38);
                long j40 = j37 + (amazon15 >>> 32);
                int i16 = (int) amazon11;
                iArr2[7] = (i16 << 1) | i15;
                int i17 = (int) amazon12;
                iArr2[8] = (i16 >>> 31) | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) amazon13;
                iArr2[9] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) amazon14;
                iArr2[10] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) amazon15;
                iArr2[11] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) j40;
                iArr2[12] = i24 | (i25 << 1);
                iArr2[13] = ((iArr2[13] + ((int) (j40 >>> 32))) << 1) | (i25 >>> 31);
                return;
            }
            i3 = i4;
        }
    }

    public static int license(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        long j = (iArr[i] & 4294967295L) + (iArr2[i2] & 4294967295L) + (i3 & 4294967295L);
        iArr2[i2] = (int) j;
        long j2 = (iArr[i + 1] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j >>> 32);
        iArr2[i2 + 1] = (int) j2;
        long j3 = (iArr[i + 2] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j2 >>> 32);
        iArr2[i2 + 2] = (int) j3;
        long j4 = (iArr[i + 3] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j3 >>> 32);
        iArr2[i2 + 3] = (int) j4;
        long j5 = (iArr[i + 4] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j4 >>> 32);
        iArr2[i2 + 4] = (int) j5;
        long j6 = (iArr[i + 5] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j5 >>> 32);
        iArr2[i2 + 5] = (int) j6;
        long j7 = (iArr[i + 6] & 4294967295L) + (4294967295L & iArr2[r10]) + (j6 >>> 32);
        iArr2[i2 + 6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static boolean loadAd(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int metrica(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (iArr3[6] & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static boolean mopub(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static Intent purchase(Intent intent, C6555e c6555e, int i, int i2) {
        C16911e c16911e = c6555e.loadAd;
        Intent intent2 = new Intent();
        intent2.setComponent(i2 == 1 ? (ComponentName) c16911e.f33137e : (ComponentName) c16911e.f33136e);
        intent2.setData(startapp(c6555e, i, i2, BuildConfig.FLAVOR));
        intent2.putExtra("ACTION_TYPE", AbstractC8703e.firebase(i2));
        intent2.putExtra("ACTION_INTENT", intent);
        return intent2;
    }

    public static int remoteconfig(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6] & 4294967295L;
        long j8 = 0;
        int i = 0;
        while (i < 7) {
            long j9 = j7;
            long j10 = iArr[i] & 4294967295L;
            long j11 = (iArr3[i] & 4294967295L) + (j10 * j);
            iArr3[i] = (int) j11;
            int i2 = i + 1;
            long j12 = (j10 * j2) + (iArr3[i2] & 4294967295L) + (j11 >>> 32);
            iArr3[i2] = (int) j12;
            long j13 = (j10 * j3) + (iArr3[r15] & 4294967295L) + (j12 >>> 32);
            int i3 = i;
            iArr3[i + 2] = (int) j13;
            long j14 = (j10 * j4) + (iArr3[r2] & 4294967295L) + (j13 >>> 32);
            iArr3[i3 + 3] = (int) j14;
            long j15 = (j10 * j5) + (iArr3[r2] & 4294967295L) + (j14 >>> 32);
            iArr3[i3 + 4] = (int) j15;
            long j16 = (j10 * j6) + (iArr3[r2] & 4294967295L) + (j15 >>> 32);
            iArr3[i3 + 5] = (int) j16;
            long j17 = (j10 * j9) + (iArr3[r2] & 4294967295L) + (j16 >>> 32);
            iArr3[i3 + 6] = (int) j17;
            long j18 = (j17 >>> 32) + (iArr3[r2] & 4294967295L) + j8;
            iArr3[i3 + 7] = (int) j18;
            j8 = j18 >>> 32;
            i = i2;
            j7 = j9;
        }
        return (int) j8;
    }

    public static int smaato(int[] iArr) {
        return iArr[0] & 1;
    }

    public static final Uri startapp(C6555e c6555e, int i, int i2, String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        builder.path(AbstractC8703e.firebase(i2));
        builder.appendQueryParameter("appWidgetId", String.valueOf(c6555e.vip));
        builder.appendQueryParameter("viewId", String.valueOf(i));
        builder.appendQueryParameter("viewSize", C16109e.metrica(c6555e.adcel));
        builder.appendQueryParameter("extraData", str);
        if (c6555e.purchase) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(c6555e.mopub));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(-1));
        }
        return builder.build();
    }

    public static void subscription(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6] & 4294967295L;
        long j8 = iArr[0] & 4294967295L;
        long j9 = j8 * j;
        iArr3[0] = (int) j9;
        char c = ' ';
        long j10 = (j8 * j2) + (j9 >>> 32);
        iArr3[1] = (int) j10;
        long j11 = (j8 * j3) + (j10 >>> 32);
        iArr3[2] = (int) j11;
        long j12 = (j8 * j4) + (j11 >>> 32);
        iArr3[3] = (int) j12;
        long j13 = (j8 * j5) + (j12 >>> 32);
        iArr3[4] = (int) j13;
        long j14 = (j8 * j6) + (j13 >>> 32);
        iArr3[5] = (int) j14;
        long j15 = (j8 * j7) + (j14 >>> 32);
        iArr3[6] = (int) j15;
        iArr3[7] = (int) (j15 >>> 32);
        int i = 1;
        for (int i2 = 7; i < i2; i2 = 7) {
            long j16 = iArr[i] & 4294967295L;
            char c2 = c;
            long j17 = j7;
            long j18 = (j16 * j) + (iArr3[i] & 4294967295L);
            iArr3[i] = (int) j18;
            long j19 = j18 >>> c2;
            long j20 = j16 * j2;
            int i3 = i + 1;
            long j21 = j20 + (iArr3[i3] & 4294967295L) + j19;
            iArr3[i3] = (int) j21;
            long j22 = (j16 * j3) + (iArr3[r8] & 4294967295L) + (j21 >>> c2);
            iArr3[i + 2] = (int) j22;
            long j23 = (j16 * j4) + (iArr3[r8] & 4294967295L) + (j22 >>> c2);
            iArr3[i + 3] = (int) j23;
            long j24 = (j16 * j5) + (iArr3[r8] & 4294967295L) + (j23 >>> c2);
            iArr3[i + 4] = (int) j24;
            long j25 = (j16 * j6) + (iArr3[r8] & 4294967295L) + (j24 >>> c2);
            iArr3[i + 5] = (int) j25;
            long j26 = (j16 * j17) + (iArr3[r8] & 4294967295L) + (j25 >>> c2);
            iArr3[i + 6] = (int) j26;
            iArr3[i + 7] = (int) (j26 >>> c2);
            c = c2;
            i = i3;
            j7 = j17;
        }
    }

    public static final C12380e tapsense(String str, C13770e c13770e, int i) {
        if ((i & 1) != 0) {
            str = BuildConfig.FLAVOR;
        }
        int length = str.length();
        long metrica2 = AbstractC9262e.metrica(length, length);
        Object[] objArr = new Object[0];
        C1400e c1400e = C1400e.f4209e;
        boolean purchase2 = c13770e.purchase(str) | c13770e.appmetrica(metrica2);
        Object m3681throw = c13770e.m3681throw();
        if (purchase2 || m3681throw == C2987e.ad) {
            m3681throw = new C14696e(str, metrica2, 2);
            c13770e.m3682throws(m3681throw);
        }
        return (C12380e) AbstractC10510e.appmetrica(objArr, c1400e, (Function0) m3681throw, c13770e, 48);
    }

    public static int vip(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static void yandex(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public abstract void pro(Throwable th);

    public abstract void signatures(C11980e c11980e);
}
