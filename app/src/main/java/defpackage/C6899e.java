package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٟؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6899e implements InterfaceC5495e {
    public final /* synthetic */ C8202e ad;

    public C6899e(C8202e c8202e) {
        this.ad = c8202e;
    }

    @Override // defpackage.InterfaceC5495e
    public final int ad() {
        C8202e c8202e = this.ad;
        return (int) (c8202e.billing().admob == EnumC17426e.f34146e ? c8202e.billing().purchase() & 4294967295L : c8202e.billing().purchase() >> 32);
    }

    @Override // defpackage.InterfaceC5495e
    public final float appmetrica() {
        C8202e c8202e = this.ad;
        int purchase = c8202e.license.vip.purchase();
        int purchase2 = c8202e.license.metrica.purchase();
        return c8202e.license() ? (purchase * 500) + purchase2 + 100 : (purchase * 500) + purchase2;
    }

    @Override // defpackage.InterfaceC5495e
    public final int license() {
        C8202e c8202e = this.ad;
        return (-c8202e.billing().amazon) + c8202e.billing().subscription;
    }

    @Override // defpackage.InterfaceC5495e
    public final Object metrica(int i, C11143e c11143e) {
        C11883e c11883e = C8202e.isVip;
        C8202e c8202e = this.ad;
        c8202e.getClass();
        Object vip = c8202e.vip(EnumC6955e.f14256e, new C16600e(c8202e, i, null, 13), c11143e);
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (vip != enumC2821e) {
            vip = Unit.INSTANCE;
        }
        return vip == enumC2821e ? vip : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC5495e
    public final C6517e purchase() {
        return new C6517e(-1, -1);
    }

    @Override // defpackage.InterfaceC5495e
    public final float vip() {
        C8202e c8202e = this.ad;
        return (c8202e.license.vip.purchase() * 500) + c8202e.license.metrica.purchase();
    }
}
