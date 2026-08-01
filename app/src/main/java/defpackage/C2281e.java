package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؔؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2281e extends C17251e implements NavigableMap {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C7401e f5776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2281e(C7401e c7401e, NavigableMap navigableMap) {
        super(c7401e, navigableMap);
        this.f5776e = c7401e;
    }

    public final C7750e appmetrica(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection billing = this.f5776e.billing();
        billing.addAll((Collection) entry.getValue());
        it.remove();
        return new C7750e(entry.getKey(), DesugarCollections.unmodifiableList((List) billing));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = license().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return ad(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return license().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C2281e(this.f5776e, license().descendingMap());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = license().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return ad(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = license().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return ad(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return license().floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new C2281e(this.f5776e, license().headMap(obj, z));
    }

    @Override // defpackage.C17251e, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = license().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return ad(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return license().higherKey(obj);
    }

    @Override // defpackage.C17251e, defpackage.C16166e, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = license().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return ad(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = license().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return ad(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return license().lowerKey(obj);
    }

    @Override // defpackage.C17251e
    /* renamed from: metrica */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return appmetrica(((C1914e) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return appmetrica(((C1914e) ((C16166e) descendingMap()).entrySet()).iterator());
    }

    @Override // defpackage.C17251e
    /* renamed from: purchase, reason: merged with bridge method [inline-methods] */
    public final NavigableMap license() {
        return (NavigableMap) ((SortedMap) this.f31766e);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new C2281e(this.f5776e, license().subMap(obj, z, obj2, z2));
    }

    @Override // defpackage.C17251e, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new C2281e(this.f5776e, license().tailMap(obj, z));
    }

    @Override // defpackage.C17251e, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // defpackage.C17251e
    public final SortedSet vip() {
        return new C11574e(this.f5776e, license());
    }
}
