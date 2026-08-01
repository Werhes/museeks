package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2415e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f6194e = 1;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f6195e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ float f6196e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f6197e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2415e(C8933e c8933e, float f, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f6195e = c8933e;
        this.f6196e = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2415e(ScrollCaptureCallbackC17336e scrollCaptureCallbackC17336e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f6195e = scrollCaptureCallbackC17336e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f6194e) {
            case 0:
                C2415e c2415e = new C2415e((ScrollCaptureCallbackC17336e) this.f6195e, interfaceC5083e);
                c2415e.f6196e = ((Number) obj).floatValue();
                return c2415e;
            default:
                return new C2415e((C8933e) this.f6195e, this.f6196e, interfaceC5083e);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6194e) {
            case 0:
                return ((C2415e) advert((InterfaceC5083e) obj2, Float.valueOf(((Number) obj).floatValue()))).loadAd(Unit.INSTANCE);
            default:
                return ((C2415e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f6194e) {
            case 0:
                ScrollCaptureCallbackC17336e scrollCaptureCallbackC17336e = (ScrollCaptureCallbackC17336e) this.f6195e;
                int i = this.f6197e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    float f = this.f6196e;
                    Object billing = scrollCaptureCallbackC17336e.ad.license.f2578e.billing(AbstractC10789e.appmetrica);
                    if (billing == null) {
                        billing = null;
                    }
                    Function2 function2 = (Function2) billing;
                    if (function2 == null) {
                        throw AbstractC8703e.Signature("Required value was null.");
                    }
                    C2152e c2152e = new C2152e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
                    this.f6197e = 1;
                    obj = function2.invoke(c2152e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (obj == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((C2152e) obj).ad & 4294967295L)));
            default:
                int i2 = this.f6197e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C8933e c8933e = (C8933e) this.f6195e;
                    C10684e c10684e = c8933e.startapp;
                    C11838e c11838e = new C11838e(c8933e, this.f6196e, null);
                    this.f6197e = 1;
                    c10684e.getClass();
                    Object appmetrica = AbstractC9743e.appmetrica(new C6365e(EnumC6955e.f14256e, c10684e, c11838e, null), this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (appmetrica == enumC2821e2) {
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
