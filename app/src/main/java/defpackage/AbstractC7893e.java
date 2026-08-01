package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7893e {
    public static final C15492e ad = new AbstractC4455e(new C13630e(10));

    public static final long ad(C9553e c9553e, long j) {
        long j2 = c9553e.ad;
        long j3 = c9553e.f18923catch;
        long j4 = c9553e.f18920abstract;
        long j5 = c9553e.f18958while;
        long j6 = c9553e.admob;
        if (C3618e.metrica(j, j2)) {
            return c9553e.vip;
        }
        if (C3618e.metrica(j, c9553e.purchase)) {
            return c9553e.billing;
        }
        if (C3618e.metrica(j, c9553e.adcel)) {
            return c9553e.mopub;
        }
        if (C3618e.metrica(j, c9553e.amazon)) {
            return c9553e.loadAd;
        }
        if (C3618e.metrica(j, c9553e.isVip)) {
            return c9553e.inmobi;
        }
        if (C3618e.metrica(j, c9553e.metrica)) {
            return c9553e.license;
        }
        if (C3618e.metrica(j, c9553e.yandex)) {
            return c9553e.startapp;
        }
        if (C3618e.metrica(j, c9553e.advert)) {
            return c9553e.smaato;
        }
        if (C3618e.metrica(j, c9553e.isPro)) {
            return c9553e.applovin;
        }
        if (C3618e.metrica(j, c9553e.signatures)) {
            return c9553e.tapsense;
        }
        if (C3618e.metrica(j, c9553e.Signature)) {
            return j6;
        }
        if (C3618e.metrica(j, c9553e.subscription)) {
            return c9553e.remoteconfig;
        }
        if (C3618e.metrica(j, c9553e.crashlytics) || C3618e.metrica(j, c9553e.f18924class) || C3618e.metrica(j, c9553e.f18939interface) || C3618e.metrica(j, c9553e.f18935goto) || C3618e.metrica(j, c9553e.f18952this) || C3618e.metrica(j, c9553e.f18940native) || C3618e.metrica(j, c9553e.firebase)) {
            return j6;
        }
        if (C3618e.metrica(j, c9553e.f18929extends) || C3618e.metrica(j, c9553e.f18953throw)) {
            return j5;
        }
        if (C3618e.metrica(j, c9553e.f18944protected) || C3618e.metrica(j, c9553e.f18921break)) {
            return j4;
        }
        if (C3618e.metrica(j, c9553e.f18936implements) || C3618e.metrica(j, c9553e.f18922case)) {
            return j3;
        }
        int i = C3618e.mopub;
        return C3618e.adcel;
    }

    public static final long appmetrica(C13770e c13770e, int i) {
        return license(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad, i);
    }

    public static final long billing(C9553e c9553e, float f) {
        return C15765e.vip(f, (float) 0) ? c9553e.Signature : AbstractC6532e.billing(C3618e.vip(((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, c9553e.pro), c9553e.Signature);
    }

    public static final long license(C9553e c9553e, int i) {
        switch (AbstractC8703e.m2467class(i)) {
            case 0:
                return c9553e.amazon;
            case 1:
                return c9553e.isVip;
            case 2:
                return c9553e.isPro;
            case 3:
                return c9553e.tapsense;
            case 4:
                return c9553e.appmetrica;
            case 5:
                return c9553e.signatures;
            case 6:
                return c9553e.loadAd;
            case 7:
                return c9553e.inmobi;
            case 8:
                return c9553e.applovin;
            case 9:
                return c9553e.vip;
            case 10:
                return c9553e.license;
            case 11:
                return c9553e.f18958while;
            case 12:
                return c9553e.f18956try;
            case 13:
                return c9553e.billing;
            case 14:
                return c9553e.startapp;
            case 15:
                return c9553e.f18920abstract;
            case 16:
                return c9553e.f18927default;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return c9553e.admob;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return c9553e.remoteconfig;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return c9553e.mopub;
            case 20:
                return c9553e.smaato;
            case 21:
                return c9553e.f18923catch;
            case 22:
                return c9553e.f18932final;
            case 23:
                return c9553e.ads;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return c9553e.premium;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return c9553e.ad;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return c9553e.metrica;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return c9553e.f18929extends;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return c9553e.f18953throw;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return c9553e.subs;
            case 30:
                return c9553e.purchase;
            case 31:
                return c9553e.yandex;
            case 32:
                return c9553e.f18944protected;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                return c9553e.f18921break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                return c9553e.Signature;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                return c9553e.crashlytics;
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                return c9553e.f18924class;
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                return c9553e.f18939interface;
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                return c9553e.f18935goto;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return c9553e.f18952this;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                return c9553e.f18940native;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                return c9553e.firebase;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                return c9553e.pro;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                return c9553e.subscription;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                return c9553e.adcel;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                return c9553e.advert;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                return c9553e.f18936implements;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                return c9553e.f18922case;
            default:
                throw new C14803e(10);
        }
    }

    public static C9553e metrica(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, int i, int i2) {
        long j21 = (i & 1) != 0 ? AbstractC13311e.applovin : j;
        return new C9553e(j21, (i & 2) != 0 ? AbstractC13311e.adcel : j2, (i & 4) != 0 ? AbstractC13311e.ads : j3, AbstractC13311e.mopub, AbstractC13311e.appmetrica, (i & 32) != 0 ? AbstractC13311e.firebase : j4, AbstractC13311e.amazon, (i & 128) != 0 ? AbstractC13311e.f26546class : j5, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? AbstractC13311e.loadAd : j6, AbstractC13311e.f26547default, AbstractC13311e.pro, (i & 2048) != 0 ? AbstractC13311e.f26550implements : j7, AbstractC13311e.signatures, (i & 8192) != 0 ? AbstractC13311e.ad : j8, AbstractC13311e.billing, (32768 & i) != 0 ? AbstractC13311e.f26554this : j9, (65536 & i) != 0 ? AbstractC13311e.subscription : j10, (131072 & i) != 0 ? AbstractC13311e.f26542abstract : j11, (262144 & i) != 0 ? AbstractC13311e.remoteconfig : j12, j21, AbstractC13311e.purchase, (2097152 & i) != 0 ? AbstractC13311e.license : j13, AbstractC13311e.vip, AbstractC13311e.yandex, AbstractC13311e.metrica, AbstractC13311e.startapp, (67108864 & i) != 0 ? AbstractC13311e.inmobi : j14, (134217728 & i) != 0 ? AbstractC13311e.isPro : j15, AbstractC13311e.crashlytics, AbstractC13311e.f26552native, AbstractC13311e.f26543break, (1073741824 & i) != 0 ? AbstractC13311e.f26548extends : j16, (i & RecyclerView.UNDEFINED_DURATION) != 0 ? AbstractC13311e.f26555throw : j17, (i2 & 1) != 0 ? AbstractC13311e.f26557while : j18, (i2 & 2) != 0 ? AbstractC13311e.f26556try : j19, (i2 & 4) != 0 ? AbstractC13311e.f26553protected : j20, AbstractC13311e.premium, AbstractC13311e.subs, AbstractC13311e.advert, AbstractC13311e.smaato, AbstractC13311e.f26551interface, AbstractC13311e.f26549goto, AbstractC13311e.Signature, AbstractC13311e.admob, AbstractC13311e.f26544case, AbstractC13311e.f26545catch, AbstractC13311e.tapsense, AbstractC13311e.isVip);
    }

    public static C9553e purchase(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, int i, int i2) {
        long j21 = (i & 1) != 0 ? AbstractC17592e.applovin : j;
        return new C9553e(j21, (i & 2) != 0 ? AbstractC17592e.adcel : j2, (i & 4) != 0 ? AbstractC17592e.ads : j3, AbstractC17592e.mopub, AbstractC17592e.appmetrica, (i & 32) != 0 ? AbstractC17592e.firebase : j4, AbstractC17592e.amazon, (i & 128) != 0 ? AbstractC17592e.f34443class : j5, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? AbstractC17592e.loadAd : j6, AbstractC17592e.f34444default, AbstractC17592e.pro, (i & 2048) != 0 ? AbstractC17592e.f34447implements : j7, AbstractC17592e.signatures, (i & 8192) != 0 ? AbstractC17592e.ad : j8, AbstractC17592e.billing, (32768 & i) != 0 ? AbstractC17592e.f34451this : j9, (65536 & i) != 0 ? AbstractC17592e.subscription : j10, (131072 & i) != 0 ? AbstractC17592e.f34439abstract : j11, (262144 & i) != 0 ? AbstractC17592e.remoteconfig : j12, j21, AbstractC17592e.purchase, (2097152 & i) != 0 ? AbstractC17592e.license : j13, AbstractC17592e.vip, AbstractC17592e.yandex, AbstractC17592e.metrica, AbstractC17592e.startapp, (67108864 & i) != 0 ? AbstractC17592e.inmobi : j14, (134217728 & i) != 0 ? AbstractC17592e.isPro : j15, AbstractC17592e.crashlytics, AbstractC17592e.f34449native, AbstractC17592e.f34440break, (1073741824 & i) != 0 ? AbstractC17592e.f34445extends : j16, (i & RecyclerView.UNDEFINED_DURATION) != 0 ? AbstractC17592e.f34452throw : j17, (i2 & 1) != 0 ? AbstractC17592e.f34454while : j18, (i2 & 2) != 0 ? AbstractC17592e.f34453try : j19, (i2 & 4) != 0 ? AbstractC17592e.f34450protected : j20, AbstractC17592e.premium, AbstractC17592e.subs, AbstractC17592e.advert, AbstractC17592e.smaato, AbstractC17592e.f34448interface, AbstractC17592e.f34446goto, AbstractC17592e.Signature, AbstractC17592e.admob, AbstractC17592e.f34441case, AbstractC17592e.f34442catch, AbstractC17592e.tapsense, AbstractC17592e.isVip);
    }

    public static final long vip(long j, C13770e c13770e) {
        c13770e.m3676strictfp(89373914);
        long ad2 = ad(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad, j);
        if (ad2 == 16) {
            ad2 = ((C3618e) c13770e.adcel(AbstractC0608e.ad)).ad;
        }
        c13770e.Signature(false);
        return ad2;
    }
}
