package defpackage;

import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4047e implements InterfaceC13397e {
    public final C1292e ad;
    public int adcel;
    public C16975e advert;
    public int amazon;
    public InterfaceC18147e billing;
    public final int license;
    public final String metrica;
    public long mopub;
    public String purchase;
    public int smaato;
    public int startapp;
    public int yandex = 0;
    public long admob = -9223372036854775807L;
    public final AtomicInteger vip = new AtomicInteger();
    public int loadAd = -1;
    public int Signature = -1;
    public final String appmetrica = "video/mp2t";

    public C4047e(String str, int i, int i2) {
        this.ad = new C1292e(new byte[i2]);
        this.metrica = str;
        this.license = i;
    }

    @Override // defpackage.InterfaceC13397e
    public final void ad(C1292e c1292e) {
        int i;
        byte b;
        int i2;
        byte b2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        int i9;
        long j2;
        int i10;
        int i11;
        int i12;
        int i13;
        this.billing.getClass();
        while (c1292e.ad() > 0) {
            int i14 = this.yandex;
            C1292e c1292e2 = this.ad;
            switch (i14) {
                case 0:
                    while (true) {
                        if (c1292e.ad() > 0) {
                            int i15 = this.adcel << 8;
                            this.adcel = i15;
                            int ads = i15 | c1292e.ads();
                            this.adcel = ads;
                            int metrica = AbstractC9110e.metrica(ads);
                            this.amazon = metrica;
                            if (metrica != 0) {
                                byte[] bArr = c1292e2.ad;
                                int i16 = this.adcel;
                                bArr[0] = (byte) ((i16 >> 24) & 255);
                                bArr[1] = (byte) ((i16 >> 16) & 255);
                                bArr[2] = (byte) ((i16 >> 8) & 255);
                                bArr[3] = (byte) (i16 & 255);
                                this.startapp = 4;
                                this.adcel = 0;
                                if (metrica != 3 && metrica != 4) {
                                    if (metrica == 1) {
                                        this.yandex = 1;
                                        break;
                                    } else {
                                        this.yandex = 2;
                                        break;
                                    }
                                } else {
                                    this.yandex = 4;
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    if (!purchase(c1292e, c1292e2.ad, 18)) {
                        break;
                    } else {
                        byte[] bArr2 = c1292e2.ad;
                        if (this.advert == null) {
                            String str = this.purchase;
                            C2125e license = AbstractC9110e.license(bArr2);
                            license.loadAd(60);
                            int i17 = AbstractC9110e.ad[license.billing(6)];
                            int i18 = AbstractC9110e.vip[license.billing(4)];
                            int billing = license.billing(5);
                            int i19 = billing >= 29 ? -1 : (AbstractC9110e.metrica[billing] * 1000) / 2;
                            license.loadAd(10);
                            int i20 = i17 + (license.billing(2) > 0 ? 1 : 0);
                            C11445e c11445e = new C11445e();
                            c11445e.ad = str;
                            c11445e.smaato = AbstractC8542e.amazon(this.appmetrica);
                            c11445e.amazon = AbstractC8542e.amazon("audio/vnd.dts");
                            c11445e.yandex = i19;
                            c11445e.f23018class = i20;
                            c11445e.f23021interface = i18;
                            c11445e.subscription = null;
                            c11445e.license = this.metrica;
                            c11445e.purchase = this.license;
                            C16975e c16975e = new C16975e(c11445e);
                            this.advert = c16975e;
                            this.billing.billing(c16975e);
                        }
                        this.smaato = AbstractC9110e.vip(bArr2);
                        byte b3 = bArr2[0];
                        if (b3 != -2) {
                            if (b3 == -1) {
                                i = (bArr2[4] & 7) << 4;
                                b2 = bArr2[7];
                            } else if (b3 != 31) {
                                i = (bArr2[4] & 1) << 6;
                                b = bArr2[5];
                            } else {
                                i = (bArr2[5] & 7) << 4;
                                b2 = bArr2[6];
                            }
                            i2 = b2 & 60;
                            this.mopub = AbstractC10509e.purchase(AbstractC9413e.m2560package(this.advert.f33281goto, (((i2 >> 2) | i) + 1) * 32));
                            c1292e2.m571try(0);
                            this.billing.appmetrica(18, c1292e2);
                            this.yandex = 6;
                            break;
                        } else {
                            i = (bArr2[5] & 1) << 6;
                            b = bArr2[4];
                        }
                        i2 = b & 252;
                        this.mopub = AbstractC10509e.purchase(AbstractC9413e.m2560package(this.advert.f33281goto, (((i2 >> 2) | i) + 1) * 32));
                        c1292e2.m571try(0);
                        this.billing.appmetrica(18, c1292e2);
                        this.yandex = 6;
                    }
                case 2:
                    if (purchase(c1292e, c1292e2.ad, 7)) {
                        C2125e license2 = AbstractC9110e.license(c1292e2.ad);
                        license2.loadAd(42);
                        this.loadAd = license2.billing(license2.purchase() ? 12 : 8) + 1;
                        this.yandex = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    int i21 = 8;
                    if (purchase(c1292e, c1292e2.ad, this.loadAd)) {
                        C2125e license3 = AbstractC9110e.license(c1292e2.ad);
                        license3.loadAd(40);
                        int billing2 = license3.billing(2);
                        if (license3.purchase()) {
                            i3 = 20;
                            i4 = 12;
                        } else {
                            i3 = 16;
                            i4 = 8;
                        }
                        license3.loadAd(i4);
                        int billing3 = license3.billing(i3) + 1;
                        boolean purchase = license3.purchase();
                        if (purchase) {
                            i5 = license3.billing(2);
                            i6 = (license3.billing(3) + 1) * AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                            if (license3.purchase()) {
                                license3.loadAd(36);
                            }
                            int billing4 = license3.billing(3) + 1;
                            int billing5 = license3.billing(3) + 1;
                            if (billing4 != 1 || billing5 != 1) {
                                throw C15125e.metrica("Multiple audio presentations or assets not supported");
                            }
                            int i22 = billing2 + 1;
                            int billing6 = license3.billing(i22);
                            int i23 = 0;
                            while (i23 < i22) {
                                if (((billing6 >> i23) & 1) == 1) {
                                    license3.loadAd(i21);
                                }
                                i23++;
                                i21 = 8;
                            }
                            if (license3.purchase()) {
                                license3.loadAd(2);
                                int billing7 = (license3.billing(2) + 1) << 2;
                                int billing8 = license3.billing(2) + 1;
                                for (int i24 = 0; i24 < billing8; i24++) {
                                    license3.loadAd(billing7);
                                }
                            }
                        } else {
                            i5 = -1;
                            i6 = 0;
                        }
                        license3.loadAd(i3);
                        license3.loadAd(12);
                        if (purchase) {
                            if (license3.purchase()) {
                                license3.loadAd(4);
                            }
                            if (license3.purchase()) {
                                license3.loadAd(24);
                            }
                            if (license3.purchase()) {
                                license3.Signature(license3.billing(10) + 1);
                            }
                            license3.loadAd(5);
                            i8 = AbstractC9110e.license[license3.billing(4)];
                            i7 = license3.billing(8) + 1;
                        } else {
                            i7 = -1;
                            i8 = -2147483647;
                        }
                        if (purchase) {
                            if (i5 == 0) {
                                i9 = 32000;
                            } else if (i5 == 1) {
                                i9 = 44100;
                            } else {
                                if (i5 != 2) {
                                    throw C15125e.ad(null, "Unsupported reference clock code in DTS HD header: " + i5);
                                }
                                i9 = 48000;
                            }
                            String str2 = AbstractC9413e.ad;
                            j = AbstractC9413e.m2555import(i6, 1000000L, i9, RoundingMode.DOWN);
                        } else {
                            j = -9223372036854775807L;
                        }
                        billing(new Cimport(i7, i8, billing3, j, "audio/vnd.dts.hd;profile=lbr"));
                        this.smaato = billing3;
                        this.mopub = j == -9223372036854775807L ? 0L : j;
                        c1292e2.m571try(0);
                        this.billing.appmetrica(this.loadAd, c1292e2);
                        this.yandex = 6;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (purchase(c1292e, c1292e2.ad, 6)) {
                        C2125e license4 = AbstractC9110e.license(c1292e2.ad);
                        license4.loadAd(32);
                        int billing9 = AbstractC9110e.billing(license4, AbstractC9110e.startapp) + 1;
                        this.Signature = billing9;
                        int i25 = this.startapp;
                        if (i25 > billing9) {
                            int i26 = i25 - billing9;
                            this.startapp = i25 - i26;
                            c1292e.m571try(c1292e.vip - i26);
                        }
                        this.yandex = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (purchase(c1292e, c1292e2.ad, this.Signature)) {
                        byte[] bArr3 = c1292e2.ad;
                        C2125e license5 = AbstractC9110e.license(bArr3);
                        int i27 = license5.billing(32) == 1078008818 ? 1 : 0;
                        int billing10 = AbstractC9110e.billing(license5, AbstractC9110e.appmetrica);
                        int i28 = billing10 + 1;
                        if (i27 == 0) {
                            j2 = -9223372036854775807L;
                            i10 = -2147483647;
                        } else {
                            if (!license5.purchase()) {
                                throw C15125e.metrica("Only supports full channel mask-based audio presentation");
                            }
                            int i29 = billing10 - 1;
                            int i30 = ((bArr3[i29] << 8) & 65535) | (bArr3[billing10] & 255);
                            String str3 = AbstractC9413e.ad;
                            int i31 = 65535;
                            for (int i32 = 0; i32 < i29; i32++) {
                                byte b4 = bArr3[i32];
                                int[] iArr = AbstractC9413e.mopub;
                                int i33 = (iArr[(((b4 & 255) >> 4) ^ ((i31 >> 12) & 255)) & 255] ^ ((i31 << 4) & 65535)) & 65535;
                                i31 = (iArr[((b4 & 15) ^ ((i33 >> 12) & 255)) & 255] ^ ((i33 << 4) & 65535)) & 65535;
                            }
                            if (i30 != i31) {
                                throw C15125e.ad(null, "CRC check failed");
                            }
                            int billing11 = license5.billing(2);
                            if (billing11 != 0) {
                                if (billing11 == 1) {
                                    i12 = 480;
                                } else {
                                    if (billing11 != 2) {
                                        throw C15125e.ad(null, "Unsupported base duration index in DTS UHD header: " + billing11);
                                    }
                                    i12 = 384;
                                }
                                i11 = 3;
                            } else {
                                i11 = 3;
                                i12 = AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                            }
                            int billing12 = (license5.billing(i11) + 1) * i12;
                            int billing13 = license5.billing(2);
                            if (billing13 == 0) {
                                i13 = 32000;
                            } else if (billing13 == 1) {
                                i13 = 44100;
                            } else {
                                if (billing13 != 2) {
                                    throw C15125e.ad(null, "Unsupported clock rate index in DTS UHD header: " + billing13);
                                }
                                i13 = 48000;
                            }
                            if (license5.purchase()) {
                                license5.loadAd(36);
                            }
                            int billing14 = i13 * (1 << license5.billing(2));
                            j2 = AbstractC9413e.m2555import(billing12, 1000000L, i13, RoundingMode.DOWN);
                            i10 = billing14;
                        }
                        int i34 = 0;
                        for (int i35 = 0; i35 < i27; i35++) {
                            i34 += AbstractC9110e.billing(license5, AbstractC9110e.purchase);
                        }
                        AtomicInteger atomicInteger = this.vip;
                        if (i27 != 0) {
                            atomicInteger.set(AbstractC9110e.billing(license5, AbstractC9110e.billing));
                        }
                        int billing15 = i34 + (atomicInteger.get() != 0 ? AbstractC9110e.billing(license5, AbstractC9110e.yandex) : 0) + i28;
                        Cimport cimport = new Cimport(2, i10, billing15, j2, "audio/vnd.dts.uhd;profile=p2");
                        if (this.amazon == 3) {
                            billing(cimport);
                        }
                        this.smaato = billing15;
                        this.mopub = j2 == -9223372036854775807L ? 0L : j2;
                        c1292e2.m571try(0);
                        this.billing.appmetrica(this.Signature, c1292e2);
                        this.yandex = 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(c1292e.ad(), this.smaato - this.startapp);
                    this.billing.appmetrica(min, c1292e);
                    int i36 = this.startapp + min;
                    this.startapp = i36;
                    if (i36 != this.smaato) {
                        break;
                    } else {
                        AbstractC2301e.subscription(this.admob != -9223372036854775807L);
                        this.billing.ad(this.admob, this.amazon == 4 ? 0 : 1, this.smaato, 0, null);
                        this.admob += this.mopub;
                        this.yandex = 0;
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // defpackage.InterfaceC13397e
    public final void appmetrica(InterfaceC5483e interfaceC5483e, C18316e c18316e) {
        c18316e.ad();
        c18316e.vip();
        this.purchase = c18316e.appmetrica;
        c18316e.vip();
        this.billing = interfaceC5483e.Signature(c18316e.license, 1);
    }

    public final void billing(Cimport cimport) {
        int i = cimport.vip;
        String str = cimport.ad;
        int i2 = cimport.metrica;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        C16975e c16975e = this.advert;
        if (c16975e != null && i2 == c16975e.f33282interface && i == c16975e.f33281goto && str.equals(c16975e.loadAd)) {
            return;
        }
        C16975e c16975e2 = this.advert;
        C11445e c11445e = c16975e2 == null ? new C11445e() : c16975e2.ad();
        c11445e.ad = this.purchase;
        c11445e.smaato = AbstractC8542e.amazon(this.appmetrica);
        c11445e.amazon = AbstractC8542e.amazon(str);
        c11445e.f23018class = i2;
        c11445e.f23021interface = i;
        c11445e.license = this.metrica;
        c11445e.purchase = this.license;
        C16975e c16975e3 = new C16975e(c11445e);
        this.advert = c16975e3;
        this.billing.billing(c16975e3);
    }

    @Override // defpackage.InterfaceC13397e
    public final void license(int i, long j) {
        this.admob = j;
    }

    @Override // defpackage.InterfaceC13397e
    public final void metrica(boolean z) {
    }

    public final boolean purchase(C1292e c1292e, byte[] bArr, int i) {
        int min = Math.min(c1292e.ad(), i - this.startapp);
        c1292e.mopub(this.startapp, min, bArr);
        int i2 = this.startapp + min;
        this.startapp = i2;
        return i2 == i;
    }

    @Override // defpackage.InterfaceC13397e
    public final void vip() {
        this.yandex = 0;
        this.startapp = 0;
        this.adcel = 0;
        this.admob = -9223372036854775807L;
        this.vip.set(0);
    }
}
