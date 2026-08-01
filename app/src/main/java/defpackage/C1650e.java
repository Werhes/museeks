package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1650e implements InterfaceC3726e, InterfaceC12705e, InterfaceC5374e {
    public final C8734e ad;
    public final C13237e vip;

    public C1650e(C8734e c8734e, C13237e c13237e) {
        this.ad = c8734e;
        this.vip = c13237e;
    }

    @Override // defpackage.InterfaceC5374e
    public final Object ad() {
        C8734e c8734e = this.ad;
        C11054e c11054e = c8734e.ad;
        C8734e c8734e2 = new C8734e(new C11054e(c11054e.ad, c11054e.vip), c8734e.vip, c8734e.metrica, c8734e.license);
        C13237e c13237e = this.vip;
        return new C1650e(c8734e2, new C13237e(c13237e.ad, c13237e.vip, c13237e.metrica, c13237e.license, c13237e.appmetrica, c13237e.purchase));
    }

    @Override // defpackage.InterfaceC2029e
    public final void adcel(Integer num) {
        this.ad.ad.ad = num;
    }

    @Override // defpackage.InterfaceC12705e
    public final void advert(Integer num) {
        this.vip.ad = num;
    }

    @Override // defpackage.InterfaceC12705e
    public final Integer amazon() {
        return this.vip.appmetrica;
    }

    @Override // defpackage.InterfaceC12705e
    public final void appmetrica(Integer num) {
        this.vip.license = num;
    }

    @Override // defpackage.InterfaceC12705e
    public final C2403e billing() {
        return this.vip.billing();
    }

    @Override // defpackage.InterfaceC12705e
    public final Integer license() {
        return this.vip.license;
    }

    @Override // defpackage.InterfaceC12705e
    public final void loadAd(Integer num) {
        this.vip.appmetrica = num;
    }

    @Override // defpackage.InterfaceC2029e
    public final void metrica(Integer num) {
        this.ad.ad.vip = num;
    }

    @Override // defpackage.InterfaceC2029e
    public final Integer mopub() {
        return this.ad.ad.vip;
    }

    @Override // defpackage.InterfaceC2029e
    public final Integer purchase() {
        return this.ad.ad.ad;
    }

    @Override // defpackage.InterfaceC12705e
    public final Integer smaato() {
        return this.vip.ad;
    }

    @Override // defpackage.InterfaceC3726e
    public final void startapp(Integer num) {
        this.ad.vip = num;
    }

    @Override // defpackage.InterfaceC12705e
    public final void vip(C2403e c2403e) {
        this.vip.vip(c2403e);
    }

    @Override // defpackage.InterfaceC3726e
    public final Integer yandex() {
        return this.ad.vip;
    }
}
