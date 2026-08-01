package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٞۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11890e extends AbstractC7014e implements ListIterator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f23821e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f23822e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AbstractC2753e f23823e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11890e(AbstractC2753e abstractC2753e, int i) {
        super(2);
        int size = abstractC2753e.size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(AbstractC0223e.loadAd(i, size, "index"));
        }
        this.f23822e = size;
        this.f23821e = i;
        this.f23823e = abstractC2753e;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f23821e < this.f23822e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f23821e > 0;
    }

    @Override // defpackage.AbstractC7014e, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f23821e;
        this.f23821e = i + 1;
        return vip(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f23821e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f23821e - 1;
        this.f23821e = i;
        return vip(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f23821e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object vip(int i) {
        return this.f23823e.get(i);
    }
}
