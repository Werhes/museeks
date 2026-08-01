package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۧۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9929e implements Parcelable, InterfaceC17335e, Set, RandomAccess, InterfaceC7103e {
    public static final Parcelable.Creator<C9929e> CREATOR = new C5995e(4);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C9160e f19630e;

    public C9929e() {
        C17204e c17204e = C17204e.f33724e;
        C9160e c9160e = new C9160e(AbstractC12909e.adcel().billing(), c17204e);
        if (AbstractC12909e.vip.get() != null) {
            c9160e.vip = new C9160e(1, c17204e);
        }
        this.f19630e = c9160e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        InterfaceC16486e interfaceC16486e;
        AbstractC13717e adcel;
        boolean metrica;
        do {
            synchronized (AbstractC9743e.vip) {
                C9160e c9160e = (C9160e) AbstractC12909e.yandex(this.f19630e);
                i = c9160e.license;
                interfaceC16486e = c9160e.metrica;
                Unit unit = Unit.INSTANCE;
            }
            C17204e c17204e = (C17204e) interfaceC16486e;
            C17204e firebase = c17204e.firebase(obj);
            if (firebase.equals(c17204e)) {
                return false;
            }
            C9160e c9160e2 = this.f19630e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                metrica = AbstractC9743e.metrica((C9160e) AbstractC12909e.inmobi(c9160e2, this, adcel), i, firebase);
            }
            AbstractC12909e.loadAd(adcel, this);
        } while (!metrica);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        InterfaceC16486e interfaceC16486e;
        AbstractC13717e adcel;
        boolean metrica;
        do {
            synchronized (AbstractC9743e.vip) {
                C9160e c9160e = (C9160e) AbstractC12909e.yandex(this.f19630e);
                i = c9160e.license;
                interfaceC16486e = c9160e.metrica;
                Unit unit = Unit.INSTANCE;
            }
            C17204e c17204e = (C17204e) interfaceC16486e;
            c17204e.getClass();
            C5930e c5930e = new C5930e(c17204e);
            c5930e.addAll(collection);
            C17204e firebase = c5930e.firebase();
            if (firebase.equals(interfaceC16486e)) {
                return false;
            }
            C9160e c9160e2 = this.f19630e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                metrica = AbstractC9743e.metrica((C9160e) AbstractC12909e.inmobi(c9160e2, this, adcel), i, firebase);
            }
            AbstractC12909e.loadAd(adcel, this);
        } while (!metrica);
        return true;
    }

    @Override // defpackage.InterfaceC17335e
    public final AbstractC8618e appmetrica() {
        return this.f19630e;
    }

    @Override // defpackage.InterfaceC17335e
    public final /* synthetic */ AbstractC8618e billing(AbstractC8618e abstractC8618e, AbstractC8618e abstractC8618e2, AbstractC8618e abstractC8618e3) {
        return null;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        AbstractC13717e adcel;
        C9160e c9160e = this.f19630e;
        synchronized (AbstractC12909e.metrica) {
            adcel = AbstractC12909e.adcel();
            C9160e c9160e2 = (C9160e) AbstractC12909e.inmobi(c9160e, this, adcel);
            synchronized (AbstractC9743e.vip) {
                c9160e2.metrica = C17204e.f33724e;
                c9160e2.license++;
            }
        }
        AbstractC12909e.loadAd(adcel, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return ((C9160e) AbstractC12909e.signatures(this.f19630e, this)).metrica.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((C9160e) AbstractC12909e.signatures(this.f19630e, this)).metrica.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return ((C9160e) AbstractC12909e.signatures(this.f19630e, this)).metrica.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C5243e(this, ((C9160e) AbstractC12909e.signatures(this.f19630e, this)).metrica.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        InterfaceC16486e interfaceC16486e;
        AbstractC13717e adcel;
        boolean metrica;
        do {
            synchronized (AbstractC9743e.vip) {
                C9160e c9160e = (C9160e) AbstractC12909e.yandex(this.f19630e);
                i = c9160e.license;
                interfaceC16486e = c9160e.metrica;
                Unit unit = Unit.INSTANCE;
            }
            C17204e c17204e = (C17204e) interfaceC16486e;
            C17204e m4274class = c17204e.m4274class(obj);
            if (m4274class.equals(c17204e)) {
                return false;
            }
            C9160e c9160e2 = this.f19630e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                metrica = AbstractC9743e.metrica((C9160e) AbstractC12909e.inmobi(c9160e2, this, adcel), i, m4274class);
            }
            AbstractC12909e.loadAd(adcel, this);
        } while (!metrica);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        InterfaceC16486e interfaceC16486e;
        AbstractC13717e adcel;
        boolean metrica;
        do {
            synchronized (AbstractC9743e.vip) {
                C9160e c9160e = (C9160e) AbstractC12909e.yandex(this.f19630e);
                i = c9160e.license;
                interfaceC16486e = c9160e.metrica;
                Unit unit = Unit.INSTANCE;
            }
            C17204e c17204e = (C17204e) interfaceC16486e;
            c17204e.getClass();
            C5930e c5930e = new C5930e(c17204e);
            c5930e.removeAll(collection);
            C17204e firebase = c5930e.firebase();
            if (firebase.equals(interfaceC16486e)) {
                return false;
            }
            C9160e c9160e2 = this.f19630e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                metrica = AbstractC9743e.metrica((C9160e) AbstractC12909e.inmobi(c9160e2, this, adcel), i, firebase);
            }
            AbstractC12909e.loadAd(adcel, this);
        } while (!metrica);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        InterfaceC16486e interfaceC16486e;
        boolean retainAll;
        AbstractC13717e adcel;
        boolean metrica;
        do {
            synchronized (AbstractC9743e.vip) {
                C9160e c9160e = (C9160e) AbstractC12909e.yandex(this.f19630e);
                i = c9160e.license;
                interfaceC16486e = c9160e.metrica;
                Unit unit = Unit.INSTANCE;
            }
            if (interfaceC16486e == null) {
                throw new IllegalStateException("No set to mutate");
            }
            C5930e c5930e = new C5930e((C17204e) interfaceC16486e);
            retainAll = c5930e.retainAll(AbstractC13480e.m3582e(collection));
            C17204e firebase = c5930e.firebase();
            if (firebase.equals(interfaceC16486e)) {
                break;
            }
            C9160e c9160e2 = this.f19630e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                metrica = AbstractC9743e.metrica((C9160e) AbstractC12909e.inmobi(c9160e2, this, adcel), i, firebase);
            }
            AbstractC12909e.loadAd(adcel, this);
        } while (!metrica);
        return retainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return ((C9160e) AbstractC12909e.signatures(this.f19630e, this)).metrica.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4533e.adcel(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4533e.mopub(this, objArr);
    }

    public final String toString() {
        return "SnapshotStateSet(value=" + ((C9160e) AbstractC12909e.yandex(this.f19630e)).metrica + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        InterfaceC16486e interfaceC16486e = ((C9160e) AbstractC12909e.signatures(this.f19630e, this)).metrica;
        parcel.writeInt(size());
        Iterator it = interfaceC16486e.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // defpackage.InterfaceC17335e
    public final void yandex(AbstractC8618e abstractC8618e) {
        abstractC8618e.vip = this.f19630e;
        this.f19630e = (C9160e) abstractC8618e;
    }
}
