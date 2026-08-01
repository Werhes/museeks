package defpackage;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4019e extends LinkedHashMap {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C4019e f8941e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f8942e = true;

    static {
        C4019e c4019e = new C4019e();
        f8941e = c4019e;
        c4019e.f8942e = false;
    }

    public static int ad(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC5848e) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = AbstractC0352e.ad;
        int i = length;
        for (byte b : bArr) {
            i = (i * 31) + b;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        vip();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005d A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5e
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 != r7) goto Lc
        La:
            r7 = r0
            goto L5b
        Lc:
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L18
        L16:
            r7 = r1
            goto L5b
        L18:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L37
            goto L16
        L37:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L54
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L54
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L58
        L54:
            boolean r3 = r4.equals(r3)
        L58:
            if (r3 != 0) goto L20
            goto L16
        L5b:
            if (r7 == 0) goto L5e
            return r0
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4019e.equals(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += ad(entry.getValue()) ^ ad(entry.getKey());
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, eَؖؗ] */
    public final C4019e metrica() {
        if (isEmpty()) {
            return new C4019e();
        }
        ?? linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.f8942e = true;
        return linkedHashMap;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        vip();
        Charset charset = AbstractC0352e.ad;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        vip();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC0352e.ad;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        vip();
        return super.remove(obj);
    }

    public final void vip() {
        if (!this.f8942e) {
            throw new UnsupportedOperationException();
        }
    }
}
