package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3889e extends AbstractC12107e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C3889e f8715e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final transient AbstractC17475e f8716e;

    static {
        C2171e c2171e = AbstractC17475e.f34223e;
        f8715e = new C3889e(C1410e.f4222e, C5949e.f12529e);
    }

    public C3889e(AbstractC17475e abstractC17475e, Comparator comparator) {
        super(comparator);
        this.f8716e = abstractC17475e;
    }

    @Override // defpackage.AbstractC0281e
    public final int adcel() {
        return this.f8716e.adcel();
    }

    public final int ads(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f8716e, obj, this.f24269e);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    @Override // defpackage.AbstractC0281e
    public final boolean advert() {
        return this.f8716e.advert();
    }

    @Override // defpackage.AbstractC12614e, defpackage.AbstractC0281e
    public final AbstractC17475e appmetrica() {
        return this.f8716e;
    }

    @Override // defpackage.AbstractC0281e
    public final int billing(int i, Object[] objArr) {
        return this.f8716e.billing(i, objArr);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int premium = premium(obj, true);
        AbstractC17475e abstractC17475e = this.f8716e;
        if (premium == abstractC17475e.size()) {
            return null;
        }
        return abstractC17475e.get(premium);
    }

    @Override // defpackage.AbstractC0281e, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f8716e, obj, this.f24269e) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC8902e) {
            collection = ((C11994e) ((InterfaceC8902e) collection)).loadAd();
        }
        Comparator comparator = this.f24269e;
        if (!AbstractC16136e.appmetrica(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        AbstractC7014e it = iterator();
        Iterator it2 = collection.iterator();
        AbstractC6862e abstractC6862e = (AbstractC6862e) it;
        if (!abstractC6862e.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = abstractC6862e.next();
        while (true) {
            try {
                int compare = comparator.compare(next2, next);
                if (compare < 0) {
                    if (!abstractC6862e.hasNext()) {
                        return false;
                    }
                    next2 = abstractC6862e.next();
                } else if (compare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (compare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f8716e.crashlytics().listIterator(0);
    }

    @Override // defpackage.AbstractC12614e, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f8716e.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f24269e;
        if (!AbstractC16136e.appmetrica(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            AbstractC7014e it2 = iterator();
            do {
                AbstractC6862e abstractC6862e = (AbstractC6862e) it2;
                if (!abstractC6862e.hasNext()) {
                    return true;
                }
                next = abstractC6862e.next();
                next2 = it.next();
                if (next2 == null) {
                    return false;
                }
            } while (comparator.compare(next, next2) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f8716e.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int ads = ads(obj, true) - 1;
        if (ads == -1) {
            return null;
        }
        return this.f8716e.get(ads);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int premium = premium(obj, false);
        AbstractC17475e abstractC17475e = this.f8716e;
        if (premium == abstractC17475e.size()) {
            return null;
        }
        return abstractC17475e.get(premium);
    }

    public final C3889e inmobi(int i, int i2) {
        AbstractC17475e abstractC17475e = this.f8716e;
        if (i == 0 && i2 == abstractC17475e.size()) {
            return this;
        }
        Comparator comparator = this.f24269e;
        return i < i2 ? new C3889e(abstractC17475e.subList(i, i2), comparator) : AbstractC12107e.tapsense(comparator);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f8716e.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int ads = ads(obj, false) - 1;
        if (ads == -1) {
            return null;
        }
        return this.f8716e.get(ads);
    }

    public final int premium(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f8716e, obj, this.f24269e);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8716e.size();
    }

    @Override // defpackage.AbstractC0281e
    /* renamed from: smaato */
    public final AbstractC7014e iterator() {
        return this.f8716e.listIterator(0);
    }

    @Override // defpackage.AbstractC0281e
    public final int startapp() {
        return this.f8716e.startapp();
    }

    @Override // defpackage.AbstractC0281e
    public final Object[] yandex() {
        return this.f8716e.yandex();
    }
}
