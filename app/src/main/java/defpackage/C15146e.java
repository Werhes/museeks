package defpackage;

import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: eٕؐؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15146e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f29975e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C15146e f29957e = new C15146e(0);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C15146e f29952e = new C15146e(1);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C15146e f29968e = new C15146e(2);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C15146e f29949e = new C15146e(3);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C15146e f29973e = new C15146e(4);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C15146e f29972e = new C15146e(5);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C15146e f29961e = new C15146e(6);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C15146e f29970e = new C15146e(7);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C15146e f29953e = new C15146e(8);

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C15146e f29964e = new C15146e(9);

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C15146e f29951e = new C15146e(10);

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C15146e f29950e = new C15146e(11);

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C15146e f29955e = new C15146e(12);

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C15146e f29959e = new C15146e(13);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C15146e f29960e = new C15146e(14);

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final C15146e f29958e = new C15146e(15);

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final C15146e f29956e = new C15146e(16);

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public static final C15146e f29967e = new C15146e(17);

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final C15146e f29974e = new C15146e(18);

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public static final C15146e f29954e = new C15146e(19);

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public static final C15146e f29966e = new C15146e(20);

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public static final C15146e f29969e = new C15146e(21);

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public static final C15146e f29971e = new C15146e(22);

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public static final C15146e f29965e = new C15146e(23);

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public static final C15146e f29962e = new C15146e(24);

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public static final C15146e f29963e = new C15146e(25);

    public /* synthetic */ C15146e(int i) {
        this.f29975e = i;
    }

    public /* synthetic */ C15146e(AbstractC16946e abstractC16946e, int i) {
        this.f29975e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC0390e vip;
        String metrica;
        List list;
        boolean z = false;
        switch (this.f29975e) {
            case 0:
                return AbstractC2677e.vip((Class) obj);
            case 1:
                return AbstractC7890e.billing(obj, Boolean.FALSE) ? new C3618e(C3618e.adcel) : new C3618e(AbstractC6532e.vip(((Integer) obj).intValue()));
            case 2:
                return Unit.INSTANCE;
            case 3:
                String str = (String) obj;
                return str.length() > 1 ? AbstractC17861e.advert(';', "L", str) : str;
            case 4:
                return ((InterfaceC0390e) obj).mo327e().ad();
            case 5:
                return Boolean.valueOf(((AbstractC15728e) obj) instanceof C13902e);
            case 6:
                InterfaceC4077e advert = ((AbstractC15728e) obj).loadAd().advert();
                if (advert == null) {
                    return Boolean.FALSE;
                }
                C0520e name = advert.getName();
                C12816e c12816e = C0696e.purchase;
                if (AbstractC7890e.billing(name, c12816e.ad.billing()) && AbstractC7890e.billing(AbstractC2876e.metrica(advert), c12816e)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                return Boolean.valueOf(AbstractC6232e.appmetrica(AbstractC2876e.startapp((InterfaceC0390e) obj)));
            case 8:
                int i = AbstractC7347e.advert;
                C1117e c1117e = (C1117e) ((InterfaceC0390e) obj);
                if (AbstractC13270e.applovin(c1117e) && AbstractC2876e.vip(c1117e, new C17877e(9, c1117e)) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                InterfaceC0390e interfaceC0390e = (InterfaceC0390e) obj;
                if (AbstractC13270e.applovin(interfaceC0390e)) {
                    int i2 = AbstractC15540e.advert;
                    if (AbstractC7928e.appmetrica.contains(interfaceC0390e.getName()) && (vip = AbstractC2876e.vip(interfaceC0390e, C11633e.f23383e)) != null && (metrica = AbstractC5209e.metrica(vip)) != null) {
                        if (!AbstractC7928e.vip.contains(metrica)) {
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 10:
                return Integer.valueOf(((C13212e) obj).f26234e.size());
            case 11:
                return (C1117e) obj;
            case 12:
                return (InterfaceC2188e) obj;
            case 13:
                return (InterfaceC6647e) obj;
            case 14:
                return Boolean.valueOf(!(((InterfaceC15498e) obj) instanceof InterfaceC11788e));
            case 15:
                return new C1356e(1, ((InterfaceC6647e) ((InterfaceC15498e) obj)).getTypeParameters());
            case 16:
                InterfaceC4077e advert2 = ((AbstractC15728e) obj).loadAd().advert();
                if (advert2 != null && (advert2 instanceof InterfaceC16046e) && (((InterfaceC16046e) advert2).mo1351switch() instanceof InterfaceC9794e)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                InterfaceC4077e advert3 = ((AbstractC15728e) obj).loadAd().advert();
                if (advert3 != null && ((advert3 instanceof InterfaceC9794e) || (advert3 instanceof InterfaceC16046e))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                Throwable th = (Throwable) obj;
                if (th != null && !(th instanceof CancellationException) && AbstractC9464e.amazon()) {
                    Log.e("CXCP", "Surface setup error!", th);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return null;
            case 20:
                return ((EnumC10783e) obj).f21241e;
            case 21:
                List list2 = (List) obj;
                list = list2.size() > 1 ? list2 : null;
                return list != null ? AbstractC13480e.crashlytics(list) : list2;
            case 22:
                List list3 = (List) obj;
                list = list3.size() > 1 ? list3 : null;
                return list != null ? AbstractC13480e.crashlytics(list) : list3;
            case 23:
                List list4 = (List) obj;
                list = list4.size() > 1 ? list4 : null;
                return list != null ? AbstractC13480e.crashlytics(list) : list4;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return Collections.singletonList(C10139e.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                List list5 = (List) obj;
                list = list5.size() > 1 ? list5 : null;
                return list != null ? AbstractC13480e.crashlytics(list) : list5;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C13520e) obj).getClass();
                return null;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                EnumC15845e.f31267e.get(((Number) obj).intValue());
                return null;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return AbstractC2876e.adcel((InterfaceC0390e) obj);
            default:
                return InterfaceC3054e.f7112e;
        }
    }
}
