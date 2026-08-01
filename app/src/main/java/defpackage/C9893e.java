package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۥۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9893e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f19506e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC13352e f19507e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ float f19508e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f19509e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ boolean f19510e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C7558e f19511e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f19512e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9893e(C7558e c7558e, float f, boolean z, InterfaceC13352e interfaceC13352e, InterfaceC3314e interfaceC3314e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f19506e = i;
        this.f19511e = c7558e;
        this.f19508e = f;
        this.f19510e = z;
        this.f19507e = interfaceC13352e;
        this.f19509e = interfaceC3314e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f19506e) {
            case 0:
                return new C9893e(this.f19511e, this.f19508e, this.f19510e, this.f19507e, this.f19509e, interfaceC5083e, 0);
            default:
                return new C9893e(this.f19511e, this.f19508e, this.f19510e, this.f19507e, this.f19509e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f19506e) {
            case 0:
                return ((C9893e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C9893e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f19506e) {
            case 0:
                int i = this.f19512e;
                InterfaceC13352e interfaceC13352e = this.f19507e;
                InterfaceC3314e interfaceC3314e = this.f19509e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C7558e c7558e = this.f19511e;
                    float f = ((C15765e) c7558e.appmetrica.getValue()).f31051e;
                    float f2 = this.f19508e;
                    if (!C15765e.vip(f, f2)) {
                        boolean z = this.f19510e;
                        EnumC2821e enumC2821e = EnumC2821e.f6782e;
                        if (z) {
                            InterfaceC13352e interfaceC13352e2 = (InterfaceC13352e) interfaceC3314e.getValue();
                            this.f19512e = 2;
                            if (AbstractC5237e.ad(c7558e, f2, interfaceC13352e2, interfaceC13352e, this) == enumC2821e) {
                                return enumC2821e;
                            }
                        } else {
                            C15765e c15765e = new C15765e(f2);
                            this.f19512e = 1;
                            if (c7558e.purchase(this, c15765e) == enumC2821e) {
                                return enumC2821e;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2003e.purchase(obj);
                interfaceC3314e.setValue(interfaceC13352e);
                return Unit.INSTANCE;
            default:
                int i2 = this.f19512e;
                InterfaceC13352e interfaceC13352e3 = this.f19507e;
                InterfaceC3314e interfaceC3314e2 = this.f19509e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C7558e c7558e2 = this.f19511e;
                    float f3 = ((C15765e) c7558e2.appmetrica.getValue()).f31051e;
                    float f4 = this.f19508e;
                    if (!C15765e.vip(f3, f4)) {
                        boolean z2 = this.f19510e;
                        EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                        if (z2) {
                            InterfaceC13352e interfaceC13352e4 = (InterfaceC13352e) interfaceC3314e2.getValue();
                            this.f19512e = 2;
                            if (AbstractC5237e.ad(c7558e2, f4, interfaceC13352e4, interfaceC13352e3, this) == enumC2821e2) {
                                return enumC2821e2;
                            }
                        } else {
                            C15765e c15765e2 = new C15765e(f4);
                            this.f19512e = 1;
                            if (c7558e2.purchase(this, c15765e2) == enumC2821e2) {
                                return enumC2821e2;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2003e.purchase(obj);
                interfaceC3314e2.setValue(interfaceC13352e3);
                return Unit.INSTANCE;
        }
    }
}
