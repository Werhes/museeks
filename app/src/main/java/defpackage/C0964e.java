package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؒۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0964e extends AbstractC17471e {
    @Override // defpackage.InterfaceC12462e
    public final void ad(InterfaceC12462e interfaceC12462e) {
        C17455e c17455e = this.yandex;
        if (c17455e.metrica && !c17455e.adcel) {
            c17455e.license((int) ((((C17455e) c17455e.advert.get(0)).billing * ((C0913e) this.vip).f3340e) + 0.5f));
        }
    }

    @Override // defpackage.AbstractC17471e
    public final void appmetrica() {
        C11325e c11325e = this.vip;
        int i = ((C0913e) c11325e).f3335e;
        C17455e c17455e = this.yandex;
        if (i == 1) {
            c11325e.f22754strictfp = c17455e.billing;
        } else {
            c11325e.f22749private = c17455e.billing;
        }
    }

    @Override // defpackage.AbstractC17471e
    public final void license() {
        C11325e c11325e = this.vip;
        C0913e c0913e = (C0913e) c11325e;
        int i = c0913e.f3338e;
        int i2 = c0913e.f3339e;
        int i3 = c0913e.f3335e;
        C17455e c17455e = this.yandex;
        if (i3 == 1) {
            if (i != -1) {
                c17455e.advert.add(c11325e.f22730case.license.yandex);
                this.vip.f22730case.license.yandex.mopub.add(c17455e);
                c17455e.purchase = i;
            } else if (i2 != -1) {
                c17455e.advert.add(c11325e.f22730case.license.startapp);
                this.vip.f22730case.license.startapp.mopub.add(c17455e);
                c17455e.purchase = -i2;
            } else {
                c17455e.vip = true;
                c17455e.advert.add(c11325e.f22730case.license.startapp);
                this.vip.f22730case.license.startapp.mopub.add(c17455e);
            }
            smaato(this.vip.license.yandex);
            smaato(this.vip.license.startapp);
            return;
        }
        if (i != -1) {
            c17455e.advert.add(c11325e.f22730case.appmetrica.yandex);
            this.vip.f22730case.appmetrica.yandex.mopub.add(c17455e);
            c17455e.purchase = i;
        } else if (i2 != -1) {
            c17455e.advert.add(c11325e.f22730case.appmetrica.startapp);
            this.vip.f22730case.appmetrica.startapp.mopub.add(c17455e);
            c17455e.purchase = -i2;
        } else {
            c17455e.vip = true;
            c17455e.advert.add(c11325e.f22730case.appmetrica.startapp);
            this.vip.f22730case.appmetrica.startapp.mopub.add(c17455e);
        }
        smaato(this.vip.appmetrica.yandex);
        smaato(this.vip.appmetrica.startapp);
    }

    @Override // defpackage.AbstractC17471e
    public final boolean mopub() {
        return false;
    }

    @Override // defpackage.AbstractC17471e
    public final void purchase() {
        this.yandex.metrica();
    }

    public final void smaato(C17455e c17455e) {
        C17455e c17455e2 = this.yandex;
        c17455e2.mopub.add(c17455e);
        c17455e.advert.add(c17455e2);
    }
}
