package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14476e extends AbstractC7014e implements ListIterator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f28604e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f28605e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AbstractC3362e f28606e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14476e(AbstractC3362e abstractC3362e, int i) {
        super(7);
        int size = abstractC3362e.size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(AbstractC11866e.loadAd(i, size, "index"));
        }
        this.f28605e = size;
        this.f28604e = i;
        this.f28606e = abstractC3362e;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f28604e < this.f28605e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f28604e > 0;
    }

    @Override // defpackage.AbstractC7014e, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f28604e;
        this.f28604e = i + 1;
        return vip(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f28604e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f28604e - 1;
        this.f28604e = i;
        return vip(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f28604e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object vip(int i) {
        return this.f28606e.get(i);
    }
}
