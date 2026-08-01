package defpackage;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٟؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10077e {
    public static final C2892e ad = new C2892e(1598145118, false, new C12341e(1));
    public static final C2892e vip = new C2892e(1083909494, false, new C14866e(11));
    public static final C2892e metrica = new C2892e(654084171, false, new C12341e(2));
    public static final C2892e license = new C2892e(1607006894, false, new C14866e(12));
    public static final C2892e appmetrica = new C2892e(1049022831, false, new C14866e(13));

    public static Executor Signature(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? AbstractC17305e.pro(context) : new ExecutorC13626e(new Handler(context.getMainLooper()), 0);
    }

    public static int ad(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j8 = (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (j7 >>> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static boolean adcel(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static final C10566e admob(C0398e c0398e) {
        C10566e c10566e = c0398e.ad;
        long j = c0398e.vip;
        c10566e.getClass();
        return c10566e.subSequence(C12347e.billing(j), C12347e.purchase(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void ads(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                throw new IllegalArgumentException(AbstractC1786e.signatures(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        if (activity instanceof InterfaceC16898e) {
            ((InterfaceC16898e) activity).getClass();
        }
        activity.requestPermissions(strArr, i);
    }

    public static int[] advert(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0046, code lost:
    
        if (r5.metrica == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList amazon(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            eِِْ r1 = new eِِْ
            r1.<init>(r0, r8)
            java.lang.Object r2 = defpackage.AbstractC16340e.metrica
            monitor-enter(r2)
            java.util.WeakHashMap r3 = defpackage.AbstractC16340e.vip     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L4f
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L4f
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            eٍَٗ r5 = (defpackage.C16900e) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L4f
            android.content.res.Configuration r6 = r5.vip     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4c
            if (r8 != 0) goto L3e
            int r6 = r5.metrica     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L48
            goto L3e
        L3c:
            r8 = move-exception
            goto L91
        L3e:
            if (r8 == 0) goto L4c
            int r6 = r5.metrica     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4c
        L48:
            android.content.res.ColorStateList r3 = r5.ad     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L51
        L4c:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L4f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L51:
            if (r3 == 0) goto L54
            return r3
        L54:
            java.lang.ThreadLocal r2 = defpackage.AbstractC16340e.ad
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L66
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L66:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L75
            r3 = 31
            if (r2 > r3) goto L75
            goto L86
        L75:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = defpackage.AbstractC11195e.ad(r0, r2, r8)     // Catch: java.lang.Exception -> L7e
            goto L86
        L7e:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L86:
            if (r4 == 0) goto L8c
            defpackage.AbstractC16340e.ad(r1, r9, r4, r8)
            goto L90
        L8c:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r9, r8)
        L90:
            return r4
        L91:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC10077e.amazon(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static int applovin(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6] & 4294967295L;
        long j8 = iArr2[7] & 4294967295L;
        long j9 = 0;
        int i = 0;
        while (i < 8) {
            long j10 = iArr[i] & 4294967295L;
            int i2 = i;
            long j11 = (j10 * j) + (iArr3[i2] & 4294967295L);
            iArr3[i2] = (int) j11;
            int i3 = i2 + 1;
            long j12 = (j10 * j2) + (iArr3[i3] & 4294967295L) + (j11 >>> 32);
            iArr3[i3] = (int) j12;
            long j13 = (j10 * j3) + (iArr3[r4] & 4294967295L) + (j12 >>> 32);
            iArr3[i2 + 2] = (int) j13;
            long j14 = (j10 * j4) + (iArr3[r4] & 4294967295L) + (j13 >>> 32);
            iArr3[i2 + 3] = (int) j14;
            long j15 = (j10 * j5) + (iArr3[r4] & 4294967295L) + (j14 >>> 32);
            iArr3[i2 + 4] = (int) j15;
            long j16 = (j10 * j6) + (iArr3[r4] & 4294967295L) + (j15 >>> 32);
            iArr3[i2 + 5] = (int) j16;
            long j17 = (j10 * j7) + (iArr3[r4] & 4294967295L) + (j16 >>> 32);
            iArr3[i2 + 6] = (int) j17;
            long j18 = (j10 * j8) + (iArr3[r4] & 4294967295L) + (j17 >>> 32);
            iArr3[i2 + 7] = (int) j18;
            long j19 = (j18 >>> 32) + (iArr3[r4] & 4294967295L) + j9;
            iArr3[i2 + 8] = (int) j19;
            j9 = j19 >>> 32;
            i = i3;
        }
        return (int) j9;
    }

    public static int appmetrica(Context context, String str) {
        boolean z;
        AbstractC12110e.metrica(str, "permission must be non-null");
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        C1582e c1582e = new C1582e(context);
        if (i >= 24) {
            z = AbstractC12026e.metrica(c1582e.ad);
        } else {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i2 = applicationInfo.uid;
            try {
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                Class<?> cls2 = Integer.TYPE;
                Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
                Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
                num.getClass();
                if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i2), packageName)).intValue() != 0) {
                    z = false;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            }
            z = true;
        }
        return z ? 0 : -1;
    }

    public static void billing(int i, long[] jArr, long[] jArr2) {
        jArr2[i] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
        jArr2[i + 3] = jArr[3];
    }

    /* renamed from: class, reason: not valid java name */
    public static void m2755class(int[] iArr, int[] iArr2) {
        long j = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        long j5 = ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L)) + (j4 >> 32);
        iArr2[4] = (int) j5;
        long j6 = ((iArr2[5] & 4294967295L) - (iArr[5] & 4294967295L)) + (j5 >> 32);
        iArr2[5] = (int) j6;
        long j7 = ((iArr2[6] & 4294967295L) - (iArr[6] & 4294967295L)) + (j6 >> 32);
        iArr2[6] = (int) j7;
        iArr2[7] = (int) (((iArr2[7] & 4294967295L) - (4294967295L & iArr[7])) + (j7 >> 32));
    }

    public static int crashlytics(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j8 = ((iArr[7] & 4294967295L) - (iArr2[7] & 4294967295L)) + (j7 >> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static void firebase(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3) {
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
        long j7 = ((iArr[i + 6] & 4294967295L) - (iArr2[i2 + 6] & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        iArr3[7] = (int) (((iArr[i + 7] & 4294967295L) - (iArr2[i2 + 7] & 4294967295L)) + (j7 >> 32));
    }

    /* renamed from: goto, reason: not valid java name */
    public static BigInteger m2756goto(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 4; i++) {
            long j = jArr[i];
            if (j != 0) {
                AbstractC3628e.admob((3 - i) << 3, j, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static boolean inmobi(long[] jArr) {
        for (int i = 0; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: interface, reason: not valid java name */
    public static BigInteger m2757interface(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                AbstractC3628e.billing(i2, (7 - i) << 2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void isPro(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6] & 4294967295L;
        long j8 = iArr2[7] & 4294967295L;
        long j9 = iArr[0] & 4294967295L;
        long j10 = j9 * j;
        iArr3[0] = (int) j10;
        long j11 = (j9 * j2) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (j9 * j3) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (j9 * j4) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (j9 * j5) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (j9 * j6) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (j9 * j7) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (j9 * j8) + (j16 >>> 32);
        iArr3[7] = (int) j17;
        iArr3[8] = (int) (j17 >>> 32);
        int i = 1;
        for (int i2 = 8; i < i2; i2 = 8) {
            long j18 = iArr[i] & 4294967295L;
            long j19 = (j18 * j) + (iArr3[i] & 4294967295L);
            iArr3[i] = (int) j19;
            int i3 = i + 1;
            long j20 = j5;
            long j21 = (j18 * j2) + (iArr3[i3] & 4294967295L) + (j19 >>> 32);
            iArr3[i3] = (int) j21;
            long j22 = (j18 * j3) + (iArr3[r7] & 4294967295L) + (j21 >>> 32);
            iArr3[i + 2] = (int) j22;
            long j23 = (j18 * j4) + (iArr3[r7] & 4294967295L) + (j22 >>> 32);
            iArr3[i + 3] = (int) j23;
            long j24 = (j18 * j20) + (iArr3[r7] & 4294967295L) + (j23 >>> 32);
            iArr3[i + 4] = (int) j24;
            long j25 = (j18 * j6) + (iArr3[r7] & 4294967295L) + (j24 >>> 32);
            iArr3[i + 5] = (int) j25;
            long j26 = (j18 * j7) + (iArr3[r7] & 4294967295L) + (j25 >>> 32);
            iArr3[i + 6] = (int) j26;
            long j27 = (j18 * j8) + (iArr3[r7] & 4294967295L) + (j26 >>> 32);
            iArr3[i + 7] = (int) j27;
            iArr3[i + 8] = (int) (j27 >>> 32);
            i = i3;
            j5 = j20;
        }
    }

    public static boolean isVip(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int license(int[] iArr, int[] iArr2) {
        long j = (iArr[8] & 4294967295L) + (iArr2[16] & 4294967295L);
        int i = (int) j;
        iArr[8] = i;
        iArr2[16] = i;
        long j2 = (iArr[9] & 4294967295L) + (iArr2[17] & 4294967295L) + (j >>> 32);
        int i2 = (int) j2;
        iArr[9] = i2;
        iArr2[17] = i2;
        long j3 = (iArr[10] & 4294967295L) + (iArr2[18] & 4294967295L) + (j2 >>> 32);
        int i3 = (int) j3;
        iArr[10] = i3;
        iArr2[18] = i3;
        long j4 = (iArr[11] & 4294967295L) + (iArr2[19] & 4294967295L) + (j3 >>> 32);
        int i4 = (int) j4;
        iArr[11] = i4;
        iArr2[19] = i4;
        long j5 = (iArr[12] & 4294967295L) + (iArr2[20] & 4294967295L) + (j4 >>> 32);
        int i5 = (int) j5;
        iArr[12] = i5;
        iArr2[20] = i5;
        long j6 = (iArr[13] & 4294967295L) + (iArr2[21] & 4294967295L) + (j5 >>> 32);
        int i6 = (int) j6;
        iArr[13] = i6;
        iArr2[21] = i6;
        long j7 = (iArr[14] & 4294967295L) + (iArr2[22] & 4294967295L) + (j6 >>> 32);
        int i7 = (int) j7;
        iArr[14] = i7;
        iArr2[22] = i7;
        long j8 = (iArr[15] & 4294967295L) + (4294967295L & iArr2[23]) + (j7 >>> 32);
        int i8 = (int) j8;
        iArr[15] = i8;
        iArr2[23] = i8;
        return (int) (j8 >>> 32);
    }

    public static Set loadAd() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static int metrica(int i, int i2, int[] iArr, int[] iArr2, int i3) {
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
        long j7 = (iArr[i + 6] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j6 >>> 32);
        iArr2[i2 + 6] = (int) j7;
        long j8 = (iArr[i + 7] & 4294967295L) + (4294967295L & iArr2[r10]) + (j7 >>> 32);
        iArr2[i2 + 7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static boolean mopub(long[] jArr, long[] jArr2) {
        for (int i = 3; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void premium(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 16;
        int i2 = 0;
        int i3 = 7;
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
                long j18 = amazon3 & 4294967295L;
                long j19 = iArr[4] & 4294967295L;
                long j20 = (iArr2[7] & 4294967295L) + (j17 >>> 32);
                long j21 = (iArr2[8] & 4294967295L) + (j20 >>> 32);
                long j22 = j20 & 4294967295L;
                long j23 = (j19 * j) + (amazon2 & 4294967295L);
                int i10 = (int) j23;
                iArr2[4] = i9 | (i10 << 1);
                long amazon4 = AbstractC1786e.amazon(j19, j6, j23 >>> 32, j18);
                long amazon5 = AbstractC1786e.amazon(j19, j8, amazon4 >>> 32, j17 & 4294967295L);
                long amazon6 = AbstractC1786e.amazon(j19, j11, amazon5 >>> 32, j22);
                long j24 = amazon5 & 4294967295L;
                long j25 = j21 + (amazon6 >>> 32);
                long j26 = amazon6 & 4294967295L;
                long j27 = iArr[5] & 4294967295L;
                long j28 = (iArr2[9] & 4294967295L) + (j25 >>> 32);
                long j29 = (j27 * j) + (amazon4 & 4294967295L);
                int i11 = (int) j29;
                iArr2[5] = (i10 >>> 31) | (i11 << 1);
                int i12 = i11 >>> 31;
                long amazon7 = AbstractC1786e.amazon(j27, j6, j29 >>> 32, j24);
                long amazon8 = AbstractC1786e.amazon(j27, j8, amazon7 >>> 32, j26);
                long amazon9 = AbstractC1786e.amazon(j27, j11, amazon8 >>> 32, j25 & 4294967295L);
                long j30 = amazon8 & 4294967295L;
                long amazon10 = AbstractC1786e.amazon(j27, j19, amazon9 >>> 32, j28 & 4294967295L);
                long j31 = amazon9 & 4294967295L;
                long j32 = (iArr2[10] & 4294967295L) + (j28 >>> 32) + (amazon10 >>> 32);
                long j33 = iArr[6] & 4294967295L;
                long j34 = (iArr2[11] & 4294967295L) + (j32 >>> 32);
                long j35 = (iArr2[12] & 4294967295L) + (j34 >>> 32);
                long j36 = (j33 * j) + (amazon7 & 4294967295L);
                int i13 = (int) j36;
                iArr2[6] = i12 | (i13 << 1);
                int i14 = i13 >>> 31;
                long amazon11 = AbstractC1786e.amazon(j33, j6, j36 >>> 32, j30);
                long amazon12 = AbstractC1786e.amazon(j33, j8, amazon11 >>> 32, j31);
                long amazon13 = AbstractC1786e.amazon(j33, j11, amazon12 >>> 32, amazon10 & 4294967295L);
                long j37 = amazon12 & 4294967295L;
                long amazon14 = AbstractC1786e.amazon(j33, j19, amazon13 >>> 32, j32 & 4294967295L);
                long j38 = amazon13 & 4294967295L;
                long amazon15 = AbstractC1786e.amazon(j33, j27, amazon14 >>> 32, j34 & 4294967295L);
                long j39 = j35 + (amazon15 >>> 32);
                long j40 = iArr[7] & 4294967295L;
                long j41 = (iArr2[13] & 4294967295L) + (j39 >>> 32);
                long j42 = (iArr2[14] & 4294967295L) + (j41 >>> 32);
                long j43 = j41 & 4294967295L;
                long j44 = (j40 * j) + (amazon11 & 4294967295L);
                int i15 = (int) j44;
                iArr2[7] = (i15 << 1) | i14;
                int i16 = i15 >>> 31;
                long amazon16 = AbstractC1786e.amazon(j40, j6, j44 >>> 32, j37);
                long amazon17 = AbstractC1786e.amazon(j40, j8, amazon16 >>> 32, j38);
                long amazon18 = AbstractC1786e.amazon(j40, j11, amazon17 >>> 32, amazon14 & 4294967295L);
                long amazon19 = AbstractC1786e.amazon(j40, j19, amazon18 >>> 32, amazon15 & 4294967295L);
                long amazon20 = AbstractC1786e.amazon(j40, j27, amazon19 >>> 32, j39 & 4294967295L);
                long amazon21 = AbstractC1786e.amazon(j40, j33, amazon20 >>> 32, j43);
                long j45 = j42 + (amazon21 >>> 32);
                int i17 = (int) amazon16;
                iArr2[8] = (i17 << 1) | i16;
                int i18 = (int) amazon17;
                iArr2[9] = (i17 >>> 31) | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) amazon18;
                iArr2[10] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) amazon19;
                iArr2[11] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) amazon20;
                iArr2[12] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) amazon21;
                iArr2[13] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j45;
                iArr2[14] = i27 | (i28 << 1);
                iArr2[15] = ((iArr2[15] + ((int) (j45 >>> 32))) << 1) | (i28 >>> 31);
                return;
            }
            i3 = i4;
        }
    }

    public static boolean pro(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
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

    public static void purchase(int i, int[] iArr, int[] iArr2) {
        iArr2[i] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
        iArr2[i + 5] = iArr[5];
        iArr2[i + 6] = iArr[6];
        iArr2[i + 7] = iArr[7];
    }

    public static final C10566e remoteconfig(C0398e c0398e, int i) {
        C10566e c10566e = c0398e.ad;
        long j = c0398e.vip;
        int billing = C12347e.billing(j);
        int i2 = billing - i;
        if (((billing ^ i2) & (i ^ billing)) < 0) {
            i2 = 0;
        }
        return c10566e.subSequence(Math.max(0, i2), C12347e.billing(j));
    }

    public static boolean signatures(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int smaato(int[] iArr) {
        return iArr[0] & 1;
    }

    public static boolean startapp(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int i = 7;
        while (true) {
            z = true;
            if (i < 0) {
                break;
            }
            int i2 = iArr[8 + i] ^ RecyclerView.UNDEFINED_DURATION;
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
            firebase(iArr, 8, iArr2, 0, iArr3);
            return z;
        }
        firebase(iArr2, 0, iArr, 8, iArr3);
        return z;
    }

    public static void subs(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC11815e.m3264return(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static final C10566e subscription(C0398e c0398e, int i) {
        C10566e c10566e = c0398e.ad;
        C10566e c10566e2 = c0398e.ad;
        long j = c0398e.vip;
        int purchase = C12347e.purchase(j);
        int purchase2 = C12347e.purchase(j);
        int i2 = purchase2 + i;
        if (((i ^ i2) & (purchase2 ^ i2)) < 0) {
            i2 = c10566e2.f20850e.length();
        }
        return c10566e.subSequence(purchase, Math.min(i2, c10566e2.f20850e.length()));
    }

    public static boolean tapsense(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int vip(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j8 = (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (iArr3[7] & 4294967295L) + (j7 >>> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static void yandex(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }
}
