package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۘٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8171e implements Function2 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16642e;

    public /* synthetic */ C8171e(int i) {
        this.f16642e = i;
    }

    public /* synthetic */ C8171e(int i, int i2) {
        this.f16642e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16642e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C7913e c7913e = AbstractC18007e.metrica;
                    C10156e c10156e = C5438e.f11676e;
                    InterfaceC2747e license = AbstractC17074e.license(c10156e, false);
                    long j = c13770e.f27286case;
                    int i = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, c7913e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, license, C2721e.billing);
                    AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    C14486e c14486e = C14486e.ad;
                    C0115e c0115e = C0115e.f1276e;
                    AbstractC8141e.vip(c14486e.ad(c0115e, c10156e), 0.0f, 0L, c13770e, 0, 6);
                    String appmetrica = AbstractC5297e.appmetrica(c13770e, R.string.settings_nothing_playing);
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica, c14486e.ad(c0115e, C5438e.f11700e), ((C7019e) c13770e.adcel(c15492e)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.mopub, c13770e, 0, 0, 131064);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC15946e.ad((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC15946e.vip((C13770e) obj, AbstractC5190e.advert(7));
                return Unit.INSTANCE;
            case 3:
                return Character.valueOf(((CharSequence) obj).charAt(((Integer) obj2).intValue()));
            case 4:
                C1059e c1059e = (C1059e) obj;
                if (c1059e != null) {
                    c1059e.metrica(AbstractC7122e.ad.purchase() + AbstractC3489e.vip);
                }
                return Unit.INSTANCE;
            case 5:
                C1059e c1059e2 = (C1059e) obj;
                C16779e c16779e = (C16779e) obj2;
                if (c1059e2 != null) {
                    c1059e2.license(AbstractC3489e.ad);
                }
                if (c1059e2 != null) {
                    c1059e2.metrica(AbstractC7122e.ad.purchase() + AbstractC3489e.vip);
                }
                if (c16779e != null) {
                    c16779e.setStatusbarHeight(AbstractC3489e.ad);
                }
                return Unit.INSTANCE;
            case 6:
                ((C5541e) obj).metrica = (InterfaceC7189e) obj2;
                return Unit.INSTANCE;
            case 7:
                ((C5541e) obj).license = (C7139e) obj2;
                return Unit.INSTANCE;
            case 8:
                return Character.valueOf(((C3434e) obj).ad.charAt(((Integer) obj2).intValue()));
            case 9:
                return new C6934e(((C11028e) obj).ad.vip, (List) obj2);
            case 10:
                return new C2157e((List) ((C2575e) obj2).ad.invoke(((C2157e) obj).ad));
            case 11:
                List list = (List) obj2;
                return new C15369e((C1631e) AbstractC13480e.m3570break(list), AbstractC13480e.crashlytics(list));
            case 12:
                return Unit.INSTANCE;
            case 13:
                ((C3391e) obj).metrica = (InterfaceC7189e) obj2;
                return Unit.INSTANCE;
            case 14:
                ((C3391e) obj).appmetrica = ((C2782e) obj2).ad;
                return Unit.INSTANCE;
            case 15:
                ((C3391e) obj).license = ((C13692e) obj2).ad;
                return Unit.INSTANCE;
            case 16:
                String str = (String) obj;
                InterfaceC4595e interfaceC4595e = (InterfaceC4595e) obj2;
                if (str.length() == 0) {
                    return interfaceC4595e.toString();
                }
                return str + ", " + interfaceC4595e;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                String str2 = (String) obj;
                InterfaceC15276e interfaceC15276e = (InterfaceC15276e) obj2;
                if (str2.length() == 0) {
                    return interfaceC15276e.toString();
                }
                return str2 + ", " + interfaceC15276e;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C8738e.ad(false, ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).ad.admob, AbstractC18007e.startapp(C0115e.f1276e, 61), c13770e2, 384);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e3, R.string.pref_about_header), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 20:
                C13770e c13770e4 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    AbstractC5647e.ad(AbstractC0181e.vip(), AbstractC5297e.appmetrica(c13770e4, R.string.talkback_back), null, 0L, c13770e4, 0, 12);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 21:
                C13770e c13770e5 = (C13770e) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 3) != 2)) {
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_share_outline_28, 0, c13770e5), AbstractC5297e.appmetrica(c13770e5, R.string.share), AbstractC18007e.startapp(C0115e.f1276e, 24), ((C0896e) c13770e5.adcel(AbstractC3577e.ad)).vip, c13770e5, 392, 0);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 22:
                C13770e c13770e6 = (C13770e) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 3) != 2)) {
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_text_tt_outline_24, 0, c13770e6), AbstractC5297e.appmetrica(c13770e6, R.string.now_playing_toolbox_lyrics), null, 0L, c13770e6, 8, 12);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 23:
                C13770e c13770e7 = (C13770e) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 3) != 2)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e7, R.string.hint_np3_fx), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e7, 0, 0, 262142);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C13770e c13770e8 = (C13770e) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 3) != 2)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e8, R.string.hint_np3_fx_text), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e8, 0, 0, 262142);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C13770e c13770e9 = (C13770e) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if (c13770e9.m3673protected(intValue9 & 1, (intValue9 & 3) != 2)) {
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_filter_28, 0, c13770e9), AbstractC5297e.appmetrica(c13770e9, R.string.eq3_title), null, 0L, c13770e9, 8, 12);
                } else {
                    c13770e9.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C13770e c13770e10 = (C13770e) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if (c13770e10.m3673protected(intValue10 & 1, (intValue10 & 3) != 2)) {
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_radiowaves_left_and_right_outline_28, 0, c13770e10), AbstractC5297e.appmetrica(c13770e10, R.string.hs_source_mix), null, 0L, c13770e10, 8, 12);
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C13770e c13770e11 = (C13770e) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if (c13770e11.m3673protected(intValue11 & 1, (intValue11 & 3) != 2)) {
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_list_play_outline_28, 0, c13770e11), AbstractC5297e.appmetrica(c13770e11, R.string.now_playing_toolbox_queue), null, 0L, c13770e11, 8, 12);
                } else {
                    c13770e11.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C13770e c13770e12 = (C13770e) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if (c13770e12.m3673protected(intValue12 & 1, (intValue12 & 3) != 2)) {
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_more, 0, c13770e12), AbstractC5297e.appmetrica(c13770e12, R.string.now_playing_toolbox_menu), null, 0L, c13770e12, 8, 12);
                } else {
                    c13770e12.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e13 = (C13770e) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if (c13770e13.m3673protected(intValue13 & 1, (intValue13 & 3) != 2)) {
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_qr_code_outline_28, 0, c13770e13), AbstractC5297e.appmetrica(c13770e13, R.string.scan_qr), null, 0L, c13770e13, 8, 12);
                } else {
                    c13770e13.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
