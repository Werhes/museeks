package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۣٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C13810e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27376e;

    public /* synthetic */ C13810e(int i) {
        this.f27376e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C16439e c16439e = (C16439e) obj;
        switch (this.f27376e) {
            case 0:
                boolean z = c16439e.metrica;
                return Double.valueOf(c16439e.vip == 1 ? z ? 90.0d : 25.0d : z ? 80.0d : 40.0d);
            case 1:
                return new C7109e(3.0d, 4.5d, 7.0d, 7.0d);
            case 2:
                return Double.valueOf(c16439e.metrica ? 30.0d : 90.0d);
            case 3:
                return c16439e.mopub;
            case 4:
                return Double.valueOf(c16439e.metrica ? 30.0d : 90.0d);
            case 5:
                return new C7109e(1.0d, 1.0d, 3.0d, 4.5d);
            case 6:
                return c16439e.appmetrica;
            case 7:
                boolean z2 = c16439e.metrica;
                return Double.valueOf(C8336e.smaato(c16439e) ? AbstractC1749e.purchase(((Number) AbstractC0083e.ad.loadAd().metrica.invoke(c16439e)).doubleValue(), 4.5d) : c16439e.vip == 1 ? z2 ? 0.0d : 100.0d : z2 ? 90.0d : 30.0d);
            case 8:
                return AbstractC0083e.ad.loadAd();
            case 9:
                return new C7109e(3.0d, 4.5d, 7.0d, 11.0d);
            case 10:
                return c16439e.yandex;
            case 11:
                double d = c16439e.license;
                return Double.valueOf(c16439e.metrica ? new C7109e(17.0d, 17.0d, 21.0d, 25.0d).ad(d) : new C7109e(92.0d, 92.0d, 88.0d, 85.0d).ad(d));
            case 12:
                return c16439e.appmetrica;
            case 13:
                return c16439e.yandex;
            case 14:
                return Double.valueOf(c16439e.metrica ? 20.0d : 95.0d);
            case 15:
                return AbstractC0083e.ad.advert();
            case 16:
                return new C7109e(4.5d, 7.0d, 11.0d, 21.0d);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return c16439e.purchase;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return Double.valueOf(C15802e.mopub(c16439e) ? 80.0d : 90.0d);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C7109e(1.0d, 1.0d, 3.0d, 4.5d);
            case 20:
                return c16439e.appmetrica;
            case 21:
                boolean z3 = c16439e.metrica;
                return Double.valueOf(c16439e.vip == 1 ? z3 ? 10.0d : 90.0d : z3 ? 20.0d : 100.0d);
            case 22:
                return Double.valueOf(c16439e.metrica ? 80.0d : 40.0d);
            case 23:
                return AbstractC0083e.ad.amazon();
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C7109e(4.5d, 7.0d, 11.0d, 21.0d);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return c16439e.yandex;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                double d2 = c16439e.license;
                return Double.valueOf(c16439e.metrica ? new C7109e(12.0d, 12.0d, 16.0d, 20.0d).ad(d2) : new C7109e(94.0d, 94.0d, 92.0d, 90.0d).ad(d2));
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return c16439e.startapp;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return Double.valueOf(c16439e.metrica ? 60.0d : 50.0d);
            default:
                return new C7109e(1.5d, 3.0d, 4.5d, 7.0d);
        }
    }
}
