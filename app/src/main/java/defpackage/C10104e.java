package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10104e implements Set, InterfaceC16555e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C0583e f19952e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19953e;

    public /* synthetic */ C10104e(C0583e c0583e, int i) {
        this.f19953e = i;
        this.f19952e = c0583e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f19953e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f19953e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f19953e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f19953e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC7890e.billing(this.f19952e.billing(entry.getKey()), entry.getValue());
            default:
                return this.f19952e.metrica(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f19953e) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                if (collection2.isEmpty()) {
                    return true;
                }
                for (Map.Entry entry : collection2) {
                    if (!AbstractC7890e.billing(this.f19952e.billing(entry.getKey()), entry.getValue())) {
                        return false;
                    }
                }
                return true;
            default:
                Collection collection3 = collection;
                if (collection3.isEmpty()) {
                    return true;
                }
                Iterator it = collection3.iterator();
                while (it.hasNext()) {
                    if (!this.f19952e.metrica(it.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f19953e) {
            case 0:
                return this.f19952e.startapp();
            default:
                return this.f19952e.startapp();
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f19953e) {
            case 0:
                return AbstractC16342e.license(new C17888e(this, null, 0));
            default:
                return AbstractC16342e.license(new C17888e(this, null, 1));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f19953e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f19953e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f19953e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f19953e) {
            case 0:
                return this.f19952e.appmetrica;
            default:
                return this.f19952e.appmetrica;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f19953e) {
            case 0:
                return AbstractC4533e.adcel(this);
            default:
                return AbstractC4533e.adcel(this);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f19953e) {
            case 0:
                return AbstractC4533e.mopub(this, objArr);
            default:
                return AbstractC4533e.mopub(this, objArr);
        }
    }
}
