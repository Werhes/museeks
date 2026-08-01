package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؗٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6215e extends BroadcastReceiver {
    public RunnableC2360e ad;
    public final /* synthetic */ RunnableC2360e vip;

    public C6215e(RunnableC2360e runnableC2360e, RunnableC2360e runnableC2360e2) {
        this.vip = runnableC2360e;
        this.ad = runnableC2360e2;
    }

    public final void ad() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((Context) this.vip.f5907e).registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002a A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:3:0x0001, B:8:0x0007, B:12:0x000f, B:14:0x0018, B:16:0x001e, B:21:0x002a, B:22:0x0034), top: B:2:0x0001 }] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            eؔؕؒ r6 = r4.ad     // Catch: java.lang.Throwable -> L32
            if (r6 != 0) goto L7
            monitor-exit(r4)
            return
        L7:
            boolean r6 = r6.license()     // Catch: java.lang.Throwable -> L32
            if (r6 != 0) goto Lf
            monitor-exit(r4)
            return
        Lf:
            java.lang.String r6 = "FirebaseMessaging"
            r0 = 3
            boolean r1 = android.util.Log.isLoggable(r6, r0)     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L27
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L32
            r2 = 23
            if (r1 != r2) goto L25
            boolean r6 = android.util.Log.isLoggable(r6, r0)     // Catch: java.lang.Throwable -> L32
            if (r6 == 0) goto L25
            goto L27
        L25:
            r6 = 0
            goto L28
        L27:
            r6 = 1
        L28:
            if (r6 == 0) goto L34
            java.lang.String r6 = "FirebaseMessaging"
            java.lang.String r0 = "Connectivity changed. Starting background sync."
            android.util.Log.d(r6, r0)     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r5 = move-exception
            goto L4b
        L34:
            eؔؕؒ r6 = r4.ad     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r6.f5911e     // Catch: java.lang.Throwable -> L32
            eُِۡ r0 = (defpackage.C10953e) r0     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r0.purchase     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L32
            r2 = 0
            r0.schedule(r6, r2, r1)     // Catch: java.lang.Throwable -> L32
            r5.unregisterReceiver(r4)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            r4.ad = r5     // Catch: java.lang.Throwable -> L32
            monitor-exit(r4)
            return
        L4b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6215e.onReceive(android.content.Context, android.content.Intent):void");
    }
}
