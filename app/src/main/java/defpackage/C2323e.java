package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؒٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2323e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f5839e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C2038e f5840e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C12805e f5841e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f5842e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f5843e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2323e(C2038e c2038e, C12805e c12805e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f5839e = i;
        this.f5840e = c2038e;
        this.f5841e = c12805e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f5839e) {
            case 0:
                C2323e c2323e = new C2323e(this.f5840e, this.f5841e, interfaceC5083e, 0);
                c2323e.f5842e = obj;
                return c2323e;
            default:
                C2323e c2323e2 = new C2323e(this.f5840e, this.f5841e, interfaceC5083e, 1);
                c2323e2.f5842e = obj;
                return c2323e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f5839e) {
            case 0:
                return ((C2323e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C2323e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f5839e) {
            case 0:
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f5842e;
                int i = this.f5843e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    final int i2 = 0;
                    final C12805e c12805e = this.f5841e;
                    C10250e smaato = AbstractC14533e.smaato(new Function0() { // from class: eْْٖ
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i2) {
                                case 0:
                                    return (EnumC13413e) c12805e.license.getValue();
                                default:
                                    Boolean bool = (Boolean) c12805e.yandex.getValue();
                                    bool.getClass();
                                    return bool;
                            }
                        }
                    });
                    C2038e c2038e = this.f5840e;
                    InterfaceC1108e billing = AbstractC7535e.billing(new C7368e(AbstractC17673e.appmetrica(new C10250e(5, new C6989e(AbstractC14114e.appmetrica(AbstractC14533e.smaato(new C5636e(c2038e, 4)), c2038e.ad.f8255e, EnumC7785e.f15776e), 1)), new C3685e(27), AbstractC17673e.vip), smaato, new C15985e(3, 5, (InterfaceC5083e) null)), 500L);
                    C1247e c1247e = new C1247e(interfaceC18435e, c12805e, (InterfaceC5083e) null);
                    this.f5842e = null;
                    this.f5843e = 1;
                    Object appmetrica = AbstractC7535e.appmetrica(billing, c1247e, this);
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
            default:
                InterfaceC18435e interfaceC18435e2 = (InterfaceC18435e) this.f5842e;
                int i3 = this.f5843e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    final int i4 = 1;
                    final C12805e c12805e2 = this.f5841e;
                    C17787e c17787e = new C17787e(AbstractC14114e.appmetrica(new C17787e(AbstractC14533e.smaato(new Function0() { // from class: eْْٖ
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i4) {
                                case 0:
                                    return (EnumC13413e) c12805e2.license.getValue();
                                default:
                                    Boolean bool = (Boolean) c12805e2.yandex.getValue();
                                    bool.getClass();
                                    return bool;
                            }
                        }
                    }), new C2452e(c12805e2, null, 0)), this.f5840e.ad.f8255e, EnumC7785e.f15776e), new C2452e(c12805e2, null, 1));
                    C5845e c5845e = new C5845e(interfaceC18435e2, c12805e2);
                    this.f5842e = null;
                    this.f5843e = 1;
                    Object ad = c17787e.ad(c5845e, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (ad == enumC2821e2) {
                        return enumC2821e2;
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
