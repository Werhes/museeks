package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۘٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3584e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f8106e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8107e;

    public /* synthetic */ C3584e(InterfaceC3314e interfaceC3314e, int i) {
        this.f8107e = i;
        this.f8106e = interfaceC3314e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f8107e;
        C0115e c0115e = C0115e.f1276e;
        int i2 = 18;
        C5170e c5170e = C2987e.ad;
        int i3 = 16;
        InterfaceC3314e interfaceC3314e = this.f8106e;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    String appmetrica = AbstractC5297e.appmetrica(c13770e, R.string.eq3_balancer_left);
                    float f = ((C16074e) interfaceC3314e.getValue()).f31669e;
                    boolean purchase = c13770e.purchase(interfaceC3314e);
                    Object m3681throw = c13770e.m3681throw();
                    if (purchase || m3681throw == c5170e) {
                        m3681throw = new C9214e(interfaceC3314e, 4);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC15077e.purchase(appmetrica, "dB", f, (Function1) m3681throw, null, c13770e, 48);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    String appmetrica2 = AbstractC5297e.appmetrica(c13770e2, R.string.eq3_balancer_right);
                    float f2 = ((C16074e) interfaceC3314e.getValue()).f31667e;
                    boolean purchase2 = c13770e2.purchase(interfaceC3314e);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (purchase2 || m3681throw2 == c5170e) {
                        m3681throw2 = new C9214e(interfaceC3314e, 6);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC15077e.purchase(appmetrica2, "dB", f2, (Function1) m3681throw2, null, c13770e2, 48);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                    boolean z = ((C16074e) interfaceC3314e.getValue()).f31668e;
                    boolean purchase3 = c13770e3.purchase(interfaceC3314e);
                    Object m3681throw3 = c13770e3.m3681throw();
                    if (purchase3 || m3681throw3 == c5170e) {
                        m3681throw3 = new C9214e(interfaceC3314e, 3);
                        c13770e3.m3682throws(m3681throw3);
                    }
                    AbstractC16565e.vip(z, (Function1) m3681throw3, AbstractC12220e.loadAd(AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), 16, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8, 7), c13770e3, 384);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C13770e c13770e4 = (C13770e) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 17) != 16)) {
                    C2892e c2892e = AbstractC12684e.metrica;
                    C2892e c2892e2 = AbstractC12684e.license;
                    boolean z2 = ((C16074e) interfaceC3314e.getValue()).f31666e;
                    boolean purchase4 = c13770e4.purchase(interfaceC3314e);
                    Object m3681throw4 = c13770e4.m3681throw();
                    if (purchase4 || m3681throw4 == c5170e) {
                        m3681throw4 = new C9214e(interfaceC3314e, 5);
                        c13770e4.m3682throws(m3681throw4);
                    }
                    AbstractC15077e.billing(c2892e, c2892e2, z2, (Function1) m3681throw4, c13770e4, 54);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                C13770e c13770e5 = (C13770e) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 17) != 16)) {
                    C2892e c2892e3 = AbstractC12684e.appmetrica;
                    C2892e c2892e4 = AbstractC12684e.purchase;
                    boolean z3 = ((C16074e) interfaceC3314e.getValue()).f31670e;
                    boolean purchase5 = c13770e5.purchase(interfaceC3314e);
                    Object m3681throw5 = c13770e5.m3681throw();
                    if (purchase5 || m3681throw5 == c5170e) {
                        m3681throw5 = new C9214e(interfaceC3314e, 7);
                        c13770e5.m3682throws(m3681throw5);
                    }
                    AbstractC15077e.billing(c2892e3, c2892e4, z3, (Function1) m3681throw5, c13770e5, 54);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                InterfaceC10799e interfaceC10799e = (InterfaceC10799e) obj;
                C13770e c13770e6 = (C13770e) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= c13770e6.purchase(interfaceC10799e) ? 4 : 2;
                }
                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 19) != 18)) {
                    float f3 = 16;
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_sound_wave_outline_28, 0, c13770e6), null, AbstractC12220e.smaato(c0115e, f3, 0.0f, 2), 0L, c13770e6, 440, 8);
                    InterfaceC12864e ad = interfaceC10799e.ad(c0115e, 1.0f, true);
                    C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.billing(1), C5438e.f11672e, c13770e6, 6);
                    long j = c13770e6.f27286case;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e6.advert();
                    InterfaceC12864e purchase6 = AbstractC5679e.purchase(c13770e6, ad);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e6.m3666import();
                    if (c13770e6.f27292implements) {
                        c13770e6.mopub(c7309e);
                    } else {
                        c13770e6.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e6, ad2, C2721e.billing);
                    AbstractC2270e.yandex(c13770e6, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e6, Integer.valueOf(i4), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e6, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e6, purchase6, C2721e.license);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e6, R.string.eq2_presets), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, c13770e6, 0, 24576, 245758);
                    AbstractC14489e.vip(((C16801e) interfaceC3314e.getValue()).f32937e, null, ((C7019e) c13770e6.adcel(AbstractC11785e.ad)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e6, 0, 24960, 241658);
                    c13770e6.Signature(true);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_chevron_right, 0, c13770e6), null, AbstractC12220e.smaato(c0115e, f3, 0.0f, 2), 0L, c13770e6, 440, 8);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 6:
                C13770e c13770e7 = (C13770e) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 17) != 16)) {
                    String appmetrica3 = AbstractC5297e.appmetrica(c13770e7, R.string.eq3_param_threshold);
                    float f4 = ((C7190e) interfaceC3314e.getValue()).f14695e;
                    String appmetrica4 = AbstractC5297e.appmetrica(c13770e7, R.string.eq3_units_db);
                    boolean purchase7 = c13770e7.purchase(interfaceC3314e);
                    Object m3681throw6 = c13770e7.m3681throw();
                    if (purchase7 || m3681throw6 == c5170e) {
                        m3681throw6 = new C9214e(interfaceC3314e, 21);
                        c13770e7.m3682throws(m3681throw6);
                    }
                    AbstractC15077e.purchase(appmetrica3, appmetrica4, f4, (Function1) m3681throw6, null, c13770e7, 0);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case 7:
                C13770e c13770e8 = (C13770e) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if (c13770e8.m3673protected(intValue8 & 1, (intValue8 & 17) != 16)) {
                    String appmetrica5 = AbstractC5297e.appmetrica(c13770e8, R.string.eq3_param_gain);
                    float f5 = ((C7190e) interfaceC3314e.getValue()).f14697e;
                    String appmetrica6 = AbstractC5297e.appmetrica(c13770e8, R.string.eq3_units_db);
                    boolean purchase8 = c13770e8.purchase(interfaceC3314e);
                    Object m3681throw7 = c13770e8.m3681throw();
                    if (purchase8 || m3681throw7 == c5170e) {
                        m3681throw7 = new C9214e(interfaceC3314e, 19);
                        c13770e8.m3682throws(m3681throw7);
                    }
                    AbstractC15077e.purchase(appmetrica5, appmetrica6, f5, (Function1) m3681throw7, null, c13770e8, 0);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case 8:
                C13770e c13770e9 = (C13770e) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                if (c13770e9.m3673protected(intValue9 & 1, (intValue9 & 17) != 16)) {
                    boolean z4 = ((C7190e) interfaceC3314e.getValue()).f14696e;
                    boolean purchase9 = c13770e9.purchase(interfaceC3314e);
                    Object m3681throw8 = c13770e9.m3681throw();
                    if (purchase9 || m3681throw8 == c5170e) {
                        m3681throw8 = new C9214e(interfaceC3314e, i3);
                        c13770e9.m3682throws(m3681throw8);
                    }
                    AbstractC16565e.vip(z4, (Function1) m3681throw8, AbstractC12220e.loadAd(AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), 16, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8, 7), c13770e9, 384);
                } else {
                    c13770e9.m3659default();
                }
                return Unit.INSTANCE;
            case 9:
                C13770e c13770e10 = (C13770e) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                if (c13770e10.m3673protected(intValue10 & 1, (intValue10 & 17) != 16)) {
                    String appmetrica7 = AbstractC5297e.appmetrica(c13770e10, R.string.eq3_param_attack);
                    float f6 = ((C7190e) interfaceC3314e.getValue()).f14694e;
                    String appmetrica8 = AbstractC5297e.appmetrica(c13770e10, R.string.eq3_units_ms);
                    boolean purchase10 = c13770e10.purchase(interfaceC3314e);
                    Object m3681throw9 = c13770e10.m3681throw();
                    if (purchase10 || m3681throw9 == c5170e) {
                        m3681throw9 = new C9214e(interfaceC3314e, i2);
                        c13770e10.m3682throws(m3681throw9);
                    }
                    AbstractC15077e.purchase(appmetrica7, appmetrica8, f6, (Function1) m3681throw9, null, c13770e10, 0);
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
            case 10:
                C13770e c13770e11 = (C13770e) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                if (c13770e11.m3673protected(intValue11 & 1, (intValue11 & 17) != 16)) {
                    String appmetrica9 = AbstractC5297e.appmetrica(c13770e11, R.string.eq3_param_release);
                    float f7 = ((C7190e) interfaceC3314e.getValue()).f14699e;
                    String appmetrica10 = AbstractC5297e.appmetrica(c13770e11, R.string.eq3_units_ms);
                    boolean purchase11 = c13770e11.purchase(interfaceC3314e);
                    Object m3681throw10 = c13770e11.m3681throw();
                    if (purchase11 || m3681throw10 == c5170e) {
                        m3681throw10 = new C9214e(interfaceC3314e, 17);
                        c13770e11.m3682throws(m3681throw10);
                    }
                    AbstractC15077e.purchase(appmetrica9, appmetrica10, f7, (Function1) m3681throw10, null, c13770e11, 0);
                } else {
                    c13770e11.m3659default();
                }
                return Unit.INSTANCE;
            case 11:
                C13770e c13770e12 = (C13770e) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                if (c13770e12.m3673protected(intValue12 & 1, (intValue12 & 17) != 16)) {
                    String appmetrica11 = AbstractC5297e.appmetrica(c13770e12, R.string.eq3_param_ratio);
                    float f8 = ((C7190e) interfaceC3314e.getValue()).f14698e;
                    boolean purchase12 = c13770e12.purchase(interfaceC3314e);
                    Object m3681throw11 = c13770e12.m3681throw();
                    if (purchase12 || m3681throw11 == c5170e) {
                        m3681throw11 = new C9214e(interfaceC3314e, 20);
                        c13770e12.m3682throws(m3681throw11);
                    }
                    AbstractC15077e.purchase(appmetrica11, BuildConfig.FLAVOR, f8, (Function1) m3681throw11, null, c13770e12, 48);
                } else {
                    c13770e12.m3659default();
                }
                return Unit.INSTANCE;
            case 12:
                C8836e c8836e = (C8836e) obj;
                C13770e c13770e13 = (C13770e) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= c13770e13.purchase(c8836e) ? 4 : 2;
                }
                if (c13770e13.m3673protected(intValue13 & 1, (intValue13 & 19) != 18)) {
                    boolean z5 = ((EnumC6972e) interfaceC3314e.getValue()) == EnumC6972e.SOCKS5;
                    Object m3681throw12 = c13770e13.m3681throw();
                    if (m3681throw12 == c5170e) {
                        m3681throw12 = new C1672e(interfaceC3314e, 22);
                        c13770e13.m3682throws(m3681throw12);
                    }
                    Function0 function0 = (Function0) m3681throw12;
                    C10102e c10102e = C10102e.ad;
                    int i5 = (intValue13 & 14) | 384;
                    AbstractC7260e.ad(c8836e, z5, function0, C10102e.metrica(0, 2, c13770e13), null, false, null, null, null, null, C17150e.remoteconfig, c13770e13, i5, 1016);
                    boolean z6 = ((EnumC6972e) interfaceC3314e.getValue()) == EnumC6972e.HTTP;
                    Object m3681throw13 = c13770e13.m3681throw();
                    if (m3681throw13 == c5170e) {
                        m3681throw13 = new C1672e(interfaceC3314e, 23);
                        c13770e13.m3682throws(m3681throw13);
                    }
                    AbstractC7260e.ad(c8836e, z6, (Function0) m3681throw13, C10102e.metrica(1, 2, c13770e13), null, false, null, null, null, null, C17150e.pro, c13770e13, i5, 1016);
                } else {
                    c13770e13.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e14 = (C13770e) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                if (c13770e14.m3673protected(intValue14 & 1, (intValue14 & 17) != 16)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e14, ((Boolean) interfaceC3314e.getValue()).booleanValue() ? R.string.tc_editor_picker : R.string.tc_editor_hex), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e14, 0, 0, 262142);
                } else {
                    c13770e14.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
