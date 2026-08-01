package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2034e implements InterfaceC1272e {
    public final /* synthetic */ int ad;
    public final C15145e metrica;
    public final C1292e vip;

    public C2034e(int i) {
        this.ad = i;
        switch (i) {
            case 1:
                this.vip = new C1292e(4);
                this.metrica = new C15145e(-1, -1, "image/webp");
                return;
            default:
                this.vip = new C1292e(4);
                this.metrica = new C15145e(-1, -1, "image/avif");
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
                this.metrica.license(j, j2);
                return;
            default:
                this.metrica.license(j, j2);
                return;
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final boolean metrica(InterfaceC2283e interfaceC2283e) {
        switch (this.ad) {
            case 0:
                C14446e c14446e = (C14446e) interfaceC2283e;
                c14446e.mopub(4, false);
                C1292e c1292e = this.vip;
                c1292e.m564extends(4);
                c14446e.billing(c1292e.ad, 0, 4, false);
                if (c1292e.subs() != 1718909296) {
                    return false;
                }
                c1292e.m564extends(4);
                c14446e.billing(c1292e.ad, 0, 4, false);
                return c1292e.subs() == ((long) 1635150182);
            default:
                C1292e c1292e2 = this.vip;
                c1292e2.m564extends(4);
                C14446e c14446e2 = (C14446e) interfaceC2283e;
                c14446e2.billing(c1292e2.ad, 0, 4, false);
                if (c1292e2.subs() != 1380533830) {
                    return false;
                }
                c14446e2.mopub(4, false);
                c1292e2.m564extends(4);
                c14446e2.billing(c1292e2.ad, 0, 4, false);
                return c1292e2.subs() == 1464156752;
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        switch (this.ad) {
            case 0:
                this.metrica.purchase(interfaceC5483e);
                return;
            default:
                this.metrica.purchase(interfaceC5483e);
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
                return this.metrica.vip(interfaceC2283e, c14829e);
            default:
                return this.metrica.vip(interfaceC2283e, c14829e);
        }
    }
}
