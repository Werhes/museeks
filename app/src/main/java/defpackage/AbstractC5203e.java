package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۡؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5203e {
    public static final Method ad;
    public static final Method vip;

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 6
            java.lang.String r2 = "JobSchedulerCompat"
            r3 = 0
            r4 = 24
            if (r0 < r4) goto L33
            java.lang.Class<android.app.job.JobScheduler> r0 = android.app.job.JobScheduler.class
            java.lang.String r5 = "scheduleAsPackage"
            r6 = 4
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class<android.app.job.JobInfo> r7 = android.app.job.JobInfo.class
            r8 = 0
            r6[r8] = r7     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r8 = 1
            r6[r8] = r7     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L28
            r9 = 2
            r6[r9] = r8     // Catch: java.lang.NoSuchMethodException -> L28
            r8 = 3
            r6[r8] = r7     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L28
            goto L34
        L28:
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto L33
            java.lang.String r0 = "No scheduleAsPackage method available, falling back to schedule"
            android.util.Log.e(r2, r0)
        L33:
            r0 = r3
        L34:
            defpackage.AbstractC5203e.ad = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L4e
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.String r4 = "myUserId"
            java.lang.reflect.Method r3 = r0.getDeclaredMethod(r4, r3)     // Catch: java.lang.NoSuchMethodException -> L43
            goto L4e
        L43:
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto L4e
            java.lang.String r0 = "No myUserId method available"
            android.util.Log.e(r2, r0)
        L4e:
            defpackage.AbstractC5203e.vip = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5203e.<clinit>():void");
    }
}
