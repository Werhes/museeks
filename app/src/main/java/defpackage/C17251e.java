package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۚۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C17251e extends C16166e implements SortedMap {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C7401e f33790e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public SortedSet f33791e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17251e(C7401e c7401e, SortedMap sortedMap) {
        super(c7401e, sortedMap, 0);
        this.f33790e = c7401e;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return license().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return license().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C17251e(this.f33790e, license().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return license().lastKey();
    }

    public SortedMap license() {
        return (SortedMap) this.f31766e;
    }

    @Override // defpackage.C16166e, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    /* renamed from: metrica, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f33791e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet vip = vip();
        this.f33791e = vip;
        return vip;
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C17251e(this.f33790e, license().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C17251e(this.f33790e, license().tailMap(obj));
    }

    public SortedSet vip() {
        return new C16820e(this.f33790e, license());
    }
}
