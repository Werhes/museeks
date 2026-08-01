package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٓۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14002e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f27730e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f27731e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f27732e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f27733e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27734e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f27735e;

    public /* synthetic */ C14002e(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.f27734e = i;
        this.f27732e = z;
        this.f27731e = obj;
        this.f27733e = obj2;
        this.f27730e = obj3;
        this.f27735e = obj4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x027b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [byte, boolean] */
    /* JADX WARN: Type inference failed for: r12v29 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        String license;
        String license2;
        String str;
        boolean z;
        int i2;
        int i3;
        C12380e c12380e;
        ?? r12;
        C2892e c2892e;
        C2892e c2892e2;
        Object obj4;
        C2297e c2297e;
        boolean z2;
        boolean z3;
        String str2;
        int i4 = this.f27734e;
        C0115e c0115e = C0115e.f1276e;
        Object obj5 = this.f27735e;
        Object obj6 = this.f27730e;
        Object obj7 = this.f27733e;
        Object obj8 = this.f27731e;
        boolean z4 = this.f27732e;
        switch (i4) {
            case 0:
                C12380e c12380e2 = (C12380e) obj8;
                InterfaceC3965e interfaceC3965e = (InterfaceC3965e) obj7;
                C12284e c12284e = (C12284e) obj6;
                C0576e c0576e = c12284e.f24637e;
                C6260e c6260e = (C6260e) obj5;
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
                }
                boolean z5 = (intValue & 19) != 18;
                AbstractC7919e abstractC7919e = c13770e.ad;
                if (c13770e.m3673protected(intValue & 1, z5)) {
                    float f = 16;
                    InterfaceC12864e purchase = AbstractC5967e.purchase(AbstractC12220e.smaato(AbstractC12220e.adcel(c0115e, interfaceC12123e), f, 0.0f, 2).premium(AbstractC18007e.metrica), AbstractC5967e.appmetrica(c13770e), true);
                    C13964e billing = AbstractC16497e.billing(f);
                    C9577e c9577e = C5438e.f11672e;
                    C4789e ad = AbstractC14801e.ad(billing, c9577e, c13770e, 6);
                    long j = c13770e.f27286case;
                    int i5 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, purchase);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e);
                    } else {
                        c13770e.m3684volatile();
                    }
                    C14865e c14865e = C2721e.billing;
                    AbstractC2270e.yandex(c13770e, ad, c14865e);
                    C14865e c14865e2 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e, advert, c14865e2);
                    Integer valueOf = Integer.valueOf(i5);
                    C14865e c14865e3 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
                    C5430e c5430e = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e, c5430e);
                    C14865e c14865e4 = C2721e.license;
                    AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
                    float f2 = 8;
                    C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.billing(f2), c9577e, c13770e, 6);
                    long j2 = c13770e.f27286case;
                    int i6 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert2 = c13770e.advert();
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, c0115e);
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, ad2, c14865e);
                    AbstractC2270e.yandex(c13770e, advert2, c14865e2);
                    AbstractC8703e.premium(i6, c13770e, c14865e3, c13770e, c5430e);
                    AbstractC2270e.yandex(c13770e, purchase3, c14865e4);
                    EnumC10783e enumC10783e = c12284e.m3334private().ad;
                    switch (enumC10783e == null ? -1 : AbstractC8016e.ad[enumC10783e.ordinal()]) {
                        case 1:
                            i = R.string.auth2_method_sms_title;
                            break;
                        case 2:
                            i = R.string.auth2_method_push_title;
                            break;
                        case 3:
                            i = R.string.auth2_method_email_title;
                            break;
                        case 4:
                            i = R.string.auth2_method_codegen_title;
                            break;
                        case 5:
                            i = R.string.auth2_method_callreset_title;
                            break;
                        case 6:
                            i = R.string.auth2_password_title;
                            break;
                        default:
                            i = R.string.auth2_method_reserve_title;
                            break;
                    }
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, i), AbstractC18007e.metrica(c0115e, 1.0f), 0L, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e).appmetrica, c13770e, 48, 0, 130044);
                    EnumC10783e enumC10783e2 = c12284e.m3334private().ad;
                    String str3 = c12284e.m3334private().metrica;
                    switch (enumC10783e2 != null ? AbstractC8016e.ad[enumC10783e2.ordinal()] : -1) {
                        case 1:
                            c13770e.m3676strictfp(-1745637538);
                            license = AbstractC5297e.license(R.string.auth2_method_sms_text, new Object[]{str3}, c13770e);
                            c13770e.Signature(false);
                            str = license;
                            break;
                        case 2:
                            c13770e.m3676strictfp(-1745633953);
                            license2 = AbstractC5297e.license(R.string.auth2_method_push_text, new Object[]{str3}, c13770e);
                            c13770e.Signature(false);
                            str = license2;
                            break;
                        case 3:
                            c13770e.m3676strictfp(-1745630304);
                            license2 = AbstractC5297e.license(R.string.auth2_method_email_text, new Object[]{str3}, c13770e);
                            c13770e.Signature(false);
                            str = license2;
                            break;
                        case 4:
                            z = false;
                            i2 = -1745626570;
                            i3 = R.string.auth2_method_codegen_text;
                            license = AbstractC4653e.isVip(c13770e, i2, i3, c13770e, z);
                            str = license;
                            break;
                        case 5:
                            c13770e.m3676strictfp(-1745619804);
                            license = AbstractC5297e.license(R.string.auth2_method_callreset_text, new Object[]{str3}, c13770e);
                            c13770e.Signature(false);
                            str = license;
                            break;
                        case 6:
                            z = false;
                            i2 = -1745623120;
                            i3 = R.string.auth2_password_text;
                            license = AbstractC4653e.isVip(c13770e, i2, i3, c13770e, z);
                            str = license;
                            break;
                        default:
                            i2 = -1745617194;
                            i3 = R.string.auth2_method_reserve_text;
                            z = false;
                            license = AbstractC4653e.isVip(c13770e, i2, i3, c13770e, z);
                            str = license;
                            break;
                    }
                    AbstractC14489e.vip(str, AbstractC18007e.metrica(c0115e, 1.0f), AbstractC0903e.license(c13770e).remoteconfig, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e).adcel, c13770e, 48, 0, 130040);
                    c13770e.Signature(true);
                    C4988e c4988e = new C4988e(z4 ? 7 : 3, 7, 115);
                    boolean purchase4 = c13770e.purchase(c12380e2) | c13770e.purchase(interfaceC3965e) | c13770e.yandex(c12284e);
                    Object m3681throw = c13770e.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    Object obj9 = m3681throw;
                    if (purchase4 || m3681throw == c5170e) {
                        C13338e c13338e = new C13338e(c12380e2, interfaceC3965e, c12284e, 0);
                        c13770e.m3682throws(c13338e);
                        obj9 = c13338e;
                    }
                    InterfaceC13435e interfaceC13435e = (InterfaceC13435e) obj9;
                    C18121e c18121e = C18121e.ad;
                    C17085e license3 = C18121e.license(AbstractC0903e.license(c13770e).subscription, AbstractC0903e.license(c13770e).subscription, AbstractC0903e.license(c13770e).subscription, AbstractC0903e.license(c13770e).subscription, c13770e, 2147483407);
                    boolean z6 = ((String) c0576e.getValue()).length() > 0;
                    if (((String) c0576e.getValue()).length() > 0) {
                        c13770e.m3676strictfp(-355820820);
                        c12380e = c12380e2;
                        r12 = 0;
                        C2892e license4 = AbstractC16653e.license(693425864, new C3071e(c12284e, 5, false ? 1 : 0), c13770e);
                        c13770e.Signature(false);
                        c2892e = license4;
                    } else {
                        c12380e = c12380e2;
                        r12 = 0;
                        c13770e.m3676strictfp(-355704230);
                        c13770e.Signature(false);
                        c2892e = null;
                    }
                    if (z4) {
                        c13770e.m3676strictfp(-355641423);
                        C2892e license5 = AbstractC16653e.license(1356207004, new C3071e(c12284e, 6, r12), c13770e);
                        c13770e.Signature(r12);
                        c2892e2 = license5;
                    } else {
                        c13770e.m3676strictfp(-354822342);
                        c13770e.Signature(r12);
                        c2892e2 = null;
                    }
                    int i7 = (!z4 || ((Boolean) c12284e.f24635e.getValue()).booleanValue()) ? 0 : 1;
                    InterfaceC12864e license6 = AbstractC18366e.license(AbstractC18007e.metrica(c0115e, 1.0f).premium(C10759e.f21180e), c6260e);
                    boolean billing2 = c13770e.billing(z4);
                    Object m3681throw2 = c13770e.m3681throw();
                    Object obj10 = m3681throw2;
                    if (billing2 || m3681throw2 == c5170e) {
                        C7317e c7317e = new C7317e(z4, 2);
                        c13770e.m3682throws(c7317e);
                        obj10 = c7317e;
                    }
                    InterfaceC12864e ad3 = AbstractC1147e.ad(license6, false, (Function1) obj10);
                    if (z4) {
                        c13770e.m3676strictfp(-354066438);
                        c13770e.Signature(false);
                        c2297e = null;
                    } else {
                        c13770e.m3676strictfp(1096958209);
                        boolean yandex = c13770e.yandex(c12284e);
                        Object m3681throw3 = c13770e.m3681throw();
                        if (yandex || m3681throw3 == c5170e) {
                            C3071e c3071e = new C3071e(c12284e, 7, (byte) 0);
                            c13770e.m3682throws(c3071e);
                            obj4 = c3071e;
                        } else {
                            obj4 = m3681throw3;
                        }
                        C2297e c2297e2 = new C2297e(C10990e.f21751e, new C9034e((Function2) obj4));
                        c13770e.Signature(false);
                        c2297e = c2297e2;
                    }
                    AbstractC8499e.ad(c12380e, ad3, false, null, null, AbstractC16653e.license(2033000582, new C16027e(z4, 4), c13770e), c2892e2, c2892e, z6, c2297e, i7, (char) 0, c4988e, interfaceC13435e, null, license3, null, c13770e, 1572864, 0, 7112380);
                    C12380e c12380e3 = c12380e;
                    InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
                    String appmetrica = AbstractC5297e.appmetrica(c13770e, R.string.auth2_password_action);
                    EnumC10044e enumC10044e = ((Boolean) c12284e.f24639e.getValue()).booleanValue() ? EnumC10044e.f19840e : c12380e3.vip().f33322e.length() > 0 ? EnumC10044e.f19841e : EnumC10044e.f19843e;
                    boolean purchase5 = c13770e.purchase(interfaceC3965e) | c13770e.yandex(c12284e) | c13770e.purchase(c12380e3);
                    Object m3681throw4 = c13770e.m3681throw();
                    Object obj11 = m3681throw4;
                    if (purchase5 || m3681throw4 == c5170e) {
                        Csynchronized csynchronized = new Csynchronized(7, interfaceC3965e, c12284e, c12380e3);
                        c13770e.m3682throws(csynchronized);
                        obj11 = csynchronized;
                    }
                    AbstractC9164e.ad(appmetrica, enumC10044e, (Function0) obj11, metrica, 0L, 0L, 0L, 0L, c13770e, 3072);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    AbstractC12534e.ad(c13770e, new C5228e(1.0f, true));
                    if (c12284e.f24636e) {
                        c13770e.m3676strictfp(-353181542);
                        InterfaceC12864e smaato = AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), 0.0f, f2, 1);
                        C4789e ad4 = AbstractC14801e.ad(AbstractC16497e.billing(f2), c9577e, c13770e, 6);
                        long j3 = c13770e.f27286case;
                        int i8 = (int) (j3 ^ (j3 >>> 32));
                        InterfaceC3483e advert3 = c13770e.advert();
                        InterfaceC12864e purchase6 = AbstractC5679e.purchase(c13770e, smaato);
                        c13770e.m3666import();
                        if (c13770e.f27292implements) {
                            c13770e.mopub(c7309e);
                        } else {
                            c13770e.m3684volatile();
                        }
                        AbstractC2270e.yandex(c13770e, ad4, c14865e);
                        AbstractC2270e.yandex(c13770e, advert3, c14865e2);
                        AbstractC8703e.premium(i8, c13770e, c14865e3, c13770e, c5430e);
                        AbstractC2270e.yandex(c13770e, purchase6, c14865e4);
                        AbstractC8141e.vip(null, 0.0f, 0L, c13770e, 0, 7);
                        boolean yandex2 = c13770e.yandex(c12284e);
                        Object m3681throw5 = c13770e.m3681throw();
                        if (yandex2 || m3681throw5 == c5170e) {
                            m3681throw5 = new C17011e(0, c12284e, C12284e.class, "showEcosystemAlert", "showEcosystemAlert()V", 0, 0, 23);
                            c13770e.m3682throws(m3681throw5);
                        }
                        InterfaceC12864e metrica2 = AbstractC18007e.metrica(c0115e, 1.0f);
                        boolean booleanValue = ((Boolean) c12284e.f24632e.getValue()).booleanValue();
                        z2 = true;
                        AbstractC1513e.license((Function0) ((InterfaceC5261e) m3681throw5), metrica2, !booleanValue, null, null, null, AbstractC11463e.f23066e, c13770e, 805306416, 504);
                        c13770e.Signature(true);
                        z3 = false;
                    } else {
                        z2 = true;
                        z3 = false;
                        c13770e.m3676strictfp(-364050049);
                    }
                    c13770e.Signature(z3);
                    c13770e.Signature(z2);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C2277e c2277e = (C2277e) obj8;
                String str4 = (String) obj7;
                C2892e c2892e3 = (C2892e) obj6;
                EnumC14399e enumC14399e = (EnumC14399e) obj5;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    InterfaceC2747e license7 = AbstractC17074e.license(C5438e.f11676e, false);
                    long j4 = c13770e2.f27286case;
                    int i9 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC3483e advert4 = c13770e2.advert();
                    InterfaceC12864e purchase7 = AbstractC5679e.purchase(c13770e2, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e2 = C2721e.vip;
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e2);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e2, license7, C2721e.billing);
                    AbstractC2270e.yandex(c13770e2, advert4, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e2, Integer.valueOf(i9), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e2, purchase7, C2721e.license);
                    if (z4) {
                        c13770e2.m3676strictfp(-6310935);
                        if (AbstractC7890e.billing(c2277e.license, "artist")) {
                            C5767e c5767e = c2277e.appmetrica;
                            str2 = c5767e != null ? c5767e.ad : null;
                        } else {
                            str2 = str4;
                        }
                        AbstractC8461e.ad(str2, null, AbstractC10075e.metrica(AbstractC18007e.metrica(c0115e, 1.0f), false), C16477e.ad, null, c13770e2, 1573296, 1976);
                    } else {
                        c13770e2.m3676strictfp(-35476138);
                    }
                    c13770e2.Signature(false);
                    AbstractC0865e.ad(C14486e.ad.ad(c0115e, C5438e.f11695e), ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).metrica.license, AbstractC12322e.vip(C3618e.appmetrica, C3618e.vip, 0L, 0L, c13770e2, 54, 12), null, null, AbstractC16653e.license(1102100286, new C11194e(c2277e, z4, c2892e3, enumC14399e), c13770e2), c13770e2, 196608, 24);
                    c13770e2.Signature(true);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
