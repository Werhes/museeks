package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؖۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4026e {
    public final ColorStateList ad;
    public final ColorStateList adcel;
    public final int advert;
    public Typeface amazon;
    public final float appmetrica;
    public final float billing;
    public final int license;
    public final int metrica;
    public float mopub;
    public final float purchase;
    public boolean smaato = false;
    public final float startapp;
    public final String vip;
    public final boolean yandex;

    public C4026e(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC11408e.f22939native);
        this.mopub = obtainStyledAttributes.getDimension(0, 0.0f);
        this.adcel = AbstractC2774e.license(context, obtainStyledAttributes, 3);
        AbstractC2774e.license(context, obtainStyledAttributes, 4);
        AbstractC2774e.license(context, obtainStyledAttributes, 5);
        this.metrica = obtainStyledAttributes.getInt(2, 0);
        this.license = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.advert = obtainStyledAttributes.getResourceId(i2, 0);
        this.vip = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.ad = AbstractC2774e.license(context, obtainStyledAttributes, 6);
        this.appmetrica = obtainStyledAttributes.getFloat(7, 0.0f);
        this.purchase = obtainStyledAttributes.getFloat(8, 0.0f);
        this.billing = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC11408e.applovin);
        this.yandex = obtainStyledAttributes2.hasValue(0);
        this.startapp = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void ad() {
        String str;
        Typeface typeface = this.amazon;
        int i = this.metrica;
        if (typeface == null && (str = this.vip) != null) {
            this.amazon = Typeface.create(str, i);
        }
        if (this.amazon == null) {
            int i2 = this.license;
            if (i2 == 1) {
                this.amazon = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.amazon = Typeface.SERIF;
            } else if (i2 != 3) {
                this.amazon = Typeface.DEFAULT;
            } else {
                this.amazon = Typeface.MONOSPACE;
            }
            this.amazon = Typeface.create(this.amazon, i);
        }
    }

    public final void appmetrica(Context context, TextPaint textPaint, AbstractC18292e abstractC18292e) {
        purchase(context, textPaint, abstractC18292e);
        ColorStateList colorStateList = this.adcel;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.ad;
        textPaint.setShadowLayer(this.billing, this.appmetrica, this.purchase, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void billing(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface isVip = AbstractC16048e.isVip(context.getResources().getConfiguration(), typeface);
        if (isVip != null) {
            typeface = isVip;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.metrica;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.mopub);
        if (this.yandex) {
            textPaint.setLetterSpacing(this.startapp);
        }
    }

    public final boolean license(Context context) {
        Typeface typeface = null;
        int i = this.advert;
        if (i != 0) {
            ThreadLocal threadLocal = AbstractC16340e.ad;
            if (!context.isRestricted()) {
                typeface = AbstractC16340e.metrica(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void metrica(Context context, AbstractC18292e abstractC18292e) {
        if (license(context)) {
            vip(context);
        } else {
            ad();
        }
        int i = this.advert;
        if (i == 0) {
            this.smaato = true;
        }
        if (this.smaato) {
            abstractC18292e.billing(this.amazon, true);
            return;
        }
        try {
            C0745e c0745e = new C0745e(this, abstractC18292e);
            ThreadLocal threadLocal = AbstractC16340e.ad;
            if (context.isRestricted()) {
                c0745e.ad(-4);
            } else {
                AbstractC16340e.metrica(context, i, new TypedValue(), 0, c0745e, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.smaato = true;
            abstractC18292e.purchase(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.vip, e);
            this.smaato = true;
            abstractC18292e.purchase(-3);
        }
    }

    public final void purchase(Context context, TextPaint textPaint, AbstractC18292e abstractC18292e) {
        if (license(context)) {
            billing(context, textPaint, vip(context));
            return;
        }
        ad();
        billing(context, textPaint, this.amazon);
        metrica(context, new C10738e(this, context, textPaint, abstractC18292e));
    }

    public final Typeface vip(Context context) {
        if (this.smaato) {
            return this.amazon;
        }
        if (!context.isRestricted()) {
            try {
                Typeface vip = AbstractC16340e.vip(context, this.advert);
                this.amazon = vip;
                if (vip != null) {
                    this.amazon = Typeface.create(vip, this.metrica);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.vip, e);
            }
        }
        ad();
        this.smaato = true;
        return this.amazon;
    }
}
