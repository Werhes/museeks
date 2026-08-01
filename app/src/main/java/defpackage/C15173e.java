package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15173e implements InterfaceC0867e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object license;
    public final /* synthetic */ Object metrica;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C15173e(int i, Object obj, Object obj2, Object obj3) {
        this.ad = i;
        this.vip = obj;
        this.metrica = obj2;
        this.license = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [eؚۗ٘, androidx.appcompat.widget.AppCompatImageView, android.view.View, java.lang.Object] */
    @Override // defpackage.InterfaceC0867e
    public final void accept(Object obj) {
        switch (this.ad) {
            case 0:
                C12799e c12799e = (C12799e) this.vip;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.metrica;
                Surface surface = (Surface) this.license;
                c12799e.getClass();
                surfaceTexture.setOnFrameAvailableListener(null);
                surfaceTexture.release();
                surface.release();
                c12799e.f25601e--;
                c12799e.metrica();
                return;
            default:
                Activity activity = (Activity) this.vip;
                View view = (View) this.metrica;
                float[] fArr = (float[]) this.license;
                Bitmap bitmap = (Bitmap) obj;
                ?? appCompatImageView = new AppCompatImageView(activity, null);
                appCompatImageView.f15140e = new Path();
                ViewGroup viewGroup = (ViewGroup) view;
                if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                    appCompatImageView.setImageBitmap(bitmap);
                    viewGroup.addView(appCompatImageView);
                }
                AbstractC10532e.vip(view);
                if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
                    return;
                }
                AbstractC15933e.vip.ad(appCompatImageView, fArr, new RunnableC2623e(viewGroup, appCompatImageView, 28));
                return;
        }
    }
}
