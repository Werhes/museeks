package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٗۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17326e extends AbstractC17475e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final transient AbstractC17475e f34010e;

    public C17326e(AbstractC17475e abstractC17475e) {
        this.f34010e = abstractC17475e;
    }

    @Override // defpackage.AbstractC0281e
    public final boolean advert() {
        return this.f34010e.advert();
    }

    @Override // defpackage.AbstractC17475e, java.util.List
    /* renamed from: class */
    public final AbstractC17475e subList(int i, int i2) {
        AbstractC17475e abstractC17475e = this.f34010e;
        AbstractC2301e.Signature(i, i2, abstractC17475e.size());
        return abstractC17475e.subList(abstractC17475e.size() - i2, abstractC17475e.size() - i).crashlytics();
    }

    @Override // defpackage.AbstractC17475e, defpackage.AbstractC0281e, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f34010e.contains(obj);
    }

    @Override // defpackage.AbstractC17475e
    public final AbstractC17475e crashlytics() {
        return this.f34010e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC17475e abstractC17475e = this.f34010e;
        AbstractC2301e.mopub(i, abstractC17475e.size());
        return abstractC17475e.get((abstractC17475e.size() - 1) - i);
    }

    @Override // defpackage.AbstractC17475e, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f34010e.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.AbstractC17475e, defpackage.AbstractC0281e, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.AbstractC17475e, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f34010e.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // defpackage.AbstractC17475e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.AbstractC17475e, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34010e.size();
    }
}
