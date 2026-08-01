package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؓۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1701e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f4634e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f4635e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f4636e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f4637e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4638e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f4639e;

    public /* synthetic */ C1701e(EnumC13413e enumC13413e, Function1 function1, InterfaceC3314e interfaceC3314e, Function0 function0, InterfaceC3314e interfaceC3314e2) {
        this.f4638e = 4;
        this.f4636e = enumC13413e;
        this.f4637e = function1;
        this.f4635e = interfaceC3314e;
        this.f4634e = function0;
        this.f4639e = interfaceC3314e2;
    }

    public /* synthetic */ C1701e(C16349e c16349e, C13867e c13867e, C6260e c6260e, InterfaceC3314e interfaceC3314e, C16330e c16330e) {
        this.f4638e = 5;
        this.f4636e = c16349e;
        this.f4637e = c13867e;
        this.f4634e = c6260e;
        this.f4635e = interfaceC3314e;
        this.f4639e = c16330e;
    }

    public /* synthetic */ C1701e(C18128e c18128e, InterfaceC3314e interfaceC3314e, C1925e c1925e, InterfaceC3314e interfaceC3314e2, InterfaceC3314e interfaceC3314e3) {
        this.f4638e = 0;
        this.f4636e = c18128e;
        this.f4635e = interfaceC3314e;
        this.f4639e = c1925e;
        this.f4637e = interfaceC3314e2;
        this.f4634e = interfaceC3314e3;
    }

    public /* synthetic */ C1701e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f4638e = i;
        this.f4636e = obj;
        this.f4635e = obj2;
        this.f4637e = obj3;
        this.f4634e = obj4;
        this.f4639e = obj5;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f4638e) {
            case 0:
                C18128e c18128e = (C18128e) this.f4636e;
                InterfaceC16132e interfaceC16132e = (InterfaceC16132e) this.f4635e;
                C1925e c1925e = (C1925e) this.f4639e;
                InterfaceC16132e interfaceC16132e2 = (InterfaceC16132e) this.f4637e;
                InterfaceC16132e interfaceC16132e3 = (InterfaceC16132e) this.f4634e;
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
                }
                if (!c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    c13770e.m3659default();
                } else if (((Boolean) interfaceC16132e3.getValue()).booleanValue() && ((AbstractC7674e) ((InterfaceC8346e) interfaceC16132e.getValue())).isEmpty()) {
                    c13770e.m3676strictfp(1263998369);
                    InterfaceC12864e adcel = AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e);
                    InterfaceC2747e license = AbstractC17074e.license(C5438e.f11700e, false);
                    long j = c13770e.f27286case;
                    int i = (int) (j ^ (j >>> 32));
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
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    AbstractC6232e.vip(null, 0L, null, c13770e, 0, 7);
                    c13770e.Signature(true);
                    c13770e.Signature(false);
                } else if (((Boolean) interfaceC16132e3.getValue()).booleanValue() || !((AbstractC7674e) ((InterfaceC8346e) interfaceC16132e.getValue())).isEmpty()) {
                    c13770e.m3676strictfp(1264464237);
                    boolean yandex = c13770e.yandex(c18128e) | c13770e.purchase(interfaceC16132e) | c13770e.yandex(c1925e) | c13770e.purchase(interfaceC16132e2);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C17819e(c18128e, interfaceC16132e, c1925e, interfaceC16132e2);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC7023e.ad(null, null, interfaceC12123e, null, null, null, false, null, (Function1) m3681throw, c13770e, (intValue << 6) & 896, 507);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3676strictfp(1264305517);
                    c13770e.Signature(false);
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC2566e interfaceC2566e = (InterfaceC2566e) this.f4636e;
                C1922e c1922e = (C1922e) this.f4635e;
                C12742e c12742e = (C12742e) this.f4637e;
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) this.f4634e;
                InterfaceC8346e interfaceC8346e = (InterfaceC8346e) this.f4639e;
                InterfaceC12123e interfaceC12123e2 = (InterfaceC12123e) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c13770e2.purchase(interfaceC12123e2) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 19) != 18)) {
                    InterfaceC12864e license2 = AbstractC14783e.license(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e2), interfaceC2566e.ad(), null);
                    float f = 16;
                    C16005e c16005e = new C16005e(f, f, f, f);
                    C13964e billing = AbstractC16497e.billing(f);
                    boolean yandex2 = c13770e2.yandex(c1922e) | c13770e2.purchase(c12742e) | c13770e2.purchase(interfaceC3314e) | c13770e2.yandex(interfaceC8346e);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw2 == C2987e.ad) {
                        m3681throw2 = new C17819e(c12742e, interfaceC8346e, c1922e, interfaceC3314e, 3);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC7023e.ad(license2, null, c16005e, billing, null, null, false, null, (Function1) m3681throw2, c13770e2, 24960, 490);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C4993e c4993e = (C4993e) this.f4636e;
                C11192e c11192e = (C11192e) this.f4635e;
                C13182e c13182e = (C13182e) this.f4637e;
                C10743e c10743e = (C10743e) this.f4634e;
                InterfaceC5178e interfaceC5178e = (InterfaceC5178e) this.f4639e;
                InterfaceC12123e interfaceC12123e3 = (InterfaceC12123e) obj;
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= c13770e3.purchase(interfaceC12123e3) ? 4 : 2;
                }
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 19) != 18)) {
                    InterfaceC12864e adcel2 = AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e3);
                    boolean yandex3 = c13770e3.yandex(c11192e) | c13770e3.yandex(c13182e) | c13770e3.purchase(c10743e) | c13770e3.yandex(interfaceC5178e);
                    Object m3681throw3 = c13770e3.m3681throw();
                    if (yandex3 || m3681throw3 == C2987e.ad) {
                        m3681throw3 = new C17819e(c13182e, c11192e, c10743e, interfaceC5178e, 9);
                        c13770e3.m3682throws(m3681throw3);
                    }
                    AbstractC7023e.ad(adcel2, c4993e, null, null, null, null, false, null, (Function1) m3681throw3, c13770e3, 0, 508);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C4993e c4993e2 = (C4993e) this.f4636e;
                InterfaceC16132e interfaceC16132e4 = (InterfaceC16132e) this.f4635e;
                C10743e c10743e2 = (C10743e) this.f4637e;
                C17047e c17047e = (C17047e) this.f4634e;
                InterfaceC5178e interfaceC5178e2 = (InterfaceC5178e) this.f4639e;
                InterfaceC12123e interfaceC12123e4 = (InterfaceC12123e) obj;
                C13770e c13770e4 = (C13770e) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= c13770e4.purchase(interfaceC12123e4) ? 4 : 2;
                }
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 19) != 18)) {
                    boolean isEmpty = ((InterfaceC8346e) interfaceC16132e4.getValue()).isEmpty();
                    C0115e c0115e = C0115e.f1276e;
                    if (isEmpty) {
                        c13770e4.m3676strictfp(-130327524);
                        AbstractC0436e.ad(AbstractC12220e.adcel(c0115e, interfaceC12123e4), false, 0L, c13770e4, 0, 6);
                        c13770e4.Signature(false);
                    } else {
                        c13770e4.m3676strictfp(-133705904);
                        InterfaceC12864e premium = AbstractC12220e.adcel(c0115e, interfaceC12123e4).premium(AbstractC18007e.metrica);
                        C13964e billing2 = AbstractC16497e.billing(12);
                        C16005e appmetrica = AbstractC12220e.appmetrica(0.0f, 0.0f, 0.0f, 16, 7);
                        boolean purchase2 = c13770e4.purchase(interfaceC16132e4) | c13770e4.purchase(c10743e2) | c13770e4.yandex(c17047e) | c13770e4.yandex(interfaceC5178e2);
                        Object m3681throw4 = c13770e4.m3681throw();
                        if (purchase2 || m3681throw4 == C2987e.ad) {
                            m3681throw4 = new C17819e(interfaceC16132e4, c10743e2, c17047e, interfaceC5178e2);
                            c13770e4.m3682throws(m3681throw4);
                        }
                        AbstractC7023e.ad(premium, c4993e2, appmetrica, billing2, null, null, false, null, (Function1) m3681throw4, c13770e4, 24960, 488);
                        c13770e4.Signature(false);
                    }
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                EnumC13413e enumC13413e = (EnumC13413e) this.f4636e;
                Function1 function1 = (Function1) this.f4637e;
                InterfaceC16132e interfaceC16132e5 = (InterfaceC16132e) this.f4635e;
                Function0 function0 = (Function0) this.f4634e;
                InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) this.f4639e;
                C13770e c13770e5 = (C13770e) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 17) != 16)) {
                    boolean license3 = c13770e5.license(enumC13413e == null ? -1 : enumC13413e.ordinal()) | c13770e5.purchase(function1) | c13770e5.purchase(interfaceC16132e5) | c13770e5.purchase(function0);
                    Object m3681throw5 = c13770e5.m3681throw();
                    if (license3 || m3681throw5 == C2987e.ad) {
                        C17151e c17151e = new C17151e(enumC13413e, function1, interfaceC3314e2, interfaceC16132e5, function0);
                        c13770e5.m3682throws(c17151e);
                        m3681throw5 = c17151e;
                    }
                    AbstractC7023e.ad(null, null, null, null, null, null, false, null, (Function1) m3681throw5, c13770e5, 0, 511);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            default:
                AbstractC16904e abstractC16904e = (AbstractC16904e) this.f4636e;
                final C13867e c13867e = (C13867e) this.f4637e;
                final C6260e c6260e = (C6260e) this.f4634e;
                final InterfaceC16132e interfaceC16132e6 = (InterfaceC16132e) this.f4635e;
                final C16330e c16330e = (C16330e) this.f4639e;
                C14715e c14715e = (C14715e) obj;
                C13770e c13770e6 = (C13770e) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= c13770e6.purchase(c14715e) ? 4 : 2;
                }
                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 19) != 18)) {
                    final float f2 = 36 + AbstractC9999e.ad + 24;
                    AbstractC16279e.vip(abstractC16904e, AbstractC18007e.metrica(C0115e.f1276e, 1.0f), AbstractC12220e.metrica((c14715e.vip() - f2) / 2, 0.0f, 2), new C11726e(f2), 0.0f, null, null, false, null, null, null, AbstractC16653e.license(-344009786, new Function4() { // from class: eۨؐ
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int intValue7 = ((Integer) obj5).intValue();
                            C13770e c13770e7 = (C13770e) obj6;
                            int intValue8 = ((Integer) obj7).intValue();
                            C6475e c6475e = (C6475e) ((InterfaceC8346e) interfaceC16132e6.getValue()).get(intValue7);
                            String str = c6475e.vip;
                            String str2 = c6475e.metrica;
                            C13867e c13867e2 = C13867e.this;
                            boolean yandex4 = c13770e7.yandex(c13867e2) | c13770e7.purchase(c6475e);
                            Object m3681throw6 = c13770e7.m3681throw();
                            C5170e c5170e = C2987e.ad;
                            if (yandex4 || m3681throw6 == c5170e) {
                                m3681throw6 = new C5565e(c13867e2, c6475e, 9);
                                c13770e7.m3682throws(m3681throw6);
                            }
                            Function0 function02 = (Function0) m3681throw6;
                            boolean z = (((intValue8 & 112) ^ 48) > 32 && c13770e7.license(intValue7)) || (intValue8 & 48) == 32;
                            Object m3681throw7 = c13770e7.m3681throw();
                            if (z || m3681throw7 == c5170e) {
                                m3681throw7 = new C8779e(intValue7, c16330e, 6);
                                c13770e7.m3682throws(m3681throw7);
                            }
                            Function0 function03 = m3681throw7;
                            C0115e c0115e2 = C0115e.f1276e;
                            c13867e2.yandex(str, str2, function02, function03, AbstractC15920e.crashlytics(AbstractC18007e.smaato(c0115e2, f2), intValue7 == 0, AbstractC18366e.license(c0115e2, c6260e)), c13770e7, 0);
                            return Unit.INSTANCE;
                        }
                    }, c13770e6), c13770e6, 48, 24576, 16368);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
