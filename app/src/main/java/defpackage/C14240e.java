package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۛۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14240e implements InterfaceC9349e, InterfaceC17847e, InterfaceC17533e, InterfaceC1106e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f28127e;

    public /* synthetic */ C14240e(Object obj) {
        this.f28127e = obj;
    }

    @Override // defpackage.InterfaceC17847e
    public void accept(Object obj, Object obj2) {
        ((InterfaceC15316e) this.f28127e).ad((C7971e) obj);
        ((C8988e) obj2).vip(null);
    }

    @Override // defpackage.InterfaceC1106e
    public void ad(Bitmap bitmap) {
        C18482e c18482e = C6639e.tapsense;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f = width;
            int i = (int) (((9.0f * f) / 16.0f) + 0.5f);
            float f2 = (i - r3) / 2.0f;
            RectF rectF = new RectF(0.0f, f2, f, bitmap.getHeight() + f2);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, i, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((C6639e) this.f28127e).metrica(bitmap2, 0);
    }

    @Override // defpackage.InterfaceC17533e, defpackage.InterfaceC5000e
    public /* synthetic */ void appmetrica(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((C6936e) this.f28127e).license(i, th, bArr);
    }

    @Override // defpackage.InterfaceC9349e
    public C0537e metrica(Class cls) {
        for (int i = 0; i < 2; i++) {
            InterfaceC9349e interfaceC9349e = ((InterfaceC9349e[]) this.f28127e)[i];
            if (interfaceC9349e.vip(cls)) {
                return interfaceC9349e.metrica(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // defpackage.InterfaceC9349e
    public boolean vip(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((InterfaceC9349e[]) this.f28127e)[i].vip(cls)) {
                return true;
            }
        }
        return false;
    }
}
