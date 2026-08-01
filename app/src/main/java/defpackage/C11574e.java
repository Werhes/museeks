package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11574e extends C16820e implements NavigableSet {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C7401e f23252e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11574e(C7401e c7401e, NavigableMap navigableMap) {
        super(c7401e, navigableMap);
        this.f23252e = c7401e;
    }

    @Override // defpackage.C16820e
    /* renamed from: billing, reason: merged with bridge method [inline-methods] */
    public final NavigableMap appmetrica() {
        return (NavigableMap) ((SortedMap) this.f12117e);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return appmetrica().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C5708e) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C11574e(this.f23252e, appmetrica().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return appmetrica().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new C11574e(this.f23252e, appmetrica().headMap(obj, z));
    }

    @Override // defpackage.C16820e, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return appmetrica().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return appmetrica().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C14950e c14950e = (C14950e) iterator();
        if (!c14950e.hasNext()) {
            return null;
        }
        Object next = c14950e.next();
        c14950e.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (!descendingIterator.hasNext()) {
            return null;
        }
        Object next = descendingIterator.next();
        descendingIterator.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new C11574e(this.f23252e, appmetrica().subMap(obj, z, obj2, z2));
    }

    @Override // defpackage.C16820e, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new C11574e(this.f23252e, appmetrica().tailMap(obj, z));
    }

    @Override // defpackage.C16820e, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
