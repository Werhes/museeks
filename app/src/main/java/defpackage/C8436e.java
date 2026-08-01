package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.path_migration.DedicatedCacheMigrationService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8436e implements Function2 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17200e;

    public /* synthetic */ C8436e(byte b, int i) {
        this.f17200e = i;
    }

    public /* synthetic */ C8436e(int i) {
        this.f17200e = 17;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C17139e c17139e;
        switch (this.f17200e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC14489e.vip("VK Recommendations", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 6, 0, 262142);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_close, 0, c13770e2), null, null, 0L, c13770e2, 56, 12);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                return Character.valueOf(((String) ((C6571e) obj).f13544e).charAt(((Integer) obj2).intValue()));
            case 3:
                ((Character) obj).getClass();
                ((Integer) obj2).getClass();
                return Boolean.FALSE;
            case 4:
                InterfaceC4595e interfaceC4595e = (InterfaceC4595e) obj2;
                InterfaceC8850e mo396final = ((InterfaceC8850e) obj).mo396final(interfaceC4595e.getKey());
                C2693e c2693e = C2693e.f6576e;
                if (mo396final == c2693e) {
                    return interfaceC4595e;
                }
                C12575e c12575e = C12575e.f25235e;
                InterfaceC5972e interfaceC5972e = (InterfaceC5972e) mo396final.mo397public(c12575e);
                if (interfaceC5972e == null) {
                    c17139e = new C17139e(mo396final, interfaceC4595e);
                } else {
                    InterfaceC8850e mo396final2 = mo396final.mo396final(c12575e);
                    if (mo396final2 == c2693e) {
                        return new C17139e(interfaceC4595e, interfaceC5972e);
                    }
                    c17139e = new C17139e(new C17139e(mo396final2, interfaceC4595e), interfaceC5972e);
                }
                return c17139e;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 6:
                return ((InterfaceC8850e) obj).mo394const((InterfaceC4595e) obj2);
            case 7:
                return ((InterfaceC8850e) obj).mo394const((InterfaceC4595e) obj2);
            case 8:
                int i = DedicatedCacheMigrationService.f36555e;
                return EnumC7377e.f15119e;
            case 9:
                C16349e c16349e = (C16349e) obj2;
                return AbstractC6874e.startapp(Integer.valueOf(((C16330e) c16349e.license.f17056e).purchase()), Float.valueOf(AbstractC3062e.vip(((C2616e) c16349e.license.f17053e).purchase(), -0.5f, 0.5f)), Integer.valueOf(c16349e.advert()));
            case 10:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e3, R.string.settings_experimental_vkru), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 11:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                String str = "vk.com";
                if (!booleanValue && booleanValue2) {
                    str = "vk.ru";
                }
                AbstractC7205e.metrica = str;
                return Unit.INSTANCE;
            case 12:
                return Boolean.valueOf(AbstractC7890e.billing(obj, obj2));
            case 13:
                char charValue = ((Character) obj).charValue();
                ((Integer) obj2).intValue();
                return Boolean.valueOf(charValue == ' ');
            case 14:
                char charValue2 = ((Character) obj).charValue();
                ((Integer) obj2).intValue();
                return Boolean.valueOf(charValue2 == ' ');
            case 15:
                return Unit.INSTANCE;
            case 16:
                return Long.valueOf(AbstractC15440e.f30517e.yandex() + Math.min((long) (Math.pow(2.0d, ((Integer) obj2).intValue() - 1) * 1000), 60000L));
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((Integer) obj2).getClass();
                AbstractC0863e.ad((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C15784e) obj).vip = (InterfaceC1306e) obj2;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C15784e) obj).ad = (InterfaceC7189e) obj2;
                return Unit.INSTANCE;
            case 20:
                ((C15784e) obj).appmetrica = ((C6604e) obj2).ad;
                return Unit.INSTANCE;
            case 21:
                C10866e c10866e = (C10866e) obj2;
                ((C15784e) obj).metrica = c10866e != null ? c10866e.ad : null;
                return Unit.INSTANCE;
            case 22:
                ((C15784e) obj).license = (Float) obj2;
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                return new C5177e(1);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C8202e c8202e = (C8202e) obj2;
                return AbstractC6874e.startapp(Integer.valueOf(c8202e.license.vip.purchase()), Integer.valueOf(c8202e.license.metrica.purchase()));
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C4993e c4993e = (C4993e) obj2;
                return AbstractC6874e.startapp(Integer.valueOf(c4993e.appmetrica.vip.purchase()), Integer.valueOf(c4993e.appmetrica.metrica.purchase()));
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                Map license = ((C6017e) obj2).license();
                if (license.isEmpty()) {
                    return null;
                }
                return license;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C2254e c2254e = ((C13713e) obj2).metrica;
                return AbstractC6874e.startapp((int[]) c2254e.f5732e, (int[]) c2254e.f5737e);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C13770e c13770e4 = (C13770e) obj;
                ((Integer) obj2).getClass();
                c13770e4.m3676strictfp(-511854661);
                C8464e c8464e = C8464e.ad;
                WeakHashMap weakHashMap = C8845e.isVip;
                C10996e c10996e = new C10996e(C16728e.subscription(c13770e4).advert, 48);
                c13770e4.Signature(false);
                return c10996e;
            default:
                C13770e c13770e5 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c13770e5.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    AbstractC13328e.smaato.invoke(c13770e5, 0);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
