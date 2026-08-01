package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙّٕ */
/* loaded from: classes3.dex */
public final class C15296e extends AbstractC14012e implements RandomAccess, Serializable {

    /* renamed from: eّؑؑ */
    public final C1169e f30222e;

    /* renamed from: eًؔؐ */
    public int f30223e;

    /* renamed from: eؘٙؓ */
    public final int f30224e;

    /* renamed from: eؙِٖ */
    public final C15296e f30225e;

    /* renamed from: eّٖۦ */
    public Object[] f30226e;

    public C15296e(Object[] objArr, int i, int i2, C15296e c15296e, C1169e c1169e) {
        int i3;
        this.f30226e = objArr;
        this.f30224e = i;
        this.f30223e = i2;
        this.f30225e = c15296e;
        this.f30222e = c1169e;
        i3 = ((AbstractList) c1169e).modCount;
        ((AbstractList) this).modCount = i3;
    }

    /* renamed from: class */
    public static final /* synthetic */ int m3927class(C15296e c15296e) {
        return ((AbstractList) c15296e).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m3934while();
        m3930native();
        int i2 = this.f30223e;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "index: ", ", size: "));
        }
        m3932this(this.f30224e + i, obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3934while();
        m3930native();
        m3932this(this.f30224e + this.f30223e, obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m3934while();
        m3930native();
        int i2 = this.f30223e;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "index: ", ", size: "));
        }
        int size = collection.size();
        m3929interface(this.f30224e + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m3934while();
        m3930native();
        int size = collection.size();
        m3929interface(this.f30224e + this.f30223e, collection, size);
        return size > 0;
    }

    /* renamed from: break */
    public final int m3928break(int i, int i2, Collection collection, boolean z) {
        int m476break;
        C15296e c15296e = this.f30225e;
        if (c15296e != null) {
            m476break = c15296e.m3928break(i, i2, collection, z);
        } else {
            C1169e c1169e = C1169e.f3760e;
            m476break = this.f30222e.m476break(i, i2, collection, z);
        }
        if (m476break > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f30223e -= m476break;
        return m476break;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m3934while();
        m3930native();
        m3931protected(this.f30224e, this.f30223e);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m3930native();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f30226e;
            int i = this.f30223e;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (AbstractC7890e.billing(objArr[this.f30224e + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC14012e
    public final Object firebase(int i) {
        m3934while();
        m3930native();
        int i2 = this.f30223e;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "index: ", ", size: "));
        }
        return m3933try(this.f30224e + i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m3930native();
        int i2 = this.f30223e;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "index: ", ", size: "));
        }
        return this.f30226e[this.f30224e + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m3930native();
        Object[] objArr = this.f30226e;
        int i = this.f30223e;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.f30224e + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m3930native();
        for (int i = 0; i < this.f30223e; i++) {
            if (AbstractC7890e.billing(this.f30226e[this.f30224e + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: interface */
    public final void m3929interface(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        C1169e c1169e = this.f30222e;
        C15296e c15296e = this.f30225e;
        if (c15296e != null) {
            c15296e.m3929interface(i, collection, i2);
        } else {
            C1169e c1169e2 = C1169e.f3760e;
            c1169e.m477interface(i, collection, i2);
        }
        this.f30226e = c1169e.f3763e;
        this.f30223e += i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m3930native();
        return this.f30223e == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m3930native();
        for (int i = this.f30223e - 1; i >= 0; i--) {
            if (AbstractC7890e.billing(this.f30226e[this.f30224e + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        m3930native();
        int i2 = this.f30223e;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "index: ", ", size: "));
        }
        return new C11045e(this, i);
    }

    /* renamed from: native */
    public final void m3930native() {
        int i;
        i = ((AbstractList) this.f30222e).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: protected */
    public final void m3931protected(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        C15296e c15296e = this.f30225e;
        if (c15296e != null) {
            c15296e.m3931protected(i, i2);
        } else {
            C1169e c1169e = C1169e.f3760e;
            this.f30222e.m479protected(i, i2);
        }
        this.f30223e -= i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m3934while();
        m3930native();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            firebase(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m3934while();
        m3930native();
        return m3928break(this.f30224e, this.f30223e, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m3934while();
        m3930native();
        return m3928break(this.f30224e, this.f30223e, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m3934while();
        m3930native();
        int i2 = this.f30223e;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.f30226e;
        int i3 = this.f30224e;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC17140e.license(i, i2, this.f30223e);
        return new C15296e(this.f30226e, this.f30224e + i, i2 - i, this, this.f30222e);
    }

    @Override // defpackage.AbstractC14012e
    public final int subs() {
        m3930native();
        return this.f30223e;
    }

    /* renamed from: this */
    public final void m3932this(int i, Object obj) {
        ((AbstractList) this).modCount++;
        C1169e c1169e = this.f30222e;
        C15296e c15296e = this.f30225e;
        if (c15296e != null) {
            c15296e.m3932this(i, obj);
        } else {
            C1169e c1169e2 = C1169e.f3760e;
            c1169e.m480this(i, obj);
        }
        this.f30226e = c1169e.f3763e;
        this.f30223e++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m3930native();
        Object[] objArr = this.f30226e;
        int i = this.f30223e;
        int i2 = this.f30224e;
        return AbstractC1660e.pro(i2, i + i2, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        m3930native();
        int length = objArr.length;
        int i = this.f30223e;
        int i2 = this.f30224e;
        if (length < i) {
            return Arrays.copyOfRange(this.f30226e, i2, i + i2, objArr.getClass());
        }
        AbstractC1660e.mopub(0, i2, i + i2, this.f30226e, objArr);
        int i3 = this.f30223e;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m3930native();
        return AbstractC5797e.ad(this.f30226e, this.f30224e, this.f30223e, this);
    }

    /* renamed from: try */
    public final Object m3933try(int i) {
        Object m481try;
        ((AbstractList) this).modCount++;
        C15296e c15296e = this.f30225e;
        if (c15296e != null) {
            m481try = c15296e.m3933try(i);
        } else {
            C1169e c1169e = C1169e.f3760e;
            m481try = this.f30222e.m481try(i);
        }
        this.f30223e--;
        return m481try;
    }

    /* renamed from: while */
    public final void m3934while() {
        if (this.f30222e.f3761e) {
            throw new UnsupportedOperationException();
        }
    }
}
