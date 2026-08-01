package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٔٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13255e {
    public static final String appmetrica = C5401e.crashlytics("WorkTimer");
    public final ScheduledExecutorService ad;
    public final Object license;
    public final HashMap metrica;
    public final HashMap vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؚٟ۠, java.lang.Object, java.util.concurrent.ThreadFactory] */
    public C13255e() {
        ?? obj = new Object();
        obj.ad = 0;
        this.vip = new HashMap();
        this.metrica = new HashMap();
        this.license = new Object();
        this.ad = Executors.newSingleThreadScheduledExecutor(obj);
    }

    public final void ad(String str, C6546e c6546e) {
        synchronized (this.license) {
            C5401e.loadAd().smaato(appmetrica, "Starting timer for " + str, new Throwable[0]);
            vip(str);
            RunnableC16156e runnableC16156e = new RunnableC16156e(this, str);
            this.vip.put(str, runnableC16156e);
            this.metrica.put(str, c6546e);
            this.ad.schedule(runnableC16156e, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void vip(String str) {
        synchronized (this.license) {
            try {
                if (((RunnableC16156e) this.vip.remove(str)) != null) {
                    C5401e.loadAd().smaato(appmetrica, "Stopping timer for " + str, new Throwable[0]);
                    this.metrica.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
