package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4055e implements InterfaceC1272e {
    public final InterfaceC1272e ad;
    public final boolean vip;

    public C4055e(int i) {
        boolean z = (i & 1) != 0;
        this.vip = z;
        if (z) {
            this.ad = new C15145e(-1, -1, "image/heif");
        } else {
            this.ad = new C17498e();
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final InterfaceC1272e ad() {
        return this;
    }

    @Override // defpackage.InterfaceC1272e
    public final List appmetrica() {
        C2171e c2171e = AbstractC17475e.f34223e;
        return C1410e.f4222e;
    }

    @Override // defpackage.InterfaceC1272e
    public final void license(long j, long j2) {
        this.ad.license(j, j2);
    }

    @Override // defpackage.InterfaceC1272e
    public final boolean metrica(InterfaceC2283e interfaceC2283e) {
        return this.vip ? AbstractC5336e.adcel((C14446e) interfaceC2283e, false) : this.ad.metrica(interfaceC2283e);
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        this.ad.purchase(interfaceC5483e);
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
        this.ad.release();
    }

    @Override // defpackage.InterfaceC1272e
    public final int vip(InterfaceC2283e interfaceC2283e, C14829e c14829e) {
        return this.ad.vip(interfaceC2283e, c14829e);
    }
}
