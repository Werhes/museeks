package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؚٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9311e extends AbstractC7014e implements ListIterator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f18553e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f18554e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AbstractC6080e f18555e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9311e(AbstractC6080e abstractC6080e, int i) {
        super(1);
        int size = abstractC6080e.size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(AbstractC7023e.loadAd(i, size, "index"));
        }
        this.f18554e = size;
        this.f18553e = i;
        this.f18555e = abstractC6080e;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f18553e < this.f18554e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f18553e > 0;
    }

    @Override // defpackage.AbstractC7014e, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f18553e;
        this.f18553e = i + 1;
        return vip(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18553e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f18553e - 1;
        this.f18553e = i;
        return vip(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f18553e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object vip(int i) {
        return this.f18555e.get(i);
    }
}
