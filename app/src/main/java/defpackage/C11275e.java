package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۛۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11275e {
    public C9576e appmetrica;
    public final Object ad = new Object();
    public final HashMap vip = new HashMap();
    public final HashMap metrica = new HashMap();
    public final ArrayDeque license = new ArrayDeque();

    public final void ad(C1874e c1874e, C17469e c17469e, C9576e c9576e) {
        synchronized (this.ad) {
            try {
                AbstractC4265e.metrica(!c17469e.purchase.isEmpty());
                this.appmetrica = c9576e;
                InterfaceC16400e remoteconfig = c1874e.remoteconfig();
                purchase(remoteconfig);
                C18367e metrica = metrica(remoteconfig);
                if (metrica == null) {
                    return;
                }
                Set set = (Set) this.metrica.get(metrica);
                C9576e c9576e2 = this.appmetrica;
                if (c9576e2 == null || c9576e2.vip() != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        C1874e c1874e2 = (C1874e) this.vip.get((C11470e) it.next());
                        c1874e2.getClass();
                        if (!c1874e2.equals(c1874e) && !c1874e2.pro().isEmpty()) {
                            if (c1874e2.tapsense() || c17469e.vip()) {
                                throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                            }
                            c1874e2.isPro();
                        }
                    }
                }
                try {
                    c1874e.metrica(c17469e);
                    if (((C4891e) remoteconfig.vip()).license.ad(EnumC7785e.f15779e)) {
                        yandex(remoteconfig);
                    }
                } catch (C15735e e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void adcel(InterfaceC16400e interfaceC16400e) {
        synchronized (this.ad) {
            try {
                C18367e metrica = metrica(interfaceC16400e);
                if (metrica == null) {
                    return;
                }
                Iterator it = ((Set) this.metrica.get(metrica)).iterator();
                while (it.hasNext()) {
                    C1874e c1874e = (C1874e) this.vip.get((C11470e) it.next());
                    c1874e.getClass();
                    c1874e.isVip();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Set] */
    public final void advert(HashSet hashSet) {
        HashSet hashSet2 = hashSet;
        synchronized (this.ad) {
            if (hashSet == null) {
                try {
                    hashSet2 = this.vip.keySet();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                C1874e c1874e = (C1874e) this.vip.get((C11470e) it.next());
                if (c1874e != null) {
                    c1874e.isPro();
                    startapp(c1874e.remoteconfig());
                }
            }
        }
    }

    public final void amazon(InterfaceC16400e interfaceC16400e) {
        synchronized (this.ad) {
            try {
                C18367e metrica = metrica(interfaceC16400e);
                if (metrica == null) {
                    return;
                }
                startapp(interfaceC16400e);
                Iterator it = ((Set) this.metrica.get(metrica)).iterator();
                while (it.hasNext()) {
                    this.vip.remove((C11470e) it.next());
                }
                this.metrica.remove(metrica);
                metrica.f36043e.vip().vip(metrica);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean appmetrica(InterfaceC16400e interfaceC16400e) {
        synchronized (this.ad) {
            try {
                C18367e metrica = metrica(interfaceC16400e);
                if (metrica == null) {
                    return false;
                }
                Iterator it = ((Set) this.metrica.get(metrica)).iterator();
                while (it.hasNext()) {
                    C1874e c1874e = (C1874e) this.vip.get((C11470e) it.next());
                    c1874e.getClass();
                    if (!c1874e.pro().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void billing(C1874e c1874e) {
        synchronized (this.ad) {
            try {
                InterfaceC16400e remoteconfig = c1874e.remoteconfig();
                C11470e c11470e = new C11470e(System.identityHashCode(remoteconfig), c1874e.f4999e.f20344e);
                C18367e metrica = metrica(remoteconfig);
                Set hashSet = metrica != null ? (Set) this.metrica.get(metrica) : new HashSet();
                hashSet.add(c11470e);
                this.vip.put(c11470e, c1874e);
                if (metrica == null) {
                    C18367e c18367e = new C18367e(remoteconfig, this);
                    this.metrica.put(c18367e, hashSet);
                    remoteconfig.vip().ad(c18367e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Collection license() {
        Collection unmodifiableCollection;
        synchronized (this.ad) {
            unmodifiableCollection = DesugarCollections.unmodifiableCollection(this.vip.values());
        }
        return unmodifiableCollection;
    }

    public final void loadAd(InterfaceC16400e interfaceC16400e) {
        synchronized (this.ad) {
            try {
                Iterator it = ((Set) this.metrica.get(metrica(interfaceC16400e))).iterator();
                while (it.hasNext()) {
                    C1874e c1874e = (C1874e) this.vip.get((C11470e) it.next());
                    c1874e.getClass();
                    if (!c1874e.pro().isEmpty()) {
                        c1874e.applovin();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C18367e metrica(InterfaceC16400e interfaceC16400e) {
        synchronized (this.ad) {
            try {
                for (C18367e c18367e : this.metrica.keySet()) {
                    if (interfaceC16400e.equals(c18367e.f36043e)) {
                        return c18367e;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Set] */
    public final void mopub(C17469e c17469e, HashSet hashSet) {
        HashSet<C11470e> hashSet2 = hashSet;
        synchronized (this.ad) {
            if (hashSet == null) {
                try {
                    hashSet2 = this.vip.keySet();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (C11470e c11470e : hashSet2) {
                if (this.vip.containsKey(c11470e)) {
                    C1874e c1874e = (C1874e) this.vip.get(c11470e);
                    boolean isEmpty = c1874e.pro().isEmpty();
                    c1874e.inmobi(c17469e);
                    if (!isEmpty && c1874e.pro().isEmpty()) {
                        startapp(c1874e.remoteconfig());
                    }
                }
            }
        }
    }

    public final void purchase(InterfaceC16400e interfaceC16400e) {
        HashMap hashMap;
        C9205e c9205e;
        C18367e metrica = metrica(interfaceC16400e);
        if (metrica == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        Set set = (Set) this.metrica.get(metrica);
        Objects.requireNonNull(set);
        Iterator it = set.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = this.vip;
            if (!hasNext) {
                break;
            }
            C11470e c11470e = (C11470e) it.next();
            C1874e c1874e = (C1874e) hashMap.get(c11470e);
            if (c1874e != null) {
                C10302e c10302e = c1874e.f4999e;
                if (c10302e.f20346e.f18387e.mopub() || ((c9205e = c10302e.f20337e) != null && c9205e.f18387e.mopub())) {
                    hashSet.add(c11470e);
                }
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        AbstractC9464e.remoteconfig("LifecycleCameraRepository", "Removing " + hashSet.size() + " stale LifecycleCamera(s).");
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            C1874e c1874e2 = (C1874e) hashMap.get((C11470e) it2.next());
            Objects.requireNonNull(c1874e2);
            smaato(c1874e2);
        }
    }

    public final void smaato(C1874e c1874e) {
        synchronized (this.ad) {
            try {
                InterfaceC16400e remoteconfig = c1874e.remoteconfig();
                C11470e c11470e = new C11470e(System.identityHashCode(remoteconfig), c1874e.f4999e.f20344e);
                this.vip.remove(c11470e);
                HashSet hashSet = new HashSet();
                for (C18367e c18367e : this.metrica.keySet()) {
                    if (remoteconfig.equals(c18367e.f36043e)) {
                        Set set = (Set) this.metrica.get(c18367e);
                        set.remove(c11470e);
                        if (set.isEmpty()) {
                            hashSet.add(c18367e.f36043e);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    amazon((InterfaceC16400e) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void startapp(InterfaceC16400e interfaceC16400e) {
        synchronized (this.ad) {
            try {
                this.license.remove(interfaceC16400e);
                adcel(interfaceC16400e);
                if (!this.license.isEmpty()) {
                    loadAd((InterfaceC16400e) this.license.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C1874e vip(InterfaceC16400e interfaceC16400e, C10302e c10302e, C4909e c4909e) {
        synchronized (this.ad) {
            try {
                AbstractC4265e.license(this.vip.get(new C11470e(System.identityHashCode(interfaceC16400e), c10302e.f20344e)) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                C1874e c1874e = new C1874e(interfaceC16400e, c10302e, c4909e);
                if (((ArrayList) c10302e.premium()).isEmpty()) {
                    c1874e.isVip();
                }
                if (((C4891e) interfaceC16400e.vip()).license == EnumC7785e.f15780e) {
                    return c1874e;
                }
                billing(c1874e);
                return c1874e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void yandex(InterfaceC16400e interfaceC16400e) {
        synchronized (this.ad) {
            try {
                if (appmetrica(interfaceC16400e)) {
                    if (this.license.isEmpty()) {
                        this.license.push(interfaceC16400e);
                    } else {
                        C9576e c9576e = this.appmetrica;
                        if (c9576e == null || c9576e.vip() != 2) {
                            InterfaceC16400e interfaceC16400e2 = (InterfaceC16400e) this.license.peek();
                            if (!interfaceC16400e.equals(interfaceC16400e2)) {
                                adcel(interfaceC16400e2);
                                this.license.remove(interfaceC16400e);
                                this.license.push(interfaceC16400e);
                            }
                        }
                    }
                    loadAd(interfaceC16400e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
