package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkapi2.objects.music.AudioContentCard;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1616e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f4533e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f4534e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4535e;

    public /* synthetic */ C1616e(Object obj, Object obj2, int i) {
        this.f4535e = i;
        this.f4534e = obj;
        this.f4533e = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C14865e c14865e;
        int i;
        long j;
        boolean z;
        int i2 = this.f4535e;
        Object obj4 = C2987e.ad;
        int i3 = 8;
        C0115e c0115e = C0115e.f1276e;
        int i4 = 16;
        Object obj5 = this.f4533e;
        Object obj6 = this.f4534e;
        switch (i2) {
            case 0:
                C1631e c1631e = (C1631e) obj;
                C13770e c13770e = (C13770e) obj2;
                ((Number) obj3).intValue();
                ((InterfaceC10545e) obj6).ad(c1631e.metrica, AbstractC16653e.license(-433908510, new C2077e((C2892e) obj5, c1631e, 2), c13770e), c13770e, 48);
                return Unit.INSTANCE;
            case 1:
                AudioContentCard audioContentCard = (AudioContentCard) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC15876e abstractC15876e = (AbstractC15876e) obj5;
                C3675e c3675e = (C3675e) obj6;
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? c13770e2.purchase(audioContentCard) : c13770e2.yandex(audioContentCard) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    boolean yandex = c13770e2.yandex(c3675e);
                    Object m3681throw = c13770e2.m3681throw();
                    if (yandex || m3681throw == obj4) {
                        m3681throw = new C17322e(c3675e, 2);
                        c13770e2.m3682throws(m3681throw);
                    }
                    Function0 function0 = (Function0) m3681throw;
                    boolean yandex2 = c13770e2.yandex(abstractC15876e);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw2 == obj4) {
                        m3681throw2 = new C16847e(abstractC15876e, 1);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC16279e.ad(audioContentCard, function0, (Function0) m3681throw2, true, c13770e2, 3080 | (intValue & 14));
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj2;
                int intValue2 = ((Number) obj3).intValue();
                C13182e c13182e = (C13182e) obj5;
                AudioTrack audioTrack = (AudioTrack) obj6;
                if (c13770e3.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    InterfaceC12864e vip = AbstractC12447e.vip(c0115e, ((C7019e) c13770e3.adcel(AbstractC11785e.ad)).metrica.metrica);
                    InterfaceC17220e interfaceC17220e = (InterfaceC17220e) c13770e3.adcel(AbstractC10746e.ad);
                    boolean purchase = c13770e3.purchase(audioTrack) | c13770e3.yandex(c13182e);
                    Object m3681throw3 = c13770e3.m3681throw();
                    if (purchase || m3681throw3 == obj4) {
                        m3681throw3 = new C1021e(audioTrack, c13182e, 5);
                        c13770e3.m3682throws(m3681throw3);
                    }
                    Function0 function02 = (Function0) m3681throw3;
                    Object m3681throw4 = c13770e3.m3681throw();
                    if (m3681throw4 == obj4) {
                        m3681throw4 = C2997e.f7039e;
                        c13770e3.m3682throws(m3681throw4);
                    }
                    AbstractC8636e.ad(audioTrack, 0, 0L, 0L, 0, 0.0f, false, AbstractC10432e.ad, null, AbstractC9546e.appmetrica(vip, null, interfaceC17220e, false, function02, (Function0) m3681throw4, 444), c13770e3, 12582912, 382);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C13770e c13770e4 = (C13770e) obj2;
                int intValue3 = ((Number) obj3).intValue();
                C12340e c12340e = (C12340e) obj5;
                C6563e c6563e = (C6563e) obj6;
                if (c13770e4.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                    for (C6828e c6828e : c6563e.license) {
                        boolean billing = AbstractC7890e.billing(c12340e.f24735e.get(c6563e.ad), c6828e.ad);
                        boolean billing2 = c13770e4.billing(billing) | c13770e4.yandex(c12340e) | c13770e4.yandex(c6563e) | c13770e4.yandex(c6828e);
                        Object m3681throw5 = c13770e4.m3681throw();
                        if (billing2 || m3681throw5 == obj4) {
                            m3681throw5 = new C6398e(billing, c12340e, c6563e, c6828e);
                            c13770e4.m3682throws(m3681throw5);
                        }
                        AbstractC2937e.license(billing, (Function0) m3681throw5, AbstractC16653e.license(-2104649022, new C15221e(i3, c6828e), c13770e4), null, false, billing ? AbstractC16994e.f33295e : null, null, null, null, null, null, null, c13770e4, 384, 16344);
                    }
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                C13770e c13770e5 = (C13770e) obj2;
                int intValue4 = ((Number) obj3).intValue();
                C0943e c0943e = (C0943e) obj6;
                if (c13770e5.m3673protected(intValue4 & 1, (intValue4 & 17) != 16)) {
                    InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
                    float f = AbstractC11992e.ad;
                    AbstractC16429e.ad(AbstractC16653e.license(1065109200, new C17183e(c0943e, 0), c13770e5), metrica, null, AbstractC16653e.license(-1348136595, new C17183e(c0943e, 1), c13770e5), AbstractC16653e.license(2142415436, new C17183e(c0943e, 2), c13770e5), AbstractC16653e.license(1338000171, new C2077e(c0943e, (C6267e) obj5, i4), c13770e5), AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e5, 510), 0.0f, 0.0f, c13770e5, 224310, 388);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e6 = (C13770e) obj2;
                int intValue5 = ((Number) obj3).intValue();
                boolean z2 = (intValue5 & 17) != 16;
                AbstractC7919e abstractC7919e = c13770e6.ad;
                if (c13770e6.m3673protected(intValue5 & 1, z2)) {
                    InterfaceC12864e mopub = AbstractC12220e.mopub(c0115e, 16);
                    C13964e billing3 = AbstractC16497e.billing(8);
                    C5422e c5422e = (C5422e) obj6;
                    C14218e c14218e = (C14218e) obj5;
                    C9577e c9577e = C5438e.f11672e;
                    C4789e ad = AbstractC14801e.ad(billing3, c9577e, c13770e6, 6);
                    long j2 = c13770e6.f27286case;
                    int i5 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert = c13770e6.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e6, mopub);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e6.m3666import();
                    if (c13770e6.f27292implements) {
                        c13770e6.mopub(c7309e);
                    } else {
                        c13770e6.m3684volatile();
                    }
                    C14865e c14865e2 = C2721e.billing;
                    AbstractC2270e.yandex(c13770e6, ad, c14865e2);
                    C14865e c14865e3 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e6, advert, c14865e3);
                    Integer valueOf = Integer.valueOf(i5);
                    C14865e c14865e4 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e6, valueOf, c14865e4);
                    C5430e c5430e = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e6, c5430e);
                    C14865e c14865e5 = C2721e.license;
                    AbstractC2270e.yandex(c13770e6, purchase2, c14865e5);
                    C8587e ad2 = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11668e, c13770e6, 48);
                    long j3 = c13770e6.f27286case;
                    int i6 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert2 = c13770e6.advert();
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e6, c0115e);
                    c13770e6.m3666import();
                    if (c13770e6.f27292implements) {
                        c13770e6.mopub(c7309e);
                    } else {
                        c13770e6.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e6, ad2, c14865e2);
                    AbstractC2270e.yandex(c13770e6, advert2, c14865e3);
                    AbstractC8703e.premium(i6, c13770e6, c14865e4, c13770e6, c5430e);
                    AbstractC2270e.yandex(c13770e6, purchase3, c14865e5);
                    int i7 = c14218e.ad;
                    int i8 = c14218e.license;
                    if (i8 == 2 || i8 == 3) {
                        c14865e = c14865e4;
                        i = i7;
                        c13770e6.m3676strictfp(538424921);
                        j = ((C7019e) c13770e6.adcel(AbstractC11785e.ad)).ad.admob;
                        c13770e6.Signature(false);
                    } else {
                        c13770e6.m3676strictfp(538544891);
                        c14865e = c14865e4;
                        i = i7;
                        j = ((C7019e) c13770e6.adcel(AbstractC11785e.ad)).ad.ad;
                        c13770e6.Signature(false);
                    }
                    long j4 = j;
                    boolean z3 = c14218e.ad != R.drawable.vknext_logo;
                    AbstractC11110e abstractC11110e = C5422e.f11613e;
                    C14865e c14865e6 = c14865e;
                    c5422e.m1912strictfp(i, null, j4, z3, 0.0f, 0.0f, c13770e6, 0, 50);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    AbstractC12534e.ad(c13770e6, new C5228e(1.0f, true));
                    if (i8 == 2) {
                        c13770e6.m3676strictfp(538890851);
                        AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e6, R.string.bc_v2_m_title_soon), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e6.adcel(AbstractC11785e.ad)).vip.amazon, c13770e6, 0, 0, 131070);
                        z = false;
                    } else {
                        z = false;
                        c13770e6.m3676strictfp(516703500);
                    }
                    c13770e6.Signature(z);
                    c13770e6.Signature(true);
                    C4789e ad3 = AbstractC14801e.ad(AbstractC16497e.billing(4), c9577e, c13770e6, 6);
                    long j5 = c13770e6.f27286case;
                    int i9 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC3483e advert3 = c13770e6.advert();
                    InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e6, c0115e);
                    c13770e6.m3666import();
                    if (c13770e6.f27292implements) {
                        c13770e6.mopub(c7309e);
                    } else {
                        c13770e6.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e6, ad3, c14865e2);
                    AbstractC2270e.yandex(c13770e6, advert3, c14865e3);
                    AbstractC8703e.premium(i9, c13770e6, c14865e6, c13770e6, c5430e);
                    AbstractC2270e.yandex(c13770e6, purchase4, c14865e5);
                    String appmetrica = AbstractC5297e.appmetrica(c13770e6, c14218e.vip);
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica, null, ((C7019e) c13770e6.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e6.adcel(c15492e)).vip.billing, c13770e6, 0, 0, 131066);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e6, c14218e.metrica), null, ((C7019e) c13770e6.adcel(c15492e)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e6.adcel(c15492e)).vip.mopub, c13770e6, 0, 0, 131066);
                    c13770e6.Signature(true);
                    c13770e6.Signature(true);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
