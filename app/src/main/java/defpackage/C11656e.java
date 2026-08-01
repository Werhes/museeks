package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَِ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11656e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f23426e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ AbstractC16824e f23427e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f23428e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ AbstractC11424e f23429e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f23430e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11656e(Function2 function2, InterfaceC5083e interfaceC5083e, int i) {
        super(3, interfaceC5083e);
        this.f23426e = i;
        this.f23428e = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC11424e abstractC11424e = (AbstractC11424e) obj;
        AbstractC16824e abstractC16824e = (AbstractC16824e) obj2;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj3;
        switch (this.f23426e) {
            case 0:
                C11656e c11656e = new C11656e(this.f23428e, interfaceC5083e, 0);
                c11656e.f23429e = abstractC11424e;
                c11656e.f23427e = abstractC16824e;
                return c11656e.loadAd(Unit.INSTANCE);
            default:
                C11656e c11656e2 = new C11656e(this.f23428e, interfaceC5083e, 1);
                c11656e2.f23429e = abstractC11424e;
                c11656e2.f23427e = abstractC16824e;
                return c11656e2.loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f23426e) {
            case 0:
                AbstractC11424e abstractC11424e = this.f23429e;
                AbstractC16824e abstractC16824e = this.f23427e;
                int i = this.f23430e;
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f23429e = abstractC11424e;
                    this.f23427e = null;
                    this.f23430e = 1;
                    obj = this.f23428e.invoke(abstractC16824e, this);
                    if (obj == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                AbstractC16824e abstractC16824e2 = (AbstractC16824e) obj;
                if (abstractC16824e2 != null) {
                    this.f23429e = null;
                    this.f23427e = null;
                    this.f23430e = 2;
                    if (abstractC11424e.purchase(this, abstractC16824e2) == enumC2821e) {
                        return enumC2821e;
                    }
                }
                return Unit.INSTANCE;
            default:
                AbstractC11424e abstractC11424e2 = this.f23429e;
                AbstractC16824e abstractC16824e3 = this.f23427e;
                int i2 = this.f23430e;
                EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f23429e = abstractC11424e2;
                    this.f23427e = null;
                    this.f23430e = 1;
                    obj = this.f23428e.invoke(abstractC16824e3, this);
                    if (obj == enumC2821e2) {
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
                    AbstractC2003e.purchase(obj);
                }
                AbstractC16824e abstractC16824e4 = (AbstractC16824e) obj;
                if (abstractC16824e4 != null) {
                    this.f23429e = null;
                    this.f23427e = null;
                    this.f23430e = 2;
                    if (abstractC11424e2.purchase(this, abstractC16824e4) == enumC2821e2) {
                        return enumC2821e2;
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
