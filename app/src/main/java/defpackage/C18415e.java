package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e۠۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C18415e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C13621e f36102e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C16875e f36103e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f36104e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f36105e;

    public /* synthetic */ C18415e(C16875e c16875e, InterfaceC3314e interfaceC3314e, C13621e c13621e) {
        this.f36105e = 2;
        this.f36103e = c16875e;
        this.f36104e = interfaceC3314e;
        this.f36102e = c13621e;
    }

    public /* synthetic */ C18415e(C16875e c16875e, C13621e c13621e, InterfaceC3314e interfaceC3314e, int i) {
        this.f36105e = i;
        this.f36103e = c16875e;
        this.f36102e = c13621e;
        this.f36104e = interfaceC3314e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C2038e c2038e;
        switch (this.f36105e) {
            case 0:
                C13621e c13621e = this.f36102e;
                C2038e c2038e2 = c13621e.ad;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(16), C5438e.f11672e, c13770e, 6);
                    long j = c13770e.f27286case;
                    int i = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    C0115e c0115e = C0115e.f1276e;
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, c0115e);
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
                    C16875e c16875e = this.f36103e;
                    EnumC10286e enumC10286e = c16875e.appmetrica;
                    boolean z7 = c16875e.purchase;
                    boolean z8 = c16875e.billing;
                    if (c16875e.metrica == EnumC11342e.f22808e) {
                        z = z8;
                        z2 = true;
                    } else {
                        z = z8;
                        z2 = false;
                    }
                    boolean z9 = c16875e.yandex;
                    boolean z10 = c16875e.startapp;
                    if (z10 || z9 || c16875e.adcel) {
                        z3 = z;
                        z4 = z9;
                        z5 = false;
                    } else {
                        z3 = z;
                        z4 = z9;
                        z5 = true;
                    }
                    c13621e.metrica(AbstractC18007e.metrica(c0115e, 1.0f), enumC10286e, z7, z3, z2, z4, z10, z5, c16875e.smaato, c13770e, 6);
                    if (((C10876e) this.f36104e.getValue()).f21538e) {
                        c13770e.m3676strictfp(-1399195154);
                        int i2 = c16875e.amazon;
                        int i3 = c16875e.loadAd;
                        boolean yandex = c13770e.yandex(c2038e2);
                        Object m3681throw = c13770e.m3681throw();
                        C5170e c5170e = C2987e.ad;
                        if (yandex || m3681throw == c5170e) {
                            c2038e = c2038e2;
                            C0638e c0638e = new C0638e(1, c2038e, C2038e.class, "setVolume", "setVolume(I)V", 0, 0, 11);
                            c13770e.m3682throws(c0638e);
                            m3681throw = c0638e;
                        } else {
                            c2038e = c2038e2;
                        }
                        InterfaceC5261e interfaceC5261e = (InterfaceC5261e) m3681throw;
                        boolean yandex2 = c13770e.yandex(c2038e);
                        Object m3681throw2 = c13770e.m3681throw();
                        if (yandex2 || m3681throw2 == c5170e) {
                            Cvolatile cvolatile = new Cvolatile(0, c2038e, C2038e.class, "volumeDown", "volumeDown()V", 0, 0, 14);
                            c13770e.m3682throws(cvolatile);
                            m3681throw2 = cvolatile;
                        }
                        InterfaceC5261e interfaceC5261e2 = (InterfaceC5261e) m3681throw2;
                        boolean yandex3 = c13770e.yandex(c2038e);
                        Object m3681throw3 = c13770e.m3681throw();
                        if (yandex3 || m3681throw3 == c5170e) {
                            Cvolatile cvolatile2 = new Cvolatile(0, c2038e, C2038e.class, "volumeUp", "volumeUp()V", 0, 0, 15);
                            c13770e.m3682throws(cvolatile2);
                            m3681throw3 = cvolatile2;
                        }
                        AbstractC17331e.ad(i2, i3, (Function0) interfaceC5261e2, (Function1) interfaceC5261e, (Function0) ((InterfaceC5261e) m3681throw3), AbstractC18007e.metrica(c0115e, 1.0f), c13770e, 196608);
                        z6 = false;
                    } else {
                        z6 = false;
                        c13770e.m3676strictfp(-1417504033);
                    }
                    c13770e.Signature(z6);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C16875e c16875e2 = this.f36103e;
                    if (c16875e2.yandex) {
                        c13770e2.m3676strictfp(1202618898);
                    } else {
                        c13770e2.m3676strictfp(-2038757535);
                        Boolean bool = c16875e2.ad.purchase;
                        if (bool == null) {
                            c13770e2.m3676strictfp(1223087267);
                        } else {
                            c13770e2.m3676strictfp(1223087268);
                            boolean booleanValue = bool.booleanValue();
                            C2038e c2038e3 = this.f36102e.ad;
                            boolean yandex4 = c13770e2.yandex(c2038e3);
                            Object m3681throw4 = c13770e2.m3681throw();
                            if (yandex4 || m3681throw4 == C2987e.ad) {
                                Cvolatile cvolatile3 = new Cvolatile(0, c2038e3, C2038e.class, "onTrackLikedTapped", "onTrackLikedTapped()V", 0, 0, 16);
                                c13770e2.m3682throws(cvolatile3);
                                m3681throw4 = cvolatile3;
                            }
                            AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw4), null, false, null, AbstractC7640e.license(c13770e2), null, AbstractC16653e.license(643138604, new C14674e(booleanValue, this.f36104e, 0), c13770e2), c13770e2, 1572864, 46);
                        }
                        c13770e2.Signature(false);
                    }
                    c13770e2.Signature(false);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (!((C10876e) this.f36104e.getValue()).f21539e) {
                        C16875e c16875e3 = this.f36103e;
                        if (!c16875e3.yandex) {
                            c13770e3.m3676strictfp(1880378014);
                            Boolean bool2 = c16875e3.ad.billing;
                            if (bool2 == null) {
                                c13770e3.m3676strictfp(-1837759415);
                            } else {
                                c13770e3.m3676strictfp(-1837759414);
                                boolean booleanValue2 = bool2.booleanValue();
                                C2038e c2038e4 = this.f36102e.ad;
                                boolean yandex5 = c13770e3.yandex(c2038e4);
                                Object m3681throw5 = c13770e3.m3681throw();
                                if (yandex5 || m3681throw5 == C2987e.ad) {
                                    Cvolatile cvolatile4 = new Cvolatile(0, c2038e4, C2038e.class, "onTrackDislikedTapped", "onTrackDislikedTapped()V", 0, 0, 17);
                                    c13770e3.m3682throws(cvolatile4);
                                    m3681throw5 = cvolatile4;
                                }
                                AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw5), null, false, null, AbstractC7640e.license(c13770e3), null, AbstractC16653e.license(-765072147, new C16027e(booleanValue2, 0), c13770e3), c13770e3, 1572864, 46);
                            }
                            c13770e3.Signature(false);
                            c13770e3.Signature(false);
                        }
                    }
                    c13770e3.m3676strictfp(-1860007215);
                    c13770e3.Signature(false);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
