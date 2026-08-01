package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18223e extends AbstractC9594e implements InterfaceC8149e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f35685e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f35686e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f35687e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f35688e;

    public /* synthetic */ C18223e(int i) {
        this.f35687e = i;
    }

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        switch (this.f35687e) {
            case 0:
                yandex((C14481e) abstractC2649e);
                return this;
            default:
                startapp((C18181e) abstractC2649e);
                return this;
        }
    }

    public C18181e billing() {
        C18181e c18181e = new C18181e(this);
        int i = this.f35686e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c18181e.f35599e = this.f35688e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c18181e.f35601e = (C1884e) this.f35685e;
        c18181e.f35600e = i2;
        return c18181e;
    }

    public final Object clone() {
        switch (this.f35687e) {
            case 0:
                C18223e c18223e = new C18223e(0);
                c18223e.f35685e = C3545e.f7986e;
                c18223e.yandex(purchase());
                return c18223e;
            default:
                C18223e c18223e2 = new C18223e(1);
                c18223e2.f35685e = AbstractC6732e.f13911e;
                c18223e2.startapp(billing());
                return c18223e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    @Override // defpackage.AbstractC9594e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.AbstractC9594e license(defpackage.C4285e r3, defpackage.C18521e r4) {
        /*
            r2 = this;
            int r0 = r2.f35687e
            switch(r0) {
                case 0: goto L24;
                default: goto L5;
            }
        L5:
            r4 = 0
            eٌُْ r0 = defpackage.C18181e.f35596e     // Catch: java.lang.Throwable -> L14 defpackage.C14226e -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L14 defpackage.C14226e -> L16
            eٙٔ r0 = new eٙٔ     // Catch: java.lang.Throwable -> L14 defpackage.C14226e -> L16
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L14 defpackage.C14226e -> L16
            r2.startapp(r0)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            eؙِۛ r0 = r3.f28108e     // Catch: java.lang.Throwable -> L14
            eٙٔ r0 = (defpackage.C18181e) r0     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r4 = r0
        L1e:
            if (r4 == 0) goto L23
            r2.startapp(r4)
        L23:
            throw r3
        L24:
            r0 = 0
            eٌُْ r1 = defpackage.C14481e.f28621e     // Catch: java.lang.Throwable -> L33 defpackage.C14226e -> L35
            r1.getClass()     // Catch: java.lang.Throwable -> L33 defpackage.C14226e -> L35
            eًٔؔ r1 = new eًٔؔ     // Catch: java.lang.Throwable -> L33 defpackage.C14226e -> L35
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33 defpackage.C14226e -> L35
            r2.yandex(r1)
            return r2
        L33:
            r3 = move-exception
            goto L3d
        L35:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> L33
            eًٔؔ r4 = (defpackage.C14481e) r4     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L3b
        L3b:
            r3 = move-exception
            r0 = r4
        L3d:
            if (r0 == 0) goto L42
            r2.yandex(r0)
        L42:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18223e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        switch (this.f35687e) {
            case 0:
                C14481e purchase = purchase();
                if (purchase.ad()) {
                    return purchase;
                }
                throw new C14803e();
            default:
                C18181e billing = billing();
                if (billing.ad()) {
                    return billing;
                }
                throw new C14803e();
        }
    }

    public C14481e purchase() {
        C14481e c14481e = new C14481e(this);
        int i = this.f35686e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c14481e.f28624e = this.f35688e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c14481e.f28626e = (C3545e) this.f35685e;
        c14481e.f28625e = i2;
        return c14481e;
    }

    public void startapp(C18181e c18181e) {
        if (c18181e == C18181e.f35597e) {
            return;
        }
        int i = c18181e.f35600e;
        if ((i & 1) == 1) {
            int i2 = c18181e.f35599e;
            this.f35686e = 1 | this.f35686e;
            this.f35688e = i2;
        }
        if ((i & 2) == 2) {
            C1884e c1884e = c18181e.f35601e;
            c1884e.getClass();
            this.f35686e = 2 | this.f35686e;
            this.f35685e = c1884e;
        }
        this.f19037e = this.f19037e.billing(c18181e.f35602e);
    }

    public void yandex(C14481e c14481e) {
        C3545e c3545e;
        if (c14481e == C14481e.f28622e) {
            return;
        }
        int i = c14481e.f28625e;
        if ((i & 1) == 1) {
            int i2 = c14481e.f28624e;
            this.f35686e = 1 | this.f35686e;
            this.f35688e = i2;
        }
        if ((i & 2) == 2) {
            C3545e c3545e2 = c14481e.f28626e;
            if ((this.f35686e & 2) != 2 || (c3545e = (C3545e) this.f35685e) == C3545e.f7986e) {
                this.f35685e = c3545e2;
            } else {
                C11877e adcel = C3545e.adcel(c3545e);
                adcel.yandex(c3545e2);
                this.f35685e = adcel.purchase();
            }
            this.f35686e |= 2;
        }
        this.f19037e = this.f19037e.billing(c14481e.f28627e);
    }
}
