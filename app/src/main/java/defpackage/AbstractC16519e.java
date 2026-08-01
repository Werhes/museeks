package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.WindowManager;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۜ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16519e {
    public static final C2892e ad = new C2892e(1254593441, false, new C4509e(15));
    public static final C2892e vip = new C2892e(23692802, false, new C4509e(16));
    public static final C2892e metrica = new C2892e(859385323, false, new C4509e(17));
    public static final C2892e license = new C2892e(1893451156, false, new C4509e(18));
    public static final C2892e appmetrica = new C2892e(20237619, false, new C4509e(19));
    public static final C2892e purchase = new C2892e(-1300380272, false, new C4509e(20));

    public static final void ad(InterfaceC18435e interfaceC18435e, Context context, boolean z, Function2 function2) {
        InterfaceC18435e interfaceC18435e2;
        Function2 function22;
        try {
            int i = AbstractC7915e.ad;
            C15420e c15420e = AbstractC6731e.ad;
            interfaceC18435e2 = interfaceC18435e;
            function22 = function2;
        } catch (WindowManager.BadTokenException unused) {
            interfaceC18435e2 = interfaceC18435e;
            function22 = function2;
        }
        try {
            AbstractC5336e.purchase(interfaceC18435e2, AbstractC1497e.ad.f25795e, 0, new C13721e(context, z, interfaceC18435e2, function22, (InterfaceC5083e) null), 2);
        } catch (WindowManager.BadTokenException unused2) {
            AbstractC5336e.purchase(interfaceC18435e2, null, 0, new C7889e(function22, null, 0), 3);
        }
    }

    public static final Paint license(Bitmap bitmap, int i, int i2) {
        Matrix matrix = new Matrix();
        float vip2 = (float) AbstractC2774e.vip(bitmap.getWidth(), bitmap.getHeight(), i, i2, 1, C16320e.metrica);
        float f = 2;
        matrix.setTranslate((i - (bitmap.getWidth() * vip2)) / f, (i2 - (bitmap.getHeight() * vip2)) / f);
        matrix.preScale(vip2, vip2);
        Paint paint = new Paint(3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        return paint;
    }

    public static void vip(AppActivity appActivity, Function2 function2) {
        ad(AbstractC17947e.billing(appActivity), appActivity, false, function2);
    }

    public abstract void appmetrica(C18397e c18397e, float f);

    public abstract float metrica(C18397e c18397e);
}
