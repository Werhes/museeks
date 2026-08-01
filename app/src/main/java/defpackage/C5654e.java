package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.renderscript.Toolkit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٕۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5654e extends AbstractC8981e {
    public final Context ad;
    public final String license;
    public final float metrica;
    public final float vip;

    public C5654e(Context context, float f, float f2) {
        this.ad = context;
        this.vip = f;
        this.metrica = f2;
        double d = f;
        if (0.0d > d || d > 25.0d) {
            throw new IllegalArgumentException("radius must be in [0, 25].");
        }
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("sampling must be > 0.");
        }
        this.license = "blur-" + f + '-' + f2;
    }

    @Override // defpackage.AbstractC8981e
    public final String ad() {
        return this.license;
    }

    @Override // defpackage.AbstractC8981e
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5654e)) {
            return false;
        }
        C5654e c5654e = (C5654e) obj;
        return AbstractC7890e.billing(this.ad, c5654e.ad) && this.vip == c5654e.vip && this.metrica == c5654e.metrica;
    }

    @Override // defpackage.AbstractC8981e
    public final int hashCode() {
        return Float.floatToIntBits(this.metrica) + AbstractC1414e.license(this.ad.hashCode() * 31, this.vip, 31);
    }

    @Override // defpackage.AbstractC8981e
    public final String toString() {
        StringBuilder sb = new StringBuilder("BlurTransformation(context=");
        sb.append(this.ad);
        sb.append(", radius=");
        sb.append(this.vip);
        sb.append(", sampling=");
        return AbstractC17861e.remoteconfig(sb, this.metrica, ')');
    }

    @Override // defpackage.AbstractC8981e
    public final Bitmap vip(Bitmap bitmap, C16320e c16320e) {
        Paint paint = new Paint(3);
        float width = bitmap.getWidth();
        float f = this.metrica;
        int i = (int) (width / f);
        int height = (int) (bitmap.getHeight() / f);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.RGB_565;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, height, config);
        Canvas canvas = new Canvas(createBitmap);
        float f2 = 1 / f;
        canvas.scale(f2, f2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        Toolkit toolkit = Toolkit.ad;
        return Toolkit.ad(createBitmap, (int) this.vip);
    }
}
