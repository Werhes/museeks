package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۖؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1240e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f3921e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C16869e f3922e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f3923e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240e(C16869e c16869e, int i, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f3921e = 6;
        this.f3922e = c16869e;
        this.f3923e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1240e(C16869e c16869e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f3921e = i;
        this.f3922e = c16869e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f3921e) {
            case 0:
                return new C1240e(this.f3922e, interfaceC5083e, 0);
            case 1:
                return new C1240e(this.f3922e, interfaceC5083e, 1);
            case 2:
                return new C1240e(this.f3922e, interfaceC5083e, 2);
            case 3:
                return new C1240e(this.f3922e, interfaceC5083e, 3);
            case 4:
                return new C1240e(this.f3922e, interfaceC5083e, 4);
            case 5:
                return new C1240e(this.f3922e, interfaceC5083e, 5);
            case 6:
                return new C1240e(this.f3922e, this.f3923e, interfaceC5083e);
            default:
                return new C1240e(this.f3922e, interfaceC5083e, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f3921e) {
            case 0:
                return ((C1240e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C1240e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C1240e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C1240e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C1240e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C1240e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C1240e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C1240e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f3921e;
        int i2 = 0;
        int i3 = 2;
        InterfaceC5083e interfaceC5083e = null;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        C16869e c16869e = this.f3922e;
        switch (i) {
            case 0:
                int i4 = this.f3923e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    C5363e c5363e = AbstractC16696e.ad;
                    AbstractC16696e purchase = AbstractC16268e.purchase();
                    c16869e.f33051e.setValue(new C16206e(purchase.license(), purchase instanceof C17770e ? AbstractC11815e.ads(c16869e.pro(), ((C17770e) purchase).vip().getAbsolutePath()) : AbstractC11815e.subs(c16869e.pro())));
                    this.f3923e = 1;
                    if (C16869e.m4202package(c16869e, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i5 = this.f3923e;
                if (i5 == 0) {
                    AbstractC2003e.purchase(obj);
                    if (((C16579e) c16869e.f33048e.getValue()) == null) {
                        C15420e c15420e = AbstractC6731e.ad;
                        ExecutorC3603e executorC3603e = ExecutorC3603e.f8134e;
                        C1240e c1240e = new C1240e(c16869e, interfaceC5083e, i2);
                        this.f3923e = 1;
                        if (AbstractC5336e.advert(executorC3603e, c1240e, this) == enumC2821e) {
                            return enumC2821e;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 2:
                int i6 = this.f3923e;
                if (i6 == 0) {
                    AbstractC2003e.purchase(obj);
                    C15420e c15420e2 = AbstractC6731e.ad;
                    ExecutorC3603e executorC3603e2 = ExecutorC3603e.f8134e;
                    C14641e c14641e = new C14641e(i3, 10, interfaceC5083e);
                    this.f3923e = 1;
                    if (AbstractC5336e.advert(executorC3603e2, c14641e, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                this.f3923e = 2;
                if (C16869e.m4202package(c16869e, this) == enumC2821e) {
                    return enumC2821e;
                }
                return Unit.INSTANCE;
            case 3:
                int i7 = this.f3923e;
                if (i7 == 0) {
                    AbstractC2003e.purchase(obj);
                    C15420e c15420e3 = AbstractC6731e.ad;
                    ExecutorC3603e executorC3603e3 = ExecutorC3603e.f8134e;
                    C12559e c12559e = new C12559e(i3, 22, interfaceC5083e);
                    this.f3923e = 1;
                    if (AbstractC5336e.advert(executorC3603e3, c12559e, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                this.f3923e = 2;
                if (C16869e.m4202package(c16869e, this) == enumC2821e) {
                    return enumC2821e;
                }
                return Unit.INSTANCE;
            case 4:
                int i8 = this.f3923e;
                if (i8 == 0) {
                    AbstractC2003e.purchase(obj);
                    C15420e c15420e4 = AbstractC6731e.ad;
                    ExecutorC3603e executorC3603e4 = ExecutorC3603e.f8134e;
                    C12559e c12559e2 = new C12559e(i3, 23, interfaceC5083e);
                    this.f3923e = 1;
                    if (AbstractC5336e.advert(executorC3603e4, c12559e2, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                C15420e c15420e5 = AbstractC6731e.ad;
                C12940e c12940e = AbstractC1497e.ad;
                C18474e c18474e = new C18474e(c16869e, interfaceC5083e, 18);
                this.f3923e = 2;
                if (AbstractC5336e.advert(c12940e, c18474e, this) == enumC2821e) {
                    return enumC2821e;
                }
                return Unit.INSTANCE;
            case 5:
                int i9 = this.f3923e;
                if (i9 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f3923e = 1;
                    C18353e c18353e = C18353e.ad;
                    obj = C18353e.purchase(new C2091e(12), this);
                    if (obj == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                C15420e c15420e6 = AbstractC6731e.ad;
                C12940e c12940e2 = AbstractC1497e.ad;
                C10954e c10954e = new C10954e(c16869e, (List) obj, interfaceC5083e, 20);
                this.f3923e = 2;
                if (AbstractC5336e.advert(c12940e2, c10954e, this) == enumC2821e) {
                    return enumC2821e;
                }
                return Unit.INSTANCE;
            case 6:
                AbstractC2003e.purchase(obj);
                if (c16869e.pro() != null) {
                    AbstractC15615e.ad(new C1478e(i2, (AppActivity) c16869e.pro(), c16869e.pro().getResources().getString(R.string.storage_cleanup_toast, new Integer(this.f3923e))));
                }
                return Unit.INSTANCE;
            default:
                int i10 = this.f3923e;
                if (i10 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f3923e = 1;
                    C2091e c2091e = new C2091e(25);
                    C15420e c15420e7 = AbstractC6731e.ad;
                    obj = AbstractC5336e.advert(ExecutorC3603e.f8134e, new C16373e(c2091e, interfaceC5083e, 9), this);
                    if (obj == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                int intValue = ((Number) obj).intValue();
                C15420e c15420e8 = AbstractC6731e.ad;
                C12940e c12940e3 = AbstractC1497e.ad.f25795e;
                C1240e c1240e2 = new C1240e(c16869e, intValue, (InterfaceC5083e) null);
                this.f3923e = 2;
                if (AbstractC5336e.advert(c12940e3, c1240e2, this) == enumC2821e) {
                    return enumC2821e;
                }
                return Unit.INSTANCE;
        }
    }
}
