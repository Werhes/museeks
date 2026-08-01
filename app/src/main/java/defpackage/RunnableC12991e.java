package defpackage;

import android.database.Cursor;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC12991e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f25898e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25899e;

    public /* synthetic */ RunnableC12991e(int i, Object obj) {
        this.f25899e = i;
        this.f25898e = obj;
    }

    private final void appmetrica() {
        try {
            billing();
        } catch (Error e) {
            synchronized (((ExecutorC12245e) this.f25898e).f24578e) {
                ((ExecutorC12245e) this.f25898e).f24577e = 1;
                throw e;
            }
        }
    }

    private final void license() {
        Object obj;
        synchronized (((AbstractC9790e) this.f25898e).ad) {
            obj = ((AbstractC9790e) this.f25898e).purchase;
            ((AbstractC9790e) this.f25898e).purchase = AbstractC9790e.mopub;
        }
        ((AbstractC9790e) this.f25898e).startapp(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void metrica() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f25898e
            eؚؔ۠ r0 = (defpackage.C2436e) r0
            androidx.work.impl.WorkDatabase_Impl r0 = r0.metrica
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.yandex
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r1 = 0
            r0.lock()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            java.lang.Object r2 = r5.f25898e     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            eؚؔ۠ r2 = (defpackage.C2436e) r2     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            boolean r2 = r2.ad()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            if (r2 != 0) goto L1e
            r0.unlock()
            return
        L1e:
            java.lang.Object r2 = r5.f25898e     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            eؚؔ۠ r2 = (defpackage.C2436e) r2     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.license     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            r3 = 0
            r4 = 1
            boolean r2 = r2.compareAndSet(r4, r3)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            if (r2 != 0) goto L30
            r0.unlock()
            return
        L30:
            java.lang.Object r2 = r5.f25898e     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            eؚؔ۠ r2 = (defpackage.C2436e) r2     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            androidx.work.impl.WorkDatabase_Impl r2 = r2.metrica     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            eُۘۖ r2 = r2.metrica     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            eًٍؗ r2 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            java.lang.Object r2 = r2.f10118e     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            android.database.sqlite.SQLiteDatabase r2 = (android.database.sqlite.SQLiteDatabase) r2     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            boolean r2 = r2.inTransaction()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            if (r2 == 0) goto L4a
            r0.unlock()
            return
        L4a:
            java.lang.Object r2 = r5.f25898e     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            eؚؔ۠ r2 = (defpackage.C2436e) r2     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            androidx.work.impl.WorkDatabase_Impl r2 = r2.metrica     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            boolean r3 = r2.purchase     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            if (r3 == 0) goto L73
            eُۘۖ r2 = r2.metrica     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            eًٍؗ r2 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            r2.ad()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            java.util.HashSet r1 = r5.ad()     // Catch: java.lang.Throwable -> L6e
            r2.subs()     // Catch: java.lang.Throwable -> L6e
            r2.Signature()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            goto L77
        L68:
            r1 = move-exception
            goto Lbc
        L6a:
            r2 = move-exception
            goto L7b
        L6c:
            r2 = move-exception
            goto L7b
        L6e:
            r3 = move-exception
            r2.Signature()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            throw r3     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
        L73:
            java.util.HashSet r1 = r5.ad()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
        L77:
            r0.unlock()
            goto L83
        L7b:
            java.lang.String r3 = "ROOM"
            java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
            android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L68
            goto L77
        L83:
            if (r1 == 0) goto Lbb
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lbb
            java.lang.Object r0 = r5.f25898e
            eؚؔ۠ r0 = (defpackage.C2436e) r0
            eْۤۚ r0 = r0.yandex
            monitor-enter(r0)
            java.lang.Object r1 = r5.f25898e     // Catch: java.lang.Throwable -> La6
            eؚؔ۠ r1 = (defpackage.C2436e) r1     // Catch: java.lang.Throwable -> La6
            eْۤۚ r1 = r1.yandex     // Catch: java.lang.Throwable -> La6
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La6
            eؙۛٗ r1 = (defpackage.C6652e) r1     // Catch: java.lang.Throwable -> La6
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> La6
            if (r2 != 0) goto La8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            goto Lbb
        La6:
            r1 = move-exception
            goto Lb9
        La8:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> La6
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> La6
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> La6
            eَْٗ r1 = (defpackage.AbstractC13299e) r1     // Catch: java.lang.Throwable -> La6
            r1.getClass()     // Catch: java.lang.Throwable -> La6
            r1 = 0
            throw r1     // Catch: java.lang.Throwable -> La6
        Lb9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            throw r1
        Lbb:
            return
        Lbc:
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC12991e.metrica():void");
    }

    private final void purchase() {
        AbstractC6552e vip;
        long j;
        AbstractC6552e vip2;
        C14899e c14899e = (C14899e) this.f25898e;
        synchronized (c14899e) {
            c14899e.billing++;
            vip = c14899e.vip();
        }
        if (vip == null) {
            return;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        while (true) {
            try {
                currentThread.setName(vip.ad);
                Logger logger = ((C14899e) this.f25898e).vip;
                C10497e c10497e = vip.metrica;
                boolean isLoggable = logger.isLoggable(Level.FINE);
                if (isLoggable) {
                    C14899e c14899e2 = c10497e.ad;
                    j = System.nanoTime();
                    AbstractC0326e.ad(logger, vip, c10497e, "starting");
                } else {
                    j = -1;
                }
                try {
                    long ad = vip.ad();
                    if (isLoggable) {
                        C14899e c14899e3 = c10497e.ad;
                        AbstractC0326e.ad(logger, vip, c10497e, "finished run in " + AbstractC0326e.startapp(System.nanoTime() - j));
                    }
                    C14899e c14899e4 = (C14899e) this.f25898e;
                    synchronized (c14899e4) {
                        C14899e.ad(c14899e4, vip, ad, true);
                        vip2 = c14899e4.vip();
                    }
                    if (vip2 == null) {
                        return;
                    } else {
                        vip = vip2;
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        C14899e c14899e5 = c10497e.ad;
                        AbstractC0326e.ad(logger, vip, c10497e, "failed a run in " + AbstractC0326e.startapp(System.nanoTime() - j));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    C14899e c14899e6 = (C14899e) this.f25898e;
                    synchronized (c14899e6) {
                        C14899e.ad(c14899e6, vip, -1L, false);
                        Unit unit = Unit.INSTANCE;
                        if (!(th2 instanceof InterruptedException)) {
                            throw th2;
                        }
                        Thread.currentThread().interrupt();
                        return;
                    }
                } finally {
                    currentThread.setName(name);
                }
            }
        }
    }

    private final void vip() {
        while (true) {
            try {
                C0970e c0970e = (C0970e) ((ReferenceQueue) this.f25898e).remove();
                synchronized (c0970e.ad) {
                    try {
                        if (c0970e.vip.compareAndSet(false, true)) {
                            long j = c0970e.metrica;
                            int i = AbstractC6026e.ad;
                            realmcJNI.realm_release(j);
                        }
                        Unit unit = Unit.INSTANCE;
                    } finally {
                    }
                }
                C0970e.purchase.premium(c0970e);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                System.out.println((Object) "The FinalizerRunnable thread has been interrupted. Native resources cannot be freed anymore");
                return;
            }
        }
    }

    public HashSet ad() {
        HashSet hashSet = new HashSet();
        Cursor billing = ((C2436e) this.f25898e).metrica.billing(new C15400e("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", 3));
        while (billing.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(billing.getInt(0)));
            } catch (Throwable th) {
                billing.close();
                throw th;
            }
        }
        billing.close();
        if (!hashSet.isEmpty()) {
            ((C2436e) this.f25898e).purchase.crashlytics();
        }
        return hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        r4.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        defpackage.AbstractC9464e.mopub("SequentialExecutor", "Exception while executing runnable " + r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        if (r1 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void billing() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f25898e     // Catch: java.lang.Throwable -> L4f
            eًّؕ r2 = (defpackage.ExecutorC12245e) r2     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayDeque r2 = r2.f24578e     // Catch: java.lang.Throwable -> L4f
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L4f
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f25898e     // Catch: java.lang.Throwable -> L20
            eًّؕ r0 = (defpackage.ExecutorC12245e) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f24577e     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L44
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L44
        L20:
            r0 = move-exception
            goto L69
        L22:
            long r6 = r0.f24574e     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f24574e = r6     // Catch: java.lang.Throwable -> L20
            r0.f24577e = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f25898e     // Catch: java.lang.Throwable -> L20
            eًّؕ r4 = (defpackage.ExecutorC12245e) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f24578e     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L45
            java.lang.Object r0 = r10.f25898e     // Catch: java.lang.Throwable -> L20
            eًّؕ r0 = (defpackage.ExecutorC12245e) r0     // Catch: java.lang.Throwable -> L20
            r0.f24577e = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L44
            goto L18
        L44:
            return
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4f
            r1 = r1 | r2
            r4.run()     // Catch: java.lang.Throwable -> L4f java.lang.RuntimeException -> L51
            goto L2
        L4f:
            r0 = move-exception
            goto L6b
        L51:
            r2 = move-exception
            java.lang.String r3 = "SequentialExecutor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r5.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = "Exception while executing runnable "
            r5.append(r6)     // Catch: java.lang.Throwable -> L4f
            r5.append(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L4f
            defpackage.AbstractC9464e.mopub(r3, r4, r2)     // Catch: java.lang.Throwable -> L4f
            goto L2
        L69:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L4f
        L6b:
            if (r1 == 0) goto L74
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L74:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC12991e.billing():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c5  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r13v2, types: [eًُ۟] */
    /* JADX WARN: Type inference failed for: r16v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v28, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r3v37, types: [int] */
    /* JADX WARN: Type inference failed for: r3v44, types: [int] */
    /* JADX WARN: Type inference failed for: r3v45 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC12991e.run():void");
    }
}
