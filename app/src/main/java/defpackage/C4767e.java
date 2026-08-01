package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C15418e.class)
/* renamed from: eٍٜؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4767e extends AbstractC4879e implements Map<String, AbstractC4879e>, InterfaceC6770e {
    public static final C13675e Companion = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final LinkedHashMap f10200e;

    public C4767e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f10200e = AbstractC0869e.premium(linkedHashMap) ? linkedHashMap : new LinkedHashMap(linkedHashMap);
    }

    @Override // defpackage.AbstractC4879e
    public final int appmetrica() {
        return 4;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f10200e.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f10200e.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof AbstractC4879e)) {
            return false;
        }
        return this.f10200e.containsValue((AbstractC4879e) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, AbstractC4879e>> entrySet() {
        return this.f10200e.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4767e)) {
            return false;
        }
        return this.f10200e.entrySet().equals(((C4767e) obj).f10200e.entrySet());
    }

    @Override // java.util.Map
    public final AbstractC4879e get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (AbstractC4879e) this.f10200e.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f10200e.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f10200e.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f10200e.keySet();
    }

    @Override // java.util.Map
    public final AbstractC4879e put(String str, AbstractC4879e abstractC4879e) {
        return (AbstractC4879e) this.f10200e.put(str, abstractC4879e);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends AbstractC4879e> map) {
        this.f10200e.putAll(map);
    }

    @Override // java.util.Map
    public final AbstractC4879e remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (AbstractC4879e) this.f10200e.remove((String) obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f10200e.size();
    }

    public final String toString() {
        return "BsonDocument(" + this.f10200e + ')';
    }

    @Override // java.util.Map
    public final Collection<AbstractC4879e> values() {
        return this.f10200e.values();
    }
}
