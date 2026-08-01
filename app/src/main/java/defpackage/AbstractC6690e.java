package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙ۠ؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6690e {
    public static final C12182e ad = new Object();
    public static final String license;
    public static final String metrica;
    public static final String vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eّؑ۟] */
    static {
        String str = AbstractC9413e.ad;
        vip = Integer.toString(0, 36);
        metrica = Integer.toString(1, 36);
        license = Integer.toString(2, 36);
    }

    public final boolean Signature() {
        return loadAd() == 0;
    }

    public int ad(boolean z) {
        return Signature() ? -1 : 0;
    }

    public final Pair adcel(C11501e c11501e, C6158e c6158e, int i, long j, long j2) {
        AbstractC2301e.mopub(i, loadAd());
        smaato(i, c11501e, j2);
        if (j == -9223372036854775807L) {
            j = c11501e.advert;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c11501e.amazon;
        purchase(i2, c6158e, false);
        while (i2 < c11501e.loadAd && c6158e.appmetrica != j) {
            int i3 = i2 + 1;
            if (purchase(i3, c6158e, false).appmetrica > j) {
                break;
            }
            i2 = i3;
        }
        purchase(i2, c6158e, true);
        long j3 = j - c6158e.appmetrica;
        long j4 = c6158e.license;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = c6158e.vip;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public abstract Object advert(int i);

    public final void amazon(int i, C11501e c11501e) {
        smaato(i, c11501e, 0L);
    }

    public int appmetrica(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == metrica(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == metrica(z) ? ad(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public C6158e billing(Object obj, C6158e c6158e) {
        return purchase(vip(obj), c6158e, true);
    }

    public boolean equals(Object obj) {
        int metrica2;
        if (this != obj) {
            if (obj instanceof AbstractC6690e) {
                AbstractC6690e abstractC6690e = (AbstractC6690e) obj;
                if (abstractC6690e.loadAd() == loadAd() && abstractC6690e.yandex() == yandex()) {
                    C11501e c11501e = new C11501e();
                    C6158e c6158e = new C6158e();
                    C11501e c11501e2 = new C11501e();
                    C6158e c6158e2 = new C6158e();
                    int i = 0;
                    while (true) {
                        if (i >= loadAd()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= yandex()) {
                                    int ad2 = ad(true);
                                    if (ad2 == abstractC6690e.ad(true) && (metrica2 = metrica(true)) == abstractC6690e.metrica(true)) {
                                        while (ad2 != metrica2) {
                                            int appmetrica = appmetrica(ad2, 0, true);
                                            if (appmetrica == abstractC6690e.appmetrica(ad2, 0, true)) {
                                                ad2 = appmetrica;
                                            }
                                        }
                                    }
                                } else {
                                    if (!purchase(i2, c6158e, true).equals(abstractC6690e.purchase(i2, c6158e2, true))) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else {
                            if (!smaato(i, c11501e, 0L).equals(abstractC6690e.smaato(i, c11501e2, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C11501e c11501e = new C11501e();
        C6158e c6158e = new C6158e();
        int loadAd = loadAd() + 217;
        for (int i = 0; i < loadAd(); i++) {
            loadAd = (loadAd * 31) + smaato(i, c11501e, 0L).hashCode();
        }
        int yandex = yandex() + (loadAd * 31);
        for (int i2 = 0; i2 < yandex(); i2++) {
            yandex = (yandex * 31) + purchase(i2, c6158e, true).hashCode();
        }
        int ad2 = ad(true);
        while (ad2 != -1) {
            yandex = (yandex * 31) + ad2;
            ad2 = appmetrica(ad2, 0, true);
        }
        return yandex;
    }

    public final int license(int i, C6158e c6158e, C11501e c11501e, int i2, boolean z) {
        int i3 = purchase(i, c6158e, false).metrica;
        if (smaato(i3, c11501e, 0L).loadAd != i) {
            return i + 1;
        }
        int appmetrica = appmetrica(i3, i2, z);
        if (appmetrica == -1) {
            return -1;
        }
        return smaato(appmetrica, c11501e, 0L).amazon;
    }

    public abstract int loadAd();

    public int metrica(boolean z) {
        if (Signature()) {
            return -1;
        }
        return loadAd() - 1;
    }

    public int mopub(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == ad(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == ad(z) ? metrica(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract C6158e purchase(int i, C6158e c6158e, boolean z);

    public abstract C11501e smaato(int i, C11501e c11501e, long j);

    public final Pair startapp(C11501e c11501e, C6158e c6158e, int i, long j) {
        Pair adcel = adcel(c11501e, c6158e, i, j, 0L);
        adcel.getClass();
        return adcel;
    }

    public abstract int vip(Object obj);

    public abstract int yandex();
}
