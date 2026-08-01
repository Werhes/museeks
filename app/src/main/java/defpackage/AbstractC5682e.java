package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٗٙ */
/* loaded from: classes3.dex */
public abstract class AbstractC5682e extends Drawable implements Animatable {

    /* renamed from: eٍۗۛ */
    public static final C9184e f12060e = new C9184e(7, Float.class, "growFraction");

    /* renamed from: eّؑؑ */
    public ObjectAnimator f12061e;

    /* renamed from: eؙؔٞ */
    public int f12063e;

    /* renamed from: eؘٙؓ */
    public final C12780e f12064e;

    /* renamed from: eٌٍٚ */
    public float f12065e;

    /* renamed from: eؙِٖ */
    public ObjectAnimator f12066e;

    /* renamed from: eّٖۦ */
    public final Context f12068e;

    /* renamed from: eؘَٗ */
    public boolean f12069e;

    /* renamed from: eٗۚۖ */
    public ArrayList f12070e;

    /* renamed from: eّٕۜ */
    public final Paint f12067e = new Paint();

    /* renamed from: eًؔؐ */
    public C14085e f12062e = new Object();

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, eٓٚۥ] */
    public AbstractC5682e(Context context, C12780e c12780e) {
        this.f12068e = context;
        this.f12064e = c12780e;
        setAlpha(255);
    }

    public final void appmetrica(C1681e c1681e) {
        ArrayList arrayList = this.f12070e;
        if (arrayList == null || !arrayList.contains(c1681e)) {
            return;
        }
        this.f12070e.remove(c1681e);
        if (this.f12070e.isEmpty()) {
            this.f12070e = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f12063e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.f12066e;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.f12061e;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    public boolean license(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.f12066e;
        C9184e c9184e = f12060e;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, c9184e, 0.0f, 1.0f);
            this.f12066e = ofFloat;
            ofFloat.setDuration(500L);
            this.f12066e.setInterpolator(AbstractC16664e.vip);
            ObjectAnimator objectAnimator2 = this.f12066e;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f12066e = objectAnimator2;
            objectAnimator2.addListener(new C8737e(this, 0));
        }
        if (this.f12061e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, c9184e, 1.0f, 0.0f);
            this.f12061e = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f12061e.setInterpolator(AbstractC16664e.vip);
            ObjectAnimator objectAnimator3 = this.f12061e;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f12061e = objectAnimator3;
            objectAnimator3.addListener(new C8737e(this, 1));
        }
        if (isVisible() || z) {
            ObjectAnimator objectAnimator4 = z ? this.f12066e : this.f12061e;
            ObjectAnimator objectAnimator5 = z ? this.f12061e : this.f12066e;
            if (!z3) {
                if (objectAnimator5.isRunning()) {
                    boolean z4 = this.f12069e;
                    this.f12069e = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.f12069e = z4;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z5 = this.f12069e;
                    this.f12069e = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f12069e = z5;
                }
                return super.setVisible(z, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z6 = !z || super.setVisible(z, false);
                C12780e c12780e = this.f12064e;
                if (!z ? c12780e.purchase != 0 : c12780e.appmetrica != 0) {
                    boolean z7 = this.f12069e;
                    this.f12069e = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f12069e = z7;
                    return z6;
                }
                if (z2 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z6;
                }
                objectAnimator4.resume();
                return z6;
            }
        }
        return false;
    }

    public final boolean metrica(boolean z, boolean z2, boolean z3) {
        C14085e c14085e = this.f12062e;
        ContentResolver contentResolver = this.f12068e.getContentResolver();
        c14085e.getClass();
        return license(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f12063e = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f12067e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return metrica(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        license(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        license(false, true, false);
    }

    public final float vip() {
        C12780e c12780e = this.f12064e;
        if (c12780e.appmetrica == 0 && c12780e.purchase == 0) {
            return 1.0f;
        }
        return this.f12065e;
    }
}
