package defpackage;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۚۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7444e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2045e f15219e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f15220e;

    public /* synthetic */ C7444e(C2045e c2045e, int i) {
        this.f15220e = i;
        this.f15219e = c2045e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15220e) {
            case 0:
                C17213e c17213e = (C17213e) obj;
                AbstractC5087e.premium(c17213e, null, null, AbstractC16481e.vip, 3);
                final int i = 0;
                final C2045e c2045e = this.f15219e;
                AbstractC5087e.premium(c17213e, null, null, new C2892e(-272922413, true, new Function3() { // from class: eٍٍؒ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        switch (i) {
                            case 0:
                                C13770e c13770e = (C13770e) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e, 0);
                                    long j = c13770e.f27286case;
                                    int i2 = (int) (j ^ (j >>> 32));
                                    InterfaceC3483e advert = c13770e.advert();
                                    C0115e c0115e = C0115e.f1276e;
                                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, c0115e);
                                    InterfaceC5685e.mopub.getClass();
                                    Function0 function0 = C2721e.vip;
                                    c13770e.m3666import();
                                    if (c13770e.f27292implements) {
                                        c13770e.mopub(function0);
                                    } else {
                                        c13770e.m3684volatile();
                                    }
                                    AbstractC2270e.yandex(c13770e, ad, C2721e.billing);
                                    AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
                                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i2), C2721e.adcel);
                                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                                    String appmetrica = AbstractC5297e.appmetrica(c13770e, R.string.android_auto_setup);
                                    AbstractC4455e abstractC4455e = AbstractC11785e.ad;
                                    float f = 16;
                                    AbstractC14489e.vip(appmetrica, AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), f, 0.0f, 2), ((C7019e) c13770e.adcel(abstractC4455e)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(abstractC4455e)).vip.appmetrica, c13770e, 48, 0, 131064);
                                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, R.string.android_auto_setup_info), AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), f, 0.0f, 2), ((C7019e) c13770e.adcel(abstractC4455e)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(abstractC4455e)).vip.adcel, c13770e, 48, 0, 131064);
                                    AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, 4));
                                    C2045e c2045e2 = c2045e;
                                    c2045e2.m759strictfp(1, R.string.android_auto_setup_one, c13770e, 6);
                                    c2045e2.m759strictfp(2, R.string.android_auto_setup_two, c13770e, 6);
                                    c2045e2.m759strictfp(3, R.string.android_auto_setup_three, c13770e, 6);
                                    c2045e2.m759strictfp(4, R.string.android_auto_setup_four, c13770e, 6);
                                    c2045e2.m759strictfp(5, R.string.android_auto_setup_five, c13770e, 6);
                                    c2045e2.m759strictfp(6, R.string.android_auto_setup_six, c13770e, 6);
                                    InterfaceC12864e loadAd = AbstractC12220e.loadAd(AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), f, 0.0f, 2), 0.0f, 0.0f, 0.0f, f, 7);
                                    C16005e c16005e = new C16005e(f, f, f, f);
                                    C3924e c3924e = ((C7019e) c13770e.adcel(abstractC4455e)).metrica.metrica;
                                    boolean yandex = c13770e.yandex(c2045e2);
                                    Object m3681throw = c13770e.m3681throw();
                                    if (yandex || m3681throw == C2987e.ad) {
                                        m3681throw = new C14515e(4, c2045e2);
                                        c13770e.m3682throws(m3681throw);
                                    }
                                    AbstractC1513e.ad((Function0) m3681throw, loadAd, false, c3924e, null, null, null, c16005e, AbstractC16481e.metrica, c13770e, 817889328, 372);
                                    c13770e.Signature(true);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                C13770e c13770e2 = (C13770e) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    C1733e c1733e = AbstractC16524e.Signature;
                                    C2045e c2045e3 = c2045e;
                                    boolean yandex2 = c13770e2.yandex(c2045e3);
                                    Object m3681throw2 = c13770e2.m3681throw();
                                    if (yandex2 || m3681throw2 == C2987e.ad) {
                                        m3681throw2 = new C7444e(c2045e3, 1);
                                        c13770e2.m3682throws(m3681throw2);
                                    }
                                    AbstractC17181e.yandex(c1733e, false, null, (Function1) m3681throw2, c13770e2, 0, 6);
                                } else {
                                    c13770e2.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC16481e.license, 3);
                final int i2 = 1;
                AbstractC5087e.premium(c17213e, null, null, new C2892e(-2035748139, true, new Function3() { // from class: eٍٍؒ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        switch (i2) {
                            case 0:
                                C13770e c13770e = (C13770e) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e, 0);
                                    long j = c13770e.f27286case;
                                    int i22 = (int) (j ^ (j >>> 32));
                                    InterfaceC3483e advert = c13770e.advert();
                                    C0115e c0115e = C0115e.f1276e;
                                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, c0115e);
                                    InterfaceC5685e.mopub.getClass();
                                    Function0 function0 = C2721e.vip;
                                    c13770e.m3666import();
                                    if (c13770e.f27292implements) {
                                        c13770e.mopub(function0);
                                    } else {
                                        c13770e.m3684volatile();
                                    }
                                    AbstractC2270e.yandex(c13770e, ad, C2721e.billing);
                                    AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
                                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i22), C2721e.adcel);
                                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                                    String appmetrica = AbstractC5297e.appmetrica(c13770e, R.string.android_auto_setup);
                                    AbstractC4455e abstractC4455e = AbstractC11785e.ad;
                                    float f = 16;
                                    AbstractC14489e.vip(appmetrica, AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), f, 0.0f, 2), ((C7019e) c13770e.adcel(abstractC4455e)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(abstractC4455e)).vip.appmetrica, c13770e, 48, 0, 131064);
                                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, R.string.android_auto_setup_info), AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), f, 0.0f, 2), ((C7019e) c13770e.adcel(abstractC4455e)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(abstractC4455e)).vip.adcel, c13770e, 48, 0, 131064);
                                    AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, 4));
                                    C2045e c2045e2 = c2045e;
                                    c2045e2.m759strictfp(1, R.string.android_auto_setup_one, c13770e, 6);
                                    c2045e2.m759strictfp(2, R.string.android_auto_setup_two, c13770e, 6);
                                    c2045e2.m759strictfp(3, R.string.android_auto_setup_three, c13770e, 6);
                                    c2045e2.m759strictfp(4, R.string.android_auto_setup_four, c13770e, 6);
                                    c2045e2.m759strictfp(5, R.string.android_auto_setup_five, c13770e, 6);
                                    c2045e2.m759strictfp(6, R.string.android_auto_setup_six, c13770e, 6);
                                    InterfaceC12864e loadAd = AbstractC12220e.loadAd(AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), f, 0.0f, 2), 0.0f, 0.0f, 0.0f, f, 7);
                                    C16005e c16005e = new C16005e(f, f, f, f);
                                    C3924e c3924e = ((C7019e) c13770e.adcel(abstractC4455e)).metrica.metrica;
                                    boolean yandex = c13770e.yandex(c2045e2);
                                    Object m3681throw = c13770e.m3681throw();
                                    if (yandex || m3681throw == C2987e.ad) {
                                        m3681throw = new C14515e(4, c2045e2);
                                        c13770e.m3682throws(m3681throw);
                                    }
                                    AbstractC1513e.ad((Function0) m3681throw, loadAd, false, c3924e, null, null, null, c16005e, AbstractC16481e.metrica, c13770e, 817889328, 372);
                                    c13770e.Signature(true);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                C13770e c13770e2 = (C13770e) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    C1733e c1733e = AbstractC16524e.Signature;
                                    C2045e c2045e3 = c2045e;
                                    boolean yandex2 = c13770e2.yandex(c2045e3);
                                    Object m3681throw2 = c13770e2.m3681throw();
                                    if (yandex2 || m3681throw2 == C2987e.ad) {
                                        m3681throw2 = new C7444e(c2045e3, 1);
                                        c13770e2.m3682throws(m3681throw2);
                                    }
                                    AbstractC17181e.yandex(c1733e, false, null, (Function1) m3681throw2, c13770e2, 0, 6);
                                } else {
                                    c13770e2.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                return Unit.INSTANCE;
            default:
                ((Boolean) obj).getClass();
                Activity pro = this.f15219e.pro();
                AbstractC15615e.ad(new Celse(pro, new C15076e(null, pro.getString(R.string.notification), pro.getString(R.string.restart_prompt), new C6571e(pro.getString(R.string.restart_act), new C0743e(3)), null, 113), 4));
                return Unit.INSTANCE;
        }
    }
}
