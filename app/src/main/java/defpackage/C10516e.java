package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10516e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f20774e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C7765e f20775e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f20776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10516e(C7765e c7765e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f20774e = i;
        this.f20775e = c7765e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f20774e) {
            case 0:
                return new C10516e(this.f20775e, interfaceC5083e, 0);
            case 1:
                return new C10516e(this.f20775e, interfaceC5083e, 1);
            case 2:
                return new C10516e(this.f20775e, interfaceC5083e, 2);
            default:
                return new C10516e(this.f20775e, interfaceC5083e, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20774e) {
            case 0:
                long j = ((C2152e) obj).ad;
                return new C10516e(this.f20775e, (InterfaceC5083e) obj2, 0).loadAd(Unit.INSTANCE);
            case 1:
                return ((C10516e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C10516e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C10516e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f20774e) {
            case 0:
                int i = this.f20776e;
                C7765e c7765e = this.f20775e;
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f20776e = 1;
                    if (c7765e.applovin() == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                InterfaceC3358e interfaceC3358e = c7765e.yandex;
                C11388e c11388e = c7765e.ad;
                if (interfaceC3358e != null) {
                    CharSequence charSequence = c11388e.license().f33322e;
                    long j = c11388e.license().f33324e;
                    this.f20776e = 2;
                    Object license = ((C13189e) interfaceC3358e).license(charSequence, j, this);
                    if (license != enumC2821e) {
                        license = Unit.INSTANCE;
                    }
                    if (license == enumC2821e) {
                        return enumC2821e;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                int i2 = this.f20776e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f20776e = 1;
                    Object isPro = this.f20775e.isPro(this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (isPro == enumC2821e2) {
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
                int i3 = this.f20776e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f20776e = 1;
                    C7765e c7765e2 = this.f20775e;
                    c7765e2.getClass();
                    C10250e smaato = AbstractC14533e.smaato(new C18486e(c7765e2, 5));
                    C1095e c1095e = C1095e.f3637e;
                    AbstractC9476e.purchase(2, c1095e);
                    Object ad = AbstractC17673e.appmetrica(smaato, AbstractC17673e.ad, c1095e).ad(new C17191e(new Object(), new C11568e(c7765e2, 0), 4), this);
                    EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                    if (ad != enumC2821e3) {
                        ad = Unit.INSTANCE;
                    }
                    if (ad != enumC2821e3) {
                        ad = Unit.INSTANCE;
                    }
                    if (ad == enumC2821e3) {
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
                int i4 = this.f20776e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f20776e = 1;
                    C7765e c7765e3 = this.f20775e;
                    c7765e3.getClass();
                    Object ad2 = AbstractC17673e.appmetrica(AbstractC14533e.smaato(new C18486e(c7765e3, 4)), new C4671e(21), AbstractC17673e.vip).ad(new C11568e(c7765e3, 1), this);
                    EnumC2821e enumC2821e4 = EnumC2821e.f6782e;
                    if (ad2 != enumC2821e4) {
                        ad2 = Unit.INSTANCE;
                    }
                    if (ad2 == enumC2821e4) {
                        return enumC2821e4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
