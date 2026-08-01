package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘّٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5602e {
    public final long ad;

    public /* synthetic */ C5602e(long j) {
        this.ad = j;
    }

    public static long ad(int i, int i2, int i3, int i4, int i5, long j) {
        if ((i5 & 1) != 0) {
            i = adcel(j);
        }
        if ((i5 & 2) != 0) {
            i2 = yandex(j);
        }
        if ((i5 & 4) != 0) {
            i3 = startapp(j);
        }
        if ((i5 & 8) != 0) {
            i4 = billing(j);
        }
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            AbstractC15805e.ad("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return AbstractC2278e.yandex(i, i2, i3, i4);
    }

    public static final int adcel(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    public static String advert(long j) {
        int yandex = yandex(j);
        String valueOf = yandex == Integer.MAX_VALUE ? "Infinity" : String.valueOf(yandex);
        int billing = billing(j);
        String valueOf2 = billing != Integer.MAX_VALUE ? String.valueOf(billing) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(adcel(j));
        sb.append(", maxWidth = ");
        sb.append(valueOf);
        sb.append(", minHeight = ");
        sb.append(startapp(j));
        sb.append(", maxHeight = ");
        return AbstractC4653e.applovin(sb, valueOf2, ')');
    }

    public static final boolean appmetrica(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Alert.DURATION_SHOW_INDEFINITELY : i5 - 1);
    }

    public static final int billing(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        return i3 == 0 ? Alert.DURATION_SHOW_INDEFINITELY : i3 - 1;
    }

    public static final boolean license(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean metrica(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    public static final boolean mopub(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((((int) (j >> 33)) & ((1 << (i2 + 13)) - 1)) - 1 == 0) | ((((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) - 1 == 0);
    }

    public static final boolean purchase(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        return i3 == (i4 == 0 ? Alert.DURATION_SHOW_INDEFINITELY : i4 - 1);
    }

    public static final int startapp(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    public static final boolean vip(long j, long j2) {
        return j == j2;
    }

    public static final int yandex(long j) {
        int i = (int) (3 & j);
        int i2 = ((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        return i2 == 0 ? Alert.DURATION_SHOW_INDEFINITELY : i2 - 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5602e) {
            return this.ad == ((C5602e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ad;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return advert(this.ad);
    }
}
