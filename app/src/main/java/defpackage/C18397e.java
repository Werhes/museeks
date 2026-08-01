package defpackage;

import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e۟۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18397e extends AbstractC5682e {

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final C11821e f36061e = new Object();

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C2326e f36062e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C12400e f36063e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final C18051e f36064e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C11638e f36065e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public boolean f36066e;

    /* JADX WARN: Type inference failed for: r1v2, types: [eٍِۘ, java.lang.Object] */
    public C18397e(Context context, C12780e c12780e, C12400e c12400e) {
        super(context, c12780e);
        this.f36066e = false;
        this.f36063e = c12400e;
        this.f36065e = new Object();
        C2326e c2326e = new C2326e();
        this.f36062e = c2326e;
        c2326e.ad(1.0f);
        c2326e.vip(50.0f);
        C18051e c18051e = new C18051e(this);
        this.f36064e = c18051e;
        c18051e.smaato = c2326e;
        if (this.f12065e != 1.0f) {
            this.f12065e = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            Rect bounds = getBounds();
            float vip = vip();
            ObjectAnimator objectAnimator = this.f12066e;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.f12061e;
            this.f36063e.ad(canvas, bounds, vip, z, objectAnimator2 != null && objectAnimator2.isRunning());
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.f12067e;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            C12780e c12780e = this.f12064e;
            int i = c12780e.metrica[0];
            C11638e c11638e = this.f36065e;
            c11638e.metrica = i;
            int i2 = c12780e.billing;
            if (i2 > 0) {
                int adcel = (int) ((AbstractC13482e.adcel(c11638e.vip, 0.0f, 0.01f) * i2) / 0.01f);
                float f = c11638e.vip;
                int i3 = c12780e.license;
                int i4 = this.f12063e;
                C12400e c12400e = this.f36063e;
                c12400e.getClass();
                c12400e.vip(canvas, paint, f, 1.0f, AbstractC9546e.billing(i3, i4), adcel, adcel);
            } else {
                int i5 = c12780e.license;
                int i6 = this.f12063e;
                C12400e c12400e2 = this.f36063e;
                c12400e2.getClass();
                c12400e2.vip(canvas, paint, 0.0f, 1.0f, AbstractC9546e.billing(i5, i6), 0, 0);
            }
            int i7 = this.f12063e;
            C12400e c12400e3 = this.f36063e;
            c12400e3.getClass();
            c12400e3.vip(canvas, paint, c11638e.ad, c11638e.vip, AbstractC9546e.billing(c11638e.metrica, i7), 0, 0);
            int i8 = c12780e.metrica[0];
            this.f36063e.getClass();
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f36063e.license();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f36063e.license();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f36064e.metrica();
        this.f36065e.vip = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // defpackage.AbstractC5682e
    public final boolean license(boolean z, boolean z2, boolean z3) {
        boolean license = super.license(z, z2, z3);
        C14085e c14085e = this.f12062e;
        ContentResolver contentResolver = this.f12068e.getContentResolver();
        c14085e.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.f36066e = true;
            return license;
        }
        this.f36066e = false;
        this.f36062e.vip(50.0f / f);
        return license;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z = this.f36066e;
        C11638e c11638e = this.f36065e;
        C18051e c18051e = this.f36064e;
        if (z) {
            c18051e.metrica();
            c11638e.vip = i / 10000.0f;
            invalidateSelf();
        } else {
            c18051e.vip = c11638e.vip * 10000.0f;
            c18051e.metrica = true;
            float f = i;
            if (c18051e.purchase) {
                c18051e.amazon = f;
            } else {
                if (c18051e.smaato == null) {
                    c18051e.smaato = new C2326e(f);
                }
                c18051e.smaato.startapp = f;
                c18051e.license();
            }
        }
        return true;
    }
}
