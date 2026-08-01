package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٞؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11874e {
    public final C13915e ad;
    public boolean adcel;
    public C17596e admob;
    public int advert;
    public boolean amazon;
    public boolean appmetrica;
    public boolean billing;
    public int loadAd;
    public boolean metrica;
    public boolean mopub;
    public boolean purchase;
    public boolean smaato;
    public int startapp;
    public boolean vip;
    public int yandex;
    public int license = 5;
    public final C12570e Signature = new C12570e(this);

    public C11874e(C13915e c13915e) {
        this.ad = c13915e;
    }

    public final AbstractC17732e ad() {
        return (AbstractC17732e) this.ad.f27592e.appmetrica;
    }

    public final void adcel() {
        C12570e c12570e = this.Signature;
        C11874e c11874e = c12570e.f25213e;
        Object obj = c12570e.f25187e;
        C13915e c13915e = this.ad;
        if ((obj != null || c11874e.ad().signatures() != null) && c12570e.f25190e) {
            c12570e.f25190e = false;
            c12570e.f25187e = c11874e.ad().signatures();
            C13915e tapsense = c13915e.tapsense();
            if (tapsense != null) {
                C13915e.m3699strictfp(tapsense, false, 7);
            }
        }
        C17596e c17596e = this.admob;
        if (c17596e != null) {
            C11874e c11874e2 = c17596e.f34480e;
            if (!(c17596e.f34472e == null && c11874e2.ad().mo2526e().f9109e.signatures() == null) && c17596e.f34478e) {
                c17596e.f34478e = false;
                c17596e.f34472e = c11874e2.ad().mo2526e().f9109e.signatures();
                if (AbstractC2467e.startapp(c13915e)) {
                    C13915e tapsense2 = c13915e.tapsense();
                    if (tapsense2 != null) {
                        C13915e.m3699strictfp(tapsense2, false, 7);
                        return;
                    }
                    return;
                }
                C13915e tapsense3 = c13915e.tapsense();
                if (tapsense3 != null) {
                    C13915e.m3700super(tapsense3, false, 7);
                }
            }
        }
    }

    public final void appmetrica(int i) {
        int i2 = this.loadAd;
        this.loadAd = i;
        if ((i2 == 0) != (i == 0)) {
            C13915e tapsense = this.ad.tapsense();
            C11874e c11874e = tapsense != null ? tapsense.f27612e : null;
            if (c11874e != null) {
                if (i == 0) {
                    c11874e.appmetrica(c11874e.loadAd - 1);
                } else {
                    c11874e.appmetrica(c11874e.loadAd + 1);
                }
            }
        }
    }

    public final void billing(boolean z) {
        if (this.adcel != z) {
            this.adcel = z;
            if (z && !this.mopub) {
                license(this.advert + 1);
            } else {
                if (z || this.mopub) {
                    return;
                }
                license(this.advert - 1);
            }
        }
    }

    public final void license(int i) {
        int i2 = this.advert;
        this.advert = i;
        if ((i2 == 0) != (i == 0)) {
            C13915e tapsense = this.ad.tapsense();
            C11874e c11874e = tapsense != null ? tapsense.f27612e : null;
            if (c11874e != null) {
                if (i == 0) {
                    c11874e.license(c11874e.advert - 1);
                } else {
                    c11874e.license(c11874e.advert + 1);
                }
            }
        }
    }

    public final void metrica(long j) {
        C17596e c17596e = this.admob;
        if (c17596e != null) {
            C11874e c11874e = c17596e.f34480e;
            c11874e.license = 2;
            C12570e c12570e = c11874e.Signature;
            C13915e c13915e = c11874e.ad;
            c11874e.appmetrica = false;
            c17596e.f34469e = j;
            C15087e snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(c13915e)).getSnapshotObserver();
            C0985e c0985e = c17596e.f34470e;
            snapshotObserver.ad.metrica(c13915e, snapshotObserver.vip, c0985e);
            c11874e.purchase = true;
            c11874e.billing = true;
            if (AbstractC2467e.startapp(c13915e)) {
                c12570e.f25200e = true;
                c12570e.f25206e = true;
            } else {
                c12570e.f25185e = true;
            }
            c11874e.license = 5;
        }
    }

    public final void purchase(boolean z) {
        if (this.mopub != z) {
            this.mopub = z;
            if (z && !this.adcel) {
                license(this.advert + 1);
            } else {
                if (z || this.adcel) {
                    return;
                }
                license(this.advert - 1);
            }
        }
    }

    public final void startapp(boolean z) {
        if (this.smaato != z) {
            this.smaato = z;
            if (z && !this.amazon) {
                appmetrica(this.loadAd + 1);
            } else {
                if (z || this.amazon) {
                    return;
                }
                appmetrica(this.loadAd - 1);
            }
        }
    }

    public final void vip() {
        int i = this.ad.f27612e.license;
        if (i == 3 || i == 4) {
            if (this.Signature.f25197e) {
                billing(true);
            } else {
                purchase(true);
            }
        }
        if (i == 4) {
            C17596e c17596e = this.admob;
            if (c17596e == null || !c17596e.f34473e) {
                yandex(true);
            } else {
                startapp(true);
            }
        }
    }

    public final void yandex(boolean z) {
        if (this.amazon != z) {
            this.amazon = z;
            if (z && !this.smaato) {
                appmetrica(this.loadAd + 1);
            } else {
                if (z || this.smaato) {
                    return;
                }
                appmetrica(this.loadAd - 1);
            }
        }
    }
}
