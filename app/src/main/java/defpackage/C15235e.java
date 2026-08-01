package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؕۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15235e extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f30137e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f30138e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int[] f30139e;

    public C15235e(int i, int i2, int[] iArr) {
        this.f30139e = iArr;
        this.f30138e = i;
        this.f30137e = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && AbstractC10509e.advert(((Integer) obj).intValue(), this.f30138e, this.f30137e, this.f30139e) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15235e)) {
            return super.equals(obj);
        }
        C15235e c15235e = (C15235e) obj;
        int size = size();
        if (c15235e.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f30139e[this.f30138e + i] != c15235e.f30139e[c15235e.f30138e + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        AbstractC2301e.mopub(i, size());
        return Integer.valueOf(this.f30139e[this.f30138e + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f30138e; i2 < this.f30137e; i2++) {
            i = (i * 31) + this.f30139e[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f30137e;
        int i2 = this.f30138e;
        int advert = AbstractC10509e.advert(intValue, i2, i, this.f30139e);
        if (advert >= 0) {
            return advert - i2;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i2 = this.f30137e;
            while (true) {
                i2--;
                i = this.f30138e;
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
                if (this.f30139e[i2] == intValue) {
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        AbstractC2301e.mopub(i, size());
        int i2 = this.f30138e + i;
        int[] iArr = this.f30139e;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30137e - this.f30138e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC2301e.Signature(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int i3 = this.f30138e;
        return new C15235e(i + i3, i3 + i2, this.f30139e);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f30139e;
        int i = this.f30138e;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i >= this.f30137e) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i]);
        }
    }
}
