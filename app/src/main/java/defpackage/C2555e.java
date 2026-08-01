package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؔۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2555e extends AbstractC9359e implements Serializable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C2555e f6415e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C1239e f6416e;

    static {
        C1239e c1239e = C1239e.f3907e;
        f6415e = new C2555e(C1239e.f3907e);
    }

    public C2555e(C1239e c1239e) {
        this.f6416e = c1239e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f6416e.ad(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        this.f6416e.metrica();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f6416e.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f6416e.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f6416e.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C1239e c1239e = this.f6416e;
        c1239e.getClass();
        return new C11697e(c1239e, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C1239e c1239e = this.f6416e;
        c1239e.metrica();
        int billing = c1239e.billing(obj);
        if (billing < 0) {
            return false;
        }
        c1239e.adcel(billing);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        this.f6416e.metrica();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        this.f6416e.metrica();
        return super.retainAll(collection);
    }

    @Override // defpackage.AbstractC9359e
    public final int subs() {
        return this.f6416e.f3917e;
    }
}
