package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؒۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9203e {
    public static final C14241e billing = new C14241e();
    public final C0433e ad;
    public final C8630e appmetrica;
    public final C8630e license;
    public final C2399e metrica;
    public boolean purchase;
    public final C1962e vip;

    public C9203e(C0433e c0433e, C1962e c1962e, C8630e c8630e, C8630e c8630e2) {
        Looper looper;
        this.ad = c0433e;
        this.vip = c1962e;
        this.license = c8630e;
        this.appmetrica = c8630e2;
        C14241e c14241e = billing;
        synchronized (c14241e) {
            try {
                if (c14241e.vip == null) {
                    AbstractC2301e.subscription(c14241e.metrica == 0);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:MetadataRetriever");
                    c14241e.vip = handlerThread;
                    handlerThread.start();
                }
                c14241e.metrica++;
                HandlerThread handlerThread2 = c14241e.vip;
                handlerThread2.getClass();
                looper = handlerThread2.getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.metrica = new C2399e(new Handler(looper, new C7315e(this)));
    }

    public final synchronized void ad() {
        if (!this.purchase) {
            this.purchase = true;
            this.metrica.ad(4).vip();
        }
    }
}
