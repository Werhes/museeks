package defpackage;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٔۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15113e {
    public Method ad = null;
    public final C12675e appmetrica = new C12675e(this);
    public final C12916e license;
    public Object metrica;
    public final MediaSessionManager vip;

    public C15113e(Context context, C12916e c12916e) {
        this.vip = (MediaSessionManager) context.getSystemService("media_session");
        this.license = c12916e;
        metrica(context);
    }

    public static String ad(Context context) {
        Class<?> cls;
        if (Build.VERSION.SDK_INT < 26) {
            return "Android version is not supported";
        }
        if (context.checkCallingOrSelfPermission("android.permission.SET_VOLUME_KEY_LONG_PRESS_LISTENER") != 0) {
            return "Permission android.permission.SET_VOLUME_KEY_LONG_PRESS_LISTENER not granted!";
        }
        if (vip() == null) {
            return "setOnVolumeKeyLongPressListener method not found!";
        }
        try {
            cls = Class.forName("android.media.session.MediaSessionManager$OnVolumeKeyLongPressListener");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return "onVolumeKeyLongPressListener interface not found!";
        }
        return null;
    }

    public static Method vip() {
        for (Method method : MediaSessionManager.class.getMethods()) {
            if (method.getName().equals("setOnVolumeKeyLongPressListener")) {
                return method;
            }
        }
        return null;
    }

    public final void metrica(Context context) {
        Class<?> cls;
        if ((this.ad == null || this.metrica == null) && ad(context) == null) {
            this.ad = vip();
            ClassLoader classLoader = C12916e.class.getClassLoader();
            try {
                cls = Class.forName("android.media.session.MediaSessionManager$OnVolumeKeyLongPressListener");
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            this.metrica = Proxy.newProxyInstance(classLoader, new Class[]{cls}, this.appmetrica);
        }
    }
}
