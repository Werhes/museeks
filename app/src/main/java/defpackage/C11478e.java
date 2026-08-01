package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11478e extends AbstractC16117e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C6834e f23080e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Map f23081e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11478e(C6834e c6834e, Map map) {
        super(1);
        this.f23080e = c6834e;
        this.f23081e = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C14950e c14950e = (C14950e) it;
            if (!c14950e.hasNext()) {
                return;
            }
            c14950e.next();
            c14950e.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f23081e.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f23081e.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f23081e.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f23081e.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f23081e.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C14950e(this, this.f23081e.entrySet().iterator(), 5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f23081e.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f23080e.getClass();
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f23081e.size();
    }
}
