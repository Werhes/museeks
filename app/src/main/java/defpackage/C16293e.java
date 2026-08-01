package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ٘ۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16293e {
    public final TextView ad;
    public Typeface advert;
    public C0142e appmetrica;
    public C0142e billing;
    public C0142e license;
    public C0142e metrica;
    public C0142e purchase;
    public boolean smaato;
    public final C13897e startapp;
    public C0142e vip;
    public C0142e yandex;
    public int adcel = 0;
    public int mopub = -1;

    public C16293e(TextView textView) {
        this.ad = textView;
        this.startapp = new C13897e(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [eؘؑۢ, java.lang.Object] */
    public static C0142e metrica(Context context, C17264e c17264e, int i) {
        ColorStateList startapp;
        synchronized (c17264e) {
            startapp = c17264e.ad.startapp(context, i);
        }
        if (startapp == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f1374e = true;
        obj.f1373e = startapp;
        return obj;
    }

    public final void ad(Drawable drawable, C0142e c0142e) {
        if (drawable == null || c0142e == null) {
            return;
        }
        C17264e.appmetrica(drawable, c0142e, this.ad.getDrawableState());
    }

    public final void adcel(int i) {
        C13897e c13897e = this.startapp;
        if (c13897e.adcel()) {
            if (i == 0) {
                c13897e.ad = 0;
                c13897e.license = -1.0f;
                c13897e.appmetrica = -1.0f;
                c13897e.metrica = -1.0f;
                c13897e.purchase = new int[0];
                c13897e.vip = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(AbstractC1786e.admob(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c13897e.adcel.getResources().getDisplayMetrics();
            c13897e.mopub(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c13897e.yandex()) {
                c13897e.ad();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eؘؑۢ, java.lang.Object] */
    public final void advert(PorterDuff.Mode mode) {
        if (this.yandex == null) {
            this.yandex = new Object();
        }
        C0142e c0142e = this.yandex;
        c0142e.f1375e = mode;
        c0142e.f1376e = mode != null;
        this.vip = c0142e;
        this.metrica = c0142e;
        this.license = c0142e;
        this.appmetrica = c0142e;
        this.purchase = c0142e;
        this.billing = c0142e;
    }

    public final PorterDuff.Mode appmetrica() {
        C0142e c0142e = this.yandex;
        if (c0142e != null) {
            return (PorterDuff.Mode) c0142e.f1375e;
        }
        return null;
    }

    public final void billing(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC6062e.isVip);
        C0912e c0912e = new C0912e(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.ad;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        smaato(c0912e, context);
        if (i2 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            AbstractC11769e.license(textView, string);
        }
        c0912e.amazon();
        Typeface typeface = this.advert;
        if (typeface != null) {
            textView.setTypeface(typeface, this.adcel);
        }
    }

    public final ColorStateList license() {
        C0142e c0142e = this.yandex;
        if (c0142e != null) {
            return (ColorStateList) c0142e.f1373e;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eؘؑۢ, java.lang.Object] */
    public final void mopub(ColorStateList colorStateList) {
        if (this.yandex == null) {
            this.yandex = new Object();
        }
        C0142e c0142e = this.yandex;
        c0142e.f1373e = colorStateList;
        c0142e.f1374e = colorStateList != null;
        this.vip = c0142e;
        this.metrica = c0142e;
        this.license = c0142e;
        this.appmetrica = c0142e;
        this.purchase = c0142e;
        this.billing = c0142e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void purchase(android.util.AttributeSet r27, int r28) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16293e.purchase(android.util.AttributeSet, int):void");
    }

    public final void smaato(C0912e c0912e, Context context) {
        String string;
        int i = this.adcel;
        TypedArray typedArray = (TypedArray) c0912e.f3331e;
        this.adcel = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.mopub = i3;
            if (i3 != -1) {
                this.adcel &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.smaato = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.advert = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.advert = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.advert = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.advert = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.mopub;
        int i7 = this.adcel;
        if (!context.isRestricted()) {
            try {
                Typeface mopub = c0912e.mopub(i5, this.adcel, new C5543e(this, i6, i7, new WeakReference(this.ad)));
                if (mopub != null) {
                    if (i2 < 28 || this.mopub == -1) {
                        this.advert = mopub;
                    } else {
                        this.advert = AbstractC0146e.ad(Typeface.create(mopub, 0), this.mopub, (this.adcel & 2) != 0);
                    }
                }
                this.smaato = this.advert == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.advert != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.mopub == -1) {
            this.advert = Typeface.create(string, this.adcel);
        } else {
            this.advert = AbstractC0146e.ad(Typeface.create(string, 0), this.mopub, (this.adcel & 2) != 0);
        }
    }

    public final void startapp(int[] iArr, int i) {
        C13897e c13897e = this.startapp;
        if (c13897e.adcel()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c13897e.adcel.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c13897e.purchase = C13897e.vip(iArr2);
                if (!c13897e.startapp()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c13897e.billing = false;
            }
            if (c13897e.yandex()) {
                c13897e.ad();
            }
        }
    }

    public final void vip() {
        C0142e c0142e = this.vip;
        TextView textView = this.ad;
        if (c0142e != null || this.metrica != null || this.license != null || this.appmetrica != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            ad(compoundDrawables[0], this.vip);
            ad(compoundDrawables[1], this.metrica);
            ad(compoundDrawables[2], this.license);
            ad(compoundDrawables[3], this.appmetrica);
        }
        if (this.purchase == null && this.billing == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        ad(compoundDrawablesRelative[0], this.purchase);
        ad(compoundDrawablesRelative[2], this.billing);
    }

    public final void yandex(int i, int i2, int i3, int i4) {
        C13897e c13897e = this.startapp;
        if (c13897e.adcel()) {
            DisplayMetrics displayMetrics = c13897e.adcel.getResources().getDisplayMetrics();
            c13897e.mopub(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c13897e.yandex()) {
                c13897e.ad();
            }
        }
    }
}
