package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0101e {
    public static final String Signature;
    public static final String adcel;
    public static final String advert;
    public static final String amazon;
    public static final String loadAd;
    public static final String mopub;
    public static final String smaato;
    public final Object ad;
    public final int appmetrica;
    public final long billing;
    public final Object license;
    public final C1962e metrica;
    public final long purchase;
    public final int startapp;
    public final int vip;
    public final int yandex;

    static {
        String str = AbstractC9413e.ad;
        adcel = Integer.toString(0, 36);
        mopub = Integer.toString(1, 36);
        advert = Integer.toString(2, 36);
        smaato = Integer.toString(3, 36);
        amazon = Integer.toString(4, 36);
        loadAd = Integer.toString(5, 36);
        Signature = Integer.toString(6, 36);
    }

    public C0101e(Object obj, int i, C1962e c1962e, Object obj2, int i2, long j, long j2, int i3, int i4) {
        AbstractC2301e.billing(i >= 0);
        AbstractC2301e.billing(i2 >= 0);
        this.ad = obj;
        this.vip = i;
        this.metrica = c1962e;
        this.license = obj2;
        this.appmetrica = i2;
        this.purchase = j;
        this.billing = j2;
        this.yandex = i3;
        this.startapp = i4;
    }

    public static C0101e metrica(int i, Bundle bundle) {
        int max = Math.max(0, bundle.getInt(adcel, 0));
        Bundle bundle2 = bundle.getBundle(mopub);
        return new C0101e(null, max, bundle2 == null ? null : C1962e.ad(i, bundle2), null, Math.max(0, bundle.getInt(advert, 0)), bundle.getLong(smaato, 0L), bundle.getLong(amazon, 0L), bundle.getInt(loadAd, -1), bundle.getInt(Signature, -1));
    }

    public final boolean ad(C0101e c0101e) {
        return this.vip == c0101e.vip && this.appmetrica == c0101e.appmetrica && this.purchase == c0101e.purchase && this.billing == c0101e.billing && this.yandex == c0101e.yandex && this.startapp == c0101e.startapp && Objects.equals(this.metrica, c0101e.metrica);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0101e.class == obj.getClass()) {
            C0101e c0101e = (C0101e) obj;
            if (ad(c0101e) && Objects.equals(this.ad, c0101e.ad) && Objects.equals(this.license, c0101e.license)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.ad, Integer.valueOf(this.vip), this.metrica, this.license, Integer.valueOf(this.appmetrica), Long.valueOf(this.purchase), Long.valueOf(this.billing), Integer.valueOf(this.yandex), Integer.valueOf(this.startapp));
    }

    public final Bundle license(int i) {
        Bundle bundle = new Bundle();
        int i2 = this.vip;
        if (i < 3 || i2 != 0) {
            bundle.putInt(adcel, i2);
        }
        C1962e c1962e = this.metrica;
        if (c1962e != null) {
            bundle.putBundle(mopub, c1962e.metrica(i, false));
        }
        int i3 = this.appmetrica;
        if (i < 3 || i3 != 0) {
            bundle.putInt(advert, i3);
        }
        long j = this.purchase;
        if (i < 3 || j != 0) {
            bundle.putLong(smaato, j);
        }
        long j2 = this.billing;
        if (i < 3 || j2 != 0) {
            bundle.putLong(amazon, j2);
        }
        int i4 = this.yandex;
        if (i4 != -1) {
            bundle.putInt(loadAd, i4);
        }
        int i5 = this.startapp;
        if (i5 != -1) {
            bundle.putInt(Signature, i5);
        }
        return bundle;
    }

    public final String toString() {
        String str = "mediaItem=" + this.vip + ", period=" + this.appmetrica + ", pos=" + this.purchase;
        int i = this.yandex;
        if (i == -1) {
            return str;
        }
        StringBuilder isPro = AbstractC8703e.isPro(str, ", contentPos=");
        isPro.append(this.billing);
        isPro.append(", adGroup=");
        isPro.append(i);
        isPro.append(", ad=");
        isPro.append(this.startapp);
        return isPro.toString();
    }

    public final C0101e vip(boolean z, boolean z2) {
        if (z && z2) {
            return this;
        }
        return new C0101e(this.ad, z2 ? this.vip : 0, z ? this.metrica : null, this.license, z2 ? this.appmetrica : 0, z ? this.purchase : 0L, z ? this.billing : 0L, z ? this.yandex : -1, z ? this.startapp : -1);
    }
}
