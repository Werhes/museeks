package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؓٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1911e extends AbstractC7014e implements ListIterator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f5099e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f5100e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AbstractC2358e f5101e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1911e(AbstractC2358e abstractC2358e, int i) {
        super(5);
        int size = abstractC2358e.size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(AbstractC1596e.adcel(i, size, "index"));
        }
        this.f5100e = size;
        this.f5099e = i;
        this.f5101e = abstractC2358e;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f5099e < this.f5100e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5099e > 0;
    }

    @Override // defpackage.AbstractC7014e, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f5099e;
        this.f5099e = i + 1;
        return vip(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5099e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f5099e - 1;
        this.f5099e = i;
        return vip(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5099e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object vip(int i) {
        return this.f5101e.get(i);
    }
}
