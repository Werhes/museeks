package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙْٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6375e {
    public final Handler ad;
    public final /* synthetic */ C11863e metrica;
    public final C8247e vip;

    public C6375e(C11863e c11863e) {
        this.metrica = c11863e;
        Handler subscription = AbstractC9413e.subscription(null);
        this.ad = subscription;
        C8247e c8247e = new C8247e(this);
        this.vip = c8247e;
        c11863e.ad.registerStreamEventCallback(new ExecutorC17160e(0, subscription), c8247e);
    }

    public static void ad(C6375e c6375e) {
        c6375e.metrica.ad.unregisterStreamEventCallback(c6375e.vip);
        c6375e.ad.removeCallbacksAndMessages(null);
    }
}
