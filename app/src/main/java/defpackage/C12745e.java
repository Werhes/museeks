package defpackage;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۛٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12745e extends AbstractMap {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public volatile C10442e f25495e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Map f25496e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f25497e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f25498e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object[] f25499e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Map f25500e;

    public C12745e() {
        Map map = Collections.EMPTY_MAP;
        this.f25496e = map;
        this.f25500e = map;
    }

    public final C11377e ad(int i) {
        if (i < this.f25497e) {
            return (C11377e) this.f25499e[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final int appmetrica(Comparable comparable) {
        int i = this.f25497e;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((C11377e) this.f25499e[i2]).f22905e);
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((C11377e) this.f25499e[i4]).f22905e);
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

    public final SortedMap billing() {
        purchase();
        if (this.f25496e.isEmpty() && !(this.f25496e instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f25496e = treeMap;
            this.f25500e = treeMap.descendingMap();
        }
        return (SortedMap) this.f25496e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        purchase();
        if (this.f25497e != 0) {
            this.f25499e = null;
            this.f25497e = 0;
        }
        if (this.f25496e.isEmpty()) {
            return;
        }
        this.f25496e.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return appmetrica(comparable) >= 0 || this.f25496e.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f25495e == null) {
            this.f25495e = new C10442e(3, this);
        }
        return this.f25495e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12745e)) {
            return super.equals(obj);
        }
        C12745e c12745e = (C12745e) obj;
        int size = size();
        if (size == c12745e.size()) {
            int i = this.f25497e;
            if (i != c12745e.f25497e) {
                return entrySet().equals(c12745e.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (ad(i2).equals(c12745e.ad(i2))) {
                }
            }
            if (i != size) {
                return this.f25496e.equals(c12745e.f25496e);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int appmetrica = appmetrica(comparable);
        return appmetrica >= 0 ? ((C11377e) this.f25499e[appmetrica]).f22904e : this.f25496e.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f25497e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.f25499e[i3].hashCode();
        }
        return this.f25496e.size() > 0 ? this.f25496e.hashCode() + i2 : i2;
    }

    public final Object license(int i) {
        purchase();
        Object[] objArr = this.f25499e;
        Object obj = ((C11377e) objArr[i]).f22904e;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f25497e - i) - 1);
        this.f25497e--;
        if (!this.f25496e.isEmpty()) {
            Iterator it = billing().entrySet().iterator();
            Object[] objArr2 = this.f25499e;
            int i2 = this.f25497e;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new C11377e(this, (Comparable) entry.getKey(), entry.getValue());
            this.f25497e++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: metrica, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        purchase();
        int appmetrica = appmetrica(comparable);
        if (appmetrica >= 0) {
            return ((C11377e) this.f25499e[appmetrica]).setValue(obj);
        }
        purchase();
        if (this.f25499e == null) {
            this.f25499e = new Object[16];
        }
        int i = -(appmetrica + 1);
        if (i >= 16) {
            return billing().put(comparable, obj);
        }
        if (this.f25497e == 16) {
            C11377e c11377e = (C11377e) this.f25499e[15];
            this.f25497e = 15;
            billing().put(c11377e.f22905e, c11377e.f22904e);
        }
        Object[] objArr = this.f25499e;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f25499e[i] = new C11377e(this, comparable, obj);
        this.f25497e++;
        return null;
    }

    public final void purchase() {
        if (this.f25498e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        purchase();
        Comparable comparable = (Comparable) obj;
        int appmetrica = appmetrica(comparable);
        if (appmetrica >= 0) {
            return license(appmetrica);
        }
        if (this.f25496e.isEmpty()) {
            return null;
        }
        return this.f25496e.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f25496e.size() + this.f25497e;
    }

    public final Set vip() {
        return this.f25496e.isEmpty() ? Collections.EMPTY_SET : this.f25496e.entrySet();
    }
}
