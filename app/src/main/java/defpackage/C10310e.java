package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C10310e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20359e;

    public /* synthetic */ C10310e(int i) {
        this.f20359e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20359e) {
            case 0:
                throw new IllegalStateException("Not intended to be parsed.");
            case 1:
                C6356e c6356e = (C6356e) obj;
                c6356e.getClass();
                c6356e.ad = false;
                c6356e.vip = true;
                c6356e.metrica = true;
                c6356e.license = true;
                c6356e.appmetrica = true;
                c6356e.purchase = true;
                c6356e.billing = true;
                c6356e.yandex = true;
                c6356e.startapp = true;
                c6356e.adcel = AbstractC16398e.ad;
                return Unit.INSTANCE;
            case 2:
                ((C6356e) obj).ad = true;
                return Unit.INSTANCE;
            case 3:
                return Boolean.valueOf(((C15308e) ((C6571e) obj).f13543e).ad);
            case 4:
                return Integer.valueOf(((C3434e) obj).ad.length());
            case 5:
                int i = ((C11028e) obj).ad.vip;
                return null;
            case 6:
                return Unit.INSTANCE;
            case 7:
                C5829e c5829e = (C5829e) ((InterfaceC6459e) obj);
                c5829e.f12290e = false;
                AbstractC15118e.appmetrica(c5829e);
                return Boolean.FALSE;
            case 8:
                AbstractC14594e.advert((InterfaceC15671e) obj, 1);
                return Unit.INSTANCE;
            case 9:
                AbstractC14594e.advert((InterfaceC15671e) obj, 0);
                return Unit.INSTANCE;
            case 10:
                return ((C16439e) obj).yandex;
            case 11:
                return AbstractC0083e.ad.pro();
            case 12:
                return new C7109e(3.0d, 4.5d, 7.0d, 11.0d);
            case 13:
                return ((C16439e) obj).appmetrica;
            case 14:
                return Double.valueOf(C15802e.mopub((C16439e) obj) ? 90.0d : 30.0d);
            case 15:
                return AbstractC0083e.ad.admob();
            case 16:
                return AbstractC0083e.ad.Signature();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C7109e(3.0d, 4.5d, 7.0d, 11.0d);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C16439e) obj).billing;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return Double.valueOf(C15802e.mopub((C16439e) obj) ? 40.0d : 90.0d);
            case 20:
                return new C7109e(1.0d, 1.0d, 3.0d, 4.5d);
            case 21:
                return new C7109e(1.0d, 1.0d, 3.0d, 4.5d);
            case 22:
                return ((C16439e) obj).appmetrica;
            case 23:
                C16439e c16439e = (C16439e) obj;
                boolean z = c16439e.metrica;
                return Double.valueOf(c16439e.vip == 1 ? z ? 100.0d : 0.0d : z ? 80.0d : 40.0d);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C7109e(3.0d, 4.5d, 7.0d, 7.0d);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C16439e) obj).yandex;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C16439e c16439e2 = (C16439e) obj;
                double d = c16439e2.license;
                return Double.valueOf(c16439e2.metrica ? new C7109e(10.0d, 10.0d, 11.0d, 12.0d).ad(d) : new C7109e(96.0d, 96.0d, 96.0d, 95.0d).ad(d));
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C16439e) obj).appmetrica;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return Double.valueOf(C15802e.mopub((C16439e) obj) ? 40.0d : 90.0d);
            default:
                return new C7109e(1.0d, 1.0d, 3.0d, 4.5d);
        }
    }
}
