package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12483e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f24989e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C14307e f24990e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C2401e f24991e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Function3 f24992e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f24993e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12483e(Function3 function3, C14307e c14307e, C2401e c2401e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f24989e = i;
        this.f24992e = function3;
        this.f24990e = c14307e;
        this.f24991e = c2401e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f24989e) {
            case 0:
                return new C12483e(this.f24992e, this.f24990e, this.f24991e, interfaceC5083e, 0);
            default:
                return new C12483e(this.f24992e, this.f24990e, this.f24991e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f24989e) {
            case 0:
                return ((C12483e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C12483e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f24989e) {
            case 0:
                int i = this.f24993e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C2152e c2152e = new C2152e(this.f24991e.metrica);
                    this.f24993e = 1;
                    Object invoke = this.f24992e.invoke(this.f24990e, c2152e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (invoke == enumC2821e) {
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
                int i2 = this.f24993e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C2152e c2152e2 = new C2152e(this.f24991e.metrica);
                    this.f24993e = 1;
                    Object invoke2 = this.f24992e.invoke(this.f24990e, c2152e2, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (invoke2 == enumC2821e2) {
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
