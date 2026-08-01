package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؑؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6846e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f14095e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14096e;

    public /* synthetic */ C6846e(int i, Object obj) {
        this.f14096e = i;
        this.f14095e = obj;
    }

    public /* synthetic */ C6846e(Object obj, Object obj2, int i) {
        this.f14096e = i;
        this.f14095e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        int i = this.f14096e;
        int i2 = 13;
        int i3 = 12;
        final int i4 = 2;
        int i5 = 3;
        final int i6 = 0;
        final int i7 = 1;
        Object obj2 = this.f14095e;
        switch (i) {
            case 0:
                C5344e c5344e = (C5344e) obj2;
                C17213e c17213e = (C17213e) obj;
                AbstractC5087e.premium(c17213e, null, null, AbstractC15890e.license, 3);
                C1169e c1169e = c5344e.f11452e;
                c17213e.mopub(c1169e.subs(), null, new C6262e(i4, c1169e), new C2892e(2039820996, true, new C4290e(c1169e, c5344e, i3)));
                AbstractC5087e.premium(c17213e, null, null, AbstractC15890e.appmetrica, 3);
                return Unit.INSTANCE;
            case 1:
                return ((C13945e) obj2).smaato;
            case 2:
                C11683e c11683e = (C11683e) obj2;
                List list2 = c11683e.f23495e;
                ((C17213e) obj).mopub(list2.size(), null, new C6262e(i5, list2), new C2892e(2039820996, true, new C4290e(list2, c11683e, i2)));
                return Unit.INSTANCE;
            case 3:
                C0160e c0160e = (C0160e) obj2;
                C17213e c17213e2 = (C17213e) obj;
                List list3 = c0160e.ad;
                c17213e2.mopub(list3.size(), null, new C6262e(7, list3), new C2892e(802480018, true, new C12945e(i5, list3)));
                String str = c0160e.vip;
                if (str != null && str.length() > 0) {
                    AbstractC5087e.premium(c17213e2, null, null, AbstractC1129e.metrica, 3);
                    AbstractC5087e.premium(c17213e2, null, null, new C2892e(-1936859763, true, new C5020e(c0160e, i6)), 3);
                }
                return Unit.INSTANCE;
            case 4:
                final C10874e c10874e = (C10874e) obj2;
                C17213e c17213e3 = (C17213e) obj;
                AbstractC5087e.premium(c17213e3, null, null, new C2892e(-1344222098, true, new Function3() { // from class: eَؘٝ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        switch (i7) {
                            case 0:
                                C13770e c13770e = (C13770e) obj4;
                                int intValue = ((Integer) obj5).intValue();
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    AbstractC14489e.vip(c10874e.vip, AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 48, 0, 262140);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                C13770e c13770e2 = (C13770e) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    AbstractC10423e.ad(48, AbstractC16653e.license(-1635227221, new C17689e(3, c10874e), c13770e2), c13770e2, null);
                                } else {
                                    c13770e2.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                String str2 = c10874e.vip;
                if (str2 != null && str2.length() > 0) {
                    AbstractC5087e.premium(c17213e3, null, null, AbstractC1129e.vip, 3);
                    AbstractC5087e.premium(c17213e3, null, null, new C2892e(-1072876964, true, new Function3() { // from class: eَؘٝ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            switch (i6) {
                                case 0:
                                    C13770e c13770e = (C13770e) obj4;
                                    int intValue = ((Integer) obj5).intValue();
                                    if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                        AbstractC14489e.vip(c10874e.vip, AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 48, 0, 262140);
                                    } else {
                                        c13770e.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    C13770e c13770e2 = (C13770e) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        AbstractC10423e.ad(48, AbstractC16653e.license(-1635227221, new C17689e(3, c10874e), c13770e2), c13770e2, null);
                                    } else {
                                        c13770e2.m3659default();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }), 3);
                }
                return Unit.INSTANCE;
            case 5:
                C17371e c17371e = (C17371e) obj2;
                List list4 = (List) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (list4.size() % 2 != 0) {
                    throw new IllegalStateException("non-zero remainder");
                }
                while (i6 < list4.size()) {
                    linkedHashMap.put((String) list4.get(i6), list4.get(i6 + 1));
                    i6 += 2;
                }
                return c17371e.invoke(linkedHashMap);
            case 6:
                C11512e c11512e = (C11512e) obj2;
                c11512e.startapp(c11512e.amazon.apply(obj));
                return Unit.INSTANCE;
            case 7:
                return ((C4468e) obj2).firebase(((Integer) obj).intValue());
            case 8:
                DialogC5439e dialogC5439e = (DialogC5439e) obj2;
                dialogC5439e.show();
                return new C6035e(i2, dialogC5439e);
            case 9:
                C3625e c3625e = (C3625e) obj2;
                C0576e c0576e = c3625e.f8170e;
                C17213e c17213e4 = (C17213e) obj;
                if (((Boolean) c3625e.f8169e.getValue()).booleanValue()) {
                    AbstractC5087e.premium(c17213e4, null, null, AbstractC8306e.vip, 3);
                }
                if (!((InterfaceC8346e) c0576e.getValue()).isEmpty()) {
                    AbstractC5087e.premium(c17213e4, null, null, new C2892e(1082843197, true, new C11668e(c3625e, i7)), 3);
                    InterfaceC8346e interfaceC8346e = (InterfaceC8346e) c0576e.getValue();
                    c17213e4.mopub(((AbstractC7674e) interfaceC8346e).subs(), null, new C6262e(i3, interfaceC8346e), new C2892e(802480018, true, new C4290e(interfaceC8346e, c3625e, 14)));
                }
                return Unit.INSTANCE;
            case 10:
                return new C2419e(((C14826e) obj2).f29359e, (File) obj);
            case 11:
                C11958e c11958e = (C11958e) obj2;
                if (((Throwable) obj) != null) {
                    ((C12695e) c11958e.ad.m2188while()).appmetrica();
                }
                return Unit.INSTANCE;
            case 12:
                ((C17651e) obj2).billing(null);
                return Unit.INSTANCE;
            case 13:
                final C1856e c1856e = (C1856e) obj2;
                C17213e c17213e5 = (C17213e) obj;
                AbstractC5087e.premium(c17213e5, null, null, AbstractC5729e.metrica, 3);
                AbstractC5087e.premium(c17213e5, null, null, new C2892e(1932520938, true, new Function3() { // from class: eؘٜۨ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        switch (i6) {
                            case 0:
                                C13770e c13770e = (C13770e) obj4;
                                int intValue = ((Integer) obj5).intValue();
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    C1733e c1733e = AbstractC16524e.billing;
                                    C1856e c1856e2 = c1856e;
                                    boolean yandex = c13770e.yandex(c1856e2);
                                    Object m3681throw = c13770e.m3681throw();
                                    if (yandex || m3681throw == C2987e.ad) {
                                        C11476e c11476e = new C11476e(1, c1856e2, C1856e.class, "requestReloadNotification", "requestReloadNotification(Z)V", 0, 0, 5);
                                        c13770e.m3682throws(c11476e);
                                        m3681throw = c11476e;
                                    }
                                    AbstractC17181e.yandex(c1733e, false, null, (Function1) ((InterfaceC5261e) m3681throw), c13770e, 0, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                C13770e c13770e2 = (C13770e) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    C1733e c1733e2 = AbstractC16524e.yandex;
                                    C1856e c1856e3 = c1856e;
                                    boolean yandex2 = c13770e2.yandex(c1856e3);
                                    Object m3681throw2 = c13770e2.m3681throw();
                                    if (yandex2 || m3681throw2 == C2987e.ad) {
                                        C11476e c11476e2 = new C11476e(1, c1856e3, C1856e.class, "requestReloadNotification", "requestReloadNotification(Z)V", 0, 0, 6);
                                        c13770e2.m3682throws(c11476e2);
                                        m3681throw2 = c11476e2;
                                    }
                                    AbstractC17181e.yandex(c1733e2, false, null, (Function1) ((InterfaceC5261e) m3681throw2), c13770e2, 0, 6);
                                } else {
                                    c13770e2.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                C13770e c13770e3 = (C13770e) obj4;
                                int intValue3 = ((Integer) obj5).intValue();
                                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    C1733e c1733e3 = AbstractC16524e.purchase;
                                    C1856e c1856e4 = c1856e;
                                    boolean yandex3 = c13770e3.yandex(c1856e4);
                                    Object m3681throw3 = c13770e3.m3681throw();
                                    if (yandex3 || m3681throw3 == C2987e.ad) {
                                        C11476e c11476e3 = new C11476e(1, c1856e4, C1856e.class, "requestReloadNotification", "requestReloadNotification(Z)V", 0, 0, 7);
                                        c13770e3.m3682throws(c11476e3);
                                        m3681throw3 = c11476e3;
                                    }
                                    AbstractC17181e.yandex(c1733e3, false, null, (Function1) ((InterfaceC5261e) m3681throw3), c13770e3, 0, 6);
                                } else {
                                    c13770e3.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                AbstractC5087e.premium(c17213e5, null, null, new C2892e(1690823625, true, new Function3() { // from class: eؘٜۨ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        switch (i7) {
                            case 0:
                                C13770e c13770e = (C13770e) obj4;
                                int intValue = ((Integer) obj5).intValue();
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    C1733e c1733e = AbstractC16524e.billing;
                                    C1856e c1856e2 = c1856e;
                                    boolean yandex = c13770e.yandex(c1856e2);
                                    Object m3681throw = c13770e.m3681throw();
                                    if (yandex || m3681throw == C2987e.ad) {
                                        C11476e c11476e = new C11476e(1, c1856e2, C1856e.class, "requestReloadNotification", "requestReloadNotification(Z)V", 0, 0, 5);
                                        c13770e.m3682throws(c11476e);
                                        m3681throw = c11476e;
                                    }
                                    AbstractC17181e.yandex(c1733e, false, null, (Function1) ((InterfaceC5261e) m3681throw), c13770e, 0, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                C13770e c13770e2 = (C13770e) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    C1733e c1733e2 = AbstractC16524e.yandex;
                                    C1856e c1856e3 = c1856e;
                                    boolean yandex2 = c13770e2.yandex(c1856e3);
                                    Object m3681throw2 = c13770e2.m3681throw();
                                    if (yandex2 || m3681throw2 == C2987e.ad) {
                                        C11476e c11476e2 = new C11476e(1, c1856e3, C1856e.class, "requestReloadNotification", "requestReloadNotification(Z)V", 0, 0, 6);
                                        c13770e2.m3682throws(c11476e2);
                                        m3681throw2 = c11476e2;
                                    }
                                    AbstractC17181e.yandex(c1733e2, false, null, (Function1) ((InterfaceC5261e) m3681throw2), c13770e2, 0, 6);
                                } else {
                                    c13770e2.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                C13770e c13770e3 = (C13770e) obj4;
                                int intValue3 = ((Integer) obj5).intValue();
                                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    C1733e c1733e3 = AbstractC16524e.purchase;
                                    C1856e c1856e4 = c1856e;
                                    boolean yandex3 = c13770e3.yandex(c1856e4);
                                    Object m3681throw3 = c13770e3.m3681throw();
                                    if (yandex3 || m3681throw3 == C2987e.ad) {
                                        C11476e c11476e3 = new C11476e(1, c1856e4, C1856e.class, "requestReloadNotification", "requestReloadNotification(Z)V", 0, 0, 7);
                                        c13770e3.m3682throws(c11476e3);
                                        m3681throw3 = c11476e3;
                                    }
                                    AbstractC17181e.yandex(c1733e3, false, null, (Function1) ((InterfaceC5261e) m3681throw3), c13770e3, 0, 6);
                                } else {
                                    c13770e3.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                AbstractC5087e.premium(c17213e5, null, null, new C2892e(1449126312, true, new Function3() { // from class: eؘٜۨ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        switch (i4) {
                            case 0:
                                C13770e c13770e = (C13770e) obj4;
                                int intValue = ((Integer) obj5).intValue();
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    C1733e c1733e = AbstractC16524e.billing;
                                    C1856e c1856e2 = c1856e;
                                    boolean yandex = c13770e.yandex(c1856e2);
                                    Object m3681throw = c13770e.m3681throw();
                                    if (yandex || m3681throw == C2987e.ad) {
                                        C11476e c11476e = new C11476e(1, c1856e2, C1856e.class, "requestReloadNotification", "requestReloadNotification(Z)V", 0, 0, 5);
                                        c13770e.m3682throws(c11476e);
                                        m3681throw = c11476e;
                                    }
                                    AbstractC17181e.yandex(c1733e, false, null, (Function1) ((InterfaceC5261e) m3681throw), c13770e, 0, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                C13770e c13770e2 = (C13770e) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    C1733e c1733e2 = AbstractC16524e.yandex;
                                    C1856e c1856e3 = c1856e;
                                    boolean yandex2 = c13770e2.yandex(c1856e3);
                                    Object m3681throw2 = c13770e2.m3681throw();
                                    if (yandex2 || m3681throw2 == C2987e.ad) {
                                        C11476e c11476e2 = new C11476e(1, c1856e3, C1856e.class, "requestReloadNotification", "requestReloadNotification(Z)V", 0, 0, 6);
                                        c13770e2.m3682throws(c11476e2);
                                        m3681throw2 = c11476e2;
                                    }
                                    AbstractC17181e.yandex(c1733e2, false, null, (Function1) ((InterfaceC5261e) m3681throw2), c13770e2, 0, 6);
                                } else {
                                    c13770e2.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                C13770e c13770e3 = (C13770e) obj4;
                                int intValue3 = ((Integer) obj5).intValue();
                                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    C1733e c1733e3 = AbstractC16524e.purchase;
                                    C1856e c1856e4 = c1856e;
                                    boolean yandex3 = c13770e3.yandex(c1856e4);
                                    Object m3681throw3 = c13770e3.m3681throw();
                                    if (yandex3 || m3681throw3 == C2987e.ad) {
                                        C11476e c11476e3 = new C11476e(1, c1856e4, C1856e.class, "requestReloadNotification", "requestReloadNotification(Z)V", 0, 0, 7);
                                        c13770e3.m3682throws(c11476e3);
                                        m3681throw3 = c11476e3;
                                    }
                                    AbstractC17181e.yandex(c1733e3, false, null, (Function1) ((InterfaceC5261e) m3681throw3), c13770e3, 0, 6);
                                } else {
                                    c13770e3.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                return Unit.INSTANCE;
            case 14:
                final InterfaceC2558e interfaceC2558e = (InterfaceC2558e) obj2;
                C17213e c17213e6 = (C17213e) obj;
                AbstractC5087e.premium(c17213e6, null, null, AbstractC1284e.ad, 3);
                AbstractC5087e.premium(c17213e6, null, null, new C2892e(398056348, true, new Function3() { // from class: eٍۤۜ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        switch (i6) {
                            case 0:
                                C13770e c13770e = (C13770e) obj4;
                                int intValue = ((Integer) obj5).intValue();
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    AbstractC10423e.ad(48, AbstractC16653e.license(-776531073, new C17689e(15, interfaceC2558e), c13770e), c13770e, null);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                C13770e c13770e2 = (C13770e) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    AbstractC14489e.vip(((C10874e) interfaceC2558e).vip, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).vip.mopub, c13770e2, 0, 0, 131070);
                                } else {
                                    c13770e2.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                if (((C10874e) interfaceC2558e).vip != null) {
                    AbstractC5087e.premium(c17213e6, null, null, AbstractC1284e.vip, 3);
                    AbstractC5087e.premium(c17213e6, null, null, new C2892e(1401992311, true, new Function3() { // from class: eٍۤۜ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            switch (i7) {
                                case 0:
                                    C13770e c13770e = (C13770e) obj4;
                                    int intValue = ((Integer) obj5).intValue();
                                    if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                        AbstractC10423e.ad(48, AbstractC16653e.license(-776531073, new C17689e(15, interfaceC2558e), c13770e), c13770e, null);
                                    } else {
                                        c13770e.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    C13770e c13770e2 = (C13770e) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        AbstractC14489e.vip(((C10874e) interfaceC2558e).vip, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).vip.mopub, c13770e2, 0, 0, 131070);
                                    } else {
                                        c13770e2.m3659default();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }), 3);
                }
                AbstractC5087e.premium(c17213e6, null, null, AbstractC1284e.metrica, 3);
                return Unit.INSTANCE;
            case 15:
                ((AbstractC12834e) obj2).close();
                return Unit.INSTANCE;
            case 16:
                ((C11109e) obj2).appmetrica(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                Iterator it = ((C17417e) obj2).metrica.iterator();
                while (it.hasNext()) {
                    C14409e c14409e = (C14409e) it.next();
                    c14409e.ad.ad(obj, c14409e.vip);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                C14027e.ad.getClass();
                C14027e.metrica.applovin(C14027e.vip[0], bool);
                ((C9013e) obj2).f18078e.setValue(bool);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                float floatValue = ((Float) obj).floatValue();
                AbstractC16904e abstractC16904e = ((C18028e) obj2).vip;
                abstractC16904e.admob.startapp(abstractC16904e.adcel(((C16330e) abstractC16904e.license.f17056e).purchase() + AbstractC1561e.appmetrica(abstractC16904e.amazon() != 0 ? floatValue / abstractC16904e.amazon() : 0.0f)));
                return Unit.INSTANCE;
            case 20:
                C12979e c12979e = (C12979e) obj2;
                c12979e.f25887e.invoke((List) obj);
                c12979e.purchase();
                return Unit.INSTANCE;
            case 21:
                ((C4051e) obj2).ad.setValue(Boolean.valueOf(((Float) obj).floatValue() == 1.0f));
                return Unit.INSTANCE;
            case 22:
                PlaybackService playbackService = (PlaybackService) obj2;
                int i8 = PlaybackService.f36732e;
                C17148e c17148e = (C17148e) ((InterfaceC12406e) obj);
                c17148e.m4251e();
                if (!c17148e.f33598e) {
                    c17148e.mo2121e(playbackService.f36744e);
                    c17148e.release();
                }
                return Unit.INSTANCE;
            case 23:
                C1748e c1748e = (C1748e) obj2;
                C17148e c17148e2 = (C17148e) ((InterfaceC12406e) obj);
                c17148e2.mo3032e(new C3335e(2, 0, 1, 1, 0, false, true), c1748e.ad);
                c17148e2.m4271e(c1748e.vip);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C18384e c18384e = (C18384e) obj2;
                C7469e c7469e = (C7469e) obj;
                c7469e.ad(C9582e.vip, "type");
                c7469e.ad(AbstractC10003e.appmetrica("kotlinx.serialization.Polymorphic<" + c18384e.ad.mopub() + '>', C6587e.appmetrica, new InterfaceC9998e[0]), "value");
                c7469e.vip = c18384e.vip;
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C4246e c4246e = (C4246e) obj2;
                C7513e c7513e = ((C13854e) ((InterfaceC6459e) obj)).f27437e;
                List list5 = (List) c4246e.f9318e;
                if (list5 != null) {
                    list5.add(c7513e);
                    list = list5;
                } else {
                    list = AbstractC6874e.mopub(c7513e);
                }
                c4246e.f9318e = list;
                return EnumC9253e.f18466e;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C12718e) ((C18464e) obj2).f36194e).addLast(obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C1615e c1615e = ((C9261e) obj2).f18470e;
                c1615e.getClass();
                c1615e.smaato(null, (String) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C12190e c12190e = (C12190e) obj2;
                long longValue = ((Long) obj).longValue();
                InterfaceC4097e interfaceC4097e = (InterfaceC4097e) c12190e.license;
                C12190e c12190e2 = (C12190e) c12190e.metrica;
                c12190e2.metrica();
                float f = (float) longValue;
                long length = ((File) c12190e2.license).length();
                if (length < 1) {
                    length = 1;
                }
                interfaceC4097e.metrica(((Number) AbstractC3062e.purchase(Float.valueOf(f / ((float) length)), new C3721e(0.0f, 1.0f))).floatValue());
                return Unit.INSTANCE;
            default:
                Unit unit = Unit.INSTANCE;
                ((C8823e) obj2).m2175import(unit);
                return unit;
        }
    }
}
