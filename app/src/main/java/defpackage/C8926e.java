package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۘؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8926e extends LinkedHashMap {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C8926e f17888e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f17889e = true;

    static {
        C8926e c8926e = new C8926e();
        f17888e = c8926e;
        c8926e.f17889e = false;
    }

    public static int vip(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC14759e) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int ad = AbstractC17904e.ad(length, 0, length, bArr);
        if (ad == 0) {
            return 1;
        }
        return ad;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, eٌۘؕ] */
    public final C8926e ad() {
        if (isEmpty()) {
            return new C8926e();
        }
        ?? linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.f17889e = true;
        return linkedHashMap;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        metrica();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += vip(entry.getValue()) ^ vip(entry.getKey());
        }
        return i;
    }

    public final void metrica() {
        if (!this.f17889e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        metrica();
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        metrica();
        for (Object obj : map.keySet()) {
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        metrica();
        return super.remove(obj);
    }
}
