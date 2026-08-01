package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۗۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14921e implements InterfaceC15956e {
    public final InterfaceC13397e ad;
    public int adcel;
    public long advert;
    public C8010e appmetrica;
    public boolean billing;
    public int license;
    public boolean mopub;
    public boolean purchase;
    public int startapp;
    public boolean yandex;
    public final C2125e vip = new C2125e(10, new byte[10]);
    public int metrica = 0;

    public C14921e(InterfaceC13397e interfaceC13397e) {
        this.ad = interfaceC13397e;
    }

    @Override // defpackage.InterfaceC15956e
    public final void ad(int i, C1292e c1292e) {
        this.appmetrica.getClass();
        int i2 = i & 1;
        int i3 = -1;
        int i4 = 2;
        InterfaceC13397e interfaceC13397e = this.ad;
        if (i2 != 0) {
            int i5 = this.metrica;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    AbstractC2803e.smaato("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.adcel != -1) {
                        AbstractC2803e.smaato("PesReader", "Unexpected start indicator: expected " + this.adcel + " more bytes");
                    }
                    interfaceC13397e.metrica(c1292e.metrica == 0);
                }
            }
            this.metrica = 1;
            this.license = 0;
        }
        int i6 = i;
        while (c1292e.ad() > 0) {
            int i7 = this.metrica;
            if (i7 != 0) {
                C2125e c2125e = this.vip;
                if (i7 != 1) {
                    if (i7 == i4) {
                        if (metrica(c1292e, c2125e.vip, Math.min(10, this.startapp)) && metrica(c1292e, null, this.startapp)) {
                            c2125e.smaato(0);
                            this.advert = -9223372036854775807L;
                            if (this.purchase) {
                                c2125e.loadAd(4);
                                c2125e.loadAd(1);
                                c2125e.loadAd(1);
                                long billing = (c2125e.billing(15) << 15) | (c2125e.billing(3) << 30) | c2125e.billing(15);
                                c2125e.loadAd(1);
                                if (!this.yandex && this.billing) {
                                    c2125e.loadAd(4);
                                    c2125e.loadAd(1);
                                    c2125e.loadAd(1);
                                    c2125e.loadAd(1);
                                    this.appmetrica.vip((c2125e.billing(3) << 30) | (c2125e.billing(15) << 15) | c2125e.billing(15));
                                    this.yandex = true;
                                }
                                this.advert = this.appmetrica.vip(billing);
                            }
                            i6 |= this.mopub ? 4 : 0;
                            interfaceC13397e.license(i6, this.advert);
                            this.metrica = 3;
                            this.license = 0;
                        }
                    } else {
                        if (i7 != 3) {
                            throw new IllegalStateException();
                        }
                        int ad = c1292e.ad();
                        int i8 = this.adcel;
                        int i9 = i8 == i3 ? 0 : ad - i8;
                        if (i9 > 0) {
                            ad -= i9;
                            c1292e.m572while(c1292e.vip + ad);
                        }
                        interfaceC13397e.ad(c1292e);
                        int i10 = this.adcel;
                        if (i10 != i3) {
                            int i11 = i10 - ad;
                            this.adcel = i11;
                            if (i11 == 0) {
                                interfaceC13397e.metrica(false);
                                this.metrica = 1;
                                this.license = 0;
                            }
                        }
                    }
                } else if (metrica(c1292e, c2125e.vip, 9)) {
                    this.metrica = license() ? 2 : 0;
                    this.license = 0;
                }
            } else {
                c1292e.m568protected(c1292e.ad());
            }
            i3 = -1;
            i4 = 2;
        }
    }

    @Override // defpackage.InterfaceC15956e
    public final void billing(C8010e c8010e, InterfaceC5483e interfaceC5483e, C18316e c18316e) {
        this.appmetrica = c8010e;
        this.ad.appmetrica(interfaceC5483e, c18316e);
    }

    public final boolean license() {
        C2125e c2125e = this.vip;
        c2125e.smaato(0);
        int billing = c2125e.billing(24);
        if (billing != 1) {
            AbstractC10257e.pro("Unexpected start code prefix: ", billing, "PesReader");
            this.adcel = -1;
            return false;
        }
        c2125e.loadAd(8);
        int billing2 = c2125e.billing(16);
        c2125e.loadAd(5);
        this.mopub = c2125e.purchase();
        c2125e.loadAd(2);
        this.purchase = c2125e.purchase();
        this.billing = c2125e.purchase();
        c2125e.loadAd(6);
        int billing3 = c2125e.billing(8);
        this.startapp = billing3;
        if (billing2 == 0) {
            this.adcel = -1;
        } else {
            int i = (billing2 - 3) - billing3;
            this.adcel = i;
            if (i < 0) {
                AbstractC2803e.smaato("PesReader", "Found negative packet payload size: " + this.adcel);
                this.adcel = -1;
            }
        }
        return true;
    }

    public final boolean metrica(C1292e c1292e, byte[] bArr, int i) {
        int min = Math.min(c1292e.ad(), i - this.license);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c1292e.m568protected(min);
        } else {
            c1292e.mopub(this.license, min, bArr);
        }
        int i2 = this.license + min;
        this.license = i2;
        return i2 == i;
    }

    @Override // defpackage.InterfaceC15956e
    public final void vip() {
        this.metrica = 0;
        this.license = 0;
        this.yandex = false;
        this.ad.vip();
    }
}
