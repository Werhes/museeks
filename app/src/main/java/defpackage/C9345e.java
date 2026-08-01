package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.math.BigInteger;

/* renamed from: eٌٍۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9345e extends AbstractC9932e {
    public final /* synthetic */ int billing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9345e(AbstractC0362e abstractC0362e, AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, int i) {
        super(abstractC0362e, abstractC7861e, abstractC7861e2);
        this.billing = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9345e(AbstractC0362e abstractC0362e, AbstractC7861e abstractC7861e, AbstractC7861e abstractC7861e2, AbstractC7861e[] abstractC7861eArr, int i) {
        super(abstractC0362e, abstractC7861e, abstractC7861e2, abstractC7861eArr);
        this.billing = i;
    }

    private final AbstractC9932e ads(AbstractC9932e abstractC9932e) {
        AbstractC7861e abstractC7861e;
        AbstractC7861e abstractC7861e2;
        AbstractC7861e abstractC7861e3;
        AbstractC7861e abstractC7861e4;
        AbstractC7861e abstractC7861e5;
        AbstractC7861e abstractC7861e6;
        if (advert()) {
            return abstractC9932e;
        }
        if (abstractC9932e.advert()) {
            return this;
        }
        AbstractC7861e abstractC7861e7 = abstractC9932e.vip;
        AbstractC7861e abstractC7861e8 = this.vip;
        boolean subscription = abstractC7861e8.subscription();
        AbstractC0362e abstractC0362e = this.ad;
        if (subscription) {
            return abstractC7861e7.subscription() ? abstractC0362e.smaato() : abstractC9932e.ad(this);
        }
        AbstractC7861e abstractC7861e9 = this.license[0];
        AbstractC7861e abstractC7861e10 = abstractC9932e.metrica;
        AbstractC7861e adcel = abstractC9932e.adcel();
        boolean admob = abstractC7861e9.admob();
        if (admob) {
            abstractC7861e = abstractC7861e7;
            abstractC7861e2 = abstractC7861e10;
        } else {
            abstractC7861e = abstractC7861e7.remoteconfig(abstractC7861e9);
            abstractC7861e2 = abstractC7861e10.remoteconfig(abstractC7861e9);
        }
        boolean admob2 = adcel.admob();
        AbstractC7861e abstractC7861e11 = this.metrica;
        if (admob2) {
            abstractC7861e3 = abstractC7861e11;
        } else {
            abstractC7861e8 = abstractC7861e8.remoteconfig(adcel);
            abstractC7861e3 = abstractC7861e11.remoteconfig(adcel);
        }
        AbstractC7861e ad = abstractC7861e3.ad(abstractC7861e2);
        AbstractC7861e ad2 = abstractC7861e8.ad(abstractC7861e);
        if (ad2.subscription()) {
            return ad.subscription() ? isPro() : abstractC0362e.smaato();
        }
        int i = 13;
        if (abstractC7861e7.subscription()) {
            AbstractC9932e Signature = Signature();
            AbstractC7861e abstractC7861e12 = Signature.vip;
            AbstractC7861e startapp = Signature.startapp();
            AbstractC7861e yandex = startapp.ad(abstractC7861e10).yandex(abstractC7861e12);
            AbstractC7861e crashlytics = AbstractC4653e.crashlytics(yandex, yandex, abstractC7861e12);
            if (crashlytics.subscription()) {
                return new C9345e(abstractC0362e, crashlytics, abstractC0362e.metrica, i);
            }
            AbstractC7861e ad3 = yandex.remoteconfig(abstractC7861e12.ad(crashlytics)).ad(crashlytics).ad(startapp).yandex(crashlytics).ad(crashlytics);
            abstractC7861e6 = abstractC0362e.adcel(InterfaceC4563e.Signature);
            abstractC7861e4 = ad3;
            abstractC7861e5 = crashlytics;
        } else {
            AbstractC7861e applovin = ad2.applovin();
            AbstractC7861e remoteconfig = ad.remoteconfig(abstractC7861e8);
            AbstractC7861e remoteconfig2 = ad.remoteconfig(abstractC7861e);
            AbstractC7861e remoteconfig3 = remoteconfig.remoteconfig(remoteconfig2);
            if (remoteconfig3.subscription()) {
                return new C9345e(abstractC0362e, remoteconfig3, abstractC0362e.metrica, i);
            }
            AbstractC7861e remoteconfig4 = ad.remoteconfig(applovin);
            AbstractC7861e remoteconfig5 = !admob2 ? remoteconfig4.remoteconfig(adcel) : remoteconfig4;
            AbstractC7861e ads = remoteconfig2.ad(applovin).ads(remoteconfig5, abstractC7861e11.ad(abstractC7861e9));
            if (!admob) {
                remoteconfig5 = remoteconfig5.remoteconfig(abstractC7861e9);
            }
            abstractC7861e4 = ads;
            abstractC7861e5 = remoteconfig3;
            abstractC7861e6 = remoteconfig5;
        }
        return new C9345e(abstractC0362e, abstractC7861e5, abstractC7861e4, new AbstractC7861e[]{abstractC7861e6}, 13);
    }

    private final AbstractC9932e crashlytics(AbstractC9932e abstractC9932e) {
        AbstractC7861e abstractC7861e;
        AbstractC7861e abstractC7861e2;
        AbstractC7861e abstractC7861e3;
        AbstractC7861e abstractC7861e4;
        AbstractC7861e abstractC7861e5;
        AbstractC7861e abstractC7861e6;
        if (advert()) {
            return abstractC9932e;
        }
        if (abstractC9932e.advert()) {
            return this;
        }
        AbstractC7861e abstractC7861e7 = abstractC9932e.vip;
        AbstractC7861e abstractC7861e8 = this.vip;
        boolean subscription = abstractC7861e8.subscription();
        AbstractC0362e abstractC0362e = this.ad;
        if (subscription) {
            return abstractC7861e7.subscription() ? abstractC0362e.smaato() : abstractC9932e.ad(this);
        }
        AbstractC7861e abstractC7861e9 = this.license[0];
        AbstractC7861e abstractC7861e10 = abstractC9932e.metrica;
        AbstractC7861e adcel = abstractC9932e.adcel();
        boolean admob = abstractC7861e9.admob();
        if (admob) {
            abstractC7861e = abstractC7861e7;
            abstractC7861e2 = abstractC7861e10;
        } else {
            abstractC7861e = abstractC7861e7.remoteconfig(abstractC7861e9);
            abstractC7861e2 = abstractC7861e10.remoteconfig(abstractC7861e9);
        }
        boolean admob2 = adcel.admob();
        AbstractC7861e abstractC7861e11 = this.metrica;
        if (admob2) {
            abstractC7861e3 = abstractC7861e11;
        } else {
            abstractC7861e8 = abstractC7861e8.remoteconfig(adcel);
            abstractC7861e3 = abstractC7861e11.remoteconfig(adcel);
        }
        AbstractC7861e ad = abstractC7861e3.ad(abstractC7861e2);
        AbstractC7861e ad2 = abstractC7861e8.ad(abstractC7861e);
        if (ad2.subscription()) {
            return ad.subscription() ? isPro() : abstractC0362e.smaato();
        }
        int i = 16;
        if (abstractC7861e7.subscription()) {
            AbstractC9932e Signature = Signature();
            AbstractC7861e abstractC7861e12 = Signature.vip;
            AbstractC7861e startapp = Signature.startapp();
            AbstractC7861e yandex = startapp.ad(abstractC7861e10).yandex(abstractC7861e12);
            AbstractC7861e vip = yandex.applovin().ad(yandex).ad(abstractC7861e12).vip();
            if (vip.subscription()) {
                return new C9345e(abstractC0362e, vip, abstractC0362e.metrica.isPro(), i);
            }
            AbstractC7861e ad3 = yandex.remoteconfig(abstractC7861e12.ad(vip)).ad(vip).ad(startapp).yandex(vip).ad(vip);
            abstractC7861e6 = abstractC0362e.adcel(InterfaceC4563e.Signature);
            abstractC7861e4 = ad3;
            abstractC7861e5 = vip;
        } else {
            AbstractC7861e applovin = ad2.applovin();
            AbstractC7861e remoteconfig = ad.remoteconfig(abstractC7861e8);
            AbstractC7861e remoteconfig2 = ad.remoteconfig(abstractC7861e);
            AbstractC7861e remoteconfig3 = remoteconfig.remoteconfig(remoteconfig2);
            if (remoteconfig3.subscription()) {
                return new C9345e(abstractC0362e, remoteconfig3, abstractC0362e.metrica.isPro(), i);
            }
            AbstractC7861e remoteconfig4 = ad.remoteconfig(applovin);
            AbstractC7861e remoteconfig5 = !admob2 ? remoteconfig4.remoteconfig(adcel) : remoteconfig4;
            AbstractC7861e ads = remoteconfig2.ad(applovin).ads(remoteconfig5, abstractC7861e11.ad(abstractC7861e9));
            if (!admob) {
                remoteconfig5 = remoteconfig5.remoteconfig(abstractC7861e9);
            }
            abstractC7861e4 = ads;
            abstractC7861e5 = remoteconfig3;
            abstractC7861e6 = remoteconfig5;
        }
        return new C9345e(abstractC0362e, abstractC7861e5, abstractC7861e4, new AbstractC7861e[]{abstractC7861e6}, 16);
    }

    private final AbstractC9932e firebase(AbstractC9932e abstractC9932e) {
        char c;
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        C6002e c6002e;
        C6002e c6002e2;
        C6002e c6002e3;
        if (advert()) {
            return abstractC9932e;
        }
        if (abstractC9932e.advert()) {
            return this;
        }
        C6002e c6002e4 = (C6002e) this.vip;
        C6002e c6002e5 = (C6002e) abstractC9932e.vip;
        long[] jArr4 = c6002e4.f12654e;
        boolean license = AbstractC11538e.license(jArr4);
        AbstractC0362e abstractC0362e = this.ad;
        if (license) {
            return AbstractC11538e.license(c6002e5.f12654e) ? abstractC0362e.smaato() : abstractC9932e.ad(this);
        }
        C6002e c6002e6 = (C6002e) this.metrica;
        C6002e c6002e7 = (C6002e) this.license[0];
        C6002e c6002e8 = (C6002e) abstractC9932e.metrica;
        C6002e c6002e9 = (C6002e) abstractC9932e.adcel();
        long[] jArr5 = new long[9];
        long[] jArr6 = new long[9];
        long[] jArr7 = new long[9];
        long[] jArr8 = new long[9];
        boolean admob = c6002e7.admob();
        long[] jArr9 = c6002e7.f12654e;
        long[] signatures = admob ? null : AbstractC17181e.signatures(jArr9);
        if (signatures == null) {
            jArr2 = c6002e5.f12654e;
            c = 0;
            jArr = c6002e8.f12654e;
        } else {
            c = 0;
            AbstractC17181e.pro(c6002e5.f12654e, signatures, jArr6);
            AbstractC17181e.pro(c6002e8.f12654e, signatures, jArr8);
            jArr = jArr8;
            jArr2 = jArr6;
        }
        long[] signatures2 = c6002e9.admob() ? null : AbstractC17181e.signatures(c6002e9.f12654e);
        if (signatures2 == null) {
            jArr3 = c6002e6.f12654e;
        } else {
            AbstractC17181e.pro(jArr4, signatures2, jArr5);
            AbstractC17181e.pro(c6002e6.f12654e, signatures2, jArr7);
            jArr4 = jArr5;
            jArr3 = jArr7;
        }
        AbstractC17181e.startapp(jArr3, jArr, jArr7);
        AbstractC17181e.startapp(jArr4, jArr2, jArr8);
        if (AbstractC11538e.license(jArr8)) {
            return AbstractC11538e.license(jArr7) ? isPro() : abstractC0362e.smaato();
        }
        boolean license2 = AbstractC11538e.license(c6002e5.f12654e);
        int i = 17;
        if (license2) {
            AbstractC9932e Signature = Signature();
            C6002e c6002e10 = (C6002e) Signature.vip;
            AbstractC7861e startapp = Signature.startapp();
            AbstractC7861e yandex = startapp.ad(c6002e8).yandex(c6002e10);
            C6002e c6002e11 = (C6002e) yandex.applovin().ad(yandex).ad(c6002e10);
            if (AbstractC11538e.license(c6002e11.f12654e)) {
                return new C9345e(abstractC0362e, c6002e11, abstractC0362e.metrica, i);
            }
            c6002e = (C6002e) yandex.remoteconfig(c6002e10.ad(c6002e11)).ad(c6002e11).ad(startapp).yandex(c6002e11).ad(c6002e11);
            c6002e3 = (C6002e) abstractC0362e.adcel(InterfaceC4563e.Signature);
            c6002e2 = c6002e11;
        } else {
            AbstractC17181e.isVip(jArr8, jArr8);
            long[] signatures3 = AbstractC17181e.signatures(jArr7);
            AbstractC17181e.pro(jArr4, signatures3, jArr5);
            AbstractC17181e.pro(jArr2, signatures3, jArr6);
            C6002e c6002e12 = new C6002e(jArr5);
            AbstractC17181e.subscription(jArr5, jArr6, jArr5);
            if (AbstractC11538e.license(jArr5)) {
                return new C9345e(abstractC0362e, c6002e12, abstractC0362e.metrica, i);
            }
            C6002e c6002e13 = new C6002e(jArr7);
            AbstractC17181e.pro(jArr8, signatures3, jArr7);
            if (signatures2 != null) {
                AbstractC17181e.pro(jArr7, signatures2, jArr7);
            }
            long[] jArr10 = new long[18];
            AbstractC17181e.startapp(jArr6, jArr8, jArr8);
            long[] jArr11 = new long[18];
            AbstractC17181e.Signature(jArr8, jArr11);
            AbstractC17181e.advert(jArr10, jArr11, jArr10);
            AbstractC17181e.startapp(c6002e6.f12654e, jArr9, jArr8);
            AbstractC17181e.remoteconfig(jArr8, jArr7, jArr10);
            c6002e = new C6002e(jArr8);
            AbstractC17181e.tapsense(jArr10, jArr8);
            if (signatures != null) {
                AbstractC17181e.pro(jArr7, signatures, jArr7);
            }
            c6002e2 = c6002e12;
            c6002e3 = c6002e13;
        }
        C6002e c6002e14 = c6002e;
        AbstractC7861e[] abstractC7861eArr = new AbstractC7861e[1];
        abstractC7861eArr[c] = c6002e3;
        return new C9345e(abstractC0362e, c6002e2, c6002e14, abstractC7861eArr, 17);
    }

    private final AbstractC9932e premium(AbstractC9932e abstractC9932e) {
        AbstractC7861e abstractC7861e;
        AbstractC7861e abstractC7861e2;
        AbstractC7861e abstractC7861e3;
        AbstractC7861e abstractC7861e4;
        AbstractC7861e abstractC7861e5;
        AbstractC7861e abstractC7861e6;
        if (advert()) {
            return abstractC9932e;
        }
        if (abstractC9932e.advert()) {
            return this;
        }
        AbstractC7861e abstractC7861e7 = abstractC9932e.vip;
        AbstractC7861e abstractC7861e8 = this.vip;
        boolean subscription = abstractC7861e8.subscription();
        AbstractC0362e abstractC0362e = this.ad;
        if (subscription) {
            return abstractC7861e7.subscription() ? abstractC0362e.smaato() : abstractC9932e.ad(this);
        }
        AbstractC7861e abstractC7861e9 = this.license[0];
        AbstractC7861e abstractC7861e10 = abstractC9932e.metrica;
        AbstractC7861e adcel = abstractC9932e.adcel();
        boolean admob = abstractC7861e9.admob();
        if (admob) {
            abstractC7861e = abstractC7861e7;
            abstractC7861e2 = abstractC7861e10;
        } else {
            abstractC7861e = abstractC7861e7.remoteconfig(abstractC7861e9);
            abstractC7861e2 = abstractC7861e10.remoteconfig(abstractC7861e9);
        }
        boolean admob2 = adcel.admob();
        AbstractC7861e abstractC7861e11 = this.metrica;
        if (admob2) {
            abstractC7861e3 = abstractC7861e11;
        } else {
            abstractC7861e8 = abstractC7861e8.remoteconfig(adcel);
            abstractC7861e3 = abstractC7861e11.remoteconfig(adcel);
        }
        AbstractC7861e ad = abstractC7861e3.ad(abstractC7861e2);
        AbstractC7861e ad2 = abstractC7861e8.ad(abstractC7861e);
        if (ad2.subscription()) {
            return ad.subscription() ? isPro() : abstractC0362e.smaato();
        }
        int i = 14;
        if (abstractC7861e7.subscription()) {
            AbstractC9932e Signature = Signature();
            AbstractC7861e abstractC7861e12 = Signature.vip;
            AbstractC7861e startapp = Signature.startapp();
            AbstractC7861e yandex = startapp.ad(abstractC7861e10).yandex(abstractC7861e12);
            AbstractC7861e vip = yandex.applovin().ad(yandex).ad(abstractC7861e12).vip();
            if (vip.subscription()) {
                return new C9345e(abstractC0362e, vip, abstractC0362e.metrica.isPro(), i);
            }
            AbstractC7861e ad3 = yandex.remoteconfig(abstractC7861e12.ad(vip)).ad(vip).ad(startapp).yandex(vip).ad(vip);
            abstractC7861e6 = abstractC0362e.adcel(InterfaceC4563e.Signature);
            abstractC7861e4 = ad3;
            abstractC7861e5 = vip;
        } else {
            AbstractC7861e applovin = ad2.applovin();
            AbstractC7861e remoteconfig = ad.remoteconfig(abstractC7861e8);
            AbstractC7861e remoteconfig2 = ad.remoteconfig(abstractC7861e);
            AbstractC7861e remoteconfig3 = remoteconfig.remoteconfig(remoteconfig2);
            if (remoteconfig3.subscription()) {
                return new C9345e(abstractC0362e, remoteconfig3, abstractC0362e.metrica.isPro(), i);
            }
            AbstractC7861e remoteconfig4 = ad.remoteconfig(applovin);
            AbstractC7861e remoteconfig5 = !admob2 ? remoteconfig4.remoteconfig(adcel) : remoteconfig4;
            AbstractC7861e ads = remoteconfig2.ad(applovin).ads(remoteconfig5, abstractC7861e11.ad(abstractC7861e9));
            if (!admob) {
                remoteconfig5 = remoteconfig5.remoteconfig(abstractC7861e9);
            }
            abstractC7861e4 = ads;
            abstractC7861e5 = remoteconfig3;
            abstractC7861e6 = remoteconfig5;
        }
        return new C9345e(abstractC0362e, abstractC7861e5, abstractC7861e4, new AbstractC7861e[]{abstractC7861e6}, 14);
    }

    private final AbstractC9932e subs(AbstractC9932e abstractC9932e) {
        AbstractC7861e abstractC7861e;
        AbstractC7861e abstractC7861e2;
        AbstractC7861e abstractC7861e3;
        AbstractC7861e abstractC7861e4;
        AbstractC7861e abstractC7861e5;
        AbstractC7861e abstractC7861e6;
        if (advert()) {
            return abstractC9932e;
        }
        if (abstractC9932e.advert()) {
            return this;
        }
        AbstractC7861e abstractC7861e7 = abstractC9932e.vip;
        AbstractC7861e abstractC7861e8 = this.vip;
        boolean subscription = abstractC7861e8.subscription();
        AbstractC0362e abstractC0362e = this.ad;
        if (subscription) {
            return abstractC7861e7.subscription() ? abstractC0362e.smaato() : abstractC9932e.ad(this);
        }
        AbstractC7861e abstractC7861e9 = this.license[0];
        AbstractC7861e abstractC7861e10 = abstractC9932e.metrica;
        AbstractC7861e adcel = abstractC9932e.adcel();
        boolean admob = abstractC7861e9.admob();
        if (admob) {
            abstractC7861e = abstractC7861e7;
            abstractC7861e2 = abstractC7861e10;
        } else {
            abstractC7861e = abstractC7861e7.remoteconfig(abstractC7861e9);
            abstractC7861e2 = abstractC7861e10.remoteconfig(abstractC7861e9);
        }
        boolean admob2 = adcel.admob();
        AbstractC7861e abstractC7861e11 = this.metrica;
        if (admob2) {
            abstractC7861e3 = abstractC7861e11;
        } else {
            abstractC7861e8 = abstractC7861e8.remoteconfig(adcel);
            abstractC7861e3 = abstractC7861e11.remoteconfig(adcel);
        }
        AbstractC7861e ad = abstractC7861e3.ad(abstractC7861e2);
        AbstractC7861e ad2 = abstractC7861e8.ad(abstractC7861e);
        if (ad2.subscription()) {
            return ad.subscription() ? isPro() : abstractC0362e.smaato();
        }
        int i = 15;
        if (abstractC7861e7.subscription()) {
            AbstractC9932e Signature = Signature();
            AbstractC7861e abstractC7861e12 = Signature.vip;
            AbstractC7861e startapp = Signature.startapp();
            AbstractC7861e yandex = startapp.ad(abstractC7861e10).yandex(abstractC7861e12);
            AbstractC7861e crashlytics = AbstractC4653e.crashlytics(yandex, yandex, abstractC7861e12);
            if (crashlytics.subscription()) {
                return new C9345e(abstractC0362e, crashlytics, abstractC0362e.metrica, i);
            }
            AbstractC7861e ad3 = yandex.remoteconfig(abstractC7861e12.ad(crashlytics)).ad(crashlytics).ad(startapp).yandex(crashlytics).ad(crashlytics);
            abstractC7861e6 = abstractC0362e.adcel(InterfaceC4563e.Signature);
            abstractC7861e4 = ad3;
            abstractC7861e5 = crashlytics;
        } else {
            AbstractC7861e applovin = ad2.applovin();
            AbstractC7861e remoteconfig = ad.remoteconfig(abstractC7861e8);
            AbstractC7861e remoteconfig2 = ad.remoteconfig(abstractC7861e);
            AbstractC7861e remoteconfig3 = remoteconfig.remoteconfig(remoteconfig2);
            if (remoteconfig3.subscription()) {
                return new C9345e(abstractC0362e, remoteconfig3, abstractC0362e.metrica, i);
            }
            AbstractC7861e remoteconfig4 = ad.remoteconfig(applovin);
            AbstractC7861e remoteconfig5 = !admob2 ? remoteconfig4.remoteconfig(adcel) : remoteconfig4;
            AbstractC7861e ads = remoteconfig2.ad(applovin).ads(remoteconfig5, abstractC7861e11.ad(abstractC7861e9));
            if (!admob) {
                remoteconfig5 = remoteconfig5.remoteconfig(abstractC7861e9);
            }
            abstractC7861e4 = ads;
            abstractC7861e5 = remoteconfig3;
            abstractC7861e6 = remoteconfig5;
        }
        return new C9345e(abstractC0362e, abstractC7861e5, abstractC7861e4, new AbstractC7861e[]{abstractC7861e6}, 15);
    }

    /* JADX WARN: Code restructure failed: missing block: B:697:0x0f31, code lost:
    
        if (r5.subscription() != false) goto L620;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:?, code lost:
    
        return isPro();
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x101f, code lost:
    
        if (r4.subscription() != false) goto L620;
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x107e, code lost:
    
        if (r2.subscription() != false) goto L620;
     */
    @Override // defpackage.AbstractC9932e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.AbstractC9932e ad(defpackage.AbstractC9932e r19) {
        /*
            Method dump skipped, instructions count: 4304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9345e.ad(eٍۨؔ):eٍۨؔ");
    }

    /* JADX WARN: Type inference failed for: r1v183, types: [eؘِۣ, eًُ٘] */
    @Override // defpackage.AbstractC9932e
    public final AbstractC9932e applovin(AbstractC9932e abstractC9932e) {
        int i = this.billing;
        int i2 = 6;
        int i3 = 3;
        int i4 = 9;
        AbstractC7861e[] abstractC7861eArr = this.license;
        AbstractC7861e abstractC7861e = this.metrica;
        AbstractC7861e abstractC7861e2 = this.vip;
        int i5 = 1;
        int i6 = 0;
        switch (i) {
            case 0:
                if (advert()) {
                    return abstractC9932e;
                }
                if (abstractC9932e.advert()) {
                    return isPro();
                }
                if (abstractC7861e2.subscription()) {
                    return abstractC9932e;
                }
                AbstractC0362e abstractC0362e = this.ad;
                if (abstractC0362e.purchase == 6) {
                    AbstractC7861e abstractC7861e3 = abstractC9932e.vip;
                    AbstractC7861e abstractC7861e4 = abstractC9932e.license[0];
                    if (!abstractC7861e3.subscription() && abstractC7861e4.admob()) {
                        AbstractC7861e abstractC7861e5 = abstractC7861eArr[0];
                        AbstractC7861e abstractC7861e6 = abstractC9932e.metrica;
                        AbstractC7861e applovin = abstractC7861e2.applovin();
                        AbstractC7861e applovin2 = abstractC7861e.applovin();
                        AbstractC7861e applovin3 = abstractC7861e5.applovin();
                        AbstractC7861e ad = abstractC0362e.vip.remoteconfig(applovin3).ad(applovin2).ad(abstractC7861e.remoteconfig(abstractC7861e5));
                        AbstractC7861e vip = abstractC7861e6.vip();
                        AbstractC7861e signatures = abstractC0362e.vip.ad(vip).remoteconfig(applovin3).ad(applovin2).signatures(ad, applovin, applovin3);
                        AbstractC7861e remoteconfig = abstractC7861e3.remoteconfig(applovin3);
                        AbstractC7861e applovin4 = remoteconfig.ad(ad).applovin();
                        if (applovin4.subscription()) {
                            return signatures.subscription() ? abstractC9932e.isPro() : abstractC0362e.smaato();
                        }
                        if (signatures.subscription()) {
                            return new C9345e(abstractC0362e, signatures, abstractC0362e.metrica.isPro(), i6);
                        }
                        AbstractC7861e remoteconfig2 = signatures.applovin().remoteconfig(remoteconfig);
                        AbstractC7861e remoteconfig3 = signatures.remoteconfig(applovin4).remoteconfig(applovin3);
                        return new C9345e(abstractC0362e, remoteconfig2, signatures.ad(applovin4).applovin().signatures(ad, vip, remoteconfig3), new AbstractC7861e[]{remoteconfig3}, 0);
                    }
                }
                return isPro().ad(abstractC9932e);
            case 1:
                if (advert()) {
                    return abstractC9932e;
                }
                if (abstractC9932e.advert()) {
                    return isPro();
                }
                if (abstractC7861e2.subscription()) {
                    return abstractC9932e;
                }
                AbstractC7861e abstractC7861e7 = abstractC9932e.vip;
                AbstractC7861e adcel = abstractC9932e.adcel();
                if (abstractC7861e7.subscription() || !adcel.admob()) {
                    return isPro().ad(abstractC9932e);
                }
                AbstractC7861e abstractC7861e8 = abstractC7861eArr[0];
                AbstractC7861e abstractC7861e9 = abstractC9932e.metrica;
                AbstractC7861e applovin5 = abstractC7861e2.applovin();
                AbstractC7861e applovin6 = abstractC7861e.applovin();
                AbstractC7861e applovin7 = abstractC7861e8.applovin();
                AbstractC7861e remoteconfig4 = abstractC7861e.remoteconfig(abstractC7861e8);
                AbstractC0362e abstractC0362e2 = this.ad;
                AbstractC7861e ad2 = abstractC0362e2.vip.remoteconfig(applovin7).ad(applovin6).ad(remoteconfig4);
                AbstractC7861e vip2 = abstractC7861e9.vip();
                AbstractC7861e signatures2 = abstractC0362e2.vip.ad(vip2).remoteconfig(applovin7).ad(applovin6).signatures(ad2, applovin5, applovin7);
                AbstractC7861e remoteconfig5 = abstractC7861e7.remoteconfig(applovin7);
                AbstractC7861e applovin8 = remoteconfig5.ad(ad2).applovin();
                if (applovin8.subscription()) {
                    return signatures2.subscription() ? abstractC9932e.isPro() : abstractC0362e2.smaato();
                }
                if (signatures2.subscription()) {
                    return new C9345e(abstractC0362e2, signatures2, abstractC0362e2.metrica.isPro(), i5);
                }
                AbstractC7861e remoteconfig6 = signatures2.applovin().remoteconfig(remoteconfig5);
                AbstractC7861e remoteconfig7 = signatures2.remoteconfig(applovin8).remoteconfig(applovin7);
                return new C9345e(abstractC0362e2, remoteconfig6, signatures2.ad(applovin8).applovin().signatures(ad2, vip2, remoteconfig7), new AbstractC7861e[]{remoteconfig7}, 1);
            case 2:
                if (advert()) {
                    return abstractC9932e;
                }
                if (abstractC9932e.advert()) {
                    return isPro();
                }
                if (abstractC7861e2.subscription()) {
                    return abstractC9932e;
                }
                AbstractC7861e abstractC7861e10 = abstractC9932e.vip;
                AbstractC7861e adcel2 = abstractC9932e.adcel();
                if (abstractC7861e10.subscription() || !adcel2.admob()) {
                    return isPro().ad(abstractC9932e);
                }
                AbstractC7861e abstractC7861e11 = abstractC7861eArr[0];
                AbstractC7861e abstractC7861e12 = abstractC9932e.metrica;
                AbstractC7861e applovin9 = abstractC7861e2.applovin();
                AbstractC7861e applovin10 = abstractC7861e.applovin();
                AbstractC7861e applovin11 = abstractC7861e11.applovin();
                AbstractC7861e remoteconfig8 = abstractC7861e.remoteconfig(abstractC7861e11);
                AbstractC0362e abstractC0362e3 = this.ad;
                AbstractC7861e ad3 = abstractC0362e3.vip.remoteconfig(applovin11).ad(applovin10).ad(remoteconfig8);
                AbstractC7861e vip3 = abstractC7861e12.vip();
                AbstractC7861e signatures3 = abstractC0362e3.vip.ad(vip3).remoteconfig(applovin11).ad(applovin10).signatures(ad3, applovin9, applovin11);
                AbstractC7861e remoteconfig9 = abstractC7861e10.remoteconfig(applovin11);
                AbstractC7861e applovin12 = remoteconfig9.ad(ad3).applovin();
                if (applovin12.subscription()) {
                    return signatures3.subscription() ? abstractC9932e.isPro() : abstractC0362e3.smaato();
                }
                if (signatures3.subscription()) {
                    return new C9345e(abstractC0362e3, signatures3, abstractC0362e3.metrica.isPro(), 2);
                }
                AbstractC7861e remoteconfig10 = signatures3.applovin().remoteconfig(remoteconfig9);
                AbstractC7861e remoteconfig11 = signatures3.remoteconfig(applovin12).remoteconfig(applovin11);
                return new C9345e(abstractC0362e3, remoteconfig10, signatures3.ad(applovin12).applovin().signatures(ad3, vip3, remoteconfig11), new AbstractC7861e[]{remoteconfig11}, 2);
            case 3:
                if (advert()) {
                    return abstractC9932e;
                }
                if (abstractC9932e.advert()) {
                    return isPro();
                }
                if (abstractC7861e2.subscription()) {
                    return abstractC9932e;
                }
                AbstractC7861e abstractC7861e13 = abstractC9932e.vip;
                AbstractC7861e adcel3 = abstractC9932e.adcel();
                if (abstractC7861e13.subscription() || !adcel3.admob()) {
                    return isPro().ad(abstractC9932e);
                }
                AbstractC7861e abstractC7861e14 = abstractC7861eArr[0];
                AbstractC7861e abstractC7861e15 = abstractC9932e.metrica;
                AbstractC7861e applovin13 = abstractC7861e2.applovin();
                AbstractC7861e applovin14 = abstractC7861e.applovin();
                AbstractC7861e applovin15 = abstractC7861e14.applovin();
                AbstractC7861e remoteconfig12 = abstractC7861e.remoteconfig(abstractC7861e14);
                AbstractC0362e abstractC0362e4 = this.ad;
                AbstractC7861e ad4 = abstractC0362e4.vip.remoteconfig(applovin15).ad(applovin14).ad(remoteconfig12);
                AbstractC7861e vip4 = abstractC7861e15.vip();
                AbstractC7861e signatures4 = abstractC0362e4.vip.ad(vip4).remoteconfig(applovin15).ad(applovin14).signatures(ad4, applovin13, applovin15);
                AbstractC7861e remoteconfig13 = abstractC7861e13.remoteconfig(applovin15);
                AbstractC7861e applovin16 = remoteconfig13.ad(ad4).applovin();
                if (applovin16.subscription()) {
                    return signatures4.subscription() ? abstractC9932e.isPro() : abstractC0362e4.smaato();
                }
                if (signatures4.subscription()) {
                    return new C9345e(abstractC0362e4, signatures4, abstractC0362e4.metrica.isPro(), i3);
                }
                AbstractC7861e remoteconfig14 = signatures4.applovin().remoteconfig(remoteconfig13);
                AbstractC7861e remoteconfig15 = signatures4.remoteconfig(applovin16).remoteconfig(applovin15);
                return new C9345e(abstractC0362e4, remoteconfig14, signatures4.ad(applovin16).applovin().signatures(ad4, vip4, remoteconfig15), new AbstractC7861e[]{remoteconfig15}, 3);
            case 4:
                if (advert()) {
                    return abstractC9932e;
                }
                if (abstractC9932e.advert()) {
                    return isPro();
                }
                if (abstractC7861e2.subscription()) {
                    return abstractC9932e;
                }
                AbstractC7861e abstractC7861e16 = abstractC9932e.vip;
                AbstractC7861e adcel4 = abstractC9932e.adcel();
                if (abstractC7861e16.subscription() || !adcel4.admob()) {
                    return isPro().ad(abstractC9932e);
                }
                AbstractC7861e abstractC7861e17 = abstractC7861eArr[0];
                AbstractC7861e abstractC7861e18 = abstractC9932e.metrica;
                AbstractC7861e applovin17 = abstractC7861e2.applovin();
                AbstractC7861e applovin18 = abstractC7861e.applovin();
                AbstractC7861e applovin19 = abstractC7861e17.applovin();
                AbstractC7861e remoteconfig16 = abstractC7861e.remoteconfig(abstractC7861e17);
                AbstractC0362e abstractC0362e5 = this.ad;
                AbstractC7861e ad5 = abstractC0362e5.vip.remoteconfig(applovin19).ad(applovin18).ad(remoteconfig16);
                AbstractC7861e vip5 = abstractC7861e18.vip();
                AbstractC7861e signatures5 = abstractC0362e5.vip.ad(vip5).remoteconfig(applovin19).ad(applovin18).signatures(ad5, applovin17, applovin19);
                AbstractC7861e remoteconfig17 = abstractC7861e16.remoteconfig(applovin19);
                AbstractC7861e applovin20 = remoteconfig17.ad(ad5).applovin();
                if (applovin20.subscription()) {
                    return signatures5.subscription() ? abstractC9932e.isPro() : abstractC0362e5.smaato();
                }
                if (signatures5.subscription()) {
                    return new C9345e(abstractC0362e5, signatures5, abstractC0362e5.metrica.isPro(), 4);
                }
                AbstractC7861e remoteconfig18 = signatures5.applovin().remoteconfig(remoteconfig17);
                AbstractC7861e remoteconfig19 = signatures5.remoteconfig(applovin20).remoteconfig(applovin19);
                return new C9345e(abstractC0362e5, remoteconfig18, signatures5.ad(applovin20).applovin().signatures(ad5, vip5, remoteconfig19), new AbstractC7861e[]{remoteconfig19}, 4);
            case 5:
                if (advert()) {
                    return abstractC9932e;
                }
                if (abstractC9932e.advert()) {
                    return isPro();
                }
                if (abstractC7861e2.subscription()) {
                    return abstractC9932e;
                }
                AbstractC7861e abstractC7861e19 = abstractC9932e.vip;
                AbstractC7861e adcel5 = abstractC9932e.adcel();
                if (abstractC7861e19.subscription() || !adcel5.admob()) {
                    return isPro().ad(abstractC9932e);
                }
                AbstractC7861e abstractC7861e20 = abstractC7861eArr[0];
                AbstractC7861e abstractC7861e21 = abstractC9932e.metrica;
                AbstractC7861e applovin21 = abstractC7861e2.applovin();
                AbstractC7861e applovin22 = abstractC7861e.applovin();
                AbstractC7861e applovin23 = abstractC7861e20.applovin();
                AbstractC7861e ad6 = applovin23.ad(applovin22).ad(abstractC7861e.remoteconfig(abstractC7861e20));
                AbstractC7861e signatures6 = abstractC7861e21.remoteconfig(applovin23).ad(applovin22).signatures(ad6, applovin21, applovin23);
                AbstractC7861e remoteconfig20 = abstractC7861e19.remoteconfig(applovin23);
                AbstractC7861e applovin24 = remoteconfig20.ad(ad6).applovin();
                boolean subscription = applovin24.subscription();
                AbstractC0362e abstractC0362e6 = this.ad;
                if (subscription) {
                    return signatures6.subscription() ? abstractC9932e.isPro() : abstractC0362e6.smaato();
                }
                if (signatures6.subscription()) {
                    return new C9345e(abstractC0362e6, signatures6, abstractC0362e6.metrica, 5);
                }
                AbstractC7861e remoteconfig21 = signatures6.applovin().remoteconfig(remoteconfig20);
                AbstractC7861e remoteconfig22 = signatures6.remoteconfig(applovin24).remoteconfig(applovin23);
                return new C9345e(abstractC0362e6, remoteconfig21, signatures6.ad(applovin24).applovin().signatures(ad6, abstractC7861e21.vip(), remoteconfig22), new AbstractC7861e[]{remoteconfig22}, 5);
            case 6:
                if (advert()) {
                    return abstractC9932e;
                }
                if (abstractC9932e.advert()) {
                    return isPro();
                }
                if (abstractC7861e2.subscription()) {
                    return abstractC9932e;
                }
                AbstractC7861e abstractC7861e22 = abstractC9932e.vip;
                AbstractC7861e adcel6 = abstractC9932e.adcel();
                if (abstractC7861e22.subscription() || !adcel6.admob()) {
                    return isPro().ad(abstractC9932e);
                }
                AbstractC7861e abstractC7861e23 = abstractC7861eArr[0];
                AbstractC7861e abstractC7861e24 = abstractC9932e.metrica;
                AbstractC7861e applovin25 = abstractC7861e2.applovin();
                AbstractC7861e applovin26 = abstractC7861e.applovin();
                AbstractC7861e applovin27 = abstractC7861e23.applovin();
                AbstractC7861e remoteconfig23 = abstractC7861e.remoteconfig(abstractC7861e23);
                AbstractC0362e abstractC0362e7 = this.ad;
                AbstractC7861e ad7 = abstractC0362e7.vip.remoteconfig(applovin27).ad(applovin26).ad(remoteconfig23);
                AbstractC7861e vip6 = abstractC7861e24.vip();
                AbstractC7861e signatures7 = abstractC0362e7.vip.ad(vip6).remoteconfig(applovin27).ad(applovin26).signatures(ad7, applovin25, applovin27);
                AbstractC7861e remoteconfig24 = abstractC7861e22.remoteconfig(applovin27);
                AbstractC7861e applovin28 = remoteconfig24.ad(ad7).applovin();
                if (applovin28.subscription()) {
                    return signatures7.subscription() ? abstractC9932e.isPro() : abstractC0362e7.smaato();
                }
                if (signatures7.subscription()) {
                    return new C9345e(abstractC0362e7, signatures7, abstractC0362e7.metrica.isPro(), i2);
                }
                AbstractC7861e remoteconfig25 = signatures7.applovin().remoteconfig(remoteconfig24);
                AbstractC7861e remoteconfig26 = signatures7.remoteconfig(applovin28).remoteconfig(applovin27);
                return new C9345e(abstractC0362e7, remoteconfig25, signatures7.ad(applovin28).applovin().signatures(ad7, vip6, remoteconfig26), new AbstractC7861e[]{remoteconfig26}, 6);
            case 7:
                if (advert()) {
                    return abstractC9932e;
                }
                if (abstractC9932e.advert()) {
                    return isPro();
                }
                if (abstractC7861e2.subscription()) {
                    return abstractC9932e;
                }
                AbstractC7861e abstractC7861e25 = abstractC9932e.vip;
                AbstractC7861e adcel7 = abstractC9932e.adcel();
                if (abstractC7861e25.subscription() || !adcel7.admob()) {
                    return isPro().ad(abstractC9932e);
                }
                AbstractC7861e abstractC7861e26 = abstractC7861eArr[0];
                AbstractC7861e abstractC7861e27 = abstractC9932e.metrica;
                AbstractC7861e applovin29 = abstractC7861e2.applovin();
                AbstractC7861e applovin30 = abstractC7861e.applovin();
                AbstractC7861e applovin31 = abstractC7861e26.applovin();
                AbstractC7861e ad8 = applovin31.ad(applovin30).ad(abstractC7861e.remoteconfig(abstractC7861e26));
                AbstractC7861e signatures8 = abstractC7861e27.remoteconfig(applovin31).ad(applovin30).signatures(ad8, applovin29, applovin31);
                AbstractC7861e remoteconfig27 = abstractC7861e25.remoteconfig(applovin31);
                AbstractC7861e applovin32 = remoteconfig27.ad(ad8).applovin();
                boolean subscription2 = applovin32.subscription();
                AbstractC0362e abstractC0362e8 = this.ad;
                if (subscription2) {
                    return signatures8.subscription() ? abstractC9932e.isPro() : abstractC0362e8.smaato();
                }
                if (signatures8.subscription()) {
                    return new C9345e(abstractC0362e8, signatures8, abstractC0362e8.metrica.isPro(), 7);
                }
                AbstractC7861e remoteconfig28 = signatures8.applovin().remoteconfig(remoteconfig27);
                AbstractC7861e remoteconfig29 = signatures8.remoteconfig(applovin32).remoteconfig(applovin31);
                return new C9345e(abstractC0362e8, remoteconfig28, signatures8.ad(applovin32).applovin().signatures(ad8, abstractC7861e27.vip(), remoteconfig29), new AbstractC7861e[]{remoteconfig29}, 7);
            case 8:
                if (advert()) {
                    return abstractC9932e;
                }
                if (abstractC9932e.advert()) {
                    return isPro();
                }
                if (abstractC7861e2.subscription()) {
                    return abstractC9932e;
                }
                AbstractC7861e abstractC7861e28 = abstractC9932e.vip;
                AbstractC7861e adcel8 = abstractC9932e.adcel();
                if (abstractC7861e28.subscription() || !adcel8.admob()) {
                    return isPro().ad(abstractC9932e);
                }
                AbstractC7861e abstractC7861e29 = abstractC7861eArr[0];
                AbstractC7861e abstractC7861e30 = abstractC9932e.metrica;
                AbstractC7861e applovin33 = abstractC7861e2.applovin();
                AbstractC7861e applovin34 = abstractC7861e.applovin();
                AbstractC7861e applovin35 = abstractC7861e29.applovin();
                AbstractC7861e remoteconfig30 = abstractC7861e.remoteconfig(abstractC7861e29);
                AbstractC0362e abstractC0362e9 = this.ad;
                AbstractC7861e ad9 = abstractC0362e9.vip.remoteconfig(applovin35).ad(applovin34).ad(remoteconfig30);
                AbstractC7861e vip7 = abstractC7861e30.vip();
                AbstractC7861e signatures9 = abstractC0362e9.vip.ad(vip7).remoteconfig(applovin35).ad(applovin34).signatures(ad9, applovin33, applovin35);
                AbstractC7861e remoteconfig31 = abstractC7861e28.remoteconfig(applovin35);
                AbstractC7861e applovin36 = remoteconfig31.ad(ad9).applovin();
                if (applovin36.subscription()) {
                    return signatures9.subscription() ? abstractC9932e.isPro() : abstractC0362e9.smaato();
                }
                if (signatures9.subscription()) {
                    return new C9345e(abstractC0362e9, signatures9, abstractC0362e9.metrica.isPro(), 8);
                }
                AbstractC7861e remoteconfig32 = signatures9.applovin().remoteconfig(remoteconfig31);
                AbstractC7861e remoteconfig33 = signatures9.remoteconfig(applovin36).remoteconfig(applovin35);
                return new C9345e(abstractC0362e9, remoteconfig32, signatures9.ad(applovin36).applovin().signatures(ad9, vip7, remoteconfig33), new AbstractC7861e[]{remoteconfig33}, 8);
            case 9:
                if (advert()) {
                    return abstractC9932e;
                }
                if (abstractC9932e.advert()) {
                    return isPro();
                }
                if (abstractC7861e2.subscription()) {
                    return abstractC9932e;
                }
                AbstractC7861e abstractC7861e31 = abstractC9932e.vip;
                AbstractC7861e adcel9 = abstractC9932e.adcel();
                if (abstractC7861e31.subscription() || !adcel9.admob()) {
                    return isPro().ad(abstractC9932e);
                }
                AbstractC7861e abstractC7861e32 = abstractC7861eArr[0];
                AbstractC7861e abstractC7861e33 = abstractC9932e.metrica;
                AbstractC7861e applovin37 = abstractC7861e2.applovin();
                AbstractC7861e applovin38 = abstractC7861e.applovin();
                AbstractC7861e applovin39 = abstractC7861e32.applovin();
                AbstractC7861e remoteconfig34 = abstractC7861e.remoteconfig(abstractC7861e32);
                AbstractC0362e abstractC0362e10 = this.ad;
                AbstractC7861e ad10 = abstractC0362e10.vip.remoteconfig(applovin39).ad(applovin38).ad(remoteconfig34);
                AbstractC7861e vip8 = abstractC7861e33.vip();
                AbstractC7861e signatures10 = abstractC0362e10.vip.ad(vip8).remoteconfig(applovin39).ad(applovin38).signatures(ad10, applovin37, applovin39);
                AbstractC7861e remoteconfig35 = abstractC7861e31.remoteconfig(applovin39);
                AbstractC7861e applovin40 = remoteconfig35.ad(ad10).applovin();
                if (applovin40.subscription()) {
                    return signatures10.subscription() ? abstractC9932e.isPro() : abstractC0362e10.smaato();
                }
                if (signatures10.subscription()) {
                    return new C9345e(abstractC0362e10, signatures10, abstractC0362e10.metrica.isPro(), i4);
                }
                AbstractC7861e remoteconfig36 = signatures10.applovin().remoteconfig(remoteconfig35);
                AbstractC7861e remoteconfig37 = signatures10.remoteconfig(applovin40).remoteconfig(applovin39);
                return new C9345e(abstractC0362e10, remoteconfig36, signatures10.ad(applovin40).applovin().signatures(ad10, vip8, remoteconfig37), new AbstractC7861e[]{remoteconfig37}, 9);
            case 10:
                if (advert()) {
                    return abstractC9932e;
                }
                if (abstractC9932e.advert()) {
                    return isPro();
                }
                if (abstractC7861e2.subscription()) {
                    return abstractC9932e;
                }
                AbstractC7861e abstractC7861e34 = abstractC9932e.vip;
                AbstractC7861e adcel10 = abstractC9932e.adcel();
                if (abstractC7861e34.subscription() || !adcel10.admob()) {
                    return isPro().ad(abstractC9932e);
                }
                AbstractC7861e abstractC7861e35 = abstractC7861eArr[0];
                AbstractC7861e abstractC7861e36 = abstractC9932e.metrica;
                AbstractC7861e applovin41 = abstractC7861e2.applovin();
                AbstractC7861e applovin42 = abstractC7861e.applovin();
                AbstractC7861e applovin43 = abstractC7861e35.applovin();
                AbstractC7861e ad11 = applovin42.ad(abstractC7861e.remoteconfig(abstractC7861e35));
                AbstractC7861e vip9 = abstractC7861e36.vip();
                AbstractC7861e signatures11 = vip9.remoteconfig(applovin43).ad(applovin42).signatures(ad11, applovin41, applovin43);
                AbstractC7861e remoteconfig38 = abstractC7861e34.remoteconfig(applovin43);
                AbstractC7861e applovin44 = remoteconfig38.ad(ad11).applovin();
                boolean subscription3 = applovin44.subscription();
                AbstractC0362e abstractC0362e11 = this.ad;
                if (subscription3) {
                    return signatures11.subscription() ? abstractC9932e.isPro() : abstractC0362e11.smaato();
                }
                if (signatures11.subscription()) {
                    return new C9345e(abstractC0362e11, signatures11, abstractC0362e11.metrica, 10);
                }
                AbstractC7861e remoteconfig39 = signatures11.applovin().remoteconfig(remoteconfig38);
                AbstractC7861e remoteconfig40 = signatures11.remoteconfig(applovin44).remoteconfig(applovin43);
                return new C9345e(abstractC0362e11, remoteconfig39, signatures11.ad(applovin44).applovin().signatures(ad11, vip9, remoteconfig40), new AbstractC7861e[]{remoteconfig40}, 10);
            case 11:
                if (advert()) {
                    return abstractC9932e;
                }
                if (abstractC9932e.advert()) {
                    return isPro();
                }
                if (abstractC7861e2.subscription()) {
                    return abstractC9932e;
                }
                AbstractC7861e abstractC7861e37 = abstractC9932e.vip;
                AbstractC7861e adcel11 = abstractC9932e.adcel();
                if (abstractC7861e37.subscription() || !adcel11.admob()) {
                    return isPro().ad(abstractC9932e);
                }
                AbstractC7861e abstractC7861e38 = abstractC7861eArr[0];
                AbstractC7861e abstractC7861e39 = abstractC9932e.metrica;
                AbstractC7861e applovin45 = abstractC7861e2.applovin();
                AbstractC7861e applovin46 = abstractC7861e.applovin();
                AbstractC7861e applovin47 = abstractC7861e38.applovin();
                AbstractC7861e ad12 = applovin47.ad(applovin46).ad(abstractC7861e.remoteconfig(abstractC7861e38));
                AbstractC7861e signatures12 = abstractC7861e39.remoteconfig(applovin47).ad(applovin46).signatures(ad12, applovin45, applovin47);
                AbstractC7861e remoteconfig41 = abstractC7861e37.remoteconfig(applovin47);
                AbstractC7861e applovin48 = remoteconfig41.ad(ad12).applovin();
                boolean subscription4 = applovin48.subscription();
                AbstractC0362e abstractC0362e12 = this.ad;
                if (subscription4) {
                    return signatures12.subscription() ? abstractC9932e.isPro() : abstractC0362e12.smaato();
                }
                if (signatures12.subscription()) {
                    return new C9345e(abstractC0362e12, signatures12, abstractC0362e12.metrica.isPro(), 11);
                }
                AbstractC7861e remoteconfig42 = signatures12.applovin().remoteconfig(remoteconfig41);
                AbstractC7861e remoteconfig43 = signatures12.remoteconfig(applovin48).remoteconfig(applovin47);
                return new C9345e(abstractC0362e12, remoteconfig42, signatures12.ad(applovin48).applovin().signatures(ad12, abstractC7861e39.vip(), remoteconfig43), new AbstractC7861e[]{remoteconfig43}, 11);
            case 12:
                if (advert()) {
                    return abstractC9932e;
                }
                if (abstractC9932e.advert()) {
                    return isPro();
                }
                if (abstractC7861e2.subscription()) {
                    return abstractC9932e;
                }
                AbstractC7861e abstractC7861e40 = abstractC9932e.vip;
                AbstractC7861e adcel12 = abstractC9932e.adcel();
                if (abstractC7861e40.subscription() || !adcel12.admob()) {
                    return isPro().ad(abstractC9932e);
                }
                AbstractC7861e abstractC7861e41 = abstractC7861eArr[0];
                AbstractC7861e abstractC7861e42 = abstractC9932e.metrica;
                AbstractC7861e applovin49 = abstractC7861e2.applovin();
                AbstractC7861e applovin50 = abstractC7861e.applovin();
                AbstractC7861e applovin51 = abstractC7861e41.applovin();
                AbstractC7861e ad13 = applovin50.ad(abstractC7861e.remoteconfig(abstractC7861e41));
                AbstractC7861e vip10 = abstractC7861e42.vip();
                AbstractC7861e signatures13 = vip10.remoteconfig(applovin51).ad(applovin50).signatures(ad13, applovin49, applovin51);
                AbstractC7861e remoteconfig44 = abstractC7861e40.remoteconfig(applovin51);
                AbstractC7861e applovin52 = remoteconfig44.ad(ad13).applovin();
                boolean subscription5 = applovin52.subscription();
                AbstractC0362e abstractC0362e13 = this.ad;
                if (subscription5) {
                    return signatures13.subscription() ? abstractC9932e.isPro() : abstractC0362e13.smaato();
                }
                if (signatures13.subscription()) {
                    return new C9345e(abstractC0362e13, signatures13, abstractC0362e13.metrica, 12);
                }
                AbstractC7861e remoteconfig45 = signatures13.applovin().remoteconfig(remoteconfig44);
                AbstractC7861e remoteconfig46 = signatures13.remoteconfig(applovin52).remoteconfig(applovin51);
                return new C9345e(abstractC0362e13, remoteconfig45, signatures13.ad(applovin52).applovin().signatures(ad13, vip10, remoteconfig46), new AbstractC7861e[]{remoteconfig46}, 12);
            case 13:
                if (advert()) {
                    return abstractC9932e;
                }
                if (abstractC9932e.advert()) {
                    return isPro();
                }
                if (abstractC7861e2.subscription()) {
                    return abstractC9932e;
                }
                AbstractC7861e abstractC7861e43 = abstractC9932e.vip;
                AbstractC7861e adcel13 = abstractC9932e.adcel();
                if (abstractC7861e43.subscription() || !adcel13.admob()) {
                    return isPro().ad(abstractC9932e);
                }
                AbstractC7861e abstractC7861e44 = abstractC7861eArr[0];
                AbstractC7861e abstractC7861e45 = abstractC9932e.metrica;
                AbstractC7861e applovin53 = abstractC7861e2.applovin();
                AbstractC7861e applovin54 = abstractC7861e.applovin();
                AbstractC7861e applovin55 = abstractC7861e44.applovin();
                AbstractC7861e ad14 = applovin54.ad(abstractC7861e.remoteconfig(abstractC7861e44));
                AbstractC7861e vip11 = abstractC7861e45.vip();
                AbstractC7861e signatures14 = vip11.remoteconfig(applovin55).ad(applovin54).signatures(ad14, applovin53, applovin55);
                AbstractC7861e remoteconfig47 = abstractC7861e43.remoteconfig(applovin55);
                AbstractC7861e applovin56 = remoteconfig47.ad(ad14).applovin();
                boolean subscription6 = applovin56.subscription();
                AbstractC0362e abstractC0362e14 = this.ad;
                if (subscription6) {
                    return signatures14.subscription() ? abstractC9932e.isPro() : abstractC0362e14.smaato();
                }
                if (signatures14.subscription()) {
                    return new C9345e(abstractC0362e14, signatures14, abstractC0362e14.metrica, 13);
                }
                AbstractC7861e remoteconfig48 = signatures14.applovin().remoteconfig(remoteconfig47);
                AbstractC7861e remoteconfig49 = signatures14.remoteconfig(applovin56).remoteconfig(applovin55);
                return new C9345e(abstractC0362e14, remoteconfig48, signatures14.ad(applovin56).applovin().signatures(ad14, vip11, remoteconfig49), new AbstractC7861e[]{remoteconfig49}, 13);
            case 14:
                if (advert()) {
                    return abstractC9932e;
                }
                if (abstractC9932e.advert()) {
                    return isPro();
                }
                if (abstractC7861e2.subscription()) {
                    return abstractC9932e;
                }
                AbstractC7861e abstractC7861e46 = abstractC9932e.vip;
                AbstractC7861e adcel14 = abstractC9932e.adcel();
                if (abstractC7861e46.subscription() || !adcel14.admob()) {
                    return isPro().ad(abstractC9932e);
                }
                AbstractC7861e abstractC7861e47 = abstractC7861eArr[0];
                AbstractC7861e abstractC7861e48 = abstractC9932e.metrica;
                AbstractC7861e applovin57 = abstractC7861e2.applovin();
                AbstractC7861e applovin58 = abstractC7861e.applovin();
                AbstractC7861e applovin59 = abstractC7861e47.applovin();
                AbstractC7861e ad15 = applovin59.ad(applovin58).ad(abstractC7861e.remoteconfig(abstractC7861e47));
                AbstractC7861e signatures15 = abstractC7861e48.remoteconfig(applovin59).ad(applovin58).signatures(ad15, applovin57, applovin59);
                AbstractC7861e remoteconfig50 = abstractC7861e46.remoteconfig(applovin59);
                AbstractC7861e applovin60 = remoteconfig50.ad(ad15).applovin();
                boolean subscription7 = applovin60.subscription();
                AbstractC0362e abstractC0362e15 = this.ad;
                if (subscription7) {
                    return signatures15.subscription() ? abstractC9932e.isPro() : abstractC0362e15.smaato();
                }
                if (signatures15.subscription()) {
                    return new C9345e(abstractC0362e15, signatures15, abstractC0362e15.metrica.isPro(), 14);
                }
                AbstractC7861e remoteconfig51 = signatures15.applovin().remoteconfig(remoteconfig50);
                AbstractC7861e remoteconfig52 = signatures15.remoteconfig(applovin60).remoteconfig(applovin59);
                return new C9345e(abstractC0362e15, remoteconfig51, signatures15.ad(applovin60).applovin().signatures(ad15, abstractC7861e48.vip(), remoteconfig52), new AbstractC7861e[]{remoteconfig52}, 14);
            case 15:
                if (advert()) {
                    return abstractC9932e;
                }
                if (abstractC9932e.advert()) {
                    return isPro();
                }
                if (abstractC7861e2.subscription()) {
                    return abstractC9932e;
                }
                AbstractC7861e abstractC7861e49 = abstractC9932e.vip;
                AbstractC7861e adcel15 = abstractC9932e.adcel();
                if (abstractC7861e49.subscription() || !adcel15.admob()) {
                    return isPro().ad(abstractC9932e);
                }
                AbstractC7861e abstractC7861e50 = abstractC7861eArr[0];
                AbstractC7861e abstractC7861e51 = abstractC9932e.metrica;
                AbstractC7861e applovin61 = abstractC7861e2.applovin();
                AbstractC7861e applovin62 = abstractC7861e.applovin();
                AbstractC7861e applovin63 = abstractC7861e50.applovin();
                AbstractC7861e ad16 = applovin62.ad(abstractC7861e.remoteconfig(abstractC7861e50));
                AbstractC7861e vip12 = abstractC7861e51.vip();
                AbstractC7861e signatures16 = vip12.remoteconfig(applovin63).ad(applovin62).signatures(ad16, applovin61, applovin63);
                AbstractC7861e remoteconfig53 = abstractC7861e49.remoteconfig(applovin63);
                AbstractC7861e applovin64 = remoteconfig53.ad(ad16).applovin();
                boolean subscription8 = applovin64.subscription();
                AbstractC0362e abstractC0362e16 = this.ad;
                if (subscription8) {
                    return signatures16.subscription() ? abstractC9932e.isPro() : abstractC0362e16.smaato();
                }
                if (signatures16.subscription()) {
                    return new C9345e(abstractC0362e16, signatures16, abstractC0362e16.metrica, 15);
                }
                AbstractC7861e remoteconfig54 = signatures16.applovin().remoteconfig(remoteconfig53);
                AbstractC7861e remoteconfig55 = signatures16.remoteconfig(applovin64).remoteconfig(applovin63);
                return new C9345e(abstractC0362e16, remoteconfig54, signatures16.ad(applovin64).applovin().signatures(ad16, vip12, remoteconfig55), new AbstractC7861e[]{remoteconfig55}, 15);
            case 16:
                if (advert()) {
                    return abstractC9932e;
                }
                if (abstractC9932e.advert()) {
                    return isPro();
                }
                if (abstractC7861e2.subscription()) {
                    return abstractC9932e;
                }
                AbstractC7861e abstractC7861e52 = abstractC9932e.vip;
                AbstractC7861e adcel16 = abstractC9932e.adcel();
                if (abstractC7861e52.subscription() || !adcel16.admob()) {
                    return isPro().ad(abstractC9932e);
                }
                AbstractC7861e abstractC7861e53 = abstractC7861eArr[0];
                AbstractC7861e abstractC7861e54 = abstractC9932e.metrica;
                AbstractC7861e applovin65 = abstractC7861e2.applovin();
                AbstractC7861e applovin66 = abstractC7861e.applovin();
                AbstractC7861e applovin67 = abstractC7861e53.applovin();
                AbstractC7861e ad17 = applovin67.ad(applovin66).ad(abstractC7861e.remoteconfig(abstractC7861e53));
                AbstractC7861e signatures17 = abstractC7861e54.remoteconfig(applovin67).ad(applovin66).signatures(ad17, applovin65, applovin67);
                AbstractC7861e remoteconfig56 = abstractC7861e52.remoteconfig(applovin67);
                AbstractC7861e applovin68 = remoteconfig56.ad(ad17).applovin();
                boolean subscription9 = applovin68.subscription();
                AbstractC0362e abstractC0362e17 = this.ad;
                if (subscription9) {
                    return signatures17.subscription() ? abstractC9932e.isPro() : abstractC0362e17.smaato();
                }
                if (signatures17.subscription()) {
                    return new C9345e(abstractC0362e17, signatures17, abstractC0362e17.metrica.isPro(), 16);
                }
                AbstractC7861e remoteconfig57 = signatures17.applovin().remoteconfig(remoteconfig56);
                AbstractC7861e remoteconfig58 = signatures17.remoteconfig(applovin68).remoteconfig(applovin67);
                return new C9345e(abstractC0362e17, remoteconfig57, signatures17.ad(applovin68).applovin().signatures(ad17, abstractC7861e54.vip(), remoteconfig58), new AbstractC7861e[]{remoteconfig58}, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (advert()) {
                    return abstractC9932e;
                }
                if (abstractC9932e.advert()) {
                    return isPro();
                }
                if (abstractC7861e2.subscription()) {
                    return abstractC9932e;
                }
                AbstractC7861e abstractC7861e55 = abstractC9932e.vip;
                AbstractC7861e adcel17 = abstractC9932e.adcel();
                if (abstractC7861e55.subscription() || !adcel17.admob()) {
                    return isPro().ad(abstractC9932e);
                }
                AbstractC7861e abstractC7861e56 = abstractC7861eArr[0];
                AbstractC7861e abstractC7861e57 = abstractC9932e.metrica;
                AbstractC7861e applovin69 = abstractC7861e2.applovin();
                AbstractC7861e applovin70 = abstractC7861e.applovin();
                AbstractC7861e applovin71 = abstractC7861e56.applovin();
                AbstractC7861e ad18 = applovin70.ad(abstractC7861e.remoteconfig(abstractC7861e56));
                AbstractC7861e vip13 = abstractC7861e57.vip();
                AbstractC7861e signatures18 = vip13.remoteconfig(applovin71).ad(applovin70).signatures(ad18, applovin69, applovin71);
                AbstractC7861e remoteconfig59 = abstractC7861e55.remoteconfig(applovin71);
                AbstractC7861e applovin72 = remoteconfig59.ad(ad18).applovin();
                boolean subscription10 = applovin72.subscription();
                AbstractC0362e abstractC0362e18 = this.ad;
                if (subscription10) {
                    return signatures18.subscription() ? abstractC9932e.isPro() : abstractC0362e18.smaato();
                }
                if (signatures18.subscription()) {
                    return new C9345e(abstractC0362e18, signatures18, abstractC0362e18.metrica, 17);
                }
                AbstractC7861e remoteconfig60 = signatures18.applovin().remoteconfig(remoteconfig59);
                AbstractC7861e remoteconfig61 = signatures18.remoteconfig(applovin72).remoteconfig(applovin71);
                return new C9345e(abstractC0362e18, remoteconfig60, signatures18.ad(applovin72).applovin().signatures(ad18, vip13, remoteconfig61), new AbstractC7861e[]{remoteconfig61}, 17);
            default:
                if (advert()) {
                    return abstractC9932e;
                }
                if (abstractC9932e.advert()) {
                    return isPro();
                }
                C6002e c6002e = (C6002e) abstractC7861e2;
                if (AbstractC11538e.license(c6002e.f12654e)) {
                    return abstractC9932e;
                }
                C6002e c6002e2 = (C6002e) abstractC9932e.vip;
                C6002e c6002e3 = (C6002e) abstractC9932e.adcel();
                if (AbstractC11538e.license(c6002e2.f12654e) || !c6002e3.admob()) {
                    return isPro().ad(abstractC9932e);
                }
                C6002e c6002e4 = (C6002e) abstractC7861e;
                C6002e c6002e5 = (C6002e) abstractC7861eArr[0];
                C6002e c6002e6 = (C6002e) abstractC9932e.metrica;
                long[] jArr = new long[9];
                long[] jArr2 = new long[9];
                long[] jArr3 = new long[9];
                long[] jArr4 = new long[9];
                AbstractC17181e.isVip(c6002e.f12654e, jArr);
                AbstractC17181e.isVip(c6002e4.f12654e, jArr2);
                AbstractC17181e.isVip(c6002e5.f12654e, jArr3);
                AbstractC17181e.subscription(c6002e4.f12654e, c6002e5.f12654e, jArr4);
                AbstractC17181e.mopub(jArr3, jArr2, jArr4);
                long[] signatures19 = AbstractC17181e.signatures(jArr3);
                AbstractC17181e.pro(c6002e6.f12654e, signatures19, jArr3);
                AbstractC17181e.startapp(jArr3, jArr2, jArr3);
                int i7 = 18;
                long[] jArr5 = new long[18];
                AbstractC17181e.remoteconfig(jArr3, jArr4, jArr5);
                long[] jArr6 = new long[18];
                AbstractC17181e.amazon(jArr, signatures19, jArr6);
                AbstractC17181e.advert(jArr5, jArr6, jArr5);
                AbstractC17181e.tapsense(jArr5, jArr3);
                AbstractC17181e.pro(c6002e2.f12654e, signatures19, jArr);
                AbstractC17181e.startapp(jArr, jArr4, jArr2);
                AbstractC17181e.isVip(jArr2, jArr2);
                boolean license = AbstractC11538e.license(jArr2);
                AbstractC0362e abstractC0362e19 = this.ad;
                if (license) {
                    return AbstractC11538e.license(jArr3) ? abstractC9932e.isPro() : abstractC0362e19.smaato();
                }
                if (AbstractC11538e.license(jArr3)) {
                    return new C9345e(abstractC0362e19, new C6002e(jArr3), C10391e.smaato, i7);
                }
                ?? abstractC7861e58 = new AbstractC7861e(i3);
                long[] jArr7 = new long[9];
                abstractC7861e58.f12654e = jArr7;
                AbstractC17181e.isVip(jArr3, jArr7);
                AbstractC17181e.subscription(jArr7, jArr, jArr7);
                C6002e c6002e7 = new C6002e(jArr);
                AbstractC17181e.subscription(jArr3, jArr2, jArr);
                AbstractC17181e.pro(jArr, signatures19, jArr);
                C6002e c6002e8 = new C6002e(jArr2);
                AbstractC17181e.startapp(jArr3, jArr2, jArr2);
                AbstractC17181e.isVip(jArr2, jArr2);
                for (int i8 = 0; i8 < 18; i8++) {
                    jArr5[i8] = 0;
                }
                AbstractC17181e.remoteconfig(c6002e8.f12654e, jArr4, jArr5);
                long[] jArr8 = c6002e6.f12654e;
                jArr4[0] = jArr8[0] ^ 1;
                for (int i9 = 1; i9 < 9; i9++) {
                    jArr4[i9] = jArr8[i9];
                }
                AbstractC17181e.remoteconfig(jArr4, c6002e7.f12654e, jArr5);
                AbstractC17181e.tapsense(jArr5, c6002e8.f12654e);
                return new C9345e(abstractC0362e19, abstractC7861e58, c6002e8, new AbstractC7861e[]{c6002e7}, 18);
        }
    }

    /* renamed from: class, reason: not valid java name */
    public final C9345e m2543class(int i) {
        AbstractC9932e appmetrica;
        if (advert()) {
            return this;
        }
        AbstractC0362e abstractC0362e = this.ad;
        int i2 = abstractC0362e.purchase;
        AbstractC7861e abstractC7861e = this.metrica;
        AbstractC7861e abstractC7861e2 = this.vip;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 5) {
                    if (i2 != 6) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                }
            }
            appmetrica = abstractC0362e.purchase(abstractC7861e2.premium(i), abstractC7861e.premium(i), new AbstractC7861e[]{this.license[0].premium(i)});
            return (C9345e) appmetrica;
        }
        appmetrica = abstractC0362e.appmetrica(abstractC7861e2.premium(i), abstractC7861e.premium(i));
        return (C9345e) appmetrica;
    }

    @Override // defpackage.AbstractC9932e
    public final AbstractC9932e isPro() {
        C9345e c9345e;
        AbstractC7861e ad;
        int i = this.billing;
        int i2 = 6;
        int i3 = 9;
        AbstractC7861e[] abstractC7861eArr = this.license;
        AbstractC7861e abstractC7861e = this.metrica;
        AbstractC7861e abstractC7861e2 = this.vip;
        int i4 = 1;
        int i5 = 0;
        switch (i) {
            case 0:
                if (advert()) {
                    return this;
                }
                boolean subscription = abstractC7861e2.subscription();
                AbstractC0362e abstractC0362e = this.ad;
                if (subscription) {
                    return abstractC0362e.smaato();
                }
                int i6 = abstractC0362e.purchase;
                if (i6 == 0) {
                    AbstractC7861e ad2 = abstractC7861e.yandex(abstractC7861e2).ad(abstractC7861e2);
                    AbstractC7861e ad3 = ad2.applovin().ad(ad2).ad(abstractC0362e.vip);
                    return new C9345e(abstractC0362e, ad3, abstractC7861e2.ads(ad3, ad2.vip()), i5);
                }
                if (i6 == 1) {
                    AbstractC7861e abstractC7861e3 = abstractC7861eArr[0];
                    boolean admob = abstractC7861e3.admob();
                    AbstractC7861e remoteconfig = admob ? abstractC7861e2 : abstractC7861e2.remoteconfig(abstractC7861e3);
                    if (!admob) {
                        abstractC7861e = abstractC7861e.remoteconfig(abstractC7861e3);
                    }
                    AbstractC7861e applovin = abstractC7861e2.applovin();
                    AbstractC7861e ad4 = applovin.ad(abstractC7861e);
                    AbstractC7861e applovin2 = remoteconfig.applovin();
                    AbstractC7861e ad5 = ad4.ad(remoteconfig);
                    AbstractC7861e signatures = ad5.signatures(ad4, applovin2, abstractC0362e.vip);
                    c9345e = new C9345e(abstractC0362e, remoteconfig.remoteconfig(signatures), applovin.applovin().signatures(remoteconfig, signatures, ad5), new AbstractC7861e[]{remoteconfig.remoteconfig(applovin2)}, 0);
                } else {
                    if (i6 != 6) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    AbstractC7861e abstractC7861e4 = abstractC7861eArr[0];
                    boolean admob2 = abstractC7861e4.admob();
                    AbstractC7861e remoteconfig2 = admob2 ? abstractC7861e : abstractC7861e.remoteconfig(abstractC7861e4);
                    AbstractC7861e applovin3 = admob2 ? abstractC7861e4 : abstractC7861e4.applovin();
                    AbstractC7861e abstractC7861e5 = abstractC0362e.vip;
                    AbstractC7861e remoteconfig3 = admob2 ? abstractC7861e5 : abstractC7861e5.remoteconfig(applovin3);
                    AbstractC7861e crashlytics = AbstractC4653e.crashlytics(abstractC7861e, remoteconfig2, remoteconfig3);
                    if (crashlytics.subscription()) {
                        return new C9345e(abstractC0362e, crashlytics, abstractC0362e.metrica.isPro(), i5);
                    }
                    AbstractC7861e applovin4 = crashlytics.applovin();
                    AbstractC7861e remoteconfig4 = admob2 ? crashlytics : crashlytics.remoteconfig(applovin3);
                    AbstractC7861e abstractC7861e6 = abstractC0362e.metrica;
                    if (abstractC7861e6.metrica() < (abstractC0362e.advert() >> 1)) {
                        AbstractC7861e applovin5 = abstractC7861e.ad(abstractC7861e2).applovin();
                        ad = applovin5.ad(crashlytics).ad(applovin3).remoteconfig(applovin5).ad(abstractC7861e6.admob() ? remoteconfig3.ad(applovin3).applovin() : remoteconfig3.ads(abstractC7861e6, applovin3.applovin())).ad(applovin4);
                        if (!abstractC7861e5.subscription()) {
                            if (!abstractC7861e5.admob()) {
                                ad = ad.ad(abstractC7861e5.vip().remoteconfig(remoteconfig4));
                            }
                            c9345e = new C9345e(abstractC0362e, applovin4, ad, new AbstractC7861e[]{remoteconfig4}, 0);
                        }
                    } else {
                        if (!admob2) {
                            abstractC7861e2 = abstractC7861e2.remoteconfig(abstractC7861e4);
                        }
                        ad = abstractC7861e2.ads(crashlytics, remoteconfig2).ad(applovin4);
                    }
                    ad = ad.ad(remoteconfig4);
                    c9345e = new C9345e(abstractC0362e, applovin4, ad, new AbstractC7861e[]{remoteconfig4}, 0);
                }
                return c9345e;
            case 1:
                if (advert()) {
                    return this;
                }
                boolean subscription2 = abstractC7861e2.subscription();
                AbstractC0362e abstractC0362e2 = this.ad;
                if (subscription2) {
                    return abstractC0362e2.smaato();
                }
                AbstractC7861e abstractC7861e7 = abstractC7861eArr[0];
                boolean admob3 = abstractC7861e7.admob();
                AbstractC7861e remoteconfig5 = admob3 ? abstractC7861e : abstractC7861e.remoteconfig(abstractC7861e7);
                AbstractC7861e applovin6 = admob3 ? abstractC7861e7 : abstractC7861e7.applovin();
                AbstractC7861e abstractC7861e8 = abstractC0362e2.vip;
                if (!admob3) {
                    abstractC7861e8 = abstractC7861e8.remoteconfig(applovin6);
                }
                AbstractC7861e crashlytics2 = AbstractC4653e.crashlytics(abstractC7861e, remoteconfig5, abstractC7861e8);
                if (crashlytics2.subscription()) {
                    return new C9345e(abstractC0362e2, crashlytics2, abstractC0362e2.metrica.isPro(), i4);
                }
                AbstractC7861e applovin7 = crashlytics2.applovin();
                AbstractC7861e remoteconfig6 = admob3 ? crashlytics2 : crashlytics2.remoteconfig(applovin6);
                if (!admob3) {
                    abstractC7861e2 = abstractC7861e2.remoteconfig(abstractC7861e7);
                }
                return new C9345e(abstractC0362e2, applovin7, abstractC7861e2.ads(crashlytics2, remoteconfig5).ad(applovin7).ad(remoteconfig6), new AbstractC7861e[]{remoteconfig6}, 1);
            case 2:
                if (advert()) {
                    return this;
                }
                boolean subscription3 = abstractC7861e2.subscription();
                AbstractC0362e abstractC0362e3 = this.ad;
                if (subscription3) {
                    return abstractC0362e3.smaato();
                }
                AbstractC7861e abstractC7861e9 = abstractC7861eArr[0];
                boolean admob4 = abstractC7861e9.admob();
                AbstractC7861e remoteconfig7 = admob4 ? abstractC7861e : abstractC7861e.remoteconfig(abstractC7861e9);
                AbstractC7861e applovin8 = admob4 ? abstractC7861e9 : abstractC7861e9.applovin();
                AbstractC7861e abstractC7861e10 = abstractC0362e3.vip;
                if (!admob4) {
                    abstractC7861e10 = abstractC7861e10.remoteconfig(applovin8);
                }
                AbstractC7861e crashlytics3 = AbstractC4653e.crashlytics(abstractC7861e, remoteconfig7, abstractC7861e10);
                if (crashlytics3.subscription()) {
                    return new C9345e(abstractC0362e3, crashlytics3, abstractC0362e3.metrica.isPro(), 2);
                }
                AbstractC7861e applovin9 = crashlytics3.applovin();
                AbstractC7861e remoteconfig8 = admob4 ? crashlytics3 : crashlytics3.remoteconfig(applovin8);
                if (!admob4) {
                    abstractC7861e2 = abstractC7861e2.remoteconfig(abstractC7861e9);
                }
                return new C9345e(abstractC0362e3, applovin9, abstractC7861e2.ads(crashlytics3, remoteconfig7).ad(applovin9).ad(remoteconfig8), new AbstractC7861e[]{remoteconfig8}, 2);
            case 3:
                if (advert()) {
                    return this;
                }
                boolean subscription4 = abstractC7861e2.subscription();
                AbstractC0362e abstractC0362e4 = this.ad;
                if (subscription4) {
                    return abstractC0362e4.smaato();
                }
                AbstractC7861e abstractC7861e11 = abstractC7861eArr[0];
                boolean admob5 = abstractC7861e11.admob();
                AbstractC7861e remoteconfig9 = admob5 ? abstractC7861e : abstractC7861e.remoteconfig(abstractC7861e11);
                AbstractC7861e applovin10 = admob5 ? abstractC7861e11 : abstractC7861e11.applovin();
                AbstractC7861e abstractC7861e12 = abstractC0362e4.vip;
                if (!admob5) {
                    abstractC7861e12 = abstractC7861e12.remoteconfig(applovin10);
                }
                AbstractC7861e crashlytics4 = AbstractC4653e.crashlytics(abstractC7861e, remoteconfig9, abstractC7861e12);
                if (crashlytics4.subscription()) {
                    return new C9345e(abstractC0362e4, crashlytics4, abstractC0362e4.metrica.isPro(), 3);
                }
                AbstractC7861e applovin11 = crashlytics4.applovin();
                AbstractC7861e remoteconfig10 = admob5 ? crashlytics4 : crashlytics4.remoteconfig(applovin10);
                if (!admob5) {
                    abstractC7861e2 = abstractC7861e2.remoteconfig(abstractC7861e11);
                }
                return new C9345e(abstractC0362e4, applovin11, abstractC7861e2.ads(crashlytics4, remoteconfig9).ad(applovin11).ad(remoteconfig10), new AbstractC7861e[]{remoteconfig10}, 3);
            case 4:
                if (advert()) {
                    return this;
                }
                boolean subscription5 = abstractC7861e2.subscription();
                AbstractC0362e abstractC0362e5 = this.ad;
                if (subscription5) {
                    return abstractC0362e5.smaato();
                }
                AbstractC7861e abstractC7861e13 = abstractC7861eArr[0];
                boolean admob6 = abstractC7861e13.admob();
                AbstractC7861e remoteconfig11 = admob6 ? abstractC7861e : abstractC7861e.remoteconfig(abstractC7861e13);
                AbstractC7861e applovin12 = admob6 ? abstractC7861e13 : abstractC7861e13.applovin();
                AbstractC7861e abstractC7861e14 = abstractC0362e5.vip;
                if (!admob6) {
                    abstractC7861e14 = abstractC7861e14.remoteconfig(applovin12);
                }
                AbstractC7861e crashlytics5 = AbstractC4653e.crashlytics(abstractC7861e, remoteconfig11, abstractC7861e14);
                if (crashlytics5.subscription()) {
                    return new C9345e(abstractC0362e5, crashlytics5, abstractC0362e5.metrica.isPro(), 4);
                }
                AbstractC7861e applovin13 = crashlytics5.applovin();
                AbstractC7861e remoteconfig12 = admob6 ? crashlytics5 : crashlytics5.remoteconfig(applovin12);
                if (!admob6) {
                    abstractC7861e2 = abstractC7861e2.remoteconfig(abstractC7861e13);
                }
                return new C9345e(abstractC0362e5, applovin13, abstractC7861e2.ads(crashlytics5, remoteconfig11).ad(applovin13).ad(remoteconfig12), new AbstractC7861e[]{remoteconfig12}, 4);
            case 5:
                if (advert()) {
                    return this;
                }
                boolean subscription6 = abstractC7861e2.subscription();
                AbstractC0362e abstractC0362e6 = this.ad;
                if (subscription6) {
                    return abstractC0362e6.smaato();
                }
                AbstractC7861e abstractC7861e15 = abstractC7861eArr[0];
                boolean admob7 = abstractC7861e15.admob();
                AbstractC7861e remoteconfig13 = admob7 ? abstractC7861e : abstractC7861e.remoteconfig(abstractC7861e15);
                if (!admob7) {
                    abstractC7861e15 = abstractC7861e15.applovin();
                }
                AbstractC7861e crashlytics6 = AbstractC4653e.crashlytics(abstractC7861e, remoteconfig13, abstractC7861e15);
                if (crashlytics6.subscription()) {
                    return new C9345e(abstractC0362e6, crashlytics6, abstractC0362e6.metrica, 5);
                }
                AbstractC7861e applovin14 = crashlytics6.applovin();
                AbstractC7861e remoteconfig14 = admob7 ? crashlytics6 : crashlytics6.remoteconfig(abstractC7861e15);
                AbstractC7861e applovin15 = abstractC7861e.ad(abstractC7861e2).applovin();
                return new C9345e(abstractC0362e6, applovin14, applovin15.ad(crashlytics6).ad(abstractC7861e15).remoteconfig(applovin15).ad(applovin14), new AbstractC7861e[]{remoteconfig14}, 5);
            case 6:
                if (advert()) {
                    return this;
                }
                boolean subscription7 = abstractC7861e2.subscription();
                AbstractC0362e abstractC0362e7 = this.ad;
                if (subscription7) {
                    return abstractC0362e7.smaato();
                }
                AbstractC7861e abstractC7861e16 = abstractC7861eArr[0];
                boolean admob8 = abstractC7861e16.admob();
                AbstractC7861e remoteconfig15 = admob8 ? abstractC7861e : abstractC7861e.remoteconfig(abstractC7861e16);
                AbstractC7861e applovin16 = admob8 ? abstractC7861e16 : abstractC7861e16.applovin();
                AbstractC7861e abstractC7861e17 = abstractC0362e7.vip;
                if (!admob8) {
                    abstractC7861e17 = abstractC7861e17.remoteconfig(applovin16);
                }
                AbstractC7861e crashlytics7 = AbstractC4653e.crashlytics(abstractC7861e, remoteconfig15, abstractC7861e17);
                if (crashlytics7.subscription()) {
                    return new C9345e(abstractC0362e7, crashlytics7, abstractC0362e7.metrica.isPro(), i2);
                }
                AbstractC7861e applovin17 = crashlytics7.applovin();
                AbstractC7861e remoteconfig16 = admob8 ? crashlytics7 : crashlytics7.remoteconfig(applovin16);
                if (!admob8) {
                    abstractC7861e2 = abstractC7861e2.remoteconfig(abstractC7861e16);
                }
                return new C9345e(abstractC0362e7, applovin17, abstractC7861e2.ads(crashlytics7, remoteconfig15).ad(applovin17).ad(remoteconfig16), new AbstractC7861e[]{remoteconfig16}, 6);
            case 7:
                if (advert()) {
                    return this;
                }
                boolean subscription8 = abstractC7861e2.subscription();
                AbstractC0362e abstractC0362e8 = this.ad;
                if (subscription8) {
                    return abstractC0362e8.smaato();
                }
                AbstractC7861e abstractC7861e18 = abstractC7861eArr[0];
                boolean admob9 = abstractC7861e18.admob();
                AbstractC7861e remoteconfig17 = admob9 ? abstractC7861e : abstractC7861e.remoteconfig(abstractC7861e18);
                AbstractC7861e applovin18 = admob9 ? abstractC7861e18 : abstractC7861e18.applovin();
                AbstractC7861e crashlytics8 = AbstractC4653e.crashlytics(abstractC7861e, remoteconfig17, applovin18);
                if (crashlytics8.subscription()) {
                    return new C9345e(abstractC0362e8, crashlytics8, abstractC0362e8.metrica.isPro(), 7);
                }
                AbstractC7861e applovin19 = crashlytics8.applovin();
                AbstractC7861e remoteconfig18 = admob9 ? crashlytics8 : crashlytics8.remoteconfig(applovin18);
                if (!admob9) {
                    abstractC7861e2 = abstractC7861e2.remoteconfig(abstractC7861e18);
                }
                return new C9345e(abstractC0362e8, applovin19, abstractC7861e2.ads(crashlytics8, remoteconfig17).ad(applovin19).ad(remoteconfig18), new AbstractC7861e[]{remoteconfig18}, 7);
            case 8:
                if (advert()) {
                    return this;
                }
                boolean subscription9 = abstractC7861e2.subscription();
                AbstractC0362e abstractC0362e9 = this.ad;
                if (subscription9) {
                    return abstractC0362e9.smaato();
                }
                AbstractC7861e abstractC7861e19 = abstractC7861eArr[0];
                boolean admob10 = abstractC7861e19.admob();
                AbstractC7861e remoteconfig19 = admob10 ? abstractC7861e : abstractC7861e.remoteconfig(abstractC7861e19);
                AbstractC7861e applovin20 = admob10 ? abstractC7861e19 : abstractC7861e19.applovin();
                AbstractC7861e abstractC7861e20 = abstractC0362e9.vip;
                if (!admob10) {
                    abstractC7861e20 = abstractC7861e20.remoteconfig(applovin20);
                }
                AbstractC7861e crashlytics9 = AbstractC4653e.crashlytics(abstractC7861e, remoteconfig19, abstractC7861e20);
                if (crashlytics9.subscription()) {
                    return new C9345e(abstractC0362e9, crashlytics9, abstractC0362e9.metrica.isPro(), 8);
                }
                AbstractC7861e applovin21 = crashlytics9.applovin();
                AbstractC7861e remoteconfig20 = admob10 ? crashlytics9 : crashlytics9.remoteconfig(applovin20);
                if (!admob10) {
                    abstractC7861e2 = abstractC7861e2.remoteconfig(abstractC7861e19);
                }
                return new C9345e(abstractC0362e9, applovin21, abstractC7861e2.ads(crashlytics9, remoteconfig19).ad(applovin21).ad(remoteconfig20), new AbstractC7861e[]{remoteconfig20}, 8);
            case 9:
                if (advert()) {
                    return this;
                }
                boolean subscription10 = abstractC7861e2.subscription();
                AbstractC0362e abstractC0362e10 = this.ad;
                if (subscription10) {
                    return abstractC0362e10.smaato();
                }
                AbstractC7861e abstractC7861e21 = abstractC7861eArr[0];
                boolean admob11 = abstractC7861e21.admob();
                AbstractC7861e remoteconfig21 = admob11 ? abstractC7861e : abstractC7861e.remoteconfig(abstractC7861e21);
                AbstractC7861e applovin22 = admob11 ? abstractC7861e21 : abstractC7861e21.applovin();
                AbstractC7861e abstractC7861e22 = abstractC0362e10.vip;
                if (!admob11) {
                    abstractC7861e22 = abstractC7861e22.remoteconfig(applovin22);
                }
                AbstractC7861e crashlytics10 = AbstractC4653e.crashlytics(abstractC7861e, remoteconfig21, abstractC7861e22);
                if (crashlytics10.subscription()) {
                    return new C9345e(abstractC0362e10, crashlytics10, abstractC0362e10.metrica.isPro(), i3);
                }
                AbstractC7861e applovin23 = crashlytics10.applovin();
                AbstractC7861e remoteconfig22 = admob11 ? crashlytics10 : crashlytics10.remoteconfig(applovin22);
                if (!admob11) {
                    abstractC7861e2 = abstractC7861e2.remoteconfig(abstractC7861e21);
                }
                return new C9345e(abstractC0362e10, applovin23, abstractC7861e2.ads(crashlytics10, remoteconfig21).ad(applovin23).ad(remoteconfig22), new AbstractC7861e[]{remoteconfig22}, 9);
            case 10:
                if (advert()) {
                    return this;
                }
                boolean subscription11 = abstractC7861e2.subscription();
                AbstractC0362e abstractC0362e11 = this.ad;
                if (subscription11) {
                    return abstractC0362e11.smaato();
                }
                AbstractC7861e abstractC7861e23 = abstractC7861eArr[0];
                boolean admob12 = abstractC7861e23.admob();
                AbstractC7861e applovin24 = admob12 ? abstractC7861e23 : abstractC7861e23.applovin();
                AbstractC7861e ad6 = admob12 ? abstractC7861e.applovin().ad(abstractC7861e) : abstractC7861e.ad(abstractC7861e23).remoteconfig(abstractC7861e);
                if (ad6.subscription()) {
                    return new C9345e(abstractC0362e11, ad6, abstractC0362e11.metrica, 10);
                }
                AbstractC7861e applovin25 = ad6.applovin();
                AbstractC7861e remoteconfig23 = admob12 ? ad6 : ad6.remoteconfig(applovin24);
                AbstractC7861e applovin26 = abstractC7861e.ad(abstractC7861e2).applovin();
                if (!admob12) {
                    abstractC7861e23 = applovin24.applovin();
                }
                return new C9345e(abstractC0362e11, applovin25, applovin26.ad(ad6).ad(applovin24).remoteconfig(applovin26).ad(abstractC7861e23).ad(applovin25).ad(remoteconfig23), new AbstractC7861e[]{remoteconfig23}, 10);
            case 11:
                if (advert()) {
                    return this;
                }
                boolean subscription12 = abstractC7861e2.subscription();
                AbstractC0362e abstractC0362e12 = this.ad;
                if (subscription12) {
                    return abstractC0362e12.smaato();
                }
                AbstractC7861e abstractC7861e24 = abstractC7861eArr[0];
                boolean admob13 = abstractC7861e24.admob();
                AbstractC7861e remoteconfig24 = admob13 ? abstractC7861e : abstractC7861e.remoteconfig(abstractC7861e24);
                AbstractC7861e applovin27 = admob13 ? abstractC7861e24 : abstractC7861e24.applovin();
                AbstractC7861e crashlytics11 = AbstractC4653e.crashlytics(abstractC7861e, remoteconfig24, applovin27);
                if (crashlytics11.subscription()) {
                    return new C9345e(abstractC0362e12, crashlytics11, abstractC0362e12.metrica.isPro(), 11);
                }
                AbstractC7861e applovin28 = crashlytics11.applovin();
                AbstractC7861e remoteconfig25 = admob13 ? crashlytics11 : crashlytics11.remoteconfig(applovin27);
                if (!admob13) {
                    abstractC7861e2 = abstractC7861e2.remoteconfig(abstractC7861e24);
                }
                return new C9345e(abstractC0362e12, applovin28, abstractC7861e2.ads(crashlytics11, remoteconfig24).ad(applovin28).ad(remoteconfig25), new AbstractC7861e[]{remoteconfig25}, 11);
            case 12:
                if (advert()) {
                    return this;
                }
                boolean subscription13 = abstractC7861e2.subscription();
                AbstractC0362e abstractC0362e13 = this.ad;
                if (subscription13) {
                    return abstractC0362e13.smaato();
                }
                AbstractC7861e abstractC7861e25 = abstractC7861eArr[0];
                boolean admob14 = abstractC7861e25.admob();
                AbstractC7861e applovin29 = admob14 ? abstractC7861e25 : abstractC7861e25.applovin();
                AbstractC7861e ad7 = admob14 ? abstractC7861e.applovin().ad(abstractC7861e) : abstractC7861e.ad(abstractC7861e25).remoteconfig(abstractC7861e);
                if (ad7.subscription()) {
                    return new C9345e(abstractC0362e13, ad7, abstractC0362e13.metrica, 12);
                }
                AbstractC7861e applovin30 = ad7.applovin();
                AbstractC7861e remoteconfig26 = admob14 ? ad7 : ad7.remoteconfig(applovin29);
                AbstractC7861e applovin31 = abstractC7861e.ad(abstractC7861e2).applovin();
                if (!admob14) {
                    abstractC7861e25 = applovin29.applovin();
                }
                return new C9345e(abstractC0362e13, applovin30, applovin31.ad(ad7).ad(applovin29).remoteconfig(applovin31).ad(abstractC7861e25).ad(applovin30).ad(remoteconfig26), new AbstractC7861e[]{remoteconfig26}, 12);
            case 13:
                if (advert()) {
                    return this;
                }
                boolean subscription14 = abstractC7861e2.subscription();
                AbstractC0362e abstractC0362e14 = this.ad;
                if (subscription14) {
                    return abstractC0362e14.smaato();
                }
                AbstractC7861e abstractC7861e26 = abstractC7861eArr[0];
                boolean admob15 = abstractC7861e26.admob();
                AbstractC7861e applovin32 = admob15 ? abstractC7861e26 : abstractC7861e26.applovin();
                AbstractC7861e ad8 = admob15 ? abstractC7861e.applovin().ad(abstractC7861e) : abstractC7861e.ad(abstractC7861e26).remoteconfig(abstractC7861e);
                if (ad8.subscription()) {
                    return new C9345e(abstractC0362e14, ad8, abstractC0362e14.metrica, 13);
                }
                AbstractC7861e applovin33 = ad8.applovin();
                AbstractC7861e remoteconfig27 = admob15 ? ad8 : ad8.remoteconfig(applovin32);
                AbstractC7861e applovin34 = abstractC7861e.ad(abstractC7861e2).applovin();
                if (!admob15) {
                    abstractC7861e26 = applovin32.applovin();
                }
                return new C9345e(abstractC0362e14, applovin33, applovin34.ad(ad8).ad(applovin32).remoteconfig(applovin34).ad(abstractC7861e26).ad(applovin33).ad(remoteconfig27), new AbstractC7861e[]{remoteconfig27}, 13);
            case 14:
                if (advert()) {
                    return this;
                }
                boolean subscription15 = abstractC7861e2.subscription();
                AbstractC0362e abstractC0362e15 = this.ad;
                if (subscription15) {
                    return abstractC0362e15.smaato();
                }
                AbstractC7861e abstractC7861e27 = abstractC7861eArr[0];
                boolean admob16 = abstractC7861e27.admob();
                AbstractC7861e remoteconfig28 = admob16 ? abstractC7861e : abstractC7861e.remoteconfig(abstractC7861e27);
                AbstractC7861e applovin35 = admob16 ? abstractC7861e27 : abstractC7861e27.applovin();
                AbstractC7861e crashlytics12 = AbstractC4653e.crashlytics(abstractC7861e, remoteconfig28, applovin35);
                if (crashlytics12.subscription()) {
                    return new C9345e(abstractC0362e15, crashlytics12, abstractC0362e15.metrica.isPro(), 14);
                }
                AbstractC7861e applovin36 = crashlytics12.applovin();
                AbstractC7861e remoteconfig29 = admob16 ? crashlytics12 : crashlytics12.remoteconfig(applovin35);
                if (!admob16) {
                    abstractC7861e2 = abstractC7861e2.remoteconfig(abstractC7861e27);
                }
                return new C9345e(abstractC0362e15, applovin36, abstractC7861e2.ads(crashlytics12, remoteconfig28).ad(applovin36).ad(remoteconfig29), new AbstractC7861e[]{remoteconfig29}, 14);
            case 15:
                if (advert()) {
                    return this;
                }
                boolean subscription16 = abstractC7861e2.subscription();
                AbstractC0362e abstractC0362e16 = this.ad;
                if (subscription16) {
                    return abstractC0362e16.smaato();
                }
                AbstractC7861e abstractC7861e28 = abstractC7861eArr[0];
                boolean admob17 = abstractC7861e28.admob();
                AbstractC7861e applovin37 = admob17 ? abstractC7861e28 : abstractC7861e28.applovin();
                AbstractC7861e ad9 = admob17 ? abstractC7861e.applovin().ad(abstractC7861e) : abstractC7861e.ad(abstractC7861e28).remoteconfig(abstractC7861e);
                if (ad9.subscription()) {
                    return new C9345e(abstractC0362e16, ad9, abstractC0362e16.metrica, 15);
                }
                AbstractC7861e applovin38 = ad9.applovin();
                AbstractC7861e remoteconfig30 = admob17 ? ad9 : ad9.remoteconfig(applovin37);
                AbstractC7861e applovin39 = abstractC7861e.ad(abstractC7861e2).applovin();
                if (!admob17) {
                    abstractC7861e28 = applovin37.applovin();
                }
                return new C9345e(abstractC0362e16, applovin38, applovin39.ad(ad9).ad(applovin37).remoteconfig(applovin39).ad(abstractC7861e28).ad(applovin38).ad(remoteconfig30), new AbstractC7861e[]{remoteconfig30}, 15);
            case 16:
                if (advert()) {
                    return this;
                }
                boolean subscription17 = abstractC7861e2.subscription();
                AbstractC0362e abstractC0362e17 = this.ad;
                if (subscription17) {
                    return abstractC0362e17.smaato();
                }
                AbstractC7861e abstractC7861e29 = abstractC7861eArr[0];
                boolean admob18 = abstractC7861e29.admob();
                AbstractC7861e remoteconfig31 = admob18 ? abstractC7861e : abstractC7861e.remoteconfig(abstractC7861e29);
                AbstractC7861e applovin40 = admob18 ? abstractC7861e29 : abstractC7861e29.applovin();
                AbstractC7861e crashlytics13 = AbstractC4653e.crashlytics(abstractC7861e, remoteconfig31, applovin40);
                if (crashlytics13.subscription()) {
                    return new C9345e(abstractC0362e17, crashlytics13, abstractC0362e17.metrica.isPro(), 16);
                }
                AbstractC7861e applovin41 = crashlytics13.applovin();
                AbstractC7861e remoteconfig32 = admob18 ? crashlytics13 : crashlytics13.remoteconfig(applovin40);
                if (!admob18) {
                    abstractC7861e2 = abstractC7861e2.remoteconfig(abstractC7861e29);
                }
                return new C9345e(abstractC0362e17, applovin41, abstractC7861e2.ads(crashlytics13, remoteconfig31).ad(applovin41).ad(remoteconfig32), new AbstractC7861e[]{remoteconfig32}, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (advert()) {
                    return this;
                }
                boolean subscription18 = abstractC7861e2.subscription();
                AbstractC0362e abstractC0362e18 = this.ad;
                if (subscription18) {
                    return abstractC0362e18.smaato();
                }
                AbstractC7861e abstractC7861e30 = abstractC7861eArr[0];
                boolean admob19 = abstractC7861e30.admob();
                AbstractC7861e applovin42 = admob19 ? abstractC7861e30 : abstractC7861e30.applovin();
                AbstractC7861e ad10 = admob19 ? abstractC7861e.applovin().ad(abstractC7861e) : abstractC7861e.ad(abstractC7861e30).remoteconfig(abstractC7861e);
                if (ad10.subscription()) {
                    return new C9345e(abstractC0362e18, ad10, abstractC0362e18.metrica, 17);
                }
                AbstractC7861e applovin43 = ad10.applovin();
                AbstractC7861e remoteconfig33 = admob19 ? ad10 : ad10.remoteconfig(applovin42);
                AbstractC7861e applovin44 = abstractC7861e.ad(abstractC7861e2).applovin();
                if (!admob19) {
                    abstractC7861e30 = applovin42.applovin();
                }
                return new C9345e(abstractC0362e18, applovin43, applovin44.ad(ad10).ad(applovin42).remoteconfig(applovin44).ad(abstractC7861e30).ad(applovin43).ad(remoteconfig33), new AbstractC7861e[]{remoteconfig33}, 17);
            default:
                if (advert()) {
                    return this;
                }
                long[] jArr = ((C6002e) abstractC7861e2).f12654e;
                boolean license = AbstractC11538e.license(jArr);
                AbstractC0362e abstractC0362e19 = this.ad;
                if (license) {
                    return abstractC0362e19.smaato();
                }
                C6002e c6002e = (C6002e) abstractC7861e;
                C6002e c6002e2 = (C6002e) abstractC7861eArr[0];
                long[] jArr2 = new long[9];
                long[] jArr3 = new long[9];
                boolean admob20 = c6002e2.admob();
                long[] jArr4 = c6002e2.f12654e;
                long[] signatures2 = admob20 ? null : AbstractC17181e.signatures(jArr4);
                long[] jArr5 = c6002e.f12654e;
                if (signatures2 != null) {
                    AbstractC17181e.pro(jArr5, signatures2, jArr2);
                    AbstractC17181e.isVip(jArr4, jArr3);
                    jArr5 = jArr2;
                    jArr4 = jArr3;
                }
                long[] jArr6 = new long[9];
                AbstractC17181e.isVip(c6002e.f12654e, jArr6);
                AbstractC17181e.mopub(jArr5, jArr4, jArr6);
                int i7 = 18;
                if (AbstractC11538e.license(jArr6)) {
                    return new C9345e(abstractC0362e19, new C6002e(jArr6), C10391e.smaato, i7);
                }
                long[] jArr7 = new long[18];
                AbstractC17181e.remoteconfig(jArr6, jArr5, jArr7);
                C6002e c6002e3 = new C6002e(jArr2);
                AbstractC17181e.isVip(jArr6, jArr2);
                C6002e c6002e4 = new C6002e(jArr6);
                if (signatures2 != null) {
                    AbstractC17181e.subscription(jArr6, jArr4, jArr6);
                }
                if (signatures2 != null) {
                    AbstractC17181e.pro(jArr, signatures2, jArr3);
                    jArr = jArr3;
                }
                long[] jArr8 = new long[18];
                AbstractC17181e.Signature(jArr, jArr8);
                AbstractC17181e.advert(jArr7, jArr8, jArr7);
                AbstractC17181e.tapsense(jArr7, jArr3);
                AbstractC17181e.mopub(jArr2, jArr6, jArr3);
                return new C9345e(abstractC0362e19, c6002e3, new C6002e(jArr3), new AbstractC7861e[]{c6002e4}, 18);
        }
    }

    @Override // defpackage.AbstractC9932e
    public final AbstractC9932e loadAd() {
        int i = this.billing;
        AbstractC7861e[] abstractC7861eArr = this.license;
        AbstractC7861e abstractC7861e = this.metrica;
        int i2 = 0;
        switch (i) {
            case 0:
                if (!advert()) {
                    AbstractC7861e abstractC7861e2 = this.vip;
                    if (!abstractC7861e2.subscription()) {
                        int billing = billing();
                        AbstractC0362e abstractC0362e = this.ad;
                        if (billing == 0) {
                            return new C9345e(abstractC0362e, abstractC7861e2, abstractC7861e.ad(abstractC7861e2), i2);
                        }
                        if (billing == 1) {
                            return new C9345e(abstractC0362e, abstractC7861e2, abstractC7861e.ad(abstractC7861e2), new AbstractC7861e[]{abstractC7861eArr[0]}, 0);
                        }
                        if (billing == 5) {
                            return new C9345e(abstractC0362e, abstractC7861e2, abstractC7861e.vip(), i2);
                        }
                        if (billing != 6) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                        AbstractC7861e abstractC7861e3 = abstractC7861eArr[0];
                        return new C9345e(abstractC0362e, abstractC7861e2, abstractC7861e.ad(abstractC7861e3), new AbstractC7861e[]{abstractC7861e3}, 0);
                    }
                }
                return this;
            case 1:
                if (!advert()) {
                    AbstractC7861e abstractC7861e4 = this.vip;
                    if (!abstractC7861e4.subscription()) {
                        AbstractC7861e abstractC7861e5 = abstractC7861eArr[0];
                        return new C9345e(this.ad, abstractC7861e4, abstractC7861e.ad(abstractC7861e5), new AbstractC7861e[]{abstractC7861e5}, 1);
                    }
                }
                return this;
            case 2:
                if (!advert()) {
                    AbstractC7861e abstractC7861e6 = this.vip;
                    if (!abstractC7861e6.subscription()) {
                        AbstractC7861e abstractC7861e7 = abstractC7861eArr[0];
                        return new C9345e(this.ad, abstractC7861e6, abstractC7861e.ad(abstractC7861e7), new AbstractC7861e[]{abstractC7861e7}, 2);
                    }
                }
                return this;
            case 3:
                if (!advert()) {
                    AbstractC7861e abstractC7861e8 = this.vip;
                    if (!abstractC7861e8.subscription()) {
                        AbstractC7861e abstractC7861e9 = abstractC7861eArr[0];
                        return new C9345e(this.ad, abstractC7861e8, abstractC7861e.ad(abstractC7861e9), new AbstractC7861e[]{abstractC7861e9}, 3);
                    }
                }
                return this;
            case 4:
                if (!advert()) {
                    AbstractC7861e abstractC7861e10 = this.vip;
                    if (!abstractC7861e10.subscription()) {
                        AbstractC7861e abstractC7861e11 = abstractC7861eArr[0];
                        return new C9345e(this.ad, abstractC7861e10, abstractC7861e.ad(abstractC7861e11), new AbstractC7861e[]{abstractC7861e11}, 4);
                    }
                }
                return this;
            case 5:
                if (!advert()) {
                    AbstractC7861e abstractC7861e12 = this.vip;
                    if (!abstractC7861e12.subscription()) {
                        AbstractC7861e abstractC7861e13 = abstractC7861eArr[0];
                        return new C9345e(this.ad, abstractC7861e12, abstractC7861e.ad(abstractC7861e13), new AbstractC7861e[]{abstractC7861e13}, 5);
                    }
                }
                return this;
            case 6:
                if (!advert()) {
                    AbstractC7861e abstractC7861e14 = this.vip;
                    if (!abstractC7861e14.subscription()) {
                        AbstractC7861e abstractC7861e15 = abstractC7861eArr[0];
                        return new C9345e(this.ad, abstractC7861e14, abstractC7861e.ad(abstractC7861e15), new AbstractC7861e[]{abstractC7861e15}, 6);
                    }
                }
                return this;
            case 7:
                if (!advert()) {
                    AbstractC7861e abstractC7861e16 = this.vip;
                    if (!abstractC7861e16.subscription()) {
                        AbstractC7861e abstractC7861e17 = abstractC7861eArr[0];
                        return new C9345e(this.ad, abstractC7861e16, abstractC7861e.ad(abstractC7861e17), new AbstractC7861e[]{abstractC7861e17}, 7);
                    }
                }
                return this;
            case 8:
                if (!advert()) {
                    AbstractC7861e abstractC7861e18 = this.vip;
                    if (!abstractC7861e18.subscription()) {
                        AbstractC7861e abstractC7861e19 = abstractC7861eArr[0];
                        return new C9345e(this.ad, abstractC7861e18, abstractC7861e.ad(abstractC7861e19), new AbstractC7861e[]{abstractC7861e19}, 8);
                    }
                }
                return this;
            case 9:
                if (!advert()) {
                    AbstractC7861e abstractC7861e20 = this.vip;
                    if (!abstractC7861e20.subscription()) {
                        AbstractC7861e abstractC7861e21 = abstractC7861eArr[0];
                        return new C9345e(this.ad, abstractC7861e20, abstractC7861e.ad(abstractC7861e21), new AbstractC7861e[]{abstractC7861e21}, 9);
                    }
                }
                return this;
            case 10:
                if (!advert()) {
                    AbstractC7861e abstractC7861e22 = this.vip;
                    if (!abstractC7861e22.subscription()) {
                        AbstractC7861e abstractC7861e23 = abstractC7861eArr[0];
                        return new C9345e(this.ad, abstractC7861e22, abstractC7861e.ad(abstractC7861e23), new AbstractC7861e[]{abstractC7861e23}, 10);
                    }
                }
                return this;
            case 11:
                if (!advert()) {
                    AbstractC7861e abstractC7861e24 = this.vip;
                    if (!abstractC7861e24.subscription()) {
                        AbstractC7861e abstractC7861e25 = abstractC7861eArr[0];
                        return new C9345e(this.ad, abstractC7861e24, abstractC7861e.ad(abstractC7861e25), new AbstractC7861e[]{abstractC7861e25}, 11);
                    }
                }
                return this;
            case 12:
                if (!advert()) {
                    AbstractC7861e abstractC7861e26 = this.vip;
                    if (!abstractC7861e26.subscription()) {
                        AbstractC7861e abstractC7861e27 = abstractC7861eArr[0];
                        return new C9345e(this.ad, abstractC7861e26, abstractC7861e.ad(abstractC7861e27), new AbstractC7861e[]{abstractC7861e27}, 12);
                    }
                }
                return this;
            case 13:
                if (!advert()) {
                    AbstractC7861e abstractC7861e28 = this.vip;
                    if (!abstractC7861e28.subscription()) {
                        AbstractC7861e abstractC7861e29 = abstractC7861eArr[0];
                        return new C9345e(this.ad, abstractC7861e28, abstractC7861e.ad(abstractC7861e29), new AbstractC7861e[]{abstractC7861e29}, 13);
                    }
                }
                return this;
            case 14:
                if (!advert()) {
                    AbstractC7861e abstractC7861e30 = this.vip;
                    if (!abstractC7861e30.subscription()) {
                        AbstractC7861e abstractC7861e31 = abstractC7861eArr[0];
                        return new C9345e(this.ad, abstractC7861e30, abstractC7861e.ad(abstractC7861e31), new AbstractC7861e[]{abstractC7861e31}, 14);
                    }
                }
                return this;
            case 15:
                if (!advert()) {
                    AbstractC7861e abstractC7861e32 = this.vip;
                    if (!abstractC7861e32.subscription()) {
                        AbstractC7861e abstractC7861e33 = abstractC7861eArr[0];
                        return new C9345e(this.ad, abstractC7861e32, abstractC7861e.ad(abstractC7861e33), new AbstractC7861e[]{abstractC7861e33}, 15);
                    }
                }
                return this;
            case 16:
                if (!advert()) {
                    AbstractC7861e abstractC7861e34 = this.vip;
                    if (!abstractC7861e34.subscription()) {
                        AbstractC7861e abstractC7861e35 = abstractC7861eArr[0];
                        return new C9345e(this.ad, abstractC7861e34, abstractC7861e.ad(abstractC7861e35), new AbstractC7861e[]{abstractC7861e35}, 16);
                    }
                }
                return this;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (!advert()) {
                    AbstractC7861e abstractC7861e36 = this.vip;
                    if (!abstractC7861e36.subscription()) {
                        AbstractC7861e abstractC7861e37 = abstractC7861eArr[0];
                        return new C9345e(this.ad, abstractC7861e36, abstractC7861e.ad(abstractC7861e37), new AbstractC7861e[]{abstractC7861e37}, 17);
                    }
                }
                return this;
            default:
                if (!advert()) {
                    AbstractC7861e abstractC7861e38 = this.vip;
                    if (!abstractC7861e38.subscription()) {
                        AbstractC7861e abstractC7861e39 = abstractC7861eArr[0];
                        return new C9345e(this.ad, abstractC7861e38, abstractC7861e.ad(abstractC7861e39), new AbstractC7861e[]{abstractC7861e39}, 18);
                    }
                }
                return this;
        }
    }

    @Override // defpackage.AbstractC9932e
    public final AbstractC9932e metrica() {
        switch (this.billing) {
            case 0:
                vip();
                return new C9345e(null, this.vip, appmetrica(), 0);
            case 1:
                vip();
                return new C9345e(null, this.vip, appmetrica(), 1);
            case 2:
                vip();
                return new C9345e(null, this.vip, appmetrica(), 2);
            case 3:
                vip();
                return new C9345e(null, this.vip, appmetrica(), 3);
            case 4:
                vip();
                return new C9345e(null, this.vip, appmetrica(), 4);
            case 5:
                vip();
                return new C9345e(null, this.vip, appmetrica(), 5);
            case 6:
                vip();
                return new C9345e(null, this.vip, appmetrica(), 6);
            case 7:
                vip();
                return new C9345e(null, this.vip, appmetrica(), 7);
            case 8:
                vip();
                return new C9345e(null, this.vip, appmetrica(), 8);
            case 9:
                vip();
                return new C9345e(null, this.vip, appmetrica(), 9);
            case 10:
                vip();
                return new C9345e(null, this.vip, appmetrica(), 10);
            case 11:
                vip();
                return new C9345e(null, this.vip, appmetrica(), 11);
            case 12:
                vip();
                return new C9345e(null, this.vip, appmetrica(), 12);
            case 13:
                vip();
                return new C9345e(null, this.vip, appmetrica(), 13);
            case 14:
                vip();
                return new C9345e(null, this.vip, appmetrica(), 14);
            case 15:
                vip();
                return new C9345e(null, this.vip, appmetrica(), 15);
            case 16:
                vip();
                return new C9345e(null, this.vip, appmetrica(), 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                vip();
                return new C9345e(null, this.vip, appmetrica(), 17);
            default:
                vip();
                return new C9345e(null, this.vip, appmetrica(), 18);
        }
    }

    @Override // defpackage.AbstractC9932e
    public final AbstractC9932e pro(AbstractC7861e abstractC7861e) {
        if (advert()) {
            return this;
        }
        int billing = billing();
        AbstractC0362e abstractC0362e = this.ad;
        AbstractC7861e[] abstractC7861eArr = this.license;
        AbstractC7861e abstractC7861e2 = this.metrica;
        AbstractC7861e abstractC7861e3 = this.vip;
        if (billing == 5) {
            return abstractC0362e.purchase(abstractC7861e3, abstractC7861e2.ad(abstractC7861e3).yandex(abstractC7861e).ad(abstractC7861e3.remoteconfig(abstractC7861e)), abstractC7861eArr);
        }
        if (billing != 6) {
            return super.pro(abstractC7861e);
        }
        AbstractC7861e abstractC7861e4 = abstractC7861eArr[0];
        AbstractC7861e remoteconfig = abstractC7861e3.remoteconfig(abstractC7861e.applovin());
        return abstractC0362e.purchase(remoteconfig, abstractC7861e2.ad(abstractC7861e3).ad(remoteconfig), new AbstractC7861e[]{abstractC7861e4.remoteconfig(abstractC7861e)});
    }

    @Override // defpackage.AbstractC9932e
    public final boolean purchase() {
        switch (this.billing) {
            case 0:
                AbstractC7861e abstractC7861e = this.vip;
                if (!abstractC7861e.subscription()) {
                    int billing = billing();
                    AbstractC7861e abstractC7861e2 = this.metrica;
                    if (billing != 5 && billing != 6) {
                        return abstractC7861e2.yandex(abstractC7861e).crashlytics();
                    }
                    if (abstractC7861e2.crashlytics() != abstractC7861e.crashlytics()) {
                        return true;
                    }
                }
                return false;
            case 1:
                AbstractC7861e abstractC7861e3 = this.vip;
                return (abstractC7861e3.subscription() || this.metrica.crashlytics() == abstractC7861e3.crashlytics()) ? false : true;
            case 2:
                AbstractC7861e abstractC7861e4 = this.vip;
                return (abstractC7861e4.subscription() || this.metrica.crashlytics() == abstractC7861e4.crashlytics()) ? false : true;
            case 3:
                AbstractC7861e abstractC7861e5 = this.vip;
                return (abstractC7861e5.subscription() || this.metrica.crashlytics() == abstractC7861e5.crashlytics()) ? false : true;
            case 4:
                AbstractC7861e abstractC7861e6 = this.vip;
                return (abstractC7861e6.subscription() || this.metrica.crashlytics() == abstractC7861e6.crashlytics()) ? false : true;
            case 5:
                AbstractC7861e abstractC7861e7 = this.vip;
                return (abstractC7861e7.subscription() || this.metrica.crashlytics() == abstractC7861e7.crashlytics()) ? false : true;
            case 6:
                AbstractC7861e abstractC7861e8 = this.vip;
                return (abstractC7861e8.subscription() || this.metrica.crashlytics() == abstractC7861e8.crashlytics()) ? false : true;
            case 7:
                AbstractC7861e abstractC7861e9 = this.vip;
                return (abstractC7861e9.subscription() || this.metrica.crashlytics() == abstractC7861e9.crashlytics()) ? false : true;
            case 8:
                AbstractC7861e abstractC7861e10 = this.vip;
                return (abstractC7861e10.subscription() || this.metrica.crashlytics() == abstractC7861e10.crashlytics()) ? false : true;
            case 9:
                AbstractC7861e abstractC7861e11 = this.vip;
                return (abstractC7861e11.subscription() || this.metrica.crashlytics() == abstractC7861e11.crashlytics()) ? false : true;
            case 10:
                AbstractC7861e abstractC7861e12 = this.vip;
                return (abstractC7861e12.subscription() || this.metrica.crashlytics() == abstractC7861e12.crashlytics()) ? false : true;
            case 11:
                AbstractC7861e abstractC7861e13 = this.vip;
                return (abstractC7861e13.subscription() || this.metrica.crashlytics() == abstractC7861e13.crashlytics()) ? false : true;
            case 12:
                AbstractC7861e abstractC7861e14 = this.vip;
                return (abstractC7861e14.subscription() || this.metrica.crashlytics() == abstractC7861e14.crashlytics()) ? false : true;
            case 13:
                AbstractC7861e abstractC7861e15 = this.vip;
                return (abstractC7861e15.subscription() || this.metrica.crashlytics() == abstractC7861e15.crashlytics()) ? false : true;
            case 14:
                AbstractC7861e abstractC7861e16 = this.vip;
                return (abstractC7861e16.subscription() || this.metrica.crashlytics() == abstractC7861e16.crashlytics()) ? false : true;
            case 15:
                AbstractC7861e abstractC7861e17 = this.vip;
                return (abstractC7861e17.subscription() || this.metrica.crashlytics() == abstractC7861e17.crashlytics()) ? false : true;
            case 16:
                AbstractC7861e abstractC7861e18 = this.vip;
                return (abstractC7861e18.subscription() || this.metrica.crashlytics() == abstractC7861e18.crashlytics()) ? false : true;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                AbstractC7861e abstractC7861e19 = this.vip;
                return (abstractC7861e19.subscription() || this.metrica.crashlytics() == abstractC7861e19.crashlytics()) ? false : true;
            default:
                AbstractC7861e abstractC7861e20 = this.vip;
                return (abstractC7861e20.subscription() || this.metrica.crashlytics() == abstractC7861e20.crashlytics()) ? false : true;
        }
    }

    @Override // defpackage.AbstractC9932e
    public final boolean remoteconfig() {
        AbstractC0362e abstractC0362e = this.ad;
        BigInteger bigInteger = abstractC0362e.appmetrica;
        if (InterfaceC4563e.admob.equals(bigInteger)) {
            AbstractC9932e Signature = Signature();
            Signature.vip();
            return ((AbstractC11471e) Signature.vip).mo205goto() != 0;
        }
        if (!InterfaceC4563e.remoteconfig.equals(bigInteger)) {
            return super.remoteconfig();
        }
        AbstractC9932e Signature2 = Signature();
        Signature2.vip();
        AbstractC7861e abstractC7861e = Signature2.vip;
        AbstractC7861e tapsense = ((AbstractC5490e) abstractC0362e).tapsense(abstractC7861e.ad(abstractC0362e.vip));
        if (tapsense == null) {
            return false;
        }
        return ((AbstractC11471e) abstractC7861e.remoteconfig(tapsense).ad(Signature2.appmetrica())).mo205goto() == 0;
    }

    @Override // defpackage.AbstractC9932e
    public final AbstractC9932e signatures(AbstractC7861e abstractC7861e) {
        if (advert()) {
            return this;
        }
        int billing = billing();
        if (billing != 5 && billing != 6) {
            return super.signatures(abstractC7861e);
        }
        AbstractC7861e abstractC7861e2 = this.metrica;
        AbstractC7861e abstractC7861e3 = this.vip;
        return this.ad.purchase(abstractC7861e3, abstractC7861e2.ad(abstractC7861e3).remoteconfig(abstractC7861e).ad(abstractC7861e3), this.license);
    }

    @Override // defpackage.AbstractC9932e
    public final AbstractC7861e startapp() {
        switch (this.billing) {
            case 0:
                int billing = billing();
                AbstractC7861e abstractC7861e = this.metrica;
                if ((billing != 5 && billing != 6) || advert()) {
                    return abstractC7861e;
                }
                AbstractC7861e abstractC7861e2 = this.vip;
                if (abstractC7861e2.subscription()) {
                    return abstractC7861e;
                }
                AbstractC7861e remoteconfig = abstractC7861e.ad(abstractC7861e2).remoteconfig(abstractC7861e2);
                if (6 != billing) {
                    return remoteconfig;
                }
                AbstractC7861e abstractC7861e3 = this.license[0];
                return !abstractC7861e3.admob() ? remoteconfig.yandex(abstractC7861e3) : remoteconfig;
            case 1:
                boolean advert = advert();
                AbstractC7861e abstractC7861e4 = this.metrica;
                if (advert) {
                    return abstractC7861e4;
                }
                AbstractC7861e abstractC7861e5 = this.vip;
                if (abstractC7861e5.subscription()) {
                    return abstractC7861e4;
                }
                AbstractC7861e remoteconfig2 = abstractC7861e4.ad(abstractC7861e5).remoteconfig(abstractC7861e5);
                AbstractC7861e abstractC7861e6 = this.license[0];
                return !abstractC7861e6.admob() ? remoteconfig2.yandex(abstractC7861e6) : remoteconfig2;
            case 2:
                boolean advert2 = advert();
                AbstractC7861e abstractC7861e7 = this.metrica;
                if (advert2) {
                    return abstractC7861e7;
                }
                AbstractC7861e abstractC7861e8 = this.vip;
                if (abstractC7861e8.subscription()) {
                    return abstractC7861e7;
                }
                AbstractC7861e remoteconfig3 = abstractC7861e7.ad(abstractC7861e8).remoteconfig(abstractC7861e8);
                AbstractC7861e abstractC7861e9 = this.license[0];
                return !abstractC7861e9.admob() ? remoteconfig3.yandex(abstractC7861e9) : remoteconfig3;
            case 3:
                boolean advert3 = advert();
                AbstractC7861e abstractC7861e10 = this.metrica;
                if (advert3) {
                    return abstractC7861e10;
                }
                AbstractC7861e abstractC7861e11 = this.vip;
                if (abstractC7861e11.subscription()) {
                    return abstractC7861e10;
                }
                AbstractC7861e remoteconfig4 = abstractC7861e10.ad(abstractC7861e11).remoteconfig(abstractC7861e11);
                AbstractC7861e abstractC7861e12 = this.license[0];
                return !abstractC7861e12.admob() ? remoteconfig4.yandex(abstractC7861e12) : remoteconfig4;
            case 4:
                boolean advert4 = advert();
                AbstractC7861e abstractC7861e13 = this.metrica;
                if (advert4) {
                    return abstractC7861e13;
                }
                AbstractC7861e abstractC7861e14 = this.vip;
                if (abstractC7861e14.subscription()) {
                    return abstractC7861e13;
                }
                AbstractC7861e remoteconfig5 = abstractC7861e13.ad(abstractC7861e14).remoteconfig(abstractC7861e14);
                AbstractC7861e abstractC7861e15 = this.license[0];
                return !abstractC7861e15.admob() ? remoteconfig5.yandex(abstractC7861e15) : remoteconfig5;
            case 5:
                boolean advert5 = advert();
                AbstractC7861e abstractC7861e16 = this.metrica;
                if (advert5) {
                    return abstractC7861e16;
                }
                AbstractC7861e abstractC7861e17 = this.vip;
                if (abstractC7861e17.subscription()) {
                    return abstractC7861e16;
                }
                AbstractC7861e remoteconfig6 = abstractC7861e16.ad(abstractC7861e17).remoteconfig(abstractC7861e17);
                AbstractC7861e abstractC7861e18 = this.license[0];
                return !abstractC7861e18.admob() ? remoteconfig6.yandex(abstractC7861e18) : remoteconfig6;
            case 6:
                boolean advert6 = advert();
                AbstractC7861e abstractC7861e19 = this.metrica;
                if (advert6) {
                    return abstractC7861e19;
                }
                AbstractC7861e abstractC7861e20 = this.vip;
                if (abstractC7861e20.subscription()) {
                    return abstractC7861e19;
                }
                AbstractC7861e remoteconfig7 = abstractC7861e19.ad(abstractC7861e20).remoteconfig(abstractC7861e20);
                AbstractC7861e abstractC7861e21 = this.license[0];
                return !abstractC7861e21.admob() ? remoteconfig7.yandex(abstractC7861e21) : remoteconfig7;
            case 7:
                boolean advert7 = advert();
                AbstractC7861e abstractC7861e22 = this.metrica;
                if (advert7) {
                    return abstractC7861e22;
                }
                AbstractC7861e abstractC7861e23 = this.vip;
                if (abstractC7861e23.subscription()) {
                    return abstractC7861e22;
                }
                AbstractC7861e remoteconfig8 = abstractC7861e22.ad(abstractC7861e23).remoteconfig(abstractC7861e23);
                AbstractC7861e abstractC7861e24 = this.license[0];
                return !abstractC7861e24.admob() ? remoteconfig8.yandex(abstractC7861e24) : remoteconfig8;
            case 8:
                boolean advert8 = advert();
                AbstractC7861e abstractC7861e25 = this.metrica;
                if (advert8) {
                    return abstractC7861e25;
                }
                AbstractC7861e abstractC7861e26 = this.vip;
                if (abstractC7861e26.subscription()) {
                    return abstractC7861e25;
                }
                AbstractC7861e remoteconfig9 = abstractC7861e25.ad(abstractC7861e26).remoteconfig(abstractC7861e26);
                AbstractC7861e abstractC7861e27 = this.license[0];
                return !abstractC7861e27.admob() ? remoteconfig9.yandex(abstractC7861e27) : remoteconfig9;
            case 9:
                boolean advert9 = advert();
                AbstractC7861e abstractC7861e28 = this.metrica;
                if (advert9) {
                    return abstractC7861e28;
                }
                AbstractC7861e abstractC7861e29 = this.vip;
                if (abstractC7861e29.subscription()) {
                    return abstractC7861e28;
                }
                AbstractC7861e remoteconfig10 = abstractC7861e28.ad(abstractC7861e29).remoteconfig(abstractC7861e29);
                AbstractC7861e abstractC7861e30 = this.license[0];
                return !abstractC7861e30.admob() ? remoteconfig10.yandex(abstractC7861e30) : remoteconfig10;
            case 10:
                boolean advert10 = advert();
                AbstractC7861e abstractC7861e31 = this.metrica;
                if (advert10) {
                    return abstractC7861e31;
                }
                AbstractC7861e abstractC7861e32 = this.vip;
                if (abstractC7861e32.subscription()) {
                    return abstractC7861e31;
                }
                AbstractC7861e remoteconfig11 = abstractC7861e31.ad(abstractC7861e32).remoteconfig(abstractC7861e32);
                AbstractC7861e abstractC7861e33 = this.license[0];
                return !abstractC7861e33.admob() ? remoteconfig11.yandex(abstractC7861e33) : remoteconfig11;
            case 11:
                boolean advert11 = advert();
                AbstractC7861e abstractC7861e34 = this.metrica;
                if (advert11) {
                    return abstractC7861e34;
                }
                AbstractC7861e abstractC7861e35 = this.vip;
                if (abstractC7861e35.subscription()) {
                    return abstractC7861e34;
                }
                AbstractC7861e remoteconfig12 = abstractC7861e34.ad(abstractC7861e35).remoteconfig(abstractC7861e35);
                AbstractC7861e abstractC7861e36 = this.license[0];
                return !abstractC7861e36.admob() ? remoteconfig12.yandex(abstractC7861e36) : remoteconfig12;
            case 12:
                boolean advert12 = advert();
                AbstractC7861e abstractC7861e37 = this.metrica;
                if (advert12) {
                    return abstractC7861e37;
                }
                AbstractC7861e abstractC7861e38 = this.vip;
                if (abstractC7861e38.subscription()) {
                    return abstractC7861e37;
                }
                AbstractC7861e remoteconfig13 = abstractC7861e37.ad(abstractC7861e38).remoteconfig(abstractC7861e38);
                AbstractC7861e abstractC7861e39 = this.license[0];
                return !abstractC7861e39.admob() ? remoteconfig13.yandex(abstractC7861e39) : remoteconfig13;
            case 13:
                boolean advert13 = advert();
                AbstractC7861e abstractC7861e40 = this.metrica;
                if (advert13) {
                    return abstractC7861e40;
                }
                AbstractC7861e abstractC7861e41 = this.vip;
                if (abstractC7861e41.subscription()) {
                    return abstractC7861e40;
                }
                AbstractC7861e remoteconfig14 = abstractC7861e40.ad(abstractC7861e41).remoteconfig(abstractC7861e41);
                AbstractC7861e abstractC7861e42 = this.license[0];
                return !abstractC7861e42.admob() ? remoteconfig14.yandex(abstractC7861e42) : remoteconfig14;
            case 14:
                boolean advert14 = advert();
                AbstractC7861e abstractC7861e43 = this.metrica;
                if (advert14) {
                    return abstractC7861e43;
                }
                AbstractC7861e abstractC7861e44 = this.vip;
                if (abstractC7861e44.subscription()) {
                    return abstractC7861e43;
                }
                AbstractC7861e remoteconfig15 = abstractC7861e43.ad(abstractC7861e44).remoteconfig(abstractC7861e44);
                AbstractC7861e abstractC7861e45 = this.license[0];
                return !abstractC7861e45.admob() ? remoteconfig15.yandex(abstractC7861e45) : remoteconfig15;
            case 15:
                boolean advert15 = advert();
                AbstractC7861e abstractC7861e46 = this.metrica;
                if (advert15) {
                    return abstractC7861e46;
                }
                AbstractC7861e abstractC7861e47 = this.vip;
                if (abstractC7861e47.subscription()) {
                    return abstractC7861e46;
                }
                AbstractC7861e remoteconfig16 = abstractC7861e46.ad(abstractC7861e47).remoteconfig(abstractC7861e47);
                AbstractC7861e abstractC7861e48 = this.license[0];
                return !abstractC7861e48.admob() ? remoteconfig16.yandex(abstractC7861e48) : remoteconfig16;
            case 16:
                boolean advert16 = advert();
                AbstractC7861e abstractC7861e49 = this.metrica;
                if (advert16) {
                    return abstractC7861e49;
                }
                AbstractC7861e abstractC7861e50 = this.vip;
                if (abstractC7861e50.subscription()) {
                    return abstractC7861e49;
                }
                AbstractC7861e remoteconfig17 = abstractC7861e49.ad(abstractC7861e50).remoteconfig(abstractC7861e50);
                AbstractC7861e abstractC7861e51 = this.license[0];
                return !abstractC7861e51.admob() ? remoteconfig17.yandex(abstractC7861e51) : remoteconfig17;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                boolean advert17 = advert();
                AbstractC7861e abstractC7861e52 = this.metrica;
                if (advert17) {
                    return abstractC7861e52;
                }
                AbstractC7861e abstractC7861e53 = this.vip;
                if (abstractC7861e53.subscription()) {
                    return abstractC7861e52;
                }
                AbstractC7861e remoteconfig18 = abstractC7861e52.ad(abstractC7861e53).remoteconfig(abstractC7861e53);
                AbstractC7861e abstractC7861e54 = this.license[0];
                return !abstractC7861e54.admob() ? remoteconfig18.yandex(abstractC7861e54) : remoteconfig18;
            default:
                boolean advert18 = advert();
                AbstractC7861e abstractC7861e55 = this.metrica;
                if (advert18) {
                    return abstractC7861e55;
                }
                AbstractC7861e abstractC7861e56 = this.vip;
                if (abstractC7861e56.subscription()) {
                    return abstractC7861e55;
                }
                AbstractC7861e remoteconfig19 = abstractC7861e55.ad(abstractC7861e56).remoteconfig(abstractC7861e56);
                AbstractC7861e abstractC7861e57 = this.license[0];
                return !abstractC7861e57.admob() ? remoteconfig19.yandex(abstractC7861e57) : remoteconfig19;
        }
    }

    @Override // defpackage.AbstractC9932e
    public final boolean subscription() {
        AbstractC7861e signatures;
        AbstractC7861e ads;
        AbstractC0362e abstractC0362e = this.ad;
        AbstractC7861e abstractC7861e = abstractC0362e.vip;
        AbstractC7861e abstractC7861e2 = abstractC0362e.metrica;
        int i = abstractC0362e.purchase;
        AbstractC7861e[] abstractC7861eArr = this.license;
        AbstractC7861e abstractC7861e3 = this.metrica;
        AbstractC7861e abstractC7861e4 = this.vip;
        if (i != 6) {
            AbstractC7861e remoteconfig = abstractC7861e3.ad(abstractC7861e4).remoteconfig(abstractC7861e3);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("unsupported coordinate system");
                }
                AbstractC7861e abstractC7861e5 = abstractC7861eArr[0];
                if (!abstractC7861e5.admob()) {
                    AbstractC7861e remoteconfig2 = abstractC7861e5.remoteconfig(abstractC7861e5.applovin());
                    remoteconfig = remoteconfig.remoteconfig(abstractC7861e5);
                    abstractC7861e = abstractC7861e.remoteconfig(abstractC7861e5);
                    abstractC7861e2 = abstractC7861e2.remoteconfig(remoteconfig2);
                }
            }
            return remoteconfig.equals(abstractC7861e4.ad(abstractC7861e).remoteconfig(abstractC7861e4.applovin()).ad(abstractC7861e2));
        }
        AbstractC7861e abstractC7861e6 = abstractC7861eArr[0];
        boolean admob = abstractC7861e6.admob();
        if (abstractC7861e4.subscription()) {
            AbstractC7861e applovin = abstractC7861e3.applovin();
            if (!admob) {
                abstractC7861e2 = abstractC7861e2.remoteconfig(abstractC7861e6.applovin());
            }
            return applovin.equals(abstractC7861e2);
        }
        AbstractC7861e applovin2 = abstractC7861e4.applovin();
        if (admob) {
            signatures = AbstractC4653e.crashlytics(abstractC7861e3, abstractC7861e3, abstractC7861e);
            ads = applovin2.applovin().ad(abstractC7861e2);
        } else {
            AbstractC7861e applovin3 = abstractC7861e6.applovin();
            AbstractC7861e applovin4 = applovin3.applovin();
            signatures = abstractC7861e3.ad(abstractC7861e6).signatures(abstractC7861e3, abstractC7861e, applovin3);
            ads = applovin2.ads(abstractC7861e2, applovin4);
        }
        return signatures.remoteconfig(applovin2).equals(ads);
    }

    @Override // defpackage.AbstractC9932e
    public final AbstractC9932e tapsense(AbstractC9932e abstractC9932e) {
        return abstractC9932e.advert() ? this : ad(abstractC9932e.loadAd());
    }
}
