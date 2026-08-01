package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12518e extends AbstractC6874e {
    public final /* synthetic */ C2532e appmetrica;
    public final float license;
    public float metrica;
    public final Object purchase;
    public final /* synthetic */ int vip;

    public C12518e(C2532e c2532e, float f, float f2) {
        this.vip = 1;
        this.appmetrica = c2532e;
        this.purchase = new RectF();
        this.metrica = f;
        this.license = f2;
    }

    public C12518e(C2532e c2532e, float f, float f2, Path path) {
        this.vip = 0;
        this.appmetrica = c2532e;
        this.metrica = f;
        this.license = f2;
        this.purchase = path;
    }

    @Override // defpackage.AbstractC6874e
    public final boolean appmetrica(AbstractC2781e abstractC2781e) {
        switch (this.vip) {
            case 0:
                if (!(abstractC2781e instanceof C7896e)) {
                    return true;
                }
                Log.w("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
                return false;
            default:
                if (!(abstractC2781e instanceof C7896e)) {
                    return true;
                }
                C7896e c7896e = (C7896e) abstractC2781e;
                AbstractC14697e loadAd = abstractC2781e.ad.loadAd(c7896e.amazon);
                if (loadAd == null) {
                    C2532e.m873protected("TextPath path reference '%s' not found", c7896e.amazon);
                    return false;
                }
                C8754e c8754e = (C8754e) loadAd;
                C0926e c0926e = new C0926e(c8754e.loadAd);
                Matrix matrix = c8754e.amazon;
                Path path = c0926e.ad;
                if (matrix != null) {
                    path.transform(matrix);
                }
                RectF rectF = new RectF();
                path.computeBounds(rectF, true);
                ((RectF) this.purchase).union(rectF);
                return false;
        }
    }

    @Override // defpackage.AbstractC6874e
    public final void smaato(String str) {
        String str2;
        switch (this.vip) {
            case 0:
                C2532e c2532e = this.appmetrica;
                if (c2532e.m898e()) {
                    Path path = new Path();
                    str2 = str;
                    ((C1506e) c2532e.f6385e).license.getTextPath(str2, 0, str.length(), this.metrica, this.license, path);
                    ((Path) this.purchase).addPath(path);
                } else {
                    str2 = str;
                }
                this.metrica = ((C1506e) c2532e.f6385e).license.measureText(str2) + this.metrica;
                return;
            default:
                C2532e c2532e2 = this.appmetrica;
                if (c2532e2.m898e()) {
                    Rect rect = new Rect();
                    ((C1506e) c2532e2.f6385e).license.getTextBounds(str, 0, str.length(), rect);
                    RectF rectF = new RectF(rect);
                    rectF.offset(this.metrica, this.license);
                    ((RectF) this.purchase).union(rectF);
                }
                this.metrica = ((C1506e) c2532e2.f6385e).license.measureText(str) + this.metrica;
                return;
        }
    }
}
