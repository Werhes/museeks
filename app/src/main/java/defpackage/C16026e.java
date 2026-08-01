package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16026e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f31557e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C17612e f31558e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6102e f31559e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C15274e f31560e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f31561e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16026e(C15274e c15274e, C17612e c17612e, AbstractC6102e abstractC6102e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f31557e = i;
        this.f31560e = c15274e;
        this.f31558e = c17612e;
        this.f31559e = abstractC6102e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f31557e) {
            case 0:
                return new C16026e(this.f31560e, this.f31558e, this.f31559e, interfaceC5083e, 0);
            default:
                return new C16026e(this.f31560e, this.f31558e, this.f31559e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f31557e) {
            case 0:
                return ((C16026e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C16026e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f31557e) {
            case 0:
                int i = this.f31561e;
                C17612e c17612e = this.f31558e;
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    long j = AbstractC8049e.ad;
                    this.f31561e = 1;
                    if (AbstractC16481e.vip(j, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        this.f31559e.f12790e = c17612e;
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                this.f31561e = 2;
                if (this.f31560e.ad(c17612e, this) == enumC2821e) {
                    return enumC2821e;
                }
                this.f31559e.f12790e = c17612e;
                return Unit.INSTANCE;
            default:
                int i2 = this.f31561e;
                C17612e c17612e2 = this.f31558e;
                EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    long j2 = AbstractC8049e.ad;
                    this.f31561e = 1;
                    if (AbstractC16481e.vip(j2, this) == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        this.f31559e.f12801e = c17612e2;
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                this.f31561e = 2;
                if (this.f31560e.ad(c17612e2, this) == enumC2821e2) {
                    return enumC2821e2;
                }
                this.f31559e.f12801e = c17612e2;
                return Unit.INSTANCE;
        }
    }
}
