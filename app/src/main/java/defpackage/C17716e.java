package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙْ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17716e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f34735e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C15820e f34736e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f34737e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17716e(C15820e c15820e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f34735e = i;
        this.f34736e = c15820e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f34735e) {
            case 0:
                return new C17716e(this.f34736e, interfaceC5083e, 0);
            default:
                return new C17716e(this.f34736e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f34735e) {
            case 0:
                return ((C17716e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C17716e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f34735e;
        InterfaceC5083e interfaceC5083e = null;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        C15820e c15820e = this.f34736e;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.f34737e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    C13029e c13029e = new C13029e(c15820e.f31221e, 8);
                    this.f34737e = 1;
                    if (c13029e.subscription(this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                C15420e c15420e = AbstractC6731e.ad;
                C12940e c12940e = AbstractC1497e.ad;
                C17635e c17635e = new C17635e(c15820e, interfaceC5083e, 0);
                this.f34737e = 2;
                if (AbstractC5336e.advert(c12940e, c17635e, this) == enumC2821e) {
                    return enumC2821e;
                }
                return Unit.INSTANCE;
            default:
                int i4 = this.f34737e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    C13029e c13029e2 = new C13029e(c15820e.f31221e, 2);
                    this.f34737e = 1;
                    if (c13029e2.subscription(this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                C15420e c15420e2 = AbstractC6731e.ad;
                C12940e c12940e2 = AbstractC1497e.ad;
                C17635e c17635e2 = new C17635e(c15820e, interfaceC5083e, i2);
                this.f34737e = 2;
                if (AbstractC5336e.advert(c12940e2, c17635e2, this) == enumC2821e) {
                    return enumC2821e;
                }
                return Unit.INSTANCE;
        }
    }
}
