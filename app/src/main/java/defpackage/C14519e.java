package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؖۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14519e extends AbstractMap {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC9892e f28715e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Map f28716e;

    public C14519e(Map map, InterfaceC9892e interfaceC9892e) {
        map.getClass();
        this.f28716e = map;
        this.f28715e = interfaceC9892e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f28716e.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f28716e.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new C1914e(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map map = this.f28716e;
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return this.f28715e.license(obj, obj2);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f28716e.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map map = this.f28716e;
        if (map.containsKey(obj)) {
            return this.f28715e.license(obj, map.remove(obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f28716e.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new C17403e(this, 3);
    }
}
