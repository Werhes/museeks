package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۥۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17402e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f34112e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f34113e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C4993e f34114e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17402e(C4993e c4993e, int i, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f34112e = 1;
        this.f34114e = c4993e;
        this.f34113e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17402e(C4993e c4993e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f34112e = i;
        this.f34114e = c4993e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f34112e) {
            case 0:
                return new C17402e(this.f34114e, interfaceC5083e, 0);
            case 1:
                return new C17402e(this.f34114e, this.f34113e, interfaceC5083e);
            default:
                return new C17402e(this.f34114e, interfaceC5083e, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f34112e) {
            case 0:
                return ((C17402e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C17402e) advert((InterfaceC5083e) obj2, (InterfaceC1719e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C17402e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f34112e) {
            case 0:
                int i = this.f34113e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C14641e c14641e = new C14641e(2, 5, null);
                    this.f34113e = 1;
                    Object vip = this.f34114e.vip(EnumC6955e.f14256e, c14641e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (vip == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC2003e.purchase(obj);
                this.f34114e.mopub(this.f34113e, 0, true);
                return Unit.INSTANCE;
            default:
                int i2 = this.f34113e;
                EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C8865e c8865e = C8865e.f17820e;
                    this.f34113e = 1;
                    if (AbstractC0326e.subscription(c8865e, this) == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                this.f34113e = 2;
                if (C4993e.adcel(this.f34114e, 0, this) == enumC2821e2) {
                    return enumC2821e2;
                }
                return Unit.INSTANCE;
        }
    }
}
