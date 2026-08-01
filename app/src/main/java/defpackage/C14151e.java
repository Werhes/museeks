package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٟٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14151e implements Function2 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27981e;

    public /* synthetic */ C14151e(byte b, int i) {
        this.f27981e = i;
    }

    public /* synthetic */ C14151e(int i) {
        this.f27981e = 24;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f27981e;
        C10068e c10068e = AbstractC16398e.ad;
        int i2 = 3;
        switch (i) {
            case 0:
                List list = (List) obj2;
                return AbstractC17808e.purchase((InterfaceC7227e) obj, AbstractC17808e.advert(c10068e, list, true), new C5864e(i2, list));
            case 1:
                List list2 = (List) obj2;
                InterfaceC5372e purchase = AbstractC17808e.purchase((InterfaceC7227e) obj, AbstractC17808e.advert(c10068e, list2, true), new C5864e(4, list2));
                if (purchase != null) {
                    return AbstractC6069e.purchase(purchase);
                }
                return null;
            case 2:
                ((C10973e) obj).getClass();
                C6571e[] c6571eArr = {new C6571e("KEY", ((C16007e) obj2).ad)};
                C7988e c7988e = new C7988e(7);
                C6571e c6571e = c6571eArr[0];
                c7988e.m2373while((String) c6571e.f13544e, c6571e.f13543e);
                C13198e c13198e = new C13198e((HashMap) c7988e.f16176e);
                C13198e.vip(c13198e);
                return c13198e;
            case 3:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, R.string.st_ac), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262142);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e2, R.string.auth2_qr_code_scanner_act_desc), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                return ((C3229e) obj2).license();
            case 6:
                ((C5831e) obj).metrica = ((C16109e) obj2).ad;
                return Unit.INSTANCE;
            case 7:
                ((C5831e) obj).license = (InterfaceC3997e) obj2;
                return Unit.INSTANCE;
            case 8:
                return Unit.INSTANCE;
            case 9:
                return (EnumC3856e) ((C0576e) ((C13440e) obj2).ad.metrica).getValue();
            case 10:
                return (EnumC11762e) ((C0576e) ((C2628e) obj2).ad.metrica).getValue();
            case 11:
                return Integer.valueOf(((InterfaceC16719e) obj).smaato(((Integer) obj2).intValue()));
            case 12:
                return Integer.valueOf(((InterfaceC16719e) obj).loadAd(((Integer) obj2).intValue()));
            case 13:
                return Integer.valueOf(((InterfaceC16719e) obj).mo2529while(((Integer) obj2).intValue()));
            case 14:
                return Integer.valueOf(((InterfaceC16719e) obj).metrica(((Integer) obj2).intValue()));
            case 15:
                C17210e c17210e = (C17210e) obj2;
                return AbstractC6874e.startapp(Float.valueOf(c17210e.ad.purchase()), Boolean.valueOf(((EnumC17426e) c17210e.purchase.getValue()) == EnumC17426e.f34146e));
            case 16:
                ((C12102e) obj).ad = (String) obj2;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C12102e) obj).license = (InterfaceC7189e) obj2;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C12102e) obj).vip = (C14323e) obj2;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C12102e) obj).metrica = ((Integer) obj2).intValue();
                return Unit.INSTANCE;
            case 20:
                InterfaceC4595e interfaceC4595e = (InterfaceC4595e) obj2;
                if (!(interfaceC4595e instanceof AbstractC8670e)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue3 = num != null ? num.intValue() : 1;
                return intValue3 == 0 ? interfaceC4595e : Integer.valueOf(intValue3 + 1);
            case 21:
                InterfaceC4595e interfaceC4595e2 = (InterfaceC4595e) obj2;
                if (interfaceC4595e2 instanceof AbstractC8670e) {
                    return (AbstractC8670e) interfaceC4595e2;
                }
                return null;
            case 22:
                C9799e c9799e = (C9799e) obj;
                InterfaceC4595e interfaceC4595e3 = (InterfaceC4595e) obj2;
                if (interfaceC4595e3 instanceof AbstractC8670e) {
                    AbstractC8670e abstractC8670e = (AbstractC8670e) interfaceC4595e3;
                    Object vip = abstractC8670e.vip(c9799e.ad);
                    Object[] objArr = c9799e.vip;
                    int i3 = c9799e.license;
                    objArr[i3] = vip;
                    AbstractC8670e[] abstractC8670eArr = c9799e.metrica;
                    c9799e.license = i3 + 1;
                    abstractC8670eArr[i3] = abstractC8670e;
                }
                return c9799e;
            case 23:
                C5070e c5070e = (C5070e) obj2;
                return AbstractC6874e.startapp(Float.valueOf(c5070e.ad), Float.valueOf(c5070e.license.purchase()), Float.valueOf(c5070e.vip.purchase()));
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((Integer) obj2).getClass();
                AbstractC18268e.metrica((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((Integer) obj).intValue();
                return ((C9552e) obj2).ad;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((Integer) obj).intValue();
                return ((C0262e) obj2).ad;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((Integer) obj).intValue();
                return ((C0262e) obj2).ad;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C8181e) obj2).vip == ((Integer) obj).intValue() ? EnumC10854e.f21499e : EnumC10854e.f21500e;
            default:
                ((C13915e) obj).f27616e = true;
                Unit unit = Unit.INSTANCE;
                return Unit.INSTANCE;
        }
    }
}
