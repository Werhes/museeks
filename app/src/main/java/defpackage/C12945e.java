package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12945e implements Function4 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ List f25799e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25800e;

    public /* synthetic */ C12945e(int i, List list) {
        this.f25800e = i;
        this.f25799e = list;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        C13770e c13770e;
        int i5 = this.f25800e;
        C0115e c0115e = C0115e.f1276e;
        List list = this.f25799e;
        int i6 = 2;
        int i7 = 0;
        int i8 = 1;
        switch (i5) {
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
                    C5215e c5215e = (C5215e) list.get(intValue);
                    c13770e2.m3676strictfp(-703999060);
                    c5215e.getClass();
                    InterfaceC12864e license = AbstractC9546e.license(AbstractC18007e.metrica(c0115e, 1.0f), false, null, c5215e.appmetrica, 15);
                    float f = AbstractC11992e.ad;
                    AbstractC16429e.ad(AbstractC16653e.license(-395968261, new C1978e(c5215e, i7), c13770e2), license, null, AbstractC16653e.license(306685528, new C1978e(c5215e, i8), c13770e2), AbstractC16653e.license(1972559223, new C1978e(c5215e, i6), c13770e2), null, AbstractC11992e.ad(C3618e.startapp, 0L, ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).ad.admob, 0L, c13770e2, 506), 0.0f, 0.0f, c13770e2, 27654, 388);
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
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (c13770e3.purchase(c18055e2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= c13770e3.license(intValue3) ? 32 : 16;
                }
                if (c13770e3.m3673protected(i2 & 1, (i2 & 147) != 146)) {
                    AlbumThumb albumThumb = (AlbumThumb) list.get(intValue3);
                    c13770e3.m3676strictfp(-715590445);
                    float f2 = 8;
                    InterfaceC12864e startapp = AbstractC18007e.startapp(AbstractC12447e.vip(c0115e, AbstractC6549e.ad(f2)), 64);
                    C15492e c15492e = AbstractC11785e.ad;
                    InterfaceC12864e metrica = AbstractC16136e.metrica(startapp, ((C7019e) c13770e3.adcel(c15492e)).ad.subscription, AbstractC10432e.ad);
                    InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11700e, false);
                    long j = c13770e3.f27286case;
                    int i9 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e3.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e3, metrica);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e3.m3666import();
                    if (c13770e3.f27292implements) {
                        c13770e3.mopub(c7309e);
                    } else {
                        c13770e3.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e3, license2, C2721e.billing);
                    AbstractC2270e.yandex(c13770e3, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e3, Integer.valueOf(i9), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e3, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e3, purchase, C2721e.license);
                    AbstractC8461e.vip(albumThumb.metrica, null, AbstractC18007e.startapp(AbstractC12447e.vip(c0115e, AbstractC6549e.ad(f2)), 56), new C6159e(((C7019e) c13770e3.adcel(c15492e)).ad.ads), null, null, c13770e3, 4144, 0, 32752);
                    c13770e3.Signature(true);
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
                if ((intValue6 & 6) == 0) {
                    i3 = intValue6 | (c13770e4.purchase(c18055e3) ? 4 : 2);
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= c13770e4.license(intValue5) ? 32 : 16;
                }
                if (c13770e4.m3673protected(i3 & 1, (i3 & 147) != 146)) {
                    C16438e c16438e = (C16438e) list.get(intValue5);
                    c13770e4.m3676strictfp(2118676982);
                    c16438e.ad(c13770e4, 0);
                    c13770e4.Signature(false);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C18055e c18055e4 = (C18055e) obj;
                int intValue7 = ((Number) obj2).intValue();
                C13770e c13770e5 = (C13770e) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    i4 = intValue8 | (c13770e5.purchase(c18055e4) ? 4 : 2);
                } else {
                    i4 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i4 |= c13770e5.license(intValue7) ? 32 : 16;
                }
                if (c13770e5.m3673protected(i4 & 1, (i4 & 147) != 146)) {
                    InterfaceC12391e interfaceC12391e = (InterfaceC12391e) list.get(intValue7);
                    c13770e5.m3676strictfp(-1767083960);
                    if (interfaceC12391e instanceof C13356e) {
                        c13770e5.m3676strictfp(-1767022767);
                        c13770e5.Signature(false);
                        c13770e = c13770e5;
                    } else {
                        if (!(interfaceC12391e instanceof C16523e)) {
                            throw AbstractC1786e.loadAd(-611192037, c13770e5, false);
                        }
                        c13770e5.m3676strictfp(-1766918266);
                        String str = ((C16523e) interfaceC12391e).metrica;
                        C15492e c15492e2 = AbstractC11785e.ad;
                        AbstractC14489e.vip(str, AbstractC18007e.metrica(AbstractC12220e.advert(AbstractC12447e.vip(c0115e, ((C7019e) c13770e5.adcel(c15492e2)).metrica.metrica), 16, 8), 1.0f), ((C7019e) c13770e5.adcel(c15492e2)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e5.adcel(c15492e2)).vip.purchase, c13770e5, 0, 0, 131064);
                        c13770e = c13770e5;
                        c13770e.Signature(false);
                    }
                    c13770e.Signature(false);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
