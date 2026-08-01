package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16789e extends C14950e implements ListIterator {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C8680e f32899e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16789e(C8680e c8680e) {
        super(c8680e);
        this.f32899e = c8680e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16789e(C8680e c8680e, int i) {
        super(c8680e, ((List) c8680e.f17522e).listIterator(i));
        this.f32899e = c8680e;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C8680e c8680e = this.f32899e;
        boolean isEmpty = c8680e.isEmpty();
        metrica();
        ((ListIterator) this.f29642e).add(obj);
        if (isEmpty) {
            c8680e.appmetrica();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        metrica();
        return ((ListIterator) this.f29642e).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        metrica();
        return ((ListIterator) this.f29642e).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        metrica();
        return ((ListIterator) this.f29642e).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        metrica();
        return ((ListIterator) this.f29642e).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        metrica();
        ((ListIterator) this.f29642e).set(obj);
    }
}
