package defpackage;

import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۗۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6599e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f13617e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13618e;

    public /* synthetic */ C6599e(int i, Object obj) {
        this.f13618e = i;
        this.f13617e = obj;
    }

    public /* synthetic */ C6599e(C11887e c11887e, C8171e c8171e) {
        this.f13618e = 16;
        this.f13617e = c11887e;
    }

    private final Object ad(Object obj, Object obj2, Object obj3) {
        C14748e c14748e = (C14748e) this.f13617e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            boolean yandex = c13770e.yandex(c14748e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C11461e(c14748e, 1);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC17181e.license("download_use_itunes", R.string.st_itunes, R.string.st_itunes_desc, false, false, (Function1) m3681throw, c13770e, 3078, 16);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object license(Object obj, Object obj2, Object obj3) {
        C12911e c12911e = (C12911e) this.f13617e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            InterfaceC12864e mopub = AbstractC12220e.mopub(C0115e.f1276e, 16);
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(4), C5438e.f11672e, c13770e, 6);
            long j = c13770e.f27286case;
            int i = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, mopub);
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
            C7228e c7228e = c12911e.ad;
            C7228e c7228e2 = c12911e.vip;
            c13770e.m3676strictfp(561117555);
            String str = c7228e.ad;
            c13770e.Signature(false);
            C15492e c15492e = AbstractC17878e.ad;
            AbstractC10600e.vip(str, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C10375e) c13770e.adcel(c15492e)).billing, c13770e, 0, 0, 65534);
            c13770e.m3676strictfp(-225091095);
            c13770e.m3676strictfp(561117555);
            String str2 = c7228e2.ad;
            c13770e.Signature(false);
            AbstractC10600e.vip(str2, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C10375e) c13770e.adcel(c15492e)).adcel, c13770e, 0, 0, 65534);
            c13770e.Signature(false);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object purchase(Object obj, Object obj2, Object obj3) {
        C11986e c11986e = (C11986e) this.f13617e;
        C18055e c18055e = (C18055e) obj;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c13770e.purchase(c18055e) ? 4 : 2;
        }
        if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
            InterfaceC12864e mopub = AbstractC8703e.mopub(c18055e, C0115e.f1276e);
            boolean yandex = c13770e.yandex(c11986e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C12851e(20, c11986e);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC16429e.ad(AbstractC18275e.purchase, AbstractC9546e.license(mopub, false, null, (Function0) m3681throw, 15), null, AbstractC18275e.billing, null, null, null, 0.0f, 0.0f, c13770e, 3078, 500);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object vip(Object obj, Object obj2, Object obj3) {
        InterfaceC8370e interfaceC8370e = (InterfaceC8370e) this.f13617e;
        Catalog2Button catalog2Button = (Catalog2Button) obj;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? c13770e.purchase(catalog2Button) : c13770e.yandex(catalog2Button) ? 4 : 2;
        }
        boolean z = true;
        if (!c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
            c13770e.m3659default();
        } else if (catalog2Button.ad instanceof Catalog2ButtonAction.PlayVkMix) {
            c13770e.m3676strictfp(566501374);
            boolean yandex = c13770e.yandex(interfaceC8370e);
            int i = intValue & 14;
            if (i != 4 && ((intValue & 8) == 0 || !c13770e.yandex(catalog2Button))) {
                z = false;
            }
            boolean z2 = yandex | z;
            Object m3681throw = c13770e.m3681throw();
            if (z2 || m3681throw == C2987e.ad) {
                m3681throw = new C5625e(interfaceC8370e, catalog2Button, 29);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC9600e.ad(catalog2Button, (Function0) m3681throw, c13770e, 8 | i);
            c13770e.Signature(false);
        } else {
            c13770e.m3676strictfp(567243173);
            c13770e.Signature(false);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = this.f13618e;
        C14486e c14486e = C14486e.ad;
        C5170e c5170e = C2987e.ad;
        final int i2 = 2;
        C0115e c0115e = C0115e.f1276e;
        boolean z2 = true;
        char c = 1;
        Object obj4 = this.f13617e;
        switch (i) {
            case 0:
                C1545e c1545e = (C1545e) obj4;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    C7913e c7913e = AbstractC18007e.metrica;
                    InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
                    long j = c13770e.f27286case;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, c7913e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, license, C2721e.billing);
                    AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    AbstractC8461e.ad(c1545e.ad, null, c7913e, C16477e.purchase, null, c13770e, 1573296, 1976);
                    AbstractC17074e.ad(AbstractC16136e.metrica(c7913e, C3618e.vip(0.5f, C3618e.vip), AbstractC10432e.ad), c13770e, 6);
                    AbstractC10600e.vip(c1545e.vip, c14486e.ad(c0115e, C5438e.f11700e), C3618e.appmetrica, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C10375e) c13770e.adcel(AbstractC17878e.ad)).billing, c13770e, 384, 0, 65528);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) obj4;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    C7913e c7913e2 = AbstractC18007e.metrica;
                    InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j2 = c13770e2.f27286case;
                    int i4 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert2 = c13770e2.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, c7913e2);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e2 = C2721e.vip;
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e2);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e2, license2, C2721e.billing);
                    AbstractC2270e.yandex(c13770e2, advert2, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e2, Integer.valueOf(i4), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e2, purchase2, C2721e.license);
                    boolean purchase3 = c13770e2.purchase(customCatalogBlockItem);
                    Object m3681throw = c13770e2.m3681throw();
                    if (purchase3 || m3681throw == c5170e) {
                        List list = customCatalogBlockItem.metrica;
                        String license3 = list != null ? AbstractC8769e.license(list) : null;
                        c13770e2.m3682throws(license3);
                        m3681throw = license3;
                    }
                    AbstractC8461e.ad((String) m3681throw, null, c14486e.ad(c0115e, C5438e.f11700e), null, new C2815e(((C3618e) c13770e2.adcel(AbstractC0608e.ad)).ad, 5), c13770e2, 48, 1784);
                    c13770e2.Signature(true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                InterfaceC2566e interfaceC2566e = (InterfaceC2566e) obj4;
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= c13770e3.purchase(interfaceC12123e) ? 4 : 2;
                }
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 19) != 18)) {
                    InterfaceC12864e license4 = AbstractC14783e.license(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e), interfaceC2566e.ad(), null);
                    Object m3681throw2 = c13770e3.m3681throw();
                    if (m3681throw2 == c5170e) {
                        m3681throw2 = new C13887e(0);
                        c13770e3.m3682throws(m3681throw2);
                    }
                    AbstractC7023e.ad(license4, null, null, null, null, null, false, null, (Function1) m3681throw2, c13770e3, 805306368, 510);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C1251e c1251e = (C1251e) obj4;
                C13770e c13770e4 = (C13770e) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 17) != 16)) {
                    float f = 48;
                    InterfaceC12864e smaato = AbstractC12220e.smaato(AbstractC18007e.metrica, f, 0.0f, 2);
                    C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(24), C5438e.f11685e, c13770e4, 6);
                    long j3 = c13770e4.f27286case;
                    int i5 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert3 = c13770e4.advert();
                    InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e4, smaato);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e3 = C2721e.vip;
                    c13770e4.m3666import();
                    if (c13770e4.f27292implements) {
                        c13770e4.mopub(c7309e3);
                    } else {
                        c13770e4.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e4, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e4, advert3, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e4, Integer.valueOf(i5), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e4, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e4, purchase4, C2721e.license);
                    InterfaceC12864e smaato2 = AbstractC12220e.smaato(c0115e, 0.0f, f, 1);
                    if (0.75f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    InterfaceC12864e premium = smaato2.premium(new C5228e(0.75f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.75f, true));
                    C7913e c7913e3 = AbstractC18007e.vip;
                    c1251e.billing(premium.premium(c7913e3), c13770e4, 0);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    c1251e.yandex(new C5228e(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).premium(c7913e3), c13770e4, 0);
                    c13770e4.Signature(true);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                C15052e c15052e = (C15052e) obj4;
                C13770e c13770e5 = (C13770e) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 17) != 16)) {
                    boolean yandex = c13770e5.yandex(c15052e);
                    Object m3681throw3 = c13770e5.m3681throw();
                    if (yandex || m3681throw3 == c5170e) {
                        m3681throw3 = new C15326e(c15052e, 8);
                        c13770e5.m3682throws(m3681throw3);
                    }
                    AbstractC0014e.metrica((Function0) m3681throw3, null, false, null, null, null, AbstractC3752e.ad, c13770e5, 1572864, 62);
                    boolean yandex2 = c13770e5.yandex(c15052e);
                    Object m3681throw4 = c13770e5.m3681throw();
                    if (yandex2 || m3681throw4 == c5170e) {
                        m3681throw4 = new C15326e(c15052e, 9);
                        c13770e5.m3682throws(m3681throw4);
                    }
                    AbstractC0014e.metrica((Function0) m3681throw4, null, false, null, null, null, AbstractC3752e.vip, c13770e5, 1572864, 62);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                C18128e c18128e = (C18128e) obj4;
                C13770e c13770e6 = (C13770e) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 17) != 16)) {
                    c18128e.inmobi(c13770e6, 0);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 6:
                C11210e c11210e = (C11210e) obj4;
                C13770e c13770e7 = (C13770e) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 17) != 16)) {
                    float f2 = 16;
                    c11210e.m3063private(AbstractC5297e.appmetrica(c13770e7, R.string.book_about), 0, AbstractC12220e.amazon(c0115e, f2, f2, f2, 8), c13770e7, 48);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case 7:
                InterfaceC13158e interfaceC13158e = (InterfaceC13158e) obj;
                AbstractC2832e admob = ((InterfaceC16719e) obj2).admob(AbstractC2278e.appmetrica(((C5602e) obj3).ad, AbstractC2278e.ad(0, Alert.DURATION_SHOW_INDEFINITELY, interfaceC13158e.mo493e(((C15765e) ((C7102e) obj4).purchase.getValue()).f31051e), Alert.DURATION_SHOW_INDEFINITELY)));
                return interfaceC13158e.ads(admob.f6806e, admob.f6804e, C9139e.f18290e, new C4889e(admob, 3));
            case 8:
                C17954e c17954e = (C17954e) obj4;
                C16646e c16646e = (C16646e) obj;
                C13770e c13770e8 = (C13770e) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= (intValue8 & 8) == 0 ? c13770e8.purchase(c16646e) : c13770e8.yandex(c16646e) ? 4 : 2;
                }
                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 19) != 18)) {
                    AbstractC9476e.ad(c16646e, c17954e.yandex.purchase(), C3618e.vip(0.25f, ((C7019e) c13770e8.adcel(AbstractC11785e.ad)).ad.ad), c13770e8, intValue8 & 14);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case 9:
                return new C8124e(17, obj3, (C14137e) obj4, (InterfaceC11221e) obj);
            case 10:
                ((C6846e) obj4).invoke((Throwable) obj);
                return Unit.INSTANCE;
            case 11:
                C4341e c4341e = (C4341e) obj4;
                C13770e c13770e9 = (C13770e) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                boolean z3 = (intValue9 & 17) != 16;
                AbstractC7919e abstractC7919e = c13770e9.ad;
                if (c13770e9.m3673protected(intValue9 & 1, z3)) {
                    C8587e ad2 = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11668e, c13770e9, 48);
                    long j4 = c13770e9.f27286case;
                    int i6 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC3483e advert4 = c13770e9.advert();
                    InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e9, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e4 = C2721e.vip;
                    c13770e9.m3666import();
                    if (c13770e9.f27292implements) {
                        c13770e9.mopub(c7309e4);
                    } else {
                        c13770e9.m3684volatile();
                    }
                    C14865e c14865e = C2721e.billing;
                    AbstractC2270e.yandex(c13770e9, ad2, c14865e);
                    C14865e c14865e2 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e9, advert4, c14865e2);
                    Integer valueOf = Integer.valueOf(i6);
                    C14865e c14865e3 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e9, valueOf, c14865e3);
                    C5430e c5430e = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e9, c5430e);
                    C14865e c14865e4 = C2721e.license;
                    AbstractC2270e.yandex(c13770e9, purchase5, c14865e4);
                    String str = c4341e.ad;
                    String str2 = c4341e.metrica;
                    String str3 = c4341e.vip;
                    C15492e c15492e = AbstractC12491e.ad;
                    AbstractC8461e.vip(str, str3, AbstractC18007e.startapp(c0115e, 56), new C6159e(((C6032e) c13770e9.adcel(c15492e)).vip()), null, null, c13770e9, 4480, 0, 32752);
                    InterfaceC12864e advert5 = AbstractC12220e.advert(c0115e, 12, 8);
                    C4789e ad3 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e9, 0);
                    long j5 = c13770e9.f27286case;
                    int i7 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC3483e advert6 = c13770e9.advert();
                    InterfaceC12864e purchase6 = AbstractC5679e.purchase(c13770e9, advert5);
                    c13770e9.m3666import();
                    if (c13770e9.f27292implements) {
                        c13770e9.mopub(c7309e4);
                    } else {
                        c13770e9.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e9, ad3, c14865e);
                    AbstractC2270e.yandex(c13770e9, advert6, c14865e2);
                    AbstractC8703e.premium(i7, c13770e9, c14865e3, c13770e9, c5430e);
                    AbstractC2270e.yandex(c13770e9, purchase6, c14865e4);
                    String str4 = c4341e.vip;
                    C15492e c15492e2 = AbstractC17878e.ad;
                    AbstractC10600e.vip(str4, null, ((C6032e) c13770e9.adcel(c15492e)).appmetrica(), 0L, 0L, null, 0L, 2, false, str2.length() > 0 ? 1 : 2, 0, null, ((C10375e) c13770e9.adcel(c15492e2)).mopub, c13770e9, 0, 48, 55290);
                    if (str2.length() > 0) {
                        c13770e9.m3676strictfp(1507401530);
                        AbstractC10600e.vip(c4341e.metrica, null, ((C6032e) c13770e9.adcel(c15492e)).purchase(), 0L, 0L, null, 0L, 2, false, 1, 0, null, ((C10375e) c13770e9.adcel(c15492e2)).mopub, c13770e9, 0, 3120, 55290);
                        z = false;
                    } else {
                        z = false;
                        c13770e9.m3676strictfp(1501366326);
                    }
                    c13770e9.Signature(z);
                    c13770e9.Signature(true);
                    c13770e9.Signature(true);
                } else {
                    c13770e9.m3659default();
                }
                return Unit.INSTANCE;
            case 12:
                C16641e c16641e = (C16641e) obj4;
                C13770e c13770e10 = (C13770e) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                if (c13770e10.m3673protected(intValue10 & 1, (intValue10 & 17) != 16)) {
                    AbstractC8461e.ad(c16641e.ad, null, AbstractC18007e.startapp(c0115e, 120), C16477e.vip, null, c13770e10, 1573296, 1976);
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
            case 13:
                C1963e c1963e = (C1963e) obj4;
                C13770e c13770e11 = (C13770e) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                if (c13770e11.m3673protected(intValue11 & 1, (intValue11 & 17) != 16)) {
                    boolean yandex3 = c13770e11.yandex(c1963e);
                    Object m3681throw5 = c13770e11.m3681throw();
                    if (yandex3 || m3681throw5 == c5170e) {
                        m3681throw5 = new C12875e(c1963e, r7 ? 1 : 0);
                        c13770e11.m3682throws(m3681throw5);
                    }
                    AbstractC7023e.ad(null, null, null, null, null, null, false, null, (Function1) m3681throw5, c13770e11, 0, 511);
                } else {
                    c13770e11.m3659default();
                }
                return Unit.INSTANCE;
            case 14:
                Exception exc = (Exception) obj4;
                InterfaceC12123e interfaceC12123e2 = (InterfaceC12123e) obj;
                C13770e c13770e12 = (C13770e) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= c13770e12.purchase(interfaceC12123e2) ? 4 : 2;
                }
                if (c13770e12.m3673protected(intValue12 & 1, (intValue12 & 19) != 18)) {
                    InterfaceC12864e smaato3 = AbstractC12220e.smaato(AbstractC12220e.adcel(c0115e, interfaceC12123e2), 16, 0.0f, 2);
                    C4789e ad4 = AbstractC14801e.ad(AbstractC16497e.billing(8), C5438e.f11672e, c13770e12, 6);
                    long j6 = c13770e12.f27286case;
                    int i8 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC3483e advert7 = c13770e12.advert();
                    InterfaceC12864e purchase7 = AbstractC5679e.purchase(c13770e12, smaato3);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e5 = C2721e.vip;
                    c13770e12.m3666import();
                    if (c13770e12.f27292implements) {
                        c13770e12.mopub(c7309e5);
                    } else {
                        c13770e12.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e12, ad4, C2721e.billing);
                    AbstractC2270e.yandex(c13770e12, advert7, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e12, Integer.valueOf(i8), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e12, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e12, purchase7, C2721e.license);
                    String appmetrica = AbstractC5297e.appmetrica(c13770e12, R.string.cdcm_wizard_fail);
                    C15492e c15492e3 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica, null, ((C7019e) c13770e12.adcel(c15492e3)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e12.adcel(c15492e3)).vip.appmetrica, c13770e12, 0, 0, 131066);
                    String message = exc.getMessage();
                    if (message == null) {
                        message = BuildConfig.FLAVOR;
                    }
                    AbstractC14489e.vip(AbstractC5297e.license(R.string.cdcm_wizard_fail_text, new Object[]{message}, c13770e12), null, ((C7019e) c13770e12.adcel(c15492e3)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e12.adcel(c15492e3)).vip.mopub, c13770e12, 0, 0, 131066);
                    c13770e12.Signature(true);
                } else {
                    c13770e12.m3659default();
                }
                return Unit.INSTANCE;
            case 15:
                C3248e c3248e = (C3248e) obj4;
                C13770e c13770e13 = (C13770e) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                if (c13770e13.m3673protected(intValue13 & 1, (intValue13 & 17) != 16)) {
                    InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex4 = c13770e13.yandex(c3248e);
                    Object m3681throw6 = c13770e13.m3681throw();
                    if (yandex4 || m3681throw6 == c5170e) {
                        m3681throw6 = new C17036e(c3248e, 1);
                        c13770e13.m3682throws(m3681throw6);
                    }
                    InterfaceC12864e license5 = AbstractC9546e.license(metrica, false, null, (Function0) m3681throw6, 15);
                    float f3 = AbstractC11992e.ad;
                    AbstractC16429e.ad(AbstractC12547e.license, license5, null, null, AbstractC16653e.license(-1027419871, new C18153e(c3248e, 3, r7 ? (byte) 1 : (byte) 0), c13770e13), null, AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e13, 510), 0.0f, 0.0f, c13770e13, 24582, 428);
                    AbstractC8141e.ad(null, 0.0f, ((C7019e) c13770e13.adcel(AbstractC11785e.ad)).ad.ads, c13770e13, 0, 3);
                } else {
                    c13770e13.m3659default();
                }
                return Unit.INSTANCE;
            case 16:
                Boolean bool = (Boolean) obj3;
                bool.booleanValue();
                ((C11887e) obj4).metrica.metrica(C11887e.yandex[0], bool);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C3566e c3566e = (C3566e) obj4;
                C13770e c13770e14 = (C13770e) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                if (c13770e14.m3673protected(intValue14 & 1, (intValue14 & 17) != 16)) {
                    c3566e.applovin(c3566e.f8049e, true, AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), 16, 0.0f, 2), c13770e14, 432);
                } else {
                    c13770e14.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C2038e c2038e = (C2038e) obj4;
                InterfaceC10799e interfaceC10799e = (InterfaceC10799e) obj;
                C13770e c13770e15 = (C13770e) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= c13770e15.purchase(interfaceC10799e) ? 4 : 2;
                }
                if (c13770e15.m3673protected(intValue15 & 1, (intValue15 & 19) != 18)) {
                    c2038e.metrica(interfaceC10799e.ad(c0115e, 1.0f, true), c13770e15, 0);
                } else {
                    c13770e15.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                final InterfaceC7484e interfaceC7484e = (InterfaceC7484e) obj4;
                C13770e c13770e16 = (C13770e) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                if (c13770e16.m3673protected(intValue16 & 1, (intValue16 & 17) != 16)) {
                    final int i9 = r7 ? 1 : 0;
                    C2892e license6 = AbstractC16653e.license(347588790, new Function2() { // from class: eّٜۢ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            switch (i9) {
                                case 0:
                                    C13770e c13770e17 = (C13770e) obj5;
                                    int intValue17 = ((Integer) obj6).intValue();
                                    if (c13770e17.m3673protected(intValue17 & 1, (intValue17 & 3) != 2)) {
                                        AbstractC14489e.vip(((C17293e) interfaceC7484e).ad.ad(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e17, 0, 0, 262142);
                                    } else {
                                        c13770e17.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    C13770e c13770e18 = (C13770e) obj5;
                                    int intValue18 = ((Integer) obj6).intValue();
                                    if (c13770e18.m3673protected(intValue18 & 1, (intValue18 & 3) != 2)) {
                                        AbstractC14489e.vip("ID: " + ((C17293e) interfaceC7484e).ad.ad, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e18, 0, 0, 262142);
                                    } else {
                                        c13770e18.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    C13770e c13770e19 = (C13770e) obj5;
                                    int intValue19 = ((Integer) obj6).intValue();
                                    if (c13770e19.m3673protected(intValue19 & 1, (intValue19 & 3) != 2)) {
                                        AbstractC8461e.ad(((C17293e) interfaceC7484e).ad.license, null, AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 42), AbstractC6549e.ad), null, null, c13770e19, 48, 2040);
                                    } else {
                                        c13770e19.m3659default();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, c13770e16);
                    final char c2 = c == true ? 1 : 0;
                    C2892e license7 = AbstractC16653e.license(-885691655, new Function2() { // from class: eّٜۢ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            switch (c2) {
                                case 0:
                                    C13770e c13770e17 = (C13770e) obj5;
                                    int intValue17 = ((Integer) obj6).intValue();
                                    if (c13770e17.m3673protected(intValue17 & 1, (intValue17 & 3) != 2)) {
                                        AbstractC14489e.vip(((C17293e) interfaceC7484e).ad.ad(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e17, 0, 0, 262142);
                                    } else {
                                        c13770e17.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    C13770e c13770e18 = (C13770e) obj5;
                                    int intValue18 = ((Integer) obj6).intValue();
                                    if (c13770e18.m3673protected(intValue18 & 1, (intValue18 & 3) != 2)) {
                                        AbstractC14489e.vip("ID: " + ((C17293e) interfaceC7484e).ad.ad, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e18, 0, 0, 262142);
                                    } else {
                                        c13770e18.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    C13770e c13770e19 = (C13770e) obj5;
                                    int intValue19 = ((Integer) obj6).intValue();
                                    if (c13770e19.m3673protected(intValue19 & 1, (intValue19 & 3) != 2)) {
                                        AbstractC8461e.ad(((C17293e) interfaceC7484e).ad.license, null, AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 42), AbstractC6549e.ad), null, null, c13770e19, 48, 2040);
                                    } else {
                                        c13770e19.m3659default();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, c13770e16);
                    C2892e license8 = AbstractC16653e.license(1566526394, new Function2() { // from class: eّٜۢ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            switch (i2) {
                                case 0:
                                    C13770e c13770e17 = (C13770e) obj5;
                                    int intValue17 = ((Integer) obj6).intValue();
                                    if (c13770e17.m3673protected(intValue17 & 1, (intValue17 & 3) != 2)) {
                                        AbstractC14489e.vip(((C17293e) interfaceC7484e).ad.ad(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e17, 0, 0, 262142);
                                    } else {
                                        c13770e17.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    C13770e c13770e18 = (C13770e) obj5;
                                    int intValue18 = ((Integer) obj6).intValue();
                                    if (c13770e18.m3673protected(intValue18 & 1, (intValue18 & 3) != 2)) {
                                        AbstractC14489e.vip("ID: " + ((C17293e) interfaceC7484e).ad.ad, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e18, 0, 0, 262142);
                                    } else {
                                        c13770e18.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    C13770e c13770e19 = (C13770e) obj5;
                                    int intValue19 = ((Integer) obj6).intValue();
                                    if (c13770e19.m3673protected(intValue19 & 1, (intValue19 & 3) != 2)) {
                                        AbstractC8461e.ad(((C17293e) interfaceC7484e).ad.license, null, AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 42), AbstractC6549e.ad), null, null, c13770e19, 48, 2040);
                                    } else {
                                        c13770e19.m3659default();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, c13770e16);
                    float f4 = AbstractC11992e.ad;
                    AbstractC16429e.ad(license6, null, null, license7, license8, null, AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e16, 510), 0.0f, 0.0f, c13770e16, 27654, 422);
                } else {
                    c13770e16.m3659default();
                }
                return Unit.INSTANCE;
            case 20:
                C11467e c11467e = (C11467e) obj4;
                C13770e c13770e17 = (C13770e) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                if (c13770e17.m3673protected(intValue17 & 1, (intValue17 & 17) != 16)) {
                    InterfaceC12864e advert8 = AbstractC18007e.advert(C0115e.f1276e, 0.0f, 0.0f, 200, 350, 3);
                    boolean yandex5 = c13770e17.yandex(c11467e);
                    Object m3681throw7 = c13770e17.m3681throw();
                    if (yandex5 || m3681throw7 == c5170e) {
                        m3681throw7 = new C10739e(r10, c11467e);
                        c13770e17.m3682throws(m3681throw7);
                    }
                    AbstractC7023e.ad(advert8, null, null, null, null, null, false, null, (Function1) m3681throw7, c13770e17, 0, 510);
                } else {
                    c13770e17.m3659default();
                }
                return Unit.INSTANCE;
            case 21:
                C17320e c17320e = (C17320e) obj4;
                int intValue18 = ((Integer) obj).intValue();
                int intValue19 = ((Integer) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                if (!booleanValue) {
                    intValue18 = c17320e.f33992e.license(intValue18);
                }
                if (!booleanValue) {
                    intValue19 = c17320e.f33992e.license(intValue19);
                }
                if (c17320e.f33999e) {
                    long j7 = c17320e.f33993e.vip;
                    int i10 = C12347e.metrica;
                    if (intValue18 != ((int) (j7 >> 32)) || intValue19 != ((int) (j7 & 4294967295L))) {
                        int min = Math.min(intValue18, intValue19);
                        EnumC13262e enumC13262e = EnumC13262e.f26311e;
                        if (min >= 0 && Math.max(intValue18, intValue19) <= c17320e.f33993e.ad.f20850e.length()) {
                            if (booleanValue || intValue18 == intValue19) {
                                C15860e c15860e = c17320e.f33995e;
                                c15860e.pro(false);
                                c15860e.admob(enumC13262e);
                            } else {
                                c17320e.f33995e.yandex(true);
                            }
                            c17320e.f33996e.tapsense.invoke(new C0398e(c17320e.f33993e.ad, AbstractC9262e.metrica(intValue18, intValue19), (C12347e) null));
                            return Boolean.valueOf(z2);
                        }
                        C15860e c15860e2 = c17320e.f33995e;
                        c15860e2.pro(false);
                        c15860e2.admob(enumC13262e);
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 22:
                ((Function1) obj4).invoke(new C2152e(((C2401e) obj2).metrica));
                return Unit.INSTANCE;
            case 23:
                C16161e c16161e = (C16161e) obj4;
                C13770e c13770e18 = (C13770e) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                if (c13770e18.m3673protected(intValue20 & 1, (intValue20 & 17) != 16)) {
                    InterfaceC12864e metrica2 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex6 = c13770e18.yandex(c16161e);
                    Object m3681throw8 = c13770e18.m3681throw();
                    if (yandex6 || m3681throw8 == c5170e) {
                        m3681throw8 = new C5938e(c16161e, 0);
                        c13770e18.m3682throws(m3681throw8);
                    }
                    AbstractC16429e.ad(AbstractC10077e.metrica, AbstractC9546e.license(metrica2, false, null, (Function0) m3681throw8, 15), null, null, null, AbstractC16653e.license(-965957744, new C9234e(c16161e), c13770e18), null, 0.0f, 0.0f, c13770e18, 196614, 476);
                } else {
                    c13770e18.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C13002e c13002e = (C13002e) obj4;
                C13770e c13770e19 = (C13770e) obj2;
                ((Integer) obj3).getClass();
                c13770e19.m3676strictfp(-18970124);
                float f5 = c13002e.vip;
                C13789e c13789e = AbstractC5616e.ad;
                InterfaceC12864e smaato4 = AbstractC18007e.smaato(AbstractC6532e.ads(AbstractC18007e.Signature(AbstractC18007e.metrica((InterfaceC12864e) obj, 1.0f), C5438e.f11682e), ((C15765e) AbstractC16102e.ad(c13002e.ad, AbstractC12696e.yandex(250, 2, c13789e), null, c13770e19, 0, 12).getValue()).f31051e, 0.0f, 2), ((C15765e) AbstractC16102e.ad(f5, AbstractC12696e.yandex(250, 2, c13789e), null, c13770e19, 0, 12).getValue()).f31051e);
                c13770e19.Signature(false);
                return smaato4;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ad(obj, obj2, obj3);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return vip(obj, obj2, obj3);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return license(obj, obj2, obj3);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return purchase(obj, obj2, obj3);
            default:
                C13182e c13182e = (C13182e) obj4;
                C13770e c13770e20 = (C13770e) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                if (c13770e20.m3673protected(intValue21 & 1, (intValue21 & 17) != 16)) {
                    InterfaceC12864e metrica3 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex7 = c13770e20.yandex(c13182e);
                    Object m3681throw9 = c13770e20.m3681throw();
                    if (yandex7 || m3681throw9 == c5170e) {
                        m3681throw9 = new C15963e(c13182e, r7 ? 1 : 0);
                        c13770e20.m3682throws(m3681throw9);
                    }
                    InterfaceC12864e license9 = AbstractC9546e.license(metrica3, false, null, (Function0) m3681throw9, 15);
                    float f6 = AbstractC11992e.ad;
                    C15492e c15492e4 = AbstractC11785e.ad;
                    AbstractC16429e.ad(AbstractC15390e.amazon, license9, null, null, AbstractC15390e.loadAd, null, AbstractC11992e.ad(0L, ((C7019e) c13770e20.adcel(c15492e4)).ad.ad, ((C7019e) c13770e20.adcel(c15492e4)).ad.ad, 0L, c13770e20, 505), 0.0f, 0.0f, c13770e20, 24582, 428);
                } else {
                    c13770e20.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
