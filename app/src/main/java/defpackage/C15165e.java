package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؑۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15165e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2277e f30021e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30022e;

    public /* synthetic */ C15165e(C2277e c2277e, int i) {
        this.f30022e = i;
        this.f30021e = c2277e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        switch (this.f30022e) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    C14544e c14544e = C5438e.f11668e;
                    C13964e billing = AbstractC16497e.billing(16);
                    C0115e c0115e = C0115e.f1276e;
                    InterfaceC12864e advert = AbstractC12220e.advert(c0115e, 8, 4);
                    C8587e ad = AbstractC6451e.ad(billing, c14544e, c13770e, 54);
                    long j = c13770e.f27286case;
                    int i = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert2 = c13770e.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, advert);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e, advert2, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    C2277e c2277e = this.f30021e;
                    C5767e c5767e = c2277e.appmetrica;
                    AbstractC8461e.ad(c5767e != null ? c5767e.ad : null, null, AbstractC12447e.vip(AbstractC18007e.startapp(c0115e, 56), AbstractC6549e.ad), C16477e.ad, null, c13770e, 1572912, 1976);
                    AbstractC14489e.vip(c2277e.ad, null, C3618e.vip, 0L, null, C1812e.f4889e, AbstractC16795e.metrica, 0L, null, 0L, 0, false, 1, 0, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).vip.mopub, c13770e, 1573248, 24576, 114490);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                boolean z2 = (intValue2 & 17) != 16;
                AbstractC7919e abstractC7919e = c13770e2.ad;
                if (c13770e2.m3673protected(intValue2 & 1, z2)) {
                    C14544e c14544e2 = C5438e.f11668e;
                    C13964e billing2 = AbstractC16497e.billing(16);
                    C0115e c0115e2 = C0115e.f1276e;
                    InterfaceC12864e advert3 = AbstractC12220e.advert(c0115e2, 8, 4);
                    C8587e ad2 = AbstractC6451e.ad(billing2, c14544e2, c13770e2, 54);
                    long j2 = c13770e2.f27286case;
                    int i2 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert4 = c13770e2.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, advert3);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e2 = C2721e.vip;
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e2);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    C14865e c14865e = C2721e.billing;
                    AbstractC2270e.yandex(c13770e2, ad2, c14865e);
                    C14865e c14865e2 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e2, advert4, c14865e2);
                    Integer valueOf = Integer.valueOf(i2);
                    C14865e c14865e3 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e2, valueOf, c14865e3);
                    C5430e c5430e = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e2, c5430e);
                    C14865e c14865e4 = C2721e.license;
                    AbstractC2270e.yandex(c13770e2, purchase2, c14865e4);
                    C2277e c2277e2 = this.f30021e;
                    C5767e c5767e2 = c2277e2.appmetrica;
                    String str = c5767e2 != null ? c5767e2.ad : null;
                    InterfaceC12864e startapp = AbstractC18007e.startapp(c0115e2, 48);
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC8461e.ad(str, null, AbstractC12447e.vip(startapp, ((C7019e) c13770e2.adcel(c15492e)).metrica.license), C16477e.ad, null, c13770e2, 1572912, 1976);
                    C4789e ad3 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e2, 0);
                    long j3 = c13770e2.f27286case;
                    int i3 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert5 = c13770e2.advert();
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e2, c0115e2);
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e2);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e2, ad3, c14865e);
                    AbstractC2270e.yandex(c13770e2, advert5, c14865e2);
                    AbstractC8703e.premium(i3, c13770e2, c14865e3, c13770e2, c5430e);
                    AbstractC2270e.yandex(c13770e2, purchase3, c14865e4);
                    String str2 = c2277e2.ad;
                    C1839e c1839e = ((C7019e) c13770e2.adcel(c15492e)).vip.mopub;
                    C1812e c1812e = C1812e.f4889e;
                    long j4 = C3618e.vip;
                    AbstractC14489e.vip(str2, null, j4, 0L, null, c1812e, null, 0L, null, 0L, 0, false, 1, 0, c1839e, c13770e2, 1573248, 24576, 114618);
                    String str3 = c2277e2.vip;
                    C1839e c1839e2 = ((C7019e) c13770e2.adcel(c15492e)).vip.mopub;
                    C1812e c1812e2 = C1812e.f4893e;
                    AbstractC14489e.vip(str3, null, C3618e.vip(0.5f, j4), 0L, null, c1812e2, null, 0L, null, 0L, 0, false, 1, 0, c1839e2, c13770e2, 1573248, 24576, 114618);
                    C13770e c13770e3 = c13770e2;
                    if (c2277e2.metrica.length() > 0) {
                        c13770e3.m3676strictfp(-102375095);
                        AbstractC14489e.vip(c2277e2.metrica, null, C3618e.vip(0.5f, j4), 0L, null, c1812e2, null, 0L, null, 0L, 0, false, 1, 0, ((C7019e) c13770e3.adcel(c15492e)).vip.mopub, c13770e3, 1573248, 24576, 114618);
                        c13770e3 = c13770e3;
                        z = false;
                    } else {
                        z = false;
                        c13770e3.m3676strictfp(-124351491);
                    }
                    c13770e3.Signature(z);
                    c13770e3.Signature(true);
                    c13770e3.Signature(true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
