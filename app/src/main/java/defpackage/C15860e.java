package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۧؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15860e {
    public long Signature;
    public final C3457e ad;
    public InterfaceC5178e adcel;
    public final C0576e admob;
    public boolean ads;
    public final C0576e advert;
    public long amazon;
    public final C12309e applovin;
    public InterfaceC17155e billing;
    public final C5780e inmobi;
    public final C13644e isPro;
    public final C0576e isVip;
    public C7911e license;
    public C12347e loadAd;
    public C6260e mopub;
    public C0398e pro;
    public Function0 purchase;
    public int remoteconfig;
    public C13918e signatures;
    public final C0576e smaato;
    public InterfaceC3358e startapp;
    public final C0576e subscription;
    public C12347e tapsense;
    public InterfaceC18435e yandex;
    public InterfaceC6256e vip = AbstractC9476e.ad;
    public Function1 metrica = new C4671e(20);
    public final C0576e appmetrica = AbstractC14533e.startapp(new C0398e(0, 7, (String) null));

    public C15860e(C3457e c3457e) {
        this.ad = c3457e;
        Boolean bool = Boolean.TRUE;
        this.advert = AbstractC14533e.startapp(bool);
        this.smaato = AbstractC14533e.startapp(bool);
        this.amazon = 0L;
        this.Signature = 0L;
        this.admob = AbstractC14533e.startapp(null);
        this.subscription = AbstractC14533e.startapp(null);
        this.remoteconfig = -1;
        this.pro = new C0398e(0L, 7, (String) null);
        this.isVip = AbstractC14533e.startapp(Boolean.FALSE);
        this.inmobi = new C5780e();
        this.isPro = new C13644e(this);
        this.applovin = new C12309e(this);
    }

    public static final C6571e ad(C15860e c15860e) {
        String str;
        C12347e c12347e;
        C10566e smaato = c15860e.smaato();
        if (smaato == null || (str = smaato.f20850e) == null || (c12347e = c15860e.tapsense) == null) {
            return null;
        }
        long j = c12347e.ad;
        return new C6571e(str, new C12347e(AbstractC9262e.metrica(c15860e.vip.billing((int) (j >> 32)), c15860e.vip.billing((int) (j & 4294967295L)))));
    }

    public static C0398e appmetrica(C10566e c10566e, long j) {
        return new C0398e(c10566e, j, (C12347e) null);
    }

    public static final long metrica(C15860e c15860e, C0398e c0398e, long j, boolean z, boolean z2, C16658e c16658e, boolean z3, C10138e c10138e) {
        C0866e license;
        char c;
        InterfaceC5178e interfaceC5178e;
        C7911e c7911e = c15860e.license;
        if (c7911e == null || (license = c7911e.license()) == null) {
            return C12347e.vip;
        }
        InterfaceC6256e interfaceC6256e = c15860e.vip;
        long j2 = c0398e.vip;
        C10566e c10566e = c0398e.ad;
        int i = C12347e.metrica;
        long metrica = AbstractC9262e.metrica(interfaceC6256e.billing((int) (j2 >> 32)), c15860e.vip.billing((int) (j2 & 4294967295L)));
        boolean z4 = false;
        int vip = license.vip(j, false);
        int i2 = (z2 || z) ? vip : (int) (metrica >> 32);
        int i3 = (!z2 || z) ? vip : (int) (metrica & 4294967295L);
        C13918e c13918e = c15860e.signatures;
        int i4 = -1;
        if (z || c13918e == null) {
            c = ' ';
        } else {
            c = ' ';
            int i5 = c15860e.remoteconfig;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        C13918e purchase = AbstractC7150e.purchase(license.ad, i2, i3, i4, metrica, z, z2);
        if (purchase.advert(c13918e)) {
            c15860e.signatures = purchase;
            c15860e.remoteconfig = vip;
            C9106e ad = c16658e.ad(purchase);
            long metrica2 = AbstractC9262e.metrica(c15860e.vip.license(ad.ad.vip), c15860e.vip.license(ad.vip.vip));
            if (!C12347e.metrica(metrica2, j2)) {
                boolean z5 = C12347e.yandex(metrica2) != C12347e.yandex(j2) && C12347e.metrica(AbstractC9262e.metrica((int) (4294967295L & metrica2), (int) (metrica2 >> c)), j2);
                boolean z6 = C12347e.license(metrica2) && C12347e.license(j2);
                if (z3 && c10566e.f20850e.length() > 0 && !z5 && !z6 && c10138e != null && (interfaceC5178e = c15860e.adcel) != null) {
                    ((C6169e) interfaceC5178e).ad(c10138e.ad);
                }
                c15860e.metrica.invoke(appmetrica(c10566e, metrica2));
                c15860e.tapsense = new C12347e(metrica2);
                if (!z3) {
                    c15860e.pro(!C12347e.license(metrica2));
                }
                C7911e c7911e2 = c15860e.license;
                if (c7911e2 != null) {
                    c7911e2.admob.setValue(Boolean.valueOf(z3));
                }
                C7911e c7911e3 = c15860e.license;
                if (c7911e3 != null) {
                    c7911e3.smaato.setValue(Boolean.valueOf(!C12347e.license(metrica2) && AbstractC16091e.subscription(c15860e, true)));
                }
                C7911e c7911e4 = c15860e.license;
                if (c7911e4 != null) {
                    c7911e4.amazon.setValue(Boolean.valueOf(!C12347e.license(metrica2) && AbstractC16091e.subscription(c15860e, false)));
                }
                C7911e c7911e5 = c15860e.license;
                if (c7911e5 != null) {
                    if (C12347e.license(metrica2) && AbstractC16091e.subscription(c15860e, true)) {
                        z4 = true;
                    }
                    c7911e5.loadAd.setValue(Boolean.valueOf(z4));
                }
                return metrica2;
            }
        }
        return j2;
    }

    public static final void vip(C15860e c15860e, C12347e c12347e) {
        C10566e smaato;
        String str;
        InterfaceC18435e interfaceC18435e;
        if (c12347e == null) {
            return;
        }
        long j = c12347e.ad;
        InterfaceC3358e interfaceC3358e = c15860e.startapp;
        if (interfaceC3358e == null || (smaato = c15860e.smaato()) == null || (str = smaato.f20850e) == null) {
            return;
        }
        InterfaceC6256e interfaceC6256e = c15860e.vip;
        long metrica = AbstractC9262e.metrica(interfaceC6256e.billing((int) (j >> 32)), interfaceC6256e.billing((int) (j & 4294967295L)));
        if (str.length() <= 0 || C12347e.license(metrica) || (interfaceC18435e = c15860e.yandex) == null) {
            return;
        }
        AbstractC5336e.purchase(interfaceC18435e, null, 0, new C12200e(interfaceC3358e, str, metrica, c12347e, c15860e, interfaceC6256e, null), 3);
    }

    public final void Signature() {
        InterfaceC18435e interfaceC18435e = this.yandex;
        if (interfaceC18435e != null) {
            AbstractC5336e.purchase(interfaceC18435e, null, 4, new C15769e(this, null, 2), 1);
        }
    }

    public final boolean adcel() {
        return ((Boolean) this.advert.getValue()).booleanValue();
    }

    public final void admob(EnumC13262e enumC13262e) {
        C7911e c7911e = this.license;
        if (c7911e != null) {
            if (c7911e.ad() == enumC13262e) {
                c7911e = null;
            }
            if (c7911e != null) {
                c7911e.mopub.setValue(enumC13262e);
            }
        }
    }

    public final long advert(boolean z) {
        C0866e license;
        long j;
        C7911e c7911e = this.license;
        if (c7911e == null || (license = c7911e.license()) == null) {
            return 9205357640488583168L;
        }
        C12476e c12476e = license.ad;
        C10566e smaato = smaato();
        if (smaato == null) {
            return 9205357640488583168L;
        }
        if (!AbstractC7890e.billing(smaato.f20850e, c12476e.ad.ad.f20850e)) {
            return 9205357640488583168L;
        }
        C0398e amazon = amazon();
        if (z) {
            long j2 = amazon.vip;
            int i = C12347e.metrica;
            j = j2 >> 32;
        } else {
            long j3 = amazon.vip;
            int i2 = C12347e.metrica;
            j = j3 & 4294967295L;
        }
        return AbstractC4584e.metrica(c12476e, this.vip.billing((int) j), z, C12347e.yandex(amazon().vip));
    }

    public final C0398e amazon() {
        return (C0398e) this.appmetrica.getValue();
    }

    public final void billing(C2152e c2152e) {
        if (!C12347e.license(amazon().vip)) {
            C7911e c7911e = this.license;
            C0866e license = c7911e != null ? c7911e.license() : null;
            int purchase = (c2152e == null || license == null) ? C12347e.purchase(amazon().vip) : this.vip.license(license.vip(c2152e.ad, true));
            C0398e ad = C0398e.ad(amazon(), null, AbstractC9262e.metrica(purchase, purchase), 5);
            this.metrica.invoke(ad);
            this.tapsense = new C12347e(ad.vip);
        }
        admob((c2152e == null || amazon().ad.f20850e.length() <= 0) ? EnumC13262e.f26311e : EnumC13262e.f26308e);
        pro(false);
    }

    public final C8419e license(boolean z) {
        InterfaceC18435e interfaceC18435e = this.yandex;
        InterfaceC5083e interfaceC5083e = null;
        if (interfaceC18435e != null) {
            return AbstractC5336e.purchase(interfaceC18435e, null, 4, new C13575e(this, z, interfaceC5083e, 6), 1);
        }
        return null;
    }

    public final void loadAd() {
        C8419e c8419e;
        C16679e c16679e = this.inmobi.ad;
        if (c16679e == null || (c8419e = c16679e.f32722e) == null) {
            return;
        }
        c8419e.Signature(null);
        c16679e.f32722e = null;
    }

    public final boolean mopub() {
        return ((Boolean) this.smaato.getValue()).booleanValue();
    }

    public final void pro(boolean z) {
        C7911e c7911e = this.license;
        if (c7911e != null) {
            c7911e.advert.setValue(Boolean.valueOf(z));
        }
        if (z) {
            subscription();
        } else {
            loadAd();
        }
    }

    public final void purchase() {
        InterfaceC18435e interfaceC18435e = this.yandex;
        if (interfaceC18435e != null) {
            AbstractC5336e.purchase(interfaceC18435e, null, 4, new C15769e(this, null, 1), 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remoteconfig(defpackage.AbstractC10731e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C11113e
            if (r0 == 0) goto L13
            r0 = r5
            eُٛۥ r0 = (defpackage.C11113e) r0
            int r1 = r0.f22026e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22026e = r1
            goto L18
        L13:
            eُٛۥ r0 = new eُٛۥ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f22024e
            int r1 = r0.f22026e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eٕۧؒ r0 = r0.f22025e
            defpackage.AbstractC2003e.purchase(r5)
            goto L5d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.AbstractC2003e.purchase(r5)
            eٗٝٛ r5 = r4.billing
            if (r5 == 0) goto L67
            r0.f22025e = r4
            r0.f22026e = r2
            eؔۚٞ r5 = (defpackage.C2842e) r5
            eٖٟۤ r5 = r5.ad
            android.content.ClipboardManager r5 = r5.ad()
            android.content.ClipDescription r5 = r5.getPrimaryClipDescription()
            r0 = 0
            if (r5 == 0) goto L52
            java.lang.String r1 = "text/*"
            boolean r5 = r5.hasMimeType(r1)
            if (r5 != r2) goto L52
            goto L53
        L52:
            r2 = r0
        L53:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r5 != r0) goto L5c
            return r0
        L5c:
            r0 = r4
        L5d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            eؑۜٝ r0 = r0.isVip
            r0.setValue(r5)
        L67:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15860e.remoteconfig(eُؑ۠):java.lang.Object");
    }

    public final C10566e smaato() {
        C1979e c1979e;
        C7911e c7911e = this.license;
        if (c7911e == null || (c1979e = c7911e.ad) == null) {
            return null;
        }
        return c1979e.ad;
    }

    public final C2152e startapp() {
        return (C2152e) this.subscription.getValue();
    }

    public final void subscription() {
        C7911e c7911e;
        AbstractC13717e adcel = AbstractC12640e.adcel();
        Function1 appmetrica = adcel != null ? adcel.appmetrica() : null;
        AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
        try {
            if (mopub() && ((c7911e = this.license) == null || ((Boolean) c7911e.admob.getValue()).booleanValue())) {
                Unit unit = Unit.INSTANCE;
                AbstractC12640e.Signature(adcel, smaato, appmetrica);
                this.inmobi.ad();
            }
        } finally {
            AbstractC12640e.Signature(adcel, smaato, appmetrica);
        }
    }

    public final void yandex(boolean z) {
        C6260e c6260e;
        C7911e c7911e = this.license;
        if (c7911e != null && !c7911e.vip() && (c6260e = this.mopub) != null) {
            C6260e.vip(c6260e);
        }
        this.pro = amazon();
        pro(z);
        admob(EnumC13262e.f26309e);
    }
}
