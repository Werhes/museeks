package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۤۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14358e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f28389e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C3566e f28390e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f28391e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14358e(C3566e c3566e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f28389e = i;
        this.f28390e = c3566e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f28389e) {
            case 0:
                return new C14358e(this.f28390e, interfaceC5083e, 0);
            case 1:
                return new C14358e(this.f28390e, interfaceC5083e, 1);
            case 2:
                return new C14358e(this.f28390e, interfaceC5083e, 2);
            default:
                return new C14358e(this.f28390e, interfaceC5083e, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f28389e) {
            case 0:
                return ((C14358e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C14358e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C14358e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C14358e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f28389e;
        InterfaceC5083e interfaceC5083e = null;
        Object obj2 = EnumC2821e.f6782e;
        C3566e c3566e = this.f28390e;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.f28391e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f28391e = 1;
                    int i4 = C3566e.f8039e;
                    C15420e c15420e = AbstractC6731e.ad;
                    Object advert = AbstractC5336e.advert(ExecutorC3603e.f8134e, new C12972e(c3566e, interfaceC5083e, i2), this);
                    if (advert != obj2) {
                        advert = Unit.INSTANCE;
                    }
                    if (advert == obj2) {
                        return obj2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i5 = this.f28391e;
                if (i5 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f28391e = 1;
                    int i6 = C3566e.f8039e;
                    C15420e c15420e2 = AbstractC6731e.ad;
                    Object advert2 = AbstractC5336e.advert(ExecutorC3603e.f8134e, new C14358e(c3566e, interfaceC5083e, 3), this);
                    if (advert2 != obj2) {
                        advert2 = Unit.INSTANCE;
                    }
                    if (advert2 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                c3566e.purchase();
                return Unit.INSTANCE;
            case 2:
                int i7 = this.f28391e;
                if (i7 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC8615e interfaceC8615e = c3566e.f8041e;
                    this.f28391e = 1;
                    if (interfaceC8615e.pro(this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                c3566e.purchase();
                return Unit.INSTANCE;
            default:
                int i8 = this.f28391e;
                if (i8 == 0) {
                    AbstractC2003e.purchase(obj);
                    int i9 = C3566e.f8039e;
                    c3566e.m1377this(EnumC10826e.f21462e);
                    InterfaceC8615e interfaceC8615e2 = c3566e.f8041e;
                    boolean booleanValue = ((Boolean) c3566e.f8042e.getValue()).booleanValue();
                    this.f28391e = 1;
                    if (interfaceC8615e2.appmetrica(booleanValue, this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                C15420e c15420e3 = AbstractC6731e.ad;
                C12940e c12940e = AbstractC1497e.ad;
                C9042e c9042e = new C9042e(c3566e, interfaceC5083e, 12);
                this.f28391e = 2;
                if (AbstractC5336e.advert(c12940e, c9042e, this) == obj2) {
                    return obj2;
                }
                return Unit.INSTANCE;
        }
    }
}
