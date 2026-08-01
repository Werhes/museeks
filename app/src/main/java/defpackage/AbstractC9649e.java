package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٟٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9649e implements ListIterator, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f19131e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f19132e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19133e;

    public /* synthetic */ AbstractC9649e(int i, int i2, int i3) {
        this.f19133e = i3;
        this.f19132e = i;
        this.f19131e = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        switch (this.f19133e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f19133e) {
            case 0:
                return this.f19132e < this.f19131e;
            default:
                return this.f19132e < this.f19131e;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f19133e) {
            case 0:
                return this.f19132e > 0;
            default:
                return this.f19132e > 0;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f19133e) {
            case 0:
                return this.f19132e;
            default:
                return this.f19132e;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f19133e) {
            case 0:
                i = this.f19132e;
                break;
            default:
                i = this.f19132e;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        switch (this.f19133e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        switch (this.f19133e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
