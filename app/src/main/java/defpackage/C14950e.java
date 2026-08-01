package defpackage;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۚٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C14950e implements Iterator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f29641e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Iterator f29642e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f29643e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f29644e;

    public C14950e(C2748e c2748e, ListIterator listIterator) {
        this.f29644e = 3;
        this.f29643e = c2748e;
        this.f29641e = c2748e.f17413e;
        this.f29642e = listIterator;
    }

    public C14950e(AbstractC8592e abstractC8592e) {
        this.f29644e = 3;
        this.f29643e = abstractC8592e;
        Collection collection = abstractC8592e.f17413e;
        this.f29641e = collection;
        this.f29642e = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public C14950e(C8680e c8680e) {
        this.f29644e = 6;
        this.f29643e = c8680e;
        Collection collection = c8680e.f17522e;
        this.f29641e = collection;
        this.f29642e = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public C14950e(C8680e c8680e, ListIterator listIterator) {
        this.f29644e = 6;
        this.f29643e = c8680e;
        this.f29641e = c8680e.f17522e;
        this.f29642e = listIterator;
    }

    public C14950e(C16166e c16166e) {
        this.f29644e = 1;
        this.f29643e = c16166e;
        this.f29642e = c16166e.f31766e.entrySet().iterator();
    }

    public C14950e(C16166e c16166e, byte b) {
        this.f29644e = 4;
        this.f29643e = c16166e;
        this.f29642e = c16166e.f31766e.entrySet().iterator();
    }

    public /* synthetic */ C14950e(AbstractSet abstractSet, Iterator it, int i) {
        this.f29644e = i;
        this.f29642e = it;
        this.f29643e = abstractSet;
    }

    public C14950e(Iterator it, Iterator it2) {
        this.f29644e = 0;
        this.f29641e = it;
        this.f29643e = it2;
    }

    public void ad() {
        Iterator it = (Iterator) this.f29643e;
        if (!it.hasNext()) {
            return;
        }
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!(entry.getValue() instanceof List)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add((InterfaceC3589e) entry.getValue());
                this.f29642e = arrayList.iterator();
                return;
            } else {
                List list = (List) entry.getValue();
                if (list.size() != 0) {
                    this.f29642e = list.iterator();
                    return;
                }
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f29644e) {
            case 0:
                Iterator it = (Iterator) this.f29641e;
                Iterator it2 = this.f29642e;
                if (it2 != null && it2.hasNext()) {
                    return true;
                }
                if (it.hasNext()) {
                    return it.hasNext();
                }
                return false;
            case 1:
                return this.f29642e.hasNext();
            case 2:
                return this.f29642e.hasNext();
            case 3:
                vip();
                return this.f29642e.hasNext();
            case 4:
                return this.f29642e.hasNext();
            case 5:
                return this.f29642e.hasNext();
            default:
                metrica();
                return this.f29642e.hasNext();
        }
    }

    public void metrica() {
        C8680e c8680e = (C8680e) this.f29643e;
        c8680e.billing();
        if (c8680e.f17522e != ((Collection) this.f29641e)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f29644e) {
            case 0:
                if (this.f29642e == null) {
                    ad();
                }
                Iterator it = this.f29642e;
                if (it != null && !it.hasNext()) {
                    ad();
                }
                Iterator it2 = this.f29642e;
                if (it2 != null) {
                    return (InterfaceC3589e) it2.next();
                }
                throw new NoSuchElementException();
            case 1:
                Map.Entry entry = (Map.Entry) this.f29642e.next();
                this.f29641e = (Collection) entry.getValue();
                return ((C16166e) this.f29643e).ad(entry);
            case 2:
                Map.Entry entry2 = (Map.Entry) this.f29642e.next();
                this.f29641e = entry2;
                return entry2.getKey();
            case 3:
                vip();
                return this.f29642e.next();
            case 4:
                Map.Entry entry3 = (Map.Entry) this.f29642e.next();
                this.f29641e = (Collection) entry3.getValue();
                Object key = entry3.getKey();
                Collection collection = (Collection) entry3.getValue();
                C6834e c6834e = (C6834e) ((C16166e) this.f29643e).f31764e;
                c6834e.getClass();
                List list = (List) collection;
                return new C5859e(key, list instanceof RandomAccess ? new C8680e(c6834e, key, list, null) : new C8680e(c6834e, key, list, null));
            case 5:
                Map.Entry entry4 = (Map.Entry) this.f29642e.next();
                this.f29641e = entry4;
                return entry4.getKey();
            default:
                metrica();
                return this.f29642e.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f29644e) {
            case 0:
                this.f29642e.remove();
                return;
            case 1:
                AbstractC2301e.admob("no calls to next() since the last call to remove()", ((Collection) this.f29641e) != null);
                this.f29642e.remove();
                ((AbstractC1837e) ((C16166e) this.f29643e).f31764e).f4931e -= ((Collection) this.f29641e).size();
                ((Collection) this.f29641e).clear();
                this.f29641e = null;
                return;
            case 2:
                AbstractC2301e.admob("no calls to next() since the last call to remove()", ((Map.Entry) this.f29641e) != null);
                Collection collection = (Collection) ((Map.Entry) this.f29641e).getValue();
                this.f29642e.remove();
                ((C5708e) this.f29643e).f12116e.f4931e -= collection.size();
                collection.clear();
                this.f29641e = null;
                return;
            case 3:
                this.f29642e.remove();
                AbstractC8592e abstractC8592e = (AbstractC8592e) this.f29643e;
                AbstractC1837e abstractC1837e = abstractC8592e.f17411e;
                abstractC1837e.f4931e--;
                abstractC8592e.yandex();
                return;
            case 4:
                if (!(((Collection) this.f29641e) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f29642e.remove();
                ((C6834e) ((C16166e) this.f29643e).f31764e).getClass();
                ((Collection) this.f29641e).size();
                ((Collection) this.f29641e).clear();
                this.f29641e = null;
                return;
            case 5:
                Map.Entry entry = (Map.Entry) this.f29641e;
                if (!(entry != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection2 = (Collection) entry.getValue();
                this.f29642e.remove();
                ((C11478e) this.f29643e).f23080e.getClass();
                collection2.size();
                collection2.clear();
                this.f29641e = null;
                return;
            default:
                this.f29642e.remove();
                ((C8680e) this.f29643e).yandex();
                return;
        }
    }

    public void vip() {
        AbstractC8592e abstractC8592e = (AbstractC8592e) this.f29643e;
        abstractC8592e.billing();
        if (abstractC8592e.f17413e != ((Collection) this.f29641e)) {
            throw new ConcurrentModificationException();
        }
    }
}
