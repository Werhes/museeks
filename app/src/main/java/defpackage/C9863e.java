package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۣۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9863e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f19465e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C6540e f19466e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f19467e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9863e(C6540e c6540e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f19465e = i;
        this.f19466e = c6540e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f19465e) {
            case 0:
                return new C9863e(this.f19466e, interfaceC5083e, 0);
            default:
                return new C9863e(this.f19466e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f19465e) {
            case 0:
                return ((C9863e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C9863e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f19465e) {
            case 0:
                int i = this.f19467e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f19467e = 1;
                    Object metrica = this.f19466e.metrica(EnumC6955e.f14256e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (metrica == enumC2821e) {
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
                int i2 = this.f19467e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f19467e = 1;
                    Object metrica2 = this.f19466e.metrica(EnumC6955e.f14254e, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (metrica2 == enumC2821e2) {
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
