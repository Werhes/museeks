package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4109e implements Iterator, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f9067e = true;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f9068e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9069e;

    public /* synthetic */ C4109e(int i, Object obj) {
        this.f9069e = i;
        this.f9068e = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9069e) {
            case 0:
                return this.f9067e;
            case 1:
                return this.f9067e;
            default:
                return this.f9067e;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9069e) {
            case 0:
                if (!this.f9067e) {
                    throw new NoSuchElementException();
                }
                this.f9067e = false;
                return this.f9068e;
            case 1:
                if (!this.f9067e) {
                    throw new NoSuchElementException();
                }
                this.f9067e = false;
                return this.f9068e;
            default:
                if (!this.f9067e) {
                    throw new NoSuchElementException();
                }
                this.f9067e = false;
                return ((C3794e) this.f9068e).f8404e;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9069e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
