package defpackage;

import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8507e implements Map, Serializable, j$.util.Map {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public transient AbstractC0281e f17298e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient AbstractC12614e f17299e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient AbstractC12614e f17300e;

    public static Csuper ad() {
        return new Csuper(4);
    }

    public static AbstractC8507e vip(Map map) {
        if ((map instanceof AbstractC8507e) && !(map instanceof SortedMap)) {
            return (AbstractC8507e) map;
        }
        Set entrySet = map.entrySet();
        Csuper csuper = new Csuper(entrySet instanceof Collection ? entrySet.size() : 4);
        csuper.mo3901case(entrySet);
        return csuper.mopub(true);
    }

    public abstract AbstractC0281e appmetrica();

    @Override // java.util.Map
    /* renamed from: billing, reason: merged with bridge method [inline-methods] */
    public AbstractC0281e values() {
        AbstractC0281e abstractC0281e = this.f17298e;
        if (abstractC0281e != null) {
            return abstractC0281e;
        }
        AbstractC0281e appmetrica = appmetrica();
        this.f17298e = appmetrica;
        return appmetrica;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
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
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        AbstractC12614e abstractC12614e = this.f17300e;
        if (abstractC12614e != null) {
            return abstractC12614e;
        }
        C5239e metrica = metrica();
        this.f17300e = metrica;
        return metrica;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC2641e.metrica(obj, this);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        AbstractC12614e abstractC12614e = this.f17300e;
        if (abstractC12614e == null) {
            abstractC12614e = metrica();
            this.f17300e = abstractC12614e;
        }
        return AbstractC6100e.purchase(abstractC12614e);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract C2520e license();

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    public abstract C5239e metrica();

    @Override // java.util.Map
    /* renamed from: purchase, reason: merged with bridge method [inline-methods] */
    public final AbstractC12614e keySet() {
        AbstractC12614e abstractC12614e = this.f17299e;
        if (abstractC12614e != null) {
            return abstractC12614e;
        }
        C2520e license = license();
        this.f17299e = license;
        return license;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
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

    public final String toString() {
        int size = size();
        AbstractC17595e.metrica(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
