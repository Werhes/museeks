package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۛٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8218e extends AbstractC17557e implements List, Collection, InterfaceC16555e {
    /* renamed from: class */
    public abstract AbstractC8218e mo286class(Object obj);

    @Override // defpackage.AbstractC7674e, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.AbstractC7674e, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
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

    public abstract AbstractC8218e firebase(int i, Object obj);

    /* renamed from: interface */
    public AbstractC8218e mo287interface(Collection collection) {
        C0316e mo289this = mo289this();
        mo289this.addAll(collection);
        return mo289this.m301class();
    }

    @Override // defpackage.AbstractC17557e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: native */
    public abstract AbstractC8218e mo288native(C9501e c9501e);

    @Override // defpackage.AbstractC17557e, java.util.List
    public final List subList(int i, int i2) {
        return new C7714e(this, i, i2);
    }

    /* renamed from: this */
    public abstract C0316e mo289this();

    /* renamed from: try */
    public abstract AbstractC8218e mo290try(int i, Object obj);

    /* renamed from: while */
    public abstract AbstractC8218e mo291while(int i);
}
