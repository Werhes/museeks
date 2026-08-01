package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractServiceC13175e extends Service {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f26162e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f26163e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public BinderC6031e f26164e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f26165e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ExecutorService f26166e;

    public AbstractServiceC13175e() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC14833e("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f26166e = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f26163e = new Object();
        this.f26162e = 0;
    }

    public final void ad(Intent intent) {
        if (intent != null) {
            AbstractC2940e.vip(intent);
        }
        synchronized (this.f26163e) {
            try {
                int i = this.f26162e - 1;
                this.f26162e = i;
                if (i == 0) {
                    stopSelfResult(this.f26165e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f26164e == null) {
                this.f26164e = new BinderC6031e(new C6594e(12, this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f26164e;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f26166e.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f26163e) {
            this.f26165e = i2;
            this.f26162e++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) C11106e.m2998while().f22006e).poll();
        if (intent2 == null) {
            ad(intent);
            return 2;
        }
        C8988e c8988e = new C8988e();
        this.f26166e.execute(new RunnableC4904e(21, this, intent2, c8988e));
        C0560e c0560e = c8988e.ad;
        if (c0560e.mopub()) {
            ad(intent);
            return 2;
        }
        c0560e.vip(new ExecutorC14279e(2), new C11565e(this, intent, 21));
        return 3;
    }

    public abstract void vip(Intent intent);
}
