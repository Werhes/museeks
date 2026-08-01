package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٛۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16340e {
    public static final ThreadLocal ad = new ThreadLocal();
    public static final WeakHashMap vip = new WeakHashMap(0);
    public static final Object metrica = new Object();

    public static void ad(C11712e c11712e, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (metrica) {
            try {
                WeakHashMap weakHashMap = vip;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(c11712e);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(c11712e, sparseArray);
                }
                sparseArray.append(i, new C16900e(colorStateList, c11712e.ad.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ce A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface metrica(android.content.Context r12, int r13, android.util.TypedValue r14, int r15, defpackage.AbstractC14437e r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16340e.metrica(android.content.Context, int, android.util.TypedValue, int, eٔؐۥ, boolean, boolean):android.graphics.Typeface");
    }

    public static Typeface vip(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return metrica(context, i, new TypedValue(), 0, null, false, false);
    }
}
