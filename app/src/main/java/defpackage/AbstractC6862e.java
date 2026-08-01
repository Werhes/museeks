package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؒؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6862e extends AbstractC7014e implements ListIterator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f14111e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f14112e;

    public AbstractC6862e(int i, int i2) {
        super(0);
        AbstractC2301e.loadAd(i2, i);
        this.f14112e = i;
        this.f14111e = i2;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f14111e < this.f14112e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14111e > 0;
    }

    @Override // defpackage.AbstractC7014e, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f14111e;
        this.f14111e = i + 1;
        return vip(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14111e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f14111e - 1;
        this.f14111e = i;
        return vip(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14111e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public abstract Object vip(int i);
}
