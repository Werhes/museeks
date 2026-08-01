package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۣٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C15812e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31185e;

    public /* synthetic */ C15812e(int i) {
        this.f31185e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C16439e c16439e = (C16439e) obj;
        switch (this.f31185e) {
            case 0:
                int i = c16439e.adcel;
                C6488e c6488e = AbstractC0083e.ad;
                return i == 1 ? c16439e.metrica ? c6488e.tapsense() : c6488e.isVip() : c6488e.firebase();
            case 1:
                return c16439e.adcel == 1 ? C12575e.startapp(1.5d) : C12575e.startapp(3.0d);
            case 2:
                return c16439e.yandex;
            case 3:
                return Double.valueOf(c16439e.metrica ? 18.0d : c16439e.yandex.metrica.vip() ? 99.0d : c16439e.vip == 4 ? 97.0d : 98.0d);
            case 4:
                if (c16439e.metrica) {
                    int i2 = c16439e.vip;
                    if (i2 == 2) {
                        return Double.valueOf(2.5d);
                    }
                    if (i2 == 3) {
                        return Double.valueOf(1.7d);
                    }
                    if (i2 == 5) {
                        return c16439e.yandex.metrica.vip() ? Double.valueOf(2.7d) : Double.valueOf(1.75d);
                    }
                    if (i2 == 4) {
                        return Double.valueOf(1.36d);
                    }
                }
                return Double.valueOf(1.0d);
            case 5:
                return c16439e.billing;
            case 6:
                return AbstractC0083e.ad.ads();
            case 7:
                return c16439e.purchase;
            case 8:
                return C12575e.startapp(4.5d);
            case 9:
                return c16439e.purchase;
            case 10:
                return AbstractC0083e.ad.signatures();
            case 11:
                return C12575e.startapp(7.0d);
            case 12:
                return c16439e.purchase;
            case 13:
                return Double.valueOf(c16439e.vip == 2 ? 85.0d : C12575e.firebase(c16439e.purchase, 0.0d, 90.0d));
            case 14:
                return C12575e.startapp(4.5d);
            case 15:
                return c16439e.billing;
            case 16:
                int i3 = c16439e.adcel;
                C6488e c6488e2 = AbstractC0083e.ad;
                return i3 == 1 ? c6488e2.subscription() : c6488e2.crashlytics();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                int i4 = c16439e.vip;
                C15073e c15073e = c16439e.billing;
                return Double.valueOf(i4 == 3 ? C12575e.firebase(c15073e, 0.0d, 90.0d) : C12575e.firebase(c15073e, 0.0d, 100.0d));
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return C12575e.startapp(4.5d);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return c16439e.appmetrica;
            case 20:
                int i5 = c16439e.vip;
                C15073e c15073e2 = c16439e.appmetrica;
                return Double.valueOf(i5 == 2 ? 85.0d : i5 == 3 ? C12575e.firebase(c15073e2, 0.0d, 90.0d) : C12575e.firebase(c15073e2, 0.0d, 100.0d));
            case 21:
                return C12575e.startapp(4.5d);
            case 22:
                return c16439e.mopub;
            case 23:
                return c16439e.adcel == 1 ? C12575e.startapp(6.0d) : C12575e.startapp(7.0d);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return Double.valueOf(C12575e.m3366class(c16439e.mopub, 0.0d, 100.0d));
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return C12575e.startapp(4.5d);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return c16439e.appmetrica;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                boolean z = c16439e.metrica;
                C15073e c15073e3 = c16439e.appmetrica;
                int i6 = c16439e.adcel;
                int i7 = c16439e.vip;
                double d = 90.0d;
                if (i7 == 2) {
                    if (i6 == 1) {
                        if (!z) {
                            d = 40.0d;
                        }
                        d = 80.0d;
                    }
                    return Double.valueOf(d);
                }
                if (i7 != 3) {
                    if (i7 == 5) {
                        if (i6 == 1) {
                            if (c15073e3.metrica.vip()) {
                                r3 = 25;
                            } else if (c15073e3.metrica.ad()) {
                                r3 = 88;
                            }
                            d = C12575e.firebase(c15073e3, 0.0d, r3);
                        } else {
                            d = C12575e.firebase(c15073e3, 0.0d, 100.0d);
                        }
                    } else if (i6 == 1) {
                        d = C12575e.firebase(c15073e3, 0.0d, c15073e3.metrica.ad() ? 88 : 98);
                    } else {
                        d = C12575e.firebase(c15073e3, 0.0d, 100.0d);
                    }
                } else if (i6 == 1) {
                    if (!z) {
                        d = C12575e.firebase(c15073e3, 0.0d, 100.0d);
                    }
                    d = 80.0d;
                } else {
                    d = C12575e.firebase(c15073e3, 0.0d, 90.0d);
                }
                return Double.valueOf(d);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return c16439e.adcel == 1 ? C12575e.startapp(4.5d) : C12575e.startapp(7.0d);
            default:
                int i8 = c16439e.adcel;
                C15073e c15073e4 = c16439e.mopub;
                return Double.valueOf(i8 != 2 ? c16439e.metrica ? C12575e.m3366class(c15073e4, 30.0d, 93.0d) : C12575e.firebase(c15073e4, 0.0d, 90.0d) : 30.0d);
        }
    }
}
