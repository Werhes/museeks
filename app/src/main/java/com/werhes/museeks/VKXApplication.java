package com.werhes.museeks;

import android.app.Application;
import android.os.Handler;
import defpackage.C11328e;
import defpackage.C14172e;
import defpackage.C18046e;
import defpackage.C7838e;
import defpackage.C8221e;

/**
 * Stub for VKXApplication - provides backward compatibility for decompiled code.
 * This is a temporary solution until all references are migrated to MuseeksApplication.
 */
public final class VKXApplication extends Application {
    public static VKXApplication f36528e;
    public static C7838e f36530e;
    public static C18046e f36532e;
    public static boolean f36534e;
    public static C11328e f36535e;
    public static C8221e f36536e;
    public static final Companion f36531e = new Companion();
    public static final Handler f36529e = new Handler(android.os.Looper.getMainLooper());
    public static final C14172e f36533e = new C14172e(null);

    public static final class Companion {
        public static int ad(float f) { return 0; }
        public static void license() {}
        public static boolean metrica() { return true; }
        public static String vip(int i) { return ""; }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        f36528e = this;
    }
}