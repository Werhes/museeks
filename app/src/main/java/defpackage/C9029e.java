package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ۠ٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9029e {
    public final Executor ad;
    public ScheduledFuture appmetrica;
    public C3862e billing;
    public C6797e purchase;
    public C16722e startapp;
    public final ScheduledExecutorServiceC5380e vip;
    public C8765e yandex;
    public final Object metrica = new Object();
    public final Object license = new Object();
    public final C17449e adcel = new C17449e(0, this);
    public volatile Object mopub = C13664e.f27089e;
    public final AtomicBoolean advert = new AtomicBoolean(false);
    public final CopyOnWriteArrayList smaato = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList amazon = new CopyOnWriteArrayList();
    public final LinkedHashMap loadAd = new LinkedHashMap();

    public C9029e(Executor executor, ScheduledExecutorServiceC5380e scheduledExecutorServiceC5380e) {
        this.ad = executor;
        this.vip = scheduledExecutorServiceC5380e;
    }

    public final void ad() {
        synchronized (this.metrica) {
            if (this.loadAd.isEmpty()) {
                return;
            }
            Map advert = AbstractC10064e.advert(this.loadAd);
            this.loadAd.clear();
            Unit unit = Unit.INSTANCE;
            C3862e c3862e = this.billing;
            if (c3862e != null) {
                LinkedHashSet<InterfaceC2881e> license = c3862e.license();
                ArrayList arrayList = new ArrayList();
                for (InterfaceC2881e interfaceC2881e : license) {
                    InterfaceC12424e subscription = interfaceC2881e != null ? interfaceC2881e.subscription() : null;
                    if (subscription != null) {
                        arrayList.add(subscription);
                    }
                }
                AbstractC9464e.yandex("CameraPresencePrvdr", "Clearing all " + advert.size() + " state observers.");
                for (Map.Entry entry : advert.entrySet()) {
                    AbstractC3062e.amazon().execute(new RunnableC4904e(8, arrayList, (InterfaceC2994e) entry.getValue(), (String) entry.getKey()));
                }
            }
        }
    }

    public final void appmetrica(int i, List list) {
        if (i > 0 && this.advert.get()) {
            this.appmetrica = this.vip.schedule(new RunnableC5563e(this, list, i, 0), i == 3 ? 0L : 400L, TimeUnit.MILLISECONDS);
        } else if (i <= 0) {
            AbstractC9464e.remoteconfig("CameraPresencePrvdr", "Exhausted all retries for camera list refresh.");
        }
    }

    public final void billing() {
        if (!this.advert.getAndSet(false)) {
            AbstractC9464e.yandex("CameraPresencePrvdr", "Shutdown called when not monitoring. Ignoring.");
            return;
        }
        AbstractC9464e.advert("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
        synchronized (this.license) {
            try {
                ScheduledFuture scheduledFuture = this.appmetrica;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.appmetrica = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        C8765e c8765e = this.yandex;
        if (c8765e != null) {
            c8765e.loadAd(this.adcel);
        }
        ad();
        this.startapp = null;
        this.smaato.clear();
        this.amazon.clear();
        this.mopub = C13664e.f27089e;
        this.purchase = null;
        this.billing = null;
    }

    public final void license(String str) {
        synchronized (this.metrica) {
            InterfaceC2994e interfaceC2994e = (InterfaceC2994e) this.loadAd.remove(str);
            C3862e c3862e = this.billing;
            if (interfaceC2994e != null && c3862e != null) {
                try {
                    AbstractC3062e.amazon().execute(new RunnableC16019e(c3862e.metrica(str), interfaceC2994e, 15));
                    AbstractC9464e.yandex("CameraPresencePrvdr", "Removed state observer for: " + str);
                } catch (IllegalArgumentException unused) {
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void metrica(Set set, Set set2) {
        boolean isEmpty = set.isEmpty();
        CopyOnWriteArrayList copyOnWriteArrayList = this.amazon;
        if (!isEmpty) {
            AbstractC9464e.advert("CameraPresencePrvdr", "Notifying " + set.size() + " cameras added.");
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C1342e c1342e = (C1342e) it.next();
                c1342e.vip.execute(new RunnableC5512e(c1342e, set));
            }
        }
        if (set2.isEmpty()) {
            return;
        }
        AbstractC9464e.advert("CameraPresencePrvdr", "Notifying " + set2.size() + " cameras removed.");
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            C1342e c1342e2 = (C1342e) it2.next();
            c1342e2.vip.execute(new RunnableC16019e(c1342e2, set2, 14));
        }
    }

    public final void purchase(InterfaceC12424e interfaceC12424e) {
        final String billing = interfaceC12424e.billing();
        if (this.advert.get()) {
            synchronized (this.metrica) {
                if (this.loadAd.containsKey(billing)) {
                    return;
                }
                InterfaceC2994e interfaceC2994e = new InterfaceC2994e() { // from class: eؒۡٙ
                    @Override // defpackage.InterfaceC2994e
                    public final void ad(Object obj) {
                        C0088e c0088e = (C0088e) obj;
                        C9029e c9029e = C9029e.this;
                        if (!c9029e.advert.get()) {
                            AbstractC9464e.yandex("CameraPresencePrvdr", "Ignore camera state change handling since already stop monitoring");
                            return;
                        }
                        if (c0088e.vip != null) {
                            StringBuilder applovin = AbstractC8703e.applovin("Camera ", billing, " state changed to ");
                            applovin.append(AbstractC17861e.ads(c0088e.ad));
                            applovin.append(" with error: ");
                            C12040e c12040e = c0088e.vip;
                            applovin.append(c12040e != null ? Integer.valueOf(c12040e.ad) : null);
                            applovin.append(". Triggering refresh.");
                            AbstractC9464e.remoteconfig("CameraPresencePrvdr", applovin.toString());
                            c9029e.ad.execute(new RunnableC1399e(c9029e, 1));
                        }
                    }
                };
                AbstractC3062e.amazon().execute(new RunnableC16019e(interfaceC12424e, interfaceC2994e, 16));
                this.loadAd.put(billing, interfaceC2994e);
                AbstractC9464e.yandex("CameraPresencePrvdr", "Registered state observer for camera: ".concat(billing));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void vip(String str) {
        C3862e c3862e = this.billing;
        if (c3862e == null) {
            return;
        }
        try {
            purchase(c3862e.metrica(str).subscription());
        } catch (IllegalArgumentException unused) {
            AbstractC9464e.remoteconfig("CameraPresencePrvdr", "CameraInternal not found for " + str + ". Cannot setup state observer.");
        }
    }

    public final void yandex(C16722e c16722e, C6797e c6797e, C3862e c3862e) {
        if (this.advert.compareAndSet(false, true)) {
            AbstractC9464e.advert("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
            this.startapp = c16722e;
            Set vip = c6797e.vip();
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(vip, 10));
            Iterator it = vip.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC11906e.yandex((String) it.next(), null, null));
            }
            this.mopub = arrayList;
            this.purchase = c6797e;
            this.billing = c3862e;
            this.yandex = c6797e.purchase;
            this.ad.execute(new RunnableC1399e(this, 2));
            C8765e c8765e = this.yandex;
            if (c8765e != null) {
                c8765e.metrica(new ExecutorC12245e(this.ad), this.adcel);
            }
        }
    }
}
