package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14160e extends AbstractC5682e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public C14913e f28003e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public C12400e f28004e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public C2955e f28005e;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        C2955e c2955e;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            C14085e c14085e = this.f12062e;
            int i2 = 0;
            C12780e c12780e = this.f12064e;
            if (c14085e != null && Settings.Global.getFloat(this.f12068e.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (c2955e = this.f28005e) != null) {
                c2955e.setBounds(getBounds());
                this.f28005e.setTint(c12780e.metrica[0]);
                this.f28005e.draw(canvas);
                return;
            }
            canvas.save();
            C12400e c12400e = this.f28004e;
            Rect bounds = getBounds();
            float vip = vip();
            ObjectAnimator objectAnimator = this.f12066e;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.f12061e;
            c12400e.ad(canvas, bounds, vip, z, objectAnimator2 != null && objectAnimator2.isRunning());
            int i3 = c12780e.billing;
            int i4 = this.f12063e;
            Paint paint = this.f12067e;
            if (i3 == 0) {
                C12400e c12400e2 = this.f28004e;
                int i5 = c12780e.license;
                c12400e2.getClass();
                c12400e2.vip(canvas, paint, 0.0f, 1.0f, AbstractC9546e.billing(i5, i4), 0, 0);
            } else {
                C11638e c11638e = (C11638e) ((ArrayList) this.f28003e.f22046e).get(0);
                C11638e c11638e2 = (C11638e) AbstractC17861e.mopub(1, (ArrayList) this.f28003e.f22046e);
                C12400e c12400e3 = this.f28004e;
                float f = c11638e2.vip;
                float f2 = c11638e.ad + 1.0f;
                int i6 = c12780e.license;
                c12400e3.getClass();
                c12400e3.vip(canvas, paint, f, f2, AbstractC9546e.billing(i6, 0), i3, i3);
                i4 = 0;
            }
            while (i2 < ((ArrayList) this.f28003e.f22046e).size()) {
                C11638e c11638e3 = (C11638e) ((ArrayList) this.f28003e.f22046e).get(i2);
                C12400e c12400e4 = this.f28004e;
                int i7 = this.f12063e;
                c12400e4.getClass();
                c12400e4.vip(canvas, paint, c11638e3.ad, c11638e3.vip, AbstractC9546e.billing(c11638e3.metrica, i7), 0, 0);
                if (i2 <= 0 || i3 <= 0) {
                    i = i3;
                } else {
                    C11638e c11638e4 = (C11638e) ((ArrayList) this.f28003e.f22046e).get(i2 - 1);
                    C12400e c12400e5 = this.f28004e;
                    float f3 = c11638e4.vip;
                    float f4 = c11638e3.ad;
                    int i8 = c12780e.license;
                    c12400e5.getClass();
                    i = i3;
                    c12400e5.vip(canvas, paint, f3, f4, AbstractC9546e.billing(i8, i4), i, i3);
                }
                i2++;
                i3 = i;
            }
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f28004e.license();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f28004e.license();
    }

    @Override // defpackage.AbstractC5682e
    public final boolean license(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator;
        C2955e c2955e;
        boolean license = super.license(z, z2, z3);
        if (this.f12062e != null && Settings.Global.getFloat(this.f12068e.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (c2955e = this.f28005e) != null) {
            return c2955e.setVisible(z, z2);
        }
        if (!isRunning() && (objectAnimator = this.f28003e.f29562e) != null) {
            objectAnimator.cancel();
        }
        if (z && z3) {
            this.f28003e.m3888e();
        }
        return license;
    }
}
