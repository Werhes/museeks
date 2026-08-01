package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؑۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11447e {
    public final Paint ad;
    public C1667e appmetrica;
    public C2815e license;
    public Shader metrica;
    public int vip = 3;

    public C11447e(Paint paint) {
        this.ad = paint;
    }

    public final int ad() {
        Paint.Cap strokeCap = this.ad.getStrokeCap();
        int i = strokeCap == null ? -1 : AbstractC15196e.ad[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final void adcel(int i) {
        this.ad.setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public final void advert(float f) {
        this.ad.setStrokeWidth(f);
    }

    public final void appmetrica(long j) {
        this.ad.setColor(AbstractC6532e.m2193extends(j));
    }

    public final void billing(int i) {
        this.ad.setFilterBitmap(!(i == 0));
    }

    public final void license(int i) {
        if (this.vip == i) {
            return;
        }
        this.vip = i;
        int i2 = Build.VERSION.SDK_INT;
        Paint paint = this.ad;
        if (i2 >= 29) {
            AbstractC7464e.ad(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AbstractC14204e.m3769catch(i)));
        }
    }

    public final void metrica(float f) {
        this.ad.setAlpha((int) Math.rint(f * 255.0f));
    }

    public final void mopub(int i) {
        this.ad.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public final void purchase(C2815e c2815e) {
        this.license = c2815e;
        this.ad.setColorFilter(c2815e != null ? c2815e.ad : null);
    }

    public final void smaato(int i) {
        this.ad.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public final void startapp(Shader shader) {
        this.metrica = shader;
        this.ad.setShader(shader);
    }

    public final int vip() {
        Paint.Join strokeJoin = this.ad.getStrokeJoin();
        int i = strokeJoin == null ? -1 : AbstractC15196e.vip[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public final void yandex(C1667e c1667e) {
        this.ad.setPathEffect(c1667e != null ? c1667e.ad : null);
        this.appmetrica = c1667e;
    }
}
