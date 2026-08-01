package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3800e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8413e;

    public /* synthetic */ C3800e(int i) {
        this.f8413e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C16439e c16439e = (C16439e) obj;
        switch (this.f8413e) {
            case 0:
                return c16439e.mopub;
            case 1:
                int i = c16439e.adcel;
                C15073e c15073e = c16439e.mopub;
                return Double.valueOf(i == 1 ? c16439e.metrica ? C12575e.m3366class(c15073e, 0.0d, 98.0d) : C12575e.firebase(c15073e, 0.0d, 100.0d) : C12575e.m3366class(c15073e, 0.0d, 100.0d));
            case 2:
                return c16439e.adcel == 1 ? C12575e.startapp(4.5d) : C12575e.startapp(7.0d);
            case 3:
                return c16439e.appmetrica;
            case 4:
                return Double.valueOf(C12575e.firebase(c16439e.appmetrica, 0.0d, 100.0d));
            case 5:
                return AbstractC0083e.ad.advert();
            case 6:
                return c16439e.adcel == 1 ? C12575e.startapp(6.0d) : C12575e.startapp(7.0d);
            case 7:
                return c16439e.appmetrica;
            case 8:
                if (c16439e.adcel != 1 || c16439e.license <= 0.0d) {
                    return null;
                }
                return C12575e.startapp(1.5d);
            case 9:
                return c16439e.yandex;
            case 10:
                return Double.valueOf(c16439e.metrica ? 0.0d : 100.0d);
            case 11:
                return c16439e.yandex;
            case 12:
                return AbstractC0083e.ad.advert();
            case 13:
                return C12575e.startapp(7.0d);
            case 14:
                return c16439e.purchase;
            case 15:
                return AbstractC0083e.ad.remoteconfig();
            case 16:
                return c16439e.adcel == 1 ? C12575e.startapp(6.0d) : C12575e.startapp(7.0d);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return c16439e.billing;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (c16439e.adcel != 1 || c16439e.license <= 0.0d) {
                    return null;
                }
                return C12575e.startapp(1.5d);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return c16439e.billing;
            case 20:
                return AbstractC0083e.ad.isPro();
            case 21:
                return c16439e.adcel == 1 ? C12575e.startapp(6.0d) : C12575e.startapp(7.0d);
            case 22:
                return c16439e.appmetrica;
            case 23:
                if (c16439e.adcel != 1 || c16439e.license <= 0.0d) {
                    return null;
                }
                return C12575e.startapp(1.5d);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                boolean z = c16439e.metrica;
                C15073e c15073e2 = c16439e.appmetrica;
                double d = 30.0d;
                if (c16439e.adcel != 2) {
                    int i2 = c16439e.vip;
                    if (i2 == 2) {
                        if (!z) {
                            d = 90.0d;
                        }
                    } else if (i2 == 3) {
                        d = z ? C12575e.m3366class(c15073e2, 35.0d, 93.0d) : C12575e.firebase(c15073e2, 0.0d, 90.0d);
                    } else {
                        if (i2 == 5) {
                            if (z) {
                                d = C12575e.firebase(c15073e2, 30.0d, 93.0d);
                            } else {
                                d = C12575e.firebase(c15073e2, 78.0d, c15073e2.metrica.ad() ? 88 : 90);
                            }
                        } else if (z) {
                            d = C12575e.m3366class(c15073e2, 66.0d, 93.0d);
                        } else {
                            d = C12575e.firebase(c15073e2, 66.0d, c15073e2.metrica.ad() ? 88 : 93);
                        }
                    }
                }
                return Double.valueOf(d);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                if (c16439e.adcel != 1 || c16439e.license <= 0.0d) {
                    return null;
                }
                return C12575e.startapp(1.5d);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return c16439e.yandex;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return Double.valueOf(c16439e.metrica ? 4.0d : c16439e.yandex.metrica.vip() ? 90.0d : c16439e.vip == 4 ? 85.0d : 87.0d);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                if (!c16439e.metrica) {
                    int i3 = c16439e.vip;
                    if (i3 == 2) {
                        return Double.valueOf(2.5d);
                    }
                    if (i3 == 3) {
                        return Double.valueOf(1.7d);
                    }
                    if (i3 == 5) {
                        return c16439e.yandex.metrica.vip() ? Double.valueOf(2.7d) : Double.valueOf(1.75d);
                    }
                    if (i3 == 4) {
                        return Double.valueOf(1.36d);
                    }
                }
                return Double.valueOf(1.0d);
            default:
                return c16439e.yandex;
        }
    }
}
