package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8592e extends AbstractCollection {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1837e f17411e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AbstractC8592e f17412e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Collection f17413e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Collection f17414e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f17415e;

    public AbstractC8592e(AbstractC1837e abstractC1837e, Object obj, Collection collection, AbstractC8592e abstractC8592e) {
        this.f17411e = abstractC1837e;
        this.f17415e = obj;
        this.f17413e = collection;
        this.f17412e = abstractC8592e;
        this.f17414e = abstractC8592e == null ? null : abstractC8592e.f17413e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        billing();
        boolean isEmpty = this.f17413e.isEmpty();
        boolean add = this.f17413e.add(obj);
        if (add) {
            this.f17411e.f4931e++;
            if (isEmpty) {
                appmetrica();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f17413e.addAll(collection);
        if (addAll) {
            this.f17411e.f4931e += this.f17413e.size() - size;
            if (size == 0) {
                appmetrica();
            }
        }
        return addAll;
    }

    public final void appmetrica() {
        AbstractC8592e abstractC8592e = this.f17412e;
        if (abstractC8592e != null) {
            abstractC8592e.appmetrica();
        } else {
            this.f17411e.f4930e.put(this.f17415e, this.f17413e);
        }
    }

    public final void billing() {
        Collection collection;
        AbstractC8592e abstractC8592e = this.f17412e;
        if (abstractC8592e != null) {
            abstractC8592e.billing();
            if (abstractC8592e.f17413e != this.f17414e) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f17413e.isEmpty() || (collection = (Collection) this.f17411e.f4930e.get(this.f17415e)) == null) {
                return;
            }
            this.f17413e = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f17413e.clear();
        this.f17411e.f4931e -= size;
        yandex();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        billing();
        return this.f17413e.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        billing();
        return this.f17413e.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        billing();
        return this.f17413e.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        billing();
        return this.f17413e.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        billing();
        return new C14950e(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        billing();
        boolean remove = this.f17413e.remove(obj);
        if (remove) {
            AbstractC1837e abstractC1837e = this.f17411e;
            abstractC1837e.f4931e--;
            yandex();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f17413e.removeAll(collection);
        if (removeAll) {
            this.f17411e.f4931e += this.f17413e.size() - size;
            yandex();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f17413e.retainAll(collection);
        if (retainAll) {
            this.f17411e.f4931e += this.f17413e.size() - size;
            yandex();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        billing();
        return this.f17413e.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        billing();
        return this.f17413e.toString();
    }

    public final void yandex() {
        AbstractC8592e abstractC8592e = this.f17412e;
        if (abstractC8592e != null) {
            abstractC8592e.yandex();
        } else if (this.f17413e.isEmpty()) {
            this.f17411e.f4930e.remove(this.f17415e);
        }
    }
}
