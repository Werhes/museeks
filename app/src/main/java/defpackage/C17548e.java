package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؕۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17548e implements Collection, Set, InterfaceC12555e, InterfaceC7103e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f34401e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object[] f34402e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int[] f34403e;

    public C17548e(int i) {
        this.f34403e = AbstractC10115e.ad;
        this.f34402e = AbstractC10115e.metrica;
        if (i > 0) {
            this.f34403e = new int[i];
            this.f34402e = new Object[i];
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int purchase;
        int i2 = this.f34401e;
        if (obj == null) {
            purchase = AbstractC18268e.purchase(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            purchase = AbstractC18268e.purchase(this, obj, hashCode);
        }
        if (purchase >= 0) {
            return false;
        }
        int i3 = ~purchase;
        int[] iArr = this.f34403e;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f34402e;
            int[] iArr2 = new int[i4];
            this.f34403e = iArr2;
            this.f34402e = new Object[i4];
            if (i2 != this.f34401e) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                AbstractC1660e.Signature(0, iArr.length, iArr, iArr2, 6);
                AbstractC1660e.loadAd(0, objArr.length, 6, objArr, this.f34402e);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f34403e;
            int i5 = i3 + 1;
            AbstractC1660e.advert(i5, i3, iArr3, iArr3, i2);
            Object[] objArr2 = this.f34402e;
            AbstractC1660e.mopub(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.f34401e;
        if (i2 == i6) {
            int[] iArr4 = this.f34403e;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f34402e[i3] = obj;
                this.f34401e = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f34401e;
        int i = this.f34401e;
        int[] iArr = this.f34403e;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f34402e;
            int[] iArr2 = new int[size];
            this.f34403e = iArr2;
            this.f34402e = new Object[size];
            if (i > 0) {
                AbstractC1660e.Signature(0, i, iArr, iArr2, 6);
                AbstractC1660e.loadAd(0, this.f34401e, 6, objArr, this.f34402e);
            }
        }
        if (this.f34401e != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public final Object appmetrica(int i) {
        int i2 = this.f34401e;
        Object[] objArr = this.f34402e;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f34403e;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                AbstractC1660e.advert(i, i4, iArr, iArr, i2);
                Object[] objArr2 = this.f34402e;
                AbstractC1660e.mopub(i, i4, i2, objArr2, objArr2);
            }
            this.f34402e[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.f34403e = iArr2;
            this.f34402e = new Object[i5];
            if (i > 0) {
                AbstractC1660e.Signature(0, i, iArr, iArr2, 6);
                AbstractC1660e.loadAd(0, i, 6, objArr, this.f34402e);
            }
            if (i < i3) {
                int i6 = i + 1;
                AbstractC1660e.advert(i, i6, iArr, this.f34403e, i2);
                AbstractC1660e.mopub(i, i6, i2, objArr, this.f34402e);
            }
        }
        if (i2 != this.f34401e) {
            throw new ConcurrentModificationException();
        }
        this.f34401e = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f34401e != 0) {
            this.f34403e = AbstractC10115e.ad;
            this.f34402e = AbstractC10115e.metrica;
            this.f34401e = 0;
        }
        if (this.f34401e != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC18268e.purchase(this, null, 0) : AbstractC18268e.purchase(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f34401e != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f34401e;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.f34402e[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f34403e;
        int i = this.f34401e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f34401e <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C6748e(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int purchase = obj == null ? AbstractC18268e.purchase(this, null, 0) : AbstractC18268e.purchase(this, obj, obj.hashCode());
        if (purchase < 0) {
            return false;
        }
        appmetrica(purchase);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f34401e - 1; -1 < i; i--) {
            if (!AbstractC13480e.ads(collection, this.f34402e[i])) {
                appmetrica(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f34401e;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC1660e.pro(0, this.f34401e, this.f34402e);
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        int i = this.f34401e;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        AbstractC1660e.mopub(0, 0, this.f34401e, this.f34402e, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f34401e * 14);
        sb.append('{');
        int i = this.f34401e;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f34402e[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
