package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۦ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12122e extends AbstractC16858e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f24285e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f24286e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f24287e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f24288e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f24289e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12122e(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(3);
        this.f24287e = i;
        this.f24286e = obj;
        this.f24288e = obj2;
        this.f24285e = obj3;
        this.f24289e = obj4;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C13770e c13770e;
        C13119e startapp;
        switch (this.f24287e) {
            case 0:
                InterfaceC6340e interfaceC6340e = (InterfaceC6340e) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue = ((Number) obj3).intValue();
                C12742e c12742e = (C12742e) this.f24286e;
                C15921e c15921e = (C15921e) this.f24285e;
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? c13770e2.purchase(interfaceC6340e) : c13770e2.yandex(interfaceC6340e) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    boolean purchase = c13770e2.purchase(c12742e);
                    Object obj4 = this.f24288e;
                    boolean yandex = purchase | c13770e2.yandex(obj4) | c13770e2.yandex(c15921e);
                    Object m3681throw = c13770e2.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    if (yandex || m3681throw == c5170e) {
                        m3681throw = new C7314e(1, c12742e, obj4, c15921e);
                        c13770e2.m3682throws(m3681throw);
                    }
                    AbstractC17680e.vip(interfaceC6340e, (Function1) m3681throw, c13770e2);
                    c15921e.license.amazon(obj4, ((C1382e) interfaceC6340e).vip);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (m3681throw2 == c5170e) {
                        m3681throw2 = new C0246e(interfaceC6340e);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    ((Function4) this.f24289e).invoke((C0246e) m3681throw2, obj4, c13770e2, 0);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC12864e interfaceC12864e = (InterfaceC12864e) obj;
                C13770e c13770e3 = (C13770e) obj2;
                ((Number) obj3).intValue();
                Object obj5 = (Function0) this.f24289e;
                C12692e c12692e = (C12692e) this.f24286e;
                c13770e3.m3676strictfp(231415144);
                c13770e3.m3676strictfp(-1020090083);
                Object m3681throw3 = c13770e3.m3681throw();
                Object obj6 = C2987e.ad;
                if (m3681throw3 == obj6) {
                    m3681throw3 = AbstractC14533e.startapp(new C2152e(0L));
                    c13770e3.m3682throws(m3681throw3);
                }
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw3;
                c13770e3.Signature(false);
                c13770e3.m3676strictfp(-1020087938);
                Object m3681throw4 = c13770e3.m3681throw();
                if (m3681throw4 == obj6) {
                    m3681throw4 = AbstractC14533e.startapp(new C12729e(0L));
                    c13770e3.m3682throws(m3681throw4);
                }
                InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) m3681throw4;
                c13770e3.Signature(false);
                Object m3681throw5 = c13770e3.m3681throw();
                if (m3681throw5 == obj6) {
                    Object c12261e = new C12261e(AbstractC17680e.startapp(c13770e3));
                    c13770e3.m3682throws(c12261e);
                    m3681throw5 = c12261e;
                }
                Object obj7 = ((C12261e) m3681throw5).f24591e;
                c13770e3.m3676strictfp(-1020083824);
                Object m3681throw6 = c13770e3.m3681throw();
                if (m3681throw6 == obj6) {
                    m3681throw6 = new C11899e(interfaceC3314e, interfaceC3314e2, 2);
                    c13770e3.m3682throws(m3681throw6);
                }
                c13770e3.Signature(false);
                InterfaceC12864e license = AbstractC11261e.license(interfaceC12864e, (Function1) m3681throw6);
                C10743e c10743e = c12692e.ad;
                Object obj8 = c12692e.vip;
                c10743e.getClass();
                boolean z = ((Boolean) AbstractC14533e.purchase(new C14194e(obj8, c10743e, 10)).getValue()).booleanValue() || !((Boolean) c12692e.ad.mopub.getValue()).booleanValue();
                C15274e c15274e = (C15274e) this.f24288e;
                c13770e3.m3676strictfp(-1020069521);
                boolean yandex2 = c13770e3.yandex(obj7) | c13770e3.purchase(c12692e) | c13770e3.purchase((Function1) this.f24285e);
                Function1 function1 = (Function1) this.f24285e;
                C12692e c12692e2 = (C12692e) this.f24286e;
                Object m3681throw7 = c13770e3.m3681throw();
                if (yandex2 || m3681throw7 == obj6) {
                    m3681throw7 = new C11759e(obj7, function1, c12692e2, interfaceC3314e, interfaceC3314e2, 3);
                    c13770e3.m3682throws(m3681throw7);
                }
                Function1 function12 = (Function1) m3681throw7;
                c13770e3.Signature(false);
                c13770e3.m3676strictfp(-1020052768);
                boolean purchase2 = c13770e3.purchase(c12692e) | c13770e3.purchase(obj5);
                Object m3681throw8 = c13770e3.m3681throw();
                if (purchase2 || m3681throw8 == obj6) {
                    m3681throw8 = new C14194e(c12692e, obj5, 9);
                    c13770e3.m3682throws(m3681throw8);
                }
                Function0 function0 = (Function0) m3681throw8;
                c13770e3.Signature(false);
                c13770e3.m3676strictfp(-1020048579);
                boolean purchase3 = c13770e3.purchase(c12692e);
                Object m3681throw9 = c13770e3.m3681throw();
                if (purchase3 || m3681throw9 == obj6) {
                    m3681throw9 = new C1827e(8, c12692e);
                    c13770e3.m3682throws(m3681throw9);
                }
                c13770e3.Signature(false);
                InterfaceC12864e metrica = AbstractC5679e.metrica(license, new C14700e(c10743e, c15274e, function0, z, function12, (Function2) m3681throw9));
                c13770e3.Signature(false);
                return metrica;
            default:
                InterfaceC12864e interfaceC12864e2 = (InterfaceC12864e) obj;
                C13770e c13770e4 = (C13770e) obj2;
                ((Number) obj3).intValue();
                C8082e c8082e = C8082e.f16411e;
                C13119e c13119e = (C13119e) this.f24288e;
                c13770e4.m3676strictfp(-1539505585);
                C9185e c9185e = (C9185e) this.f24286e;
                Object obj9 = c9185e.ad;
                c13770e4.m3662final(-1996110647, obj9);
                C13610e c13610e = (C13610e) this.f24285e;
                Object m3681throw10 = c13770e4.m3681throw();
                C5170e c5170e2 = C2987e.ad;
                if (m3681throw10 == c5170e2) {
                    C11952e c11952e = c13610e.f27002e;
                    C7589e c7589e = (C7589e) c11952e.get(obj9);
                    if (c7589e == null) {
                        c7589e = new C7589e(obj9, c13610e);
                        c11952e.put(obj9, c7589e);
                    }
                    m3681throw10 = c7589e;
                    c13770e4.m3682throws(m3681throw10);
                }
                C7589e c7589e2 = (C7589e) m3681throw10;
                c13770e4.m3662final(-1996106866, c13119e);
                if (c13119e != null) {
                    c13770e4.m3676strictfp(-1749734647);
                    String obj10 = obj9.toString();
                    boolean purchase4 = c13770e4.purchase(c13119e);
                    Object m3681throw11 = c13770e4.m3681throw();
                    if (purchase4 || m3681throw11 == c5170e2) {
                        m3681throw11 = c13119e.metrica();
                        c13770e4.m3682throws(m3681throw11);
                    }
                    if (c13119e.billing()) {
                        m3681throw11 = c13119e.metrica();
                    }
                    c13770e4.m3676strictfp(1498260051);
                    Boolean bool = (Boolean) c8082e.invoke(m3681throw11);
                    c13770e4.Signature(false);
                    Object value = c13119e.license.getValue();
                    c13770e4.m3676strictfp(1498260051);
                    Boolean bool2 = (Boolean) c8082e.invoke(value);
                    c13770e4.Signature(false);
                    c13770e = c13770e4;
                    startapp = AbstractC0207e.appmetrica(c13119e, bool, bool2, obj10, c13770e, 0);
                    c13770e.Signature(false);
                } else {
                    c13770e = c13770e4;
                    c13770e.m3676strictfp(-1749482679);
                    boolean z2 = true;
                    AbstractC9476e.purchase(1, c8082e);
                    Boolean bool3 = (Boolean) c8082e.invoke(Unit.INSTANCE);
                    boolean booleanValue = bool3.booleanValue();
                    Object m3681throw12 = c13770e.m3681throw();
                    if (m3681throw12 == c5170e2) {
                        if (c7589e2.metrica().isEmpty()) {
                            z2 = booleanValue;
                        } else if (booleanValue) {
                            z2 = false;
                        }
                        m3681throw12 = new C0351e(Boolean.valueOf(z2));
                        c13770e.m3682throws(m3681throw12);
                    }
                    C0351e c0351e = (C0351e) m3681throw12;
                    c0351e.metrica.setValue(bool3);
                    startapp = AbstractC0207e.startapp(c0351e, null, c13770e, 0, 2);
                    c13770e.Signature(false);
                }
                c13770e.m3662final(-1996043323, Boolean.valueOf(c13610e.vip()));
                C13770e c13770e5 = c13770e;
                C15037e purchase5 = AbstractC0207e.purchase(startapp, AbstractC9546e.startapp, null, c13770e5, 0, 2);
                c13770e5.Signature(false);
                boolean purchase6 = c13770e5.purchase(startapp);
                Object m3681throw13 = c13770e5.m3681throw();
                if (purchase6 || m3681throw13 == c5170e2) {
                    m3681throw13 = new C11120e(c13610e, startapp, purchase5, c7589e2.yandex);
                    c13770e5.m3682throws(m3681throw13);
                }
                C11120e c11120e = (C11120e) m3681throw13;
                if (!AbstractC7890e.billing((C15037e) c11120e.license.getValue(), purchase5)) {
                    c11120e.license.setValue(purchase5);
                    c11120e.billing.setValue(null);
                    c11120e.purchase = AbstractC0197e.ad;
                }
                c11120e.appmetrica.setValue(AbstractC5797e.vip);
                c13770e5.Signature(false);
                C14613e c14613e = (C14613e) this.f24289e;
                Object m3681throw14 = c13770e5.m3681throw();
                if (m3681throw14 == c5170e2) {
                    m3681throw14 = new C16223e(c7589e2, c11120e, c14613e, c9185e);
                    c13770e5.m3682throws(m3681throw14);
                }
                C16223e c16223e = (C16223e) m3681throw14;
                c9185e.metrica.setValue(c16223e);
                c16223e.f31881e.setValue(c7589e2);
                C0576e c0576e = c16223e.f31884e;
                Boolean bool4 = Boolean.TRUE;
                c0576e.setValue(bool4);
                c16223e.f31873e.setValue(c11120e);
                c16223e.f31885e.setValue(C5496e.vip);
                c16223e.f31879e.setValue(c14613e);
                c16223e.f31878e.startapp(0.0f);
                c16223e.f31876e.setValue(bool4);
                c16223e.f31882e.setValue(c9185e);
                c13770e5.Signature(false);
                InterfaceC12864e premium = interfaceC12864e2.premium(new C11082e(c16223e));
                c13770e5.Signature(false);
                return premium;
        }
    }
}
