package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import androidx.car.app.navigation.model.Maneuver;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؓۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2173e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f5541e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f5542e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5543e;

    public /* synthetic */ C2173e(Object obj, Object obj2, int i) {
        this.f5543e = i;
        this.f5542e = obj;
        this.f5541e = obj2;
    }

    public /* synthetic */ C2173e(Object obj, Object obj2, int i, int i2) {
        this.f5543e = i2;
        this.f5542e = obj;
        this.f5541e = obj2;
    }

    public /* synthetic */ C2173e(Function2 function2, C14460e c14460e) {
        this.f5543e = 14;
        C2892e c2892e = AbstractC17864e.ad;
        this.f5542e = function2;
        this.f5541e = c14460e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C12347e c12347e;
        int i = this.f5543e;
        int i2 = 12;
        C5170e c5170e = C2987e.ad;
        C5100e c5100e = AbstractC10432e.ad;
        C0115e c0115e = C0115e.f1276e;
        int i3 = 7;
        Object obj3 = this.f5541e;
        Object obj4 = this.f5542e;
        switch (i) {
            case 0:
                List list = (List) obj4;
                C9745e c9745e = (C9745e) obj3;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                boolean z = (intValue & 3) != 2;
                AbstractC7919e abstractC7919e = c13770e.ad;
                if (c13770e.m3673protected(intValue & 1, z)) {
                    float f = 16;
                    float ad = ((C0916e) c13770e.adcel(AbstractC12450e.ad)).ad(c13770e) + f;
                    C0115e c0115e2 = C0115e.f1276e;
                    InterfaceC12864e loadAd = AbstractC12220e.loadAd(c0115e2, 0.0f, 0.0f, 0.0f, ad, 7);
                    C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11678e, c13770e, 48);
                    long j = c13770e.f27286case;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, loadAd);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e);
                    } else {
                        c13770e.m3684volatile();
                    }
                    C14865e c14865e = C2721e.billing;
                    AbstractC2270e.yandex(c13770e, ad2, c14865e);
                    C14865e c14865e2 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e, advert, c14865e2);
                    Integer valueOf = Integer.valueOf(i4);
                    C14865e c14865e3 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
                    C5430e c5430e = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e, c5430e);
                    C14865e c14865e4 = C2721e.license;
                    AbstractC2270e.yandex(c13770e, purchase, c14865e4);
                    C8464e.ad.ad(null, 0.0f, 0.0f, null, 0L, c13770e, 196608, 31);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, R.string.plus_spark_window_title), AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e2, 1.0f), f, 0.0f, 2), AbstractC0903e.license(c13770e).admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e).appmetrica, c13770e, 48, 0, 130040);
                    AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e2, f));
                    AbstractC12121e.ad(AbstractC18007e.license(AbstractC18007e.metrica(c0115e2, 1.0f), 100), AbstractC0903e.purchase(c13770e).license, AbstractC0903e.license(c13770e).subscription, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(-2076321545, new C2409e(0, list), c13770e), c13770e, 12582918, 120);
                    AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e2, f));
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, R.string.plus_spark_window_desc), AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e2, 1.0f), f, 0.0f, 2), AbstractC0903e.license(c13770e).remoteconfig, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e).mopub, c13770e, 48, 0, 130040);
                    AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e2, f));
                    InterfaceC12864e smaato = AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e2, 1.0f), f, 0.0f, 2);
                    C8587e ad3 = AbstractC6451e.ad(AbstractC16497e.billing(f), C5438e.f11685e, c13770e, 6);
                    long j2 = c13770e.f27286case;
                    int i5 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert2 = c13770e.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, smaato);
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, ad3, c14865e);
                    AbstractC2270e.yandex(c13770e, advert2, c14865e2);
                    AbstractC8703e.premium(i5, c13770e, c14865e3, c13770e, c5430e);
                    AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
                    boolean yandex = c13770e.yandex(c9745e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == c5170e) {
                        m3681throw = new C6317e(0, c9745e, C9745e.class, "dismiss", "dismiss()V", 0, 0, 17);
                        c13770e.m3682throws(m3681throw);
                    }
                    InterfaceC5261e interfaceC5261e = (InterfaceC5261e) m3681throw;
                    C16005e c16005e = new C16005e(f, f, f, f);
                    C16005e c16005e2 = AbstractC10244e.ad;
                    C3134e ad4 = AbstractC10244e.ad(AbstractC0903e.license(c13770e).subscription, AbstractC0903e.license(c13770e).admob, 0L, 0L, c13770e, 12);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    AbstractC1513e.ad((Function0) interfaceC5261e, new C5228e(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC0903e.purchase(c13770e).metrica, ad4, null, null, c16005e, C7290e.vip, c13770e, 817889280, 356);
                    C16005e c16005e3 = new C16005e(f, f, f, f);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    C5228e c5228e = new C5228e(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    C3924e c3924e = AbstractC0903e.purchase(c13770e).metrica;
                    boolean yandex2 = c13770e.yandex(c9745e);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        m3681throw2 = new C5671e(8, c9745e);
                        c13770e.m3682throws(m3681throw2);
                    }
                    AbstractC1513e.ad((Function0) m3681throw2, c5228e, false, c3924e, null, null, null, c16005e3, C7290e.metrica, c13770e, 817889280, 372);
                    c13770e.Signature(true);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC2566e interfaceC2566e = (InterfaceC2566e) obj4;
                C5422e c5422e = (C5422e) obj3;
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C16005e c16005e4 = AbstractC9083e.ad;
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC10560e.license(AbstractC12184e.ad, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e2.adcel(c15492e)).ad.Signature, c5100e), AbstractC16653e.license(2008270184, new C16328e(c5422e), c13770e2), AbstractC16653e.license(171726737, new C7721e(c5422e, 2), c13770e2), 0.0f, ((C0916e) c13770e2.adcel(AbstractC12450e.ad)).appmetrica(c13770e2), AbstractC9083e.purchase(((C7019e) c13770e2.adcel(c15492e)).ad.Signature, ((C7019e) c13770e2.adcel(c15492e)).ad.subscription, 0L, 0L, 0L, c13770e2, 60), interfaceC2566e, null, c13770e2, 3462, 272);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC15842e.license((Function0) obj4, (C17561e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC3752e.ad((Function0) obj4, (EnumC10982e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 4:
                AbstractC16696e abstractC16696e = (AbstractC16696e) obj4;
                AbstractC16696e abstractC16696e2 = (AbstractC16696e) obj3;
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    AbstractC14489e.vip(AbstractC5297e.license(R.string.cache_migration_dialog_text, new Object[]{AbstractC5297e.appmetrica(c13770e3, abstractC16696e.license()), AbstractC5297e.appmetrica(c13770e3, abstractC16696e2.license())}, c13770e3), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                InterfaceC2566e interfaceC2566e2 = (InterfaceC2566e) obj4;
                C16869e c16869e = (C16869e) obj3;
                C13770e c13770e4 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    C16005e c16005e5 = AbstractC9083e.ad;
                    C15492e c15492e2 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC5857e.subscription, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e4.adcel(c15492e2)).ad.Signature, c5100e), null, AbstractC16653e.license(-1551626846, new C15081e(c16869e, i3, (byte) 0), c13770e4), null, null, 0.0f, 0.0f, ((C0916e) c13770e4.adcel(AbstractC12450e.ad)).appmetrica(c13770e4), AbstractC9083e.license(((C7019e) c13770e4.adcel(c15492e2)).ad.Signature, ((C7019e) c13770e4.adcel(c15492e2)).ad.subscription, 0L, c13770e4, 28), interfaceC2566e2, c13770e4, 3078, 244);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 6:
                C4993e c4993e = (C4993e) obj4;
                final C7855e c7855e = (C7855e) obj3;
                C13770e c13770e5 = (C13770e) obj;
                int intValue5 = ((Integer) obj2).intValue();
                boolean z2 = (intValue5 & 3) != 2;
                AbstractC7919e abstractC7919e2 = c13770e5.ad;
                if (c13770e5.m3673protected(intValue5 & 1, z2)) {
                    float ad5 = ((C0916e) c13770e5.adcel(AbstractC12450e.ad)).ad(c13770e5);
                    C0115e c0115e3 = C0115e.f1276e;
                    InterfaceC12864e loadAd2 = AbstractC12220e.loadAd(c0115e3, 0.0f, 0.0f, 0.0f, ad5, 7);
                    C4789e ad6 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11678e, c13770e5, 48);
                    long j3 = c13770e5.f27286case;
                    int i6 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert3 = c13770e5.advert();
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e5, loadAd2);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e2 = C2721e.vip;
                    c13770e5.m3666import();
                    if (c13770e5.f27292implements) {
                        c13770e5.mopub(c7309e2);
                    } else {
                        c13770e5.m3684volatile();
                    }
                    C14865e c14865e5 = C2721e.billing;
                    AbstractC2270e.yandex(c13770e5, ad6, c14865e5);
                    C14865e c14865e6 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e5, advert3, c14865e6);
                    Integer valueOf2 = Integer.valueOf(i6);
                    C14865e c14865e7 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e5, valueOf2, c14865e7);
                    C5430e c5430e2 = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e5, c5430e2);
                    C14865e c14865e8 = C2721e.license;
                    AbstractC2270e.yandex(c13770e5, purchase3, c14865e8);
                    C8464e.ad.ad(null, 0.0f, 0.0f, null, 0L, c13770e5, 196608, 31);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e5, R.string.lyrics_share), AbstractC18007e.metrica(c0115e3, 1.0f), AbstractC0903e.license(c13770e5).admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e5).appmetrica, c13770e5, 48, 0, 130040);
                    float f2 = 16;
                    AbstractC12534e.ad(c13770e5, AbstractC18007e.license(c0115e3, f2));
                    double d = 1.0f;
                    if (d <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    C5228e c5228e2 = new C5228e(1.0f, true);
                    boolean yandex3 = c13770e5.yandex(c7855e);
                    Object m3681throw3 = c13770e5.m3681throw();
                    if (yandex3 || m3681throw3 == c5170e) {
                        m3681throw3 = new C17437e(c7855e, 2);
                        c13770e5.m3682throws(m3681throw3);
                    }
                    AbstractC7023e.ad(c5228e2, c4993e, null, null, null, null, false, null, (Function1) m3681throw3, c13770e5, 0, 508);
                    AbstractC8141e.vip(null, 0.0f, 0L, c13770e5, 0, 7);
                    C13964e billing = AbstractC16497e.billing(8);
                    C14544e c14544e = C5438e.f11668e;
                    InterfaceC12864e mopub = AbstractC12220e.mopub(AbstractC18007e.metrica(c0115e3, 1.0f), f2);
                    C8587e ad7 = AbstractC6451e.ad(billing, c14544e, c13770e5, 54);
                    long j4 = c13770e5.f27286case;
                    int i7 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC3483e advert4 = c13770e5.advert();
                    InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e5, mopub);
                    c13770e5.m3666import();
                    if (c13770e5.f27292implements) {
                        c13770e5.mopub(c7309e2);
                    } else {
                        c13770e5.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e5, ad7, c14865e5);
                    AbstractC2270e.yandex(c13770e5, advert4, c14865e6);
                    AbstractC8703e.premium(i7, c13770e5, c14865e7, c13770e5, c5430e2);
                    AbstractC2270e.yandex(c13770e5, purchase4, c14865e8);
                    if (d <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    C5228e c5228e3 = new C5228e(1.0f, true);
                    boolean z3 = !c7855e.f15903e.isEmpty();
                    C16005e c16005e6 = new C16005e(f2, f2, f2, f2);
                    C3924e c3924e2 = AbstractC0903e.purchase(c13770e5).metrica;
                    boolean yandex4 = c13770e5.yandex(c7855e);
                    Object m3681throw4 = c13770e5.m3681throw();
                    if (yandex4 || m3681throw4 == c5170e) {
                        final int i8 = 0;
                        m3681throw4 = new Function0() { // from class: eٕؕ٘
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i9 = i8;
                                C7855e c7855e2 = c7855e;
                                switch (i9) {
                                    case 0:
                                        Activity activity = c7855e2.f10582e;
                                        Intent intent = new Intent();
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", AbstractC13480e.m3608try(c7855e2.f15903e, "\n", null, null, new C17437e(c7855e2, 1), 30));
                                        activity.startActivity(Intent.createChooser(intent, c7855e2.f10582e.getResources().getText(R.string.lyrics_share)));
                                        c7855e2.purchase();
                                        return Unit.INSTANCE;
                                    default:
                                        if (c7855e2.f15903e.isEmpty()) {
                                            DecimalFormat decimalFormat = C5575e.ad;
                                            C5575e.ad(AbstractC13480e.m3608try(c7855e2.f15902e, "\n", null, null, new C4671e(10), 30));
                                        } else {
                                            DecimalFormat decimalFormat2 = C5575e.ad;
                                            C5575e.ad(AbstractC13480e.m3608try(c7855e2.f15903e, "\n", null, null, new C17437e(c7855e2, 0), 30));
                                        }
                                        c7855e2.purchase();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e5.m3682throws(m3681throw4);
                    }
                    AbstractC1513e.ad((Function0) m3681throw4, c5228e3, z3, c3924e2, null, null, null, c16005e6, AbstractC8433e.ad, c13770e5, 817889280, 368);
                    C3924e c3924e3 = AbstractC0903e.purchase(c13770e5).metrica;
                    float f3 = 12;
                    C16005e c16005e7 = new C16005e(f3, f3, f3, f3);
                    C16005e c16005e8 = AbstractC10244e.ad;
                    C3134e ad8 = AbstractC10244e.ad(AbstractC0903e.license(c13770e5).admob, AbstractC0903e.license(c13770e5).tapsense, 0L, 0L, c13770e5, 12);
                    boolean yandex5 = c13770e5.yandex(c7855e);
                    Object m3681throw5 = c13770e5.m3681throw();
                    if (yandex5 || m3681throw5 == c5170e) {
                        final int i9 = 1;
                        m3681throw5 = new Function0() { // from class: eٕؕ٘
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i92 = i9;
                                C7855e c7855e2 = c7855e;
                                switch (i92) {
                                    case 0:
                                        Activity activity = c7855e2.f10582e;
                                        Intent intent = new Intent();
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", AbstractC13480e.m3608try(c7855e2.f15903e, "\n", null, null, new C17437e(c7855e2, 1), 30));
                                        activity.startActivity(Intent.createChooser(intent, c7855e2.f10582e.getResources().getText(R.string.lyrics_share)));
                                        c7855e2.purchase();
                                        return Unit.INSTANCE;
                                    default:
                                        if (c7855e2.f15903e.isEmpty()) {
                                            DecimalFormat decimalFormat = C5575e.ad;
                                            C5575e.ad(AbstractC13480e.m3608try(c7855e2.f15902e, "\n", null, null, new C4671e(10), 30));
                                        } else {
                                            DecimalFormat decimalFormat2 = C5575e.ad;
                                            C5575e.ad(AbstractC13480e.m3608try(c7855e2.f15903e, "\n", null, null, new C17437e(c7855e2, 0), 30));
                                        }
                                        c7855e2.purchase();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e5.m3682throws(m3681throw5);
                    }
                    AbstractC1513e.ad((Function0) m3681throw5, null, false, c3924e3, ad8, null, null, c16005e7, AbstractC8433e.vip, c13770e5, 817889280, 358);
                    c13770e5.Signature(true);
                    c13770e5.Signature(true);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 7:
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj4;
                C2892e c2892e = (C2892e) obj3;
                C13770e c13770e6 = (C13770e) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 3) != 2)) {
                    c2892e.invoke(new C15122e(((Boolean) interfaceC3314e.getValue()).booleanValue()), c13770e6, 0);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ((C17975e) obj4).yandex((Drawable) obj3, (C13770e) obj, AbstractC5190e.advert(49));
                return Unit.INSTANCE;
            case 9:
                Function3 function3 = (Function3) obj4;
                C9720e c9720e = (C9720e) obj3;
                C13770e c13770e7 = (C13770e) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 3) != 2)) {
                    function3.invoke(c9720e, c13770e7, 6);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case 10:
                C15860e c15860e = (C15860e) obj4;
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj3;
                C0765e c0765e = (C0765e) obj;
                Context context = (Context) obj2;
                boolean adcel = c15860e.adcel();
                C10566e smaato2 = c15860e.smaato();
                String str = smaato2 != null ? smaato2.f20850e : null;
                C12347e c12347e2 = c15860e.tapsense;
                if (c12347e2 != null) {
                    long j5 = c12347e2.ad;
                    InterfaceC6256e interfaceC6256e = c15860e.vip;
                    c12347e = new C12347e(AbstractC9262e.metrica(interfaceC6256e.billing((int) (j5 >> 32)), interfaceC6256e.billing((int) (j5 & 4294967295L))));
                } else {
                    c12347e = null;
                }
                AbstractC0491e.ad(c0765e, context, adcel, str, c12347e, c15860e.startapp, new C9675e(9, c15860e, interfaceC18435e, context));
                return Unit.INSTANCE;
            case 11:
                C7765e c7765e = (C7765e) obj4;
                Context context2 = (Context) obj2;
                boolean smaato3 = c7765e.smaato();
                C11388e c11388e = c7765e.ad;
                AbstractC0491e.ad((C0765e) obj, context2, smaato3, c11388e.license().f33322e, new C12347e(c11388e.license().f33324e), c7765e.yandex, new C9675e(i2, c7765e, (InterfaceC18435e) obj3, context2));
                return Unit.INSTANCE;
            case 12:
                InterfaceC2566e interfaceC2566e3 = (InterfaceC2566e) obj4;
                C13622e c13622e = (C13622e) obj3;
                C13770e c13770e8 = (C13770e) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 3) != 2)) {
                    C16005e c16005e9 = AbstractC9083e.ad;
                    C15492e c15492e3 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC7354e.ad, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e8.adcel(c15492e3)).ad.Signature, c5100e), null, AbstractC16653e.license(-1671823357, new C9175e(c13622e), c13770e8), null, null, 0.0f, 0.0f, ((C0916e) c13770e8.adcel(AbstractC12450e.ad)).appmetrica(c13770e8), AbstractC9083e.license(((C7019e) c13770e8.adcel(c15492e3)).ad.Signature, ((C7019e) c13770e8.adcel(c15492e3)).ad.subscription, 0L, c13770e8, 28), interfaceC2566e3, c13770e8, 3078, 244);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case 13:
                InterfaceC2566e interfaceC2566e4 = (InterfaceC2566e) obj4;
                C12827e c12827e = (C12827e) obj3;
                C13770e c13770e9 = (C13770e) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if (c13770e9.m3673protected(intValue9 & 1, (intValue9 & 3) != 2)) {
                    C16005e c16005e10 = AbstractC9083e.ad;
                    C15492e c15492e4 = AbstractC11785e.ad;
                    AbstractC10560e.vip(AbstractC11765e.ad, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e9.adcel(c15492e4)).ad.Signature, c5100e), null, AbstractC16653e.license(726271297, new C10916e(c12827e), c13770e9), null, null, 0.0f, 0.0f, ((C0916e) c13770e9.adcel(AbstractC12450e.ad)).appmetrica(c13770e9), AbstractC9083e.license(((C7019e) c13770e9.adcel(c15492e4)).ad.Signature, ((C7019e) c13770e9.adcel(c15492e4)).ad.subscription, 0L, c13770e9, 28), interfaceC2566e4, c13770e9, 3078, 244);
                } else {
                    c13770e9.m3659default();
                }
                return Unit.INSTANCE;
            case 14:
                Function2 function2 = (Function2) obj4;
                C14460e c14460e = (C14460e) obj3;
                C2892e c2892e2 = AbstractC17864e.appmetrica;
                C13770e c13770e10 = (C13770e) obj;
                int intValue10 = ((Integer) obj2).intValue();
                C10156e c10156e = C5438e.f11676e;
                boolean z4 = (intValue10 & 3) != 2;
                AbstractC7919e abstractC7919e3 = c13770e10.ad;
                if (c13770e10.m3673protected(intValue10 & 1, z4)) {
                    float f4 = AbstractC10717e.ad;
                    AbstractC16475e.ad(c13770e10, 10);
                    C1839e ad9 = AbstractC16475e.ad(c13770e10, AbstractC10717e.license);
                    C1839e ad10 = AbstractC16475e.ad(c13770e10, AbstractC10717e.purchase);
                    InterfaceC12864e smaato4 = AbstractC12220e.smaato(c0115e, AbstractC2241e.purchase, 0.0f, 2);
                    C4789e ad11 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e10, 0);
                    long j6 = c13770e10.f27286case;
                    int i10 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC3483e advert5 = c13770e10.advert();
                    InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e10, smaato4);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e3 = C2721e.vip;
                    c13770e10.m3666import();
                    if (c13770e10.f27292implements) {
                        c13770e10.mopub(c7309e3);
                    } else {
                        c13770e10.m3684volatile();
                    }
                    C14865e c14865e9 = C2721e.billing;
                    AbstractC2270e.yandex(c13770e10, ad11, c14865e9);
                    C14865e c14865e10 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e10, advert5, c14865e10);
                    Integer valueOf3 = Integer.valueOf(i10);
                    C14865e c14865e11 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e10, valueOf3, c14865e11);
                    C5430e c5430e3 = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e10, c5430e3);
                    C14865e c14865e12 = C2721e.license;
                    AbstractC2270e.yandex(c13770e10, purchase5, c14865e12);
                    if (function2 == null) {
                        c13770e10.m3676strictfp(112051624);
                        c13770e10.Signature(false);
                    } else {
                        c13770e10.m3676strictfp(112051625);
                        InterfaceC12864e purchase6 = AbstractC5092e.purchase(AbstractC2241e.billing, Float.NaN);
                        InterfaceC2747e license = AbstractC17074e.license(c10156e, false);
                        long j7 = c13770e10.f27286case;
                        int i11 = (int) (j7 ^ (j7 >>> 32));
                        InterfaceC3483e advert6 = c13770e10.advert();
                        InterfaceC12864e purchase7 = AbstractC5679e.purchase(c13770e10, purchase6);
                        c13770e10.m3666import();
                        if (c13770e10.f27292implements) {
                            c13770e10.mopub(c7309e3);
                        } else {
                            c13770e10.m3684volatile();
                        }
                        AbstractC2270e.yandex(c13770e10, license, c14865e9);
                        AbstractC2270e.yandex(c13770e10, advert6, c14865e10);
                        AbstractC8703e.premium(i11, c13770e10, c14865e11, c13770e10, c5430e3);
                        AbstractC2270e.yandex(c13770e10, purchase7, c14865e12);
                        function2 = function2;
                        AbstractC1101e.vip(new C14815e[]{AbstractC8703e.loadAd(c14460e.metrica, AbstractC0608e.ad), AbstractC14489e.ad.ad(ad9)}, function2, c13770e10, 8);
                        c13770e10.Signature(true);
                        Unit unit = Unit.INSTANCE;
                        c13770e10.Signature(false);
                    }
                    InterfaceC12864e loadAd3 = function2 != null ? AbstractC12220e.loadAd(AbstractC5092e.purchase(AbstractC2241e.yandex, Float.NaN), 0.0f, 0.0f, 0.0f, AbstractC2241e.startapp, 7) : AbstractC12220e.smaato(c0115e, 0.0f, AbstractC2241e.license, 1);
                    InterfaceC2747e license2 = AbstractC17074e.license(c10156e, false);
                    long j8 = c13770e10.f27286case;
                    int i12 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC3483e advert7 = c13770e10.advert();
                    InterfaceC12864e purchase8 = AbstractC5679e.purchase(c13770e10, loadAd3);
                    c13770e10.m3666import();
                    if (c13770e10.f27292implements) {
                        c13770e10.mopub(c7309e3);
                    } else {
                        c13770e10.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e10, license2, c14865e9);
                    AbstractC2270e.yandex(c13770e10, advert7, c14865e10);
                    AbstractC8703e.premium(i12, c13770e10, c14865e11, c13770e10, c5430e3);
                    AbstractC2270e.yandex(c13770e10, purchase8, c14865e12);
                    AbstractC1101e.vip(new C14815e[]{AbstractC8703e.loadAd(c14460e.vip, AbstractC0608e.ad), AbstractC14489e.ad.ad(ad10)}, c2892e2, c13770e10, 8);
                    c13770e10.Signature(true);
                    c13770e10.m3676strictfp(112784836);
                    c13770e10.Signature(false);
                    c13770e10.Signature(true);
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
            case 15:
                InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) obj4;
                Function2 function22 = (Function2) obj3;
                C13770e c13770e11 = (C13770e) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if (c13770e11.m3673protected(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Object m3681throw6 = c13770e11.m3681throw();
                    if (m3681throw6 == c5170e) {
                        m3681throw6 = new C13676e(interfaceC3314e2, 7);
                        c13770e11.m3682throws(m3681throw6);
                    }
                    InterfaceC12864e license3 = AbstractC11261e.license(c0115e, (Function1) m3681throw6);
                    InterfaceC2747e license4 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j9 = c13770e11.f27286case;
                    int i13 = (int) (j9 ^ (j9 >>> 32));
                    InterfaceC3483e advert8 = c13770e11.advert();
                    InterfaceC12864e purchase9 = AbstractC5679e.purchase(c13770e11, license3);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e4 = C2721e.vip;
                    c13770e11.m3666import();
                    if (c13770e11.f27292implements) {
                        c13770e11.mopub(c7309e4);
                    } else {
                        c13770e11.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e11, license4, C2721e.billing);
                    AbstractC2270e.yandex(c13770e11, advert8, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e11, Integer.valueOf(i13), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e11, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e11, purchase9, C2721e.license);
                    function22.invoke(c13770e11, 0);
                    c13770e11.Signature(true);
                } else {
                    c13770e11.m3659default();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                ((C13817e) obj4).ad((InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(7));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((Integer) obj2).getClass();
                ((C13389e) obj4).ad((InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(7));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((Integer) obj2).getClass();
                ((C15747e) obj4).ad((InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((Integer) obj2).getClass();
                ((C16119e) obj4).ad((InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                ((C12866e) obj4).ad((InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                ((C14057e) obj4).ad((InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                ((C10070e) obj4).ad((InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                ((C16880e) obj4).ad((InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((Integer) obj2).getClass();
                ((C11086e) obj4).ad((InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((Integer) obj2).getClass();
                ((C11363e) obj4).ad((InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(7));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((Integer) obj2).getClass();
                ((C13477e) obj4).ad((InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(7));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((Integer) obj2).getClass();
                ((C1251e) obj4).ad((InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(7));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((Integer) obj2).getClass();
                ((C1251e) obj4).ad((InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(7));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ((C16901e) obj4).ad((InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(7));
                return Unit.INSTANCE;
        }
    }
}
