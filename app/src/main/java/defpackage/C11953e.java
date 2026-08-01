package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۙؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11953e extends AbstractC15920e {
    public volatile Handler advert;
    public final Object adcel = new Object();
    public final ExecutorService mopub = Executors.newFixedThreadPool(4, new ThreadFactoryC8129e(1));

    /* renamed from: class, reason: not valid java name */
    public static Handler m3288class(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC17305e.yandex(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
