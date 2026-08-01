package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14853e implements InterfaceC1272e {
    public final /* synthetic */ int ad = 1;
    public final Object vip;

    public C14853e(int i) {
        if ((i & 1) != 0) {
            this.vip = new C15145e(65496, 2, "image/jpeg");
        } else {
            this.vip = new C11497e();
        }
    }

    public C14853e(C16975e c16975e) {
        this.vip = c16975e;
    }

    private final void billing() {
    }

    private final void yandex(long j, long j2) {
    }

    @Override // defpackage.InterfaceC1272e
    public final InterfaceC1272e ad() {
        int i = this.ad;
        return this;
    }

    @Override // defpackage.InterfaceC1272e
    public final List appmetrica() {
        switch (this.ad) {
            case 0:
            default:
                C2171e c2171e = AbstractC17475e.f34223e;
                return C1410e.f4222e;
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final void license(long j, long j2) {
        switch (this.ad) {
            case 0:
                return;
            default:
                ((InterfaceC1272e) this.vip).license(j, j2);
                return;
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final boolean metrica(InterfaceC2283e interfaceC2283e) {
        switch (this.ad) {
            case 0:
                return true;
            default:
                return ((InterfaceC1272e) this.vip).metrica(interfaceC2283e);
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        switch (this.ad) {
            case 0:
                InterfaceC18147e Signature = interfaceC5483e.Signature(0, 3);
                interfaceC5483e.pro(new C5990e(-9223372036854775807L));
                interfaceC5483e.mopub();
                C16975e c16975e = (C16975e) this.vip;
                C11445e ad = c16975e.ad();
                ad.amazon = AbstractC8542e.amazon("text/x-unknown");
                ad.adcel = c16975e.loadAd;
                AbstractC8647e.firebase(ad, Signature);
                return;
            default:
                ((InterfaceC1272e) this.vip).purchase(interfaceC5483e);
                return;
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
        switch (this.ad) {
            case 0:
                return;
            default:
                ((InterfaceC1272e) this.vip).release();
                return;
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final int vip(InterfaceC2283e interfaceC2283e, C14829e c14829e) {
        switch (this.ad) {
            case 0:
                return interfaceC2283e.adcel(Alert.DURATION_SHOW_INDEFINITELY) == -1 ? -1 : 0;
            default:
                return ((InterfaceC1272e) this.vip).vip(interfaceC2283e, c14829e);
        }
    }
}
