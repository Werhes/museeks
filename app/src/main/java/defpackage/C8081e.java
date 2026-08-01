package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٝٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8081e extends AbstractC7014e implements ListIterator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f16395e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f16396e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AbstractC4354e f16397e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8081e(AbstractC4354e abstractC4354e, int i) {
        super(3);
        int size = abstractC4354e.size();
        AbstractC4608e.purchase(i, size);
        this.f16396e = size;
        this.f16395e = i;
        this.f16397e = abstractC4354e;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f16395e < this.f16396e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f16395e > 0;
    }

    @Override // defpackage.AbstractC7014e, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f16395e;
        this.f16395e = i + 1;
        return vip(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f16395e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f16395e - 1;
        this.f16395e = i;
        return vip(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f16395e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object vip(int i) {
        return this.f16397e.get(i);
    }
}
