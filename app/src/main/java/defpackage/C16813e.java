package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16813e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f32949e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f32950e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC16904e f32951e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f32952e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16813e(AbstractC16904e abstractC16904e, int i, InterfaceC5083e interfaceC5083e, int i2) {
        super(2, interfaceC5083e);
        this.f32949e = i2;
        this.f32951e = abstractC16904e;
        this.f32950e = i;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f32949e) {
            case 0:
                return new C16813e(this.f32951e, this.f32950e, interfaceC5083e, 0);
            default:
                return new C16813e(this.f32951e, this.f32950e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f32949e) {
            case 0:
                return ((C16813e) advert((InterfaceC5083e) obj2, (InterfaceC1719e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C16813e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        Object purchase;
        switch (this.f32949e) {
            case 0:
                int i = this.f32952e;
                AbstractC16904e abstractC16904e = this.f32951e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f32952e = 1;
                    Object startapp = abstractC16904e.startapp(this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (startapp == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                double d = 0.0f;
                if (-0.5d > d || d > 0.5d) {
                    AbstractC8889e.ad("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5");
                }
                abstractC16904e.remoteconfig(0.0f, abstractC16904e.adcel(this.f32950e), true);
                return Unit.INSTANCE;
            default:
                int i2 = this.f32952e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f32952e = 1;
                    purchase = this.f32951e.purchase(this.f32950e, AbstractC12696e.purchase(0.0f, 0.0f, null, 7), this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (purchase == enumC2821e2) {
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
