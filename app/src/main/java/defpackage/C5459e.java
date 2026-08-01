package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؘُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5459e {
    public static volatile C5459e metrica;
    public static final Object vip = new Object();
    public final ConcurrentHashMap ad = new ConcurrentHashMap();

    public static C5459e vip() {
        if (metrica == null) {
            synchronized (vip) {
                try {
                    if (metrica == null) {
                        metrica = new C5459e();
                    }
                } finally {
                }
            }
        }
        C5459e c5459e = metrica;
        AbstractC9528e.startapp(c5459e);
        return c5459e;
    }

    public final boolean ad(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return license(context, context.getClass().getName(), intent, serviceConnection, i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean license(android.content.Context r9, java.lang.String r10, android.content.Intent r11, android.content.ServiceConnection r12, int r13, java.util.concurrent.Executor r14) {
        /*
            r8 = this;
            android.content.ComponentName r0 = r11.getComponent()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto La
        L8:
            r0 = r2
            goto L1e
        La:
            java.lang.String r0 = r0.getPackageName()
            eّۘٚ r3 = defpackage.C5277e.ad(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8
            android.content.pm.ApplicationInfo r0 = r3.vip(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8
            int r0 = r0.flags     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8
            r3 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L8
            r0 = r1
        L1e:
            java.lang.String r3 = "ConnectionTracker"
            if (r0 == 0) goto L28
            java.lang.String r9 = "Attempted to bind to a service in a STOPPED package."
            android.util.Log.w(r3, r9)
            return r2
        L28:
            boolean r0 = r12 instanceof defpackage.ServiceConnectionC11808e
            r4 = 29
            r5 = 0
            if (r0 != 0) goto L70
            j$.util.concurrent.ConcurrentHashMap r0 = r8.ad
            java.lang.Object r6 = r0.putIfAbsent(r12, r12)
            android.content.ServiceConnection r6 = (android.content.ServiceConnection) r6
            if (r6 == 0) goto L52
            if (r12 == r6) goto L52
            java.lang.String r6 = r11.getAction()
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r2] = r12
            r7[r1] = r10
            r10 = 2
            r7[r10] = r6
            java.lang.String r10 = "Duplicate binding with the same ServiceConnection: %s, %s, %s."
            java.lang.String r10 = java.lang.String.format(r10, r7)
            android.util.Log.w(r3, r10)
        L52:
            if (r14 != 0) goto L55
            r14 = r5
        L55:
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L6b
            if (r10 < r4) goto L60
            if (r14 == 0) goto L60
            boolean r9 = r9.bindService(r11, r13, r14, r12)     // Catch: java.lang.Throwable -> L6b
            goto L64
        L60:
            boolean r9 = r9.bindService(r11, r12, r13)     // Catch: java.lang.Throwable -> L6b
        L64:
            if (r9 == 0) goto L67
            return r9
        L67:
            r0.remove(r12, r12)
            return r2
        L6b:
            r9 = move-exception
            r0.remove(r12, r12)
            throw r9
        L70:
            if (r14 != 0) goto L73
            r14 = r5
        L73:
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 < r4) goto L7e
            if (r14 == 0) goto L7e
            boolean r9 = r9.bindService(r11, r13, r14, r12)
            goto L82
        L7e:
            boolean r9 = r9.bindService(r11, r12, r13)
        L82:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5459e.license(android.content.Context, java.lang.String, android.content.Intent, android.content.ServiceConnection, int, java.util.concurrent.Executor):boolean");
    }

    public final void metrica(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof ServiceConnectionC11808e)) {
            ConcurrentHashMap concurrentHashMap = this.ad;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }
}
