package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٓۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13959e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f27675e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C3229e f27676e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f27677e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13959e(C3229e c3229e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f27675e = i;
        this.f27676e = c3229e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f27675e) {
            case 0:
                return new C13959e(this.f27676e, interfaceC5083e, 0);
            case 1:
                return new C13959e(this.f27676e, interfaceC5083e, 1);
            case 2:
                return new C13959e(this.f27676e, interfaceC5083e, 2);
            case 3:
                return new C13959e(this.f27676e, interfaceC5083e, 3);
            case 4:
                return new C13959e(this.f27676e, interfaceC5083e, 4);
            case 5:
                return new C13959e(this.f27676e, interfaceC5083e, 5);
            case 6:
                return new C13959e(this.f27676e, interfaceC5083e, 6);
            case 7:
                return new C13959e(this.f27676e, interfaceC5083e, 7);
            case 8:
                return new C13959e(this.f27676e, interfaceC5083e, 8);
            case 9:
                return new C13959e(this.f27676e, interfaceC5083e, 9);
            default:
                return new C13959e(this.f27676e, interfaceC5083e, 10);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f27675e) {
            case 0:
                return ((C13959e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C13959e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C13959e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C13959e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C13959e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C13959e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C13959e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 7:
                return ((C13959e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 8:
                return ((C13959e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 9:
                return ((C13959e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C13959e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f27675e) {
            case 0:
                int i = this.f27677e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f27677e = 1;
                    Object startapp = this.f27676e.startapp(this);
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
                int i2 = this.f27677e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f27677e = 1;
                    Object purchase = this.f27676e.purchase(this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (purchase == enumC2821e2) {
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
                int i3 = this.f27677e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f27677e = 1;
                    Object yandex = this.f27676e.yandex(this);
                    EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                    if (yandex == enumC2821e3) {
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
                int i4 = this.f27677e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f27677e = 1;
                    Object purchase2 = this.f27676e.purchase(this);
                    EnumC2821e enumC2821e4 = EnumC2821e.f6782e;
                    if (purchase2 == enumC2821e4) {
                        return enumC2821e4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 4:
                int i5 = this.f27677e;
                if (i5 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f27677e = 1;
                    Object yandex2 = this.f27676e.yandex(this);
                    EnumC2821e enumC2821e5 = EnumC2821e.f6782e;
                    if (yandex2 == enumC2821e5) {
                        return enumC2821e5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 5:
                int i6 = this.f27677e;
                if (i6 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f27677e = 1;
                    Object purchase3 = this.f27676e.purchase(this);
                    EnumC2821e enumC2821e6 = EnumC2821e.f6782e;
                    if (purchase3 == enumC2821e6) {
                        return enumC2821e6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 6:
                int i7 = this.f27677e;
                if (i7 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f27677e = 1;
                    Object metrica = this.f27676e.metrica(this);
                    EnumC2821e enumC2821e7 = EnumC2821e.f6782e;
                    if (metrica == enumC2821e7) {
                        return enumC2821e7;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 7:
                int i8 = this.f27677e;
                if (i8 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f27677e = 1;
                    Object startapp2 = this.f27676e.startapp(this);
                    EnumC2821e enumC2821e8 = EnumC2821e.f6782e;
                    if (startapp2 == enumC2821e8) {
                        return enumC2821e8;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 8:
                int i9 = this.f27677e;
                if (i9 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f27677e = 1;
                    Object metrica2 = this.f27676e.metrica(this);
                    EnumC2821e enumC2821e9 = EnumC2821e.f6782e;
                    if (metrica2 == enumC2821e9) {
                        return enumC2821e9;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 9:
                int i10 = this.f27677e;
                if (i10 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f27677e = 1;
                    Object yandex3 = this.f27676e.yandex(this);
                    EnumC2821e enumC2821e10 = EnumC2821e.f6782e;
                    if (yandex3 == enumC2821e10) {
                        return enumC2821e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i11 = this.f27677e;
                if (i11 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f27677e = 1;
                    Object purchase4 = this.f27676e.purchase(this);
                    EnumC2821e enumC2821e11 = EnumC2821e.f6782e;
                    if (purchase4 == enumC2821e11) {
                        return enumC2821e11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
