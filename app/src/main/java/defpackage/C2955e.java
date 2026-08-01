package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٕؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2955e extends AbstractC5358e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final PorterDuff.Mode f6979e = PorterDuff.Mode.SRC_IN;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f6980e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public PorterDuffColorFilter f6981e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C3760e f6982e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final Matrix f6983e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public ColorFilter f6984e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final Rect f6985e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final float[] f6986e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f6987e;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, eؕۦٓ] */
    public C2955e() {
        this.f6987e = true;
        this.f6986e = new float[9];
        this.f6983e = new Matrix();
        this.f6985e = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.metrica = null;
        constantState.license = f6979e;
        constantState.vip = new C18448e();
        this.f6982e = constantState;
    }

    public C2955e(C3760e c3760e) {
        this.f6987e = true;
        this.f6986e = new float[9];
        this.f6983e = new Matrix();
        this.f6985e = new Rect();
        this.f6982e = c3760e;
        this.f6981e = vip(c3760e.metrica, c3760e.license);
    }

    public static C2955e ad(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C2955e c2955e = new C2955e();
            ThreadLocal threadLocal = AbstractC16340e.ad;
            c2955e.f11478e = resources.getDrawable(i, theme);
            return c2955e;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            C2955e c2955e2 = new C2955e();
            c2955e2.inflate(resources, xml, asAttributeSet, theme);
            return c2955e2;
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f11478e;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f6985e;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f6984e;
        if (colorFilter == null) {
            colorFilter = this.f6981e;
        }
        Matrix matrix = this.f6983e;
        canvas.getMatrix(matrix);
        float[] fArr = this.f6986e;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C3760e c3760e = this.f6982e;
        Bitmap bitmap = c3760e.purchase;
        if (bitmap == null || min != bitmap.getWidth() || min2 != c3760e.purchase.getHeight()) {
            c3760e.purchase = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            c3760e.mopub = true;
        }
        if (this.f6987e) {
            C3760e c3760e2 = this.f6982e;
            if (c3760e2.mopub || c3760e2.billing != c3760e2.metrica || c3760e2.yandex != c3760e2.license || c3760e2.adcel != c3760e2.appmetrica || c3760e2.startapp != c3760e2.vip.getRootAlpha()) {
                C3760e c3760e3 = this.f6982e;
                c3760e3.purchase.eraseColor(0);
                Canvas canvas2 = new Canvas(c3760e3.purchase);
                C18448e c18448e = c3760e3.vip;
                c18448e.ad(c18448e.billing, C18448e.Signature, canvas2, min, min2);
                C3760e c3760e4 = this.f6982e;
                c3760e4.billing = c3760e4.metrica;
                c3760e4.yandex = c3760e4.license;
                c3760e4.startapp = c3760e4.vip.getRootAlpha();
                c3760e4.adcel = c3760e4.appmetrica;
                c3760e4.mopub = false;
            }
        } else {
            C3760e c3760e5 = this.f6982e;
            c3760e5.purchase.eraseColor(0);
            Canvas canvas3 = new Canvas(c3760e5.purchase);
            C18448e c18448e2 = c3760e5.vip;
            c18448e2.ad(c18448e2.billing, C18448e.Signature, canvas3, min, min2);
        }
        C3760e c3760e6 = this.f6982e;
        if (c3760e6.vip.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c3760e6.advert == null) {
                Paint paint2 = new Paint();
                c3760e6.advert = paint2;
                paint2.setFilterBitmap(true);
            }
            c3760e6.advert.setAlpha(c3760e6.vip.getRootAlpha());
            c3760e6.advert.setColorFilter(colorFilter);
            paint = c3760e6.advert;
        }
        canvas.drawBitmap(c3760e6.purchase, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f11478e;
        return drawable != null ? drawable.getAlpha() : this.f6982e.vip.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f11478e;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f6982e.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f11478e;
        return drawable != null ? drawable.getColorFilter() : this.f6984e;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f11478e != null && Build.VERSION.SDK_INT >= 24) {
            return new C9661e(this.f11478e.getConstantState());
        }
        this.f6982e.ad = getChangingConfigurations();
        return this.f6982e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f11478e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f6982e.vip.startapp;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f11478e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f6982e.vip.yandex;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v15, types: [eٌؚٛ, eٗۡۤ, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        int i3;
        int i4;
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C3760e c3760e = this.f6982e;
        c3760e.vip = new C18448e();
        TypedArray subscription = AbstractC13406e.subscription(resources, theme, attributeSet, AbstractC9180e.ad);
        C3760e c3760e2 = this.f6982e;
        C18448e c18448e = c3760e2.vip;
        int i5 = !AbstractC13406e.smaato(xmlPullParser, "tintMode") ? -1 : subscription.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i6 = 3;
        if (i5 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i5 != 5) {
            if (i5 != 9) {
                switch (i5) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c3760e2.license = mode;
        ColorStateList yandex = AbstractC13406e.yandex(subscription, xmlPullParser, theme);
        if (yandex != null) {
            c3760e2.metrica = yandex;
        }
        boolean z = c3760e2.appmetrica;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = subscription.getBoolean(5, z);
        }
        c3760e2.appmetrica = z;
        float f = c18448e.adcel;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = subscription.getFloat(7, f);
        }
        c18448e.adcel = f;
        float f2 = c18448e.mopub;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = subscription.getFloat(8, f2);
        }
        c18448e.mopub = f2;
        if (c18448e.adcel <= 0.0f) {
            throw new XmlPullParserException(subscription.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(subscription.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c18448e.yandex = subscription.getDimension(3, c18448e.yandex);
        int i7 = 2;
        float dimension = subscription.getDimension(2, c18448e.startapp);
        c18448e.startapp = dimension;
        if (c18448e.yandex <= 0.0f) {
            throw new XmlPullParserException(subscription.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(subscription.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = c18448e.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = subscription.getFloat(4, alpha);
        }
        c18448e.setAlpha(alpha);
        String string = subscription.getString(0);
        if (string != null) {
            c18448e.smaato = string;
            c18448e.loadAd.put(string, c18448e);
        }
        subscription.recycle();
        c3760e.ad = getChangingConfigurations();
        int i8 = 1;
        c3760e.mopub = true;
        C3760e c3760e3 = this.f6982e;
        C18448e c18448e2 = c3760e3.vip;
        ArrayDeque arrayDeque = new ArrayDeque();
        C11875e c11875e = c18448e2.billing;
        C2271e c2271e = c18448e2.loadAd;
        arrayDeque.push(c11875e);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i8 && (xmlPullParser.getDepth() >= depth || eventType != i6)) {
            if (eventType == i7) {
                String name = xmlPullParser.getName();
                C11875e c11875e2 = (C11875e) arrayDeque.peek();
                if (c11875e2 != null) {
                    ArrayList arrayList = c11875e2.vip;
                    i = depth;
                    if ("path".equals(name)) {
                        ?? abstractC7279e = new AbstractC7279e();
                        abstractC7279e.appmetrica = 0.0f;
                        abstractC7279e.billing = 1.0f;
                        abstractC7279e.yandex = 1.0f;
                        abstractC7279e.startapp = 0.0f;
                        abstractC7279e.adcel = 1.0f;
                        abstractC7279e.mopub = 0.0f;
                        Paint.Cap cap = Paint.Cap.BUTT;
                        abstractC7279e.advert = cap;
                        Paint.Join join = Paint.Join.MITER;
                        abstractC7279e.smaato = join;
                        abstractC7279e.amazon = 4.0f;
                        TypedArray subscription2 = AbstractC13406e.subscription(resources, theme, attributeSet, AbstractC9180e.metrica);
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            String string2 = subscription2.getString(0);
                            if (string2 != null) {
                                abstractC7279e.vip = string2;
                            }
                            String string3 = subscription2.getString(2);
                            if (string3 != null) {
                                abstractC7279e.ad = AbstractC18491e.license(string3);
                            }
                            abstractC7279e.purchase = AbstractC13406e.startapp(subscription2, xmlPullParser, theme, "fillColor", 1);
                            float f3 = abstractC7279e.yandex;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                f3 = subscription2.getFloat(12, f3);
                            }
                            abstractC7279e.yandex = f3;
                            int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? subscription2.getInt(8, -1) : -1;
                            abstractC7279e.advert = i9 != 0 ? i9 != 1 ? i9 != 2 ? abstractC7279e.advert : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                            int i10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? subscription2.getInt(9, -1) : -1;
                            abstractC7279e.smaato = i10 != 0 ? i10 != 1 ? i10 != 2 ? abstractC7279e.smaato : Paint.Join.BEVEL : Paint.Join.ROUND : join;
                            float f4 = abstractC7279e.amazon;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                f4 = subscription2.getFloat(10, f4);
                            }
                            abstractC7279e.amazon = f4;
                            abstractC7279e.license = AbstractC13406e.startapp(subscription2, xmlPullParser, theme, "strokeColor", 3);
                            float f5 = abstractC7279e.billing;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                f5 = subscription2.getFloat(11, f5);
                            }
                            abstractC7279e.billing = f5;
                            float f6 = abstractC7279e.appmetrica;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                f6 = subscription2.getFloat(4, f6);
                            }
                            abstractC7279e.appmetrica = f6;
                            float f7 = abstractC7279e.adcel;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                f7 = subscription2.getFloat(6, f7);
                            }
                            abstractC7279e.adcel = f7;
                            float f8 = abstractC7279e.mopub;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                f8 = subscription2.getFloat(7, f8);
                            }
                            abstractC7279e.mopub = f8;
                            float f9 = abstractC7279e.startapp;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                f9 = subscription2.getFloat(5, f9);
                            }
                            abstractC7279e.startapp = f9;
                            int i11 = abstractC7279e.metrica;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                i11 = subscription2.getInt(13, i11);
                            }
                            abstractC7279e.metrica = i11;
                        }
                        subscription2.recycle();
                        arrayList.add(abstractC7279e);
                        if (abstractC7279e.getPathName() != null) {
                            c2271e.put(abstractC7279e.getPathName(), abstractC7279e);
                        }
                        c3760e3.ad = c3760e3.ad;
                        i4 = 1;
                        z2 = false;
                    } else {
                        if ("clip-path".equals(name)) {
                            AbstractC7279e abstractC7279e2 = new AbstractC7279e();
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                TypedArray subscription3 = AbstractC13406e.subscription(resources, theme, attributeSet, AbstractC9180e.license);
                                String string4 = subscription3.getString(0);
                                if (string4 != null) {
                                    abstractC7279e2.vip = string4;
                                }
                                String string5 = subscription3.getString(1);
                                if (string5 != null) {
                                    abstractC7279e2.ad = AbstractC18491e.license(string5);
                                }
                                abstractC7279e2.metrica = !AbstractC13406e.smaato(xmlPullParser, "fillType") ? 0 : subscription3.getInt(2, 0);
                                subscription3.recycle();
                            }
                            arrayList.add(abstractC7279e2);
                            if (abstractC7279e2.getPathName() != null) {
                                c2271e.put(abstractC7279e2.getPathName(), abstractC7279e2);
                            }
                            c3760e3.ad = c3760e3.ad;
                        } else if ("group".equals(name)) {
                            C11875e c11875e3 = new C11875e();
                            TypedArray subscription4 = AbstractC13406e.subscription(resources, theme, attributeSet, AbstractC9180e.vip);
                            float f10 = c11875e3.metrica;
                            if (AbstractC13406e.smaato(xmlPullParser, "rotation")) {
                                f10 = subscription4.getFloat(5, f10);
                            }
                            c11875e3.metrica = f10;
                            i4 = 1;
                            c11875e3.license = subscription4.getFloat(1, c11875e3.license);
                            c11875e3.appmetrica = subscription4.getFloat(2, c11875e3.appmetrica);
                            float f11 = c11875e3.purchase;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                f11 = subscription4.getFloat(3, f11);
                            }
                            c11875e3.purchase = f11;
                            float f12 = c11875e3.billing;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                f12 = subscription4.getFloat(4, f12);
                            }
                            c11875e3.billing = f12;
                            float f13 = c11875e3.yandex;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                f13 = subscription4.getFloat(6, f13);
                            }
                            c11875e3.yandex = f13;
                            float f14 = c11875e3.startapp;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                f14 = subscription4.getFloat(7, f14);
                            }
                            c11875e3.startapp = f14;
                            String string6 = subscription4.getString(0);
                            if (string6 != null) {
                                c11875e3.mopub = string6;
                            }
                            c11875e3.metrica();
                            subscription4.recycle();
                            arrayList.add(c11875e3);
                            arrayDeque.push(c11875e3);
                            if (c11875e3.getGroupName() != null) {
                                c2271e.put(c11875e3.getGroupName(), c11875e3);
                            }
                            c3760e3.ad = c3760e3.ad;
                        }
                        i4 = 1;
                    }
                } else {
                    i = depth;
                    i4 = 1;
                }
                i3 = i4;
                i2 = 3;
            } else {
                i = depth;
                i2 = i6;
                i3 = 1;
                if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i6 = i2;
            i8 = i3;
            depth = i;
            i7 = 2;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.f6981e = vip(c3760e.metrica, c3760e.license);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f11478e;
        return drawable != null ? drawable.isAutoMirrored() : this.f6982e.appmetrica;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C3760e c3760e = this.f6982e;
        if (c3760e == null) {
            return false;
        }
        C18448e c18448e = c3760e.vip;
        if (c18448e.amazon == null) {
            c18448e.amazon = Boolean.valueOf(c18448e.billing.ad());
        }
        if (c18448e.amazon.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f6982e.metrica;
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, eؕۦٓ] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f6980e && super.mutate() == this) {
            C3760e c3760e = this.f6982e;
            ?? constantState = new Drawable.ConstantState();
            constantState.metrica = null;
            constantState.license = f6979e;
            if (c3760e != null) {
                constantState.ad = c3760e.ad;
                C18448e c18448e = new C18448e(c3760e.vip);
                constantState.vip = c18448e;
                if (c3760e.vip.appmetrica != null) {
                    c18448e.appmetrica = new Paint(c3760e.vip.appmetrica);
                }
                if (c3760e.vip.license != null) {
                    constantState.vip.license = new Paint(c3760e.vip.license);
                }
                constantState.metrica = c3760e.metrica;
                constantState.license = c3760e.license;
                constantState.appmetrica = c3760e.appmetrica;
            }
            this.f6982e = constantState;
            this.f6980e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C3760e c3760e = this.f6982e;
        ColorStateList colorStateList = c3760e.metrica;
        if (colorStateList == null || (mode = c3760e.license) == null) {
            z = false;
        } else {
            this.f6981e = vip(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C18448e c18448e = c3760e.vip;
        if (c18448e.amazon == null) {
            c18448e.amazon = Boolean.valueOf(c18448e.billing.ad());
        }
        if (c18448e.amazon.booleanValue()) {
            boolean vip = c3760e.vip.billing.vip(iArr);
            c3760e.mopub |= vip;
            if (vip) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f6982e.vip.getRootAlpha() != i) {
            this.f6982e.vip.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f6982e.appmetrica = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f6984e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        C3760e c3760e = this.f6982e;
        if (c3760e.metrica != colorStateList) {
            c3760e.metrica = colorStateList;
            this.f6981e = vip(colorStateList, c3760e.license);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        C3760e c3760e = this.f6982e;
        if (c3760e.license != mode) {
            c3760e.license = mode;
            this.f6981e = vip(c3760e.metrica, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f11478e;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f11478e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public final PorterDuffColorFilter vip(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
