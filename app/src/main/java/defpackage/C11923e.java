package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۗٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11923e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f23890e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f23891e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ float f23892e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f23893e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11923e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(3, interfaceC5083e);
        this.f23890e = i;
        this.f23891e = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f23890e;
        float floatValue = ((Number) obj2).floatValue();
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj3;
        switch (i) {
            case 0:
                C11923e c11923e = new C11923e((C5640e) this.f23891e, interfaceC5083e, 0);
                c11923e.f23892e = floatValue;
                return c11923e.loadAd(Unit.INSTANCE);
            default:
                C11923e c11923e2 = new C11923e((C2702e) this.f23891e, interfaceC5083e, 1);
                c11923e2.f23892e = floatValue;
                return c11923e2.loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f23890e) {
            case 0:
                InterfaceC2566e interfaceC2566e = ((C5640e) this.f23891e).advert;
                int i = this.f23893e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    float f = this.f23892e;
                    C5070e state = interfaceC2566e.getState();
                    C15217e vip = interfaceC2566e.vip();
                    InterfaceC2869e metrica = interfaceC2566e.metrica();
                    this.f23893e = 1;
                    Object billing = AbstractC10560e.billing(state, f, vip, metrica, this);
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
            default:
                InterfaceC2566e interfaceC2566e2 = ((C2702e) this.f23891e).subscription;
                int i2 = this.f23893e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    float f2 = this.f23892e;
                    C5070e state2 = interfaceC2566e2.getState();
                    C15217e vip2 = interfaceC2566e2.vip();
                    InterfaceC2869e metrica2 = interfaceC2566e2.metrica();
                    this.f23893e = 1;
                    Object billing2 = AbstractC10560e.billing(state2, f2, vip2, metrica2, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (billing2 == enumC2821e2) {
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
