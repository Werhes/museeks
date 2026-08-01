package defpackage;

import android.graphics.Bitmap;
import androidx.car.app.navigation.model.Maneuver;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8124e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f16498e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f16499e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f16500e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16501e;

    public /* synthetic */ C8124e(int i, Object obj, Object obj2, Object obj3) {
        this.f16501e = i;
        this.f16499e = obj;
        this.f16498e = obj2;
        this.f16500e = obj3;
    }

    public /* synthetic */ C8124e(C6524e c6524e, AbstractC10347e abstractC10347e, String str, int i) {
        this.f16501e = i;
        this.f16498e = c6524e;
        this.f16500e = abstractC10347e;
        this.f16499e = str;
    }

    private final Object Signature(Object obj, Object obj2, Object obj3) {
        Function0 function0 = (Function0) this.f16499e;
        C14609e c14609e = (C14609e) this.f16498e;
        Function0 function02 = (Function0) this.f16500e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            AbstractC8230e.ad(((Boolean) function0.invoke()).booleanValue(), c14609e.ad.equals(function02.invoke()), AbstractC16653e.license(1159574521, new C11528e(c14609e, 1, (byte) 0), c13770e), c13770e, 384);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object ad(Object obj, Object obj2, Object obj3) {
        C2038e c2038e = ((C13621e) this.f16499e).ad;
        C13610e c13610e = (C13610e) this.f16498e;
        InterfaceC6340e interfaceC6340e = (InterfaceC6340e) this.f16500e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            C14609e adcel = c2038e.adcel();
            InterfaceC12864e interfaceC12864e = C0115e.f1276e;
            if (c13610e != null) {
                c13770e.m3676strictfp(346126634);
                interfaceC12864e = AbstractC0054e.m219extends(c13610e, interfaceC12864e, c13610e.license("artwork:".concat(adcel.ad), c13770e), interfaceC6340e);
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(346504586);
                c13770e.Signature(false);
            }
            AbstractC16049e abstractC16049e = c2038e.adcel().vip;
            C15492e c15492e = AbstractC3577e.ad;
            AbstractC8636e.ad(abstractC16049e, 5, ((C0896e) c13770e.adcel(c15492e)).license, 0L, 0, 0.0f, true, null, "np_" + adcel.vip.Signature(), AbstractC13201e.ad(interfaceC12864e, 1, ((C0896e) c13770e.adcel(c15492e)).license, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).metrica.metrica), c13770e, 1572912, 184);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object adcel(Object obj, Object obj2, Object obj3) {
        C6524e c6524e = (C6524e) this.f16498e;
        C3409e c3409e = (C3409e) this.f16500e;
        String str = (String) this.f16499e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            boolean yandex = c13770e.yandex(c3409e) | c13770e.purchase(str);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (yandex || m3681throw == c5170e) {
                m3681throw = new C6414e(c3409e, str, 0);
                c13770e.m3682throws(m3681throw);
            }
            Function0 function0 = (Function0) m3681throw;
            boolean yandex2 = c13770e.yandex(c3409e) | c13770e.purchase(str);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex2 || m3681throw2 == c5170e) {
                m3681throw2 = new C6414e(c3409e, str, 1);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC10558e.ad(c6524e, function0, (Function0) m3681throw2, c13770e, 0);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object admob(Object obj, Object obj2, Object obj3) {
        boolean z;
        C13770e c13770e;
        boolean z2;
        boolean z3;
        C14609e c14609e = (C14609e) this.f16499e;
        AbstractC16049e abstractC16049e = c14609e.vip;
        Function1 function1 = (Function1) this.f16498e;
        InterfaceC12864e interfaceC12864e = (InterfaceC12864e) this.f16500e;
        C13770e c13770e2 = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e2.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            boolean purchase = c13770e2.purchase(c14609e);
            Object m3681throw = c13770e2.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (purchase || m3681throw == c5170e) {
                InterfaceC4269e interfaceC4269e = abstractC16049e instanceof InterfaceC4269e ? (InterfaceC4269e) abstractC16049e : null;
                m3681throw = Boolean.valueOf(interfaceC4269e != null && interfaceC4269e.getLoadAd());
                c13770e2.m3682throws(m3681throw);
            }
            boolean booleanValue = ((Boolean) m3681throw).booleanValue();
            boolean purchase2 = c13770e2.purchase(c14609e);
            Object m3681throw2 = c13770e2.m3681throw();
            if (purchase2 || m3681throw2 == c5170e) {
                if (!(abstractC16049e instanceof AudioTrack)) {
                    UmaTrack umaTrack = abstractC16049e instanceof UmaTrack ? (UmaTrack) abstractC16049e : null;
                    if ((umaTrack != null ? umaTrack.pro : null) == null) {
                        z = false;
                        m3681throw2 = Boolean.valueOf(z);
                        c13770e2.m3682throws(m3681throw2);
                    }
                }
                z = true;
                m3681throw2 = Boolean.valueOf(z);
                c13770e2.m3682throws(m3681throw2);
            }
            boolean booleanValue2 = ((Boolean) m3681throw2).booleanValue();
            if (booleanValue) {
                c13770e2.m3676strictfp(-1728272046);
                c13770e = c13770e2;
                AbstractC1328e.vip(null, ((C0896e) c13770e2.adcel(AbstractC3577e.ad)).vip, c13770e, 0, 1);
            } else {
                c13770e = c13770e2;
                c13770e.m3676strictfp(-1744310950);
            }
            c13770e.Signature(false);
            int amazon = abstractC16049e.amazon();
            C15492e c15492e = AbstractC3577e.ad;
            C13770e c13770e3 = c13770e;
            AbstractC1328e.ad(amazon, true, ((C0896e) c13770e.adcel(c15492e)).vip, c13770e3, 48, 0);
            C13770e c13770e4 = c13770e3;
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11668e, c13770e4, 48);
            long j = c13770e4.f27286case;
            int i = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e4.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e4, C0115e.f1276e);
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
            AbstractC2270e.yandex(c13770e4, Integer.valueOf(i), C2721e.adcel);
            AbstractC2270e.purchase(c13770e4, C2721e.mopub);
            AbstractC2270e.yandex(c13770e4, purchase3, C2721e.license);
            if (booleanValue2) {
                c13770e4.m3676strictfp(1021334740);
                boolean purchase4 = c13770e4.purchase(function1) | c13770e4.purchase(c14609e);
                Object m3681throw3 = c13770e4.m3681throw();
                if (purchase4 || m3681throw3 == c5170e) {
                    m3681throw3 = new C1708e(function1, c14609e, 17);
                    c13770e4.m3682throws(m3681throw3);
                }
                int i2 = C12563e.ad;
                C14602e purchase5 = C12563e.purchase(((C0896e) c13770e4.adcel(c15492e)).ad, c13770e4);
                z3 = false;
                z2 = true;
                AbstractC0014e.metrica((Function0) m3681throw3, null, false, purchase5, null, null, AbstractC1328e.license, c13770e4, 1572864, 54);
                c13770e4 = c13770e4;
            } else {
                z2 = true;
                z3 = false;
                c13770e4.m3676strictfp(1004873182);
            }
            c13770e4.Signature(z3);
            Object m3681throw4 = c13770e4.m3681throw();
            if (m3681throw4 == c5170e) {
                m3681throw4 = new C14136e(13);
                c13770e4.m3682throws(m3681throw4);
            }
            C13770e c13770e5 = c13770e4;
            AbstractC0014e.metrica((Function0) m3681throw4, interfaceC12864e, false, null, null, null, AbstractC1328e.appmetrica, c13770e5, 1572870, 60);
            c13770e5.Signature(z2);
        } else {
            c13770e2.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object advert(Object obj, Object obj2, Object obj3) {
        C2892e c2892e = (C2892e) this.f16499e;
        Function2 function2 = (Function2) this.f16498e;
        C2892e c2892e2 = (C2892e) this.f16500e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            InterfaceC12864e vip = AbstractC17113e.vip(C0115e.f1276e);
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11668e, c13770e, 48);
            long j = c13770e.f27286case;
            int i = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, vip);
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
            c2892e.invoke(C3533e.ad, c13770e, 6);
            function2.invoke(c13770e, 0);
            AbstractC8141e.appmetrica(null, (float) 1.5d, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.subscription, c13770e, 48, 1);
            c2892e2.invoke(c13770e, 0);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object amazon(Object obj, Object obj2, Object obj3) {
        List list = (List) this.f16499e;
        C8004e c8004e = (C8004e) this.f16498e;
        InterfaceC3314e interfaceC3314e = (InterfaceC3314e) this.f16500e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            boolean yandex = c13770e.yandex(list) | c13770e.yandex(c8004e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new Cthrows(20, list, c8004e, interfaceC3314e);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC7023e.ad(null, null, null, null, null, null, false, null, (Function1) m3681throw, c13770e, 0, 511);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object billing(Object obj, Object obj2, Object obj3) {
        InterfaceC2566e interfaceC2566e = (InterfaceC2566e) this.f16499e;
        C4993e c4993e = (C4993e) this.f16498e;
        Function1 function1 = (Function1) this.f16500e;
        InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
        }
        if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
            AbstractC7023e.ad(AbstractC14783e.license(AbstractC12220e.adcel(C0115e.f1276e, interfaceC12123e), interfaceC2566e.ad(), null), c4993e, null, null, null, null, false, null, function1, c13770e, 0, 508);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object isVip(Object obj, Object obj2, Object obj3) {
        C12672e c12672e = (C12672e) this.f16499e;
        InterfaceC2566e interfaceC2566e = (InterfaceC2566e) this.f16498e;
        AbstractC10727e abstractC10727e = (AbstractC10727e) this.f16500e;
        InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
        }
        if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
            InterfaceC6377e interfaceC6377e = (InterfaceC6377e) c12672e.f25405e.getValue();
            boolean billing = AbstractC7890e.billing(interfaceC6377e, C16175e.ad);
            C0115e c0115e = C0115e.f1276e;
            if (billing || AbstractC7890e.billing(interfaceC6377e, C14451e.ad)) {
                c13770e.m3676strictfp(-605216228);
                AbstractC0436e.ad(AbstractC12220e.adcel(c0115e, interfaceC12123e), false, 0L, c13770e, 0, 6);
                c13770e.Signature(false);
            } else {
                boolean z = interfaceC6377e instanceof C17628e;
                C5170e c5170e = C2987e.ad;
                if (z) {
                    c13770e.m3676strictfp(-605053106);
                    InterfaceC12864e purchase = AbstractC5967e.purchase(AbstractC12220e.adcel(AbstractC14783e.license(c0115e, interfaceC2566e.ad(), null), interfaceC12123e).premium(AbstractC18007e.metrica), AbstractC5967e.appmetrica(c13770e), true);
                    InterfaceC4977e smaato = C15802e.smaato(((C17628e) interfaceC6377e).ad);
                    boolean yandex = c13770e.yandex(c12672e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == c5170e) {
                        C11212e c11212e = new C11212e(0, c12672e, C12672e.class, "dispatchLoad", "dispatchLoad()V", 0, 0, 12);
                        c13770e.m3682throws(c11212e);
                        m3681throw = c11212e;
                    }
                    AbstractC11906e.ad(smaato, (Function0) ((InterfaceC5261e) m3681throw), purchase, false, c13770e, 0, 8);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3676strictfp(-604521208);
                    InterfaceC12864e license = AbstractC14783e.license(AbstractC12220e.adcel(c0115e, interfaceC12123e), interfaceC2566e.ad(), null);
                    boolean yandex2 = c13770e.yandex(c12672e) | c13770e.yandex(abstractC10727e);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        m3681throw2 = new C13942e(c12672e, abstractC10727e, 10);
                        c13770e.m3682throws(m3681throw2);
                    }
                    AbstractC7023e.ad(license, null, null, null, null, null, false, null, (Function1) m3681throw2, c13770e, 0, 510);
                    c13770e.Signature(false);
                }
            }
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object license(Object obj, Object obj2, Object obj3) {
        C10685e c10685e = (C10685e) this.f16499e;
        final C5181e c5181e = (C5181e) this.f16498e;
        final InterfaceC3314e interfaceC3314e = (InterfaceC3314e) this.f16500e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean yandex = c13770e.yandex(c10685e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C8570e(c10685e, 1);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC12864e license = AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15);
            C2892e c2892e = AbstractC13482e.yandex;
            final int i = 0;
            C2892e license2 = AbstractC16653e.license(-501805303, new Function2() { // from class: eٌٌ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    String str;
                    switch (i) {
                        case 0:
                            C13770e c13770e2 = (C13770e) obj4;
                            int intValue2 = ((Integer) obj5).intValue();
                            if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                                if (((C3487e) interfaceC3314e.getValue()).f7754e) {
                                    str = AbstractC4653e.isVip(c13770e2, 1499495582, R.string.themes_category_monet, c13770e2, false);
                                } else {
                                    c13770e2.m3676strictfp(1499622527);
                                    c13770e2.Signature(false);
                                    str = c5181e.vip;
                                }
                                AbstractC14489e.vip(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                            } else {
                                c13770e2.m3659default();
                            }
                            return Unit.INSTANCE;
                        default:
                            C13770e c13770e3 = (C13770e) obj4;
                            int intValue3 = ((Integer) obj5).intValue();
                            if (!c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                                c13770e3.m3659default();
                            } else if (((C3487e) interfaceC3314e.getValue()).f7754e && AbstractC12681e.ad()) {
                                c13770e3.m3676strictfp(-605849817);
                                AbstractC14942e.metrica(0, 1, c13770e3, null);
                                c13770e3.Signature(false);
                            } else {
                                c13770e3.m3676strictfp(-605760289);
                                AbstractC14942e.ad(c5181e, null, c13770e3, 0, 2);
                                c13770e3.Signature(false);
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, c13770e);
            final int i2 = 1;
            AbstractC16429e.ad(c2892e, license, null, license2, null, AbstractC16653e.license(1007295175, new Function2() { // from class: eٌٌ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    String str;
                    switch (i2) {
                        case 0:
                            C13770e c13770e2 = (C13770e) obj4;
                            int intValue2 = ((Integer) obj5).intValue();
                            if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                                if (((C3487e) interfaceC3314e.getValue()).f7754e) {
                                    str = AbstractC4653e.isVip(c13770e2, 1499495582, R.string.themes_category_monet, c13770e2, false);
                                } else {
                                    c13770e2.m3676strictfp(1499622527);
                                    c13770e2.Signature(false);
                                    str = c5181e.vip;
                                }
                                AbstractC14489e.vip(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                            } else {
                                c13770e2.m3659default();
                            }
                            return Unit.INSTANCE;
                        default:
                            C13770e c13770e3 = (C13770e) obj4;
                            int intValue3 = ((Integer) obj5).intValue();
                            if (!c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                                c13770e3.m3659default();
                            } else if (((C3487e) interfaceC3314e.getValue()).f7754e && AbstractC12681e.ad()) {
                                c13770e3.m3676strictfp(-605849817);
                                AbstractC14942e.metrica(0, 1, c13770e3, null);
                                c13770e3.Signature(false);
                            } else {
                                c13770e3.m3676strictfp(-605760289);
                                AbstractC14942e.ad(c5181e, null, c13770e3, 0, 2);
                                c13770e3.Signature(false);
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, c13770e), null, 0.0f, 0.0f, c13770e, 199686, 468);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object loadAd(Object obj, Object obj2, Object obj3) {
        EnumC13413e enumC13413e = (EnumC13413e) this.f16499e;
        Function1 function1 = (Function1) this.f16498e;
        InterfaceC3314e interfaceC3314e = (InterfaceC3314e) this.f16500e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            boolean z = enumC13413e == null;
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean purchase = c13770e.purchase(function1);
            Object m3681throw = c13770e.m3681throw();
            if (purchase || m3681throw == C2987e.ad) {
                m3681throw = new C13149e(function1, interfaceC3314e, 1);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC12185e.vip(null, z, false, AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), c13770e, 390);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object mopub(Object obj, Object obj2, Object obj3) {
        C6524e c6524e = (C6524e) this.f16498e;
        C1963e c1963e = (C1963e) this.f16500e;
        String str = (String) this.f16499e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            boolean yandex = c13770e.yandex(c1963e) | c13770e.purchase(str);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (yandex || m3681throw == c5170e) {
                m3681throw = new C13555e(c1963e, str, 1);
                c13770e.m3682throws(m3681throw);
            }
            Function0 function0 = (Function0) m3681throw;
            boolean yandex2 = c13770e.yandex(c1963e) | c13770e.purchase(str);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex2 || m3681throw2 == c5170e) {
                m3681throw2 = new C13555e(c1963e, str, 2);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC10558e.ad(c6524e, function0, (Function0) m3681throw2, c13770e, 0);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object pro(Object obj, Object obj2, Object obj3) {
        InterfaceC1332e interfaceC1332e = (InterfaceC1332e) this.f16499e;
        C12979e c12979e = (C12979e) this.f16498e;
        InterfaceC16132e interfaceC16132e = (InterfaceC16132e) this.f16500e;
        InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
        }
        if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
            AbstractC2003e.vip(((C10366e) interfaceC1332e).yandex, AbstractC12220e.adcel(C0115e.f1276e, interfaceC12123e), AbstractC16653e.license(-358414524, new C11828e(c12979e, interfaceC16132e, 2), c13770e), c13770e, 3072, 4);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object purchase(Object obj, Object obj2, Object obj3) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f16499e;
        InterfaceC3314e interfaceC3314e = (InterfaceC3314e) this.f16498e;
        C10685e c10685e = (C10685e) this.f16500e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean yandex = c13770e.yandex(interfaceC18435e) | c13770e.purchase(interfaceC3314e) | c13770e.yandex(c10685e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C10403e(interfaceC18435e, c10685e, interfaceC3314e);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC16429e.ad(AbstractC13482e.signatures, AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), null, null, null, AbstractC16653e.license(-279061529, new C3313e(interfaceC18435e, c10685e, interfaceC3314e), c13770e), null, 0.0f, 0.0f, c13770e, 196614, 476);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object signatures(Object obj, Object obj2, Object obj3) {
        Bitmap bitmap = (Bitmap) this.f16499e;
        C12761e c12761e = (C12761e) this.f16498e;
        C9326e c9326e = (C9326e) this.f16500e;
        C13770e c13770e = (C13770e) obj2;
        ((Integer) obj3).getClass();
        AbstractC11613e.ad(AbstractC0933e.vip(c13770e), C7139e.purchase, AbstractC16653e.license(-521800441, new C1455e(bitmap, 0), c13770e), c13770e, 384, 0);
        AbstractC11261e.ad(AbstractC14430e.billing(((C2670e) obj).ad(new C8851e(C6705e.ad)), AbstractC0933e.vip, 0.0f, 2), AbstractC16653e.license(69213679, new C11828e(c12761e, c9326e, 5), c13770e), c13770e, 3072);
        return Unit.INSTANCE;
    }

    private final Object smaato(Object obj, Object obj2, Object obj3) {
        C4921e c4921e = (C4921e) this.f16499e;
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f16498e;
        InterfaceC16132e interfaceC16132e = (InterfaceC16132e) this.f16500e;
        C18055e c18055e = (C18055e) obj;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c13770e.purchase(c18055e) ? 4 : 2;
        }
        if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
            boolean z = ((C13034e) interfaceC16132e.getValue()).f25960e;
            InterfaceC12864e mopub = AbstractC8703e.mopub(c18055e, C0115e.f1276e);
            boolean yandex = c13770e.yandex(interfaceC18435e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C17744e(interfaceC18435e, 1);
                c13770e.m3682throws(m3681throw);
            }
            c4921e.m1691strictfp(z, (Function1) m3681throw, mopub, Integer.valueOf(R.string.settings_experimental_vkru_desc), false, c13770e, 0);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object startapp(Object obj, Object obj2, Object obj3) {
        C14137e c14137e = (C14137e) this.f16498e;
        InterfaceC11221e interfaceC11221e = (InterfaceC11221e) this.f16500e;
        C2443e c2443e = AbstractC11295e.advert;
        Object obj4 = this.f16499e;
        if (obj4 != c2443e) {
            AbstractC6401e.license(c14137e.f27963e, obj4, ((C16259e) interfaceC11221e).f31939e);
        }
        return Unit.INSTANCE;
    }

    private final Object subscription(Object obj, Object obj2, Object obj3) {
        C4271e c4271e = (C4271e) this.f16499e;
        C2314e c2314e = (C2314e) this.f16498e;
        C2892e c2892e = (C2892e) this.f16500e;
        C13770e c13770e = (C13770e) obj2;
        ((Integer) obj3).getClass();
        float f = 16;
        InterfaceC12864e smaato = AbstractC12220e.smaato(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 0.0f, f, 1);
        C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(f), C5438e.f11678e, c13770e, 54);
        long j = c13770e.f27286case;
        int i = (int) (j ^ (j >>> 32));
        InterfaceC3483e advert = c13770e.advert();
        InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, smaato);
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
        c4271e.applovin(c2314e, c13770e, 0);
        c2892e.invoke(C0283e.ad, c13770e, 6);
        c4271e.ads(c2314e, c13770e, 0);
        c13770e.Signature(true);
        return Unit.INSTANCE;
    }

    private final Object vip(Object obj, Object obj2, Object obj3) {
        C10685e c10685e = (C10685e) this.f16499e;
        final C12560e c12560e = (C12560e) this.f16498e;
        final InterfaceC3314e interfaceC3314e = (InterfaceC3314e) this.f16500e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean yandex = c13770e.yandex(c10685e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C8570e(c10685e, 3);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC12864e license = AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15);
            C2892e c2892e = AbstractC13482e.billing;
            final int i = 0;
            C2892e license2 = AbstractC16653e.license(-55486880, new Function2() { // from class: eٍؘؙ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    String str;
                    switch (i) {
                        case 0:
                            C13770e c13770e2 = (C13770e) obj4;
                            int intValue2 = ((Integer) obj5).intValue();
                            if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                                if (((C3487e) interfaceC3314e.getValue()).f7760e) {
                                    str = AbstractC4653e.isVip(c13770e2, 552885767, R.string.themes_category_monet, c13770e2, false);
                                } else {
                                    c13770e2.m3676strictfp(553012681);
                                    c13770e2.Signature(false);
                                    str = c12560e.vip;
                                }
                                AbstractC14489e.vip(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                            } else {
                                c13770e2.m3659default();
                            }
                            return Unit.INSTANCE;
                        default:
                            C13770e c13770e3 = (C13770e) obj4;
                            int intValue3 = ((Integer) obj5).intValue();
                            if (!c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                                c13770e3.m3659default();
                            } else if (((C3487e) interfaceC3314e.getValue()).f7760e && AbstractC12681e.ad()) {
                                c13770e3.m3676strictfp(90329329);
                                AbstractC14942e.license(0, 1, c13770e3, null);
                                c13770e3.Signature(false);
                            } else {
                                c13770e3.m3676strictfp(90417834);
                                AbstractC14942e.appmetrica(c12560e, null, c13770e3, 0, 2);
                                c13770e3.Signature(false);
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, c13770e);
            final int i2 = 1;
            AbstractC16429e.ad(c2892e, license, null, license2, null, AbstractC16653e.license(1657813406, new Function2() { // from class: eٍؘؙ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    String str;
                    switch (i2) {
                        case 0:
                            C13770e c13770e2 = (C13770e) obj4;
                            int intValue2 = ((Integer) obj5).intValue();
                            if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                                if (((C3487e) interfaceC3314e.getValue()).f7760e) {
                                    str = AbstractC4653e.isVip(c13770e2, 552885767, R.string.themes_category_monet, c13770e2, false);
                                } else {
                                    c13770e2.m3676strictfp(553012681);
                                    c13770e2.Signature(false);
                                    str = c12560e.vip;
                                }
                                AbstractC14489e.vip(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                            } else {
                                c13770e2.m3659default();
                            }
                            return Unit.INSTANCE;
                        default:
                            C13770e c13770e3 = (C13770e) obj4;
                            int intValue3 = ((Integer) obj5).intValue();
                            if (!c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                                c13770e3.m3659default();
                            } else if (((C3487e) interfaceC3314e.getValue()).f7760e && AbstractC12681e.ad()) {
                                c13770e3.m3676strictfp(90329329);
                                AbstractC14942e.license(0, 1, c13770e3, null);
                                c13770e3.Signature(false);
                            } else {
                                c13770e3.m3676strictfp(90417834);
                                AbstractC14942e.appmetrica(c12560e, null, c13770e3, 0, 2);
                                c13770e3.Signature(false);
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, c13770e), null, 0.0f, 0.0f, c13770e, 199686, 468);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C2892e c2892e;
        int i = this.f16501e;
        int i2 = 9;
        C0115e c0115e = C0115e.f1276e;
        C5170e c5170e = C2987e.ad;
        Object obj4 = this.f16500e;
        Object obj5 = this.f16498e;
        Object obj6 = this.f16499e;
        int i3 = 1;
        switch (i) {
            case 0:
                String str = (String) obj6;
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                boolean z = (intValue & 17) != 16;
                AbstractC7919e abstractC7919e = c13770e.ad;
                if (c13770e.m3673protected(intValue & 1, z)) {
                    C7913e c7913e = AbstractC18007e.metrica;
                    InterfaceC2747e license = AbstractC17074e.license(C5438e.f11700e, false);
                    long j = c13770e.f27286case;
                    int i4 = (int) (j ^ (j >>> 32));
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
                    Integer valueOf = Integer.valueOf(i4);
                    C14865e c14865e3 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
                    C5430e c5430e = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e, c5430e);
                    C14865e c14865e4 = C2721e.license;
                    AbstractC2270e.yandex(c13770e, purchase, c14865e4);
                    float f = 16;
                    InterfaceC12864e mopub = AbstractC12220e.mopub(c0115e, f);
                    C13964e billing = AbstractC16497e.billing(f);
                    C9577e c9577e = C5438e.f11678e;
                    C4789e ad = AbstractC14801e.ad(billing, c9577e, c13770e, 54);
                    long j2 = c13770e.f27286case;
                    int i5 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert2 = c13770e.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, mopub);
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, ad, c14865e);
                    AbstractC2270e.yandex(c13770e, advert2, c14865e2);
                    AbstractC8703e.premium(i5, c13770e, c14865e3, c13770e, c5430e);
                    AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
                    AbstractC8461e.vip(str, str2, AbstractC12447e.vip(AbstractC18007e.startapp(c0115e, 96), AbstractC0903e.purchase(c13770e).metrica), new C6159e(AbstractC0903e.license(c13770e).premium), null, null, c13770e, 4096, 0, 32752);
                    C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, c9577e, c13770e, 48);
                    long j3 = c13770e.f27286case;
                    int i6 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert3 = c13770e.advert();
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, c0115e);
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, ad2, c14865e);
                    AbstractC2270e.yandex(c13770e, advert3, c14865e2);
                    AbstractC8703e.premium(i6, c13770e, c14865e3, c13770e, c5430e);
                    AbstractC2270e.yandex(c13770e, purchase3, c14865e4);
                    AbstractC14489e.vip(str2, null, AbstractC0903e.license(c13770e).admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e).yandex, c13770e, 0, 0, 130042);
                    AbstractC14489e.vip(str3, null, AbstractC0903e.license(c13770e).remoteconfig, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e).mopub, c13770e, 0, 0, 130042);
                    AbstractC1786e.isPro(c13770e, true, true, true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                AudioPlaylist audioPlaylist = (AudioPlaylist) obj6;
                C11001e c11001e = (C11001e) obj5;
                C11204e c11204e = (C11204e) obj4;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                boolean z2 = (intValue2 & 17) != 16;
                AbstractC7919e abstractC7919e2 = c13770e2.ad;
                if (c13770e2.m3673protected(intValue2 & 1, z2)) {
                    InterfaceC12864e smaato = AbstractC18007e.smaato(AbstractC17113e.vip(c0115e), 240);
                    C10156e c10156e = C5438e.f11676e;
                    InterfaceC2747e license2 = AbstractC17074e.license(c10156e, false);
                    long j4 = c13770e2.f27286case;
                    int i7 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC3483e advert4 = c13770e2.advert();
                    InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e2, smaato);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e2 = C2721e.vip;
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e2);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    C14865e c14865e5 = C2721e.billing;
                    AbstractC2270e.yandex(c13770e2, license2, c14865e5);
                    C14865e c14865e6 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e2, advert4, c14865e6);
                    Integer valueOf2 = Integer.valueOf(i7);
                    C14865e c14865e7 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e2, valueOf2, c14865e7);
                    C5430e c5430e2 = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e2, c5430e2);
                    C14865e c14865e8 = C2721e.license;
                    AbstractC2270e.yandex(c13770e2, purchase4, c14865e8);
                    AbstractC8461e.ad(audioPlaylist, null, AbstractC18007e.metrica, C16477e.ad, null, c13770e2, 1573296, 1976);
                    InterfaceC12864e metrica = AbstractC18007e.metrica(AbstractC12220e.advert(c0115e, 16, 8), 1.0f);
                    InterfaceC2747e license3 = AbstractC17074e.license(c10156e, false);
                    long j5 = c13770e2.f27286case;
                    int i8 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC3483e advert5 = c13770e2.advert();
                    InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e2, metrica);
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e2);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e2, license3, c14865e5);
                    AbstractC2270e.yandex(c13770e2, advert5, c14865e6);
                    AbstractC8703e.premium(i8, c13770e2, c14865e7, c13770e2, c5430e2);
                    AbstractC2270e.yandex(c13770e2, purchase5, c14865e8);
                    String str4 = audioPlaylist.subs;
                    C1839e c1839e = ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).vip.purchase;
                    C0269e c0269e = AbstractC16795e.vip;
                    C1812e c1812e = C1812e.f4889e;
                    long j6 = C3618e.appmetrica;
                    C10156e c10156e2 = C5438e.f11666e;
                    C14486e c14486e = C14486e.ad;
                    AbstractC14489e.vip(str4, c14486e.ad(c0115e, c10156e2), j6, 0L, null, c1812e, c0269e, 0L, null, 0L, 0, false, 0, 0, c1839e, c13770e2, 14156160, 0, 130872);
                    int i9 = C12563e.ad;
                    C14602e vip = C12563e.vip(j6, C3618e.vip, c13770e2, 54);
                    InterfaceC12864e ad3 = c14486e.ad(c0115e, C5438e.f11699e);
                    boolean yandex = c13770e2.yandex(c11001e) | c13770e2.yandex(c11204e) | c13770e2.yandex(audioPlaylist);
                    Object m3681throw = c13770e2.m3681throw();
                    if (yandex || m3681throw == c5170e) {
                        m3681throw = new C5625e(c11001e, c11204e, audioPlaylist);
                        c13770e2.m3682throws(m3681throw);
                    }
                    AbstractC0014e.metrica((Function0) m3681throw, ad3, false, vip, null, null, AbstractC7700e.ad, c13770e2, 1572864, 52);
                    c13770e2.Signature(true);
                    c13770e2.Signature(true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                InterfaceC2566e interfaceC2566e = (InterfaceC2566e) obj6;
                C5223e c5223e = (C5223e) obj5;
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj4;
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= c13770e3.purchase(interfaceC12123e) ? 4 : 2;
                }
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 19) != 18)) {
                    InterfaceC12864e license4 = AbstractC14783e.license(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e), interfaceC2566e.ad(), null);
                    boolean yandex2 = c13770e3.yandex(c5223e) | c13770e3.yandex(interfaceC18435e);
                    Object m3681throw2 = c13770e3.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        m3681throw2 = new C9041e(c5223e, interfaceC18435e, i2);
                        c13770e3.m3682throws(m3681throw2);
                    }
                    AbstractC7023e.ad(license4, null, null, null, null, null, false, null, (Function1) m3681throw2, c13770e3, 0, 510);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                final C12380e c12380e = (C12380e) obj6;
                final C0267e c0267e = (C0267e) obj5;
                C0576e c0576e = c0267e.f2257e;
                C6260e c6260e = (C6260e) obj4;
                InterfaceC12123e interfaceC12123e2 = (InterfaceC12123e) obj;
                C13770e c13770e4 = (C13770e) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= c13770e4.purchase(interfaceC12123e2) ? 4 : 2;
                }
                boolean z3 = (intValue4 & 19) != 18;
                AbstractC7919e abstractC7919e3 = c13770e4.ad;
                if (c13770e4.m3673protected(intValue4 & 1, z3)) {
                    float f2 = 16;
                    InterfaceC12864e purchase6 = AbstractC5967e.purchase(AbstractC12220e.smaato(AbstractC12220e.adcel(c0115e, interfaceC12123e2), f2, 0.0f, 2).premium(AbstractC18007e.metrica), AbstractC5967e.appmetrica(c13770e4), true);
                    C13964e billing2 = AbstractC16497e.billing(f2);
                    C9577e c9577e2 = C5438e.f11672e;
                    C4789e ad4 = AbstractC14801e.ad(billing2, c9577e2, c13770e4, 6);
                    long j7 = c13770e4.f27286case;
                    int i10 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC3483e advert6 = c13770e4.advert();
                    InterfaceC12864e purchase7 = AbstractC5679e.purchase(c13770e4, purchase6);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e3 = C2721e.vip;
                    c13770e4.m3666import();
                    if (c13770e4.f27292implements) {
                        c13770e4.mopub(c7309e3);
                    } else {
                        c13770e4.m3684volatile();
                    }
                    C14865e c14865e9 = C2721e.billing;
                    AbstractC2270e.yandex(c13770e4, ad4, c14865e9);
                    C14865e c14865e10 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e4, advert6, c14865e10);
                    Integer valueOf3 = Integer.valueOf(i10);
                    C14865e c14865e11 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e4, valueOf3, c14865e11);
                    C5430e c5430e3 = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e4, c5430e3);
                    C14865e c14865e12 = C2721e.license;
                    AbstractC2270e.yandex(c13770e4, purchase7, c14865e12);
                    float f3 = 8;
                    C4789e ad5 = AbstractC14801e.ad(AbstractC16497e.billing(f3), c9577e2, c13770e4, 6);
                    long j8 = c13770e4.f27286case;
                    int i11 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC3483e advert7 = c13770e4.advert();
                    InterfaceC12864e purchase8 = AbstractC5679e.purchase(c13770e4, c0115e);
                    c13770e4.m3666import();
                    if (c13770e4.f27292implements) {
                        c13770e4.mopub(c7309e3);
                    } else {
                        c13770e4.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e4, ad5, c14865e9);
                    AbstractC2270e.yandex(c13770e4, advert7, c14865e10);
                    AbstractC8703e.premium(i11, c13770e4, c14865e11, c13770e4, c5430e3);
                    AbstractC2270e.yandex(c13770e4, purchase8, c14865e12);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e4, R.string.auth2_username_title), AbstractC18007e.metrica(c0115e, 1.0f), 0L, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e4).appmetrica, c13770e4, 48, 0, 130044);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e4, R.string.auth2_username_text), AbstractC18007e.metrica(c0115e, 1.0f), AbstractC0903e.license(c13770e4).remoteconfig, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e4).adcel, c13770e4, 48, 0, 130040);
                    c13770e4.Signature(true);
                    C6114e c6114e = C6114e.f12844e;
                    C4988e c4988e = new C4988e(6, 7, 115);
                    boolean purchase9 = c13770e4.purchase(c12380e) | c13770e4.yandex(c0267e);
                    Object m3681throw3 = c13770e4.m3681throw();
                    if (purchase9 || m3681throw3 == c5170e) {
                        m3681throw3 = new InterfaceC13435e() { // from class: eٍؚٝ
                            @Override // defpackage.InterfaceC13435e
                            public final void ad(C10474e c10474e) {
                                c10474e.invoke();
                                C12380e c12380e2 = C12380e.this;
                                if (c12380e2.vip().f33322e.length() > 0) {
                                    String obj7 = c12380e2.vip().f33322e.toString();
                                    C0267e c0267e2 = c0267e;
                                    c0267e2.f2257e.setValue(BuildConfig.FLAVOR);
                                    c0267e2.f2258e.setValue(Boolean.TRUE);
                                    AbstractC5336e.purchase(AbstractC4608e.metrica(c0267e2.vip()), null, 0, new C6626e(obj7, c0267e2, null, 10), 3);
                                }
                            }
                        };
                        c13770e4.m3682throws(m3681throw3);
                    }
                    InterfaceC13435e interfaceC13435e = (InterfaceC13435e) m3681throw3;
                    C18121e c18121e = C18121e.ad;
                    C17085e license5 = C18121e.license(AbstractC0903e.license(c13770e4).subscription, AbstractC0903e.license(c13770e4).subscription, AbstractC0903e.license(c13770e4).subscription, AbstractC0903e.license(c13770e4).subscription, c13770e4, 2147483407);
                    if (((String) c0576e.getValue()).length() > 0) {
                        c13770e4.m3676strictfp(848575938);
                        byte b = 0;
                        C2892e license6 = AbstractC16653e.license(261972594, new C3506e(c0267e, b, b), c13770e4);
                        c13770e4.Signature(false);
                        c2892e = license6;
                    } else {
                        c13770e4.m3676strictfp(848692528);
                        c13770e4.Signature(false);
                        c2892e = null;
                    }
                    boolean z4 = ((String) c0576e.getValue()).length() > 0;
                    InterfaceC12864e license7 = AbstractC18366e.license(AbstractC18007e.metrica(c0115e, 1.0f).premium(C10759e.f21180e), c6260e);
                    Object m3681throw4 = c13770e4.m3681throw();
                    if (m3681throw4 == c5170e) {
                        m3681throw4 = new C2163e(16);
                        c13770e4.m3682throws(m3681throw4);
                    }
                    AbstractC11257e.ad(c12380e, AbstractC1147e.ad(license7, false, (Function1) m3681throw4), false, null, null, AbstractC2835e.metrica, c2892e, z4, null, c4988e, interfaceC13435e, c6114e, null, null, license5, null, c13770e4, 12582912, 102236160, 28888956);
                    InterfaceC12864e metrica2 = AbstractC18007e.metrica(c0115e, 1.0f);
                    String appmetrica = AbstractC5297e.appmetrica(c13770e4, R.string.auth2_username_action);
                    EnumC10044e enumC10044e = ((Boolean) c0267e.f2258e.getValue()).booleanValue() ? EnumC10044e.f19840e : c12380e.vip().f33322e.length() > 0 ? EnumC10044e.f19841e : EnumC10044e.f19843e;
                    boolean yandex3 = c13770e4.yandex(c0267e) | c13770e4.purchase(c12380e);
                    Object m3681throw5 = c13770e4.m3681throw();
                    if (yandex3 || m3681throw5 == c5170e) {
                        m3681throw5 = new C5625e(c0267e, c12380e, 12);
                        c13770e4.m3682throws(m3681throw5);
                    }
                    AbstractC9164e.ad(appmetrica, enumC10044e, (Function0) m3681throw5, metrica2, 0L, 0L, 0L, 0L, c13770e4, 3072);
                    float f4 = AbstractC11992e.ad;
                    AbstractC16429e.ad(AbstractC2835e.license, AbstractC12447e.vip(AbstractC18007e.metrica(c0115e, 1.0f), AbstractC0903e.purchase(c13770e4).metrica), null, AbstractC2835e.appmetrica, AbstractC2835e.purchase, null, AbstractC11992e.ad(AbstractC6532e.billing(C3618e.vip(0.05f, AbstractC0903e.license(c13770e4).ad), AbstractC0903e.license(c13770e4).subscription), 0L, 0L, 0L, c13770e4, 510), 0.0f, 0.0f, c13770e4, 27654, 420);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    AbstractC12534e.ad(c13770e4, new C5228e(1.0f, true));
                    InterfaceC12864e smaato2 = AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), 0.0f, f3, 1);
                    C4789e ad6 = AbstractC14801e.ad(AbstractC16497e.billing(f3), c9577e2, c13770e4, 6);
                    long j9 = c13770e4.f27286case;
                    int i12 = (int) (j9 ^ (j9 >>> 32));
                    InterfaceC3483e advert8 = c13770e4.advert();
                    InterfaceC12864e purchase10 = AbstractC5679e.purchase(c13770e4, smaato2);
                    c13770e4.m3666import();
                    if (c13770e4.f27292implements) {
                        c13770e4.mopub(c7309e3);
                    } else {
                        c13770e4.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e4, ad6, c14865e9);
                    AbstractC2270e.yandex(c13770e4, advert8, c14865e10);
                    AbstractC8703e.premium(i12, c13770e4, c14865e11, c13770e4, c5430e3);
                    AbstractC2270e.yandex(c13770e4, purchase10, c14865e12);
                    boolean yandex4 = c13770e4.yandex(c0267e);
                    Object m3681throw6 = c13770e4.m3681throw();
                    if (yandex4 || m3681throw6 == c5170e) {
                        m3681throw6 = new C17011e(0, c0267e, C0267e.class, "showLicense", "showLicense()V", 0, 0, 29);
                        c13770e4.m3682throws(m3681throw6);
                    }
                    InterfaceC12864e metrica3 = AbstractC18007e.metrica(c0115e, 1.0f);
                    C16005e c16005e = AbstractC10244e.ad;
                    AbstractC1513e.license((Function0) ((InterfaceC5261e) m3681throw6), metrica3, false, AbstractC10432e.ad, AbstractC10244e.purchase(AbstractC0903e.license(c13770e4).admob, 0L, c13770e4, 13), AbstractC12220e.metrica(0.0f, f3, 1), AbstractC2835e.billing, c13770e4, 817892400, 356);
                    AbstractC8141e.vip(null, 0.0f, 0L, c13770e4, 0, 7);
                    boolean yandex5 = c13770e4.yandex(c0267e);
                    Object m3681throw7 = c13770e4.m3681throw();
                    if (yandex5 || m3681throw7 == c5170e) {
                        m3681throw7 = new C15101e(0, c0267e, C0267e.class, "showProxy", "showProxy()V", 0, 0, 0);
                        c13770e4.m3682throws(m3681throw7);
                    }
                    AbstractC1513e.license((Function0) ((InterfaceC5261e) m3681throw7), AbstractC18007e.metrica(c0115e, 1.0f), false, null, null, null, AbstractC2835e.yandex, c13770e4, 805306416, 508);
                    c13770e4.Signature(true);
                    c13770e4.Signature(true);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                InterfaceC2566e interfaceC2566e2 = (InterfaceC2566e) obj6;
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj5;
                C5838e c5838e = (C5838e) obj4;
                InterfaceC12123e interfaceC12123e3 = (InterfaceC12123e) obj;
                C13770e c13770e5 = (C13770e) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= c13770e5.purchase(interfaceC12123e3) ? 4 : 2;
                }
                if (c13770e5.m3673protected(1 & intValue5, (intValue5 & 19) != 18)) {
                    InterfaceC12864e license8 = AbstractC14783e.license(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e3), interfaceC2566e2.ad(), null);
                    float f5 = 24;
                    C16005e appmetrica2 = AbstractC12220e.appmetrica(f5, 0.0f, f5, 88, 2);
                    boolean purchase11 = c13770e5.purchase(interfaceC3314e) | c13770e5.yandex(c5838e);
                    Object m3681throw8 = c13770e5.m3681throw();
                    if (purchase11 || m3681throw8 == c5170e) {
                        m3681throw8 = new C9041e(interfaceC3314e, c5838e, 12);
                        c13770e5.m3682throws(m3681throw8);
                    }
                    AbstractC7023e.ad(license8, null, appmetrica2, null, null, null, false, null, (Function1) m3681throw8, c13770e5, 384, 506);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                InterfaceC2566e interfaceC2566e3 = (InterfaceC2566e) obj6;
                C0764e c0764e = (C0764e) obj5;
                C2616e c2616e = (C2616e) obj4;
                InterfaceC12123e interfaceC12123e4 = (InterfaceC12123e) obj;
                C13770e c13770e6 = (C13770e) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= c13770e6.purchase(interfaceC12123e4) ? 4 : 2;
                }
                if (c13770e6.m3673protected(1 & intValue6, (intValue6 & 19) != 18)) {
                    InterfaceC12864e license9 = AbstractC14783e.license(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e4), interfaceC2566e3.ad(), null);
                    boolean purchase12 = c13770e6.purchase(c0764e) | c13770e6.purchase(c2616e);
                    Object m3681throw9 = c13770e6.m3681throw();
                    if (purchase12 || m3681throw9 == c5170e) {
                        m3681throw9 = new C9041e(c0764e, c2616e, 29);
                        c13770e6.m3682throws(m3681throw9);
                    }
                    AbstractC7023e.ad(license9, null, null, null, null, null, false, null, (Function1) m3681throw9, c13770e6, 0, 510);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 6:
                C4271e c4271e = (C4271e) obj6;
                C4254e c4254e = (C4254e) obj5;
                AbstractC16904e abstractC16904e = (AbstractC16904e) obj4;
                C13770e c13770e7 = (C13770e) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 17) != 16)) {
                    InterfaceC8042e interfaceC8042e = (InterfaceC8042e) c4271e.f9364e.getValue();
                    if (interfaceC8042e instanceof C5227e) {
                        c13770e7.m3676strictfp(2083874809);
                        C5227e c5227e = (C5227e) interfaceC8042e;
                        if (c5227e.ad.isEmpty()) {
                            c13770e7.m3676strictfp(2083882559);
                            c4271e.inmobi(R.string.ny26_error_empty, 0, c13770e7);
                            c13770e7.Signature(false);
                        } else {
                            c13770e7.m3676strictfp(2084006869);
                            InterfaceC12864e premium = AbstractC18007e.metrica.premium(new C14994e(c4254e));
                            WeakHashMap weakHashMap = C8845e.isVip;
                            C15752e c15752e = C16728e.subscription(c13770e7).appmetrica;
                            AbstractC16279e.license(abstractC16904e, premium, null, new C12152e(c15752e.appmetrica().license, 32), 16, null, null, false, null, null, null, AbstractC16653e.license(1025898400, new C5270e(i3, c5227e, abstractC16904e, c4271e), c13770e7), c13770e7, 196608);
                            c13770e7.Signature(false);
                        }
                        c13770e7.Signature(false);
                    } else if (AbstractC7890e.billing(interfaceC8042e, C6676e.ad)) {
                        c13770e7.m3676strictfp(2085121288);
                        c4271e.inmobi(R.string.ny24_error_data, 0, c13770e7);
                        c13770e7.Signature(false);
                    } else if (AbstractC7890e.billing(interfaceC8042e, C17444e.ad)) {
                        c13770e7.m3676strictfp(2085247303);
                        c4271e.inmobi(R.string.ny24_error_token, 0, c13770e7);
                        c13770e7.Signature(false);
                    } else {
                        if (!AbstractC7890e.billing(interfaceC8042e, C17576e.ad)) {
                            throw AbstractC1786e.loadAd(1175598930, c13770e7, false);
                        }
                        c13770e7.m3676strictfp(2085363708);
                        AbstractC0436e.ad(AbstractC18007e.metrica, false, C3618e.appmetrica, c13770e7, 390, 2);
                        c13770e7.Signature(false);
                    }
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case 7:
                InterfaceC2566e interfaceC2566e4 = (InterfaceC2566e) obj6;
                C14873e c14873e = (C14873e) obj5;
                C6123e c6123e = (C6123e) obj4;
                C13770e c13770e8 = (C13770e) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if (c13770e8.m3673protected(1 & intValue8, (intValue8 & 17) != 16)) {
                    InterfaceC12864e license10 = AbstractC14783e.license(AbstractC18007e.metrica, interfaceC2566e4.ad(), null);
                    C16005e vip2 = ((C0916e) c13770e8.adcel(AbstractC12450e.ad)).vip(c13770e8);
                    boolean yandex6 = c13770e8.yandex(c14873e) | c13770e8.yandex(c6123e);
                    Object m3681throw10 = c13770e8.m3681throw();
                    if (yandex6 || m3681throw10 == c5170e) {
                        m3681throw10 = new C10869e(c6123e, c14873e, 19);
                        c13770e8.m3682throws(m3681throw10);
                    }
                    AbstractC7023e.ad(license10, null, vip2, null, null, null, false, null, (Function1) m3681throw10, c13770e8, 0, 506);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case 8:
                C9261e c9261e = (C9261e) obj6;
                InterfaceC16132e interfaceC16132e = (InterfaceC16132e) obj5;
                InterfaceC18435e interfaceC18435e2 = (InterfaceC18435e) obj4;
                InterfaceC12123e interfaceC12123e5 = (InterfaceC12123e) obj;
                C13770e c13770e9 = (C13770e) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= c13770e9.purchase(interfaceC12123e5) ? 4 : 2;
                }
                if (!c13770e9.m3673protected(intValue9 & 1, (intValue9 & 19) != 18)) {
                    c13770e9.m3659default();
                } else if (((Boolean) c9261e.f18472e.getValue()).booleanValue()) {
                    c13770e9.m3676strictfp(-1139120237);
                    InterfaceC12864e adcel = AbstractC12220e.adcel(c0115e, interfaceC12123e5);
                    C7913e c7913e2 = AbstractC18007e.metrica;
                    InterfaceC12864e premium2 = adcel.premium(c7913e2);
                    InterfaceC2747e license11 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j10 = c13770e9.f27286case;
                    int i13 = (int) (j10 ^ (j10 >>> 32));
                    InterfaceC3483e advert9 = c13770e9.advert();
                    InterfaceC12864e purchase13 = AbstractC5679e.purchase(c13770e9, premium2);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e4 = C2721e.vip;
                    c13770e9.m3666import();
                    if (c13770e9.f27292implements) {
                        c13770e9.mopub(c7309e4);
                    } else {
                        c13770e9.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e9, license11, C2721e.billing);
                    AbstractC2270e.yandex(c13770e9, advert9, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e9, Integer.valueOf(i13), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e9, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e9, purchase13, C2721e.license);
                    InterfaceC12864e purchase14 = AbstractC5967e.purchase(c7913e2, AbstractC5967e.appmetrica(c13770e9), true);
                    Throwable th = c9261e.f18473e;
                    if (th == null) {
                        th = new Exception();
                    }
                    InterfaceC4977e smaato3 = C15802e.smaato(th);
                    boolean yandex7 = c13770e9.yandex(interfaceC18435e2) | c13770e9.yandex(c9261e) | c13770e9.purchase(interfaceC16132e);
                    Object m3681throw11 = c13770e9.m3681throw();
                    if (yandex7 || m3681throw11 == c5170e) {
                        m3681throw11 = new Csynchronized(20, interfaceC18435e2, c9261e, interfaceC16132e);
                        c13770e9.m3682throws(m3681throw11);
                    }
                    AbstractC11906e.ad(smaato3, (Function0) m3681throw11, purchase14, false, c13770e9, 0, 8);
                    c13770e9.Signature(true);
                    c13770e9.Signature(false);
                } else if (((Boolean) c9261e.f18476e.getValue()).booleanValue()) {
                    c13770e9.m3676strictfp(-1138454109);
                    AbstractC0436e.ad(AbstractC18007e.metrica, true, 0L, c13770e9, 54, 4);
                    c13770e9.Signature(false);
                } else {
                    c13770e9.m3676strictfp(-1138164414);
                    C7913e c7913e3 = AbstractC18007e.metrica;
                    boolean yandex8 = c13770e9.yandex(c9261e) | c13770e9.purchase(interfaceC16132e);
                    Object m3681throw12 = c13770e9.m3681throw();
                    if (yandex8 || m3681throw12 == c5170e) {
                        m3681throw12 = new C10869e(c9261e, interfaceC16132e, 28);
                        c13770e9.m3682throws(m3681throw12);
                    }
                    AbstractC7023e.ad(c7913e3, null, interfaceC12123e5, null, null, null, false, null, (Function1) m3681throw12, c13770e9, ((intValue9 << 6) & 896) | 6, 506);
                    c13770e9.Signature(false);
                }
                return Unit.INSTANCE;
            case 9:
                InterfaceC2566e interfaceC2566e5 = (InterfaceC2566e) obj6;
                AbstractC15638e abstractC15638e = (AbstractC15638e) obj5;
                InterfaceC16132e interfaceC16132e2 = (InterfaceC16132e) obj4;
                InterfaceC12123e interfaceC12123e6 = (InterfaceC12123e) obj;
                C13770e c13770e10 = (C13770e) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= c13770e10.purchase(interfaceC12123e6) ? 4 : 2;
                }
                if (c13770e10.m3673protected(1 & intValue10, (intValue10 & 19) != 18)) {
                    InterfaceC12864e license12 = AbstractC14783e.license(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e6), interfaceC2566e5.ad(), null);
                    boolean yandex9 = c13770e10.yandex(abstractC15638e) | c13770e10.purchase(interfaceC16132e2);
                    Object m3681throw13 = c13770e10.m3681throw();
                    if (yandex9 || m3681throw13 == c5170e) {
                        m3681throw13 = new C6538e(abstractC15638e, interfaceC16132e2, i2);
                        c13770e10.m3682throws(m3681throw13);
                    }
                    AbstractC7023e.ad(license12, null, null, null, null, null, false, null, (Function1) m3681throw13, c13770e10, 0, 510);
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
            case 10:
                return isVip(obj, obj2, obj3);
            case 11:
                Cpublic cpublic = (Cpublic) obj6;
                C16330e c16330e = (C16330e) obj5;
                EnumC6916e enumC6916e = (EnumC6916e) obj4;
                C13770e c13770e11 = (C13770e) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                if (c13770e11.m3673protected(1 & intValue11, (intValue11 & 17) != 16)) {
                    boolean yandex10 = c13770e11.yandex(cpublic);
                    Object m3681throw14 = c13770e11.m3681throw();
                    if (yandex10 || m3681throw14 == c5170e) {
                        m3681throw14 = new Celse(cpublic, c16330e, r8 ? 1 : 0);
                        c13770e11.m3682throws(m3681throw14);
                    }
                    AbstractC0865e.license((Function0) m3681throw14, AbstractC12220e.smaato(c0115e, 16, 0.0f, 2), false, null, AbstractC12322e.yandex(((C7019e) c13770e11.adcel(AbstractC11785e.ad)).ad.subscription, 0L, c13770e11, 0, 14), null, null, AbstractC16653e.license(-1900519908, new C8937e(cpublic, enumC6916e, 22), c13770e11), c13770e11, 100663344, 236);
                } else {
                    c13770e11.m3659default();
                }
                return Unit.INSTANCE;
            case 12:
                return ad(obj, obj2, obj3);
            case 13:
                return vip(obj, obj2, obj3);
            case 14:
                return license(obj, obj2, obj3);
            case 15:
                return purchase(obj, obj2, obj3);
            case 16:
                return billing(obj, obj2, obj3);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return startapp(obj, obj2, obj3);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return adcel(obj, obj2, obj3);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return mopub(obj, obj2, obj3);
            case 20:
                return advert(obj, obj2, obj3);
            case 21:
                return smaato(obj, obj2, obj3);
            case 22:
                return amazon(obj, obj2, obj3);
            case 23:
                return loadAd(obj, obj2, obj3);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return Signature(obj, obj2, obj3);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return admob(obj, obj2, obj3);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return subscription(obj, obj2, obj3);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return pro(obj, obj2, obj3);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return signatures(obj, obj2, obj3);
            default:
                C17312e c17312e = (C17312e) obj6;
                C5181e c5181e = (C5181e) obj5;
                InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) obj4;
                C13770e c13770e12 = (C13770e) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                if (c13770e12.m3673protected(1 & intValue12, (intValue12 & 17) != 16)) {
                    InterfaceC12864e metrica4 = AbstractC18007e.metrica(c0115e, 1.0f);
                    float f6 = AbstractC11992e.ad;
                    AbstractC16429e.ad(AbstractC13406e.ad, metrica4, null, AbstractC16653e.license(2141009191, new C15709e(c17312e, c5181e, 17), c13770e12), null, AbstractC16653e.license(1343583657, new C5776e(interfaceC3314e2, 10), c13770e12), AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e12, 510), 0.0f, 0.0f, c13770e12, 199734, 404);
                } else {
                    c13770e12.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
