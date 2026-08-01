package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Rational;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؚٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13830e {
    public Rational ad;

    /* JADX WARN: Type inference failed for: r5v3, types: [eٔۦٙ, java.lang.Object] */
    public final C15099e ad(float f, float f2, float f3) {
        PointF pointF;
        C2884e c2884e = (C2884e) this;
        float[] fArr = {f, f2};
        synchronized (c2884e) {
            try {
                Matrix matrix = c2884e.license;
                if (matrix == null) {
                    pointF = C2884e.appmetrica;
                } else {
                    matrix.mapPoints(fArr);
                    pointF = new PointF(fArr[0], fArr[1]);
                }
            } finally {
            }
        }
        float f4 = pointF.x;
        float f5 = pointF.y;
        Rational rational = this.ad;
        ?? obj = new Object();
        obj.ad = f4;
        obj.vip = f5;
        obj.metrica = f3;
        obj.license = rational;
        return obj;
    }
}
