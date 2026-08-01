package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5870e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12407e;

    public /* synthetic */ C5870e(int i) {
        this.f12407e = i;
    }

    public /* synthetic */ C5870e(C8336e c8336e) {
        this.f12407e = 6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        double d;
        C16439e c16439e = (C16439e) obj;
        switch (this.f12407e) {
            case 0:
                return Double.valueOf(C15802e.mopub(c16439e) ? 100.0d : 10.0d);
            case 1:
                return new C7109e(3.0d, 4.5d, 7.0d, 7.0d);
            case 2:
                return AbstractC0083e.ad.admob();
            case 3:
                return AbstractC0083e.ad.Signature();
            case 4:
                return new C7109e(4.5d, 7.0d, 11.0d, 21.0d);
            case 5:
                return c16439e.billing;
            case 6:
                boolean z = c16439e.metrica;
                if (c16439e.vip == 1) {
                    d = z ? 60.0d : 49.0d;
                } else if (C8336e.smaato(c16439e)) {
                    C15073e c15073e = c16439e.billing;
                    d = AbstractC0179e.ad(new C13797e(AbstractC5190e.adcel(c15073e.ad, c15073e.vip, c16439e.ad.license))).license;
                } else {
                    d = z ? 30.0d : 90.0d;
                }
                return Double.valueOf(d);
            case 7:
                return new C7109e(1.0d, 1.0d, 3.0d, 4.5d);
            case 8:
                return c16439e.startapp;
            case 9:
                return Double.valueOf(c16439e.metrica ? 30.0d : 80.0d);
            case 10:
                return new C7109e(1.0d, 1.0d, 3.0d, 4.5d);
            case 11:
                return c16439e.yandex;
            case 12:
                return Double.valueOf(0.0d);
            case 13:
                return Double.valueOf(c16439e.metrica ? new C7109e(4.0d, 4.0d, 2.0d, 0.0d).ad(c16439e.license) : 100.0d);
            case 14:
                return c16439e.yandex;
            case 15:
                return Double.valueOf(c16439e.metrica ? 6.0d : new C7109e(87.0d, 87.0d, 80.0d, 75.0d).ad(c16439e.license));
            case 16:
                return c16439e.mopub;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return Double.valueOf(c16439e.metrica ? 80.0d : 40.0d);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C7109e(3.0d, 4.5d, 7.0d, 7.0d);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return c16439e.purchase;
            case 20:
                return Double.valueOf(10.0d);
            case 21:
                return AbstractC0083e.ad.signatures();
            case 22:
                return c16439e.startapp;
            case 23:
                return AbstractC0083e.ad.pro();
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C7109e(4.5d, 7.0d, 11.0d, 21.0d);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return c16439e.mopub;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return Double.valueOf(c16439e.metrica ? 20.0d : 100.0d);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return AbstractC0083e.ad.ad();
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C7109e(4.5d, 7.0d, 11.0d, 21.0d);
            default:
                return c16439e.billing;
        }
    }
}
