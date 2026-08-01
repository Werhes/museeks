package defpackage;

import android.content.SharedPreferences;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؑۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0638e extends C7460e implements Function1 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f2875e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0638e(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f2875e = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r7v0, types: [eًؗۖ] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v3, types: [eٌۧۘ] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object[] objArr;
        Object[] objArr2;
        int i;
        InterfaceC6937e interfaceC6937e;
        int i2 = 10;
        int i3 = 3;
        int i4 = 2;
        int i5 = 0;
        ?? r6 = 0;
        ?? r62 = 0;
        ?? r63 = 0;
        ?? r64 = 0;
        switch (this.f2875e) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C13621e c13621e = (C13621e) this.f7266e;
                c13621e.getClass();
                c13621e.vip.setValue(booleanValue ? EnumC10483e.f20705e : EnumC10483e.f20707e);
                return Unit.INSTANCE;
            case 1:
                ((Boolean) obj).getClass();
                C2038e c2038e = (C2038e) this.f7266e;
                c2038e.getClass();
                new C3779e(new C14564e(), 6).signatures(c2038e.ad);
                return Unit.INSTANCE;
            case 2:
                ((Boolean) obj).booleanValue();
                C2038e c2038e2 = (C2038e) this.f7266e;
                c2038e2.getClass();
                String str = c2038e2.mopub().mopub;
                if (str == null) {
                    str = "common";
                }
                C7838e c7838e = VKXApplication.f36530e;
                if (c7838e == null) {
                    c7838e = null;
                }
                InterfaceC1686e interfaceC1686e = c7838e.f15868e.license;
                C18010e c18010e = interfaceC1686e instanceof C18010e ? (C18010e) interfaceC1686e : null;
                r7 = c18010e != null ? c18010e.metrica : 0;
                if (r7 == 0) {
                    r7 = C9139e.f18290e;
                }
                new C12340e(str, r7).signatures(c2038e2.ad);
                return Unit.INSTANCE;
            case 3:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                C13621e c13621e2 = (C13621e) this.f7266e;
                c13621e2.getClass();
                c13621e2.vip.setValue(booleanValue2 ? EnumC10483e.f20704e : EnumC10483e.f20707e);
                return Unit.INSTANCE;
            case 4:
                ((Boolean) obj).booleanValue();
                C2038e c2038e3 = (C2038e) this.f7266e;
                c2038e3.smaato(c2038e3.adcel());
                return Unit.INSTANCE;
            case 5:
                int intValue = ((Number) obj).intValue();
                ((C2038e) this.f7266e).getClass();
                C7838e c7838e2 = VKXApplication.f36530e;
                if (c7838e2 == null) {
                    c7838e2 = null;
                }
                if (c7838e2.f15868e.yandex(Integer.valueOf(intValue)) != null) {
                    c7838e2.startapp(new C15338e(intValue, r7, i4, r6 == true ? 1 : 0));
                }
                return Unit.INSTANCE;
            case 6:
                int intValue2 = ((Number) obj).intValue();
                C12805e c12805e = (C12805e) this.f7266e;
                c12805e.purchase.startapp(intValue2);
                C7838e c7838e3 = VKXApplication.f36530e;
                if (c7838e3 == null) {
                    c7838e3 = null;
                }
                long ad = ((InterfaceC12391e) c12805e.vip.get(intValue2)).ad();
                c7838e3.getClass();
                C7838e c7838e4 = VKXApplication.f36530e;
                (c7838e4 != null ? c7838e4 : null).smaato();
                return Unit.INSTANCE;
            case 7:
                C14609e c14609e = (C14609e) obj;
                ((C2038e) this.f7266e).getClass();
                C7838e c7838e5 = VKXApplication.f36530e;
                if (c7838e5 == null) {
                    c7838e5 = null;
                }
                c7838e5.getClass();
                AbstractC5336e.purchase(c7838e5, AbstractC6731e.ad, 0, new C8086e(c7838e5, c14609e, r7, i2), 2);
                return Unit.INSTANCE;
            case 8:
                ((C2038e) this.f7266e).smaato((C14609e) obj);
                return Unit.INSTANCE;
            case 9:
                ((C2038e) this.f7266e).getClass();
                C2038e.advert((C14609e) obj);
                return Unit.INSTANCE;
            case 10:
                int intValue3 = ((Number) obj).intValue();
                ((C2038e) this.f7266e).getClass();
                C7838e c7838e6 = VKXApplication.f36530e;
                if (c7838e6 == null) {
                    c7838e6 = null;
                }
                c7838e6.getClass();
                c7838e6.startapp(new C15338e(intValue3, r7, i3, r62 == true ? 1 : 0));
                return Unit.INSTANCE;
            case 11:
                int intValue4 = ((Number) obj).intValue();
                ((C2038e) this.f7266e).getClass();
                C7838e c7838e7 = VKXApplication.f36530e;
                if (c7838e7 == null) {
                    c7838e7 = null;
                }
                c7838e7.getClass();
                c7838e7.startapp(new C15338e(intValue4, r7, i3, r63 == true ? 1 : 0));
                return Unit.INSTANCE;
            case 12:
                int intValue5 = ((Number) obj).intValue();
                ((C2038e) this.f7266e).getClass();
                C7838e c7838e8 = VKXApplication.f36530e;
                if (c7838e8 == null) {
                    c7838e8 = null;
                }
                if (c7838e8.f15868e.yandex(Integer.valueOf(intValue5)) != null) {
                    c7838e8.startapp(new C15338e(intValue5, r7, i4, r64 == true ? 1 : 0));
                }
                return Unit.INSTANCE;
            case 13:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                AbstractC6102e abstractC6102e = (AbstractC6102e) this.f7266e;
                C16529e c16529e = abstractC6102e.f12791e;
                if (booleanValue3) {
                    abstractC6102e.m2023e();
                } else {
                    if (abstractC6102e.f12792e != null) {
                        Object[] objArr3 = c16529e.metrica;
                        long[] jArr = c16529e.ad;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j = jArr[i6];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8;
                                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                                    int i9 = 0;
                                    while (i9 < i8) {
                                        if ((j & 255) < 128) {
                                            i = i7;
                                            objArr2 = objArr3;
                                            AbstractC5336e.purchase(abstractC6102e.m3623e(), null, 0, new C6189e(abstractC6102e, (C17612e) objArr3[(i6 << 3) + i9], r7, i5), 3);
                                        } else {
                                            objArr2 = objArr3;
                                            i = i7;
                                        }
                                        j >>= i;
                                        i9++;
                                        i7 = i;
                                        objArr3 = objArr2;
                                    }
                                    objArr = objArr3;
                                    if (i8 != i7) {
                                    }
                                } else {
                                    objArr = objArr3;
                                }
                                if (i6 != length) {
                                    i6++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                        C17612e c17612e = abstractC6102e.f12790e;
                        if (c17612e != null) {
                            AbstractC5336e.purchase(abstractC6102e.m3623e(), null, 0, new C6189e(abstractC6102e, c17612e, r7, 1), 3);
                        }
                    }
                    c16529e.ad();
                    abstractC6102e.f12790e = null;
                    abstractC6102e.mo2026e();
                }
                return Unit.INSTANCE;
            case 14:
                ((C1925e) this.f7266e).yandex.subscription((String) obj);
                return Unit.INSTANCE;
            case 15:
                return Boolean.valueOf(((C0583e) this.f7266e).metrica((String) obj));
            case 16:
                Boolean bool = (Boolean) obj;
                boolean booleanValue4 = bool.booleanValue();
                AppActivity appActivity = (AppActivity) this.f7266e;
                appActivity.getClass();
                SharedPreferences sharedPreferences = AbstractC6181e.ad;
                EnumC7437e enumC7437e = EnumC7437e.f15206e;
                AbstractC6181e.ad.edit().putBoolean("LEGACY_DOCK", booleanValue4).apply();
                AbstractC6181e.vip.put(enumC7437e, bool);
                ((NextDockView) appActivity.f36547e.f10519e).setLegacyMode(booleanValue4);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C7888e) this.f7266e).m2350private(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C7888e) this.f7266e).m2349package(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((InterfaceC1618e) this.f7266e).purchase((InterfaceC5083e) obj);
            case 20:
                ((C15435e) this.f7266e).f30512e.advert((String) obj);
                return Unit.INSTANCE;
            case 21:
                ((C15435e) this.f7266e).f30512e.advert((String) obj);
                return Unit.INSTANCE;
            case 22:
                return ((AbstractC11062e) this.f7266e).mo1917goto((C10675e) obj);
            case 23:
                InterfaceC3480e interfaceC3480e = (InterfaceC3480e) obj;
                C12733e c12733e = (C12733e) this.f7266e;
                c12733e.getClass();
                C5363e c5363e = AbstractC1951e.ad;
                C3266e c3266e = C3266e.metrica;
                if (C3266e.metrica.ad) {
                    C5363e c5363e2 = AbstractC1951e.ad;
                    if (((Long) c5363e2.getValue()) != null) {
                        long id = Thread.currentThread().getId();
                        Long l = (Long) c5363e2.getValue();
                        if (l == null || id != l.longValue()) {
                            Function1 function1 = C3266e.metrica.vip;
                            String name = Thread.currentThread().getName();
                            if (name == null) {
                                name = "unknown";
                            }
                            function1.invoke(new C2123e("Expected to be called on the main thread, but was ".concat(name), 9));
                        }
                    }
                }
                if (interfaceC3480e instanceof C16768e) {
                    C8221e c8221e = c12733e.vip;
                    if (c8221e != null) {
                        Object obj2 = ((C16768e) interfaceC3480e).ad;
                        C0909e c0909e = (C0909e) c8221e.ad;
                        InterfaceC6937e interfaceC6937e2 = (InterfaceC6937e) c0909e.f3322e;
                        InterfaceC6937e interfaceC6937e3 = (InterfaceC6937e) ((Function2) c8221e.metrica).invoke(interfaceC6937e2, obj2);
                        c0909e.m422implements(interfaceC6937e3.getChildren());
                        c0909e.f3322e = interfaceC6937e3;
                        c8221e.startapp(interfaceC6937e3, interfaceC6937e2);
                        ((Function3) c8221e.appmetrica).invoke(obj2, interfaceC6937e3, interfaceC6937e2);
                    } else {
                        c12733e.ad.add(((C16768e) interfaceC3480e).ad);
                    }
                } else if (interfaceC3480e instanceof C14577e) {
                    C8221e c8221e2 = c12733e.vip;
                    if (c8221e2 != null) {
                        C0909e c0909e2 = (C0909e) c8221e2.ad;
                        Function0 function0 = (Function0) c8221e2.yandex;
                        if (function0 != null && (interfaceC6937e = (InterfaceC6937e) function0.invoke()) != null) {
                            InterfaceC6937e interfaceC6937e4 = (InterfaceC6937e) c0909e2.f3322e;
                            c0909e2.m422implements(interfaceC6937e.getChildren());
                            c0909e2.f3322e = interfaceC6937e;
                            c8221e2.startapp(interfaceC6937e, interfaceC6937e4);
                        }
                    }
                } else {
                    if (!(interfaceC3480e instanceof C2719e)) {
                        throw new C14803e(10);
                    }
                    C8221e c8221e3 = ((C2719e) interfaceC3480e).ad;
                    c12733e.vip = c8221e3;
                    Iterator it = c12733e.ad.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        C0909e c0909e3 = (C0909e) c8221e3.ad;
                        InterfaceC6937e interfaceC6937e5 = (InterfaceC6937e) c0909e3.f3322e;
                        InterfaceC6937e interfaceC6937e6 = (InterfaceC6937e) ((Function2) c8221e3.metrica).invoke(interfaceC6937e5, next);
                        c0909e3.m422implements(interfaceC6937e6.getChildren());
                        c0909e3.f3322e = interfaceC6937e6;
                        c8221e3.startapp(interfaceC6937e6, interfaceC6937e5);
                        ((Function3) c8221e3.appmetrica).invoke(next, interfaceC6937e6, interfaceC6937e5);
                    }
                    c12733e.ad.clear();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C8336e) this.f7266e).mopub((C16439e) obj);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C8336e) this.f7266e).mopub((C16439e) obj);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C8336e) this.f7266e).mopub((C16439e) obj);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C8336e) this.f7266e).mopub((C16439e) obj);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C8336e) this.f7266e).mopub((C16439e) obj);
            default:
                return ((C8336e) this.f7266e).mopub((C16439e) obj);
        }
    }
}
