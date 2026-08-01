package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6580e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f13561e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C14307e f13562e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f13563e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6580e(C14307e c14307e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f13561e = i;
        this.f13562e = c14307e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f13561e) {
            case 0:
                return new C6580e(this.f13562e, interfaceC5083e, 0);
            default:
                return new C6580e(this.f13562e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f13561e) {
            case 0:
                return ((C6580e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C6580e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f13561e) {
            case 0:
                int i = this.f13563e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f13563e = 1;
                    Object appmetrica = this.f13562e.appmetrica(this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (appmetrica == enumC2821e) {
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
                int i2 = this.f13563e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f13563e = 1;
                    Object appmetrica2 = this.f13562e.appmetrica(this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (appmetrica2 == enumC2821e2) {
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
