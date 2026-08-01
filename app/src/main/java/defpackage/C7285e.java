package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٛۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7285e implements InterfaceC13033e {
    public final C6799e appmetrica;
    public final C12402e license;
    public C7761e metrica;
    public final InterfaceC8850e purchase;
    public final C2331e vip;

    /* JADX WARN: Type inference failed for: r3v1, types: [eَّۙ, java.lang.Object] */
    public C7285e(C2331e c2331e) {
        ExecutorC3603e executorC3603e = ExecutorC3603e.f8134e;
        this.vip = c2331e;
        this.license = new Object();
        C6799e c6799e = new C6799e((InterfaceC10500e) AbstractC17808e.metrica(executorC3603e, C4524e.f9798e));
        this.appmetrica = c6799e;
        this.purchase = AbstractC5797e.vip(executorC3603e, c6799e).mo394const(new C5621e("RawSourceChannel"));
    }

    @Override // defpackage.InterfaceC13033e, defpackage.InterfaceC1618e
    public final void ad(Throwable th) {
        if (this.metrica != null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "Channel was cancelled";
        }
        AbstractC6629e.appmetrica(this.appmetrica, message, th);
        this.vip.close();
        String message2 = th.getMessage();
        this.metrica = new C7761e(new IOException(message2 != null ? message2 : "Channel was cancelled", th));
    }

    @Override // defpackage.InterfaceC13033e
    public final C12402e billing() {
        return this.license;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // defpackage.InterfaceC13033e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object license(int r5, defpackage.AbstractC10731e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C4570e
            if (r0 == 0) goto L13
            r0 = r6
            eٍؗؑ r0 = (defpackage.C4570e) r0
            int r1 = r0.f9861e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9861e = r1
            goto L18
        L13:
            eٍؗؑ r0 = new eٍؗؑ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f9859e
            int r1 = r0.f9861e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            int r5 = r0.f9860e
            defpackage.AbstractC2003e.purchase(r6)
            goto L4e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.AbstractC2003e.purchase(r6)
            eًؘؘ r6 = r4.metrica
            if (r6 == 0) goto L39
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L39:
            eؚ٘ۥ r6 = new eؚ٘ۥ
            r1 = 0
            r6.<init>(r4, r5, r1)
            r0.f9860e = r5
            r0.f9861e = r2
            eٌِٞ r1 = r4.purchase
            java.lang.Object r6 = defpackage.AbstractC5336e.advert(r1, r6, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r6 != r0) goto L4e
            return r0
        L4e:
            eَّۙ r6 = r4.license
            long r0 = r6.f24832e
            long r5 = (long) r5
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 < 0) goto L58
            goto L59
        L58:
            r2 = 0
        L59:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7285e.license(int, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC13033e, defpackage.InterfaceC1618e
    public final Throwable vip() {
        C7761e c7761e = this.metrica;
        if (c7761e != null) {
            return c7761e.ad(C6244e.f13064e);
        }
        return null;
    }

    @Override // defpackage.InterfaceC13033e
    public final boolean yandex() {
        return this.metrica != null && this.license.yandex();
    }
}
