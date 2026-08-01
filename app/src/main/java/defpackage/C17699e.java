package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٟ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17699e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f34684e = 0;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ Object f34685e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ Object f34686e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ Object f34687e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Object f34688e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ AbstractC11424e f34689e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f34690e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17699e(C6544e c6544e, C4524e c4524e, Function3 function3, InterfaceC5083e interfaceC5083e) {
        super(3, interfaceC5083e);
        this.f34688e = c6544e;
        this.f34685e = c4524e;
        this.f34687e = function3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17699e(C9398e c9398e, C14947e c14947e, InterfaceC5083e interfaceC5083e) {
        super(3, interfaceC5083e);
        this.f34685e = c9398e;
        this.f34687e = c14947e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C17699e(C16701e c16701e, String str, C2751e c2751e, Function2 function2, InterfaceC5083e interfaceC5083e) {
        super(3, interfaceC5083e);
        this.f34686e = c16701e;
        this.f34688e = str;
        this.f34685e = c2751e;
        this.f34687e = (C7460e) function2;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [eؚۛۖ, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC11424e abstractC11424e = (AbstractC11424e) obj;
        switch (this.f34684e) {
            case 0:
                C17699e c17699e = new C17699e((C6544e) this.f34688e, (C4524e) this.f34685e, (Function3) this.f34687e, (InterfaceC5083e) obj3);
                c17699e.f34689e = abstractC11424e;
                c17699e.f34686e = obj2;
                return c17699e.loadAd(Unit.INSTANCE);
            case 1:
                C17699e c17699e2 = new C17699e((C9398e) this.f34685e, (C14947e) this.f34687e, (InterfaceC5083e) obj3);
                c17699e2.f34689e = abstractC11424e;
                c17699e2.f34686e = obj2;
                return c17699e2.loadAd(Unit.INSTANCE);
            default:
                C17699e c17699e3 = new C17699e((C16701e) this.f34686e, (String) this.f34688e, (C2751e) this.f34685e, (C7460e) this.f34687e, (InterfaceC5083e) obj3);
                c17699e3.f34689e = abstractC11424e;
                return c17699e3.loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r6v21, types: [eؚۛۖ, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        Object purchase;
        InterfaceC13984e interfaceC13984e;
        C10017e c10017e;
        Object advert;
        InterfaceC13984e interfaceC13984e2;
        switch (this.f34684e) {
            case 0:
                AbstractC11424e abstractC11424e = this.f34689e;
                Object obj2 = this.f34686e;
                int i = this.f34690e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    Object obj3 = abstractC11424e.f22964e;
                    if (obj3 instanceof C18325e) {
                        C11997e c11997e = ((C18325e) obj3).f35984e;
                        C6544e c6544e = (C6544e) this.f34688e;
                        C11997e c11997e2 = c11997e;
                        while (true) {
                            purchase = AbstractC2094e.metrica(c11997e2).purchase(c6544e.getKey());
                            if (purchase == null) {
                                C11997e c11997e3 = c11997e2.f23979e;
                                if (c11997e3 == null) {
                                    purchase = c11997e2 instanceof C7000e ? AbstractC2094e.metrica(AbstractC12044e.ad(c11997e)).purchase(c6544e.getKey()) : null;
                                } else {
                                    c11997e2 = c11997e3;
                                }
                            }
                        }
                        if (AbstractC7890e.billing(purchase, (C4524e) this.f34685e)) {
                            Function3 function3 = (Function3) this.f34687e;
                            this.f34689e = null;
                            this.f34686e = null;
                            this.f34690e = 1;
                            Object invoke = function3.invoke(abstractC11424e, obj2, this);
                            EnumC2821e enumC2821e = EnumC2821e.f6782e;
                            if (invoke == enumC2821e) {
                                return enumC2821e;
                            }
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 1:
                C14947e c14947e = (C14947e) this.f34687e;
                C9398e c9398e = (C9398e) this.f34685e;
                C5389e c5389e = c9398e.f18708e;
                AbstractC11424e abstractC11424e2 = this.f34689e;
                Object obj4 = this.f34686e;
                int i2 = this.f34690e;
                EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C10263e c10263e = new C10263e();
                    C10263e c10263e2 = (C10263e) abstractC11424e2.f22964e;
                    c10263e.appmetrica = c10263e2.appmetrica;
                    c10263e.metrica(c10263e2);
                    if (obj4 == null) {
                        c10263e.license = C16676e.ad;
                        InterfaceC7227e vip = AbstractC3820e.ad.vip(Object.class);
                        try {
                            interfaceC13984e2 = AbstractC3820e.ad(Object.class);
                        } catch (Throwable unused) {
                            interfaceC13984e2 = null;
                        }
                        c10263e.vip(new C12025e(vip, interfaceC13984e2));
                    } else if (obj4 instanceof AbstractC14601e) {
                        c10263e.license = obj4;
                        c10263e.vip(null);
                    } else {
                        c10263e.license = obj4;
                        InterfaceC7227e vip2 = AbstractC3820e.ad.vip(Object.class);
                        try {
                            interfaceC13984e = AbstractC3820e.ad(Object.class);
                        } catch (Throwable unused2) {
                            interfaceC13984e = null;
                        }
                        c10263e.vip(new C12025e(vip2, interfaceC13984e));
                    }
                    c5389e.premium(AbstractC2774e.f6684e, c10263e);
                    C6399e vip3 = c10263e.ad.vip();
                    C3434e c3434e = c10263e.vip;
                    C0069e m2759e = c10263e.metrica.m2759e();
                    Object obj5 = c10263e.license;
                    AbstractC14601e abstractC14601e = obj5 instanceof AbstractC14601e ? (AbstractC14601e) obj5 : null;
                    if (abstractC14601e == null) {
                        throw new IllegalStateException(("No request transformation found: " + c10263e.license).toString());
                    }
                    C11380e c11380e = c10263e.appmetrica;
                    C5874e c5874e = c10263e.purchase;
                    c10017e = new C10017e(vip3, c3434e, m2759e, abstractC14601e, c11380e, c5874e);
                    c5874e.billing(AbstractC16841e.vip, c9398e.f18703e);
                    Set mo458e = m2759e.mo458e();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj6 : mo458e) {
                        if (AbstractC16404e.vip.contains((String) obj6)) {
                            arrayList.add(obj6);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        throw new C15001e(arrayList.toString());
                    }
                    for (InterfaceC2911e interfaceC2911e : (Set) c10017e.f19787e) {
                        if (!c14947e.f29631e.contains(interfaceC2911e)) {
                            throw new IllegalArgumentException(("Engine doesn't support " + interfaceC2911e).toString());
                        }
                    }
                    this.f34689e = abstractC11424e2;
                    this.f34686e = null;
                    this.f34688e = c10017e;
                    this.f34690e = 1;
                    advert = AbstractC0869e.advert(c14947e, c10017e, this);
                    if (advert == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    C10017e c10017e2 = (C10017e) this.f34688e;
                    AbstractC2003e.purchase(obj);
                    c10017e = c10017e2;
                    advert = obj;
                }
                C8788e c8788e = (C8788e) advert;
                C5042e c5042e = new C5042e(c9398e);
                c5042e.f10751e = new C17243e(c5042e, c10017e);
                c5042e.f10750e = new C17289e(c5042e, c8788e);
                C5874e attributes = c5042e.getAttributes();
                C8208e c8208e = C5042e.f10748e;
                attributes.appmetrica().remove(c8208e);
                Object obj7 = c8788e.appmetrica;
                if (!(obj7 instanceof InterfaceC13033e)) {
                    c5042e.getAttributes().billing(c8208e, obj7);
                }
                AbstractC16824e abstractC16824e = c5042e.f10750e;
                if (abstractC16824e == null) {
                    abstractC16824e = null;
                }
                c5389e.premium(AbstractC2774e.f6683e, abstractC16824e);
                AbstractC6629e.startapp(abstractC16824e.advert()).mo692else(new C9041e(c9398e, abstractC16824e, 22));
                this.f34689e = null;
                this.f34686e = null;
                this.f34688e = null;
                this.f34690e = 2;
                if (abstractC11424e2.purchase(this, c5042e) == enumC2821e2) {
                    return enumC2821e2;
                }
                return Unit.INSTANCE;
            default:
                AbstractC11424e abstractC11424e3 = this.f34689e;
                int i3 = this.f34690e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    C16701e c16701e = (C16701e) this.f34686e;
                    C8208e c8208e2 = c16701e.ad;
                    Object obj8 = c16701e.startapp;
                    String str = c8208e2.ad;
                    C4811e c4811e = new C4811e(c8208e2, (String) this.f34688e, (C2751e) this.f34685e, (C7460e) this.f34687e, obj8, abstractC11424e3, null);
                    InterfaceC5083e interfaceC5083e = null;
                    this.f34689e = null;
                    this.f34690e = 1;
                    Object invoke2 = !AbstractC1452e.ad() ? c4811e.invoke(this) : AbstractC5336e.advert(this.f21135e.mo394const(new C11381e(str)), new C15238e(c4811e, interfaceC5083e, 17), this);
                    EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                    if (invoke2 == enumC2821e3) {
                        return enumC2821e3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
