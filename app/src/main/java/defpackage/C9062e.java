package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٜۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9062e extends AbstractMap {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ int f18152e = 0;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public volatile C10442e f18153e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Map f18154e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f18155e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f18156e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object[] f18157e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Map f18158e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, eٌٜۢ] */
    public static C9062e purchase() {
        ?? abstractMap = new AbstractMap();
        Map map = Collections.EMPTY_MAP;
        abstractMap.f18154e = map;
        abstractMap.f18158e = map;
        return abstractMap;
    }

    public final int ad(Comparable comparable) {
        int i;
        int i2 = this.f18155e;
        int i3 = i2 - 1;
        if (i3 >= 0) {
            int compareTo = comparable.compareTo(((C7399e) this.f18157e[i3]).f15162e);
            if (compareTo > 0) {
                i = i2 + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i3;
            }
        }
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            int compareTo2 = comparable.compareTo(((C7399e) this.f18157e[i5]).f15162e);
            if (compareTo2 < 0) {
                i3 = i5 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i5;
                }
                i4 = i5 + 1;
            }
        }
        i = i4 + 1;
        return -i;
    }

    public final SortedMap appmetrica() {
        vip();
        if (this.f18154e.isEmpty() && !(this.f18154e instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f18154e = treeMap;
            this.f18158e = treeMap.descendingMap();
        }
        return (SortedMap) this.f18154e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: billing, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        vip();
        int ad = ad(comparable);
        if (ad >= 0) {
            return ((C7399e) this.f18157e[ad]).setValue(obj);
        }
        vip();
        if (this.f18157e == null) {
            this.f18157e = new Object[16];
        }
        int i = -(ad + 1);
        if (i >= 16) {
            return appmetrica().put(comparable, obj);
        }
        int i2 = this.f18155e;
        if (i2 == 16) {
            C7399e c7399e = (C7399e) this.f18157e[15];
            this.f18155e = i2 - 1;
            appmetrica().put(c7399e.f15162e, c7399e.f15161e);
        }
        Object[] objArr = this.f18157e;
        System.arraycopy(objArr, i, objArr, i + 1, (objArr.length - i) - 1);
        this.f18157e[i] = new C7399e(this, comparable, obj);
        this.f18155e++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        vip();
        if (this.f18155e != 0) {
            this.f18157e = null;
            this.f18155e = 0;
        }
        if (this.f18154e.isEmpty()) {
            return;
        }
        this.f18154e.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return ad(comparable) >= 0 || this.f18154e.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f18153e == null) {
            this.f18153e = new C10442e(2, this);
        }
        return this.f18153e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9062e)) {
            return super.equals(obj);
        }
        C9062e c9062e = (C9062e) obj;
        int size = size();
        if (size == c9062e.size()) {
            int i = this.f18155e;
            if (i != c9062e.f18155e) {
                return ((AbstractSet) entrySet()).equals(c9062e.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (metrica(i2).equals(c9062e.metrica(i2))) {
                }
            }
            if (i != size) {
                return this.f18154e.equals(c9062e.f18154e);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int ad = ad(comparable);
        return ad >= 0 ? ((C7399e) this.f18157e[ad]).f15161e : this.f18154e.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f18155e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.f18157e[i3].hashCode();
        }
        return this.f18154e.size() > 0 ? this.f18154e.hashCode() + i2 : i2;
    }

    public final Set license() {
        return this.f18154e.isEmpty() ? Collections.EMPTY_SET : this.f18154e.entrySet();
    }

    public final C7399e metrica(int i) {
        if (i < this.f18155e) {
            return (C7399e) this.f18157e[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        vip();
        Comparable comparable = (Comparable) obj;
        int ad = ad(comparable);
        if (ad >= 0) {
            return yandex(ad);
        }
        if (this.f18154e.isEmpty()) {
            return null;
        }
        return this.f18154e.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f18154e.size() + this.f18155e;
    }

    public final void vip() {
        if (this.f18156e) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object yandex(int i) {
        vip();
        Object[] objArr = this.f18157e;
        Object obj = ((C7399e) objArr[i]).f15161e;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f18155e - i) - 1);
        this.f18155e--;
        if (!this.f18154e.isEmpty()) {
            Iterator it = appmetrica().entrySet().iterator();
            Object[] objArr2 = this.f18157e;
            int i2 = this.f18155e;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new C7399e(this, (Comparable) entry.getKey(), entry.getValue());
            this.f18155e++;
            it.remove();
        }
        return obj;
    }
}
