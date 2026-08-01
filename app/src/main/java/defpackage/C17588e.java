package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17588e implements InterfaceC11944e {
    public final /* synthetic */ int ad = 1;
    public final /* synthetic */ Object metrica;
    public final /* synthetic */ boolean vip;

    public C17588e(C15860e c15860e, boolean z) {
        this.metrica = c15860e;
        this.vip = z;
    }

    public C17588e(boolean z, C4034e c4034e) {
        this.vip = z;
        this.metrica = c4034e;
    }

    private final void billing(long j, C16658e c16658e) {
    }

    private final void purchase() {
    }

    @Override // defpackage.InterfaceC11944e
    public final void ad() {
        switch (this.ad) {
            case 0:
                C4034e c4034e = (C4034e) this.metrica;
                c4034e.inmobi = true;
                c4034e.loadAd();
                c4034e.subscription.setValue(null);
                c4034e.remoteconfig.setValue(null);
                return;
            default:
                C15860e c15860e = (C15860e) this.metrica;
                c15860e.admob.setValue(null);
                c15860e.subscription.setValue(null);
                c15860e.pro(true);
                return;
        }
    }

    @Override // defpackage.InterfaceC11944e
    public final void appmetrica(long j) {
        switch (this.ad) {
            case 0:
                C4034e c4034e = (C4034e) this.metrica;
                C0576e c0576e = c4034e.amazon;
                C0576e c0576e2 = c4034e.loadAd;
                if (c4034e.appmetrica() == null) {
                    return;
                }
                c0576e2.setValue(new C2152e(C2152e.startapp(((C2152e) c0576e2.getValue()).ad, j)));
                long startapp = C2152e.startapp(((C2152e) c0576e.getValue()).ad, ((C2152e) c0576e2.getValue()).ad);
                if (c4034e.amazon(startapp, ((C2152e) c0576e.getValue()).ad, this.vip, C5107e.f10955e)) {
                    c0576e.setValue(new C2152e(startapp));
                    c0576e2.setValue(new C2152e(0L));
                    return;
                }
                return;
            default:
                C15860e c15860e = (C15860e) this.metrica;
                long startapp2 = C2152e.startapp(c15860e.Signature, j);
                c15860e.Signature = startapp2;
                c15860e.subscription.setValue(new C2152e(C2152e.startapp(c15860e.amazon, startapp2)));
                C15860e.metrica(c15860e, c15860e.amazon(), c15860e.startapp().ad, false, this.vip, C5107e.f10955e, true, new C10138e(9));
                c15860e.pro(false);
                return;
        }
    }

    @Override // defpackage.InterfaceC11944e
    public final void license() {
        C9106e purchase;
        InterfaceC0043e metrica;
        C0866e license;
        switch (this.ad) {
            case 0:
                C4034e c4034e = (C4034e) this.metrica;
                boolean z = this.vip;
                if ((z ? (C2152e) c4034e.Signature.getValue() : (C2152e) c4034e.admob.getValue()) == null || (purchase = c4034e.purchase()) == null) {
                    return;
                }
                C12850e metrica2 = c4034e.metrica(z ? purchase.ad : purchase.vip);
                if (metrica2 == null || (metrica = metrica2.metrica()) == null) {
                    return;
                }
                long ad = metrica2.ad(purchase, z);
                if ((9223372034707292159L & ad) == 9205357640488583168L) {
                    return;
                }
                c4034e.remoteconfig.setValue(new C2152e(c4034e.adcel().mo207class(metrica, AbstractC1163e.ad(ad))));
                c4034e.subscription.setValue(z ? EnumC12813e.f25631e : EnumC12813e.f25630e);
                c4034e.inmobi = false;
                c4034e.loadAd();
                return;
            default:
                C15860e c15860e = (C15860e) this.metrica;
                boolean z2 = this.vip;
                c15860e.admob.setValue(z2 ? EnumC12813e.f25631e : EnumC12813e.f25630e);
                long ad2 = AbstractC1163e.ad(c15860e.advert(z2));
                C7911e c7911e = c15860e.license;
                if (c7911e == null || (license = c7911e.license()) == null) {
                    return;
                }
                long appmetrica = license.appmetrica(ad2);
                c15860e.amazon = appmetrica;
                c15860e.subscription.setValue(new C2152e(appmetrica));
                c15860e.Signature = 0L;
                c15860e.remoteconfig = -1;
                C7911e c7911e2 = c15860e.license;
                if (c7911e2 != null) {
                    c7911e2.admob.setValue(Boolean.TRUE);
                }
                c15860e.pro(false);
                return;
        }
    }

    @Override // defpackage.InterfaceC11944e
    public final void metrica() {
        switch (this.ad) {
            case 0:
                C4034e c4034e = (C4034e) this.metrica;
                c4034e.inmobi = true;
                c4034e.loadAd();
                c4034e.subscription.setValue(null);
                c4034e.remoteconfig.setValue(null);
                return;
            default:
                C15860e c15860e = (C15860e) this.metrica;
                c15860e.admob.setValue(null);
                c15860e.subscription.setValue(null);
                c15860e.pro(true);
                return;
        }
    }

    @Override // defpackage.InterfaceC11944e
    public final void onCancel() {
        switch (this.ad) {
            case 0:
                C4034e c4034e = (C4034e) this.metrica;
                c4034e.inmobi = true;
                c4034e.loadAd();
                c4034e.subscription.setValue(null);
                c4034e.remoteconfig.setValue(null);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.InterfaceC11944e
    public final void vip(long j, C16658e c16658e) {
        switch (this.ad) {
            case 0:
                C4034e c4034e = (C4034e) this.metrica;
                if (c4034e.appmetrica() == null) {
                    return;
                }
                C9106e purchase = c4034e.purchase();
                boolean z = this.vip;
                Object appmetrica = c4034e.ad.metrica.appmetrica((z ? purchase.ad : purchase.vip).metrica);
                if (appmetrica == null) {
                    AbstractC8889e.license("SelectionRegistrar should contain the current selection's selectableIds");
                    throw new C14803e(9);
                }
                C12850e c12850e = (C12850e) appmetrica;
                InterfaceC0043e metrica = c12850e.metrica();
                if (metrica == null) {
                    AbstractC8889e.license("Current selectable should have layout coordinates.");
                    throw new C14803e(9);
                }
                long ad = c12850e.ad(purchase, z);
                if ((9223372034707292159L & ad) == 9205357640488583168L) {
                    return;
                }
                AbstractC0054e.m220goto(c4034e.adcel().mo207class(metrica, AbstractC1163e.ad(ad)), c4034e.amazon);
                AbstractC0054e.m220goto(0L, c4034e.loadAd);
                return;
            default:
                return;
        }
    }
}
