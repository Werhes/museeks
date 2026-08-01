package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؒۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9197e extends AbstractC9594e implements InterfaceC8149e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f18372e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f18373e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f18374e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f18375e;

    public /* synthetic */ C9197e(int i) {
        this.f18374e = i;
    }

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        switch (this.f18374e) {
            case 0:
                yandex((C17298e) abstractC2649e);
                return this;
            default:
                startapp((C17758e) abstractC2649e);
                return this;
        }
    }

    public C17758e billing() {
        C17758e c17758e = new C17758e(this);
        int i = this.f18373e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c17758e.f34833e = this.f18375e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c17758e.f34835e = this.f18372e;
        c17758e.f34834e = i2;
        return c17758e;
    }

    public final Object clone() {
        switch (this.f18374e) {
            case 0:
                C9197e c9197e = new C9197e(0);
                c9197e.yandex(purchase());
                return c9197e;
            default:
                C9197e c9197e2 = new C9197e(1);
                c9197e2.startapp(billing());
                return c9197e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    @Override // defpackage.AbstractC9594e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.AbstractC9594e license(defpackage.C4285e r2, defpackage.C18521e r3) {
        /*
            r1 = this;
            int r3 = r1.f18374e
            switch(r3) {
                case 0: goto L24;
                default: goto L5;
            }
        L5:
            r3 = 0
            eٌُْ r0 = defpackage.C17758e.f34830e     // Catch: java.lang.Throwable -> L14 defpackage.C14226e -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L14 defpackage.C14226e -> L16
            eَ٘ٔ r0 = new eَ٘ٔ     // Catch: java.lang.Throwable -> L14 defpackage.C14226e -> L16
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L14 defpackage.C14226e -> L16
            r1.startapp(r0)
            return r1
        L14:
            r2 = move-exception
            goto L1e
        L16:
            r2 = move-exception
            eؙِۛ r0 = r2.f28108e     // Catch: java.lang.Throwable -> L14
            eَ٘ٔ r0 = (defpackage.C17758e) r0     // Catch: java.lang.Throwable -> L14
            throw r2     // Catch: java.lang.Throwable -> L1c
        L1c:
            r2 = move-exception
            r3 = r0
        L1e:
            if (r3 == 0) goto L23
            r1.startapp(r3)
        L23:
            throw r2
        L24:
            r3 = 0
            eٌُْ r0 = defpackage.C17298e.f33933e     // Catch: java.lang.Throwable -> L33 defpackage.C14226e -> L35
            r0.getClass()     // Catch: java.lang.Throwable -> L33 defpackage.C14226e -> L35
            eٗ۠ r0 = new eٗ۠     // Catch: java.lang.Throwable -> L33 defpackage.C14226e -> L35
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L33 defpackage.C14226e -> L35
            r1.yandex(r0)
            return r1
        L33:
            r2 = move-exception
            goto L3d
        L35:
            r2 = move-exception
            eؙِۛ r0 = r2.f28108e     // Catch: java.lang.Throwable -> L33
            eٗ۠ r0 = (defpackage.C17298e) r0     // Catch: java.lang.Throwable -> L33
            throw r2     // Catch: java.lang.Throwable -> L3b
        L3b:
            r2 = move-exception
            r3 = r0
        L3d:
            if (r3 == 0) goto L42
            r1.yandex(r3)
        L42:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9197e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        switch (this.f18374e) {
            case 0:
                C17298e purchase = purchase();
                purchase.ad();
                return purchase;
            default:
                C17758e billing = billing();
                billing.ad();
                return billing;
        }
    }

    public C17298e purchase() {
        C17298e c17298e = new C17298e(this);
        int i = this.f18373e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c17298e.f33936e = this.f18375e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c17298e.f33938e = this.f18372e;
        c17298e.f33937e = i2;
        return c17298e;
    }

    public void startapp(C17758e c17758e) {
        if (c17758e == C17758e.f34831e) {
            return;
        }
        int i = c17758e.f34834e;
        if ((i & 1) == 1) {
            int i2 = c17758e.f34833e;
            this.f18373e = 1 | this.f18373e;
            this.f18375e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c17758e.f34835e;
            this.f18373e = 2 | this.f18373e;
            this.f18372e = i3;
        }
        this.f19037e = this.f19037e.billing(c17758e.f34836e);
    }

    public void yandex(C17298e c17298e) {
        if (c17298e == C17298e.f33934e) {
            return;
        }
        int i = c17298e.f33937e;
        if ((i & 1) == 1) {
            int i2 = c17298e.f33936e;
            this.f18373e = 1 | this.f18373e;
            this.f18375e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c17298e.f33938e;
            this.f18373e = 2 | this.f18373e;
            this.f18372e = i3;
        }
        this.f19037e = this.f19037e.billing(c17298e.f33939e);
    }
}
