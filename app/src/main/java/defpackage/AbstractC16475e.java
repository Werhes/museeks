package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۚؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16475e {
    public static final C0303e ad;

    static {
        AbstractC1101e.startapp(new C13117e(19));
        ad = new C0303e();
    }

    public static final C1839e ad(C13770e c13770e, int i) {
        C0984e c0984e = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).vip;
        switch (AbstractC8703e.m2467class(i)) {
            case 0:
                return c0984e.adcel;
            case 1:
                return c0984e.mopub;
            case 2:
                return c0984e.advert;
            case 3:
                return c0984e.ad;
            case 4:
                return c0984e.vip;
            case 5:
                return c0984e.metrica;
            case 6:
                return c0984e.license;
            case 7:
                return c0984e.appmetrica;
            case 8:
                return c0984e.purchase;
            case 9:
                return c0984e.smaato;
            case 10:
                return c0984e.amazon;
            case 11:
                return c0984e.loadAd;
            case 12:
                return c0984e.billing;
            case 13:
                return c0984e.yandex;
            case 14:
                return c0984e.startapp;
            case 15:
                return c0984e.isPro;
            case 16:
                return c0984e.applovin;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return c0984e.ads;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return c0984e.Signature;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return c0984e.admob;
            case 20:
                return c0984e.subscription;
            case 21:
                return c0984e.remoteconfig;
            case 22:
                return c0984e.pro;
            case 23:
                return c0984e.signatures;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return c0984e.premium;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return c0984e.subs;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return c0984e.crashlytics;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return c0984e.tapsense;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return c0984e.isVip;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return c0984e.inmobi;
            default:
                throw new C14803e(10);
        }
    }
}
