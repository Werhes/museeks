package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٔؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15461e {
    public int ad;
    public int adcel;
    public int admob;
    public C9399e appmetrica;
    public C9399e billing;
    public C9399e license;
    public int mopub;
    public C9399e purchase;
    public int startapp;
    public final /* synthetic */ C4955e subscription;
    public int yandex;
    public C11325e vip = null;
    public int metrica = 0;
    public int advert = 0;
    public int smaato = 0;
    public int amazon = 0;
    public int loadAd = 0;
    public int Signature = 0;

    public C15461e(C4955e c4955e, int i, C9399e c9399e, C9399e c9399e2, C9399e c9399e3, C9399e c9399e4, int i2) {
        this.subscription = c4955e;
        this.ad = i;
        this.license = c9399e;
        this.appmetrica = c9399e2;
        this.purchase = c9399e3;
        this.billing = c9399e4;
        this.yandex = c4955e.f10492e;
        this.startapp = c4955e.f10493e;
        this.adcel = c4955e.f10483e;
        this.mopub = c4955e.f10480e;
        this.admob = i2;
    }

    public final void ad(C11325e c11325e) {
        int i = this.ad;
        C4955e c4955e = this.subscription;
        if (i == 0) {
            int m1694catch = c4955e.m1694catch(c11325e, this.admob);
            if (c11325e.f22751public[0] == 3) {
                this.Signature++;
                m1694catch = 0;
            }
            this.advert = m1694catch + (c11325e.f22752return != 8 ? c4955e.f10475e : 0) + this.advert;
            int m1693case = c4955e.m1693case(c11325e, this.admob);
            if (this.vip == null || this.metrica < m1693case) {
                this.vip = c11325e;
                this.metrica = m1693case;
                this.smaato = m1693case;
            }
        } else {
            int m1694catch2 = c4955e.m1694catch(c11325e, this.admob);
            int m1693case2 = c4955e.m1693case(c11325e, this.admob);
            if (c11325e.f22751public[1] == 3) {
                this.Signature++;
                m1693case2 = 0;
            }
            this.smaato = m1693case2 + (c11325e.f22752return != 8 ? c4955e.f10490e : 0) + this.smaato;
            if (this.vip == null || this.metrica < m1694catch2) {
                this.vip = c11325e;
                this.metrica = m1694catch2;
                this.advert = m1694catch2;
            }
        }
        this.loadAd++;
    }

    public final void appmetrica(int i) {
        C4955e c4955e;
        int i2;
        int i3 = this.Signature;
        if (i3 == 0) {
            return;
        }
        int i4 = this.loadAd;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            c4955e = this.subscription;
            if (i6 >= i4 || (i2 = this.amazon + i6) >= c4955e.f10506e) {
                break;
            }
            C11325e c11325e = c4955e.f10499e[i2];
            if (this.ad == 0) {
                if (c11325e != null) {
                    int[] iArr = c11325e.f22751public;
                    if (iArr[0] == 3 && c11325e.subscription == 0) {
                        c4955e.m1695final(1, i5, iArr[1], c11325e.mopub(), c11325e);
                    }
                }
            } else if (c11325e != null) {
                int[] iArr2 = c11325e.f22751public;
                if (iArr2[1] == 3 && c11325e.remoteconfig == 0) {
                    int i7 = i5;
                    c4955e.m1695final(iArr2[0], c11325e.admob(), 1, i7, c11325e);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.advert = 0;
        this.smaato = 0;
        this.vip = null;
        this.metrica = 0;
        int i8 = this.loadAd;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.amazon + i9;
            if (i10 >= c4955e.f10506e) {
                return;
            }
            C11325e c11325e2 = c4955e.f10499e[i10];
            if (this.ad == 0) {
                int admob = c11325e2.admob();
                int i11 = c4955e.f10475e;
                if (c11325e2.f22752return == 8) {
                    i11 = 0;
                }
                this.advert = admob + i11 + this.advert;
                int m1693case = c4955e.m1693case(c11325e2, this.admob);
                if (this.vip == null || this.metrica < m1693case) {
                    this.vip = c11325e2;
                    this.metrica = m1693case;
                    this.smaato = m1693case;
                }
            } else {
                int m1694catch = c4955e.m1694catch(c11325e2, this.admob);
                int m1693case2 = c4955e.m1693case(c11325e2, this.admob);
                int i12 = c4955e.f10490e;
                if (c11325e2.f22752return == 8) {
                    i12 = 0;
                }
                this.smaato = m1693case2 + i12 + this.smaato;
                if (this.vip == null || this.metrica < m1694catch) {
                    this.vip = c11325e2;
                    this.metrica = m1694catch;
                    this.advert = m1694catch;
                }
            }
        }
    }

    public final int license() {
        return this.ad == 0 ? this.advert - this.subscription.f10475e : this.advert;
    }

    public final int metrica() {
        return this.ad == 1 ? this.smaato - this.subscription.f10490e : this.smaato;
    }

    public final void purchase(int i, C9399e c9399e, C9399e c9399e2, C9399e c9399e3, C9399e c9399e4, int i2, int i3, int i4, int i5, int i6) {
        this.ad = i;
        this.license = c9399e;
        this.appmetrica = c9399e2;
        this.purchase = c9399e3;
        this.billing = c9399e4;
        this.yandex = i2;
        this.startapp = i3;
        this.adcel = i4;
        this.mopub = i5;
        this.admob = i6;
    }

    public final void vip(int i, boolean z, boolean z2) {
        C4955e c4955e;
        int i2;
        int i3;
        int i4;
        C11325e c11325e;
        boolean z3;
        int i5;
        int i6;
        char c;
        float f;
        float f2;
        float f3;
        int i7;
        float f4;
        float f5;
        int i8;
        int i9 = this.loadAd;
        int i10 = 0;
        while (true) {
            c4955e = this.subscription;
            if (i10 >= i9 || (i8 = this.amazon + i10) >= c4955e.f10506e) {
                break;
            }
            C11325e c11325e2 = c4955e.f10499e[i8];
            if (c11325e2 != null) {
                c11325e2.crashlytics();
            }
            i10++;
        }
        if (i9 == 0 || this.vip == null) {
            return;
        }
        boolean z4 = z2 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.amazon + (z ? (i9 - 1) - i13 : i13);
            if (i14 >= c4955e.f10506e) {
                break;
            }
            C11325e c11325e3 = c4955e.f10499e[i14];
            if (c11325e3 != null && c11325e3.f22752return == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        if (this.ad == 0) {
            C11325e c11325e4 = this.vip;
            c11325e4.f22760throws = c4955e.f10495e;
            C9399e c9399e = c11325e4.f22759throw;
            C9399e c9399e2 = c11325e4.f22746native;
            int i15 = this.startapp;
            if (i > 0) {
                i15 += c4955e.f10490e;
            }
            c9399e2.ad(this.appmetrica, i15);
            if (z2) {
                c9399e.ad(this.billing, this.mopub);
            }
            if (i > 0) {
                this.appmetrica.license.f22759throw.ad(c9399e2, 0);
            }
            if (c4955e.f10496e == 3 && !c11325e4.firebase) {
                for (int i16 = 0; i16 < i9; i16++) {
                    int i17 = this.amazon + (z ? (i9 - 1) - i16 : i16);
                    if (i17 >= c4955e.f10506e) {
                        break;
                    }
                    c11325e = c4955e.f10499e[i17];
                    if (c11325e.firebase) {
                        break;
                    }
                }
            }
            c11325e = c11325e4;
            int i18 = 0;
            C11325e c11325e5 = null;
            while (i18 < i9) {
                int i19 = z ? (i9 - 1) - i18 : i18;
                int i20 = this.amazon + i19;
                if (i20 >= c4955e.f10506e) {
                    return;
                }
                C11325e c11325e6 = c4955e.f10499e[i20];
                if (c11325e6 == null) {
                    i6 = i9;
                    z3 = z4;
                    i5 = i12;
                    c = 3;
                } else {
                    C9399e c9399e3 = c11325e6.f22759throw;
                    C9399e c9399e4 = c11325e6.f22746native;
                    C9399e c9399e5 = c11325e6.f22758this;
                    z3 = z4;
                    if (i18 == 0) {
                        i5 = i12;
                        c11325e6.purchase(c9399e5, this.license, this.yandex);
                    } else {
                        i5 = i12;
                    }
                    if (i19 == 0) {
                        int i21 = c4955e.f10479e;
                        if (z) {
                            f = 1.0f;
                            f2 = 1.0f - c4955e.f10505e;
                        } else {
                            f = 1.0f;
                            f2 = c4955e.f10505e;
                        }
                        if (this.amazon == 0) {
                            i7 = c4955e.f10489e;
                            f3 = f2;
                            if (i7 != -1) {
                                if (z) {
                                    f5 = c4955e.f10510e;
                                    f4 = f - f5;
                                    c11325e6.f22756switch = i7;
                                    c11325e6.f22744instanceof = f4;
                                } else {
                                    f4 = c4955e.f10510e;
                                    c11325e6.f22756switch = i7;
                                    c11325e6.f22744instanceof = f4;
                                }
                            }
                        } else {
                            f3 = f2;
                        }
                        if (!z2 || (i7 = c4955e.f10478e) == -1) {
                            i7 = i21;
                            f4 = f3;
                        } else if (z) {
                            f5 = c4955e.f10498e;
                            f4 = f - f5;
                        } else {
                            f4 = c4955e.f10498e;
                        }
                        c11325e6.f22756switch = i7;
                        c11325e6.f22744instanceof = f4;
                    }
                    if (i18 == i9 - 1) {
                        i6 = i9;
                        c11325e6.purchase(c11325e6.f22737extends, this.purchase, this.adcel);
                    } else {
                        i6 = i9;
                    }
                    if (c11325e5 != null) {
                        C9399e c9399e6 = c11325e5.f22737extends;
                        c9399e5.ad(c9399e6, c4955e.f10475e);
                        if (i18 == i11) {
                            int i22 = this.yandex;
                            if (c9399e5.yandex()) {
                                c9399e5.yandex = i22;
                            }
                        }
                        c9399e6.ad(c9399e5, 0);
                        if (i18 == i5 + 1) {
                            int i23 = this.adcel;
                            if (c9399e6.yandex()) {
                                c9399e6.yandex = i23;
                            }
                        }
                    }
                    if (c11325e6 != c11325e4) {
                        int i24 = c4955e.f10496e;
                        c = 3;
                        if (i24 == 3 && c11325e.firebase && c11325e6 != c11325e && c11325e6.firebase) {
                            c11325e6.f22764while.ad(c11325e.f22764while, 0);
                        } else if (i24 == 0) {
                            c9399e4.ad(c9399e2, 0);
                        } else if (i24 == 1) {
                            c9399e3.ad(c9399e, 0);
                        } else if (z3) {
                            c9399e4.ad(this.appmetrica, this.startapp);
                            c9399e3.ad(this.billing, this.mopub);
                        } else {
                            c9399e4.ad(c9399e2, 0);
                            c9399e3.ad(c9399e, 0);
                        }
                    } else {
                        c = 3;
                    }
                    c11325e5 = c11325e6;
                }
                i18++;
                z4 = z3;
                i12 = i5;
                i9 = i6;
            }
            return;
        }
        int i25 = i9;
        boolean z5 = z4;
        int i26 = i12;
        C11325e c11325e7 = this.vip;
        c11325e7.f22756switch = c4955e.f10479e;
        C9399e c9399e7 = c11325e7.f22758this;
        C9399e c9399e8 = c11325e7.f22737extends;
        int i27 = this.yandex;
        if (i > 0) {
            i27 += c4955e.f10475e;
        }
        if (z) {
            c9399e8.ad(this.purchase, i27);
            if (z2) {
                c9399e7.ad(this.license, this.adcel);
            }
            if (i > 0) {
                this.purchase.license.f22758this.ad(c9399e8, 0);
            }
        } else {
            c9399e7.ad(this.license, i27);
            if (z2) {
                c9399e8.ad(this.purchase, this.adcel);
            }
            if (i > 0) {
                this.license.license.f22737extends.ad(c9399e7, 0);
            }
        }
        int i28 = 0;
        C11325e c11325e8 = null;
        while (true) {
            int i29 = i25;
            if (i28 >= i29 || (i2 = this.amazon + i28) >= c4955e.f10506e) {
                return;
            }
            C11325e c11325e9 = c4955e.f10499e[i2];
            if (c11325e9 == null) {
                i25 = i29;
            } else {
                C9399e c9399e9 = c11325e9.f22746native;
                C9399e c9399e10 = c11325e9.f22737extends;
                C9399e c9399e11 = c11325e9.f22758this;
                if (i28 == 0) {
                    c11325e9.purchase(c9399e9, this.appmetrica, this.startapp);
                    int i30 = c4955e.f10495e;
                    float f6 = c4955e.f10486e;
                    if (this.amazon == 0) {
                        i4 = c4955e.f10491e;
                        i25 = i29;
                        i3 = -1;
                        if (i4 != -1) {
                            f6 = c4955e.f10494e;
                            i30 = i4;
                            c11325e9.f22760throws = i30;
                            c11325e9.f22753static = f6;
                        }
                    } else {
                        i25 = i29;
                        i3 = -1;
                    }
                    if (z2 && (i4 = c4955e.f10487e) != i3) {
                        f6 = c4955e.f10507e;
                        i30 = i4;
                    }
                    c11325e9.f22760throws = i30;
                    c11325e9.f22753static = f6;
                } else {
                    i25 = i29;
                }
                if (i28 == i25 - 1) {
                    c11325e9.purchase(c11325e9.f22759throw, this.billing, this.mopub);
                }
                if (c11325e8 != null) {
                    C9399e c9399e12 = c11325e8.f22759throw;
                    c9399e9.ad(c9399e12, c4955e.f10490e);
                    if (i28 == i11) {
                        int i31 = this.startapp;
                        if (c9399e9.yandex()) {
                            c9399e9.yandex = i31;
                        }
                    }
                    c9399e12.ad(c9399e9, 0);
                    if (i28 == i26 + 1) {
                        int i32 = this.mopub;
                        if (c9399e12.yandex()) {
                            c9399e12.yandex = i32;
                        }
                    }
                }
                if (c11325e9 != c11325e7) {
                    if (z) {
                        int i33 = c4955e.f10501e;
                        if (i33 == 0) {
                            c9399e10.ad(c9399e8, 0);
                        } else if (i33 == 1) {
                            c9399e11.ad(c9399e7, 0);
                        } else if (i33 == 2) {
                            c9399e11.ad(c9399e7, 0);
                            c9399e10.ad(c9399e8, 0);
                        }
                    } else {
                        int i34 = c4955e.f10501e;
                        if (i34 == 0) {
                            c9399e11.ad(c9399e7, 0);
                        } else if (i34 == 1) {
                            c9399e10.ad(c9399e8, 0);
                        } else if (i34 == 2) {
                            if (z5) {
                                c9399e11.ad(this.license, this.yandex);
                                c9399e10.ad(this.purchase, this.adcel);
                            } else {
                                c9399e11.ad(c9399e7, 0);
                                c9399e10.ad(c9399e8, 0);
                            }
                        }
                        c11325e8 = c11325e9;
                    }
                }
                c11325e8 = c11325e9;
            }
            i28++;
        }
    }
}
