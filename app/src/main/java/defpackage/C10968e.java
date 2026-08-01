package defpackage;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10968e extends AbstractList implements RandomAccess, InterfaceC12326e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C1064e f21727e;

    public C10968e(C1064e c1064e) {
        this.f21727e = c1064e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f21727e.get(i);
    }

    @Override // defpackage.InterfaceC12326e
    public final void isPro(C1884e c1884e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C17658e c17658e = new C17658e();
        c17658e.f34610e = this.f21727e.iterator();
        return c17658e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ListIterator, eؓٝۡ, java.lang.Object] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        ?? obj = new Object();
        obj.f5176e = this.f21727e.listIterator(i);
        return obj;
    }

    @Override // defpackage.InterfaceC12326e
    public final AbstractC6732e pro(int i) {
        return this.f21727e.pro(i);
    }

    @Override // defpackage.InterfaceC12326e
    public final List purchase() {
        return DesugarCollections.unmodifiableList(this.f21727e.f3590e);
    }

    @Override // defpackage.InterfaceC12326e
    public final C10968e signatures() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21727e.size();
    }
}
