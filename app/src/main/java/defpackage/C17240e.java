package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۙۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17240e implements Function3 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33777e;

    public /* synthetic */ C17240e(int i) {
        this.f33777e = i;
    }

    private final Object ad(Object obj, Object obj2, Object obj3) {
        InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
        }
        if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
            InterfaceC12864e smaato = AbstractC12220e.smaato(AbstractC12220e.adcel(C0115e.f1276e, interfaceC12123e), 16, 0.0f, 2);
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(8), C5438e.f11672e, c13770e, 6);
            long j = c13770e.f27286case;
            int i = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, smaato);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            String appmetrica = AbstractC5297e.appmetrica(c13770e, R.string.cdcm_wizard_err_space);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC14489e.vip(appmetrica, null, ((C7019e) c13770e.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.appmetrica, c13770e, 0, 0, 131066);
            AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, R.string.cdcm_wizard_err_space_on_sender), null, ((C7019e) c13770e.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.mopub, c13770e, 0, 0, 131066);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f33777e) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    AbstractC8141e.vip(null, 0.0f, 0L, c13770e, 0, 7);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    C7947e.ad.getClass();
                    AbstractC17181e.yandex(C7947e.license, false, null, null, c13770e2, 0, 14);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                    AbstractC8141e.vip(null, 0.0f, 0L, c13770e3, 0, 7);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C13770e c13770e4 = (C13770e) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e4, R.string.cdcm_wizard_cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e4, 0, 0, 262142);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                C13770e c13770e5 = (C13770e) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e5, R.string.cdcm_wizard_next), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e5, 0, 0, 262142);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                C13770e c13770e6 = (C13770e) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 17) != 16)) {
                    String appmetrica = AbstractC5297e.appmetrica(c13770e6, R.string.cdcm_wizard_mode);
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica, null, ((C7019e) c13770e6.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e6.adcel(c15492e)).vip.appmetrica, c13770e6, 0, 0, 131066);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 6:
                C13770e c13770e7 = (C13770e) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 17) != 16)) {
                    String appmetrica2 = AbstractC5297e.appmetrica(c13770e7, R.string.cdcm_wizard_intro_important_acc);
                    C15492e c15492e2 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica2, null, ((C7019e) c13770e7.adcel(c15492e2)).ad.admob, 0L, null, C1812e.f4891e, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e7.adcel(c15492e2)).vip.mopub, c13770e7, 1572864, 0, 131002);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case 7:
                C13770e c13770e8 = (C13770e) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 17) != 16)) {
                    String appmetrica3 = AbstractC5297e.appmetrica(c13770e8, R.string.cdcm_wizard_intro_important_rem);
                    C15492e c15492e3 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica3, null, ((C7019e) c13770e8.adcel(c15492e3)).ad.admob, 0L, null, C1812e.f4891e, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e8.adcel(c15492e3)).vip.mopub, c13770e8, 1572864, 0, 131002);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case 8:
                C13770e c13770e9 = (C13770e) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                if (c13770e9.m3673protected(intValue9 & 1, (intValue9 & 17) != 16)) {
                    String appmetrica4 = AbstractC5297e.appmetrica(c13770e9, R.string.cdcm_wizard_intro_important_eta);
                    C15492e c15492e4 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica4, null, ((C7019e) c13770e9.adcel(c15492e4)).ad.admob, 0L, null, C1812e.f4891e, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e9.adcel(c15492e4)).vip.mopub, c13770e9, 1572864, 0, 131002);
                } else {
                    c13770e9.m3659default();
                }
                return Unit.INSTANCE;
            case 9:
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                C13770e c13770e10 = (C13770e) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= c13770e10.purchase(interfaceC12123e) ? 4 : 2;
                }
                if (c13770e10.m3673protected(intValue10 & 1, (intValue10 & 19) != 18)) {
                    C13964e billing = AbstractC16497e.billing(8);
                    InterfaceC12864e smaato = AbstractC12220e.smaato(C0115e.f1276e, 16, 0.0f, 2);
                    Object m3681throw = c13770e10.m3681throw();
                    if (m3681throw == C2987e.ad) {
                        m3681throw = new C2894e(13);
                        c13770e10.m3682throws(m3681throw);
                    }
                    AbstractC7023e.ad(smaato, null, interfaceC12123e, billing, null, null, false, null, (Function1) m3681throw, c13770e10, ((intValue10 << 6) & 896) | 805330950, 490);
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
            case 10:
                C13770e c13770e11 = (C13770e) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                if (c13770e11.m3673protected(intValue11 & 1, (intValue11 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e11, R.string.cdcm_wizard_cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e11, 0, 0, 262142);
                } else {
                    c13770e11.m3659default();
                }
                return Unit.INSTANCE;
            case 11:
                C13770e c13770e12 = (C13770e) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                if (c13770e12.m3673protected(intValue12 & 1, (intValue12 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e12, R.string.cdcm_wizard_next), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e12, 0, 0, 262142);
                } else {
                    c13770e12.m3659default();
                }
                return Unit.INSTANCE;
            case 12:
                C13770e c13770e13 = (C13770e) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                if (c13770e13.m3673protected(intValue13 & 1, (intValue13 & 17) != 16)) {
                    String appmetrica5 = AbstractC5297e.appmetrica(c13770e13, R.string.cdcm_wizard_intro);
                    C15492e c15492e5 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica5, null, ((C7019e) c13770e13.adcel(c15492e5)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e13.adcel(c15492e5)).vip.appmetrica, c13770e13, 0, 0, 131066);
                } else {
                    c13770e13.m3659default();
                }
                return Unit.INSTANCE;
            case 13:
                C13770e c13770e14 = (C13770e) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                if (c13770e14.m3673protected(intValue14 & 1, (intValue14 & 17) != 16)) {
                    String appmetrica6 = AbstractC5297e.appmetrica(c13770e14, R.string.cdcm_wizard_intro_text);
                    C15492e c15492e6 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica6, null, ((C7019e) c13770e14.adcel(c15492e6)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e14.adcel(c15492e6)).vip.mopub, c13770e14, 0, 0, 131066);
                } else {
                    c13770e14.m3659default();
                }
                return Unit.INSTANCE;
            case 14:
                C13770e c13770e15 = (C13770e) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                if (c13770e15.m3673protected(intValue15 & 1, (intValue15 & 17) != 16)) {
                    String appmetrica7 = AbstractC5297e.appmetrica(c13770e15, R.string.cdcm_wizard_intro_important);
                    C15492e c15492e7 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica7, null, ((C7019e) c13770e15.adcel(c15492e7)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e15.adcel(c15492e7)).vip.amazon, c13770e15, 0, 0, 131066);
                } else {
                    c13770e15.m3659default();
                }
                return Unit.INSTANCE;
            case 15:
                C13770e c13770e16 = (C13770e) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                if (c13770e16.m3673protected(intValue16 & 1, (intValue16 & 17) != 16)) {
                    String appmetrica8 = AbstractC5297e.appmetrica(c13770e16, R.string.cdcm_wizard_intro_important_gms);
                    C15492e c15492e8 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica8, null, ((C7019e) c13770e16.adcel(c15492e8)).ad.admob, 0L, null, C1812e.f4891e, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e16.adcel(c15492e8)).vip.mopub, c13770e16, 1572864, 0, 131002);
                } else {
                    c13770e16.m3659default();
                }
                return Unit.INSTANCE;
            case 16:
                C13770e c13770e17 = (C13770e) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                if (c13770e17.m3673protected(intValue17 & 1, (intValue17 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e17, R.string.cdcm_wizard_cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e17, 0, 0, 262142);
                } else {
                    c13770e17.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C13770e c13770e18 = (C13770e) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                if (c13770e18.m3673protected(intValue18 & 1, (intValue18 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e18, R.string.cdcm_wizard_next), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e18, 0, 0, 262142);
                } else {
                    c13770e18.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C13770e c13770e19 = (C13770e) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                if (c13770e19.m3673protected(intValue19 & 1, (intValue19 & 17) != 16)) {
                    String appmetrica9 = AbstractC5297e.appmetrica(c13770e19, R.string.cdcm_wizard_prereq_gms);
                    C15492e c15492e9 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica9, AbstractC12220e.smaato(C0115e.f1276e, 16, 0.0f, 2), ((C7019e) c13770e19.adcel(c15492e9)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e19.adcel(c15492e9)).vip.appmetrica, c13770e19, 48, 0, 131064);
                } else {
                    c13770e19.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C13770e c13770e20 = (C13770e) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                if (c13770e20.m3673protected(intValue20 & 1, (intValue20 & 17) != 16)) {
                    String appmetrica10 = AbstractC5297e.appmetrica(c13770e20, R.string.cdcm_wizard_prereq_permissions);
                    C15492e c15492e10 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica10, AbstractC12220e.smaato(C0115e.f1276e, 16, 0.0f, 2), ((C7019e) c13770e20.adcel(c15492e10)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e20.adcel(c15492e10)).vip.appmetrica, c13770e20, 48, 0, 131064);
                } else {
                    c13770e20.m3659default();
                }
                return Unit.INSTANCE;
            case 20:
                C13770e c13770e21 = (C13770e) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                if (c13770e21.m3673protected(intValue21 & 1, (intValue21 & 17) != 16)) {
                    String appmetrica11 = AbstractC5297e.appmetrica(c13770e21, R.string.cdcm_wizard_prereq_permissions_privacy);
                    C15492e c15492e11 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica11, AbstractC12220e.smaato(C0115e.f1276e, 16, 0.0f, 2), ((C7019e) c13770e21.adcel(c15492e11)).ad.admob, 0L, null, C1812e.f4891e, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e21.adcel(c15492e11)).vip.mopub, c13770e21, 1572912, 0, 131000);
                } else {
                    c13770e21.m3659default();
                }
                return Unit.INSTANCE;
            case 21:
                C13770e c13770e22 = (C13770e) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                if (c13770e22.m3673protected(intValue22 & 1, (intValue22 & 17) != 16)) {
                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e22, 0);
                    long j = c13770e22.f27286case;
                    int i = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e22.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e22, C0115e.f1276e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e22.m3666import();
                    if (c13770e22.f27292implements) {
                        c13770e22.mopub(c7309e);
                    } else {
                        c13770e22.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e22, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e22, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e22, Integer.valueOf(i), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e22, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e22, purchase, C2721e.license);
                    AbstractC16429e.ad(AbstractC5209e.yandex, null, null, AbstractC5209e.startapp, null, null, null, 0.0f, 0.0f, c13770e22, 3078, 502);
                    AbstractC16429e.ad(AbstractC5209e.adcel, null, null, AbstractC5209e.mopub, null, null, null, 0.0f, 0.0f, c13770e22, 3078, 502);
                    c13770e22.Signature(true);
                } else {
                    c13770e22.m3659default();
                }
                return Unit.INSTANCE;
            case 22:
                C13770e c13770e23 = (C13770e) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                if (c13770e23.m3673protected(intValue23 & 1, (intValue23 & 17) != 16)) {
                    String appmetrica12 = AbstractC5297e.appmetrica(c13770e23, R.string.cdcm_wizard_prereq_permissions_text_os);
                    C15492e c15492e12 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica12, AbstractC12220e.smaato(C0115e.f1276e, 16, 0.0f, 2), ((C7019e) c13770e23.adcel(c15492e12)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e23.adcel(c15492e12)).vip.mopub, c13770e23, 48, 0, 131064);
                } else {
                    c13770e23.m3659default();
                }
                return Unit.INSTANCE;
            case 23:
                C13770e c13770e24 = (C13770e) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                if (c13770e24.m3673protected(intValue24 & 1, (intValue24 & 17) != 16)) {
                    C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e24, 0);
                    long j2 = c13770e24.f27286case;
                    int i2 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert2 = c13770e24.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e24, C0115e.f1276e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e2 = C2721e.vip;
                    c13770e24.m3666import();
                    if (c13770e24.f27292implements) {
                        c13770e24.mopub(c7309e2);
                    } else {
                        c13770e24.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e24, ad2, C2721e.billing);
                    AbstractC2270e.yandex(c13770e24, advert2, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e24, Integer.valueOf(i2), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e24, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e24, purchase2, C2721e.license);
                    AbstractC16429e.ad(AbstractC5209e.amazon, null, null, AbstractC5209e.loadAd, null, null, null, 0.0f, 0.0f, c13770e24, 3078, 502);
                    AbstractC16429e.ad(AbstractC5209e.Signature, null, null, AbstractC5209e.admob, null, null, null, 0.0f, 0.0f, c13770e24, 3078, 502);
                    c13770e24.Signature(true);
                } else {
                    c13770e24.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C13770e c13770e25 = (C13770e) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                if (c13770e25.m3673protected(intValue25 & 1, (intValue25 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e25, R.string.cdcm_wizard_finish), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e25, 0, 0, 262142);
                } else {
                    c13770e25.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C13770e c13770e26 = (C13770e) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                if (c13770e26.m3673protected(intValue26 & 1, (intValue26 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e26, R.string.cdcm_wizard_finish), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e26, 0, 0, 262142);
                } else {
                    c13770e26.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C13770e c13770e27 = (C13770e) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                if (c13770e27.m3673protected(intValue27 & 1, (intValue27 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e27, R.string.cdcm_wizard_finish), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e27, 0, 0, 262142);
                } else {
                    c13770e27.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ad(obj, obj2, obj3);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C13770e c13770e28 = (C13770e) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                if (c13770e28.m3673protected(intValue28 & 1, (intValue28 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e28, R.string.cdcm_wizard_finish), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e28, 0, 0, 262142);
                } else {
                    c13770e28.m3659default();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC12123e interfaceC12123e2 = (InterfaceC12123e) obj;
                C13770e c13770e29 = (C13770e) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                if ((intValue29 & 6) == 0) {
                    intValue29 |= c13770e29.purchase(interfaceC12123e2) ? 4 : 2;
                }
                if (c13770e29.m3673protected(intValue29 & 1, (intValue29 & 19) != 18)) {
                    InterfaceC12864e smaato2 = AbstractC12220e.smaato(AbstractC12220e.adcel(C0115e.f1276e, interfaceC12123e2), 16, 0.0f, 2);
                    C4789e ad3 = AbstractC14801e.ad(AbstractC16497e.billing(8), C5438e.f11672e, c13770e29, 6);
                    long j3 = c13770e29.f27286case;
                    int i3 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert3 = c13770e29.advert();
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e29, smaato2);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e3 = C2721e.vip;
                    c13770e29.m3666import();
                    if (c13770e29.f27292implements) {
                        c13770e29.mopub(c7309e3);
                    } else {
                        c13770e29.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e29, ad3, C2721e.billing);
                    AbstractC2270e.yandex(c13770e29, advert3, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e29, Integer.valueOf(i3), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e29, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e29, purchase3, C2721e.license);
                    String appmetrica13 = AbstractC5297e.appmetrica(c13770e29, R.string.cdcm_wizard_complete);
                    C15492e c15492e13 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica13, null, ((C7019e) c13770e29.adcel(c15492e13)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e29.adcel(c15492e13)).vip.appmetrica, c13770e29, 0, 0, 131066);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e29, R.string.cdcm_wizard_complete_on_sender), null, ((C7019e) c13770e29.adcel(c15492e13)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e29.adcel(c15492e13)).vip.mopub, c13770e29, 0, 0, 131066);
                    c13770e29.Signature(true);
                } else {
                    c13770e29.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
