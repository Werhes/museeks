package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14524e {
    public static final Handler ad = new Handler(Looper.getMainLooper());

    public static void ad() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Not running on main thread when it is required to");
        }
    }

    public static void vip(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            ad.post(runnable);
        }
    }
}
