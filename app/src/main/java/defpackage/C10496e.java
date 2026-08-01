package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10496e extends AbstractC13870e {

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean f20714e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public int f20715e;

    @Override // defpackage.AbstractC13870e, defpackage.InterfaceC17303e
    public final int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return this.f20715e == 1 ? interfaceC16719e.smaato(i) : interfaceC16719e.loadAd(i);
    }

    @Override // defpackage.AbstractC13870e
    /* renamed from: eؒٚۨ */
    public final boolean mo2292e() {
        return this.f20714e;
    }

    @Override // defpackage.AbstractC13870e
    /* renamed from: eٌٔٗ */
    public final long mo2293e(InterfaceC16719e interfaceC16719e, long j) {
        int smaato = this.f20715e == 1 ? interfaceC16719e.smaato(C5602e.billing(j)) : interfaceC16719e.loadAd(C5602e.billing(j));
        if (smaato < 0) {
            smaato = 0;
        }
        if (smaato < 0) {
            AbstractC15805e.ad("width must be >= 0");
        }
        return AbstractC2278e.yandex(smaato, smaato, 0, Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.AbstractC13870e, defpackage.InterfaceC17303e
    public final int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return this.f20715e == 1 ? interfaceC16719e.smaato(i) : interfaceC16719e.loadAd(i);
    }
}
