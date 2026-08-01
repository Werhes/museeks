package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8598e {
    public final Context ad;
    public final C0150e adcel;
    public final C1386e advert;
    public final C0444e amazon;
    public C17424e appmetrica;
    public C4594e billing;
    public final long license;
    public final C12894e loadAd;
    public final C3168e metrica;
    public final C0150e mopub;
    public C17424e purchase;
    public final C12787e smaato;
    public final C14461e startapp;
    public final C8331e vip;
    public final C17960e yandex;

    public C8598e(C14679e c14679e, C17960e c17960e, C12787e c12787e, C8331e c8331e, C0150e c0150e, C0150e c0150e2, C14461e c14461e, C1386e c1386e, C0444e c0444e, C12894e c12894e) {
        this.vip = c8331e;
        c14679e.ad();
        this.ad = c14679e.ad;
        this.yandex = c17960e;
        this.smaato = c12787e;
        this.adcel = c0150e;
        this.mopub = c0150e2;
        this.startapp = c14461e;
        this.advert = c1386e;
        this.amazon = c0444e;
        this.loadAd = c12894e;
        this.license = System.currentTimeMillis();
        this.metrica = new C3168e(6);
    }

    public final void ad(C4956e c4956e) {
        C12894e.smaato();
        C12894e.smaato();
        this.appmetrica.subscription();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.adcel.license(new C5985e(this));
                this.billing.billing();
                if (!c4956e.mopub().vip.vip) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.billing.license(c4956e)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.billing.yandex(((C8988e) ((AtomicReference) c4956e.f10516e).get()).ad);
                metrica();
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                metrica();
            }
        } catch (Throwable th) {
            metrica();
            throw th;
        }
    }

    public final void metrica() {
        C12894e.smaato();
        try {
            C17424e c17424e = this.appmetrica;
            C14461e c14461e = (C14461e) c17424e.f34141e;
            String str = (String) c17424e.f34142e;
            c14461e.getClass();
            if (new File((File) c14461e.f28586e, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }

    public final void vip(C4956e c4956e) {
        Future<?> submit = ((ExecutorC4614e) this.loadAd.f25751e).f9946e.submit(new RunnableC7448e(this, c4956e, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }
}
