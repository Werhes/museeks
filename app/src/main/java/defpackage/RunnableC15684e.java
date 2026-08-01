package defpackage;

import android.animation.Animator;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۙؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC15684e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f30892e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f30893e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f30894e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30895e = 0;

    public RunnableC15684e(View view, long j, C13665e c13665e) {
        this.f30892e = view;
        this.f30893e = j;
        this.f30894e = c13665e;
    }

    public RunnableC15684e(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC14833e("firebase-iid-executor"));
        this.f30894e = firebaseMessaging;
        this.f30893e = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.vip.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f30892e = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public RunnableC15684e(C10693e c10693e, C13288e c13288e, long j) {
        this.f30892e = c13288e;
        this.f30893e = j;
        Objects.requireNonNull(c10693e);
        this.f30894e = c10693e;
    }

    public RunnableC15684e(C11931e c11931e, RunnableC16721e runnableC16721e, InterfaceScheduledExecutorServiceC1678e interfaceScheduledExecutorServiceC1678e, long j) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f30892e = runnableC16721e;
        this.f30894e = interfaceScheduledExecutorServiceC1678e;
        this.f30893e = j;
    }

    public boolean ad() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.f30894e).vip.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30895e) {
            case 0:
                View view = (View) this.f30892e;
                if (view.isAttachedToWindow()) {
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, (view.getRight() + view.getLeft()) / 2, (view.getBottom() + view.getTop()) / 2, Math.max(view.getWidth(), view.getHeight()), 0.0f);
                    createCircularReveal.setDuration(this.f30893e);
                    createCircularReveal.start();
                    createCircularReveal.addListener(new C9380e(2, (C13665e) this.f30894e));
                    return;
                }
                return;
            case 1:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f30892e;
                C11106e m2998while = C11106e.m2998while();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f30894e;
                if (m2998while.m3010implements(firebaseMessaging.vip)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.startapp = true;
                        }
                        if (!firebaseMessaging.yandex.mopub()) {
                            firebaseMessaging.purchase(false);
                            if (!C11106e.m2998while().m3010implements(firebaseMessaging.vip)) {
                                return;
                            }
                        } else if (!C11106e.m2998while().m3005default(firebaseMessaging.vip) || ad()) {
                            if (vip()) {
                                firebaseMessaging.purchase(false);
                            } else {
                                firebaseMessaging.yandex(this.f30893e);
                            }
                            if (!C11106e.m2998while().m3010implements(firebaseMessaging.vip)) {
                                return;
                            }
                        } else {
                            C16424e c16424e = new C16424e();
                            c16424e.metrica = this;
                            c16424e.ad();
                            if (!C11106e.m2998while().m3010implements(firebaseMessaging.vip)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                        firebaseMessaging.purchase(false);
                        if (!C11106e.m2998while().m3010implements(firebaseMessaging.vip)) {
                            return;
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (C11106e.m2998while().m3010implements(firebaseMessaging.vip)) {
                        wakeLock.release();
                    }
                    throw th;
                }
            case 2:
                C10693e c10693e = (C10693e) this.f30894e;
                c10693e.m2913e((C13288e) this.f30892e, false, this.f30893e);
                c10693e.f21069e = null;
                C10640e mopub = ((C6936e) c10693e.f36443e).mopub();
                mopub.mo2250e();
                mopub.m1411e();
                mopub.m2851e(new RunnableC12554e(mopub, (C13288e) null));
                return;
            default:
                ((RunnableC16721e) this.f30892e).run();
                long j = this.f30893e;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                C3598e c3598e = (C3598e) ((InterfaceScheduledExecutorServiceC1678e) this.f30894e);
                c3598e.getClass();
                RunnableFutureC9859e runnableFutureC9859e = new RunnableFutureC9859e(Executors.callable(this, null));
                ScheduledFutureC15846e scheduledFutureC15846e = new ScheduledFutureC15846e(runnableFutureC9859e, c3598e.f8133e.schedule(runnableFutureC9859e, j, timeUnit));
                scheduledFutureC15846e.ad(new RunnableC7527e(scheduledFutureC15846e, 1), EnumC3320e.f7489e);
                return;
        }
    }

    public boolean vip() {
        try {
            if (((FirebaseMessaging) this.f30894e).ad() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }
}
