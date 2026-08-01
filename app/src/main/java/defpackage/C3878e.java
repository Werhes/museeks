package defpackage;

import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؕ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3878e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f8706e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8707e;

    public /* synthetic */ C3878e(boolean z, int i) {
        this.f8707e = i;
        this.f8706e = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r10v27 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? r10;
        long j;
        int i = this.f8707e;
        boolean z = this.f8706e;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                C9577e c9577e = C5438e.f11672e;
                C10156e c10156e = C5438e.f11676e;
                C10156e c10156e2 = C5438e.f11700e;
                boolean z2 = (intValue & 17) != 16;
                AbstractC7919e abstractC7919e = c13770e.ad;
                if (c13770e.m3673protected(intValue & 1, z2)) {
                    C7913e c7913e = AbstractC18007e.metrica;
                    InterfaceC2747e license = AbstractC17074e.license(c10156e2, false);
                    long j2 = c13770e.f27286case;
                    int i2 = (int) (j2 ^ (j2 >>> 32));
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
                    C14865e c14865e = C2721e.billing;
                    AbstractC2270e.yandex(c13770e, license, c14865e);
                    C14865e c14865e2 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e, advert, c14865e2);
                    Integer valueOf = Integer.valueOf(i2);
                    C14865e c14865e3 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
                    C5430e c5430e = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e, c5430e);
                    C14865e c14865e4 = C2721e.license;
                    AbstractC2270e.yandex(c13770e, purchase, c14865e4);
                    float f = 16;
                    C0115e c0115e = C0115e.f1276e;
                    InterfaceC12864e license2 = AbstractC13328e.license(AbstractC17113e.billing(AbstractC12220e.mopub(c0115e, f).premium(AbstractC18007e.vip), 1), C11047e.pro(new C6571e[]{new C6571e(Float.valueOf(0.1f), new C3618e(C3618e.startapp)), new C6571e(Float.valueOf(0.5f), new C3618e(C3618e.vip))}));
                    float f2 = 1;
                    C15492e c15492e = AbstractC11785e.ad;
                    InterfaceC12864e vip = AbstractC12447e.vip(AbstractC13201e.ad(license2, f2, ((C7019e) c13770e.adcel(c15492e)).ad.premium, ((C7019e) c13770e.adcel(c15492e)).metrica.license), ((C7019e) c13770e.adcel(c15492e)).metrica.license);
                    InterfaceC2747e license3 = AbstractC17074e.license(c10156e, false);
                    long j3 = c13770e.f27286case;
                    int i3 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert2 = c13770e.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, vip);
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, license3, c14865e);
                    AbstractC2270e.yandex(c13770e, advert2, c14865e2);
                    AbstractC8703e.premium(i3, c13770e, c14865e3, c13770e, c5430e);
                    AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
                    C10156e c10156e3 = C5438e.f11695e;
                    C14486e c14486e = C14486e.ad;
                    InterfaceC12864e loadAd = AbstractC12220e.loadAd(AbstractC12220e.smaato(c14486e.ad(c0115e, c10156e3), f, 0.0f, 2), 0.0f, 0.0f, 0.0f, f, 7);
                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, c9577e, c13770e, 0);
                    long j4 = c13770e.f27286case;
                    int i4 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC3483e advert3 = c13770e.advert();
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, loadAd);
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, ad, c14865e);
                    AbstractC2270e.yandex(c13770e, advert3, c14865e2);
                    AbstractC8703e.premium(i4, c13770e, c14865e3, c13770e, c5430e);
                    AbstractC2270e.yandex(c13770e, purchase3, c14865e4);
                    float f3 = 4;
                    C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.billing(f3), c9577e, c13770e, 6);
                    long j5 = c13770e.f27286case;
                    int i5 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC3483e advert4 = c13770e.advert();
                    InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e, c0115e);
                    c13770e.m3666import();
                    float f4 = f3;
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, ad2, c14865e);
                    AbstractC2270e.yandex(c13770e, advert4, c14865e2);
                    AbstractC8703e.premium(i5, c13770e, c14865e3, c13770e, c5430e);
                    AbstractC2270e.yandex(c13770e, purchase4, c14865e4);
                    c13770e.m3676strictfp(-55364627);
                    int i6 = 0;
                    while (true) {
                        C5100e c5100e = AbstractC10432e.ad;
                        if (i6 < 5) {
                            C3924e c3924e = AbstractC6549e.ad;
                            InterfaceC12864e license4 = AbstractC18007e.license(AbstractC18007e.smaato(AbstractC12447e.vip(c0115e, c3924e), 92), f);
                            C15492e c15492e2 = AbstractC11785e.ad;
                            AbstractC17074e.ad(AbstractC13201e.ad(AbstractC16136e.metrica(license4, ((C7019e) c13770e.adcel(c15492e2)).ad.Signature, c5100e), f2, ((C7019e) c13770e.adcel(c15492e2)).ad.premium, c3924e), c13770e, 0);
                            i6++;
                        } else {
                            c13770e.Signature(false);
                            c13770e.Signature(true);
                            AbstractC12640e.vip(C0283e.ad, this.f8706e, null, AbstractC15869e.license(null, 3).ad(AbstractC15869e.metrica(null, 15)), AbstractC15869e.appmetrica(null, 3).ad(AbstractC15869e.yandex(null, 15)), null, AbstractC12110e.loadAd, c13770e, 1600518, 18);
                            float f5 = 8;
                            C13964e billing = AbstractC16497e.billing(f5);
                            InterfaceC12864e loadAd2 = AbstractC12220e.loadAd(c0115e, 0.0f, f5, 0.0f, 0.0f, 13);
                            C4789e ad3 = AbstractC14801e.ad(billing, c9577e, c13770e, 6);
                            long j6 = c13770e.f27286case;
                            int i7 = (int) (j6 ^ (j6 >>> 32));
                            InterfaceC3483e advert5 = c13770e.advert();
                            InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e, loadAd2);
                            InterfaceC5685e.mopub.getClass();
                            C7309e c7309e2 = C2721e.vip;
                            c13770e.m3666import();
                            if (c13770e.f27292implements) {
                                c13770e.mopub(c7309e2);
                            } else {
                                c13770e.m3684volatile();
                            }
                            C14865e c14865e5 = C2721e.billing;
                            AbstractC2270e.yandex(c13770e, ad3, c14865e5);
                            C14865e c14865e6 = C2721e.purchase;
                            AbstractC2270e.yandex(c13770e, advert5, c14865e6);
                            Integer valueOf2 = Integer.valueOf(i7);
                            C14865e c14865e7 = C2721e.adcel;
                            AbstractC2270e.yandex(c13770e, valueOf2, c14865e7);
                            C5430e c5430e2 = C2721e.mopub;
                            AbstractC2270e.purchase(c13770e, c5430e2);
                            C14865e c14865e8 = C2721e.license;
                            AbstractC2270e.yandex(c13770e, purchase5, c14865e8);
                            AbstractC8141e.vip(null, 0.0f, 0L, c13770e, 0, 7);
                            InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
                            InterfaceC2747e license5 = AbstractC17074e.license(c10156e, false);
                            long j7 = c13770e.f27286case;
                            int i8 = (int) (j7 ^ (j7 >>> 32));
                            InterfaceC3483e advert6 = c13770e.advert();
                            InterfaceC12864e purchase6 = AbstractC5679e.purchase(c13770e, metrica);
                            c13770e.m3666import();
                            if (c13770e.f27292implements) {
                                c13770e.mopub(c7309e2);
                            } else {
                                c13770e.m3684volatile();
                            }
                            AbstractC2270e.yandex(c13770e, license5, c14865e5);
                            AbstractC2270e.yandex(c13770e, advert6, c14865e6);
                            AbstractC8703e.premium(i8, c13770e, c14865e7, c13770e, c5430e2);
                            AbstractC2270e.yandex(c13770e, purchase6, c14865e8);
                            InterfaceC12864e ad4 = c14486e.ad(c0115e, c10156e2);
                            C8587e ad5 = AbstractC6451e.ad(AbstractC16497e.billing(f5), C5438e.f11685e, c13770e, 6);
                            long j8 = c13770e.f27286case;
                            int i9 = (int) (j8 ^ (j8 >>> 32));
                            InterfaceC3483e advert7 = c13770e.advert();
                            InterfaceC12864e purchase7 = AbstractC5679e.purchase(c13770e, ad4);
                            c13770e.m3666import();
                            if (c13770e.f27292implements) {
                                c13770e.mopub(c7309e2);
                            } else {
                                c13770e.m3684volatile();
                            }
                            AbstractC2270e.yandex(c13770e, ad5, c14865e5);
                            AbstractC2270e.yandex(c13770e, advert7, c14865e6);
                            AbstractC8703e.premium(i9, c13770e, c14865e7, c13770e, c5430e2);
                            AbstractC2270e.yandex(c13770e, purchase7, c14865e8);
                            c13770e.m3676strictfp(-35727913);
                            int i10 = 0;
                            while (i10 < 3) {
                                float f6 = f4;
                                InterfaceC12864e startapp = AbstractC18007e.startapp(c0115e, f6);
                                C3924e c3924e2 = AbstractC6549e.ad;
                                InterfaceC12864e vip2 = AbstractC12447e.vip(startapp, c3924e2);
                                if (i10 == 0) {
                                    c13770e.m3676strictfp(-1655808694);
                                    j = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.ad;
                                    r10 = 0;
                                } else {
                                    r10 = 0;
                                    c13770e.m3676strictfp(-1655807446);
                                    j = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.Signature;
                                }
                                c13770e.Signature(r10);
                                AbstractC17074e.ad(AbstractC13201e.ad(AbstractC16136e.metrica(vip2, j, c5100e), i10 == 0 ? (float) r10 : f2, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.premium, c3924e2), c13770e, r10);
                                i10++;
                                f4 = f6;
                            }
                            c13770e.Signature(false);
                            c13770e.Signature(true);
                            c13770e.Signature(true);
                            c13770e.Signature(true);
                            AbstractC1786e.isPro(c13770e, true, true, true);
                        }
                    }
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                String str = (String) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c13770e2.purchase(str) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 19) != 18)) {
                    boolean z3 = (intValue2 & 14) == 4;
                    Object m3681throw = c13770e2.m3681throw();
                    if (z3 || m3681throw == C2987e.ad) {
                        m3681throw = str.toUpperCase(Locale.ROOT);
                        c13770e2.m3682throws(m3681throw);
                    }
                    AbstractC14489e.vip((String) m3681throw, AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 0L, 0L, new C6277e(!z ? 1 : 0), C1812e.f4889e, AbstractC16795e.metrica, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).vip.metrica, c13770e2, 1572912, 0, 129820);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                    AbstractC9164e.vip(0, c13770e3, z);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
