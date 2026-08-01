package defpackage;

import java.nio.file.ClosedWatchServiceException;
import java.nio.file.FileSystems;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُّۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12856e {
    public final C12344e ad;
    public final ArrayList adcel;
    public C5033e advert;
    public final C5363e amazon;
    public final ReentrantReadWriteLock appmetrica;
    public ClassLoader billing;
    public final C8422e license;
    public final C11467e metrica;
    public final C5363e mopub;
    public boolean purchase;
    public final C10709e smaato;
    public final Object startapp;
    public final C5389e vip;
    public Object yandex;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [eٌؑٙ, java.lang.Object] */
    public C12856e(C12344e c12344e, C10739e c10739e) {
        this.ad = c12344e;
        C11467e c11467e = (C11467e) c12344e.f24749e;
        C5389e c5389e = (C5389e) c11467e.f23071e;
        this.vip = c5389e;
        this.metrica = c11467e;
        ?? obj = new Object();
        Runtime.getRuntime().availableProcessors();
        obj.ad = 1000L;
        obj.vip = 5000L;
        obj.metrica = new ArrayList();
        obj.license = 45;
        c10739e.invoke(obj);
        this.license = obj;
        this.appmetrica = new ReentrantReadWriteLock();
        List list = C13664e.f27089e;
        this.yandex = list;
        C5891e m1243e = ((C3168e) c11467e.f23069e).m1243e("ktor.deployment.watch");
        List m1997interface = m1243e != null ? m1243e.m1997interface() : null;
        list = m1997interface != null ? m1997interface : list;
        this.startapp = list;
        this.adcel = AbstractC13480e.m3584final(list, (List) c12344e.f24748e);
        this.mopub = new C5363e(new C0996e(27));
        this.advert = new C5033e(c11467e, c12344e.f24750e, c5389e, (InterfaceC8850e) c12344e.f24753e, new C12781e(0, 2, C12856e.class, this, "engine", "getEngine()Lio/ktor/server/engine/ApplicationEngine;"));
        this.smaato = new C10709e(c11467e, c5389e, c12344e.f24750e, obj, new C17011e(0, this, C12856e.class, "currentApplication", "currentApplication()Lio/ktor/server/application/Application;", 0, 0, 21));
        this.amazon = new C5363e(new C0996e(28));
    }

    public static WatchService ad() {
        try {
            return FileSystems.getDefault().newWatchService();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    /* JADX WARN: Finally extract failed */
    public final C5033e appmetrica() {
        ArrayList billing;
        ReentrantReadWriteLock reentrantReadWriteLock = this.appmetrica;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            C5033e c5033e = this.advert;
            if (c5033e == null) {
                throw new IllegalStateException("EmbeddedServer was stopped");
            }
            if (this.ad.f24750e && (billing = billing()) != null && !billing.isEmpty()) {
                ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
                int i = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    readLock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    purchase();
                    C6571e license = license();
                    C5033e c5033e2 = (C5033e) license.f13544e;
                    ClassLoader classLoader = (ClassLoader) license.f13543e;
                    this.advert = c5033e2;
                    this.billing = classLoader;
                    Unit unit = Unit.INSTANCE;
                    while (i < readHoldCount) {
                        readLock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                    c5033e = this.advert;
                    if (c5033e == null) {
                        throw new IllegalStateException("EmbeddedServer was stopped");
                    }
                } catch (Throwable th) {
                    while (i < readHoldCount) {
                        readLock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                    throw th;
                }
            }
            readLock.unlock();
            return c5033e;
        } catch (Throwable th2) {
            readLock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.lang.Iterable] */
    public final ArrayList billing() {
        InterfaceC4911e interfaceC4911e = (InterfaceC4911e) this.metrica.f23070e;
        try {
            ?? r2 = this.yandex;
            ArrayList arrayList = new ArrayList();
            Iterator it = r2.iterator();
            while (it.hasNext()) {
                AbstractC13480e.inmobi(arrayList, ((WatchKey) it.next()).pollEvents());
            }
            if (!arrayList.isEmpty()) {
                interfaceC4911e.mopub("Changes in application detected.");
                int size = arrayList.size();
                while (true) {
                    Thread.sleep(200L);
                    ?? r4 = this.yandex;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = r4.iterator();
                    while (it2.hasNext()) {
                        AbstractC13480e.inmobi(arrayList2, ((WatchKey) it2.next()).pollEvents());
                    }
                    if (arrayList2.isEmpty()) {
                        break;
                    }
                    interfaceC4911e.billing("Waiting for more changes.");
                    size += arrayList2.size();
                }
                interfaceC4911e.billing("Changes to " + size + " files caused application restart.");
                Iterator it3 = AbstractC13480e.m3602switch(arrayList, 5).iterator();
                while (it3.hasNext()) {
                    interfaceC4911e.ad(((WatchEvent) it3.next()).context());
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            interfaceC4911e.adcel("Watch service was interrupted", e);
            return null;
        } catch (ClosedWatchServiceException e2) {
            interfaceC4911e.adcel("Watch service was closed", e2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C6571e license() {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12856e.license():eؙۖؕ");
    }

    public final void metrica() {
        try {
            WatchService startapp = C5275e.startapp(this.amazon.getValue());
            if (startapp != null) {
                startapp.close();
                Unit unit = Unit.INSTANCE;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [eًؗۖ] */
    /* JADX WARN: Type inference failed for: r2v1, types: [eَؚٚ] */
    /* JADX WARN: Type inference failed for: r2v11 */
    public final void purchase() {
        C5033e c5033e = this.advert;
        ClassLoader classLoader = this.billing;
        this.advert = null;
        this.billing = null;
        if (c5033e != null) {
            startapp(AbstractC4340e.billing, c5033e);
            try {
                try {
                    AbstractC5336e.yandex(C2693e.f6576e, new C6626e(this, c5033e, r2, 6));
                    C10356e c10356e = classLoader instanceof C10356e ? (C10356e) classLoader : null;
                    if (c10356e != null) {
                        c10356e.close();
                    }
                } catch (Throwable th) {
                    r2 = classLoader instanceof C10356e ? (C10356e) classLoader : 0;
                    if (r2 != 0) {
                        r2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                ((InterfaceC4911e) this.metrica.f23070e).license("Failed to destroy application instance.", th2);
            }
            startapp(AbstractC4340e.yandex, c5033e);
        }
        Iterator it = this.yandex.iterator();
        while (it.hasNext()) {
            ((WatchKey) it.next()).cancel();
        }
        this.yandex = new ArrayList();
    }

    public final void startapp(C1293e c1293e, C5033e c5033e) {
        try {
            this.vip.premium(c1293e, c5033e);
        } catch (Throwable th) {
            ((InterfaceC4911e) this.metrica.f23070e).adcel("One or more of the handlers thrown an exception", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vip(java.lang.String r6, defpackage.C2119e r7, defpackage.AbstractC10731e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.C0854e
            if (r0 == 0) goto L13
            r0 = r8
            eؒؖۤ r0 = (defpackage.C0854e) r0
            int r1 = r0.f3256e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3256e = r1
            goto L18
        L13:
            eؒؖۤ r0 = new eؒؖۤ
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f3259e
            int r1 = r0.f3256e
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.util.List r6 = r0.f3255e
            java.lang.String r7 = r0.f3257e
            defpackage.AbstractC2003e.purchase(r8)     // Catch: java.lang.Throwable -> L29
            goto L63
        L29:
            r8 = move-exception
            goto L6e
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.AbstractC2003e.purchase(r8)
            java.lang.ThreadLocal r8 = defpackage.AbstractC11132e.ad
            java.lang.Object r1 = r8.get()
            if (r1 != 0) goto L46
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            r8.set(r1)
        L46:
            r8 = r1
            java.util.List r8 = (java.util.List) r8
            boolean r1 = r8.contains(r6)
            if (r1 != 0) goto L72
            r8.add(r6)
            r0.f3257e = r6     // Catch: java.lang.Throwable -> L69
            r0.f3255e = r8     // Catch: java.lang.Throwable -> L69
            r0.f3256e = r2     // Catch: java.lang.Throwable -> L69
            java.lang.Object r7 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L69
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r7 != r0) goto L61
            return r0
        L61:
            r7 = r6
            r6 = r8
        L63:
            r6.remove(r7)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L69:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r8
            r8 = r4
        L6e:
            r6.remove(r7)
            throw r8
        L72:
            java.lang.String r7 = "Module startup is already in progress for function "
            java.lang.String r8 = " (recursive module startup from module main?)"
            java.lang.String r6 = defpackage.AbstractC5087e.m1746extends(r7, r6, r8)
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12856e.vip(java.lang.String, eؓۜۡ, eُؑ۠):java.lang.Object");
    }

    public final C5033e yandex(ClassLoader classLoader) {
        C5389e c5389e;
        C5033e c5033e;
        C5033e c5033e2;
        boolean z = this.purchase;
        C5389e c5389e2 = this.vip;
        if (z || (c5033e2 = this.advert) == null) {
            C12344e c12344e = this.ad;
            c5389e = c5389e2;
            c5033e = new C5033e(this.metrica, c12344e.f24750e, c5389e2, (InterfaceC8850e) c12344e.f24753e, new C12781e(0, 3, C12856e.class, this, "engine", "getEngine()Lio/ktor/server/engine/ApplicationEngine;"));
        } else {
            this.purchase = true;
            c5033e = c5033e2;
            c5389e = c5389e2;
        }
        startapp(AbstractC4340e.ad, c5033e);
        InterfaceC5083e interfaceC5083e = null;
        try {
            AbstractC5336e.yandex(C2693e.f6576e, new C15238e(new C12602e(this, c5033e, classLoader, interfaceC5083e, 1), interfaceC5083e, 26));
            c5389e.premium(AbstractC4340e.metrica, c5033e);
            c5389e.premium(AbstractC4340e.license, c5033e);
            return c5033e;
        } finally {
            ThreadLocal threadLocal = AbstractC11132e.ad;
            List list = (List) threadLocal.get();
            if (list != null && list.isEmpty()) {
                threadLocal.remove();
            }
        }
    }
}
