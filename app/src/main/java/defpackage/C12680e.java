package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۗٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12680e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f25416e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC13352e f25417e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ float f25418e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ Object f25419e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ boolean f25420e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C7558e f25421e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f25422e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12680e(C7558e c7558e, float f, boolean z, Object obj, InterfaceC13352e interfaceC13352e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f25416e = i;
        this.f25421e = c7558e;
        this.f25418e = f;
        this.f25420e = z;
        this.f25419e = obj;
        this.f25417e = interfaceC13352e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f25416e) {
            case 0:
                return new C12680e(this.f25421e, this.f25418e, this.f25420e, (C4828e) this.f25419e, this.f25417e, interfaceC5083e, 0);
            default:
                return new C12680e(this.f25421e, this.f25418e, this.f25420e, (C2332e) this.f25419e, this.f25417e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f25416e) {
            case 0:
                return ((C12680e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C12680e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f25416e) {
            case 0:
                C4828e c4828e = (C4828e) this.f25419e;
                int i = this.f25422e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C7558e c7558e = this.f25421e;
                    float f = ((C15765e) c7558e.appmetrica.getValue()).f31051e;
                    float f2 = this.f25418e;
                    if (!C15765e.vip(f, f2)) {
                        boolean z = this.f25420e;
                        EnumC2821e enumC2821e = EnumC2821e.f6782e;
                        if (z) {
                            float f3 = ((C15765e) c7558e.appmetrica.getValue()).f31051e;
                            C17612e c17612e = C15765e.vip(f3, c4828e.vip) ? new C17612e(0L) : C15765e.vip(f3, c4828e.license) ? new Object() : C15765e.vip(f3, c4828e.metrica) ? new Object() : null;
                            this.f25422e = 2;
                            if (AbstractC5237e.ad(c7558e, f2, c17612e, this.f25417e, this) == enumC2821e) {
                                return enumC2821e;
                            }
                        } else {
                            C15765e c15765e = new C15765e(f2);
                            this.f25422e = 1;
                            if (c7558e.purchase(this, c15765e) == enumC2821e) {
                                return enumC2821e;
                            }
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                C2332e c2332e = (C2332e) this.f25419e;
                int i2 = this.f25422e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C7558e c7558e2 = this.f25421e;
                    float f4 = ((C15765e) c7558e2.appmetrica.getValue()).f31051e;
                    float f5 = this.f25418e;
                    if (!C15765e.vip(f4, f5)) {
                        boolean z2 = this.f25420e;
                        EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                        if (z2) {
                            float f6 = ((C15765e) c7558e2.appmetrica.getValue()).f31051e;
                            C17612e c17612e2 = C15765e.vip(f6, c2332e.vip) ? new C17612e(0L) : C15765e.vip(f6, c2332e.license) ? new Object() : C15765e.vip(f6, c2332e.metrica) ? new Object() : C15765e.vip(f6, c2332e.appmetrica) ? new Object() : null;
                            this.f25422e = 2;
                            if (AbstractC5237e.ad(c7558e2, f5, c17612e2, this.f25417e, this) == enumC2821e2) {
                                return enumC2821e2;
                            }
                        } else {
                            C15765e c15765e2 = new C15765e(f5);
                            this.f25422e = 1;
                            if (c7558e2.purchase(this, c15765e2) == enumC2821e2) {
                                return enumC2821e2;
                            }
                        }
                    }
                } else {
                    if (i2 != 1 && i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
