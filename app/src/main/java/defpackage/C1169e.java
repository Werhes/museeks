package defpackage;

import androidx.car.app.model.Alert;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٛؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1169e extends AbstractC14012e implements RandomAccess, Serializable {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C1169e f3760e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f3761e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f3762e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object[] f3763e;

    static {
        C1169e c1169e = new C1169e(0);
        c1169e.f3761e = true;
        f3760e = c1169e;
    }

    public C1169e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f3763e = new Object[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m478native();
        int i2 = this.f3762e;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "index: ", ", size: "));
        }
        ((AbstractList) this).modCount++;
        m482while(i, 1);
        this.f3763e[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m478native();
        int i = this.f3762e;
        ((AbstractList) this).modCount++;
        m482while(i, 1);
        this.f3763e[i] = obj;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m478native();
        int i2 = this.f3762e;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "index: ", ", size: "));
        }
        int size = collection.size();
        m477interface(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m478native();
        int size = collection.size();
        m477interface(this.f3762e, collection, size);
        return size > 0;
    }

    /* renamed from: break, reason: not valid java name */
    public final int m476break(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.f3763e[i5]) == z) {
                Object[] objArr = this.f3763e;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.f3763e;
        AbstractC1660e.mopub(i + i4, i2 + i, this.f3762e, objArr2, objArr2);
        Object[] objArr3 = this.f3763e;
        int i7 = this.f3762e;
        AbstractC5797e.metrica(i7 - i6, i7, objArr3);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f3762e -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m478native();
        m479protected(0, this.f3762e);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f3763e;
            int i = this.f3762e;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (AbstractC7890e.billing(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC14012e
    public final Object firebase(int i) {
        m478native();
        int i2 = this.f3762e;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "index: ", ", size: "));
        }
        return m481try(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f3762e;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "index: ", ", size: "));
        }
        return this.f3763e[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f3763e;
        int i = this.f3762e;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f3762e; i++) {
            if (AbstractC7890e.billing(this.f3763e[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m477interface(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        m482while(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f3763e[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f3762e == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f3762e - 1; i >= 0; i--) {
            if (AbstractC7890e.billing(this.f3763e[i], obj)) {
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
        int i2 = this.f3762e;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "index: ", ", size: "));
        }
        return new C11045e(this, i);
    }

    /* renamed from: native, reason: not valid java name */
    public final void m478native() {
        if (this.f3761e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: protected, reason: not valid java name */
    public final void m479protected(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f3763e;
        AbstractC1660e.mopub(i, i + i2, this.f3762e, objArr, objArr);
        Object[] objArr2 = this.f3763e;
        int i3 = this.f3762e;
        AbstractC5797e.metrica(i3 - i2, i3, objArr2);
        this.f3762e -= i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m478native();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            firebase(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m478native();
        return m476break(0, this.f3762e, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m478native();
        return m476break(0, this.f3762e, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m478native();
        int i2 = this.f3762e;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.f3763e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC17140e.license(i, i2, this.f3762e);
        return new C15296e(this.f3763e, i, i2 - i, null, this);
    }

    @Override // defpackage.AbstractC14012e
    public final int subs() {
        return this.f3762e;
    }

    /* renamed from: this, reason: not valid java name */
    public final void m480this(int i, Object obj) {
        ((AbstractList) this).modCount++;
        m482while(i, 1);
        this.f3763e[i] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC1660e.pro(0, this.f3762e, this.f3763e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f3762e;
        if (length < i) {
            return Arrays.copyOfRange(this.f3763e, 0, i, objArr.getClass());
        }
        AbstractC1660e.mopub(0, 0, i, this.f3763e, objArr);
        int i2 = this.f3762e;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC5797e.ad(this.f3763e, 0, this.f3762e, this);
    }

    /* renamed from: try, reason: not valid java name */
    public final Object m481try(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f3763e;
        Object obj = objArr[i];
        AbstractC1660e.mopub(i, i + 1, this.f3762e, objArr, objArr);
        Object[] objArr2 = this.f3763e;
        int i2 = this.f3762e;
        objArr2[i2 - 1] = null;
        this.f3762e = i2 - 1;
        return obj;
    }

    /* renamed from: while, reason: not valid java name */
    public final void m482while(int i, int i2) {
        int i3 = this.f3762e + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f3763e;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Alert.DURATION_SHOW_INDEFINITELY : 2147483639;
            }
            this.f3763e = Arrays.copyOf(objArr, i4);
        }
        Object[] objArr2 = this.f3763e;
        AbstractC1660e.mopub(i + i2, i, this.f3762e, objArr2, objArr2);
        this.f3762e += i2;
    }
}
