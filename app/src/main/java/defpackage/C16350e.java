package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٜٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16350e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f32131e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f32132e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f32133e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16350e(InterfaceC3314e interfaceC3314e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f32131e = i;
        this.f32132e = interfaceC3314e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f32131e) {
            case 0:
                return new C16350e(this.f32132e, interfaceC5083e, 0);
            case 1:
                return new C16350e(this.f32132e, interfaceC5083e, 1);
            default:
                return new C16350e(this.f32132e, interfaceC5083e, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f32131e) {
            case 0:
                return ((C16350e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C16350e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C16350e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f32131e;
        InterfaceC5083e interfaceC5083e = null;
        InterfaceC3314e interfaceC3314e = this.f32132e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        switch (i) {
            case 0:
                int i2 = this.f32133e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C16452e c16452e = (C16452e) AbstractC1831e.metrica().f22771e;
                    boolean z = !((C3487e) interfaceC3314e.getValue()).f7755e;
                    this.f32133e = 1;
                    if (((InterfaceC8018e) c16452e.f32285e).vip(new C3353e(z, interfaceC5083e, 17), this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                AbstractC15933e.vip(AbstractC17378e.ad(), new float[]{0.0f, 0.0f}, true);
                return Unit.INSTANCE;
            case 1:
                int i3 = this.f32133e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    C0444e c0444e = (C0444e) AbstractC1831e.metrica().f22773e;
                    boolean z2 = !((C3230e) interfaceC3314e.getValue()).f7360e;
                    this.f32133e = 1;
                    if (((InterfaceC8018e) c0444e.f2491e).vip(new C3353e(z2, interfaceC5083e, 16), this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i4 = this.f32133e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    C17647e c17647e = C14157e.f27993e;
                    long Signature = AbstractC0326e.Signature(5, EnumC15934e.SECONDS);
                    this.f32133e = 1;
                    if (AbstractC16481e.metrica(Signature, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                interfaceC3314e.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
        }
    }
}
