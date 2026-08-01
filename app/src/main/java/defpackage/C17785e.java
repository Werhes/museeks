package defpackage;

import android.app.Activity;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ٘ٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17785e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f34867e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f34868e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34869e;

    public /* synthetic */ C17785e(C16005e c16005e, C9418e c9418e, InterfaceC10260e interfaceC10260e) {
        this.f34869e = 17;
        this.f34868e = c16005e;
        this.f34867e = interfaceC10260e;
    }

    public /* synthetic */ C17785e(Object obj, Object obj2, int i) {
        this.f34869e = i;
        this.f34868e = obj;
        this.f34867e = obj2;
    }

    public /* synthetic */ C17785e(Object obj, Object obj2, int i, int i2) {
        this.f34869e = i2;
        this.f34868e = obj;
        this.f34867e = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C13770e c13770e;
        int i;
        int i2 = this.f34869e;
        int i3 = 21;
        C5170e c5170e = C2987e.ad;
        C5100e c5100e = AbstractC10432e.ad;
        C0115e c0115e = C0115e.f1276e;
        Object obj3 = this.f34867e;
        Object obj4 = this.f34868e;
        switch (i2) {
            case 0:
                InterfaceC2566e interfaceC2566e = (InterfaceC2566e) obj4;
                C1922e c1922e = (C1922e) obj3;
                C13770e c13770e2 = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C16005e c16005e = AbstractC9083e.ad;
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC17487e.ad, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e2.adcel(c15492e)).ad.Signature, c5100e), null, AbstractC16653e.license(2010744742, new C1939e(c1922e), c13770e2), null, null, 0.0f, 0.0f, ((C0916e) c13770e2.adcel(AbstractC12450e.ad)).appmetrica(c13770e2), AbstractC9083e.license(((C7019e) c13770e2.adcel(c15492e)).ad.Signature, ((C7019e) c13770e2.adcel(c15492e)).ad.Signature, 0L, c13770e2, 28), interfaceC2566e, c13770e2, 3078, 244);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC2566e interfaceC2566e2 = (InterfaceC2566e) obj4;
                C5838e c5838e = (C5838e) obj3;
                C13770e c13770e3 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C16005e c16005e2 = AbstractC9083e.ad;
                    C15492e c15492e2 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC0173e.ad, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e3.adcel(c15492e2)).ad.Signature, c5100e), null, AbstractC16653e.license(-1912436534, new C0474e(c5838e), c13770e3), null, null, 0.0f, 0.0f, ((C0916e) c13770e3.adcel(AbstractC12450e.ad)).appmetrica(c13770e3), AbstractC9083e.license(((C7019e) c13770e3.adcel(c15492e2)).ad.Signature, ((C7019e) c13770e3.adcel(c15492e2)).ad.Signature, 0L, c13770e3, 28), interfaceC2566e2, c13770e3, 3078, 244);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                Activity activity = (Activity) obj4;
                InterfaceC4977e interfaceC4977e = (InterfaceC4977e) obj3;
                C13770e c13770e4 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e4.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    String appmetrica = AbstractC5297e.appmetrica(c13770e4, R.string.error_occurred_info);
                    C1839e c1839e = ((C7019e) c13770e4.adcel(AbstractC11785e.ad)).vip.smaato;
                    InterfaceC12864e ad = C14486e.ad.ad(c0115e, C5438e.f11695e);
                    Object m3681throw = c13770e4.m3681throw();
                    if (m3681throw == c5170e) {
                        m3681throw = AbstractC17861e.adcel(c13770e4);
                    }
                    C15274e c15274e = (C15274e) m3681throw;
                    C6144e ad2 = AbstractC17394e.ad(7, 0.0f);
                    boolean yandex = c13770e4.yandex(activity) | c13770e4.yandex(interfaceC4977e);
                    Object m3681throw2 = c13770e4.m3681throw();
                    if (yandex || m3681throw2 == c5170e) {
                        m3681throw2 = new C1872e(activity, interfaceC4977e, 1);
                        c13770e4.m3682throws(m3681throw2);
                    }
                    Function0 function0 = (Function0) m3681throw2;
                    boolean yandex2 = c13770e4.yandex(activity);
                    Object m3681throw3 = c13770e4.m3681throw();
                    if (yandex2 || m3681throw3 == c5170e) {
                        m3681throw3 = new C4669e(activity, 0);
                        c13770e4.m3682throws(m3681throw3);
                    }
                    AbstractC14489e.vip(appmetrica, AbstractC12220e.mopub(AbstractC9546e.appmetrica(ad, c15274e, ad2, false, function0, (Function0) m3681throw3, 444), 12), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, c1839e, c13770e4, 0, 0, 131068);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC11906e.vip((InterfaceC4977e) obj4, (InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(49));
                return Unit.INSTANCE;
            case 4:
                InterfaceC2566e interfaceC2566e3 = (InterfaceC2566e) obj4;
                C4921e c4921e = (C4921e) obj3;
                C13770e c13770e5 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c13770e5.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    C16005e c16005e3 = AbstractC9083e.ad;
                    C15492e c15492e3 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC12947e.ad, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e5.adcel(c15492e3)).ad.Signature, c5100e), null, AbstractC16653e.license(2145404348, new C3286e(c4921e), c13770e5), null, null, 0.0f, 0.0f, ((C0916e) c13770e5.adcel(AbstractC12450e.ad)).appmetrica(c13770e5), AbstractC9083e.purchase(((C7019e) c13770e5.adcel(c15492e3)).ad.Signature, ((C7019e) c13770e5.adcel(c15492e3)).ad.subscription, 0L, 0L, 0L, c13770e5, 60), interfaceC2566e3, c13770e5, 3078, 244);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                InterfaceC2566e interfaceC2566e4 = (InterfaceC2566e) obj4;
                C17399e c17399e = (C17399e) obj3;
                C13770e c13770e6 = (C13770e) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (c13770e6.m3673protected(intValue5 & 1, (intValue5 & 3) != 2)) {
                    C16005e c16005e4 = AbstractC9083e.ad;
                    C15492e c15492e4 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC15946e.yandex, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e6.adcel(c15492e4)).ad.Signature, c5100e), null, AbstractC16653e.license(2068621964, new C1446e(c17399e, 1, (byte) 0), c13770e6), null, null, 0.0f, 0.0f, null, AbstractC9083e.license(((C7019e) c13770e6.adcel(c15492e4)).ad.Signature, ((C7019e) c13770e6.adcel(c15492e4)).ad.subscription, 0L, c13770e6, 28), interfaceC2566e4, c13770e6, 3078, 500);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 6:
                C14995e c14995e = (C14995e) obj4;
                C14479e c14479e = (C14479e) obj3;
                int intValue6 = ((Integer) obj).intValue();
                if (obj2 instanceof InterfaceC16503e) {
                    ((C12431e) c14995e.purchase).license((InterfaceC16503e) obj2);
                } else if (!(obj2 instanceof C2773e)) {
                    if (obj2 instanceof InterfaceC9374e) {
                        AbstractC4224e.mopub(c14479e, intValue6, obj2);
                        c14995e.billing((InterfaceC9374e) obj2);
                    } else if (obj2 instanceof C2846e) {
                        AbstractC4224e.mopub(c14479e, intValue6, obj2);
                        ((C2846e) obj2).license();
                    }
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC11765e.vip((C3247e) obj4, (C2892e) obj3, (C13770e) obj, AbstractC5190e.advert(49));
                return Unit.INSTANCE;
            case 8:
                C10117e c10117e = (C10117e) obj4;
                C16330e c16330e = (C16330e) obj3;
                C13770e c13770e7 = (C13770e) obj;
                int intValue7 = ((Integer) obj2).intValue();
                boolean z = (intValue7 & 3) != 2;
                AbstractC7919e abstractC7919e = c13770e7.ad;
                if (c13770e7.m3673protected(intValue7 & 1, z)) {
                    float f = 16;
                    float ad3 = ((C0916e) c13770e7.adcel(AbstractC12450e.ad)).ad(c13770e7) + f;
                    C0115e c0115e2 = C0115e.f1276e;
                    InterfaceC12864e loadAd = AbstractC12220e.loadAd(c0115e2, f, 0.0f, f, ad3, 2);
                    C4789e ad4 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11678e, c13770e7, 48);
                    long j = c13770e7.f27286case;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e7.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e7, loadAd);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e7.m3666import();
                    if (c13770e7.f27292implements) {
                        c13770e7.mopub(c7309e);
                    } else {
                        c13770e7.m3684volatile();
                    }
                    C14865e c14865e = C2721e.billing;
                    AbstractC2270e.yandex(c13770e7, ad4, c14865e);
                    C14865e c14865e2 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e7, advert, c14865e2);
                    Integer valueOf = Integer.valueOf(i4);
                    C14865e c14865e3 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e7, valueOf, c14865e3);
                    C5430e c5430e = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e7, c5430e);
                    C14865e c14865e4 = C2721e.license;
                    AbstractC2270e.yandex(c13770e7, purchase, c14865e4);
                    C8464e.ad.ad(null, 0.0f, 0.0f, null, 0L, c13770e7, 196608, 31);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e7, R.string.vkx_hold_on), AbstractC18007e.metrica(c0115e2, 1.0f), AbstractC0903e.license(c13770e7).admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e7).appmetrica, c13770e7, 48, 0, 130040);
                    AbstractC12534e.ad(c13770e7, AbstractC18007e.license(c0115e2, f));
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e7, R.string.vkx_hold_on_text), AbstractC18007e.metrica(c0115e2, 1.0f), AbstractC0903e.license(c13770e7).remoteconfig, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e7).mopub, c13770e7, 48, 0, 130040);
                    float f2 = 8;
                    AbstractC12534e.ad(c13770e7, AbstractC18007e.license(c0115e2, f2));
                    AbstractC16429e.ad(AbstractC13438e.ad, null, null, AbstractC13438e.vip, AbstractC13438e.metrica, null, null, 0.0f, 0.0f, c13770e7, 27654, 486);
                    AbstractC16429e.ad(AbstractC13438e.license, null, null, AbstractC13438e.appmetrica, AbstractC13438e.purchase, null, null, 0.0f, 0.0f, c13770e7, 27654, 486);
                    AbstractC12534e.ad(c13770e7, AbstractC18007e.license(c0115e2, f2));
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e7, R.string.vkx_hold_on_disclaimer), null, AbstractC0903e.license(c13770e7).remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e7).advert, c13770e7, 0, 0, 131066);
                    AbstractC12534e.ad(c13770e7, AbstractC18007e.license(c0115e2, f));
                    InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e2, 1.0f);
                    C8587e ad5 = AbstractC6451e.ad(AbstractC16497e.billing(f), C5438e.f11685e, c13770e7, 6);
                    long j2 = c13770e7.f27286case;
                    int i5 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert2 = c13770e7.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e7, metrica);
                    c13770e7.m3666import();
                    if (c13770e7.f27292implements) {
                        c13770e7.mopub(c7309e);
                    } else {
                        c13770e7.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e7, ad5, c14865e);
                    AbstractC2270e.yandex(c13770e7, advert2, c14865e2);
                    AbstractC8703e.premium(i5, c13770e7, c14865e3, c13770e7, c5430e);
                    AbstractC2270e.yandex(c13770e7, purchase2, c14865e4);
                    boolean yandex3 = c13770e7.yandex(c10117e);
                    Object m3681throw4 = c13770e7.m3681throw();
                    if (yandex3 || m3681throw4 == c5170e) {
                        C15101e c15101e = new C15101e(0, c10117e, C10117e.class, "dismiss", "dismiss()V", 0, 0, 10);
                        c13770e7.m3682throws(c15101e);
                        m3681throw4 = c15101e;
                    }
                    InterfaceC5261e interfaceC5261e = (InterfaceC5261e) m3681throw4;
                    C16005e c16005e5 = new C16005e(f, f, f, f);
                    C16005e c16005e6 = AbstractC10244e.ad;
                    C3134e ad6 = AbstractC10244e.ad(AbstractC0903e.license(c13770e7).subscription, AbstractC0903e.license(c13770e7).admob, 0L, 0L, c13770e7, 12);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    AbstractC1513e.ad((Function0) interfaceC5261e, new C5228e(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC0903e.purchase(c13770e7).metrica, ad6, null, null, c16005e5, AbstractC13438e.billing, c13770e7, 817889280, 356);
                    C16005e c16005e7 = new C16005e(f, f, f, f);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    C5228e c5228e = new C5228e(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                    C3924e c3924e = AbstractC0903e.purchase(c13770e7).metrica;
                    boolean z2 = c16330e.purchase() == 0;
                    boolean yandex4 = c13770e7.yandex(c10117e);
                    Object m3681throw5 = c13770e7.m3681throw();
                    if (yandex4 || m3681throw5 == c5170e) {
                        m3681throw5 = new C12851e(2, c10117e);
                        c13770e7.m3682throws(m3681throw5);
                    }
                    AbstractC1513e.ad((Function0) m3681throw5, c5228e, z2, c3924e, null, null, null, c16005e7, AbstractC16653e.license(733573250, new C11839e(c16330e, 1), c13770e7), c13770e7, 817889280, 368);
                    c13770e7.Signature(true);
                    c13770e7.Signature(true);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case 9:
                C2892e c2892e = (C2892e) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                C13770e c13770e8 = (C13770e) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 3) != 2)) {
                    c2892e.invoke(arrayList, c13770e8, 0);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case 10:
                InterfaceC2566e interfaceC2566e5 = (InterfaceC2566e) obj4;
                C8606e c8606e = (C8606e) obj3;
                C13770e c13770e9 = (C13770e) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if (c13770e9.m3673protected(intValue9 & 1, (intValue9 & 3) != 2)) {
                    C16005e c16005e8 = AbstractC9083e.ad;
                    C15492e c15492e5 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC11538e.ad, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e9.adcel(c15492e5)).ad.Signature, c5100e), null, AbstractC16653e.license(2073834524, new C16823e(c8606e), c13770e9), null, null, 0.0f, 0.0f, ((C0916e) c13770e9.adcel(AbstractC12450e.ad)).appmetrica(c13770e9), AbstractC9083e.license(((C7019e) c13770e9.adcel(c15492e5)).ad.Signature, ((C7019e) c13770e9.adcel(c15492e5)).ad.subscription, 0L, c13770e9, 28), interfaceC2566e5, c13770e9, 3078, 244);
                } else {
                    c13770e9.m3659default();
                }
                return Unit.INSTANCE;
            case 11:
                C8004e c8004e = (C8004e) obj4;
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj3;
                C13770e c13770e10 = (C13770e) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if (c13770e10.m3673protected(intValue10 & 1, (intValue10 & 3) != 2)) {
                    boolean yandex5 = c13770e10.yandex(c8004e);
                    Object m3681throw6 = c13770e10.m3681throw();
                    if (yandex5 || m3681throw6 == c5170e) {
                        m3681throw6 = new C5625e(c8004e, interfaceC3314e, i3);
                        c13770e10.m3682throws(m3681throw6);
                    }
                    AbstractC1513e.license((Function0) m3681throw6, null, false, null, null, null, AbstractC12797e.vip, c13770e10, 805306368, 510);
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
            case 12:
                C10707e c10707e = (C10707e) obj4;
                InterfaceC6428e interfaceC6428e = (InterfaceC6428e) obj3;
                InterfaceC14388e interfaceC14388e = (InterfaceC14388e) obj;
                C5602e c5602e = (C5602e) obj2;
                if (C5602e.billing(c5602e.ad) == Integer.MAX_VALUE) {
                    AbstractC8889e.ad("LazyHorizontalGrid's height should be bound by parent.");
                }
                int billing = C5602e.billing(c5602e.ad);
                int[] m3586for = AbstractC13480e.m3586for(c10707e.ad(billing, interfaceC14388e.mo493e(interfaceC6428e.appmetrica())));
                int[] iArr = new int[m3586for.length];
                interfaceC6428e.billing(interfaceC14388e, billing, m3586for, iArr);
                return new C12854e(m3586for, iArr);
            case 13:
                C10707e c10707e2 = (C10707e) obj4;
                InterfaceC10260e interfaceC10260e = (InterfaceC10260e) obj3;
                InterfaceC14388e interfaceC14388e2 = (InterfaceC14388e) obj;
                C5602e c5602e2 = (C5602e) obj2;
                if (C5602e.yandex(c5602e2.ad) == Integer.MAX_VALUE) {
                    AbstractC8889e.ad("LazyVerticalGrid's width should be bound by parent.");
                }
                int yandex6 = C5602e.yandex(c5602e2.ad);
                int[] m3586for2 = AbstractC13480e.m3586for(c10707e2.ad(yandex6, interfaceC14388e2.mo493e(interfaceC10260e.appmetrica())));
                int[] iArr2 = new int[m3586for2.length];
                interfaceC10260e.tapsense(interfaceC14388e2, yandex6, m3586for2, EnumC7792e.f15794e, iArr2);
                return new C12854e(m3586for2, iArr2);
            case 14:
                C10350e c10350e = (C10350e) obj4;
                C3430e c3430e = (C3430e) obj3;
                C13770e c13770e11 = (C13770e) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if (c13770e11.m3673protected(intValue11 & 1, (intValue11 & 3) != 2)) {
                    InterfaceC9153e interfaceC9153e = (InterfaceC9153e) c10350e.vip.invoke();
                    int i6 = c3430e.metrica;
                    Object obj5 = c3430e.ad;
                    if ((i6 >= interfaceC9153e.ad() || !interfaceC9153e.vip(i6).equals(obj5)) && (i6 = interfaceC9153e.appmetrica(obj5)) != -1) {
                        c3430e.metrica = i6;
                    }
                    if (i6 != -1) {
                        c13770e11.m3676strictfp(-1664741271);
                        AbstractC18129e.ad(interfaceC9153e, c10350e.ad, i6, c3430e.ad, c13770e11, 0);
                        c13770e = c13770e11;
                        c13770e.Signature(false);
                    } else {
                        c13770e = c13770e11;
                        c13770e.m3676strictfp(-1664505826);
                        c13770e.Signature(false);
                    }
                    boolean yandex7 = c13770e.yandex(c3430e);
                    Object m3681throw7 = c13770e.m3681throw();
                    if (yandex7 || m3681throw7 == c5170e) {
                        m3681throw7 = new C2109e(i3, c3430e);
                        c13770e.m3682throws(m3681throw7);
                    }
                    AbstractC17680e.vip(obj5, (Function1) m3681throw7, c13770e);
                } else {
                    c13770e11.m3659default();
                }
                return Unit.INSTANCE;
            case 15:
                return ((InterfaceC14306e) obj3).ad(new C14856e((C10350e) obj4, (InterfaceC7183e) obj), ((C5602e) obj2).ad);
            case 16:
                C2892e c2892e2 = (C2892e) obj4;
                C6017e c6017e = (C6017e) obj3;
                C13770e c13770e12 = (C13770e) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if (c13770e12.m3673protected(intValue12 & 1, (intValue12 & 3) != 2)) {
                    c2892e2.invoke(c6017e, c13770e12, 0);
                } else {
                    c13770e12.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C16005e c16005e9 = (C16005e) obj4;
                InterfaceC10260e interfaceC10260e2 = (InterfaceC10260e) obj3;
                InterfaceC14388e interfaceC14388e3 = (InterfaceC14388e) obj;
                C5602e c5602e3 = (C5602e) obj2;
                if (C5602e.yandex(c5602e3.ad) == Integer.MAX_VALUE) {
                    AbstractC8889e.ad("LazyVerticalStaggeredGrid's width should be bound by parent.");
                }
                EnumC7792e enumC7792e = EnumC7792e.f15794e;
                int yandex8 = C5602e.yandex(c5602e3.ad) - interfaceC14388e3.mo493e(AbstractC12220e.purchase(c16005e9, enumC7792e) + AbstractC12220e.billing(c16005e9, enumC7792e));
                int mo493e = yandex8 - interfaceC14388e3.mo493e(interfaceC10260e2.appmetrica());
                int i7 = mo493e / 2;
                int i8 = mo493e % 2;
                int[] iArr3 = new int[2];
                int i9 = 0;
                while (i9 < 2) {
                    if (i7 < 0) {
                        i = 0;
                    } else {
                        i = (i9 < i8 ? 1 : 0) + i7;
                    }
                    iArr3[i9] = i;
                    i9++;
                }
                int[] iArr4 = new int[2];
                interfaceC10260e2.tapsense(interfaceC14388e3, yandex8, iArr3, enumC7792e, iArr4);
                return new C0085e(iArr4, iArr3);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                InterfaceC2566e interfaceC2566e6 = (InterfaceC2566e) obj4;
                C11379e c11379e = (C11379e) obj3;
                C13770e c13770e13 = (C13770e) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if (c13770e13.m3673protected(intValue13 & 1, (intValue13 & 3) != 2)) {
                    C16005e c16005e10 = AbstractC9083e.ad;
                    C15492e c15492e6 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC17416e.ad, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e13.adcel(c15492e6)).ad.Signature, c5100e), null, AbstractC16653e.license(745180077, new C6618e(c11379e), c13770e13), null, null, 0.0f, 0.0f, ((C0916e) c13770e13.adcel(AbstractC12450e.ad)).appmetrica(c13770e13), AbstractC9083e.license(((C7019e) c13770e13.adcel(c15492e6)).ad.Signature, ((C7019e) c13770e13.adcel(c15492e6)).ad.Signature, 0L, c13770e13, 28), interfaceC2566e6, c13770e13, 3078, 244);
                } else {
                    c13770e13.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                InterfaceC2566e interfaceC2566e7 = (InterfaceC2566e) obj4;
                C5164e c5164e = (C5164e) obj3;
                C13770e c13770e14 = (C13770e) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if (c13770e14.m3673protected(intValue14 & 1, (intValue14 & 3) != 2)) {
                    C16005e c16005e11 = AbstractC9083e.ad;
                    C15492e c15492e7 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC7237e.ad, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e14.adcel(c15492e7)).ad.Signature, c5100e), null, AbstractC16653e.license(-389150857, new C10691e(c5164e), c13770e14), null, null, 0.0f, 0.0f, ((C0916e) c13770e14.adcel(AbstractC12450e.ad)).appmetrica(c13770e14), AbstractC9083e.purchase(((C7019e) c13770e14.adcel(c15492e7)).ad.Signature, ((C7019e) c13770e14.adcel(c15492e7)).ad.Signature, 0L, 0L, 0L, c13770e14, 60), interfaceC2566e7, c13770e14, 3078, 244);
                } else {
                    c13770e14.m3659default();
                }
                return Unit.INSTANCE;
            case 20:
                Catalog2Block catalog2Block = (Catalog2Block) obj4;
                InterfaceC8370e interfaceC8370e = (InterfaceC8370e) obj3;
                C13770e c13770e15 = (C13770e) obj;
                int intValue15 = ((Integer) obj2).intValue();
                if (c13770e15.m3673protected(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Object m3681throw8 = c13770e15.m3681throw();
                    if (m3681throw8 == c5170e) {
                        Iterable iterable = ((Catalog2Block.ActionsBlock) catalog2Block).metrica;
                        if (iterable == null) {
                            iterable = C13664e.f27089e;
                        }
                        m3681throw8 = AbstractC8228e.license(iterable);
                        c13770e15.m3682throws(m3681throw8);
                    }
                    AbstractC2467e.ad((AbstractC11110e) m3681throw8, null, AbstractC16653e.license(587944110, new C6599e(26, interfaceC8370e), c13770e15), c13770e15, 392, 2);
                } else {
                    c13770e15.m3659default();
                }
                return Unit.INSTANCE;
            case 21:
                InterfaceC2566e interfaceC2566e8 = (InterfaceC2566e) obj4;
                C5344e c5344e = (C5344e) obj3;
                C13770e c13770e16 = (C13770e) obj;
                int intValue16 = ((Integer) obj2).intValue();
                if (c13770e16.m3673protected(intValue16 & 1, (intValue16 & 3) != 2)) {
                    C16005e c16005e12 = AbstractC9083e.ad;
                    C15492e c15492e8 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC15890e.ad, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e16.adcel(c15492e8)).ad.Signature, c5100e), null, AbstractC16653e.license(-1119320342, new C7828e(c5344e), c13770e16), null, null, 0.0f, 0.0f, null, AbstractC9083e.license(((C7019e) c13770e16.adcel(c15492e8)).ad.Signature, ((C7019e) c13770e16.adcel(c15492e8)).ad.subscription, 0L, c13770e16, 28), interfaceC2566e8, c13770e16, 3078, 500);
                } else {
                    c13770e16.m3659default();
                }
                return Unit.INSTANCE;
            case 22:
                InterfaceC2566e interfaceC2566e9 = (InterfaceC2566e) obj4;
                C7897e c7897e = (C7897e) obj3;
                C13770e c13770e17 = (C13770e) obj;
                int intValue17 = ((Integer) obj2).intValue();
                if (c13770e17.m3673protected(intValue17 & 1, (intValue17 & 3) != 2)) {
                    C16005e c16005e13 = AbstractC9083e.ad;
                    C15492e c15492e9 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC7070e.ad, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e17.adcel(c15492e9)).ad.Signature, c5100e), null, AbstractC16653e.license(829772446, new C1144e(c7897e), c13770e17), null, null, 0.0f, 0.0f, ((C0916e) c13770e17.adcel(AbstractC12450e.ad)).appmetrica(c13770e17), AbstractC9083e.license(((C7019e) c13770e17.adcel(c15492e9)).ad.Signature, ((C7019e) c13770e17.adcel(c15492e9)).ad.Signature, 0L, c13770e17, 28), interfaceC2566e9, c13770e17, 3078, 244);
                } else {
                    c13770e17.m3659default();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                AbstractC4465e.vip((CustomCatalogBlockItem) obj4, (InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((Integer) obj2).getClass();
                AbstractC0487e.ad((C12911e) obj4, (InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C10375e c10375e = (C10375e) obj4;
                C2892e c2892e3 = (C2892e) obj3;
                C13770e c13770e18 = (C13770e) obj;
                int intValue18 = ((Integer) obj2).intValue();
                if (c13770e18.m3673protected(intValue18 & 1, (intValue18 & 3) != 2)) {
                    AbstractC10600e.ad(c10375e.adcel, c2892e3, c13770e18, 0);
                } else {
                    c13770e18.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((Integer) obj2).getClass();
                ((C16918e) obj4).mo2588transient((Function0) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                EnumC12987e enumC12987e = (EnumC12987e) obj4;
                C16918e c16918e = (C16918e) obj3;
                C13770e c13770e19 = (C13770e) obj;
                int intValue19 = ((Integer) obj2).intValue();
                if (c13770e19.m3673protected(intValue19 & 1, (intValue19 & 3) != 2)) {
                    if (enumC12987e == ((EnumC12987e) c16918e.f33142e.getValue())) {
                        c13770e19.m3676strictfp(1121909169);
                        AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_check_circle_16, 0, c13770e19), null, null, ((C7019e) c13770e19.adcel(AbstractC11785e.ad)).ad.ad, c13770e19, 56, 4);
                    } else {
                        c13770e19.m3676strictfp(1116408901);
                    }
                    c13770e19.Signature(false);
                } else {
                    c13770e19.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((Integer) obj2).getClass();
                ((C16918e) obj4).m4226switch((C14163e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ((C17158e) obj4).m4272switch((C16607e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
