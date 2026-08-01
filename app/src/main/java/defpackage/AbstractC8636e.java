package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8636e {
    public static final C2892e ad = new C2892e(-1220970768, false, new C9012e(11));
    public static final C2892e vip = new C2892e(843535577, false, new C9012e(12));

    /* JADX WARN: Removed duplicated region for block: B:101:0x023f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0221 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(final java.lang.Object r25, int r26, long r27, long r29, int r31, float r32, boolean r33, defpackage.InterfaceC16154e r34, java.lang.String r35, defpackage.InterfaceC12864e r36, defpackage.C13770e r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8636e.ad(java.lang.Object, int, long, long, int, float, boolean, eّٖؖ, java.lang.String, eّۤۧ, eٓؕۥ, int, int):void");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, eًؓٛ] */
    public static final C5476e appmetrica(InputStream inputStream) {
        return new C5476e(inputStream, new Object());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, eًؓٛ] */
    public static C4122e license(File file) {
        return new C4122e(new FileOutputStream(file, false), new Object());
    }

    public static C16911e metrica(C1292e c1292e) {
        c1292e.m568protected(1);
        int crashlytics = c1292e.crashlytics();
        long j = c1292e.vip + crashlytics;
        int i = crashlytics / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long signatures = c1292e.signatures();
            if (signatures == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = signatures;
            jArr2[i2] = c1292e.signatures();
            c1292e.m568protected(2);
            i2++;
        }
        c1292e.m568protected((int) (j - c1292e.vip));
        return new C16911e(jArr, jArr2, 24);
    }

    public static void vip(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }
}
