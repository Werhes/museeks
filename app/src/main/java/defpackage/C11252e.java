package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import j$.util.Objects;
import java.util.BitSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۚۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C11252e extends Drawable implements InterfaceC13298e {

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public static final Paint f22598e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f22599e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public C15339e f22600e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final Region f22601e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AbstractC15107e[] f22602e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final RectF f22603e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public int f22604e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final Paint f22605e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C7982e f22606e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC15107e[] f22607e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C15816e f22608e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final Paint f22609e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final C11224e f22610e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final Path f22611e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final Region f22612e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final RectF f22613e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public PorterDuffColorFilter f22614e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final BitSet f22615e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public boolean f22616e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final RectF f22617e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C3774e f22618e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Path f22619e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Matrix f22620e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public PorterDuffColorFilter f22621e;

    static {
        Paint paint = new Paint(1);
        f22598e = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C11252e() {
        this(new C15339e());
    }

    public C11252e(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C15339e.vip(context, attributeSet, i, i2).ad());
    }

    public C11252e(C3774e c3774e) {
        this.f22607e = new AbstractC15107e[4];
        this.f22602e = new AbstractC15107e[4];
        this.f22615e = new BitSet(8);
        this.f22620e = new Matrix();
        this.f22619e = new Path();
        this.f22611e = new Path();
        this.f22617e = new RectF();
        this.f22603e = new RectF();
        this.f22612e = new Region();
        this.f22601e = new Region();
        Paint paint = new Paint(1);
        this.f22605e = paint;
        Paint paint2 = new Paint(1);
        this.f22609e = paint2;
        this.f22610e = new C11224e();
        this.f22606e = Looper.getMainLooper().getThread() == Thread.currentThread() ? AbstractC9888e.ad : new C7982e();
        this.f22613e = new RectF();
        this.f22616e = true;
        this.f22618e = c3774e;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Signature();
        loadAd(getState());
        this.f22608e = new C15816e(17, this);
    }

    public C11252e(C15339e c15339e) {
        this(new C3774e(c15339e));
    }

    public final boolean Signature() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f22614e;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f22621e;
        C3774e c3774e = this.f22618e;
        ColorStateList colorStateList = c3774e.appmetrica;
        PorterDuff.Mode mode = c3774e.purchase;
        if (colorStateList == null || mode == null) {
            int color = this.f22605e.getColor();
            int metrica = metrica(color);
            this.f22604e = metrica;
            porterDuffColorFilter = metrica != color ? new PorterDuffColorFilter(metrica, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int metrica2 = metrica(colorStateList.getColorForState(getState(), 0));
            this.f22604e = metrica2;
            porterDuffColorFilter = new PorterDuffColorFilter(metrica2, mode);
        }
        this.f22614e = porterDuffColorFilter;
        this.f22618e.getClass();
        this.f22621e = null;
        this.f22618e.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f22614e) && Objects.equals(porterDuffColorFilter3, this.f22621e)) ? false : true;
    }

    public final void adcel(Context context) {
        this.f22618e.vip = new C15190e(context);
        admob();
    }

    public final void admob() {
        C3774e c3774e = this.f22618e;
        float f = c3774e.smaato + 0.0f;
        c3774e.amazon = (int) Math.ceil(0.75f * f);
        this.f22618e.loadAd = (int) Math.ceil(f * 0.25f);
        Signature();
        super.invalidateSelf();
    }

    public final void advert(ColorStateList colorStateList) {
        C3774e c3774e = this.f22618e;
        if (c3774e.metrica != colorStateList) {
            c3774e.metrica = colorStateList;
            onStateChange(getState());
        }
    }

    public final void amazon() {
        this.f22610e.isVip(-12303292);
        this.f22618e.getClass();
        super.invalidateSelf();
    }

    public final void appmetrica(Canvas canvas, Paint paint, Path path, C15339e c15339e, RectF rectF) {
        if (!c15339e.license(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float ad = c15339e.purchase.ad(rectF) * this.f22618e.startapp;
            canvas.drawRoundRect(rectF, ad, ad, paint);
        }
    }

    public final RectF billing() {
        Rect bounds = getBounds();
        RectF rectF = this.f22617e;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        PorterDuffColorFilter porterDuffColorFilter = this.f22614e;
        Paint paint = this.f22605e;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.f22618e.mopub;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f22621e;
        Paint paint2 = this.f22609e;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.f22618e.adcel);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f22618e.mopub;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.f22599e;
        Path path = this.f22619e;
        if (z) {
            float f = -(startapp() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            C15339e c15339e = this.f22618e.ad;
            C4568e appmetrica = c15339e.appmetrica();
            InterfaceC16189e interfaceC16189e = c15339e.appmetrica;
            if (!(interfaceC16189e instanceof C7929e)) {
                interfaceC16189e = new C4270e(f, interfaceC16189e);
            }
            appmetrica.appmetrica = interfaceC16189e;
            InterfaceC16189e interfaceC16189e2 = c15339e.purchase;
            if (!(interfaceC16189e2 instanceof C7929e)) {
                interfaceC16189e2 = new C4270e(f, interfaceC16189e2);
            }
            appmetrica.purchase = interfaceC16189e2;
            InterfaceC16189e interfaceC16189e3 = c15339e.yandex;
            if (!(interfaceC16189e3 instanceof C7929e)) {
                interfaceC16189e3 = new C4270e(f, interfaceC16189e3);
            }
            appmetrica.yandex = interfaceC16189e3;
            InterfaceC16189e interfaceC16189e4 = c15339e.billing;
            if (!(interfaceC16189e4 instanceof C7929e)) {
                interfaceC16189e4 = new C4270e(f, interfaceC16189e4);
            }
            appmetrica.billing = interfaceC16189e4;
            C15339e ad = appmetrica.ad();
            this.f22600e = ad;
            float f2 = this.f22618e.startapp;
            RectF billing = billing();
            RectF rectF = this.f22603e;
            rectF.set(billing);
            float strokeWidth = startapp() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f22606e.vip(ad, f2, rectF, null, this.f22611e);
            vip(billing(), path);
            this.f22599e = false;
        }
        C3774e c3774e = this.f22618e;
        c3774e.getClass();
        if (c3774e.amazon > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f22618e.ad.license(billing()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * this.f22618e.loadAd), (int) (Math.cos(Math.toRadians(d)) * this.f22618e.loadAd));
                if (this.f22616e) {
                    RectF rectF2 = this.f22613e;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f22618e.amazon * 2) + ((int) rectF2.width()) + width, (this.f22618e.amazon * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f3 = (getBounds().left - this.f22618e.amazon) - width;
                    float f4 = (getBounds().top - this.f22618e.amazon) - height;
                    canvas2.translate(-f3, -f4);
                    license(canvas2);
                    canvas.drawBitmap(createBitmap, f3, f4, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    license(canvas);
                    canvas.restore();
                }
            }
        }
        C3774e c3774e2 = this.f22618e;
        Paint.Style style = c3774e2.Signature;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            appmetrica(canvas, paint, path, c3774e2.ad, billing());
        }
        if (startapp()) {
            purchase(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f22618e.mopub;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f22618e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f22618e.getClass();
        if (this.f22618e.ad.license(billing())) {
            outline.setRoundRect(getBounds(), yandex() * this.f22618e.startapp);
            return;
        }
        RectF billing = billing();
        Path path = this.f22619e;
        vip(billing, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC11198e.ad(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC12958e.ad(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC12958e.ad(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f22618e.billing;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f22612e;
        region.set(bounds);
        RectF billing = billing();
        Path path = this.f22619e;
        vip(billing, path);
        Region region2 = this.f22601e;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f22599e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f22618e.appmetrica;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f22618e.getClass();
        ColorStateList colorStateList2 = this.f22618e.license;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f22618e.metrica;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void license(Canvas canvas) {
        if (this.f22615e.cardinality() > 0) {
            Log.w("eُۚۜ", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f22618e.loadAd;
        Path path = this.f22619e;
        C11224e c11224e = this.f22610e;
        if (i != 0) {
            canvas.drawPath(path, (Paint) c11224e.license);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            AbstractC15107e abstractC15107e = this.f22607e[i2];
            int i3 = this.f22618e.amazon;
            Matrix matrix = AbstractC15107e.vip;
            abstractC15107e.ad(matrix, c11224e, i3, canvas);
            this.f22602e[i2].ad(matrix, c11224e, this.f22618e.amazon, canvas);
        }
        if (this.f22616e) {
            double d = 0;
            int sin = (int) (Math.sin(Math.toRadians(d)) * this.f22618e.loadAd);
            int cos = (int) (Math.cos(Math.toRadians(d)) * this.f22618e.loadAd);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f22598e);
            canvas.translate(sin, cos);
        }
    }

    public final boolean loadAd(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f22618e.metrica == null || color2 == (colorForState2 = this.f22618e.metrica.getColorForState(iArr, (color2 = (paint2 = this.f22605e).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f22618e.license == null || color == (colorForState = this.f22618e.license.getColorForState(iArr, (color = (paint = this.f22609e).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final int metrica(int i) {
        C3774e c3774e = this.f22618e;
        float f = c3774e.smaato + 0.0f + c3774e.advert;
        C15190e c15190e = c3774e.vip;
        return c15190e != null ? c15190e.ad(i, f) : i;
    }

    public final void mopub(float f) {
        C3774e c3774e = this.f22618e;
        if (c3774e.smaato != f) {
            c3774e.smaato = f;
            admob();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f22618e = new C3774e(this.f22618e);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f22599e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = loadAd(iArr) || Signature();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public void purchase(Canvas canvas) {
        C15339e c15339e = this.f22600e;
        RectF billing = billing();
        RectF rectF = this.f22603e;
        rectF.set(billing);
        boolean startapp = startapp();
        Paint paint = this.f22609e;
        float strokeWidth = startapp ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        appmetrica(canvas, paint, this.f22611e, c15339e, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C3774e c3774e = this.f22618e;
        if (c3774e.mopub != i) {
            c3774e.mopub = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f22618e.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.InterfaceC13298e
    public final void setShapeAppearanceModel(C15339e c15339e) {
        this.f22618e.ad = c15339e;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f22618e.appmetrica = colorStateList;
        Signature();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C3774e c3774e = this.f22618e;
        if (c3774e.purchase != mode) {
            c3774e.purchase = mode;
            Signature();
            super.invalidateSelf();
        }
    }

    public final void smaato(float f) {
        C3774e c3774e = this.f22618e;
        if (c3774e.startapp != f) {
            c3774e.startapp = f;
            this.f22599e = true;
            invalidateSelf();
        }
    }

    public final boolean startapp() {
        Paint.Style style = this.f22618e.Signature;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f22609e.getStrokeWidth() > 0.0f;
    }

    public final void vip(RectF rectF, Path path) {
        C3774e c3774e = this.f22618e;
        this.f22606e.vip(c3774e.ad, c3774e.startapp, rectF, this.f22608e, path);
        if (this.f22618e.yandex != 1.0f) {
            Matrix matrix = this.f22620e;
            matrix.reset();
            float f = this.f22618e.yandex;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f22613e, true);
    }

    public final float yandex() {
        return this.f22618e.ad.appmetrica.ad(billing());
    }
}
