package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚ٘ؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7221e implements InterfaceC18147e {
    public final C16806e ad;
    public final C16806e vip;
    public final C6891e metrica = new C6891e();
    public final AtomicReference license = new AtomicReference(EnumC4151e.f9161e);

    public C7221e(C16806e c16806e) {
        this.ad = c16806e;
        this.vip = c16806e;
    }

    @Override // defpackage.InterfaceC18147e
    public final void ad(long j, int i, int i2, int i3, C17737e c17737e) {
        yandex().ad(j, i, i2, i3, c17737e);
        AtomicReference atomicReference = this.license;
        if (atomicReference.get() == EnumC4151e.f9159e) {
            this.vip.premium(false);
            atomicReference.set(EnumC4151e.f9158e);
        }
    }

    @Override // defpackage.InterfaceC18147e
    public final void appmetrica(int i, C1292e c1292e) {
        yandex().appmetrica(i, c1292e);
    }

    @Override // defpackage.InterfaceC18147e
    public final void billing(C16975e c16975e) {
        this.ad.billing(c16975e);
    }

    @Override // defpackage.InterfaceC18147e
    public final void license(long j) {
    }

    @Override // defpackage.InterfaceC18147e
    public final int metrica(InterfaceC15672e interfaceC15672e, int i, boolean z) {
        return yandex().metrica(interfaceC15672e, i, z);
    }

    @Override // defpackage.InterfaceC18147e
    public final int purchase(InterfaceC15672e interfaceC15672e, int i, boolean z) {
        return yandex().purchase(interfaceC15672e, i, z);
    }

    @Override // defpackage.InterfaceC18147e
    public final void vip(C1292e c1292e, int i, int i2) {
        yandex().vip(c1292e, i, i2);
    }

    public final InterfaceC18147e yandex() {
        return this.license.get() == EnumC4151e.f9158e ? this.metrica : this.vip;
    }
}
