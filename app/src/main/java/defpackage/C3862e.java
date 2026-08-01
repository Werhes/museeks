package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؖؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3862e implements InterfaceC6343e {
    public C7169e appmetrica;
    public ListenableFuture license;
    public C6797e purchase;
    public final Object ad = new Object();
    public final LinkedHashMap vip = new LinkedHashMap();
    public final HashSet metrica = new HashSet();

    @Override // defpackage.InterfaceC6343e
    public final void ad(List list) {
        HashSet hashSet;
        HashMap hashMap = new HashMap();
        synchronized (this.ad) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.vip.keySet());
        }
        try {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                hashMap.put(str, this.purchase.metrica(str));
            }
            synchronized (this.ad) {
                try {
                    HashSet hashSet2 = new HashSet(this.vip.keySet());
                    hashSet2.removeAll(list);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add((InterfaceC2881e) this.vip.get((String) it2.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it3 = ((ArrayList) list).iterator();
                    while (it3.hasNext()) {
                        String str2 = (String) it3.next();
                        if (this.vip.containsKey(str2)) {
                            linkedHashMap.put(str2, (InterfaceC2881e) this.vip.get(str2));
                        } else {
                            linkedHashMap.put(str2, (InterfaceC2881e) hashMap.get(str2));
                        }
                    }
                    this.vip.clear();
                    this.vip.putAll(linkedHashMap);
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        InterfaceC2881e interfaceC2881e = (InterfaceC2881e) it4.next();
                        if (interfaceC2881e != null) {
                            interfaceC2881e.amazon();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (C12624e e) {
            throw new Exception("Failed to create CameraInternal", e);
        }
    }

    public final void appmetrica(C6797e c6797e) {
        this.purchase = c6797e;
        synchronized (this.ad) {
            try {
                for (String str : c6797e.vip()) {
                    AbstractC9464e.yandex("CameraRepository", "Added camera: " + str);
                    InterfaceC2881e interfaceC2881e = (InterfaceC2881e) this.vip.put(str, c6797e.metrica(str));
                    if (interfaceC2881e != null) {
                        interfaceC2881e.release();
                    }
                }
            } catch (C12624e e) {
                throw new Exception(e);
            }
        }
    }

    public final LinkedHashSet license() {
        LinkedHashSet linkedHashSet;
        synchronized (this.ad) {
            linkedHashSet = new LinkedHashSet(this.vip.values());
        }
        return linkedHashSet;
    }

    public final InterfaceC2881e metrica(String str) {
        InterfaceC2881e interfaceC2881e;
        synchronized (this.ad) {
            try {
                interfaceC2881e = (InterfaceC2881e) this.vip.get(str);
                if (interfaceC2881e == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC2881e;
    }

    public final ListenableFuture vip() {
        synchronized (this.ad) {
            try {
                if (this.vip.isEmpty()) {
                    ListenableFuture listenableFuture = this.license;
                    if (listenableFuture == null) {
                        listenableFuture = C4065e.f9036e;
                    }
                    return listenableFuture;
                }
                ListenableFuture listenableFuture2 = this.license;
                if (listenableFuture2 == null) {
                    listenableFuture2 = AbstractC5750e.purchase(new C0211e(6, this));
                    this.license = listenableFuture2;
                }
                this.metrica.addAll(this.vip.values());
                for (InterfaceC2881e interfaceC2881e : this.vip.values()) {
                    interfaceC2881e.release().ad(new RunnableC16019e(this, interfaceC2881e, 17), AbstractC3062e.billing());
                }
                this.vip.clear();
                return listenableFuture2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
