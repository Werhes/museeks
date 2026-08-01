package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٙؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5708e extends AbstractC16117e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1837e f12116e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Map f12117e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5708e(AbstractC1837e abstractC1837e, Map map) {
        super(0);
        this.f12116e = abstractC1837e;
        map.getClass();
        this.f12117e = map;
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
        return this.f12117e.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f12117e.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f12117e.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f12117e.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f12117e.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C14950e(this, this.f12117e.entrySet().iterator(), 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        Collection collection = (Collection) this.f12117e.remove(obj);
        if (collection != null) {
            i = collection.size();
            collection.clear();
            this.f12116e.f4931e -= i;
        } else {
            i = 0;
        }
        return i > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12117e.size();
    }
}
