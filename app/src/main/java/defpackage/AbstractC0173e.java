package defpackage;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؑۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0173e {
    public static final C2892e ad = new C2892e(-610545491, false, new C8898e(19));
    public static final C2892e vip = new C2892e(1680955756, false, new C8898e(20));

    public static final C0763e ad(AbstractC3698e abstractC3698e, int i, C2547e c2547e, C12476e c12476e, boolean z, int i2) {
        C0763e metrica = c12476e != null ? c12476e.metrica(c2547e.vip.billing(i)) : C0763e.appmetrica;
        float f = metrica.ad;
        float f2 = AbstractC9578e.ad;
        abstractC3698e.getClass();
        int ad2 = AbstractC4653e.ad(abstractC3698e, f2);
        return C0763e.vip(metrica, z ? (i2 - f) - ad2 : f, z ? i2 - f : ad2 + f, 0.0f, 10);
    }

    public static void adcel(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 8;
        int i2 = 0;
        int i3 = 3;
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
                int i7 = i6 >>> 31;
                long j8 = iArr[2] & 4294967295L;
                long j9 = (j8 * j) + (iArr2[2] & 4294967295L) + (j7 >>> 32);
                int i8 = (int) j9;
                iArr2[2] = i7 | (i8 << 1);
                long amazon = AbstractC1786e.amazon(j8, j6, j9 >>> 32, iArr2[3] & 4294967295L);
                long j10 = (iArr2[4] & 4294967295L) + (amazon >>> 32);
                long j11 = iArr[3] & 4294967295L;
                long j12 = (iArr2[5] & 4294967295L) + (j10 >>> 32);
                long j13 = (j * j11) + (amazon & 4294967295L);
                int i9 = (int) j13;
                iArr2[3] = (i8 >>> 31) | (i9 << 1);
                long amazon2 = AbstractC1786e.amazon(j11, j6, j13 >>> 32, j10 & 4294967295L);
                long amazon3 = AbstractC1786e.amazon(j11, j8, amazon2 >>> 32, j12 & 4294967295L);
                long j14 = (iArr2[6] & 4294967295L) + (j12 >>> 32) + (amazon3 >>> 32);
                int i10 = (int) amazon2;
                iArr2[4] = (i9 >>> 31) | (i10 << 1);
                int i11 = i10 >>> 31;
                int i12 = (int) (amazon3 & 4294967295L);
                iArr2[5] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                int i14 = (int) j14;
                iArr2[6] = i13 | (i14 << 1);
                iArr2[7] = (i14 >>> 31) | ((iArr2[7] + ((int) (j14 >>> 32))) << 1);
                return;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void advert(android.view.inputmethod.EditorInfo r13, java.lang.CharSequence r14, long r15, defpackage.C16174e r17) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0173e.advert(android.view.inputmethod.EditorInfo, java.lang.CharSequence, long, eْٖٟ):void");
    }

    public static C8280e appmetrica(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("ActionCallbackBroadcastReceiver:parameters");
        if (bundle2 == null) {
            throw new IllegalArgumentException("The intent must contain a parameters bundle using extra: ActionCallbackBroadcastReceiver:parameters");
        }
        C8280e isVip = AbstractC16091e.isVip(new AbstractC12378e[0]);
        LinkedHashMap linkedHashMap = isVip.ad;
        for (String str : bundle2.keySet()) {
            C1696e c1696e = new C1696e(str);
            Object obj = bundle2.get(str);
            linkedHashMap.get(c1696e);
            if (obj == null) {
                linkedHashMap.remove(c1696e);
            } else {
                linkedHashMap.put(c1696e, obj);
            }
        }
        if (bundle.containsKey("android.widget.extra.CHECKED")) {
            Boolean valueOf = Boolean.valueOf(bundle.getBoolean("android.widget.extra.CHECKED"));
            C1696e c1696e2 = AbstractC12731e.ad;
            linkedHashMap.get(c1696e2);
            linkedHashMap.put(c1696e2, valueOf);
        }
        return isVip;
    }

    public static boolean billing(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void license(int i, long[] jArr, long[] jArr2) {
        jArr2[i] = jArr[0];
        jArr2[i + 1] = jArr[1];
    }

    public static void metrica(int i, int[] iArr, int[] iArr2) {
        iArr2[i] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
    }

    public static int mopub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static boolean purchase(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
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

    public static void startapp(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 4294967295L;
        long j2 = iArr2[0] & 4294967295L;
        int i = 1;
        long j3 = iArr2[1] & 4294967295L;
        long j4 = iArr2[2] & 4294967295L;
        long j5 = iArr2[3] & 4294967295L;
        long j6 = iArr[0] & 4294967295L;
        long j7 = j6 * j2;
        iArr3[0] = (int) j7;
        long j8 = (j6 * j3) + (j7 >>> 32);
        iArr3[1] = (int) j8;
        long j9 = (j6 * j4) + (j8 >>> 32);
        iArr3[2] = (int) j9;
        long j10 = (j6 * j5) + (j9 >>> 32);
        iArr3[3] = (int) j10;
        iArr3[4] = (int) (j10 >>> 32);
        for (int i2 = 4; i < i2; i2 = 4) {
            long j11 = iArr[i] & j;
            long j12 = (j11 * j2) + (iArr3[i] & j);
            iArr3[i] = (int) j12;
            int i3 = i + 1;
            long j13 = j;
            long j14 = (j11 * j3) + (iArr3[i3] & j13) + (j12 >>> 32);
            iArr3[i3] = (int) j14;
            long j15 = (j11 * j4) + (iArr3[r11] & j13) + (j14 >>> 32);
            iArr3[i + 2] = (int) j15;
            long j16 = j15 >>> 32;
            long j17 = (j11 * j5) + (iArr3[r3] & j13) + j16;
            iArr3[i + 3] = (int) j17;
            iArr3[i + 4] = (int) (j17 >>> 32);
            i = i3;
            j = j13;
        }
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
        return (int) (j4 >>> 32);
    }

    public static boolean yandex(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
