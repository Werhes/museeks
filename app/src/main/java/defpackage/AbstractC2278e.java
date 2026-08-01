package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؐؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2278e {
    public static final long ad(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            AbstractC15805e.ad("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return yandex(i, i2, i3, i4);
    }

    public static /* synthetic */ long adcel(int i, int i2, int i3, long j) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return startapp(i, j, i2);
    }

    public static final Void advert(int i) {
        throw new IllegalArgumentException(AbstractC1634e.smaato("Can't represent a size of ", i, " in Constraints"));
    }

    public static final long appmetrica(long j, long j2) {
        int adcel = C5602e.adcel(j);
        int yandex = C5602e.yandex(j);
        int startapp = C5602e.startapp(j);
        int billing = C5602e.billing(j);
        int adcel2 = C5602e.adcel(j2);
        if (adcel2 < adcel) {
            adcel2 = adcel;
        }
        if (adcel2 > yandex) {
            adcel2 = yandex;
        }
        int yandex2 = C5602e.yandex(j2);
        if (yandex2 >= adcel) {
            adcel = yandex2;
        }
        if (adcel <= yandex) {
            yandex = adcel;
        }
        int startapp2 = C5602e.startapp(j2);
        if (startapp2 < startapp) {
            startapp2 = startapp;
        }
        if (startapp2 > billing) {
            startapp2 = billing;
        }
        int billing2 = C5602e.billing(j2);
        if (billing2 >= startapp) {
            startapp = billing2;
        }
        if (startapp <= billing) {
            billing = startapp;
        }
        return ad(adcel2, yandex, startapp2, billing);
    }

    public static final int billing(int i, long j) {
        int adcel = C5602e.adcel(j);
        int yandex = C5602e.yandex(j);
        if (i < adcel) {
            i = adcel;
        }
        return i > yandex ? yandex : i;
    }

    public static final long license(long j, long j2) {
        int i = (int) (j2 >> 32);
        int adcel = C5602e.adcel(j);
        int yandex = C5602e.yandex(j);
        if (i < adcel) {
            i = adcel;
        }
        if (i <= yandex) {
            yandex = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int startapp = C5602e.startapp(j);
        int billing = C5602e.billing(j);
        if (i2 < startapp) {
            i2 = startapp;
        }
        if (i2 <= billing) {
            billing = i2;
        }
        return (yandex << 32) | (4294967295L & billing);
    }

    public static final int metrica(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static final void mopub(int i, int i2) {
        throw new IllegalArgumentException(AbstractC8647e.inmobi(i, i2, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    public static final int purchase(int i, long j) {
        int startapp = C5602e.startapp(j);
        int billing = C5602e.billing(j);
        if (i < startapp) {
            i = startapp;
        }
        return i > billing ? billing : i;
    }

    public static final long startapp(int i, long j, int i2) {
        int adcel = C5602e.adcel(j) + i;
        if (adcel < 0) {
            adcel = 0;
        }
        int yandex = C5602e.yandex(j);
        if (yandex != Integer.MAX_VALUE && (yandex = yandex + i) < 0) {
            yandex = 0;
        }
        int startapp = C5602e.startapp(j) + i2;
        if (startapp < 0) {
            startapp = 0;
        }
        int billing = C5602e.billing(j);
        return ad(adcel, yandex, startapp, (billing == Integer.MAX_VALUE || (billing = billing + i2) >= 0) ? billing : 0);
    }

    public static /* synthetic */ long vip(int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return ad(i, i2, i3, i4);
    }

    public static final long yandex(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int metrica = metrica(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int metrica2 = metrica(i6);
        if (metrica + metrica2 > 31) {
            mopub(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = metrica2 - 13;
        return ((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (metrica2 + 2)) | ((i8 & (~(i8 >> 31))) << (metrica2 + 33));
    }
}
