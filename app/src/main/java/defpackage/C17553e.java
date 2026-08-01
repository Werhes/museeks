package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17553e {
    public final double ad;
    public int adcel;
    public final int appmetrica;
    public final ThreadPoolExecutor billing;
    public final long license;
    public final long metrica;
    public long mopub;
    public final ArrayBlockingQueue purchase;
    public final C3168e startapp;
    public final double vip;
    public final C11547e yandex;

    public C17553e(C11547e c11547e, C13827e c13827e, C3168e c3168e) {
        double d = c13827e.license;
        double d2 = c13827e.appmetrica;
        this.ad = d;
        this.vip = d2;
        this.metrica = c13827e.purchase * 1000;
        this.yandex = c11547e;
        this.startapp = c3168e;
        this.license = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.appmetrica = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.purchase = arrayBlockingQueue;
        this.billing = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.adcel = 0;
        this.mopub = 0L;
    }

    public final int ad() {
        if (this.mopub == 0) {
            this.mopub = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.mopub) / this.metrica);
        int min = this.purchase.size() == this.appmetrica ? Math.min(100, this.adcel + currentTimeMillis) : Math.max(0, this.adcel - currentTimeMillis);
        if (this.adcel != min) {
            this.adcel = min;
            this.mopub = System.currentTimeMillis();
        }
        return min;
    }

    public final void vip(C16281e c16281e, C8988e c8988e) {
        String str = "Sending report through Google DataTransport: " + c16281e.vip;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        this.yandex.ad(new C7101e(null, c16281e.ad, EnumC6651e.f13720e, null), new C15446e(SystemClock.elapsedRealtime() - this.license < 2000, this, c8988e, c16281e));
    }
}
