package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٚۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8794e implements List, InterfaceC10519e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f17708e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17709e;

    public /* synthetic */ C8794e(int i, Object obj) {
        this.f17709e = i;
        this.f17708e = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        switch (this.f17709e) {
            case 0:
                C12328e c12328e = (C12328e) this.f17708e;
                if (i < 0 || i > (i2 = c12328e.vip)) {
                    StringBuilder premium = AbstractC4653e.premium("Index ", i, " must be in 0..");
                    premium.append(c12328e.vip);
                    AbstractC14783e.yandex(premium.toString());
                    throw null;
                }
                int i3 = i2 + 1;
                Object[] objArr = c12328e.ad;
                if (objArr.length < i3) {
                    c12328e.loadAd(i3, objArr);
                }
                Object[] objArr2 = c12328e.ad;
                int i4 = c12328e.vip;
                if (i != i4) {
                    AbstractC1660e.mopub(i + 1, i, i4, objArr2, objArr2);
                }
                objArr2[i] = obj;
                c12328e.vip++;
                return;
            default:
                ((C12431e) this.f17708e).ad(i, obj);
                return;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f17709e) {
            case 0:
                ((C12328e) this.f17708e).ad(obj);
                return true;
            default:
                ((C12431e) this.f17708e).license(obj);
                return true;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        switch (this.f17709e) {
            case 0:
                return ((C12328e) this.f17708e).license(i, collection);
            default:
                return ((C12431e) this.f17708e).billing(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f17709e) {
            case 0:
                C12328e c12328e = (C12328e) this.f17708e;
                int i = c12328e.vip;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c12328e.ad(it.next());
                }
                return i != c12328e.vip;
            default:
                C12431e c12431e = (C12431e) this.f17708e;
                return c12431e.billing(c12431e.f24868e, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f17709e) {
            case 0:
                ((C12328e) this.f17708e).purchase();
                return;
            default:
                ((C12431e) this.f17708e).startapp();
                return;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f17709e) {
            case 0:
                return ((C12328e) this.f17708e).startapp(obj) >= 0;
            default:
                return ((C12431e) this.f17708e).adcel(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f17709e) {
            case 0:
                C12328e c12328e = (C12328e) this.f17708e;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (c12328e.startapp(it.next()) < 0) {
                        return false;
                    }
                }
                return true;
            default:
                C12431e c12431e = (C12431e) this.f17708e;
                c12431e.getClass();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!c12431e.adcel(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.f17709e) {
            case 0:
                AbstractC4180e.ad(i, this);
                return ((C12328e) this.f17708e).yandex(i);
            default:
                AbstractC16032e.ad(i, this);
                return ((C12431e) this.f17708e).f24870e[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f17709e) {
            case 0:
                return ((C12328e) this.f17708e).startapp(obj);
            default:
                return ((C12431e) this.f17708e).advert(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f17709e) {
            case 0:
                return ((C12328e) this.f17708e).adcel();
            default:
                return ((C12431e) this.f17708e).f24868e == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f17709e) {
            case 0:
                return new C15986e(0, 0, this);
            default:
                return new C15986e(0, 1, this);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        switch (this.f17709e) {
            case 0:
                C12328e c12328e = (C12328e) this.f17708e;
                if (obj == null) {
                    Object[] objArr = c12328e.ad;
                    i = c12328e.vip - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                Object[] objArr2 = c12328e.ad;
                i = c12328e.vip - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr2[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                C12431e c12431e = (C12431e) this.f17708e;
                Object[] objArr3 = c12431e.f24870e;
                for (int i2 = c12431e.f24868e - 1; i2 >= 0; i2--) {
                    if (AbstractC7890e.billing(obj, objArr3[i2])) {
                        return i2;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f17709e) {
            case 0:
                return new C15986e(0, 0, this);
            default:
                return new C15986e(0, 1, this);
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f17709e) {
            case 0:
                return new C15986e(i, 0, this);
            default:
                return new C15986e(i, 1, this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        switch (this.f17709e) {
            case 0:
                AbstractC4180e.ad(i, this);
                return ((C12328e) this.f17708e).smaato(i);
            default:
                AbstractC16032e.ad(i, this);
                return ((C12431e) this.f17708e).amazon(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f17709e) {
            case 0:
                return ((C12328e) this.f17708e).advert(obj);
            default:
                return ((C12431e) this.f17708e).smaato(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f17709e) {
            case 0:
                C12328e c12328e = (C12328e) this.f17708e;
                int i = c12328e.vip;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c12328e.advert(it.next());
                }
                return i != c12328e.vip;
            default:
                C12431e c12431e = (C12431e) this.f17708e;
                c12431e.getClass();
                if (!collection.isEmpty()) {
                    int i2 = c12431e.f24868e;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        c12431e.smaato(it2.next());
                    }
                    if (i2 != c12431e.f24868e) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f17709e) {
            case 0:
                C12328e c12328e = (C12328e) this.f17708e;
                int i = c12328e.vip;
                Object[] objArr = c12328e.ad;
                for (int i2 = i - 1; -1 < i2; i2--) {
                    if (!collection.contains(objArr[i2])) {
                        c12328e.smaato(i2);
                    }
                }
                return i != c12328e.vip;
            default:
                C12431e c12431e = (C12431e) this.f17708e;
                int i3 = c12431e.f24868e;
                for (int i4 = i3 - 1; -1 < i4; i4--) {
                    if (!collection.contains(c12431e.f24870e[i4])) {
                        c12431e.amazon(i4);
                    }
                }
                return i3 != c12431e.f24868e;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        switch (this.f17709e) {
            case 0:
                AbstractC4180e.ad(i, this);
                return ((C12328e) this.f17708e).Signature(i, obj);
            default:
                AbstractC16032e.ad(i, this);
                Object[] objArr = ((C12431e) this.f17708e).f24870e;
                Object obj2 = objArr[i];
                objArr[i] = obj;
                return obj2;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        switch (this.f17709e) {
            case 0:
                return ((C12328e) this.f17708e).vip;
            default:
                return ((C12431e) this.f17708e).f24868e;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.f17709e) {
            case 0:
                AbstractC4180e.vip(i, i2, this);
                return new C9783e(i, i2, 0, this);
            default:
                AbstractC16032e.vip(i, i2, this);
                return new C9783e(i, i2, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f17709e) {
            case 0:
                return AbstractC4533e.adcel(this);
            default:
                return AbstractC4533e.adcel(this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f17709e) {
            case 0:
                return AbstractC4533e.mopub(this, objArr);
            default:
                return AbstractC4533e.mopub(this, objArr);
        }
    }
}
