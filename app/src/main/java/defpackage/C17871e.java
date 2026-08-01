package defpackage;

import android.content.res.Configuration;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxtv.VkxTvEntrypoint;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜ٘ؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17871e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f35062e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35063e;

    public /* synthetic */ C17871e(int i, Object obj) {
        this.f35063e = i;
        this.f35062e = obj;
    }

    public /* synthetic */ C17871e(C17651e c17651e, C9980e c9980e) {
        this.f35063e = 2;
        this.f35062e = c17651e;
    }

    private final Object ad(Object obj, Object obj2, Object obj3) {
        C6267e c6267e = (C6267e) this.f35062e;
        InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
        }
        if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
            C13964e billing = AbstractC16497e.billing(16);
            boolean yandex = c13770e.yandex(c6267e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C17955e(2, c6267e);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC7023e.ad(null, null, interfaceC12123e, billing, null, null, false, null, (Function1) m3681throw, c13770e, ((intValue << 6) & 896) | 24576, 491);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object adcel(Object obj, Object obj2, Object obj3) {
        InterfaceC14511e interfaceC14511e = (InterfaceC14511e) this.f35062e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            boolean z = interfaceC14511e instanceof C2913e;
            C0115e c0115e = C0115e.f1276e;
            if (z) {
                c13770e.m3676strictfp(567900601);
                AbstractC4260e.ad(AbstractC12475e.metrica(((C2913e) interfaceC14511e).ad, 0, c13770e), AbstractC18007e.startapp(AbstractC12220e.advert(c0115e, 16, 6), 18), 0L, c13770e, 440, 8);
                c13770e.Signature(false);
            } else {
                if (!(interfaceC14511e instanceof C7533e)) {
                    throw AbstractC1786e.loadAd(-1228608343, c13770e, false);
                }
                c13770e.m3676strictfp(568274957);
                AbstractC10600e.vip(AbstractC5297e.appmetrica(c13770e, ((C7533e) interfaceC14511e).ad), AbstractC12220e.advert(c0115e, 16, 6), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C10375e) c13770e.adcel(AbstractC17878e.ad)).startapp, c13770e, 48, 0, 65532);
                c13770e.Signature(false);
            }
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object billing(Object obj, Object obj2, Object obj3) {
        C6571e c6571e = (C6571e) this.f35062e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            AbstractC17181e.vip(AbstractC5297e.appmetrica(c13770e, ((Number) c6571e.f13544e).intValue()), c13770e, 0);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object license(Object obj, Object obj2, Object obj3) {
        InterfaceC13158e interfaceC13158e = (InterfaceC13158e) obj;
        InterfaceC16719e interfaceC16719e = (InterfaceC16719e) obj2;
        C5602e c5602e = (C5602e) obj3;
        float f = ((C15765e) ((Function0) this.f35062e).invoke()).f31051e;
        AbstractC2832e admob = interfaceC16719e.admob(C5602e.ad(0, 0, AbstractC2278e.purchase(!C15765e.vip(f, Float.NaN) ? interfaceC13158e.mo493e(f) : 0, c5602e.ad), 0, 11, c5602e.ad));
        return interfaceC13158e.ads(admob.f6806e, admob.f6804e, C9139e.f18290e, new C4889e(admob, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object mopub(java.lang.Object r36, java.lang.Object r37, java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17871e.mopub(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object purchase(Object obj, Object obj2, Object obj3) {
        C15860e c15860e = (C15860e) this.f35062e;
        InterfaceC12864e interfaceC12864e = (InterfaceC12864e) obj;
        C13770e c13770e = (C13770e) obj2;
        ((Integer) obj3).getClass();
        c13770e.m3676strictfp(1980580247);
        InterfaceC14388e interfaceC14388e = (InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex);
        Object m3681throw = c13770e.m3681throw();
        C5170e c5170e = C2987e.ad;
        if (m3681throw == c5170e) {
            m3681throw = AbstractC14533e.startapp(new C12729e(0L));
            c13770e.m3682throws(m3681throw);
        }
        InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
        boolean yandex = c13770e.yandex(c15860e);
        Object m3681throw2 = c13770e.m3681throw();
        if (yandex || m3681throw2 == c5170e) {
            m3681throw2 = new C5565e(c15860e, interfaceC3314e, 27);
            c13770e.m3682throws(m3681throw2);
        }
        Function0 function0 = (Function0) m3681throw2;
        boolean purchase = c13770e.purchase(interfaceC14388e);
        Object m3681throw3 = c13770e.m3681throw();
        if (purchase || m3681throw3 == c5170e) {
            m3681throw3 = new C9104e(interfaceC14388e, interfaceC3314e, 2);
            c13770e.m3682throws(m3681throw3);
        }
        C14443e c14443e = AbstractC1236e.ad;
        InterfaceC12864e metrica = AbstractC5679e.metrica(interfaceC12864e, new C11828e(function0, (Function1) m3681throw3, 11));
        c13770e.Signature(false);
        return metrica;
    }

    private final Object startapp(Object obj, Object obj2, Object obj3) {
        C5170e c5170e;
        String str;
        int i;
        C10137e c10137e = (C10137e) this.f35062e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            float f = AbstractC11992e.ad;
            long j = C3618e.startapp;
            C8872e ad = AbstractC11992e.ad(j, 0L, 0L, 0L, c13770e, 510);
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
            boolean yandex = c13770e.yandex(c10137e);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e2 = C2987e.ad;
            if (yandex || m3681throw == c5170e2) {
                c5170e = c5170e2;
                C11212e c11212e = new C11212e(0, c10137e, C10137e.class, "onPreloadConfirmedClicked", "onPreloadConfirmedClicked()V", 0, 0, 5);
                c13770e.m3682throws(c11212e);
                m3681throw = c11212e;
            } else {
                c5170e = c5170e2;
            }
            AbstractC16429e.ad(AbstractC1798e.f4862e, AbstractC9546e.license(metrica, false, null, (Function0) ((InterfaceC5261e) m3681throw), 15), null, AbstractC1798e.f4860e, AbstractC1798e.f4859e, null, ad, 0.0f, 0.0f, c13770e, 27654, 420);
            AbstractC8141e.vip(null, 0.0f, 0L, c13770e, 0, 7);
            C8872e ad2 = AbstractC11992e.ad(j, 0L, 0L, 0L, c13770e, 510);
            InterfaceC12864e metrica2 = AbstractC18007e.metrica(c0115e, 1.0f);
            boolean yandex2 = c13770e.yandex(c10137e);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex2 || m3681throw2 == c5170e) {
                str = null;
                i = 15;
                C11212e c11212e2 = new C11212e(0, c10137e, C10137e.class, "onSkipClicked", "onSkipClicked()V", 0, 0, 6);
                c13770e.m3682throws(c11212e2);
                m3681throw2 = c11212e2;
            } else {
                str = null;
                i = 15;
            }
            AbstractC16429e.ad(AbstractC1798e.f4861e, AbstractC9546e.license(metrica2, false, str, (Function0) ((InterfaceC5261e) m3681throw2), i), null, AbstractC1798e.f4858e, AbstractC1798e.f4863e, null, ad2, 0.0f, 0.0f, c13770e, 27654, 420);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object vip(Object obj, Object obj2, Object obj3) {
        boolean z;
        C1902e c1902e = (C1902e) this.f35062e;
        int intValue = ((Integer) obj).intValue();
        int intValue2 = ((Integer) obj2).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        C17013e vip = booleanValue ? c1902e.f5067e.ad.vip() : c1902e.f5067e.license();
        long j = vip.f33324e;
        if (!c1902e.f5063e || Math.min(intValue, intValue2) < 0 || Math.max(intValue, intValue2) > vip.f33322e.length()) {
            z = false;
        } else {
            int i = C12347e.metrica;
            z = true;
            if (intValue != ((int) (j >> 32)) || intValue2 != ((int) (j & 4294967295L))) {
                long metrica = AbstractC9262e.metrica(intValue, intValue2);
                if (booleanValue || intValue == intValue2) {
                    c1902e.f5077e.inmobi(EnumC5022e.f10707e);
                } else {
                    c1902e.f5077e.inmobi(EnumC5022e.f10704e);
                }
                if (booleanValue) {
                    c1902e.f5067e.mopub(metrica);
                } else {
                    c1902e.f5067e.adcel(metrica);
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [byte, boolean] */
    /* JADX WARN: Type inference failed for: r9v19 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? r9;
        boolean z;
        Object obj4;
        int i = this.f35063e;
        int i2 = 10;
        int i3 = 3;
        InterfaceC5083e interfaceC5083e = null;
        C5170e c5170e = C2987e.ad;
        C0115e c0115e = C0115e.f1276e;
        Object obj5 = this.f35062e;
        switch (i) {
            case 0:
                C16918e c16918e = (C16918e) obj5;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(8), C5438e.f11668e, c13770e, 54);
                    long j = c13770e.f27286case;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
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
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i4), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, ((EnumC12987e) c16918e.f33142e.getValue()).f25892e), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262142);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_chevron_down_24, 0, c13770e), null, null, 0L, c13770e, 56, 12);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C16918e c16918e2 = (C16918e) obj5;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    C8587e ad2 = AbstractC6451e.ad(AbstractC16497e.billing(8), C5438e.f11668e, c13770e2, 54);
                    long j2 = c13770e2.f27286case;
                    int i5 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert2 = c13770e2.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e2 = C2721e.vip;
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e2);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e2, ad2, C2721e.billing);
                    AbstractC2270e.yandex(c13770e2, advert2, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e2, Integer.valueOf(i5), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e2, purchase2, C2721e.license);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e2, ((EnumC3144e) c16918e2.f33142e.getValue()).f7215e), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_chevron_down_24, 0, c13770e2), null, null, 0L, c13770e2, 56, 12);
                    c13770e2.Signature(true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C17651e c17651e = (C17651e) obj5;
                C17651e.yandex.set(c17651e, null);
                c17651e.billing(null);
                return Unit.INSTANCE;
            case 3:
                C9669e c9669e = (C9669e) obj5;
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                    InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex = c13770e3.yandex(c9669e);
                    Object m3681throw = c13770e3.m3681throw();
                    if (yandex || m3681throw == c5170e) {
                        m3681throw = new C0358e(c9669e, 2);
                        c13770e3.m3682throws(m3681throw);
                    }
                    AbstractC16429e.ad(AbstractC12110e.startapp, AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), null, AbstractC12110e.adcel, null, null, null, 0.0f, 0.0f, c13770e3, 3078, 500);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                final C0939e c0939e = (C0939e) obj5;
                InterfaceC10799e interfaceC10799e = (InterfaceC10799e) obj;
                C13770e c13770e4 = (C13770e) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= c13770e4.purchase(interfaceC10799e) ? 4 : 2;
                }
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 19) != 18)) {
                    final int i6 = 0;
                    final int i7 = 1;
                    AbstractC6401e.ad(interfaceC10799e, AbstractC16653e.license(-394452169, new Function2() { // from class: eَؚؕ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            switch (i6) {
                                case 0:
                                    C13770e c13770e5 = (C13770e) obj6;
                                    int intValue5 = ((Integer) obj7).intValue();
                                    if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 3) != 2)) {
                                        C0939e c0939e2 = c0939e;
                                        String str = c0939e2.vip;
                                        String str2 = c0939e2.metrica;
                                        C15492e c15492e = AbstractC3577e.ad;
                                        AbstractC6401e.metrica(str, str2, ((C0896e) c13770e5.adcel(c15492e)).ad, ((C0896e) c13770e5.adcel(c15492e)).vip, null, c13770e5, 0, 16);
                                    } else {
                                        c13770e5.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    C13770e c13770e6 = (C13770e) obj6;
                                    int intValue6 = ((Integer) obj7).intValue();
                                    if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 3) != 2)) {
                                        AbstractC14489e.vip(c0939e.license, null, ((C0896e) c13770e6.adcel(AbstractC3577e.ad)).vip, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e6, 0, 24960, 241658);
                                    } else {
                                        c13770e6.m3659default();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, c13770e4), AbstractC16653e.license(-1395508040, new Function2() { // from class: eَؚؕ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            switch (i7) {
                                case 0:
                                    C13770e c13770e5 = (C13770e) obj6;
                                    int intValue5 = ((Integer) obj7).intValue();
                                    if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 3) != 2)) {
                                        C0939e c0939e2 = c0939e;
                                        String str = c0939e2.vip;
                                        String str2 = c0939e2.metrica;
                                        C15492e c15492e = AbstractC3577e.ad;
                                        AbstractC6401e.metrica(str, str2, ((C0896e) c13770e5.adcel(c15492e)).ad, ((C0896e) c13770e5.adcel(c15492e)).vip, null, c13770e5, 0, 16);
                                    } else {
                                        c13770e5.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    C13770e c13770e6 = (C13770e) obj6;
                                    int intValue6 = ((Integer) obj7).intValue();
                                    if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 3) != 2)) {
                                        AbstractC14489e.vip(c0939e.license, null, ((C0896e) c13770e6.adcel(AbstractC3577e.ad)).vip, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e6, 0, 24960, 241658);
                                    } else {
                                        c13770e6.m3659default();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, c13770e4), c13770e4, (intValue4 & 14) | 432);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                EnumC13413e enumC13413e = (EnumC13413e) obj5;
                C13770e c13770e5 = (C13770e) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 17) != 16)) {
                    C8587e ad3 = AbstractC6451e.ad(AbstractC16497e.billing(8), C5438e.f11668e, c13770e5, 54);
                    long j3 = c13770e5.f27286case;
                    int i8 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert3 = c13770e5.advert();
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e5, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e3 = C2721e.vip;
                    c13770e5.m3666import();
                    if (c13770e5.f27292implements) {
                        c13770e5.mopub(c7309e3);
                    } else {
                        c13770e5.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e5, ad3, C2721e.billing);
                    AbstractC2270e.yandex(c13770e5, advert3, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e5, Integer.valueOf(i8), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e5, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e5, purchase3, C2721e.license);
                    c13770e5.m3676strictfp(1861256652);
                    C9122e c9122e = new C9122e();
                    c13770e5.m3676strictfp(1861257907);
                    int appmetrica = c9122e.appmetrica(new C4282e(0L, 0L, C1812e.f4893e, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                    try {
                        c9122e.metrica(AbstractC5297e.appmetrica(c13770e5, R.string.settings_integrations_lyrics_provider_inline));
                        c9122e.metrica(" ");
                        Unit unit = Unit.INSTANCE;
                        c9122e.license(appmetrica);
                        c13770e5.Signature(false);
                        c13770e5.m3676strictfp(1861265899);
                        int appmetrica2 = c9122e.appmetrica(new C4282e(0L, 0L, C1812e.f4889e, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                        try {
                            c9122e.metrica(AbstractC5297e.appmetrica(c13770e5, AbstractC12185e.adcel(enumC13413e)));
                            c9122e.license(appmetrica2);
                            c13770e5.Signature(false);
                            C10566e purchase4 = c9122e.purchase();
                            c13770e5.Signature(false);
                            AbstractC14489e.metrica(purchase4, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, null, c13770e5, 0, 0, 524286);
                            AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_chevron_down_24, 0, c13770e5), null, AbstractC18007e.startapp(c0115e, 24), 0L, c13770e5, 440, 8);
                            c13770e5.Signature(true);
                        } finally {
                        }
                    } finally {
                    }
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 6:
                C10743e c10743e = (C10743e) obj5;
                C18055e c18055e = (C18055e) obj;
                C13770e c13770e6 = (C13770e) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= c13770e6.purchase(c18055e) ? 4 : 2;
                }
                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 19) != 18)) {
                    AbstractC7763e.vip(c18055e, c10743e, "_synth", null, false, null, AbstractC1328e.vip, c13770e6, (intValue6 & 14) | 1597824, 20);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 7:
                C14609e c14609e = (C14609e) obj5;
                InterfaceC10799e interfaceC10799e2 = (InterfaceC10799e) obj;
                C13770e c13770e7 = (C13770e) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= c13770e7.purchase(interfaceC10799e2) ? 4 : 2;
                }
                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 19) != 18)) {
                    byte b = 0;
                    AbstractC6401e.ad(interfaceC10799e2, AbstractC16653e.license(1112844838, new C11528e(c14609e, r14, b), c13770e7), AbstractC16653e.license(1771227717, new C11528e(c14609e, 3, b), c13770e7), c13770e7, (intValue7 & 14) | 432);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case 8:
                C8510e c8510e = (C8510e) obj5;
                C13770e c13770e8 = (C13770e) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 17) != 16)) {
                    InterfaceC3314e appmetrica3 = AbstractC4628e.appmetrica(c8510e.f17307e, c8510e.f27449e, c13770e8);
                    Iterator it = EnumC9603e.f19050e.iterator();
                    while (it.hasNext()) {
                        EnumC9603e enumC9603e = (EnumC9603e) it.next();
                        C2892e license = AbstractC16653e.license(1596059534, new C14261e(enumC9603e, 0), c13770e8);
                        boolean yandex2 = c13770e8.yandex(c8510e) | c13770e8.license(enumC9603e.ordinal());
                        Object m3681throw2 = c13770e8.m3681throw();
                        if (yandex2 || m3681throw2 == c5170e) {
                            m3681throw2 = new C1708e(c8510e, enumC9603e, 26);
                            c13770e8.m3682throws(m3681throw2);
                        }
                        AbstractC4709e.vip(license, (Function0) m3681throw2, null, null, AbstractC16653e.license(2105657610, new C12868e(enumC9603e, appmetrica3, 0), c13770e8), false, null, null, c13770e8, 24582, 492);
                    }
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case 9:
                C6123e c6123e = (C6123e) obj5;
                C13770e c13770e9 = (C13770e) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                if (c13770e9.m3673protected(intValue9 & 1, (intValue9 & 17) != 16)) {
                    String str = c6123e.ad.crashlytics;
                    if (str == null) {
                        str = BuildConfig.FLAVOR;
                    }
                    AbstractC14489e.vip(str, AbstractC12220e.smaato(c0115e, 16, 0.0f, 2), ((C7019e) c13770e9.adcel(AbstractC11785e.ad)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e9, 48, 0, 262136);
                } else {
                    c13770e9.m3659default();
                }
                return Unit.INSTANCE;
            case 10:
                C9013e c9013e = (C9013e) obj5;
                C13770e c13770e10 = (C13770e) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                if (c13770e10.m3673protected(intValue10 & 1, (intValue10 & 17) != 16)) {
                    InterfaceC12864e metrica2 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex3 = c13770e10.yandex(c9013e);
                    Object m3681throw3 = c13770e10.m3681throw();
                    if (yandex3 || m3681throw3 == c5170e) {
                        m3681throw3 = new C13465e(i2, c9013e);
                        c13770e10.m3682throws(m3681throw3);
                    }
                    AbstractC16429e.ad(AbstractC16519e.license, AbstractC9546e.license(metrica2, false, null, (Function0) m3681throw3, 15), null, null, null, null, null, 0.0f, 0.0f, c13770e10, 6, 508);
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
            case 11:
                C4837e c4837e = (C4837e) obj5;
                C13770e c13770e11 = (C13770e) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                boolean z2 = (intValue11 & 17) != 16;
                AbstractC7919e abstractC7919e = c13770e11.ad;
                if (c13770e11.m3673protected(intValue11 & 1, z2)) {
                    C4789e ad4 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e11, 0);
                    long j4 = c13770e11.f27286case;
                    int i9 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC3483e advert4 = c13770e11.advert();
                    InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e11, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e4 = C2721e.vip;
                    c13770e11.m3666import();
                    if (c13770e11.f27292implements) {
                        c13770e11.mopub(c7309e4);
                    } else {
                        c13770e11.m3684volatile();
                    }
                    C14865e c14865e = C2721e.billing;
                    AbstractC2270e.yandex(c13770e11, ad4, c14865e);
                    C14865e c14865e2 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e11, advert4, c14865e2);
                    Integer valueOf = Integer.valueOf(i9);
                    C14865e c14865e3 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e11, valueOf, c14865e3);
                    C5430e c5430e = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e11, c5430e);
                    C14865e c14865e4 = C2721e.license;
                    AbstractC2270e.yandex(c13770e11, purchase5, c14865e4);
                    Unit unit2 = Unit.INSTANCE;
                    boolean yandex4 = c13770e11.yandex(c4837e);
                    Object m3681throw4 = c13770e11.m3681throw();
                    if (yandex4 || m3681throw4 == c5170e) {
                        m3681throw4 = new C18474e(c4837e, interfaceC5083e, r14);
                        c13770e11.m3682throws(m3681throw4);
                    }
                    AbstractC17680e.license(c13770e11, unit2, (Function2) m3681throw4);
                    InterfaceC12864e mopub = AbstractC12220e.mopub(AbstractC18007e.metrica(c0115e, 1.0f), 16);
                    InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11700e, false);
                    long j5 = c13770e11.f27286case;
                    int i10 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC3483e advert5 = c13770e11.advert();
                    InterfaceC12864e purchase6 = AbstractC5679e.purchase(c13770e11, mopub);
                    c13770e11.m3666import();
                    if (c13770e11.f27292implements) {
                        c13770e11.mopub(c7309e4);
                    } else {
                        c13770e11.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e11, license2, c14865e);
                    AbstractC2270e.yandex(c13770e11, advert5, c14865e2);
                    AbstractC8703e.premium(i10, c13770e11, c14865e3, c13770e11, c5430e);
                    AbstractC2270e.yandex(c13770e11, purchase6, c14865e4);
                    AbstractC6232e.vip(null, 0L, null, c13770e11, 0, 7);
                    c13770e11.Signature(true);
                    c13770e11.Signature(true);
                } else {
                    c13770e11.m3659default();
                }
                return Unit.INSTANCE;
            case 12:
                final C2462e c2462e = (C2462e) obj5;
                C13770e c13770e12 = (C13770e) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                if (c13770e12.m3673protected(intValue12 & 1, (intValue12 & 17) != 16)) {
                    float f = AbstractC11992e.ad;
                    long j6 = C3618e.startapp;
                    C15492e c15492e = AbstractC11785e.ad;
                    C8872e vip = AbstractC11992e.vip(j6, ((C7019e) c13770e12.adcel(c15492e)).ad.ad, c13770e12, 16777206);
                    InterfaceC12864e metrica3 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex5 = c13770e12.yandex(c2462e);
                    Object m3681throw5 = c13770e12.m3681throw();
                    if (yandex5 || m3681throw5 == c5170e) {
                        r9 = 0;
                        final boolean z3 = false ? 1 : 0;
                        m3681throw5 = new Function0() { // from class: eِٖٓ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (z3) {
                                    case 0:
                                        C2462e c2462e2 = c2462e;
                                        c2462e2.f6299e.invoke();
                                        c2462e2.purchase();
                                        return Unit.INSTANCE;
                                    default:
                                        C2462e c2462e3 = c2462e;
                                        c2462e3.f6300e.invoke();
                                        c2462e3.purchase();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e12.m3682throws(m3681throw5);
                    } else {
                        r9 = 0;
                    }
                    AbstractC16429e.ad(AbstractC12442e.ad, AbstractC9546e.license(metrica3, r9, null, (Function0) m3681throw5, 15), null, null, AbstractC12442e.vip, AbstractC16653e.license(-453533384, new C5150e(c2462e, r14, r9), c13770e12), vip, 0.0f, 0.0f, c13770e12, 221190, 396);
                    AbstractC8141e.vip(null, 0.0f, 0L, c13770e12, 0, 7);
                    C8872e vip2 = AbstractC11992e.vip(j6, ((C7019e) c13770e12.adcel(c15492e)).ad.ad, c13770e12, 16777206);
                    InterfaceC12864e metrica4 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex6 = c13770e12.yandex(c2462e);
                    Object m3681throw6 = c13770e12.m3681throw();
                    if (yandex6 || m3681throw6 == c5170e) {
                        final int i11 = 1;
                        m3681throw6 = new Function0() { // from class: eِٖٓ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        C2462e c2462e2 = c2462e;
                                        c2462e2.f6299e.invoke();
                                        c2462e2.purchase();
                                        return Unit.INSTANCE;
                                    default:
                                        C2462e c2462e3 = c2462e;
                                        c2462e3.f6300e.invoke();
                                        c2462e3.purchase();
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e12.m3682throws(m3681throw6);
                    }
                    AbstractC16429e.ad(AbstractC12442e.metrica, AbstractC9546e.license(metrica4, false, null, (Function0) m3681throw6, 15), null, null, AbstractC12442e.license, AbstractC16653e.license(1663316143, new C5150e(c2462e, 3, (byte) 0), c13770e12), vip2, 0.0f, 0.0f, c13770e12, 221190, 396);
                    c13770e12.m3676strictfp(2033622157);
                    c13770e12.Signature(false);
                } else {
                    c13770e12.m3659default();
                }
                return Unit.INSTANCE;
            case 13:
                final C17247e c17247e = (C17247e) obj5;
                C13770e c13770e13 = (C13770e) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                if (c13770e13.m3673protected(intValue13 & 1, (intValue13 & 17) != 16)) {
                    InterfaceC12864e metrica5 = AbstractC18007e.metrica(c0115e, 1.0f);
                    float f2 = AbstractC11992e.ad;
                    C15492e c15492e2 = AbstractC11785e.ad;
                    float f3 = 4;
                    final int i12 = 0;
                    AbstractC16429e.ad(AbstractC16653e.license(-1160224133, new Function2() { // from class: eًَؖ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            C9122e c9122e2;
                            int appmetrica4;
                            int i13 = i12;
                            String str2 = BuildConfig.FLAVOR;
                            C17247e c17247e2 = c17247e;
                            switch (i13) {
                                case 0:
                                    C13770e c13770e14 = (C13770e) obj6;
                                    int intValue14 = ((Integer) obj7).intValue();
                                    if (c13770e14.m3673protected(intValue14 & 1, (intValue14 & 3) != 2)) {
                                        c13770e14.m3676strictfp(1716107589);
                                        c9122e2 = new C9122e();
                                        c9122e2.metrica(c17247e2.ad.vip.purchase);
                                        c9122e2.metrica(" ");
                                        appmetrica4 = c9122e2.appmetrica(new C4282e(((C7019e) c13770e14.adcel(AbstractC11785e.ad)).ad.remoteconfig, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                                        try {
                                            c9122e2.metrica(c17247e2.ad.license);
                                            Unit unit3 = Unit.INSTANCE;
                                            c9122e2.license(appmetrica4);
                                            C10566e purchase7 = c9122e2.purchase();
                                            c13770e14.Signature(false);
                                            AbstractC14489e.metrica(purchase7, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, null, c13770e14, 0, 0, 524286);
                                        } finally {
                                        }
                                    } else {
                                        c13770e14.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    C13770e c13770e15 = (C13770e) obj6;
                                    int intValue15 = ((Integer) obj7).intValue();
                                    if (c13770e15.m3673protected(intValue15 & 1, (intValue15 & 3) != 2)) {
                                        String str3 = c17247e2.ad.metrica.yandex;
                                        if (str3 == null) {
                                            str3 = BuildConfig.FLAVOR;
                                        }
                                        AbstractC14489e.vip(str3, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e15, 0, 0, 262142);
                                    } else {
                                        c13770e15.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    C13770e c13770e16 = (C13770e) obj6;
                                    int intValue16 = ((Integer) obj7).intValue();
                                    if (c13770e16.m3673protected(1 & intValue16, (intValue16 & 3) != 2)) {
                                        c13770e16.m3676strictfp(-995147884);
                                        c9122e2 = new C9122e();
                                        String str4 = c17247e2.ad.metrica.purchase;
                                        if (str4 == null) {
                                            str4 = BuildConfig.FLAVOR;
                                        }
                                        c9122e2.metrica(str4);
                                        c9122e2.metrica(" ");
                                        appmetrica4 = c9122e2.appmetrica(new C4282e(((C7019e) c13770e16.adcel(AbstractC11785e.ad)).ad.remoteconfig, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                                        try {
                                            String str5 = c17247e2.ad.metrica.appmetrica;
                                            if (str5 != null) {
                                                str2 = str5;
                                            }
                                            c9122e2.metrica(str2);
                                            Unit unit4 = Unit.INSTANCE;
                                            c9122e2.license(appmetrica4);
                                            C10566e purchase8 = c9122e2.purchase();
                                            c13770e16.Signature(false);
                                            AbstractC14489e.metrica(purchase8, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, null, c13770e16, 0, 0, 524286);
                                        } finally {
                                        }
                                    } else {
                                        c13770e16.m3659default();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, c13770e13), metrica5, AbstractC8439e.Signature, null, AbstractC8439e.admob, null, AbstractC11992e.ad(AbstractC7893e.billing(((C7019e) c13770e13.adcel(c15492e2)).ad, f3), 0L, 0L, 0L, c13770e13, 510), 0.0f, 0.0f, c13770e13, 25014, 424);
                    AbstractC8141e.vip(null, 0.0f, 0L, c13770e13, 0, 7);
                    final int i13 = 1;
                    AbstractC16429e.ad(AbstractC16653e.license(-1247429774, new Function2() { // from class: eًَؖ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            C9122e c9122e2;
                            int appmetrica4;
                            int i132 = i13;
                            String str2 = BuildConfig.FLAVOR;
                            C17247e c17247e2 = c17247e;
                            switch (i132) {
                                case 0:
                                    C13770e c13770e14 = (C13770e) obj6;
                                    int intValue14 = ((Integer) obj7).intValue();
                                    if (c13770e14.m3673protected(intValue14 & 1, (intValue14 & 3) != 2)) {
                                        c13770e14.m3676strictfp(1716107589);
                                        c9122e2 = new C9122e();
                                        c9122e2.metrica(c17247e2.ad.vip.purchase);
                                        c9122e2.metrica(" ");
                                        appmetrica4 = c9122e2.appmetrica(new C4282e(((C7019e) c13770e14.adcel(AbstractC11785e.ad)).ad.remoteconfig, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                                        try {
                                            c9122e2.metrica(c17247e2.ad.license);
                                            Unit unit3 = Unit.INSTANCE;
                                            c9122e2.license(appmetrica4);
                                            C10566e purchase7 = c9122e2.purchase();
                                            c13770e14.Signature(false);
                                            AbstractC14489e.metrica(purchase7, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, null, c13770e14, 0, 0, 524286);
                                        } finally {
                                        }
                                    } else {
                                        c13770e14.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    C13770e c13770e15 = (C13770e) obj6;
                                    int intValue15 = ((Integer) obj7).intValue();
                                    if (c13770e15.m3673protected(intValue15 & 1, (intValue15 & 3) != 2)) {
                                        String str3 = c17247e2.ad.metrica.yandex;
                                        if (str3 == null) {
                                            str3 = BuildConfig.FLAVOR;
                                        }
                                        AbstractC14489e.vip(str3, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e15, 0, 0, 262142);
                                    } else {
                                        c13770e15.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    C13770e c13770e16 = (C13770e) obj6;
                                    int intValue16 = ((Integer) obj7).intValue();
                                    if (c13770e16.m3673protected(1 & intValue16, (intValue16 & 3) != 2)) {
                                        c13770e16.m3676strictfp(-995147884);
                                        c9122e2 = new C9122e();
                                        String str4 = c17247e2.ad.metrica.purchase;
                                        if (str4 == null) {
                                            str4 = BuildConfig.FLAVOR;
                                        }
                                        c9122e2.metrica(str4);
                                        c9122e2.metrica(" ");
                                        appmetrica4 = c9122e2.appmetrica(new C4282e(((C7019e) c13770e16.adcel(AbstractC11785e.ad)).ad.remoteconfig, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                                        try {
                                            String str5 = c17247e2.ad.metrica.appmetrica;
                                            if (str5 != null) {
                                                str2 = str5;
                                            }
                                            c9122e2.metrica(str2);
                                            Unit unit4 = Unit.INSTANCE;
                                            c9122e2.license(appmetrica4);
                                            C10566e purchase8 = c9122e2.purchase();
                                            c13770e16.Signature(false);
                                            AbstractC14489e.metrica(purchase8, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, null, c13770e16, 0, 0, 524286);
                                        } finally {
                                        }
                                    } else {
                                        c13770e16.m3659default();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, c13770e13), AbstractC18007e.metrica(c0115e, 1.0f), AbstractC8439e.subscription, null, AbstractC8439e.remoteconfig, null, AbstractC11992e.ad(AbstractC7893e.billing(((C7019e) c13770e13.adcel(c15492e2)).ad, f3), 0L, 0L, 0L, c13770e13, 510), 0.0f, 0.0f, c13770e13, 25014, 424);
                    AbstractC8141e.vip(null, 0.0f, 0L, c13770e13, 0, 7);
                    AbstractC16429e.ad(AbstractC16653e.license(1183320691, new Function2() { // from class: eًَؖ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            C9122e c9122e2;
                            int appmetrica4;
                            int i132 = r2;
                            String str2 = BuildConfig.FLAVOR;
                            C17247e c17247e2 = c17247e;
                            switch (i132) {
                                case 0:
                                    C13770e c13770e14 = (C13770e) obj6;
                                    int intValue14 = ((Integer) obj7).intValue();
                                    if (c13770e14.m3673protected(intValue14 & 1, (intValue14 & 3) != 2)) {
                                        c13770e14.m3676strictfp(1716107589);
                                        c9122e2 = new C9122e();
                                        c9122e2.metrica(c17247e2.ad.vip.purchase);
                                        c9122e2.metrica(" ");
                                        appmetrica4 = c9122e2.appmetrica(new C4282e(((C7019e) c13770e14.adcel(AbstractC11785e.ad)).ad.remoteconfig, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                                        try {
                                            c9122e2.metrica(c17247e2.ad.license);
                                            Unit unit3 = Unit.INSTANCE;
                                            c9122e2.license(appmetrica4);
                                            C10566e purchase7 = c9122e2.purchase();
                                            c13770e14.Signature(false);
                                            AbstractC14489e.metrica(purchase7, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, null, c13770e14, 0, 0, 524286);
                                        } finally {
                                        }
                                    } else {
                                        c13770e14.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    C13770e c13770e15 = (C13770e) obj6;
                                    int intValue15 = ((Integer) obj7).intValue();
                                    if (c13770e15.m3673protected(intValue15 & 1, (intValue15 & 3) != 2)) {
                                        String str3 = c17247e2.ad.metrica.yandex;
                                        if (str3 == null) {
                                            str3 = BuildConfig.FLAVOR;
                                        }
                                        AbstractC14489e.vip(str3, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e15, 0, 0, 262142);
                                    } else {
                                        c13770e15.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    C13770e c13770e16 = (C13770e) obj6;
                                    int intValue16 = ((Integer) obj7).intValue();
                                    if (c13770e16.m3673protected(1 & intValue16, (intValue16 & 3) != 2)) {
                                        c13770e16.m3676strictfp(-995147884);
                                        c9122e2 = new C9122e();
                                        String str4 = c17247e2.ad.metrica.purchase;
                                        if (str4 == null) {
                                            str4 = BuildConfig.FLAVOR;
                                        }
                                        c9122e2.metrica(str4);
                                        c9122e2.metrica(" ");
                                        appmetrica4 = c9122e2.appmetrica(new C4282e(((C7019e) c13770e16.adcel(AbstractC11785e.ad)).ad.remoteconfig, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                                        try {
                                            String str5 = c17247e2.ad.metrica.appmetrica;
                                            if (str5 != null) {
                                                str2 = str5;
                                            }
                                            c9122e2.metrica(str2);
                                            Unit unit4 = Unit.INSTANCE;
                                            c9122e2.license(appmetrica4);
                                            C10566e purchase8 = c9122e2.purchase();
                                            c13770e16.Signature(false);
                                            AbstractC14489e.metrica(purchase8, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, null, c13770e16, 0, 0, 524286);
                                        } finally {
                                        }
                                    } else {
                                        c13770e16.m3659default();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, c13770e13), AbstractC18007e.metrica(c0115e, 1.0f), AbstractC8439e.pro, null, AbstractC8439e.signatures, null, AbstractC11992e.ad(AbstractC7893e.billing(((C7019e) c13770e13.adcel(c15492e2)).ad, f3), 0L, 0L, 0L, c13770e13, 510), 0.0f, 0.0f, c13770e13, 25014, 424);
                } else {
                    c13770e13.m3659default();
                }
                return Unit.INSTANCE;
            case 14:
                final C2644e c2644e = (C2644e) obj5;
                C13770e c13770e14 = (C13770e) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                if (c13770e14.m3673protected(intValue14 & 1, (intValue14 & 17) != 16)) {
                    InterfaceC12864e metrica6 = AbstractC18007e.metrica(c0115e, 1.0f);
                    float f4 = AbstractC11992e.ad;
                    C15492e c15492e3 = AbstractC11785e.ad;
                    float f5 = 4;
                    final int i14 = 0;
                    AbstractC16429e.ad(AbstractC16653e.license(795041123, new Function2() { // from class: eَُؕ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            int i15 = i14;
                            C2644e c2644e2 = c2644e;
                            switch (i15) {
                                case 0:
                                    C13770e c13770e15 = (C13770e) obj6;
                                    int intValue15 = ((Integer) obj7).intValue();
                                    if (c13770e15.m3673protected(1 & intValue15, (intValue15 & 3) != 2)) {
                                        c13770e15.m3676strictfp(-469657084);
                                        C9122e c9122e2 = new C9122e();
                                        c9122e2.metrica("VK X");
                                        c9122e2.metrica(" ");
                                        c9122e2.metrica(c2644e2.vip.f18783e);
                                        c9122e2.metrica(" ");
                                        int appmetrica4 = c9122e2.appmetrica(new C4282e(((C7019e) c13770e15.adcel(AbstractC11785e.ad)).ad.remoteconfig, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                                        try {
                                            c9122e2.metrica(String.valueOf(c2644e2.vip.f18782e));
                                            Unit unit3 = Unit.INSTANCE;
                                            c9122e2.license(appmetrica4);
                                            C10566e purchase7 = c9122e2.purchase();
                                            c13770e15.Signature(false);
                                            AbstractC14489e.metrica(purchase7, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, null, c13770e15, 0, 0, 524286);
                                        } catch (Throwable th) {
                                            c9122e2.license(appmetrica4);
                                            throw th;
                                        }
                                    } else {
                                        c13770e15.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    C13770e c13770e16 = (C13770e) obj6;
                                    int intValue16 = ((Integer) obj7).intValue();
                                    if (c13770e16.m3673protected(intValue16 & 1, (intValue16 & 3) != 2)) {
                                        AbstractC14489e.vip(c2644e2.vip.f18781e, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e16, 0, 0, 262142);
                                    } else {
                                        c13770e16.m3659default();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, c13770e14), metrica6, AbstractC8439e.inmobi, null, AbstractC8439e.isPro, null, AbstractC11992e.ad(AbstractC7893e.billing(((C7019e) c13770e14.adcel(c15492e3)).ad, f5), 0L, 0L, 0L, c13770e14, 510), 0.0f, 0.0f, c13770e14, 25014, 424);
                    AbstractC8141e.vip(null, 0.0f, 0L, c13770e14, 0, 7);
                    final int i15 = 1;
                    AbstractC16429e.ad(AbstractC16653e.license(-146395366, new Function2() { // from class: eَُؕ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            int i152 = i15;
                            C2644e c2644e2 = c2644e;
                            switch (i152) {
                                case 0:
                                    C13770e c13770e15 = (C13770e) obj6;
                                    int intValue15 = ((Integer) obj7).intValue();
                                    if (c13770e15.m3673protected(1 & intValue15, (intValue15 & 3) != 2)) {
                                        c13770e15.m3676strictfp(-469657084);
                                        C9122e c9122e2 = new C9122e();
                                        c9122e2.metrica("VK X");
                                        c9122e2.metrica(" ");
                                        c9122e2.metrica(c2644e2.vip.f18783e);
                                        c9122e2.metrica(" ");
                                        int appmetrica4 = c9122e2.appmetrica(new C4282e(((C7019e) c13770e15.adcel(AbstractC11785e.ad)).ad.remoteconfig, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                                        try {
                                            c9122e2.metrica(String.valueOf(c2644e2.vip.f18782e));
                                            Unit unit3 = Unit.INSTANCE;
                                            c9122e2.license(appmetrica4);
                                            C10566e purchase7 = c9122e2.purchase();
                                            c13770e15.Signature(false);
                                            AbstractC14489e.metrica(purchase7, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, null, c13770e15, 0, 0, 524286);
                                        } catch (Throwable th) {
                                            c9122e2.license(appmetrica4);
                                            throw th;
                                        }
                                    } else {
                                        c13770e15.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    C13770e c13770e16 = (C13770e) obj6;
                                    int intValue16 = ((Integer) obj7).intValue();
                                    if (c13770e16.m3673protected(intValue16 & 1, (intValue16 & 3) != 2)) {
                                        AbstractC14489e.vip(c2644e2.vip.f18781e, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e16, 0, 0, 262142);
                                    } else {
                                        c13770e16.m3659default();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, c13770e14), AbstractC18007e.metrica(c0115e, 1.0f), AbstractC8439e.applovin, null, AbstractC8439e.ads, null, AbstractC11992e.ad(AbstractC7893e.billing(((C7019e) c13770e14.adcel(c15492e3)).ad, f5), 0L, 0L, 0L, c13770e14, 510), 0.0f, 0.0f, c13770e14, 25014, 424);
                } else {
                    c13770e14.m3659default();
                }
                return Unit.INSTANCE;
            case 15:
                C12316e c12316e = (C12316e) obj5;
                C13770e c13770e15 = (C13770e) obj2;
                ((Integer) obj3).getClass();
                float f6 = ((Configuration) c13770e15.adcel(AbstractC2676e.ad)).screenHeightDp * 0.6666667f;
                C15765e c15765e = new C15765e(AbstractC6251e.ad);
                C15765e c15765e2 = new C15765e(f6);
                if (c15765e.compareTo(c15765e2) > 0) {
                    c15765e = c15765e2;
                }
                InterfaceC12864e appmetrica4 = AbstractC18007e.appmetrica(c0115e, c15765e.f31051e, f6);
                C4789e ad5 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e15, 0);
                long j7 = c13770e15.f27286case;
                int i16 = (int) (j7 ^ (j7 >>> 32));
                InterfaceC3483e advert6 = c13770e15.advert();
                InterfaceC12864e purchase7 = AbstractC5679e.purchase(c13770e15, appmetrica4);
                InterfaceC5685e.mopub.getClass();
                C7309e c7309e5 = C2721e.vip;
                c13770e15.m3666import();
                if (c13770e15.f27292implements) {
                    c13770e15.mopub(c7309e5);
                } else {
                    c13770e15.m3684volatile();
                }
                AbstractC2270e.yandex(c13770e15, ad5, C2721e.billing);
                AbstractC2270e.yandex(c13770e15, advert6, C2721e.purchase);
                AbstractC2270e.yandex(c13770e15, Integer.valueOf(i16), C2721e.adcel);
                AbstractC2270e.purchase(c13770e15, C2721e.mopub);
                AbstractC2270e.yandex(c13770e15, purchase7, C2721e.license);
                AbstractC8141e.vip(null, 0.0f, c12316e.vip, c13770e15, 0, 3);
                AbstractC17751e.vip.invoke(C0283e.ad, c13770e15, 6);
                c13770e15.Signature(true);
                return Unit.INSTANCE;
            case 16:
                C4034e c4034e = (C4034e) obj5;
                InterfaceC12864e interfaceC12864e = (InterfaceC12864e) obj;
                C13770e c13770e16 = (C13770e) obj2;
                ((Integer) obj3).getClass();
                c13770e16.m3676strictfp(-1914520728);
                InterfaceC14388e interfaceC14388e = (InterfaceC14388e) c13770e16.adcel(AbstractC11473e.yandex);
                Object m3681throw7 = c13770e16.m3681throw();
                Object obj6 = m3681throw7;
                if (m3681throw7 == c5170e) {
                    C0576e startapp = AbstractC14533e.startapp(new C12729e(0L));
                    c13770e16.m3682throws(startapp);
                    obj6 = startapp;
                }
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj6;
                boolean yandex7 = c13770e16.yandex(c4034e);
                Object m3681throw8 = c13770e16.m3681throw();
                Object obj7 = m3681throw8;
                if (yandex7 || m3681throw8 == c5170e) {
                    C5565e c5565e = new C5565e(c4034e, interfaceC3314e, i2);
                    c13770e16.m3682throws(c5565e);
                    obj7 = c5565e;
                }
                Function0 function0 = (Function0) obj7;
                boolean purchase8 = c13770e16.purchase(interfaceC14388e);
                Object m3681throw9 = c13770e16.m3681throw();
                if (purchase8 || m3681throw9 == c5170e) {
                    z = false;
                    C9104e c9104e = new C9104e(interfaceC14388e, interfaceC3314e, false ? 1 : 0);
                    c13770e16.m3682throws(c9104e);
                    obj4 = c9104e;
                } else {
                    z = false;
                    obj4 = m3681throw9;
                }
                C14443e c14443e = AbstractC1236e.ad;
                InterfaceC12864e metrica7 = AbstractC5679e.metrica(interfaceC12864e, new C11828e(function0, (Function1) obj4, 11));
                c13770e16.Signature(z);
                return metrica7;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C17663e) obj5).metrica();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C0073e c0073e = (C0073e) obj5;
                C13770e c13770e17 = (C13770e) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                boolean z4 = (intValue15 & 17) != 16;
                AbstractC7919e abstractC7919e2 = c13770e17.ad;
                if (c13770e17.m3673protected(intValue15 & 1, z4)) {
                    C4789e ad6 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e17, 0);
                    long j8 = c13770e17.f27286case;
                    int i17 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC3483e advert7 = c13770e17.advert();
                    InterfaceC12864e purchase9 = AbstractC5679e.purchase(c13770e17, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e6 = C2721e.vip;
                    c13770e17.m3666import();
                    if (c13770e17.f27292implements) {
                        c13770e17.mopub(c7309e6);
                    } else {
                        c13770e17.m3684volatile();
                    }
                    C14865e c14865e5 = C2721e.billing;
                    AbstractC2270e.yandex(c13770e17, ad6, c14865e5);
                    C14865e c14865e6 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e17, advert7, c14865e6);
                    Integer valueOf2 = Integer.valueOf(i17);
                    C14865e c14865e7 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e17, valueOf2, c14865e7);
                    C5430e c5430e2 = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e17, c5430e2);
                    C14865e c14865e8 = C2721e.license;
                    AbstractC2270e.yandex(c13770e17, purchase9, c14865e8);
                    Unit unit3 = Unit.INSTANCE;
                    boolean yandex8 = c13770e17.yandex(c0073e);
                    Object m3681throw10 = c13770e17.m3681throw();
                    if (yandex8 || m3681throw10 == c5170e) {
                        m3681throw10 = new C18474e(c0073e, interfaceC5083e, 12);
                        c13770e17.m3682throws(m3681throw10);
                    }
                    AbstractC17680e.license(c13770e17, unit3, (Function2) m3681throw10);
                    InterfaceC12864e mopub2 = AbstractC12220e.mopub(AbstractC18007e.metrica(c0115e, 1.0f), 16);
                    InterfaceC2747e license3 = AbstractC17074e.license(C5438e.f11700e, false);
                    long j9 = c13770e17.f27286case;
                    int i18 = (int) (j9 ^ (j9 >>> 32));
                    InterfaceC3483e advert8 = c13770e17.advert();
                    InterfaceC12864e purchase10 = AbstractC5679e.purchase(c13770e17, mopub2);
                    c13770e17.m3666import();
                    if (c13770e17.f27292implements) {
                        c13770e17.mopub(c7309e6);
                    } else {
                        c13770e17.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e17, license3, c14865e5);
                    AbstractC2270e.yandex(c13770e17, advert8, c14865e6);
                    AbstractC8703e.premium(i18, c13770e17, c14865e7, c13770e17, c5430e2);
                    AbstractC2270e.yandex(c13770e17, purchase10, c14865e8);
                    AbstractC6232e.vip(null, 0L, null, c13770e17, 0, 7);
                    c13770e17.Signature(true);
                    c13770e17.Signature(true);
                } else {
                    c13770e17.m3659default();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ad(obj, obj2, obj3);
            case 20:
                C2357e c2357e = (C2357e) obj5;
                C13770e c13770e18 = (C13770e) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                if (c13770e18.m3673protected(intValue16 & 1, (intValue16 & 17) != 16)) {
                    C2892e license4 = AbstractC16653e.license(-280394773, new C11930e(c2357e, i3), c13770e18);
                    float f7 = AbstractC11992e.ad;
                    AbstractC16429e.ad(AbstractC0718e.yandex, null, null, license4, null, AbstractC0718e.startapp, AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e18, 510), 0.0f, 0.0f, c13770e18, 199686, 406);
                } else {
                    c13770e18.m3659default();
                }
                return Unit.INSTANCE;
            case 21:
                return vip(obj, obj2, obj3);
            case 22:
                return license(obj, obj2, obj3);
            case 23:
                return purchase(obj, obj2, obj3);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return billing(obj, obj2, obj3);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return startapp(obj, obj2, obj3);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return adcel(obj, obj2, obj3);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return mopub(obj, obj2, obj3);
            default:
                C2243e c2243e = (C2243e) obj5;
                C13770e c13770e19 = (C13770e) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                int i19 = VkxTvEntrypoint.f36765e;
                if (c13770e19.m3673protected(intValue17 & 1, (intValue17 & 17) != 16)) {
                    AbstractC2003e.vip(c2243e.appmetrica, null, AbstractC11263e.ad, c13770e19, 3072, 6);
                } else {
                    c13770e19.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
