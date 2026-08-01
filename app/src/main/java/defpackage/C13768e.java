package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؕۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13768e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f27280e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f27281e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f27282e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f27283e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13768e(Function2 function2, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f27280e = i;
        this.f27281e = function2;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f27280e) {
            case 0:
                C13768e c13768e = new C13768e(this.f27281e, interfaceC5083e, 0);
                c13768e.f27282e = obj;
                return c13768e;
            case 1:
                C13768e c13768e2 = new C13768e(this.f27281e, interfaceC5083e, 1);
                c13768e2.f27282e = obj;
                return c13768e2;
            case 2:
                C13768e c13768e3 = new C13768e(this.f27281e, interfaceC5083e, 2);
                c13768e3.f27282e = obj;
                return c13768e3;
            default:
                C13768e c13768e4 = new C13768e(this.f27281e, interfaceC5083e, 3);
                c13768e4.f27282e = obj;
                return c13768e4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27280e) {
            case 0:
                return ((C13768e) advert((InterfaceC5083e) obj2, (C0044e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C13768e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C13768e) advert((InterfaceC5083e) obj2, (InterfaceC13742e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C13768e) advert((InterfaceC5083e) obj2, (InterfaceC13742e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f27280e) {
            case 0:
                C0044e c0044e = (C0044e) this.f27282e;
                int i = this.f27283e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f27282e = null;
                    this.f27283e = 1;
                    obj = this.f27281e.invoke(c0044e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (obj == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                C0044e c0044e2 = (C0044e) obj;
                ((AtomicBoolean) c0044e2.vip.f13613e).set(true);
                return c0044e2;
            case 1:
                int i2 = this.f27283e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f27282e;
                    this.f27283e = 1;
                    Object invoke = this.f27281e.invoke(interfaceC18435e, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (invoke == enumC2821e2) {
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
                int i3 = this.f27283e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC13742e interfaceC13742e = (InterfaceC13742e) this.f27282e;
                    C4836e c4836e = new C4836e(this.f27281e, null, 2);
                    this.f27283e = 1;
                    Object m1364e = ((C3427e) interfaceC13742e).m1364e(c4836e, this);
                    EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                    if (m1364e == enumC2821e3) {
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
                int i4 = this.f27283e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC13742e interfaceC13742e2 = (InterfaceC13742e) this.f27282e;
                    C13768e c13768e = new C13768e(this.f27281e, null, 2);
                    this.f27283e = 1;
                    Object license = AbstractC13406e.license(interfaceC13742e2, c13768e, this);
                    EnumC2821e enumC2821e4 = EnumC2821e.f6782e;
                    if (license == enumC2821e4) {
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
