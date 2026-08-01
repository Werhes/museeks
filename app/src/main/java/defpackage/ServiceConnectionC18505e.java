package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۦۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ServiceConnectionC18505e implements ServiceConnection {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public BinderC6031e f36279e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ScheduledThreadPoolExecutor f36280e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Intent f36281e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final ArrayDeque f36282e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Context f36283e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f36284e;

    public ServiceConnectionC18505e(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC14833e("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f36282e = new ArrayDeque();
        this.f36284e = false;
        Context applicationContext = context.getApplicationContext();
        this.f36283e = applicationContext;
        this.f36281e = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f36280e = scheduledThreadPoolExecutor;
    }

    public final synchronized void ad() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f36282e.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                BinderC6031e binderC6031e = this.f36279e;
                if (binderC6031e == null || !binderC6031e.isBinderAlive()) {
                    metrica();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f36279e.ad((C17296e) this.f36282e.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void metrica() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f36284e);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f36284e) {
            return;
        }
        this.f36284e = true;
        try {
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e);
        }
        if (C5459e.vip().ad(this.f36283e, this.f36281e, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f36284e = false;
        while (true) {
            ArrayDeque arrayDeque = this.f36282e;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((C17296e) arrayDeque.poll()).vip.license(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f36284e = false;
            if (iBinder instanceof BinderC6031e) {
                this.f36279e = (BinderC6031e) iBinder;
                ad();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.f36282e;
            while (!arrayDeque.isEmpty()) {
                ((C17296e) arrayDeque.poll()).vip.license(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        ad();
    }

    public final synchronized C0560e vip(Intent intent) {
        C17296e c17296e;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            c17296e = new C17296e(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f36280e;
            c17296e.vip.ad.vip(scheduledThreadPoolExecutor, new C13087e(scheduledThreadPoolExecutor.schedule(new RunnableC1352e(17, c17296e), 20L, TimeUnit.SECONDS)));
            this.f36282e.add(c17296e);
            ad();
        } catch (Throwable th) {
            throw th;
        }
        return c17296e.vip.ad;
    }
}
