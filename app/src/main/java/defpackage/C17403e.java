package defpackage;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۥۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C17403e extends AbstractCollection {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f34115e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34116e;

    public /* synthetic */ C17403e(int i, Object obj) {
        this.f34116e = i;
        this.f34115e = obj;
    }

    public /* synthetic */ C17403e(AbstractMap abstractMap, int i) {
        this.f34116e = i;
        this.f34115e = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f34116e) {
            case 0:
                ((AbstractC10415e) this.f34115e).clear();
                return;
            case 1:
                ((AbstractC1837e) this.f34115e).clear();
                return;
            case 2:
                ((C3638e) this.f34115e).clear();
                return;
            case 3:
                ((AbstractMap) this.f34115e).clear();
                return;
            case 4:
                ((C3638e) this.f34115e).clear();
                return;
            default:
                ((C16166e) this.f34115e).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f34116e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((AbstractC10415e) this.f34115e).ad(entry.getKey(), entry.getValue());
            case 1:
                return ((AbstractC1837e) this.f34115e).vip(obj);
            case 2:
            case 4:
            default:
                return super.contains(obj);
            case 3:
                return ((AbstractMap) this.f34115e).containsValue(obj);
            case 5:
                return ((C16166e) this.f34115e).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f34116e) {
            case 3:
                return ((AbstractMap) this.f34115e).isEmpty();
            case 4:
            default:
                return super.isEmpty();
            case 5:
                return ((C16166e) this.f34115e).isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f34116e) {
            case 0:
                return ((AbstractC10415e) this.f34115e).purchase();
            case 1:
                return new C1090e((AbstractC1837e) this.f34115e, 0);
            case 2:
                C3638e c3638e = (C3638e) this.f34115e;
                Map metrica = c3638e.metrica();
                return metrica != null ? metrica.values().iterator() : new C3038e(c3638e, 2);
            case 3:
                return new AbstractC17765e(((AbstractMap) this.f34115e).entrySet().iterator());
            case 4:
                C3638e c3638e2 = (C3638e) this.f34115e;
                Map Signature = c3638e2.Signature();
                return Signature != null ? Signature.values().iterator() : new C7196e(c3638e2, 2);
            default:
                return new C17658e(((C16166e) this.f34115e).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f34116e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((AbstractC10415e) this.f34115e).remove(entry.getKey(), entry.getValue());
            case 3:
                AbstractMap abstractMap = (AbstractMap) this.f34115e;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry2 : abstractMap.entrySet()) {
                        if (AbstractC13328e.metrica(obj, entry2.getValue())) {
                            abstractMap.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 5:
                C16166e c16166e = (C16166e) this.f34115e;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry3 : c16166e.entrySet()) {
                        if (AbstractC6437e.license(obj, entry3.getValue())) {
                            c16166e.remove(entry3.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f34116e) {
            case 3:
                AbstractMap abstractMap = (AbstractMap) this.f34115e;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet);
                }
            case 4:
            default:
                return super.removeAll(collection);
            case 5:
                C16166e c16166e = (C16166e) this.f34115e;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : c16166e.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((C6834e) c16166e.f31764e).vip().removeAll(hashSet2);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f34116e) {
            case 3:
                AbstractMap abstractMap = (AbstractMap) this.f34115e;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet);
                }
            case 4:
            default:
                return super.retainAll(collection);
            case 5:
                C16166e c16166e = (C16166e) this.f34115e;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : c16166e.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((C6834e) c16166e.f31764e).vip().retainAll(hashSet2);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f34116e) {
            case 0:
                return ((AbstractC10415e) this.f34115e).size();
            case 1:
                return ((AbstractC1837e) this.f34115e).f4931e;
            case 2:
                return ((C3638e) this.f34115e).size();
            case 3:
                return ((AbstractMap) this.f34115e).size();
            case 4:
                return ((C3638e) this.f34115e).size();
            default:
                return ((C16166e) this.f34115e).f31766e.size();
        }
    }
}
