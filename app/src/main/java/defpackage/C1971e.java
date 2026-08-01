package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٝۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1971e implements ListIterator {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public ListIterator f5176e;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f5176e.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5176e.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f5176e.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5176e.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f5176e.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5176e.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
