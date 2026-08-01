package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3949e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8808e;

    public /* synthetic */ C3949e(int i) {
        this.f8808e = i;
    }

    public /* synthetic */ C3949e(C8336e c8336e) {
        this.f8808e = 2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        double firebase;
        C16439e c16439e = (C16439e) obj;
        switch (this.f8808e) {
            case 0:
                return Double.valueOf(C15802e.mopub(c16439e) ? 25.0d : 30.0d);
            case 1:
                return AbstractC0083e.ad.signatures();
            case 2:
                boolean z = c16439e.metrica;
                return Double.valueOf(C8336e.smaato(c16439e) ? c16439e.ad.license : c16439e.vip == 1 ? z ? 85.0d : 25.0d : z ? 30.0d : 90.0d);
            case 3:
                return c16439e.mopub;
            case 4:
                return c16439e.appmetrica;
            case 5:
                return AbstractC0083e.ad.admob();
            case 6:
                return C12575e.startapp(4.5d);
            case 7:
                return c16439e.yandex;
            case 8:
                double d = 1.0d;
                if (c16439e.adcel != 1) {
                    return Double.valueOf(1.0d);
                }
                int i = c16439e.vip;
                if (i == 2) {
                    d = 2.2d;
                } else if (i == 3) {
                    d = 1.7d;
                } else if (i == 5) {
                    d = c16439e.yandex.metrica.vip() ? c16439e.metrica ? 3.0d : 2.3d : 1.6d;
                }
                return Double.valueOf(d);
            case 9:
                int i2 = c16439e.adcel;
                C6488e c6488e = AbstractC0083e.ad;
                return i2 == 1 ? c16439e.metrica ? c6488e.tapsense() : c6488e.isVip() : c6488e.firebase();
            case 10:
                if (c16439e.adcel == 1) {
                    return C12575e.startapp(c16439e.metrica ? 6.0d : 4.5d);
                }
                return C12575e.startapp(7.0d);
            case 11:
                return c16439e.billing;
            case 12:
                return c16439e.billing;
            case 13:
                return c16439e.appmetrica;
            case 14:
                int i3 = c16439e.adcel;
                C6488e c6488e2 = AbstractC0083e.ad;
                return i3 == 1 ? c6488e2.amazon() : c6488e2.subs();
            case 15:
                return c16439e.adcel == 1 ? C12575e.startapp(6.0d) : C12575e.startapp(7.0d);
            case 16:
                return c16439e.billing;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                boolean z2 = c16439e.metrica;
                C15073e c15073e = c16439e.billing;
                int i4 = c16439e.vip;
                if (c16439e.adcel == 2) {
                    firebase = i4 == 3 ? C12575e.firebase(c15073e, 0.0d, 90.0d) : C12575e.firebase(c15073e, 0.0d, 100.0d);
                } else if (i4 == 5 || i4 == 4) {
                    firebase = C12575e.firebase(c15073e, 0.0d, c15073e.metrica.ad() ? 88 : z2 ? 98 : 100);
                } else {
                    firebase = z2 ? C12575e.firebase(c15073e, 0.0d, 98.0d) : C12575e.firebase(c15073e, 0.0d, 100.0d);
                }
                return Double.valueOf(firebase);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return c16439e.adcel == 1 ? C12575e.startapp(4.5d) : C12575e.startapp(7.0d);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return c16439e.purchase;
            case 20:
                return AbstractC0083e.ad.ads();
            case 21:
                return c16439e.appmetrica;
            case 22:
                return c16439e.purchase;
            case 23:
                if (c16439e.adcel != 1 || c16439e.license <= 0.0d) {
                    return null;
                }
                return C12575e.startapp(1.5d);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return c16439e.mopub;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                int i5 = c16439e.adcel;
                C6488e c6488e3 = AbstractC0083e.ad;
                return i5 == 1 ? c6488e3.ad() : c6488e3.premium();
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return C12575e.startapp(7.0d);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return c16439e.adcel == 1 ? C12575e.startapp(6.0d) : C12575e.startapp(7.0d);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return c16439e.yandex;
            default:
                double d2 = 1.0d;
                if (c16439e.adcel != 1) {
                    return Double.valueOf(1.0d);
                }
                int i6 = c16439e.vip;
                if (i6 == 2) {
                    d2 = 2.2d;
                } else if (i6 == 3) {
                    d2 = 1.7d;
                } else if (i6 == 5) {
                    d2 = c16439e.yandex.metrica.vip() ? c16439e.metrica ? 3.0d : 2.3d : 1.6d;
                } else if (i6 == 4) {
                    d2 = 1.29d;
                }
                return Double.valueOf(d2);
        }
    }
}
