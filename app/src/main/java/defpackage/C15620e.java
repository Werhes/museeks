package defpackage;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٝۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15620e extends AbstractMap {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ int f30803e = 0;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public volatile C10442e f30804e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Map f30805e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f30806e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f30807e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object[] f30808e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Map f30809e;

    public C15620e() {
        Map map = Collections.EMPTY_MAP;
        this.f30805e = map;
        this.f30809e = map;
    }

    public final Set ad() {
        return this.f30805e.isEmpty() ? Collections.EMPTY_SET : this.f30805e.entrySet();
    }

    public final Object appmetrica(int i) {
        billing();
        Object[] objArr = this.f30808e;
        Object obj = ((C4392e) objArr[i]).f9571e;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f30806e - i) - 1);
        this.f30806e--;
        if (!this.f30805e.isEmpty()) {
            Iterator it = purchase().entrySet().iterator();
            Object[] objArr2 = this.f30808e;
            int i2 = this.f30806e;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new C4392e(this, (Comparable) entry.getKey(), entry.getValue());
            this.f30806e++;
            it.remove();
        }
        return obj;
    }

    public final void billing() {
        if (this.f30807e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        billing();
        if (this.f30806e != 0) {
            this.f30808e = null;
            this.f30806e = 0;
        }
        if (this.f30805e.isEmpty()) {
            return;
        }
        this.f30805e.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return license(comparable) >= 0 || this.f30805e.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f30804e == null) {
            this.f30804e = new C10442e(4, this);
        }
        return this.f30804e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15620e)) {
            return super.equals(obj);
        }
        C15620e c15620e = (C15620e) obj;
        int size = size();
        if (size == c15620e.size()) {
            int i = this.f30806e;
            if (i != c15620e.f30806e) {
                return entrySet().equals(c15620e.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (metrica(i2).equals(c15620e.metrica(i2))) {
                }
            }
            if (i != size) {
                return this.f30805e.equals(c15620e.f30805e);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int license = license(comparable);
        return license >= 0 ? ((C4392e) this.f30808e[license]).f9571e : this.f30805e.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f30806e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.f30808e[i3].hashCode();
        }
        return this.f30805e.size() > 0 ? this.f30805e.hashCode() + i2 : i2;
    }

    public final int license(Comparable comparable) {
        int i = this.f30806e;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((C4392e) this.f30808e[i2]).f9572e);
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((C4392e) this.f30808e[i4]).f9572e);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    public final C4392e metrica(int i) {
        if (i < this.f30806e) {
            return (C4392e) this.f30808e[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final SortedMap purchase() {
        billing();
        if (this.f30805e.isEmpty() && !(this.f30805e instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f30805e = treeMap;
            this.f30809e = treeMap.descendingMap();
        }
        return (SortedMap) this.f30805e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        billing();
        Comparable comparable = (Comparable) obj;
        int license = license(comparable);
        if (license >= 0) {
            return appmetrica(license);
        }
        if (this.f30805e.isEmpty()) {
            return null;
        }
        return this.f30805e.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f30805e.size() + this.f30806e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: vip, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        billing();
        int license = license(comparable);
        if (license >= 0) {
            return ((C4392e) this.f30808e[license]).setValue(obj);
        }
        billing();
        if (this.f30808e == null) {
            this.f30808e = new Object[16];
        }
        int i = -(license + 1);
        if (i >= 16) {
            return purchase().put(comparable, obj);
        }
        if (this.f30806e == 16) {
            C4392e c4392e = (C4392e) this.f30808e[15];
            this.f30806e = 15;
            purchase().put(c4392e.f9572e, c4392e.f9571e);
        }
        Object[] objArr = this.f30808e;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f30808e[i] = new C4392e(this, comparable, obj);
        this.f30806e++;
        return null;
    }
}
