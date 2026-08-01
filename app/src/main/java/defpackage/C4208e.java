package defpackage;

import bruhcollective.itaysonlab.libvkmusic.objects.UmaArtist;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٚ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4208e implements Function4 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f9271e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f9272e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f9273e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9274e;

    public /* synthetic */ C4208e(int i, Object obj, Object obj2, Object obj3) {
        this.f9274e = i;
        this.f9272e = obj;
        this.f9271e = obj2;
        this.f9273e = obj3;
    }

    public C4208e(C9669e c9669e, InterfaceC18435e interfaceC18435e, InterfaceC16132e interfaceC16132e) {
        this.f9274e = 5;
        C6454e c6454e = EnumC5778e.f12226e;
        this.f9272e = c9669e;
        this.f9271e = interfaceC18435e;
        this.f9273e = interfaceC16132e;
    }

    public C4208e(List list, InterfaceC16132e interfaceC16132e, AbstractC15638e abstractC15638e) {
        this.f9274e = 7;
        this.f9272e = list;
        this.f9273e = interfaceC16132e;
        this.f9271e = abstractC15638e;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        C5838e c5838e;
        Object obj5;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C13770e c13770e;
        C2892e c2892e;
        int i9;
        int i10;
        int i11;
        C2892e c2892e2;
        int i12 = this.f9274e;
        int i13 = 28;
        int i14 = 15;
        InterfaceC5083e interfaceC5083e = null;
        C0115e c0115e = C0115e.f1276e;
        C5170e c5170e = C2987e.ad;
        Object obj6 = this.f9273e;
        Object obj7 = this.f9272e;
        Object obj8 = this.f9271e;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        switch (i12) {
            case 0:
                C18055e c18055e = (C18055e) obj;
                int intValue = ((Number) obj2).intValue();
                C13770e c13770e2 = (C13770e) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (c13770e2.purchase(c18055e) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= c13770e2.license(intValue) ? 32 : 16;
                }
                if (c13770e2.m3673protected(i & 1, (i & 147) != 146)) {
                    C1490e c1490e = (C1490e) ((List) obj7).get(intValue);
                    c13770e2.m3676strictfp(-927831402);
                    ((C3566e) obj8).ads(c1490e, ((Boolean) ((InterfaceC16132e) obj6).getValue()).booleanValue(), AbstractC18007e.metrica(c0115e, 1.0f), c13770e2, 384);
                    c13770e2.Signature(false);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C18055e c18055e2 = (C18055e) obj;
                int intValue3 = ((Number) obj2).intValue();
                C13770e c13770e3 = (C13770e) obj3;
                int intValue4 = ((Number) obj4).intValue();
                C16929e c16929e = (C16929e) obj8;
                C0764e c0764e = (C0764e) obj6;
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (c13770e3.purchase(c18055e2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= c13770e3.license(intValue3) ? 32 : 16;
                }
                if (c13770e3.m3673protected(i2 & 1, (i2 & 147) != 146)) {
                    int i15 = i2 & 126;
                    C14056e c14056e = (C14056e) ((List) obj7).get(intValue3);
                    c13770e3.m3676strictfp(2101332047);
                    InterfaceC12864e mopub = AbstractC12220e.mopub(AbstractC18007e.metrica(c0115e, 1.0f), 16);
                    boolean yandex = c13770e3.yandex(c16929e) | c13770e3.purchase(c0764e) | ((((i2 & 112) ^ 48) > 32 && c13770e3.license(intValue3)) || (i2 & 48) == 32);
                    Object m3681throw = c13770e3.m3681throw();
                    Object obj9 = m3681throw;
                    if (yandex || m3681throw == c5170e) {
                        C15449e c15449e = new C15449e(c16929e, c0764e, intValue3);
                        c13770e3.m3682throws(c15449e);
                        obj9 = c15449e;
                    }
                    Function1 function1 = (Function1) obj9;
                    boolean yandex2 = c13770e3.yandex(c16929e) | c13770e3.purchase(c0764e) | c13770e3.yandex(c14056e);
                    Object m3681throw2 = c13770e3.m3681throw();
                    Object obj10 = m3681throw2;
                    if (yandex2 || m3681throw2 == c5170e) {
                        C12056e c12056e = new C12056e(c16929e, c0764e, c14056e);
                        c13770e3.m3682throws(c12056e);
                        obj10 = c12056e;
                    }
                    c16929e.m4228strictfp(function1, (Function0) obj10, intValue3, c14056e, mopub, c13770e3, ((i15 << 3) & 896) | 24576);
                    c13770e3.Signature(false);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C18055e c18055e3 = (C18055e) obj;
                int intValue5 = ((Number) obj2).intValue();
                C13770e c13770e4 = (C13770e) obj3;
                int intValue6 = ((Number) obj4).intValue();
                C5838e c5838e2 = (C5838e) obj6;
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj8;
                if ((intValue6 & 6) == 0) {
                    i3 = intValue6 | (c13770e4.purchase(c18055e3) ? 4 : 2);
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= c13770e4.license(intValue5) ? 32 : 16;
                }
                if (c13770e4.m3673protected(i3 & 1, (i3 & 147) != 146)) {
                    C1050e c1050e = (C1050e) ((List) obj7).get(intValue5);
                    c13770e4.m3676strictfp(-245053775);
                    boolean purchase = c13770e4.purchase(c1050e);
                    Object m3681throw3 = c13770e4.m3681throw();
                    Object obj11 = m3681throw3;
                    if (purchase || m3681throw3 == c5170e) {
                        C2616e c2616e = new C2616e(((c1050e.f3536e + 12.0f) / 24.0f) * 100.0f);
                        c13770e4.m3682throws(c2616e);
                        obj11 = c2616e;
                    }
                    C2616e c2616e2 = (C2616e) obj11;
                    boolean metrica = c13770e4.metrica(c2616e2.purchase());
                    Object m3681throw4 = c13770e4.m3681throw();
                    if (metrica || m3681throw4 == c5170e) {
                        float purchase2 = ((c2616e2.purchase() / 100.0f) * 24.0f) - 12.0f;
                        c5838e = c5838e2;
                        Float valueOf = Float.valueOf(AbstractC1561e.appmetrica(purchase2 * r6) / ((float) Math.pow(10.0f, 1.0f)));
                        c13770e4.m3682throws(valueOf);
                        obj5 = valueOf;
                    } else {
                        c5838e = c5838e2;
                        obj5 = m3681throw4;
                    }
                    float floatValue = ((Number) obj5).floatValue();
                    float purchase3 = c2616e2.purchase();
                    C3721e c3721e = new C3721e(0.0f, 100.0f);
                    InterfaceC12864e metrica2 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean purchase4 = c13770e4.purchase(c2616e2);
                    Object m3681throw5 = c13770e4.m3681throw();
                    Object obj12 = m3681throw5;
                    if (purchase4 || m3681throw5 == c5170e) {
                        C17877e c17877e = new C17877e(14, c2616e2);
                        c13770e4.m3682throws(c17877e);
                        obj12 = c17877e;
                    }
                    Function1 function12 = (Function1) obj12;
                    C5838e c5838e3 = c5838e;
                    boolean purchase5 = c13770e4.purchase(interfaceC3314e) | c13770e4.yandex(c5838e3) | c13770e4.yandex(c1050e) | c13770e4.metrica(floatValue);
                    Object m3681throw6 = c13770e4.m3681throw();
                    Object obj13 = m3681throw6;
                    if (purchase5 || m3681throw6 == c5170e) {
                        C1150e c1150e = new C1150e(c5838e3, c1050e, floatValue, interfaceC3314e);
                        c13770e4.m3682throws(c1150e);
                        obj13 = c1150e;
                    }
                    AbstractC12547e.ad(purchase3, function12, metrica2, null, false, (Function0) obj13, AbstractC16653e.license(1292125031, new C11783e(2, c1050e), c13770e4), AbstractC16653e.license(-1770710970, new C11886e(floatValue), c13770e4), null, 0.0f, 252, c3721e, c13770e4, 14156160);
                    AbstractC12534e.ad(c13770e4, AbstractC18007e.license(c0115e, 16));
                    c13770e4.Signature(false);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C18055e c18055e4 = (C18055e) obj;
                int intValue7 = ((Number) obj2).intValue();
                C13770e c13770e5 = (C13770e) obj3;
                int intValue8 = ((Number) obj4).intValue();
                C8004e c8004e = (C8004e) obj8;
                if ((intValue8 & 6) == 0) {
                    i4 = intValue8 | (c13770e5.purchase(c18055e4) ? 4 : 2);
                } else {
                    i4 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i4 |= c13770e5.license(intValue7) ? 32 : 16;
                }
                if (c13770e5.m3673protected(i4 & 1, (i4 & 147) != 146)) {
                    C11048e c11048e = (C11048e) ((List) obj7).get(intValue7);
                    c13770e5.m3676strictfp(-671216161);
                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e5, 0);
                    long j = c13770e5.f27286case;
                    int i16 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e5.advert();
                    InterfaceC12864e purchase6 = AbstractC5679e.purchase(c13770e5, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e5.m3666import();
                    if (c13770e5.f27292implements) {
                        c13770e5.mopub(c7309e);
                    } else {
                        c13770e5.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e5, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e5, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e5, Integer.valueOf(i16), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e5, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e5, purchase6, C2721e.license);
                    float f = AbstractC11992e.ad;
                    C8872e ad2 = AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e5, 510);
                    InterfaceC12864e metrica3 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex3 = c13770e5.yandex(c8004e) | c13770e5.yandex(c11048e);
                    Object m3681throw7 = c13770e5.m3681throw();
                    Object obj14 = m3681throw7;
                    if (yandex3 || m3681throw7 == c5170e) {
                        C12056e c12056e2 = new C12056e(c8004e, c11048e, 20);
                        c13770e5.m3682throws(c12056e2);
                        obj14 = c12056e2;
                    }
                    AbstractC16429e.ad(AbstractC16653e.license(1460795058, new C1855e(c11048e, 0), c13770e5), AbstractC9546e.license(metrica3, false, null, (Function0) obj14, 15), null, null, AbstractC16653e.license(1090577966, new C1855e(c11048e, 1), c13770e5), AbstractC16653e.license(998023693, new C2077e(c11048e, (InterfaceC3314e) obj6, 7), c13770e5), ad2, 0.0f, 0.0f, c13770e5, 221190, 396);
                    AbstractC8141e.vip(null, 0.0f, 0L, c13770e5, 0, 7);
                    c13770e5.Signature(true);
                    c13770e5.Signature(false);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                C18055e c18055e5 = (C18055e) obj;
                int intValue9 = ((Number) obj2).intValue();
                C13770e c13770e6 = (C13770e) obj3;
                int intValue10 = ((Number) obj4).intValue();
                C4993e c4993e = (C4993e) obj6;
                C7988e c7988e = (C7988e) obj8;
                if ((intValue10 & 6) == 0) {
                    i5 = (c13770e6.purchase(c18055e5) ? 4 : 2) | intValue10;
                } else {
                    i5 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    i5 |= c13770e6.license(intValue9) ? 32 : 16;
                }
                if (c13770e6.m3673protected(i5 & 1, (i5 & 147) != 146)) {
                    C12911e c12911e = (C12911e) ((List) obj7).get(intValue9);
                    c13770e6.m3676strictfp(-953023052);
                    Unit unit = Unit.INSTANCE;
                    boolean yandex4 = c13770e6.yandex(c7988e) | c13770e6.yandex(c12911e);
                    Object m3681throw8 = c13770e6.m3681throw();
                    Object obj15 = m3681throw8;
                    if (yandex4 || m3681throw8 == c5170e) {
                        C17806e c17806e = new C17806e(c7988e, c12911e, interfaceC5083e, 14);
                        c13770e6.m3682throws(c17806e);
                        obj15 = c17806e;
                    }
                    AbstractC17680e.license(c13770e6, unit, (Function2) obj15);
                    boolean purchase7 = c13770e6.purchase(c4993e);
                    Object m3681throw9 = c13770e6.m3681throw();
                    Object obj16 = m3681throw9;
                    if (purchase7 || m3681throw9 == c5170e) {
                        C17402e c17402e = new C17402e(c4993e, interfaceC5083e, 2);
                        c13770e6.m3682throws(c17402e);
                        obj16 = c17402e;
                    }
                    AbstractC17680e.license(c13770e6, unit, (Function2) obj16);
                    AbstractC0487e.ad(c12911e, AbstractC18007e.smaato(AbstractC16398e.license(AbstractC8703e.billing(c18055e5), 4, ((C16305e) c13770e6.adcel(AbstractC10984e.ad)).license, false, 28), 400), c13770e6, 0);
                    c13770e6.Signature(false);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                C18055e c18055e6 = (C18055e) obj;
                int intValue11 = ((Number) obj2).intValue();
                C13770e c13770e7 = (C13770e) obj3;
                int intValue12 = ((Number) obj4).intValue();
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj8;
                C9669e c9669e = (C9669e) obj7;
                if ((intValue12 & 6) == 0) {
                    i6 = intValue12 | (c13770e7.purchase(c18055e6) ? 4 : 2);
                } else {
                    i6 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    i6 |= c13770e7.license(intValue11) ? 32 : 16;
                }
                if (c13770e7.m3673protected(i6 & 1, (i6 & 147) != 146)) {
                    EnumC5778e enumC5778e = (EnumC5778e) EnumC5778e.f12229e.get(intValue11);
                    c13770e7.m3676strictfp(-708120141);
                    InterfaceC12864e metrica4 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex5 = c13770e7.yandex(c9669e) | c13770e7.yandex(interfaceC18435e) | c13770e7.license(enumC5778e.ordinal());
                    Object m3681throw10 = c13770e7.m3681throw();
                    if (yandex5 || m3681throw10 == c5170e) {
                        m3681throw10 = new C7965e(6, c9669e, interfaceC18435e, enumC5778e);
                        c13770e7.m3682throws(m3681throw10);
                    }
                    InterfaceC12864e license = AbstractC9546e.license(metrica4, false, null, (Function0) m3681throw10, 15);
                    float f2 = AbstractC11992e.ad;
                    AbstractC16429e.ad(AbstractC16653e.license(-909732273, new C15221e(4, enumC5778e), c13770e7), license, null, null, null, AbstractC16653e.license(-1668095212, new C2077e(enumC5778e, (InterfaceC16132e) obj6, 11), c13770e7), AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e7, 510), 0.0f, 0.0f, c13770e7, 196614, 412);
                    c13770e7.Signature(false);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case 6:
                C14873e c14873e = (C14873e) obj8;
                C18055e c18055e7 = (C18055e) obj;
                int intValue13 = ((Number) obj2).intValue();
                C13770e c13770e8 = (C13770e) obj3;
                int intValue14 = ((Number) obj4).intValue();
                if ((intValue14 & 6) == 0) {
                    i7 = intValue14 | (c13770e8.purchase(c18055e7) ? 4 : 2);
                } else {
                    i7 = intValue14;
                }
                if ((intValue14 & 48) == 0) {
                    i7 |= c13770e8.license(intValue13) ? 32 : 16;
                }
                if (c13770e8.m3673protected(i7 & 1, (i7 & 147) != 146)) {
                    InterfaceC4111e interfaceC4111e = (InterfaceC4111e) ((List) obj7).get(intValue13);
                    c13770e8.m3676strictfp(-1596471243);
                    if (interfaceC4111e instanceof C3187e) {
                        c13770e8.m3676strictfp(-1596395325);
                        c14873e.m3877finally(((C3187e) interfaceC4111e).ad, ((C6123e) obj6).appmetrica, intValue13 + 1, c13770e8, 0);
                        c13770e8.Signature(false);
                    } else {
                        if (!(interfaceC4111e instanceof C2011e)) {
                            throw AbstractC1786e.loadAd(-1714067058, c13770e8, false);
                        }
                        c13770e8.m3676strictfp(-1596008011);
                        c14873e.m3884transient(((C2011e) interfaceC4111e).ad, c13770e8, 0);
                        c13770e8.Signature(false);
                    }
                    c13770e8.Signature(false);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case 7:
                C18055e c18055e8 = (C18055e) obj;
                int intValue15 = ((Number) obj2).intValue();
                C13770e c13770e9 = (C13770e) obj3;
                int intValue16 = ((Number) obj4).intValue();
                AbstractC15638e abstractC15638e = (AbstractC15638e) obj8;
                InterfaceC16132e interfaceC16132e = (InterfaceC16132e) obj6;
                if ((intValue16 & 6) == 0) {
                    i8 = intValue16 | (c13770e9.purchase(c18055e8) ? 4 : 2);
                } else {
                    i8 = intValue16;
                }
                if ((intValue16 & 48) == 0) {
                    i8 |= c13770e9.license(intValue15) ? 32 : 16;
                }
                if (c13770e9.m3673protected(i8 & 1, (i8 & 147) != 146)) {
                    AbstractC8002e abstractC8002e = (AbstractC8002e) ((List) obj7).get(intValue15);
                    c13770e9.m3676strictfp(-834678510);
                    if (abstractC8002e instanceof C1334e) {
                        c13770e9.m3676strictfp(-834723833);
                        AbstractC4608e.ad(((C1334e) abstractC8002e).ad, 432, c13770e9, false, false);
                        c13770e9.Signature(false);
                    } else if (abstractC8002e instanceof C15753e) {
                        c13770e9.m3676strictfp(-834536376);
                        AbstractC4608e.ad(R.string.rec_screen_genres_notice, 432, c13770e9, false, false);
                        c13770e9.Signature(false);
                    } else if (abstractC8002e instanceof C4242e) {
                        c13770e9.m3676strictfp(-834337883);
                        boolean booleanValue = ((Boolean) interfaceC16132e.getValue()).booleanValue();
                        C4242e c4242e = (C4242e) abstractC8002e;
                        boolean purchase8 = c13770e9.purchase(abstractC8002e) | c13770e9.purchase(interfaceC16132e) | c13770e9.yandex(abstractC15638e);
                        Object m3681throw11 = c13770e9.m3681throw();
                        if (purchase8 || m3681throw11 == c5170e) {
                            m3681throw11 = new C7965e(8, c4242e, abstractC15638e, interfaceC16132e);
                            c13770e9.m3682throws(m3681throw11);
                        }
                        AbstractC4608e.vip(booleanValue, c4242e, (Function0) m3681throw11, c13770e9, 0);
                        c13770e9.Signature(false);
                    } else {
                        if (abstractC8002e instanceof C4924e) {
                            c13770e9.m3676strictfp(-833860607);
                            C4924e c4924e = (C4924e) abstractC8002e;
                            Function2 function2 = c4924e.vip;
                            if (c4924e.license != 0) {
                                c13770e9.m3676strictfp(-833799227);
                                c2892e = AbstractC16653e.license(-124878400, new C2028e(c4924e, 1), c13770e9);
                                c13770e9.Signature(false);
                            } else {
                                c13770e9.m3676strictfp(-833595123);
                                c13770e9.Signature(false);
                                c2892e = null;
                            }
                            if (function2 != null) {
                                c13770e9.m3676strictfp(-833421182);
                                c13770e9.Signature(false);
                            } else {
                                c13770e9.m3676strictfp(-833333700);
                                function2 = AbstractC16653e.license(-339537599, new C2028e(c4924e, z ? 1 : 0), c13770e9);
                                c13770e9.Signature(false);
                            }
                            InterfaceC12864e license2 = AbstractC9546e.license(AbstractC18007e.metrica(c0115e, 1.0f), false, null, c4924e.appmetrica, 15);
                            Function2 function22 = c4924e.metrica;
                            float f3 = AbstractC11992e.ad;
                            AbstractC16429e.ad(function2, license2, null, function22, c2892e, null, AbstractC11992e.ad(C3618e.startapp, 0L, ((C7019e) c13770e9.adcel(AbstractC11785e.ad)).ad.admob, 0L, c13770e9, 506), 0.0f, 0.0f, c13770e9, 0, 420);
                            c13770e = c13770e9;
                            c13770e.Signature(false);
                        } else {
                            c13770e = c13770e9;
                            if (!AbstractC7890e.billing(abstractC8002e, C5047e.ad)) {
                                throw AbstractC1786e.loadAd(-1828040431, c13770e, false);
                            }
                            c13770e.m3676strictfp(-831143674);
                            AbstractC8141e.vip(null, 0.0f, 0L, c13770e, 0, 7);
                            c13770e.Signature(false);
                        }
                        c13770e.Signature(false);
                    }
                    c13770e = c13770e9;
                    c13770e.Signature(false);
                } else {
                    c13770e9.m3659default();
                }
                return Unit.INSTANCE;
            case 8:
                C12692e c12692e = (C12692e) obj;
                ((Boolean) obj2).getClass();
                C13770e c13770e10 = (C13770e) obj3;
                int intValue17 = ((Number) obj4).intValue();
                C17047e c17047e = (C17047e) obj7;
                CachedPlaylist cachedPlaylist = (CachedPlaylist) obj8;
                if ((intValue17 & 6) == 0) {
                    intValue17 |= c13770e10.purchase(c12692e) ? 4 : 2;
                }
                if (c13770e10.m3673protected(intValue17 & 1, (intValue17 & 131) != 130)) {
                    C2892e license3 = AbstractC16653e.license(-856079706, new C2077e(c12692e, (InterfaceC5178e) obj6, i14), c13770e10);
                    InterfaceC12864e metrica5 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean purchase9 = c13770e10.purchase(cachedPlaylist) | c13770e10.yandex(c17047e);
                    Object m3681throw12 = c13770e10.m3681throw();
                    if (purchase9 || m3681throw12 == c5170e) {
                        m3681throw12 = new C18148e(cachedPlaylist, c17047e);
                        c13770e10.m3682throws(m3681throw12);
                    }
                    Function0 function0 = (Function0) m3681throw12;
                    boolean yandex6 = c13770e10.yandex(c17047e) | c13770e10.purchase(cachedPlaylist);
                    Object m3681throw13 = c13770e10.m3681throw();
                    if (yandex6 || m3681throw13 == c5170e) {
                        m3681throw13 = new C18148e(c17047e, cachedPlaylist);
                        c13770e10.m3682throws(m3681throw13);
                    }
                    c17047e.m4235strictfp(cachedPlaylist, license3, AbstractC12220e.smaato(AbstractC9546e.purchase(metrica5, function0, (Function0) m3681throw13), 16, 0.0f, 2), c13770e10, 48);
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
            case 9:
                C18055e c18055e9 = (C18055e) obj;
                int intValue18 = ((Number) obj2).intValue();
                C13770e c13770e11 = (C13770e) obj3;
                int intValue19 = ((Number) obj4).intValue();
                InterfaceC16132e interfaceC16132e2 = (InterfaceC16132e) obj6;
                if ((intValue19 & 6) == 0) {
                    i9 = intValue19 | (c13770e11.purchase(c18055e9) ? 4 : 2);
                } else {
                    i9 = intValue19;
                }
                if ((intValue19 & 48) == 0) {
                    i9 |= c13770e11.license(intValue18) ? 32 : 16;
                }
                if (c13770e11.m3673protected(i9 & 1, (i9 & 147) != 146)) {
                    C10985e c10985e = ((C18222e) ((List) obj7).get(intValue18)).ad;
                    c13770e11.m3676strictfp(-199537967);
                    C13622e c13622e = (C13622e) obj8;
                    boolean purchase10 = c13770e11.purchase(interfaceC16132e2);
                    Object m3681throw14 = c13770e11.m3681throw();
                    if (purchase10 || m3681throw14 == c5170e) {
                        m3681throw14 = new C2840e(interfaceC16132e2, z2 ? 1 : 0);
                        c13770e11.m3682throws(m3681throw14);
                    }
                    Function1 function13 = m3681throw14;
                    boolean purchase11 = c13770e11.purchase(interfaceC16132e2);
                    Object m3681throw15 = c13770e11.m3681throw();
                    if (purchase11 || m3681throw15 == c5170e) {
                        m3681throw15 = new C2840e(interfaceC16132e2, 1);
                        c13770e11.m3682throws(m3681throw15);
                    }
                    c13622e.m3625strictfp(c10985e, function13, m3681throw15, c13770e11, 0);
                    c13770e11.Signature(false);
                } else {
                    c13770e11.m3659default();
                }
                return Unit.INSTANCE;
            case 10:
                C18055e c18055e10 = (C18055e) obj;
                int intValue20 = ((Number) obj2).intValue();
                C13770e c13770e12 = (C13770e) obj3;
                int intValue21 = ((Number) obj4).intValue();
                Function1 function14 = (Function1) obj8;
                if ((intValue21 & 6) == 0) {
                    i10 = intValue21 | (c13770e12.purchase(c18055e10) ? 4 : 2);
                } else {
                    i10 = intValue21;
                }
                if ((intValue21 & 48) == 0) {
                    i10 |= c13770e12.license(intValue20) ? 32 : 16;
                }
                if (c13770e12.m3673protected(i10 & 1, (i10 & 147) != 146)) {
                    C15797e c15797e = (C15797e) ((List) obj7).get(intValue20);
                    c13770e12.m3676strictfp(21328595);
                    float f4 = AbstractC11992e.ad;
                    C8872e ad3 = AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e12, 510);
                    InterfaceC12864e metrica6 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean purchase12 = c13770e12.purchase(function14) | c13770e12.purchase(c15797e);
                    Object m3681throw16 = c13770e12.m3681throw();
                    Object obj17 = m3681throw16;
                    if (purchase12 || m3681throw16 == c5170e) {
                        C1021e c1021e = new C1021e(function14, c15797e, 27);
                        c13770e12.m3682throws(c1021e);
                        obj17 = c1021e;
                    }
                    AbstractC16429e.ad(AbstractC16653e.license(-2042341771, new C7134e(c15797e, z3 ? 1 : 0), c13770e12), AbstractC9546e.license(metrica6, false, null, (Function0) obj17, 15), null, AbstractC16653e.license(932007634, new C7134e(c15797e, 1), c13770e12), null, null, ad3, 0.0f, 0.0f, c13770e12, 3078, 436);
                    if (intValue20 != AbstractC6874e.billing(((C13552e) obj6).f26852e)) {
                        c13770e12.m3676strictfp(22214636);
                        AbstractC8141e.vip(null, 0.0f, 0L, c13770e12, 0, 7);
                    } else {
                        c13770e12.m3676strictfp(10017903);
                    }
                    c13770e12.Signature(false);
                    c13770e12.Signature(false);
                } else {
                    c13770e12.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C18055e c18055e11 = (C18055e) obj;
                int intValue22 = ((Number) obj2).intValue();
                C13770e c13770e13 = (C13770e) obj3;
                int intValue23 = ((Number) obj4).intValue();
                C12672e c12672e = (C12672e) obj8;
                if ((intValue23 & 6) == 0) {
                    i11 = intValue23 | (c13770e13.purchase(c18055e11) ? 4 : 2);
                } else {
                    i11 = intValue23;
                }
                if ((intValue23 & 48) == 0) {
                    i11 |= c13770e13.license(intValue22) ? 32 : 16;
                }
                int i17 = 1;
                if (c13770e13.m3673protected(i11 & 1, (i11 & 147) != 146)) {
                    UmaArtist umaArtist = (UmaArtist) ((List) obj7).get(intValue22);
                    c13770e13.m3676strictfp(135747481);
                    String str = umaArtist.adcel;
                    if (str == null || str.length() <= 0) {
                        c13770e13.m3676strictfp(136115077);
                        c13770e13.Signature(false);
                        c2892e2 = null;
                    } else {
                        c13770e13.m3676strictfp(135943710);
                        C2892e license4 = AbstractC16653e.license(-637057127, new C5763e(umaArtist, z4 ? 1 : 0), c13770e13);
                        c13770e13.Signature(false);
                        c2892e2 = license4;
                    }
                    InterfaceC12864e metrica7 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex7 = c13770e13.yandex(c12672e) | c13770e13.yandex(umaArtist);
                    Object m3681throw17 = c13770e13.m3681throw();
                    Object obj18 = m3681throw17;
                    if (yandex7 || m3681throw17 == c5170e) {
                        C1021e c1021e2 = new C1021e(c12672e, umaArtist, i13);
                        c13770e13.m3682throws(c1021e2);
                        obj18 = c1021e2;
                    }
                    AbstractC16429e.ad(AbstractC16653e.license(-1137081382, new C5763e(umaArtist, i17), c13770e13), AbstractC9546e.license(metrica7, false, null, (Function0) obj18, 15), null, c2892e2, AbstractC16653e.license(141788758, new C2077e(umaArtist, (AbstractC10727e) obj6, 19), c13770e13), null, null, 0.0f, 0.0f, c13770e13, 24582, 484);
                    c13770e13.Signature(false);
                } else {
                    c13770e13.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
