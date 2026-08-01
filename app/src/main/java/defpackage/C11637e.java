package defpackage;

import java.util.Arrays;
import java.util.Collections;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11637e implements InterfaceC13397e {
    public static final byte[] inmobi = {73, 68, 51};
    public final boolean ad;
    public int admob;
    public boolean amazon;
    public final int appmetrica;
    public String billing;
    public long isVip;
    public final String license;
    public int pro;
    public final String purchase;
    public boolean smaato;
    public InterfaceC18147e startapp;
    public boolean subscription;
    public InterfaceC18147e tapsense;
    public InterfaceC18147e yandex;
    public final C2125e vip = new C2125e(7, new byte[7]);
    public final C1292e metrica = new C1292e(Arrays.copyOf(inmobi, 10));
    public int loadAd = -1;
    public int Signature = -1;
    public long remoteconfig = -9223372036854775807L;
    public long signatures = -9223372036854775807L;
    public int adcel = 0;
    public int mopub = 0;
    public int advert = PSKKeyManager.MAX_KEY_LENGTH_BYTES;

    public C11637e(int i, String str, String str2, boolean z) {
        this.ad = z;
        this.license = str;
        this.appmetrica = i;
        this.purchase = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    @Override // defpackage.InterfaceC13397e
    public final void ad(C1292e c1292e) {
        int i;
        int i2;
        byte b;
        char c;
        ?? r4;
        int i3;
        char c2;
        int i4;
        char c3;
        int i5;
        this.yandex.getClass();
        String str = AbstractC9413e.ad;
        while (c1292e.ad() > 0) {
            int i6 = this.adcel;
            char c4 = 65535;
            C1292e c1292e2 = this.metrica;
            int i7 = 3;
            C2125e c2125e = this.vip;
            int i8 = 0;
            int i9 = 4;
            int i10 = 1;
            if (i6 == 0) {
                byte[] bArr = c1292e.ad;
                int i11 = c1292e.vip;
                int i12 = c1292e.metrica;
                while (true) {
                    if (i11 >= i12) {
                        c1292e.m571try(i11);
                        break;
                    }
                    i = i11 + 1;
                    i2 = i7;
                    b = bArr[i11];
                    int i13 = b & 255;
                    if (this.advert != 512 || (((65280 | ((((byte) i13) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) != 65520) {
                        c = c4;
                        r4 = i10;
                    } else {
                        if (this.amazon) {
                            break;
                        }
                        int i14 = i11 - 1;
                        c1292e.m571try(i11);
                        byte[] bArr2 = c2125e.vip;
                        if (c1292e.ad() >= i10) {
                            c1292e.mopub(i8, i10, bArr2);
                            c2125e.smaato(i9);
                            int billing = c2125e.billing(i10);
                            int i15 = this.loadAd;
                            if (i15 == -1 || billing == i15) {
                                if (this.Signature != -1) {
                                    byte[] bArr3 = c2125e.vip;
                                    if (c1292e.ad() < i10) {
                                        break;
                                    }
                                    c1292e.mopub(i8, i10, bArr3);
                                    c2125e.smaato(2);
                                    i5 = 4;
                                    if (c2125e.billing(4) == this.Signature) {
                                        c1292e.m571try(i);
                                    }
                                } else {
                                    i5 = 4;
                                }
                                byte[] bArr4 = c2125e.vip;
                                if (c1292e.ad() >= i5) {
                                    c1292e.mopub(i8, i5, bArr4);
                                    c2125e.smaato(14);
                                    int billing2 = c2125e.billing(13);
                                    if (billing2 >= 7) {
                                        byte[] bArr5 = c1292e.ad;
                                        int i16 = c1292e.metrica;
                                        int i17 = i14 + billing2;
                                        if (i17 < i16) {
                                            byte b2 = bArr5[i17];
                                            c = 65535;
                                            if (b2 != -1) {
                                                if (b2 == 73) {
                                                    int i18 = i17 + 1;
                                                    if (i18 != i16) {
                                                        if (bArr5[i18] == 68) {
                                                            int i19 = i17 + 2;
                                                            if (i19 != i16) {
                                                                if (bArr5[i19] == 51) {
                                                                    break;
                                                                }
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                int i20 = i17 + 1;
                                                if (i20 != i16) {
                                                    byte b3 = bArr5[i20];
                                                    if ((((65280 | ((b3 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((b3 & 8) >> 3) == billing) {
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                c = 65535;
                            }
                            r4 = true;
                        }
                        c = 65535;
                        r4 = true;
                    }
                    int i21 = this.advert;
                    int i22 = i13 | i21;
                    if (i22 == 329) {
                        i3 = 3;
                        c2 = 256;
                        i4 = 0;
                        c3 = 2;
                        this.advert = 768;
                    } else if (i22 == 511) {
                        i3 = 3;
                        c2 = 256;
                        i4 = 0;
                        c3 = 2;
                        this.advert = AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                    } else if (i22 == 836) {
                        i3 = 3;
                        c2 = 256;
                        i4 = 0;
                        c3 = 2;
                        this.advert = 1024;
                    } else {
                        if (i22 == 1075) {
                            this.adcel = 2;
                            this.mopub = 3;
                            this.pro = 0;
                            c1292e2.m571try(0);
                            c1292e.m571try(i);
                            break;
                        }
                        c2 = 256;
                        if (i21 != 256) {
                            this.advert = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            i3 = 3;
                            i4 = 0;
                            c3 = 2;
                            i10 = r4;
                            c4 = c;
                            i9 = 4;
                            i8 = i4;
                            i7 = i3;
                        } else {
                            i3 = 3;
                            i4 = 0;
                            c3 = 2;
                        }
                    }
                    i11 = i;
                    i10 = r4;
                    c4 = c;
                    i9 = 4;
                    i8 = i4;
                    i7 = i3;
                }
                this.admob = (b & 8) >> 3;
                this.smaato = (b & 1) == 0;
                if (this.amazon) {
                    this.adcel = i2;
                    this.mopub = 0;
                } else {
                    this.adcel = 1;
                    this.mopub = 0;
                }
                c1292e.m571try(i);
            } else if (i6 != 1) {
                if (i6 == 2) {
                    byte[] bArr6 = c1292e2.ad;
                    int min = Math.min(c1292e.ad(), 10 - this.mopub);
                    c1292e.mopub(this.mopub, min, bArr6);
                    int i23 = this.mopub + min;
                    this.mopub = i23;
                    if (i23 == 10) {
                        this.startapp.appmetrica(10, c1292e2);
                        c1292e2.m571try(6);
                        InterfaceC18147e interfaceC18147e = this.startapp;
                        int applovin = c1292e2.applovin() + 10;
                        this.adcel = 4;
                        this.mopub = 10;
                        this.tapsense = interfaceC18147e;
                        this.isVip = 0L;
                        this.pro = applovin;
                    }
                } else if (i6 == 3) {
                    int i24 = this.smaato ? 7 : 5;
                    byte[] bArr7 = c2125e.vip;
                    int min2 = Math.min(c1292e.ad(), i24 - this.mopub);
                    c1292e.mopub(this.mopub, min2, bArr7);
                    int i25 = this.mopub + min2;
                    this.mopub = i25;
                    if (i25 == i24) {
                        c2125e.smaato(0);
                        if (this.subscription) {
                            c2125e.loadAd(10);
                        } else {
                            int billing3 = c2125e.billing(2) + 1;
                            if (billing3 != 2) {
                                AbstractC2803e.smaato("AdtsReader", "Detected audio object type: " + billing3 + ", but assuming AAC LC.");
                                billing3 = 2;
                            }
                            c2125e.loadAd(5);
                            int billing4 = c2125e.billing(3);
                            int i26 = this.Signature;
                            byte[] bArr8 = {(byte) (((billing3 << 3) & 248) | ((i26 >> 1) & 7)), (byte) (((billing4 << 3) & 120) | ((i26 << 7) & 128))};
                            Cimport loadAd = C7582e.loadAd(new C2125e(2, bArr8), false);
                            C11445e c11445e = new C11445e();
                            c11445e.ad = this.billing;
                            c11445e.smaato = AbstractC8542e.amazon(this.purchase);
                            c11445e.amazon = AbstractC8542e.amazon("audio/mp4a-latm");
                            c11445e.adcel = loadAd.ad;
                            c11445e.f23018class = loadAd.metrica;
                            c11445e.f23021interface = loadAd.vip;
                            c11445e.admob = Collections.singletonList(bArr8);
                            c11445e.license = this.license;
                            c11445e.purchase = this.appmetrica;
                            C16975e c16975e = new C16975e(c11445e);
                            this.remoteconfig = 1024000000 / c16975e.f33281goto;
                            this.yandex.billing(c16975e);
                            this.subscription = true;
                        }
                        c2125e.loadAd(4);
                        int billing5 = c2125e.billing(13);
                        int i27 = billing5 - 7;
                        if (this.smaato) {
                            i27 = billing5 - 9;
                        }
                        InterfaceC18147e interfaceC18147e2 = this.yandex;
                        long j = this.remoteconfig;
                        this.adcel = 4;
                        this.mopub = 0;
                        this.tapsense = interfaceC18147e2;
                        this.isVip = j;
                        this.pro = i27;
                    }
                } else {
                    if (i6 != 4) {
                        throw new IllegalStateException();
                    }
                    int min3 = Math.min(c1292e.ad(), this.pro - this.mopub);
                    this.tapsense.appmetrica(min3, c1292e);
                    int i28 = this.mopub + min3;
                    this.mopub = i28;
                    if (i28 == this.pro) {
                        AbstractC2301e.subscription(this.signatures != -9223372036854775807L);
                        this.tapsense.ad(this.signatures, 1, this.pro, 0, null);
                        this.signatures += this.isVip;
                        this.adcel = 0;
                        this.mopub = 0;
                        this.advert = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    }
                }
            } else if (c1292e.ad() != 0) {
                c2125e.vip[0] = c1292e.ad[c1292e.vip];
                c2125e.smaato(2);
                int billing6 = c2125e.billing(4);
                int i29 = this.Signature;
                if (i29 == -1 || billing6 == i29) {
                    if (!this.amazon) {
                        this.amazon = true;
                        this.loadAd = this.admob;
                        this.Signature = billing6;
                    }
                    this.adcel = 3;
                    this.mopub = 0;
                } else {
                    this.amazon = false;
                    this.adcel = 0;
                    this.mopub = 0;
                    this.advert = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC13397e
    public final void appmetrica(InterfaceC5483e interfaceC5483e, C18316e c18316e) {
        c18316e.ad();
        c18316e.vip();
        this.billing = c18316e.appmetrica;
        c18316e.vip();
        InterfaceC18147e Signature = interfaceC5483e.Signature(c18316e.license, 1);
        this.yandex = Signature;
        this.tapsense = Signature;
        if (!this.ad) {
            this.startapp = new C6891e();
            return;
        }
        c18316e.ad();
        c18316e.vip();
        InterfaceC18147e Signature2 = interfaceC5483e.Signature(c18316e.license, 5);
        this.startapp = Signature2;
        C11445e c11445e = new C11445e();
        c18316e.vip();
        c11445e.ad = c18316e.appmetrica;
        c11445e.smaato = AbstractC8542e.amazon(this.purchase);
        c11445e.amazon = AbstractC8542e.amazon("application/id3");
        AbstractC8647e.firebase(c11445e, Signature2);
    }

    @Override // defpackage.InterfaceC13397e
    public final void license(int i, long j) {
        this.signatures = j;
    }

    @Override // defpackage.InterfaceC13397e
    public final void metrica(boolean z) {
    }

    @Override // defpackage.InterfaceC13397e
    public final void vip() {
        this.signatures = -9223372036854775807L;
        this.amazon = false;
        this.adcel = 0;
        this.mopub = 0;
        this.advert = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }
}
