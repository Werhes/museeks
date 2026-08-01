package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11662e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f23431e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C9289e f23432e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f23433e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11662e(C9289e c9289e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f23431e = i;
        this.f23432e = c9289e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f23431e) {
            case 0:
                return new C11662e(this.f23432e, interfaceC5083e, 0);
            case 1:
                return new C11662e(this.f23432e, interfaceC5083e, 1);
            default:
                return new C11662e(this.f23432e, interfaceC5083e, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23431e) {
            case 0:
                return ((C11662e) advert((InterfaceC5083e) obj2, (String) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C11662e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C11662e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f23431e) {
            case 0:
                int i = this.f23433e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C9289e c9289e = this.f23432e;
                    c9289e.adcel.subscription(C10327e.f20377e);
                    this.f23433e = 1;
                    Object ad = c9289e.ad(this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (ad == enumC2821e) {
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
                int i2 = this.f23433e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C9289e c9289e2 = this.f23432e;
                    InterfaceC1108e yandex = AbstractC7535e.yandex(AbstractC7535e.billing(new C12593e(c9289e2.startapp), 300L));
                    C11662e c11662e = new C11662e(c9289e2, null, 0);
                    this.f23433e = 1;
                    Object appmetrica = AbstractC7535e.appmetrica(yandex, c11662e, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (appmetrica == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i3 = this.f23433e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    C9289e c9289e3 = this.f23432e;
                    if (((Boolean) c9289e3.billing.startapp()).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    this.f23433e = 1;
                    Object ad2 = c9289e3.ad(this);
                    EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                    if (ad2 == enumC2821e3) {
                        return enumC2821e3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
