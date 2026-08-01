package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٍٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9358e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f18623e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ long f18624e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C10469e f18625e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f18626e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9358e(C10469e c10469e, long j, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f18623e = i;
        this.f18625e = c10469e;
        this.f18624e = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9358e(C10469e c10469e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f18623e = 3;
        this.f18625e = c10469e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f18623e) {
            case 0:
                return new C9358e(this.f18625e, this.f18624e, interfaceC5083e, 0);
            case 1:
                return new C9358e(this.f18625e, this.f18624e, interfaceC5083e, 1);
            case 2:
                return new C9358e(this.f18625e, this.f18624e, interfaceC5083e, 2);
            default:
                C9358e c9358e = new C9358e(this.f18625e, interfaceC5083e);
                c9358e.f18624e = ((C2152e) obj).ad;
                return c9358e;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18623e) {
            case 0:
                return ((C9358e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C9358e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C9358e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                long j = ((C2152e) obj).ad;
                C9358e c9358e = new C9358e(this.f18625e, (InterfaceC5083e) obj2);
                c9358e.f18624e = j;
                return c9358e.loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f18623e) {
            case 0:
                int i = this.f18626e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C11950e c11950e = this.f18625e.f20666e;
                    C8257e c8257e = new C8257e(this.f18624e, null);
                    this.f18626e = 1;
                    Object purchase = c11950e.purchase(EnumC6955e.f14254e, c8257e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (purchase == enumC2821e) {
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
                int i2 = this.f18626e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C11950e c11950e2 = this.f18625e.f20666e;
                    long j = this.f18624e;
                    this.f18626e = 1;
                    Object vip = c11950e2.vip(j, false, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (vip == enumC2821e2) {
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
                int i3 = this.f18626e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    C11950e c11950e3 = this.f18625e.f20666e;
                    long j2 = this.f18624e;
                    this.f18626e = 1;
                    Object vip2 = c11950e3.vip(j2, true, this);
                    EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                    if (vip2 == enumC2821e3) {
                        return enumC2821e3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i4 = this.f18626e;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                long j3 = this.f18624e;
                C11950e c11950e4 = this.f18625e.f20666e;
                this.f18626e = 1;
                Object metrica = AbstractC16342e.metrica(c11950e4, j3, this);
                EnumC2821e enumC2821e4 = EnumC2821e.f6782e;
                return metrica == enumC2821e4 ? enumC2821e4 : metrica;
        }
    }
}
