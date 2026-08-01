package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۨۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2271e extends C17519e implements Map, j$.util.Map {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C15627e f5762e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C10442e f5763e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C9323e f5764e;

    public C2271e() {
        super(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2271e(C17519e c17519e) {
        super(0);
        int i = c17519e.f34352e;
        vip(this.f34352e + i);
        if (this.f34352e != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c17519e.purchase(i2), c17519e.startapp(i2));
            }
        } else if (i > 0) {
            AbstractC1660e.advert(0, 0, c17519e.f34354e, this.f34354e, i);
            AbstractC1660e.mopub(0, 0, i << 1, c17519e.f34353e, this.f34353e);
            this.f34352e = i;
        }
    }

    public final boolean adcel(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
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
    public final Set entrySet() {
        C10442e c10442e = this.f5763e;
        if (c10442e != null) {
            return c10442e;
        }
        C10442e c10442e2 = new C10442e(0, this);
        this.f5763e = c10442e2;
        return c10442e2;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final Set keySet() {
        C15627e c15627e = this.f5762e;
        if (c15627e != null) {
            return c15627e;
        }
        C15627e c15627e2 = new C15627e(this);
        this.f5762e = c15627e2;
        return c15627e2;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    public final boolean mopub(Collection collection) {
        int i = this.f34352e;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f34352e;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        vip(map.size() + this.f34352e);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection values() {
        C9323e c9323e = this.f5764e;
        if (c9323e != null) {
            return c9323e;
        }
        C9323e c9323e2 = new C9323e(this);
        this.f5764e = c9323e2;
        return c9323e2;
    }
}
