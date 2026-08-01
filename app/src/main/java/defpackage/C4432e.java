package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۡٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4432e extends C1630e implements ListIterator {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC17557e f9610e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4432e(AbstractC17557e abstractC17557e, int i) {
        super(0, abstractC17557e);
        this.f9610e = abstractC17557e;
        int subs = abstractC17557e.subs();
        if (i < 0 || i > subs) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, subs, "index: ", ", size: "));
        }
        this.f4553e = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4553e > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4553e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f4553e - 1;
        this.f4553e = i;
        return this.f9610e.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4553e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
