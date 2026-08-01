package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؗٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6219e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f13000e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C2340e f13001e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f13002e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6219e(C2340e c2340e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f13000e = i;
        this.f13001e = c2340e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f13000e) {
            case 0:
                return new C6219e(this.f13001e, interfaceC5083e, 0);
            default:
                return new C6219e(this.f13001e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f13000e) {
            case 0:
                return ((C6219e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C6219e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f13000e) {
            case 0:
                int i = this.f13002e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C2340e c2340e = this.f13001e;
                    C7558e c7558e = c2340e.appmetrica;
                    Float f = new Float(1.0f);
                    InterfaceC2869e interfaceC2869e = c2340e.metrica;
                    this.f13002e = 1;
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
                int i2 = this.f13002e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C7558e c7558e2 = this.f13001e.appmetrica;
                    Float f2 = new Float(1.0f);
                    this.f13002e = 1;
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
                return Unit.INSTANCE;
        }
    }
}
