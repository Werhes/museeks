package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٟؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16394e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f32199e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C4031e f32200e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f32201e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16394e(C4031e c4031e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f32199e = i;
        this.f32200e = c4031e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f32199e) {
            case 0:
                return new C16394e(this.f32200e, interfaceC5083e, 0);
            case 1:
                return new C16394e(this.f32200e, interfaceC5083e, 1);
            default:
                return new C16394e(this.f32200e, interfaceC5083e, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f32199e) {
            case 0:
                return ((C16394e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C16394e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C16394e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f32199e) {
            case 0:
                int i = this.f32201e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f32201e = 1;
                    Object m1446else = C4031e.m1446else(this.f32200e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (m1446else == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i2 = this.f32201e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f32201e = 1;
                    Object m1447switch = C4031e.m1447switch(this.f32200e, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (m1447switch == enumC2821e2) {
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
                int i3 = this.f32201e;
                InterfaceC5083e interfaceC5083e = null;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    C18010e c18010e = new C18010e(14, "common", null, null, null);
                    this.f32201e = 1;
                    Object advert = AbstractC5336e.advert(AbstractC6731e.ad, new C6046e(C0086e.billing, c18010e, interfaceC5083e, 1), this);
                    Object obj2 = EnumC2821e.f6782e;
                    if (advert != obj2) {
                        advert = Unit.INSTANCE;
                    }
                    if (advert == obj2) {
                        return obj2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                this.f32200e.m1450for(null);
                return Unit.INSTANCE;
        }
    }
}
