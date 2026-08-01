package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C12266e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24605e;

    public /* synthetic */ C12266e(int i) {
        this.f24605e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        double d;
        C16439e c16439e = (C16439e) obj;
        switch (this.f24605e) {
            case 0:
                return c16439e.billing;
            case 1:
                return Double.valueOf(C15802e.mopub(c16439e) ? 90.0d : 30.0d);
            case 2:
                return AbstractC0083e.ad.ads();
            case 3:
                return AbstractC0083e.ad.applovin();
            case 4:
                return new C7109e(3.0d, 4.5d, 7.0d, 11.0d);
            case 5:
                return c16439e.billing;
            case 6:
                boolean z = c16439e.metrica;
                return Double.valueOf(c16439e.vip == 1 ? z ? 0.0d : 100.0d : !C8336e.smaato(c16439e) ? z ? 90.0d : 30.0d : AbstractC1749e.purchase(((Number) AbstractC0083e.ad.isPro().metrica.invoke(c16439e)).doubleValue(), 4.5d));
            case 7:
                return AbstractC0083e.ad.isPro();
            case 8:
                return new C7109e(3.0d, 4.5d, 7.0d, 11.0d);
            case 9:
                return c16439e.purchase;
            case 10:
                return c16439e.mopub;
            case 11:
                boolean z2 = c16439e.metrica;
                if (c16439e.vip == 1) {
                    if (!z2) {
                        d = 10.0d;
                    }
                    d = 90.0d;
                } else {
                    if (!z2) {
                        d = 30.0d;
                    }
                    d = 90.0d;
                }
                return Double.valueOf(d);
            case 12:
                return AbstractC0083e.ad.vip();
            case 13:
                return new C7109e(3.0d, 4.5d, 7.0d, 11.0d);
            case 14:
                return c16439e.yandex;
            case 15:
                return Double.valueOf(c16439e.metrica ? new C7109e(24.0d, 24.0d, 29.0d, 34.0d).ad(c16439e.license) : 98.0d);
            case 16:
                return c16439e.billing;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return Double.valueOf(C15802e.mopub(c16439e) ? 100.0d : 10.0d);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return AbstractC0083e.ad.ads();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return AbstractC0083e.ad.applovin();
            case 20:
                return Double.valueOf(c16439e.metrica ? 80.0d : 40.0d);
            case 21:
                return new C7109e(4.5d, 7.0d, 11.0d, 21.0d);
            case 22:
                return c16439e.billing;
            case 23:
                boolean z3 = c16439e.metrica;
                return Double.valueOf(c16439e.vip == 1 ? z3 ? 10.0d : 90.0d : z3 ? 20.0d : 100.0d);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return AbstractC0083e.ad.inmobi();
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C7109e(4.5d, 7.0d, 11.0d, 21.0d);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return c16439e.startapp;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return Double.valueOf(c16439e.metrica ? 80.0d : 30.0d);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C7109e(3.0d, 4.5d, 7.0d, 11.0d);
            default:
                return c16439e.appmetrica;
        }
    }
}
