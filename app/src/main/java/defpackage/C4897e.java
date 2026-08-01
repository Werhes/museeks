package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٔۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4897e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f10377e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C7576e f10378e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f10379e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4897e(int i, InterfaceC5083e interfaceC5083e, C7576e c7576e) {
        super(2, interfaceC5083e);
        this.f10377e = i;
        this.f10378e = c7576e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4897e(C7576e c7576e, InterfaceC5979e interfaceC5979e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f10377e = 3;
        this.f10378e = c7576e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f10377e) {
            case 0:
                return new C4897e(0, interfaceC5083e, this.f10378e);
            case 1:
                return new C4897e(1, interfaceC5083e, this.f10378e);
            case 2:
                return new C4897e(2, interfaceC5083e, this.f10378e);
            case 3:
                return new C4897e(this.f10378e, (InterfaceC5979e) null, interfaceC5083e);
            default:
                return new C4897e(4, interfaceC5083e, this.f10378e);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10377e) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((C4897e) advert((InterfaceC5083e) obj2, bool)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C4897e) advert((InterfaceC5083e) obj2, (InterfaceC6034e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C4897e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C4897e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((C4897e) advert((InterfaceC5083e) obj2, bool2)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f10377e) {
            case 0:
                int i = this.f10379e;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                InterfaceC4417e billing = this.f10378e.billing();
                this.f10379e = 1;
                Object ad = billing.ad(this);
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                return ad == enumC2821e ? enumC2821e : ad;
            case 1:
                int i2 = this.f10379e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f10379e = 1;
                    Object license = C7576e.license(this.f10378e, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (license == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 2:
                int i3 = this.f10379e;
                C7576e c7576e = this.f10378e;
                EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    C11467e c11467e = c7576e.adcel;
                    this.f10379e = 1;
                    Object tapsense = ((C8823e) c11467e.f23070e).tapsense(this);
                    if (tapsense != enumC2821e3) {
                        tapsense = Unit.INSTANCE;
                    }
                    if (tapsense == enumC2821e3) {
                        return enumC2821e3;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                InterfaceC1108e ad2 = AbstractC7535e.ad(c7576e.billing().appmetrica(), -1);
                C5845e c5845e = new C5845e(7, c7576e);
                this.f10379e = 2;
                if (ad2.ad(c5845e, this) == enumC2821e3) {
                    return enumC2821e3;
                }
                return Unit.INSTANCE;
            case 3:
                int i4 = this.f10379e;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                C10959e c10959e = new C10959e(0, null, this.f10378e);
                this.f10379e = 1;
                Object purchase = AbstractC12731e.purchase(c10959e, this);
                EnumC2821e enumC2821e4 = EnumC2821e.f6782e;
                return purchase == enumC2821e4 ? enumC2821e4 : purchase;
            default:
                int i5 = this.f10379e;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                InterfaceC4417e billing2 = this.f10378e.billing();
                this.f10379e = 1;
                Object ad3 = billing2.ad(this);
                EnumC2821e enumC2821e5 = EnumC2821e.f6782e;
                return ad3 == enumC2821e5 ? enumC2821e5 : ad3;
        }
    }
}
