package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eً۠ۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8261e {
    public static final RectF ad = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Matrix ad(RectF rectF, RectF rectF2, int i, boolean z) {
        Matrix matrix = new Matrix();
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        RectF rectF3 = ad;
        matrix.setRectToRect(rectF, rectF3, scaleToFit);
        matrix.postRotate(i);
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static int adcel(int i) {
        return ((i % 360) + 360) % 360;
    }

    public static boolean appmetrica(Matrix matrix) {
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = (f2 * f4) + (f * f3);
        float f6 = (f * f4) - (f2 * f3);
        double sqrt = Math.sqrt((f2 * f2) + (f * f)) * Math.sqrt((f4 * f4) + (f3 * f3));
        return ((float) Math.toDegrees(Math.atan2(((double) f6) / sqrt, ((double) f5) / sqrt))) > 0.0f;
    }

    public static String billing(Rect rect) {
        Locale locale = Locale.US;
        return rect + "(" + rect.width() + "x" + rect.height() + ")";
    }

    public static boolean license(Size size, boolean z, Size size2) {
        float width;
        float width2;
        if (z) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        return width >= (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f) && (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f) >= width2;
    }

    public static boolean metrica(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC1786e.admob(i, "Invalid rotation degrees: "));
    }

    public static Size purchase(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static RectF startapp(Size size) {
        float f = 0;
        return new RectF(f, f, size.getWidth(), size.getHeight());
    }

    public static int vip(Matrix matrix) {
        matrix.getValues(new float[9]);
        return adcel((int) Math.round(Math.atan2(r0[3], r0[0]) * 57.29577951308232d));
    }

    public static Size yandex(int i, Size size) {
        AbstractC4265e.license(i % 90 == 0, "Invalid rotation degrees: " + i);
        return metrica(adcel(i)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }
}
