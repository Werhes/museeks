package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16531e implements InterfaceC15956e {
    public final InterfaceC5283e ad;
    public boolean appmetrica;
    public int license;
    public int metrica;
    public boolean purchase;
    public final C1292e vip = new C1292e(32);

    public C16531e(InterfaceC5283e interfaceC5283e) {
        this.ad = interfaceC5283e;
    }

    @Override // defpackage.InterfaceC15956e
    public final void ad(int i, C1292e c1292e) {
        boolean z = (i & 1) != 0;
        int ads = z ? c1292e.vip + c1292e.ads() : -1;
        if (this.purchase) {
            if (!z) {
                return;
            }
            this.purchase = false;
            c1292e.m571try(ads);
            this.license = 0;
        }
        while (c1292e.ad() > 0) {
            int i2 = this.license;
            C1292e c1292e2 = this.vip;
            if (i2 < 3) {
                if (i2 == 0) {
                    int ads2 = c1292e.ads();
                    c1292e.m571try(c1292e.vip - 1);
                    if (ads2 == 255) {
                        this.purchase = true;
                        return;
                    }
                }
                int min = Math.min(c1292e.ad(), 3 - this.license);
                c1292e.mopub(this.license, min, c1292e2.ad);
                int i3 = this.license + min;
                this.license = i3;
                if (i3 == 3) {
                    c1292e2.m571try(0);
                    c1292e2.m572while(3);
                    c1292e2.m568protected(1);
                    int ads3 = c1292e2.ads();
                    int ads4 = c1292e2.ads();
                    this.appmetrica = (ads3 & 128) != 0;
                    int i4 = (((ads3 & 15) << 8) | ads4) + 3;
                    this.metrica = i4;
                    byte[] bArr = c1292e2.ad;
                    if (bArr.length < i4) {
                        c1292e2.metrica(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(c1292e.ad(), this.metrica - this.license);
                c1292e.mopub(this.license, min2, c1292e2.ad);
                int i5 = this.license + min2;
                this.license = i5;
                int i6 = this.metrica;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.appmetrica) {
                        c1292e2.m572while(i6);
                    } else {
                        if (AbstractC9413e.admob(0, i6, -1, c1292e2.ad) != 0) {
                            this.purchase = true;
                            return;
                        }
                        c1292e2.m572while(this.metrica - 4);
                    }
                    c1292e2.m571try(0);
                    this.ad.ad(c1292e2);
                    this.license = 0;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC15956e
    public final void billing(C8010e c8010e, InterfaceC5483e interfaceC5483e, C18316e c18316e) {
        this.ad.billing(c8010e, interfaceC5483e, c18316e);
        this.purchase = true;
    }

    @Override // defpackage.InterfaceC15956e
    public final void vip() {
        this.purchase = true;
    }
}
