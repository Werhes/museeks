package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؓؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2329e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f5844e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f5845e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f5846e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f5847e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5848e;

    public /* synthetic */ C2329e(int i, InterfaceC3314e interfaceC3314e, C15318e c15318e, InterfaceC3314e interfaceC3314e2) {
        this.f5848e = 0;
        this.f5846e = i;
        this.f5845e = interfaceC3314e;
        this.f5844e = c15318e;
        this.f5847e = interfaceC3314e2;
    }

    public /* synthetic */ C2329e(C13477e c13477e, int i, Function1 function1, C6260e c6260e) {
        this.f5848e = 5;
        this.f5845e = c13477e;
        this.f5846e = i;
        this.f5847e = function1;
        this.f5844e = c6260e;
    }

    public /* synthetic */ C2329e(C14056e c14056e, Function1 function1, int i, Function0 function0) {
        this.f5848e = 2;
        this.f5845e = c14056e;
        this.f5847e = function1;
        this.f5846e = i;
        this.f5844e = function0;
    }

    public /* synthetic */ C2329e(InterfaceC16132e interfaceC16132e, C14197e c14197e, int i, InterfaceC16132e interfaceC16132e2) {
        this.f5848e = 3;
        this.f5845e = interfaceC16132e;
        this.f5844e = c14197e;
        this.f5846e = i;
        this.f5847e = interfaceC16132e2;
    }

    public /* synthetic */ C2329e(Object obj, Object obj2, int i, InterfaceC16132e interfaceC16132e, int i2) {
        this.f5848e = i2;
        this.f5847e = obj;
        this.f5844e = obj2;
        this.f5846e = i;
        this.f5845e = interfaceC16132e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f5848e) {
            case 0:
                InterfaceC16132e interfaceC16132e = (InterfaceC16132e) this.f5845e;
                C15318e c15318e = (C15318e) this.f5844e;
                InterfaceC16132e interfaceC16132e2 = (InterfaceC16132e) this.f5847e;
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    InterfaceC0804e interfaceC0804e = (InterfaceC0804e) interfaceC16132e.getValue();
                    C7913e c7913e = AbstractC18007e.metrica;
                    int i = this.f5846e;
                    boolean license = c13770e.license(i);
                    Object m3681throw = c13770e.m3681throw();
                    if (license || m3681throw == C2987e.ad) {
                        m3681throw = new C17028e(i, 7);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC7572e.vip(interfaceC0804e, c7913e, (Function1) m3681throw, null, BuildConfig.FLAVOR, null, AbstractC16653e.license(-236359499, new C5270e(0, interfaceC12123e, c15318e, interfaceC16132e2), c13770e), c13770e, 1597488, 40);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC2566e interfaceC2566e = (InterfaceC2566e) this.f5847e;
                C16869e c16869e = (C16869e) this.f5844e;
                InterfaceC16132e interfaceC16132e3 = (InterfaceC16132e) this.f5845e;
                InterfaceC12123e interfaceC12123e2 = (InterfaceC12123e) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c13770e2.purchase(interfaceC12123e2) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 19) != 18)) {
                    InterfaceC12864e license2 = AbstractC14783e.license(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e2), interfaceC2566e.ad(), null);
                    boolean yandex = c13770e2.yandex(c16869e);
                    int i2 = this.f5846e;
                    boolean license3 = yandex | c13770e2.license(i2) | c13770e2.purchase(interfaceC16132e3);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (license3 || m3681throw2 == C2987e.ad) {
                        m3681throw2 = new C16202e(c16869e, i2, interfaceC16132e3, 6);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC7023e.ad(license2, null, null, null, null, null, false, null, (Function1) m3681throw2, c13770e2, 0, 510);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                final C14056e c14056e = (C14056e) this.f5845e;
                final Function1 function1 = (Function1) this.f5847e;
                Function0 function0 = (Function0) this.f5844e;
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                    C0115e c0115e = C0115e.f1276e;
                    InterfaceC12864e mopub = AbstractC12220e.mopub(AbstractC18007e.metrica(c0115e, 1.0f), 16);
                    InterfaceC2747e license4 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j = c13770e3.f27286case;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e3.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e3, mopub);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e3.m3666import();
                    if (c13770e3.f27292implements) {
                        c13770e3.mopub(c7309e);
                    } else {
                        c13770e3.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e3, license4, C2721e.billing);
                    AbstractC2270e.yandex(c13770e3, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e3, Integer.valueOf(i3), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e3, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e3, purchase, C2721e.license);
                    String admob = AbstractC1786e.admob(this.f5846e, "Band #");
                    C10156e c10156e = C5438e.f11666e;
                    C14486e c14486e = C14486e.ad;
                    AbstractC14489e.vip(admob, c14486e.ad(c0115e, c10156e), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262140);
                    AbstractC0014e.metrica(function0, c14486e.ad(c0115e, C5438e.f11699e), false, null, null, null, AbstractC15920e.startapp, c13770e3, 1572864, 60);
                    c13770e3.Signature(true);
                    AbstractC8141e.vip(null, 0.0f, 0L, c13770e3, 0, 7);
                    String appmetrica = AbstractC5297e.appmetrica(c13770e3, R.string.eq3_param_cutoff);
                    float f = c14056e.f27805e;
                    String appmetrica2 = AbstractC5297e.appmetrica(c13770e3, R.string.eq3_units_hz);
                    boolean purchase2 = c13770e3.purchase(function1) | c13770e3.yandex(c14056e);
                    Object m3681throw3 = c13770e3.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    if (purchase2 || m3681throw3 == c5170e) {
                        final int i4 = 0;
                        m3681throw3 = new Function1() { // from class: eّْؓ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                Float f2 = (Float) obj4;
                                switch (i4) {
                                    case 0:
                                        function1.invoke(C14056e.vip(c14056e, f2.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 510));
                                        return Unit.INSTANCE;
                                    case 1:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, f2.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 509));
                                        return Unit.INSTANCE;
                                    case 2:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, f2.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 507));
                                        return Unit.INSTANCE;
                                    case 3:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, f2.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 503));
                                        return Unit.INSTANCE;
                                    case 4:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f2.floatValue(), 0.0f, 447));
                                        return Unit.INSTANCE;
                                    case 5:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, f2.floatValue(), 0.0f, 0.0f, 0.0f, 495));
                                        return Unit.INSTANCE;
                                    case 6:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f2.floatValue(), 0.0f, 0.0f, 479));
                                        return Unit.INSTANCE;
                                    default:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f2.floatValue(), 383));
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e3.m3682throws(m3681throw3);
                    }
                    AbstractC15077e.purchase(appmetrica, appmetrica2, f, (Function1) m3681throw3, null, c13770e3, 0);
                    String appmetrica3 = AbstractC5297e.appmetrica(c13770e3, R.string.eq3_param_attack);
                    float f2 = c14056e.f27801e;
                    String appmetrica4 = AbstractC5297e.appmetrica(c13770e3, R.string.eq3_units_ms);
                    boolean purchase3 = c13770e3.purchase(function1) | c13770e3.yandex(c14056e);
                    Object m3681throw4 = c13770e3.m3681throw();
                    if (purchase3 || m3681throw4 == c5170e) {
                        final int i5 = 1;
                        m3681throw4 = new Function1() { // from class: eّْؓ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                Float f22 = (Float) obj4;
                                switch (i5) {
                                    case 0:
                                        function1.invoke(C14056e.vip(c14056e, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 510));
                                        return Unit.INSTANCE;
                                    case 1:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 509));
                                        return Unit.INSTANCE;
                                    case 2:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 507));
                                        return Unit.INSTANCE;
                                    case 3:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 503));
                                        return Unit.INSTANCE;
                                    case 4:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 447));
                                        return Unit.INSTANCE;
                                    case 5:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 495));
                                        return Unit.INSTANCE;
                                    case 6:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 479));
                                        return Unit.INSTANCE;
                                    default:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 383));
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e3.m3682throws(m3681throw4);
                    }
                    AbstractC15077e.purchase(appmetrica3, appmetrica4, f2, (Function1) m3681throw4, null, c13770e3, 0);
                    String appmetrica5 = AbstractC5297e.appmetrica(c13770e3, R.string.eq3_param_release);
                    float f3 = c14056e.f27808e;
                    String appmetrica6 = AbstractC5297e.appmetrica(c13770e3, R.string.eq3_units_ms);
                    boolean purchase4 = c13770e3.purchase(function1) | c13770e3.yandex(c14056e);
                    Object m3681throw5 = c13770e3.m3681throw();
                    if (purchase4 || m3681throw5 == c5170e) {
                        final int i6 = 2;
                        m3681throw5 = new Function1() { // from class: eّْؓ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                Float f22 = (Float) obj4;
                                switch (i6) {
                                    case 0:
                                        function1.invoke(C14056e.vip(c14056e, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 510));
                                        return Unit.INSTANCE;
                                    case 1:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 509));
                                        return Unit.INSTANCE;
                                    case 2:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 507));
                                        return Unit.INSTANCE;
                                    case 3:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 503));
                                        return Unit.INSTANCE;
                                    case 4:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 447));
                                        return Unit.INSTANCE;
                                    case 5:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 495));
                                        return Unit.INSTANCE;
                                    case 6:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 479));
                                        return Unit.INSTANCE;
                                    default:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 383));
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e3.m3682throws(m3681throw5);
                    }
                    AbstractC15077e.purchase(appmetrica5, appmetrica6, f3, (Function1) m3681throw5, null, c13770e3, 0);
                    String appmetrica7 = AbstractC5297e.appmetrica(c13770e3, R.string.eq3_param_ratio);
                    float f4 = c14056e.f27808e;
                    boolean purchase5 = c13770e3.purchase(function1) | c13770e3.yandex(c14056e);
                    Object m3681throw6 = c13770e3.m3681throw();
                    if (purchase5 || m3681throw6 == c5170e) {
                        final int i7 = 3;
                        m3681throw6 = new Function1() { // from class: eّْؓ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                Float f22 = (Float) obj4;
                                switch (i7) {
                                    case 0:
                                        function1.invoke(C14056e.vip(c14056e, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 510));
                                        return Unit.INSTANCE;
                                    case 1:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 509));
                                        return Unit.INSTANCE;
                                    case 2:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 507));
                                        return Unit.INSTANCE;
                                    case 3:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 503));
                                        return Unit.INSTANCE;
                                    case 4:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 447));
                                        return Unit.INSTANCE;
                                    case 5:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 495));
                                        return Unit.INSTANCE;
                                    case 6:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 479));
                                        return Unit.INSTANCE;
                                    default:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 383));
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e3.m3682throws(m3681throw6);
                    }
                    AbstractC15077e.purchase(appmetrica7, BuildConfig.FLAVOR, f4, (Function1) m3681throw6, null, c13770e3, 48);
                    String appmetrica8 = AbstractC5297e.appmetrica(c13770e3, R.string.eq3_param_expander_ratio);
                    float f5 = c14056e.f27802e;
                    boolean purchase6 = c13770e3.purchase(function1) | c13770e3.yandex(c14056e);
                    Object m3681throw7 = c13770e3.m3681throw();
                    if (purchase6 || m3681throw7 == c5170e) {
                        final int i8 = 4;
                        m3681throw7 = new Function1() { // from class: eّْؓ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                Float f22 = (Float) obj4;
                                switch (i8) {
                                    case 0:
                                        function1.invoke(C14056e.vip(c14056e, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 510));
                                        return Unit.INSTANCE;
                                    case 1:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 509));
                                        return Unit.INSTANCE;
                                    case 2:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 507));
                                        return Unit.INSTANCE;
                                    case 3:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 503));
                                        return Unit.INSTANCE;
                                    case 4:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 447));
                                        return Unit.INSTANCE;
                                    case 5:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 495));
                                        return Unit.INSTANCE;
                                    case 6:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 479));
                                        return Unit.INSTANCE;
                                    default:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 383));
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e3.m3682throws(m3681throw7);
                    }
                    AbstractC15077e.purchase(appmetrica8, BuildConfig.FLAVOR, f5, (Function1) m3681throw7, null, c13770e3, 48);
                    String appmetrica9 = AbstractC5297e.appmetrica(c13770e3, R.string.eq3_param_threshold);
                    float f6 = c14056e.f27803e;
                    String appmetrica10 = AbstractC5297e.appmetrica(c13770e3, R.string.eq3_units_db);
                    boolean purchase7 = c13770e3.purchase(function1) | c13770e3.yandex(c14056e);
                    Object m3681throw8 = c13770e3.m3681throw();
                    if (purchase7 || m3681throw8 == c5170e) {
                        final int i9 = 5;
                        m3681throw8 = new Function1() { // from class: eّْؓ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                Float f22 = (Float) obj4;
                                switch (i9) {
                                    case 0:
                                        function1.invoke(C14056e.vip(c14056e, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 510));
                                        return Unit.INSTANCE;
                                    case 1:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 509));
                                        return Unit.INSTANCE;
                                    case 2:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 507));
                                        return Unit.INSTANCE;
                                    case 3:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 503));
                                        return Unit.INSTANCE;
                                    case 4:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 447));
                                        return Unit.INSTANCE;
                                    case 5:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 495));
                                        return Unit.INSTANCE;
                                    case 6:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 479));
                                        return Unit.INSTANCE;
                                    default:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 383));
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e3.m3682throws(m3681throw8);
                    }
                    AbstractC15077e.purchase(appmetrica9, appmetrica10, f6, (Function1) m3681throw8, null, c13770e3, 0);
                    String appmetrica11 = AbstractC5297e.appmetrica(c13770e3, R.string.eq3_param_noise_gate_threshold);
                    float f7 = c14056e.f27806e;
                    String appmetrica12 = AbstractC5297e.appmetrica(c13770e3, R.string.eq3_units_db);
                    boolean purchase8 = c13770e3.purchase(function1) | c13770e3.yandex(c14056e);
                    Object m3681throw9 = c13770e3.m3681throw();
                    if (purchase8 || m3681throw9 == c5170e) {
                        final int i10 = 6;
                        m3681throw9 = new Function1() { // from class: eّْؓ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                Float f22 = (Float) obj4;
                                switch (i10) {
                                    case 0:
                                        function1.invoke(C14056e.vip(c14056e, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 510));
                                        return Unit.INSTANCE;
                                    case 1:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 509));
                                        return Unit.INSTANCE;
                                    case 2:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 507));
                                        return Unit.INSTANCE;
                                    case 3:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 503));
                                        return Unit.INSTANCE;
                                    case 4:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 447));
                                        return Unit.INSTANCE;
                                    case 5:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 495));
                                        return Unit.INSTANCE;
                                    case 6:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 479));
                                        return Unit.INSTANCE;
                                    default:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 383));
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e3.m3682throws(m3681throw9);
                    }
                    AbstractC15077e.purchase(appmetrica11, appmetrica12, f7, (Function1) m3681throw9, null, c13770e3, 0);
                    String appmetrica13 = AbstractC5297e.appmetrica(c13770e3, R.string.eq3_param_gain);
                    float f8 = c14056e.f27804e;
                    String appmetrica14 = AbstractC5297e.appmetrica(c13770e3, R.string.eq3_units_db);
                    boolean purchase9 = c13770e3.purchase(function1) | c13770e3.yandex(c14056e);
                    Object m3681throw10 = c13770e3.m3681throw();
                    if (purchase9 || m3681throw10 == c5170e) {
                        final int i11 = 7;
                        m3681throw10 = new Function1() { // from class: eّْؓ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                Float f22 = (Float) obj4;
                                switch (i11) {
                                    case 0:
                                        function1.invoke(C14056e.vip(c14056e, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 510));
                                        return Unit.INSTANCE;
                                    case 1:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 509));
                                        return Unit.INSTANCE;
                                    case 2:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 507));
                                        return Unit.INSTANCE;
                                    case 3:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 503));
                                        return Unit.INSTANCE;
                                    case 4:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 447));
                                        return Unit.INSTANCE;
                                    case 5:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 0.0f, 495));
                                        return Unit.INSTANCE;
                                    case 6:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 0.0f, 0.0f, 479));
                                        return Unit.INSTANCE;
                                    default:
                                        function1.invoke(C14056e.vip(c14056e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f22.floatValue(), 383));
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e3.m3682throws(m3681throw10);
                    }
                    AbstractC15077e.purchase(appmetrica13, appmetrica14, f8, (Function1) m3681throw10, null, c13770e3, 0);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                InterfaceC16132e interfaceC16132e4 = (InterfaceC16132e) this.f5845e;
                C14197e c14197e = (C14197e) this.f5844e;
                final InterfaceC16132e interfaceC16132e5 = (InterfaceC16132e) this.f5847e;
                C13770e c13770e4 = (C13770e) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 17) != 16)) {
                    C0115e c0115e2 = C0115e.f1276e;
                    InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e2, 1.0f);
                    InterfaceC2747e license5 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j2 = c13770e4.f27286case;
                    int i12 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert2 = c13770e4.advert();
                    InterfaceC12864e purchase10 = AbstractC5679e.purchase(c13770e4, metrica);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e2 = C2721e.vip;
                    c13770e4.m3666import();
                    if (c13770e4.f27292implements) {
                        c13770e4.mopub(c7309e2);
                    } else {
                        c13770e4.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e4, license5, C2721e.billing);
                    AbstractC2270e.yandex(c13770e4, advert2, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e4, Integer.valueOf(i12), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e4, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e4, purchase10, C2721e.license);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e4, R.string.configure_recommendations_done), AbstractC18007e.metrica(c0115e2, 1.0f), ((C3618e) interfaceC16132e4.getValue()).ad, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e4, 48, 0, 262136);
                    EnumC1508e enumC1508e = ((Boolean) c14197e.f28051e.getValue()).booleanValue() ? EnumC1508e.f4375e : c14197e.f28052e.size() >= 5 ? EnumC1508e.f4376e : EnumC1508e.f4378e;
                    InterfaceC12864e ad = C14486e.ad.ad(c0115e2, C5438e.f11699e);
                    int i13 = this.f5846e;
                    boolean license6 = c13770e4.license(i13);
                    Object m3681throw11 = c13770e4.m3681throw();
                    if (license6 || m3681throw11 == C2987e.ad) {
                        m3681throw11 = new C17028e(i13, 20);
                        c13770e4.m3682throws(m3681throw11);
                    }
                    final int i14 = 0;
                    AbstractC7572e.vip(enumC1508e, ad, (Function1) m3681throw11, null, null, null, AbstractC16653e.license(986050430, new Function4() { // from class: eٍۥۨ
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            switch (i14) {
                                case 0:
                                    C13770e c13770e5 = (C13770e) obj6;
                                    ((Integer) obj7).getClass();
                                    int ordinal = ((EnumC1508e) obj5).ordinal();
                                    InterfaceC16132e interfaceC16132e6 = interfaceC16132e5;
                                    C0115e c0115e3 = C0115e.f1276e;
                                    if (ordinal == 0) {
                                        c13770e5.m3676strictfp(2147137302);
                                        AbstractC5647e.ad(AbstractC8217e.license(), null, AbstractC18007e.startapp(c0115e3, 20), ((C3618e) interfaceC16132e6.getValue()).ad, c13770e5, 432, 0);
                                        c13770e5.Signature(false);
                                    } else if (ordinal == 1) {
                                        c13770e5.m3676strictfp(2147403406);
                                        AbstractC5647e.ad(AbstractC8749e.vip(), null, AbstractC18007e.startapp(c0115e3, 20), ((C3618e) interfaceC16132e6.getValue()).ad, c13770e5, 432, 0);
                                        c13770e5.Signature(false);
                                    } else {
                                        if (ordinal != 2) {
                                            throw AbstractC1786e.loadAd(-1593307090, c13770e5, false);
                                        }
                                        c13770e5.m3676strictfp(-2147282844);
                                        AbstractC0702e.ad(null, ((C3618e) interfaceC16132e6.getValue()).ad, 2, 20, c13770e5, 3456);
                                        c13770e5.Signature(false);
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    C13770e c13770e6 = (C13770e) obj6;
                                    ((Integer) obj7).getClass();
                                    int ordinal2 = ((EnumC10044e) obj5).ordinal();
                                    InterfaceC16132e interfaceC16132e7 = interfaceC16132e5;
                                    C0115e c0115e4 = C0115e.f1276e;
                                    if (ordinal2 == 0) {
                                        c13770e6.m3676strictfp(68035874);
                                        AbstractC5647e.ad(AbstractC8217e.license(), null, AbstractC18007e.startapp(c0115e4, 20), ((C3618e) interfaceC16132e7.getValue()).ad, c13770e6, 432, 0);
                                        c13770e6.Signature(false);
                                    } else if (ordinal2 == 1) {
                                        c13770e6.m3676strictfp(68256346);
                                        AbstractC5647e.ad(AbstractC8749e.vip(), null, AbstractC18007e.startapp(c0115e4, 20), ((C3618e) interfaceC16132e7.getValue()).ad, c13770e6, 432, 0);
                                        c13770e6.Signature(false);
                                    } else {
                                        if (ordinal2 != 2) {
                                            throw AbstractC1786e.loadAd(-1660374681, c13770e6, false);
                                        }
                                        c13770e6.m3676strictfp(68486800);
                                        AbstractC6685e.ad(null, ((C3618e) interfaceC16132e7.getValue()).ad, 2, 20, c13770e6, 3456, 1);
                                        c13770e6.Signature(false);
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, c13770e4), c13770e4, 1572864, 56);
                    c13770e4.Signature(true);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                String str = (String) this.f5847e;
                EnumC10044e enumC10044e = (EnumC10044e) this.f5844e;
                final InterfaceC16132e interfaceC16132e6 = (InterfaceC16132e) this.f5845e;
                C13770e c13770e5 = (C13770e) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 17) != 16)) {
                    C0115e c0115e3 = C0115e.f1276e;
                    InterfaceC12864e metrica2 = AbstractC18007e.metrica(c0115e3, 1.0f);
                    InterfaceC2747e license7 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j3 = c13770e5.f27286case;
                    int i15 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert3 = c13770e5.advert();
                    InterfaceC12864e purchase11 = AbstractC5679e.purchase(c13770e5, metrica2);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e3 = C2721e.vip;
                    c13770e5.m3666import();
                    if (c13770e5.f27292implements) {
                        c13770e5.mopub(c7309e3);
                    } else {
                        c13770e5.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e5, license7, C2721e.billing);
                    AbstractC2270e.yandex(c13770e5, advert3, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e5, Integer.valueOf(i15), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e5, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e5, purchase11, C2721e.license);
                    AbstractC14489e.vip(str, null, ((C3618e) interfaceC16132e6.getValue()).ad, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e5, 0, 0, 262138);
                    InterfaceC12864e ad2 = C14486e.ad.ad(c0115e3, C5438e.f11699e);
                    int i16 = this.f5846e;
                    boolean license8 = c13770e5.license(i16);
                    Object m3681throw12 = c13770e5.m3681throw();
                    if (license8 || m3681throw12 == C2987e.ad) {
                        m3681throw12 = new C15355e(i16, 0);
                        c13770e5.m3682throws(m3681throw12);
                    }
                    final int i17 = 1;
                    AbstractC7572e.vip(enumC10044e, ad2, (Function1) m3681throw12, null, BuildConfig.FLAVOR, null, AbstractC16653e.license(-2030775784, new Function4() { // from class: eٍۥۨ
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            switch (i17) {
                                case 0:
                                    C13770e c13770e52 = (C13770e) obj6;
                                    ((Integer) obj7).getClass();
                                    int ordinal = ((EnumC1508e) obj5).ordinal();
                                    InterfaceC16132e interfaceC16132e62 = interfaceC16132e6;
                                    C0115e c0115e32 = C0115e.f1276e;
                                    if (ordinal == 0) {
                                        c13770e52.m3676strictfp(2147137302);
                                        AbstractC5647e.ad(AbstractC8217e.license(), null, AbstractC18007e.startapp(c0115e32, 20), ((C3618e) interfaceC16132e62.getValue()).ad, c13770e52, 432, 0);
                                        c13770e52.Signature(false);
                                    } else if (ordinal == 1) {
                                        c13770e52.m3676strictfp(2147403406);
                                        AbstractC5647e.ad(AbstractC8749e.vip(), null, AbstractC18007e.startapp(c0115e32, 20), ((C3618e) interfaceC16132e62.getValue()).ad, c13770e52, 432, 0);
                                        c13770e52.Signature(false);
                                    } else {
                                        if (ordinal != 2) {
                                            throw AbstractC1786e.loadAd(-1593307090, c13770e52, false);
                                        }
                                        c13770e52.m3676strictfp(-2147282844);
                                        AbstractC0702e.ad(null, ((C3618e) interfaceC16132e62.getValue()).ad, 2, 20, c13770e52, 3456);
                                        c13770e52.Signature(false);
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    C13770e c13770e6 = (C13770e) obj6;
                                    ((Integer) obj7).getClass();
                                    int ordinal2 = ((EnumC10044e) obj5).ordinal();
                                    InterfaceC16132e interfaceC16132e7 = interfaceC16132e6;
                                    C0115e c0115e4 = C0115e.f1276e;
                                    if (ordinal2 == 0) {
                                        c13770e6.m3676strictfp(68035874);
                                        AbstractC5647e.ad(AbstractC8217e.license(), null, AbstractC18007e.startapp(c0115e4, 20), ((C3618e) interfaceC16132e7.getValue()).ad, c13770e6, 432, 0);
                                        c13770e6.Signature(false);
                                    } else if (ordinal2 == 1) {
                                        c13770e6.m3676strictfp(68256346);
                                        AbstractC5647e.ad(AbstractC8749e.vip(), null, AbstractC18007e.startapp(c0115e4, 20), ((C3618e) interfaceC16132e7.getValue()).ad, c13770e6, 432, 0);
                                        c13770e6.Signature(false);
                                    } else {
                                        if (ordinal2 != 2) {
                                            throw AbstractC1786e.loadAd(-1660374681, c13770e6, false);
                                        }
                                        c13770e6.m3676strictfp(68486800);
                                        AbstractC6685e.ad(null, ((C3618e) interfaceC16132e7.getValue()).ad, 2, 20, c13770e6, 3456, 1);
                                        c13770e6.Signature(false);
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, c13770e5), c13770e5, 1597440, 40);
                    c13770e5.Signature(true);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13477e c13477e = (C13477e) this.f5845e;
                Function1 function12 = (Function1) this.f5847e;
                C6260e c6260e = (C6260e) this.f5844e;
                C15122e c15122e = (C15122e) obj;
                C13770e c13770e6 = (C13770e) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                int i18 = 0;
                for (Object obj4 : c13477e.appmetrica) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        AbstractC6874e.Signature();
                        throw null;
                    }
                    InterfaceC14511e interfaceC14511e = (InterfaceC14511e) obj4;
                    int i20 = this.f5846e;
                    boolean z = i18 == i20;
                    boolean purchase12 = c13770e6.purchase(function12) | c13770e6.license(i18);
                    Object m3681throw13 = c13770e6.m3681throw();
                    if (purchase12 || m3681throw13 == C2987e.ad) {
                        m3681throw13 = new C8779e(function12, i18, 9);
                        c13770e6.m3682throws(m3681throw13);
                    }
                    Function0 function02 = (Function0) m3681throw13;
                    boolean z2 = i18 == i20;
                    C0115e c0115e4 = C0115e.f1276e;
                    InterfaceC12864e license9 = AbstractC18366e.license(c0115e4, c6260e);
                    if (!z2) {
                        license9 = c0115e4;
                    }
                    AbstractC6143e.ad(c15122e, z, function02, license9, null, false, null, AbstractC16653e.license(-2021387958, new C17871e(26, interfaceC14511e), c13770e6), c13770e6, (intValue6 & 14) | 100663296);
                    i18 = i19;
                }
                return Unit.INSTANCE;
        }
    }
}
