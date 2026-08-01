package defpackage;

import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؘۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10093e implements Map, Serializable, j$.util.Map {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public transient C13837e f19943e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient C5402e f19944e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient Object[] f19945e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C13211e f19946e;

    public C10093e(Object[] objArr) {
        this.f19945e = objArr;
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
        C13837e c13837e = this.f19943e;
        if (c13837e == null) {
            c13837e = new C13837e(1, this.f19945e);
            this.f19943e = c13837e;
        }
        return c13837e.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C13211e c13211e = this.f19946e;
        if (c13211e != null) {
            return c13211e;
        }
        C13211e c13211e2 = new C13211e(this, this.f19945e);
        this.f19946e = c13211e2;
        return c13211e2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c A[RETURN] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L5
        L3:
            r4 = r0
            goto L19
        L5:
            r1 = 0
            java.lang.Object[] r2 = r3.f19945e
            r1 = r2[r1]
            j$.util.Objects.requireNonNull(r1)
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L3
            r4 = 1
            r4 = r2[r4]
            j$.util.Objects.requireNonNull(r4)
        L19:
            if (r4 != 0) goto L1c
            return r0
        L1c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10093e.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        C13211e c13211e = this.f19946e;
        if (c13211e == null) {
            c13211e = new C13211e(this, this.f19945e);
            this.f19946e = c13211e;
        }
        Iterator it = c13211e.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C5402e c5402e = this.f19944e;
        if (c5402e != null) {
            return c5402e;
        }
        C5402e c5402e2 = new C5402e(this, new C13837e(0, this.f19945e));
        this.f19944e = c5402e2;
        return c5402e2;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
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

    @Override // java.util.Map
    public final int size() {
        return 1;
    }

    public final String toString() {
        boolean z = true;
        StringBuilder sb = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
        sb.append('{');
        Iterator it = ((C13211e) entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
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

    @Override // java.util.Map
    public final Collection values() {
        C13837e c13837e = this.f19943e;
        if (c13837e != null) {
            return c13837e;
        }
        C13837e c13837e2 = new C13837e(1, this.f19945e);
        this.f19943e = c13837e2;
        return c13837e2;
    }
}
