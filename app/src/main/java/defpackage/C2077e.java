package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaArtist;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.downloader.service.DownloaderService;
import ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۚ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2077e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f5377e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f5378e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5379e;

    public /* synthetic */ C2077e(Object obj, Object obj2, int i) {
        this.f5379e = i;
        this.f5378e = obj;
        this.f5377e = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.f5379e;
        C0115e c0115e = C0115e.f1276e;
        Object obj3 = C2987e.ad;
        int i3 = 3;
        Object obj4 = this.f5377e;
        Object obj5 = this.f5378e;
        switch (i2) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Number) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C13877e c13877e = (C13877e) obj5;
                    EnumC6916e enumC6916e = (EnumC6916e) obj4;
                    Object m3681throw = c13770e.m3681throw();
                    if (m3681throw == obj3) {
                        m3681throw = AbstractC4628e.purchase(c13877e.pro(), enumC6916e.f14176e);
                        c13770e.m3682throws(m3681throw);
                    }
                    float f = 8;
                    AbstractC16268e.ad(AbstractC6845e.ad((Drawable) m3681throw, c13770e), AbstractC12220e.smaato(AbstractC18007e.startapp(AbstractC12447e.vip(c0115e, AbstractC6549e.ad(f)), 52), 0.0f, f, 1), null, null, 0.0f, c13770e, 56, 120);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Number) obj2).intValue();
                C6571e c6571e = (C6571e) obj4;
                C3248e c3248e = (C3248e) obj5;
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object obj6 = C3248e.f7380e;
                    boolean billing = AbstractC7890e.billing((String) c3248e.f7383e.getValue(), c6571e.f13544e);
                    boolean yandex = c13770e2.yandex(c3248e) | c13770e2.purchase(c6571e);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex || m3681throw2 == obj3) {
                        m3681throw2 = new C7482e(c3248e, c6571e, 1);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC4530e.ad(billing, (Function0) m3681throw2, null, false, null, c13770e2, 0);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c13770e3.ads()) {
                    c13770e3.m3659default();
                } else {
                    ((C2892e) obj5).invoke((C1631e) obj4, c13770e3, 0);
                }
                return Unit.INSTANCE;
            case 3:
                int intValue3 = ((Number) obj).intValue();
                int intValue4 = ((Number) obj2).intValue();
                AbstractC3002e abstractC3002e = (AbstractC3002e) obj5;
                if (abstractC3002e instanceof C1390e) {
                    abstractC3002e.ad().vip = intValue3;
                    abstractC3002e.ad().ad = intValue4;
                    ((DedicatedCacheService) obj4).billing().startapp();
                }
                return Unit.INSTANCE;
            case 4:
                InterfaceC6647e interfaceC6647e = (InterfaceC6647e) obj4;
                InterfaceC15498e interfaceC15498e = (InterfaceC15498e) obj2;
                if (AbstractC7890e.billing((InterfaceC15498e) obj, (InterfaceC6647e) obj5) && AbstractC7890e.billing(interfaceC15498e, interfaceC6647e)) {
                    r11 = true;
                }
                return Boolean.valueOf(r11);
            case 5:
                int intValue5 = ((Number) obj).intValue();
                int intValue6 = ((Number) obj2).intValue();
                AbstractC3002e abstractC3002e2 = (AbstractC3002e) obj5;
                if (abstractC3002e2 instanceof C1390e) {
                    abstractC3002e2.ad().vip = intValue5;
                    abstractC3002e2.ad().ad = intValue6;
                    ((DownloaderService) obj4).billing().startapp();
                }
                return Unit.INSTANCE;
            case 6:
                C13770e c13770e4 = (C13770e) obj;
                int intValue7 = ((Number) obj2).intValue();
                C10620e c10620e = (C10620e) obj4;
                C1922e c1922e = (C1922e) obj5;
                if (c13770e4.m3673protected(intValue7 & 1, (intValue7 & 3) != 2)) {
                    boolean yandex2 = c13770e4.yandex(c1922e) | c13770e4.yandex(c10620e);
                    Object m3681throw3 = c13770e4.m3681throw();
                    if (yandex2 || m3681throw3 == obj3) {
                        m3681throw3 = new C12056e(c1922e, c10620e, 15);
                        c13770e4.m3682throws(m3681throw3);
                    }
                    AbstractC0014e.metrica((Function0) m3681throw3, AbstractC12220e.smaato(c0115e, 8, 0.0f, 2), false, null, null, null, AbstractC17487e.metrica, c13770e4, 1572912, 60);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 7:
                C13770e c13770e5 = (C13770e) obj;
                int intValue8 = ((Number) obj2).intValue();
                C11048e c11048e = (C11048e) obj5;
                if (c13770e5.m3673protected(intValue8 & 1, (intValue8 & 3) != 2)) {
                    boolean yandex3 = c13770e5.yandex(c11048e);
                    InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj4;
                    Object m3681throw4 = c13770e5.m3681throw();
                    if (yandex3 || m3681throw4 == obj3) {
                        m3681throw4 = new C12056e(c11048e, interfaceC3314e, 21);
                        c13770e5.m3682throws(m3681throw4);
                    }
                    AbstractC0014e.metrica((Function0) m3681throw4, null, false, null, null, null, AbstractC12797e.amazon, c13770e5, 1572864, 62);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 8:
                C13770e c13770e6 = (C13770e) obj;
                int intValue9 = ((Number) obj2).intValue();
                if (c13770e6.m3673protected(intValue9 & 1, (intValue9 & 3) != 2)) {
                    List metrica = ((Catalog2Block) obj5).getMetrica();
                    Catalog2Button catalog2Button = metrica != null ? (Catalog2Button) AbstractC13480e.m3604this(metrica) : null;
                    if (catalog2Button == null) {
                        c13770e6.m3676strictfp(-1750027135);
                    } else {
                        c13770e6.m3676strictfp(-1750027134);
                        AbstractC15876e abstractC15876e = (AbstractC15876e) obj4;
                        List list = catalog2Button.billing;
                        if (list == null) {
                            list = C13664e.f27089e;
                        }
                        boolean yandex4 = c13770e6.yandex(abstractC15876e);
                        Object m3681throw5 = c13770e6.m3681throw();
                        if (yandex4 || m3681throw5 == obj3) {
                            m3681throw5 = new C17877e(24, abstractC15876e);
                            c13770e6.m3682throws(m3681throw5);
                        }
                        AbstractC1574e.ad(list, (Function1) m3681throw5, c13770e6, 0);
                    }
                    c13770e6.Signature(false);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 9:
                C13770e c13770e7 = (C13770e) obj;
                int intValue10 = ((Number) obj2).intValue();
                C6571e c6571e2 = (C6571e) obj4;
                C5344e c5344e = (C5344e) obj5;
                if (c13770e7.m3673protected(intValue10 & 1, (intValue10 & 3) != 2)) {
                    boolean z = c5344e.m1891private() == c6571e2.f13544e;
                    boolean yandex5 = c13770e7.yandex(c5344e) | c13770e7.purchase(c6571e2);
                    Object m3681throw6 = c13770e7.m3681throw();
                    if (yandex5 || m3681throw6 == obj3) {
                        m3681throw6 = new C10522e(c5344e, c6571e2, 1);
                        c13770e7.m3682throws(m3681throw6);
                    }
                    AbstractC4530e.ad(z, (Function0) m3681throw6, null, false, null, c13770e7, 0);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case 10:
                C13770e c13770e8 = (C13770e) obj;
                int intValue11 = ((Number) obj2).intValue();
                View view = (View) obj4;
                if (c13770e8.m3673protected(intValue11 & 1, (intValue11 & 3) != 2)) {
                    C12692e c12692e = (C12692e) obj5;
                    boolean yandex6 = c13770e8.yandex(view);
                    Object m3681throw7 = c13770e8.m3681throw();
                    if (yandex6 || m3681throw7 == obj3) {
                        m3681throw7 = new C17877e(26, view);
                        c13770e8.m3682throws(m3681throw7);
                    }
                    Function1 function1 = (Function1) m3681throw7;
                    boolean yandex7 = c13770e8.yandex(view);
                    Object m3681throw8 = c13770e8.m3681throw();
                    if (yandex7 || m3681throw8 == obj3) {
                        m3681throw8 = new C17197e(i3, view);
                        c13770e8.m3682throws(m3681throw8);
                    }
                    InterfaceC12864e billing2 = AbstractC5542e.billing(c12692e, null, function1, (Function0) m3681throw8, 19);
                    Object m3681throw9 = c13770e8.m3681throw();
                    if (m3681throw9 == obj3) {
                        m3681throw9 = C2997e.f7047e;
                        c13770e8.m3682throws(m3681throw9);
                    }
                    AbstractC0014e.metrica((Function0) m3681throw9, billing2, false, null, null, null, AbstractC18275e.metrica, c13770e8, 1572870, 60);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case 11:
                C13770e c13770e9 = (C13770e) obj;
                int intValue12 = ((Number) obj2).intValue();
                if (c13770e9.m3673protected(intValue12 & 1, (intValue12 & 3) != 2)) {
                    if (((C10876e) ((InterfaceC16132e) obj4).getValue()).f21545e == ((EnumC5778e) obj5)) {
                        c13770e9.m3676strictfp(-1452769183);
                        AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_check, 0, c13770e9), null, null, 0L, c13770e9, 56, 12);
                    } else {
                        c13770e9.m3676strictfp(-1466659570);
                    }
                    c13770e9.Signature(false);
                } else {
                    c13770e9.m3659default();
                }
                return Unit.INSTANCE;
            case 12:
                C13770e c13770e10 = (C13770e) obj;
                int intValue13 = ((Number) obj2).intValue();
                if (c13770e10.m3673protected(intValue13 & 1, (intValue13 & 3) != 2)) {
                    if (((C10876e) obj5).f21542e == ((EnumC4169e) obj4)) {
                        c13770e10.m3676strictfp(-797527721);
                        AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_check, 0, c13770e10), null, null, 0L, c13770e10, 56, 12);
                    } else {
                        c13770e10.m3676strictfp(-807263984);
                    }
                    c13770e10.Signature(false);
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
            case 13:
                C13770e c13770e11 = (C13770e) obj;
                int intValue14 = ((Number) obj2).intValue();
                if (c13770e11.m3673protected(intValue14 & 1, (intValue14 & 3) != 2)) {
                    C12785e c12785e = (C12785e) obj5;
                    C17196e c17196e = (C17196e) obj4;
                    C8587e ad = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11685e, c13770e11, 0);
                    long j = c13770e11.f27286case;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e11.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e11, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    Function0 function0 = C2721e.vip;
                    c13770e11.m3666import();
                    if (c13770e11.f27292implements) {
                        c13770e11.mopub(function0);
                    } else {
                        c13770e11.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e11, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e11, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e11, Integer.valueOf(i4), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e11, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e11, purchase, C2721e.license);
                    boolean yandex8 = c13770e11.yandex(c12785e) | c13770e11.yandex(c17196e);
                    Object m3681throw10 = c13770e11.m3681throw();
                    if (yandex8 || m3681throw10 == obj3) {
                        m3681throw10 = new C2980e(c12785e, c17196e, 0);
                        c13770e11.m3682throws(m3681throw10);
                    }
                    AbstractC0014e.metrica((Function0) m3681throw10, null, false, null, null, null, C17150e.startapp, c13770e11, 1572864, 62);
                    boolean yandex9 = c13770e11.yandex(c12785e) | c13770e11.yandex(c17196e);
                    Object m3681throw11 = c13770e11.m3681throw();
                    if (yandex9 || m3681throw11 == obj3) {
                        m3681throw11 = new C2980e(c12785e, c17196e, 1);
                        c13770e11.m3682throws(m3681throw11);
                    }
                    AbstractC0014e.metrica((Function0) m3681throw11, null, false, null, null, null, C17150e.adcel, c13770e11, 1572864, 62);
                    c13770e11.Signature(true);
                } else {
                    c13770e11.m3659default();
                }
                return Unit.INSTANCE;
            case 14:
                C13770e c13770e12 = (C13770e) obj;
                int intValue15 = ((Number) obj2).intValue();
                if (c13770e12.m3673protected(intValue15 & 1, (intValue15 & 3) != 2)) {
                    C8510e c8510e = (C8510e) obj5;
                    C11235e c11235e = (C11235e) obj4;
                    String str = c11235e.vip;
                    InterfaceC10081e interfaceC10081e = c11235e.appmetrica;
                    if (interfaceC10081e instanceof C6166e) {
                        i = R.drawable.placeholder_album;
                    } else {
                        if (!(interfaceC10081e instanceof C16092e)) {
                            throw new C14803e(10);
                        }
                        i = R.drawable.placeholder_playlist;
                    }
                    c8510e.m2434package(str, i, c13770e12, 0);
                } else {
                    c13770e12.m3659default();
                }
                return Unit.INSTANCE;
            case 15:
                C13770e c13770e13 = (C13770e) obj;
                int intValue16 = ((Number) obj2).intValue();
                InterfaceC5178e interfaceC5178e = (InterfaceC5178e) obj4;
                if (c13770e13.m3673protected(intValue16 & 1, (intValue16 & 3) != 2)) {
                    C12692e c12692e2 = (C12692e) obj5;
                    boolean yandex10 = c13770e13.yandex(interfaceC5178e);
                    Object m3681throw12 = c13770e13.m3681throw();
                    if (yandex10 || m3681throw12 == obj3) {
                        m3681throw12 = new C13682e(interfaceC5178e, 1);
                        c13770e13.m3682throws(m3681throw12);
                    }
                    Function1 function12 = (Function1) m3681throw12;
                    boolean yandex11 = c13770e13.yandex(interfaceC5178e);
                    Object m3681throw13 = c13770e13.m3681throw();
                    if (yandex11 || m3681throw13 == obj3) {
                        m3681throw13 = new C17814e(interfaceC5178e, 1);
                        c13770e13.m3682throws(m3681throw13);
                    }
                    InterfaceC12864e billing3 = AbstractC5542e.billing(c12692e2, null, function12, (Function0) m3681throw13, 19);
                    Object m3681throw14 = c13770e13.m3681throw();
                    if (m3681throw14 == obj3) {
                        m3681throw14 = C2997e.f7045e;
                        c13770e13.m3682throws(m3681throw14);
                    }
                    AbstractC0014e.metrica((Function0) m3681throw14, billing3, false, null, null, null, AbstractC9186e.metrica, c13770e13, 1572870, 60);
                } else {
                    c13770e13.m3659default();
                }
                return Unit.INSTANCE;
            case 16:
                C13770e c13770e14 = (C13770e) obj;
                int intValue17 = ((Number) obj2).intValue();
                if (c13770e14.m3673protected(intValue17 & 1, (intValue17 & 3) != 2)) {
                    if (((C0943e) obj5).f3365e >= ((C6267e) obj4).f13083e.purchase()) {
                        c13770e14.m3676strictfp(-1228314472);
                        AbstractC12121e.ad(AbstractC18007e.startapp(c0115e, 8), AbstractC6549e.ad, ((C7019e) c13770e14.adcel(AbstractC11785e.ad)).ad.ad, 0L, 0.0f, 0.0f, null, AbstractC18491e.license, c13770e14, 12582918, 120);
                    } else {
                        c13770e14.m3676strictfp(-1234599753);
                    }
                    c13770e14.Signature(false);
                } else {
                    c13770e14.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C13770e c13770e15 = (C13770e) obj;
                int intValue18 = ((Number) obj2).intValue();
                EnumC7437e enumC7437e = (EnumC7437e) obj5;
                InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) obj4;
                if (c13770e15.m3673protected(intValue18 & 1, (intValue18 & 3) != 2)) {
                    boolean booleanValue = ((Boolean) interfaceC3314e2.getValue()).booleanValue();
                    boolean license = c13770e15.license(enumC7437e.ordinal());
                    Object m3681throw15 = c13770e15.m3681throw();
                    if (license || m3681throw15 == obj3) {
                        m3681throw15 = new C11558e(enumC7437e, interfaceC3314e2);
                        c13770e15.m3682throws(m3681throw15);
                    }
                    AbstractC8844e.ad(booleanValue, (Function1) ((InterfaceC5261e) m3681throw15), null, false, null, c13770e15, 0, 124);
                } else {
                    c13770e15.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C13770e c13770e16 = (C13770e) obj;
                int intValue19 = ((Number) obj2).intValue();
                if (c13770e16.m3673protected(intValue19 & 1, (intValue19 & 3) != 2)) {
                    if (((EnumC7808e) ((C4031e) obj5).f8964e.getValue()) == ((EnumC7808e) obj4)) {
                        c13770e16.m3676strictfp(1742502094);
                        AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_check, 0, c13770e16), null, null, 0L, c13770e16, 56, 12);
                    } else {
                        c13770e16.m3676strictfp(1724690951);
                    }
                    c13770e16.Signature(false);
                } else {
                    c13770e16.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e17 = (C13770e) obj;
                int intValue20 = ((Number) obj2).intValue();
                if (c13770e17.m3673protected(intValue20 & 1, (intValue20 & 3) != 2)) {
                    AbstractC10727e abstractC10727e = (AbstractC10727e) obj4;
                    AbstractC8461e.vip(((UmaArtist) obj5).license.metrica, null, AbstractC12447e.vip(AbstractC18007e.startapp(c0115e, 48), AbstractC6549e.ad), abstractC10727e, abstractC10727e, C16477e.ad, c13770e17, 36912, 6, 31712);
                } else {
                    c13770e17.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
