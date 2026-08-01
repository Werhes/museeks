package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۜۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12009e extends AbstractC4134e {
    @Override // defpackage.InterfaceC16719e
    public final AbstractC2832e admob(long j) {
        m1210strictfp(j);
        AbstractC17732e abstractC17732e = this.f9109e;
        C12431e ads = abstractC17732e.f34782e.ads();
        Object[] objArr = ads.f24870e;
        int i = ads.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            ((C13915e) objArr[i2]).f27612e.admob.f34460e = 3;
        }
        C13915e c13915e = abstractC17732e.f34782e;
        AbstractC4134e.m1460e(this, c13915e.f27606e.vip(this, c13915e.smaato(), j));
        return this;
    }

    @Override // defpackage.AbstractC4134e
    /* renamed from: eٟؒؗ */
    public final void mo1462e() {
        this.f9109e.f34782e.f27612e.admob.m4374volatile();
    }

    @Override // defpackage.InterfaceC16719e
    public final int loadAd(int i) {
        C16911e signatures = this.f9109e.f34782e.signatures();
        InterfaceC2747e applovin = signatures.applovin();
        C13915e c13915e = (C13915e) signatures.f33137e;
        return applovin.ad((AbstractC17732e) c13915e.f27592e.appmetrica, c13915e.smaato(), i);
    }

    @Override // defpackage.InterfaceC16719e
    public final int metrica(int i) {
        C16911e signatures = this.f9109e.f34782e.signatures();
        InterfaceC2747e applovin = signatures.applovin();
        C13915e c13915e = (C13915e) signatures.f33137e;
        return applovin.license((AbstractC17732e) c13915e.f27592e.appmetrica, c13915e.smaato(), i);
    }

    @Override // defpackage.InterfaceC16719e
    public final int smaato(int i) {
        C16911e signatures = this.f9109e.f34782e.signatures();
        InterfaceC2747e applovin = signatures.applovin();
        C13915e c13915e = (C13915e) signatures.f33137e;
        return applovin.metrica((AbstractC17732e) c13915e.f27592e.appmetrica, c13915e.smaato(), i);
    }

    @Override // defpackage.AbstractC9292e
    /* renamed from: static */
    public final int mo2528static(AbstractC17016e abstractC17016e) {
        C17596e c17596e = this.f9109e.f34782e.f27612e.admob;
        C10324e c10324e = c17596e.f34475e;
        if (!c17596e.f34471e) {
            C11874e c11874e = c17596e.f34480e;
            if (c11874e.license == 2) {
                c10324e.purchase = true;
                if (c10324e.vip) {
                    c11874e.purchase = true;
                    c11874e.billing = true;
                }
            } else {
                c10324e.billing = true;
            }
        }
        C12009e c12009e = c17596e.appmetrica().f29168e;
        if (c12009e != null) {
            c12009e.f18514e = true;
        }
        c17596e.crashlytics();
        C12009e c12009e2 = c17596e.appmetrica().f29168e;
        if (c12009e2 != null) {
            c12009e2.f18514e = false;
        }
        Integer num = (Integer) c10324e.startapp.get(abstractC17016e);
        int intValue = num != null ? num.intValue() : RecyclerView.UNDEFINED_DURATION;
        this.f9112e.billing(intValue, abstractC17016e);
        return intValue;
    }

    @Override // defpackage.InterfaceC16719e
    /* renamed from: while */
    public final int mo2529while(int i) {
        C16911e signatures = this.f9109e.f34782e.signatures();
        InterfaceC2747e applovin = signatures.applovin();
        C13915e c13915e = (C13915e) signatures.f33137e;
        return applovin.appmetrica((AbstractC17732e) c13915e.f27592e.appmetrica, c13915e.smaato(), i);
    }
}
