package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؒٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0913e extends C11325e {

    /* renamed from: eؘْؖ, reason: contains not printable characters */
    public boolean f3337e;

    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public float f3340e = -1.0f;

    /* renamed from: eًًؓ, reason: contains not printable characters */
    public int f3338e = -1;

    /* renamed from: eُؚٕ, reason: contains not printable characters */
    public int f3339e = -1;

    /* renamed from: eؒۤۨ, reason: contains not printable characters */
    public C9399e f3336e = this.f22746native;

    /* renamed from: eؑۥؘ, reason: contains not printable characters */
    public int f3335e = 0;

    public C0913e() {
        this.f22735default.clear();
        this.f22735default.add(this.f3336e);
        int length = this.f22728abstract.length;
        for (int i = 0; i < length; i++) {
            this.f22728abstract[i] = this.f3336e;
        }
    }

    @Override // defpackage.C11325e
    /* renamed from: abstract, reason: not valid java name */
    public final void mo429abstract(C17677e c17677e, boolean z) {
        if (this.f22730case == null) {
            return;
        }
        C9399e c9399e = this.f3336e;
        c17677e.getClass();
        int amazon = C17677e.amazon(c9399e);
        if (this.f3335e == 1) {
            this.f22754strictfp = amazon;
            this.f22749private = 0;
            m3197throw(this.f22730case.mopub());
            m3195protected(0);
            return;
        }
        this.f22754strictfp = 0;
        this.f22749private = amazon;
        m3195protected(this.f22730case.admob());
        m3197throw(0);
    }

    @Override // defpackage.C11325e
    public final boolean ads() {
        return this.f3337e;
    }

    /* renamed from: default, reason: not valid java name */
    public final void m430default(int i) {
        this.f3336e.advert(i);
        this.f3337e = true;
    }

    /* renamed from: implements, reason: not valid java name */
    public final void m431implements(int i) {
        if (this.f3335e == i) {
            return;
        }
        this.f3335e = i;
        ArrayList arrayList = this.f22735default;
        arrayList.clear();
        if (this.f3335e == 1) {
            this.f3336e = this.f22758this;
        } else {
            this.f3336e = this.f22746native;
        }
        arrayList.add(this.f3336e);
        C9399e[] c9399eArr = this.f22728abstract;
        int length = c9399eArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c9399eArr[i2] = this.f3336e;
        }
    }

    @Override // defpackage.C11325e
    public final boolean metrica() {
        return true;
    }

    @Override // defpackage.C11325e
    public final boolean premium() {
        return this.f3337e;
    }

    @Override // defpackage.C11325e
    public final C9399e startapp(int i) {
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class != 1) {
            if (m2467class != 2) {
                if (m2467class != 3) {
                    if (m2467class != 4) {
                        return null;
                    }
                }
            }
            if (this.f3335e == 0) {
                return this.f3336e;
            }
            return null;
        }
        if (this.f3335e == 1) {
            return this.f3336e;
        }
        return null;
    }

    @Override // defpackage.C11325e
    public final void vip(C17677e c17677e, boolean z) {
        C17688e c17688e = (C17688e) this.f22730case;
        if (c17688e == null) {
            return;
        }
        Object startapp = c17688e.startapp(2);
        Object startapp2 = c17688e.startapp(4);
        C11325e c11325e = this.f22730case;
        boolean z2 = c11325e != null && c11325e.f22751public[0] == 2;
        if (this.f3335e == 0) {
            startapp = c17688e.startapp(3);
            startapp2 = c17688e.startapp(5);
            C11325e c11325e2 = this.f22730case;
            z2 = c11325e2 != null && c11325e2.f22751public[1] == 2;
        }
        if (this.f3337e) {
            C9399e c9399e = this.f3336e;
            if (c9399e.metrica) {
                C0511e mopub = c17677e.mopub(c9399e);
                c17677e.license(mopub, this.f3336e.license());
                if (this.f3338e != -1) {
                    if (z2) {
                        c17677e.purchase(c17677e.mopub(startapp2), mopub, 0, 5);
                    }
                } else if (this.f3339e != -1 && z2) {
                    C0511e mopub2 = c17677e.mopub(startapp2);
                    c17677e.purchase(mopub, c17677e.mopub(startapp), 0, 5);
                    c17677e.purchase(mopub2, mopub, 0, 5);
                }
                this.f3337e = false;
                return;
            }
        }
        if (this.f3338e != -1) {
            C0511e mopub3 = c17677e.mopub(this.f3336e);
            c17677e.appmetrica(mopub3, c17677e.mopub(startapp), this.f3338e, 8);
            if (z2) {
                c17677e.purchase(c17677e.mopub(startapp2), mopub3, 0, 5);
                return;
            }
            return;
        }
        if (this.f3339e != -1) {
            C0511e mopub4 = c17677e.mopub(this.f3336e);
            C0511e mopub5 = c17677e.mopub(startapp2);
            c17677e.appmetrica(mopub4, mopub5, -this.f3339e, 8);
            if (z2) {
                c17677e.purchase(mopub4, c17677e.mopub(startapp), 0, 5);
                c17677e.purchase(mopub5, mopub4, 0, 5);
                return;
            }
            return;
        }
        if (this.f3340e != -1.0f) {
            C0511e mopub6 = c17677e.mopub(this.f3336e);
            C0511e mopub7 = c17677e.mopub(startapp2);
            float f = this.f3340e;
            C0294e advert = c17677e.advert();
            advert.license.billing(mopub6, -1.0f);
            advert.license.billing(mopub7, f);
            c17677e.metrica(advert);
        }
    }
}
