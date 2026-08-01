package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.net.SocketTimeoutException;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٌ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8580e implements Function3 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17401e;

    public /* synthetic */ C8580e(int i) {
        this.f17401e = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f17401e;
        C0115e c0115e = C0115e.f1276e;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    AbstractC17181e.appmetrica("meme_block_explicit", "По explicit-тегу", null, c13770e, 3126);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
                    Object m3681throw = c13770e2.m3681throw();
                    int i2 = 15;
                    if (m3681throw == C2987e.ad) {
                        m3681throw = new C13630e(i2);
                        c13770e2.m3682throws(m3681throw);
                    }
                    AbstractC16429e.ad(AbstractC2301e.metrica, AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), null, null, AbstractC2301e.license, null, null, 0.0f, 0.0f, c13770e2, 24582, 492);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                    AbstractC17181e.appmetrica("meme_block_legal_notices", "Скрывать \"метку качества\" на страницах исполнителей", null, c13770e3, 3126);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C13770e c13770e4 = (C13770e) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 17) != 16)) {
                    AbstractC17181e.appmetrica("meme_block_names", "в названии", null, c13770e4, 3126);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                C13770e c13770e5 = (C13770e) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 17) != 16)) {
                    AbstractC17181e.appmetrica("meme_block_art", "в названии исполнителей", null, c13770e5, 3126);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                C13770e c13770e6 = (C13770e) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 17) != 16)) {
                    AbstractC17181e.appmetrica("meme_block_alb", "в названии альбомов", null, c13770e6, 3126);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 6:
                C13770e c13770e7 = (C13770e) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 17) != 16)) {
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.player_play, 0, c13770e7), null, null, 0L, c13770e7, 56, 12);
                    AbstractC12534e.ad(c13770e7, AbstractC18007e.smaato(c0115e, 8));
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e7, R.string.mab_play), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, c13770e7, 0, 24576, 245758);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case 7:
                C13770e c13770e8 = (C13770e) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 17) != 16)) {
                    AbstractC6022e.ad(R.drawable.logo_vk_music_outline_24, 0, c13770e8);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case 8:
                C13770e c13770e9 = (C13770e) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                if (c13770e9.m3673protected(intValue9 & 1, (intValue9 & 17) != 16)) {
                    String appmetrica = AbstractC5297e.appmetrica(c13770e9, R.string.lvm_pref_desc);
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica, AbstractC12220e.advert(c0115e, 16, 12), ((C7019e) c13770e9.adcel(c15492e)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e9.adcel(c15492e)).vip.amazon, c13770e9, 48, 0, 131064);
                } else {
                    c13770e9.m3659default();
                }
                return Unit.INSTANCE;
            case 9:
                C13770e c13770e10 = (C13770e) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                if (c13770e10.m3673protected(intValue10 & 1, (intValue10 & 17) != 16)) {
                    AbstractC6022e.ad(R.drawable.history_backward_outline_28, 0, c13770e10);
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
            case 10:
                C13770e c13770e11 = (C13770e) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                if (c13770e11.m3673protected(intValue11 & 1, (intValue11 & 17) != 16)) {
                    AbstractC17181e.license("analytics_vk", R.string.analytics_vk, 0, true, false, null, c13770e11, 3078, 52);
                } else {
                    c13770e11.m3659default();
                }
                return Unit.INSTANCE;
            case 11:
                C13770e c13770e12 = (C13770e) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                if (c13770e12.m3673protected(intValue12 & 1, (intValue12 & 17) != 16)) {
                    String appmetrica2 = AbstractC5297e.appmetrica(c13770e12, R.string.external_vkrecomm_desc_full);
                    C15492e c15492e2 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica2, AbstractC12220e.advert(c0115e, 16, 12), ((C7019e) c13770e12.adcel(c15492e2)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e12.adcel(c15492e2)).vip.amazon, c13770e12, 48, 0, 131064);
                } else {
                    c13770e12.m3659default();
                }
                return Unit.INSTANCE;
            case 12:
                C13770e c13770e13 = (C13770e) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                if (c13770e13.m3673protected(intValue13 & 1, (intValue13 & 17) != 16)) {
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.player_play, 0, c13770e13), null, null, 0L, c13770e13, 56, 12);
                    AbstractC12534e.ad(c13770e13, AbstractC18007e.smaato(c0115e, 8));
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e13, R.string.mab_play), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, c13770e13, 0, 24576, 245758);
                } else {
                    c13770e13.m3659default();
                }
                return Unit.INSTANCE;
            case 13:
                C13770e c13770e14 = (C13770e) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                if (c13770e14.m3673protected(intValue14 & 1, (intValue14 & 17) != 16)) {
                    String appmetrica3 = AbstractC5297e.appmetrica(c13770e14, R.string.ota_card_beta);
                    C15492e c15492e3 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica3, AbstractC12220e.mopub(c0115e, 16), ((C7019e) c13770e14.adcel(c15492e3)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e14.adcel(c15492e3)).vip.mopub, c13770e14, 48, 0, 131064);
                } else {
                    c13770e14.m3659default();
                }
                return Unit.INSTANCE;
            case 14:
                C13770e c13770e15 = (C13770e) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                if (c13770e15.m3673protected(intValue15 & 1, (intValue15 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e15, R.string.ota_card_action_later), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e15, 0, 0, 262142);
                } else {
                    c13770e15.m3659default();
                }
                return Unit.INSTANCE;
            case 15:
                C13770e c13770e16 = (C13770e) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                if (c13770e16.m3673protected(intValue16 & 1, (intValue16 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e16, R.string.ota_card_action_update), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e16, 0, 0, 262142);
                } else {
                    c13770e16.m3659default();
                }
                return Unit.INSTANCE;
            case 16:
                C13770e c13770e17 = (C13770e) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                if (c13770e17.m3673protected(intValue17 & 1, (intValue17 & 17) != 16)) {
                    InterfaceC12864e mopub = AbstractC12220e.mopub(c0115e, 16);
                    C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(8), C5438e.f11668e, c13770e17, 54);
                    long j = c13770e17.f27286case;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e17.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e17, mopub);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e17.m3666import();
                    if (c13770e17.f27292implements) {
                        c13770e17.mopub(c7309e);
                    } else {
                        c13770e17.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e17, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e17, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e17, Integer.valueOf(i3), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e17, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e17, purchase, C2721e.license);
                    String appmetrica4 = AbstractC5297e.appmetrica(c13770e17, R.string.ota_card_failed_direct_link);
                    C15492e c15492e4 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica4, null, ((C7019e) c13770e17.adcel(c15492e4)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e17.adcel(c15492e4)).vip.mopub, c13770e17, 0, 0, 131066);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    AbstractC12534e.ad(c13770e17, new C5228e(1.0f, true));
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_link_outline_28, 0, c13770e17), null, null, ((C7019e) c13770e17.adcel(c15492e4)).ad.admob, c13770e17, 56, 4);
                    c13770e17.Signature(true);
                } else {
                    c13770e17.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C13770e c13770e18 = (C13770e) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                if (c13770e18.m3673protected(intValue18 & 1, (intValue18 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e18, R.string.ota_card_action_later), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e18, 0, 0, 262142);
                } else {
                    c13770e18.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C13770e c13770e19 = (C13770e) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                if (c13770e19.m3673protected(intValue19 & 1, (intValue19 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e19, R.string.ota_card_permission_gave), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e19, 0, 0, 262142);
                } else {
                    c13770e19.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C13770e c13770e20 = (C13770e) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                if (c13770e20.m3673protected(intValue20 & 1, (intValue20 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e20, R.string.ota_card_permission_gave), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e20, 0, 0, 262142);
                } else {
                    c13770e20.m3659default();
                }
                return Unit.INSTANCE;
            case 20:
                C13770e c13770e21 = (C13770e) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                if (c13770e21.m3673protected(intValue21 & 1, (intValue21 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e21, R.string.ota_card_permission_give), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e21, 0, 0, 262142);
                } else {
                    c13770e21.m3659default();
                }
                return Unit.INSTANCE;
            case 21:
                Throwable th = (Throwable) obj3;
                C8208e c8208e = AbstractC15698e.ad;
                Throwable purchase2 = AbstractC9262e.purchase(th);
                return Boolean.valueOf(((purchase2 instanceof AbstractC10822e) || (purchase2 instanceof C12694e) || (purchase2 instanceof SocketTimeoutException) || (th instanceof CancellationException)) ? false : true);
            case 22:
                int i4 = ((AbstractC16824e) obj3).billing().f6126e;
                return Boolean.valueOf(500 <= i4 && i4 < 600);
            case 23:
                ((Integer) obj2).intValue();
                ((Long) obj3).longValue();
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((Integer) obj3).getClass();
                AbstractC14430e.ad.invoke((C13770e) obj2, 0);
                return Unit.INSTANCE;
            default:
                ((C17985e) obj).vip();
                return Unit.INSTANCE;
        }
    }
}
