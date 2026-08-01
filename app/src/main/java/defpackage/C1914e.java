package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؓٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1914e extends AbstractC16117e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractMap f5103e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f5104e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1914e(AbstractMap abstractMap, int i) {
        super(0);
        this.f5104e = i;
        this.f5103e = abstractMap;
    }

    public final boolean appmetrica(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Map billing = billing();
        billing.getClass();
        try {
            obj2 = billing.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        if (AbstractC13328e.metrica(obj2, entry.getValue())) {
            return obj2 != null || billing().containsKey(key);
        }
        return false;
    }

    public final Map billing() {
        switch (this.f5104e) {
            case 0:
                return (C16166e) this.f5103e;
            default:
                return (C14519e) this.f5103e;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        billing().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f5104e) {
            case 0:
                Set entrySet = ((C16166e) this.f5103e).f31766e.entrySet();
                entrySet.getClass();
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return appmetrica(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return billing().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f5104e) {
            case 0:
                return new C14950e((C16166e) this.f5103e);
            default:
                C14519e c14519e = (C14519e) this.f5103e;
                Iterator it = c14519e.f28716e.entrySet().iterator();
                InterfaceC9892e interfaceC9892e = c14519e.f28715e;
                interfaceC9892e.getClass();
                return new C2538e(it, new C2713e(0, interfaceC9892e));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Object obj2;
        switch (this.f5104e) {
            case 0:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractC1837e abstractC1837e = (AbstractC1837e) ((C16166e) this.f5103e).f31764e;
                Object key = entry.getKey();
                Map map = abstractC1837e.f4930e;
                map.getClass();
                try {
                    obj2 = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection != null) {
                    int size = collection.size();
                    collection.clear();
                    abstractC1837e.f4931e -= size;
                }
                return true;
            default:
                return yandex(obj);
        }
    }

    @Override // defpackage.AbstractC16117e, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return AbstractC6100e.amazon(this, collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= remove(it.next());
            }
            return z;
        }
    }

    @Override // defpackage.AbstractC16117e, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet mopub = AbstractC6100e.mopub(collection.size());
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    mopub.add(((Map.Entry) obj).getKey());
                }
            }
            return billing().keySet().retainAll(mopub);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return billing().size();
    }

    public final boolean yandex(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return billing().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }
}
