package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C11615e extends AbstractList {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final List f23325e;

    public C11615e(List list) {
        list.getClass();
        this.f23325e = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f23325e.add(appmetrica(i), obj);
    }

    public final int appmetrica(int i) {
        int size = this.f23325e.size();
        AbstractC2301e.loadAd(i, size);
        return size - i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f23325e.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.f23325e;
        int size = list.size();
        AbstractC2301e.mopub(i, size);
        return list.get((size - 1) - i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C8051e(this, this.f23325e.listIterator(appmetrica(i)));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        List list = this.f23325e;
        int size = list.size();
        AbstractC2301e.mopub(i, size);
        return list.remove((size - 1) - i);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        List list = this.f23325e;
        int size = list.size();
        AbstractC2301e.mopub(i, size);
        return list.set((size - 1) - i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23325e.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        List list = this.f23325e;
        AbstractC2301e.Signature(i, i2, list.size());
        return AbstractC10589e.appmetrica(list.subList(appmetrica(i2), appmetrica(i)));
    }
}
