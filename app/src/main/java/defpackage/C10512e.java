package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.animation.DecelerateInterpolator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10512e extends Drawable implements Animatable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final float f20740e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final float f20741e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final float f20742e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final float f20743e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final float f20744e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public C14695e f20745e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final float f20748e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f20752e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public int f20754e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final float f20755e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public float f20757e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public boolean f20758e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final float f20759e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final float f20761e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final int f20762e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final float f20763e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f20764e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final float f20765e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public ObjectAnimator f20766e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final Object f20746e = new Object();

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final Paint f20750e = new Paint();

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final Paint f20751e = new Paint();

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public float f20749e = 0.0f;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f20747e = false;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public int f20756e = 1;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public int f20753e = 1;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C9184e f20760e = new C9184e(12, Float.class, "transformation");

    public C10512e(int i, int i2, long j, int i3, int i4, float f, float f2, float f3, float f4) {
        this.f20748e = f4;
        this.f20743e = f4 * 2.0f;
        float f5 = 3.0f * f4;
        this.f20759e = f5;
        this.f20740e = 4.0f * f4;
        this.f20765e = 8.0f * f4;
        this.f20763e = f4 / 2.0f;
        this.f20762e = i2;
        this.f20764e = i3;
        this.f20752e = i4;
        this.f20744e = f;
        this.f20741e = f2;
        this.f20761e = f3;
        this.f20742e = (i3 - f) / 2.0f;
        this.f20755e = (i4 - (f5 * 5.0f)) / 2.0f;
        vip(i);
        ad((int) j);
        this.f20745e = new C14695e(this);
    }

    public C10512e(Context context, int i) {
        Resources resources = context.getResources();
        float f = 1;
        float applyDimension = TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()) * f;
        this.f20748e = applyDimension;
        this.f20743e = TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()) * f;
        float applyDimension2 = TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()) * f;
        this.f20759e = applyDimension2;
        this.f20740e = TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()) * f;
        this.f20765e = TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()) * f;
        this.f20763e = applyDimension / 2.0f;
        this.f20762e = 2;
        this.f20758e = true;
        int applyDimension3 = (int) (TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()) * f);
        this.f20764e = applyDimension3;
        int applyDimension4 = (int) (TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()) * f);
        this.f20752e = applyDimension4;
        float applyDimension5 = TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()) * f;
        this.f20744e = applyDimension5;
        this.f20741e = TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()) * f;
        this.f20761e = TypedValue.applyDimension(1, 2, resources.getDisplayMetrics()) * f;
        this.f20742e = (applyDimension3 - applyDimension5) / 2.0f;
        this.f20755e = (applyDimension4 - (applyDimension2 * 5.0f)) / 2.0f;
        vip(i);
        ad(800);
        this.f20745e = new C14695e(this);
    }

    public final void ad(int i) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, this.f20760e, 0.0f);
        this.f20766e = ofFloat;
        ofFloat.setInterpolator(new DecelerateInterpolator(3.0f));
        this.f20766e.setDuration(i);
        this.f20766e.addListener(new C9380e(6, this));
    }

    public final void appmetrica(int i) {
        synchronized (this.f20746e) {
            try {
                if (this.f20747e) {
                    this.f20766e.cancel();
                    this.f20747e = false;
                }
                if (this.f20756e == i) {
                    return;
                }
                int m2467class = AbstractC8703e.m2467class(i);
                if (m2467class == 0) {
                    this.f20753e = 1;
                    this.f20749e = 0.0f;
                } else if (m2467class == 1) {
                    this.f20753e = 1;
                    this.f20749e = 1.0f;
                } else if (m2467class == 2) {
                    this.f20753e = 2;
                    this.f20749e = 1.0f;
                } else if (m2467class == 3) {
                    this.f20753e = 5;
                    this.f20749e = 1.0f;
                }
                this.f20756e = i;
                invalidateSelf();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0200  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r32) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10512e.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return (int) (this.f20757e * 255.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        this.f20745e.ad = getChangingConfigurations();
        return this.f20745e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f20752e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f20764e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f20747e;
    }

    public final float license(float f) {
        int m2467class = AbstractC8703e.m2467class(this.f20762e);
        float f2 = this.f20759e;
        if (m2467class == 0) {
            int i = this.f20753e;
            return (i == 3 || i == 6) ? f2 - (f * f2) : f * f2;
        }
        if (m2467class != 1) {
            if (m2467class != 2) {
                return 0.0f;
            }
            int i2 = this.f20753e;
            float f3 = this.f20740e;
            return (i2 == 3 || i2 == 6) ? f3 - ((f2 + this.f20748e) * f) : f * f3;
        }
        int i3 = this.f20753e;
        float f4 = this.f20763e;
        if (i3 != 3 && i3 != 6) {
            return (f2 + f4) * f;
        }
        float f5 = f2 + f4;
        return f5 - (f * f5);
    }

    public final boolean metrica() {
        return this.f20749e <= 1.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f20745e = new C14695e(this);
        return this;
    }

    public final void purchase(int i, float f) {
        if (f < 0.0f || f > 2.0f) {
            throw new IllegalArgumentException("Value must be between 0.0 and 2.0");
        }
        this.f20753e = i;
        boolean z = f < 1.0f || f == 2.0f;
        this.f20756e = z ? AbstractC5087e.inmobi(i) : AbstractC5087e.isPro(i);
        this.f20754e = z ? AbstractC5087e.isPro(i) : AbstractC5087e.inmobi(i);
        this.f20749e = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f20757e = i / 255.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f20750e.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        int i;
        if (this.f20747e) {
            return;
        }
        int i2 = this.f20754e;
        if (i2 != 0 && i2 != (i = this.f20756e)) {
            this.f20747e = true;
            boolean z = i == 1;
            boolean z2 = i == 2;
            boolean z3 = i == 3;
            boolean z4 = i == 4;
            boolean z5 = i2 == 1;
            boolean z6 = i2 == 2;
            boolean z7 = i2 == 3;
            boolean z8 = i2 == 4;
            if ((z && z6) || (z2 && z5)) {
                this.f20753e = 1;
            } else {
                if ((z2 && z7) || (z3 && z6)) {
                    this.f20753e = 3;
                } else if ((z && z7) || (z3 && z5)) {
                    this.f20753e = 2;
                } else if ((z2 && z8) || (z4 && z6)) {
                    this.f20753e = 4;
                } else if ((z && z8) || (z4 && z5)) {
                    this.f20753e = 5;
                } else {
                    if ((!z3 || !z8) && (!z4 || !z7)) {
                        throw new IllegalStateException("Animating from " + AbstractC5087e.m1743case(this.f20756e) + " to " + AbstractC5087e.m1743case(this.f20754e) + " is not supported");
                    }
                    this.f20753e = 6;
                    z = z3;
                }
                z = z2;
            }
            this.f20766e.setFloatValues(z ? 0.0f : 1.0f, z ? 1.0f : 2.0f);
            this.f20766e.start();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.f20747e && this.f20766e.isRunning()) {
            this.f20766e.end();
        } else {
            this.f20747e = false;
            invalidateSelf();
        }
    }

    public final void vip(int i) {
        Paint paint = this.f20750e;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f20761e);
        paint.setColor(i);
        Paint paint2 = this.f20751e;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(i);
        paint2.setAlpha(200);
        setBounds(0, 0, this.f20764e, this.f20752e);
    }
}
