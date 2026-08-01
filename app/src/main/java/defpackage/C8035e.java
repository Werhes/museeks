package defpackage;

import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٚۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8035e implements Function4 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f16324e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16325e;

    public /* synthetic */ C8035e(int i, Object obj) {
        this.f16325e = i;
        this.f16324e = obj;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        long j;
        C13770e c13770e;
        C16869e c16869e;
        int i3 = this.f16325e;
        C14486e c14486e = C14486e.ad;
        C5100e c5100e = AbstractC10432e.ad;
        Object obj5 = C2987e.ad;
        C0115e c0115e = C0115e.f1276e;
        Object obj6 = this.f16324e;
        switch (i3) {
            case 0:
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj6;
                ((Integer) obj2).getClass();
                C13770e c13770e2 = (C13770e) obj3;
                int intValue = ((Integer) obj4).intValue();
                if (c13770e2.m3673protected(intValue & 1, (intValue & 129) != 128)) {
                    InterfaceC12864e metrica = AbstractC18007e.metrica(AbstractC18007e.license(AbstractC12220e.loadAd(AbstractC16136e.metrica(c0115e, ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).ad.amazon, c5100e), 0.0f, 0.0f, 0.0f, 16, 7), 150), 1.0f);
                    InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
                    long j2 = c13770e2.f27286case;
                    int i4 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert = c13770e2.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, metrica);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e2, license, C2721e.billing);
                    AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e2, Integer.valueOf(i4), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
                    boolean purchase2 = c13770e2.purchase((C16801e) interfaceC3314e.getValue());
                    Object m3681throw = c13770e2.m3681throw();
                    Object obj7 = m3681throw;
                    if (purchase2 || m3681throw == obj5) {
                        List list = ((C16801e) interfaceC3314e.getValue()).f32939e;
                        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Float.valueOf(((C1050e) it.next()).f3536e));
                        }
                        c13770e2.m3682throws(arrayList);
                        obj7 = arrayList;
                    }
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC15077e.metrica((List) obj7, ((C7019e) c13770e2.adcel(c15492e)).ad.ad, ((C7019e) c13770e2.adcel(c15492e)).ad.premium, AbstractC16136e.metrica(AbstractC12447e.vip(c0115e, ((C7019e) c13770e2.adcel(c15492e)).metrica.metrica), ((C7019e) c13770e2.adcel(c15492e)).ad.subscription, c5100e).premium(AbstractC18007e.metrica), c13770e2, 0);
                    c13770e2.Signature(true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C18128e c18128e = (C18128e) obj6;
                AbstractC16519e.vip((AppActivity) c18128e.f10582e, new C5668e(((Integer) obj).intValue(), ((Long) obj2).longValue(), (String) obj3, c18128e, null));
                return Unit.INSTANCE;
            case 2:
                C9904e c9904e = (C9904e) obj6;
                InterfaceC1966e vip = ((C1773e) c9904e.f19531e).vip((AbstractC16845e) obj, (C1812e) obj2, ((C6277e) obj3).ad, ((C5208e) obj4).ad);
                if (vip instanceof C6951e) {
                    return (Typeface) ((C6951e) vip).f14243e;
                }
                C15024e c15024e = new C15024e(vip, c9904e.f19534e);
                c9904e.f19534e = c15024e;
                return (Typeface) c15024e.f29789e;
            case 3:
                int intValue2 = ((Integer) obj2).intValue();
                C13770e c13770e3 = (C13770e) obj3;
                ((Integer) obj4).getClass();
                AbstractC16049e abstractC16049e = (AbstractC16049e) ((C13107e) obj6).vip.get(intValue2);
                InterfaceC12864e loadAd = AbstractC12220e.loadAd(AbstractC18007e.metrica(c0115e, 1.0f), 16, 0.0f, 0.0f, 0.0f, 14);
                C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(12), C5438e.f11668e, c13770e3, 54);
                long j3 = c13770e3.f27286case;
                int i5 = (int) (j3 ^ (j3 >>> 32));
                InterfaceC3483e advert2 = c13770e3.advert();
                InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e3, loadAd);
                InterfaceC5685e.mopub.getClass();
                C7309e c7309e2 = C2721e.vip;
                c13770e3.m3666import();
                if (c13770e3.f27292implements) {
                    c13770e3.mopub(c7309e2);
                } else {
                    c13770e3.m3684volatile();
                }
                C14865e c14865e = C2721e.billing;
                AbstractC2270e.yandex(c13770e3, ad, c14865e);
                C14865e c14865e2 = C2721e.purchase;
                AbstractC2270e.yandex(c13770e3, advert2, c14865e2);
                Integer valueOf = Integer.valueOf(i5);
                C14865e c14865e3 = C2721e.adcel;
                AbstractC2270e.yandex(c13770e3, valueOf, c14865e3);
                C5430e c5430e = C2721e.mopub;
                AbstractC2270e.purchase(c13770e3, c5430e);
                C14865e c14865e4 = C2721e.license;
                AbstractC2270e.yandex(c13770e3, purchase3, c14865e4);
                AbstractC8636e.ad(abstractC16049e, 0, 0L, 0L, 0, 40, true, null, null, null, c13770e3, 1769472, 926);
                if (1.0f <= 0.0d) {
                    AbstractC9534e.ad("invalid weight; must be greater than zero");
                }
                C5228e c5228e = new C5228e(1.0f, true);
                C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e3, 0);
                long j4 = c13770e3.f27286case;
                int i6 = (int) (j4 ^ (j4 >>> 32));
                InterfaceC3483e advert3 = c13770e3.advert();
                InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e3, c5228e);
                c13770e3.m3666import();
                if (c13770e3.f27292implements) {
                    c13770e3.mopub(c7309e2);
                } else {
                    c13770e3.m3684volatile();
                }
                AbstractC2270e.yandex(c13770e3, ad2, c14865e);
                AbstractC2270e.yandex(c13770e3, advert3, c14865e2);
                AbstractC8703e.premium(i6, c13770e3, c14865e3, c13770e3, c5430e);
                AbstractC2270e.yandex(c13770e3, purchase4, c14865e4);
                C5015e c5015e = AbstractC14489e.ad;
                C15492e c15492e2 = AbstractC11785e.ad;
                C14815e ad3 = c5015e.ad(((C7019e) c13770e3.adcel(c15492e2)).vip.adcel);
                C5015e c5015e2 = AbstractC0608e.ad;
                AbstractC1101e.vip(new C14815e[]{ad3, AbstractC8703e.loadAd(((C7019e) c13770e3.adcel(c15492e2)).ad.admob, c5015e2)}, AbstractC16653e.license(1441160827, new C10270e(abstractC16049e, 0), c13770e3), c13770e3, 56);
                AbstractC1101e.vip(new C14815e[]{c5015e.ad(((C7019e) c13770e3.adcel(c15492e2)).vip.mopub), AbstractC8703e.loadAd(((C7019e) c13770e3.adcel(c15492e2)).ad.remoteconfig, c5015e2)}, AbstractC16653e.license(-147791068, new C10270e(abstractC16049e, 1), c13770e3), c13770e3, 56);
                c13770e3.Signature(true);
                c13770e3.Signature(true);
                return Unit.INSTANCE;
            case 4:
                C14875e c14875e = (C14875e) obj6;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                C13770e c13770e4 = (C13770e) obj3;
                ((Integer) obj4).getClass();
                if (booleanValue) {
                    c13770e4.m3676strictfp(-212130295);
                    c14875e.isPro(c13770e4, 0);
                    c13770e4.Signature(false);
                } else {
                    c13770e4.m3676strictfp(-212062188);
                    boolean yandex = c13770e4.yandex(c14875e);
                    Object m3681throw2 = c13770e4.m3681throw();
                    if (yandex || m3681throw2 == obj5) {
                        m3681throw2 = new C17011e(0, c14875e, C14875e.class, "dismiss", "dismiss()V", 0, 0, 19);
                        c13770e4.m3682throws(m3681throw2);
                    }
                    Function0 function0 = (Function0) ((InterfaceC5261e) m3681throw2);
                    boolean yandex2 = c13770e4.yandex(c14875e);
                    Object m3681throw3 = c13770e4.m3681throw();
                    if (yandex2 || m3681throw3 == obj5) {
                        Object c17011e = new C17011e(0, c14875e, C14875e.class, "removeTrack", "removeTrack()V", 0, 0, 20);
                        c13770e4.m3682throws(c17011e);
                        m3681throw3 = c17011e;
                    }
                    c14875e.isVip(function0, (Function0) ((InterfaceC5261e) m3681throw3), c13770e4, 0);
                    c13770e4.Signature(false);
                }
                return Unit.INSTANCE;
            case 5:
                AbstractC9512e abstractC9512e = (AbstractC9512e) obj6;
                ((Integer) obj2).getClass();
                C13770e c13770e5 = (C13770e) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                boolean z = (intValue3 & 129) != 128;
                AbstractC7919e abstractC7919e = c13770e5.ad;
                if (c13770e5.m3673protected(intValue3 & 1, z)) {
                    InterfaceC12864e metrica2 = AbstractC16136e.metrica(c0115e, ((C7019e) c13770e5.adcel(AbstractC11785e.ad)).ad.amazon, c5100e);
                    InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j5 = c13770e5.f27286case;
                    int i7 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC3483e advert4 = c13770e5.advert();
                    InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e5, metrica2);
                    InterfaceC5685e.mopub.getClass();
                    Function0 function02 = C2721e.vip;
                    c13770e5.m3666import();
                    if (c13770e5.f27292implements) {
                        c13770e5.mopub(function02);
                    } else {
                        c13770e5.m3684volatile();
                    }
                    C14865e c14865e5 = C2721e.billing;
                    AbstractC2270e.yandex(c13770e5, license2, c14865e5);
                    C14865e c14865e6 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e5, advert4, c14865e6);
                    Integer valueOf2 = Integer.valueOf(i7);
                    C14865e c14865e7 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e5, valueOf2, c14865e7);
                    C5430e c5430e2 = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e5, c5430e2);
                    C14865e c14865e8 = C2721e.license;
                    AbstractC2270e.yandex(c13770e5, purchase5, c14865e8);
                    AbstractC8141e.vip(c14486e.ad(c0115e, C5438e.f11682e), 0.0f, 0L, c13770e5, 0, 6);
                    C14544e c14544e = C5438e.f11668e;
                    float f = 8;
                    C13964e billing = AbstractC16497e.billing(f);
                    InterfaceC12864e loadAd2 = AbstractC12220e.loadAd(AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), 16, 0.0f, 2), 0.0f, 0.0f, 0.0f, f, 7);
                    C8587e ad4 = AbstractC6451e.ad(billing, c14544e, c13770e5, 54);
                    long j6 = c13770e5.f27286case;
                    int i8 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC3483e advert5 = c13770e5.advert();
                    InterfaceC12864e purchase6 = AbstractC5679e.purchase(c13770e5, loadAd2);
                    c13770e5.m3666import();
                    if (c13770e5.f27292implements) {
                        c13770e5.mopub(function02);
                    } else {
                        c13770e5.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e5, ad4, c14865e5);
                    AbstractC2270e.yandex(c13770e5, advert5, c14865e6);
                    AbstractC8703e.premium(i8, c13770e5, c14865e7, c13770e5, c5430e2);
                    AbstractC2270e.yandex(c13770e5, purchase6, c14865e8);
                    abstractC9512e.mo2585import(((AbstractC7674e) ((InterfaceC8346e) abstractC9512e.f18866e.getValue())).subs(), 0, c13770e5);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    AbstractC12534e.ad(c13770e5, new C5228e(1.0f, true));
                    boolean yandex3 = c13770e5.yandex(abstractC9512e);
                    Object m3681throw4 = c13770e5.m3681throw();
                    if (yandex3 || m3681throw4 == obj5) {
                        i = 0;
                        m3681throw4 = new C6765e(abstractC9512e, i);
                        c13770e5.m3682throws(m3681throw4);
                    } else {
                        i = 0;
                    }
                    abstractC9512e.mo2588transient((Function0) m3681throw4, c13770e5, i);
                    c13770e5.Signature(true);
                    c13770e5.Signature(true);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 6:
                Function3 function3 = (Function3) obj6;
                C18055e c18055e = (C18055e) obj;
                ((Integer) obj2).intValue();
                C13770e c13770e6 = (C13770e) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= c13770e6.purchase(c18055e) ? 4 : 2;
                }
                if (c13770e6.m3673protected(intValue4 & 1, (intValue4 & 131) != 130)) {
                    function3.invoke(c18055e, c13770e6, Integer.valueOf(intValue4 & 14));
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 7:
                C2892e c2892e = (C2892e) obj6;
                C15181e c15181e = (C15181e) obj;
                ((Integer) obj2).getClass();
                C13770e c13770e7 = (C13770e) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= c13770e7.purchase(c15181e) ? 4 : 2;
                }
                if (c13770e7.m3673protected(intValue5 & 1, (intValue5 & 131) != 130)) {
                    c2892e.invoke(c15181e, c13770e7, Integer.valueOf(intValue5 & 14));
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case 8:
                C14873e c14873e = (C14873e) obj6;
                ((Integer) obj2).intValue();
                C13770e c13770e8 = (C13770e) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                if (c13770e8.m3673protected(intValue6 & 1, (intValue6 & 129) != 128)) {
                    c14873e.m3882synchronized(c13770e8, 0);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case 9:
                int intValue7 = ((Integer) obj2).intValue();
                C13770e c13770e9 = (C13770e) obj3;
                ((Integer) obj4).getClass();
                boolean z2 = intValue7 == ((C16330e) ((AbstractC16904e) obj6).license.f17056e).purchase();
                InterfaceC12864e license3 = AbstractC18007e.license(AbstractC18007e.smaato(c0115e, 2), 32);
                if (z2) {
                    c13770e9.m3676strictfp(647778411);
                    j = ((C7019e) c13770e9.adcel(AbstractC11785e.ad)).ad.ad;
                    i2 = 0;
                    c13770e9.Signature(false);
                } else {
                    i2 = 0;
                    c13770e9.m3676strictfp(647896738);
                    j = ((C7019e) c13770e9.adcel(AbstractC11785e.ad)).ad.remoteconfig;
                    c13770e9.Signature(false);
                }
                AbstractC17074e.ad(AbstractC16136e.metrica(license3, j, c5100e), c13770e9, i2);
                return Unit.INSTANCE;
            case 10:
                C2347e c2347e = (C2347e) obj6;
                InterfaceC15632e interfaceC15632e = (InterfaceC15632e) obj2;
                C13770e c13770e10 = (C13770e) obj3;
                ((Integer) obj4).getClass();
                C10156e c10156e = C5438e.f11700e;
                C10156e c10156e2 = C5438e.f11676e;
                if ((interfaceC15632e instanceof C12281e) || interfaceC15632e.equals(C15142e.ad)) {
                    c13770e10.m3676strictfp(531405687);
                    InterfaceC12864e metrica3 = AbstractC18007e.metrica(AbstractC12220e.mopub(c0115e, 32), 1.0f);
                    InterfaceC2747e license4 = AbstractC17074e.license(c10156e2, false);
                    long j7 = c13770e10.f27286case;
                    int i9 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC3483e advert6 = c13770e10.advert();
                    InterfaceC12864e purchase7 = AbstractC5679e.purchase(c13770e10, metrica3);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e3 = C2721e.vip;
                    c13770e10.m3666import();
                    if (c13770e10.f27292implements) {
                        c13770e10.mopub(c7309e3);
                    } else {
                        c13770e10.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e10, license4, C2721e.billing);
                    AbstractC2270e.yandex(c13770e10, advert6, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e10, Integer.valueOf(i9), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e10, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e10, purchase7, C2721e.license);
                    AbstractC6232e.vip(c14486e.ad(c0115e, c10156e), 0L, null, c13770e10, 0, 6);
                    c13770e10.Signature(true);
                    c13770e10.Signature(false);
                } else if (interfaceC15632e.equals(C9698e.ad)) {
                    c13770e10.m3676strictfp(531762869);
                    float f2 = 32;
                    InterfaceC12864e mopub = AbstractC12220e.mopub(c0115e, f2);
                    InterfaceC2747e license5 = AbstractC17074e.license(c10156e2, false);
                    long j8 = c13770e10.f27286case;
                    int i10 = (int) ((j8 >>> 32) ^ j8);
                    InterfaceC3483e advert7 = c13770e10.advert();
                    InterfaceC12864e purchase8 = AbstractC5679e.purchase(c13770e10, mopub);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e4 = C2721e.vip;
                    c13770e10.m3666import();
                    if (c13770e10.f27292implements) {
                        c13770e10.mopub(c7309e4);
                    } else {
                        c13770e10.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e10, license5, C2721e.billing);
                    AbstractC2270e.yandex(c13770e10, advert7, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e10, Integer.valueOf(i10), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e10, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e10, purchase8, C2721e.license);
                    AbstractC5647e.ad(AbstractC3421e.billing(), null, AbstractC18007e.startapp(c14486e.ad(c0115e, c10156e), f2), 0L, c13770e10, 48, 8);
                    c13770e10.Signature(true);
                    c13770e10.Signature(false);
                } else if (interfaceC15632e instanceof C8729e) {
                    c13770e10.m3676strictfp(532302424);
                    c2347e.isVip((C8729e) interfaceC15632e, c13770e10, 0);
                    c13770e10.Signature(false);
                } else if (interfaceC15632e instanceof C7073e) {
                    c13770e10.m3676strictfp(532426021);
                    c2347e.inmobi((C7073e) interfaceC15632e, c13770e10, 0);
                    c13770e10.Signature(false);
                } else if (interfaceC15632e instanceof C17247e) {
                    c13770e10.m3676strictfp(532547355);
                    c2347e.premium((C17247e) interfaceC15632e, c13770e10, 0);
                    c13770e10.Signature(false);
                } else {
                    if (!(interfaceC15632e instanceof C2644e)) {
                        throw AbstractC1786e.loadAd(155687510, c13770e10, false);
                    }
                    c13770e10.m3676strictfp(532673184);
                    c2347e.isPro((C2644e) interfaceC15632e, c13770e10, 0);
                    c13770e10.Signature(false);
                }
                return Unit.INSTANCE;
            case 11:
                C4034e c4034e = (C4034e) obj6;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                InterfaceC0043e interfaceC0043e = (InterfaceC0043e) obj2;
                C16658e c16658e = (C16658e) obj4;
                long advert8 = interfaceC0043e.advert();
                C0763e c0763e = new C0763e(0.0f, 0.0f, (int) (advert8 >> 32), (int) (advert8 & 4294967295L));
                long j9 = ((C2152e) obj3).ad;
                if (!AbstractC14520e.vip(j9, c0763e)) {
                    j9 = AbstractC17416e.ad(j9, c0763e);
                }
                long ad5 = c4034e.ad(interfaceC0043e, j9);
                if ((9223372034707292159L & ad5) != 9205357640488583168L) {
                    c4034e.mopub(booleanValue2);
                    c4034e.pro = null;
                    c4034e.amazon(ad5, 9205357640488583168L, false, c16658e);
                    C6260e.vip(c4034e.yandex);
                    c4034e.inmobi = false;
                    c4034e.loadAd();
                    c4034e.signatures = true;
                }
                return Unit.INSTANCE;
            case 12:
                C12340e c12340e = (C12340e) obj6;
                InterfaceC11403e interfaceC11403e = (InterfaceC11403e) obj2;
                C13770e c13770e11 = (C13770e) obj3;
                int intValue8 = ((Integer) obj4).intValue();
                C14544e c14544e2 = C5438e.f11685e;
                C9577e c9577e = C5438e.f11672e;
                if (interfaceC11403e.equals(C10297e.ad)) {
                    AbstractC7919e abstractC7919e2 = c13770e11.ad;
                    c13770e11.m3676strictfp(555762129);
                    C4789e ad6 = AbstractC14801e.ad(AbstractC16497e.metrica, c9577e, c13770e11, 0);
                    long j10 = c13770e11.f27286case;
                    int i11 = (int) (j10 ^ (j10 >>> 32));
                    InterfaceC3483e advert9 = c13770e11.advert();
                    InterfaceC12864e purchase9 = AbstractC5679e.purchase(c13770e11, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e5 = C2721e.vip;
                    c13770e11.m3666import();
                    if (c13770e11.f27292implements) {
                        c13770e11.mopub(c7309e5);
                    } else {
                        c13770e11.m3684volatile();
                    }
                    C14865e c14865e9 = C2721e.billing;
                    AbstractC2270e.yandex(c13770e11, ad6, c14865e9);
                    C14865e c14865e10 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e11, advert9, c14865e10);
                    Integer valueOf3 = Integer.valueOf(i11);
                    C14865e c14865e11 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e11, valueOf3, c14865e11);
                    C5430e c5430e3 = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e11, c5430e3);
                    C14865e c14865e12 = C2721e.license;
                    AbstractC2270e.yandex(c13770e11, purchase9, c14865e12);
                    String appmetrica = AbstractC5297e.appmetrica(c13770e11, R.string.mixes_v2_empty);
                    C15492e c15492e3 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica, AbstractC18007e.metrica(c0115e, 1.0f), ((C7019e) c13770e11.adcel(c15492e3)).ad.admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e11.adcel(c15492e3)).vip.appmetrica, c13770e11, 48, 0, 130040);
                    float f3 = 16;
                    AbstractC12534e.ad(c13770e11, AbstractC18007e.license(c0115e, f3));
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e11, R.string.mixes_v2_empty_text), AbstractC18007e.metrica(c0115e, 1.0f), ((C7019e) c13770e11.adcel(c15492e3)).ad.remoteconfig, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e11.adcel(c15492e3)).vip.mopub, c13770e11, 48, 0, 130040);
                    c13770e = c13770e11;
                    AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, f3));
                    InterfaceC12864e metrica4 = AbstractC18007e.metrica(c0115e, 1.0f);
                    C8587e ad7 = AbstractC6451e.ad(AbstractC16497e.billing(f3), c14544e2, c13770e, 6);
                    long j11 = c13770e.f27286case;
                    int i12 = (int) (j11 ^ (j11 >>> 32));
                    InterfaceC3483e advert10 = c13770e.advert();
                    InterfaceC12864e purchase10 = AbstractC5679e.purchase(c13770e, metrica4);
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e5);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, ad7, c14865e9);
                    AbstractC2270e.yandex(c13770e, advert10, c14865e10);
                    AbstractC8703e.premium(i12, c13770e, c14865e11, c13770e, c5430e3);
                    AbstractC2270e.yandex(c13770e, purchase10, c14865e12);
                    boolean yandex4 = c13770e.yandex(c12340e);
                    Object m3681throw5 = c13770e.m3681throw();
                    if (yandex4 || m3681throw5 == obj5) {
                        m3681throw5 = new C6317e(0, c12340e, C12340e.class, "dismiss", "dismiss()V", 0, 0, 3);
                        c13770e.m3682throws(m3681throw5);
                    }
                    InterfaceC5261e interfaceC5261e = (InterfaceC5261e) m3681throw5;
                    C16005e c16005e = new C16005e(f3, f3, f3, f3);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    AbstractC1513e.ad((Function0) interfaceC5261e, new C5228e(1.0f, true), false, ((C7019e) c13770e.adcel(c15492e3)).metrica.metrica, null, null, null, c16005e, AbstractC16994e.f33296e, c13770e, 817889280, 372);
                } else {
                    if (interfaceC11403e.equals(C0980e.ad)) {
                        c13770e11.m3676strictfp(557685090);
                        AbstractC6574e.license(null, 0L, 0L, 0, 0.0f, c13770e11, 0, 31);
                        c13770e11.Signature(false);
                        return Unit.INSTANCE;
                    }
                    if (!(interfaceC11403e instanceof C6561e)) {
                        throw AbstractC1786e.loadAd(-1644635888, c13770e11, false);
                    }
                    AbstractC7919e abstractC7919e3 = c13770e11.ad;
                    c13770e11.m3676strictfp(557987402);
                    float f4 = 8;
                    C4789e ad8 = AbstractC14801e.ad(AbstractC16497e.billing(f4), c9577e, c13770e11, 6);
                    long j12 = c13770e11.f27286case;
                    int i13 = (int) (j12 ^ (j12 >>> 32));
                    InterfaceC3483e advert11 = c13770e11.advert();
                    InterfaceC12864e purchase11 = AbstractC5679e.purchase(c13770e11, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e6 = C2721e.vip;
                    c13770e11.m3666import();
                    if (c13770e11.f27292implements) {
                        c13770e11.mopub(c7309e6);
                    } else {
                        c13770e11.m3684volatile();
                    }
                    C14865e c14865e13 = C2721e.billing;
                    AbstractC2270e.yandex(c13770e11, ad8, c14865e13);
                    C14865e c14865e14 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e11, advert11, c14865e14);
                    Integer valueOf4 = Integer.valueOf(i13);
                    C14865e c14865e15 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e11, valueOf4, c14865e15);
                    C5430e c5430e4 = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e11, c5430e4);
                    C14865e c14865e16 = C2721e.license;
                    AbstractC2270e.yandex(c13770e11, purchase11, c14865e16);
                    C6228e c6228e = ((C6561e) interfaceC11403e).ad;
                    AbstractC14489e.vip(c6228e.ad.ad, AbstractC18007e.metrica(c0115e, 1.0f), AbstractC0903e.license(c13770e11).admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e11).appmetrica, c13770e11, 48, 0, 130040);
                    AbstractC14489e.vip(c6228e.ad.vip, AbstractC18007e.metrica(c0115e, 1.0f), AbstractC0903e.license(c13770e11).remoteconfig, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e11).mopub, c13770e11, 48, 0, 130040);
                    C13964e billing2 = AbstractC16497e.billing(f4);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    C5228e c5228e2 = new C5228e(1.0f, false);
                    boolean yandex5 = ((((intValue8 & 112) ^ 48) > 32 && c13770e11.yandex(interfaceC11403e)) || (intValue8 & 48) == 32) | c13770e11.yandex(c12340e);
                    Object m3681throw6 = c13770e11.m3681throw();
                    if (yandex5 || m3681throw6 == obj5) {
                        m3681throw6 = new C6538e(interfaceC11403e, c12340e, 10);
                        c13770e11.m3682throws(m3681throw6);
                    }
                    AbstractC7023e.ad(c5228e2, null, null, billing2, null, null, false, null, (Function1) m3681throw6, c13770e11, 24576, 494);
                    InterfaceC12864e metrica5 = AbstractC18007e.metrica(c0115e, 1.0f);
                    float f5 = 16;
                    C8587e ad9 = AbstractC6451e.ad(AbstractC16497e.billing(f5), c14544e2, c13770e11, 6);
                    long j13 = c13770e11.f27286case;
                    int i14 = (int) (j13 ^ (j13 >>> 32));
                    InterfaceC3483e advert12 = c13770e11.advert();
                    InterfaceC12864e purchase12 = AbstractC5679e.purchase(c13770e11, metrica5);
                    c13770e11.m3666import();
                    if (c13770e11.f27292implements) {
                        c13770e11.mopub(c7309e6);
                    } else {
                        c13770e11.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e11, ad9, c14865e13);
                    AbstractC2270e.yandex(c13770e11, advert12, c14865e14);
                    AbstractC8703e.premium(i14, c13770e11, c14865e15, c13770e11, c5430e4);
                    AbstractC2270e.yandex(c13770e11, purchase12, c14865e16);
                    boolean yandex6 = c13770e11.yandex(c12340e);
                    Object m3681throw7 = c13770e11.m3681throw();
                    if (yandex6 || m3681throw7 == obj5) {
                        m3681throw7 = new C6317e(0, c12340e, C12340e.class, "dismiss", "dismiss()V", 0, 0, 4);
                        c13770e11.m3682throws(m3681throw7);
                    }
                    InterfaceC5261e interfaceC5261e2 = (InterfaceC5261e) m3681throw7;
                    C16005e c16005e2 = new C16005e(f5, f5, f5, f5);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    C5228e c5228e3 = new C5228e(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    C3924e c3924e = AbstractC0903e.purchase(c13770e11).metrica;
                    C16005e c16005e3 = AbstractC10244e.ad;
                    AbstractC1513e.license((Function0) interfaceC5261e2, c5228e3, false, c3924e, AbstractC10244e.purchase(AbstractC0903e.license(c13770e11).admob, 0L, c13770e11, 13), c16005e2, AbstractC16994e.f33297e, c13770e11, 817889280, 356);
                    c13770e = c13770e11;
                    C16005e c16005e4 = new C16005e(f5, f5, f5, f5);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    C5228e c5228e4 = new C5228e(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    C3924e c3924e2 = AbstractC0903e.purchase(c13770e).metrica;
                    boolean z3 = !c12340e.f24735e.isEmpty();
                    boolean yandex7 = c13770e.yandex(c12340e);
                    Object m3681throw8 = c13770e.m3681throw();
                    if (yandex7 || m3681throw8 == obj5) {
                        m3681throw8 = new C5671e(2, c12340e);
                        c13770e.m3682throws(m3681throw8);
                    }
                    AbstractC1513e.ad((Function0) m3681throw8, c5228e4, z3, c3924e2, null, null, null, c16005e4, AbstractC16994e.f33294e, c13770e, 817889280, 368);
                }
                AbstractC1786e.isPro(c13770e, true, true, false);
                return Unit.INSTANCE;
            default:
                C16869e c16869e2 = (C16869e) obj6;
                C16579e c16579e = (C16579e) obj2;
                C13770e c13770e12 = (C13770e) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                if (c16579e != null) {
                    c13770e12.m3676strictfp(148602644);
                    boolean yandex8 = c13770e12.yandex(c16869e2);
                    Object m3681throw9 = c13770e12.m3681throw();
                    if (yandex8 || m3681throw9 == obj5) {
                        m3681throw9 = new C6317e(0, c16869e2, C16869e.class, "openCacheDeletion", "openCacheDeletion()V", 0, 0, 22);
                        c13770e12.m3682throws(m3681throw9);
                    }
                    Function0 function03 = (Function0) ((InterfaceC5261e) m3681throw9);
                    boolean yandex9 = c13770e12.yandex(c16869e2);
                    Object m3681throw10 = c13770e12.m3681throw();
                    if (yandex9 || m3681throw10 == obj5) {
                        c16869e = c16869e2;
                        m3681throw10 = new C6317e(0, c16869e, C16869e.class, "openCacheMigration", "openCacheMigration()V", 0, 0, 23);
                        c13770e12.m3682throws(m3681throw10);
                    } else {
                        c16869e = c16869e2;
                    }
                    c16869e.m4203private(c16579e, function03, (Function0) ((InterfaceC5261e) m3681throw10), c13770e12, (intValue9 >> 3) & 14);
                    c13770e12.Signature(false);
                } else {
                    c13770e12.m3676strictfp(148948511);
                    AbstractC6574e.license(AbstractC18007e.metrica(c0115e, 1.0f), 0L, 0L, 0, 0.0f, c13770e12, 6, 30);
                    c13770e12.Signature(false);
                }
                return Unit.INSTANCE;
        }
    }
}
