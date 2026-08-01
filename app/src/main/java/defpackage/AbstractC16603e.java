package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.UserManager;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۣۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16603e {
    public static UserManager ad;
    public static volatile boolean vip;

    static {
        vip = !(Build.VERSION.SDK_INT >= 24);
    }

    public static boolean ad(Context context) {
        return Build.VERSION.SDK_INT < 24 || metrica(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        if (r3.isUserRunning(android.os.Process.myUserHandle()) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean metrica(android.content.Context r7) {
        /*
            boolean r0 = defpackage.AbstractC16603e.vip
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Class<eٖۣۦ> r0 = defpackage.AbstractC16603e.class
            monitor-enter(r0)
            boolean r2 = defpackage.AbstractC16603e.vip     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r7 = move-exception
            goto L54
        L11:
            r2 = r1
        L12:
            r3 = 2
            r4 = 0
            r5 = 0
            if (r2 > r3) goto L4a
            android.os.UserManager r3 = defpackage.AbstractC16603e.ad     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L25
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> Lf
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch: java.lang.Throwable -> Lf
            defpackage.AbstractC16603e.ad = r3     // Catch: java.lang.Throwable -> Lf
        L25:
            android.os.UserManager r3 = defpackage.AbstractC16603e.ad     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L2b
            r5 = r1
            goto L4e
        L2b:
            boolean r6 = r3.isUserUnlocked()     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3d
            if (r6 != 0) goto L3b
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3d
            boolean r7 = r3.isUserRunning(r6)     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3d
            if (r7 != 0) goto L4a
        L3b:
            r5 = r1
            goto L4a
        L3d:
            r3 = move-exception
            java.lang.String r5 = "DirectBootUtils"
            java.lang.String r6 = "Failed to check if user is unlocked."
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> Lf
            defpackage.AbstractC16603e.ad = r4     // Catch: java.lang.Throwable -> Lf
            int r2 = r2 + 1
            goto L12
        L4a:
            if (r5 == 0) goto L4e
            defpackage.AbstractC16603e.ad = r4     // Catch: java.lang.Throwable -> Lf
        L4e:
            if (r5 == 0) goto L52
            defpackage.AbstractC16603e.vip = r1     // Catch: java.lang.Throwable -> Lf
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r5
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16603e.metrica(android.content.Context):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v7, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, eٍۣٕ, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r12v8, types: [eؚؑ۟, java.lang.Object, eٍۣٕ, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [eؚؑ۟, java.lang.Object, eؑۖؒ] */
    public static AbstractC0586e vip(Context context, Callable callable, Executor executor) {
        C16554e c16554e = new C16554e(callable);
        if (ad(context)) {
            ?? obj = new Object();
            obj.f19447e = new C1066e((RunnableFutureC9859e) obj, c16554e);
            executor.execute(obj);
            return obj;
        }
        ?? obj2 = new Object();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        C9652e c9652e = new C9652e(atomicBoolean, context, obj2, c16554e, executor);
        context.registerReceiver(c9652e, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!ad(context) || !atomicBoolean.compareAndSet(false, true)) {
            obj2.ad(new RunnableC11327e(9, obj2, atomicBoolean, context, c9652e, false), EnumC3320e.f7489e);
            return obj2;
        }
        try {
            context.unregisterReceiver(c9652e);
        } catch (IllegalArgumentException e) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e);
        }
        ?? obj3 = new Object();
        obj3.f19447e = new C1066e((RunnableFutureC9859e) obj3, c16554e);
        executor.execute(obj3);
        obj2.loadAd(obj3);
        return obj2;
    }
}
