package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0053e implements ListIterator, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f1189e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f1190e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f1191e = 2;

    public C0053e(C3967e c3967e, C1170e c1170e) {
        this.f1190e = c3967e;
        this.f1189e = c1170e;
    }

    public C0053e(C11401e c11401e, int i) {
        this.f1189e = c11401e;
        this.f1190e = c11401e.f22924e.listIterator(AbstractC13480e.isVip(i, c11401e));
    }

    public C0053e(C15942e c15942e, int i) {
        this.f1189e = c15942e;
        this.f1190e = ((List) c15942e.f31401e).listIterator(AbstractC13480e.isVip(i, c15942e));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f1191e) {
            case 0:
                ListIterator listIterator = (ListIterator) this.f1190e;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1191e) {
            case 0:
                return ((ListIterator) this.f1190e).hasPrevious();
            case 1:
                return ((ListIterator) this.f1190e).hasPrevious();
            default:
                return ((C3967e) this.f1190e).f8852e < ((C1170e) this.f1189e).f3766e - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f1191e) {
            case 0:
                return ((ListIterator) this.f1190e).hasNext();
            case 1:
                return ((ListIterator) this.f1190e).hasNext();
            default:
                return ((C3967e) this.f1190e).f8852e >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f1191e) {
            case 0:
                return ((ListIterator) this.f1190e).previous();
            case 1:
                return ((ListIterator) this.f1190e).previous();
            default:
                C3967e c3967e = (C3967e) this.f1190e;
                int i = c3967e.f8852e + 1;
                C1170e c1170e = (C1170e) this.f1189e;
                C7582e.vip(i, c1170e.f3766e);
                c3967e.f8852e = i;
                return c1170e.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f1191e) {
            case 0:
                C11401e c11401e = (C11401e) this.f1189e;
                return AbstractC6874e.billing(c11401e) - ((ListIterator) this.f1190e).previousIndex();
            case 1:
                C15942e c15942e = (C15942e) this.f1189e;
                return AbstractC6874e.billing(c15942e) - ((ListIterator) this.f1190e).previousIndex();
            default:
                return ((C3967e) this.f1190e).f8852e + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f1191e) {
            case 0:
                return ((ListIterator) this.f1190e).next();
            case 1:
                return ((ListIterator) this.f1190e).next();
            default:
                C3967e c3967e = (C3967e) this.f1190e;
                int i = c3967e.f8852e;
                C1170e c1170e = (C1170e) this.f1189e;
                C7582e.vip(i, c1170e.f3766e);
                c3967e.f8852e = i - 1;
                return c1170e.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f1191e) {
            case 0:
                C11401e c11401e = (C11401e) this.f1189e;
                return AbstractC6874e.billing(c11401e) - ((ListIterator) this.f1190e).nextIndex();
            case 1:
                C15942e c15942e = (C15942e) this.f1189e;
                return AbstractC6874e.billing(c15942e) - ((ListIterator) this.f1190e).nextIndex();
            default:
                return ((C3967e) this.f1190e).f8852e;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f1191e) {
            case 0:
                ((ListIterator) this.f1190e).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f1191e) {
            case 0:
                ((ListIterator) this.f1190e).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }
}
