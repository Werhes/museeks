package defpackage;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4571e {
    public final C16089e ad;
    public int adcel;
    public boolean advert;
    public final C7513e amazon;
    public final C3123e appmetrica;
    public int billing;
    public final C14768e license;
    public final C12894e loadAd;
    public final C16399e metrica;
    public int mopub;
    public float purchase;
    public int smaato;
    public int startapp;
    public final C3123e vip;
    public int yandex;

    public C4571e(C16089e c16089e, C7513e c7513e, C18414e c18414e) {
        this.ad = c16089e;
        C3123e c3123e = AbstractC12146e.ad;
        this.vip = new C3123e();
        this.metrica = new C16399e();
        int i = AbstractC4349e.ad;
        this.license = new C14768e();
        this.appmetrica = new C3123e();
        this.billing = -1;
        this.yandex = Alert.DURATION_SHOW_INDEFINITELY;
        this.startapp = RecyclerView.UNDEFINED_DURATION;
        this.amazon = c7513e;
        this.loadAd = new C12894e(c18414e);
    }

    public final int ad(C12894e c12894e, int i, boolean z) {
        List list;
        List list2;
        C3123e c3123e = this.appmetrica;
        if (c3123e.ad(i)) {
            return ((C5515e) c3123e.vip(i)).vip;
        }
        C3123e c3123e2 = this.vip;
        int i2 = 0;
        if (c3123e2.ad(i)) {
            if (!z || (list2 = (List) c3123e2.vip(i)) == null) {
                return -1;
            }
            int size = list2.size();
            while (i2 < size) {
                ((InterfaceC5066e) list2.get(i2)).ad();
                i2++;
            }
            return -1;
        }
        C16065e c16065e = new C16065e(this, c12894e, 0);
        C14870e c14870e = (C14870e) c12894e.f25750e;
        if (c14870e == null) {
            c14870e = null;
        }
        long j = c14870e.signatures;
        C7513e c7513e = (C7513e) c12894e.f25752e;
        c3123e2.startapp(i, Collections.singletonList((c7513e != null ? c7513e : null).ad(i, j, true, new C10869e(c16065e, c12894e, 22))));
        if (!z || (list = (List) c3123e2.vip(i)) == null) {
            return -1;
        }
        int size2 = list.size();
        while (i2 < size2) {
            ((InterfaceC5066e) list.get(i2)).ad();
            i2++;
        }
        return -1;
    }

    public final void appmetrica(float f, C14870e c14870e) {
        C4571e c4571e;
        int i;
        int i2;
        C12894e c12894e = this.loadAd;
        c12894e.f25750e = c14870e;
        c12894e.f25752e = this.amazon;
        float f2 = -f;
        yandex();
        if (c12894e.signatures()) {
            C14870e c14870e2 = (C14870e) c12894e.f25750e;
            if (c14870e2 == null) {
                c14870e2 = null;
            }
            AbstractC10653e.metrica(c14870e2);
            C14870e c14870e3 = (C14870e) c12894e.f25750e;
            if (c14870e3 == null) {
                c14870e3 = null;
            }
            InterfaceC14388e interfaceC14388e = c14870e3.pro;
            this.smaato = c12894e.isPro();
            int pro = c12894e.pro();
            int tapsense = c12894e.tapsense();
            int isPro = c12894e.isPro();
            int inmobi = c12894e.inmobi();
            int isVip = c12894e.isVip();
            C3123e c3123e = this.appmetrica;
            if (f2 <= 0.0f) {
                this.adcel = 0 - inmobi;
                this.yandex = pro;
                while (this.adcel > 0 && (i2 = this.yandex) > 0 && c3123e.ad(i2 - 1)) {
                    this.yandex--;
                    this.adcel -= ((C5515e) c3123e.vip(this.yandex - 1)).vip;
                }
                purchase(0, this.yandex - 1);
            } else {
                this.mopub = 0 - isVip;
                this.startapp = tapsense;
                while (this.mopub > 0 && (i = this.startapp) < isPro - 1 && c3123e.ad(i + 1)) {
                    int i3 = ((C5515e) c3123e.vip(this.startapp + 1)).vip;
                    this.startapp++;
                    this.mopub -= i3;
                }
                purchase(this.startapp + 1, isPro - 1);
            }
        }
        if (c12894e.signatures()) {
            C14870e c14870e4 = (C14870e) c12894e.f25750e;
            if (c14870e4 == null) {
                c14870e4 = null;
            }
            AbstractC10653e.metrica(c14870e4);
            C14870e c14870e5 = (C14870e) c12894e.f25750e;
            c4571e = this;
            c4571e.license(c12894e, c12894e.pro(), c12894e.tapsense(), (c14870e5 != null ? c14870e5 : null).pro != null ? ((AbstractC16904e) this.ad.f31681e).loadAd : 0, c12894e.isVip(), c12894e.inmobi(), f2, f2 <= 0.0f);
        } else {
            c4571e = this;
        }
        c4571e.purchase = f2;
        yandex();
    }

    public final void billing() {
        this.yandex = Alert.DURATION_SHOW_INDEFINITELY;
        this.startapp = RecyclerView.UNDEFINED_DURATION;
        this.adcel = 0;
        this.mopub = 0;
        this.advert = false;
        this.license.ad();
        this.appmetrica.metrica();
        C3123e c3123e = this.vip;
        long[] jArr = c3123e.ad;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = c3123e.vip[i4];
                        List list = (List) c3123e.metrica[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((InterfaceC5066e) list.get(i6)).cancel();
                        }
                        c3123e.yandex(i4);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void license(C12894e c12894e, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        int i7;
        boolean z2 = Math.signum(f) == Math.signum(this.purchase);
        if (!z) {
            if (!z2 || this.advert) {
                this.adcel = i3 - i5;
                this.yandex = i;
            } else {
                int appmetrica = AbstractC1561e.appmetrica(Math.abs(f)) + this.adcel;
                int i8 = i3 - i5;
                if (appmetrica > i8) {
                    appmetrica = i8;
                }
                this.adcel = appmetrica;
            }
            while (this.adcel > 0 && (i6 = this.yandex) > 0) {
                int ad = ad(c12894e, this.yandex - 1, i6 + (-1) == i + (-1) && ((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) != 0) && Math.abs(f) >= ((float) i5));
                if (ad == -1) {
                    return;
                }
                this.yandex--;
                this.adcel -= ad;
            }
            return;
        }
        if (!z2 || this.advert) {
            this.mopub = i3 - i4;
            this.startapp = i2;
        } else {
            int appmetrica2 = AbstractC1561e.appmetrica(Math.abs(f)) + this.mopub;
            int i9 = i3 - i4;
            if (appmetrica2 > i9) {
                appmetrica2 = i9;
            }
            this.mopub = appmetrica2;
        }
        while (this.mopub > 0) {
            int i10 = this.startapp;
            c12894e.getClass();
            if (i10 == -1 || (i7 = this.startapp) >= this.smaato - 1) {
                return;
            }
            int ad2 = ad(c12894e, this.startapp + 1, i7 + 1 == i2 + 1 && ((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) != 0) && Math.abs(f) >= ((float) i4));
            if (ad2 == -1) {
                return;
            }
            this.startapp++;
            this.mopub -= ad2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, eًؘۧ] */
    public final void metrica(C12894e c12894e, int i, int i2) {
        C5515e c5515e;
        int i3;
        int i4;
        C3123e c3123e = this.appmetrica;
        C5515e c5515e2 = (C5515e) c3123e.vip(i);
        C5107e c5107e = C5515e.metrica;
        if (c5515e2 != null) {
            c5515e2.vip = i2;
            c5515e2.ad = c5107e;
            c5515e = c5515e2;
        } else {
            ?? obj = new Object();
            obj.ad = c5107e;
            obj.vip = i2;
            c5515e = obj;
        }
        c3123e.startapp(i, c5515e);
        if (i > this.startapp) {
            this.startapp = i;
            this.mopub -= i2;
        } else if (i < this.yandex) {
            this.yandex = i;
            this.adcel -= i2;
        }
        if (Math.signum(this.purchase) <= 0.0f) {
            if (this.mopub > 0) {
                i3 = this.startapp + 1;
                i4 = i3;
            }
            i4 = -1;
        } else {
            if (Math.signum(this.purchase) > 0.0f && this.adcel > 0) {
                i3 = this.yandex - 1;
                i4 = i3;
            }
            i4 = -1;
        }
        if (i4 > 0) {
            c12894e.getClass();
            if (i4 != -1 && i4 < this.smaato) {
                C16065e c16065e = new C16065e(this, c12894e, 1);
                C14870e c14870e = (C14870e) c12894e.f25750e;
                if (c14870e == null) {
                    c14870e = null;
                }
                long j = c14870e.signatures;
                C7513e c7513e = (C7513e) c12894e.f25752e;
                this.vip.startapp(i4, Collections.singletonList((c7513e != null ? c7513e : null).ad(i4, j, true, new C10869e(c16065e, c12894e, 22))));
            }
        }
        yandex();
    }

    public final void purchase(int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        int[] iArr;
        int[] iArr2;
        int i3;
        char c3;
        int i4;
        C16399e c16399e = this.metrica;
        c16399e.vip();
        C3123e c3123e = this.vip;
        int[] iArr3 = c3123e.vip;
        long[] jArr = c3123e.ad;
        int length = jArr.length - 2;
        int i5 = 8;
        if (length >= 0) {
            int i6 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j4 = jArr[i6];
                c = 7;
                j3 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((j4 & 255) < 128 && i <= (i4 = iArr3[(i6 << 3) + i8]) && i4 <= i2) {
                            c16399e.ad(i4);
                        }
                        j4 >>= 8;
                    }
                    if (i7 != 8) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                } else {
                    i6++;
                }
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        C14768e c14768e = this.license;
        int[] iArr4 = c14768e.vip;
        long[] jArr2 = c14768e.ad;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j5 = jArr2[i9];
                if ((((~j5) << c) & j5 & j3) != j3) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j5 & j2) < j) {
                            c3 = c;
                            int i12 = iArr4[(i9 << 3) + i11];
                            if (i <= i12 && i12 <= i2) {
                                c16399e.ad(i12);
                            }
                        } else {
                            c3 = c;
                        }
                        j5 >>= 8;
                        i11++;
                        c = c3;
                    }
                    c2 = c;
                    if (i10 != 8) {
                        break;
                    }
                } else {
                    c2 = c;
                }
                if (i9 == length2) {
                    break;
                }
                i9++;
                c = c2;
            }
        } else {
            c2 = c;
        }
        C3123e c3123e2 = this.appmetrica;
        int[] iArr5 = c3123e2.vip;
        long[] jArr3 = c3123e2.ad;
        int length3 = jArr3.length - 2;
        if (length3 >= 0) {
            int i13 = 0;
            while (true) {
                long j6 = jArr3[i13];
                if ((((~j6) << c2) & j6 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length3)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j6 & j2) < j) {
                            i3 = i5;
                            int i16 = iArr5[(i13 << 3) + i15];
                            if (i <= i16 && i16 <= i2) {
                                c16399e.ad(i16);
                            }
                        } else {
                            i3 = i5;
                        }
                        j6 >>= i3;
                        i15++;
                        i5 = i3;
                    }
                    if (i14 != i5) {
                        break;
                    }
                }
                if (i13 == length3) {
                    break;
                }
                i13++;
                i5 = 8;
            }
        }
        int[] iArr6 = c16399e.vip;
        long[] jArr4 = c16399e.ad;
        int length4 = jArr4.length - 2;
        if (length4 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j7 = jArr4[i17];
            if ((((~j7) << c2) & j7 & j3) != j3) {
                int i18 = 8 - ((~(i17 - length4)) >>> 31);
                int i19 = 0;
                while (i19 < i18) {
                    if ((j7 & j2) < j) {
                        int i20 = iArr6[(i17 << 3) + i19];
                        List list = (List) c3123e.billing(i20);
                        if (list != null) {
                            int size = list.size();
                            for (int i21 = 0; i21 < size; i21++) {
                                ((InterfaceC5066e) list.get(i21)).cancel();
                            }
                        }
                        int metrica = c14768e.metrica(i20);
                        if (metrica >= 0) {
                            c14768e.appmetrica--;
                            long[] jArr5 = c14768e.ad;
                            int i22 = c14768e.license;
                            int i23 = metrica >> 3;
                            int i24 = (metrica & 7) << 3;
                            iArr2 = iArr6;
                            long j8 = (jArr5[i23] & (~(255 << i24))) | (254 << i24);
                            jArr5[i23] = j8;
                            jArr5[(((metrica - 7) & i22) + (i22 & 7)) >> 3] = j8;
                        } else {
                            iArr2 = iArr6;
                        }
                        c3123e2.billing(i20);
                    } else {
                        iArr2 = iArr6;
                    }
                    j7 >>= 8;
                    i19++;
                    iArr6 = iArr2;
                }
                iArr = iArr6;
                if (i18 != 8) {
                    return;
                }
            } else {
                iArr = iArr6;
            }
            if (i17 == length4) {
                return;
            }
            i17++;
            iArr6 = iArr;
        }
    }

    public final boolean vip() {
        return (this.yandex == Integer.MAX_VALUE || this.startapp == Integer.MIN_VALUE) ? false : true;
    }

    public final void yandex() {
        AbstractC14204e.m3773final(this.adcel, "prefetchWindowStartExtraSpace");
        AbstractC14204e.m3773final(this.mopub, "prefetchWindowEndExtraSpace");
        AbstractC14204e.m3773final(this.yandex, "prefetchWindowStartIndex");
        AbstractC14204e.m3773final(this.startapp, "prefetchWindowEndIndex");
    }
}
