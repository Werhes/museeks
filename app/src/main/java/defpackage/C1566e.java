package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؔٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1566e {
    public float Signature;

    /* renamed from: abstract, reason: not valid java name */
    public TimeInterpolator f4446abstract;
    public final TextInputLayout ad;
    public ColorStateList adcel;
    public float admob;
    public CharSequence ads;
    public float advert;
    public float amazon;
    public final RectF appmetrica;

    /* renamed from: break, reason: not valid java name */
    public TimeInterpolator f4447break;

    /* renamed from: case, reason: not valid java name */
    public float f4448case;

    /* renamed from: catch, reason: not valid java name */
    public ColorStateList f4449catch;

    /* renamed from: class, reason: not valid java name */
    public float f4450class;

    /* renamed from: default, reason: not valid java name */
    public float f4451default;

    /* renamed from: extends, reason: not valid java name */
    public int f4452extends;

    /* renamed from: final, reason: not valid java name */
    public float f4453final;
    public Bitmap firebase;

    /* renamed from: goto, reason: not valid java name */
    public float f4454goto;

    /* renamed from: implements, reason: not valid java name */
    public float f4455implements;

    /* renamed from: import, reason: not valid java name */
    public CharSequence f4456import;
    public Typeface inmobi;

    /* renamed from: interface, reason: not valid java name */
    public float f4458interface;
    public C9971e isPro;
    public Typeface isVip;
    public final Rect license;
    public float loadAd;
    public final Rect metrica;
    public ColorStateList mopub;

    /* renamed from: native, reason: not valid java name */
    public float f4459native;

    /* renamed from: new, reason: not valid java name */
    public float f4460new;

    /* renamed from: package, reason: not valid java name */
    public float f4461package;
    public CharSequence premium;

    /* renamed from: private, reason: not valid java name */
    public float f4462private;
    public Typeface pro;

    /* renamed from: protected, reason: not valid java name */
    public final TextPaint f4463protected;
    public Typeface remoteconfig;
    public Typeface signatures;
    public float smaato;

    /* renamed from: strictfp, reason: not valid java name */
    public StaticLayout f4465strictfp;
    public boolean subs;
    public Typeface subscription;

    /* renamed from: super, reason: not valid java name */
    public float f4466super;
    public Typeface tapsense;

    /* renamed from: this, reason: not valid java name */
    public float f4468this;

    /* renamed from: throw, reason: not valid java name */
    public int[] f4469throw;

    /* renamed from: transient, reason: not valid java name */
    public float f4470transient;

    /* renamed from: try, reason: not valid java name */
    public final TextPaint f4471try;
    public float vip;

    /* renamed from: while, reason: not valid java name */
    public boolean f4472while;
    public int purchase = 16;
    public int billing = 16;
    public float yandex = 15.0f;
    public float startapp = 15.0f;
    public final TextUtils.TruncateAt applovin = TextUtils.TruncateAt.END;
    public final boolean crashlytics = true;

    /* renamed from: instanceof, reason: not valid java name */
    public final int f4457instanceof = 1;

    /* renamed from: static, reason: not valid java name */
    public final float f4464static = 1.0f;

    /* renamed from: synchronized, reason: not valid java name */
    public final int f4467synchronized = 1;

    public C1566e(TextInputLayout textInputLayout) {
        this.ad = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f4471try = textPaint;
        this.f4463protected = new TextPaint(textPaint);
        this.license = new Rect();
        this.metrica = new Rect();
        this.appmetrica = new RectF();
        billing(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int ad(int i, float f, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float purchase(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AbstractC16664e.ad(f, f2, f3);
    }

    public final boolean adcel(Typeface typeface) {
        C9971e c9971e = this.isPro;
        if (c9971e != null) {
            c9971e.purchase = true;
        }
        if (this.pro == typeface) {
            return false;
        }
        this.pro = typeface;
        Typeface isVip = AbstractC16048e.isVip(this.ad.getContext().getResources().getConfiguration(), typeface);
        this.remoteconfig = isVip;
        if (isVip == null) {
            isVip = this.pro;
        }
        this.subscription = isVip;
        return true;
    }

    public final void advert(float f) {
        metrica(f, false);
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        this.ad.postInvalidateOnAnimation();
    }

    public final int appmetrica(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f4469throw;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void billing(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.pro;
            if (typeface != null) {
                this.remoteconfig = AbstractC16048e.isVip(configuration, typeface);
            }
            Typeface typeface2 = this.isVip;
            if (typeface2 != null) {
                this.tapsense = AbstractC16048e.isVip(configuration, typeface2);
            }
            Typeface typeface3 = this.remoteconfig;
            if (typeface3 == null) {
                typeface3 = this.pro;
            }
            this.subscription = typeface3;
            Typeface typeface4 = this.tapsense;
            if (typeface4 == null) {
                typeface4 = this.isVip;
            }
            this.signatures = typeface4;
            yandex(true);
        }
    }

    public final float license() {
        float f = this.startapp;
        TextPaint textPaint = this.f4463protected;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.subscription);
        textPaint.setLetterSpacing(this.f4453final);
        return -textPaint.ascent();
    }

    public final void metrica(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        Layout.Alignment alignment;
        if (this.ads == null) {
            return;
        }
        float width = this.license.width();
        float width2 = this.metrica.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.startapp;
            f3 = this.f4453final;
            this.f4450class = 1.0f;
            typeface = this.subscription;
        } else {
            float f4 = this.yandex;
            float f5 = this.f4466super;
            Typeface typeface2 = this.signatures;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f4450class = 1.0f;
            } else {
                this.f4450class = purchase(this.yandex, this.startapp, f, this.f4446abstract) / this.yandex;
            }
            float f6 = this.startapp / this.yandex;
            width = (z || width2 * f6 <= width) ? width2 : Math.min(width / f6, width2);
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f4471try;
        if (width > 0.0f) {
            boolean z3 = this.f4458interface != f2;
            boolean z4 = this.f4460new != f3;
            boolean z5 = this.inmobi != typeface;
            StaticLayout staticLayout = this.f4465strictfp;
            boolean z6 = z3 || z4 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || this.f4472while;
            this.f4458interface = f2;
            this.f4460new = f3;
            this.inmobi = typeface;
            this.f4472while = false;
            textPaint.setLinearText(this.f4450class != 1.0f);
            z2 = z6;
        } else {
            z2 = false;
        }
        if (this.premium == null || z2) {
            textPaint.setTextSize(this.f4458interface);
            textPaint.setTypeface(this.inmobi);
            textPaint.setLetterSpacing(this.f4460new);
            boolean vip = vip(this.ads);
            this.subs = vip;
            int i = this.f4457instanceof;
            if (i <= 1 || vip) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.purchase, vip ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.subs ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.subs ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            C13898e c13898e = new C13898e(this.ads, textPaint, (int) width);
            c13898e.mopub = this.applovin;
            c13898e.adcel = vip;
            c13898e.appmetrica = alignment;
            c13898e.startapp = false;
            c13898e.purchase = i;
            c13898e.billing = this.f4464static;
            c13898e.yandex = this.f4467synchronized;
            StaticLayout ad = c13898e.ad();
            ad.getClass();
            this.f4465strictfp = ad;
            this.premium = ad.getText();
        }
    }

    public final void mopub(float f) {
        float adcel = AbstractC13482e.adcel(f, 0.0f, 1.0f);
        if (adcel != this.vip) {
            this.vip = adcel;
            float f2 = this.metrica.left;
            Rect rect = this.license;
            float purchase = purchase(f2, rect.left, adcel, this.f4447break);
            RectF rectF = this.appmetrica;
            rectF.left = purchase;
            rectF.top = purchase(this.advert, this.smaato, adcel, this.f4447break);
            rectF.right = purchase(r2.right, rect.right, adcel, this.f4447break);
            rectF.bottom = purchase(r2.bottom, rect.bottom, adcel, this.f4447break);
            this.Signature = purchase(this.amazon, this.loadAd, adcel, this.f4447break);
            this.admob = purchase(this.advert, this.smaato, adcel, this.f4447break);
            advert(adcel);
            C17633e c17633e = AbstractC16664e.vip;
            this.f4461package = 1.0f - purchase(0.0f, 1.0f, 1.0f - adcel, c17633e);
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            TextInputLayout textInputLayout = this.ad;
            textInputLayout.postInvalidateOnAnimation();
            this.f4470transient = purchase(1.0f, 0.0f, adcel, c17633e);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.mopub;
            ColorStateList colorStateList2 = this.adcel;
            TextPaint textPaint = this.f4471try;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(ad(appmetrica(colorStateList2), adcel, appmetrica(this.mopub)));
            } else {
                textPaint.setColor(appmetrica(colorStateList));
            }
            float f3 = this.f4453final;
            float f4 = this.f4466super;
            if (f3 != f4) {
                textPaint.setLetterSpacing(purchase(f4, f3, adcel, c17633e));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            this.f4454goto = AbstractC16664e.ad(0.0f, this.f4451default, adcel);
            this.f4468this = AbstractC16664e.ad(0.0f, this.f4455implements, adcel);
            this.f4459native = AbstractC16664e.ad(0.0f, this.f4448case, adcel);
            int ad = ad(0, adcel, appmetrica(this.f4449catch));
            this.f4452extends = ad;
            textPaint.setShadowLayer(this.f4454goto, this.f4468this, this.f4459native, ad);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void smaato(Typeface typeface) {
        boolean z;
        boolean adcel = adcel(typeface);
        if (this.isVip != typeface) {
            this.isVip = typeface;
            Typeface isVip = AbstractC16048e.isVip(this.ad.getContext().getResources().getConfiguration(), typeface);
            this.tapsense = isVip;
            if (isVip == null) {
                isVip = this.isVip;
            }
            this.signatures = isVip;
            z = true;
        } else {
            z = false;
        }
        if (adcel || z) {
            yandex(false);
        }
    }

    public final void startapp(ColorStateList colorStateList) {
        if (this.mopub == colorStateList && this.adcel == colorStateList) {
            return;
        }
        this.mopub = colorStateList;
        this.adcel = colorStateList;
        yandex(false);
    }

    public final boolean vip(CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        boolean z = this.ad.getLayoutDirection() == 1;
        if (this.crashlytics) {
            return (z ? AbstractC17379e.license : AbstractC17379e.metrica).smaato(charSequence, charSequence.length());
        }
        return z;
    }

    public final void yandex(boolean z) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.ad;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z) {
            return;
        }
        metrica(1.0f, z);
        CharSequence charSequence = this.premium;
        TextPaint textPaint = this.f4471try;
        if (charSequence != null && (staticLayout = this.f4465strictfp) != null) {
            this.f4456import = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.applovin);
        }
        CharSequence charSequence2 = this.f4456import;
        if (charSequence2 != null) {
            this.f4462private = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f4462private = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.billing, this.subs ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.license;
        if (i == 48) {
            this.smaato = rect.top;
        } else if (i != 80) {
            this.smaato = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.smaato = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.loadAd = rect.centerX() - (this.f4462private / 2.0f);
        } else if (i2 != 5) {
            this.loadAd = rect.left;
        } else {
            this.loadAd = rect.right - this.f4462private;
        }
        metrica(0.0f, z);
        float height = this.f4465strictfp != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f4465strictfp;
        if (staticLayout2 == null || this.f4457instanceof <= 1) {
            CharSequence charSequence3 = this.premium;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f4465strictfp;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.purchase, this.subs ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.metrica;
        if (i3 == 48) {
            this.advert = rect2.top;
        } else if (i3 != 80) {
            this.advert = rect2.centerY() - (height / 2.0f);
        } else {
            this.advert = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.amazon = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.amazon = rect2.left;
        } else {
            this.amazon = rect2.right - measureText;
        }
        Bitmap bitmap = this.firebase;
        if (bitmap != null) {
            bitmap.recycle();
            this.firebase = null;
        }
        advert(this.vip);
        float f = this.vip;
        float purchase = purchase(rect2.left, rect.left, f, this.f4447break);
        RectF rectF = this.appmetrica;
        rectF.left = purchase;
        rectF.top = purchase(this.advert, this.smaato, f, this.f4447break);
        rectF.right = purchase(rect2.right, rect.right, f, this.f4447break);
        rectF.bottom = purchase(rect2.bottom, rect.bottom, f, this.f4447break);
        this.Signature = purchase(this.amazon, this.loadAd, f, this.f4447break);
        this.admob = purchase(this.advert, this.smaato, f, this.f4447break);
        advert(f);
        C17633e c17633e = AbstractC16664e.vip;
        this.f4461package = 1.0f - purchase(0.0f, 1.0f, 1.0f - f, c17633e);
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        textInputLayout.postInvalidateOnAnimation();
        this.f4470transient = purchase(1.0f, 0.0f, f, c17633e);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.mopub;
        ColorStateList colorStateList2 = this.adcel;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(ad(appmetrica(colorStateList2), f, appmetrica(this.mopub)));
        } else {
            textPaint.setColor(appmetrica(colorStateList));
        }
        float f2 = this.f4453final;
        float f3 = this.f4466super;
        if (f2 != f3) {
            textPaint.setLetterSpacing(purchase(f3, f2, f, c17633e));
        } else {
            textPaint.setLetterSpacing(f2);
        }
        this.f4454goto = AbstractC16664e.ad(0.0f, this.f4451default, f);
        this.f4468this = AbstractC16664e.ad(0.0f, this.f4455implements, f);
        this.f4459native = AbstractC16664e.ad(0.0f, this.f4448case, f);
        int ad = ad(0, f, appmetrica(this.f4449catch));
        this.f4452extends = ad;
        textPaint.setShadowLayer(this.f4454goto, this.f4468this, this.f4459native, ad);
        textInputLayout.postInvalidateOnAnimation();
    }
}
