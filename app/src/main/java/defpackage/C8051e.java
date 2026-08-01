package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٛٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8051e implements ListIterator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C11615e f16355e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ ListIterator f16356e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f16357e;

    public C8051e(C11615e c11615e, ListIterator listIterator) {
        this.f16356e = listIterator;
        this.f16355e = c11615e;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f16356e;
        listIterator.add(obj);
        listIterator.previous();
        this.f16357e = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f16356e.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f16356e.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.f16356e;
        if (!listIterator.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f16357e = true;
        return listIterator.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f16355e.appmetrica(this.f16356e.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.f16356e;
        if (!listIterator.hasNext()) {
            throw new NoSuchElementException();
        }
        this.f16357e = true;
        return listIterator.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        AbstractC2301e.admob("no calls to next() since the last call to remove()", this.f16357e);
        this.f16356e.remove();
        this.f16357e = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        AbstractC2301e.subscription(this.f16357e);
        this.f16356e.set(obj);
    }
}
