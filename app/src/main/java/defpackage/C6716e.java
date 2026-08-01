package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٜۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6716e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f13870e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C4760e f13871e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f13872e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6716e(C4760e c4760e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f13870e = i;
        this.f13871e = c4760e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f13870e) {
            case 0:
                return new C6716e(this.f13871e, interfaceC5083e, 0);
            case 1:
                return new C6716e(this.f13871e, interfaceC5083e, 1);
            default:
                return new C6716e(this.f13871e, interfaceC5083e, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f13870e) {
            case 0:
                ((C6716e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
                return EnumC2821e.f6782e;
            case 1:
                ((C6716e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
                return EnumC2821e.f6782e;
            default:
                return ((C6716e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [eّؖٝ, java.lang.Object] */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        C0216e c0216e;
        C13135e c13135e;
        Object obj2;
        int i = 1;
        switch (this.f13870e) {
            case 0:
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                int i2 = this.f13872e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C4760e c4760e = this.f13871e;
                    C14688e c14688e = c4760e.purchase.f28166e;
                    C15324e c15324e = new C15324e(c4760e, 0);
                    this.f13872e = 1;
                    if (c14688e.f29092e.ad(c15324e, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                throw new C14803e(9);
            case 1:
                EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                int i3 = this.f13872e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    C4760e c4760e2 = this.f13871e;
                    C4013e c4013e = c4760e2.purchase.f28164e;
                    C15324e c15324e2 = new C15324e(c4760e2, i);
                    this.f13872e = 1;
                    if (c4013e.f8936e.ad(c15324e2, this) == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                throw new C14803e(9);
            default:
                EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                int i4 = this.f13872e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    C4760e c4760e3 = this.f13871e;
                    this.f13872e = 1;
                    ?? obj3 = new Object();
                    synchronized (c4760e3.Signature) {
                        c0216e = c4760e3.inmobi;
                        c13135e = c4760e3.isPro;
                        obj3.f9318e = c13135e;
                        Unit unit = Unit.INSTANCE;
                    }
                    if (c0216e == null || c13135e == null) {
                        obj2 = Unit.INSTANCE;
                    } else {
                        obj2 = c0216e.startapp.ad(new C17191e((Object) obj3, c4760e3, 2), this);
                        if (obj2 != enumC2821e3) {
                            obj2 = Unit.INSTANCE;
                        }
                    }
                    if (obj2 == enumC2821e3) {
                        return enumC2821e3;
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
