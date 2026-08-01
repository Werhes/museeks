package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٝؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18238e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f35699e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C1902e f35700e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f35701e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18238e(C1902e c1902e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f35699e = i;
        this.f35700e = c1902e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f35699e) {
            case 0:
                return new C18238e(this.f35700e, interfaceC5083e, 0);
            case 1:
                return new C18238e(this.f35700e, interfaceC5083e, 1);
            case 2:
                return new C18238e(this.f35700e, interfaceC5083e, 2);
            case 3:
                return new C18238e(this.f35700e, interfaceC5083e, 3);
            case 4:
                return new C18238e(this.f35700e, interfaceC5083e, 4);
            default:
                return new C18238e(this.f35700e, interfaceC5083e, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f35699e) {
            case 0:
                return ((C18238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C18238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C18238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C18238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C18238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                ((C18238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
                return EnumC2821e.f6782e;
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f35699e) {
            case 0:
                int i = this.f35701e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C7765e c7765e = this.f35700e.f5077e;
                    this.f35701e = 1;
                    Unit appmetrica = c7765e.appmetrica(true, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (appmetrica == enumC2821e) {
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
                int i2 = this.f35701e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C7765e c7765e2 = this.f35700e.f5077e;
                    this.f35701e = 1;
                    Unit purchase = c7765e2.purchase(this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (purchase == enumC2821e2) {
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
                int i3 = this.f35701e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    C7765e c7765e3 = this.f35700e.f5077e;
                    this.f35701e = 1;
                    Object remoteconfig = c7765e3.remoteconfig(this);
                    EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                    if (remoteconfig == enumC2821e3) {
                        return enumC2821e3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 3:
                int i4 = this.f35701e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f35701e = 1;
                    C1902e c1902e = this.f35700e;
                    Object ad = AbstractC7535e.remoteconfig(new C7371e(AbstractC14533e.smaato(new C10593e(c1902e, 7)), 14), 1).ad(new C5845e(18, c1902e), this);
                    EnumC2821e enumC2821e4 = EnumC2821e.f6782e;
                    if (ad != enumC2821e4) {
                        ad = Unit.INSTANCE;
                    }
                    if (ad == enumC2821e4) {
                        return enumC2821e4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 4:
                int i5 = this.f35701e;
                if (i5 == 0) {
                    AbstractC2003e.purchase(obj);
                    C7765e c7765e4 = this.f35700e.f5077e;
                    this.f35701e = 1;
                    Object isPro = c7765e4.isPro(this);
                    EnumC2821e enumC2821e5 = EnumC2821e.f6782e;
                    if (isPro == enumC2821e5) {
                        return enumC2821e5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i6 = this.f35701e;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    throw new C14803e(9);
                }
                AbstractC2003e.purchase(obj);
                C1902e c1902e2 = this.f35700e;
                C7602e c7602e = new C7602e(c1902e2, null, 28);
                this.f35701e = 1;
                AbstractC1807e.ad(c1902e2, c7602e, this);
                return EnumC2821e.f6782e;
        }
    }
}
