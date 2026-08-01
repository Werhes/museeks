package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4602e implements Cloneable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C9059e f9913e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public boolean f9914e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f9915e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f9916e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f9917e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public boolean f9918e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public volatile C6613e f9919e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C8650e f9920e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public volatile boolean f9921e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public boolean f9922e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public boolean f9923e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public InterfaceC16718e f9924e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C6613e f9925e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f9926e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C16389e f9927e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C0177e f9928e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C1343e f9929e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f9930e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final AtomicBoolean f9931e;

    public C4602e(C1343e c1343e, C8650e c8650e, boolean z) {
        this.f9929e = c1343e;
        this.f9920e = c8650e;
        this.f9916e = z;
        this.f9927e = (C16389e) c1343e.crashlytics.f5914e;
        c1343e.license.getClass();
        C9059e c9059e = new C9059e(this);
        c9059e.billing(c1343e.tapsense, TimeUnit.MILLISECONDS);
        this.f9913e = c9059e;
        this.f9931e = new AtomicBoolean();
        this.f9923e = true;
        this.f9926e = new CopyOnWriteArrayList();
        new AtomicReference(c8650e.appmetrica);
    }

    public static final String ad(C4602e c4602e) {
        StringBuilder sb = new StringBuilder();
        sb.append(c4602e.f9921e ? "canceled " : BuildConfig.FLAVOR);
        sb.append(c4602e.f9916e ? "web socket" : "call");
        sb.append(" to ");
        sb.append(c4602e.f9920e.ad.billing());
        return sb.toString();
    }

    public final IOException adcel(IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                if (this.f9923e) {
                    this.f9923e = false;
                    if (!this.f9915e && !this.f9914e && !this.f9918e && !this.f9922e) {
                        z = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z ? metrica(iOException) : iOException;
    }

    public final void appmetrica(InterfaceC14187e interfaceC14187e) {
        if (!this.f9931e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        AbstractC18303e abstractC18303e = AbstractC18303e.ad;
        this.f9930e = AbstractC18303e.ad.yandex();
        C11980e c11980e = this.f9929e.ad;
        RunnableC11790e runnableC11790e = new RunnableC11790e(this, interfaceC14187e);
        c11980e.getClass();
        C11980e.m3289catch(c11980e, runnableC11790e, null, null, 6);
    }

    public final void billing(boolean z) {
        C6613e c6613e;
        synchronized (this) {
            if (!this.f9923e) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z && (c6613e = this.f9919e) != null) {
            ((InterfaceC8246e) c6613e.f13645e).cancel();
            ((C4602e) c6613e.f13643e).startapp(c6613e, true, true, true, true, null);
        }
        this.f9925e = null;
    }

    public final Object clone() {
        return new C4602e(this.f9929e, this.f9920e, this.f9916e);
    }

    public final void license() {
        if (this.f9921e) {
            return;
        }
        this.f9921e = true;
        C6613e c6613e = this.f9919e;
        if (c6613e != null) {
            ((InterfaceC8246e) c6613e.f13645e).cancel();
        }
        Iterator it = this.f9926e.iterator();
        while (it.hasNext()) {
            ((InterfaceC1753e) it.next()).cancel();
        }
    }

    public final IOException metrica(IOException iOException) {
        Socket mopub;
        TimeZone timeZone = AbstractC16286e.ad;
        C0177e c0177e = this.f9928e;
        if (c0177e != null) {
            synchronized (c0177e) {
                mopub = mopub();
            }
            if (this.f9928e == null) {
                if (mopub != null) {
                    AbstractC16286e.metrica(mopub);
                }
            } else if (mopub != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f9917e || !this.f9913e.startapp()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final Socket mopub() {
        C0177e c0177e = this.f9928e;
        TimeZone timeZone = AbstractC16286e.ad;
        ArrayList arrayList = c0177e.Signature;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (AbstractC7890e.billing(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.f9928e = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        c0177e.admob = System.nanoTime();
        C16389e c16389e = this.f9927e;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c16389e.f32195e;
        C10497e c10497e = (C10497e) c16389e.f32194e;
        TimeZone timeZone2 = AbstractC16286e.ad;
        if (!c0177e.adcel) {
            c10497e.license((C14799e) c16389e.f32193e, 0L);
            return null;
        }
        c0177e.adcel = true;
        concurrentLinkedQueue.remove(c0177e);
        if (concurrentLinkedQueue.isEmpty()) {
            c10497e.ad();
        }
        return c0177e.appmetrica;
    }

    public final C11058e purchase() {
        if (!this.f9931e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f9913e.yandex();
        AbstractC18303e abstractC18303e = AbstractC18303e.ad;
        this.f9930e = AbstractC18303e.ad.yandex();
        try {
            C11980e c11980e = this.f9929e.ad;
            synchronized (c11980e) {
                ((ArrayDeque) c11980e.f23948e).add(this);
            }
            return yandex();
        } finally {
            C11980e c11980e2 = this.f9929e.ad;
            c11980e2.getClass();
            C11980e.m3289catch(c11980e2, null, this, null, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:54:0x000e, B:10:0x002a, B:12:0x002e, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:19:0x003d, B:21:0x0041, B:23:0x0045, B:27:0x004e, B:31:0x0058, B:7:0x0018, B:47:0x001e, B:50:0x0024), top: B:53:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:54:0x000e, B:10:0x002a, B:12:0x002e, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:19:0x003d, B:21:0x0041, B:23:0x0045, B:27:0x004e, B:31:0x0058, B:7:0x0018, B:47:0x001e, B:50:0x0024), top: B:53:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:54:0x000e, B:10:0x002a, B:12:0x002e, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:19:0x003d, B:21:0x0041, B:23:0x0045, B:27:0x004e, B:31:0x0058, B:7:0x0018, B:47:0x001e, B:50:0x0024), top: B:53:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:54:0x000e, B:10:0x002a, B:12:0x002e, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:19:0x003d, B:21:0x0041, B:23:0x0045, B:27:0x004e, B:31:0x0058, B:7:0x0018, B:47:0x001e, B:50:0x0024), top: B:53:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.IOException startapp(defpackage.C6613e r3, boolean r4, boolean r5, boolean r6, boolean r7, java.io.IOException r8) {
        /*
            r2 = this;
            eؙۘۚ r0 = r2.f9919e
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La
            goto L6e
        La:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L16
            boolean r0 = r2.f9915e     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L28
            goto L16
        L13:
            r3 = move-exception
            goto L6f
        L16:
            if (r5 == 0) goto L1c
            boolean r0 = r2.f9914e     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L28
        L1c:
            if (r7 == 0) goto L22
            boolean r0 = r2.f9918e     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L28
        L22:
            if (r6 == 0) goto L57
            boolean r0 = r2.f9922e     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L57
        L28:
            if (r4 == 0) goto L2c
            r2.f9915e = r3     // Catch: java.lang.Throwable -> L13
        L2c:
            if (r5 == 0) goto L30
            r2.f9914e = r3     // Catch: java.lang.Throwable -> L13
        L30:
            if (r7 == 0) goto L34
            r2.f9918e = r3     // Catch: java.lang.Throwable -> L13
        L34:
            if (r6 == 0) goto L38
            r2.f9922e = r3     // Catch: java.lang.Throwable -> L13
        L38:
            boolean r4 = r2.f9915e     // Catch: java.lang.Throwable -> L13
            r5 = 1
            if (r4 != 0) goto L4b
            boolean r4 = r2.f9914e     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L4b
            boolean r4 = r2.f9918e     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L4b
            boolean r4 = r2.f9922e     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L4b
            r4 = r5
            goto L4c
        L4b:
            r4 = r3
        L4c:
            if (r4 == 0) goto L53
            boolean r6 = r2.f9923e     // Catch: java.lang.Throwable -> L13
            if (r6 != 0) goto L53
            r3 = r5
        L53:
            r1 = r4
            r4 = r3
            r3 = r1
            goto L58
        L57:
            r4 = r3
        L58:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            if (r3 == 0) goto L67
            r3 = 0
            r2.f9919e = r3
            eًؑؕ r3 = r2.f9928e
            if (r3 == 0) goto L67
            r3.billing()
        L67:
            if (r4 == 0) goto L6e
            java.io.IOException r3 = r2.metrica(r8)
            return r3
        L6e:
            return r8
        L6f:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4602e.startapp(eؙۘۚ, boolean, boolean, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final void vip(C0177e c0177e) {
        TimeZone timeZone = AbstractC16286e.ad;
        if (this.f9928e != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f9928e = c0177e;
        c0177e.Signature.add(new C14793e(this, this.f9930e));
    }

    public final C11058e yandex() {
        ArrayList arrayList = new ArrayList();
        AbstractC13480e.inmobi(arrayList, this.f9929e.vip);
        arrayList.add(new C6099e(2, this.f9929e));
        arrayList.add(new C6099e(0, this.f9929e.adcel));
        arrayList.add(new C8852e(2));
        arrayList.add(C8852e.metrica);
        if (!this.f9916e) {
            AbstractC13480e.inmobi(arrayList, this.f9929e.metrica);
        }
        arrayList.add(C8852e.vip);
        C8650e c8650e = this.f9920e;
        C1343e c1343e = this.f9929e;
        boolean z = false;
        try {
            try {
                C11058e purchase = new C9840e(this, arrayList, 0, null, c8650e, c1343e.isVip, c1343e.inmobi, c1343e.isPro).purchase(c8650e);
                if (this.f9921e) {
                    AbstractC10220e.vip(purchase);
                    throw new IOException("Canceled");
                }
                adcel(null);
                return purchase;
            } catch (IOException e) {
                z = true;
                throw adcel(e);
            }
        } catch (Throwable th) {
            if (!z) {
                adcel(null);
            }
            throw th;
        }
    }
}
