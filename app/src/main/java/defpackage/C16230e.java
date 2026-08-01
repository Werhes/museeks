package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٕٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16230e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f31899e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C16007e f31900e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f31901e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f31902e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16230e(C16007e c16007e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f31899e = i;
        this.f31900e = c16007e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f31899e) {
            case 0:
                C16230e c16230e = new C16230e(this.f31900e, interfaceC5083e, 0);
                c16230e.f31901e = obj;
                return c16230e;
            default:
                C16230e c16230e2 = new C16230e(this.f31900e, interfaceC5083e, 1);
                c16230e2.f31901e = obj;
                return c16230e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6999e c6999e = (C6999e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f31899e) {
            case 0:
                return ((C16230e) advert(interfaceC5083e, c6999e)).loadAd(Unit.INSTANCE);
            default:
                return ((C16230e) advert(interfaceC5083e, c6999e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f31899e) {
            case 0:
                int i = this.f31902e;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                C6999e c6999e = (C6999e) this.f31901e;
                this.f31902e = 1;
                Object vip = c6999e.vip(this.f31900e, this);
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                return vip == enumC2821e ? enumC2821e : vip;
            default:
                int i2 = this.f31902e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C6999e c6999e2 = (C6999e) this.f31901e;
                    String str = this.f31900e.ad;
                    this.f31902e = 1;
                    C16007e c16007e = (C16007e) c6999e2.ad.remove(str);
                    if (c16007e != null) {
                        c16007e.license.startapp(null);
                        c16007e.vip.set(false);
                        c16007e.smaato.Signature(null);
                    }
                    Unit unit = Unit.INSTANCE;
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (unit == enumC2821e2) {
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
