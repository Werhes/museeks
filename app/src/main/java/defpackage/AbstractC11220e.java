package defpackage;

import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۘۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11220e {
    public static final C4935e ad = C4935e.ad;

    public static C4935e ad(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        while (abstractComponentCallbacksC17875e != null) {
            if (abstractComponentCallbacksC17875e.f35074e != null && abstractComponentCallbacksC17875e.f35091e) {
                abstractComponentCallbacksC17875e.mopub();
            }
            abstractComponentCallbacksC17875e = abstractComponentCallbacksC17875e.f35101e;
        }
        return ad;
    }

    public static final void metrica(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e, String str) {
        vip(new C6964e(abstractComponentCallbacksC17875e, "Attempting to reuse fragment " + abstractComponentCallbacksC17875e + " with previous ID " + str));
        ad(abstractComponentCallbacksC17875e).getClass();
    }

    public static void vip(C6964e c6964e) {
        if (AbstractC15958e.m4045native(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(c6964e.f14261e.getClass().getName()), c6964e);
        }
    }
}
