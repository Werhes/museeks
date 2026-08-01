package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٔۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C14889e extends AbstractCollection implements Set {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC11801e f29503e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Set f29504e;

    public C14889e(Set set, InterfaceC11801e interfaceC11801e) {
        this.f29504e = set;
        this.f29503e = interfaceC11801e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        AbstractC2301e.billing(this.f29503e.apply(obj));
        return this.f29504e.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC2301e.billing(this.f29503e.apply(it.next()));
        }
        return this.f29504e.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f29504e;
        boolean z = set instanceof RandomAccess;
        InterfaceC11801e interfaceC11801e = this.f29503e;
        if (!z || !(set instanceof List)) {
            Iterator it = set.iterator();
            interfaceC11801e.getClass();
            while (it.hasNext()) {
                if (interfaceC11801e.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        interfaceC11801e.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!interfaceC11801e.apply(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        AbstractC4306e.billing(list, interfaceC11801e, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        AbstractC4306e.billing(list, interfaceC11801e, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z;
        Set set = this.f29504e;
        set.getClass();
        try {
            z = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        if (z) {
            return this.f29503e.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
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
        return AbstractC6100e.license(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC6100e.purchase(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f29504e.iterator();
        InterfaceC11801e interfaceC11801e = this.f29503e;
        AbstractC2301e.amazon(interfaceC11801e, "predicate");
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (interfaceC11801e.apply(it.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f29504e.iterator();
        it.getClass();
        InterfaceC11801e interfaceC11801e = this.f29503e;
        interfaceC11801e.getClass();
        return new C5137e(it, interfaceC11801e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f29504e.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f29504e.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f29503e.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f29504e.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f29503e.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f29504e.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f29503e.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            C5137e c5137e = (C5137e) it;
            if (!c5137e.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(c5137e.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            C5137e c5137e = (C5137e) it;
            if (!c5137e.hasNext()) {
                return arrayList.toArray(objArr);
            }
            arrayList.add(c5137e.next());
        }
    }
}
