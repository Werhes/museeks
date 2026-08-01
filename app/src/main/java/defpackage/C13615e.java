package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۤۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C13615e implements Iterable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C18091e f27008e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C18091e f27010e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final WeakHashMap f27007e = new WeakHashMap();

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f27009e = 0;

    public C18091e appmetrica(Object obj) {
        C18091e c18091e = this.f27010e;
        while (c18091e != null && !c18091e.f35480e.equals(obj)) {
            c18091e = c18091e.f35477e;
        }
        return c18091e;
    }

    public Object billing(Object obj) {
        C18091e appmetrica = appmetrica(obj);
        if (appmetrica == null) {
            return null;
        }
        this.f27009e--;
        WeakHashMap weakHashMap = this.f27007e;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC10223e) it.next()).ad(appmetrica);
            }
        }
        C18091e c18091e = appmetrica.f35479e;
        if (c18091e != null) {
            c18091e.f35477e = appmetrica.f35477e;
        } else {
            this.f27010e = appmetrica.f35477e;
        }
        C18091e c18091e2 = appmetrica.f35477e;
        if (c18091e2 != null) {
            c18091e2.f35479e = c18091e;
        } else {
            this.f27008e = c18091e;
        }
        appmetrica.f35477e = null;
        appmetrica.f35479e = null;
        return appmetrica.f35478e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((defpackage.C6652e) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof defpackage.C13615e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            eْۤۚ r7 = (defpackage.C13615e) r7
            int r1 = r6.f27009e
            int r3 = r7.f27009e
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            eؙۛٗ r3 = (defpackage.C6652e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            eؙۛٗ r4 = (defpackage.C6652e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            eؙۛٗ r7 = (defpackage.C6652e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13615e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            C6652e c6652e = (C6652e) it;
            if (!c6652e.hasNext()) {
                return i;
            }
            i += ((Map.Entry) c6652e.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C6652e c6652e = new C6652e(this.f27010e, this.f27008e, 0);
        this.f27007e.put(c6652e, Boolean.FALSE);
        return c6652e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C6652e c6652e = (C6652e) it;
            if (!c6652e.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c6652e.next()).toString());
            if (c6652e.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
