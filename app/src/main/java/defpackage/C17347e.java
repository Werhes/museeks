package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٗۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17347e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f34033e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C11210e f34034e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f34035e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17347e(C11210e c11210e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f34033e = i;
        this.f34034e = c11210e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f34033e) {
            case 0:
                return new C17347e(this.f34034e, interfaceC5083e, 0);
            case 1:
                return new C17347e(this.f34034e, interfaceC5083e, 1);
            default:
                return new C17347e(this.f34034e, interfaceC5083e, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f34033e) {
            case 0:
                return ((C17347e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C17347e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C17347e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f34033e) {
            case 0:
                int i = this.f34035e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f34035e = 1;
                    Object m3060transient = C11210e.m3060transient(this.f34034e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (m3060transient == enumC2821e) {
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
                int i2 = this.f34035e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C11210e c11210e = this.f34034e;
                    if (AbstractC7890e.billing((InterfaceC9816e) c11210e.f22473e.getValue(), C13641e.ad)) {
                        this.f34035e = 1;
                        Object m3059package = C11210e.m3059package(c11210e, this);
                        EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                        if (m3059package == enumC2821e2) {
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
            default:
                int i3 = this.f34035e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f34035e = 1;
                    Object m3059package2 = C11210e.m3059package(this.f34034e, this);
                    EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                    if (m3059package2 == enumC2821e3) {
                        return enumC2821e3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
