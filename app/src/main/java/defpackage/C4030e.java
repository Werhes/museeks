package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C6886e.class)
/* renamed from: eُؖؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4030e extends AbstractC1948e implements Map<String, AbstractC1948e>, InterfaceC16555e, j$.util.Map {
    public static final C9685e Companion = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Map f8962e;

    public C4030e(Map map) {
        this.f8962e = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f8962e.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof AbstractC1948e)) {
            return false;
        }
        return this.f8962e.containsValue((AbstractC1948e) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, AbstractC1948e>> entrySet() {
        return this.f8962e.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC7890e.billing(this.f8962e, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final AbstractC1948e get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (AbstractC1948e) this.f8962e.get((String) obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f8962e.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f8962e.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f8962e.keySet();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC1948e put(String str, AbstractC1948e abstractC1948e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends String, ? extends AbstractC1948e> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final AbstractC1948e remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f8962e.size();
    }

    public final String toString() {
        return AbstractC13480e.m3608try(this.f8962e.entrySet(), ",", "{", "}", new C17187e(5), 24);
    }

    @Override // java.util.Map
    public final Collection<AbstractC1948e> values() {
        return this.f8962e.values();
    }
}
