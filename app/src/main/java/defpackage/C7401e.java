package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۘٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7401e extends AbstractC1837e implements InterfaceC1276e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public transient C2856e f15163e;

    @Override // defpackage.AbstractC1837e, defpackage.AbstractC10415e
    public final Set appmetrica() {
        Map map = this.f4930e;
        return map instanceof NavigableMap ? new C11574e(this, (NavigableMap) map) : map instanceof SortedMap ? new C16820e(this, (SortedMap) map) : new C5708e(this, map);
    }

    @Override // defpackage.AbstractC1837e
    public final Collection billing() {
        return (List) this.f15163e.get();
    }

    @Override // defpackage.AbstractC1837e, defpackage.InterfaceC3143e
    public final Collection get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // defpackage.AbstractC1837e, defpackage.AbstractC10415e
    public final Map metrica() {
        Map map = this.f4930e;
        return map instanceof NavigableMap ? new C2281e(this, (NavigableMap) map) : map instanceof SortedMap ? new C17251e(this, (SortedMap) map) : new C16166e(this, map, 0);
    }

    @Override // defpackage.AbstractC1837e
    public final Collection startapp(Object obj, Collection collection) {
        List list = (List) collection;
        return list instanceof RandomAccess ? new C2748e(this, obj, list, null) : new C2748e(this, obj, list, null);
    }
}
