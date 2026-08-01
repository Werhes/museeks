package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C16166e extends AbstractMap {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f31764e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public transient AbstractSet f31765e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final transient Map f31766e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public transient AbstractCollection f31767e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31768e;

    public /* synthetic */ C16166e(Serializable serializable, Map map, int i) {
        this.f31768e = i;
        this.f31764e = serializable;
        this.f31766e = map;
    }

    public C7750e ad(Map.Entry entry) {
        Object key = entry.getKey();
        return new C7750e(key, ((AbstractC1837e) this.f31764e).startapp(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.f31768e) {
            case 0:
                AbstractC1837e abstractC1837e = (AbstractC1837e) this.f31764e;
                if (this.f31766e == abstractC1837e.f4930e) {
                    abstractC1837e.clear();
                    return;
                }
                C14950e c14950e = new C14950e(this);
                while (c14950e.hasNext()) {
                    c14950e.next();
                    c14950e.remove();
                }
                return;
            default:
                C6834e c6834e = (C6834e) this.f31764e;
                if (this.f31766e != c6834e.f14065e) {
                    C14950e c14950e2 = new C14950e(this, (byte) 0);
                    while (c14950e2.hasNext()) {
                        c14950e2.next();
                        c14950e2.remove();
                    }
                    return;
                }
                C3638e c3638e = c6834e.f14065e;
                Iterator it = c3638e.values().iterator();
                while (it.hasNext()) {
                    ((Collection) it.next()).clear();
                }
                c3638e.clear();
                return;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f31768e) {
            case 0:
                Map map = this.f31766e;
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                Map map2 = this.f31766e;
                map2.getClass();
                try {
                    return map2.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.f31768e) {
            case 0:
                C1914e c1914e = (C1914e) this.f31765e;
                if (c1914e != null) {
                    return c1914e;
                }
                C1914e c1914e2 = new C1914e(this, 0);
                this.f31765e = c1914e2;
                return c1914e2;
            default:
                C17294e c17294e = (C17294e) this.f31765e;
                if (c17294e != null) {
                    return c17294e;
                }
                C17294e c17294e2 = new C17294e(this);
                this.f31765e = c17294e2;
                return c17294e2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        switch (this.f31768e) {
            case 0:
                return this == obj || this.f31766e.equals(obj);
            default:
                return this == obj || this.f31766e.equals(obj);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f31768e) {
            case 0:
                Map map = this.f31766e;
                map.getClass();
                try {
                    obj2 = map.get(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection == null) {
                    return null;
                }
                return ((AbstractC1837e) this.f31764e).startapp(obj, collection);
            default:
                Map map2 = this.f31766e;
                map2.getClass();
                try {
                    obj3 = map2.get(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    obj3 = null;
                }
                Collection collection2 = (Collection) obj3;
                if (collection2 == null) {
                    return null;
                }
                C6834e c6834e = (C6834e) this.f31764e;
                c6834e.getClass();
                List list = (List) collection2;
                return list instanceof RandomAccess ? new C8680e(c6834e, obj, list, null) : new C8680e(c6834e, obj, list, null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        switch (this.f31768e) {
            case 0:
                return this.f31766e.hashCode();
            default:
                return this.f31766e.hashCode();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        switch (this.f31768e) {
            case 0:
                return ((AbstractC1837e) this.f31764e).keySet();
            default:
                C6834e c6834e = (C6834e) this.f31764e;
                C11478e c11478e = c6834e.f15261e;
                if (c11478e != null) {
                    return c11478e;
                }
                C11478e c11478e2 = new C11478e(c6834e, c6834e.f14065e);
                c6834e.f15261e = c11478e2;
                return c11478e2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        switch (this.f31768e) {
            case 0:
                AbstractC1837e abstractC1837e = (AbstractC1837e) this.f31764e;
                Collection collection = (Collection) this.f31766e.remove(obj);
                if (collection == null) {
                    return null;
                }
                Collection billing = abstractC1837e.billing();
                billing.addAll(collection);
                abstractC1837e.f4931e -= collection.size();
                collection.clear();
                return billing;
            default:
                C6834e c6834e = (C6834e) this.f31764e;
                Collection collection2 = (Collection) this.f31766e.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                c6834e.getClass();
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection2);
                collection2.size();
                collection2.clear();
                return arrayList;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.f31768e) {
            case 0:
                return this.f31766e.size();
            default:
                return this.f31766e.size();
        }
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        switch (this.f31768e) {
            case 0:
                return this.f31766e.toString();
            default:
                return this.f31766e.toString();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.f31768e) {
            case 0:
                C17403e c17403e = (C17403e) this.f31767e;
                if (c17403e != null) {
                    return c17403e;
                }
                C17403e c17403e2 = new C17403e(this, 3);
                this.f31767e = c17403e2;
                return c17403e2;
            default:
                C17403e c17403e3 = (C17403e) this.f31767e;
                if (c17403e3 != null) {
                    return c17403e3;
                }
                C17403e c17403e4 = new C17403e(this, 5);
                this.f31767e = c17403e4;
                return c17403e4;
        }
    }
}
