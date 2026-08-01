package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e۠ؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18401e implements Function4 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f36082e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f36083e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f36084e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f36085e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f36086e;

    public C18401e(EnumC13413e enumC13413e, Function1 function1, InterfaceC16132e interfaceC16132e, InterfaceC3314e interfaceC3314e) {
        this.f36086e = 3;
        this.f36084e = enumC13413e;
        this.f36083e = function1;
        this.f36082e = interfaceC16132e;
        this.f36085e = interfaceC3314e;
    }

    public /* synthetic */ C18401e(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f36086e = i;
        this.f36084e = obj;
        this.f36083e = obj2;
        this.f36085e = obj3;
        this.f36082e = obj4;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C18236e c18236e;
        int i6;
        int i7 = this.f36086e;
        Object obj5 = C2987e.ad;
        C0115e c0115e = C0115e.f1276e;
        Object obj6 = this.f36082e;
        Object obj7 = this.f36085e;
        Object obj8 = this.f36083e;
        Object obj9 = this.f36084e;
        int i8 = 0;
        switch (i7) {
            case 0:
                C18055e c18055e = (C18055e) obj;
                int intValue = ((Number) obj2).intValue();
                C13770e c13770e = (C13770e) obj3;
                int intValue2 = ((Number) obj4).intValue();
                C8006e c8006e = (C8006e) obj8;
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (c13770e.purchase(c18055e) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= c13770e.license(intValue) ? 32 : 16;
                }
                int i9 = 1;
                if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
                    MainArtist mainArtist = (MainArtist) ((List) obj9).get(intValue);
                    c13770e.m3676strictfp(1882687356);
                    C2892e license = AbstractC16653e.license(-858464594, new C15221e(i9, mainArtist), c13770e);
                    InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex = c13770e.yandex(c8006e) | c13770e.yandex(mainArtist);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == obj5) {
                        m3681throw = new C12056e(c8006e, mainArtist, 4);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC16429e.ad(license, AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), null, null, null, AbstractC16653e.license(766802953, new C7803e(mainArtist, (InterfaceC3314e) obj7, (InterfaceC3314e) obj6, 0), c13770e), null, 0.0f, 0.0f, c13770e, 196614, 476);
                    AbstractC8141e.ad(null, 0.0f, 0L, c13770e, 0, 7);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C12692e c12692e = (C12692e) obj;
                ((Boolean) obj2).getClass();
                C13770e c13770e2 = (C13770e) obj3;
                int intValue3 = ((Number) obj4).intValue();
                C13182e c13182e = (C13182e) obj8;
                AudioTrack audioTrack = (AudioTrack) obj9;
                if ((intValue3 & 6) == 0) {
                    intValue3 |= c13770e2.purchase(c12692e) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue3 & 1, (intValue3 & 131) != 130)) {
                    AbstractC6401e.vip(AbstractC16653e.license(-340573141, new C1616e(audioTrack, c13182e, 2), c13770e2), AbstractC16653e.license(-76552276, new C11783e(4, audioTrack), c13770e2), AbstractC12220e.advert(AbstractC18007e.metrica(c0115e, 1.0f), 16, 6), AbstractC16653e.license(451489454, new C4516e(c13182e, (String) obj7, c12692e, (InterfaceC5178e) obj6), c13770e2), c13770e2, 3510, 0);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C18055e c18055e2 = (C18055e) obj;
                int intValue4 = ((Number) obj2).intValue();
                C13770e c13770e3 = (C13770e) obj3;
                int intValue5 = ((Number) obj4).intValue();
                C13182e c13182e2 = (C13182e) obj8;
                if ((intValue5 & 6) == 0) {
                    i2 = intValue5 | (c13770e3.purchase(c18055e2) ? 4 : 2);
                } else {
                    i2 = intValue5;
                }
                if ((intValue5 & 48) == 0) {
                    i2 |= c13770e3.license(intValue4) ? 32 : 16;
                }
                if (c13770e3.m3673protected(i2 & 1, (i2 & 147) != 146)) {
                    AudioTrack audioTrack2 = (AudioTrack) ((List) obj9).get(intValue4);
                    c13770e3.m3676strictfp(1398950777);
                    audioTrack2.getClass();
                    String billing = AbstractC6914e.billing(audioTrack2);
                    AbstractC7763e.vip(c18055e2, (C10743e) obj7, billing, AbstractC1376e.ad(c0115e, c13182e2.f26176e.get(billing) == EnumC10584e.f20884e ? 0.75f : 1.0f), false, null, AbstractC16653e.license(23205881, new C18401e(audioTrack2, c13182e2, billing, (InterfaceC5178e) obj6, 1), c13770e3), c13770e3, (i2 & 14) | 1572864, 24);
                    c13770e3.Signature(false);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C18055e c18055e3 = (C18055e) obj;
                int intValue6 = ((Number) obj2).intValue();
                C13770e c13770e4 = (C13770e) obj3;
                int intValue7 = ((Number) obj4).intValue();
                Function1 function1 = (Function1) obj8;
                EnumC13413e enumC13413e = (EnumC13413e) obj9;
                if ((intValue7 & 6) == 0) {
                    i3 = intValue7 | (c13770e4.purchase(c18055e3) ? 4 : 2);
                } else {
                    i3 = intValue7;
                }
                if ((intValue7 & 48) == 0) {
                    i3 |= c13770e4.license(intValue6) ? 32 : 16;
                }
                if (c13770e4.m3673protected(i3 & 1, (i3 & 147) != 146)) {
                    EnumC13413e enumC13413e2 = (EnumC13413e) EnumC13413e.f26665e.get(intValue6);
                    c13770e4.m3676strictfp(-1733794304);
                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e4, 0);
                    long j = c13770e4.f27286case;
                    int i10 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e4.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e4, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e4.m3666import();
                    if (c13770e4.f27292implements) {
                        c13770e4.mopub(c7309e);
                    } else {
                        c13770e4.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e4, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e4, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e4, Integer.valueOf(i10), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e4, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e4, purchase, C2721e.license);
                    boolean z = enumC13413e == enumC13413e2;
                    enumC13413e2.getClass();
                    boolean z2 = (enumC13413e2 == EnumC13413e.f26666e || enumC13413e2 == EnumC13413e.f26664e || ((Boolean) ((InterfaceC16132e) obj6).getValue()).booleanValue()) ? false : true;
                    InterfaceC12864e metrica2 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean z3 = enumC13413e != enumC13413e2;
                    boolean purchase2 = c13770e4.purchase(function1) | c13770e4.license(enumC13413e2.ordinal());
                    Object m3681throw2 = c13770e4.m3681throw();
                    if (purchase2 || m3681throw2 == obj5) {
                        m3681throw2 = new C7965e(7, function1, enumC13413e2, (InterfaceC3314e) obj7);
                        c13770e4.m3682throws(m3681throw2);
                    }
                    AbstractC12185e.vip(enumC13413e2, z, z2, AbstractC9546e.license(metrica2, z3, null, (Function0) m3681throw2, 14), c13770e4, 0);
                    AbstractC8141e.vip(null, 0.0f, 0L, c13770e4, 0, 7);
                    c13770e4.Signature(true);
                    c13770e4.Signature(false);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                int i11 = 1;
                C18055e c18055e4 = (C18055e) obj;
                int intValue8 = ((Number) obj2).intValue();
                C13770e c13770e5 = (C13770e) obj3;
                int intValue9 = ((Number) obj4).intValue();
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj8;
                if ((intValue9 & 6) == 0) {
                    i4 = intValue9 | (c13770e5.purchase(c18055e4) ? 4 : 2);
                } else {
                    i4 = intValue9;
                }
                if ((intValue9 & 48) == 0) {
                    i4 |= c13770e5.license(intValue8) ? 32 : 16;
                }
                if (c13770e5.m3673protected(i4 & 1, (i4 & 147) != 146)) {
                    C17196e c17196e = (C17196e) ((List) obj9).get(intValue8);
                    c13770e5.m3676strictfp(482033011);
                    C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e5, 0);
                    long j2 = c13770e5.f27286case;
                    int i12 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert2 = c13770e5.advert();
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e5, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e2 = C2721e.vip;
                    c13770e5.m3666import();
                    if (c13770e5.f27292implements) {
                        c13770e5.mopub(c7309e2);
                    } else {
                        c13770e5.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e5, ad2, C2721e.billing);
                    AbstractC2270e.yandex(c13770e5, advert2, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e5, Integer.valueOf(i12), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e5, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e5, purchase3, C2721e.license);
                    InterfaceC12864e metrica3 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex2 = c13770e5.yandex(interfaceC18435e) | c13770e5.yandex(c17196e);
                    Object m3681throw3 = c13770e5.m3681throw();
                    if (yandex2 || m3681throw3 == obj5) {
                        m3681throw3 = new C13216e(interfaceC18435e, c17196e, i8);
                        c13770e5.m3682throws(m3681throw3);
                    }
                    InterfaceC12864e license2 = AbstractC9546e.license(metrica3, false, null, (Function0) m3681throw3, 15);
                    float f = AbstractC11992e.ad;
                    AbstractC16429e.ad(AbstractC16653e.license(-1859419424, new C15221e(6, c17196e), c13770e5), license2, null, null, AbstractC16653e.license(1753443932, new C7803e(c17196e, interfaceC18435e, (InterfaceC16132e) obj7, i11), c13770e5), AbstractC16653e.license(-1638307525, new C2077e((C12785e) obj6, c17196e, 13), c13770e5), AbstractC11992e.ad(0L, 0L, ((C7019e) c13770e5.adcel(AbstractC11785e.ad)).ad.ad, 0L, c13770e5, 507), 0.0f, 0.0f, c13770e5, 221190, 396);
                    AbstractC8141e.vip(null, 0.0f, 0L, c13770e5, 0, 7);
                    c13770e5.Signature(true);
                    c13770e5.Signature(false);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                Object obj10 = (C18055e) obj;
                int intValue10 = ((Number) obj2).intValue();
                C13770e c13770e6 = (C13770e) obj3;
                int intValue11 = ((Number) obj4).intValue();
                Function1 function12 = (Function1) obj6;
                Function1 function13 = (Function1) obj7;
                if ((intValue11 & 6) == 0) {
                    i5 = intValue11 | (c13770e6.purchase(obj10) ? 4 : 2);
                } else {
                    i5 = intValue11;
                }
                if ((intValue11 & 48) == 0) {
                    i5 |= c13770e6.license(intValue10) ? 32 : 16;
                }
                if (c13770e6.m3673protected(i5 & 1, (i5 & 147) != 146)) {
                    C11973e c11973e = (C11973e) ((List) obj9).get(intValue10);
                    c13770e6.m3676strictfp(2013871923);
                    C18422e c18422e = c11973e.vip;
                    C5442e c5442e = c18422e.admob;
                    String str = (c5442e == null || (c18236e = c5442e.appmetrica) == null) ? null : c18236e.purchase;
                    String str2 = c18422e.license;
                    String str3 = c18422e.ad;
                    boolean booleanValue = ((Boolean) ((Function1) obj8).invoke(c11973e.ad)).booleanValue();
                    boolean purchase4 = c13770e6.purchase(function13) | c13770e6.yandex(c11973e);
                    Object m3681throw4 = c13770e6.m3681throw();
                    if (purchase4 || m3681throw4 == obj5) {
                        m3681throw4 = new C4006e(function13, c11973e, 3);
                        c13770e6.m3682throws(m3681throw4);
                    }
                    Function0 function0 = (Function0) m3681throw4;
                    InterfaceC12864e metrica4 = AbstractC18007e.metrica(c0115e, 1.0f);
                    InterfaceC17220e interfaceC17220e = (InterfaceC17220e) c13770e6.adcel(AbstractC10746e.ad);
                    boolean purchase5 = c13770e6.purchase(function12) | c13770e6.yandex(c11973e);
                    Object m3681throw5 = c13770e6.m3681throw();
                    if (purchase5 || m3681throw5 == obj5) {
                        m3681throw5 = new C4006e(function12, c11973e, 4);
                        c13770e6.m3682throws(m3681throw5);
                    }
                    Function0 function02 = (Function0) m3681throw5;
                    boolean purchase6 = c13770e6.purchase(function13) | c13770e6.yandex(c11973e);
                    Object m3681throw6 = c13770e6.m3681throw();
                    if (purchase6 || m3681throw6 == obj5) {
                        m3681throw6 = new C4006e(function13, c11973e, 5);
                        c13770e6.m3682throws(m3681throw6);
                    }
                    AbstractC1660e.vip(0, c13770e6, AbstractC9546e.appmetrica(metrica4, null, interfaceC17220e, false, function02, (Function0) m3681throw6, 444), str, str2, str3, function0, booleanValue);
                    c13770e6.Signature(false);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C18055e c18055e5 = (C18055e) obj;
                int intValue12 = ((Number) obj2).intValue();
                C13770e c13770e7 = (C13770e) obj3;
                int intValue13 = ((Number) obj4).intValue();
                if ((intValue13 & 6) == 0) {
                    i6 = intValue13 | (c13770e7.purchase(c18055e5) ? 4 : 2);
                } else {
                    i6 = intValue13;
                }
                if ((intValue13 & 48) == 0) {
                    i6 |= c13770e7.license(intValue12) ? 32 : 16;
                }
                if (c13770e7.m3673protected(i6 & 1, (i6 & 147) != 146)) {
                    CachedPlaylist cachedPlaylist = ((C13217e) ((List) obj9).get(intValue12)).ad;
                    c13770e7.m3676strictfp(265177713);
                    AbstractC7763e.vip(c18055e5, (C10743e) obj8, cachedPlaylist.m4683class(), null, false, null, AbstractC16653e.license(-1067072541, new C4208e(8, (C17047e) obj7, cachedPlaylist, (InterfaceC5178e) obj6), c13770e7), c13770e7, (i6 & 14) | 1572864, 28);
                    c13770e7.Signature(false);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
