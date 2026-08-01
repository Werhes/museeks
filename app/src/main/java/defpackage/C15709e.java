package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۚٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15709e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f30949e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f30950e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30951e;

    public /* synthetic */ C15709e(Object obj, Object obj2, int i) {
        this.f30951e = i;
        this.f30950e = obj;
        this.f30949e = obj2;
    }

    public /* synthetic */ C15709e(Object obj, Object obj2, int i, int i2) {
        this.f30951e = i2;
        this.f30950e = obj;
        this.f30949e = obj2;
    }

    public /* synthetic */ C15709e(ArrayList arrayList, C7222e c7222e, C7222e c7222e2) {
        this.f30951e = 2;
        this.f30950e = arrayList;
        this.f30949e = c7222e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        char c;
        int i = this.f30951e;
        Object obj3 = null;
        C5170e c5170e = C2987e.ad;
        C5100e c5100e = AbstractC10432e.ad;
        C0115e c0115e = C0115e.f1276e;
        Object obj4 = this.f30949e;
        Object obj5 = this.f30950e;
        switch (i) {
            case 0:
                InterfaceC2566e interfaceC2566e = (InterfaceC2566e) obj5;
                C5769e c5769e = (C5769e) obj4;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C16005e c16005e = AbstractC9083e.ad;
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC13281e.metrica, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e.adcel(c15492e)).ad.Signature, c5100e), null, AbstractC16653e.license(-775501753, new C14221e(c5769e, 3, false ? (byte) 1 : (byte) 0), c13770e), null, null, 0.0f, 0.0f, null, AbstractC9083e.license(((C7019e) c13770e.adcel(c15492e)).ad.Signature, ((C7019e) c13770e.adcel(c15492e)).ad.subscription, 0L, c13770e, 28), interfaceC2566e, c13770e, 3078, 500);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC18271e.ad((C13126e) obj5, (Function1) obj4, (C13770e) obj, AbstractC5190e.advert(9));
                return Unit.INSTANCE;
            case 2:
                ArrayList arrayList = (ArrayList) obj5;
                C7222e c7222e = (C7222e) obj4;
                InterfaceC16120e interfaceC16120e = (InterfaceC16120e) obj;
                DynamicMutableRealmObject dynamicMutableRealmObject = (DynamicMutableRealmObject) obj2;
                C12232e c12232e = AbstractC3820e.ad;
                if (((Boolean) interfaceC16120e.admob(c12232e.vip(Boolean.class), "isPlaylist")).booleanValue()) {
                    arrayList.add(interfaceC16120e);
                    if (dynamicMutableRealmObject != null) {
                        AbstractC12322e.ad(dynamicMutableRealmObject).appmetrica();
                    }
                } else {
                    if (dynamicMutableRealmObject != null) {
                        long longValue = ((Number) interfaceC16120e.admob(c12232e.vip(Long.class), "id")).longValue();
                        long longValue2 = ((Number) interfaceC16120e.admob(c12232e.vip(Long.class), "ownerId")).longValue();
                        String str = (String) interfaceC16120e.ads(c12232e.vip(String.class), "title");
                        if (str == null) {
                            str = BuildConfig.FLAVOR;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(longValue2);
                        c = 0;
                        sb.append('_');
                        sb.append(longValue);
                        Object sb2 = sb.toString();
                        dynamicMutableRealmObject.smaato(sb2, "uid");
                        dynamicMutableRealmObject.smaato(Long.valueOf(longValue), "id");
                        dynamicMutableRealmObject.smaato(Long.valueOf(longValue2), "ownerId");
                        dynamicMutableRealmObject.smaato(interfaceC16120e.ads(c12232e.vip(String.class), "accessKey"), "accessKey");
                        dynamicMutableRealmObject.smaato(str, "title");
                        dynamicMutableRealmObject.smaato(str.toLowerCase(Locale.ROOT), "localizedSearchTitle");
                        dynamicMutableRealmObject.smaato(C13759e.ad(interfaceC16120e), "thumb");
                        obj3 = sb2;
                    } else {
                        c = 0;
                    }
                    Object[] objArr = new Object[1];
                    objArr[c] = obj3;
                    if (c7222e.m2267e("CachedAlbum", "uid == $0", objArr).license().ad() != null && dynamicMutableRealmObject != null) {
                        AbstractC12322e.ad(dynamicMutableRealmObject).appmetrica();
                    }
                }
                return Unit.INSTANCE;
            case 3:
                InterfaceC2566e interfaceC2566e2 = (InterfaceC2566e) obj5;
                C14197e c14197e = (C14197e) obj4;
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e2, 0);
                    long j = c13770e2.f27286case;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e2.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e2, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e2, Integer.valueOf(i2), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
                    C16005e c16005e2 = AbstractC9083e.ad;
                    AbstractC10560e.vip(AbstractC0181e.ad, AbstractC16136e.metrica(c0115e, AbstractC0903e.license(c13770e2).Signature, c5100e), AbstractC0181e.vip, AbstractC16653e.license(-893026331, new C6258e(c14197e), c13770e2), null, null, 0.0f, 0.0f, ((C0916e) c13770e2.adcel(AbstractC12450e.ad)).appmetrica(c13770e2), AbstractC9083e.license(AbstractC0903e.license(c13770e2).Signature, AbstractC0903e.license(c13770e2).subscription, 0L, c13770e2, 28), interfaceC2566e2, c13770e2, 3462, 240);
                    InterfaceC3314e license = AbstractC4628e.license(c14197e.f28053e, c13770e2, 0);
                    long j2 = AbstractC0903e.license(c13770e2).Signature;
                    long j3 = AbstractC0903e.license(c13770e2).subscription;
                    C13789e c13789e = AbstractC5616e.metrica;
                    long isVip = AbstractC6532e.isVip(j2, j3, c13789e.ad(interfaceC2566e2.getState().ad()));
                    long isVip2 = AbstractC6532e.isVip(AbstractC0903e.license(c13770e2).subscription, AbstractC0903e.license(c13770e2).Signature, c13789e.ad(interfaceC2566e2.getState().ad()));
                    String str2 = (String) license.getValue();
                    boolean yandex = c13770e2.yandex(c14197e);
                    Object m3681throw = c13770e2.m3681throw();
                    if (yandex || m3681throw == c5170e) {
                        m3681throw = new C1990e(c14197e, 1);
                        c13770e2.m3682throws(m3681throw);
                    }
                    float f = 16;
                    AbstractC1660e.appmetrica(str2, (Function1) m3681throw, null, AbstractC16136e.metrica(AbstractC12447e.vip(AbstractC18007e.metrica(AbstractC12220e.loadAd(AbstractC12220e.smaato(AbstractC16136e.metrica(c0115e, isVip, c5100e), f, 0.0f, 2), 0.0f, 0.0f, 0.0f, f, 7), 1.0f), AbstractC0903e.purchase(c13770e2).metrica), isVip2, c5100e), null, AbstractC0181e.license, AbstractC0181e.appmetrica, AbstractC16653e.license(1681394188, new C15709e(c14197e, license, 4), c13770e2), null, null, c13770e2, 14352384, 788);
                    c13770e2.Signature(true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                C14197e c14197e2 = (C14197e) obj5;
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj4;
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (((String) interfaceC3314e.getValue()).length() > 0) {
                        c13770e3.m3676strictfp(-1789258181);
                        AbstractC10727e metrica = AbstractC12475e.metrica(R.drawable.ic_cancel_outline_28, 0, c13770e3);
                        InterfaceC12864e startapp = AbstractC18007e.startapp(c0115e, 20);
                        boolean yandex2 = c13770e3.yandex(c14197e2);
                        Object m3681throw2 = c13770e3.m3681throw();
                        if (yandex2 || m3681throw2 == c5170e) {
                            m3681throw2 = new C13465e(18, c14197e2);
                            c13770e3.m3682throws(m3681throw2);
                        }
                        AbstractC5647e.vip(metrica, null, AbstractC9546e.license(startapp, false, null, (Function0) m3681throw2, 15), 0L, c13770e3, 56, 8);
                    } else {
                        c13770e3.m3676strictfp(-1800255338);
                    }
                    c13770e3.Signature(false);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                InterfaceC2566e interfaceC2566e3 = (InterfaceC2566e) obj5;
                C9518e c9518e = (C9518e) obj4;
                C13770e c13770e4 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    C16005e c16005e3 = AbstractC9083e.ad;
                    C15492e c15492e2 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC8749e.yandex, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e4.adcel(c15492e2)).ad.Signature, c5100e), null, AbstractC16653e.license(1982740300, new C10186e(c9518e, 1, false ? (byte) 1 : (byte) 0), c13770e4), null, null, 0.0f, 0.0f, null, AbstractC9083e.license(((C7019e) c13770e4.adcel(c15492e2)).ad.Signature, ((C7019e) c13770e4.adcel(c15492e2)).ad.subscription, 0L, c13770e4, 28), interfaceC2566e3, c13770e4, 3078, 500);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 6:
                C2892e c2892e = (C2892e) obj5;
                Object obj6 = (C17068e) obj4;
                C13770e c13770e5 = (C13770e) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 3) != 2)) {
                    InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j4 = c13770e5.f27286case;
                    int i3 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC3483e advert2 = c13770e5.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e5, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e2 = C2721e.vip;
                    c13770e5.m3666import();
                    if (c13770e5.f27292implements) {
                        c13770e5.mopub(c7309e2);
                    } else {
                        c13770e5.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e5, license2, C2721e.billing);
                    AbstractC2270e.yandex(c13770e5, advert2, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e5, Integer.valueOf(i3), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e5, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e5, purchase2, C2721e.license);
                    c2892e.invoke(obj6, c13770e5, 6);
                    c13770e5.Signature(true);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                ((C2347e) obj5).isVip((C8729e) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ((C2347e) obj5).ads((InterfaceC15632e) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                ((C2347e) obj5).premium((C17247e) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                ((C2347e) obj5).isPro((C2644e) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ((C2347e) obj5).inmobi((C7073e) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 12:
                C15096e c15096e = (C15096e) obj5;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                float f2 = c15096e.f29883e;
                c15096e.f29883e = ((InterfaceC1719e) obj4).ad(floatValue - f2) + f2;
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ((C9456e) obj5).loadAd((EnumC12199e) obj4, (C13770e) obj, AbstractC5190e.advert(49));
                return Unit.INSTANCE;
            case 14:
                InterfaceC2566e interfaceC2566e4 = (InterfaceC2566e) obj5;
                C14141e c14141e = (C14141e) obj4;
                C13770e c13770e6 = (C13770e) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 3) != 2)) {
                    C16005e c16005e4 = AbstractC9083e.ad;
                    C15492e c15492e3 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC12176e.ad, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e6.adcel(c15492e3)).ad.Signature, c5100e), null, AbstractC16653e.license(895315652, new C12094e(c14141e), c13770e6), null, null, 0.0f, 0.0f, ((C0916e) c13770e6.adcel(AbstractC12450e.ad)).appmetrica(c13770e6), AbstractC9083e.license(((C7019e) c13770e6.adcel(c15492e3)).ad.Signature, ((C7019e) c13770e6.adcel(c15492e3)).ad.subscription, 0L, c13770e6, 28), interfaceC2566e4, c13770e6, 3078, 244);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ((C13867e) obj5).ad((InterfaceC12864e) obj4, (C13770e) obj, AbstractC5190e.advert(7));
                return Unit.INSTANCE;
            case 16:
                InterfaceC2566e interfaceC2566e5 = (InterfaceC2566e) obj5;
                C4944e c4944e = (C4944e) obj4;
                C13770e c13770e7 = (C13770e) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 3) != 2)) {
                    C16005e c16005e5 = AbstractC9083e.ad;
                    C15492e c15492e4 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC10653e.ad, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e7.adcel(c15492e4)).ad.Signature, c5100e), null, AbstractC16653e.license(1497649910, new C11479e(c4944e), c13770e7), null, null, 0.0f, 0.0f, ((C0916e) c13770e7.adcel(AbstractC12450e.ad)).appmetrica(c13770e7), AbstractC9083e.license(((C7019e) c13770e7.adcel(c15492e4)).ad.Signature, ((C7019e) c13770e7.adcel(c15492e4)).ad.subscription, 0L, c13770e7, 28), interfaceC2566e5, c13770e7, 3078, 244);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C17312e c17312e = (C17312e) obj5;
                C5181e c5181e = (C5181e) obj4;
                C13770e c13770e8 = (C13770e) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (!c13770e8.m3673protected(intValue8 & 1, (intValue8 & 3) != 2)) {
                    c13770e8.m3659default();
                } else if (c17312e.f33957e) {
                    c13770e8.m3676strictfp(-1754444169);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e8, R.string.themes_category_monet), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e8, 0, 0, 262142);
                    c13770e8.Signature(false);
                } else {
                    if (c5181e != null) {
                        c13770e8.m3676strictfp(-1754273173);
                        AbstractC14489e.vip(c5181e.vip, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e8, 0, 0, 262142);
                    } else {
                        c13770e8.m3676strictfp(-1759451909);
                    }
                    c13770e8.Signature(false);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C10011e c10011e = (C10011e) obj5;
                String str3 = (String) obj4;
                C13770e c13770e9 = (C13770e) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if (c13770e9.m3673protected(intValue9 & 1, (intValue9 & 3) != 2)) {
                    if (AbstractC7890e.billing((String) c10011e.metrica.getValue(), str3)) {
                        c13770e9.m3676strictfp(-1727718709);
                        AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_check, 0, c13770e9), null, null, 0L, c13770e9, 56, 12);
                    } else {
                        c13770e9.m3676strictfp(-1732241857);
                    }
                    c13770e9.Signature(false);
                } else {
                    c13770e9.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                InterfaceC2566e interfaceC2566e6 = (InterfaceC2566e) obj5;
                AbstractC15638e abstractC15638e = (AbstractC15638e) obj4;
                C13770e c13770e10 = (C13770e) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if (c13770e10.m3673protected(intValue10 & 1, (intValue10 & 3) != 2)) {
                    C16005e c16005e6 = AbstractC9083e.ad;
                    C15492e c15492e5 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC16653e.license(-182351473, new C9401e(abstractC15638e, false ? 1 : 0), c13770e10), AbstractC16136e.metrica(c0115e, ((C7019e) c13770e10.adcel(c15492e5)).ad.Signature, c5100e), null, AbstractC16653e.license(1001266092, new C9401e(abstractC15638e, 1), c13770e10), null, null, 0.0f, 0.0f, ((C0916e) c13770e10.adcel(AbstractC12450e.ad)).appmetrica(c13770e10), AbstractC9083e.license(((C7019e) c13770e10.adcel(c15492e5)).ad.Signature, ((C7019e) c13770e10.adcel(c15492e5)).ad.subscription, 0L, c13770e10, 28), interfaceC2566e6, c13770e10, 3078, 244);
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                ((C6621e) obj5).inmobi((C0073e) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                AbstractC4229e.metrica((InterfaceC12864e) obj5, (Function2) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 22:
                C11188e c11188e = (C11188e) obj5;
                InterfaceC16132e interfaceC16132e = (InterfaceC16132e) obj4;
                C13770e c13770e11 = (C13770e) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if (c13770e11.m3673protected(intValue11 & 1, (intValue11 & 3) != 2)) {
                    c11188e.m3051instanceof(AbstractC5297e.appmetrica(c13770e11, R.string.fake_catalog_playlists), ((AbstractC7674e) ((InterfaceC8346e) interfaceC16132e.getValue())).subs(), null, null, c13770e11, 0);
                } else {
                    c13770e11.m3659default();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                ((C11188e) obj5).m3048finally((CachedTrack) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((Integer) obj2).getClass();
                ((C11188e) obj5).m3058volatile((Function0) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((Integer) obj2).getClass();
                ((C10797e) obj5).m2935synchronized((InterfaceC8346e) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((Integer) obj2).getClass();
                ((C10797e) obj5).m2933instanceof((CachedPlaylist) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C2892e c2892e2 = (C2892e) obj5;
                Object obj7 = (C18362e) obj4;
                C13770e c13770e12 = (C13770e) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if (c13770e12.m3673protected(intValue12 & 1, (intValue12 & 3) != 2)) {
                    c2892e2.invoke(obj7, c13770e12, 0);
                } else {
                    c13770e12.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C16742e c16742e = (C16742e) obj5;
                C1374e c1374e = (C1374e) obj4;
                C13770e c13770e13 = (C13770e) obj;
                int intValue13 = ((Integer) obj2).intValue();
                boolean z = (intValue13 & 3) != 2;
                AbstractC7919e abstractC7919e = c13770e13.ad;
                if (c13770e13.m3673protected(intValue13 & 1, z)) {
                    InterfaceC12864e smaato = AbstractC12220e.smaato(c0115e, 16, 0.0f, 2);
                    C13964e billing = AbstractC16497e.billing(8);
                    C9577e c9577e = C5438e.f11672e;
                    C4789e ad2 = AbstractC14801e.ad(billing, c9577e, c13770e13, 6);
                    long j5 = c13770e13.f27286case;
                    int i4 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC3483e advert3 = c13770e13.advert();
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e13, smaato);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e3 = C2721e.vip;
                    c13770e13.m3666import();
                    if (c13770e13.f27292implements) {
                        c13770e13.mopub(c7309e3);
                    } else {
                        c13770e13.m3684volatile();
                    }
                    C14865e c14865e = C2721e.billing;
                    AbstractC2270e.yandex(c13770e13, ad2, c14865e);
                    C14865e c14865e2 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e13, advert3, c14865e2);
                    Integer valueOf = Integer.valueOf(i4);
                    C14865e c14865e3 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e13, valueOf, c14865e3);
                    C5430e c5430e = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e13, c5430e);
                    C14865e c14865e4 = C2721e.license;
                    AbstractC2270e.yandex(c13770e13, purchase3, c14865e4);
                    C4789e ad3 = AbstractC14801e.ad(AbstractC16497e.metrica, c9577e, c13770e13, 0);
                    long j6 = c13770e13.f27286case;
                    int i5 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC3483e advert4 = c13770e13.advert();
                    InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e13, c0115e);
                    c13770e13.m3666import();
                    if (c13770e13.f27292implements) {
                        c13770e13.mopub(c7309e3);
                    } else {
                        c13770e13.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e13, ad3, c14865e);
                    AbstractC2270e.yandex(c13770e13, advert4, c14865e2);
                    AbstractC8703e.premium(i5, c13770e13, c14865e3, c13770e13, c5430e);
                    AbstractC2270e.yandex(c13770e13, purchase4, c14865e4);
                    boolean appmetrica = c13770e13.appmetrica(c16742e.f32821e);
                    Object m3681throw3 = c13770e13.m3681throw();
                    if (appmetrica || m3681throw3 == c5170e) {
                        m3681throw3 = AbstractC13510e.metrica(c1374e.pro(), c16742e.f32821e);
                        c13770e13.m3682throws(m3681throw3);
                    }
                    AbstractC14489e.vip((String) m3681throw3, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e13, 0, 0, 262142);
                    String appmetrica2 = AbstractC5297e.appmetrica(c13770e13, R.string.spark_rfield_date);
                    C15492e c15492e6 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica2, null, ((C7019e) c13770e13.adcel(c15492e6)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e13.adcel(c15492e6)).vip.amazon, c13770e13, 0, 0, 131066);
                    c13770e13.Signature(true);
                    c13770e13.Signature(true);
                } else {
                    c13770e13.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ((C1374e) obj5).m575package((EnumC4433e) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
