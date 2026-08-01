package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًًّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7889e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f15966e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7185e f15967e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f15968e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f15969e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C7889e(Function2 function2, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f15966e = i;
        switch (i) {
            case 1:
                this.f15967e = (AbstractC7185e) function2;
                super(2, interfaceC5083e);
                return;
            default:
                this.f15967e = (AbstractC7185e) function2;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f15966e) {
            case 0:
                C7889e c7889e = new C7889e(this.f15967e, interfaceC5083e, 0);
                c7889e.f15968e = obj;
                return c7889e;
            default:
                C7889e c7889e2 = new C7889e(this.f15967e, interfaceC5083e, 1);
                c7889e2.f15968e = obj;
                return c7889e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f15966e) {
            case 0:
                return ((C7889e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C7889e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r4v2, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f15966e) {
            case 0:
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f15968e;
                int i = this.f15969e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f15968e = null;
                    this.f15969e = 1;
                    Object invoke = this.f15967e.invoke(interfaceC18435e, this);
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
            default:
                int i2 = this.f15969e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC18435e interfaceC18435e2 = (InterfaceC18435e) this.f15968e;
                    this.f15969e = 1;
                    Object invoke2 = this.f15967e.invoke(interfaceC18435e2, this);
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
        }
    }
}
