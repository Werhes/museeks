package defpackage;

import java.nio.ByteOrder;
import java.util.Collections;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٔ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15008e {
    public final int ad;
    public final long adcel;
    public final C17750e advert;
    public final int appmetrica;
    public final int billing;
    public final int license;
    public final int metrica;
    public final C16911e mopub;
    public final int purchase;
    public final int startapp;
    public final int vip;
    public final int yandex;

    public C15008e(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C16911e c16911e, C17750e c17750e) {
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
        this.license = i4;
        this.appmetrica = i5;
        this.purchase = license(i5);
        this.billing = i6;
        this.yandex = i7;
        this.startapp = ad(i7);
        this.adcel = j;
        this.mopub = c16911e;
        this.advert = c17750e;
    }

    public C15008e(int i, byte[] bArr) {
        C2125e c2125e = new C2125e(bArr.length, bArr);
        c2125e.smaato(i * 8);
        this.ad = c2125e.billing(16);
        this.vip = c2125e.billing(16);
        this.metrica = c2125e.billing(24);
        this.license = c2125e.billing(24);
        int billing = c2125e.billing(20);
        this.appmetrica = billing;
        this.purchase = license(billing);
        this.billing = c2125e.billing(3) + 1;
        int billing2 = c2125e.billing(5) + 1;
        this.yandex = billing2;
        this.startapp = ad(billing2);
        this.adcel = c2125e.startapp(36);
        this.mopub = null;
        this.advert = null;
    }

    public static int ad(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int license(int i) {
        switch (i) {
            case 8000:
                return 4;
            case AbstractC1815e.AUDIO_CONTENT_SAMPLING_RATE /* 16000 */:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final C16975e metrica(byte[] bArr, C17750e c17750e) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.license;
        if (i <= 0) {
            i = -1;
        }
        C17750e c17750e2 = this.advert;
        if (c17750e2 != null) {
            c17750e = c17750e2.vip(c17750e);
        }
        C11445e c11445e = new C11445e();
        c11445e.amazon = AbstractC8542e.amazon("audio/flac");
        c11445e.loadAd = i;
        c11445e.f23018class = this.billing;
        c11445e.f23021interface = this.appmetrica;
        String str = AbstractC9413e.ad;
        c11445e.f23020goto = AbstractC9413e.m2548class(this.yandex, ByteOrder.LITTLE_ENDIAN);
        c11445e.admob = Collections.singletonList(bArr);
        c11445e.mopub = c17750e;
        return new C16975e(c11445e);
    }

    public final long vip() {
        long j = this.adcel;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.appmetrica;
    }
}
