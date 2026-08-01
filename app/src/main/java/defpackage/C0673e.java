package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۤۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0673e implements InterfaceC1618e {
    public final C0593e metrica;
    public final C4070e vip;

    public C0673e(C4070e c4070e, C0593e c0593e) {
        this.vip = c4070e;
        this.metrica = c0593e;
    }

    @Override // defpackage.InterfaceC1618e
    public final void ad(Throwable th) {
        this.vip.ad(th);
    }

    @Override // defpackage.InterfaceC1618e
    public final C12402e appmetrica() {
        return this.vip.appmetrica();
    }

    @Override // defpackage.InterfaceC1618e
    public final Object metrica(AbstractC10731e abstractC10731e) {
        return this.vip.metrica(abstractC10731e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r5.metrica.invoke(r0) != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r5.vip.purchase(r0) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.InterfaceC1618e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object purchase(defpackage.InterfaceC5083e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C17784e
            if (r0 == 0) goto L13
            r0 = r6
            eٕ٘ٚ r0 = (defpackage.C17784e) r0
            int r1 = r0.f34866e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34866e = r1
            goto L18
        L13:
            eٕ٘ٚ r0 = new eٕ٘ٚ
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f34865e
            int r1 = r0.f34866e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L36
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r6)
            goto L4f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.AbstractC2003e.purchase(r6)
            goto L44
        L36:
            defpackage.AbstractC2003e.purchase(r6)
            r0.f34866e = r3
            eّؖۢ r6 = r5.vip
            java.lang.Object r6 = r6.purchase(r0)
            if (r6 != r4) goto L44
            goto L4e
        L44:
            r0.f34866e = r2
            eؑ۟ۦ r6 = r5.metrica
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r4) goto L4f
        L4e:
            return r4
        L4f:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0673e.purchase(eًؗۖ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1618e
    public final boolean startapp() {
        return this.vip.vip;
    }

    @Override // defpackage.InterfaceC1618e
    public final Throwable vip() {
        return this.vip.vip();
    }
}
