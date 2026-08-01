package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِّۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12693e {
    public static final String Signature;
    public static final String admob;
    public static final C12693e advert;
    public static final String amazon;
    public static final String loadAd;
    public static final C0101e mopub;
    public static final String pro;
    public static final String remoteconfig;
    public static final String signatures;
    public static final String smaato;
    public static final String subscription;
    public static final String tapsense;
    public final C0101e ad;
    public final long adcel;
    public final long appmetrica;
    public final long billing;
    public final long license;
    public final long metrica;
    public final int purchase;
    public final long startapp;
    public final boolean vip;
    public final long yandex;

    static {
        C0101e c0101e = new C0101e(null, 0, null, null, 0, 0L, 0L, -1, -1);
        mopub = c0101e;
        advert = new C12693e(c0101e, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = AbstractC9413e.ad;
        smaato = Integer.toString(0, 36);
        amazon = Integer.toString(1, 36);
        loadAd = Integer.toString(2, 36);
        Signature = Integer.toString(3, 36);
        admob = Integer.toString(4, 36);
        subscription = Integer.toString(5, 36);
        remoteconfig = Integer.toString(6, 36);
        pro = Integer.toString(7, 36);
        signatures = Integer.toString(8, 36);
        tapsense = Integer.toString(9, 36);
    }

    public C12693e(C0101e c0101e, boolean z, long j, long j2, long j3, int i, long j4, long j5, long j6, long j7) {
        AbstractC2301e.billing(z == (c0101e.yandex != -1));
        this.ad = c0101e;
        this.vip = z;
        this.metrica = j;
        this.license = j2;
        this.appmetrica = j3;
        this.purchase = i;
        this.billing = j4;
        this.yandex = j5;
        this.startapp = j6;
        this.adcel = j7;
    }

    public static C12693e vip(int i, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(smaato);
        return new C12693e(bundle2 == null ? mopub : C0101e.metrica(i, bundle2), bundle.getBoolean(amazon, false), bundle.getLong(loadAd, -9223372036854775807L), bundle.getLong(Signature, -9223372036854775807L), bundle.getLong(admob, 0L), bundle.getInt(subscription, 0), bundle.getLong(remoteconfig, 0L), bundle.getLong(pro, -9223372036854775807L), bundle.getLong(signatures, -9223372036854775807L), bundle.getLong(tapsense, 0L));
    }

    public final C12693e ad(boolean z, boolean z2) {
        if (z && z2) {
            return this;
        }
        return new C12693e(this.ad.vip(z, z2), z && this.vip, this.metrica, z ? this.license : -9223372036854775807L, z ? this.appmetrica : 0L, z ? this.purchase : 0, z ? this.billing : 0L, z ? this.yandex : -9223372036854775807L, z ? this.startapp : -9223372036854775807L, z ? this.adcel : 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12693e.class == obj.getClass()) {
            C12693e c12693e = (C12693e) obj;
            if (this.metrica == c12693e.metrica && this.ad.equals(c12693e.ad) && this.vip == c12693e.vip && this.license == c12693e.license && this.appmetrica == c12693e.appmetrica && this.purchase == c12693e.purchase && this.billing == c12693e.billing && this.yandex == c12693e.yandex && this.startapp == c12693e.startapp && this.adcel == c12693e.adcel) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.ad, Boolean.valueOf(this.vip));
    }

    public final Bundle metrica(int i) {
        Bundle bundle = new Bundle();
        C0101e c0101e = this.ad;
        if (i < 3 || !mopub.ad(c0101e)) {
            bundle.putBundle(smaato, c0101e.license(i));
        }
        boolean z = this.vip;
        if (z) {
            bundle.putBoolean(amazon, z);
        }
        long j = this.metrica;
        if (j != -9223372036854775807L) {
            bundle.putLong(loadAd, j);
        }
        long j2 = this.license;
        if (j2 != -9223372036854775807L) {
            bundle.putLong(Signature, j2);
        }
        long j3 = this.appmetrica;
        if (i < 3 || j3 != 0) {
            bundle.putLong(admob, j3);
        }
        int i2 = this.purchase;
        if (i2 != 0) {
            bundle.putInt(subscription, i2);
        }
        long j4 = this.billing;
        if (j4 != 0) {
            bundle.putLong(remoteconfig, j4);
        }
        long j5 = this.yandex;
        if (j5 != -9223372036854775807L) {
            bundle.putLong(pro, j5);
        }
        long j6 = this.startapp;
        if (j6 != -9223372036854775807L) {
            bundle.putLong(signatures, j6);
        }
        long j7 = this.adcel;
        if (i >= 3 && j7 == 0) {
            return bundle;
        }
        bundle.putLong(tapsense, j7);
        return bundle;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        C0101e c0101e = this.ad;
        sb.append(c0101e.vip);
        sb.append(", periodIndex=");
        sb.append(c0101e.appmetrica);
        sb.append(", positionMs=");
        sb.append(c0101e.purchase);
        sb.append(", contentPositionMs=");
        sb.append(c0101e.billing);
        sb.append(", adGroupIndex=");
        sb.append(c0101e.yandex);
        sb.append(", adIndexInAdGroup=");
        sb.append(c0101e.startapp);
        sb.append("}, isPlayingAd=");
        sb.append(this.vip);
        sb.append(", eventTimeMs=");
        sb.append(this.metrica);
        sb.append(", durationMs=");
        sb.append(this.license);
        sb.append(", bufferedPositionMs=");
        sb.append(this.appmetrica);
        sb.append(", bufferedPercentage=");
        sb.append(this.purchase);
        sb.append(", totalBufferedDurationMs=");
        sb.append(this.billing);
        sb.append(", currentLiveOffsetMs=");
        sb.append(this.yandex);
        sb.append(", contentDurationMs=");
        sb.append(this.startapp);
        sb.append(", contentBufferedPositionMs=");
        return AbstractC5087e.m1750native(this.adcel, "}", sb);
    }
}
