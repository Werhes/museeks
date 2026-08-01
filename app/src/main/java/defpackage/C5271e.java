package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۥٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5271e extends AbstractC8981e {
    public final float ad;
    public final String appmetrica;
    public final float license;
    public final float metrica;
    public final float vip;

    public C5271e(float f) {
        this.ad = f;
        this.vip = f;
        this.metrica = f;
        this.license = f;
        if (f < 0.0f || f < 0.0f || f < 0.0f || f < 0.0f) {
            throw new IllegalArgumentException("All radii must be >= 0.");
        }
        this.appmetrica = AbstractC3820e.ad.vip(C5271e.class).license() + "-" + f + "," + f + "," + f + "," + f;
    }

    @Override // defpackage.AbstractC8981e
    public final String ad() {
        return this.appmetrica;
    }

    @Override // defpackage.AbstractC8981e
    public final Bitmap vip(Bitmap bitmap, C16320e c16320e) {
        long vip;
        C16320e c16320e2 = C16320e.metrica;
        if (AbstractC7890e.billing(c16320e, c16320e2)) {
            vip = AbstractC12662e.vip(bitmap.getWidth(), bitmap.getHeight());
        } else {
            InterfaceC10650e interfaceC10650e = c16320e.ad;
            InterfaceC10650e interfaceC10650e2 = c16320e.vip;
            if ((interfaceC10650e instanceof C3645e) && (interfaceC10650e2 instanceof C3645e)) {
                vip = AbstractC12662e.vip(((C3645e) interfaceC10650e).ad, ((C3645e) interfaceC10650e2).ad);
            } else {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                InterfaceC10650e interfaceC10650e3 = c16320e.ad;
                boolean z = interfaceC10650e3 instanceof C3645e;
                int i = RecyclerView.UNDEFINED_DURATION;
                int i2 = z ? ((C3645e) interfaceC10650e3).ad : Integer.MIN_VALUE;
                if (interfaceC10650e2 instanceof C3645e) {
                    i = ((C3645e) interfaceC10650e2).ad;
                }
                double vip2 = AbstractC2774e.vip(width, height, i2, i, 1, c16320e2);
                vip = AbstractC12662e.vip(AbstractC1561e.license(bitmap.getWidth() * vip2), AbstractC1561e.license(vip2 * bitmap.getHeight()));
            }
        }
        int i3 = (int) (vip >> 32);
        int i4 = (int) (vip & 4294967295L);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, config);
        Canvas canvas = new Canvas(createBitmap);
        Paint license = AbstractC16519e.license(bitmap, i3, i4);
        float f = this.ad;
        float f2 = this.vip;
        float f3 = this.license;
        float f4 = this.metrica;
        if (f == f2 && f2 == f4 && f4 == f3) {
            canvas.drawRoundRect(0.0f, 0.0f, i3, i4, f, f, license);
            return createBitmap;
        }
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        RectF rectF = new RectF(0.0f, 0.0f, i3, i4);
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, license);
        return createBitmap;
    }
}
