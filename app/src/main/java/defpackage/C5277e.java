package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۥۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5277e {
    public static final C5277e vip;
    public C12698e ad;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؗۥۨ, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.ad = null;
        vip = obj;
    }

    public static C12698e ad(Context context) {
        C12698e c12698e;
        C5277e c5277e = vip;
        synchronized (c5277e) {
            try {
                if (c5277e.ad == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c5277e.ad = new C12698e(context);
                }
                c12698e = c5277e.ad;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c12698e;
    }
}
