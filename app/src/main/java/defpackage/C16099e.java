package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16099e implements InterfaceC5495e {
    public final C6656e ad;
    public final /* synthetic */ boolean metrica;
    public final /* synthetic */ C4993e vip;

    public C16099e(C4993e c4993e, boolean z) {
        this.vip = c4993e;
        this.metrica = z;
        this.ad = AbstractC14533e.purchase(new C12851e(9, c4993e));
    }

    @Override // defpackage.InterfaceC5495e
    public final int ad() {
        C4993e c4993e = this.vip;
        return (int) (c4993e.yandex().loadAd == EnumC17426e.f34146e ? c4993e.yandex().purchase() & 4294967295L : c4993e.yandex().purchase() >> 32);
    }

    @Override // defpackage.InterfaceC5495e
    public final float appmetrica() {
        C4993e c4993e = this.vip;
        int purchase = c4993e.appmetrica.vip.purchase();
        int purchase2 = c4993e.appmetrica.metrica.purchase();
        return c4993e.license() ? (purchase * 500) + purchase2 + 100 : (purchase * 500) + purchase2;
    }

    @Override // defpackage.InterfaceC5495e
    public final int license() {
        C4993e c4993e = this.vip;
        return (-c4993e.yandex().advert) + c4993e.yandex().Signature;
    }

    @Override // defpackage.InterfaceC5495e
    public final Object metrica(int i, C11143e c11143e) {
        Object adcel = C4993e.adcel(this.vip, i, c11143e);
        return adcel == EnumC2821e.f6782e ? adcel : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC5495e
    public final C6517e purchase() {
        boolean z = this.metrica;
        C6656e c6656e = this.ad;
        return z ? new C6517e(((Number) c6656e.getValue()).intValue(), 1) : new C6517e(1, ((Number) c6656e.getValue()).intValue());
    }

    @Override // defpackage.InterfaceC5495e
    public final float vip() {
        C4993e c4993e = this.vip;
        return (c4993e.appmetrica.vip.purchase() * 500) + c4993e.appmetrica.metrica.purchase();
    }
}
