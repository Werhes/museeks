package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؔۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3029e extends AbstractC7185e implements Function4 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f7096e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ boolean f7097e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ C16007e f7098e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f7099e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3029e(int i, int i2, InterfaceC5083e interfaceC5083e) {
        super(i, interfaceC5083e);
        this.f7096e = i2;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f7096e;
        C16007e c16007e = (C16007e) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj4;
        switch (i) {
            case 0:
                C3029e c3029e = new C3029e(4, 0, interfaceC5083e);
                c3029e.f7098e = c16007e;
                c3029e.f7097e = booleanValue;
                return c3029e.loadAd(Unit.INSTANCE);
            default:
                C3029e c3029e2 = new C3029e(4, 1, interfaceC5083e);
                c3029e2.f7098e = c16007e;
                c3029e2.f7097e = booleanValue;
                return c3029e2.loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f7096e) {
            case 0:
                int i = this.f7099e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C16007e c16007e = this.f7098e;
                    if (this.f7097e) {
                        this.f7099e = 1;
                        Object purchase = c16007e.purchase(C8803e.ad, this);
                        EnumC2821e enumC2821e = EnumC2821e.f6782e;
                        if (purchase != enumC2821e) {
                            purchase = Unit.INSTANCE;
                        }
                        if (purchase == enumC2821e) {
                            return enumC2821e;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i2 = this.f7099e;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                C16007e c16007e2 = this.f7098e;
                if (this.f7097e) {
                    return null;
                }
                this.f7099e = 1;
                Object billing = c16007e2.billing(this);
                EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                return billing == enumC2821e2 ? enumC2821e2 : billing;
        }
    }
}
