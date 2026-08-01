package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8535e implements InterfaceC1272e {
    public final /* synthetic */ int ad;
    public final C15145e vip;

    public C8535e(int i) {
        this.ad = i;
        switch (i) {
            case 1:
                this.vip = new C15145e(35152, 2, "image/png");
                return;
            default:
                this.vip = new C15145e(16973, 2, "image/bmp");
                return;
        }
    }

    private final void billing() {
    }

    private final void yandex() {
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
                this.vip.license(j, j2);
                return;
            default:
                this.vip.license(j, j2);
                return;
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final boolean metrica(InterfaceC2283e interfaceC2283e) {
        switch (this.ad) {
            case 0:
                return this.vip.metrica(interfaceC2283e);
            default:
                return this.vip.metrica(interfaceC2283e);
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        switch (this.ad) {
            case 0:
                this.vip.purchase(interfaceC5483e);
                return;
            default:
                this.vip.purchase(interfaceC5483e);
                return;
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
        int i = this.ad;
    }

    @Override // defpackage.InterfaceC1272e
    public final int vip(InterfaceC2283e interfaceC2283e, C14829e c14829e) {
        switch (this.ad) {
            case 0:
                return this.vip.vip(interfaceC2283e, c14829e);
            default:
                return this.vip.vip(interfaceC2283e, c14829e);
        }
    }
}
