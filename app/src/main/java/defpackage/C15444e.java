package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٓؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15444e {
    public volatile Bitmap ad;
    public final int appmetrica;
    public final Matrix billing;
    public final int license;
    public final int metrica;
    public final int purchase;
    public volatile C2383e vip;

    public C15444e(Bitmap bitmap) {
        AbstractC9528e.startapp(bitmap);
        this.ad = bitmap;
        this.metrica = bitmap.getWidth();
        this.license = bitmap.getHeight();
        vip(0);
        this.appmetrica = 0;
        this.purchase = -1;
        this.billing = null;
    }

    public C15444e(Image image, int i, int i2, int i3, Matrix matrix) {
        this.vip = new C2383e(image);
        this.metrica = i;
        this.license = i2;
        vip(i3);
        this.appmetrica = i3;
        this.purchase = 35;
        this.billing = matrix;
    }

    public static void vip(int i) {
        boolean z = true;
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            z = false;
        }
        AbstractC9528e.metrica(z, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
    }

    public final Image.Plane[] ad() {
        if (this.vip == null) {
            return null;
        }
        return ((Image) this.vip.f6092e).getPlanes();
    }
}
