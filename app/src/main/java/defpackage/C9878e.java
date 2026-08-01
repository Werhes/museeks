package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۤٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9878e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f19478e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ AbstractC11424e f19479e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f19480e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9878e(int i, int i2, InterfaceC5083e interfaceC5083e) {
        super(i, interfaceC5083e);
        this.f19478e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9878e(AbstractC13550e abstractC13550e, InterfaceC5083e interfaceC5083e) {
        super(3, interfaceC5083e);
        this.f19478e = 3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC11424e abstractC11424e = (AbstractC11424e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj3;
        switch (this.f19478e) {
            case 0:
                C9878e c9878e = new C9878e(3, 0, interfaceC5083e);
                c9878e.f19479e = abstractC11424e;
                return c9878e.loadAd(Unit.INSTANCE);
            case 1:
                C9878e c9878e2 = new C9878e(3, 1, interfaceC5083e);
                c9878e2.f19479e = abstractC11424e;
                return c9878e2.loadAd(Unit.INSTANCE);
            case 2:
                C9878e c9878e3 = new C9878e(3, 2, interfaceC5083e);
                c9878e3.f19479e = abstractC11424e;
                return c9878e3.loadAd(Unit.INSTANCE);
            default:
                C9878e c9878e4 = new C9878e(null, interfaceC5083e);
                c9878e4.f19479e = abstractC11424e;
                return c9878e4.loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        InterfaceC13984e interfaceC13984e;
        InterfaceC13984e interfaceC13984e2;
        InterfaceC13984e interfaceC13984e3;
        int i = this.f19478e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        switch (i) {
            case 0:
                AbstractC11424e abstractC11424e = this.f19479e;
                int i2 = this.f19480e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    Object obj2 = abstractC11424e.f22964e;
                    C8208e c8208e = AbstractC17667e.ad;
                    if (((InterfaceC8376e) obj2).loadAd().admob()) {
                        return Unit.INSTANCE;
                    }
                    InterfaceC8376e interfaceC8376e = (InterfaceC8376e) obj2;
                    C2394e smaato = interfaceC8376e.loadAd().smaato();
                    if (smaato == null && (smaato = (C2394e) interfaceC8376e.getAttributes().purchase(AbstractC12044e.ad)) == null) {
                        smaato = C2394e.f6123e;
                    }
                    InterfaceC7227e vip = AbstractC3820e.ad.vip(C2394e.class);
                    try {
                        interfaceC13984e = AbstractC3820e.ad(C2394e.class);
                    } catch (Throwable unused) {
                        interfaceC13984e = null;
                    }
                    C12025e c12025e = new C12025e(vip, interfaceC13984e);
                    this.f19479e = null;
                    this.f19480e = 1;
                    if (interfaceC8376e.mo325static(smaato, c12025e, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC11424e abstractC11424e2 = this.f19479e;
                int i3 = this.f19480e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f19479e = null;
                    this.f19480e = 1;
                    if (AbstractC16155e.ad(abstractC11424e2, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 2:
                AbstractC11424e abstractC11424e3 = this.f19479e;
                int i4 = this.f19480e;
                try {
                } catch (C2806e e) {
                    String message = e.getMessage();
                    if (message == null) {
                        InterfaceC8376e interfaceC8376e2 = (InterfaceC8376e) abstractC11424e3.f22964e;
                        C2394e c2394e = C2394e.f6120e;
                        InterfaceC7227e vip2 = AbstractC3820e.ad.vip(C2394e.class);
                        try {
                            interfaceC13984e3 = AbstractC3820e.ad(C2394e.class);
                        } catch (Throwable unused2) {
                            interfaceC13984e3 = null;
                        }
                        C12025e c12025e2 = new C12025e(vip2, interfaceC13984e3);
                        this.f19479e = null;
                        this.f19480e = 2;
                        if (interfaceC8376e2.mo325static(c2394e, c12025e2, this) == enumC2821e) {
                            return enumC2821e;
                        }
                    } else {
                        InterfaceC8376e interfaceC8376e3 = (InterfaceC8376e) abstractC11424e3.f22964e;
                        interfaceC8376e3.loadAd().billing(C2394e.f6120e);
                        InterfaceC7227e vip3 = AbstractC3820e.ad.vip(String.class);
                        try {
                            interfaceC13984e2 = AbstractC3820e.ad(String.class);
                        } catch (Throwable unused3) {
                            interfaceC13984e2 = null;
                        }
                        C12025e c12025e3 = new C12025e(vip3, interfaceC13984e2);
                        this.f19479e = null;
                        this.f19480e = 3;
                        if (interfaceC8376e3.mo325static(message, c12025e3, this) == enumC2821e) {
                            return enumC2821e;
                        }
                    }
                }
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f19479e = abstractC11424e3;
                    this.f19480e = 1;
                    if (abstractC11424e3.appmetrica(this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2 && i4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                AbstractC11424e abstractC11424e4 = this.f19479e;
                int i5 = this.f19480e;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return Unit.INSTANCE;
                }
                AbstractC2003e.purchase(obj);
                this.f19479e = null;
                this.f19480e = 1;
                throw null;
        }
    }
}
