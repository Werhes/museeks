package defpackage;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٔۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4896e {
    public final InterfaceC5276e ad;
    public final Rect vip;

    public C4896e(InterfaceC5276e interfaceC5276e, Matrix matrix) {
        this.ad = interfaceC5276e;
        Rect ad = interfaceC5276e.ad();
        if (ad != null && matrix != null) {
            RectF rectF = new RectF(ad);
            matrix.mapRect(rectF);
            ad.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        this.vip = ad;
        Point[] appmetrica = interfaceC5276e.appmetrica();
        if (appmetrica == null || matrix == null) {
            return;
        }
        int length = appmetrica.length;
        float[] fArr = new float[length + length];
        for (int i = 0; i < appmetrica.length; i++) {
            Point point = appmetrica[i];
            int i2 = i + i;
            fArr[i2] = point.x;
            fArr[i2 + 1] = point.y;
        }
        matrix.mapPoints(fArr);
        for (int i3 = 0; i3 < appmetrica.length; i3++) {
            int i4 = i3 + i3;
            appmetrica[i3].set((int) fArr[i4], (int) fArr[i4 + 1]);
        }
    }
}
