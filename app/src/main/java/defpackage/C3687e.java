package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۡٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3687e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f8268e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C10709e f8269e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f8270e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3687e(C10709e c10709e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f8268e = i;
        this.f8269e = c10709e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f8268e) {
            case 0:
                return new C3687e(this.f8269e, interfaceC5083e, 0);
            case 1:
                return new C3687e(this.f8269e, interfaceC5083e, 1);
            default:
                return new C3687e(this.f8269e, interfaceC5083e, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f8268e) {
            case 0:
                return ((C3687e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C3687e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C3687e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        InterfaceC10500e interfaceC10500e;
        InterfaceC10500e interfaceC10500e2;
        switch (this.f8268e) {
            case 0:
                int i = this.f8270e;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                this.f8270e = 1;
                Object metrica = this.f8269e.metrica(true, this);
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                return metrica == enumC2821e ? enumC2821e : metrica;
            case 1:
                int i2 = this.f8270e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    interfaceC10500e = this.f8269e.serverJob;
                    this.f8270e = 1;
                    Object mo696protected = interfaceC10500e.mo696protected(this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (mo696protected == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i3 = this.f8270e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    interfaceC10500e2 = this.f8269e.serverJob;
                    this.f8270e = 1;
                    Object mo696protected2 = interfaceC10500e2.mo696protected(this);
                    EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                    if (mo696protected2 == enumC2821e3) {
                        return enumC2821e3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Boolean.TRUE;
        }
    }
}
