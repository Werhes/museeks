package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0348e extends Drawable {
    public C0609e ad;
    public final C1244e appmetrica;
    public final C1244e license;
    public final Paint metrica;
    public int purchase;
    public final Rect vip = new Rect();

    public C0348e(Activity activity) {
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setColor(-16777216);
        this.metrica = paint;
        C1244e c1244e = new C1244e(activity);
        C10629e c10629e = AbstractC10206e.ad;
        c1244e.purchase.appmetrica(Integer.valueOf(c10629e.f20951e));
        this.license = c1244e;
        C1244e c1244e2 = new C1244e(activity);
        c1244e2.purchase.appmetrica(Integer.valueOf(c10629e.f20950e));
        this.appmetrica = c1244e2;
        this.purchase = 255;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = this.vip;
        if (rect.isEmpty()) {
            return;
        }
        canvas.drawRect(rect, this.metrica);
        this.appmetrica.vip(canvas);
        this.license.vip(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.purchase;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        if (rect != null) {
            Rect rect2 = this.vip;
            rect2.set(rect);
            C0609e c0609e = this.ad;
            if (c0609e != null) {
                c0609e.invoke(rect2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.purchase = i;
        this.license.mopub.appmetrica(Integer.valueOf(i));
        this.appmetrica.mopub.appmetrica(Integer.valueOf(i));
        this.metrica.setAlpha(this.purchase);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.license.smaato.appmetrica(colorFilter);
        this.appmetrica.smaato.appmetrica(colorFilter);
        this.metrica.setColorFilter(colorFilter);
    }
}
