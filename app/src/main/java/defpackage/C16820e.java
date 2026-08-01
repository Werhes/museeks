package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘَٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C16820e extends C5708e implements SortedSet {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C7401e f32954e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16820e(C7401e c7401e, SortedMap sortedMap) {
        super(c7401e, sortedMap);
        this.f32954e = c7401e;
    }

    public SortedMap appmetrica() {
        return (SortedMap) this.f12117e;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return appmetrica().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return appmetrica().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C16820e(this.f32954e, appmetrica().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return appmetrica().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C16820e(this.f32954e, appmetrica().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C16820e(this.f32954e, appmetrica().tailMap(obj));
    }
}
