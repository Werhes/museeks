package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣۣؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0661e implements InterfaceC17101e, InterfaceC16772e, List, InterfaceC10519e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ArrayList f2925e = new ArrayList();

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.f2925e.add(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return this.f2925e.add(obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.f2925e.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f2925e.addAll(collection);
    }

    @Override // defpackage.InterfaceC16772e
    public final void appmetrica() {
        throw new UnsupportedOperationException("Unmanaged lists cannot be deleted.");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f2925e.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f2925e.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f2925e.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return AbstractC7890e.billing(this.f2925e, obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f2925e.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f2925e.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f2925e.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f2925e.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f2925e.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f2925e.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f2925e.listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.f2925e.listIterator(i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return this.f2925e.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f2925e.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f2925e.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f2925e.retainAll(collection);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return this.f2925e.set(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f2925e.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.f2925e.subList(i, i2);
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
        return AbstractC5087e.m1746extends("UnmanagedRealmList{", AbstractC13480e.m3608try(this, null, null, null, null, 63), "}");
    }
}
