package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17765e implements Iterator {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Iterator f34845e;

    public AbstractC17765e(Iterator it) {
        it.getClass();
        this.f34845e = it;
    }

    public abstract Object ad(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34845e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ad(this.f34845e.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f34845e.remove();
    }
}
