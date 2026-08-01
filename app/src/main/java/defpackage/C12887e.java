package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۦؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12887e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f25737e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C5421e f25738e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f25739e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12887e(C5421e c5421e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f25737e = i;
        this.f25738e = c5421e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f25737e) {
            case 0:
                return new C12887e(this.f25738e, interfaceC5083e, 0);
            case 1:
                return new C12887e(this.f25738e, interfaceC5083e, 1);
            case 2:
                return new C12887e(this.f25738e, interfaceC5083e, 2);
            default:
                return new C12887e(this.f25738e, interfaceC5083e, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f25737e) {
            case 0:
                return ((C12887e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C12887e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C12887e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C12887e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f25737e) {
            case 0:
                int i = this.f25739e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C5421e c5421e = this.f25738e;
                    if (AbstractC7890e.billing(c5421e.m1906import(), C7821e.ad)) {
                        this.f25739e = 1;
                        Object m1905private = C5421e.m1905private(c5421e, this);
                        EnumC2821e enumC2821e = EnumC2821e.f6782e;
                        if (m1905private == enumC2821e) {
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
                int i2 = this.f25739e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f25739e = 1;
                    Object m1905private2 = C5421e.m1905private(this.f25738e, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (m1905private2 == enumC2821e2) {
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
                int i3 = this.f25739e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f25739e = 1;
                    Object m1904package = C5421e.m1904package(this.f25738e, this);
                    EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                    if (m1904package == enumC2821e3) {
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
                int i4 = this.f25739e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f25739e = 1;
                    Object m1904package2 = C5421e.m1904package(this.f25738e, this);
                    EnumC2821e enumC2821e4 = EnumC2821e.f6782e;
                    if (m1904package2 == enumC2821e4) {
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
