package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4668e extends AbstractC8981e {
    public final String ad = String.valueOf(AbstractC3820e.ad.vip(C4668e.class).license());

    @Override // defpackage.AbstractC8981e
    public final String ad() {
        return this.ad;
    }

    @Override // defpackage.AbstractC8981e
    public final Bitmap vip(Bitmap bitmap, C16320e c16320e) {
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, min, config);
        Canvas canvas = new Canvas(createBitmap);
        Paint license = AbstractC16519e.license(bitmap, min, min);
        float f = min / 2.0f;
        canvas.drawCircle(f, f, f, license);
        return createBitmap;
    }
}
