package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: eؙؔۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2774e implements InterfaceC9446e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C1293e f6686e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C1293e f6684e = new Object();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C1293e f6683e = new Object();

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C1293e f6685e = new Object();

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C1293e f6682e = new Object();

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C11672e f6687e = new C11672e(12);

    public static final long ad(int i, int i2, C16320e c16320e, int i3, C16320e c16320e2) {
        int i4;
        int i5;
        if (!AbstractC7890e.billing(c16320e, C16320e.metrica)) {
            i = startapp(c16320e.ad, i3);
            i2 = startapp(c16320e.vip, i3);
        }
        InterfaceC10650e interfaceC10650e = c16320e2.ad;
        InterfaceC10650e interfaceC10650e2 = c16320e2.vip;
        if ((interfaceC10650e instanceof C3645e) && i != Integer.MIN_VALUE && i != Integer.MAX_VALUE && i > (i5 = ((C3645e) interfaceC10650e).ad)) {
            i = i5;
        }
        if ((interfaceC10650e2 instanceof C3645e) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i4 = ((C3645e) interfaceC10650e2).ad)) {
            i2 = i4;
        }
        return AbstractC12662e.vip(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object adcel(defpackage.C18046e r33, defpackage.AbstractC10731e r34) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2774e.adcel(e٘۠ؒ, eُؑ۠):java.lang.Object");
    }

    public static int appmetrica(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static boolean billing(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static ColorStateList license(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList amazon;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (amazon = AbstractC10077e.amazon(context, resourceId)) == null) ? typedArray.getColorStateList(i) : amazon;
    }

    public static ColorStateList metrica(Context context, C0912e c0912e, int i) {
        int resourceId;
        ColorStateList amazon;
        TypedArray typedArray = (TypedArray) c0912e.f3331e;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (amazon = AbstractC10077e.amazon(context, resourceId)) == null) ? c0912e.purchase(i) : amazon;
    }

    public static Drawable purchase(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable purchase;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (purchase = AbstractC4628e.purchase(context, resourceId)) == null) ? typedArray.getDrawable(i) : purchase;
    }

    public static int startapp(InterfaceC10650e interfaceC10650e, int i) {
        if (interfaceC10650e instanceof C3645e) {
            return ((C3645e) interfaceC10650e).ad;
        }
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (m2467class == 1) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        throw new C14803e(10);
    }

    public static final double vip(int i, int i2, int i3, int i4, int i5, C16320e c16320e) {
        double max;
        double d = i;
        double d2 = i3 / d;
        double d3 = i2;
        double d4 = i4 / d3;
        int m2467class = AbstractC8703e.m2467class(i5);
        if (m2467class == 0) {
            max = Math.max(d2, d4);
        } else {
            if (m2467class != 1) {
                throw new C14803e(10);
            }
            max = Math.min(d2, d4);
        }
        if (c16320e.ad instanceof C3645e) {
            double d5 = ((C3645e) r9).ad / d;
            if (max > d5) {
                max = d5;
            }
        }
        if (c16320e.vip instanceof C3645e) {
            double d6 = ((C3645e) r9).ad / d3;
            if (max > d6) {
                return d6;
            }
        }
        return max;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004f, code lost:
    
        if (r1 == r12) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object yandex(defpackage.C18046e r30, defpackage.AbstractC10731e r31) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2774e.yandex(e٘۠ؒ, eُؑ۠):java.lang.Object");
    }
}
