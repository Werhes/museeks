package defpackage;

import j$.util.SortedSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۦؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12107e extends AbstractC12614e implements NavigableSet, InterfaceC14257e, SortedSet {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ int f24267e = 0;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public transient AbstractC12107e f24268e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient Comparator f24269e;

    public AbstractC12107e(Comparator comparator) {
        this.f24269e = comparator;
    }

    public static C3889e tapsense(Comparator comparator) {
        return C5949e.f12529e.equals(comparator) ? C3889e.f8715e : new C3889e(C1410e.f4222e, comparator);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f24269e;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        AbstractC12107e abstractC12107e = this.f24268e;
        if (abstractC12107e == null) {
            C3889e c3889e = (C3889e) this;
            Comparator reverseOrder = Collections.reverseOrder(c3889e.f24269e);
            abstractC12107e = c3889e.isEmpty() ? tapsense(reverseOrder) : new C3889e(c3889e.f8716e.crashlytics(), reverseOrder);
            this.f24268e = abstractC12107e;
            abstractC12107e.f24268e = this;
        }
        return abstractC12107e;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        C3889e c3889e = (C3889e) this;
        return c3889e.inmobi(0, c3889e.ads(obj, z));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final java.util.SortedSet headSet(Object obj) {
        obj.getClass();
        C3889e c3889e = (C3889e) this;
        return c3889e.inmobi(0, c3889e.ads(obj, false));
    }

    @Override // java.util.NavigableSet
    /* renamed from: isVip, reason: merged with bridge method [inline-methods] */
    public final C3889e subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        AbstractC2301e.billing(this.f24269e.compare(obj, obj2) <= 0);
        C3889e c3889e = (C3889e) this;
        C3889e inmobi = c3889e.inmobi(c3889e.premium(obj, z), c3889e.f8716e.size());
        return inmobi.inmobi(0, inmobi.ads(obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final java.util.SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        C3889e c3889e = (C3889e) this;
        return c3889e.inmobi(c3889e.premium(obj, z), c3889e.f8716e.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final java.util.SortedSet tailSet(Object obj) {
        obj.getClass();
        C3889e c3889e = (C3889e) this;
        return c3889e.inmobi(c3889e.premium(obj, true), c3889e.f8716e.size());
    }
}
