package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4799e implements InterfaceC7103e, Set, InterfaceC16555e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C12618e f10227e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C12618e f10228e;

    public C4799e(C12618e c12618e) {
        this.f10228e = c12618e;
        this.f10227e = c12618e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f10227e.ad(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        C12618e c12618e = this.f10227e;
        int i = c12618e.license;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c12618e.advert(it.next());
        }
        return i != c12618e.license;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f10227e.vip();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f10228e.metrica(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f10228e.metrica(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4799e.class != obj.getClass()) {
            return false;
        }
        return AbstractC7890e.billing(this.f10228e, ((C4799e) obj).f10228e);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f10228e.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f10228e.yandex();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C5143e(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f10227e.smaato(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C12618e c12618e = this.f10227e;
        int i = c12618e.license;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c12618e.adcel(it.next());
        }
        return i != c12618e.license;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C12618e c12618e = this.f10227e;
        Object[] objArr = c12618e.vip;
        int i = c12618e.license;
        long[] jArr = c12618e.ad;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!AbstractC13480e.ads(collection, objArr[i5])) {
                                c12618e.amazon(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != c12618e.license;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f10228e.license;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4533e.adcel(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4533e.mopub(this, objArr);
    }

    public final String toString() {
        return this.f10228e.toString();
    }
}
