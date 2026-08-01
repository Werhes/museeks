package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18448e {
    public static final Matrix Signature = new Matrix();
    public final Path ad;
    public float adcel;
    public int advert;
    public Boolean amazon;
    public Paint appmetrica;
    public final C11875e billing;
    public Paint license;
    public final C2271e loadAd;
    public final Matrix metrica;
    public float mopub;
    public PathMeasure purchase;
    public String smaato;
    public float startapp;
    public final Path vip;
    public float yandex;

    /* JADX WARN: Type inference failed for: r0v4, types: [eٕ٘ؔ, eؓۨۖ] */
    public C18448e() {
        this.metrica = new Matrix();
        this.yandex = 0.0f;
        this.startapp = 0.0f;
        this.adcel = 0.0f;
        this.mopub = 0.0f;
        this.advert = 255;
        this.smaato = null;
        this.amazon = null;
        this.loadAd = new C17519e(0);
        this.billing = new C11875e();
        this.ad = new Path();
        this.vip = new Path();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [eٕ٘ؔ, eؓۨۖ] */
    public C18448e(C18448e c18448e) {
        this.metrica = new Matrix();
        this.yandex = 0.0f;
        this.startapp = 0.0f;
        this.adcel = 0.0f;
        this.mopub = 0.0f;
        this.advert = 255;
        this.smaato = null;
        this.amazon = null;
        ?? c17519e = new C17519e(0);
        this.loadAd = c17519e;
        this.billing = new C11875e(c18448e.billing, c17519e);
        this.ad = new Path(c18448e.ad);
        this.vip = new Path(c18448e.vip);
        this.yandex = c18448e.yandex;
        this.startapp = c18448e.startapp;
        this.adcel = c18448e.adcel;
        this.mopub = c18448e.mopub;
        this.advert = c18448e.advert;
        this.smaato = c18448e.smaato;
        String str = c18448e.smaato;
        if (str != null) {
            c17519e.put(str, this);
        }
        this.amazon = c18448e.amazon;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ad(C11875e c11875e, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        float f2;
        Matrix matrix2 = c11875e.ad;
        ArrayList arrayList = c11875e.vip;
        matrix2.set(matrix);
        Matrix matrix3 = c11875e.ad;
        matrix3.preConcat(c11875e.adcel);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            AbstractC11583e abstractC11583e = (AbstractC11583e) arrayList.get(i5);
            if (abstractC11583e instanceof C11875e) {
                ad((C11875e) abstractC11583e, matrix3, canvas, i, i2);
            } else if (abstractC11583e instanceof AbstractC7279e) {
                AbstractC7279e abstractC7279e = (AbstractC7279e) abstractC11583e;
                float f3 = i / this.adcel;
                float f4 = i2 / this.mopub;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.metrica;
                matrix4.set(matrix3);
                matrix4.postScale(f3, f4);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c], fArr[1]);
                boolean z = c;
                i3 = i5;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f5) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.ad;
                    path.reset();
                    C13773e[] c13773eArr = abstractC7279e.ad;
                    if (c13773eArr != null) {
                        AbstractC18491e.adcel(c13773eArr, path);
                    }
                    Path path2 = this.vip;
                    path2.reset();
                    if (abstractC7279e instanceof C6822e) {
                        path2.setFillType(abstractC7279e.metrica == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        C17334e c17334e = (C17334e) abstractC7279e;
                        float f6 = c17334e.startapp;
                        if (f6 != 0.0f || c17334e.adcel != 1.0f) {
                            float f7 = c17334e.mopub;
                            float f8 = (f6 + f7) % 1.0f;
                            float f9 = (c17334e.adcel + f7) % 1.0f;
                            if (this.purchase == null) {
                                this.purchase = new PathMeasure();
                            }
                            this.purchase.setPath(path, z);
                            float length = this.purchase.getLength();
                            float f10 = f8 * length;
                            float f11 = f9 * length;
                            path.reset();
                            if (f10 > f11) {
                                this.purchase.getSegment(f10, length, path, true);
                                f = 0.0f;
                                this.purchase.getSegment(0.0f, f11, path, true);
                            } else {
                                f = 0.0f;
                                this.purchase.getSegment(f10, f11, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        Csuper csuper = c17334e.purchase;
                        if (((Shader) csuper.f36469e) == null && csuper.f36470e == 0) {
                            f2 = 255.0f;
                            i4 = 16777215;
                        } else {
                            if (this.appmetrica == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.appmetrica = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.appmetrica;
                            Shader shader = (Shader) csuper.f36469e;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c17334e.yandex * 255.0f));
                                f2 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = csuper.f36470e;
                                float f12 = c17334e.yandex;
                                PorterDuff.Mode mode = C2955e.f6979e;
                                f2 = 255.0f;
                                paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c17334e.metrica == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        Csuper csuper2 = c17334e.license;
                        if (((Shader) csuper2.f36469e) != null || csuper2.f36470e != 0) {
                            if (this.license == null) {
                                Paint paint3 = new Paint(1);
                                this.license = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.license;
                            Paint.Join join = c17334e.smaato;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c17334e.advert;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c17334e.amazon);
                            Shader shader2 = (Shader) csuper2.f36469e;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c17334e.billing * f2));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = csuper2.f36470e;
                                float f13 = c17334e.billing;
                                PorterDuff.Mode mode2 = C2955e.f6979e;
                                paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c17334e.appmetrica * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.advert;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.advert = i;
    }
}
