package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۛۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6657e implements InterfaceC16638e {
    public final C16399e ad;
    public final /* synthetic */ Object metrica;
    public final /* synthetic */ C10014e vip;

    public C6657e(C10014e c10014e, Object obj) {
        this.vip = c10014e;
        this.metrica = obj;
        int[] iArr = AbstractC3864e.ad;
        this.ad = new C16399e();
    }

    @Override // defpackage.InterfaceC16638e
    public final void ad() {
        C10014e.metrica(this.vip, this.metrica);
    }

    @Override // defpackage.InterfaceC16638e
    public final void appmetrica(int i, long j) {
        C10014e c10014e = this.vip;
        C13915e c13915e = (C13915e) c10014e.f19772e.billing(this.metrica);
        if (c13915e == null || !c13915e.m3708extends()) {
            return;
        }
        int i2 = ((C12431e) ((C8794e) c13915e.loadAd()).f17708e).f24868e;
        if (i < 0 || i >= i2) {
            AbstractC14070e.appmetrica("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (c13915e.m3724throw()) {
            AbstractC14070e.ad("Pre-measure called on node that is not placed");
        }
        C13915e c13915e2 = c10014e.f19781e;
        c13915e2.f27611e = true;
        ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(c13915e)).isVip((C13915e) ((C8794e) c13915e.loadAd()).get(i), j);
        Unit unit = Unit.INSTANCE;
        c13915e2.f27611e = false;
        this.ad.ad(i);
    }

    @Override // defpackage.InterfaceC16638e
    public final void license(C6846e c6846e) {
        C14742e c14742e;
        C13915e c13915e = (C13915e) this.vip.f19772e.billing(this.metrica);
        AbstractC13616e abstractC13616e = (c13915e == null || (c14742e = c13915e.f27592e) == null) ? null : (AbstractC13616e) c14742e.billing;
        if (abstractC13616e == null || !abstractC13616e.f27016e) {
            return;
        }
        AbstractC14114e.adcel(abstractC13616e, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", c6846e);
    }

    @Override // defpackage.InterfaceC16638e
    public final long metrica(int i) {
        C13915e c13915e = (C13915e) this.vip.f19772e.billing(this.metrica);
        if (c13915e == null || !c13915e.m3708extends()) {
            return 0L;
        }
        int i2 = ((C12431e) ((C8794e) c13915e.loadAd()).f17708e).f24868e;
        if (i < 0 || i >= i2) {
            AbstractC14070e.appmetrica("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (!this.ad.metrica(i)) {
            return 0L;
        }
        return (((C13915e) ((C8794e) c13915e.loadAd()).get(i)).f27612e.Signature.f6806e << 32) | (((C13915e) ((C8794e) c13915e.loadAd()).get(i)).f27612e.Signature.f6804e & 4294967295L);
    }

    @Override // defpackage.InterfaceC16638e
    public final int vip() {
        C13915e c13915e = (C13915e) this.vip.f19772e.billing(this.metrica);
        if (c13915e != null) {
            return ((C12431e) ((C8794e) c13915e.loadAd()).f17708e).f24868e;
        }
        return 0;
    }
}
