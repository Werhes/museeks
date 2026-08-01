package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؑۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0553e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ long f2720e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2566e f2721e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C5421e f2722e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f2723e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ String f2724e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f2725e = 0;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ int f2726e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ String f2727e;

    public /* synthetic */ C0553e(InterfaceC2566e interfaceC2566e, String str, long j, InterfaceC12123e interfaceC12123e, String str2, C5421e c5421e, int i) {
        this.f2721e = interfaceC2566e;
        this.f2724e = str;
        this.f2720e = j;
        this.f2723e = interfaceC12123e;
        this.f2727e = str2;
        this.f2722e = c5421e;
        this.f2726e = i;
    }

    public /* synthetic */ C0553e(C5421e c5421e, InterfaceC18435e interfaceC18435e, C10339e c10339e, String str, long j, String str2, int i) {
        this.f2722e = c5421e;
        this.f2723e = interfaceC18435e;
        this.f2721e = c10339e;
        this.f2724e = str;
        this.f2720e = j;
        this.f2727e = str2;
        this.f2726e = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f2725e) {
            case 0:
                final InterfaceC12123e interfaceC12123e = (InterfaceC12123e) this.f2723e;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    C16005e vip = ((C0916e) c13770e.adcel(AbstractC12450e.ad)).vip(c13770e);
                    InterfaceC12864e license = AbstractC14783e.license(AbstractC18007e.metrica, this.f2721e.ad(), null);
                    C13964e billing = AbstractC16497e.billing(8);
                    final String str = this.f2724e;
                    boolean purchase = c13770e.purchase(str);
                    final long j = this.f2720e;
                    boolean appmetrica = purchase | c13770e.appmetrica(j) | c13770e.purchase(interfaceC12123e);
                    final String str2 = this.f2727e;
                    boolean purchase2 = appmetrica | c13770e.purchase(str2);
                    final C5421e c5421e = this.f2722e;
                    boolean yandex = purchase2 | c13770e.yandex(c5421e);
                    final int i = this.f2726e;
                    boolean license2 = yandex | c13770e.license(i);
                    Object m3681throw = c13770e.m3681throw();
                    if (license2 || m3681throw == C2987e.ad) {
                        Function1 function1 = new Function1() { // from class: eِؚؔ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                C17213e c17213e = (C17213e) obj4;
                                String str3 = str;
                                long j2 = j;
                                InterfaceC12123e interfaceC12123e2 = interfaceC12123e;
                                String str4 = str2;
                                C5421e c5421e2 = C5421e.this;
                                AbstractC5087e.premium(c17213e, null, null, new C2892e(-2116278536, true, new C5474e(str3, j2, interfaceC12123e2, str4, c5421e2)), 3);
                                AbstractC5087e.premium(c17213e, null, null, new C2892e(-260229727, true, new C3115e(c5421e2, i, 0)), 3);
                                if (c5421e2.m1909transient().ad.mopub != null) {
                                    AbstractC5087e.premium(c17213e, null, null, new C2892e(-1445772291, true, new C10890e(c5421e2, 1)), 3);
                                }
                                if (!c5421e2.m1909transient().ad.adcel.isEmpty()) {
                                    AbstractC5087e.premium(c17213e, null, null, new C2892e(-148822682, true, new C10890e(c5421e2, 2)), 3);
                                }
                                if (c5421e2.m1909transient().ad.metrica.length() > 0) {
                                    AbstractC5087e.premium(c17213e, null, null, new C2892e(-1792771451, true, new C10890e(c5421e2, 3)), 3);
                                }
                                Integer num = c5421e2.m1909transient().metrica.vip;
                                if ((num != null ? num.intValue() : 0) > 0) {
                                    AbstractC5087e.premium(c17213e, null, null, new C2892e(858247076, true, new C10890e(c5421e2, 4)), 3);
                                    List list = (List) c5421e2.m1909transient().metrica.ad;
                                    if (list == null) {
                                        list = C13664e.f27089e;
                                    }
                                    c17213e.mopub(list.size(), null, new C6262e(29, list), new C2892e(802480018, true, new C4290e(list, c5421e2, 20)));
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c13770e.m3682throws(function1);
                        m3681throw = function1;
                    }
                    AbstractC7023e.ad(license, null, vip, billing, null, null, false, null, (Function1) m3681throw, c13770e, 24576, 490);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f2723e;
                InterfaceC12123e interfaceC12123e2 = (InterfaceC12123e) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c13770e2.purchase(interfaceC12123e2) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 19) != 18)) {
                    C5421e c5421e2 = this.f2722e;
                    boolean z = c5421e2.m1906import() instanceof C17104e;
                    boolean yandex2 = c13770e2.yandex(interfaceC18435e) | c13770e2.yandex(c5421e2);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw2 == C2987e.ad) {
                        m3681throw2 = new C8863e(interfaceC18435e, c5421e2, 0);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC11148e.vip(z, (Function0) m3681throw2, null, null, null, null, false, 0.0f, AbstractC16653e.license(522055469, new C0553e(this.f2721e, this.f2724e, this.f2720e, interfaceC12123e2, this.f2727e, c5421e2, this.f2726e), c13770e2), c13770e2, 100663296, 252);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
