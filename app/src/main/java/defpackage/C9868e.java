package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۤؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9868e implements Function3 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19474e;

    public /* synthetic */ C9868e(int i) {
        this.f19474e = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f19474e;
        C5100e c5100e = AbstractC10432e.ad;
        C14486e c14486e = C14486e.ad;
        C9139e c9139e = C9139e.f18290e;
        int i2 = 6;
        C0115e c0115e = C0115e.f1276e;
        switch (i) {
            case 0:
                C0283e c0283e = (C0283e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(c0283e) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    InterfaceC12864e premium = c0283e.ad(c0115e, C5438e.f11678e).premium(AbstractC18007e.vip);
                    C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(16), C5438e.f11668e, c13770e, 54);
                    long j = c13770e.f27286case;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, premium);
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
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    AbstractC15077e.ad(6, c13770e, false);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_arrow_right_outline_28, 0, c13770e), null, AbstractC12220e.mopub(AbstractC18007e.startapp(c0115e, 56), 10), ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.remoteconfig, c13770e, 440, 0);
                    AbstractC15077e.ad(6, c13770e, true);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC8461e.ad((C14542e) obj, null, AbstractC18007e.metrica, C16477e.ad, null, (C13770e) obj2, (((Integer) obj3).intValue() & 14) | 1573296, 1976);
                return Unit.INSTANCE;
            case 2:
                C10983e c10983e = (C10983e) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c13770e2.purchase(c10983e) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 19) != 18)) {
                    AbstractC16268e.vip(c10983e.vip, AbstractC18007e.metrica, c13770e2, 25008, 232);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C0283e c0283e2 = (C0283e) obj;
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= c13770e3.purchase(c0283e2) ? 4 : 2;
                }
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 19) != 18)) {
                    InterfaceC12864e premium2 = c0283e2.ad(c0115e, C5438e.f11678e).premium(AbstractC18007e.vip);
                    C8587e ad2 = AbstractC6451e.ad(AbstractC16497e.billing(16), C5438e.f11668e, c13770e3, 54);
                    long j2 = c13770e3.f27286case;
                    int i4 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert2 = c13770e3.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e3, premium2);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e2 = C2721e.vip;
                    c13770e3.m3666import();
                    if (c13770e3.f27292implements) {
                        c13770e3.mopub(c7309e2);
                    } else {
                        c13770e3.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e3, ad2, C2721e.billing);
                    AbstractC2270e.yandex(c13770e3, advert2, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e3, Integer.valueOf(i4), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e3, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e3, purchase2, C2721e.license);
                    AbstractC10727e metrica = AbstractC12475e.metrica(R.drawable.ic_globe_outline_28, 0, c13770e3);
                    C15492e c15492e = AbstractC11785e.ad;
                    float f = 72;
                    float f2 = 10;
                    AbstractC5647e.vip(metrica, null, AbstractC12220e.mopub(AbstractC18007e.startapp(c0115e, f), f2), ((C7019e) c13770e3.adcel(c15492e)).ad.admob, c13770e3, 440, 0);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_arrow_right_outline_28, 0, c13770e3), null, AbstractC12220e.mopub(AbstractC18007e.startapp(c0115e, 56), f2), ((C7019e) c13770e3.adcel(c15492e)).ad.remoteconfig, c13770e3, 440, 0);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_globe_outline_28, 0, c13770e3), null, AbstractC12220e.mopub(AbstractC18007e.startapp(AbstractC16136e.metrica(AbstractC12447e.vip(AbstractC12220e.mopub(c0115e, f2), ((C7019e) c13770e3.adcel(c15492e)).metrica.metrica), C3618e.vip(0.25f, ((C7019e) c13770e3.adcel(c15492e)).ad.ad), c5100e), f), f2), ((C7019e) c13770e3.adcel(c15492e)).ad.ad, c13770e3, 56, 0);
                    c13770e3.Signature(true);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                C13770e c13770e4 = (C13770e) obj2;
                ((Integer) obj3).getClass();
                AbstractC17074e.ad(AbstractC16136e.metrica(AbstractC18007e.metrica, ((C6032e) c13770e4.adcel(AbstractC12491e.ad)).license(), c5100e), c13770e4, 0);
                return Unit.INSTANCE;
            case 5:
                C13770e c13770e5 = (C13770e) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (c13770e5.m3673protected(intValue4 & 1, (intValue4 & 17) != 16)) {
                    C7913e c7913e = AbstractC18007e.metrica;
                    InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
                    long j3 = c13770e5.f27286case;
                    int i5 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert3 = c13770e5.advert();
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e5, c7913e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e3 = C2721e.vip;
                    c13770e5.m3666import();
                    if (c13770e5.f27292implements) {
                        c13770e5.mopub(c7309e3);
                    } else {
                        c13770e5.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e5, license, C2721e.billing);
                    AbstractC2270e.yandex(c13770e5, advert3, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e5, Integer.valueOf(i5), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e5, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e5, purchase3, C2721e.license);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_shuffle_outline_28, 0, c13770e5), null, c14486e.ad(c0115e, C5438e.f11700e), 0L, c13770e5, 56, 8);
                    c13770e5.Signature(true);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 6:
                C13770e c13770e6 = (C13770e) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if (c13770e6.m3673protected(intValue5 & 1, (intValue5 & 17) != 16)) {
                    C7913e c7913e2 = AbstractC18007e.metrica;
                    InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j4 = c13770e6.f27286case;
                    int i6 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC3483e advert4 = c13770e6.advert();
                    InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e6, c7913e2);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e4 = C2721e.vip;
                    c13770e6.m3666import();
                    if (c13770e6.f27292implements) {
                        c13770e6.mopub(c7309e4);
                    } else {
                        c13770e6.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e6, license2, C2721e.billing);
                    AbstractC2270e.yandex(c13770e6, advert4, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e6, Integer.valueOf(i6), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e6, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e6, purchase4, C2721e.license);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_sync_outline_28, 0, c13770e6), null, c14486e.ad(c0115e, C5438e.f11700e), 0L, c13770e6, 56, 8);
                    c13770e6.Signature(true);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj3).getClass();
                ((InterfaceC7860e) ((C1631e) obj).vip).ad(AbstractC18007e.metrica, (C13770e) obj2, 6);
                return Unit.INSTANCE;
            case 8:
                InterfaceC13158e interfaceC13158e = (InterfaceC13158e) obj;
                int mo493e = interfaceC13158e.mo493e(AbstractC16357e.ad);
                int i7 = mo493e * 2;
                AbstractC2832e admob = ((InterfaceC16719e) obj2).admob(AbstractC2278e.startapp(i7, ((C5602e) obj3).ad, 0));
                return interfaceC13158e.ads(admob.f6806e - i7, admob.f6804e, c9139e, new C14669e(admob, mo493e, 0));
            case 9:
                InterfaceC13158e interfaceC13158e2 = (InterfaceC13158e) obj;
                int mo493e2 = interfaceC13158e2.mo493e(AbstractC16357e.vip);
                int i8 = mo493e2 * 2;
                AbstractC2832e admob2 = ((InterfaceC16719e) obj2).admob(AbstractC2278e.startapp(0, ((C5602e) obj3).ad, i8));
                return interfaceC13158e2.ads(admob2.f6806e, admob2.f6804e - i8, c9139e, new C14669e(admob2, mo493e2, 1));
            case 10:
                AbstractC2832e admob3 = ((InterfaceC16719e) obj2).admob(((C5602e) obj3).ad);
                return ((InterfaceC13158e) obj).mo500public(admob3.f6806e, admob3.f6804e, C9139e.f18290e, new C17014e(i2), new C4889e(admob3, 2));
            case 11:
                C17706e c17706e = ((C17927e) obj).vip;
                C8181e c8181e = ((C11028e) obj2).ad;
                C8181e c8181e2 = ((C11028e) obj3).ad;
                return Unit.INSTANCE;
            case 12:
                ((C2575e) obj).vip.invoke(((C2157e) obj2).ad, ((C2157e) obj3).ad);
                return Unit.INSTANCE;
            case 13:
                C9055e c9055e = (C9055e) obj;
                C13770e c13770e7 = (C13770e) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                C2892e c2892e = AbstractC17864e.license;
                C12502e c12502e = AbstractC10536e.metrica;
                C15492e c15492e2 = AbstractC3577e.ad;
                long j5 = ((C0896e) c13770e7.adcel(c15492e2)).ad;
                C13797e c13797e = new C13797e(AbstractC6532e.m2193extends(j5));
                double metrica2 = AbstractC11866e.metrica(c13797e.license, 3.0f);
                Double valueOf = Double.valueOf(metrica2);
                if (metrica2 <= -1.0d) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int adcel = AbstractC5190e.adcel(c13797e.vip, c13797e.metrica, valueOf.doubleValue());
                    new C13797e(adcel);
                    j5 = AbstractC6532e.vip(adcel);
                }
                long j6 = ((C0896e) c13770e7.adcel(c15492e2)).vip;
                long j7 = ((C0896e) c13770e7.adcel(c15492e2)).ad;
                long j8 = C3618e.adcel;
                C9553e c9553e = ((C7019e) c13770e7.adcel(AbstractC11785e.ad)).ad;
                C14460e c14460e = c9553e.f18930e;
                if (c14460e == null) {
                    float f3 = AbstractC10717e.ad;
                    c14460e = new C14460e(AbstractC7893e.license(c9553e, 37), AbstractC7893e.license(c9553e, AbstractC10717e.appmetrica), AbstractC7893e.license(c9553e, AbstractC10717e.metrica), AbstractC7893e.license(c9553e, 26));
                    c9553e.f18930e = c14460e;
                }
                if (j5 == 16) {
                    j5 = c14460e.ad;
                }
                long j9 = j5;
                if (j6 == 16) {
                    j6 = c14460e.vip;
                }
                long j10 = j6;
                if (j7 == 16) {
                    j7 = c14460e.metrica;
                }
                long j11 = j7;
                if (j8 == 16) {
                    j8 = c14460e.license;
                }
                AbstractC2241e.vip(c9055e, null, c2892e, c12502e, 0.0f, null, new C14460e(j9, j10, j11, j8), 0.0f, 0.0f, c13770e7, (intValue6 & 14) | 384);
                return Unit.INSTANCE;
            case 14:
                C13770e c13770e8 = (C13770e) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                if (c13770e8.m3673protected(intValue7 & 1, (intValue7 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e8, R.string.hint), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e8, 0, 0, 262142);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case 15:
                C13770e c13770e9 = (C13770e) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if (c13770e9.m3673protected(intValue8 & 1, (intValue8 & 17) != 16)) {
                    AbstractC6022e.ad(R.drawable.ic_car_outline_28, 0, c13770e9);
                } else {
                    c13770e9.m3659default();
                }
                return Unit.INSTANCE;
            case 16:
                C13770e c13770e10 = (C13770e) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                if (c13770e10.m3673protected(intValue9 & 1, (intValue9 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e10, R.string.android_auto_setup_start), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e10, 0, 0, 262142);
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C13770e c13770e11 = (C13770e) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                if (c13770e11.m3673protected(intValue10 & 1, (intValue10 & 17) != 16)) {
                    AbstractC8141e.vip(null, 0.0f, 0L, c13770e11, 0, 7);
                } else {
                    c13770e11.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C13770e c13770e12 = (C13770e) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                if (!c13770e12.m3673protected(intValue11 & 1, (intValue11 & 17) != 16)) {
                    c13770e12.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C13770e c13770e13 = (C13770e) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                if (!c13770e13.m3673protected(intValue12 & 1, (intValue12 & 17) != 16)) {
                    c13770e13.m3659default();
                }
                return Unit.INSTANCE;
            case 20:
                C13770e c13770e14 = (C13770e) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                if (!c13770e14.m3673protected(intValue13 & 1, (intValue13 & 17) != 16)) {
                    c13770e14.m3659default();
                }
                return Unit.INSTANCE;
            case 21:
                C13770e c13770e15 = (C13770e) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                if (c13770e15.m3673protected(intValue14 & 1, (intValue14 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e15, R.string.eq3_float_set), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e15, 0, 0, 262142);
                } else {
                    c13770e15.m3659default();
                }
                return Unit.INSTANCE;
            case 22:
                C13770e c13770e16 = (C13770e) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                if (c13770e16.m3673protected(intValue15 & 1, (intValue15 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e16, R.string.settings_appearance_dpi_override), AbstractC12220e.advert(c0115e, 16, 12), ((C7019e) c13770e16.adcel(AbstractC11785e.ad)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e16, 48, 0, 262136);
                } else {
                    c13770e16.m3659default();
                }
                return Unit.INSTANCE;
            case 23:
                C13770e c13770e17 = (C13770e) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                if (c13770e17.m3673protected(intValue16 & 1, (intValue16 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e17, R.string.eq3_float_cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e17, 0, 0, 262142);
                } else {
                    c13770e17.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C13770e c13770e18 = (C13770e) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                if (c13770e18.m3673protected(intValue17 & 1, (intValue17 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e18, R.string.launch_category), AbstractC12220e.advert(c0115e, 16, 12), ((C7019e) c13770e18.adcel(AbstractC11785e.ad)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e18, 48, 0, 262136);
                } else {
                    c13770e18.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C13770e c13770e19 = (C13770e) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                if (c13770e19.m3673protected(intValue18 & 1, (intValue18 & 17) != 16)) {
                    AbstractC17181e.license("startup_orbit", R.string.launch_category_orbit, 0, false, false, null, c13770e19, 3078, 52);
                } else {
                    c13770e19.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C13770e c13770e20 = (C13770e) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                if (c13770e20.m3673protected(intValue19 & 1, (intValue19 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e20, R.string.misc), AbstractC12220e.advert(c0115e, 16, 12), ((C7019e) c13770e20.adcel(AbstractC11785e.ad)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e20, 48, 0, 262136);
                } else {
                    c13770e20.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C13770e c13770e21 = (C13770e) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                if (c13770e21.m3673protected(intValue20 & 1, (intValue20 & 17) != 16)) {
                    AbstractC17181e.license("animreduce_nav", R.string.animreduce_section_nav, 0, false, false, null, c13770e21, 3078, 52);
                } else {
                    c13770e21.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C13770e c13770e22 = (C13770e) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                if (c13770e22.m3673protected(intValue21 & 1, (intValue21 & 17) != 16)) {
                    AbstractC17181e.license("interface_fullnumbers", R.string.st_fn, R.string.st_fn_desc, false, false, null, c13770e22, 3078, 48);
                } else {
                    c13770e22.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e23 = (C13770e) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                if (c13770e23.m3673protected(intValue22 & 1, (intValue22 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e23, R.string.cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e23, 0, 0, 262142);
                } else {
                    c13770e23.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
