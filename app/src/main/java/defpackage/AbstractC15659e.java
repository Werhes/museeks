package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.widget.ImageView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۖۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15659e {
    public static final C12916e ad;
    public static final C12916e appmetrica;
    public static final C12916e billing;
    public static final C12916e license;
    public static final C12916e metrica;
    public static final C12916e purchase;
    public static final C12916e vip;

    static {
        int i = 12;
        ad = new C12916e(i, InterfaceC5562e.ad);
        vip = new C12916e(i, AbstractC13427e.vip);
        Object obj = null;
        metrica = new C12916e(12, obj);
        Boolean bool = Boolean.TRUE;
        int i2 = 12;
        license = new C12916e(i2, bool);
        appmetrica = new C12916e(i2, obj);
        int i3 = 12;
        purchase = new C12916e(i3, bool);
        billing = new C12916e(i3, Boolean.FALSE);
    }

    public static final void ad(C5944e c5944e, boolean z) {
        c5944e.vip().ad(purchase, Boolean.valueOf(z));
    }

    public static final void license(C5944e c5944e, ImageView imageView) {
        c5944e.license = new C17702e(imageView);
    }

    public static final ColorSpace metrica(C6302e c6302e) {
        return C11180e.billing(AbstractC8306e.license(c6302e, metrica));
    }

    public static final Bitmap.Config vip(C6302e c6302e) {
        return (Bitmap.Config) AbstractC8306e.license(c6302e, vip);
    }
}
