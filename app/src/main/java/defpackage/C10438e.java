package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٟۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10438e extends LinearLayout {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f20608e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f20609e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final Rect f20610e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Paint f20611e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f20612e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ C5856e f20613e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public float f20614e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f20615e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f20616e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public ValueAnimator f20617e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f20618e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10438e(C5856e c5856e, Context context) {
        super(context);
        this.f20613e = c5856e;
        this.f20609e = -1;
        this.f20608e = -1;
        this.f20618e = -1;
        this.f20612e = -1;
        this.f20615e = -1;
        this.f20610e = new Rect();
        setWillNotDraw(false);
        this.f20611e = new Paint();
        new GradientDrawable();
    }

    public final void ad(C13495e c13495e, RectF rectF) {
        int contentWidth;
        contentWidth = c13495e.getContentWidth();
        int vip = (int) AbstractC6286e.vip(getContext(), 24);
        if (contentWidth < vip) {
            contentWidth = vip;
        }
        int right = (c13495e.getRight() + c13495e.getLeft()) / 2;
        int i = contentWidth / 2;
        rectF.set(right - i, 0.0f, right + i, 0.0f);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        C5856e c5856e = this.f20613e;
        Drawable drawable = c5856e.f12365e;
        if (drawable != null) {
            drawable.getIntrinsicHeight();
        }
        int i = c5856e.f12347e;
        if (i == 0) {
            getHeight();
            getHeight();
        } else if (i == 1) {
            getHeight();
            getHeight();
        } else if (i == 3) {
            getHeight();
        }
        int strokeWidth = (int) (c5856e.f12375e.getStrokeWidth() / 2.0f);
        int i2 = this.f20608e;
        if (i2 < 0 || this.f20618e <= i2) {
            canvas2 = canvas;
        } else {
            float textSize = (c5856e.f12340e.getTextSize() / 2.0f) + (getHeight() / 2.0f) + c5856e.f12336e;
            int i3 = this.f20608e + strokeWidth;
            int i4 = c5856e.f12367e;
            canvas2 = canvas;
            canvas2.drawLine(i3 + i4, textSize, (this.f20618e - strokeWidth) - i4, textSize, c5856e.f12375e);
        }
        c5856e.f12379e.rewind();
        Path path = c5856e.f12379e;
        int i5 = this.f20608e + strokeWidth;
        int i6 = c5856e.f12367e;
        path.addRect(i5 + i6, 0.0f, (this.f20618e - strokeWidth) - i6, getHeight(), Path.Direction.CW);
        int save = canvas2.save();
        canvas2.clipPath(c5856e.f12379e);
        vip(canvas2, c5856e.f12348e);
        canvas2.restoreToCount(save);
        int save2 = canvas2.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas2.clipOutPath(c5856e.f12379e);
        } else {
            canvas2.clipPath(c5856e.f12379e, Region.Op.DIFFERENCE);
        }
        vip(canvas2, c5856e.f12340e);
        canvas2.restoreToCount(save2);
    }

    public final void license(int i, int i2, boolean z) {
        C5856e c5856e = this.f20613e;
        RectF rectF = c5856e.f12370e;
        View childAt = getChildAt(i);
        if (childAt == null) {
            metrica();
            return;
        }
        int left = childAt.getLeft();
        int right = childAt.getRight();
        if (!c5856e.f12366e && (childAt instanceof C13495e)) {
            ad((C13495e) childAt, rectF);
            left = (int) rectF.left;
            right = (int) rectF.right;
        }
        int i3 = this.f20608e;
        int i4 = this.f20618e;
        if (i3 == left && i4 == right) {
            return;
        }
        if (z) {
            this.f20612e = i3;
            this.f20615e = i4;
        }
        C14750e c14750e = new C14750e(this, left, right);
        if (!z) {
            this.f20617e.removeAllUpdateListeners();
            this.f20617e.addUpdateListener(c14750e);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f20617e = valueAnimator;
        valueAnimator.setInterpolator(AbstractC16664e.vip);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(c14750e);
        valueAnimator.addListener(new C3543e(this, i));
        valueAnimator.start();
    }

    public final void metrica() {
        int i;
        int i2;
        C5856e c5856e = this.f20613e;
        RectF rectF = c5856e.f12370e;
        View childAt = getChildAt(this.f20609e);
        if (childAt == null || childAt.getWidth() <= 0) {
            i = -1;
            i2 = -1;
        } else {
            i = childAt.getLeft();
            i2 = childAt.getRight();
            if (!c5856e.f12366e && (childAt instanceof C13495e)) {
                ad((C13495e) childAt, rectF);
                i = (int) rectF.left;
                i2 = (int) rectF.right;
            }
            if (this.f20614e > 0.0f && this.f20609e < getChildCount() - 1) {
                View childAt2 = getChildAt(this.f20609e + 1);
                int left = childAt2.getLeft();
                int right = childAt2.getRight();
                if (!c5856e.f12366e && (childAt2 instanceof C13495e)) {
                    ad((C13495e) childAt2, rectF);
                    left = (int) rectF.left;
                    right = (int) rectF.right;
                }
                float f = this.f20614e;
                float f2 = 1.0f - f;
                i = (int) ((i * f2) + (left * f));
                i2 = (int) ((f2 * i2) + (f * right));
            }
        }
        if (i == this.f20608e && i2 == this.f20618e) {
            return;
        }
        this.f20608e = i;
        this.f20618e = i2;
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        postInvalidateOnAnimation();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.f20617e;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            metrica();
        } else {
            license(this.f20609e, -1, false);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        C5856e c5856e = this.f20613e;
        boolean z = true;
        if (c5856e.f12364e == 1 || c5856e.f12362e == 2) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    i3 = Math.max(i3, childAt.getMeasuredWidth());
                }
            }
            if (i3 <= 0) {
                return;
            }
            if (i3 * childCount <= getMeasuredWidth() - (((int) AbstractC6286e.vip(getContext(), 16)) * 2)) {
                boolean z2 = false;
                for (int i5 = 0; i5 < childCount; i5++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                    if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                        layoutParams.width = i3;
                        layoutParams.weight = 0.0f;
                        z2 = true;
                    }
                }
                z = z2;
            } else {
                c5856e.f12364e = 0;
                c5856e.adcel(false);
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }
    }

    public final void vip(Canvas canvas, TextPaint textPaint) {
        C10661e c10661e = new C10661e(0, this);
        while (c10661e.hasNext()) {
            View view = (View) c10661e.next();
            TextView textView = ((C13495e) view).f26765e;
            textPaint.setTextSize(textView.getTextSize());
            CharSequence text = textView.getText();
            if (text != null) {
                textPaint.getTextBounds(text.toString(), 0, text.length(), this.f20610e);
                canvas.drawText(text, 0, text.length(), ((view.getWidth() - r6.width()) / 2.0f) + view.getX(), this.f20613e.getHeight() / 2.0f, textPaint);
            }
        }
    }
}
