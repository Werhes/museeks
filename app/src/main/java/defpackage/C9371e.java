package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9371e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f18630e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C0567e f18631e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f18632e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9371e(C0567e c0567e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f18630e = i;
        this.f18631e = c0567e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f18630e) {
            case 0:
                return new C9371e(this.f18631e, interfaceC5083e, 0);
            default:
                return new C9371e(this.f18631e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f18630e) {
            case 0:
                return ((C9371e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C9371e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f18630e) {
            case 0:
                int i = this.f18632e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C0567e c0567e = this.f18631e;
                    C1615e c1615e = c0567e.f2744e;
                    C7602e c7602e = new C7602e(c0567e, null, 0);
                    this.f18632e = 1;
                    Object appmetrica = AbstractC7535e.appmetrica(c1615e, c7602e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (appmetrica == enumC2821e) {
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
                int i2 = this.f18632e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C0567e c0567e2 = this.f18631e;
                    C4891e c4891e = c0567e2.f27449e;
                    C9371e c9371e = new C9371e(c0567e2, null, 0);
                    this.f18632e = 1;
                    Object adcel = AbstractC11203e.adcel(c4891e, EnumC7785e.f15777e, c9371e, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (adcel == enumC2821e2) {
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
