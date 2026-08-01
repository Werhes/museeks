package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۡٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2920e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f6907e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6908e;

    public /* synthetic */ C2920e(int i, Function2 function2) {
        this.f6908e = 16;
        this.f6907e = function2;
    }

    public /* synthetic */ C2920e(Function2 function2, int i, byte b) {
        this.f6908e = i;
        this.f6907e = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC5039e interfaceC5039e;
        switch (this.f6908e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    InterfaceC12864e premium = AbstractC12220e.adcel(C0115e.f1276e, AbstractC1981e.purchase).premium(new C15061e(C5438e.f11678e));
                    InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
                    long j = c13770e.f27286case;
                    int i = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, premium);
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
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    this.f6907e.invoke(c13770e, 0);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    InterfaceC12864e premium2 = AbstractC12220e.adcel(new C5228e(1.0f, false), AbstractC1981e.yandex).premium(new C15061e(C5438e.f11672e));
                    InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j2 = c13770e2.f27286case;
                    int i2 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert2 = c13770e2.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, premium2);
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
                    AbstractC2270e.yandex(c13770e2, Integer.valueOf(i2), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e2, purchase2, C2721e.license);
                    this.f6907e.invoke(c13770e2, 0);
                    c13770e2.Signature(true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    InterfaceC12864e ads = AbstractC6532e.ads(C0115e.f1276e, 4, 0.0f, 2);
                    InterfaceC2747e license3 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j3 = c13770e3.f27286case;
                    int i3 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert3 = c13770e3.advert();
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e3, ads);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e3 = C2721e.vip;
                    c13770e3.m3666import();
                    if (c13770e3.f27292implements) {
                        c13770e3.mopub(c7309e3);
                    } else {
                        c13770e3.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e3, license3, C2721e.billing);
                    AbstractC2270e.yandex(c13770e3, advert3, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e3, Integer.valueOf(i3), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e3, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e3, purchase3, C2721e.license);
                    this.f6907e.invoke(c13770e3, 0);
                    c13770e3.Signature(true);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C13770e c13770e4 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Object m3681throw = c13770e4.m3681throw();
                    if (m3681throw == C2987e.ad) {
                        m3681throw = new C17014e(28);
                        c13770e4.m3682throws(m3681throw);
                    }
                    InterfaceC12864e yandex = AbstractC12546e.yandex(C0115e.f1276e, (Function1) m3681throw);
                    InterfaceC2747e license4 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j4 = c13770e4.f27286case;
                    int i4 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC3483e advert4 = c13770e4.advert();
                    InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e4, yandex);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e4 = C2721e.vip;
                    c13770e4.m3666import();
                    if (c13770e4.f27292implements) {
                        c13770e4.mopub(c7309e4);
                    } else {
                        c13770e4.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e4, license4, C2721e.billing);
                    AbstractC2270e.yandex(c13770e4, advert4, C2721e.purchase);
                    AbstractC2270e.appmetrica(c13770e4, Integer.valueOf(i4), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e4, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e4, purchase4, C2721e.license);
                    this.f6907e.invoke(c13770e4, 0);
                    c13770e4.Signature(true);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                return new C11028e((C8181e) ((C17927e) obj2).ad.invoke(((C11028e) obj).ad), this.f6907e);
            case 5:
                File file = (File) obj;
                if (this.f6907e.invoke(file, (IOException) obj2) != EnumC7377e.f15118e) {
                    return Unit.INSTANCE;
                }
                throw new C13593e(file, (File) null, (String) null);
            case 6:
                C13770e c13770e5 = (C13770e) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 3) != 2)) {
                    AbstractC10600e.ad(((C10375e) c13770e5.adcel(AbstractC17878e.ad)).advert, this.f6907e, c13770e5, 0);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 7:
                C13840e c13840e = (C13840e) obj;
                List list = (List) this.f6907e.invoke(c13840e, obj2);
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Object obj3 = list.get(i5);
                    if (obj3 != null && (interfaceC5039e = c13840e.f27414e) != null && !interfaceC5039e.metrica(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i5 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 8:
                C13770e c13770e6 = (C13770e) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 3) != 2)) {
                    InterfaceC12864e vip = AbstractC18007e.vip(C0115e.f1276e, AbstractC14493e.yandex, 0.0f, 2);
                    InterfaceC2747e license5 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j5 = c13770e6.f27286case;
                    int i6 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC3483e advert5 = c13770e6.advert();
                    InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e6, vip);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e5 = C2721e.vip;
                    c13770e6.m3666import();
                    if (c13770e6.f27292implements) {
                        c13770e6.mopub(c7309e5);
                    } else {
                        c13770e6.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e6, license5, C2721e.billing);
                    AbstractC2270e.yandex(c13770e6, advert5, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e6, Integer.valueOf(i6), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e6, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e6, purchase5, C2721e.license);
                    this.f6907e.invoke(c13770e6, 0);
                    c13770e6.Signature(true);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 9:
                C13770e c13770e7 = (C13770e) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 3) != 2)) {
                    InterfaceC12864e vip2 = AbstractC18007e.vip(C0115e.f1276e, AbstractC14493e.smaato, 0.0f, 2);
                    InterfaceC2747e license6 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j6 = c13770e7.f27286case;
                    int i7 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC3483e advert6 = c13770e7.advert();
                    InterfaceC12864e purchase6 = AbstractC5679e.purchase(c13770e7, vip2);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e6 = C2721e.vip;
                    c13770e7.m3666import();
                    if (c13770e7.f27292implements) {
                        c13770e7.mopub(c7309e6);
                    } else {
                        c13770e7.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e7, license6, C2721e.billing);
                    AbstractC2270e.yandex(c13770e7, advert6, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e7, Integer.valueOf(i7), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e7, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e7, purchase6, C2721e.license);
                    this.f6907e.invoke(c13770e7, 0);
                    c13770e7.Signature(true);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case 10:
                C13770e c13770e8 = (C13770e) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 3) != 2)) {
                    InterfaceC2747e license7 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j7 = c13770e8.f27286case;
                    int i8 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC3483e advert7 = c13770e8.advert();
                    InterfaceC12864e purchase7 = AbstractC5679e.purchase(c13770e8, C0115e.f1276e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e7 = C2721e.vip;
                    c13770e8.m3666import();
                    if (c13770e8.f27292implements) {
                        c13770e8.mopub(c7309e7);
                    } else {
                        c13770e8.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e8, license7, C2721e.billing);
                    AbstractC2270e.yandex(c13770e8, advert7, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e8, Integer.valueOf(i8), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e8, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e8, purchase7, C2721e.license);
                    this.f6907e.invoke(c13770e8, 0);
                    c13770e8.Signature(true);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case 11:
                C13770e c13770e9 = (C13770e) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if (c13770e9.m3673protected(intValue9 & 1, (intValue9 & 3) != 2)) {
                    InterfaceC2747e license8 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j8 = c13770e9.f27286case;
                    int i9 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC3483e advert8 = c13770e9.advert();
                    InterfaceC12864e purchase8 = AbstractC5679e.purchase(c13770e9, C0115e.f1276e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e8 = C2721e.vip;
                    c13770e9.m3666import();
                    if (c13770e9.f27292implements) {
                        c13770e9.mopub(c7309e8);
                    } else {
                        c13770e9.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e9, license8, C2721e.billing);
                    AbstractC2270e.yandex(c13770e9, advert8, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e9, Integer.valueOf(i9), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e9, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e9, purchase8, C2721e.license);
                    this.f6907e.invoke(c13770e9, 0);
                    c13770e9.Signature(true);
                } else {
                    c13770e9.m3659default();
                }
                return Unit.INSTANCE;
            case 12:
                C13770e c13770e10 = (C13770e) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if (c13770e10.m3673protected(intValue10 & 1, (intValue10 & 3) != 2)) {
                    InterfaceC2747e license9 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j9 = c13770e10.f27286case;
                    int i10 = (int) (j9 ^ (j9 >>> 32));
                    InterfaceC3483e advert9 = c13770e10.advert();
                    InterfaceC12864e purchase9 = AbstractC5679e.purchase(c13770e10, C0115e.f1276e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e9 = C2721e.vip;
                    c13770e10.m3666import();
                    if (c13770e10.f27292implements) {
                        c13770e10.mopub(c7309e9);
                    } else {
                        c13770e10.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e10, license9, C2721e.billing);
                    AbstractC2270e.yandex(c13770e10, advert9, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e10, Integer.valueOf(i10), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e10, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e10, purchase9, C2721e.license);
                    this.f6907e.invoke(c13770e10, 0);
                    c13770e10.Signature(true);
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
            case 13:
                C13770e c13770e11 = (C13770e) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if (c13770e11.m3673protected(intValue11 & 1, (intValue11 & 3) != 2)) {
                    InterfaceC2747e license10 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j10 = c13770e11.f27286case;
                    int i11 = (int) (j10 ^ (j10 >>> 32));
                    InterfaceC3483e advert10 = c13770e11.advert();
                    InterfaceC12864e purchase10 = AbstractC5679e.purchase(c13770e11, C0115e.f1276e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e10 = C2721e.vip;
                    c13770e11.m3666import();
                    if (c13770e11.f27292implements) {
                        c13770e11.mopub(c7309e10);
                    } else {
                        c13770e11.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e11, license10, C2721e.billing);
                    AbstractC2270e.yandex(c13770e11, advert10, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e11, Integer.valueOf(i11), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e11, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e11, purchase10, C2721e.license);
                    this.f6907e.invoke(c13770e11, 0);
                    c13770e11.Signature(true);
                } else {
                    c13770e11.m3659default();
                }
                return Unit.INSTANCE;
            case 14:
                C13770e c13770e12 = (C13770e) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if (c13770e12.m3673protected(intValue12 & 1, (intValue12 & 3) != 2)) {
                    InterfaceC12864e ads2 = AbstractC6532e.ads(C0115e.f1276e, 4, 0.0f, 2);
                    InterfaceC2747e license11 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j11 = c13770e12.f27286case;
                    int i12 = (int) (j11 ^ (j11 >>> 32));
                    InterfaceC3483e advert11 = c13770e12.advert();
                    InterfaceC12864e purchase11 = AbstractC5679e.purchase(c13770e12, ads2);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e11 = C2721e.vip;
                    c13770e12.m3666import();
                    if (c13770e12.f27292implements) {
                        c13770e12.mopub(c7309e11);
                    } else {
                        c13770e12.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e12, license11, C2721e.billing);
                    AbstractC2270e.yandex(c13770e12, advert11, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e12, Integer.valueOf(i12), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e12, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e12, purchase11, C2721e.license);
                    this.f6907e.invoke(c13770e12, 0);
                    c13770e12.Signature(true);
                } else {
                    c13770e12.m3659default();
                }
                return Unit.INSTANCE;
            case 15:
                C13770e c13770e13 = (C13770e) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if (c13770e13.m3673protected(intValue13 & 1, (intValue13 & 3) != 2)) {
                    AbstractC14489e.ad(C1839e.ad(AbstractC16475e.ad(c13770e13, AbstractC11550e.license), 0L, 0L, null, null, 0L, 0L, null, null, 16744447), this.f6907e, c13770e13, 0);
                } else {
                    c13770e13.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AbstractC12843e.metrica(this.f6907e, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
