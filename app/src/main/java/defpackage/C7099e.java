package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7099e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2892e f14565e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14566e;

    public /* synthetic */ C7099e(C2892e c2892e) {
        this.f14566e = 6;
        float f = AbstractC17375e.ad;
        float f2 = AbstractC17375e.ad;
        this.f14565e = c2892e;
    }

    public /* synthetic */ C7099e(C2892e c2892e, int i) {
        this.f14566e = i;
        this.f14565e = c2892e;
    }

    public /* synthetic */ C7099e(C2892e c2892e, int i, int i2) {
        this.f14566e = i2;
        this.f14565e = c2892e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f14566e;
        C0115e c0115e = C0115e.f1276e;
        C2892e c2892e = this.f14565e;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    long billing = C12563e.billing();
                    C7913e c7913e = AbstractC18007e.ad;
                    InterfaceC12864e adcel = AbstractC18007e.adcel(c0115e, C16109e.vip(billing), C16109e.ad(billing));
                    InterfaceC2747e license = AbstractC17074e.license(C5438e.f11700e, false);
                    long j = c13770e.f27286case;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, adcel);
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
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i2), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    c2892e.invoke(c13770e, 0);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    long billing2 = C12563e.billing();
                    C7913e c7913e2 = AbstractC18007e.ad;
                    InterfaceC12864e adcel2 = AbstractC18007e.adcel(c0115e, C16109e.vip(billing2), C16109e.ad(billing2));
                    InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11700e, false);
                    long j2 = c13770e2.f27286case;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert2 = c13770e2.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, adcel2);
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
                    AbstractC2270e.yandex(c13770e2, Integer.valueOf(i3), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e2, purchase2, C2721e.license);
                    c2892e.invoke(c13770e2, 0);
                    c13770e2.Signature(true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC12184e.vip(c2892e, (C13770e) obj, AbstractC5190e.advert(7));
                return Unit.INSTANCE;
            case 3:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    c2892e.invoke(c13770e3, 0);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                C13770e c13770e4 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Object m3681throw = c13770e4.m3681throw();
                    if (m3681throw == C2987e.ad) {
                        m3681throw = new C17014e(29);
                        c13770e4.m3682throws(m3681throw);
                    }
                    InterfaceC12864e yandex = AbstractC12546e.yandex(c0115e, (Function1) m3681throw);
                    InterfaceC2747e license3 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j3 = c13770e4.f27286case;
                    int i4 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert3 = c13770e4.advert();
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e4, yandex);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e3 = C2721e.vip;
                    c13770e4.m3666import();
                    if (c13770e4.f27292implements) {
                        c13770e4.mopub(c7309e3);
                    } else {
                        c13770e4.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e4, license3, C2721e.billing);
                    AbstractC2270e.yandex(c13770e4, advert3, C2721e.purchase);
                    AbstractC2270e.appmetrica(c13770e4, Integer.valueOf(i4), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e4, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e4, purchase3, C2721e.license);
                    c2892e.invoke(c13770e4, 0);
                    c13770e4.Signature(true);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC10558e.license(c2892e, (C13770e) obj, AbstractC5190e.advert(7));
                return Unit.INSTANCE;
            case 6:
                float f = AbstractC17375e.vip;
                float f2 = AbstractC17375e.ad;
                C13770e c13770e5 = (C13770e) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 3) != 2)) {
                    InterfaceC12864e ad = AbstractC18007e.ad(c0115e, f, f2);
                    InterfaceC2747e license4 = AbstractC17074e.license(C5438e.f11700e, false);
                    long j4 = c13770e5.f27286case;
                    int i5 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC3483e advert4 = c13770e5.advert();
                    InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e5, ad);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e4 = C2721e.vip;
                    c13770e5.m3666import();
                    if (c13770e5.f27292implements) {
                        c13770e5.mopub(c7309e4);
                    } else {
                        c13770e5.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e5, license4, C2721e.billing);
                    AbstractC2270e.yandex(c13770e5, advert4, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e5, Integer.valueOf(i5), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e5, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e5, purchase4, C2721e.license);
                    c2892e.invoke(c13770e5, 0);
                    c13770e5.Signature(true);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 7:
                C13770e c13770e6 = (C13770e) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 3) != 2)) {
                    c2892e.invoke(C10023e.ad, c13770e6, 6);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                AbstractC8787e.ad(c2892e, (C13770e) obj, AbstractC5190e.advert(7));
                return Unit.INSTANCE;
            case 9:
                C13770e c13770e7 = (C13770e) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 3) != 2)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e7, R.string.np_title), null, ((C0896e) c13770e7.adcel(AbstractC3577e.ad)).vip, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e7, 0, 0, 262138);
                    c2892e.invoke(c13770e7, 0);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case 10:
                C13770e c13770e8 = (C13770e) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 3) != 2)) {
                    c2892e.invoke(c13770e8, 0);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                AbstractC6909e.ad(c2892e, (C13770e) obj, AbstractC5190e.advert(7));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC11261e.vip(c2892e, (C13770e) obj, AbstractC5190e.advert(7));
                return Unit.INSTANCE;
            case 13:
                C13770e c13770e9 = (C13770e) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if (c13770e9.m3673protected(intValue9 & 1, (intValue9 & 3) != 2)) {
                    InterfaceC12864e startapp = AbstractC11203e.startapp(c0115e, "Container");
                    InterfaceC2747e license5 = AbstractC17074e.license(C5438e.f11676e, true);
                    long j5 = c13770e9.f27286case;
                    int i6 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC3483e advert5 = c13770e9.advert();
                    InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e9, startapp);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e5 = C2721e.vip;
                    c13770e9.m3666import();
                    if (c13770e9.f27292implements) {
                        c13770e9.mopub(c7309e5);
                    } else {
                        c13770e9.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e9, license5, C2721e.billing);
                    AbstractC2270e.yandex(c13770e9, advert5, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e9, Integer.valueOf(i6), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e9, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e9, purchase5, C2721e.license);
                    c2892e.invoke(c13770e9, 0);
                    c13770e9.Signature(true);
                } else {
                    c13770e9.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e10 = (C13770e) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if (c13770e10.m3673protected(intValue10 & 1, (intValue10 & 3) != 2)) {
                    AbstractC14489e.ad(((C7019e) c13770e10.adcel(AbstractC11785e.ad)).vip.loadAd, c2892e, c13770e10, 0);
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
