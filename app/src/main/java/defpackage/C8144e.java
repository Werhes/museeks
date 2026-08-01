package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8144e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f16538e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC16904e f16539e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f16540e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8144e(int i, InterfaceC5083e interfaceC5083e, AbstractC16904e abstractC16904e) {
        super(2, interfaceC5083e);
        this.f16538e = i;
        this.f16539e = abstractC16904e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f16538e) {
            case 0:
                return new C8144e(0, interfaceC5083e, this.f16539e);
            case 1:
                return new C8144e(1, interfaceC5083e, this.f16539e);
            case 2:
                return new C8144e(2, interfaceC5083e, this.f16539e);
            case 3:
                return new C8144e(3, interfaceC5083e, this.f16539e);
            case 4:
                return new C8144e(4, interfaceC5083e, this.f16539e);
            default:
                return new C8144e(5, interfaceC5083e, this.f16539e);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f16538e) {
            case 0:
                return ((C8144e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C8144e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C8144e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C8144e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C8144e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C8144e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        Object obj2;
        Object obj3;
        Object purchase;
        Object purchase2;
        Object purchase3;
        int i = this.f16538e;
        AbstractC16904e abstractC16904e = this.f16539e;
        Object obj4 = EnumC2821e.f6782e;
        switch (i) {
            case 0:
                int i2 = this.f16540e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f16540e = 1;
                    float f = AbstractC1742e.ad;
                    if (((C16330e) abstractC16904e.license.f17056e).purchase() - 1 >= 0) {
                        obj2 = abstractC16904e.purchase(((C16330e) abstractC16904e.license.f17056e).purchase() - 1, AbstractC12696e.purchase(0.0f, 0.0f, null, 7), this);
                        if (obj2 != obj4) {
                            obj2 = Unit.INSTANCE;
                        }
                    } else {
                        obj2 = Unit.INSTANCE;
                    }
                    if (obj2 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i3 = this.f16540e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f16540e = 1;
                    float f2 = AbstractC1742e.ad;
                    if (((C16330e) abstractC16904e.license.f17056e).purchase() + 1 < abstractC16904e.advert()) {
                        obj3 = abstractC16904e.purchase(((C16330e) abstractC16904e.license.f17056e).purchase() + 1, AbstractC12696e.purchase(0.0f, 0.0f, null, 7), this);
                        if (obj3 != obj4) {
                            obj3 = Unit.INSTANCE;
                        }
                    } else {
                        obj3 = Unit.INSTANCE;
                    }
                    if (obj3 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 2:
                int i4 = this.f16540e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f16540e = 1;
                    C14641e c14641e = new C14641e(2, 7, null);
                    abstractC16904e.getClass();
                    Object subscription = AbstractC16904e.subscription(abstractC16904e, EnumC6955e.f14256e, c14641e, this);
                    if (subscription != obj4) {
                        subscription = Unit.INSTANCE;
                    }
                    if (subscription == obj4) {
                        return obj4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 3:
                int i5 = this.f16540e;
                if (i5 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f16540e = 1;
                    purchase = abstractC16904e.purchase(5, AbstractC12696e.purchase(0.0f, 0.0f, null, 7), this);
                    if (purchase == obj4) {
                        return obj4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 4:
                int i6 = this.f16540e;
                if (i6 == 0) {
                    AbstractC2003e.purchase(obj);
                    int purchase4 = ((C16330e) abstractC16904e.license.f17056e).purchase() - 1;
                    this.f16540e = 1;
                    purchase2 = abstractC16904e.purchase(purchase4, AbstractC12696e.purchase(0.0f, 0.0f, null, 7), this);
                    if (purchase2 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i7 = this.f16540e;
                if (i7 == 0) {
                    AbstractC2003e.purchase(obj);
                    int purchase5 = ((C16330e) abstractC16904e.license.f17056e).purchase() + 1;
                    this.f16540e = 1;
                    purchase3 = abstractC16904e.purchase(purchase5, AbstractC12696e.purchase(0.0f, 0.0f, null, 7), this);
                    if (purchase3 == obj4) {
                        return obj4;
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
