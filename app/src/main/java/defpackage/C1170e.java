package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؒٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1170e implements List, InterfaceC10519e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f3764e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f3765e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f3766e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C12742e f3767e;

    public C1170e(C12742e c12742e, int i, int i2) {
        this.f3767e = c12742e;
        this.f3765e = i;
        this.f3764e = ((C4646e) AbstractC12909e.yandex(c12742e.f25493e)).appmetrica;
        this.f3766e = i2 - i;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        appmetrica();
        int i2 = this.f3765e + i;
        C12742e c12742e = this.f3767e;
        c12742e.add(i2, obj);
        this.f3766e++;
        this.f3764e = C7582e.advert(c12742e);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        appmetrica();
        int i = this.f3765e + this.f3766e;
        C12742e c12742e = this.f3767e;
        c12742e.add(i, obj);
        this.f3766e++;
        this.f3764e = C7582e.advert(c12742e);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        appmetrica();
        int i2 = i + this.f3765e;
        C12742e c12742e = this.f3767e;
        boolean addAll = c12742e.addAll(i2, collection);
        if (addAll) {
            this.f3766e = collection.size() + this.f3766e;
            this.f3764e = C7582e.advert(c12742e);
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f3766e, collection);
    }

    public final void appmetrica() {
        if (C7582e.advert(this.f3767e) != this.f3764e) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f3766e > 0) {
            appmetrica();
            int i = this.f3766e;
            int i2 = this.f3765e;
            C12742e c12742e = this.f3767e;
            c12742e.startapp(i2, i + i2);
            this.f3766e = 0;
            this.f3764e = C7582e.advert(c12742e);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        appmetrica();
        C7582e.vip(i, this.f3766e);
        return this.f3767e.get(this.f3765e + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        appmetrica();
        int i = this.f3766e;
        int i2 = this.f3765e;
        Iterator it = AbstractC3062e.admob(i2, i + i2).iterator();
        while (it.hasNext()) {
            int nextInt = ((C3296e) it).nextInt();
            if (AbstractC7890e.billing(obj, this.f3767e.get(nextInt))) {
                return nextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f3766e == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        appmetrica();
        int i = this.f3766e;
        int i2 = this.f3765e;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (AbstractC7890e.billing(obj, this.f3767e.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؚؖٞ, java.lang.Object] */
    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        appmetrica();
        ?? obj = new Object();
        obj.f8852e = i - 1;
        return new C0053e((C3967e) obj, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        appmetrica();
        int i2 = this.f3765e + i;
        C12742e c12742e = this.f3767e;
        Object remove = c12742e.remove(i2);
        this.f3766e--;
        this.f3764e = C7582e.advert(c12742e);
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        AbstractC8218e abstractC8218e;
        AbstractC13717e adcel;
        boolean metrica;
        appmetrica();
        C12742e c12742e = this.f3767e;
        int i2 = this.f3765e;
        int i3 = this.f3766e + i2;
        int size = c12742e.size();
        do {
            synchronized (C7582e.appmetrica) {
                C4646e c4646e = (C4646e) AbstractC12909e.yandex(c12742e.f25493e);
                i = c4646e.license;
                abstractC8218e = c4646e.metrica;
                Unit unit = Unit.INSTANCE;
            }
            C0316e mo289this = abstractC8218e.mo289this();
            mo289this.subList(i2, i3).retainAll(collection);
            AbstractC8218e m301class = mo289this.m301class();
            if (AbstractC7890e.billing(m301class, abstractC8218e)) {
                break;
            }
            C4646e c4646e2 = c12742e.f25493e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                metrica = C7582e.metrica((C4646e) AbstractC12909e.inmobi(c4646e2, c12742e, adcel), i, m301class, true);
            }
            AbstractC12909e.loadAd(adcel, c12742e);
        } while (!metrica);
        int size2 = size - c12742e.size();
        if (size2 > 0) {
            this.f3764e = ((C4646e) AbstractC12909e.yandex(this.f3767e.f25493e)).appmetrica;
            this.f3766e -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        C7582e.vip(i, this.f3766e);
        appmetrica();
        int i2 = i + this.f3765e;
        C12742e c12742e = this.f3767e;
        Object obj2 = c12742e.set(i2, obj);
        this.f3764e = C7582e.advert(c12742e);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f3766e;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= this.f3766e)) {
            AbstractC6536e.ad("fromIndex or toIndex are out of bounds");
        }
        appmetrica();
        int i3 = this.f3765e;
        return new C1170e(this.f3767e, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4533e.adcel(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4533e.mopub(this, objArr);
    }
}
