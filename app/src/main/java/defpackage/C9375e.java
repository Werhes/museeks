package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9375e implements Function4 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18635e;

    public /* synthetic */ C9375e(int i) {
        this.f18635e = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i = this.f18635e;
        int i2 = 14;
        int i3 = 6;
        C0115e c0115e = C0115e.f1276e;
        byte b = 0;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj3;
                ((Integer) obj4).getClass();
                InterfaceC7860e interfaceC7860e = (InterfaceC7860e) ((AbstractC6986e) obj2).vip();
                if (interfaceC7860e == null) {
                    c13770e.m3676strictfp(-959335886);
                    z = false;
                } else {
                    z = false;
                    c13770e.m3676strictfp(2047263663);
                    interfaceC7860e.ad(AbstractC18007e.metrica, c13770e, 6);
                }
                c13770e.Signature(z);
                return Unit.INSTANCE;
            case 1:
                C5701e c5701e = (C5701e) obj;
                C12160e c12160e = (C12160e) obj2;
                Rect rect = (Rect) obj3;
                if (!((Boolean) obj4).booleanValue()) {
                    c5701e.ad(c12160e.ad(rect));
                    return Unit.INSTANCE;
                }
                Rect rect2 = new Rect(0, 0, rect.height(), rect.width());
                C13116e ad = c12160e.ad(rect2);
                boolean z2 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
                c12160e.metrica = rect2.height();
                c5701e.ad(ad, z2 ? c12160e.purchase : c12160e.appmetrica);
                return Unit.INSTANCE;
            case 2:
                C5701e c5701e2 = (C5701e) obj;
                C12160e c12160e2 = (C12160e) obj2;
                Rect rect3 = (Rect) obj3;
                if (!((Boolean) obj4).booleanValue()) {
                    c5701e2.ad(c12160e2.ad(rect3));
                    return Unit.INSTANCE;
                }
                Rect rect4 = new Rect(0, 0, rect3.height(), rect3.width());
                C13116e ad2 = c12160e2.ad(rect4);
                boolean z3 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
                c12160e2.metrica = rect4.height();
                c5701e2.ad(ad2, z3 ? c12160e2.purchase : c12160e2.appmetrica);
                return Unit.INSTANCE;
            case 3:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                C13770e c13770e2 = (C13770e) obj3;
                ((Integer) obj4).getClass();
                C14544e c14544e = C5438e.f11668e;
                if (booleanValue) {
                    c13770e2.m3676strictfp(1158397261);
                    C8587e ad3 = AbstractC6451e.ad(AbstractC16497e.ad, c14544e, c13770e2, 48);
                    long j = c13770e2.f27286case;
                    int i4 = (int) (j ^ (j >>> 32));
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
                    AbstractC2270e.yandex(c13770e2, ad3, C2721e.billing);
                    AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e2, Integer.valueOf(i4), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_check, 0, c13770e2), null, null, 0L, c13770e2, 56, 12);
                    AbstractC12534e.ad(c13770e2, AbstractC18007e.smaato(c0115e, 16));
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e2, R.string.mab_added), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                    c13770e2.Signature(true);
                    c13770e2.Signature(false);
                } else {
                    c13770e2.m3676strictfp(1159014161);
                    C8587e ad4 = AbstractC6451e.ad(AbstractC16497e.ad, c14544e, c13770e2, 48);
                    long j2 = c13770e2.f27286case;
                    int i5 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert2 = c13770e2.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e2 = C2721e.vip;
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e2);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e2, ad4, C2721e.billing);
                    AbstractC2270e.yandex(c13770e2, advert2, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e2, Integer.valueOf(i5), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e2, purchase2, C2721e.license);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_add, 0, c13770e2), null, null, 0L, c13770e2, 56, 12);
                    AbstractC12534e.ad(c13770e2, AbstractC18007e.smaato(c0115e, 16));
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e2, R.string.mab_add), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                    c13770e2.Signature(true);
                    c13770e2.Signature(false);
                }
                return Unit.INSTANCE;
            case 4:
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                C13770e c13770e3 = (C13770e) obj3;
                ((Integer) obj4).getClass();
                if (booleanValue2) {
                    c13770e3.m3676strictfp(-226220527);
                    AbstractC0702e.ad(null, ((C3618e) c13770e3.adcel(AbstractC0608e.ad)).ad, 2, 24, c13770e3, 3456);
                    c13770e3.Signature(false);
                } else {
                    c13770e3.m3676strictfp(-225930429);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_check, 0, c13770e3), null, null, ((C3618e) c13770e3.adcel(AbstractC0608e.ad)).ad, c13770e3, 56, 4);
                    c13770e3.Signature(false);
                }
                return Unit.INSTANCE;
            case 5:
                ((Boolean) obj2).getClass();
                C13770e c13770e4 = (C13770e) obj3;
                int intValue = ((Integer) obj4).intValue();
                if (c13770e4.m3673protected(intValue & 1, (intValue & 129) != 128)) {
                    AbstractC17074e.ad(AbstractC18007e.license(AbstractC18007e.metrica(c0115e, 1.0f), 1), c13770e4, 6);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 6:
                C13770e c13770e5 = (C13770e) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                C15492e c15492e = AbstractC11785e.ad;
                AbstractC14489e.vip((String) obj2, null, ((C7019e) c13770e5.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e5.adcel(c15492e)).vip.license, c13770e5, (intValue2 >> 3) & 14, 0, 131066);
                return Unit.INSTANCE;
            case 7:
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                C13770e c13770e6 = (C13770e) obj3;
                ((Integer) obj4).getClass();
                if (booleanValue3) {
                    c13770e6.m3676strictfp(108532173);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_check, 0, c13770e6), null, null, 0L, c13770e6, 56, 12);
                    c13770e6.Signature(false);
                } else {
                    c13770e6.m3676strictfp(108871654);
                    C8587e ad5 = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11668e, c13770e6, 48);
                    long j3 = c13770e6.f27286case;
                    int i6 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert3 = c13770e6.advert();
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e6, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e3 = C2721e.vip;
                    c13770e6.m3666import();
                    if (c13770e6.f27292implements) {
                        c13770e6.mopub(c7309e3);
                    } else {
                        c13770e6.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e6, ad5, C2721e.billing);
                    AbstractC2270e.yandex(c13770e6, advert3, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e6, Integer.valueOf(i6), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e6, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e6, purchase3, C2721e.license);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_add, 0, c13770e6), null, null, 0L, c13770e6, 56, 12);
                    AbstractC12534e.ad(c13770e6, AbstractC18007e.smaato(c0115e, 16));
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e6, R.string.mab_add), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e6, 0, 0, 262142);
                    c13770e6.Signature(true);
                    c13770e6.Signature(false);
                }
                return Unit.INSTANCE;
            case 8:
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                C13770e c13770e7 = (C13770e) obj3;
                ((Integer) obj4).getClass();
                if (booleanValue4) {
                    c13770e7.m3676strictfp(-504285423);
                    AbstractC0702e.ad(null, C3618e.appmetrica, 2, 32, c13770e7, 3504);
                    c13770e7.Signature(false);
                } else {
                    c13770e7.m3676strictfp(-504009461);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_like_36, 0, c13770e7), null, null, C3618e.appmetrica, c13770e7, 3128, 4);
                    c13770e7.Signature(false);
                }
                return Unit.INSTANCE;
            case 9:
                InterfaceC5738e interfaceC5738e = (InterfaceC5738e) obj2;
                C13770e c13770e8 = (C13770e) obj3;
                ((Integer) obj4).getClass();
                C9577e c9577e = C5438e.f11672e;
                C14544e c14544e2 = C5438e.f11668e;
                if (interfaceC5738e.equals(C18020e.ad)) {
                    AbstractC7919e abstractC7919e = c13770e8.ad;
                    c13770e8.m3676strictfp(-1490697831);
                    InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
                    C8587e ad6 = AbstractC6451e.ad(AbstractC16497e.billing(16), c14544e2, c13770e8, 54);
                    long j4 = c13770e8.f27286case;
                    int i7 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC3483e advert4 = c13770e8.advert();
                    InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e8, metrica);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e4 = C2721e.vip;
                    c13770e8.m3666import();
                    if (c13770e8.f27292implements) {
                        c13770e8.mopub(c7309e4);
                    } else {
                        c13770e8.m3684volatile();
                    }
                    C14865e c14865e = C2721e.billing;
                    AbstractC2270e.yandex(c13770e8, ad6, c14865e);
                    C14865e c14865e2 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e8, advert4, c14865e2);
                    Integer valueOf = Integer.valueOf(i7);
                    C14865e c14865e3 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e8, valueOf, c14865e3);
                    C5430e c5430e = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e8, c5430e);
                    C14865e c14865e4 = C2721e.license;
                    AbstractC2270e.yandex(c13770e8, purchase4, c14865e4);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_error_outline_28, 0, c13770e8), null, null, 0L, c13770e8, 56, 12);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    C5228e c5228e = new C5228e(1.0f, true);
                    C4789e ad7 = AbstractC14801e.ad(AbstractC16497e.metrica, c9577e, c13770e8, 0);
                    long j5 = c13770e8.f27286case;
                    int i8 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC3483e advert5 = c13770e8.advert();
                    InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e8, c5228e);
                    c13770e8.m3666import();
                    if (c13770e8.f27292implements) {
                        c13770e8.mopub(c7309e4);
                    } else {
                        c13770e8.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e8, ad7, c14865e);
                    AbstractC2270e.yandex(c13770e8, advert5, c14865e2);
                    AbstractC8703e.premium(i8, c13770e8, c14865e3, c13770e8, c5430e);
                    AbstractC2270e.yandex(c13770e8, purchase5, c14865e4);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e8, R.string.auth2_qr_code_scanner_hint_wrong_code), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, c13770e8, 0, 24576, 245758);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e8, R.string.auth2_qr_code_scanner_hint_wrong_code_desc), AbstractC1376e.ad(c0115e, 0.5f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, c13770e8, 48, 24576, 245756);
                    c13770e8.Signature(true);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_chevron_right, 0, c13770e8), null, null, 0L, c13770e8, 56, 12);
                    c13770e8.Signature(true);
                    c13770e8.Signature(false);
                } else if (interfaceC5738e instanceof C10705e) {
                    AbstractC7919e abstractC7919e2 = c13770e8.ad;
                    c13770e8.m3676strictfp(-1489728895);
                    InterfaceC12864e metrica2 = AbstractC18007e.metrica(c0115e, 1.0f);
                    C8587e ad8 = AbstractC6451e.ad(AbstractC16497e.billing(16), c14544e2, c13770e8, 54);
                    long j6 = c13770e8.f27286case;
                    int i9 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC3483e advert6 = c13770e8.advert();
                    InterfaceC12864e purchase6 = AbstractC5679e.purchase(c13770e8, metrica2);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e5 = C2721e.vip;
                    c13770e8.m3666import();
                    if (c13770e8.f27292implements) {
                        c13770e8.mopub(c7309e5);
                    } else {
                        c13770e8.m3684volatile();
                    }
                    C14865e c14865e5 = C2721e.billing;
                    AbstractC2270e.yandex(c13770e8, ad8, c14865e5);
                    C14865e c14865e6 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e8, advert6, c14865e6);
                    Integer valueOf2 = Integer.valueOf(i9);
                    C14865e c14865e7 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e8, valueOf2, c14865e7);
                    C5430e c5430e2 = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e8, c5430e2);
                    C14865e c14865e8 = C2721e.license;
                    AbstractC2270e.yandex(c13770e8, purchase6, c14865e8);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_external_link_outline_24, 0, c13770e8), null, null, 0L, c13770e8, 56, 12);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    C5228e c5228e2 = new C5228e(1.0f, true);
                    C4789e ad9 = AbstractC14801e.ad(AbstractC16497e.metrica, c9577e, c13770e8, 0);
                    long j7 = c13770e8.f27286case;
                    int i10 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC3483e advert7 = c13770e8.advert();
                    InterfaceC12864e purchase7 = AbstractC5679e.purchase(c13770e8, c5228e2);
                    c13770e8.m3666import();
                    if (c13770e8.f27292implements) {
                        c13770e8.mopub(c7309e5);
                    } else {
                        c13770e8.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e8, ad9, c14865e5);
                    AbstractC2270e.yandex(c13770e8, advert7, c14865e6);
                    AbstractC8703e.premium(i10, c13770e8, c14865e7, c13770e8, c5430e2);
                    AbstractC2270e.yandex(c13770e8, purchase7, c14865e8);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e8, R.string.scan_qr_action), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, c13770e8, 0, 24576, 245758);
                    AbstractC14489e.vip(((C10705e) interfaceC5738e).ad, AbstractC1376e.ad(c0115e, 0.5f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, c13770e8, 48, 24576, 245756);
                    c13770e8.Signature(true);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_chevron_right, 0, c13770e8), null, null, 0L, c13770e8, 56, 12);
                    c13770e8.Signature(true);
                    c13770e8.Signature(false);
                } else {
                    if (!interfaceC5738e.equals(C5510e.ad)) {
                        throw AbstractC1786e.loadAd(-186635879, c13770e8, false);
                    }
                    c13770e8.m3676strictfp(-1488855594);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e8, R.string.auth2_qr_code_scanner_hint_where_to_find), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e8, 0, 0, 262142);
                    c13770e8.Signature(false);
                }
                return Unit.INSTANCE;
            case 10:
                C13770e c13770e9 = (C13770e) obj3;
                ((Integer) obj4).getClass();
                int ordinal = ((EnumC12199e) obj2).ordinal();
                if (ordinal == 0) {
                    c13770e9.m3676strictfp(-1461412013);
                    c13770e9.Signature(false);
                } else if (ordinal == 1) {
                    c13770e9.m3676strictfp(-1461346479);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_voice_outline_28, 0, c13770e9), "Голосовой поиск", AbstractC18007e.startapp(c0115e, 20), ((C7019e) c13770e9.adcel(AbstractC11785e.ad)).ad.remoteconfig, c13770e9, 440, 0);
                    c13770e9.Signature(false);
                } else {
                    if (ordinal != 2) {
                        throw AbstractC1786e.loadAd(-2125352814, c13770e9, false);
                    }
                    c13770e9.m3676strictfp(-1460941123);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_close, 0, c13770e9), "Очистить поиск", AbstractC18007e.startapp(c0115e, 20), ((C7019e) c13770e9.adcel(AbstractC11785e.ad)).ad.remoteconfig, c13770e9, 440, 0);
                    c13770e9.Signature(false);
                }
                return Unit.INSTANCE;
            case 11:
                InterfaceC10957e interfaceC10957e = (InterfaceC10957e) obj2;
                C13770e c13770e10 = (C13770e) obj3;
                ((Integer) obj4).getClass();
                if (interfaceC10957e.equals(C2104e.ad)) {
                    c13770e10.m3676strictfp(-633457293);
                    String appmetrica = AbstractC5297e.appmetrica(c13770e10, R.string.spark_code_entry_description);
                    C15492e c15492e2 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica, null, ((C7019e) c13770e10.adcel(c15492e2)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e10.adcel(c15492e2)).vip.amazon, c13770e10, 0, 0, 131066);
                    c13770e10.Signature(false);
                } else if (interfaceC10957e.equals(C7194e.ad)) {
                    c13770e10.m3676strictfp(-633071839);
                    AbstractC6574e.license(AbstractC18007e.metrica(c0115e, 1.0f), 0L, 0L, 0, 0.0f, c13770e10, 6, 30);
                    c13770e10.Signature(false);
                } else if (interfaceC10957e.equals(C12210e.ad)) {
                    c13770e10.m3676strictfp(-632843493);
                    String appmetrica2 = AbstractC5297e.appmetrica(c13770e10, R.string.spark_code_entry_error_network);
                    C15492e c15492e3 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica2, null, ((C7019e) c13770e10.adcel(c15492e3)).ad.isVip, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e10.adcel(c15492e3)).vip.amazon, c13770e10, 0, 0, 131066);
                    c13770e10.Signature(false);
                } else {
                    if (!(interfaceC10957e instanceof C1795e)) {
                        throw AbstractC1786e.loadAd(1365042195, c13770e10, false);
                    }
                    c13770e10.m3676strictfp(-632346935);
                    C17983e c17983e = ((C1795e) interfaceC10957e).ad;
                    switch (c17983e.f35274e) {
                        case SUCCESS:
                            c13770e10.m3676strictfp(-630427384);
                            String str = c17983e.f35276e;
                            if (str == null) {
                                str = BuildConfig.FLAVOR;
                            }
                            String license = AbstractC5297e.license(R.string.spark_code_entry_success, new Object[]{str}, c13770e10);
                            C15492e c15492e4 = AbstractC11785e.ad;
                            AbstractC14489e.vip(license, null, ((C7019e) c13770e10.adcel(c15492e4)).ad.ad, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e10.adcel(c15492e4)).vip.amazon, c13770e10, 0, 0, 131066);
                            c13770e10.Signature(false);
                            break;
                        case NOT_FOUND:
                            c13770e10.m3676strictfp(-631851927);
                            String appmetrica3 = AbstractC5297e.appmetrica(c13770e10, R.string.spark_code_entry_error_not_found);
                            C15492e c15492e5 = AbstractC11785e.ad;
                            AbstractC14489e.vip(appmetrica3, null, ((C7019e) c13770e10.adcel(c15492e5)).ad.isVip, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e10.adcel(c15492e5)).vip.amazon, c13770e10, 0, 0, 131066);
                            c13770e10.Signature(false);
                            break;
                        case ALREADY_USED_ELSEWHERE:
                            c13770e10.m3676strictfp(-632311378);
                            String appmetrica4 = AbstractC5297e.appmetrica(c13770e10, R.string.spark_code_entry_error_used);
                            C15492e c15492e6 = AbstractC11785e.ad;
                            AbstractC14489e.vip(appmetrica4, null, ((C7019e) c13770e10.adcel(c15492e6)).ad.isVip, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e10.adcel(c15492e6)).vip.amazon, c13770e10, 0, 0, 131066);
                            c13770e10.Signature(false);
                            break;
                        case ALREADY_USED_HERE:
                            c13770e10.m3676strictfp(-629923076);
                            String appmetrica5 = AbstractC5297e.appmetrica(c13770e10, R.string.spark_code_entry_error_code_already_activated);
                            C15492e c15492e7 = AbstractC11785e.ad;
                            AbstractC14489e.vip(appmetrica5, null, ((C7019e) c13770e10.adcel(c15492e7)).ad.isVip, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e10.adcel(c15492e7)).vip.amazon, c13770e10, 0, 0, 131066);
                            c13770e10.Signature(false);
                            break;
                        case HAS_THIS_ONE_TIME_ENTITLEMENT:
                            c13770e10.m3676strictfp(-630898367);
                            String appmetrica6 = AbstractC5297e.appmetrica(c13770e10, R.string.spark_code_entry_error_already_activated);
                            C15492e c15492e8 = AbstractC11785e.ad;
                            AbstractC14489e.vip(appmetrica6, null, ((C7019e) c13770e10.adcel(c15492e8)).ad.isVip, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e10.adcel(c15492e8)).vip.amazon, c13770e10, 0, 0, 131066);
                            c13770e10.Signature(false);
                            break;
                        case EXPIRED:
                            c13770e10.m3676strictfp(-629448373);
                            String appmetrica7 = AbstractC5297e.appmetrica(c13770e10, R.string.spark_code_entry_error_expired);
                            C15492e c15492e9 = AbstractC11785e.ad;
                            AbstractC14489e.vip(appmetrica7, null, ((C7019e) c13770e10.adcel(c15492e9)).ad.isVip, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e10.adcel(c15492e9)).vip.amazon, c13770e10, 0, 0, 131066);
                            c13770e10.Signature(false);
                            break;
                        case FLOOD_WAIT:
                            c13770e10.m3676strictfp(-628985171);
                            String appmetrica8 = AbstractC5297e.appmetrica(c13770e10, R.string.spark_code_entry_error_flood);
                            C15492e c15492e10 = AbstractC11785e.ad;
                            AbstractC14489e.vip(appmetrica8, null, ((C7019e) c13770e10.adcel(c15492e10)).ad.isVip, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e10.adcel(c15492e10)).vip.amazon, c13770e10, 0, 0, 131066);
                            c13770e10.Signature(false);
                            break;
                        case NO_USES_LEFT:
                            c13770e10.m3676strictfp(-631384633);
                            String appmetrica9 = AbstractC5297e.appmetrica(c13770e10, R.string.spark_code_entry_error_no_attempts);
                            C15492e c15492e11 = AbstractC11785e.ad;
                            AbstractC14489e.vip(appmetrica9, null, ((C7019e) c13770e10.adcel(c15492e11)).ad.isVip, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e10.adcel(c15492e11)).vip.amazon, c13770e10, 0, 0, 131066);
                            c13770e10.Signature(false);
                            break;
                        default:
                            throw AbstractC1786e.loadAd(1365075937, c13770e10, false);
                    }
                    c13770e10.Signature(false);
                }
                return Unit.INSTANCE;
            case 12:
                InterfaceC7484e interfaceC7484e = (InterfaceC7484e) obj2;
                C13770e c13770e11 = (C13770e) obj3;
                ((Integer) obj4).getClass();
                boolean z4 = interfaceC7484e instanceof C17293e;
                C0115e c0115e2 = C0115e.f1276e;
                if (z4) {
                    c13770e11.m3676strictfp(-668173149);
                    AbstractC0865e.ad(c0115e2, null, null, null, null, AbstractC16653e.license(1928259928, new C6599e(19, interfaceC7484e), c13770e11), c13770e11, 196614, 30);
                    c13770e11.Signature(false);
                } else if (interfaceC7484e.equals(C4750e.ad)) {
                    c13770e11.m3676strictfp(-667320029);
                    AbstractC6574e.license(AbstractC18007e.metrica(c0115e2, 1.0f), 0L, 0L, 0, 0.0f, c13770e11, 6, 30);
                    c13770e11.Signature(false);
                } else if (interfaceC7484e.equals(C13912e.ad)) {
                    c13770e11.m3676strictfp(-667104424);
                    String appmetrica10 = AbstractC5297e.appmetrica(c13770e11, R.string.spark_payment_window_target_selector_error_not_user);
                    C15492e c15492e12 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica10, null, ((C7019e) c13770e11.adcel(c15492e12)).ad.isVip, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e11.adcel(c15492e12)).vip.amazon, c13770e11, 0, 0, 131066);
                    c13770e11.Signature(false);
                } else if (interfaceC7484e.equals(C1406e.ad)) {
                    c13770e11.m3676strictfp(-666726441);
                    String appmetrica11 = AbstractC5297e.appmetrica(c13770e11, R.string.spark_payment_window_target_selector_error_not_found);
                    C15492e c15492e13 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica11, null, ((C7019e) c13770e11.adcel(c15492e13)).ad.isVip, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e11.adcel(c15492e13)).vip.amazon, c13770e11, 0, 0, 131066);
                    c13770e11.Signature(false);
                } else {
                    if (!interfaceC7484e.equals(C14849e.ad)) {
                        throw AbstractC1786e.loadAd(-437197145, c13770e11, false);
                    }
                    c13770e11.m3676strictfp(-666350504);
                    String appmetrica12 = AbstractC5297e.appmetrica(c13770e11, R.string.spark_payment_window_target_selector_text);
                    C15492e c15492e14 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica12, null, ((C7019e) c13770e11.adcel(c15492e14)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e11.adcel(c15492e14)).vip.amazon, c13770e11, 0, 0, 131066);
                    c13770e11.Signature(false);
                }
                return Unit.INSTANCE;
            case 13:
                int intValue3 = ((Integer) obj2).intValue();
                C13770e c13770e12 = (C13770e) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                if ((intValue4 & 48) == 0) {
                    intValue4 |= c13770e12.license(intValue3) ? 32 : 16;
                }
                if (c13770e12.m3673protected(intValue4 & 1, (intValue4 & 145) != 144)) {
                    Object m3681throw = c13770e12.m3681throw();
                    if (m3681throw == C2987e.ad) {
                        m3681throw = new C13630e(i2);
                        c13770e12.m3682throws(m3681throw);
                    }
                    AbstractC15849e.vip(false, (Function0) m3681throw, AbstractC16653e.license(1549956368, new C2172e(intValue3, i3, b), c13770e12), null, false, AbstractC16653e.license(2088200661, new C2172e(intValue3, 7, b), c13770e12), AbstractC17957e.ad, 0.0f, null, null, null, null, null, c13770e12, 113246646, 130680);
                } else {
                    c13770e12.m3659default();
                }
                return Unit.INSTANCE;
            default:
                return new C13189e((InterfaceC8850e) obj, (Context) obj2, (EnumC4478e) obj3, (C4622e) obj4);
        }
    }
}
