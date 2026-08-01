package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؙٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15380e extends AbstractC14215e {

    /* renamed from: eؑۥؘ, reason: contains not printable characters */
    public int f30317e;

    /* renamed from: eؒۤۨ, reason: contains not printable characters */
    public boolean f30318e;

    /* renamed from: eؘْؖ, reason: contains not printable characters */
    public boolean f30319e;

    /* renamed from: eُؚٕ, reason: contains not printable characters */
    public int f30320e;

    @Override // defpackage.C11325e
    public final boolean ads() {
        return this.f30319e;
    }

    /* renamed from: case, reason: not valid java name */
    public final boolean m3936case() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f28080e;
            if (i4 >= i) {
                break;
            }
            C11325e c11325e = this.f28081e[i4];
            if ((this.f30318e || c11325e.metrica()) && ((((i2 = this.f30320e) == 0 || i2 == 1) && !c11325e.ads()) || (((i3 = this.f30320e) == 2 || i3 == 3) && !c11325e.premium()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.f28080e; i6++) {
            C11325e c11325e2 = this.f28081e[i6];
            if (this.f30318e || c11325e2.metrica()) {
                if (!z2) {
                    int i7 = this.f30320e;
                    if (i7 == 0) {
                        i5 = c11325e2.startapp(2).license();
                    } else if (i7 == 1) {
                        i5 = c11325e2.startapp(4).license();
                    } else if (i7 == 2) {
                        i5 = c11325e2.startapp(3).license();
                    } else if (i7 == 3) {
                        i5 = c11325e2.startapp(5).license();
                    }
                    z2 = true;
                }
                int i8 = this.f30320e;
                if (i8 == 0) {
                    i5 = Math.min(i5, c11325e2.startapp(2).license());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, c11325e2.startapp(4).license());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, c11325e2.startapp(3).license());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, c11325e2.startapp(5).license());
                }
            }
        }
        int i9 = i5 + this.f30317e;
        int i10 = this.f30320e;
        if (i10 == 0 || i10 == 1) {
            m3194native(i9, i9);
        } else {
            m3193extends(i9, i9);
        }
        this.f30319e = true;
        return true;
    }

    /* renamed from: catch, reason: not valid java name */
    public final int m3937catch() {
        int i = this.f30320e;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.C11325e
    public final boolean metrica() {
        return true;
    }

    @Override // defpackage.C11325e
    public final boolean premium() {
        return this.f30319e;
    }

    @Override // defpackage.C11325e
    public final String toString() {
        String signatures = AbstractC1786e.signatures(new StringBuilder("[Barrier] "), this.f22736else, " {");
        for (int i = 0; i < this.f28080e; i++) {
            C11325e c11325e = this.f28081e[i];
            if (i > 0) {
                signatures = AbstractC10257e.adcel(signatures, ", ");
            }
            StringBuilder inmobi = AbstractC8703e.inmobi(signatures);
            inmobi.append(c11325e.f22736else);
            signatures = inmobi.toString();
        }
        return AbstractC10257e.adcel(signatures, "}");
    }

    @Override // defpackage.C11325e
    public final void vip(C17677e c17677e, boolean z) {
        boolean z2;
        int i;
        int i2;
        C9399e[] c9399eArr = this.f22728abstract;
        C9399e c9399e = this.f22758this;
        c9399eArr[0] = c9399e;
        int i3 = 2;
        C9399e c9399e2 = this.f22746native;
        c9399eArr[2] = c9399e2;
        C9399e c9399e3 = this.f22737extends;
        c9399eArr[1] = c9399e3;
        C9399e c9399e4 = this.f22759throw;
        c9399eArr[3] = c9399e4;
        for (C9399e c9399e5 : c9399eArr) {
            c9399e5.startapp = c17677e.mopub(c9399e5);
        }
        int i4 = this.f30320e;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C9399e c9399e6 = c9399eArr[i4];
        if (!this.f30319e) {
            m3936case();
        }
        if (this.f30319e) {
            this.f30319e = false;
            int i5 = this.f30320e;
            if (i5 == 0 || i5 == 1) {
                c17677e.license(c9399e.startapp, this.f22754strictfp);
                c17677e.license(c9399e3.startapp, this.f22754strictfp);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c17677e.license(c9399e2.startapp, this.f22749private);
                    c17677e.license(c9399e4.startapp, this.f22749private);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.f28080e; i6++) {
            C11325e c11325e = this.f28081e[i6];
            if ((this.f30318e || c11325e.metrica()) && ((((i2 = this.f30320e) == 0 || i2 == 1) && c11325e.f22751public[0] == 3 && c11325e.f22758this.purchase != null && c11325e.f22737extends.purchase != null) || ((i2 == 2 || i2 == 3) && c11325e.f22751public[1] == 3 && c11325e.f22746native.purchase != null && c11325e.f22759throw.purchase != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = c9399e.billing() || c9399e3.billing();
        boolean z4 = c9399e2.billing() || c9399e4.billing();
        int i7 = !(!z2 && (((i = this.f30320e) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f28080e) {
            C11325e c11325e2 = this.f28081e[i8];
            if (this.f30318e || c11325e2.metrica()) {
                C0511e mopub = c17677e.mopub(c11325e2.f22728abstract[this.f30320e]);
                C9399e[] c9399eArr2 = c11325e2.f22728abstract;
                int i9 = this.f30320e;
                C9399e c9399e7 = c9399eArr2[i9];
                c9399e7.startapp = mopub;
                C9399e c9399e8 = c9399e7.purchase;
                int i10 = (c9399e8 == null || c9399e8.license != this) ? 0 : c9399e7.billing;
                if (i9 == 0 || i9 == i3) {
                    C0511e c0511e = c9399e6.startapp;
                    int i11 = this.f30317e - i10;
                    C0294e advert = c17677e.advert();
                    C0511e smaato = c17677e.smaato();
                    smaato.f2619e = 0;
                    advert.metrica(c0511e, mopub, smaato, i11);
                    c17677e.metrica(advert);
                } else {
                    C0511e c0511e2 = c9399e6.startapp;
                    int i12 = this.f30317e + i10;
                    C0294e advert2 = c17677e.advert();
                    C0511e smaato2 = c17677e.smaato();
                    smaato2.f2619e = 0;
                    advert2.vip(c0511e2, mopub, smaato2, i12);
                    c17677e.metrica(advert2);
                }
                c17677e.appmetrica(c9399e6.startapp, mopub, this.f30317e + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f30320e;
        if (i13 == 0) {
            c17677e.appmetrica(c9399e3.startapp, c9399e.startapp, 0, 8);
            c17677e.appmetrica(c9399e.startapp, this.f22730case.f22737extends.startapp, 0, 4);
            c17677e.appmetrica(c9399e.startapp, this.f22730case.f22758this.startapp, 0, 0);
            return;
        }
        if (i13 == 1) {
            c17677e.appmetrica(c9399e.startapp, c9399e3.startapp, 0, 8);
            c17677e.appmetrica(c9399e.startapp, this.f22730case.f22758this.startapp, 0, 4);
            c17677e.appmetrica(c9399e.startapp, this.f22730case.f22737extends.startapp, 0, 0);
        } else if (i13 == 2) {
            c17677e.appmetrica(c9399e4.startapp, c9399e2.startapp, 0, 8);
            c17677e.appmetrica(c9399e2.startapp, this.f22730case.f22759throw.startapp, 0, 4);
            c17677e.appmetrica(c9399e2.startapp, this.f22730case.f22746native.startapp, 0, 0);
        } else if (i13 == 3) {
            c17677e.appmetrica(c9399e2.startapp, c9399e4.startapp, 0, 8);
            c17677e.appmetrica(c9399e2.startapp, this.f22730case.f22746native.startapp, 0, 4);
            c17677e.appmetrica(c9399e2.startapp, this.f22730case.f22759throw.startapp, 0, 0);
        }
    }
}
