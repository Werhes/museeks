package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13163e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f26137e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ float f26138e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C14426e f26139e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f26140e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13163e(C14426e c14426e, float f, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f26137e = i;
        this.f26139e = c14426e;
        this.f26138e = f;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f26137e) {
            case 0:
                return new C13163e(this.f26139e, this.f26138e, interfaceC5083e, 0);
            default:
                return new C13163e(this.f26139e, this.f26138e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f26137e) {
            case 0:
                return ((C13163e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C13163e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f26137e) {
            case 0:
                int i = this.f26140e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C14426e c14426e = this.f26139e;
                    C7558e c7558e = c14426e.f28527e;
                    if (c7558e != null) {
                        Float f = new Float(this.f26138e);
                        InterfaceC2869e interfaceC2869e = c14426e.f28521e ? AbstractC8844e.purchase : c14426e.f28522e;
                        this.f26140e = 1;
                        obj = C7558e.vip(c7558e, f, interfaceC2869e, null, this, 12);
                        EnumC2821e enumC2821e = EnumC2821e.f6782e;
                        if (obj == enumC2821e) {
                            return enumC2821e;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2003e.purchase(obj);
                return Unit.INSTANCE;
            default:
                int i2 = this.f26140e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C14426e c14426e2 = this.f26139e;
                    C7558e c7558e2 = c14426e2.f28526e;
                    if (c7558e2 == null) {
                        return Unit.INSTANCE;
                    }
                    Float f2 = new Float(this.f26138e);
                    InterfaceC2869e interfaceC2869e2 = c14426e2.f28521e ? AbstractC8844e.purchase : c14426e2.f28522e;
                    this.f26140e = 1;
                    obj = C7558e.vip(c7558e2, f2, interfaceC2869e2, null, this, 12);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (obj == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
