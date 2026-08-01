package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eً٘ؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17498e implements InterfaceC1272e {
    public C1919e appmetrica;
    public int billing;
    public C3318e license;
    public InterfaceC2283e metrica;
    public int startapp;
    public InterfaceC5483e vip;
    public long yandex;
    public final C1292e ad = new C1292e(16);
    public long adcel = -1;
    public int purchase = 0;

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
        if (j != 0) {
            if (this.purchase == 3) {
                C1919e c1919e = this.appmetrica;
                c1919e.getClass();
                c1919e.license(j, j2);
                return;
            }
            return;
        }
        this.purchase = 0;
        this.startapp = 0;
        this.adcel = -1L;
        if (this.appmetrica != null) {
            this.appmetrica = null;
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final boolean metrica(InterfaceC2283e interfaceC2283e) {
        return AbstractC5336e.adcel((C14446e) interfaceC2283e, true);
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        this.vip = interfaceC5483e;
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
        C1919e c1919e = this.appmetrica;
        if (c1919e != null) {
            c1919e.getClass();
            this.appmetrica = null;
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final int vip(InterfaceC2283e interfaceC2283e, C14829e c14829e) {
        while (true) {
            int i = this.purchase;
            if (i == 0) {
                int i2 = this.startapp;
                C1292e c1292e = this.ad;
                if (i2 == 0) {
                    if (!interfaceC2283e.vip(c1292e.ad, 0, 8, true)) {
                        InterfaceC5483e interfaceC5483e = this.vip;
                        interfaceC5483e.getClass();
                        interfaceC5483e.mopub();
                        this.vip.pro(new C5990e(-9223372036854775807L));
                        this.purchase = 4;
                        return -1;
                    }
                    this.startapp = 8;
                    c1292e.m571try(0);
                    this.yandex = c1292e.subs();
                    this.billing = c1292e.smaato();
                }
                if (this.yandex == 1) {
                    interfaceC2283e.readFully(c1292e.ad, 8, 8);
                    this.startapp += 8;
                    this.yandex = c1292e.m566interface();
                }
                if (this.billing == 1836086884) {
                    long position = interfaceC2283e.getPosition();
                    this.adcel = position;
                    long j = this.startapp;
                    C0713e c0713e = new C0713e(0L, position - j, -9223372036854775807L, position, this.yandex - j);
                    InterfaceC5483e interfaceC5483e2 = this.vip;
                    interfaceC5483e2.getClass();
                    InterfaceC18147e Signature = interfaceC5483e2.Signature(1024, 4);
                    C11445e c11445e = new C11445e();
                    c11445e.smaato = AbstractC8542e.amazon("image/heic");
                    c11445e.mopub = new C17750e(c0713e);
                    AbstractC8647e.firebase(c11445e, Signature);
                    this.purchase = 2;
                } else {
                    this.purchase = 1;
                }
            } else if (i == 1) {
                interfaceC2283e.amazon((int) (this.yandex - this.startapp));
                this.startapp = 0;
                this.purchase = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return -1;
                        }
                        throw new IllegalStateException();
                    }
                    if (this.license == null || interfaceC2283e != this.metrica) {
                        this.metrica = interfaceC2283e;
                        this.license = new C3318e(interfaceC2283e, this.adcel);
                    }
                    C1919e c1919e = this.appmetrica;
                    c1919e.getClass();
                    int vip = c1919e.vip(this.license, c14829e);
                    if (vip == 1) {
                        c14829e.f29362e += this.adcel;
                    }
                    return vip;
                }
                if (this.appmetrica == null) {
                    this.appmetrica = new C1919e(InterfaceC7854e.f15901e, 8);
                }
                C3318e c3318e = new C3318e(interfaceC2283e, this.adcel);
                this.license = c3318e;
                if (this.appmetrica.metrica(c3318e)) {
                    C1919e c1919e2 = this.appmetrica;
                    long j2 = this.adcel;
                    InterfaceC5483e interfaceC5483e3 = this.vip;
                    interfaceC5483e3.getClass();
                    c1919e2.purchase(new C3318e(j2, interfaceC5483e3, 5));
                    this.purchase = 3;
                } else {
                    InterfaceC5483e interfaceC5483e4 = this.vip;
                    interfaceC5483e4.getClass();
                    interfaceC5483e4.mopub();
                    this.vip.pro(new C5990e(-9223372036854775807L));
                    this.purchase = 4;
                }
            }
        }
    }
}
