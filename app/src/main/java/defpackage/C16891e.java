package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16891e extends AbstractC17765e implements ListIterator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractList f33104e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f33105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16891e(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.f33105e = i;
        this.f33104e = abstractList;
    }

    @Override // defpackage.AbstractC17765e
    public final Object ad(Object obj) {
        switch (this.f33105e) {
            case 0:
                return ((C0452e) this.f33104e).f2498e.apply(obj);
            default:
                return ((C1957e) this.f33104e).f5148e.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f34845e).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f34845e).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return ad(((ListIterator) this.f34845e).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f34845e).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
