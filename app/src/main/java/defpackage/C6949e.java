package defpackage;

import android.graphics.drawable.Drawable;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioFollowingsUpdateInfo;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٟؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6949e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f14239e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f14240e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14241e;

    public /* synthetic */ C6949e(C9302e c9302e, AbstractC14601e abstractC14601e, C6582e c6582e) {
        this.f14241e = 19;
        this.f14240e = c9302e;
        this.f14239e = c6582e;
    }

    public /* synthetic */ C6949e(Object obj, Object obj2, int i) {
        this.f14241e = i;
        this.f14240e = obj;
        this.f14239e = obj2;
    }

    public /* synthetic */ C6949e(Object obj, Object obj2, int i, int i2) {
        this.f14241e = i2;
        this.f14240e = obj;
        this.f14239e = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f14241e;
        int i2 = 25;
        C5100e c5100e = AbstractC10432e.ad;
        Object obj3 = C2987e.ad;
        C0115e c0115e = C0115e.f1276e;
        int i3 = 2;
        Object obj4 = this.f14239e;
        Object obj5 = this.f14240e;
        switch (i) {
            case 0:
                String str = (String) obj5;
                AbstractC10727e abstractC10727e = (AbstractC10727e) obj4;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC8461e.vip(str, null, AbstractC18007e.metrica, abstractC10727e, abstractC10727e, null, c13770e, 37296, 0, 32736);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC2566e interfaceC2566e = (InterfaceC2566e) obj5;
                Cpublic cpublic = (Cpublic) obj4;
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C16005e c16005e = AbstractC9083e.ad;
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC15842e.ad, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e2.adcel(c15492e)).ad.Signature, c5100e), null, AbstractC16653e.license(394058922, new Cswitch(cpublic), c13770e2), null, null, 0.0f, 0.0f, ((C0916e) c13770e2.adcel(AbstractC12450e.ad)).appmetrica(c13770e2), AbstractC9083e.purchase(((C7019e) c13770e2.adcel(c15492e)).ad.Signature, ((C7019e) c13770e2.adcel(c15492e)).ad.subscription, 0L, 0L, 0L, c13770e2, 60), interfaceC2566e, c13770e2, 3078, 244);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ((Cpublic) obj5).m4632private((C10985e) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ((C13621e) obj5).purchase((C13177e) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ((C18128e) obj5).isPro((C1925e) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 5:
                Function2 function2 = (Function2) obj5;
                Function2 function22 = (Function2) obj4;
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    InterfaceC12864e premium = AbstractC12220e.adcel(c0115e, AbstractC1981e.billing).premium(new C15061e(function2 == null ? C5438e.f11672e : C5438e.f11678e));
                    InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
                    long j = c13770e3.f27286case;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e3.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e3, premium);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e3.m3666import();
                    if (c13770e3.f27292implements) {
                        c13770e3.mopub(c7309e);
                    } else {
                        c13770e3.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e3, license, C2721e.billing);
                    AbstractC2270e.yandex(c13770e3, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e3, Integer.valueOf(i4), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e3, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e3, purchase, C2721e.license);
                    function22.invoke(c13770e3, 0);
                    c13770e3.Signature(true);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 6:
                float floatValue = ((Float) obj).floatValue();
                ((C5624e) obj5).ad(floatValue, ((Float) obj2).floatValue());
                ((C15096e) obj4).f29883e = floatValue;
                return Unit.INSTANCE;
            case 7:
                C10685e c10685e = (C10685e) obj5;
                EnumC6916e enumC6916e = (EnumC6916e) obj4;
                C13770e c13770e4 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Object m3681throw = c13770e4.m3681throw();
                    if (m3681throw == obj3) {
                        m3681throw = AbstractC4628e.purchase(c10685e.pro(), enumC6916e.f14176e);
                        c13770e4.m3682throws(m3681throw);
                    }
                    AbstractC16268e.ad(AbstractC6845e.ad((Drawable) m3681throw, c13770e4), AbstractC18007e.startapp(AbstractC12447e.vip(c0115e, AbstractC6549e.ad(8)), 52), null, null, 0.0f, c13770e4, 56, 120);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 8:
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj5;
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj4;
                C13770e c13770e5 = (C13770e) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 3) != 2)) {
                    boolean z = ((C3487e) interfaceC3314e.getValue()).f7755e;
                    boolean yandex = c13770e5.yandex(interfaceC18435e);
                    Object m3681throw2 = c13770e5.m3681throw();
                    if (yandex || m3681throw2 == obj3) {
                        m3681throw2 = new C17744e(interfaceC18435e, 0);
                        c13770e5.m3682throws(m3681throw2);
                    }
                    AbstractC8844e.ad(z, (Function1) m3681throw2, null, false, null, c13770e5, 0, 124);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 9:
                InterfaceC2566e interfaceC2566e2 = (InterfaceC2566e) obj5;
                C10685e c10685e2 = (C10685e) obj4;
                C13770e c13770e6 = (C13770e) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 3) != 2)) {
                    C16005e c16005e2 = AbstractC9083e.ad;
                    C15492e c15492e2 = AbstractC11785e.ad;
                    byte b = 0;
                    AbstractC10560e.vip(AbstractC13482e.appmetrica, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e6.adcel(c15492e2)).ad.Signature, c5100e), null, AbstractC16653e.license(-501441348, new C16332e(c10685e2, b, b), c13770e6), null, null, 0.0f, 0.0f, ((C0916e) c13770e6.adcel(AbstractC12450e.ad)).appmetrica(c13770e6), AbstractC9083e.license(((C7019e) c13770e6.adcel(c15492e2)).ad.Signature, ((C7019e) c13770e6.adcel(c15492e2)).ad.subscription, 0L, c13770e6, 28), interfaceC2566e2, c13770e6, 3078, 244);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 10:
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                C13770e c13770e7 = (C13770e) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 3) != 2)) {
                    C15492e c15492e3 = AbstractC11785e.ad;
                    AbstractC8461e.vip(str2, str3, AbstractC12447e.vip(AbstractC18007e.startapp(c0115e, 64), ((C7019e) c13770e7.adcel(c15492e3)).metrica.metrica), new C6159e(((C7019e) c13770e7.adcel(c15492e3)).ad.premium), null, null, c13770e7, 4096, 0, 32752);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ((C14398e) obj5).m3794strictfp((InterfaceC12864e) obj4, (C13770e) obj, AbstractC5190e.advert(7));
                return Unit.INSTANCE;
            case 12:
                C14398e c14398e = (C14398e) obj5;
                InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) obj4;
                C13770e c13770e8 = (C13770e) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 3) != 2)) {
                    boolean yandex2 = c13770e8.yandex(c14398e) | c13770e8.purchase(interfaceC3314e2);
                    Object m3681throw3 = c13770e8.m3681throw();
                    if (yandex2 || m3681throw3 == obj3) {
                        m3681throw3 = new Celse(c14398e, interfaceC3314e2, 11);
                        c13770e8.m3682throws(m3681throw3);
                    }
                    AbstractC1513e.license((Function0) m3681throw3, null, false, null, null, null, AbstractC9164e.purchase, c13770e8, 805306368, 510);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case 13:
                InterfaceC2566e interfaceC2566e3 = (InterfaceC2566e) obj5;
                C14398e c14398e2 = (C14398e) obj4;
                C13770e c13770e9 = (C13770e) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if (c13770e9.m3673protected(intValue9 & 1, (intValue9 & 3) != 2)) {
                    C16005e c16005e3 = AbstractC9083e.ad;
                    C15492e c15492e4 = AbstractC11785e.ad;
                    byte b2 = 0;
                    AbstractC10560e.vip(AbstractC9164e.startapp, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e9.adcel(c15492e4)).ad.Signature, c5100e), null, AbstractC16653e.license(1301131442, new C9109e(c14398e2, b2, b2), c13770e9), AbstractC16653e.license(1915935579, new C5532e(c14398e2, b2), c13770e9), null, 0.0f, 0.0f, ((C0916e) c13770e9.adcel(AbstractC12450e.ad)).appmetrica(c13770e9), AbstractC9083e.license(((C7019e) c13770e9.adcel(c15492e4)).ad.Signature, ((C7019e) c13770e9.adcel(c15492e4)).ad.Signature, ((C7019e) c13770e9.adcel(c15492e4)).ad.admob, c13770e9, 12), interfaceC2566e3, c13770e9, 27654, 228);
                } else {
                    c13770e9.m3659default();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                AbstractC10653e.ad((AudioFollowingsUpdateInfo) obj5, (Function0) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 15:
                C6943e c6943e = (C6943e) obj5;
                InterfaceC2566e interfaceC2566e4 = (InterfaceC2566e) obj4;
                C13770e c13770e10 = (C13770e) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if (c13770e10.m3673protected(intValue10 & 1, (intValue10 & 3) != 2)) {
                    String str4 = c6943e.pro;
                    if (str4 == null) {
                        str4 = BuildConfig.FLAVOR;
                    }
                    AbstractC14489e.vip(str4, AbstractC1376e.ad(c0115e, interfaceC2566e4.getState().vip()), 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e10, 0, 24960, 241660);
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
            case 16:
                InterfaceC2566e interfaceC2566e5 = (InterfaceC2566e) obj5;
                C7888e c7888e = (C7888e) obj4;
                C13770e c13770e11 = (C13770e) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if (c13770e11.m3673protected(intValue11 & 1, (intValue11 & 3) != 2)) {
                    C16005e c16005e4 = AbstractC9083e.ad;
                    C15492e c15492e5 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC8797e.ad, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e11.adcel(c15492e5)).ad.Signature, c5100e), null, AbstractC16653e.license(1415904365, new C10624e(c7888e, 4), c13770e11), null, null, 0.0f, 0.0f, ((C0916e) c13770e11.adcel(AbstractC12450e.ad)).appmetrica(c13770e11), AbstractC9083e.license(((C7019e) c13770e11.adcel(c15492e5)).ad.Signature, ((C7019e) c13770e11.adcel(c15492e5)).ad.subscription, 0L, c13770e11, 28), interfaceC2566e5, c13770e11, 3078, 244);
                } else {
                    c13770e11.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C7888e c7888e2 = (C7888e) obj5;
                EnumC12505e enumC12505e = (EnumC12505e) obj4;
                C13770e c13770e12 = (C13770e) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if (c13770e12.m3673protected(intValue12 & 1, (intValue12 & 3) != 2)) {
                    if (((EnumC12505e) c7888e2.f15965e.getValue()) == enumC12505e) {
                        c13770e12.m3676strictfp(-427836028);
                        AbstractC5647e.ad(AbstractC3421e.billing(), null, null, 0L, c13770e12, 48, 12);
                    } else {
                        c13770e12.m3676strictfp(-436752434);
                    }
                    c13770e12.Signature(false);
                } else {
                    c13770e12.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                InterfaceC2566e interfaceC2566e6 = (InterfaceC2566e) obj5;
                C0365e c0365e = (C0365e) obj4;
                C13770e c13770e13 = (C13770e) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if (c13770e13.m3673protected(intValue13 & 1, (intValue13 & 3) != 2)) {
                    C16005e c16005e5 = AbstractC9083e.ad;
                    C15492e c15492e6 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC12684e.ad, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e13.adcel(c15492e6)).ad.Signature, c5100e), null, AbstractC16653e.license(-2061184714, new C1123e(c0365e), c13770e13), null, null, 0.0f, 0.0f, ((C0916e) c13770e13.adcel(AbstractC12450e.ad)).appmetrica(c13770e13), AbstractC9083e.license(((C7019e) c13770e13.adcel(c15492e6)).ad.Signature, ((C7019e) c13770e13.adcel(c15492e6)).ad.Signature, 0L, c13770e13, 28), interfaceC2566e6, c13770e13, 3078, 244);
                } else {
                    c13770e13.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C9302e c9302e = (C9302e) obj5;
                C6582e c6582e = (C6582e) obj4;
                String str5 = (String) obj;
                List list = (List) obj2;
                if (str5.equals("Transfer-Encoding")) {
                    c9302e.f18534e = true;
                } else if (str5.equals("Upgrade")) {
                    throw new C8136e("Upgrade", "non-upgrading response");
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c6582e.f13571e.advert(str5, (String) it.next(), true);
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                ((C12575e) obj5).vip((C2892e) obj4, (C13770e) obj, AbstractC5190e.advert(7));
                return Unit.INSTANCE;
            case 21:
                String str6 = (String) obj5;
                C2892e c2892e = (C2892e) obj4;
                C13770e c13770e14 = (C13770e) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if (c13770e14.m3673protected(intValue14 & 1, (intValue14 & 3) != 2)) {
                    boolean purchase2 = c13770e14.purchase(str6);
                    Object m3681throw4 = c13770e14.m3681throw();
                    if (purchase2 || m3681throw4 == obj3) {
                        m3681throw4 = new C18513e(str6, i3);
                        c13770e14.m3682throws(m3681throw4);
                    }
                    C18138e c18138e = new C18138e((Function1) m3681throw4, false);
                    InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j2 = c13770e14.f27286case;
                    int i5 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert2 = c13770e14.advert();
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e14, c18138e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e2 = C2721e.vip;
                    c13770e14.m3666import();
                    if (c13770e14.f27292implements) {
                        c13770e14.mopub(c7309e2);
                    } else {
                        c13770e14.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e14, license2, C2721e.billing);
                    AbstractC2270e.yandex(c13770e14, advert2, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e14, Integer.valueOf(i5), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e14, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e14, purchase3, C2721e.license);
                    c2892e.invoke(c13770e14, 0);
                    c13770e14.Signature(true);
                } else {
                    c13770e14.m3659default();
                }
                return Unit.INSTANCE;
            case 22:
                InterfaceC3314e interfaceC3314e3 = (InterfaceC3314e) obj5;
                InterfaceC3314e interfaceC3314e4 = (InterfaceC3314e) obj4;
                C13770e c13770e15 = (C13770e) obj;
                int intValue15 = ((Integer) obj2).intValue();
                if (c13770e15.m3673protected(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Object m3681throw5 = c13770e15.m3681throw();
                    if (m3681throw5 == obj3) {
                        m3681throw5 = new C0129e(interfaceC3314e3, interfaceC3314e4, 0);
                        c13770e15.m3682throws(m3681throw5);
                    }
                    AbstractC1513e.license((Function0) m3681throw5, null, false, null, null, null, AbstractC12900e.ad, c13770e15, 805306374, 510);
                } else {
                    c13770e15.m3659default();
                }
                return Unit.INSTANCE;
            case 23:
                InterfaceC2566e interfaceC2566e7 = (InterfaceC2566e) obj5;
                C8006e c8006e = (C8006e) obj4;
                C13770e c13770e16 = (C13770e) obj;
                int intValue16 = ((Integer) obj2).intValue();
                if (c13770e16.m3673protected(intValue16 & 1, (intValue16 & 3) != 2)) {
                    C16005e c16005e6 = AbstractC9083e.ad;
                    C15492e c15492e7 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC12900e.appmetrica, null, null, AbstractC16653e.license(431444868, new C13208e(c8006e), c13770e16), null, null, 0.0f, 0.0f, ((C0916e) c13770e16.adcel(AbstractC12450e.ad)).appmetrica(c13770e16), AbstractC9083e.license(((C7019e) c13770e16.adcel(c15492e7)).ad.Signature, ((C7019e) c13770e16.adcel(c15492e7)).ad.subscription, 0L, c13770e16, 28), interfaceC2566e7, c13770e16, 3078, 246);
                } else {
                    c13770e16.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                InterfaceC7183e interfaceC7183e = (InterfaceC7183e) obj;
                C5602e c5602e = (C5602e) obj2;
                return ((InterfaceC2747e) obj5).vip(interfaceC7183e, interfaceC7183e.subscription(Unit.INSTANCE, new C2892e(-431986394, true, new C6949e((C2892e) obj4, new C14715e(interfaceC7183e, c5602e.ad), i2))), c5602e.ad);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C2892e c2892e2 = (C2892e) obj5;
                C14715e c14715e = (C14715e) obj4;
                C13770e c13770e17 = (C13770e) obj;
                int intValue17 = ((Integer) obj2).intValue();
                if (c13770e17.m3673protected(intValue17 & 1, (intValue17 & 3) != 2)) {
                    c2892e2.invoke(c14715e, c13770e17, 0);
                } else {
                    c13770e17.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((Integer) obj2).getClass();
                ((C15435e) obj5).m3996synchronized((InterfaceC8346e) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((Integer) obj2).getClass();
                ((C15435e) obj5).m3994instanceof((CachedPlaylist) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((Integer) obj2).getClass();
                ((C5250e) obj5).m1840import((CachedTrack) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                C5250e c5250e = (C5250e) obj5;
                InterfaceC16132e interfaceC16132e = (InterfaceC16132e) obj4;
                C13770e c13770e18 = (C13770e) obj;
                int intValue18 = ((Integer) obj2).intValue();
                if (!c13770e18.m3673protected(intValue18 & 1, (intValue18 & 3) != 2)) {
                    c13770e18.m3659default();
                } else if (((InterfaceC8346e) interfaceC16132e.getValue()).isEmpty()) {
                    c13770e18.m3676strictfp(-2066574236);
                    c5250e.m1841transient(c13770e18, 0);
                    c13770e18.Signature(false);
                } else {
                    c13770e18.m3676strictfp(-2067295792);
                    C16005e metrica = AbstractC12220e.metrica(0.0f, 12, 1);
                    boolean yandex3 = c13770e18.yandex(c5250e) | c13770e18.purchase(interfaceC16132e);
                    Object m3681throw6 = c13770e18.m3681throw();
                    if (yandex3 || m3681throw6 == obj3) {
                        m3681throw6 = new C12439e(c5250e, interfaceC16132e, i2);
                        c13770e18.m3682throws(m3681throw6);
                    }
                    AbstractC7023e.ad(C0115e.f1276e, null, metrica, null, null, null, false, null, (Function1) m3681throw6, c13770e18, 390, 506);
                    c13770e18.Signature(false);
                }
                return Unit.INSTANCE;
        }
    }
}
