package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؒۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1496e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f4360e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C5352e f4361e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f4362e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1496e(C5352e c5352e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f4360e = i;
        this.f4361e = c5352e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f4360e) {
            case 0:
                return new C1496e(this.f4361e, interfaceC5083e, 0);
            default:
                return new C1496e(this.f4361e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f4360e) {
            case 0:
                return ((C1496e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C1496e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f4360e) {
            case 0:
                int i = this.f4362e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f4362e = 1;
                    Object m1892strictfp = C5352e.m1892strictfp(this.f4361e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (m1892strictfp == enumC2821e) {
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
                int i2 = this.f4362e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f4362e = 1;
                    Object m1892strictfp2 = C5352e.m1892strictfp(this.f4361e, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (m1892strictfp2 == enumC2821e2) {
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
