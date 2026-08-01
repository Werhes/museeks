package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٓۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13928e implements InterfaceC11944e {
    public final /* synthetic */ C15860e ad;

    public C13928e(C15860e c15860e) {
        this.ad = c15860e;
    }

    @Override // defpackage.InterfaceC11944e
    public final void ad() {
        C15860e c15860e = this.ad;
        c15860e.admob.setValue(null);
        c15860e.subscription.setValue(null);
    }

    @Override // defpackage.InterfaceC11944e
    public final void appmetrica(long j) {
        C0866e license;
        InterfaceC5178e interfaceC5178e;
        C15860e c15860e = this.ad;
        c15860e.Signature = C2152e.startapp(c15860e.Signature, j);
        C7911e c7911e = c15860e.license;
        if (c7911e == null || (license = c7911e.license()) == null) {
            return;
        }
        c15860e.subscription.setValue(new C2152e(C2152e.startapp(c15860e.amazon, c15860e.Signature)));
        int license2 = c15860e.vip.license(license.vip(c15860e.startapp().ad, true));
        long metrica = AbstractC9262e.metrica(license2, license2);
        if (C12347e.metrica(metrica, c15860e.amazon().vip)) {
            return;
        }
        C7911e c7911e2 = c15860e.license;
        if ((c7911e2 == null || ((Boolean) c7911e2.admob.getValue()).booleanValue()) && (interfaceC5178e = c15860e.adcel) != null) {
            ((C6169e) interfaceC5178e).ad(9);
        }
        c15860e.metrica.invoke(C15860e.appmetrica(c15860e.amazon().ad, metrica));
        c15860e.tapsense = new C12347e(metrica);
    }

    @Override // defpackage.InterfaceC11944e
    public final void license() {
    }

    @Override // defpackage.InterfaceC11944e
    public final void metrica() {
        C15860e c15860e = this.ad;
        c15860e.admob.setValue(null);
        c15860e.subscription.setValue(null);
    }

    @Override // defpackage.InterfaceC11944e
    public final void onCancel() {
    }

    @Override // defpackage.InterfaceC11944e
    public final void vip(long j, C16658e c16658e) {
        C0866e license;
        C15860e c15860e = this.ad;
        long ad = AbstractC1163e.ad(c15860e.advert(true));
        C7911e c7911e = c15860e.license;
        if (c7911e == null || (license = c7911e.license()) == null) {
            return;
        }
        long appmetrica = license.appmetrica(ad);
        c15860e.amazon = appmetrica;
        c15860e.subscription.setValue(new C2152e(appmetrica));
        c15860e.Signature = 0L;
        c15860e.admob.setValue(EnumC12813e.f25633e);
        c15860e.pro(false);
    }
}
