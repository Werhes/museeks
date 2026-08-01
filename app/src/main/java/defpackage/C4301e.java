package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۖۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4301e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f9405e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f9406e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f9407e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f9408e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4301e(Function1 function1, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f9405e = i;
        this.f9406e = function1;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f9405e) {
            case 0:
                C4301e c4301e = new C4301e(this.f9406e, interfaceC5083e, 0);
                c4301e.f9407e = obj;
                return c4301e;
            case 1:
                C4301e c4301e2 = new C4301e(this.f9406e, interfaceC5083e, 1);
                c4301e2.f9407e = obj;
                return c4301e2;
            case 2:
                C4301e c4301e3 = new C4301e(this.f9406e, interfaceC5083e, 2);
                c4301e3.f9407e = obj;
                return c4301e3;
            default:
                C4301e c4301e4 = new C4301e(this.f9406e, interfaceC5083e, 3);
                c4301e4.f9407e = obj;
                return c4301e4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC13742e interfaceC13742e = (InterfaceC13742e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f9405e) {
            case 0:
                return ((C4301e) advert(interfaceC5083e, interfaceC13742e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C4301e) advert(interfaceC5083e, interfaceC13742e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C4301e) advert(interfaceC5083e, interfaceC13742e)).loadAd(Unit.INSTANCE);
            default:
                return ((C4301e) advert(interfaceC5083e, interfaceC13742e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f9405e) {
            case 0:
                int i = this.f9408e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC13742e interfaceC13742e = (InterfaceC13742e) this.f9407e;
                    C7294e c7294e = new C7294e(this.f9406e, null, 0);
                    this.f9408e = 1;
                    Object m1364e = ((C3427e) interfaceC13742e).m1364e(c7294e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (m1364e == enumC2821e) {
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
                int i2 = this.f9408e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC13742e interfaceC13742e2 = (InterfaceC13742e) this.f9407e;
                    C4301e c4301e = new C4301e(this.f9406e, null, 0);
                    this.f9408e = 1;
                    Object license = AbstractC13406e.license(interfaceC13742e2, c4301e, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (license == enumC2821e2) {
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
                int i3 = this.f9408e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC13742e interfaceC13742e3 = (InterfaceC13742e) this.f9407e;
                    C7294e c7294e2 = new C7294e(this.f9406e, null, 1);
                    this.f9408e = 1;
                    Object m1364e2 = ((C3427e) interfaceC13742e3).m1364e(c7294e2, this);
                    EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                    if (m1364e2 == enumC2821e3) {
                        return enumC2821e3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i4 = this.f9408e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC13742e interfaceC13742e4 = (InterfaceC13742e) this.f9407e;
                    C4301e c4301e2 = new C4301e(this.f9406e, null, 2);
                    this.f9408e = 1;
                    Object license2 = AbstractC13406e.license(interfaceC13742e4, c4301e2, this);
                    EnumC2821e enumC2821e4 = EnumC2821e.f6782e;
                    if (license2 == enumC2821e4) {
                        return enumC2821e4;
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
