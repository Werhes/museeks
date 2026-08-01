package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4108e implements Map, InterfaceC16555e, j$.util.Map {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C10104e f9063e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C10104e f9064e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C16580e f9065e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C0583e f9066e;

    public C4108e(C0583e c0583e) {
        this.f9066e = c0583e;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f9066e.metrica(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f9066e.license(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C10104e c10104e = this.f9064e;
        if (c10104e != null) {
            return c10104e;
        }
        C10104e c10104e2 = new C10104e(this.f9066e, 0);
        this.f9064e = c10104e2;
        return c10104e2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4108e.class != obj.getClass()) {
            return false;
        }
        return AbstractC7890e.billing(this.f9066e, ((C4108e) obj).f9066e);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f9066e.billing(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f9066e.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f9066e.startapp();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C10104e c10104e = this.f9063e;
        if (c10104e != null) {
            return c10104e;
        }
        C10104e c10104e2 = new C10104e(this.f9066e, 1);
        this.f9063e = c10104e2;
        return c10104e2;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f9066e.appmetrica;
    }

    public final String toString() {
        return this.f9066e.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C16580e c16580e = this.f9065e;
        if (c16580e != null) {
            return c16580e;
        }
        C16580e c16580e2 = new C16580e(this.f9066e);
        this.f9065e = c16580e2;
        return c16580e2;
    }
}
