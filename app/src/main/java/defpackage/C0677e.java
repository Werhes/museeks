package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۤ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0677e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f2941e;

    public /* synthetic */ C0677e(int i) {
        this.f2941e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        double firebase;
        C16439e c16439e = (C16439e) obj;
        switch (this.f2941e) {
            case 0:
                return Double.valueOf(c16439e.adcel == 1 ? c16439e.metrica ? 9.0d : c16439e.yandex.metrica.vip() ? 96.0d : c16439e.vip == 4 ? 92.0d : 94.0d : 20.0d);
            case 1:
                Double valueOf = Double.valueOf(1.6d);
                if (c16439e.adcel == 1) {
                    int i = c16439e.vip;
                    if (i == 2) {
                        return valueOf;
                    }
                    if (i == 3) {
                        return Double.valueOf(1.4d);
                    }
                    if (i == 5) {
                        return c16439e.yandex.metrica.vip() ? valueOf : Double.valueOf(1.3d);
                    }
                    if (i == 4) {
                        return Double.valueOf(1.15d);
                    }
                }
                return Double.valueOf(1.0d);
            case 2:
                return c16439e.purchase;
            case 3:
                return c16439e.yandex;
            case 4:
                return Double.valueOf(c16439e.metrica ? 15.0d : c16439e.yandex.metrica.vip() ? 92.0d : c16439e.vip == 4 ? 88.0d : 90.0d);
            case 5:
                int i2 = c16439e.vip;
                return i2 == 2 ? Double.valueOf(2.2d) : i2 == 3 ? Double.valueOf(1.7d) : i2 == 5 ? c16439e.yandex.metrica.vip() ? Double.valueOf(2.3d) : Double.valueOf(1.6d) : i2 == 4 ? Double.valueOf(1.29d) : Double.valueOf(1.0d);
            case 6:
                return c16439e.appmetrica;
            case 7:
                return AbstractC0083e.ad.admob();
            case 8:
                return C12575e.startapp(7.0d);
            case 9:
                return c16439e.yandex;
            case 10:
                return Double.valueOf(c16439e.adcel == 1 ? c16439e.metrica ? 6.0d : c16439e.yandex.metrica.vip() ? 98.0d : c16439e.vip == 4 ? 95.0d : 96.0d : 15.0d);
            case 11:
                Double valueOf2 = Double.valueOf(1.3d);
                if (c16439e.adcel == 1) {
                    int i3 = c16439e.vip;
                    if (i3 == 2) {
                        return valueOf2;
                    }
                    if (i3 == 3) {
                        return Double.valueOf(1.25d);
                    }
                    if (i3 == 5) {
                        return c16439e.yandex.metrica.vip() ? valueOf2 : Double.valueOf(1.15d);
                    }
                    if (i3 == 4) {
                        return Double.valueOf(1.08d);
                    }
                }
                return Double.valueOf(1.0d);
            case 12:
                return c16439e.yandex;
            case 13:
                int i4 = c16439e.vip;
                C15073e c15073e = c16439e.purchase;
                boolean z = c16439e.metrica;
                if (c16439e.adcel == 2) {
                    firebase = 90.0d;
                    if (i4 != 2) {
                        firebase = C12575e.firebase(c15073e, 0.0d, 90.0d);
                    }
                } else if (i4 == 2) {
                    firebase = z ? C12575e.m3366class(c15073e, 0.0d, 98.0d) : C12575e.firebase(c15073e, 0.0d, 100.0d);
                } else if (i4 == 4) {
                    firebase = C12575e.firebase(c15073e, 0.0d, z ? 90 : 98);
                } else {
                    firebase = z ? 80.0d : C12575e.firebase(c15073e, 0.0d, 100.0d);
                }
                return Double.valueOf(firebase);
            case 14:
                return Double.valueOf(c16439e.metrica ? 98.0d : 4.0d);
            case 15:
                return c16439e.yandex;
            case 16:
                return Double.valueOf(c16439e.adcel == 1 ? c16439e.metrica ? 12.0d : c16439e.yandex.metrica.vip() ? 94.0d : c16439e.vip == 4 ? 90.0d : 92.0d : 25.0d);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (c16439e.adcel == 1) {
                    int i5 = c16439e.vip;
                    if (i5 == 2) {
                        return Double.valueOf(1.9d);
                    }
                    if (i5 == 3) {
                        return Double.valueOf(1.5d);
                    }
                    if (i5 == 5) {
                        return c16439e.yandex.metrica.vip() ? Double.valueOf(1.95d) : Double.valueOf(1.45d);
                    }
                    if (i5 == 4) {
                        return Double.valueOf(1.22d);
                    }
                }
                return Double.valueOf(1.0d);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return c16439e.purchase;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return AbstractC0083e.ad.signatures();
            case 20:
                return C12575e.startapp(4.5d);
            case 21:
                return c16439e.mopub;
            case 22:
                return AbstractC0083e.ad.vip();
            case 23:
                return c16439e.adcel == 1 ? C12575e.startapp(4.5d) : C12575e.startapp(7.0d);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return c16439e.purchase;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                boolean z2 = c16439e.metrica;
                C15073e c15073e2 = c16439e.purchase;
                double d = 30.0d;
                if (c16439e.adcel != 2) {
                    int i6 = c16439e.vip;
                    d = i6 == 4 ? z2 ? C12575e.m3366class(c15073e2, 30.0d, 40.0d) : C12575e.firebase(c15073e2, 84.0d, 90.0d) : i6 == 5 ? z2 ? 15.0d : C12575e.firebase(c15073e2, 90.0d, 95.0d) : z2 ? 25.0d : 90.0d;
                }
                return Double.valueOf(d);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                if (c16439e.adcel != 1 || c16439e.license <= 0.0d) {
                    return null;
                }
                return C12575e.startapp(1.5d);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return c16439e.yandex;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                double d2 = 1.0d;
                if (c16439e.adcel != 1) {
                    return Double.valueOf(1.0d);
                }
                int i7 = c16439e.vip;
                if (i7 == 2) {
                    d2 = 2.2d;
                } else if (i7 == 3) {
                    d2 = 1.7d;
                } else if (i7 == 5) {
                    d2 = c16439e.yandex.metrica.vip() ? c16439e.metrica ? 3.0d : 2.3d : 1.6d;
                }
                return Double.valueOf(d2);
            default:
                int i8 = c16439e.adcel;
                C6488e c6488e = AbstractC0083e.ad;
                return i8 == 1 ? c16439e.metrica ? c6488e.tapsense() : c6488e.isVip() : c6488e.firebase();
        }
    }
}
