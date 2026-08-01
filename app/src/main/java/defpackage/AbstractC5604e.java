package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.loadAd;
import androidx.recyclerview.widget.startapp;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘّۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5604e extends startapp {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public LayoutInflater f11958e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C1847e f11959e;

    public AbstractC5604e() {
        C1400e c1400e = new C1400e(24);
        C15714e c15714e = new C15714e(this);
        C9770e c9770e = new C9770e(1, this);
        synchronized (AbstractC1561e.ad) {
            try {
                if (AbstractC1561e.vip == null) {
                    AbstractC1561e.vip = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1847e c1847e = new C1847e(c9770e, new C18540e(AbstractC1561e.vip, c1400e, 7));
        this.f11959e = c1847e;
        c1847e.license.add(c15714e);
    }

    public void ads(int i, Object obj, InterfaceC10283e interfaceC10283e) {
    }

    @Override // androidx.recyclerview.widget.startapp
    public final int billing() {
        return this.f11959e.purchase.size();
    }

    public abstract int crashlytics();

    public void firebase(List list) {
        C1847e c1847e = this.f11959e;
        C9770e c9770e = c1847e.ad;
        int i = c1847e.billing + 1;
        c1847e.billing = i;
        List list2 = c1847e.appmetrica;
        if (list == list2) {
            return;
        }
        if (list == null) {
            int size = list2.size();
            c1847e.appmetrica = null;
            c1847e.purchase = Collections.EMPTY_LIST;
            c9770e.billing(0, size);
            c1847e.ad();
            return;
        }
        if (list2 != null) {
            ((Executor) c1847e.vip.f36383e).execute(new RunnableC1887e(c1847e, list2, list, i));
            return;
        }
        c1847e.appmetrica = list;
        c1847e.purchase = DesugarCollections.unmodifiableList(list);
        c9770e.appmetrica(0, list.size());
        c1847e.ad();
    }

    public void premium(int i, Object obj, InterfaceC10283e interfaceC10283e, C5272e c5272e) {
        ads(i, obj, interfaceC10283e);
    }

    @Override // androidx.recyclerview.widget.startapp
    public final void remoteconfig(loadAd loadad, int i) {
        C5272e c5272e = (C5272e) loadad;
        premium(i, this.f11959e.purchase.get(i), c5272e.signatures, c5272e);
    }

    @Override // androidx.recyclerview.widget.startapp
    public final loadAd signatures(ViewGroup viewGroup, int i) {
        if (this.f11958e == null) {
            this.f11958e = LayoutInflater.from(viewGroup.getContext());
        }
        LayoutInflater layoutInflater = this.f11958e;
        if (layoutInflater == null) {
            layoutInflater = null;
        }
        return new C5272e(subs(layoutInflater, viewGroup));
    }

    @Override // androidx.recyclerview.widget.startapp
    public final int startapp(int i) {
        return crashlytics();
    }

    public abstract InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup);
}
