package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.car.app.model.Alert;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۧؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4519e {
    public int ad;
    public Object appmetrica;
    public Object billing;
    public boolean license;
    public boolean metrica;
    public Object purchase;
    public int vip;
    public Object yandex;

    public long ad(int i, int i2) {
        int i3;
        C12854e c12854e = (C12854e) this.appmetrica;
        int[] iArr = c12854e.ad;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = c12854e.vip;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (this.metrica) {
            if (i3 < 0) {
                AbstractC15805e.ad("width must be >= 0");
            }
            return AbstractC2278e.yandex(i3, i3, 0, Alert.DURATION_SHOW_INDEFINITELY);
        }
        if (i3 < 0) {
            AbstractC15805e.ad("height must be >= 0");
        }
        return AbstractC2278e.yandex(0, Alert.DURATION_SHOW_INDEFINITELY, i3, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Matrix appmetrica(int r8, android.util.Size r9) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4519e.appmetrica(int, android.util.Size):android.graphics.Matrix");
    }

    public RectF billing(int i, Size size) {
        AbstractC4265e.yandex(null, yandex());
        Matrix appmetrica = appmetrica(i, size);
        RectF rectF = new RectF(0.0f, 0.0f, ((Size) this.appmetrica).getWidth(), ((Size) this.appmetrica).getHeight());
        appmetrica.mapRect(rectF);
        return rectF;
    }

    public Size license() {
        return AbstractC8261e.metrica(this.ad) ? new Size(((Rect) this.purchase).height(), ((Rect) this.purchase).width()) : new Size(((Rect) this.purchase).width(), ((Rect) this.purchase).height());
    }

    public Matrix metrica(Size size, int i, Rect rect) {
        Matrix matrix = null;
        if (!yandex()) {
            return null;
        }
        Matrix matrix2 = new Matrix();
        if (yandex()) {
            matrix = new Matrix((Matrix) this.billing);
            matrix.postConcat(appmetrica(i, size));
        }
        matrix.invert(matrix2);
        Matrix matrix3 = new Matrix();
        matrix3.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix2.postConcat(matrix3);
        return matrix2;
    }

    public Matrix purchase() {
        AbstractC4265e.yandex(null, yandex());
        RectF rectF = new RectF(0.0f, 0.0f, ((Size) this.appmetrica).getWidth(), ((Size) this.appmetrica).getHeight());
        return AbstractC8261e.ad(rectF, rectF, !this.license ? this.ad : -AbstractC3425e.billing(this.vip), false);
    }

    public C8305e vip(int i) {
        C6233e metrica = ((C9840e) this.yandex).metrica(i);
        int i2 = metrica.ad;
        List list = metrica.vip;
        int size = list.size();
        int i3 = (size == 0 || i2 + size == this.ad) ? 0 : this.vip;
        C6564e[] c6564eArr = new C6564e[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = (int) ((C5177e) list.get(i5)).ad;
            C6564e m761e = ((C2081e) this.billing).m761e(i2 + i5, i4, i6, i3, ad(i4, i6));
            i4 += i6;
            Unit unit = Unit.INSTANCE;
            c6564eArr[i5] = m761e;
        }
        return new C8305e(i, c6564eArr, (C12854e) this.purchase, metrica.vip, this.license, i3);
    }

    public boolean yandex() {
        return (((Rect) this.purchase) == null || ((Size) this.appmetrica) == null || !(!this.license || this.vip != -1)) ? false : true;
    }
}
