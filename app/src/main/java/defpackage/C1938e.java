package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1938e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f5132e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC13742e f5133e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C7765e f5134e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f5135e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1938e(C7765e c7765e, InterfaceC13742e interfaceC13742e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f5132e = i;
        this.f5134e = c7765e;
        this.f5133e = interfaceC13742e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1938e(InterfaceC13742e interfaceC13742e, C7765e c7765e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f5132e = 3;
        this.f5133e = interfaceC13742e;
        this.f5134e = c7765e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f5132e) {
            case 0:
                return new C1938e(this.f5134e, this.f5133e, interfaceC5083e, 0);
            case 1:
                return new C1938e(this.f5134e, this.f5133e, interfaceC5083e, 1);
            case 2:
                return new C1938e(this.f5134e, this.f5133e, interfaceC5083e, 2);
            case 3:
                return new C1938e(this.f5133e, this.f5134e, interfaceC5083e);
            default:
                return new C1938e(this.f5134e, this.f5133e, interfaceC5083e, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f5132e) {
            case 0:
                return ((C1938e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C1938e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C1938e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C1938e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C1938e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f5132e) {
            case 0:
                int i = this.f5135e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f5135e = 1;
                    Object startapp = this.f5134e.startapp(this.f5133e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (startapp == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i2 = this.f5135e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f5135e = 1;
                    Object startapp2 = this.f5134e.startapp(this.f5133e, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (startapp2 == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 2:
                int i3 = this.f5135e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f5135e = 1;
                    Object ad = C7765e.ad(this.f5134e, this.f5133e, this);
                    EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                    if (ad == enumC2821e3) {
                        return enumC2821e3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 3:
                int i4 = this.f5135e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    C1017e c1017e = new C1017e(this.f5134e, 1);
                    this.f5135e = 1;
                    Object appmetrica = AbstractC9939e.appmetrica(this.f5133e, null, c1017e, this, 7);
                    EnumC2821e enumC2821e4 = EnumC2821e.f6782e;
                    if (appmetrica == enumC2821e4) {
                        return enumC2821e4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i5 = this.f5135e;
                if (i5 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f5135e = 1;
                    Object startapp3 = this.f5134e.startapp(this.f5133e, this);
                    EnumC2821e enumC2821e5 = EnumC2821e.f6782e;
                    if (startapp3 == enumC2821e5) {
                        return enumC2821e5;
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
