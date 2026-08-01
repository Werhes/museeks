package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1632e {
    public static final boolean vip = Log.isLoggable("MediaBrowserCompat", 3);
    public final C3740e ad;

    public C1632e(Context context, ComponentName componentName, C2532e c2532e) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.ad = new C3740e(context, componentName, c2532e);
        } else {
            this.ad = new C3740e(context, componentName, c2532e);
        }
    }
}
