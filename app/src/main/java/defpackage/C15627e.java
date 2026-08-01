package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٕٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15627e implements Set {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C2271e f30814e;

    public C15627e(C2271e c2271e) {
        this.f30814e = c2271e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f30814e.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f30814e.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f30814e.adcel(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C2271e c2271e = this.f30814e;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (c2271e.f34352e == set.size()) {
                return c2271e.adcel(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C2271e c2271e = this.f30814e;
        int i = 0;
        for (int i2 = c2271e.f34352e - 1; i2 >= 0; i2--) {
            Object purchase = c2271e.purchase(i2);
            i += purchase == null ? 0 : purchase.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f30814e.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C6748e(this.f30814e, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C2271e c2271e = this.f30814e;
        int license = c2271e.license(obj);
        if (license < 0) {
            return false;
        }
        c2271e.billing(license);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f30814e.mopub(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C2271e c2271e = this.f30814e;
        int i = c2271e.f34352e;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(c2271e.purchase(i2))) {
                c2271e.billing(i2);
            }
        }
        return i != c2271e.f34352e;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f30814e.f34352e;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C2271e c2271e = this.f30814e;
        int i = c2271e.f34352e;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c2271e.purchase(i2);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C2271e c2271e = this.f30814e;
        int i = c2271e.f34352e;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c2271e.purchase(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
