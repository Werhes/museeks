package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7989e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f16178e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C9243e f16179e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f16180e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7989e(C9243e c9243e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f16178e = i;
        this.f16179e = c9243e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f16178e) {
            case 0:
                return new C7989e(this.f16179e, interfaceC5083e, 0);
            default:
                return new C7989e(this.f16179e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f16178e) {
            case 0:
                return ((C7989e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C7989e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f16178e) {
            case 0:
                int i = this.f16180e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = this.f16179e.f18449e;
                    this.f16180e = 1;
                    Object advert = viewTreeObserverOnGlobalLayoutListenerC5014e.f10652e.advert(this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (advert != enumC2821e) {
                        advert = Unit.INSTANCE;
                    }
                    if (advert == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i2 = this.f16180e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e2 = this.f16179e.f18449e;
                    this.f16180e = 1;
                    Object ad = viewTreeObserverOnGlobalLayoutListenerC5014e2.f10653e.ad(this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (ad != enumC2821e2) {
                        ad = Unit.INSTANCE;
                    }
                    if (ad == enumC2821e2) {
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
