package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۧۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13653e extends AbstractC9359e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C1239e f27069e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27070e;

    public /* synthetic */ C13653e(C1239e c1239e, int i) {
        this.f27070e = i;
        this.f27069e = c1239e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f27070e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f27070e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f27070e) {
            case 0:
                this.f27069e.clear();
                return;
            default:
                this.f27069e.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f27070e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C1239e c1239e = this.f27069e;
                c1239e.getClass();
                int billing = c1239e.billing(entry.getKey());
                if (billing < 0) {
                    return false;
                }
                return AbstractC7890e.billing(c1239e.f3913e[billing], entry.getValue());
            default:
                return this.f27069e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f27070e) {
            case 0:
                C1239e c1239e = this.f27069e;
                c1239e.getClass();
                for (Object obj : collection) {
                    if (obj == null) {
                        return false;
                    }
                    try {
                        Map.Entry entry = (Map.Entry) obj;
                        int billing = c1239e.billing(entry.getKey());
                        if (!(billing < 0 ? false : AbstractC7890e.billing(c1239e.f3913e[billing], entry.getValue()))) {
                            return false;
                        }
                    } catch (ClassCastException unused) {
                        return false;
                    }
                }
                return true;
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f27070e) {
            case 0:
                return this.f27069e.isEmpty();
            default:
                return this.f27069e.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f27070e) {
            case 0:
                C1239e c1239e = this.f27069e;
                c1239e.getClass();
                return new C11697e(c1239e, 0);
            default:
                C1239e c1239e2 = this.f27069e;
                c1239e2.getClass();
                return new C11697e(c1239e2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f27070e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C1239e c1239e = this.f27069e;
                c1239e.metrica();
                int billing = c1239e.billing(entry.getKey());
                if (billing < 0 || !AbstractC7890e.billing(c1239e.f3913e[billing], entry.getValue())) {
                    return false;
                }
                c1239e.adcel(billing);
                return true;
            default:
                C1239e c1239e2 = this.f27069e;
                c1239e2.metrica();
                int billing2 = c1239e2.billing(obj);
                if (billing2 < 0) {
                    return false;
                }
                c1239e2.adcel(billing2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f27070e) {
            case 0:
                this.f27069e.metrica();
                return super.removeAll(collection);
            default:
                this.f27069e.metrica();
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f27070e) {
            case 0:
                this.f27069e.metrica();
                return super.retainAll(collection);
            default:
                this.f27069e.metrica();
                return super.retainAll(collection);
        }
    }

    @Override // defpackage.AbstractC9359e
    public final int subs() {
        switch (this.f27070e) {
            case 0:
                return this.f27069e.f3917e;
            default:
                return this.f27069e.f3917e;
        }
    }
}
