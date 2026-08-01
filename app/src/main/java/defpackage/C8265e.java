package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۡؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8265e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f16774e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Function3 f16775e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ AbstractC11424e f16776e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f16777e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8265e(Function3 function3, InterfaceC5083e interfaceC5083e, int i) {
        super(3, interfaceC5083e);
        this.f16774e = i;
        this.f16775e = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC11424e abstractC11424e = (AbstractC11424e) obj;
        switch (this.f16774e) {
            case 0:
                C8265e c8265e = new C8265e(this.f16775e, (InterfaceC5083e) obj3, 0);
                c8265e.f16776e = abstractC11424e;
                return c8265e.loadAd(Unit.INSTANCE);
            case 1:
                C8265e c8265e2 = new C8265e(this.f16775e, (InterfaceC5083e) obj3, 1);
                c8265e2.f16776e = abstractC11424e;
                return c8265e2.loadAd(Unit.INSTANCE);
            case 2:
                C8265e c8265e3 = new C8265e(this.f16775e, (InterfaceC5083e) obj3, 2);
                c8265e3.f16776e = abstractC11424e;
                return c8265e3.loadAd(Unit.INSTANCE);
            default:
                C8265e c8265e4 = new C8265e(this.f16775e, (InterfaceC5083e) obj3, 3);
                c8265e4.f16776e = abstractC11424e;
                return c8265e4.loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        Object invoke;
        Object invoke2;
        Object invoke3;
        int i = this.f16774e;
        Function3 function3 = this.f16775e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        switch (i) {
            case 0:
                AbstractC11424e abstractC11424e = this.f16776e;
                int i2 = this.f16777e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    Object obj2 = abstractC11424e.f22964e;
                    AbstractC14601e abstractC14601e = (AbstractC14601e) abstractC11424e.metrica();
                    this.f16776e = abstractC11424e;
                    this.f16777e = 1;
                    invoke = function3.invoke(obj2, abstractC14601e, this);
                    if (invoke == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                    invoke = obj;
                }
                AbstractC14601e abstractC14601e2 = (AbstractC14601e) invoke;
                if (abstractC14601e2 != null) {
                    this.f16776e = null;
                    this.f16777e = 2;
                    if (abstractC11424e.purchase(this, abstractC14601e2) == enumC2821e) {
                        return enumC2821e;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC11424e abstractC11424e2 = this.f16776e;
                int i3 = this.f16777e;
                try {
                } catch (Throwable th) {
                    InterfaceC4393e interfaceC4393e = ((C5042e) abstractC11424e2.f22964e).f10751e;
                    if (interfaceC4393e == null) {
                        interfaceC4393e = null;
                    }
                    this.f16776e = null;
                    this.f16777e = 2;
                    invoke2 = function3.invoke(interfaceC4393e, th, this);
                    if (invoke2 == enumC2821e) {
                        return enumC2821e;
                    }
                }
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f16776e = abstractC11424e2;
                    this.f16777e = 1;
                    if (abstractC11424e2.appmetrica(this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        invoke2 = obj;
                        Throwable th2 = (Throwable) invoke2;
                        if (th2 != null) {
                            throw th2;
                        }
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 2:
                AbstractC11424e abstractC11424e3 = this.f16776e;
                int i4 = this.f16777e;
                try {
                } catch (Throwable th3) {
                    C10263e c10263e = (C10263e) abstractC11424e3.f22964e;
                    InterfaceC4911e interfaceC4911e = AbstractC14421e.ad;
                    C10001e c10001e = new C10001e(c10263e);
                    this.f16776e = null;
                    this.f16777e = 2;
                    invoke3 = function3.invoke(c10001e, th3, this);
                    if (invoke3 == enumC2821e) {
                        return enumC2821e;
                    }
                }
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f16776e = abstractC11424e3;
                    this.f16777e = 1;
                    if (abstractC11424e3.appmetrica(this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        invoke3 = obj;
                        Throwable th4 = (Throwable) invoke3;
                        if (th4 != null) {
                            throw th4;
                        }
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                AbstractC11424e abstractC11424e4 = this.f16776e;
                int i5 = this.f16777e;
                if (i5 == 0) {
                    AbstractC2003e.purchase(obj);
                    Object obj3 = abstractC11424e4.f22964e;
                    C11053e c11053e = new C11053e(1, abstractC11424e4, AbstractC11424e.class, "proceed", "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8, 3);
                    this.f16776e = null;
                    this.f16777e = 1;
                    if (function3.invoke(obj3, c11053e, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
