package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8699e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f17549e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f17550e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9870e f17551e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f17552e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8699e(AbstractC9870e abstractC9870e, int i, InterfaceC5083e interfaceC5083e, int i2) {
        super(2, interfaceC5083e);
        this.f17549e = i2;
        this.f17551e = abstractC9870e;
        this.f17550e = i;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f17549e) {
            case 0:
                return new C8699e(this.f17551e, this.f17550e, interfaceC5083e, 0);
            default:
                return new C8699e(this.f17551e, this.f17550e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f17549e) {
            case 0:
                return ((C8699e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C8699e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f17549e;
        int i2 = this.f17550e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        AbstractC9870e abstractC9870e = this.f17551e;
        switch (i) {
            case 0:
                int i3 = this.f17552e;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                this.f17552e = 1;
                Object mo215return = abstractC9870e.mo215return(i2, this);
                return mo215return == enumC2821e ? enumC2821e : mo215return;
            default:
                int i4 = this.f17552e;
                int i5 = 0;
                InterfaceC5083e interfaceC5083e = null;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    C15420e c15420e = AbstractC6731e.ad;
                    ExecutorC3603e executorC3603e = ExecutorC3603e.f8134e;
                    C8699e c8699e = new C8699e(abstractC9870e, i2, interfaceC5083e, i5);
                    this.f17552e = 1;
                    obj = AbstractC5336e.advert(executorC3603e, c8699e, this);
                    if (obj == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        abstractC9870e.m1394transient();
                        abstractC9870e.f8234e = true;
                        abstractC9870e.f8224e = false;
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                C15420e c15420e2 = AbstractC6731e.ad;
                C12940e c12940e = AbstractC1497e.ad.f25795e;
                C15966e c15966e = new C15966e(abstractC9870e, (List) obj, interfaceC5083e, 4);
                this.f17552e = 2;
                if (AbstractC5336e.advert(c12940e, c15966e, this) == enumC2821e) {
                    return enumC2821e;
                }
                abstractC9870e.m1394transient();
                abstractC9870e.f8234e = true;
                abstractC9870e.f8224e = false;
                return Unit.INSTANCE;
        }
    }
}
