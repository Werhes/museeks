package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۢ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7538e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f15365e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C0110e f15366e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f15367e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7538e(C0110e c0110e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f15365e = i;
        this.f15366e = c0110e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f15365e) {
            case 0:
                return new C7538e(this.f15366e, interfaceC5083e, 0);
            case 1:
                return new C7538e(this.f15366e, interfaceC5083e, 1);
            case 2:
                return new C7538e(this.f15366e, interfaceC5083e, 2);
            case 3:
                return new C7538e(this.f15366e, interfaceC5083e, 3);
            default:
                return new C7538e(this.f15366e, interfaceC5083e, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f15365e) {
            case 0:
                return ((C7538e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C7538e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C7538e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C7538e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C7538e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f15365e;
        C0110e c0110e = this.f15366e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        switch (i) {
            case 0:
                int i2 = this.f15367e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C7558e c7558e = c0110e.Signature;
                    Float f = new Float(1.0f);
                    this.f15367e = 1;
                    if (c7558e.purchase(this, f) == enumC2821e) {
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
                int i3 = this.f15367e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    C7558e c7558e2 = c0110e.loadAd;
                    C11490e c11490e = new C11490e(0L);
                    this.f15367e = 1;
                    if (c7558e2.purchase(this, c11490e) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                int i4 = C0110e.pro;
                c0110e.yandex(0L);
                c0110e.billing(false);
                return Unit.INSTANCE;
            case 2:
                int i5 = this.f15367e;
                if (i5 == 0) {
                    AbstractC2003e.purchase(obj);
                    C7558e c7558e3 = c0110e.loadAd;
                    this.f15367e = 1;
                    if (c7558e3.billing(this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 3:
                int i6 = this.f15367e;
                if (i6 == 0) {
                    AbstractC2003e.purchase(obj);
                    C7558e c7558e4 = c0110e.Signature;
                    this.f15367e = 1;
                    if (c7558e4.billing(this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i7 = this.f15367e;
                if (i7 == 0) {
                    AbstractC2003e.purchase(obj);
                    C7558e c7558e5 = c0110e.Signature;
                    this.f15367e = 1;
                    if (c7558e5.billing(this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
