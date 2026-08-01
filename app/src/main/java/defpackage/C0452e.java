package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؑٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0452e extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC8223e f2498e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final List f2499e;

    public C0452e(InterfaceC8223e interfaceC8223e, List list) {
        list.getClass();
        this.f2499e = list;
        this.f2498e = interfaceC8223e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f2498e.apply(this.f2499e.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f2499e.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C16891e(this, this.f2499e.listIterator(i), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.f2498e.apply(this.f2499e.remove(i));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f2499e.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2499e.size();
    }
}
