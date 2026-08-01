package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.loadAd;
import androidx.recyclerview.widget.startapp;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۖٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17199e extends startapp {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C14052e f33723e;

    public C17199e(C13875e c13875e, startapp... startappVarArr) {
        List asList = Arrays.asList(startappVarArr);
        this.f33723e = new C14052e(this, c13875e);
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            ads((startapp) it.next());
        }
        boolean z = this.f33723e.vip != 1;
        if (this.f590e.ad()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f589e = z;
    }

    public final void ads(startapp startappVar) {
        C14052e c14052e = this.f33723e;
        c14052e.ad(c14052e.license.size(), startappVar);
    }

    @Override // androidx.recyclerview.widget.startapp
    public final void applovin(loadAd loadad) {
        C14052e c14052e = this.f33723e;
        IdentityHashMap identityHashMap = (IdentityHashMap) c14052e.billing;
        C7431e c7431e = (C7431e) identityHashMap.get(loadad);
        if (c7431e != null) {
            c7431e.metrica.applovin(loadad);
            identityHashMap.remove(loadad);
        } else {
            throw new IllegalStateException("Cannot find wrapper for " + loadad + ", seems like it is not bound by this adapter: " + c14052e);
        }
    }

    @Override // androidx.recyclerview.widget.startapp
    public final int billing() {
        Iterator it = this.f33723e.license.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C7431e) it.next()).appmetrica;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.startapp
    public final void inmobi(loadAd loadad) {
        this.f33723e.yandex(loadad).metrica.inmobi(loadad);
    }

    @Override // androidx.recyclerview.widget.startapp
    public final void isPro(loadAd loadad) {
        this.f33723e.yandex(loadad).metrica.isPro(loadad);
    }

    @Override // androidx.recyclerview.widget.startapp
    public final boolean isVip(loadAd loadad) {
        C14052e c14052e = this.f33723e;
        IdentityHashMap identityHashMap = (IdentityHashMap) c14052e.billing;
        C7431e c7431e = (C7431e) identityHashMap.get(loadad);
        if (c7431e != null) {
            boolean isVip = c7431e.metrica.isVip(loadad);
            identityHashMap.remove(loadad);
            return isVip;
        }
        throw new IllegalStateException("Cannot find wrapper for " + loadad + ", seems like it is not bound by this adapter: " + c14052e);
    }

    public final List premium() {
        List list;
        ArrayList arrayList = this.f33723e.license;
        if (arrayList.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C7431e) it.next()).metrica);
            }
            list = arrayList2;
        }
        return DesugarCollections.unmodifiableList(list);
    }

    @Override // androidx.recyclerview.widget.startapp
    public final int purchase(startapp startappVar, loadAd loadad, int i) {
        C14052e c14052e = this.f33723e;
        C7431e c7431e = (C7431e) ((IdentityHashMap) c14052e.billing).get(loadad);
        if (c7431e == null) {
            return -1;
        }
        startapp startappVar2 = c7431e.metrica;
        int appmetrica = i - c14052e.appmetrica(c7431e);
        int billing = startappVar2.billing();
        if (appmetrica >= 0 && appmetrica < billing) {
            return startappVar2.purchase(startappVar, loadad, appmetrica);
        }
        StringBuilder pro = AbstractC17861e.pro(appmetrica, billing, "Detected inconsistent adapter updates. The local position of the view holder maps to ", " which is out of bounds for the adapter with size ", ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        pro.append(loadad);
        pro.append("adapter:");
        pro.append(startappVar);
        throw new IllegalStateException(pro.toString());
    }

    @Override // androidx.recyclerview.widget.startapp
    public final void remoteconfig(loadAd loadad, int i) {
        C14052e c14052e = this.f33723e;
        crashlytics billing = c14052e.billing(i);
        ((IdentityHashMap) c14052e.billing).put(loadad, (C7431e) billing.f1119e);
        C7431e c7431e = (C7431e) billing.f1119e;
        c7431e.metrica.appmetrica(loadad, billing.f1117e);
        billing.f1118e = false;
        billing.f1119e = null;
        billing.f1117e = -1;
        c14052e.yandex = billing;
    }

    @Override // androidx.recyclerview.widget.startapp
    public final loadAd signatures(ViewGroup viewGroup, int i) {
        C7431e appmetrica = ((InterfaceC17064e) this.f33723e.purchase).appmetrica(i);
        return appmetrica.metrica.signatures(viewGroup, appmetrica.ad.isPro(i));
    }

    @Override // androidx.recyclerview.widget.startapp
    public final int startapp(int i) {
        C14052e c14052e = this.f33723e;
        crashlytics billing = c14052e.billing(i);
        C7431e c7431e = (C7431e) billing.f1119e;
        int applovin = c7431e.ad.applovin(c7431e.metrica.startapp(billing.f1117e));
        billing.f1118e = false;
        billing.f1119e = null;
        billing.f1117e = -1;
        c14052e.yandex = billing;
        return applovin;
    }

    public final void subs(startapp startappVar) {
        C14052e c14052e = this.f33723e;
        ArrayList arrayList = c14052e.license;
        int startapp = c14052e.startapp(startappVar);
        if (startapp == -1) {
            return;
        }
        C7431e c7431e = (C7431e) arrayList.get(startapp);
        int appmetrica = c14052e.appmetrica(c7431e);
        arrayList.remove(startapp);
        ((C17199e) c14052e.appmetrica).admob(appmetrica, c7431e.appmetrica);
        Iterator it = c14052e.metrica.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                startappVar.tapsense(recyclerView);
            }
        }
        startapp startappVar2 = c7431e.metrica;
        startappVar2.f590e.unregisterObserver(c7431e.purchase);
        c7431e.ad.ad();
        c14052e.license();
    }

    @Override // androidx.recyclerview.widget.startapp
    public final void subscription(RecyclerView recyclerView) {
        C14052e c14052e = this.f33723e;
        ArrayList arrayList = c14052e.metrica;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        arrayList.add(new WeakReference(recyclerView));
        Iterator it2 = c14052e.license.iterator();
        while (it2.hasNext()) {
            ((C7431e) it2.next()).metrica.subscription(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.startapp
    public final void tapsense(RecyclerView recyclerView) {
        C14052e c14052e = this.f33723e;
        ArrayList arrayList = c14052e.metrica;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            if (weakReference.get() == null) {
                arrayList.remove(size);
            } else if (weakReference.get() == recyclerView) {
                arrayList.remove(size);
                break;
            }
            size--;
        }
        Iterator it = c14052e.license.iterator();
        while (it.hasNext()) {
            ((C7431e) it.next()).metrica.tapsense(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.startapp
    public final long yandex(int i) {
        C14052e c14052e = this.f33723e;
        crashlytics billing = c14052e.billing(i);
        C7431e c7431e = (C7431e) billing.f1119e;
        c7431e.metrica.yandex(billing.f1117e);
        c7431e.vip.getClass();
        billing.f1118e = false;
        billing.f1119e = null;
        billing.f1117e = -1;
        c14052e.yandex = billing;
        return -1L;
    }
}
