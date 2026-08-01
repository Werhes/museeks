package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C17650e.class)
/* renamed from: eؖؓٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3840e extends AbstractC4879e implements List<AbstractC4879e>, InterfaceC10519e {
    public static final C9529e Companion = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ArrayList f8474e = new ArrayList(C13664e.f27089e);

    @Override // java.util.List
    public final void add(int i, AbstractC4879e abstractC4879e) {
        this.f8474e.add(i, abstractC4879e);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return this.f8474e.add((AbstractC4879e) obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends AbstractC4879e> collection) {
        return this.f8474e.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f8474e.addAll(collection);
    }

    @Override // defpackage.AbstractC4879e
    public final int appmetrica() {
        return 5;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f8474e.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof AbstractC4879e)) {
            return false;
        }
        return this.f8474e.contains((AbstractC4879e) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f8474e.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C12232e c12232e = AbstractC3820e.ad;
        return AbstractC7890e.billing(c12232e.vip(C3840e.class), c12232e.vip(obj.getClass())) && AbstractC7890e.billing(this.f8474e, ((C3840e) obj).f8474e);
    }

    @Override // java.util.List
    public final AbstractC4879e get(int i) {
        return (AbstractC4879e) this.f8474e.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f8474e.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC4879e)) {
            return -1;
        }
        return this.f8474e.indexOf((AbstractC4879e) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f8474e.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f8474e.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC4879e)) {
            return -1;
        }
        return this.f8474e.lastIndexOf((AbstractC4879e) obj);
    }

    @Override // java.util.List
    public final ListIterator<AbstractC4879e> listIterator() {
        return this.f8474e.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<AbstractC4879e> listIterator(int i) {
        return this.f8474e.listIterator(i);
    }

    @Override // java.util.List
    public final AbstractC4879e remove(int i) {
        return (AbstractC4879e) this.f8474e.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof AbstractC4879e)) {
            return false;
        }
        return this.f8474e.remove((AbstractC4879e) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f8474e.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f8474e.retainAll(collection);
    }

    @Override // java.util.List
    public final AbstractC4879e set(int i, AbstractC4879e abstractC4879e) {
        return (AbstractC4879e) this.f8474e.set(i, abstractC4879e);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f8474e.size();
    }

    @Override // java.util.List
    public final List<AbstractC4879e> subList(int i, int i2) {
        return this.f8474e.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4533e.adcel(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4533e.mopub(this, objArr);
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("BsonArray(values="), AbstractC13480e.m3608try(this.f8474e, ",", "[", "]", null, 56), ')');
    }
}
