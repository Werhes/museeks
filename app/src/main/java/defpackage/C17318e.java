package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗ۠ۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C17318e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C6488e f33984e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33985e;

    public /* synthetic */ C17318e(C6488e c6488e, int i) {
        this.f33985e = i;
        this.f33984e = c6488e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C16439e c16439e = (C16439e) obj;
        switch (this.f33985e) {
            case 0:
                return Double.valueOf(this.f33984e.applovin().ad(c16439e));
            case 1:
                C6488e c6488e = this.f33984e;
                return new C13699e(c6488e.ads(), c6488e.applovin(), 5.0d, 1, false, 1, 16);
            case 2:
                int i = c16439e.adcel;
                C6488e c6488e2 = this.f33984e;
                return i == 1 ? c16439e.metrica ? c6488e2.tapsense() : c6488e2.isVip() : c6488e2.firebase();
            case 3:
                if (c16439e.adcel != 1) {
                    return null;
                }
                C6488e c6488e3 = this.f33984e;
                return new C13699e(c6488e3.isPro(), c6488e3.inmobi(), 5.0d, 4, false, 3, 16);
            case 4:
                return Double.valueOf(this.f33984e.pro().ad(c16439e));
            case 5:
                C6488e c6488e4 = this.f33984e;
                return new C13699e(c6488e4.signatures(), c6488e4.pro(), 5.0d, 1, false, 1, 16);
            case 6:
                return Double.valueOf(this.f33984e.Signature().ad(c16439e));
            case 7:
                C6488e c6488e5 = this.f33984e;
                return new C13699e(c6488e5.admob(), c6488e5.Signature(), 5.0d, 1, false, 1, 16);
            case 8:
                return Double.valueOf(this.f33984e.remoteconfig().ad(new C16439e(c16439e.ad, c16439e.vip, false, 0.0d, c16439e.appmetrica, c16439e.purchase, c16439e.billing, c16439e.yandex, c16439e.startapp, c16439e.adcel, c16439e.advert, c16439e.mopub)));
            case 9:
                if (c16439e.adcel != 1) {
                    return null;
                }
                boolean z = c16439e.metrica;
                C6488e c6488e6 = this.f33984e;
                return z ? c6488e6.tapsense() : c6488e6.isVip();
            case 10:
                return this.f33984e.firebase();
            case 11:
                C6488e c6488e7 = this.f33984e;
                return new C13699e(c6488e7.crashlytics(), c6488e7.subscription(), 5.0d, 1, false, 3, 16);
            case 12:
                return this.f33984e.firebase();
            case 13:
                C6488e c6488e8 = this.f33984e;
                return new C13699e(c6488e8.m2191interface(), c6488e8.inmobi(), 5.0d, 1, false, 3, 16);
            case 14:
                return this.f33984e.firebase();
            case 15:
                C6488e c6488e9 = this.f33984e;
                return new C13699e(c6488e9.subs(), c6488e9.amazon(), 5.0d, 1, false, 3, 16);
            case 16:
                return this.f33984e.firebase();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C6488e c6488e10 = this.f33984e;
                return new C13699e(c6488e10.premium(), c6488e10.ad(), 5.0d, 1, false, 3, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                int i2 = c16439e.adcel;
                C6488e c6488e11 = this.f33984e;
                return i2 == 1 ? c16439e.metrica ? c6488e11.tapsense() : c6488e11.isVip() : c6488e11.firebase();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                if (c16439e.adcel != 1) {
                    return null;
                }
                C6488e c6488e12 = this.f33984e;
                return new C13699e(c6488e12.loadAd(), c6488e12.amazon(), 5.0d, 4, false, 3, 16);
            case 20:
                int i3 = c16439e.adcel;
                C6488e c6488e13 = this.f33984e;
                return i3 == 1 ? c16439e.metrica ? c6488e13.tapsense() : c6488e13.isVip() : c6488e13.firebase();
            case 21:
                if (c16439e.adcel != 1) {
                    return null;
                }
                C6488e c6488e14 = this.f33984e;
                return new C13699e(c6488e14.vip(), c6488e14.ad(), 5.0d, 4, false, 3, 16);
            case 22:
                if (c16439e.adcel != 1) {
                    return null;
                }
                boolean z2 = c16439e.metrica;
                C6488e c6488e15 = this.f33984e;
                return z2 ? c6488e15.tapsense() : c6488e15.isVip();
            case 23:
                return Double.valueOf(this.f33984e.loadAd().ad(new C16439e(c16439e.ad, c16439e.vip, false, 0.0d, c16439e.appmetrica, c16439e.purchase, c16439e.billing, c16439e.yandex, c16439e.startapp, c16439e.adcel, c16439e.advert, c16439e.mopub)));
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                if (c16439e.adcel != 1) {
                    return null;
                }
                boolean z3 = c16439e.metrica;
                C6488e c6488e16 = this.f33984e;
                return z3 ? c6488e16.tapsense() : c6488e16.isVip();
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                if (c16439e.adcel != 2) {
                    return null;
                }
                C6488e c6488e17 = this.f33984e;
                return new C13699e(c6488e17.vip(), c6488e17.premium(), 10.0d, 1, false, 3, 16);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return Double.valueOf(this.f33984e.isPro().ad(new C16439e(c16439e.ad, c16439e.vip, false, 0.0d, c16439e.appmetrica, c16439e.purchase, c16439e.billing, c16439e.yandex, c16439e.startapp, c16439e.adcel, c16439e.advert, c16439e.mopub)));
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                if (c16439e.adcel != 1) {
                    return null;
                }
                boolean z4 = c16439e.metrica;
                C6488e c6488e18 = this.f33984e;
                return z4 ? c6488e18.tapsense() : c6488e18.isVip();
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                if (c16439e.adcel != 1) {
                    return null;
                }
                boolean z5 = c16439e.metrica;
                C6488e c6488e19 = this.f33984e;
                return z5 ? c6488e19.tapsense() : c6488e19.isVip();
            default:
                if (c16439e.adcel != 2) {
                    return null;
                }
                C6488e c6488e20 = this.f33984e;
                return new C13699e(c6488e20.loadAd(), c6488e20.subs(), 10.0d, 1, false, 3, 16);
        }
    }
}
