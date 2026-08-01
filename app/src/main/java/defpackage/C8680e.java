package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٓۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8680e extends AbstractCollection implements List {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C6834e f17520e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C8680e f17521e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Collection f17522e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Collection f17523e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f17524e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C6834e f17525e;

    public C8680e(C6834e c6834e, Object obj, List list, C8680e c8680e) {
        this.f17525e = c6834e;
        this.f17520e = c6834e;
        this.f17524e = obj;
        this.f17522e = list;
        this.f17521e = c8680e;
        this.f17523e = c8680e == null ? null : c8680e.f17522e;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        billing();
        boolean isEmpty = this.f17522e.isEmpty();
        ((List) this.f17522e).add(i, obj);
        if (isEmpty) {
            appmetrica();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        billing();
        boolean isEmpty = this.f17522e.isEmpty();
        boolean add = this.f17522e.add(obj);
        if (!add || !isEmpty) {
            return add;
        }
        appmetrica();
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f17522e).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        this.f17522e.size();
        if (size != 0) {
            return addAll;
        }
        appmetrica();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f17522e.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        this.f17522e.size();
        if (size != 0) {
            return addAll;
        }
        appmetrica();
        return true;
    }

    public final void appmetrica() {
        C8680e c8680e = this.f17521e;
        if (c8680e != null) {
            c8680e.appmetrica();
            return;
        }
        this.f17520e.f14065e.put(this.f17524e, this.f17522e);
    }

    public final void billing() {
        C8680e c8680e = this.f17521e;
        if (c8680e != null) {
            c8680e.billing();
            if (c8680e.f17522e != this.f17523e) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f17522e.isEmpty()) {
            Collection collection = (Collection) this.f17520e.f14065e.get(this.f17524e);
            if (collection != null) {
                this.f17522e = collection;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (size() == 0) {
            return;
        }
        this.f17522e.clear();
        yandex();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        billing();
        return this.f17522e.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        billing();
        return this.f17522e.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        billing();
        return this.f17522e.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        billing();
        return ((List) this.f17522e).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        billing();
        return this.f17522e.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        billing();
        return ((List) this.f17522e).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        billing();
        return new C14950e(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        billing();
        return ((List) this.f17522e).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        billing();
        return new C16789e(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        billing();
        return new C16789e(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        billing();
        Object remove = ((List) this.f17522e).remove(i);
        yandex();
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        billing();
        boolean remove = this.f17522e.remove(obj);
        if (remove) {
            yandex();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        size();
        boolean removeAll = this.f17522e.removeAll(collection);
        if (removeAll) {
            this.f17522e.size();
            yandex();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        size();
        boolean retainAll = this.f17522e.retainAll(collection);
        if (retainAll) {
            this.f17522e.size();
            yandex();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        billing();
        return ((List) this.f17522e).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        billing();
        return this.f17522e.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        billing();
        List subList = ((List) this.f17522e).subList(i, i2);
        C8680e c8680e = this.f17521e;
        if (c8680e == null) {
            c8680e = this;
        }
        boolean z = subList instanceof RandomAccess;
        Object obj = this.f17524e;
        C6834e c6834e = this.f17525e;
        return z ? new C8680e(c6834e, obj, subList, c8680e) : new C8680e(c6834e, obj, subList, c8680e);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        billing();
        return this.f17522e.toString();
    }

    public final void yandex() {
        C8680e c8680e = this.f17521e;
        if (c8680e != null) {
            c8680e.yandex();
        } else if (this.f17522e.isEmpty()) {
            this.f17520e.f14065e.remove(this.f17524e);
        }
    }
}
