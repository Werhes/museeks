package defpackage;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1957e extends AbstractSequentialList implements Serializable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC8223e f5148e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final List f5149e;

    public C1957e(InterfaceC8223e interfaceC8223e, List list) {
        list.getClass();
        this.f5149e = list;
        this.f5148e = interfaceC8223e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f5149e.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C16891e(this, this.f5149e.listIterator(i), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f5149e.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5149e.size();
    }
}
