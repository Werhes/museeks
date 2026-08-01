package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٞٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3523e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f7943e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C14197e f7944e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f7945e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3523e(C14197e c14197e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f7943e = i;
        this.f7944e = c14197e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f7943e) {
            case 0:
                return new C3523e(this.f7944e, interfaceC5083e, 0);
            case 1:
                return new C3523e(this.f7944e, interfaceC5083e, 1);
            default:
                return new C3523e(this.f7944e, interfaceC5083e, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7943e) {
            case 0:
                return ((C3523e) advert((InterfaceC5083e) obj2, (String) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C3523e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C3523e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f7943e) {
            case 0:
                int i = this.f7945e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f7945e = 1;
                    Object m3764private = C14197e.m3764private(this.f7944e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (m3764private == enumC2821e) {
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
                int i2 = this.f7945e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C14197e c14197e = this.f7944e;
                    InterfaceC1108e yandex = AbstractC7535e.yandex(AbstractC7535e.billing(c14197e.f28053e, 300L));
                    C3523e c3523e = new C3523e(c14197e, null, 0);
                    this.f7945e = 1;
                    Object appmetrica = AbstractC7535e.appmetrica(yandex, c3523e, this);
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
                int i3 = this.f7945e;
                C14197e c14197e2 = this.f7944e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    C13029e c13029e = new C13029e(AbstractC13480e.m3608try(c14197e2.f28052e, ",", null, null, null, 62), 4);
                    this.f7945e = 1;
                    Object subscription = c13029e.subscription(this);
                    EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                    if (subscription == enumC2821e3) {
                        return enumC2821e3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                c14197e2.f28051e.setValue(Boolean.FALSE);
                c14197e2.mo734case();
                return Unit.INSTANCE;
        }
    }
}
