package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٜٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14545e {
    public C12780e ad;

    public final void ad(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        this.ad.ad();
        C12400e c12400e = (C12400e) this;
        float width = rect.width() / c12400e.license();
        float height = rect.height() / c12400e.license();
        C12780e c12780e = c12400e.ad;
        float f2 = (c12780e.yandex / 2.0f) + c12780e.startapp;
        canvas.translate((f2 * width) + rect.left, (f2 * height) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(width, height);
        if (c12780e.adcel != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        int i = c12780e.ad;
        c12400e.appmetrica = i / 2 <= c12780e.vip;
        c12400e.vip = i * f;
        c12400e.metrica = Math.min(r11, r2) * f;
        int i2 = c12780e.yandex;
        int i3 = c12780e.ad;
        float f4 = (i2 - i3) / 2.0f;
        c12400e.license = f4;
        if (z || z2) {
            if ((z && c12780e.appmetrica == 2) || (z2 && c12780e.purchase == 1)) {
                c12400e.license = (((1.0f - f) * i3) / 2.0f) + f4;
            } else if ((z && c12780e.appmetrica == 1) || (z2 && c12780e.purchase == 2)) {
                c12400e.license = f4 - (((1.0f - f) * i3) / 2.0f);
            }
        }
        if (z2 && c12780e.purchase == 3) {
            c12400e.purchase = f;
        } else {
            c12400e.purchase = 1.0f;
        }
    }
}
