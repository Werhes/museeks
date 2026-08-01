package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٝٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12615e extends AbstractC16994e implements Map {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Map f25336e;

    public C12615e(Map map) {
        super(3);
        this.f25336e = map;
    }

    @Override // defpackage.AbstractC16994e
    public final Object billing() {
        return this.f25336e;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f25336e.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f25336e.containsKey(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if (r0.hasNext() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r3.equals(((java.util.Map.Entry) r0.next()).getValue()) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000d, code lost:
    
        if (r3 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r0.hasNext() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (((java.util.Map.Entry) r0.next()).getValue() != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        return true;
     */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsValue(java.lang.Object r3) {
        /*
            r2 = this;
            java.util.Set r0 = r2.entrySet()
            eْٔۖ r0 = (defpackage.C14889e) r0
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
            if (r3 != 0) goto L22
        Lf:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            if (r3 != 0) goto Lf
            goto L38
        L22:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L22
        L38:
            r3 = 1
            return r3
        L3a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12615e.containsValue(java.lang.Object):boolean");
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return AbstractC6100e.appmetrica(this.f25336e.entrySet(), new C15660e(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && AbstractC2641e.metrica(obj, this);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f25336e.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC6100e.purchase(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f25336e;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return AbstractC6100e.appmetrica(this.f25336e.keySet(), new C15660e(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f25336e.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f25336e.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f25336e.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f25336e;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f25336e.values();
    }
}
