package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15411e extends C11252e implements Drawable.Callback, InterfaceC6586e {

    /* renamed from: eً۟ۘ, reason: contains not printable characters */
    public static final int[] f30400e = {R.attr.state_enabled};

    /* renamed from: eٓۗٞ, reason: contains not printable characters */
    public static final ShapeDrawable f30401e = new ShapeDrawable(new OvalShape());

    /* renamed from: eٌؑ, reason: contains not printable characters */
    public WeakReference f30402e;

    /* renamed from: eّؑۚ, reason: contains not printable characters */
    public int f30403e;

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public Drawable f30404e;

    /* renamed from: eٟؑۨ, reason: contains not printable characters */
    public boolean f30405e;

    /* renamed from: eٕؒٓ, reason: contains not printable characters */
    public int f30406e;

    /* renamed from: eٕؒ۠, reason: contains not printable characters */
    public int f30407e;

    /* renamed from: eۣؓٗ, reason: contains not printable characters */
    public TextUtils.TruncateAt f30408e;

    /* renamed from: eؕؑٝ, reason: contains not printable characters */
    public ColorFilter f30409e;

    /* renamed from: eّؕ۠, reason: contains not printable characters */
    public int f30410e;

    /* renamed from: eؘؕٗ, reason: contains not printable characters */
    public float f30411e;

    /* renamed from: eؕ٘ۘ, reason: contains not printable characters */
    public final Context f30412e;

    /* renamed from: eؕۡ۠, reason: contains not printable characters */
    public int f30413e;

    /* renamed from: eؖؗؖ, reason: contains not printable characters */
    public int f30414e;

    /* renamed from: eٟؖٚ, reason: contains not printable characters */
    public final Paint f30415e;

    /* renamed from: eًؗٛ, reason: contains not printable characters */
    public final C4925e f30416e;

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public RippleDrawable f30417e;

    /* renamed from: eؗۜؐ, reason: contains not printable characters */
    public float f30418e;

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public CharSequence f30419e;

    /* renamed from: eؘؙؕ, reason: contains not printable characters */
    public C14188e f30420e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public float f30421e;

    /* renamed from: eٍؘٖ, reason: contains not printable characters */
    public boolean f30422e;

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public float f30423e;

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public ColorStateList f30424e;

    /* renamed from: eًؕ۟, reason: contains not printable characters */
    public C14188e f30425e;

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public ColorStateList f30426e;

    /* renamed from: eًٖٕ, reason: contains not printable characters */
    public final RectF f30427e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public ColorStateList f30428e;

    /* renamed from: eٌُۚ, reason: contains not printable characters */
    public int f30429e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public ColorStateList f30430e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public float f30431e;

    /* renamed from: eٍٜؓ, reason: contains not printable characters */
    public float f30432e;

    /* renamed from: eٍٟۨ, reason: contains not printable characters */
    public PorterDuff.Mode f30433e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public ColorStateList f30434e;

    /* renamed from: eَۡٙ, reason: contains not printable characters */
    public int[] f30435e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public ColorStateList f30436e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public Drawable f30437e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public float f30438e;

    /* renamed from: eُۨٞ, reason: contains not printable characters */
    public int f30439e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public boolean f30440e;

    /* renamed from: eِّٞ, reason: contains not printable characters */
    public PorterDuffColorFilter f30441e;

    /* renamed from: eِۘٞ, reason: contains not printable characters */
    public final PointF f30442e;

    /* renamed from: eِۜۙ, reason: contains not printable characters */
    public boolean f30443e;

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public ColorStateList f30444e;

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public boolean f30445e;

    /* renamed from: eّؑ۠, reason: contains not printable characters */
    public float f30446e;

    /* renamed from: eّْؗ, reason: contains not printable characters */
    public float f30447e;

    /* renamed from: eؘؙْ, reason: contains not printable characters */
    public final Paint.FontMetrics f30448e;

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public boolean f30449e;

    /* renamed from: eُٓٞ, reason: contains not printable characters */
    public int f30450e;

    /* renamed from: eؙٓۢ, reason: contains not printable characters */
    public ColorStateList f30451e;

    /* renamed from: eؚٔۦ, reason: contains not printable characters */
    public float f30452e;

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public float f30453e;

    /* renamed from: eٔۜۙ, reason: contains not printable characters */
    public float f30454e;

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public SpannableStringBuilder f30455e;

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public boolean f30456e;

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public boolean f30457e;

    /* renamed from: eٗ۟ٓ, reason: contains not printable characters */
    public final Path f30458e;

    /* renamed from: eِ٘, reason: contains not printable characters */
    public ColorStateList f30459e;

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public Drawable f30460e;

    /* renamed from: eۡۘ, reason: contains not printable characters */
    public float f30461e;

    public C15411e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ua.itaysonlab.vkx.R.attr.chipStyle, ua.itaysonlab.vkx.R.style.Widget_MaterialComponents_Chip_Action);
        this.f30438e = -1.0f;
        this.f30415e = new Paint(1);
        this.f30448e = new Paint.FontMetrics();
        this.f30427e = new RectF();
        this.f30442e = new PointF();
        this.f30458e = new Path();
        this.f30403e = 255;
        this.f30433e = PorterDuff.Mode.SRC_IN;
        this.f30402e = new WeakReference(null);
        adcel(context);
        this.f30412e = context;
        C4925e c4925e = new C4925e(this);
        this.f30416e = c4925e;
        this.f30419e = BuildConfig.FLAVOR;
        c4925e.ad.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f30400e;
        setState(iArr);
        if (!Arrays.equals(this.f30435e, iArr)) {
            this.f30435e = iArr;
            if (m3986super()) {
                applovin(getState(), iArr);
            }
        }
        this.f30422e = true;
        int[] iArr2 = AbstractC16058e.ad;
        f30401e.setTint(-1);
    }

    public static boolean inmobi(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static boolean isVip(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: new, reason: not valid java name */
    public static void m3972new(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: abstract, reason: not valid java name */
    public final void m3973abstract(boolean z) {
        if (this.f30456e != z) {
            boolean m3986super = m3986super();
            this.f30456e = z;
            boolean m3986super2 = m3986super();
            if (m3986super != m3986super2) {
                if (m3986super2) {
                    subscription(this.f30404e);
                } else {
                    m3972new(this.f30404e);
                }
                invalidateSelf();
                isPro();
            }
        }
    }

    @Override // defpackage.InterfaceC6586e
    public final void ad() {
        isPro();
        invalidateSelf();
    }

    public final void ads(boolean z) {
        if (this.f30445e != z) {
            this.f30445e = z;
            float pro = pro();
            if (!z && this.f30405e) {
                this.f30405e = false;
            }
            float pro2 = pro();
            invalidateSelf();
            if (pro != pro2) {
                isPro();
            }
        }
    }

    public final boolean applovin(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f30434e;
        int metrica = metrica(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f30410e) : 0);
        boolean z3 = true;
        if (this.f30410e != metrica) {
            this.f30410e = metrica;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f30430e;
        int metrica2 = metrica(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f30429e) : 0);
        if (this.f30429e != metrica2) {
            this.f30429e = metrica2;
            onStateChange = true;
        }
        int billing = AbstractC3898e.billing(metrica2, metrica);
        if ((this.f30413e != billing) | (this.f22618e.metrica == null)) {
            this.f30413e = billing;
            advert(ColorStateList.valueOf(billing));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f30428e;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f30439e) : 0;
        if (this.f30439e != colorForState) {
            this.f30439e = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.f30451e == null || !AbstractC16058e.license(iArr)) ? 0 : this.f30451e.getColorForState(iArr, this.f30414e);
        if (this.f30414e != colorForState2) {
            this.f30414e = colorForState2;
        }
        C4026e c4026e = this.f30416e.billing;
        int colorForState3 = (c4026e == null || (colorStateList = c4026e.adcel) == null) ? 0 : colorStateList.getColorForState(iArr, this.f30450e);
        if (this.f30450e != colorForState3) {
            this.f30450e = colorForState3;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (state[i] != 16842912) {
                    i++;
                } else if (this.f30445e) {
                    z = true;
                }
            }
        }
        z = false;
        if (this.f30405e == z || this.f30460e == null) {
            z2 = false;
        } else {
            float pro = pro();
            this.f30405e = z;
            if (pro != pro()) {
                onStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f30459e;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f30407e) : 0;
        if (this.f30407e != colorForState4) {
            this.f30407e = colorForState4;
            ColorStateList colorStateList6 = this.f30459e;
            PorterDuff.Mode mode = this.f30433e;
            this.f30441e = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            z3 = onStateChange;
        }
        if (inmobi(this.f30437e)) {
            z3 |= this.f30437e.setState(iArr);
        }
        if (inmobi(this.f30460e)) {
            z3 |= this.f30460e.setState(iArr);
        }
        if (inmobi(this.f30404e)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z3 |= this.f30404e.setState(iArr3);
        }
        int[] iArr4 = AbstractC16058e.ad;
        if (inmobi(this.f30417e)) {
            z3 |= this.f30417e.setState(iArr2);
        }
        if (z3) {
            invalidateSelf();
        }
        if (z2) {
            isPro();
        }
        return z3;
    }

    /* renamed from: break, reason: not valid java name */
    public final void m3974break(ColorStateList colorStateList) {
        if (this.f30426e != colorStateList) {
            this.f30426e = colorStateList;
            if (m3986super()) {
                this.f30404e.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: case, reason: not valid java name */
    public final void m3975case(ColorStateList colorStateList) {
        if (this.f30436e != colorStateList) {
            this.f30436e = colorStateList;
            this.f30451e = null;
            onStateChange(getState());
        }
    }

    /* renamed from: catch, reason: not valid java name */
    public final boolean m3976catch() {
        return this.f30449e && this.f30460e != null && this.f30405e;
    }

    /* renamed from: class, reason: not valid java name */
    public final void m3977class(Drawable drawable) {
        Drawable drawable2 = this.f30437e;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float pro = pro();
            this.f30437e = drawable != null ? drawable.mutate() : null;
            float pro2 = pro();
            m3972new(drawable2);
            if (m3980final()) {
                subscription(this.f30437e);
            }
            invalidateSelf();
            if (pro != pro2) {
                isPro();
            }
        }
    }

    public final void crashlytics(boolean z) {
        if (this.f30449e != z) {
            boolean m3976catch = m3976catch();
            this.f30449e = z;
            boolean m3976catch2 = m3976catch();
            if (m3976catch != m3976catch2) {
                if (m3976catch2) {
                    subscription(this.f30460e);
                } else {
                    m3972new(this.f30460e);
                }
                invalidateSelf();
                isPro();
            }
        }
    }

    /* renamed from: default, reason: not valid java name */
    public final void m3978default(float f) {
        if (this.f30452e != f) {
            float pro = pro();
            this.f30452e = f;
            float pro2 = pro();
            invalidateSelf();
            if (pro != pro2) {
                isPro();
            }
        }
    }

    @Override // defpackage.C11252e, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i2;
        float f;
        int i3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f30403e) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i2 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            i2 = 0;
        }
        boolean z = this.f30443e;
        Paint paint = this.f30415e;
        RectF rectF = this.f30427e;
        if (!z) {
            paint.setColor(this.f30410e);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, tapsense(), tapsense(), paint);
        }
        if (!this.f30443e) {
            paint.setColor(this.f30429e);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f30409e;
            if (colorFilter == null) {
                colorFilter = this.f30441e;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, tapsense(), tapsense(), paint);
        }
        if (this.f30443e) {
            super.draw(canvas);
        }
        if (this.f30421e > 0.0f && !this.f30443e) {
            paint.setColor(this.f30439e);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f30443e) {
                ColorFilter colorFilter2 = this.f30409e;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f30441e;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.f30421e / 2.0f;
            rectF.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.f30438e - (this.f30421e / 2.0f);
            canvas2.drawRoundRect(rectF, f4, f4, paint);
        }
        paint.setColor(this.f30414e);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f30443e) {
            RectF rectF2 = new RectF(bounds);
            C3774e c3774e = this.f22618e;
            C15339e c15339e = c3774e.ad;
            float f5 = c3774e.startapp;
            C15816e c15816e = this.f22608e;
            C7982e c7982e = this.f22606e;
            Path path = this.f30458e;
            c7982e.vip(c15339e, f5, rectF2, c15816e, path);
            appmetrica(canvas2, paint, path, this.f22618e.ad, billing());
        } else {
            canvas2.drawRoundRect(rectF, tapsense(), tapsense(), paint);
        }
        if (m3980final()) {
            remoteconfig(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.f30437e.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f30437e.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (m3976catch()) {
            remoteconfig(bounds, rectF);
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas2.translate(f8, f9);
            this.f30460e.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f30460e.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (this.f30422e && this.f30419e != null) {
            PointF pointF = this.f30442e;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f30419e;
            C4925e c4925e = this.f30416e;
            if (charSequence != null) {
                float pro = pro() + this.f30454e + this.f30447e;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + pro;
                } else {
                    pointF.x = bounds.right - pro;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = c4925e.ad;
                Paint.FontMetrics fontMetrics = this.f30448e;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f30419e != null) {
                float pro2 = pro() + this.f30454e + this.f30447e;
                float signatures = signatures() + this.f30411e + this.f30446e;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + pro2;
                    rectF.right = bounds.right - signatures;
                } else {
                    rectF.left = bounds.left + signatures;
                    rectF.right = bounds.right - pro2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            C4026e c4026e = c4925e.billing;
            TextPaint textPaint2 = c4925e.ad;
            if (c4026e != null) {
                textPaint2.drawableState = getState();
                c4925e.billing.appmetrica(this.f30412e, textPaint2, c4925e.vip);
            }
            textPaint2.setTextAlign(align);
            String charSequence2 = this.f30419e.toString();
            if (c4925e.appmetrica) {
                c4925e.ad(charSequence2);
                f = c4925e.metrica;
            } else {
                f = c4925e.metrica;
            }
            boolean z2 = Math.round(f) > Math.round(rectF.width());
            if (z2) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i3 = save;
            } else {
                i3 = 0;
            }
            CharSequence charSequence3 = this.f30419e;
            if (z2 && this.f30408e != null) {
                charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF.width(), this.f30408e);
            }
            canvas.drawText(charSequence3, 0, charSequence3.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i3);
            }
        }
        if (m3986super()) {
            rectF.setEmpty();
            if (m3986super()) {
                float f10 = this.f30411e + this.f30418e;
                if (getLayoutDirection() == 0) {
                    float f11 = bounds.right - f10;
                    rectF.right = f11;
                    rectF.left = f11 - this.f30423e;
                } else {
                    float f12 = bounds.left + f10;
                    rectF.left = f12;
                    rectF.right = f12 + this.f30423e;
                }
                float exactCenterY = bounds.exactCenterY();
                float f13 = this.f30423e;
                float f14 = exactCenterY - (f13 / 2.0f);
                rectF.top = f14;
                rectF.bottom = f14 + f13;
            }
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.f30404e.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = AbstractC16058e.ad;
            this.f30417e.setBounds(this.f30404e.getBounds());
            this.f30417e.jumpToCurrentState();
            this.f30417e.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (this.f30403e < 255) {
            canvas2.restoreToCount(i2);
        }
    }

    /* renamed from: extends, reason: not valid java name */
    public final void m3979extends(float f) {
        if (this.f30421e != f) {
            this.f30421e = f;
            this.f30415e.setStrokeWidth(f);
            if (this.f30443e) {
                this.f22618e.adcel = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* renamed from: final, reason: not valid java name */
    public final boolean m3980final() {
        return this.f30440e && this.f30437e != null;
    }

    public final void firebase(float f) {
        if (this.f30438e != f) {
            this.f30438e = f;
            C4568e appmetrica = this.f22618e.ad.appmetrica();
            appmetrica.appmetrica = new C0685e(f);
            appmetrica.purchase = new C0685e(f);
            appmetrica.billing = new C0685e(f);
            appmetrica.yandex = new C0685e(f);
            setShapeAppearanceModel(appmetrica.ad());
        }
    }

    @Override // defpackage.C11252e, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f30403e;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f30409e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f30431e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f;
        float pro = pro() + this.f30454e + this.f30447e;
        String charSequence = this.f30419e.toString();
        C4925e c4925e = this.f30416e;
        if (c4925e.appmetrica) {
            c4925e.ad(charSequence);
            f = c4925e.metrica;
        } else {
            f = c4925e.metrica;
        }
        return Math.min(Math.round(signatures() + f + pro + this.f30446e + this.f30411e), this.f30406e);
    }

    @Override // defpackage.C11252e, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.C11252e, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f30443e) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f30431e, this.f30438e);
        } else {
            outline.setRoundRect(bounds, this.f30438e);
            outline2 = outline;
        }
        outline2.setAlpha(this.f30403e / 255.0f);
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m3981goto(ColorStateList colorStateList) {
        this.f30457e = true;
        if (this.f30424e != colorStateList) {
            this.f30424e = colorStateList;
            if (m3980final()) {
                this.f30437e.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: implements, reason: not valid java name */
    public final void m3982implements(float f) {
        if (this.f30461e != f) {
            float pro = pro();
            this.f30461e = f;
            float pro2 = pro();
            invalidateSelf();
            if (pro != pro2) {
                isPro();
            }
        }
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m3983interface(float f) {
        if (this.f30453e != f) {
            float pro = pro();
            this.f30453e = f;
            float pro2 = pro();
            invalidateSelf();
            if (pro != pro2) {
                isPro();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final void isPro() {
        InterfaceC6982e interfaceC6982e = (InterfaceC6982e) this.f30402e.get();
        if (interfaceC6982e != null) {
            Chip chip = (Chip) interfaceC6982e;
            chip.vip(chip.f850e);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // defpackage.C11252e, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (isVip(this.f30434e) || isVip(this.f30430e) || isVip(this.f30428e)) {
            return true;
        }
        C4026e c4026e = this.f30416e.billing;
        if (c4026e == null || (colorStateList = c4026e.adcel) == null || !colorStateList.isStateful()) {
            return (this.f30449e && this.f30460e != null && this.f30445e) || inmobi(this.f30437e) || inmobi(this.f30460e) || isVip(this.f30459e);
        }
        return true;
    }

    /* renamed from: native, reason: not valid java name */
    public final void m3984native(ColorStateList colorStateList) {
        if (this.f30428e != colorStateList) {
            this.f30428e = colorStateList;
            if (this.f30443e) {
                C3774e c3774e = this.f22618e;
                if (c3774e.license != colorStateList) {
                    c3774e.license = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m3980final()) {
            onLayoutDirectionChanged |= this.f30437e.setLayoutDirection(i);
        }
        if (m3976catch()) {
            onLayoutDirectionChanged |= this.f30460e.setLayoutDirection(i);
        }
        if (m3986super()) {
            onLayoutDirectionChanged |= this.f30404e.setLayoutDirection(i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m3980final()) {
            onLevelChange |= this.f30437e.setLevel(i);
        }
        if (m3976catch()) {
            onLevelChange |= this.f30460e.setLevel(i);
        }
        if (m3986super()) {
            onLevelChange |= this.f30404e.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.C11252e, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f30443e) {
            super.onStateChange(iArr);
        }
        return applovin(iArr, this.f30435e);
    }

    public final void premium(Drawable drawable) {
        if (this.f30460e != drawable) {
            float pro = pro();
            this.f30460e = drawable;
            float pro2 = pro();
            m3972new(this.f30460e);
            subscription(this.f30460e);
            invalidateSelf();
            if (pro != pro2) {
                isPro();
            }
        }
    }

    public final float pro() {
        if (!m3980final() && !m3976catch()) {
            return 0.0f;
        }
        float f = this.f30461e;
        Drawable drawable = this.f30405e ? this.f30460e : this.f30437e;
        float f2 = this.f30453e;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.f30452e;
    }

    /* renamed from: protected, reason: not valid java name */
    public final void m3985protected(float f) {
        if (this.f30432e != f) {
            this.f30432e = f;
            invalidateSelf();
            if (m3986super()) {
                isPro();
            }
        }
    }

    public final void remoteconfig(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m3980final() || m3976catch()) {
            float f = this.f30454e + this.f30461e;
            Drawable drawable = this.f30405e ? this.f30460e : this.f30437e;
            float f2 = this.f30453e;
            if (f2 <= 0.0f && drawable != null) {
                f2 = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = rect.right - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            Drawable drawable2 = this.f30405e ? this.f30460e : this.f30437e;
            float f5 = this.f30453e;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil(AbstractC6286e.vip(this.f30412e, 24));
                if (drawable2.getIntrinsicHeight() <= f5) {
                    f5 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.C11252e, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f30403e != i) {
            this.f30403e = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.C11252e, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f30409e != colorFilter) {
            this.f30409e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.C11252e, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f30459e != colorStateList) {
            this.f30459e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.C11252e, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f30433e != mode) {
            this.f30433e = mode;
            ColorStateList colorStateList = this.f30459e;
            this.f30441e = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m3980final()) {
            visible |= this.f30437e.setVisible(z, z2);
        }
        if (m3976catch()) {
            visible |= this.f30460e.setVisible(z, z2);
        }
        if (m3986super()) {
            visible |= this.f30404e.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final float signatures() {
        if (m3986super()) {
            return this.f30432e + this.f30423e + this.f30418e;
        }
        return 0.0f;
    }

    public final void subs(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f30444e != colorStateList) {
            this.f30444e = colorStateList;
            if (this.f30449e && (drawable = this.f30460e) != null && this.f30445e) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void subscription(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f30404e) {
            if (drawable.isStateful()) {
                drawable.setState(this.f30435e);
            }
            drawable.setTintList(this.f30426e);
            return;
        }
        Drawable drawable2 = this.f30437e;
        if (drawable == drawable2 && this.f30457e) {
            drawable2.setTintList(this.f30424e);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* renamed from: super, reason: not valid java name */
    public final boolean m3986super() {
        return this.f30456e && this.f30404e != null;
    }

    public final float tapsense() {
        return this.f30443e ? yandex() : this.f30438e;
    }

    /* renamed from: this, reason: not valid java name */
    public final void m3987this(boolean z) {
        if (this.f30440e != z) {
            boolean m3980final = m3980final();
            this.f30440e = z;
            boolean m3980final2 = m3980final();
            if (m3980final != m3980final2) {
                if (m3980final2) {
                    subscription(this.f30437e);
                } else {
                    m3972new(this.f30437e);
                }
                invalidateSelf();
                isPro();
            }
        }
    }

    /* renamed from: throw, reason: not valid java name */
    public final void m3988throw(Drawable drawable) {
        Drawable drawable2 = this.f30404e;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float signatures = signatures();
            this.f30404e = drawable != null ? drawable.mutate() : null;
            int[] iArr = AbstractC16058e.ad;
            this.f30417e = new RippleDrawable(AbstractC16058e.metrica(this.f30436e), this.f30404e, f30401e);
            float signatures2 = signatures();
            m3972new(drawable2);
            if (m3986super()) {
                subscription(this.f30404e);
            }
            invalidateSelf();
            if (signatures != signatures2) {
                isPro();
            }
        }
    }

    /* renamed from: try, reason: not valid java name */
    public final void m3989try(float f) {
        if (this.f30423e != f) {
            this.f30423e = f;
            invalidateSelf();
            if (m3986super()) {
                isPro();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: while, reason: not valid java name */
    public final void m3990while(float f) {
        if (this.f30418e != f) {
            this.f30418e = f;
            invalidateSelf();
            if (m3986super()) {
                isPro();
            }
        }
    }
}
