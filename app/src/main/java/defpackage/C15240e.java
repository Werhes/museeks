package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٕؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15240e extends AbstractC12606e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f30145e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30146e;

    public /* synthetic */ C15240e(int i, Object obj) {
        this.f30146e = i;
        this.f30145e = obj;
    }

    public C15240e(C0895e c0895e) {
        this.f30146e = 0;
        this.f30145e = c0895e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f30146e) {
            case 0:
                throw new UnsupportedOperationException("CaseInsensitiveMap.values does not support add");
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f30146e) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // defpackage.AbstractC12606e
    public final int appmetrica() {
        switch (this.f30146e) {
            case 0:
                return ((C0895e) this.f30145e).f3290e;
            case 1:
                return ((C1239e) this.f30145e).f3917e;
            default:
                return ((C6556e) this.f30145e).metrica();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        switch (this.f30146e) {
            case 1:
                ((C1239e) this.f30145e).clear();
                return;
            case 2:
                ((C6556e) this.f30145e).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f30146e) {
            case 1:
                return ((C1239e) this.f30145e).containsValue(obj);
            case 2:
                return ((C6556e) this.f30145e).containsValue(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f30146e) {
            case 1:
                return ((C1239e) this.f30145e).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f30146e) {
            case 0:
                return new C14225e((C0895e) this.f30145e, 2);
            case 1:
                C1239e c1239e = (C1239e) this.f30145e;
                c1239e.getClass();
                return new C11697e(c1239e, 2);
            default:
                C6556e c6556e = (C6556e) this.f30145e;
                AbstractC13502e[] abstractC13502eArr = new AbstractC13502e[8];
                for (int i = 0; i < 8; i++) {
                    abstractC13502eArr[i] = new C6783e(2);
                }
                return new C3792e(c6556e, abstractC13502eArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        int i;
        switch (this.f30146e) {
            case 1:
                C1239e c1239e = (C1239e) this.f30145e;
                c1239e.metrica();
                int i2 = c1239e.f3920e;
                while (true) {
                    i = -1;
                    i2--;
                    if (i2 >= 0) {
                        if (c1239e.f3911e[i2] >= 0 && AbstractC7890e.billing(c1239e.f3913e[i2], obj)) {
                            i = i2;
                        }
                    }
                }
                if (i < 0) {
                    return false;
                }
                c1239e.adcel(i);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f30146e) {
            case 1:
                ((C1239e) this.f30145e).metrica();
                return super.removeAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f30146e) {
            case 1:
                ((C1239e) this.f30145e).metrica();
                return super.retainAll(collection);
            default:
                return super.retainAll(collection);
        }
    }
}
