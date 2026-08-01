package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؖؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4650e extends AbstractC16412e implements InterfaceC2898e {
    public final Object[] billing;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4650e(java.lang.reflect.Method r6, java.lang.Object[] r7) {
        /*
            r5 = this;
            java.lang.reflect.Type[] r0 = r6.getGenericParameterTypes()
            int r1 = r7.length
            java.lang.String r2 = " is less than zero."
            java.lang.String r3 = "Requested element count "
            if (r1 < 0) goto L59
            int r4 = r0.length
            int r4 = r4 - r1
            if (r4 >= 0) goto L10
            r4 = 0
        L10:
            if (r4 < 0) goto L4b
            if (r4 != 0) goto L17
            eْۨٝ r0 = defpackage.C13664e.f27089e
            goto L3c
        L17:
            int r1 = r0.length
            if (r4 < r1) goto L1f
            java.util.List r0 = defpackage.AbstractC1660e.m670implements(r0)
            goto L3c
        L1f:
            r2 = 1
            if (r4 != r2) goto L2a
            int r1 = r1 - r2
            r0 = r0[r1]
            java.util.List r0 = java.util.Collections.singletonList(r0)
            goto L3c
        L2a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r4)
            int r3 = r1 - r4
        L31:
            if (r3 >= r1) goto L3b
            r4 = r0[r3]
            r2.add(r4)
            int r3 = r3 + 1
            goto L31
        L3b:
            r0 = r2
        L3c:
            r1 = 0
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            r5.<init>(r6, r1, r0)
            r5.billing = r7
            return
        L4b:
            java.lang.String r6 = defpackage.AbstractC1634e.smaato(r3, r4, r2)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L59:
            java.lang.String r6 = defpackage.AbstractC1634e.smaato(r3, r1, r2)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4650e.<init>(java.lang.reflect.Method, java.lang.Object[]):void");
    }

    @Override // defpackage.AbstractC16412e, defpackage.InterfaceC9739e
    public final Object license(Object[] objArr) {
        appmetrica(objArr);
        C6325e c6325e = new C6325e(2);
        c6325e.subs(this.billing);
        c6325e.subs(objArr);
        ArrayList arrayList = (ArrayList) c6325e.f13170e;
        return billing(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
