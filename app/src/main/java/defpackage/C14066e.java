package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٓٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14066e extends AbstractC8918e {
    public static final boolean appmetrica;
    public static final AtomicLong billing;
    public static final boolean license;
    public static final boolean metrica;
    public static final AtomicReference purchase;
    public static final ConcurrentLinkedQueue yandex;
    public volatile AbstractC8918e vip;

    static {
        String str = Build.FINGERPRINT;
        metrica = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        license = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        appmetrica = "eng".equals(str3) || "userdebug".equals(str3);
        purchase = new AtomicReference();
        billing = new AtomicLong();
        yandex = new ConcurrentLinkedQueue();
    }

    public static void license() {
        while (true) {
            C3626e c3626e = (C3626e) yandex.poll();
            if (c3626e == null) {
                return;
            }
            billing.getAndDecrement();
            C14066e c14066e = c3626e.ad;
            C6713e c6713e = c3626e.vip;
            C10656e c10656e = c6713e.metrica;
            if ((c10656e != null && Boolean.TRUE.equals(c10656e.smaato(AbstractC14416e.billing))) || c14066e.ad(c6713e.ad)) {
                c14066e.vip(c6713e);
            }
        }
    }

    @Override // defpackage.AbstractC8918e
    public final boolean ad(Level level) {
        return this.vip == null || this.vip.ad(level);
    }

    @Override // defpackage.AbstractC8918e
    public final void metrica(RuntimeException runtimeException, C6713e c6713e) {
        if (this.vip != null) {
            this.vip.metrica(runtimeException, c6713e);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }

    @Override // defpackage.AbstractC8918e
    public final void vip(C6713e c6713e) {
        if (this.vip != null) {
            this.vip.vip(c6713e);
            return;
        }
        if (billing.incrementAndGet() > 20) {
            yandex.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        yandex.offer(new C3626e(this, c6713e));
        if (this.vip != null) {
            license();
        }
    }
}
