package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۥِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2983e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f7022e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC9543e f7023e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1108e f7024e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f7025e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2983e(InterfaceC1108e interfaceC1108e, InterfaceC9543e interfaceC9543e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f7022e = i;
        this.f7024e = interfaceC1108e;
        this.f7023e = interfaceC9543e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f7022e) {
            case 0:
                return new C2983e(this.f7024e, this.f7023e, interfaceC5083e, 0);
            default:
                return new C2983e(this.f7024e, this.f7023e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f7022e) {
            case 0:
                return ((C2983e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C2983e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f7022e) {
            case 0:
                int i = this.f7025e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C13393e c13393e = new C13393e(this.f7023e, 0);
                    this.f7025e = 1;
                    Object ad = this.f7024e.ad(c13393e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (ad == enumC2821e) {
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
                int i2 = this.f7025e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C13393e c13393e2 = new C13393e(this.f7023e, 2);
                    this.f7025e = 1;
                    Object ad2 = this.f7024e.ad(c13393e2, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (ad2 == enumC2821e2) {
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
