package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.car.app.SessionInfo;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۢؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1396e {
    public static final int[] ad = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};
    public static final int[] vip = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};
    public static final int[] metrica = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    public static void ad(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = ((iArr[1] & 4294967295L) - 1) + (j >> 32);
        iArr[1] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (iArr[2] & 4294967295L);
            iArr[2] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = (iArr[3] & 4294967295L) + 1 + j3;
        iArr[3] = (int) j5;
        long j6 = (4294967295L & iArr[4]) + 1 + (j5 >> 32);
        iArr[4] = (int) j6;
        if ((j6 >> 32) != 0) {
            AbstractC12797e.tapsense(12, 5, iArr);
        }
    }

    public static final Annotation adcel(C11056e c11056e, ClassLoader classLoader) {
        String str = c11056e.ad;
        Class purchase = AbstractC5965e.purchase(classLoader, advert(str), 0);
        if (purchase == null) {
            throw new Error(AbstractC17861e.Signature("Annotation class not found: ", str));
        }
        Map map = c11056e.vip;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC10064e.appmetrica(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), mopub((AbstractC10385e) entry.getValue(), str, (String) entry.getKey(), classLoader));
        }
        return (Annotation) AbstractC6401e.yandex(purchase, linkedHashMap);
    }

    public static final C11709e advert(String str) {
        boolean pro = AbstractC6507e.pro(str, ".", false);
        if (pro) {
            str = str.substring(1);
        }
        int m1883while = AbstractC5304e.m1883while(str, '/', 0, 6);
        return new C11709e(new C12816e((m1883while == -1 ? BuildConfig.FLAVOR : str.substring(0, m1883while)).replace('/', '.')), new C12816e(AbstractC5304e.m1876synchronized('/', str, str)), pro);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d2 A[LOOP:0: B:13:0x00cc->B:15:0x00d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Type inference failed for: r3v0, types: [eّؖٝ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.C14377e amazon(defpackage.C0632e r18, java.lang.ClassLoader r19, defpackage.C16746e r20, kotlin.jvm.functions.Function0 r21) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1396e.amazon(eؑۡٚ, java.lang.ClassLoader, eَٗؔ, kotlin.jvm.functions.Function0):eٓۦؙ");
    }

    public static void appmetrica(InterfaceC11455e interfaceC11455e, int i, InterfaceC8427e interfaceC8427e) {
        long adcel = interfaceC11455e.adcel(i);
        List advert = interfaceC11455e.advert(adcel);
        if (advert.isEmpty()) {
            return;
        }
        if (i == interfaceC11455e.loadAd() - 1) {
            throw new IllegalStateException();
        }
        long adcel2 = interfaceC11455e.adcel(i + 1) - interfaceC11455e.adcel(i);
        if (adcel2 > 0) {
            interfaceC8427e.accept(new C17169e(adcel, adcel2, advert));
        }
    }

    public static void billing(int[] iArr, int i) {
        long j;
        if (i != 0) {
            long j2 = i & 4294967295L;
            long j3 = (iArr[0] & 4294967295L) + j2;
            iArr[0] = (int) j3;
            long j4 = ((iArr[1] & 4294967295L) - j2) + (j3 >> 32);
            iArr[1] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (iArr[2] & 4294967295L);
                iArr[2] = (int) j6;
                j5 = j6 >> 32;
            }
            long j7 = (iArr[3] & 4294967295L) + j2 + j5;
            iArr[3] = (int) j7;
            long j8 = (4294967295L & iArr[4]) + j2 + (j7 >> 32);
            iArr[4] = (int) j8;
            j = j8 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || AbstractC12797e.tapsense(12, 5, iArr) == 0) && !(iArr[11] == -1 && AbstractC12797e.subscription(12, iArr, ad))) {
            return;
        }
        ad(iArr);
    }

    public static void license(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        C4094e.startapp(iArr, iArr2, iArr4);
        purchase(iArr4, iArr3);
    }

    public static void loadAd(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(AbstractC1786e.admob(i2, "at index "));
            }
        }
    }

    public static final InterfaceC7227e metrica(ClassLoader classLoader, String str) {
        Class purchase = AbstractC5965e.purchase(classLoader, advert(str), 0);
        if (purchase != null) {
            return AbstractC3820e.ad.vip(purchase);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0098, code lost:
    
        if (r1 == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object mopub(defpackage.AbstractC10385e r8, java.lang.String r9, java.lang.String r10, java.lang.ClassLoader r11) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1396e.mopub(eٍَٜ, java.lang.String, java.lang.String, java.lang.ClassLoader):java.lang.Object");
    }

    public static void purchase(int[] iArr, int[] iArr2) {
        long j = iArr[16] & 4294967295L;
        long j2 = iArr[17] & 4294967295L;
        long j3 = iArr[18] & 4294967295L;
        long j4 = iArr[19] & 4294967295L;
        long j5 = iArr[20] & 4294967295L;
        long j6 = iArr[21] & 4294967295L;
        long j7 = iArr[22] & 4294967295L;
        long j8 = iArr[23] & 4294967295L;
        long j9 = ((iArr[12] & 4294967295L) + j5) - 1;
        long j10 = (iArr[13] & 4294967295L) + j7;
        long j11 = (iArr[14] & 4294967295L) + j7 + j8;
        long j12 = (iArr[15] & 4294967295L) + j8;
        long j13 = j2 + j6;
        long j14 = j6 - j8;
        long j15 = j7 - j8;
        long j16 = j9 + j14;
        long j17 = (iArr[0] & 4294967295L) + j16;
        iArr2[0] = (int) j17;
        long j18 = (((iArr[1] & 4294967295L) + j8) - j9) + j10 + (j17 >> 32);
        iArr2[1] = (int) j18;
        long j19 = (((iArr[2] & 4294967295L) - j6) - j10) + j11 + (j18 >> 32);
        iArr2[2] = (int) j19;
        long j20 = ((iArr[3] & 4294967295L) - j11) + j12 + j16 + (j19 >> 32);
        iArr2[3] = (int) j20;
        long j21 = (((((iArr[4] & 4294967295L) + j) + j6) + j10) - j12) + j16 + (j20 >> 32);
        iArr2[4] = (int) j21;
        long j22 = ((iArr[5] & 4294967295L) - j) + j10 + j11 + j13 + (j21 >> 32);
        iArr2[5] = (int) j22;
        long j23 = (((iArr[6] & 4294967295L) + j3) - j2) + j11 + j12 + (j22 >> 32);
        iArr2[6] = (int) j23;
        long j24 = ((((iArr[7] & 4294967295L) + j) + j4) - j3) + j12 + (j23 >> 32);
        iArr2[7] = (int) j24;
        long j25 = (((((iArr[8] & 4294967295L) + j) + j2) + j5) - j4) + (j24 >> 32);
        iArr2[8] = (int) j25;
        long j26 = (((iArr[9] & 4294967295L) + j3) - j5) + j13 + (j25 >> 32);
        iArr2[9] = (int) j26;
        long j27 = ((((iArr[10] & 4294967295L) + j3) + j4) - j14) + j15 + (j26 >> 32);
        iArr2[10] = (int) j27;
        long j28 = ((((iArr[11] & 4294967295L) + j4) + j5) - j15) + (j27 >> 32);
        iArr2[11] = (int) j28;
        billing(iArr2, (int) ((j28 >> 32) + 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void smaato(defpackage.InterfaceC11455e r12, defpackage.C14033e r13, defpackage.InterfaceC8427e r14) {
        /*
            long r0 = r13.vip
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L27
        Le:
            int r4 = r12.purchase(r0)
            r6 = -1
            if (r4 != r6) goto L19
            int r4 = r12.loadAd()
        L19:
            if (r4 <= 0) goto L27
            int r6 = r4 + (-1)
            long r6 = r12.adcel(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L27
            int r4 = r4 + (-1)
        L27:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L51
            int r2 = r12.loadAd()
            if (r4 >= r2) goto L51
            java.util.List r11 = r12.advert(r0)
            long r2 = r12.adcel(r4)
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L51
            long r7 = r13.vip
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 >= 0) goto L51
            eٕٗٞ r6 = new eٕٗٞ
            long r9 = r2 - r7
            r6.<init>(r7, r9, r11)
            r14.accept(r6)
            r2 = 1
            goto L52
        L51:
            r2 = r5
        L52:
            r3 = r4
        L53:
            int r6 = r12.loadAd()
            if (r3 >= r6) goto L5f
            appmetrica(r12, r3, r14)
            int r3 = r3 + 1
            goto L53
        L5f:
            boolean r13 = r13.ad
            if (r13 == 0) goto L87
            if (r2 == 0) goto L67
            int r4 = r4 + (-1)
        L67:
            if (r5 >= r4) goto L6f
            appmetrica(r12, r5, r14)
            int r5 = r5 + 1
            goto L67
        L6f:
            if (r2 == 0) goto L87
            eٕٗٞ r6 = new eٕٗٞ
            java.util.List r11 = r12.advert(r0)
            long r7 = r12.adcel(r4)
            long r12 = r12.adcel(r4)
            long r9 = r0 - r12
            r6.<init>(r7, r9, r11)
            r14.accept(r6)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1396e.smaato(eِؒؔ, eٓٗۢ, eٌؑۘ):void");
    }

    public static void startapp(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC12797e.m3397class(12, iArr, iArr2, iArr3) != 0) {
            long j = (iArr3[0] & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = (iArr3[1] & 4294967295L) + 1 + (j >> 32);
            iArr3[1] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (iArr3[2] & 4294967295L);
                iArr3[2] = (int) j4;
                j3 = j4 >> 32;
            }
            long j5 = ((iArr3[3] & 4294967295L) - 1) + j3;
            iArr3[3] = (int) j5;
            long j6 = ((4294967295L & iArr3[4]) - 1) + (j5 >> 32);
            iArr3[4] = (int) j6;
            if ((j6 >> 32) != 0) {
                AbstractC12797e.yandex(12, 5, iArr3);
            }
        }
    }

    public static SessionInfo vip(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            throw new IllegalArgumentException("Expected the SessionInfo to be encoded in the bind intent extras, but the extras were null.");
        }
        Bundle bundle = extras.getBundle("androidx.car.app.extra.SESSION_INFO_BUNDLE");
        return new SessionInfo(bundle.getInt("display-type"), bundle.getString("session-id"));
    }

    public static void yandex(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        C4094e.mopub(iArr, iArr3);
        while (true) {
            purchase(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                C4094e.mopub(iArr2, iArr3);
            }
        }
    }
}
