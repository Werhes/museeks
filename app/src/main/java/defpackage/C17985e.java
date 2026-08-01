package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۙۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17985e {
    public final Path ad;
    public Matrix license;
    public float[] metrica;
    public RectF vip;

    public C17985e(Path path) {
        this.ad = path;
    }

    public final void ad(C17985e c17985e, long j) {
        if (!(c17985e instanceof C17985e)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.ad.addPath(c17985e.ad, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final void adcel(int i) {
        this.ad.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public final void advert(long j) {
        Matrix matrix = this.license;
        if (matrix == null) {
            this.license = new Matrix();
        } else {
            matrix.reset();
        }
        this.license.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        this.ad.transform(this.license);
    }

    public final void appmetrica(float f, float f2) {
        this.ad.lineTo(f, f2);
    }

    public final boolean billing(C17985e c17985e, C17985e c17985e2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(c17985e instanceof C17985e)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = c17985e.ad;
        if (c17985e2 instanceof C17985e) {
            return this.ad.op(path, c17985e2.ad, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final C0763e license() {
        if (this.vip == null) {
            this.vip = new RectF();
        }
        RectF rectF = this.vip;
        this.ad.computeBounds(rectF, true);
        return new C0763e(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void metrica(float f, float f2, float f3, float f4, float f5, float f6) {
        this.ad.cubicTo(f, f2, f3, f4, f5, f6);
    }

    public final void mopub(float[] fArr) {
        if (this.license == null) {
            this.license = new Matrix();
        }
        C14155e.metrica(this.license, fArr);
        this.ad.transform(this.license);
    }

    public final void purchase(float f, float f2) {
        this.ad.moveTo(f, f2);
    }

    public final void startapp() {
        this.ad.rewind();
    }

    public final void vip() {
        this.ad.close();
    }

    public final void yandex() {
        this.ad.reset();
    }
}
