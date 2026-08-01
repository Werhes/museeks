package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۣؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6152e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f12921e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ float f12922e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C7558e f12923e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f12924e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6152e(C7558e c7558e, float f, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f12921e = i;
        this.f12923e = c7558e;
        this.f12922e = f;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f12921e) {
            case 0:
                return new C6152e(this.f12923e, this.f12922e, interfaceC5083e, 0);
            case 1:
                return new C6152e(this.f12923e, this.f12922e, interfaceC5083e, 1);
            default:
                return new C6152e(this.f12923e, this.f12922e, interfaceC5083e, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f12921e) {
            case 0:
                return ((C6152e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C6152e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C6152e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f12921e) {
            case 0:
                int i = this.f12924e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    float f = this.f12922e;
                    Float f2 = new Float(f);
                    C7558e c7558e = this.f12923e;
                    C12870e c12870e = ((Number) c7558e.license()).floatValue() < f ? AbstractC3991e.ad : AbstractC3991e.vip;
                    this.f12924e = 1;
                    Object vip = C7558e.vip(c7558e, f2, c12870e, null, this, 12);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (vip == enumC2821e) {
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
                int i2 = this.f12924e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    float f3 = this.f12922e;
                    C15765e c15765e = new C15765e(f3);
                    C7558e c7558e2 = this.f12923e;
                    C13540e purchase = C15765e.ad(((C15765e) c7558e2.appmetrica.getValue()).f31051e, f3) < 0 ? AbstractC12696e.purchase(1.0f, 1000.0f, null, 4) : AbstractC12696e.purchase(1.0f, 250.0f, null, 4);
                    this.f12924e = 1;
                    Object vip2 = C7558e.vip(c7558e2, c15765e, purchase, null, this, 12);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (vip2 == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i3 = this.f12924e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    float f4 = this.f12922e;
                    C15765e c15765e2 = new C15765e(f4);
                    C7558e c7558e3 = this.f12923e;
                    C13540e purchase2 = C15765e.ad(((C15765e) c7558e3.appmetrica.getValue()).f31051e, f4) < 0 ? AbstractC12696e.purchase(1.0f, 250.0f, null, 4) : AbstractC12696e.purchase(1.0f, 1000.0f, null, 4);
                    this.f12924e = 1;
                    Object vip3 = C7558e.vip(c7558e3, c15765e2, purchase2, null, this, 12);
                    EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                    if (vip3 == enumC2821e3) {
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
