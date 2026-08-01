package defpackage;

import android.os.Build;
import android.view.KeyEvent;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16243e {
    public static final C2892e ad = new C2892e(858414323, false, new C8898e(0));
    public static final C2892e vip = new C2892e(801267795, false, new C8898e(1));
    public static final C2892e metrica = new C2892e(-305792666, false, new C8898e(2));
    public static final C2892e license = new C2892e(-1062353811, false, new C14123e(27));

    public static float ad(EdgeEffect edgeEffect, float f, float f2, InterfaceC14388e interfaceC14388e) {
        float f3 = AbstractC12659e.ad;
        double vip2 = interfaceC14388e.vip() * 386.0878f * 160.0f * 0.84f;
        double d = AbstractC12659e.ad * vip2;
        float exp = (float) (Math.exp((AbstractC12659e.vip / AbstractC12659e.metrica) * Math.log((Math.abs(f) * 0.35f) / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (exp > (i >= 31 ? AbstractC16048e.amazon(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int appmetrica = AbstractC1561e.appmetrica(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(appmetrica);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(appmetrica);
        }
        return f;
    }

    public static final boolean vip(KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }
}
