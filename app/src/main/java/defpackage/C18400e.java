package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e۠ؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18400e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f36077e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C16446e f36078e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C15096e f36079e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C12988e f36080e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f36081e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18400e(C12988e c12988e, C16446e c16446e, C15096e c15096e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f36077e = i;
        this.f36080e = c12988e;
        this.f36078e = c16446e;
        this.f36079e = c15096e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f36077e) {
            case 0:
                return new C18400e(this.f36080e, this.f36078e, this.f36079e, interfaceC5083e, 0);
            default:
                return new C18400e(this.f36080e, this.f36078e, this.f36079e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f36077e) {
            case 0:
                return ((C18400e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C18400e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f36077e) {
            case 0:
                int i = this.f36081e;
                C16446e c16446e = this.f36078e;
                C12988e c12988e = this.f36080e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    float f = this.f36079e.f29883e;
                    this.f36081e = 1;
                    Object metrica = C12988e.metrica(c12988e, c16446e, f, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (metrica == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                ((InterfaceC2661e) AbstractC10432e.vip(c12988e.ad, AbstractC11473e.billing)).ad(c16446e);
                return Unit.INSTANCE;
            default:
                C12988e c12988e2 = this.f36080e;
                C15074e c15074e = c12988e2.ad;
                int i2 = this.f36081e;
                C16446e c16446e2 = this.f36078e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    float f2 = this.f36079e.f29883e;
                    this.f36081e = 1;
                    Object metrica2 = C12988e.metrica(c12988e2, c16446e2, f2, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (metrica2 == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                ((InterfaceC2661e) AbstractC10432e.vip(c15074e, AbstractC11473e.billing)).ad(c16446e2);
                if (c12988e2.purchase) {
                    AbstractC12640e.advert(c15074e);
                }
                return Unit.INSTANCE;
        }
    }
}
