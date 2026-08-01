package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٙۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1903e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f5085e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C10848e f5086e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1108e f5087e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f5088e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1903e(InterfaceC1108e interfaceC1108e, C10848e c10848e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f5085e = i;
        this.f5087e = interfaceC1108e;
        this.f5086e = c10848e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f5085e) {
            case 0:
                return new C1903e(this.f5087e, this.f5086e, interfaceC5083e, 0);
            default:
                return new C1903e(this.f5087e, this.f5086e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f5085e) {
            case 0:
                return ((C1903e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C1903e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f5085e) {
            case 0:
                int i = this.f5088e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C4623e c4623e = new C4623e(this.f5086e, 1);
                    this.f5088e = 1;
                    Object ad = this.f5087e.ad(c4623e, this);
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
                int i2 = this.f5088e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C4623e c4623e2 = new C4623e(this.f5086e, 3);
                    this.f5088e = 1;
                    Object ad2 = this.f5087e.ad(c4623e2, this);
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
