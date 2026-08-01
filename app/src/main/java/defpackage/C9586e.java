package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٛۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9586e extends AbstractC17471e {
    public static final int[] mopub = new int[2];

    public static void smaato(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        if (r5 != 1) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02aa  */
    @Override // defpackage.InterfaceC12462e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad(defpackage.InterfaceC12462e r24) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9586e.ad(eّٕٓ):void");
    }

    public final void amazon() {
        this.billing = false;
        C17455e c17455e = this.yandex;
        c17455e.metrica();
        c17455e.adcel = false;
        C17455e c17455e2 = this.startapp;
        c17455e2.metrica();
        c17455e2.adcel = false;
        this.appmetrica.adcel = false;
    }

    @Override // defpackage.AbstractC17471e
    public final void appmetrica() {
        C17455e c17455e = this.yandex;
        if (c17455e.adcel) {
            this.vip.f22754strictfp = c17455e.billing;
        }
    }

    @Override // defpackage.AbstractC17471e
    public final void license() {
        C11325e c11325e;
        C11325e c11325e2;
        int i;
        C11325e c11325e3;
        C11325e c11325e4;
        int i2;
        C11325e c11325e5 = this.vip;
        boolean z = c11325e5.ad;
        C1542e c1542e = this.appmetrica;
        if (z) {
            c1542e.license(c11325e5.admob());
        }
        boolean z2 = c1542e.adcel;
        ArrayList arrayList = c1542e.mopub;
        ArrayList arrayList2 = c1542e.advert;
        C17455e c17455e = this.startapp;
        C17455e c17455e2 = this.yandex;
        if (!z2) {
            C11325e c11325e6 = this.vip;
            int i3 = c11325e6.f22751public[0];
            this.license = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c11325e4 = c11325e6.f22730case) != null && ((i2 = c11325e4.f22751public[0]) == 1 || i2 == 4)) {
                    int admob = (c11325e4.admob() - this.vip.f22758this.appmetrica()) - this.vip.f22737extends.appmetrica();
                    AbstractC17471e.vip(c17455e2, c11325e4.license.yandex, this.vip.f22758this.appmetrica());
                    AbstractC17471e.vip(c17455e, c11325e4.license.startapp, -this.vip.f22737extends.appmetrica());
                    c1542e.license(admob);
                    return;
                }
                if (i3 == 1) {
                    c1542e.license(c11325e6.admob());
                }
            }
        } else if (this.license == 4 && (c11325e2 = (c11325e = this.vip).f22730case) != null && ((i = c11325e2.f22751public[0]) == 1 || i == 4)) {
            AbstractC17471e.vip(c17455e2, c11325e2.license.yandex, c11325e.f22758this.appmetrica());
            AbstractC17471e.vip(c17455e, c11325e2.license.startapp, -this.vip.f22737extends.appmetrica());
            return;
        }
        if (c1542e.adcel) {
            C11325e c11325e7 = this.vip;
            if (c11325e7.ad) {
                C9399e[] c9399eArr = c11325e7.f22728abstract;
                C9399e c9399e = c9399eArr[0];
                C9399e c9399e2 = c9399e.purchase;
                if (c9399e2 != null && c9399eArr[1].purchase != null) {
                    if (c11325e7.inmobi()) {
                        c17455e2.purchase = this.vip.f22728abstract[0].appmetrica();
                        c17455e.purchase = -this.vip.f22728abstract[1].appmetrica();
                        return;
                    }
                    C17455e yandex = AbstractC17471e.yandex(this.vip.f22728abstract[0]);
                    if (yandex != null) {
                        AbstractC17471e.vip(c17455e2, yandex, this.vip.f22728abstract[0].appmetrica());
                    }
                    C17455e yandex2 = AbstractC17471e.yandex(this.vip.f22728abstract[1]);
                    if (yandex2 != null) {
                        AbstractC17471e.vip(c17455e, yandex2, -this.vip.f22728abstract[1].appmetrica());
                    }
                    c17455e2.vip = true;
                    c17455e.vip = true;
                    return;
                }
                if (c9399e2 != null) {
                    C17455e yandex3 = AbstractC17471e.yandex(c9399e);
                    if (yandex3 != null) {
                        AbstractC17471e.vip(c17455e2, yandex3, this.vip.f22728abstract[0].appmetrica());
                        AbstractC17471e.vip(c17455e, c17455e2, c1542e.billing);
                        return;
                    }
                    return;
                }
                C9399e c9399e3 = c9399eArr[1];
                if (c9399e3.purchase != null) {
                    C17455e yandex4 = AbstractC17471e.yandex(c9399e3);
                    if (yandex4 != null) {
                        AbstractC17471e.vip(c17455e, yandex4, -this.vip.f22728abstract[1].appmetrica());
                        AbstractC17471e.vip(c17455e2, c17455e, -c1542e.billing);
                        return;
                    }
                    return;
                }
                if ((c11325e7 instanceof AbstractC14215e) || c11325e7.f22730case == null || c11325e7.startapp(7).purchase != null) {
                    return;
                }
                C11325e c11325e8 = this.vip;
                AbstractC17471e.vip(c17455e2, c11325e8.f22730case.license.yandex, c11325e8.subscription());
                AbstractC17471e.vip(c17455e, c17455e2, c1542e.billing);
                return;
            }
        }
        if (this.license == 3) {
            C11325e c11325e9 = this.vip;
            int i4 = c11325e9.subscription;
            if (i4 == 2) {
                C11325e c11325e10 = c11325e9.f22730case;
                if (c11325e10 != null) {
                    C1542e c1542e2 = c11325e10.appmetrica.appmetrica;
                    arrayList2.add(c1542e2);
                    c1542e2.mopub.add(c1542e);
                    c1542e.vip = true;
                    arrayList.add(c17455e2);
                    arrayList.add(c17455e);
                }
            } else if (i4 == 3) {
                if (c11325e9.remoteconfig == 3) {
                    c17455e2.ad = this;
                    c17455e.ad = this;
                    C4954e c4954e = c11325e9.appmetrica;
                    c4954e.yandex.ad = this;
                    c4954e.startapp.ad = this;
                    c1542e.ad = this;
                    if (c11325e9.isPro()) {
                        arrayList2.add(this.vip.appmetrica.appmetrica);
                        this.vip.appmetrica.appmetrica.mopub.add(c1542e);
                        C4954e c4954e2 = this.vip.appmetrica;
                        c4954e2.appmetrica.ad = this;
                        arrayList2.add(c4954e2.yandex);
                        arrayList2.add(this.vip.appmetrica.startapp);
                        this.vip.appmetrica.yandex.mopub.add(c1542e);
                        this.vip.appmetrica.startapp.mopub.add(c1542e);
                    } else if (this.vip.inmobi()) {
                        this.vip.appmetrica.appmetrica.advert.add(c1542e);
                        arrayList.add(this.vip.appmetrica.appmetrica);
                    } else {
                        this.vip.appmetrica.appmetrica.advert.add(c1542e);
                    }
                } else {
                    C1542e c1542e3 = c11325e9.appmetrica.appmetrica;
                    arrayList2.add(c1542e3);
                    c1542e3.mopub.add(c1542e);
                    this.vip.appmetrica.yandex.mopub.add(c1542e);
                    this.vip.appmetrica.startapp.mopub.add(c1542e);
                    c1542e.vip = true;
                    arrayList.add(c17455e2);
                    arrayList.add(c17455e);
                    c17455e2.advert.add(c1542e);
                    c17455e.advert.add(c1542e);
                }
            }
        }
        C11325e c11325e11 = this.vip;
        C9399e[] c9399eArr2 = c11325e11.f22728abstract;
        C9399e c9399e4 = c9399eArr2[0];
        C9399e c9399e5 = c9399e4.purchase;
        if (c9399e5 != null && c9399eArr2[1].purchase != null) {
            if (c11325e11.inmobi()) {
                c17455e2.purchase = this.vip.f22728abstract[0].appmetrica();
                c17455e.purchase = -this.vip.f22728abstract[1].appmetrica();
                return;
            }
            C17455e yandex5 = AbstractC17471e.yandex(this.vip.f22728abstract[0]);
            C17455e yandex6 = AbstractC17471e.yandex(this.vip.f22728abstract[1]);
            if (yandex5 != null) {
                yandex5.vip(this);
            }
            if (yandex6 != null) {
                yandex6.vip(this);
            }
            this.adcel = 4;
            return;
        }
        if (c9399e5 != null) {
            C17455e yandex7 = AbstractC17471e.yandex(c9399e4);
            if (yandex7 != null) {
                AbstractC17471e.vip(c17455e2, yandex7, this.vip.f22728abstract[0].appmetrica());
                metrica(c17455e, c17455e2, 1, c1542e);
                return;
            }
            return;
        }
        C9399e c9399e6 = c9399eArr2[1];
        if (c9399e6.purchase != null) {
            C17455e yandex8 = AbstractC17471e.yandex(c9399e6);
            if (yandex8 != null) {
                AbstractC17471e.vip(c17455e, yandex8, -this.vip.f22728abstract[1].appmetrica());
                metrica(c17455e2, c17455e, -1, c1542e);
                return;
            }
            return;
        }
        if ((c11325e11 instanceof AbstractC14215e) || (c11325e3 = c11325e11.f22730case) == null) {
            return;
        }
        AbstractC17471e.vip(c17455e2, c11325e3.license.yandex, c11325e11.subscription());
        metrica(c17455e, c17455e2, 1, c1542e);
    }

    @Override // defpackage.AbstractC17471e
    public final boolean mopub() {
        return this.license != 3 || this.vip.subscription == 0;
    }

    @Override // defpackage.AbstractC17471e
    public final void purchase() {
        this.metrica = null;
        this.yandex.metrica();
        this.startapp.metrica();
        this.appmetrica.metrica();
        this.billing = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.vip.f22736else;
    }
}
