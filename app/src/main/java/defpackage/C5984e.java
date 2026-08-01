package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘّۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5984e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f12627e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC11944e f12628e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC13742e f12629e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f12630e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5984e(InterfaceC13742e interfaceC13742e, InterfaceC11944e interfaceC11944e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f12627e = i;
        this.f12629e = interfaceC13742e;
        this.f12628e = interfaceC11944e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f12627e) {
            case 0:
                return new C5984e(this.f12629e, this.f12628e, interfaceC5083e, 0);
            case 1:
                return new C5984e(this.f12629e, this.f12628e, interfaceC5083e, 1);
            default:
                return new C5984e(this.f12629e, this.f12628e, interfaceC5083e, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f12627e) {
            case 0:
                return ((C5984e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C5984e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C5984e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f12627e) {
            case 0:
                int i = this.f12630e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f12630e = 1;
                    Object billing = AbstractC14533e.billing(this.f12629e, this.f12628e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (billing == enumC2821e) {
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
                int i2 = this.f12630e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f12630e = 1;
                    Object metrica = AbstractC13406e.metrica(this.f12629e, new license(this.f12628e, (InterfaceC5083e) null, 2), this);
                    Object obj2 = EnumC2821e.f6782e;
                    if (metrica != obj2) {
                        metrica = Unit.INSTANCE;
                    }
                    if (metrica == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i3 = this.f12630e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f12630e = 1;
                    final int i4 = 0;
                    final InterfaceC11944e interfaceC11944e = this.f12628e;
                    C13799e c13799e = new C13799e(interfaceC11944e, 0);
                    Function0 function0 = new Function0() { // from class: eٍُٓ
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i4) {
                                case 0:
                                    interfaceC11944e.ad();
                                    return Unit.INSTANCE;
                                default:
                                    interfaceC11944e.onCancel();
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    final int i5 = 1;
                    Object appmetrica = AbstractC11454e.appmetrica(this.f12629e, c13799e, function0, new Function0() { // from class: eٍُٓ
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i5) {
                                case 0:
                                    interfaceC11944e.ad();
                                    return Unit.INSTANCE;
                                default:
                                    interfaceC11944e.onCancel();
                                    return Unit.INSTANCE;
                            }
                        }
                    }, new C17689e(1, interfaceC11944e), this);
                    Object obj3 = EnumC2821e.f6782e;
                    if (appmetrica != obj3) {
                        appmetrica = Unit.INSTANCE;
                    }
                    if (appmetrica == obj3) {
                        return obj3;
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
