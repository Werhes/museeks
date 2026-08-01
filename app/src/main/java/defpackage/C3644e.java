package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۜٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3644e implements InterfaceC5599e {
    public final C11817e ad;

    public C3644e(C11817e c11817e) {
        this.ad = c11817e;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.InterfaceC5599e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(java.nio.charset.Charset r4, defpackage.C12025e r5, defpackage.InterfaceC13033e r6, defpackage.AbstractC10731e r7) {
        /*
            r3 = this;
            boolean r4 = r7 instanceof defpackage.C1200e
            if (r4 == 0) goto L13
            r4 = r7
            eؒٝؑ r4 = (defpackage.C1200e) r4
            int r0 = r4.f3827e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f3827e = r0
            goto L18
        L13:
            eؒٝؑ r4 = new eؒٝؑ
            r4.<init>(r3, r7)
        L18:
            java.lang.Object r7 = r4.f3825e
            int r0 = r4.f3827e
            eِٙٙ r1 = r3.ad
            r2 = 1
            if (r0 == 0) goto L33
            if (r0 != r2) goto L2b
            eؘؒٙ r4 = r4.f3826e
            eؘؒٙ r4 = (defpackage.InterfaceC5372e) r4
            defpackage.AbstractC2003e.purchase(r7)
            goto L4d
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.AbstractC2003e.purchase(r7)
            eَؗؑ r7 = r1.vip
            eؘؒٙ r5 = defpackage.AbstractC15367e.yandex(r7, r5)
            r7 = r5
            eؘؒٙ r7 = (defpackage.InterfaceC5372e) r7
            r4.f3826e = r7
            r4.f3827e = r2
            java.lang.Object r7 = defpackage.AbstractC11263e.tapsense(r6, r4)
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r7 != r4) goto L4c
            return r4
        L4c:
            r4 = r5
        L4d:
            eٜٗۧ r7 = (defpackage.InterfaceC17430e) r7
            eؘؒٙ r4 = (defpackage.InterfaceC5372e) r4     // Catch: java.lang.Throwable -> L5c
            eٍُّ r5 = new eٍُّ     // Catch: java.lang.Throwable -> L5c
            r6 = 0
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r4 = defpackage.AbstractC4508e.metrica(r1, r4, r5)     // Catch: java.lang.Throwable -> L5c
            return r4
        L5c:
            r4 = move-exception
            eؚِۘ r5 = new eؚِۘ
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Illegal input: "
            r6.<init>(r7)
            java.lang.String r7 = r4.getMessage()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = 2
            r5.<init>(r7, r6, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3644e.ad(java.nio.charset.Charset, eِ۟ۥ, eْٕؕ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [eَّۙ, java.lang.Object] */
    @Override // defpackage.InterfaceC5599e
    public final Object vip(C1622e c1622e, Charset charset, C12025e c12025e, Object obj, AbstractC10731e abstractC10731e) {
        InterfaceC5372e license;
        C11817e c11817e = this.ad;
        C10068e c10068e = c11817e.vip;
        try {
            license = AbstractC15367e.yandex(c10068e, c12025e);
        } catch (C15929e unused) {
            license = AbstractC15367e.license(obj, c10068e);
        }
        ?? obj2 = new Object();
        AbstractC4508e.license(c11817e, new C7850e(14, (Object) obj2), license, obj);
        return new C14339e(new C4870e(obj2, null, 19), c1622e, new Long(obj2.f24832e), 4);
    }
}
