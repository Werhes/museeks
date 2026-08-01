package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۡٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18066e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f35438e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C6260e f35439e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f35440e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18066e(C6260e c6260e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f35438e = i;
        this.f35439e = c6260e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f35438e) {
            case 0:
                return new C18066e(this.f35439e, interfaceC5083e, 0);
            case 1:
                return new C18066e(this.f35439e, interfaceC5083e, 1);
            case 2:
                return new C18066e(this.f35439e, interfaceC5083e, 2);
            case 3:
                return new C18066e(this.f35439e, interfaceC5083e, 3);
            case 4:
                return new C18066e(this.f35439e, interfaceC5083e, 4);
            default:
                return new C18066e(this.f35439e, interfaceC5083e, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f35438e) {
            case 0:
                return ((C18066e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C18066e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C18066e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C18066e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C18066e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C18066e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f35438e;
        C6260e c6260e = this.f35439e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        switch (i) {
            case 0:
                int i2 = this.f35440e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C17647e c17647e = C14157e.f27993e;
                    long Signature = AbstractC0326e.Signature(250, EnumC15934e.MILLISECONDS);
                    this.f35440e = 1;
                    if (AbstractC16481e.metrica(Signature, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                C6260e.vip(c6260e);
                return Unit.INSTANCE;
            case 1:
                int i3 = this.f35440e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f35440e = 1;
                    if (AbstractC16481e.vip(250L, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                C6260e.vip(c6260e);
                return Unit.INSTANCE;
            case 2:
                int i4 = this.f35440e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    C17647e c17647e2 = C14157e.f27993e;
                    long Signature2 = AbstractC0326e.Signature(250, EnumC15934e.MILLISECONDS);
                    this.f35440e = 1;
                    if (AbstractC16481e.metrica(Signature2, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                C6260e.vip(c6260e);
                return Unit.INSTANCE;
            case 3:
                int i5 = this.f35440e;
                if (i5 == 0) {
                    AbstractC2003e.purchase(obj);
                    C17647e c17647e3 = C14157e.f27993e;
                    long Signature3 = AbstractC0326e.Signature(250, EnumC15934e.MILLISECONDS);
                    this.f35440e = 1;
                    if (AbstractC16481e.metrica(Signature3, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                C6260e.vip(c6260e);
                return Unit.INSTANCE;
            case 4:
                int i6 = this.f35440e;
                if (i6 == 0) {
                    AbstractC2003e.purchase(obj);
                    C17647e c17647e4 = C14157e.f27993e;
                    long Signature4 = AbstractC0326e.Signature(250, EnumC15934e.MILLISECONDS);
                    this.f35440e = 1;
                    if (AbstractC16481e.metrica(Signature4, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                C6260e.vip(c6260e);
                return Unit.INSTANCE;
            default:
                int i7 = this.f35440e;
                if (i7 == 0) {
                    AbstractC2003e.purchase(obj);
                    C17647e c17647e5 = C14157e.f27993e;
                    long Signature5 = AbstractC0326e.Signature(250, EnumC15934e.MILLISECONDS);
                    this.f35440e = 1;
                    if (AbstractC16481e.metrica(Signature5, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                C6260e.vip(c6260e);
                return Unit.INSTANCE;
        }
    }
}
