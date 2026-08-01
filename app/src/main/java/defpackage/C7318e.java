package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٝۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7318e implements InterfaceC13033e {
    public long appmetrica;
    public long license;
    public final C12402e metrica = new Object();
    public final InterfaceC13033e vip;

    /* JADX WARN: Type inference failed for: r1v1, types: [eَّۙ, java.lang.Object] */
    public C7318e(InterfaceC13033e interfaceC13033e) {
        this.vip = interfaceC13033e;
    }

    @Override // defpackage.InterfaceC13033e, defpackage.InterfaceC1618e
    public final void ad(Throwable th) {
        this.vip.ad(th);
    }

    public final void appmetrica() {
        long j = this.appmetrica;
        long j2 = this.license;
        long j3 = this.metrica.f24832e;
        this.appmetrica = (j2 - j3) + j;
        this.license = j3;
    }

    @Override // defpackage.InterfaceC13033e
    public final C12402e billing() {
        metrica();
        return this.metrica;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // defpackage.InterfaceC13033e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object license(int r8, defpackage.AbstractC10731e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.C13557e
            if (r0 == 0) goto L13
            r0 = r9
            eؚْۡ r0 = (defpackage.C13557e) r0
            int r1 = r0.f26864e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26864e = r1
            goto L18
        L13:
            eؚْۡ r0 = new eؚْۡ
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f26863e
            int r1 = r0.f26864e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r9)
            goto L4c
        L25:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2d:
            defpackage.AbstractC2003e.purchase(r9)
            r7.metrica()
            eَّۙ r9 = r7.metrica
            long r3 = r9.f24832e
            long r5 = (long) r8
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 < 0) goto L3f
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        L3f:
            r0.f26864e = r2
            eْٕؕ r9 = r7.vip
            java.lang.Object r9 = r9.license(r8, r0)
            eٟؔۙ r8 = defpackage.EnumC2821e.f6782e
            if (r9 != r8) goto L4c
            return r8
        L4c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            if (r8 == 0) goto L5a
            r7.metrica()
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        L5a:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7318e.license(int, eُؑ۠):java.lang.Object");
    }

    public final void metrica() {
        appmetrica();
        this.license += this.metrica.inmobi(this.vip.billing());
    }

    @Override // defpackage.InterfaceC13033e, defpackage.InterfaceC1618e
    public final Throwable vip() {
        return this.vip.vip();
    }

    @Override // defpackage.InterfaceC13033e
    public final boolean yandex() {
        return this.metrica.yandex() && this.vip.yandex();
    }
}
