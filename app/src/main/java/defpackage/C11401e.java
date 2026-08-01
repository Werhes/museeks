package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11401e extends AbstractC14012e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final List f22924e;

    public C11401e(ArrayList arrayList) {
        this.f22924e = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f22924e.add(AbstractC13480e.isVip(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f22924e.clear();
    }

    @Override // defpackage.AbstractC14012e
    public final Object firebase(int i) {
        return this.f22924e.remove(AbstractC13480e.tapsense(i, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f22924e.get(AbstractC13480e.tapsense(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C0053e(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new C0053e(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C0053e(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.f22924e.set(AbstractC13480e.tapsense(i, this), obj);
    }

    @Override // defpackage.AbstractC14012e
    public final int subs() {
        return this.f22924e.size();
    }
}
