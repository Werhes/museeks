package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٟٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13897e {
    public static final RectF advert = new RectF();
    public static final ConcurrentHashMap smaato = new ConcurrentHashMap();
    public final Context adcel;
    public final C1404e mopub;
    public final TextView startapp;
    public TextPaint yandex;
    public int ad = 0;
    public boolean vip = false;
    public float metrica = -1.0f;
    public float license = -1.0f;
    public float appmetrica = -1.0f;
    public int[] purchase = new int[0];
    public boolean billing = false;

    public C13897e(TextView textView) {
        this.startapp = textView;
        this.adcel = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.mopub = new C5200e();
        } else {
            this.mopub = new C1404e();
        }
    }

    public static Object appmetrica(Object obj, Object obj2, String str) {
        try {
            return license(str).invoke(obj, null);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj2;
        }
    }

    public static Method license(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = smaato;
            Method method = (Method) concurrentHashMap.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, null)) == null) {
                return method;
            }
            method.setAccessible(true);
            concurrentHashMap.put(str, method);
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    public static int[] vip(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final void ad() {
        if (purchase()) {
            if (this.vip) {
                if (this.startapp.getMeasuredHeight() <= 0 || this.startapp.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.mopub.vip(this.startapp) ? 1048576 : (this.startapp.getMeasuredWidth() - this.startapp.getTotalPaddingLeft()) - this.startapp.getTotalPaddingRight();
                int height = (this.startapp.getHeight() - this.startapp.getCompoundPaddingBottom()) - this.startapp.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = advert;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float metrica = metrica(rectF);
                        if (metrica != this.startapp.getTextSize()) {
                            billing(0, metrica);
                        }
                    } finally {
                    }
                }
            }
            this.vip = true;
        }
    }

    public final boolean adcel() {
        return !(this.startapp instanceof C6129e);
    }

    public final void billing(int i, float f) {
        Context context = this.adcel;
        float applyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.startapp;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.vip = false;
                try {
                    Method license = license("nullLayouts");
                    if (license != null) {
                        license.invoke(textView, null);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (isInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final int metrica(RectF rectF) {
        CharSequence transformation;
        int length = this.purchase.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 0;
        int i3 = 1;
        while (i3 <= i) {
            int i4 = (i3 + i) / 2;
            int i5 = this.purchase[i4];
            TextView textView = this.startapp;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.yandex;
            if (textPaint == null) {
                this.yandex = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.yandex.set(textView.getPaint());
            this.yandex.setTextSize(i5);
            StaticLayout ad = AbstractC11395e.ad(charSequence, (Layout.Alignment) appmetrica(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), maxLines, this.startapp, this.yandex, this.mopub);
            if ((maxLines == -1 || (ad.getLineCount() <= maxLines && ad.getLineEnd(ad.getLineCount() - 1) == charSequence.length())) && ad.getHeight() <= rectF.bottom) {
                int i6 = i4 + 1;
                i2 = i3;
                i3 = i6;
            } else {
                i2 = i4 - 1;
                i = i2;
            }
        }
        return this.purchase[i2];
    }

    public final void mopub(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.ad = 1;
        this.license = f;
        this.appmetrica = f2;
        this.metrica = f3;
        this.billing = false;
    }

    public final boolean purchase() {
        return adcel() && this.ad != 0;
    }

    public final boolean startapp() {
        boolean z = this.purchase.length > 0;
        this.billing = z;
        if (z) {
            this.ad = 1;
            this.license = r0[0];
            this.appmetrica = r0[r1 - 1];
            this.metrica = -1.0f;
        }
        return z;
    }

    public final boolean yandex() {
        if (adcel() && this.ad == 1) {
            if (!this.billing || this.purchase.length == 0) {
                int floor = ((int) Math.floor((this.appmetrica - this.license) / this.metrica)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.metrica) + this.license);
                }
                this.purchase = vip(iArr);
            }
            this.vip = true;
        } else {
            this.vip = false;
        }
        return this.vip;
    }
}
