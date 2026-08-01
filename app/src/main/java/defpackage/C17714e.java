package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ٘ؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17714e {
    public final boolean ad;
    public final boolean adcel;
    public final boolean advert;
    public final byte amazon;
    public final boolean appmetrica;
    public final int billing;
    public final boolean license;
    public final byte loadAd;
    public final boolean metrica;
    public final boolean mopub;
    public final int purchase;
    public final byte smaato;
    public final boolean startapp;
    public final boolean vip;
    public final boolean yandex;

    public C17714e(C17569e c17569e) {
        int i = c17569e.ad;
        ByteBuffer byteBuffer = c17569e.vip;
        AbstractC2301e.billing(i == 1);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        C2125e c2125e = new C2125e(remaining, bArr);
        this.billing = c2125e.billing(3);
        c2125e.amazon();
        boolean purchase = c2125e.purchase();
        this.ad = purchase;
        if (purchase) {
            c2125e.billing(5);
            this.vip = false;
            this.yandex = false;
        } else {
            if (c2125e.purchase()) {
                c2125e.loadAd(64);
                if (c2125e.purchase()) {
                    int i2 = 0;
                    while (!c2125e.purchase()) {
                        i2++;
                    }
                    if (i2 < 32) {
                        c2125e.loadAd(i2);
                    }
                }
                boolean purchase2 = c2125e.purchase();
                this.vip = purchase2;
                if (purchase2) {
                    c2125e.loadAd(47);
                }
            } else {
                this.vip = false;
            }
            this.yandex = c2125e.purchase();
            int billing = c2125e.billing(5);
            for (int i3 = 0; i3 <= billing; i3++) {
                c2125e.loadAd(12);
                if (i3 == 0) {
                    if (c2125e.billing(5) > 7) {
                        c2125e.purchase();
                    }
                } else if (c2125e.billing(5) > 7) {
                    c2125e.amazon();
                }
                if (this.vip) {
                    c2125e.amazon();
                }
                if (this.yandex && c2125e.purchase()) {
                    if (i3 == 0) {
                        c2125e.billing(4);
                    } else {
                        c2125e.loadAd(4);
                    }
                }
            }
        }
        int billing2 = c2125e.billing(4);
        int billing3 = c2125e.billing(4);
        c2125e.loadAd(billing2 + 1);
        c2125e.loadAd(billing3 + 1);
        if (this.ad) {
            this.metrica = false;
        } else {
            this.metrica = c2125e.purchase();
        }
        if (this.metrica) {
            c2125e.loadAd(4);
            c2125e.loadAd(3);
        }
        c2125e.loadAd(3);
        if (this.ad) {
            this.appmetrica = true;
            this.license = true;
            this.purchase = 0;
        } else {
            c2125e.loadAd(4);
            boolean purchase3 = c2125e.purchase();
            if (purchase3) {
                c2125e.loadAd(2);
            }
            if (c2125e.purchase()) {
                this.license = true;
            } else {
                this.license = c2125e.purchase();
            }
            if (!this.license) {
                this.appmetrica = true;
            } else if (c2125e.purchase()) {
                this.appmetrica = true;
            } else {
                this.appmetrica = c2125e.purchase();
            }
            if (purchase3) {
                this.purchase = c2125e.billing(3) + 1;
            } else {
                this.purchase = 0;
            }
        }
        c2125e.loadAd(3);
        boolean purchase4 = c2125e.purchase();
        if (this.billing == 2 && purchase4) {
            this.startapp = c2125e.purchase();
        } else {
            this.startapp = false;
        }
        if (this.billing != 1) {
            this.adcel = c2125e.purchase();
        } else {
            this.adcel = false;
        }
        if (c2125e.purchase()) {
            this.smaato = (byte) c2125e.billing(8);
            this.amazon = (byte) c2125e.billing(8);
            this.loadAd = (byte) c2125e.billing(8);
        } else {
            this.smaato = (byte) 0;
            this.amazon = (byte) 0;
            this.loadAd = (byte) 0;
        }
        if (this.adcel) {
            c2125e.amazon();
            this.mopub = false;
            this.advert = false;
        } else if (this.smaato == 1 && this.amazon == 13 && this.loadAd == 0) {
            this.mopub = false;
            this.advert = false;
        } else {
            c2125e.amazon();
            int i4 = this.billing;
            if (i4 == 0) {
                this.mopub = true;
                this.advert = true;
            } else if (i4 == 1) {
                this.mopub = false;
                this.advert = false;
            } else if (this.startapp) {
                boolean purchase5 = c2125e.purchase();
                this.mopub = purchase5;
                if (purchase5) {
                    this.advert = c2125e.purchase();
                } else {
                    this.advert = false;
                }
            } else {
                this.mopub = true;
                this.advert = false;
            }
            if (this.mopub && this.advert) {
                c2125e.billing(2);
            }
        }
        c2125e.amazon();
    }
}
