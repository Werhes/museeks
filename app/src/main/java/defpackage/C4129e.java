package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4129e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f9099e = 1;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C7567e f9100e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6034e f9101e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f9102e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f9103e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4129e(C7567e c7567e, InterfaceC6034e interfaceC6034e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f9100e = c7567e;
        this.f9101e = interfaceC6034e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4129e(C7567e c7567e, InterfaceC6034e interfaceC6034e, Object obj, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f9100e = c7567e;
        this.f9101e = interfaceC6034e;
        this.f9102e = obj;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f9099e) {
            case 0:
                return new C4129e(this.f9100e, this.f9101e, this.f9102e, interfaceC5083e);
            default:
                C4129e c4129e = new C4129e(this.f9100e, this.f9101e, interfaceC5083e);
                c4129e.f9102e = obj;
                return c4129e;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f9099e) {
            case 0:
                return ((C4129e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C4129e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [eؚٖؓ, kotlin.jvm.functions.Function3] */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f9099e) {
            case 0:
                int i = this.f9103e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    ?? r9 = this.f9100e.f15391e;
                    Object obj2 = this.f9102e;
                    this.f9103e = 1;
                    Object invoke = r9.invoke(this.f9101e, obj2, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (invoke == enumC2821e) {
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
                int i2 = this.f9103e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f9102e;
                    Object obj3 = new Object();
                    C7567e c7567e = this.f9100e;
                    InterfaceC1108e interfaceC1108e = c7567e.f7111e;
                    C12784e c12784e = new C12784e(obj3, interfaceC18435e, c7567e, this.f9101e, 0);
                    this.f9103e = 1;
                    Object ad = interfaceC1108e.ad(c12784e, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (ad == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
