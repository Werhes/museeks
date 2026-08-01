package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9609e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f19054e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C9798e f19055e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f19056e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9609e(C9798e c9798e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f19054e = i;
        this.f19055e = c9798e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f19054e) {
            case 0:
                return new C9609e(this.f19055e, interfaceC5083e, 0);
            case 1:
                return new C9609e(this.f19055e, interfaceC5083e, 1);
            default:
                return new C9609e(this.f19055e, interfaceC5083e, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f19054e) {
            case 0:
                return ((C9609e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C9609e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C9609e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f19054e) {
            case 0:
                int i = this.f19056e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C9798e c9798e = this.f19055e;
                    C11200e c11200e = c9798e.f19358e;
                    float f = c9798e.f19353e ? 1.0f : 0.0f;
                    this.f19056e = 1;
                    Object purchase = c11200e.ad.purchase(this, new Float(f));
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (purchase != enumC2821e) {
                        purchase = Unit.INSTANCE;
                    }
                    if (purchase == enumC2821e) {
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
                int i2 = this.f19056e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C9798e c9798e2 = this.f19055e;
                    if (!c9798e2.f19358e.ad.appmetrica()) {
                        C11200e c11200e2 = c9798e2.f19358e;
                        float purchase2 = c9798e2.f19356e.purchase() / c9798e2.m2670e();
                        this.f19056e = 1;
                        Object purchase3 = c11200e2.ad.purchase(this, new Float(purchase2));
                        EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                        if (purchase3 != enumC2821e2) {
                            purchase3 = Unit.INSTANCE;
                        }
                        if (purchase3 == enumC2821e2) {
                            return enumC2821e2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i3 = this.f19056e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    C9798e c9798e3 = this.f19055e;
                    boolean z = c9798e3.f19353e;
                    EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                    if (z) {
                        this.f19056e = 2;
                        if (C9798e.m2664e(c9798e3, this) == enumC2821e3) {
                            return enumC2821e3;
                        }
                    } else {
                        this.f19056e = 1;
                        if (c9798e3.m2665e(this) == enumC2821e3) {
                            return enumC2821e3;
                        }
                    }
                } else {
                    if (i3 != 1 && i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
