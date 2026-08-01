package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15360e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f30284e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f30285e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f30286e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f30287e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f30288e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15360e(Function2 function2, InterfaceC3314e interfaceC3314e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f30284e = i;
        this.f30285e = function2;
        this.f30286e = interfaceC3314e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f30284e) {
            case 0:
                C15360e c15360e = new C15360e(this.f30285e, this.f30286e, interfaceC5083e, 0);
                c15360e.f30287e = obj;
                return c15360e;
            case 1:
                C15360e c15360e2 = new C15360e(this.f30285e, this.f30286e, interfaceC5083e, 1);
                c15360e2.f30287e = obj;
                return c15360e2;
            default:
                C15360e c15360e3 = new C15360e(this.f30285e, this.f30286e, interfaceC5083e, 2);
                c15360e3.f30287e = obj;
                return c15360e3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f30284e) {
            case 0:
                return ((C15360e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C15360e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C15360e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f30284e) {
            case 0:
                int i = this.f30288e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C10848e c10848e = new C10848e(this.f30286e, ((InterfaceC18435e) this.f30287e).advert());
                    this.f30288e = 1;
                    Object invoke = this.f30285e.invoke(c10848e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (invoke == enumC2821e) {
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
                int i2 = this.f30288e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C10848e c10848e2 = new C10848e(this.f30286e, ((InterfaceC18435e) this.f30287e).advert());
                    this.f30288e = 1;
                    Object invoke2 = this.f30285e.invoke(c10848e2, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (invoke2 == enumC2821e2) {
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
                int i3 = this.f30288e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    C10848e c10848e3 = new C10848e(this.f30286e, ((InterfaceC18435e) this.f30287e).advert());
                    this.f30288e = 1;
                    Object invoke3 = this.f30285e.invoke(c10848e3, this);
                    EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                    if (invoke3 == enumC2821e3) {
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
