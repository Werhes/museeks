package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؐۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8409e extends C14889e implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f29504e).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f29504e.iterator();
        it.getClass();
        InterfaceC11801e interfaceC11801e = this.f29503e;
        interfaceC11801e.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC11801e.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, eْٔۖ] */
    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new C14889e(((SortedSet) this.f29504e).headSet(obj), this.f29503e);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f29504e;
        while (true) {
            Object last = sortedSet.last();
            if (this.f29503e.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, eْٔۖ] */
    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C14889e(((SortedSet) this.f29504e).subSet(obj, obj2), this.f29503e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, eْٔۖ] */
    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new C14889e(((SortedSet) this.f29504e).tailSet(obj), this.f29503e);
    }
}
