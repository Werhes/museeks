package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15189e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f30058e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C3877e f30059e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C15274e f30060e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f30061e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15189e(C15274e c15274e, C3877e c3877e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f30058e = i;
        this.f30060e = c15274e;
        this.f30059e = c3877e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f30058e) {
            case 0:
                return new C15189e(this.f30060e, this.f30059e, interfaceC5083e, 0);
            case 1:
                return new C15189e(this.f30060e, this.f30059e, interfaceC5083e, 1);
            case 2:
                return new C15189e(this.f30060e, this.f30059e, interfaceC5083e, 2);
            default:
                return new C15189e(this.f30060e, this.f30059e, interfaceC5083e, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f30058e) {
            case 0:
                return ((C15189e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C15189e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C15189e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C15189e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f30058e) {
            case 0:
                int i = this.f30061e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C15274e c15274e = this.f30060e;
                    if (c15274e != null) {
                        C3005e c3005e = new C3005e(this.f30059e);
                        this.f30061e = 1;
                        Object ad = c15274e.ad(c3005e, this);
                        EnumC2821e enumC2821e = EnumC2821e.f6782e;
                        if (ad == enumC2821e) {
                            return enumC2821e;
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
                int i2 = this.f30061e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C15274e c15274e2 = this.f30060e;
                    if (c15274e2 != null) {
                        this.f30061e = 1;
                        Object ad2 = c15274e2.ad(this.f30059e, this);
                        EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                        if (ad2 == enumC2821e2) {
                            return enumC2821e2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 2:
                int i3 = this.f30061e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    C15274e c15274e3 = this.f30060e;
                    if (c15274e3 != null) {
                        C7026e c7026e = new C7026e(this.f30059e);
                        this.f30061e = 1;
                        Object ad3 = c15274e3.ad(c7026e, this);
                        EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                        if (ad3 == enumC2821e3) {
                            return enumC2821e3;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i4 = this.f30061e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    C15274e c15274e4 = this.f30060e;
                    if (c15274e4 != null) {
                        C3005e c3005e2 = new C3005e(this.f30059e);
                        this.f30061e = 1;
                        Object ad4 = c15274e4.ad(c3005e2, this);
                        EnumC2821e enumC2821e4 = EnumC2821e.f6782e;
                        if (ad4 == enumC2821e4) {
                            return enumC2821e4;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
