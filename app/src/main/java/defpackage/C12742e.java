package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِّۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12742e implements Parcelable, InterfaceC17335e, List, RandomAccess, InterfaceC10519e {
    public static final Parcelable.Creator<C12742e> CREATOR = new C5995e(0);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C4646e f25493e;

    public C12742e() {
        this(C0292e.f2297e);
    }

    public C12742e(AbstractC8218e abstractC8218e) {
        AbstractC13717e adcel = AbstractC12909e.adcel();
        C4646e c4646e = new C4646e(adcel.billing(), abstractC8218e);
        if (!(adcel instanceof C17137e)) {
            c4646e.vip = new C4646e(1, abstractC8218e);
        }
        this.f25493e = c4646e;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        AbstractC8218e abstractC8218e;
        AbstractC13717e adcel;
        boolean metrica;
        do {
            synchronized (C7582e.appmetrica) {
                C4646e c4646e = (C4646e) AbstractC12909e.yandex(this.f25493e);
                i2 = c4646e.license;
                abstractC8218e = c4646e.metrica;
                Unit unit = Unit.INSTANCE;
            }
            AbstractC8218e firebase = abstractC8218e.firebase(i, obj);
            if (firebase.equals(abstractC8218e)) {
                return;
            }
            C4646e c4646e2 = this.f25493e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                metrica = C7582e.metrica((C4646e) AbstractC12909e.inmobi(c4646e2, this, adcel), i2, firebase, true);
            }
            AbstractC12909e.loadAd(adcel, this);
        } while (!metrica);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        AbstractC8218e abstractC8218e;
        AbstractC13717e adcel;
        boolean metrica;
        do {
            synchronized (C7582e.appmetrica) {
                C4646e c4646e = (C4646e) AbstractC12909e.yandex(this.f25493e);
                i = c4646e.license;
                abstractC8218e = c4646e.metrica;
                Unit unit = Unit.INSTANCE;
            }
            AbstractC8218e mo286class = abstractC8218e.mo286class(obj);
            if (mo286class.equals(abstractC8218e)) {
                return false;
            }
            C4646e c4646e2 = this.f25493e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                metrica = C7582e.metrica((C4646e) AbstractC12909e.inmobi(c4646e2, this, adcel), i, mo286class, true);
            }
            AbstractC12909e.loadAd(adcel, this);
        } while (!metrica);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return C7582e.amazon(this, new C17766e(i, collection));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        AbstractC8218e abstractC8218e;
        AbstractC13717e adcel;
        boolean metrica;
        do {
            synchronized (C7582e.appmetrica) {
                C4646e c4646e = (C4646e) AbstractC12909e.yandex(this.f25493e);
                i = c4646e.license;
                abstractC8218e = c4646e.metrica;
                Unit unit = Unit.INSTANCE;
            }
            AbstractC8218e mo287interface = abstractC8218e.mo287interface(collection);
            if (AbstractC7890e.billing(mo287interface, abstractC8218e)) {
                return false;
            }
            C4646e c4646e2 = this.f25493e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                metrica = C7582e.metrica((C4646e) AbstractC12909e.inmobi(c4646e2, this, adcel), i, mo287interface, true);
            }
            AbstractC12909e.loadAd(adcel, this);
        } while (!metrica);
        return true;
    }

    @Override // defpackage.InterfaceC17335e
    public final AbstractC8618e appmetrica() {
        return this.f25493e;
    }

    @Override // defpackage.InterfaceC17335e
    public final /* synthetic */ AbstractC8618e billing(AbstractC8618e abstractC8618e, AbstractC8618e abstractC8618e2, AbstractC8618e abstractC8618e3) {
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC13717e adcel;
        C4646e c4646e = this.f25493e;
        synchronized (AbstractC12909e.metrica) {
            adcel = AbstractC12909e.adcel();
            C4646e c4646e2 = (C4646e) AbstractC12909e.inmobi(c4646e, this, adcel);
            synchronized (C7582e.appmetrica) {
                c4646e2.metrica = C0292e.f2297e;
                c4646e2.license++;
                c4646e2.appmetrica++;
            }
        }
        AbstractC12909e.loadAd(adcel, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return ((C4646e) AbstractC12909e.signatures(this.f25493e, this)).metrica.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((C4646e) AbstractC12909e.signatures(this.f25493e, this)).metrica.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return ((C4646e) AbstractC12909e.signatures(this.f25493e, this)).metrica.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return ((C4646e) AbstractC12909e.signatures(this.f25493e, this)).metrica.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return ((C4646e) AbstractC12909e.signatures(this.f25493e, this)).metrica.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return ((C4646e) AbstractC12909e.signatures(this.f25493e, this)).metrica.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C11045e(this, 0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new C11045e(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        AbstractC8218e abstractC8218e;
        AbstractC13717e adcel;
        boolean metrica;
        Object obj = get(i);
        do {
            synchronized (C7582e.appmetrica) {
                C4646e c4646e = (C4646e) AbstractC12909e.yandex(this.f25493e);
                i2 = c4646e.license;
                abstractC8218e = c4646e.metrica;
                Unit unit = Unit.INSTANCE;
            }
            AbstractC8218e mo291while = abstractC8218e.mo291while(i);
            if (mo291while.equals(abstractC8218e)) {
                break;
            }
            C4646e c4646e2 = this.f25493e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                metrica = C7582e.metrica((C4646e) AbstractC12909e.inmobi(c4646e2, this, adcel), i2, mo291while, true);
            }
            AbstractC12909e.loadAd(adcel, this);
        } while (!metrica);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        AbstractC8218e abstractC8218e;
        AbstractC13717e adcel;
        boolean metrica;
        do {
            synchronized (C7582e.appmetrica) {
                C4646e c4646e = (C4646e) AbstractC12909e.yandex(this.f25493e);
                i = c4646e.license;
                abstractC8218e = c4646e.metrica;
                Unit unit = Unit.INSTANCE;
            }
            int indexOf = abstractC8218e.indexOf(obj);
            AbstractC8218e mo291while = indexOf != -1 ? abstractC8218e.mo291while(indexOf) : abstractC8218e;
            if (mo291while.equals(abstractC8218e)) {
                return false;
            }
            C4646e c4646e2 = this.f25493e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                metrica = C7582e.metrica((C4646e) AbstractC12909e.inmobi(c4646e2, this, adcel), i, mo291while, true);
            }
            AbstractC12909e.loadAd(adcel, this);
        } while (!metrica);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        AbstractC8218e abstractC8218e;
        AbstractC13717e adcel;
        boolean metrica;
        do {
            synchronized (C7582e.appmetrica) {
                C4646e c4646e = (C4646e) AbstractC12909e.yandex(this.f25493e);
                i = c4646e.license;
                abstractC8218e = c4646e.metrica;
                Unit unit = Unit.INSTANCE;
            }
            abstractC8218e.getClass();
            AbstractC8218e mo288native = abstractC8218e.mo288native(new C9501e(0, collection));
            if (AbstractC7890e.billing(mo288native, abstractC8218e)) {
                return false;
            }
            C4646e c4646e2 = this.f25493e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                metrica = C7582e.metrica((C4646e) AbstractC12909e.inmobi(c4646e2, this, adcel), i, mo288native, true);
            }
            AbstractC12909e.loadAd(adcel, this);
        } while (!metrica);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return C7582e.amazon(this, new C9501e(3, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        AbstractC8218e abstractC8218e;
        AbstractC13717e adcel;
        boolean metrica;
        Object obj2 = get(i);
        do {
            synchronized (C7582e.appmetrica) {
                C4646e c4646e = (C4646e) AbstractC12909e.yandex(this.f25493e);
                i2 = c4646e.license;
                abstractC8218e = c4646e.metrica;
                Unit unit = Unit.INSTANCE;
            }
            AbstractC8218e mo290try = abstractC8218e.mo290try(i, obj);
            if (mo290try.equals(abstractC8218e)) {
                break;
            }
            C4646e c4646e2 = this.f25493e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                metrica = C7582e.metrica((C4646e) AbstractC12909e.inmobi(c4646e2, this, adcel), i2, mo290try, false);
            }
            AbstractC12909e.loadAd(adcel, this);
        } while (!metrica);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return ((C4646e) AbstractC12909e.signatures(this.f25493e, this)).metrica.subs();
    }

    public final void startapp(int i, int i2) {
        int i3;
        AbstractC8218e abstractC8218e;
        AbstractC13717e adcel;
        boolean metrica;
        do {
            synchronized (C7582e.appmetrica) {
                C4646e c4646e = (C4646e) AbstractC12909e.yandex(this.f25493e);
                i3 = c4646e.license;
                abstractC8218e = c4646e.metrica;
                Unit unit = Unit.INSTANCE;
            }
            C0316e mo289this = abstractC8218e.mo289this();
            mo289this.subList(i, i2).clear();
            AbstractC8218e m301class = mo289this.m301class();
            if (AbstractC7890e.billing(m301class, abstractC8218e)) {
                return;
            }
            C4646e c4646e2 = this.f25493e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                metrica = C7582e.metrica((C4646e) AbstractC12909e.inmobi(c4646e2, this, adcel), i3, m301class, true);
            }
            AbstractC12909e.loadAd(adcel, this);
        } while (!metrica);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            AbstractC6536e.ad("fromIndex or toIndex are out of bounds");
        }
        return new C1170e(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4533e.adcel(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4533e.mopub(this, objArr);
    }

    public final String toString() {
        return "SnapshotStateList(value=" + ((C4646e) AbstractC12909e.yandex(this.f25493e)).metrica + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC8218e abstractC8218e = ((C4646e) AbstractC12909e.signatures(this.f25493e, this)).metrica;
        int subs = abstractC8218e.subs();
        parcel.writeInt(subs);
        for (int i2 = 0; i2 < subs; i2++) {
            parcel.writeValue(abstractC8218e.get(i2));
        }
    }

    @Override // defpackage.InterfaceC17335e
    public final void yandex(AbstractC8618e abstractC8618e) {
        abstractC8618e.vip = this.f25493e;
        this.f25493e = (C4646e) abstractC8618e;
    }
}
