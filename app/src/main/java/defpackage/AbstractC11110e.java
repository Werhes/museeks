package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٛۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11110e extends AbstractC17557e implements InterfaceC8346e, Collection, InterfaceC16555e {
    /* renamed from: class */
    public AbstractC11110e mo2797class(Collection collection) {
        if (collection.isEmpty()) {
            return this;
        }
        C4009e mo2798interface = mo2798interface();
        mo2798interface.addAll(collection);
        return mo2798interface.m1421class();
    }

    @Override // defpackage.AbstractC7674e, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.AbstractC7674e, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract AbstractC11110e firebase(Object obj);

    /* renamed from: interface */
    public abstract C4009e mo2798interface();

    @Override // defpackage.AbstractC17557e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final List subList(int i, int i2) {
        return new C5229e(this, i, i2);
    }

    /* renamed from: this */
    public abstract AbstractC11110e mo2799this(int i);
}
