package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۤؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14351e {
    public int Signature;
    public final int ad;
    public int adcel;
    public double admob;
    public int advert;
    public int amazon;
    public final float appmetrica;
    public final int billing;
    public final float license;
    public int loadAd;
    public final float metrica;
    public int mopub;
    public final int purchase;
    public int smaato;
    public final InterfaceC10166e startapp;
    public final int vip;
    public final int yandex;

    public C14351e(int i, int i2, float f, float f2, int i3, boolean z) {
        this.ad = i;
        this.vip = i2;
        this.metrica = f;
        this.license = f2;
        this.appmetrica = i / i3;
        this.purchase = i / 400;
        int i4 = i / 65;
        this.billing = i4;
        this.yandex = i4 * 2;
        this.startapp = z ? new C2761e(this) : new C11224e(this);
    }

    public final void ad(int i, int i2) {
        InterfaceC10166e interfaceC10166e = this.startapp;
        interfaceC10166e.adcel(i2);
        Object yandex = interfaceC10166e.yandex();
        int i3 = this.vip;
        System.arraycopy(yandex, i * i3, interfaceC10166e.startapp(), this.mopub * i3, i3 * i2);
        this.mopub += i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void vip() {
        float f;
        int i;
        double d;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        long j2;
        int i9 = this.mopub;
        float f2 = this.metrica;
        float f3 = this.license;
        double d2 = f2 / f3;
        float f4 = this.appmetrica * f3;
        int i10 = this.ad;
        int i11 = 1;
        InterfaceC10166e interfaceC10166e = this.startapp;
        int i12 = this.vip;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            int i13 = this.adcel;
            int i14 = this.yandex;
            if (i13 >= i14) {
                int i15 = 0;
                while (true) {
                    int i16 = this.loadAd;
                    if (i16 > 0) {
                        int min = Math.min(i14, i16);
                        ad(i15, min);
                        this.loadAd -= min;
                        i15 += min;
                        f = f4;
                        d = d2;
                        i4 = i11;
                        i2 = i14;
                    } else {
                        int i17 = i10 > 4000 ? i10 / 4000 : i11;
                        int i18 = this.billing;
                        int i19 = this.purchase;
                        if (i12 == i11 && i17 == i11) {
                            i = interfaceC10166e.purchase(i15, i19, i18);
                            f = f4;
                        } else {
                            interfaceC10166e.appmetrica(i15, i17);
                            f = f4;
                            int admob = interfaceC10166e.admob(i19 / i17, i18 / i17);
                            if (i17 != i11) {
                                int i20 = admob * i17;
                                int i21 = i17 * 4;
                                int i22 = i20 - i21;
                                int i23 = i20 + i21;
                                if (i22 >= i19) {
                                    i19 = i22;
                                }
                                if (i23 <= i18) {
                                    i18 = i23;
                                }
                                if (i12 == i11) {
                                    i = interfaceC10166e.purchase(i15, i19, i18);
                                } else {
                                    interfaceC10166e.appmetrica(i15, i11);
                                    i = interfaceC10166e.admob(i19, i18);
                                }
                            } else {
                                i = admob;
                            }
                        }
                        int i24 = interfaceC10166e.mopub() ? this.Signature : i;
                        interfaceC10166e.billing();
                        this.Signature = i;
                        if (d2 > 1.0d) {
                            if (d2 >= 2.0d) {
                                i5 = i11;
                                double d3 = (i24 / (d2 - 1.0d)) + this.admob;
                                i6 = (int) Math.round(d3);
                                d = d2;
                                this.admob = d3 - i6;
                                interfaceC10166e = interfaceC10166e;
                            } else {
                                d = d2;
                                i5 = i11;
                                double d4 = (((2.0d - d) * i24) / (d - 1.0d)) + this.admob;
                                int round = (int) Math.round(d4);
                                this.loadAd = round;
                                this.admob = d4 - round;
                                i6 = i24;
                            }
                            interfaceC10166e.adcel(i6);
                            int i25 = i14;
                            int i26 = i6;
                            interfaceC10166e.smaato(i26, this.vip, this.mopub, i15, i15 + i24);
                            this.mopub += i26;
                            i15 = i24 + i26 + i15;
                            i2 = i25;
                            i4 = i5;
                        } else {
                            d = d2;
                            int i27 = i11;
                            int i28 = i14;
                            if (d < 0.5d) {
                                i2 = i28;
                                double d5 = ((i24 * d) / (1.0d - d)) + this.admob;
                                int round2 = (int) Math.round(d5);
                                this.admob = d5 - round2;
                                i3 = round2;
                            } else {
                                i2 = i28;
                                double d6 = ((((d * 2.0d) - 1.0d) * i24) / (1.0d - d)) + this.admob;
                                int round3 = (int) Math.round(d6);
                                this.loadAd = round3;
                                this.admob = d6 - round3;
                                i3 = i24;
                            }
                            int i29 = i24 + i3;
                            interfaceC10166e.adcel(i29);
                            i4 = i27;
                            System.arraycopy(interfaceC10166e.yandex(), i15 * i12, interfaceC10166e.startapp(), this.mopub * i12, i24 * i12);
                            int i30 = i15;
                            interfaceC10166e.smaato(i3, this.vip, this.mopub + i24, i24 + i15, i30);
                            this.mopub += i29;
                            i15 = i30 + i3;
                        }
                    }
                    if (i15 + i2 > i13) {
                        break;
                    }
                    i14 = i2;
                    f4 = f;
                    i11 = i4;
                    d2 = d;
                }
                int i31 = this.adcel - i15;
                System.arraycopy(interfaceC10166e.yandex(), i15 * i12, interfaceC10166e.yandex(), 0, i31 * i12);
                this.adcel = i31;
                if (f != 1.0f || this.mopub == i9) {
                }
                long j3 = i10 / f;
                long j4 = i10;
                while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                    j3 /= 2;
                    j4 /= 2;
                }
                int i32 = this.mopub - i9;
                interfaceC10166e.amazon(i32);
                System.arraycopy(interfaceC10166e.startapp(), i9 * i12, interfaceC10166e.advert(), this.advert * i12, i32 * i12);
                this.mopub = i9;
                this.advert += i32;
                int i33 = 0;
                while (true) {
                    i7 = this.advert - 1;
                    if (i33 >= i7) {
                        break;
                    }
                    while (true) {
                        i8 = this.smaato + 1;
                        j = i8;
                        long j5 = j * j3;
                        j2 = this.amazon;
                        if (j5 <= j2 * j4) {
                            break;
                        }
                        int i34 = i4;
                        interfaceC10166e.adcel(i34);
                        interfaceC10166e.metrica(i33, j4, j3);
                        this.amazon += i34;
                        this.mopub += i34;
                    }
                    int i35 = i4;
                    this.smaato = i8;
                    if (j == j4) {
                        this.smaato = 0;
                        AbstractC2301e.subscription(j2 == j3 ? i35 : 0);
                        this.amazon = 0;
                    }
                    i33++;
                    i4 = i35;
                }
                if (i7 == 0) {
                    return;
                }
                System.arraycopy(interfaceC10166e.advert(), i7 * i12, interfaceC10166e.advert(), 0, (this.advert - i7) * i12);
                this.advert -= i7;
                return;
            }
        } else {
            ad(0, this.adcel);
            this.adcel = 0;
        }
        f = f4;
        i4 = 1;
        if (f != 1.0f) {
        }
    }
}
