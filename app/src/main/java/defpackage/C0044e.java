package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؒ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044e {
    public final LinkedHashMap ad;
    public final C6594e vip;

    public C0044e(LinkedHashMap linkedHashMap, boolean z) {
        this.ad = linkedHashMap;
        this.vip = new C6594e(z);
    }

    public /* synthetic */ C0044e(boolean z) {
        this(new LinkedHashMap(), z);
    }

    public final Map ad() {
        C6571e c6571e;
        Set<Map.Entry> entrySet = this.ad.entrySet();
        int appmetrica = AbstractC10064e.appmetrica(AbstractC0746e.subscription(entrySet, 10));
        if (appmetrica < 16) {
            appmetrica = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(appmetrica);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                c6571e = new C6571e(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                c6571e = new C6571e(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(c6571e.f13544e, c6571e.f13543e);
        }
        return DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public final C0044e appmetrica() {
        return new C0044e(new LinkedHashMap(ad()), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002a->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.C0044e
            r1 = 0
            if (r0 != 0) goto L6
            goto L60
        L6:
            eؑؒ۠ r7 = (defpackage.C0044e) r7
            java.util.LinkedHashMap r7 = r7.ad
            java.util.LinkedHashMap r0 = r6.ad
            r2 = 1
            if (r7 != r0) goto L10
            goto L61
        L10:
            int r3 = r7.size()
            int r4 = r0.size()
            if (r3 == r4) goto L1b
            goto L60
        L1b:
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L22
            goto L61
        L22:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L2a:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L61
            java.lang.Object r3 = r7.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r4 = r0.get(r4)
            if (r4 == 0) goto L5d
            java.lang.Object r3 = r3.getValue()
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L58
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L5d
            byte[] r3 = (byte[]) r3
            byte[] r4 = (byte[]) r4
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 == 0) goto L5d
            r3 = r2
            goto L5e
        L58:
            boolean r3 = defpackage.AbstractC7890e.billing(r3, r4)
            goto L5e
        L5d:
            r3 = r1
        L5e:
            if (r3 != 0) goto L2a
        L60:
            return r1
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0044e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = this.ad.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i;
    }

    public final void license(C11951e c11951e, Object obj) {
        vip();
        LinkedHashMap linkedHashMap = this.ad;
        if (obj == null) {
            vip();
            linkedHashMap.remove(c11951e);
        } else if (obj instanceof Set) {
            linkedHashMap.put(c11951e, DesugarCollections.unmodifiableSet(AbstractC13480e.m3582e((Set) obj)));
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(c11951e, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(c11951e, Arrays.copyOf(bArr, bArr.length));
        }
    }

    public final Object metrica(C11951e c11951e) {
        Object obj = this.ad.get(c11951e);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final C0044e purchase() {
        return new C0044e(new LinkedHashMap(ad()), true);
    }

    public final String toString() {
        return AbstractC13480e.m3608try(this.ad.entrySet(), ",\n", "{\n", "\n}", new C3685e(18), 24);
    }

    public final void vip() {
        if (((AtomicBoolean) this.vip.f13613e).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }
}
