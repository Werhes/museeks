package defpackage;

import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٙ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8017e implements Map, InterfaceC6770e, j$.util.Map {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ConcurrentHashMap f16271e = new ConcurrentHashMap(32);

    @Override // java.util.Map
    public final void clear() {
        this.f16271e.clear();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f16271e.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f16271e.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f16271e.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof java.util.Map) {
            return obj.equals(this.f16271e);
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f16271e.get(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f16271e.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f16271e.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f16271e.keySet();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f16271e.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        this.f16271e.putAll(map);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f16271e.remove(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        return this.f16271e.remove(obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f16271e.size();
    }

    public final String toString() {
        return "ConcurrentMapJvm by " + this.f16271e;
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f16271e.values();
    }
}
