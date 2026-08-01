package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٕۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15823e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f31233e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f31234e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ int f31235e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f31236e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15823e(int i, int i2, InterfaceC5083e interfaceC5083e, int i3) {
        super(2, interfaceC5083e);
        this.f31233e = i3;
        this.f31235e = i;
        this.f31234e = i2;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f31233e) {
            case 0:
                return new C15823e(this.f31235e, this.f31234e, interfaceC5083e, 0);
            default:
                return new C15823e(this.f31235e, this.f31234e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f31233e) {
            case 0:
                return ((C15823e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C15823e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f31233e;
        int i2 = this.f31234e;
        int i3 = this.f31235e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        switch (i) {
            case 0:
                int i4 = this.f31236e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f31236e = 1;
                    obj = C15802e.f31123e.Signature(i3, i2, this);
                    if (obj == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Boolean.valueOf(obj != null);
            default:
                int i5 = this.f31236e;
                if (i5 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f31236e = 1;
                    C15420e c15420e = AbstractC6731e.ad;
                    Object advert = AbstractC5336e.advert(ExecutorC3603e.f8134e, new C1571e(i2, i3, null), this);
                    if (advert != enumC2821e) {
                        advert = Unit.INSTANCE;
                    }
                    if (advert == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
