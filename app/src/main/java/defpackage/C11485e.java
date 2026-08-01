package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.service.MediaReceiver;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۣؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11485e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f23089e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f23090e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f23091e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11485e(boolean z, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f23089e = i;
        this.f23090e = z;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f23089e) {
            case 0:
                return new C11485e(this.f23090e, interfaceC5083e, 0);
            case 1:
                return new C11485e(this.f23090e, interfaceC5083e, 1);
            case 2:
                return new C11485e(this.f23090e, interfaceC5083e, 2);
            case 3:
                return new C11485e(this.f23090e, interfaceC5083e, 3);
            case 4:
                return new C11485e(this.f23090e, interfaceC5083e, 4);
            case 5:
                return new C11485e(this.f23090e, interfaceC5083e, 5);
            case 6:
                return new C11485e(this.f23090e, interfaceC5083e, 6);
            case 7:
                return new C11485e(this.f23090e, interfaceC5083e, 7);
            case 8:
                return new C11485e(this.f23090e, interfaceC5083e, 8);
            case 9:
                return new C11485e(this.f23090e, interfaceC5083e, 9);
            case 10:
                return new C11485e(this.f23090e, interfaceC5083e, 10);
            case 11:
                return new C11485e(this.f23090e, interfaceC5083e, 11);
            case 12:
                return new C11485e(this.f23090e, interfaceC5083e, 12);
            case 13:
                return new C11485e(this.f23090e, interfaceC5083e, 13);
            case 14:
                return new C11485e(this.f23090e, interfaceC5083e, 14);
            case 15:
                return new C11485e(this.f23090e, interfaceC5083e, 15);
            default:
                return new C11485e(this.f23090e, interfaceC5083e, 16);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f23089e) {
            case 0:
                return ((C11485e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C11485e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C11485e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C11485e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C11485e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C11485e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C11485e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 7:
                return ((C11485e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 8:
                return ((C11485e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 9:
                return ((C11485e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 10:
                return ((C11485e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 11:
                return ((C11485e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 12:
                return ((C11485e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 13:
                return ((C11485e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 14:
                return ((C11485e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 15:
                return ((C11485e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C11485e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f23089e;
        int i2 = 2;
        InterfaceC5083e interfaceC5083e = null;
        boolean z = this.f23090e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        int i3 = 1;
        switch (i) {
            case 0:
                int i4 = this.f23091e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    C16452e c16452e = (C16452e) AbstractC1831e.metrica().f22771e;
                    this.f23091e = 1;
                    if (((InterfaceC8018e) c16452e.f32285e).vip(new C3353e(z, interfaceC5083e, 17), this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                AbstractC15933e.vip(AbstractC17378e.ad(), new float[]{0.0f, 0.0f}, true);
                return Unit.INSTANCE;
            case 1:
                int i5 = this.f23091e;
                if (i5 == 0) {
                    AbstractC2003e.purchase(obj);
                    C0731e c0731e = (C0731e) AbstractC1831e.metrica().f22770e;
                    this.f23091e = 1;
                    if (((InterfaceC8018e) c0731e.f3025e).vip(new C3353e(z, interfaceC5083e, 3), this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 2:
                int i6 = this.f23091e;
                if (i6 == 0) {
                    AbstractC2003e.purchase(obj);
                    int i7 = MediaReceiver.ad;
                    this.f23091e = 1;
                    if (AbstractC18209e.purchase(z, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 3:
                int i8 = this.f23091e;
                if (i8 == 0) {
                    AbstractC2003e.purchase(obj);
                    C6325e c6325e = (C6325e) AbstractC1831e.metrica().f22772e;
                    this.f23091e = 1;
                    if (((InterfaceC8018e) c6325e.f13170e).vip(new C3353e(z, interfaceC5083e, 15), this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 4:
                int i9 = this.f23091e;
                if (i9 == 0) {
                    AbstractC2003e.purchase(obj);
                    C6325e c6325e2 = (C6325e) AbstractC1831e.metrica().f22772e;
                    this.f23091e = 1;
                    if (((InterfaceC8018e) c6325e2.f13170e).vip(new C3353e(z, interfaceC5083e, 6), this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 5:
                int i10 = this.f23091e;
                if (i10 == 0) {
                    AbstractC2003e.purchase(obj);
                    C6325e c6325e3 = (C6325e) AbstractC1831e.metrica().f22772e;
                    this.f23091e = 1;
                    if (((InterfaceC8018e) c6325e3.f13170e).vip(new C3353e(z, interfaceC5083e, 4), this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 6:
                int i11 = this.f23091e;
                if (i11 == 0) {
                    AbstractC2003e.purchase(obj);
                    C6325e c6325e4 = (C6325e) AbstractC1831e.metrica().f22772e;
                    this.f23091e = 1;
                    if (((InterfaceC8018e) c6325e4.f13170e).vip(new C3353e(z, interfaceC5083e, 11), this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 7:
                int i12 = this.f23091e;
                if (i12 == 0) {
                    AbstractC2003e.purchase(obj);
                    C6325e c6325e5 = (C6325e) AbstractC1831e.metrica().f22772e;
                    this.f23091e = 1;
                    if (((InterfaceC8018e) c6325e5.f13170e).vip(new C3353e(z, interfaceC5083e, 12), this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 8:
                int i13 = this.f23091e;
                if (i13 == 0) {
                    AbstractC2003e.purchase(obj);
                    C6325e c6325e6 = (C6325e) AbstractC1831e.metrica().f22772e;
                    this.f23091e = 1;
                    if (((InterfaceC8018e) c6325e6.f13170e).vip(new C3353e(z, interfaceC5083e, 9), this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 9:
                int i14 = this.f23091e;
                if (i14 == 0) {
                    AbstractC2003e.purchase(obj);
                    C6325e c6325e7 = (C6325e) AbstractC1831e.metrica().f22772e;
                    this.f23091e = 1;
                    if (((InterfaceC8018e) c6325e7.f13170e).vip(new C3353e(z, interfaceC5083e, 7), this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 10:
                int i15 = this.f23091e;
                if (i15 == 0) {
                    AbstractC2003e.purchase(obj);
                    C6325e c6325e8 = (C6325e) AbstractC1831e.metrica().f22772e;
                    this.f23091e = 1;
                    if (((InterfaceC8018e) c6325e8.f13170e).vip(new C3353e(z, interfaceC5083e, 8), this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 11:
                int i16 = this.f23091e;
                if (i16 == 0) {
                    AbstractC2003e.purchase(obj);
                    C6325e c6325e9 = (C6325e) AbstractC1831e.metrica().f22772e;
                    this.f23091e = 1;
                    if (((InterfaceC8018e) c6325e9.f13170e).vip(new C3353e(z, interfaceC5083e, 5), this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 12:
                int i17 = this.f23091e;
                if (i17 == 0) {
                    AbstractC2003e.purchase(obj);
                    C6325e c6325e10 = (C6325e) AbstractC1831e.metrica().f22772e;
                    this.f23091e = 1;
                    if (((InterfaceC8018e) c6325e10.f13170e).vip(new C3353e(z, interfaceC5083e, 14), this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 13:
                int i18 = this.f23091e;
                if (i18 == 0) {
                    AbstractC2003e.purchase(obj);
                    C6325e c6325e11 = (C6325e) AbstractC1831e.metrica().f22772e;
                    this.f23091e = 1;
                    if (((InterfaceC8018e) c6325e11.f13170e).vip(new C3353e(z, interfaceC5083e, 10), this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 14:
                int i19 = this.f23091e;
                if (i19 == 0) {
                    AbstractC2003e.purchase(obj);
                    C6325e c6325e12 = (C6325e) AbstractC1831e.metrica().f22772e;
                    this.f23091e = 1;
                    if (((InterfaceC8018e) c6325e12.f13170e).vip(new C3353e(z, interfaceC5083e, 13), this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 15:
                int i20 = this.f23091e;
                if (i20 == 0) {
                    AbstractC2003e.purchase(obj);
                    C0731e c0731e2 = (C0731e) AbstractC1831e.metrica().f22770e;
                    this.f23091e = 1;
                    if (((InterfaceC8018e) c0731e2.f3025e).vip(new C3353e(z, interfaceC5083e, i3), this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i21 = this.f23091e;
                if (i21 == 0) {
                    AbstractC2003e.purchase(obj);
                    C0731e c0731e3 = (C0731e) AbstractC1831e.metrica().f22770e;
                    this.f23091e = 1;
                    if (((InterfaceC8018e) c0731e3.f3025e).vip(new C3353e(z, interfaceC5083e, i2), this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
