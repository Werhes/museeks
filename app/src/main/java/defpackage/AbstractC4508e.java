package defpackage;

import java.security.InvalidKeyException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۦٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4508e {
    public static final C6575e ad = new C6575e(17);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.InterfaceC13033e r4, java.nio.charset.Charset r5, defpackage.C2375e r6, defpackage.C12025e r7, defpackage.C1622e r8, defpackage.AbstractC10731e r9) {
        /*
            boolean r0 = r9 instanceof defpackage.C3841e
            if (r0 == 0) goto L13
            r0 = r9
            eٟؖؓ r0 = (defpackage.C3841e) r0
            int r1 = r0.f8477e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8477e = r1
            goto L18
        L13:
            eٟؖؓ r0 = new eٟؖؓ
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f8478e
            int r1 = r0.f8477e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            eِ۟ۥ r7 = r0.f8475e
            eْٕؕ r4 = r0.f8476e
            defpackage.AbstractC2003e.purchase(r9)     // Catch: java.lang.Throwable -> L2a
            goto L7c
        L2a:
            r4 = move-exception
            goto L94
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            defpackage.AbstractC2003e.purchase(r9)
            eٜؓؗ r9 = r6.ad
            eٜؓؗ r9 = r9.m656e()
            boolean r9 = r8.m658e(r9)
            if (r9 != 0) goto L6b
            eٕؗٞ r4 = defpackage.AbstractC17926e.ad
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r9 = "Skipping content converter for request type "
            r5.<init>(r9)
            eؚ٘ٚ r7 = r7.ad
            r5.append(r7)
            java.lang.String r7 = " because content type "
            r5.append(r7)
            r5.append(r8)
            java.lang.String r7 = " does not match "
            r5.append(r7)
            eٜؓؗ r6 = r6.ad
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.amazon(r5)
            return r3
        L6b:
            eؘؚّ r6 = r6.vip
            r0.f8476e = r4     // Catch: java.lang.Throwable -> L2a
            r0.f8475e = r7     // Catch: java.lang.Throwable -> L2a
            r0.f8477e = r2     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r9 = r6.ad(r5, r7, r4, r0)     // Catch: java.lang.Throwable -> L2a
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r9 != r5) goto L7c
            return r5
        L7c:
            if (r9 != 0) goto L93
            boolean r4 = r4.yandex()
            if (r4 != 0) goto L85
            goto L92
        L85:
            eٓٔۖ r4 = r7.vip
            if (r4 == 0) goto L92
            boolean r4 = r4.startapp()
            if (r4 != r2) goto L92
            eِٖۨ r4 = defpackage.C16676e.ad
            return r4
        L92:
            return r3
        L93:
            return r9
        L94:
            eٍؕؑ r5 = new eٍؕؑ
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to convert request body to "
            r6.<init>(r8)
            eؚ٘ٚ r7 = r7.ad
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4508e.ad(eْٕؕ, java.nio.charset.Charset, eٍؔؖ, eِ۟ۥ, eٜؓؗ, eُؑ۠):java.lang.Object");
    }

    public static InterfaceC17128e appmetrica(C3393e c3393e, byte[] bArr) {
        c3393e.getClass();
        InterfaceC17128e purchase = purchase();
        ((C5609e) purchase).init(false, new C14915e(billing(c3393e, bArr), 0, 32));
        return purchase;
    }

    public static byte[] billing(C3393e c3393e, byte[] bArr) {
        try {
            return AbstractC17595e.startapp((C16527e) c3393e.f22047e, bArr, AbstractC12442e.license((byte[]) c3393e.f22046e));
        } catch (IllegalArgumentException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    public static final void license(AbstractC0232e abstractC0232e, InterfaceC9483e interfaceC9483e, InterfaceC5372e interfaceC5372e, Object obj) {
        C6929e[] c6929eArr = new C6929e[EnumC6813e.f14027e.subs()];
        C10195e c10195e = abstractC0232e.ad;
        new C6929e(new C16722e((Object) interfaceC9483e, 3, false), abstractC0232e, EnumC6813e.f14026e, c6929eArr).appmetrica(interfaceC5372e, obj);
    }

    public static final Object metrica(AbstractC0232e abstractC0232e, InterfaceC5372e interfaceC5372e, InterfaceC2789e interfaceC2789e) {
        char[] license = C12557e.metrica.license(16384);
        C10195e c10195e = abstractC0232e.ad;
        C15105e c15105e = new C15105e(interfaceC2789e, license);
        try {
            Object billing = new C1243e(abstractC0232e, EnumC6813e.f14026e, c15105e, interfaceC5372e.appmetrica(), null).billing(interfaceC5372e);
            c15105e.loadAd();
            return billing;
        } finally {
            c15105e.m3918goto();
        }
    }

    public static InterfaceC17128e purchase() {
        return new C5609e(new loadAd(), 0);
    }

    public static C6156e vip(InterfaceC1722e interfaceC1722e, int i) {
        C6156e c6156e = new C6156e(interfaceC1722e, false, (i & 2) != 0 ? 0 : 1);
        c6156e.license.metrica(C6156e.appmetrica[0], true);
        c6156e.license();
        return c6156e;
    }
}
