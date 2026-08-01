package com.skydoves.balloon.radius;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.AbstractC14753e;
import defpackage.AbstractC1619e;
import defpackage.AbstractC3062e;
import defpackage.AbstractC3820e;
import defpackage.AbstractC7890e;
import defpackage.C11883e;
import defpackage.C13506e;
import defpackage.C14803e;
import defpackage.EnumC12644e;
import defpackage.InterfaceC8614e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR.\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR+\u0010'\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010,\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010$\"\u0004\b+\u0010&R*\u00100\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010)\u001a\u0004\b.\u0010$\"\u0004\b/\u0010&R*\u00104\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010)\u001a\u0004\b2\u0010$\"\u0004\b3\u0010&R*\u0010<\u001a\u0002052\u0006\u0010\u000f\u001a\u0002058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010$¨\u0006?"}, d2 = {"Lcom/skydoves/balloon/radius/RadiusLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", BuildConfig.FLAVOR, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", BuildConfig.FLAVOR, "setFillColor", "(I)V", "Landroid/graphics/drawable/Drawable;", "value", "eؙِٖ", "Landroid/graphics/drawable/Drawable;", "getCustomShapeBackgroundDrawable", "()Landroid/graphics/drawable/Drawable;", "setCustomShapeBackgroundDrawable", "(Landroid/graphics/drawable/Drawable;)V", "customShapeBackgroundDrawable", BuildConfig.FLAVOR, "eّؑؑ", "Z", "getDrawCustomShape", "()Z", "setDrawCustomShape", "(Z)V", "drawCustomShape", BuildConfig.FLAVOR, "<set-?>", "eؙؔٞ", "Leَِٞ;", "getRadius", "()F", "setRadius", "(F)V", "radius", "eٍۗۛ", "F", "getArrowHeight", "setArrowHeight", "arrowHeight", "eٕؓۥ", "getArrowWidth", "setArrowWidth", "arrowWidth", "eٕؒۙ", "getArrowPositionRatio", "setArrowPositionRatio", "arrowPositionRatio", "Leؘّٟ;", "eَؕ۟", "Leؘّٟ;", "getArrowOrientation", "()Leؘّٟ;", "setArrowOrientation", "(Leؘّٟ;)V", "arrowOrientation", "getHalfStroke", "halfStroke", "balloon_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RadiusLayout extends FrameLayout {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC8614e[] f1096e = {AbstractC3820e.ad.purchase(new C13506e(RadiusLayout.class, "radius", "getRadius()F", 0))};

    /* renamed from: eّؑؑ, reason: contains not printable characters and from kotlin metadata */
    public boolean drawCustomShape;

    /* renamed from: eٕؒۙ, reason: contains not printable characters and from kotlin metadata */
    public float arrowPositionRatio;

    /* renamed from: eٕؓۥ, reason: contains not printable characters and from kotlin metadata */
    public float arrowWidth;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Paint f1100e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters and from kotlin metadata */
    public final C11883e radius;

    /* renamed from: eَؕ۟, reason: contains not printable characters and from kotlin metadata */
    public EnumC12644e arrowOrientation;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Paint f1103e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f1104e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters and from kotlin metadata */
    public float arrowHeight;

    /* renamed from: eؙِٖ, reason: contains not printable characters and from kotlin metadata */
    public Drawable customShapeBackgroundDrawable;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f1107e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Path f1108e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f1109e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f1110e;

    public RadiusLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public RadiusLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RadiusLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        this.f1108e = new Path();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f1103e = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeJoin(Paint.Join.MITER);
        this.f1100e = paint2;
        this.radius = AbstractC14753e.appmetrica(this, Float.valueOf(0.0f));
        this.arrowPositionRatio = 0.5f;
        this.arrowOrientation = EnumC12644e.f25365e;
    }

    public /* synthetic */ RadiusLayout(Context context, AttributeSet attributeSet, int i, int i2, AbstractC1619e abstractC1619e) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final float getHalfStroke() {
        Paint paint = this.f1100e;
        if (paint.getStrokeWidth() > 0.0f) {
            return paint.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final void ad() {
        Path path = this.f1108e;
        path.reset();
        if (!this.drawCustomShape || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        float f = this.arrowHeight * 0.5f;
        float halfStroke = getHalfStroke() + f;
        float halfStroke2 = this.arrowOrientation == EnumC12644e.f25362e ? halfStroke : getHalfStroke();
        float halfStroke3 = this.arrowOrientation == EnumC12644e.f25363e ? halfStroke : getHalfStroke();
        float width = this.arrowOrientation == EnumC12644e.f25364e ? getWidth() - halfStroke : getWidth() - getHalfStroke();
        float height = this.arrowOrientation == EnumC12644e.f25365e ? getHeight() - halfStroke : getHeight() - getHalfStroke();
        float vip = AbstractC3062e.vip(getWidth() * this.arrowPositionRatio, (this.arrowWidth / 2.0f) + getHalfStroke(), (getWidth() - (this.arrowWidth / 2.0f)) - getHalfStroke());
        float vip2 = AbstractC3062e.vip(getHeight() * this.arrowPositionRatio, (this.arrowWidth / 2.0f) + getHalfStroke(), (getHeight() - (this.arrowWidth / 2.0f)) - getHalfStroke());
        int ordinal = this.arrowOrientation.ordinal();
        if (ordinal == 0) {
            path.moveTo(getRadius() + halfStroke2, halfStroke3);
            path.lineTo(width - getRadius(), halfStroke3);
            path.quadTo(width, halfStroke3, width, getRadius() + halfStroke3);
            path.lineTo(width, height - getRadius());
            path.quadTo(width, height, width - getRadius(), height);
            path.lineTo((this.arrowWidth / 2.0f) + vip, height);
            path.lineTo(vip, f + height);
            path.lineTo(vip - (this.arrowWidth / 2.0f), height);
            path.lineTo(getRadius() + halfStroke2, height);
            path.quadTo(halfStroke2, height, halfStroke2, height - getRadius());
            path.lineTo(halfStroke2, getRadius() + halfStroke3);
            path.quadTo(halfStroke2, halfStroke3, getRadius() + halfStroke2, halfStroke3);
        } else if (ordinal == 1) {
            path.moveTo(getRadius() + halfStroke2, height);
            path.lineTo(width - getRadius(), height);
            path.quadTo(width, height, width, height - getRadius());
            path.lineTo(width, getRadius() + halfStroke3);
            path.quadTo(width, halfStroke3, width - getRadius(), halfStroke3);
            path.lineTo((this.arrowWidth / 2.0f) + vip, halfStroke3);
            path.lineTo(vip, halfStroke3 - f);
            path.lineTo(vip - (this.arrowWidth / 2.0f), halfStroke3);
            path.lineTo(getRadius() + halfStroke2, halfStroke3);
            path.quadTo(halfStroke2, halfStroke3, halfStroke2, getRadius() + halfStroke3);
            path.lineTo(halfStroke2, height - getRadius());
            path.quadTo(halfStroke2, height, getRadius() + halfStroke2, height);
        } else if (ordinal == 2) {
            path.moveTo(getRadius() + halfStroke2, halfStroke3);
            path.lineTo(width - getRadius(), halfStroke3);
            path.quadTo(width, halfStroke3, width, getRadius() + halfStroke3);
            path.lineTo(width, height - getRadius());
            path.quadTo(width, height, width - getRadius(), height);
            path.lineTo(getRadius() + halfStroke2, height);
            path.quadTo(halfStroke2, height, halfStroke2, height - getRadius());
            path.lineTo(halfStroke2, (this.arrowWidth / 2.0f) + vip2);
            path.lineTo(halfStroke2 - f, vip2);
            path.lineTo(halfStroke2, vip2 - (this.arrowWidth / 2.0f));
            path.lineTo(halfStroke2, getRadius() + halfStroke3);
            path.quadTo(halfStroke2, halfStroke3, getRadius() + halfStroke2, halfStroke3);
        } else {
            if (ordinal != 3) {
                throw new C14803e(10);
            }
            path.moveTo(getRadius() + halfStroke2, halfStroke3);
            path.lineTo(width - getRadius(), halfStroke3);
            path.quadTo(width, halfStroke3, width, getRadius() + halfStroke3);
            path.lineTo(width, vip2 - (this.arrowWidth / 2.0f));
            path.lineTo(f + width, vip2);
            path.lineTo(width, (this.arrowWidth / 2.0f) + vip2);
            path.lineTo(width, height - getRadius());
            path.quadTo(width, height, width - getRadius(), height);
            path.lineTo(getRadius() + halfStroke2, height);
            path.quadTo(halfStroke2, height, halfStroke2, height - getRadius());
            path.lineTo(halfStroke2, getRadius() + halfStroke3);
            path.quadTo(halfStroke2, halfStroke3, getRadius() + halfStroke2, halfStroke3);
        }
        path.close();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.drawCustomShape) {
            Path path = this.f1108e;
            if (!path.isEmpty()) {
                int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
                Paint paint = this.f1100e;
                if (paint.getStrokeWidth() > 0.0f) {
                    canvas.drawPath(path, paint);
                }
                canvas.clipPath(path);
                Drawable drawable = this.customShapeBackgroundDrawable;
                if (drawable == null) {
                    canvas.drawPath(path, this.f1103e);
                } else if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.dispatchDraw(canvas);
                canvas.restoreToCount(saveLayer);
                return;
            }
        }
        super.dispatchDraw(canvas);
    }

    public final float getArrowHeight() {
        return this.arrowHeight;
    }

    public final EnumC12644e getArrowOrientation() {
        return this.arrowOrientation;
    }

    public final float getArrowPositionRatio() {
        return this.arrowPositionRatio;
    }

    public final float getArrowWidth() {
        return this.arrowWidth;
    }

    public final Drawable getCustomShapeBackgroundDrawable() {
        return this.customShapeBackgroundDrawable;
    }

    public final boolean getDrawCustomShape() {
        return this.drawCustomShape;
    }

    public final float getRadius() {
        InterfaceC8614e interfaceC8614e = f1096e[0];
        return ((Number) this.radius.f23814e).floatValue();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.f1108e;
        path.rewind();
        path.addRoundRect(new RectF(0.0f, 0.0f, i, i2), getRadius(), getRadius(), Path.Direction.CW);
        if (this.drawCustomShape) {
            ad();
            vip();
            Drawable drawable = this.customShapeBackgroundDrawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, i, i2);
            }
            requestLayout();
        }
    }

    public final void setArrowHeight(float f) {
        if (this.arrowHeight == f) {
            return;
        }
        this.arrowHeight = f;
        if (this.drawCustomShape) {
            ad();
        }
        if (this.drawCustomShape) {
            vip();
        }
    }

    public final void setArrowOrientation(EnumC12644e enumC12644e) {
        if (this.arrowOrientation != enumC12644e) {
            this.arrowOrientation = enumC12644e;
            if (this.drawCustomShape) {
                ad();
            }
            if (this.drawCustomShape) {
                vip();
            }
        }
    }

    public final void setArrowPositionRatio(float f) {
        if (this.arrowPositionRatio == f) {
            return;
        }
        this.arrowPositionRatio = f;
        if (this.drawCustomShape) {
            ad();
        }
    }

    public final void setArrowWidth(float f) {
        if (this.arrowWidth == f) {
            return;
        }
        this.arrowWidth = f;
        if (this.drawCustomShape) {
            ad();
        }
    }

    public final void setCustomShapeBackgroundDrawable(Drawable drawable) {
        if (AbstractC7890e.billing(this.customShapeBackgroundDrawable, drawable)) {
            return;
        }
        this.customShapeBackgroundDrawable = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
        }
        invalidate();
    }

    public final void setDrawCustomShape(boolean z) {
        if (this.drawCustomShape != z) {
            this.drawCustomShape = z;
            setWillNotDraw(!z);
            invalidate();
        }
    }

    public final void setFillColor(int color) {
        this.f1103e.setColor(color);
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f1110e = i;
        this.f1109e = i2;
        this.f1104e = i3;
        this.f1107e = i4;
        if (this.drawCustomShape) {
            vip();
        } else {
            super.setPadding(i, i2, i3, i4);
        }
    }

    public final void setRadius(float f) {
        this.radius.remoteconfig(f1096e[0], Float.valueOf(f));
    }

    public final void vip() {
        if (this.drawCustomShape) {
            float halfStroke = (this.arrowHeight * 0.5f) + getHalfStroke();
            int i = this.f1110e;
            EnumC12644e enumC12644e = this.arrowOrientation;
            super.setPadding(i + (enumC12644e == EnumC12644e.f25362e ? (int) halfStroke : 0), this.f1109e + (enumC12644e == EnumC12644e.f25363e ? (int) halfStroke : 0), this.f1104e + (enumC12644e == EnumC12644e.f25364e ? (int) halfStroke : 0), this.f1107e + (enumC12644e == EnumC12644e.f25365e ? (int) halfStroke : 0));
        }
    }
}
