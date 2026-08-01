package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؕؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3317e {
    public Looper appmetrica;
    public C5350e billing;
    public AbstractC6690e purchase;
    public final ArrayList ad = new ArrayList(1);
    public final HashSet vip = new HashSet(1);
    public final Csuper metrica = new Csuper(new CopyOnWriteArrayList(), 0, (C18208e) null);
    public final C15683e license = new C15683e(new CopyOnWriteArrayList(), 0, null);

    public abstract void Signature();

    public boolean ad(C1962e c1962e) {
        return false;
    }

    public abstract void adcel();

    public final void admob(InterfaceC15826e interfaceC15826e) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.license.metrica;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C4881e c4881e = (C4881e) it.next();
            if (c4881e.vip == interfaceC15826e) {
                copyOnWriteArrayList.remove(c4881e);
            }
        }
    }

    public abstract void advert(InterfaceC4407e interfaceC4407e);

    public abstract void amazon(InterfaceC14239e interfaceC14239e);

    public final void appmetrica(InterfaceC5779e interfaceC5779e) {
        this.appmetrica.getClass();
        HashSet hashSet = this.vip;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC5779e);
        if (isEmpty) {
            purchase();
        }
    }

    public AbstractC6690e billing() {
        return null;
    }

    public void license() {
    }

    public final void loadAd(InterfaceC5779e interfaceC5779e) {
        ArrayList arrayList = this.ad;
        arrayList.remove(interfaceC5779e);
        if (!arrayList.isEmpty()) {
            metrica(interfaceC5779e);
            return;
        }
        this.appmetrica = null;
        this.purchase = null;
        this.billing = null;
        this.vip.clear();
        Signature();
    }

    public final void metrica(InterfaceC5779e interfaceC5779e) {
        HashSet hashSet = this.vip;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC5779e);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        license();
    }

    public final void mopub(InterfaceC5779e interfaceC5779e, InterfaceC4407e interfaceC4407e, C5350e c5350e) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.appmetrica;
        AbstractC2301e.billing(looper == null || looper == myLooper);
        this.billing = c5350e;
        AbstractC6690e abstractC6690e = this.purchase;
        this.ad.add(interfaceC5779e);
        if (this.appmetrica == null) {
            this.appmetrica = myLooper;
            this.vip.add(interfaceC5779e);
            advert(interfaceC4407e);
        } else if (abstractC6690e != null) {
            appmetrica(interfaceC5779e);
            interfaceC5779e.ad(this, abstractC6690e);
        }
    }

    public void purchase() {
    }

    public void remoteconfig(C1962e c1962e) {
    }

    public final void smaato(AbstractC6690e abstractC6690e) {
        this.purchase = abstractC6690e;
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            ((InterfaceC5779e) it.next()).ad(this, abstractC6690e);
        }
    }

    public boolean startapp() {
        return true;
    }

    public final void subscription(InterfaceC11421e interfaceC11421e) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.metrica.f36471e;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C7851e c7851e = (C7851e) it.next();
            if (c7851e.vip == interfaceC11421e) {
                copyOnWriteArrayList.remove(c7851e);
            }
        }
    }

    public abstract InterfaceC14239e vip(C18208e c18208e, InterfaceC16970e interfaceC16970e, long j);

    public abstract C1962e yandex();
}
