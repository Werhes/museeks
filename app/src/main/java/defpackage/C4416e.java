package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖ۠ؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4416e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f9588e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C0462e f9589e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C2340e f9590e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f9591e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4416e(C2340e c2340e, C0462e c0462e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f9588e = i;
        this.f9590e = c2340e;
        this.f9589e = c0462e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f9588e) {
            case 0:
                return new C4416e(this.f9590e, this.f9589e, interfaceC5083e, 0);
            default:
                return new C4416e(this.f9590e, this.f9589e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f9588e) {
            case 0:
                return ((C4416e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C4416e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        C0462e c0462e;
        switch (this.f9588e) {
            case 0:
                C2340e c2340e = this.f9590e;
                int i = this.f9591e;
                c0462e = this.f9589e;
                try {
                    if (i == 0) {
                        AbstractC2003e.purchase(obj);
                        C7558e c7558e = c2340e.appmetrica;
                        Float f = new Float(0.0f);
                        InterfaceC2869e interfaceC2869e = c2340e.license;
                        this.f9591e = 1;
                        obj = C7558e.vip(c7558e, f, interfaceC2869e, null, this, 12);
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
                    C0462e.adcel(c0462e);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            default:
                int i2 = this.f9591e;
                c0462e = this.f9589e;
                try {
                    if (i2 == 0) {
                        AbstractC2003e.purchase(obj);
                        C7558e c7558e2 = this.f9590e.appmetrica;
                        Float f2 = new Float(0.0f);
                        this.f9591e = 1;
                        Object purchase = c7558e2.purchase(this, f2);
                        EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                        if (purchase == enumC2821e2) {
                            return enumC2821e2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                    }
                    C0462e.adcel(c0462e);
                    return Unit.INSTANCE;
                } finally {
                    C0462e.adcel(c0462e);
                }
        }
    }
}
