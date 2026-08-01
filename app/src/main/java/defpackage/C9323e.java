package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9323e implements Collection {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C2271e f18569e;

    public C9323e(C2271e c2271e) {
        this.f18569e = c2271e;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f18569e.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f18569e.ad(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f18569e.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C6748e(this.f18569e, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C2271e c2271e = this.f18569e;
        int ad = c2271e.ad(obj);
        if (ad < 0) {
            return false;
        }
        c2271e.billing(ad);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C2271e c2271e = this.f18569e;
        int i = c2271e.f34352e;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(c2271e.startapp(i2))) {
                c2271e.billing(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C2271e c2271e = this.f18569e;
        int i = c2271e.f34352e;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(c2271e.startapp(i2))) {
                c2271e.billing(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f18569e.f34352e;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C2271e c2271e = this.f18569e;
        int i = c2271e.f34352e;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c2271e.startapp(i2);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C2271e c2271e = this.f18569e;
        int i = c2271e.f34352e;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c2271e.startapp(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
