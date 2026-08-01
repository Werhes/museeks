package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٛؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1167e {
    public boolean ad;
    public Object appmetrica;
    public int license;
    public int metrica;
    public Object purchase;
    public boolean vip;

    public static void smaato(AbstractC0241e abstractC0241e, long j) {
        abstractC0241e.f1494e = true;
        if (abstractC0241e instanceof C12063e) {
            C12063e c12063e = (C12063e) abstractC0241e;
            AbstractC2301e.subscription(c12063e.f1494e);
            c12063e.f24187e = j;
        }
    }

    public static boolean startapp(AbstractC0241e abstractC0241e) {
        return abstractC0241e.f1500e != 0;
    }

    public static void vip(AbstractC0241e abstractC0241e) {
        int i = abstractC0241e.f1500e;
        if (i == 2) {
            AbstractC2301e.subscription(i == 2);
            abstractC0241e.f1500e = 1;
            abstractC0241e.admob();
        }
    }

    public void ad(AbstractC0241e abstractC0241e, C9964e c9964e) {
        AbstractC2301e.subscription(((AbstractC0241e) this.appmetrica) == abstractC0241e || ((AbstractC0241e) this.purchase) == abstractC0241e);
        if (startapp(abstractC0241e)) {
            if (abstractC0241e == ((AbstractC0241e) c9964e.f19680e)) {
                c9964e.f19685e = null;
                c9964e.f19680e = null;
                c9964e.f19684e = true;
            }
            vip(abstractC0241e);
            AbstractC2301e.subscription(abstractC0241e.f1500e == 1);
            abstractC0241e.f1492e.advert();
            abstractC0241e.f1500e = 0;
            abstractC0241e.f1503e = null;
            abstractC0241e.f1493e = null;
            abstractC0241e.f1494e = false;
            abstractC0241e.adcel();
            abstractC0241e.f1497e = null;
        }
    }

    public void adcel(boolean z) {
        if (z) {
            if (this.ad) {
                AbstractC0241e abstractC0241e = (AbstractC0241e) this.appmetrica;
                AbstractC2301e.subscription(abstractC0241e.f1500e == 0);
                abstractC0241e.f1492e.advert();
                abstractC0241e.amazon();
                this.ad = false;
                return;
            }
            return;
        }
        if (this.vip) {
            AbstractC0241e abstractC0241e2 = (AbstractC0241e) this.purchase;
            abstractC0241e2.getClass();
            AbstractC2301e.subscription(abstractC0241e2.f1500e == 0);
            abstractC0241e2.f1492e.advert();
            abstractC0241e2.amazon();
            this.vip = false;
        }
    }

    public void advert() {
        if (!startapp((AbstractC0241e) this.appmetrica)) {
            adcel(true);
        }
        AbstractC0241e abstractC0241e = (AbstractC0241e) this.purchase;
        if (abstractC0241e == null || startapp(abstractC0241e)) {
            return;
        }
        adcel(false);
    }

    public void amazon() {
        int i;
        AbstractC0241e abstractC0241e = (AbstractC0241e) this.appmetrica;
        int i2 = abstractC0241e.f1500e;
        if (i2 == 1 && this.license != 4) {
            AbstractC2301e.subscription(i2 == 1);
            abstractC0241e.f1500e = 2;
            abstractC0241e.loadAd();
            return;
        }
        AbstractC0241e abstractC0241e2 = (AbstractC0241e) this.purchase;
        if (abstractC0241e2 == null || (i = abstractC0241e2.f1500e) != 1 || this.license == 3) {
            return;
        }
        AbstractC2301e.subscription(i == 1);
        abstractC0241e2.f1500e = 2;
        abstractC0241e2.loadAd();
    }

    public int appmetrica() {
        return ((AbstractC0241e) this.appmetrica).f1496e;
    }

    public boolean billing() {
        int i = this.license;
        return i == 2 || i == 4 || i == 3;
    }

    public AbstractC0241e license(C0313e c0313e) {
        InterfaceC4543e interfaceC4543e;
        if (c0313e != null && (interfaceC4543e = c0313e.metrica[this.metrica]) != null) {
            AbstractC0241e abstractC0241e = (AbstractC0241e) this.appmetrica;
            if (abstractC0241e.f1503e == interfaceC4543e) {
                return abstractC0241e;
            }
            AbstractC0241e abstractC0241e2 = (AbstractC0241e) this.purchase;
            if (abstractC0241e2 != null && abstractC0241e2.f1503e == interfaceC4543e) {
                return abstractC0241e2;
            }
        }
        return null;
    }

    public int metrica() {
        boolean startapp = startapp((AbstractC0241e) this.appmetrica);
        AbstractC0241e abstractC0241e = (AbstractC0241e) this.purchase;
        return (startapp ? 1 : 0) + ((abstractC0241e == null || !startapp(abstractC0241e)) ? 0 : 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int mopub(AbstractC0241e abstractC0241e, C0313e c0313e, C10379e c10379e, C9964e c9964e) {
        int i;
        AbstractC0241e abstractC0241e2 = (AbstractC0241e) this.appmetrica;
        int i2 = this.metrica;
        if (abstractC0241e == null || !startapp(abstractC0241e) || (abstractC0241e == abstractC0241e2 && ((i = this.license) == 2 || i == 4))) {
            return 1;
        }
        if (abstractC0241e == ((AbstractC0241e) this.purchase) && this.license == 3) {
            return 1;
        }
        Object[] objArr = abstractC0241e.f1503e != c0313e.metrica[i2];
        boolean m2803interface = c10379e.m2803interface(i2);
        if (!m2803interface || objArr != false) {
            if (!abstractC0241e.f1494e) {
                InterfaceC17119e interfaceC17119e = ((InterfaceC17119e[]) c10379e.f20510e)[i2];
                int length = interfaceC17119e != null ? interfaceC17119e.length() : 0;
                C16975e[] c16975eArr = new C16975e[length];
                for (int i3 = 0; i3 < length; i3++) {
                    interfaceC17119e.getClass();
                    c16975eArr[i3] = interfaceC17119e.amazon(i3);
                }
                InterfaceC4543e interfaceC4543e = c0313e.metrica[i2];
                interfaceC4543e.getClass();
                abstractC0241e.tapsense(c16975eArr, interfaceC4543e, c0313e.appmetrica(), c0313e.Signature, c0313e.billing.ad);
                return 3;
            }
            if (!abstractC0241e.yandex()) {
                return 0;
            }
            ad(abstractC0241e, c9964e);
            if (!m2803interface || billing()) {
                adcel(abstractC0241e == abstractC0241e2);
                return 1;
            }
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r9.f1490e >= r2.appmetrica()) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean purchase(defpackage.C0313e r8, defpackage.AbstractC0241e r9) {
        /*
            r7 = this;
            int r0 = r7.metrica
            r1 = 1
            if (r9 != 0) goto L6
            goto L49
        L6:
            eؖۨۚ[] r2 = r8.metrica
            r2 = r2[r0]
            eؖۨۚ r3 = r9.f1503e
            if (r3 == 0) goto L49
            if (r3 != r2) goto L3a
            if (r2 == 0) goto L49
            boolean r2 = r9.billing()
            if (r2 != 0) goto L49
            eؑٔۢ r2 = r8.smaato
            eٕۚؓ r3 = r8.billing
            boolean r3 = r3.yandex
            if (r3 == 0) goto L3a
            if (r2 == 0) goto L3a
            boolean r3 = r2.appmetrica
            if (r3 == 0) goto L3a
            boolean r3 = r9 instanceof defpackage.C12063e
            if (r3 != 0) goto L39
            boolean r3 = r9 instanceof defpackage.C4203e
            if (r3 != 0) goto L39
            long r3 = r9.f1490e
            long r5 = r2.appmetrica()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 < 0) goto L3a
            goto L49
        L39:
            return r1
        L3a:
            eؑٔۢ r8 = r8.smaato
            if (r8 == 0) goto L47
            eؖۨۚ[] r8 = r8.metrica
            r8 = r8[r0]
            eؖۨۚ r9 = r9.f1503e
            if (r8 != r9) goto L47
            goto L49
        L47:
            r8 = 0
            return r8
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1167e.purchase(eؑٔۢ, eُؑٛ):boolean");
    }

    public boolean yandex() {
        int i = this.license;
        if (i == 0 || i == 2 || i == 4) {
            return startapp((AbstractC0241e) this.appmetrica);
        }
        AbstractC0241e abstractC0241e = (AbstractC0241e) this.purchase;
        abstractC0241e.getClass();
        return startapp(abstractC0241e);
    }
}
