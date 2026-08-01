package defpackage;

import android.os.Build;
import android.view.KeyEvent;
import android.widget.EdgeEffect;
import java.util.Enumeration;
import java.util.Hashtable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٝؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2728e implements InterfaceC4665e {
    public static final C2892e ad = new C2892e(778449185, false, new C13060e(28));
    public static final C2892e vip = new C2892e(-1108294838, false, new C13060e(29));
    public static final C2892e metrica = new C2892e(-1085172421, false, new C14123e(26));

    public static float appmetrica(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC7814e.vip(edgeEffect);
        }
        return 0.0f;
    }

    public static float billing(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC7814e.metrica(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static Hashtable license(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    public static final boolean metrica(int i, KeyEvent keyEvent) {
        return ((int) (AbstractC9835e.startapp(keyEvent) >> 32)) == i;
    }

    public static final C11005e purchase(C12816e c12816e, InterfaceC7227e interfaceC7227e) {
        return new C11005e(interfaceC7227e, c12816e.ad.ad, new C16014e(interfaceC7227e, c12816e), new C16014e(c12816e, interfaceC7227e));
    }

    @Override // defpackage.InterfaceC4665e
    public boolean vip(C15466e c15466e, C15466e c15466e2) {
        if (c15466e.f30558e.length == c15466e2.f30558e.length) {
            C16221e[] admob = c15466e.admob();
            C16221e[] admob2 = c15466e2.admob();
            boolean z = (admob[0].loadAd() == null || admob2[0].loadAd() == null) ? false : !r0.f1387e.isVip(r1.f1387e);
            for (int i = 0; i != admob.length; i++) {
                C16221e c16221e = admob[i];
                if (z) {
                    for (int length = admob2.length - 1; length >= 0; length--) {
                        C16221e c16221e2 = admob2[length];
                        if (c16221e2 != null && AbstractC1358e.yandex(c16221e, c16221e2)) {
                            admob2[length] = null;
                        }
                    }
                } else {
                    for (int i2 = 0; i2 != admob2.length; i2++) {
                        C16221e c16221e3 = admob2[i2];
                        if (c16221e3 != null && AbstractC1358e.yandex(c16221e, c16221e3)) {
                            admob2[i2] = null;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
