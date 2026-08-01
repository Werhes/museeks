package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؗ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4954e extends AbstractC17471e {
    public C4515e advert;
    public C17455e mopub;

    @Override // defpackage.InterfaceC12462e
    public final void ad(InterfaceC12462e interfaceC12462e) {
        float f;
        float f2;
        float f3;
        int i;
        if (AbstractC8703e.m2467class(this.adcel) == 3) {
            C11325e c11325e = this.vip;
            advert(c11325e.f22746native, c11325e.f22759throw, 1);
            return;
        }
        C1542e c1542e = this.appmetrica;
        if (c1542e.metrica && !c1542e.adcel && this.license == 3) {
            C11325e c11325e2 = this.vip;
            int i2 = c11325e2.remoteconfig;
            if (i2 == 2) {
                C11325e c11325e3 = c11325e2.f22730case;
                if (c11325e3 != null) {
                    if (c11325e3.appmetrica.appmetrica.adcel) {
                        c1542e.license((int) ((r5.billing * c11325e2.applovin) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C1542e c1542e2 = c11325e2.license.appmetrica;
                if (c1542e2.adcel) {
                    int i3 = c11325e2.f22747new;
                    if (i3 == -1) {
                        f = c1542e2.billing;
                        f2 = c11325e2.f22755super;
                    } else if (i3 == 0) {
                        f3 = c1542e2.billing * c11325e2.f22755super;
                        i = (int) (f3 + 0.5f);
                        c1542e.license(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c1542e.license(i);
                    } else {
                        f = c1542e2.billing;
                        f2 = c11325e2.f22755super;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    c1542e.license(i);
                }
            }
        }
        C17455e c17455e = this.yandex;
        boolean z = c17455e.metrica;
        ArrayList arrayList = c17455e.advert;
        if (z) {
            C17455e c17455e2 = this.startapp;
            boolean z2 = c17455e2.metrica;
            ArrayList arrayList2 = c17455e2.advert;
            if (z2) {
                if (c17455e.adcel && c17455e2.adcel && c1542e.adcel) {
                    return;
                }
                if (!c1542e.adcel && this.license == 3) {
                    C11325e c11325e4 = this.vip;
                    if (c11325e4.subscription == 0 && !c11325e4.isPro()) {
                        C17455e c17455e3 = (C17455e) arrayList.get(0);
                        C17455e c17455e4 = (C17455e) arrayList2.get(0);
                        int i4 = c17455e3.billing + c17455e.purchase;
                        int i5 = c17455e4.billing + c17455e2.purchase;
                        c17455e.license(i4);
                        c17455e2.license(i5);
                        c1542e.license(i5 - i4);
                        return;
                    }
                }
                if (!c1542e.adcel && this.license == 3 && this.ad == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C17455e c17455e5 = (C17455e) arrayList.get(0);
                    int i6 = (((C17455e) arrayList2.get(0)).billing + c17455e2.purchase) - (c17455e5.billing + c17455e.purchase);
                    int i7 = c1542e.smaato;
                    if (i6 < i7) {
                        c1542e.license(i6);
                    } else {
                        c1542e.license(i7);
                    }
                }
                if (c1542e.adcel && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C17455e c17455e6 = (C17455e) arrayList.get(0);
                    C17455e c17455e7 = (C17455e) arrayList2.get(0);
                    int i8 = c17455e6.billing;
                    int i9 = c17455e.purchase + i8;
                    int i10 = c17455e7.billing;
                    int i11 = c17455e2.purchase + i10;
                    float f4 = this.vip.f22753static;
                    if (c17455e6 == c17455e7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c17455e.license((int) ((((i10 - i8) - c1542e.billing) * f4) + i8 + 0.5f));
                    c17455e2.license(c17455e.billing + c1542e.billing);
                }
            }
        }
    }

    @Override // defpackage.AbstractC17471e
    public final void appmetrica() {
        C17455e c17455e = this.yandex;
        if (c17455e.adcel) {
            this.vip.f22749private = c17455e.billing;
        }
    }

    /* JADX WARN: Type inference failed for: r1v120, types: [eؖۦۥ, eۣؓؒ] */
    @Override // defpackage.AbstractC17471e
    public final void license() {
        C11325e c11325e;
        C11325e c11325e2;
        C11325e c11325e3;
        C11325e c11325e4;
        C17455e c17455e = this.mopub;
        C11325e c11325e5 = this.vip;
        boolean z = c11325e5.ad;
        C1542e c1542e = this.appmetrica;
        if (z) {
            c1542e.license(c11325e5.mopub());
        }
        boolean z2 = c1542e.adcel;
        ArrayList arrayList = c1542e.mopub;
        ArrayList arrayList2 = c1542e.advert;
        C17455e c17455e2 = this.startapp;
        C17455e c17455e3 = this.yandex;
        if (!z2) {
            C11325e c11325e6 = this.vip;
            this.license = c11325e6.f22751public[1];
            if (c11325e6.firebase) {
                this.advert = new C1542e(this);
            }
            int i = this.license;
            if (i != 3) {
                if (i == 4 && (c11325e4 = this.vip.f22730case) != null && c11325e4.f22751public[1] == 1) {
                    int mopub = (c11325e4.mopub() - this.vip.f22746native.appmetrica()) - this.vip.f22759throw.appmetrica();
                    AbstractC17471e.vip(c17455e3, c11325e4.appmetrica.yandex, this.vip.f22746native.appmetrica());
                    AbstractC17471e.vip(c17455e2, c11325e4.appmetrica.startapp, -this.vip.f22759throw.appmetrica());
                    c1542e.license(mopub);
                    return;
                }
                if (i == 1) {
                    c1542e.license(this.vip.mopub());
                }
            }
        } else if (this.license == 4 && (c11325e2 = (c11325e = this.vip).f22730case) != null && c11325e2.f22751public[1] == 1) {
            AbstractC17471e.vip(c17455e3, c11325e2.appmetrica.yandex, c11325e.f22746native.appmetrica());
            AbstractC17471e.vip(c17455e2, c11325e2.appmetrica.startapp, -this.vip.f22759throw.appmetrica());
            return;
        }
        boolean z3 = c1542e.adcel;
        if (z3) {
            C11325e c11325e7 = this.vip;
            if (c11325e7.ad) {
                C9399e[] c9399eArr = c11325e7.f22728abstract;
                C9399e c9399e = c9399eArr[2];
                C9399e c9399e2 = c9399e.purchase;
                if (c9399e2 != null && c9399eArr[3].purchase != null) {
                    if (c11325e7.isPro()) {
                        c17455e3.purchase = this.vip.f22728abstract[2].appmetrica();
                        c17455e2.purchase = -this.vip.f22728abstract[3].appmetrica();
                    } else {
                        C17455e yandex = AbstractC17471e.yandex(this.vip.f22728abstract[2]);
                        if (yandex != null) {
                            AbstractC17471e.vip(c17455e3, yandex, this.vip.f22728abstract[2].appmetrica());
                        }
                        C17455e yandex2 = AbstractC17471e.yandex(this.vip.f22728abstract[3]);
                        if (yandex2 != null) {
                            AbstractC17471e.vip(c17455e2, yandex2, -this.vip.f22728abstract[3].appmetrica());
                        }
                        c17455e3.vip = true;
                        c17455e2.vip = true;
                    }
                    C11325e c11325e8 = this.vip;
                    if (c11325e8.firebase) {
                        AbstractC17471e.vip(c17455e, c17455e3, c11325e8.f22748package);
                        return;
                    }
                    return;
                }
                if (c9399e2 != null) {
                    C17455e yandex3 = AbstractC17471e.yandex(c9399e);
                    if (yandex3 != null) {
                        AbstractC17471e.vip(c17455e3, yandex3, this.vip.f22728abstract[2].appmetrica());
                        AbstractC17471e.vip(c17455e2, c17455e3, c1542e.billing);
                        C11325e c11325e9 = this.vip;
                        if (c11325e9.firebase) {
                            AbstractC17471e.vip(c17455e, c17455e3, c11325e9.f22748package);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C9399e c9399e3 = c9399eArr[3];
                if (c9399e3.purchase != null) {
                    C17455e yandex4 = AbstractC17471e.yandex(c9399e3);
                    if (yandex4 != null) {
                        AbstractC17471e.vip(c17455e2, yandex4, -this.vip.f22728abstract[3].appmetrica());
                        AbstractC17471e.vip(c17455e3, c17455e2, -c1542e.billing);
                    }
                    C11325e c11325e10 = this.vip;
                    if (c11325e10.firebase) {
                        AbstractC17471e.vip(c17455e, c17455e3, c11325e10.f22748package);
                        return;
                    }
                    return;
                }
                C9399e c9399e4 = c9399eArr[4];
                if (c9399e4.purchase != null) {
                    C17455e yandex5 = AbstractC17471e.yandex(c9399e4);
                    if (yandex5 != null) {
                        AbstractC17471e.vip(c17455e, yandex5, 0);
                        AbstractC17471e.vip(c17455e3, c17455e, -this.vip.f22748package);
                        AbstractC17471e.vip(c17455e2, c17455e3, c1542e.billing);
                        return;
                    }
                    return;
                }
                if ((c11325e7 instanceof AbstractC14215e) || c11325e7.f22730case == null || c11325e7.startapp(7).purchase != null) {
                    return;
                }
                C11325e c11325e11 = this.vip;
                AbstractC17471e.vip(c17455e3, c11325e11.f22730case.appmetrica.yandex, c11325e11.remoteconfig());
                AbstractC17471e.vip(c17455e2, c17455e3, c1542e.billing);
                C11325e c11325e12 = this.vip;
                if (c11325e12.firebase) {
                    AbstractC17471e.vip(c17455e, c17455e3, c11325e12.f22748package);
                    return;
                }
                return;
            }
        }
        if (z3 || this.license != 3) {
            c1542e.vip(this);
        } else {
            C11325e c11325e13 = this.vip;
            int i2 = c11325e13.remoteconfig;
            if (i2 == 2) {
                C11325e c11325e14 = c11325e13.f22730case;
                if (c11325e14 != null) {
                    C1542e c1542e2 = c11325e14.appmetrica.appmetrica;
                    arrayList2.add(c1542e2);
                    c1542e2.mopub.add(c1542e);
                    c1542e.vip = true;
                    arrayList.add(c17455e3);
                    arrayList.add(c17455e2);
                }
            } else if (i2 == 3 && !c11325e13.isPro()) {
                C11325e c11325e15 = this.vip;
                if (c11325e15.subscription != 3) {
                    C1542e c1542e3 = c11325e15.license.appmetrica;
                    arrayList2.add(c1542e3);
                    c1542e3.mopub.add(c1542e);
                    c1542e.vip = true;
                    arrayList.add(c17455e3);
                    arrayList.add(c17455e2);
                }
            }
        }
        C11325e c11325e16 = this.vip;
        C9399e[] c9399eArr2 = c11325e16.f22728abstract;
        C9399e c9399e5 = c9399eArr2[2];
        C9399e c9399e6 = c9399e5.purchase;
        if (c9399e6 != null && c9399eArr2[3].purchase != null) {
            if (c11325e16.isPro()) {
                c17455e3.purchase = this.vip.f22728abstract[2].appmetrica();
                c17455e2.purchase = -this.vip.f22728abstract[3].appmetrica();
            } else {
                C17455e yandex6 = AbstractC17471e.yandex(this.vip.f22728abstract[2]);
                C17455e yandex7 = AbstractC17471e.yandex(this.vip.f22728abstract[3]);
                if (yandex6 != null) {
                    yandex6.vip(this);
                }
                if (yandex7 != null) {
                    yandex7.vip(this);
                }
                this.adcel = 4;
            }
            if (this.vip.firebase) {
                metrica(c17455e, c17455e3, 1, this.advert);
            }
        } else if (c9399e6 != null) {
            C17455e yandex8 = AbstractC17471e.yandex(c9399e5);
            if (yandex8 != null) {
                AbstractC17471e.vip(c17455e3, yandex8, this.vip.f22728abstract[2].appmetrica());
                metrica(c17455e2, c17455e3, 1, c1542e);
                if (this.vip.firebase) {
                    metrica(c17455e, c17455e3, 1, this.advert);
                }
                if (this.license == 3) {
                    C11325e c11325e17 = this.vip;
                    if (c11325e17.f22755super > 0.0f) {
                        C9586e c9586e = c11325e17.license;
                        if (c9586e.license == 3) {
                            c9586e.appmetrica.mopub.add(c1542e);
                            arrayList2.add(this.vip.license.appmetrica);
                            c1542e.ad = this;
                        }
                    }
                }
            }
        } else {
            C9399e c9399e7 = c9399eArr2[3];
            if (c9399e7.purchase != null) {
                C17455e yandex9 = AbstractC17471e.yandex(c9399e7);
                if (yandex9 != null) {
                    AbstractC17471e.vip(c17455e2, yandex9, -this.vip.f22728abstract[3].appmetrica());
                    metrica(c17455e3, c17455e2, -1, c1542e);
                    if (this.vip.firebase) {
                        metrica(c17455e, c17455e3, 1, this.advert);
                    }
                }
            } else {
                C9399e c9399e8 = c9399eArr2[4];
                if (c9399e8.purchase != null) {
                    C17455e yandex10 = AbstractC17471e.yandex(c9399e8);
                    if (yandex10 != null) {
                        AbstractC17471e.vip(c17455e, yandex10, 0);
                        metrica(c17455e3, c17455e, -1, this.advert);
                        metrica(c17455e2, c17455e3, 1, c1542e);
                    }
                } else if (!(c11325e16 instanceof AbstractC14215e) && (c11325e3 = c11325e16.f22730case) != null) {
                    AbstractC17471e.vip(c17455e3, c11325e3.appmetrica.yandex, c11325e16.remoteconfig());
                    metrica(c17455e2, c17455e3, 1, c1542e);
                    if (this.vip.firebase) {
                        metrica(c17455e, c17455e3, 1, this.advert);
                    }
                    if (this.license == 3) {
                        C11325e c11325e18 = this.vip;
                        if (c11325e18.f22755super > 0.0f) {
                            C9586e c9586e2 = c11325e18.license;
                            if (c9586e2.license == 3) {
                                c9586e2.appmetrica.mopub.add(c1542e);
                                arrayList2.add(this.vip.license.appmetrica);
                                c1542e.ad = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            c1542e.metrica = true;
        }
    }

    @Override // defpackage.AbstractC17471e
    public final boolean mopub() {
        return this.license != 3 || this.vip.remoteconfig == 0;
    }

    @Override // defpackage.AbstractC17471e
    public final void purchase() {
        this.metrica = null;
        this.yandex.metrica();
        this.startapp.metrica();
        this.mopub.metrica();
        this.appmetrica.metrica();
        this.billing = false;
    }

    public final void smaato() {
        this.billing = false;
        C17455e c17455e = this.yandex;
        c17455e.metrica();
        c17455e.adcel = false;
        C17455e c17455e2 = this.startapp;
        c17455e2.metrica();
        c17455e2.adcel = false;
        C17455e c17455e3 = this.mopub;
        c17455e3.metrica();
        c17455e3.adcel = false;
        this.appmetrica.adcel = false;
    }

    public final String toString() {
        return "VerticalRun " + this.vip.f22736else;
    }
}
