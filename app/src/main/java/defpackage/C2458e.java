package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2458e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f6286e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C5344e f6287e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f6288e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2458e(C5344e c5344e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f6286e = i;
        this.f6287e = c5344e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f6286e) {
            case 0:
                return new C2458e(this.f6287e, interfaceC5083e, 0);
            default:
                return new C2458e(this.f6287e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f6286e) {
            case 0:
                return ((C2458e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C2458e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f6286e) {
            case 0:
                int i = this.f6288e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f6288e = 1;
                    Object m1890strictfp = C5344e.m1890strictfp(this.f6287e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (m1890strictfp == enumC2821e) {
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
                int i2 = this.f6288e;
                C5344e c5344e = this.f6287e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    c5344e.f11456e.setValue(Boolean.TRUE);
                    C0134e c0134e = new C0134e(c5344e.m1891private());
                    this.f6288e = 1;
                    Object subscription = c0134e.subscription(this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (subscription == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                c5344e.mo734case();
                c5344e.f11456e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
