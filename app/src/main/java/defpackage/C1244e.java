package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1244e {
    public final C12177e ad;
    public final C9048e adcel;
    public final C18540e advert;
    public final Activity amazon;
    public final C0783e appmetrica;
    public final C9048e billing;
    public final C13935e license;
    public final C17989e metrica;
    public final C9048e mopub;
    public final C17958e purchase;
    public final C9048e smaato;
    public final C17958e startapp;
    public final C0783e vip;
    public final C9048e yandex;

    public C1244e(Activity activity) {
        int i = 1;
        this.ad = new C12177e(i, this);
        this.amazon = activity;
        int i2 = 0;
        this.vip = new C0783e(this, i2);
        C0075e c0075e = new C0075e(this, i2);
        this.metrica = new C17989e(new Matrix(), this);
        C0075e c0075e2 = new C0075e(this, i);
        this.license = new C13935e(4);
        this.appmetrica = new C0783e(this, i);
        this.purchase = new C17958e(this, 1);
        this.billing = new C9048e(c0075e2, (byte) 0);
        this.yandex = new C9048e(c0075e2, (byte) 0);
        this.startapp = new C17958e(this, 0);
        this.adcel = new C9048e(c0075e);
        this.mopub = new C9048e(c0075e);
        C18540e c18540e = new C18540e(this);
        this.advert = c18540e;
        Paint paint = (Paint) c18540e.f36382e;
        for (AbstractC4857e abstractC4857e : (AbstractC4857e[]) c18540e.f36383e) {
            abstractC4857e.ad(paint);
        }
        this.smaato = new C9048e(new Paint[]{paint});
    }

    public final C14703e ad() {
        return (C14703e) this.ad.yandex();
    }

    public final void appmetrica(float f) {
        this.yandex.appmetrica(Float.valueOf(f));
    }

    public final void license(float f) {
        this.billing.appmetrica(Float.valueOf(f));
    }

    public final float metrica() {
        return ((Float) this.startapp.ad).floatValue();
    }

    public final String toString() {
        return "CircleRenderingState(color=" + ((Integer) this.purchase.ad).intValue() + ", x=" + ((Float) this.billing.ad).floatValue() + ", y=" + ((Float) this.yandex.ad).floatValue() + ", radius=" + metrica() + ", alpha=" + ((Integer) this.adcel.ad).intValue() + ", globalAlpha=" + ((Integer) this.mopub.ad).intValue() + ')';
    }

    public final void vip(Canvas canvas) {
        int save = canvas.save();
        try {
            canvas.translate(((Float) this.billing.ad).floatValue() - metrica(), ((Float) this.yandex.ad).floatValue() - metrica());
            C14703e ad = ad();
            C18540e c18540e = this.advert;
            Paint paint = (Paint) c18540e.f36382e;
            for (AbstractC4857e abstractC4857e : (AbstractC4857e[]) c18540e.f36383e) {
                abstractC4857e.ad(paint);
            }
            ad.setAlpha(paint.getAlpha());
            ad().draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
