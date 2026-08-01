package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٜؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16343e implements Iterator, InterfaceC16555e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Object f32106e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f32107e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f32108e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f32109e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32110e;

    public C16343e(C12977e c12977e) {
        this.f32110e = 1;
        this.f32106e = c12977e;
        this.f32108e = c12977e.f25863e.startapp();
        this.f32109e = -1;
    }

    public C16343e(C18516e c18516e, int i, int i2) {
        this.f32110e = 0;
        this.f32106e = c18516e;
        this.f32108e = i2;
        this.f32107e = i;
        this.f32109e = c18516e.f36305e;
        if (c18516e.f36310e) {
            AbstractC2855e.billing();
        }
    }

    public void ad() {
        if (((C12977e) this.f32106e).f25863e.startapp() != this.f32108e) {
            throw new ConcurrentModificationException("The underlying RealmSet was modified while iterating it.");
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f32110e) {
            case 0:
                return this.f32107e < this.f32108e;
            default:
                ad();
                return this.f32107e < ((C12977e) this.f32106e).subs();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f32110e) {
            case 0:
                C18516e c18516e = (C18516e) this.f32106e;
                int i = c18516e.f36305e;
                int i2 = this.f32109e;
                if (i != i2) {
                    AbstractC2855e.billing();
                }
                int i3 = this.f32107e;
                this.f32107e = AbstractC2855e.ad(c18516e.f36309e, i3) + i3;
                return new C7778e(c18516e, i3, i2);
            default:
                ad();
                int i4 = this.f32107e;
                C12977e c12977e = (C12977e) this.f32106e;
                if (i4 >= c12977e.subs()) {
                    throw new IndexOutOfBoundsException(AbstractC8647e.inmobi(i4, c12977e.subs(), "Cannot access index ", " when size is ", ". Remember to check hasNext() before using next()."));
                }
                Object obj = c12977e.f25863e.get(i4);
                this.f32109e = i4;
                this.f32107e = i4 + 1;
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f32110e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ad();
                C12977e c12977e = (C12977e) this.f32106e;
                InterfaceC16112e interfaceC16112e = c12977e.f25863e;
                if (c12977e.subs() == 0) {
                    throw new NoSuchElementException("Could not remove last element returned by the iterator: set is empty.");
                }
                int i = this.f32109e;
                if (i < 0) {
                    throw new IllegalStateException("Could not remove last element returned by the iterator: iterator never returned an element.");
                }
                boolean remove = interfaceC16112e.remove(interfaceC16112e.get(i));
                int i2 = this.f32109e;
                int i3 = this.f32107e;
                if (i2 < i3) {
                    this.f32107e = i3 - 1;
                }
                this.f32109e = -1;
                this.f32108e = interfaceC16112e.startapp();
                if (!remove) {
                    throw new NoSuchElementException("Could not remove last element returned by the iterator: was there an element to remove?");
                }
                return;
        }
    }
}
