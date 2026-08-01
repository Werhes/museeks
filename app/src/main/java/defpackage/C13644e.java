package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۧؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13644e implements InterfaceC11944e {
    public final /* synthetic */ C15860e license;
    public C12347e vip;
    public boolean ad = true;
    public C16658e metrica = C5107e.f10953e;

    public C13644e(C15860e c15860e) {
        this.license = c15860e;
    }

    @Override // defpackage.InterfaceC11944e
    public final void ad() {
        purchase();
    }

    @Override // defpackage.InterfaceC11944e
    public final void appmetrica(long j) {
        C0866e license;
        long metrica;
        C15860e c15860e = this.license;
        if (!c15860e.mopub() || c15860e.amazon().ad.f20850e.length() == 0) {
            return;
        }
        c15860e.Signature = C2152e.startapp(c15860e.Signature, j);
        C7911e c7911e = c15860e.license;
        if (c7911e != null && (license = c7911e.license()) != null) {
            c15860e.subscription.setValue(new C2152e(C2152e.startapp(c15860e.amazon, c15860e.Signature)));
            if (c15860e.loadAd != null || license.metrica(c15860e.startapp().ad)) {
                C12347e c12347e = c15860e.loadAd;
                int vip = c12347e != null ? (int) (c12347e.ad >> 32) : license.vip(c15860e.amazon, false);
                int vip2 = license.vip(c15860e.startapp().ad, false);
                if (c15860e.loadAd == null && vip == vip2) {
                    return;
                } else {
                    metrica = C15860e.metrica(c15860e, c15860e.amazon(), c15860e.startapp().ad, false, false, this.metrica, true, new C10138e(9));
                }
            } else {
                metrica = C15860e.metrica(c15860e, c15860e.amazon(), c15860e.startapp().ad, false, false, c15860e.vip.license(license.vip(c15860e.amazon, true)) == c15860e.vip.license(license.vip(c15860e.startapp().ad, true)) ? C5107e.f10953e : C5107e.f10951e, true, new C10138e(9));
            }
            this.vip = new C12347e(metrica);
            if (!C12347e.vip(metrica, c15860e.loadAd)) {
                this.ad = false;
            }
        }
        c15860e.pro(false);
    }

    @Override // defpackage.InterfaceC11944e
    public final void license() {
    }

    @Override // defpackage.InterfaceC11944e
    public final void metrica() {
    }

    @Override // defpackage.InterfaceC11944e
    public final void onCancel() {
        purchase();
    }

    public final void purchase() {
        C15860e c15860e = this.license;
        c15860e.admob.setValue(null);
        c15860e.subscription.setValue(null);
        this.metrica = C5107e.f10953e;
        c15860e.pro(true);
        C12347e c12347e = this.vip;
        boolean license = C12347e.license(c12347e != null ? c12347e.ad : c15860e.amazon().vip);
        c15860e.admob(license ? EnumC13262e.f26308e : EnumC13262e.f26309e);
        C7911e c7911e = c15860e.license;
        if (c7911e != null) {
            c7911e.smaato.setValue(Boolean.valueOf(!license && AbstractC16091e.subscription(c15860e, true)));
        }
        C7911e c7911e2 = c15860e.license;
        if (c7911e2 != null) {
            c7911e2.amazon.setValue(Boolean.valueOf(!license && AbstractC16091e.subscription(c15860e, false)));
        }
        C7911e c7911e3 = c15860e.license;
        if (c7911e3 != null) {
            c7911e3.loadAd.setValue(Boolean.valueOf(license && AbstractC16091e.subscription(c15860e, true)));
        }
        if (this.ad) {
            C15860e.vip(c15860e, c15860e.loadAd);
        }
        c15860e.loadAd = null;
    }

    @Override // defpackage.InterfaceC11944e
    public final void vip(long j, C16658e c16658e) {
        long j2;
        C0866e license;
        C0866e license2;
        C15860e c15860e = this.license;
        C0576e c0576e = c15860e.admob;
        if (c15860e.mopub() && ((EnumC12813e) c0576e.getValue()) == null) {
            c0576e.setValue(EnumC12813e.f25630e);
            c15860e.remoteconfig = -1;
            this.ad = true;
            this.metrica = c16658e;
            c15860e.loadAd();
            C7911e c7911e = c15860e.license;
            if (c7911e == null || (license2 = c7911e.license()) == null || !license2.metrica(j)) {
                j2 = j;
                C7911e c7911e2 = c15860e.license;
                if (c7911e2 != null && (license = c7911e2.license()) != null) {
                    int license3 = c15860e.vip.license(license.vip(j2, true));
                    C0398e appmetrica = C15860e.appmetrica(c15860e.amazon().ad, AbstractC9262e.metrica(license3, license3));
                    c15860e.yandex(false);
                    InterfaceC5178e interfaceC5178e = c15860e.adcel;
                    if (interfaceC5178e != null) {
                        ((C6169e) interfaceC5178e).ad(0);
                    }
                    c15860e.metrica.invoke(appmetrica);
                    c15860e.tapsense = new C12347e(appmetrica.vip);
                }
                this.ad = false;
            } else {
                if (c15860e.amazon().ad.f20850e.length() == 0) {
                    return;
                }
                c15860e.yandex(false);
                long metrica = C15860e.metrica(c15860e, C0398e.ad(c15860e.amazon(), null, C12347e.vip, 5), j, true, false, this.metrica, true, new C10138e(0));
                j2 = j;
                c15860e.loadAd = new C12347e(metrica);
                this.vip = new C12347e(metrica);
            }
            c15860e.admob(EnumC13262e.f26311e);
            c15860e.amazon = j2;
            c15860e.subscription.setValue(new C2152e(j2));
            c15860e.Signature = 0L;
        }
    }
}
