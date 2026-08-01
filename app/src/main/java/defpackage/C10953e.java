package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10953e {
    public static final /* synthetic */ int adcel = 0;
    public static final long startapp = TimeUnit.HOURS.toSeconds(8);
    public final Context ad;
    public final C2271e appmetrica = new C17519e(0);
    public boolean billing = false;
    public final FirebaseMessaging license;
    public final C2532e metrica;
    public final ScheduledThreadPoolExecutor purchase;
    public final C6148e vip;
    public final C17780e yandex;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٕ٘ؔ, eؓۨۖ] */
    public C10953e(FirebaseMessaging firebaseMessaging, C6148e c6148e, C17780e c17780e, C2532e c2532e, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.license = firebaseMessaging;
        this.vip = c6148e;
        this.yandex = c17780e;
        this.metrica = c2532e;
        this.ad = context;
        this.purchase = scheduledThreadPoolExecutor;
    }

    public static void ad(C0560e c0560e) {
        try {
            AbstractC1749e.vip(c0560e, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static boolean license() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void appmetrica(C9789e c9789e) {
        synchronized (this.appmetrica) {
            try {
                String str = c9789e.metrica;
                if (this.appmetrica.containsKey(str)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.appmetrica.get(str);
                    C8988e c8988e = (C8988e) arrayDeque.poll();
                    if (c8988e != null) {
                        c8988e.vip(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.appmetrica.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089 A[Catch: IOException -> 0x005d, TRY_LEAVE, TryCatch #1 {IOException -> 0x005d, blocks: (B:8:0x0028, B:13:0x0083, B:15:0x0089, B:19:0x0039, B:21:0x0041, B:23:0x004a, B:26:0x005f, B:28:0x0067, B:30:0x0070), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean billing() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10953e.billing():boolean");
    }

    public final void metrica(String str) {
        String ad = this.license.ad();
        C2532e c2532e = this.metrica;
        c2532e.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        ad(c2532e.m878abstract(c2532e.m885e(ad, "/topics/" + str, bundle)));
    }

    public final synchronized void purchase(boolean z) {
        this.billing = z;
    }

    public final void vip(String str) {
        String ad = this.license.ad();
        C2532e c2532e = this.metrica;
        c2532e.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        ad(c2532e.m878abstract(c2532e.m885e(ad, "/topics/" + str, bundle)));
    }

    public final void yandex(long j) {
        this.purchase.schedule(new RunnableC2360e(this, this.ad, this.vip, Math.min(Math.max(30L, 2 * j), startapp)), j, TimeUnit.SECONDS);
        purchase(true);
    }
}
