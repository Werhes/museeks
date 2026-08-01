package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؗ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4953e {
    public static final /* synthetic */ int ad = 0;
    private static volatile Choreographer choreographer;

    static {
        Object c12763e;
        try {
            c12763e = new C12940e(ad(Looper.getMainLooper()));
        } catch (Throwable th) {
            c12763e = new C12763e(th);
        }
        if (c12763e instanceof C12763e) {
            c12763e = null;
        }
    }

    public static final Handler ad(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (Handler) Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
