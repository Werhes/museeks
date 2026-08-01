package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؕٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3500e {
    public static OnBackInvokedDispatcher ad(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static void metrica(Object obj, Object obj2) {
        C4403e.appmetrica(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    public static OnBackInvokedCallback vip(Object obj, LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e) {
        Objects.requireNonNull(layoutInflaterFactory2C8158e);
        C12609e c12609e = new C12609e(1, layoutInflaterFactory2C8158e);
        C4403e.appmetrica(obj).registerOnBackInvokedCallback(1000000, c12609e);
        return c12609e;
    }
}
