package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٔؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14600e extends AbstractSet {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C17406e f28807e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28808e;

    public /* synthetic */ C14600e(C17406e c17406e, int i) {
        this.f28808e = i;
        this.f28807e = c17406e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f28808e) {
            case 0:
                this.f28807e.clear();
                return;
            default:
                this.f28807e.clear();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f28808e
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            eٗۦ r0 = r4.f28807e
            boolean r5 = r0.containsKey(r5)
            return r5
        Lc:
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L38
            eٗۦ r0 = r4.f28807e
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r2 = r5.getKey()
            r3 = 0
            if (r2 == 0) goto L21
            eِؕ۟ r0 = r0.ad(r2, r1)     // Catch: java.lang.ClassCastException -> L21
            goto L22
        L21:
            r0 = r3
        L22:
            if (r0 == 0) goto L35
            java.lang.Object r2 = r0.f7473e
            java.lang.Object r5 = r5.getValue()
            if (r2 == r5) goto L34
            if (r2 == 0) goto L35
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L35
        L34:
            r3 = r0
        L35:
            if (r3 == 0) goto L38
            r1 = 1
        L38:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14600e.contains(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f28808e) {
            case 0:
                return new C10528e(this.f28807e, 0);
            default:
                return new C10528e(this.f28807e, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f28808e
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            r0 = 0
            eٗۦ r1 = r5.f28807e
            r2 = 0
            if (r6 == 0) goto Lf
            eِؕ۟ r2 = r1.ad(r6, r0)     // Catch: java.lang.ClassCastException -> Lf
        Lf:
            r6 = 1
            if (r2 == 0) goto L15
            r1.metrica(r2, r6)
        L15:
            if (r2 == 0) goto L18
            r0 = r6
        L18:
            return r0
        L19:
            boolean r0 = r6 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L1f
            goto L4a
        L1f:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r0 = r6.getKey()
            eٗۦ r2 = r5.f28807e
            r3 = 0
            if (r0 == 0) goto L2f
            eِؕ۟ r0 = r2.ad(r0, r1)     // Catch: java.lang.ClassCastException -> L2f
            goto L30
        L2f:
            r0 = r3
        L30:
            if (r0 == 0) goto L43
            java.lang.Object r4 = r0.f7473e
            java.lang.Object r6 = r6.getValue()
            if (r4 == r6) goto L42
            if (r4 == 0) goto L43
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L43
        L42:
            r3 = r0
        L43:
            if (r3 != 0) goto L46
            goto L4a
        L46:
            r1 = 1
            r2.metrica(r3, r1)
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14600e.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f28808e) {
            case 0:
                return this.f28807e.f34122e;
            default:
                return this.f28807e.f34122e;
        }
    }
}
