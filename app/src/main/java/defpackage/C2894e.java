package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؔ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2894e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6883e;

    public /* synthetic */ C2894e(int i) {
        this.f6883e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        double firebase;
        InterfaceC3552e interfaceC3552e;
        float floatValue;
        int i = this.f6883e;
        C6488e c6488e = AbstractC0083e.ad;
        int i2 = 4;
        int i3 = 3;
        InterfaceC5083e interfaceC5083e = null;
        int i4 = 1;
        switch (i) {
            case 0:
                return ((C16439e) obj).adcel == 1 ? C12575e.startapp(3.0d) : C12575e.startapp(4.5d);
            case 1:
                return ((C16439e) obj).billing;
            case 2:
                return ((C16439e) obj).adcel == 1 ? C12575e.startapp(4.5d) : C12575e.startapp(7.0d);
            case 3:
                C16439e c16439e = (C16439e) obj;
                int i5 = c16439e.vip;
                C15073e c15073e = c16439e.billing;
                boolean z = c16439e.metrica;
                if (c16439e.adcel == 2) {
                    firebase = i5 == 3 ? C12575e.firebase(c15073e, 0.0d, 90.0d) : C12575e.firebase(c15073e, 0.0d, 100.0d);
                } else if (i5 == 2) {
                    firebase = z ? C12575e.firebase(c15073e, 0.0d, 93.0d) : C12575e.firebase(c15073e, 0.0d, 96.0d);
                } else {
                    if (i5 == 3) {
                        firebase = C12575e.firebase(c15073e, 0.0d, z ? 93 : 100);
                    } else if (i5 == 5) {
                        if (c15073e.metrica.ad()) {
                            r1 = 88;
                        } else if (z) {
                            r1 = 93;
                        }
                        firebase = C12575e.firebase(c15073e, 75.0d, r1);
                    } else {
                        firebase = z ? C12575e.firebase(c15073e, 0.0d, 93.0d) : C12575e.firebase(c15073e, 72.0d, 100.0d);
                    }
                }
                return Double.valueOf(firebase);
            case 4:
                C16439e c16439e2 = (C16439e) obj;
                if (c16439e2.adcel != 1 || c16439e2.license <= 0.0d) {
                    return null;
                }
                return C12575e.startapp(1.5d);
            case 5:
                return ((C16439e) obj).billing;
            case 6:
                return ((C16439e) obj).adcel == 1 ? c6488e.inmobi() : c6488e.m2191interface();
            case 7:
                return ((C16439e) obj).adcel == 1 ? C12575e.startapp(6.0d) : C12575e.startapp(7.0d);
            case 8:
                return ((C16439e) obj).appmetrica;
            case 9:
                return c6488e.loadAd();
            case 10:
                return ((C16439e) obj).adcel == 1 ? C12575e.startapp(6.0d) : C12575e.startapp(7.0d);
            case 11:
                return Unit.INSTANCE;
            case 12:
                return Unit.INSTANCE;
            case 13:
                C17213e c17213e = (C17213e) obj;
                AbstractC5087e.premium(c17213e, null, null, AbstractC5097e.appmetrica, 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC5097e.purchase, 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC5097e.billing, 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC5097e.yandex, 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC5097e.startapp, 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC5097e.adcel, 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC5097e.mopub, 3);
                return Unit.INSTANCE;
            case 14:
                return Unit.INSTANCE;
            case 15:
                return Unit.INSTANCE;
            case 16:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                Long l = (Long) obj;
                l.longValue();
                return l;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return Integer.valueOf(((String) ((C6571e) obj).f13544e).length());
            case 20:
                C7145e c7145e = (C7145e) obj;
                C3226e c3226e = (C3226e) c7145e.vip;
                C0895e c0895e = c3226e.ad;
                C0895e c0895e2 = c3226e.vip;
                StringBuilder sb = new StringBuilder();
                Iterator it = ((C15240e) c0895e.values()).iterator();
                while (true) {
                    C14225e c14225e = (C14225e) it;
                    if (!c14225e.hasNext()) {
                        c7145e.ad(C11047e.f21905e, new C4198e(sb.toString(), interfaceC5083e, 0));
                        c7145e.ad(C17647e.f34578e, new C15985e(c7145e, c0895e, (InterfaceC5083e) null));
                        c7145e.ad(C5170e.f11057e, new C4870e(c0895e, interfaceC5083e, 11));
                        return Unit.INSTANCE;
                    }
                    interfaceC3552e = (InterfaceC3552e) c14225e.next();
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    ((C1313e) interfaceC3552e).getClass();
                    String str = C1313e.metrica;
                    sb.append(str);
                    Float f = (Float) c0895e2.get(str);
                    if (f != null) {
                        floatValue = f.floatValue();
                        double d = floatValue;
                        if (0.0d <= d && d <= 1.0d) {
                            sb.append(";q=".concat(AbstractC5304e.m1860finally(5, String.valueOf(floatValue))));
                        }
                    }
                }
                throw new IllegalStateException(("Invalid quality value: " + floatValue + " for encoder: " + interfaceC3552e).toString());
            case 21:
                C16701e c16701e = (C16701e) obj;
                c16701e.vip(c16701e.metrica, C13886e.f27542e, "onCallReceive", C3268e.f7422e, new C2751e(new C13138e(new C12358e(i3, 6, interfaceC5083e), interfaceC5083e, i4), (InterfaceC5083e) null));
                int i6 = AbstractC7630e.ad;
                c16701e.vip(c16701e.license, C13886e.f27518e, "onCallRespond", C16269e.f31950e, new C13138e(i2, interfaceC5083e));
                C5874e c5874e = c16701e.billing.f9085e;
                C8208e c8208e = AbstractC7258e.ad;
                ArrayList arrayList = ((C13184e) c16701e.startapp).ad;
                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C2375e) it2.next()).ad);
                }
                c5874e.billing(c8208e, AbstractC13480e.premium(arrayList2));
                return Unit.INSTANCE;
            case 22:
                C7145e c7145e2 = (C7145e) obj;
                C11093e c11093e = (C11093e) c7145e2.vip;
                ArrayList arrayList3 = c11093e.vip;
                Set set = c11093e.ad;
                c7145e2.ad(C4590e.f9879e, new C14506e(c7145e2, null, arrayList3, set));
                c7145e2.ad(C11047e.f21903e, new C2080e(c7145e2, null, arrayList3, set));
                return Unit.INSTANCE;
            case 23:
                return ((C16318e) obj).ad.toString();
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C0004e) obj).ad;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return Boolean.valueOf(AbstractC4511e.yandex(((Character) obj).charValue()));
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return Boolean.valueOf(AbstractC4511e.adcel(((Character) obj).charValue()));
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return Boolean.valueOf(AbstractC4511e.yandex(((Character) obj).charValue()));
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C4468e c4468e = ((C14031e) obj).metrica;
                C18352e firebase2 = c4468e.firebase(2);
                String str2 = BuildConfig.FLAVOR;
                String str3 = firebase2 != null ? firebase2.ad : BuildConfig.FLAVOR;
                C18352e firebase3 = c4468e.firebase(4);
                if (firebase3 != null) {
                    str2 = firebase3.ad;
                }
                return new C6571e(str3, str2);
            default:
                return Unit.INSTANCE;
        }
    }
}
