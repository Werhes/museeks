package defpackage;

import bruhcollective.itaysonlab.libvkmusic.objects.UmaTag;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٔ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15055e implements Function4 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16400e f29823e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ List f29824e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f29825e;

    public /* synthetic */ C15055e(List list, InterfaceC16400e interfaceC16400e, int i) {
        this.f29825e = i;
        this.f29824e = list;
        this.f29823e = interfaceC16400e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v32 */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        ?? r2;
        ?? r11;
        int i5;
        int i6;
        InterfaceC16154e interfaceC16154e;
        int i7;
        int i8;
        int i9 = this.f29825e;
        C0115e c0115e = C0115e.f1276e;
        Object obj5 = C2987e.ad;
        List list = this.f29824e;
        InterfaceC16400e interfaceC16400e = this.f29823e;
        int i10 = 4;
        int i11 = 0;
        switch (i9) {
            case 0:
                C18055e c18055e = (C18055e) obj;
                int intValue = ((Number) obj2).intValue();
                C13770e c13770e = (C13770e) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (c13770e.purchase(c18055e) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= c13770e.license(intValue) ? 32 : 16;
                }
                if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
                    CachedPlaylist cachedPlaylist = (CachedPlaylist) list.get(intValue);
                    c13770e.m3676strictfp(-2019412327);
                    ((C10797e) interfaceC16400e).m2933instanceof(cachedPlaylist, c13770e, 0);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C1374e c1374e = (C1374e) interfaceC16400e;
                C18055e c18055e2 = (C18055e) obj;
                int intValue3 = ((Number) obj2).intValue();
                C13770e c13770e2 = (C13770e) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (c13770e2.purchase(c18055e2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= c13770e2.license(intValue3) ? 32 : 16;
                }
                if (c13770e2.m3673protected(i2 & 1, (i2 & 147) != 146)) {
                    C4537e c4537e = (C4537e) list.get(intValue3);
                    c13770e2.m3676strictfp(963476339);
                    C11590e c11590e = c4537e.f9823e;
                    C16742e c16742e = c4537e.f9822e;
                    if (c11590e != null) {
                        c13770e2.m3676strictfp(963519831);
                        z = false;
                        c1374e.m576private(c4537e.f9823e, AbstractC12220e.smaato(AbstractC8703e.mopub(c18055e2, c0115e), 16, 0.0f, 2), c13770e2, 0);
                        c13770e2.Signature(false);
                    } else {
                        z = false;
                        if (c16742e != null) {
                            c13770e2.m3676strictfp(963944500);
                            c1374e.m577strictfp(c16742e, AbstractC12220e.smaato(AbstractC8703e.mopub(c18055e2, c0115e), 16, 0.0f, 2), c13770e2, 0);
                        } else {
                            c13770e2.m3676strictfp(954976293);
                        }
                        c13770e2.Signature(false);
                    }
                    c13770e2.Signature(z);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C18055e c18055e3 = (C18055e) obj;
                int intValue5 = ((Number) obj2).intValue();
                C13770e c13770e3 = (C13770e) obj3;
                int intValue6 = ((Number) obj4).intValue();
                C6267e c6267e = (C6267e) interfaceC16400e;
                if ((intValue6 & 6) == 0) {
                    i3 = (c13770e3.purchase(c18055e3) ? 4 : 2) | intValue6;
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= c13770e3.license(intValue5) ? 32 : 16;
                }
                if (c13770e3.m3673protected(i3 & 1, (i3 & 147) != 146)) {
                    C0943e c0943e = (C0943e) list.get(intValue5);
                    c13770e3.m3676strictfp(-313365782);
                    boolean yandex = c13770e3.yandex(c0943e) | c13770e3.yandex(c6267e);
                    Object m3681throw = c13770e3.m3681throw();
                    if (yandex || m3681throw == obj5) {
                        m3681throw = new C1021e(c0943e, c6267e, 23);
                        c13770e3.m3682throws(m3681throw);
                    }
                    AbstractC0865e.vip((Function0) m3681throw, AbstractC12220e.smaato(c0115e, 16, 0.0f, 2), false, null, null, null, null, AbstractC16653e.license(607563118, new C1616e(c0943e, c6267e, 4), c13770e3), c13770e3, 100663344, 252);
                    c13770e3.Signature(false);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C18055e c18055e4 = (C18055e) obj;
                int intValue7 = ((Number) obj2).intValue();
                C13770e c13770e4 = (C13770e) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    i4 = (c13770e4.purchase(c18055e4) ? 4 : 2) | intValue8;
                } else {
                    i4 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i4 |= c13770e4.license(intValue7) ? 32 : 16;
                }
                boolean z2 = (i4 & 147) != 146;
                AbstractC7919e abstractC7919e = c13770e4.ad;
                if (c13770e4.m3673protected(i4 & 1, z2)) {
                    C13168e c13168e = (C13168e) list.get(intValue7);
                    c13770e4.m3676strictfp(1082861752);
                    float f = 16;
                    InterfaceC12864e smaato = AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), f, 0.0f, 2);
                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e4, 0);
                    long j = c13770e4.f27286case;
                    int i12 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e4.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e4, smaato);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e4.m3666import();
                    if (c13770e4.f27292implements) {
                        c13770e4.mopub(c7309e);
                    } else {
                        c13770e4.m3684volatile();
                    }
                    C14865e c14865e = C2721e.billing;
                    AbstractC2270e.yandex(c13770e4, ad, c14865e);
                    C14865e c14865e2 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e4, advert, c14865e2);
                    Integer valueOf = Integer.valueOf(i12);
                    C14865e c14865e3 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e4, valueOf, c14865e3);
                    C5430e c5430e = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e4, c5430e);
                    C14865e c14865e4 = C2721e.license;
                    AbstractC2270e.yandex(c13770e4, purchase, c14865e4);
                    float f2 = 8;
                    C8587e ad2 = AbstractC6451e.ad(AbstractC16497e.billing(f2), C5438e.f11668e, c13770e4, 54);
                    long j2 = c13770e4.f27286case;
                    int i13 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert2 = c13770e4.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e4, c0115e);
                    c13770e4.m3666import();
                    if (c13770e4.f27292implements) {
                        c13770e4.mopub(c7309e);
                    } else {
                        c13770e4.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e4, ad2, c14865e);
                    AbstractC2270e.yandex(c13770e4, advert2, c14865e2);
                    AbstractC8703e.premium(i13, c13770e4, c14865e3, c13770e4, c5430e);
                    AbstractC2270e.yandex(c13770e4, purchase2, c14865e4);
                    AbstractC14489e.vip(c13168e.f26143e, null, AbstractC0903e.license(c13770e4).admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e4).license, c13770e4, 0, 0, 131066);
                    if (c13168e.f26144e) {
                        c13770e4.m3676strictfp(1889268186);
                        InterfaceC12864e metrica = AbstractC16136e.metrica(c0115e, C3618e.vip(0.25f, AbstractC0903e.license(c13770e4).ad), AbstractC0903e.purchase(c13770e4).metrica);
                        InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
                        long j3 = c13770e4.f27286case;
                        int i14 = (int) (j3 ^ (j3 >>> 32));
                        InterfaceC3483e advert3 = c13770e4.advert();
                        InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e4, metrica);
                        c13770e4.m3666import();
                        if (c13770e4.f27292implements) {
                            c13770e4.mopub(c7309e);
                        } else {
                            c13770e4.m3684volatile();
                        }
                        AbstractC2270e.yandex(c13770e4, license, c14865e);
                        AbstractC2270e.yandex(c13770e4, advert3, c14865e2);
                        AbstractC8703e.premium(i14, c13770e4, c14865e3, c13770e4, c5430e);
                        AbstractC2270e.yandex(c13770e4, purchase3, c14865e4);
                        AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e4, R.string.ota_feed_card_beta), AbstractC12220e.advert(c0115e, f2, 4), AbstractC0903e.license(c13770e4).ad, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e4).amazon, c13770e4, 48, 0, 131064);
                        r2 = 1;
                        c13770e4.Signature(true);
                        r11 = 0;
                    } else {
                        r2 = 1;
                        r11 = 0;
                        c13770e4.m3676strictfp(1884137252);
                    }
                    c13770e4.Signature(r11);
                    c13770e4.Signature(r2);
                    String valueOf2 = String.valueOf(c13168e.f26145e);
                    String metrica2 = AbstractC13510e.metrica(((C5352e) interfaceC16400e).pro(), c13168e.f26147e);
                    Object[] objArr = new Object[2];
                    objArr[r11] = valueOf2;
                    objArr[r2] = metrica2;
                    AbstractC14489e.vip(AbstractC5297e.license(R.string.separator_strings, objArr, c13770e4), null, AbstractC0903e.license(c13770e4).remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e4).yandex, c13770e4, 0, 0, 131066);
                    AbstractC14489e.vip(c13168e.f26146e, null, AbstractC0903e.license(c13770e4).remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e4).mopub, c13770e4, 0, 0, 131066);
                    c13770e4.Signature(true);
                    AbstractC12534e.ad(c13770e4, AbstractC18007e.license(c0115e, f));
                    AbstractC8141e.vip(null, 0.0f, 0L, c13770e4, 0, 7);
                    c13770e4.Signature(false);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                C15181e c15181e = (C15181e) obj;
                int intValue9 = ((Number) obj2).intValue();
                C13770e c13770e5 = (C13770e) obj3;
                int intValue10 = ((Number) obj4).intValue();
                if ((intValue10 & 6) == 0) {
                    i5 = intValue10 | (c13770e5.purchase(c15181e) ? 4 : 2);
                } else {
                    i5 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    i5 |= c13770e5.license(intValue9) ? 32 : 16;
                }
                if (c13770e5.m3673protected(i5 & 1, (i5 & 147) != 146)) {
                    C14218e c14218e = (C14218e) list.get(intValue9);
                    c13770e5.m3676strictfp(-351357940);
                    AbstractC0865e.ad(null, null, null, null, null, AbstractC16653e.license(-878839716, new C1616e((C5422e) interfaceC16400e, c14218e, 5), c13770e5), c13770e5, 196608, 31);
                    c13770e5.Signature(false);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                C18055e c18055e5 = (C18055e) obj;
                int intValue11 = ((Number) obj2).intValue();
                C13770e c13770e6 = (C13770e) obj3;
                int intValue12 = ((Number) obj4).intValue();
                C7855e c7855e = (C7855e) interfaceC16400e;
                if ((intValue12 & 6) == 0) {
                    i6 = intValue12 | (c13770e6.purchase(c18055e5) ? 4 : 2);
                } else {
                    i6 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    i6 |= c13770e6.license(intValue11) ? 32 : 16;
                }
                if (c13770e6.m3673protected(i6 & 1, (i6 & 147) != 146)) {
                    C16523e c16523e = (C16523e) list.get(intValue11);
                    c13770e6.m3676strictfp(2096776270);
                    C12742e c12742e = c7855e.f15903e;
                    boolean contains = c12742e.contains(Integer.valueOf(intValue11));
                    boolean contains2 = c12742e.contains(Integer.valueOf(intValue11 - 1));
                    boolean contains3 = c12742e.contains(Integer.valueOf(intValue11 + 1));
                    String str = c16523e.metrica;
                    if (contains2 && contains3) {
                        c13770e6.m3676strictfp(1037482427);
                        c13770e6.Signature(false);
                        interfaceC16154e = AbstractC10432e.ad;
                    } else if (contains2) {
                        c13770e6.m3676strictfp(1037485565);
                        float f3 = 0;
                        interfaceC16154e = C3924e.metrica(((C7019e) c13770e6.adcel(AbstractC11785e.ad)).metrica.metrica, new C1536e(f3), new C1536e(f3), null, null, 12);
                        c13770e6.Signature(false);
                    } else if (contains3) {
                        c13770e6.m3676strictfp(2097569311);
                        float f4 = 0;
                        interfaceC16154e = C3924e.metrica(((C7019e) c13770e6.adcel(AbstractC11785e.ad)).metrica.metrica, null, null, new C1536e(f4), new C1536e(f4), 3);
                        c13770e6.Signature(false);
                    } else {
                        c13770e6.m3676strictfp(1037503507);
                        interfaceC16154e = ((C7019e) c13770e6.adcel(AbstractC11785e.ad)).metrica.metrica;
                        c13770e6.Signature(false);
                    }
                    InterfaceC16154e interfaceC16154e2 = interfaceC16154e;
                    boolean yandex2 = c13770e6.yandex(c7855e) | ((((i6 & 112) ^ 48) > 32 && c13770e6.license(intValue11)) || (i6 & 48) == 32);
                    Object m3681throw2 = c13770e6.m3681throw();
                    if (yandex2 || m3681throw2 == obj5) {
                        m3681throw2 = new C15199e(c7855e, intValue11, i10);
                        c13770e6.m3682throws(m3681throw2);
                    }
                    c7855e.isVip(contains, str, interfaceC16154e2, (Function0) m3681throw2, c13770e6, 24576);
                    c13770e6.Signature(false);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 6:
                C18055e c18055e6 = (C18055e) obj;
                int intValue13 = ((Number) obj2).intValue();
                C13770e c13770e7 = (C13770e) obj3;
                int intValue14 = ((Number) obj4).intValue();
                C2743e c2743e = (C2743e) interfaceC16400e;
                if ((intValue14 & 6) == 0) {
                    i7 = intValue14 | (c13770e7.purchase(c18055e6) ? 4 : 2);
                } else {
                    i7 = intValue14;
                }
                if ((intValue14 & 48) == 0) {
                    i7 |= c13770e7.license(intValue13) ? 32 : 16;
                }
                if (c13770e7.m3673protected(i7 & 1, (i7 & 147) != 146)) {
                    UmaTag umaTag = (UmaTag) list.get(intValue13);
                    c13770e7.m3676strictfp(109181908);
                    InterfaceC12864e metrica3 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex3 = c13770e7.yandex(c2743e) | c13770e7.yandex(umaTag);
                    Object m3681throw3 = c13770e7.m3681throw();
                    if (yandex3 || m3681throw3 == obj5) {
                        m3681throw3 = new C1021e(c2743e, umaTag, 29);
                        c13770e7.m3682throws(m3681throw3);
                    }
                    AbstractC16429e.ad(AbstractC16653e.license(1100022759, new C15221e(9, umaTag), c13770e7), AbstractC9546e.license(metrica3, false, null, (Function0) m3681throw3, 15), null, null, AbstractC16653e.license(-115407381, new C15221e(10, c2743e), c13770e7), AbstractC6069e.metrica, null, 0.0f, 0.0f, c13770e7, 221190, 460);
                    c13770e7.Signature(false);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            default:
                Object obj6 = (C18055e) obj;
                int intValue15 = ((Number) obj2).intValue();
                C13770e c13770e8 = (C13770e) obj3;
                int intValue16 = ((Number) obj4).intValue();
                C13679e c13679e = (C13679e) interfaceC16400e;
                if ((intValue16 & 6) == 0) {
                    i8 = intValue16 | (c13770e8.purchase(obj6) ? 4 : 2);
                } else {
                    i8 = intValue16;
                }
                if ((intValue16 & 48) == 0) {
                    i8 |= c13770e8.license(intValue15) ? 32 : 16;
                }
                if (c13770e8.m3673protected(i8 & 1, (i8 & 147) != 146)) {
                    UmaTrack umaTrack = (UmaTrack) list.get(intValue15);
                    c13770e8.m3676strictfp(668658399);
                    String str2 = umaTrack.ad;
                    boolean purchase4 = c13770e8.purchase(umaTrack);
                    Object m3681throw4 = c13770e8.m3681throw();
                    if (purchase4 || m3681throw4 == obj5) {
                        m3681throw4 = new C14772e(12, umaTrack);
                        c13770e8.m3682throws(m3681throw4);
                    }
                    Function1 function1 = (Function1) m3681throw4;
                    boolean yandex4 = c13770e8.yandex(c13679e) | c13770e8.purchase(umaTrack);
                    Object m3681throw5 = c13770e8.m3681throw();
                    if (yandex4 || m3681throw5 == obj5) {
                        m3681throw5 = new C2708e(c13679e, umaTrack, i11);
                        c13770e8.m3682throws(m3681throw5);
                    }
                    Function0 function0 = (Function0) m3681throw5;
                    AbstractC16049e m4166package = c13679e.m4166package();
                    C17150e.ad(str2, function1, function0, AbstractC7890e.billing(m4166package != null ? m4166package.Signature() : null, umaTrack.ad), c13679e.m4167private() == EnumC11342e.f22808e, c13770e8, 0);
                    c13770e8.Signature(false);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
