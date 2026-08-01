package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11679e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f23478e = 0;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ Object f23479e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f23480e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f23481e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public float f23482e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11679e(C12344e c12344e, float f, InterfaceC2869e interfaceC2869e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f23479e = c12344e;
        this.f23482e = f;
        this.f23480e = interfaceC2869e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11679e(C13119e c13119e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f23480e = c13119e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f23478e) {
            case 0:
                return new C11679e((C12344e) this.f23479e, this.f23482e, (InterfaceC2869e) this.f23480e, interfaceC5083e);
            default:
                C11679e c11679e = new C11679e((C13119e) this.f23480e, interfaceC5083e);
                c11679e.f23479e = obj;
                return c11679e;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f23478e) {
            case 0:
                return ((C11679e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C11679e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        float advert;
        InterfaceC18435e interfaceC18435e;
        switch (this.f23478e) {
            case 0:
                int i = this.f23481e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C7558e c7558e = (C7558e) ((C12344e) this.f23479e).f24751e;
                    Float f = new Float(this.f23482e);
                    InterfaceC2869e interfaceC2869e = (InterfaceC2869e) this.f23480e;
                    this.f23481e = 1;
                    Object vip = C7558e.vip(c7558e, f, interfaceC2869e, null, this, 12);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (vip == enumC2821e) {
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
                int i2 = this.f23481e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC18435e interfaceC18435e2 = (InterfaceC18435e) this.f23479e;
                    advert = AbstractC7844e.advert(interfaceC18435e2.advert());
                    interfaceC18435e = interfaceC18435e2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    advert = this.f23482e;
                    interfaceC18435e = (InterfaceC18435e) this.f23479e;
                    AbstractC2003e.purchase(obj);
                }
                while (AbstractC9743e.yandex(interfaceC18435e)) {
                    C15741e c15741e = new C15741e((C13119e) this.f23480e, advert, 3);
                    this.f23479e = interfaceC18435e;
                    this.f23482e = advert;
                    this.f23481e = 1;
                    Object mo1675catch = AbstractC0326e.advert(this.f21135e).mo1675catch(c15741e, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (mo1675catch == enumC2821e2) {
                        return enumC2821e2;
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
