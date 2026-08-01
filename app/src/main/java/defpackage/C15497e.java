package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15497e extends AbstractMap {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ int f30610e = 0;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public volatile C10442e f30611e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f30614e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f30615e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public List f30613e = Collections.EMPTY_LIST;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Map f30612e = Collections.EMPTY_MAP;

    public C15497e(int i) {
        this.f30615e = i;
    }

    public final int ad(Comparable comparable) {
        int i;
        int size = this.f30613e.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((C14082e) this.f30613e.get(i2)).f27844e);
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((C14082e) this.f30613e.get(i4)).f27844e);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: appmetrica, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        vip();
        int ad = ad(comparable);
        if (ad >= 0) {
            return ((C14082e) this.f30613e.get(ad)).setValue(obj);
        }
        vip();
        boolean isEmpty = this.f30613e.isEmpty();
        int i = this.f30615e;
        if (isEmpty && !(this.f30613e instanceof ArrayList)) {
            this.f30613e = new ArrayList(i);
        }
        int i2 = -(ad + 1);
        if (i2 >= i) {
            return license().put(comparable, obj);
        }
        if (this.f30613e.size() == i) {
            C14082e c14082e = (C14082e) this.f30613e.remove(i - 1);
            license().put(c14082e.f27844e, c14082e.f27843e);
        }
        this.f30613e.add(i2, new C14082e(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        vip();
        if (!this.f30613e.isEmpty()) {
            this.f30613e.clear();
        }
        if (this.f30612e.isEmpty()) {
            return;
        }
        this.f30612e.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return ad(comparable) >= 0 || this.f30612e.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f30611e == null) {
            this.f30611e = new C10442e(1, this);
        }
        return this.f30611e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int ad = ad(comparable);
        return ad >= 0 ? ((C14082e) this.f30613e.get(ad)).f27843e : this.f30612e.get(comparable);
    }

    public final SortedMap license() {
        vip();
        if (this.f30612e.isEmpty() && !(this.f30612e instanceof TreeMap)) {
            this.f30612e = new TreeMap();
        }
        return (SortedMap) this.f30612e;
    }

    public final Iterable metrica() {
        return this.f30612e.isEmpty() ? AbstractC6494e.license : this.f30612e.entrySet();
    }

    public final Object purchase(int i) {
        vip();
        Object obj = ((C14082e) this.f30613e.remove(i)).f27843e;
        if (!this.f30612e.isEmpty()) {
            Iterator it = license().entrySet().iterator();
            List list = this.f30613e;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C14082e(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        vip();
        Comparable comparable = (Comparable) obj;
        int ad = ad(comparable);
        if (ad >= 0) {
            return purchase(ad);
        }
        if (this.f30612e.isEmpty()) {
            return null;
        }
        return this.f30612e.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f30612e.size() + this.f30613e.size();
    }

    public final void vip() {
        if (this.f30614e) {
            throw new UnsupportedOperationException();
        }
    }
}
