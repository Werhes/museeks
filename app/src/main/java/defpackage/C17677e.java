package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ٘ؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17677e {
    public static boolean admob = false;
    public C0294e Signature;
    public final C1993e license;
    public final C0909e smaato;
    public int ad = 1000;
    public boolean vip = false;
    public int metrica = 0;
    public int appmetrica = 32;
    public int purchase = 32;
    public boolean yandex = false;
    public boolean[] startapp = new boolean[32];
    public int adcel = 1;
    public int mopub = 0;
    public int advert = 32;
    public C0511e[] amazon = new C0511e[1000];
    public int loadAd = 0;
    public C0294e[] billing = new C0294e[32];

    /* JADX WARN: Type inference failed for: r0v3, types: [eٍؚؒ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [eٟؓؐ, eُؑٓ] */
    public C17677e() {
        remoteconfig();
        ?? obj = new Object();
        new C16966e();
        obj.f3323e = new C16966e();
        obj.f3322e = new C16966e();
        obj.f3321e = new C0511e[32];
        this.smaato = obj;
        ?? c0294e = new C0294e(obj);
        c0294e.purchase = new C0511e[128];
        c0294e.billing = new C0511e[128];
        c0294e.yandex = 0;
        c0294e.startapp = new C10312e((C1993e) c0294e);
        this.license = c0294e;
        this.Signature = new C0294e(obj);
    }

    public static int amazon(Object obj) {
        C0511e c0511e = ((C9399e) obj).startapp;
        if (c0511e != null) {
            return (int) (c0511e.f2612e + 0.5f);
        }
        return 0;
    }

    public final void Signature() {
        C1993e c1993e = this.license;
        if (c1993e.appmetrica()) {
            startapp();
            return;
        }
        if (!this.yandex) {
            admob(c1993e);
            return;
        }
        for (int i = 0; i < this.mopub; i++) {
            if (!this.billing[i].appmetrica) {
                admob(c1993e);
                return;
            }
        }
        startapp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C0511e ad(int i) {
        C16966e c16966e = (C16966e) this.smaato.f3322e;
        int i2 = c16966e.vip;
        C0511e c0511e = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = c16966e.ad;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            c16966e.vip = i3;
            c0511e = r4;
        }
        C0511e c0511e2 = c0511e;
        if (c0511e2 == null) {
            c0511e2 = new C0511e(i);
            c0511e2.f2613e = i;
        } else {
            c0511e2.metrica();
            c0511e2.f2613e = i;
        }
        int i4 = this.loadAd;
        int i5 = this.ad;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.ad = i6;
            this.amazon = (C0511e[]) Arrays.copyOf(this.amazon, i6);
        }
        C0511e[] c0511eArr = this.amazon;
        int i7 = this.loadAd;
        this.loadAd = i7 + 1;
        c0511eArr[i7] = c0511e2;
        return c0511e2;
    }

    public final C0511e adcel(int i) {
        if (this.adcel + 1 >= this.purchase) {
            loadAd();
        }
        C0511e ad = ad(4);
        float[] fArr = ad.f2617e;
        int i2 = this.metrica + 1;
        this.metrica = i2;
        this.adcel++;
        ad.f2616e = i2;
        ad.f2619e = i;
        ((C0511e[]) this.smaato.f3321e)[i2] = ad;
        C1993e c1993e = this.license;
        c1993e.startapp.f20361e = ad;
        Arrays.fill(fArr, 0.0f);
        fArr[ad.f2619e] = 1.0f;
        c1993e.adcel(ad);
        return ad;
    }

    public final void admob(C1993e c1993e) {
        int i = 0;
        while (true) {
            if (i >= this.mopub) {
                break;
            }
            C0294e c0294e = this.billing[i];
            int i2 = 1;
            if (c0294e.ad.f2613e != 1) {
                float f = 0.0f;
                if (c0294e.vip < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.mopub) {
                            C0294e c0294e2 = this.billing[i6];
                            if (c0294e2.ad.f2613e != i2 && !c0294e2.appmetrica && c0294e2.vip < f) {
                                int license = c0294e2.license.license();
                                int i8 = 0;
                                while (i8 < license) {
                                    C0511e appmetrica = c0294e2.license.appmetrica(i8);
                                    float metrica = c0294e2.license.metrica(appmetrica);
                                    if (metrica > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = appmetrica.f2622e[i9] / metrica;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = appmetrica.f2616e;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            C0294e c0294e3 = this.billing[i4];
                            c0294e3.ad.f2614e = -1;
                            c0294e3.billing(((C0511e[]) this.smaato.f3321e)[i5]);
                            C0511e c0511e = c0294e3.ad;
                            c0511e.f2614e = i4;
                            c0511e.appmetrica(this, c0294e3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.adcel / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        subscription(c1993e);
        startapp();
    }

    public final C0294e advert() {
        Object obj;
        C0909e c0909e = this.smaato;
        C16966e c16966e = (C16966e) c0909e.f3323e;
        int i = c16966e.vip;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c16966e.ad;
            obj = objArr[i2];
            objArr[i2] = null;
            c16966e.vip = i2;
        } else {
            obj = null;
        }
        C0294e c0294e = (C0294e) obj;
        if (c0294e == null) {
            return new C0294e(c0909e);
        }
        c0294e.ad = null;
        c0294e.license.vip();
        c0294e.vip = 0.0f;
        c0294e.appmetrica = false;
        return c0294e;
    }

    public final void appmetrica(C0511e c0511e, C0511e c0511e2, int i, int i2) {
        if (i2 == 8 && c0511e2.f2623e && c0511e.f2614e == -1) {
            c0511e.license(this, c0511e2.f2612e + i);
            return;
        }
        C0294e advert = advert();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            advert.vip = i;
        }
        if (z) {
            advert.license.billing(c0511e, 1.0f);
            advert.license.billing(c0511e2, -1.0f);
        } else {
            advert.license.billing(c0511e, -1.0f);
            advert.license.billing(c0511e2, 1.0f);
        }
        if (i2 != 8) {
            advert.ad(this, i2);
        }
        metrica(advert);
    }

    public final void billing(C0511e c0511e, C0511e c0511e2, int i, int i2) {
        C0294e advert = advert();
        C0511e smaato = smaato();
        smaato.f2619e = 0;
        advert.metrica(c0511e, c0511e2, smaato, i);
        if (i2 != 8) {
            advert.license.billing(adcel(i2), (int) (advert.license.metrica(smaato) * (-1.0f)));
        }
        metrica(advert);
    }

    public final void license(C0511e c0511e, int i) {
        int i2 = c0511e.f2614e;
        if (i2 == -1) {
            c0511e.license(this, i);
            for (int i3 = 0; i3 < this.metrica + 1; i3++) {
                C0511e c0511e2 = ((C0511e[]) this.smaato.f3321e)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0294e advert = advert();
            advert.ad = c0511e;
            float f = i;
            c0511e.f2612e = f;
            advert.vip = f;
            advert.appmetrica = true;
            metrica(advert);
            return;
        }
        C0294e c0294e = this.billing[i2];
        if (c0294e.appmetrica) {
            c0294e.vip = i;
            return;
        }
        if (c0294e.license.license() == 0) {
            c0294e.appmetrica = true;
            c0294e.vip = i;
            return;
        }
        C0294e advert2 = advert();
        if (i < 0) {
            advert2.vip = i * (-1);
            advert2.license.billing(c0511e, 1.0f);
        } else {
            advert2.vip = i;
            advert2.license.billing(c0511e, -1.0f);
        }
        metrica(advert2);
    }

    public final void loadAd() {
        int i = this.appmetrica * 2;
        this.appmetrica = i;
        this.billing = (C0294e[]) Arrays.copyOf(this.billing, i);
        C0909e c0909e = this.smaato;
        c0909e.f3321e = (C0511e[]) Arrays.copyOf((C0511e[]) c0909e.f3321e, this.appmetrica);
        int i2 = this.appmetrica;
        this.startapp = new boolean[i2];
        this.purchase = i2;
        this.advert = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
    
        if (r4.f2618e <= 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d6, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e0, code lost:
    
        if (r4.f2618e <= 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f5, code lost:
    
        if (r4.f2618e <= 1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f8, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0102, code lost:
    
        if (r4.f2618e <= 1) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void metrica(defpackage.C0294e r18) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17677e.metrica(eُؑٓ):void");
    }

    public final C0511e mopub(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.adcel + 1 >= this.purchase) {
            loadAd();
        }
        if (!(obj instanceof C9399e)) {
            return null;
        }
        C9399e c9399e = (C9399e) obj;
        C0511e c0511e = c9399e.startapp;
        if (c0511e == null) {
            c9399e.mopub();
            c0511e = c9399e.startapp;
        }
        int i = c0511e.f2616e;
        C0909e c0909e = this.smaato;
        if (i != -1 && i <= this.metrica && ((C0511e[]) c0909e.f3321e)[i] != null) {
            return c0511e;
        }
        if (i != -1) {
            c0511e.metrica();
        }
        int i2 = this.metrica + 1;
        this.metrica = i2;
        this.adcel++;
        c0511e.f2616e = i2;
        c0511e.f2613e = 1;
        ((C0511e[]) c0909e.f3321e)[i2] = c0511e;
        return c0511e;
    }

    public final void pro() {
        C0909e c0909e;
        int i = 0;
        while (true) {
            c0909e = this.smaato;
            C0511e[] c0511eArr = (C0511e[]) c0909e.f3321e;
            if (i >= c0511eArr.length) {
                break;
            }
            C0511e c0511e = c0511eArr[i];
            if (c0511e != null) {
                c0511e.metrica();
            }
            i++;
        }
        C16966e c16966e = (C16966e) c0909e.f3322e;
        C0511e[] c0511eArr2 = this.amazon;
        int i2 = this.loadAd;
        c16966e.getClass();
        if (i2 > c0511eArr2.length) {
            i2 = c0511eArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0511e c0511e2 = c0511eArr2[i3];
            int i4 = c16966e.vip;
            Object[] objArr = c16966e.ad;
            if (i4 < objArr.length) {
                objArr[i4] = c0511e2;
                c16966e.vip = i4 + 1;
            }
        }
        this.loadAd = 0;
        Arrays.fill((C0511e[]) c0909e.f3321e, (Object) null);
        this.metrica = 0;
        C1993e c1993e = this.license;
        c1993e.yandex = 0;
        c1993e.vip = 0.0f;
        this.adcel = 1;
        for (int i5 = 0; i5 < this.mopub; i5++) {
            C0294e c0294e = this.billing[i5];
        }
        remoteconfig();
        this.mopub = 0;
        this.Signature = new C0294e(c0909e);
    }

    public final void purchase(C0511e c0511e, C0511e c0511e2, int i, int i2) {
        C0294e advert = advert();
        C0511e smaato = smaato();
        smaato.f2619e = 0;
        advert.vip(c0511e, c0511e2, smaato, i);
        if (i2 != 8) {
            advert.license.billing(adcel(i2), (int) (advert.license.metrica(smaato) * (-1.0f)));
        }
        metrica(advert);
    }

    public final void remoteconfig() {
        for (int i = 0; i < this.mopub; i++) {
            C0294e c0294e = this.billing[i];
            if (c0294e != null) {
                ((C16966e) this.smaato.f3323e).vip(c0294e);
            }
            this.billing[i] = null;
        }
    }

    public final C0511e smaato() {
        if (this.adcel + 1 >= this.purchase) {
            loadAd();
        }
        C0511e ad = ad(3);
        int i = this.metrica + 1;
        this.metrica = i;
        this.adcel++;
        ad.f2616e = i;
        ((C0511e[]) this.smaato.f3321e)[i] = ad;
        return ad;
    }

    public final void startapp() {
        for (int i = 0; i < this.mopub; i++) {
            C0294e c0294e = this.billing[i];
            c0294e.ad.f2612e = c0294e.vip;
        }
    }

    public final void subscription(C0294e c0294e) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.adcel; i2++) {
            this.startapp[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            int i4 = 1;
            i3++;
            if (i3 >= this.adcel * 2) {
                return;
            }
            C0511e c0511e = c0294e.ad;
            if (c0511e != null) {
                this.startapp[c0511e.f2616e] = true;
            }
            C0511e license = c0294e.license(this.startapp);
            if (license != null) {
                boolean[] zArr = this.startapp;
                int i5 = license.f2616e;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (license != null) {
                float f = Float.MAX_VALUE;
                int i6 = i;
                int i7 = -1;
                while (i6 < this.mopub) {
                    C0294e c0294e2 = this.billing[i6];
                    if (c0294e2.ad.f2613e != i4 && !c0294e2.appmetrica) {
                        C6847e c6847e = c0294e2.license;
                        int i8 = c6847e.yandex;
                        if (i8 != -1) {
                            for (int i9 = 0; i8 != -1 && i9 < c6847e.ad; i9++) {
                                if (c6847e.appmetrica[i8] == license.f2616e) {
                                    z = true;
                                    break;
                                }
                                i8 = c6847e.purchase[i8];
                            }
                        }
                        z = false;
                        if (z) {
                            float metrica = c0294e2.license.metrica(license);
                            if (metrica < 0.0f) {
                                float f2 = (-c0294e2.vip) / metrica;
                                if (f2 < f) {
                                    f = f2;
                                    i7 = i6;
                                }
                            }
                        }
                    }
                    i6++;
                    i4 = 1;
                }
                if (i7 > -1) {
                    C0294e c0294e3 = this.billing[i7];
                    c0294e3.ad.f2614e = -1;
                    c0294e3.billing(license);
                    C0511e c0511e2 = c0294e3.ad;
                    c0511e2.f2614e = i7;
                    c0511e2.appmetrica(this, c0294e3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final void vip(C0511e c0511e, C0511e c0511e2, int i, float f, C0511e c0511e3, C0511e c0511e4, int i2, int i3) {
        C0294e advert = advert();
        if (c0511e2 == c0511e3) {
            advert.license.billing(c0511e, 1.0f);
            advert.license.billing(c0511e4, 1.0f);
            advert.license.billing(c0511e2, -2.0f);
        } else if (f == 0.5f) {
            advert.license.billing(c0511e, 1.0f);
            advert.license.billing(c0511e2, -1.0f);
            advert.license.billing(c0511e3, -1.0f);
            advert.license.billing(c0511e4, 1.0f);
            if (i > 0 || i2 > 0) {
                advert.vip = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            advert.license.billing(c0511e, -1.0f);
            advert.license.billing(c0511e2, 1.0f);
            advert.vip = i;
        } else if (f >= 1.0f) {
            advert.license.billing(c0511e4, -1.0f);
            advert.license.billing(c0511e3, 1.0f);
            advert.vip = -i2;
        } else {
            float f2 = 1.0f - f;
            advert.license.billing(c0511e, f2 * 1.0f);
            advert.license.billing(c0511e2, f2 * (-1.0f));
            advert.license.billing(c0511e3, (-1.0f) * f);
            advert.license.billing(c0511e4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                advert.vip = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            advert.ad(this, i3);
        }
        metrica(advert);
    }

    public final void yandex(C0294e c0294e) {
        int i;
        if (c0294e.appmetrica) {
            c0294e.ad.license(this, c0294e.vip);
        } else {
            C0294e[] c0294eArr = this.billing;
            int i2 = this.mopub;
            c0294eArr[i2] = c0294e;
            C0511e c0511e = c0294e.ad;
            c0511e.f2614e = i2;
            this.mopub = i2 + 1;
            c0511e.appmetrica(this, c0294e);
        }
        if (this.vip) {
            int i3 = 0;
            while (i3 < this.mopub) {
                if (this.billing[i3] == null) {
                    System.out.println("WTF");
                }
                C0294e c0294e2 = this.billing[i3];
                if (c0294e2 != null && c0294e2.appmetrica) {
                    c0294e2.ad.license(this, c0294e2.vip);
                    ((C16966e) this.smaato.f3323e).vip(c0294e2);
                    this.billing[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.mopub;
                        if (i4 >= i) {
                            break;
                        }
                        C0294e[] c0294eArr2 = this.billing;
                        int i6 = i4 - 1;
                        C0294e c0294e3 = c0294eArr2[i4];
                        c0294eArr2[i6] = c0294e3;
                        C0511e c0511e2 = c0294e3.ad;
                        if (c0511e2.f2614e == i4) {
                            c0511e2.f2614e = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.billing[i5] = null;
                    }
                    this.mopub = i - 1;
                    i3--;
                }
                i3++;
            }
            this.vip = false;
        }
    }
}
