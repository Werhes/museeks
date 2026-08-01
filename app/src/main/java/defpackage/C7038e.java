package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7038e extends AbstractC7014e implements ListIterator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f14401e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f14402e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AbstractC8718e f14403e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7038e(AbstractC8718e abstractC8718e, int i) {
        super(6);
        int size = abstractC8718e.size();
        AbstractC0259e.yandex(i, size);
        this.f14402e = size;
        this.f14401e = i;
        this.f14403e = abstractC8718e;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f14401e < this.f14402e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14401e > 0;
    }

    @Override // defpackage.AbstractC7014e, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f14401e;
        this.f14401e = i + 1;
        return vip(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14401e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f14401e - 1;
        this.f14401e = i;
        return vip(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14401e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object vip(int i) {
        return this.f14403e.get(i);
    }
}
