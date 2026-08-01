package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٜٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11045e implements ListIterator, InterfaceC16555e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Object f21891e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f21892e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f21893e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f21894e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f21895e;

    public C11045e(C1169e c1169e, int i) {
        int i2;
        this.f21895e = 2;
        this.f21891e = c1169e;
        this.f21893e = i;
        this.f21892e = -1;
        i2 = ((AbstractList) c1169e).modCount;
        this.f21894e = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11045e(C2106e c2106e, int i, int i2) {
        this(c2106e, (i2 & 1) != 0 ? 0 : i, 0, c2106e.f5433e.vip);
        this.f21895e = 0;
    }

    public C11045e(C2106e c2106e, int i, int i2, int i3) {
        this.f21895e = 0;
        this.f21891e = c2106e;
        this.f21893e = i;
        this.f21892e = i2;
        this.f21894e = i3;
    }

    public C11045e(C12742e c12742e, int i) {
        this.f21895e = 3;
        this.f21891e = c12742e;
        this.f21893e = i - 1;
        this.f21892e = -1;
        this.f21894e = ((C4646e) AbstractC12909e.yandex(c12742e.f25493e)).appmetrica;
    }

    public C11045e(C15296e c15296e, int i) {
        this.f21895e = 1;
        this.f21891e = c15296e;
        this.f21893e = i;
        this.f21892e = -1;
        this.f21894e = C15296e.m3927class(c15296e);
    }

    public void ad() {
        int i;
        i = ((AbstractList) ((C15296e) this.f21891e).f30222e).modCount;
        if (i != this.f21894e) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        switch (this.f21895e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ad();
                C15296e c15296e = (C15296e) this.f21891e;
                int i2 = this.f21893e;
                this.f21893e = i2 + 1;
                c15296e.add(i2, obj);
                this.f21892e = -1;
                this.f21894e = C15296e.m3927class(c15296e);
                return;
            case 2:
                vip();
                C1169e c1169e = (C1169e) this.f21891e;
                int i3 = this.f21893e;
                this.f21893e = i3 + 1;
                c1169e.add(i3, obj);
                this.f21892e = -1;
                i = ((AbstractList) c1169e).modCount;
                this.f21894e = i;
                return;
            default:
                metrica();
                C12742e c12742e = (C12742e) this.f21891e;
                c12742e.add(this.f21893e + 1, obj);
                this.f21892e = -1;
                this.f21893e++;
                this.f21894e = C7582e.advert(c12742e);
                return;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f21895e) {
            case 0:
                return this.f21893e < this.f21894e;
            case 1:
                return this.f21893e < ((C15296e) this.f21891e).f30223e;
            case 2:
                return this.f21893e < ((C1169e) this.f21891e).f3762e;
            default:
                return this.f21893e < ((C12742e) this.f21891e).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f21895e) {
            case 0:
                return this.f21893e > this.f21892e;
            case 1:
                return this.f21893e > 0;
            case 2:
                return this.f21893e > 0;
            default:
                return this.f21893e >= 0;
        }
    }

    public void metrica() {
        if (C7582e.advert((C12742e) this.f21891e) != this.f21894e) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f21895e) {
            case 0:
                C12328e c12328e = ((C2106e) this.f21891e).f5433e;
                int i = this.f21893e;
                this.f21893e = i + 1;
                return (AbstractC13616e) c12328e.yandex(i);
            case 1:
                ad();
                int i2 = this.f21893e;
                C15296e c15296e = (C15296e) this.f21891e;
                if (i2 >= c15296e.f30223e) {
                    throw new NoSuchElementException();
                }
                this.f21893e = i2 + 1;
                this.f21892e = i2;
                return c15296e.f30226e[c15296e.f30224e + i2];
            case 2:
                vip();
                int i3 = this.f21893e;
                C1169e c1169e = (C1169e) this.f21891e;
                if (i3 >= c1169e.f3762e) {
                    throw new NoSuchElementException();
                }
                this.f21893e = i3 + 1;
                this.f21892e = i3;
                return c1169e.f3763e[i3];
            default:
                metrica();
                int i4 = this.f21893e + 1;
                this.f21892e = i4;
                C12742e c12742e = (C12742e) this.f21891e;
                C7582e.vip(i4, c12742e.size());
                Object obj = c12742e.get(i4);
                this.f21893e = i4;
                return obj;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f21895e) {
            case 0:
                return this.f21893e - this.f21892e;
            case 1:
                return this.f21893e;
            case 2:
                return this.f21893e;
            default:
                return this.f21893e + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f21895e) {
            case 0:
                C12328e c12328e = ((C2106e) this.f21891e).f5433e;
                int i = this.f21893e - 1;
                this.f21893e = i;
                return (AbstractC13616e) c12328e.yandex(i);
            case 1:
                ad();
                int i2 = this.f21893e;
                if (i2 <= 0) {
                    throw new NoSuchElementException();
                }
                int i3 = i2 - 1;
                this.f21893e = i3;
                this.f21892e = i3;
                C15296e c15296e = (C15296e) this.f21891e;
                return c15296e.f30226e[c15296e.f30224e + i3];
            case 2:
                vip();
                int i4 = this.f21893e;
                if (i4 <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i4 - 1;
                this.f21893e = i5;
                this.f21892e = i5;
                return ((C1169e) this.f21891e).f3763e[i5];
            default:
                metrica();
                int i6 = this.f21893e;
                C12742e c12742e = (C12742e) this.f21891e;
                C7582e.vip(i6, c12742e.size());
                int i7 = this.f21893e;
                this.f21892e = i7;
                this.f21893e--;
                return c12742e.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f21895e) {
            case 0:
                i = this.f21893e - this.f21892e;
                break;
            case 1:
                i = this.f21893e;
                break;
            case 2:
                i = this.f21893e;
                break;
            default:
                return this.f21893e;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        switch (this.f21895e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                C15296e c15296e = (C15296e) this.f21891e;
                ad();
                int i2 = this.f21892e;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c15296e.firebase(i2);
                this.f21893e = this.f21892e;
                this.f21892e = -1;
                this.f21894e = C15296e.m3927class(c15296e);
                return;
            case 2:
                C1169e c1169e = (C1169e) this.f21891e;
                vip();
                int i3 = this.f21892e;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c1169e.firebase(i3);
                this.f21893e = this.f21892e;
                this.f21892e = -1;
                i = ((AbstractList) c1169e).modCount;
                this.f21894e = i;
                return;
            default:
                metrica();
                C12742e c12742e = (C12742e) this.f21891e;
                c12742e.remove(this.f21892e);
                this.f21893e--;
                this.f21892e = -1;
                this.f21894e = C7582e.advert(c12742e);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f21895e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ad();
                int i = this.f21892e;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C15296e) this.f21891e).set(i, obj);
                return;
            case 2:
                vip();
                int i2 = this.f21892e;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C1169e) this.f21891e).set(i2, obj);
                return;
            default:
                C12742e c12742e = (C12742e) this.f21891e;
                metrica();
                int i3 = this.f21892e;
                if (i3 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                c12742e.set(i3, obj);
                this.f21894e = C7582e.advert(c12742e);
                return;
        }
    }

    public void vip() {
        int i;
        i = ((AbstractList) ((C1169e) this.f21891e)).modCount;
        if (i != this.f21894e) {
            throw new ConcurrentModificationException();
        }
    }
}
