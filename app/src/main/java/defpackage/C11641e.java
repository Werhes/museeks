package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11641e extends AbstractC17475e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC17475e f23390e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final transient int f23391e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient int f23392e;

    public C11641e(AbstractC17475e abstractC17475e, int i, int i2) {
        this.f23390e = abstractC17475e;
        this.f23391e = i;
        this.f23392e = i2;
    }

    @Override // defpackage.AbstractC0281e
    public final int adcel() {
        return this.f23390e.adcel() + this.f23391e;
    }

    @Override // defpackage.AbstractC0281e
    public final boolean advert() {
        return true;
    }

    @Override // defpackage.AbstractC17475e, java.util.List
    /* renamed from: class, reason: not valid java name */
    public final AbstractC17475e subList(int i, int i2) {
        AbstractC2301e.Signature(i, i2, this.f23392e);
        int i3 = this.f23391e;
        return this.f23390e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC2301e.mopub(i, this.f23392e);
        return this.f23390e.get(i + this.f23391e);
    }

    @Override // defpackage.AbstractC17475e, defpackage.AbstractC0281e, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
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
        return this.f23392e;
    }

    @Override // defpackage.AbstractC0281e
    public final int startapp() {
        return this.f23390e.adcel() + this.f23391e + this.f23392e;
    }

    @Override // defpackage.AbstractC0281e
    public final Object[] yandex() {
        return this.f23390e.yandex();
    }
}
